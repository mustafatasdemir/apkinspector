package android.support.v7.internal.widget; class AdapterViewICS {/*

.class abstract Landroid/support/v7/internal/widget/AdapterViewICS;
.super Landroid/view/ViewGroup;
.source "AdapterViewICS.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/AdapterViewICS$1;,
        Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;,
        Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;,
        Landroid/support/v7/internal/widget/AdapterViewICS$AdapterContextMenuInfo;,
        Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;,
        Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;,
        Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;,
        Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T::",
        "Landroid/widget/Adapter;",
        ">",
        "Landroid/view/ViewGroup;"
    }
.end annotation


# static fields
.field public static final INVALID_POSITION:I = -0x1

.field public static final INVALID_ROW_ID:J = -0x8000000000000000L

.field static final ITEM_VIEW_TYPE_HEADER_OR_FOOTER:I = -0x2

.field static final ITEM_VIEW_TYPE_IGNORE:I = -0x1

.field static final SYNC_FIRST_POSITION:I = 0x1

.field static final SYNC_MAX_DURATION_MILLIS:I = 0x64

.field static final SYNC_SELECTED_POSITION:I


# instance fields
.field mBlockLayoutRequests:Z

.field mDataChanged:Z

.field private mDesiredFocusableInTouchModeState:Z

.field private mDesiredFocusableState:Z

.field private mEmptyView:Landroid/view/View;

.field mFirstPosition:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "scrolling"
    .end annotation
.end field

.field mInLayout:Z

.field mItemCount:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "list"
    .end annotation
.end field

.field private mLayoutHeight:I

.field mNeedSync:Z

.field mNextSelectedPosition:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "list"
    .end annotation
.end field

.field mNextSelectedRowId:J

.field mOldItemCount:I

.field mOldSelectedPosition:I

.field mOldSelectedRowId:J

.field mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

.field mOnItemLongClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;

.field mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

.field mSelectedPosition:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
        category = "list"
    .end annotation
.end field

.field mSelectedRowId:J

.field private mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v7/internal/widget/AdapterViewICS",
            "<TT;>.SelectionNotifier;"
        }
    .end annotation
.end field

.field mSpecificTop:I

.field mSyncHeight:J

.field mSyncMode:I

.field mSyncPosition:I

.field mSyncRowId:J


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 4
    .parameter "context"

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v3, -0x1

    #v3=(Byte);
    const-wide/high16 v1, -0x8000

    #v1=(LongLo);v2=(LongHi);
    const/4 v0, 0x0

    .line 228
    #v0=(Null);
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 67
    #p0=(Reference);
    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    .line 84
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 94
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 126
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z

    .line 152
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 158
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 163
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 169
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 201
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    .line 206
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    .line 225
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z

    .line 229
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4
    .parameter "context"
    .parameter "attrs"

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v3, -0x1

    #v3=(Byte);
    const-wide/high16 v1, -0x8000

    #v1=(LongLo);v2=(LongHi);
    const/4 v0, 0x0

    .line 232
    #v0=(Null);
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 67
    #p0=(Reference);
    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    .line 84
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 94
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 126
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z

    .line 152
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 158
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 163
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 169
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 201
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    .line 206
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    .line 225
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z

    .line 233
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v3, -0x1

    #v3=(Byte);
    const-wide/high16 v1, -0x8000

    #v1=(LongLo);v2=(LongHi);
    const/4 v0, 0x0

    .line 236
    #v0=(Null);
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 67
    #p0=(Reference);
    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    .line 84
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 94
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 126
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z

    .line 152
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 158
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 163
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 169
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 201
    iput v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    .line 206
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    .line 225
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z

    .line 237
    return-void
.end method

.method static synthetic access$000(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/os/Parcelable;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 50
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    return-void
.end method

.method static synthetic access$100(Landroid/support/v7/internal/widget/AdapterViewICS;)Landroid/os/Parcelable;
    .locals 1
    .parameter "x0"

    .prologue
    .line 50
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Landroid/support/v7/internal/widget/AdapterViewICS;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 50
    invoke-direct {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->fireOnSelected()V

    return-void
.end method

.method private fireOnSelected()V
    .locals 6

    .prologue
    .line 891
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 902
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 894
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedItemPosition()I

    move-result v3

    .line 895
    .local v3, selection:I
    #v3=(Integer);
    if-ltz v3, :cond_1

    .line 896
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedView()Landroid/view/View;

    move-result-object v2

    .line 897
    .local v2, v:Landroid/view/View;
    #v2=(Reference);
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v1, v3}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    move-object v1, p0

    invoke-interface/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;->onItemSelected(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V

    goto :goto_0

    .line 900
    .end local v2           #v:Landroid/view/View;
    :cond_1
    #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    invoke-interface {v0, p0}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;->onNothingSelected(Landroid/support/v7/internal/widget/AdapterViewICS;)V

    goto :goto_0
.end method

.method private updateEmptyStatus(Z)V
    .locals 6
    .parameter "empty"

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/16 v2, 0x8

    #v2=(PosByte);
    const/4 v1, 0x0

    .line 733
    #v1=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 734
    const/4 p1, 0x0

    .line 737
    :cond_0
    if-eqz p1, :cond_3

    .line 738
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 739
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 740
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->setVisibility(I)V

    .line 749
    :goto_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDataChanged:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 750
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getLeft()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getTop()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getRight()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getBottom()I

    move-result v5

    #v5=(Integer);
    move-object v0, p0

    #v0=(Reference);
    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS;->onLayout(ZIIII)V

    .line 756
    :cond_1
    :goto_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 743
    :cond_2
    #v0=(Reference);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->setVisibility(I)V

    goto :goto_0

    .line 753
    :cond_3
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    #v0=(Reference);
    if-eqz v0, :cond_4

    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 754
    :cond_4
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->setVisibility(I)V

    goto :goto_1
.end method


# virtual methods
.method public addView(Landroid/view/View;)V
    .locals 2
    .parameter "child"

    .prologue
    .line 461
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "addView(View) is not supported in AdapterView"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public addView(Landroid/view/View;I)V
    .locals 2
    .parameter "child"
    .parameter "index"

    .prologue
    .line 474
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "addView(View, int) is not supported in AdapterView"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 2
    .parameter "child"
    .parameter "index"
    .parameter "params"

    .prologue
    .line 502
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "addView(View, int, LayoutParams) is not supported in AdapterView"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
    .locals 2
    .parameter "child"
    .parameter "params"

    .prologue
    .line 487
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "addView(View, LayoutParams) is not supported in AdapterView"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method protected canAnimate()Z
    .locals 1

    .prologue
    .line 916
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-super {p0}, Landroid/view/ViewGroup;->canAnimate()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    #v0=(Integer);
    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method checkFocus()V
    .locals 6

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v4, 0x1

    #v4=(One);
    const/4 v5, 0x0

    .line 714
    #v5=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 715
    .local v0, adapter:Landroid/widget/Adapter;,"TT;"
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v3

    #v3=(Integer);
    if-nez v3, :cond_5

    :cond_0
    #v3=(Conflicted);
    move v1, v4

    .line 716
    .local v1, empty:Z
    :goto_0
    #v1=(Boolean);
    if-eqz v1, :cond_1

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_6

    :cond_1
    #v3=(Conflicted);
    move v2, v4

    .line 720
    .local v2, focusable:Z
    :goto_1
    #v2=(Boolean);
    if-eqz v2, :cond_7

    iget-boolean v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableInTouchModeState:Z

    #v3=(Boolean);
    if-eqz v3, :cond_7

    move v3, v4

    :goto_2
    invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V

    .line 721
    if-eqz v2, :cond_8

    iget-boolean v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableState:Z

    if-eqz v3, :cond_8

    move v3, v4

    :goto_3
    invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V

    .line 722
    iget-object v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    #v3=(Reference);
    if-eqz v3, :cond_4

    .line 723
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_3

    :cond_2
    #v3=(Conflicted);
    move v5, v4

    :cond_3
    #v5=(Boolean);
    invoke-direct {p0, v5}, Landroid/support/v7/internal/widget/AdapterViewICS;->updateEmptyStatus(Z)V

    .line 725
    :cond_4
    return-void

    .end local v1           #empty:Z
    .end local v2           #focusable:Z
    :cond_5
    #v1=(Uninit);v2=(Uninit);v3=(Integer);v5=(Null);
    move v1, v5

    .line 715
    #v1=(Null);
    goto :goto_0

    .restart local v1       #empty:Z
    :cond_6
    #v1=(Boolean);v3=(Boolean);
    move v2, v5

    .line 716
    #v2=(Null);
    goto :goto_1

    .restart local v2       #focusable:Z
    :cond_7
    #v2=(Boolean);v3=(Conflicted);
    move v3, v5

    .line 720
    #v3=(Null);
    goto :goto_2

    :cond_8
    #v3=(Boolean);
    move v3, v5

    .line 721
    #v3=(Null);
    goto :goto_3
.end method

.method checkSelectionChanged()V
    .locals 4

    .prologue
    .line 983
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    #v0=(Integer);
    iget v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    #v1=(Integer);
    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-eqz v0, :cond_1

    .line 984
    :cond_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->selectionChanged()V

    .line 985
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedPosition:I

    .line 986
    iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOldSelectedRowId:J

    .line 988
    :cond_1
    #v0=(Conflicted);
    return-void
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 2
    .parameter "event"

    .prologue
    .line 906
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedView()Landroid/view/View;

    move-result-object v0

    .line 907
    .local v0, selectedView:Landroid/view/View;
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_0

    invoke-virtual {v0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 909
    const/4 v1, 0x1

    .line 911
    :goto_0
    return v1

    :cond_0
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 793
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    .local p1, container:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 794
    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 785
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    .local p1, container:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 786
    return-void
.end method

.method findSyncPosition()I
    .locals 19

    .prologue
    .line 999
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v2, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    .line 1001
    .local v2, count:I
    #v2=(Integer);
    if-nez v2, :cond_1

    .line 1002
    const/4 v14, -0x1

    .line 1074
    :cond_0
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Integer);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);
    return v14

    .line 1005
    :cond_1
    #v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);
    move-object/from16 v0, p0

    iget-wide v8, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 1006
    .local v8, idToMatch:J
    #v8=(LongLo);v9=(LongHi);
    move-object/from16 v0, p0

    iget v14, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I

    .line 1009
    .local v14, seed:I
    #v14=(Integer);
    const-wide/high16 v15, -0x8000

    #v15=(LongLo);v16=(LongHi);
    cmp-long v15, v8, v15

    #v15=(Byte);
    if-nez v15, :cond_2

    .line 1010
    const/4 v14, -0x1

    #v14=(Byte);
    goto :goto_0

    .line 1014
    :cond_2
    #v14=(Integer);
    const/4 v15, 0x0

    #v15=(Null);
    invoke-static {v15, v14}, Ljava/lang/Math;->max(II)I

    move-result v14

    .line 1015
    add-int/lit8 v15, v2, -0x1

    #v15=(Integer);
    invoke-static {v15, v14}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 1017
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v15

    #v15=(LongLo);
    const-wide/16 v17, 0x64

    #v17=(LongLo);v18=(LongHi);
    add-long v3, v15, v17

    .line 1022
    .local v3, endTime:J
    #v3=(LongLo);v4=(LongHi);
    move v5, v14

    .line 1025
    .local v5, first:I
    #v5=(Integer);
    move v10, v14

    .line 1028
    .local v10, last:I
    #v10=(Integer);
    const/4 v11, 0x0

    .line 1038
    .local v11, next:Z
    #v11=(Null);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v1

    .line 1039
    .local v1, adapter:Landroid/widget/Adapter;,"TT;"
    #v1=(Reference);
    if-nez v1, :cond_5

    .line 1040
    const/4 v14, -0x1

    #v14=(Byte);
    goto :goto_0

    .line 1058
    .local v6, hitFirst:Z
    .local v7, hitLast:Z
    .local v12, rowId:J
    :cond_3
    #v6=(Boolean);v7=(Boolean);v11=(Boolean);v12=(LongLo);v13=(LongHi);v14=(Integer);v15=(Integer);
    if-nez v6, :cond_4

    if-eqz v11, :cond_9

    if-nez v7, :cond_9

    .line 1060
    :cond_4
    add-int/lit8 v10, v10, 0x1

    .line 1061
    move v14, v10

    .line 1063
    const/4 v11, 0x0

    .line 1043
    .end local v6           #hitFirst:Z
    .end local v7           #hitLast:Z
    .end local v12           #rowId:J
    :cond_5
    :goto_1
    #v6=(Conflicted);v7=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v15

    #v15=(LongLo);
    cmp-long v15, v15, v3

    #v15=(Byte);
    if-gtz v15, :cond_6

    .line 1044
    invoke-interface {v1, v14}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v12

    .line 1045
    .restart local v12       #rowId:J
    #v12=(LongLo);v13=(LongHi);
    cmp-long v15, v12, v8

    if-eqz v15, :cond_0

    .line 1050
    add-int/lit8 v15, v2, -0x1

    #v15=(Integer);
    if-ne v10, v15, :cond_7

    const/4 v7, 0x1

    .line 1051
    .restart local v7       #hitLast:Z
    :goto_2
    #v7=(Boolean);
    if-nez v5, :cond_8

    const/4 v6, 0x1

    .line 1053
    .restart local v6       #hitFirst:Z
    :goto_3
    #v6=(Boolean);
    if-eqz v7, :cond_3

    if-eqz v6, :cond_3

    .line 1074
    .end local v6           #hitFirst:Z
    .end local v7           #hitLast:Z
    .end local v12           #rowId:J
    :cond_6
    #v6=(Conflicted);v7=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    const/4 v14, -0x1

    #v14=(Byte);
    goto :goto_0

    .line 1050
    .restart local v12       #rowId:J
    :cond_7
    #v12=(LongLo);v13=(LongHi);v14=(Integer);
    const/4 v7, 0x0

    #v7=(Null);
    goto :goto_2

    .line 1051
    .restart local v7       #hitLast:Z
    :cond_8
    #v7=(Boolean);
    const/4 v6, 0x0

    #v6=(Null);
    goto :goto_3

    .line 1064
    .restart local v6       #hitFirst:Z
    :cond_9
    #v6=(Boolean);
    if-nez v7, :cond_a

    if-nez v11, :cond_5

    if-nez v6, :cond_5

    .line 1066
    :cond_a
    add-int/lit8 v5, v5, -0x1

    .line 1067
    move v14, v5

    .line 1069
    const/4 v11, 0x1

    #v11=(One);
    goto :goto_1
.end method

.method public abstract getAdapter()Landroid/widget/Adapter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation
.end method

.method public getCount()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 591
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    #v0=(Integer);
    return v0
.end method

.method public getEmptyView()Landroid/view/View;
    .locals 1

    .prologue
    .line 674
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method public getFirstVisiblePosition()I
    .locals 1

    .prologue
    .line 634
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    #v0=(Integer);
    return v0
.end method

.method public getItemAtPosition(I)Ljava/lang/Object;
    .locals 2
    .parameter "position"

    .prologue
    .line 765
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 766
    .local v0, adapter:Landroid/widget/Adapter;,"TT;"
    #v0=(Reference);
    if-eqz v0, :cond_0

    if-gez p1, :cond_1

    :cond_0
    const/4 v1, 0x0

    :goto_0
    #v1=(Reference);
    return-object v1

    :cond_1
    #v1=(Uninit);
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    goto :goto_0
.end method

.method public getItemIdAtPosition(I)J
    .locals 3
    .parameter "position"

    .prologue
    .line 770
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 771
    .local v0, adapter:Landroid/widget/Adapter;,"TT;"
    #v0=(Reference);
    if-eqz v0, :cond_0

    if-gez p1, :cond_1

    :cond_0
    const-wide/high16 v1, -0x8000

    :goto_0
    #v1=(LongLo);v2=(LongHi);
    return-wide v1

    :cond_1
    #v1=(Uninit);v2=(Uninit);
    invoke-interface {v0, p1}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    goto :goto_0
.end method

.method public getLastVisiblePosition()I
    .locals 2

    .prologue
    .line 644
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    #v0=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildCount()I

    move-result v1

    #v1=(Integer);
    add-int/2addr v0, v1

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public final getOnItemClickListener()Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
    .locals 1

    .prologue
    .line 290
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    #v0=(Reference);
    return-object v0
.end method

.method public final getOnItemLongClickListener()Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;
    .locals 1

    .prologue
    .line 356
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemLongClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;

    #v0=(Reference);
    return-object v0
.end method

.method public final getOnItemSelectedListener()Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
    .locals 1

    .prologue
    .line 402
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    #v0=(Reference);
    return-object v0
.end method

.method public getPositionForView(Landroid/view/View;)I
    .locals 7
    .parameter "view"

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v5, -0x1

    .line 604
    #v5=(Byte);
    move-object v3, p1

    .line 607
    .local v3, listItem:Landroid/view/View;
    :goto_0
    :try_start_0
    #v3=(Reference);v4=(Conflicted);v6=(Conflicted);
    invoke-virtual {v3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/view/View;

    .local v4, v:Landroid/view/View;
    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_1

    .line 608
    move-object v3, v4

    goto :goto_0

    .line 610
    .end local v4           #v:Landroid/view/View;
    :catch_0
    #v4=(Conflicted);v6=(Conflicted);
    move-exception v1

    .line 624
    :cond_0
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Integer);
    return v5

    .line 616
    .restart local v4       #v:Landroid/view/View;
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Reference);v5=(Byte);v6=(Boolean);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildCount()I

    move-result v0

    .line 617
    .local v0, childCount:I
    #v0=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_2
    #v2=(Integer);
    if-ge v2, v0, :cond_0

    .line 618
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    .line 619
    iget v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    #v5=(Integer);
    add-int/2addr v5, v2

    goto :goto_1

    .line 617
    :cond_2
    #v5=(Byte);
    add-int/lit8 v2, v2, 0x1

    goto :goto_2
.end method

.method public getSelectedItem()Ljava/lang/Object;
    .locals 3

    .prologue
    .line 575
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 576
    .local v0, adapter:Landroid/widget/Adapter;,"TT;"
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedItemPosition()I

    move-result v1

    .line 577
    .local v1, selection:I
    #v1=(Integer);
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_0

    if-ltz v1, :cond_0

    .line 578
    invoke-interface {v0, v1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    move-result-object v2

    .line 580
    :goto_0
    #v2=(Reference);
    return-object v2

    :cond_0
    #v2=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_0
.end method

.method public getSelectedItemId()J
    .locals 2
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 561
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getSelectedItemPosition()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 552
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    #v0=(Integer);
    return v0
.end method

.method public abstract getSelectedView()Landroid/view/View;
.end method

.method handleDataChanged()V
    .locals 10

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const-wide/high16 v8, -0x8000

    #v8=(LongLo);v9=(LongHi);
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, -0x1

    #v6=(Byte);
    const/4 v5, 0x0

    .line 920
    #v5=(Null);
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mItemCount:I

    .line 921
    .local v0, count:I
    #v0=(Integer);
    const/4 v1, 0x0

    .line 923
    .local v1, found:Z
    #v1=(Null);
    if-lez v0, :cond_4

    .line 928
    iget-boolean v4, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 931
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 935
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->findSyncPosition()I

    move-result v2

    .line 936
    .local v2, newPos:I
    #v2=(Integer);
    if-ltz v2, :cond_0

    .line 938
    invoke-virtual {p0, v2, v7}, Landroid/support/v7/internal/widget/AdapterViewICS;->lookForSelectablePosition(IZ)I

    move-result v3

    .line 939
    .local v3, selectablePos:I
    #v3=(Integer);
    if-ne v3, v2, :cond_0

    .line 941
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->setNextSelectedPositionInt(I)V

    .line 942
    const/4 v1, 0x1

    .line 946
    .end local v2           #newPos:I
    .end local v3           #selectablePos:I
    :cond_0
    #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
    if-nez v1, :cond_4

    .line 948
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getSelectedItemPosition()I

    move-result v2

    .line 951
    .restart local v2       #newPos:I
    #v2=(Integer);
    if-lt v2, v0, :cond_1

    .line 952
    add-int/lit8 v2, v0, -0x1

    .line 954
    :cond_1
    if-gez v2, :cond_2

    .line 955
    const/4 v2, 0x0

    .line 959
    :cond_2
    invoke-virtual {p0, v2, v7}, Landroid/support/v7/internal/widget/AdapterViewICS;->lookForSelectablePosition(IZ)I

    move-result v3

    .line 960
    .restart local v3       #selectablePos:I
    #v3=(Integer);
    if-gez v3, :cond_3

    .line 962
    invoke-virtual {p0, v2, v5}, Landroid/support/v7/internal/widget/AdapterViewICS;->lookForSelectablePosition(IZ)I

    move-result v3

    .line 964
    :cond_3
    if-ltz v3, :cond_4

    .line 965
    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/AdapterViewICS;->setNextSelectedPositionInt(I)V

    .line 966
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkSelectionChanged()V

    .line 967
    const/4 v1, 0x1

    .line 971
    .end local v2           #newPos:I
    .end local v3           #selectablePos:I
    :cond_4
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    if-nez v1, :cond_5

    .line 973
    iput v6, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 974
    iput-wide v8, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 975
    iput v6, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 976
    iput-wide v8, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 977
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 978
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->checkSelectionChanged()V

    .line 980
    :cond_5
    return-void
.end method

.method isInFilterMode()Z
    .locals 1

    .prologue
    .line 684
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method lookForSelectablePosition(IZ)I
    .locals 0
    .parameter "position"
    .parameter "lookDown"

    .prologue
    .line 1086
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    return p1
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 849
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 850
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 851
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 1
    .parameter "changed"
    .parameter "left"
    .parameter "top"
    .parameter "right"
    .parameter "bottom"

    .prologue
    .line 542
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getHeight()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mLayoutHeight:I

    .line 543
    return-void
.end method

.method public performItemClick(Landroid/view/View;IJ)Z
    .locals 7
    .parameter "view"
    .parameter "position"
    .parameter "id"

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v6, 0x1

    #v6=(One);
    const/4 v0, 0x0

    .line 303
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 304
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->playSoundEffect(I)V

    .line 305
    if-eqz p1, :cond_0

    .line 306
    invoke-virtual {p1, v6}, Landroid/view/View;->sendAccessibilityEvent(I)V

    .line 308
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    #v0=(Reference);
    move-object v1, p0

    move-object v2, p1

    #v2=(Reference);
    move v3, p2

    #v3=(Integer);
    move-wide v4, p3

    #v4=(LongLo);v5=(LongHi);
    invoke-interface/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;->onItemClick(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V

    move v0, v6

    .line 312
    :cond_1
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return v0
.end method

.method rememberSyncState()V
    .locals 6

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, 0x0

    .line 1119
    #v4=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildCount()I

    move-result v2

    #v2=(Integer);
    if-lez v2, :cond_1

    .line 1120
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    .line 1121
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mLayoutHeight:I

    int-to-long v2, v2

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncHeight:J

    .line 1122
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    #v2=(Integer);
    if-ltz v2, :cond_2

    .line 1124
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    iget v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    #v3=(Integer);
    sub-int/2addr v2, v3

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1125
    .local v1, v:Landroid/view/View;
    #v1=(Reference);
    iget-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 1126
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    #v2=(Integer);
    iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I

    .line 1127
    if-eqz v1, :cond_0

    .line 1128
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSpecificTop:I

    .line 1130
    :cond_0
    iput v4, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncMode:I

    .line 1147
    .end local v1           #v:Landroid/view/View;
    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
    return-void

    .line 1133
    :cond_2
    #v0=(Uninit);v1=(Uninit);v3=(LongHi);
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/AdapterViewICS;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1134
    .restart local v1       #v:Landroid/view/View;
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 1135
    .local v0, adapter:Landroid/widget/Adapter;,"TT;"
    #v0=(Reference);
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    if-ltz v2, :cond_4

    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v3

    #v3=(Integer);
    if-ge v2, v3, :cond_4

    .line 1136
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    invoke-interface {v0, v2}, Landroid/widget/Adapter;->getItemId(I)J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 1140
    :goto_1
    iget v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mFirstPosition:I

    #v2=(Integer);
    iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I

    .line 1141
    if-eqz v1, :cond_3

    .line 1142
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    iput v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSpecificTop:I

    .line 1144
    :cond_3
    iput v5, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncMode:I

    goto :goto_0

    .line 1138
    :cond_4
    #v3=(Conflicted);
    const-wide/16 v2, -0x1

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    goto :goto_1
.end method

.method public removeAllViews()V
    .locals 2

    .prologue
    .line 537
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "removeAllViews() is not supported in AdapterView"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public removeView(Landroid/view/View;)V
    .locals 2
    .parameter "child"

    .prologue
    .line 515
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "removeView(View) is not supported in AdapterView"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public removeViewAt(I)V
    .locals 2
    .parameter "index"

    .prologue
    .line 527
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "removeViewAt(int) is not supported in AdapterView"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method selectionChanged()V
    .locals 2

    .prologue
    .line 869
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 870
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mInLayout:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mBlockLayoutRequests:Z

    if-eqz v0, :cond_4

    .line 875
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    #v0=(Reference);
    if-nez v0, :cond_1

    .line 876
    new-instance v0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;-><init>(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/support/v7/internal/widget/AdapterViewICS$1;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    .line 878
    :cond_1
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectionNotifier:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->post(Ljava/lang/Runnable;)Z

    .line 885
    :cond_2
    :goto_0
    #v0=(Conflicted);
    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-eq v0, v1, :cond_3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isShown()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInTouchMode()Z

    move-result v0

    if-nez v0, :cond_3

    .line 886
    const/4 v0, 0x4

    #v0=(PosByte);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->sendAccessibilityEvent(I)V

    .line 888
    :cond_3
    #v0=(Integer);
    return-void

    .line 880
    :cond_4
    #v0=(Boolean);v1=(Uninit);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->fireOnSelected()V

    goto :goto_0
.end method

.method public abstract setAdapter(Landroid/widget/Adapter;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation
.end method

.method public setEmptyView(Landroid/view/View;)V
    .locals 3
    .parameter "emptyView"

    .prologue
    .line 659
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mEmptyView:Landroid/view/View;

    .line 661
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 662
    .local v0, adapter:Landroid/widget/Adapter;,"TT;"
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    :cond_0
    #v2=(Conflicted);
    const/4 v1, 0x1

    .line 663
    .local v1, empty:Z
    :goto_0
    #v1=(Boolean);
    invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->updateEmptyStatus(Z)V

    .line 664
    return-void

    .line 662
    .end local v1           #empty:Z
    :cond_1
    #v1=(Uninit);v2=(Boolean);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public setFocusable(Z)V
    .locals 5
    .parameter "focusable"

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 689
    #v2=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 690
    .local v0, adapter:Landroid/widget/Adapter;,"TT;"
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v4

    #v4=(Integer);
    if-nez v4, :cond_3

    :cond_0
    #v4=(Conflicted);
    move v1, v3

    .line 692
    .local v1, empty:Z
    :goto_0
    #v1=(Boolean);
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableState:Z

    .line 693
    if-nez p1, :cond_1

    .line 694
    iput-boolean v2, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableInTouchModeState:Z

    .line 697
    :cond_1
    if-eqz p1, :cond_4

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_4

    :cond_2
    :goto_1
    #v3=(Boolean);v4=(Conflicted);
    invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusable(Z)V

    .line 698
    return-void

    .end local v1           #empty:Z
    :cond_3
    #v1=(Uninit);v3=(One);v4=(Integer);
    move v1, v2

    .line 690
    #v1=(Null);
    goto :goto_0

    .restart local v1       #empty:Z
    :cond_4
    #v1=(Boolean);v4=(Conflicted);
    move v3, v2

    .line 697
    #v3=(Null);
    goto :goto_1
.end method

.method public setFocusableInTouchMode(Z)V
    .locals 5
    .parameter "focusable"

    .prologue
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x1

    .line 702
    #v3=(One);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    .line 703
    .local v0, adapter:Landroid/widget/Adapter;,"TT;"
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-interface {v0}, Landroid/widget/Adapter;->getCount()I

    move-result v4

    #v4=(Integer);
    if-nez v4, :cond_3

    :cond_0
    #v4=(Conflicted);
    move v1, v3

    .line 705
    .local v1, empty:Z
    :goto_0
    #v1=(Boolean);
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableInTouchModeState:Z

    .line 706
    if-eqz p1, :cond_1

    .line 707
    iput-boolean v3, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDesiredFocusableState:Z

    .line 710
    :cond_1
    if-eqz p1, :cond_4

    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isInFilterMode()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_4

    :cond_2
    :goto_1
    #v3=(Boolean);v4=(Conflicted);
    invoke-super {p0, v3}, Landroid/view/ViewGroup;->setFocusableInTouchMode(Z)V

    .line 711
    return-void

    .end local v1           #empty:Z
    :cond_3
    #v1=(Uninit);v3=(One);v4=(Integer);
    move v1, v2

    .line 703
    #v1=(Null);
    goto :goto_0

    .restart local v1       #empty:Z
    :cond_4
    #v1=(Boolean);v4=(Conflicted);
    move v3, v2

    .line 710
    #v3=(Null);
    goto :goto_1
.end method

.method setNextSelectedPositionInt(I)V
    .locals 2
    .parameter "position"

    .prologue
    .line 1104
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedPosition:I

    .line 1105
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->getItemIdAtPosition(I)J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    .line 1107
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNeedSync:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncMode:I

    #v0=(Integer);
    if-nez v0, :cond_0

    if-ltz p1, :cond_0

    .line 1108
    iput p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncPosition:I

    .line 1109
    iget-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mNextSelectedRowId:J

    #v0=(LongLo);
    iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSyncRowId:J

    .line 1111
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public setOnClickListener(Landroid/view/View$OnClickListener;)V
    .locals 2
    .parameter "l"

    .prologue
    .line 776
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    new-instance v0, Ljava/lang/RuntimeException;

    #v0=(UninitRef);
    const-string v1, "Don\'t call setOnClickListener for an AdapterView. You probably want setOnItemClickListener instead"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public setOnItemClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 282
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    .line 283
    return-void
.end method

.method public setOnItemLongClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;)V
    .locals 1
    .parameter "listener"

    .prologue
    .line 345
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->isLongClickable()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 346
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->setLongClickable(Z)V

    .line 348
    :cond_0
    #v0=(Boolean);
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemLongClickListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemLongClickListener;

    .line 349
    return-void
.end method

.method public setOnItemSelectedListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 398
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mOnItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    .line 399
    return-void
.end method

.method setSelectedPositionInt(I)V
    .locals 2
    .parameter "position"

    .prologue
    .line 1094
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>;"
    iput p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedPosition:I

    .line 1095
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;->getItemIdAtPosition(I)J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS;->mSelectedRowId:J

    .line 1096
    return-void
.end method

.method public abstract setSelection(I)V
.end method

*/}
