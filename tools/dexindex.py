#!/usr/bin/env python3
"""Build a class-descriptor -> dex index for a directory of .dex files.

Minimal DEX reader: header -> string_ids / type_ids / class_defs.
Prints 'dexfile\tclass_descriptor' for the classes matching a pattern,
or writes the full index to a TSV when --all is given.
"""
import struct, sys, os, glob


def uleb128(b, p):
    r = 0
    s = 0
    while True:
        x = b[p]
        p += 1
        r |= (x & 0x7F) << s
        if not (x & 0x80):
            return r, p
        s += 7


def read_strings(data):
    n, off = struct.unpack_from('<II', data, 0x38)
    out = []
    for i in range(n):
        so = struct.unpack_from('<I', data, off + 4 * i)[0]
        _, p = uleb128(data, so)
        e = data.index(b'\x00', p)
        out.append(data[p:e].decode('utf-8', 'replace'))
    return out


def read_classes(data, strings):
    type_ids_size, type_ids_off = struct.unpack_from('<II', data, 0x40)
    class_defs_size, class_defs_off = struct.unpack_from('<II', data, 0x60)
    types = [strings[struct.unpack_from('<I', data, type_ids_off + 4 * i)[0]]
             for i in range(type_ids_size)]
    out = []
    for i in range(class_defs_size):
        class_idx = struct.unpack_from('<I', data, class_defs_off + 32 * i)[0]
        out.append(types[class_idx])
    return out


def main():
    d = sys.argv[1]
    pat = sys.argv[2] if len(sys.argv) > 2 else ''
    dump_all = '--all' in sys.argv
    rows = []
    for f in sorted(glob.glob(os.path.join(d, '*.dex'))):
        data = open(f, 'rb').read()
        strings = read_strings(data)
        for c in read_classes(data, strings):
            if dump_all or pat.lower() in c.lower():
                rows.append((os.path.basename(f), c))
    for f, c in rows:
        print(f'{f}\t{c}')
    print(f'# total {len(rows)}', file=sys.stderr)


if __name__ == '__main__':
    main()
