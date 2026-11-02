package com.bilibili.pegasus.widget;

/* JADX INFO: compiled from: BL */
/* JADX INFO: loaded from: /home/cheny/work/bili2/dex/classes17.dex */
public final class h extends androidx.recyclerview.widget.RecyclerView.s implements androidx.recyclerview.widget.RecyclerView.p {
    public final Df.g b;
    public int c = 1;
    public boolean d = true;

    public h(Df.g gVar) {
        this.b = gVar;
    }

    public final void b(androidx.recyclerview.widget.RecyclerView recyclerView) {
        androidx.recyclerview.widget.GridLayoutManager.c spanSizeLookup;
        if (recyclerView == null || true != recyclerView.isAttachedToWindow()) {
            return;
        }
        int childCount = recyclerView.getChildCount();
        if (!this.d || childCount <= 0) {
            return;
        }
        android.view.View childAt = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
        androidx.recyclerview.widget.RecyclerView.Adapter adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(childAt);
        int i = this.c << 1;
        if (i != 0) {
            int itemCount = adapter.getItemCount();
            int spanSize = 0;
            for (int i2 = childAdapterPosition + 1; i2 < itemCount; i2++) {
                androidx.recyclerview.widget.GridLayoutManager layoutManager = recyclerView.getLayoutManager();
                androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = layoutManager instanceof androidx.recyclerview.widget.GridLayoutManager ? layoutManager : null;
                spanSize += (gridLayoutManager == null || (spanSizeLookup = gridLayoutManager.getSpanSizeLookup()) == null) ? 1 : spanSizeLookup.getSpanSize(i2);
                if (spanSize > i) {
                    return;
                }
            }
        } else if (childAdapterPosition + 1 != adapter.getItemCount()) {
            return;
        }
        if (recyclerView.isComputingLayout()) {
            androidx.core.view.F.a(recyclerView, new com.bilibili.pegasus.widget.g(recyclerView, this));
        } else {
            this.b.invoke();
        }
    }

    public final void onChildViewAttachedToWindow(android.view.View view) {
        android.view.ViewParent parent = view.getParent();
        androidx.recyclerview.widget.RecyclerView recyclerView = parent instanceof androidx.recyclerview.widget.RecyclerView ? (androidx.recyclerview.widget.RecyclerView) parent : null;
        if (recyclerView == null) {
            return;
        }
        b(recyclerView);
    }

    public final void onScrolled(androidx.recyclerview.widget.RecyclerView recyclerView, int i, int i2) {
        if (i2 > 0) {
            b(recyclerView);
        }
    }

    public final void onChildViewDetachedFromWindow(android.view.View view) {
    }
}
