package android.support.v7.internal.widget; class AbsSpinnerICS {/*

.class abstract Landroid/support/v7/internal/widget/AbsSpinnerICS;
.super Landroid/support/v7/internal/widget/AdapterViewICS;
.source "AbsSpinnerICS.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/AbsSpinnerICS$1;,
        Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;,
        Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/internal/widget/AdapterViewICS",
        "<",
        "Landroid/widget/SpinnerAdapter;",
        ">;"
    }
.end annotation


# instance fields
.field mAdapter:Landroid/widget/SpinnerAdapter;

.field mBlockLayoutRequests:Z

.field private mDataSetObserver:Landroid/database/DataSetObserver;

.field mHeightMeasureSpec:I

.field final mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

.field mSelectionBottomPadding:I

.field mSelectionLeftPadding:I

.field mSelectionRightPadding:I

.field mSelectionTopPadding:I

.field final mSpinnerPadding:Landroid/graphics/Rect;

.field private mTouchFrame:Landroid/graphics/Rect;

.field mWidthMeasureSpec:I


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    const/4 v0, 0x0

    .line 54
    #v0=(Null);
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS;-><init>(Landroid/content/Context;)V

    .line 41
    #p0=(Reference);
    iput v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionLeftPadding:I

    .line 42
    iput v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionTopPadding:I

    .line 43
    iput v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionRightPadding:I

    .line 44
    iput v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionBottomPadding:I

    .line 45
    new-instance v0, Landroid/graphics/Rect;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    .line 47
    new-instance v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;-><init>(Landroid/support/v7/internal/widget/AbsSpinnerICS;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    .line 55
    invoke-direct {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->initAbsSpinner()V

    .line 56
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 59
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    const/4 v0, 0x0

    .line 63
    #v0=(Null);
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/internal/widget/AdapterViewICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    #p0=(Reference);
    iput v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionLeftPadding:I

    .line 42
    iput v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionTopPadding:I

    .line 43
    iput v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionRightPadding:I

    .line 44
    iput v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionBottomPadding:I

    .line 45
    new-instance v0, Landroid/graphics/Rect;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    .line 47
    new-instance v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;-><init>(Landroid/support/v7/internal/widget/AbsSpinnerICS;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    .line 64
    invoke-direct {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->initAbsSpinner()V

    .line 65
    return-void
.end method

.method static synthetic access$100(Landroid/support/v7/internal/widget/AbsSpinnerICS;Landroid/view/View;Z)V
    .locals 0
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"

    .prologue
    .line 34
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->removeDetachedView(Landroid/view/View;Z)V

    return-void
.end method

.method private initAbsSpinner()V
    .locals 1

    .prologue
    .line 71
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setFocusable(Z)V

    .line 72
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setWillNotDraw(Z)V

    .line 73
    return-void
.end method


# virtual methods
.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .prologue
    .line 231
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    #v0=(UninitRef);
    const/4 v1, -0x1

    #v1=(Byte);
    const/4 v2, -0x2

    #v2=(Byte);
    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic getAdapter()Landroid/widget/Adapter;
    .locals 1

    .prologue
    .line 34
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getAdapter()Landroid/widget/SpinnerAdapter;
    .locals 1

    .prologue
    .line 310
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v0=(Reference);
    return-object v0
.end method

.method getChildHeight(Landroid/view/View;)I
    .locals 1
    .parameter "child"

    .prologue
    .line 222
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method getChildWidth(Landroid/view/View;)I
    .locals 1
    .parameter "child"

    .prologue
    .line 226
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 315
    iget v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mItemCount:I

    #v0=(Integer);
    return v0
.end method

.method public getSelectedView()Landroid/view/View;
    .locals 2

    .prologue
    .line 288
    iget v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mItemCount:I

    #v0=(Integer);
    if-lez v0, :cond_0

    iget v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectedPosition:I

    if-ltz v0, :cond_0

    .line 289
    iget v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectedPosition:I

    iget v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mFirstPosition:I

    #v1=(Integer);
    sub-int/2addr v0, v1

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 291
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Integer);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method abstract layout(IZ)V
.end method

.method protected onMeasure(II)V
    .locals 17
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 147
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v13

    .line 151
    .local v13, widthMode:I
    #v13=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getPaddingLeft()I

    move-result v6

    .line 152
    .local v6, paddingLeft:I
    #v6=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getPaddingTop()I

    move-result v8

    .line 153
    .local v8, paddingTop:I
    #v8=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getPaddingRight()I

    move-result v7

    .line 154
    .local v7, paddingRight:I
    #v7=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getPaddingBottom()I

    move-result v5

    .line 156
    .local v5, paddingBottom:I
    #v5=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    #v15=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionLeftPadding:I

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    move/from16 v0, v16

    if-le v6, v0, :cond_6

    .end local v6           #paddingLeft:I
    :goto_0
    #v0=(Conflicted);
    iput v6, v15, Landroid/graphics/Rect;->left:I

    .line 158
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionTopPadding:I

    #v0=(Integer);
    move/from16 v16, v0

    move/from16 v0, v16

    if-le v8, v0, :cond_7

    .end local v8           #paddingTop:I
    :goto_1
    #v0=(Conflicted);
    iput v8, v15, Landroid/graphics/Rect;->top:I

    .line 160
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionRightPadding:I

    #v0=(Integer);
    move/from16 v16, v0

    move/from16 v0, v16

    if-le v7, v0, :cond_8

    .end local v7           #paddingRight:I
    :goto_2
    #v0=(Conflicted);
    iput v7, v15, Landroid/graphics/Rect;->right:I

    .line 162
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionBottomPadding:I

    #v0=(Integer);
    move/from16 v16, v0

    move/from16 v0, v16

    if-le v5, v0, :cond_9

    .end local v5           #paddingBottom:I
    :goto_3
    #v0=(Conflicted);
    iput v5, v15, Landroid/graphics/Rect;->bottom:I

    .line 165
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mDataChanged:Z

    #v15=(Boolean);
    if-eqz v15, :cond_0

    .line 166
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->handleDataChanged()V

    .line 169
    :cond_0
    const/4 v9, 0x0

    .line 170
    .local v9, preferredHeight:I
    #v9=(Null);
    const/4 v10, 0x0

    .line 171
    .local v10, preferredWidth:I
    #v10=(Null);
    const/4 v4, 0x1

    .line 173
    .local v4, needsMeasuring:Z
    #v4=(One);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getSelectedItemPosition()I

    move-result v11

    .line 174
    .local v11, selectedPosition:I
    #v11=(Integer);
    if-ltz v11, :cond_4

    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v15=(Reference);
    if-eqz v15, :cond_4

    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    invoke-interface {v15}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v15

    #v15=(Integer);
    if-ge v11, v15, :cond_4

    .line 176
    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    #v15=(Reference);
    invoke-virtual {v15, v11}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->get(I)Landroid/view/View;

    move-result-object v12

    .line 177
    .local v12, view:Landroid/view/View;
    #v12=(Reference);
    if-nez v12, :cond_1

    .line 179
    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    const/16 v16, 0x0

    #v16=(Null);
    move-object/from16 v0, v16

    #v0=(Null);
    move-object/from16 v1, p0

    #v1=(Reference);
    invoke-interface {v15, v11, v0, v1}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v12

    .line 182
    :cond_1
    #v0=(Reference);v1=(Conflicted);v16=(Integer);
    if-eqz v12, :cond_2

    .line 184
    move-object/from16 v0, p0

    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    invoke-virtual {v15, v11, v12}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->put(ILandroid/view/View;)V

    .line 187
    :cond_2
    if-eqz v12, :cond_4

    .line 188
    invoke-virtual {v12}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    if-nez v15, :cond_3

    .line 189
    const/4 v15, 0x1

    #v15=(One);
    move-object/from16 v0, p0

    iput-boolean v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mBlockLayoutRequests:Z

    .line 190
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    #v15=(Reference);
    invoke-virtual {v12, v15}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 191
    const/4 v15, 0x0

    #v15=(Null);
    move-object/from16 v0, p0

    iput-boolean v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mBlockLayoutRequests:Z

    .line 193
    :cond_3
    #v15=(Reference);
    move-object/from16 v0, p0

    move/from16 v1, p1

    #v1=(Integer);
    move/from16 v2, p2

    #v2=(Integer);
    invoke-virtual {v0, v12, v1, v2}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->measureChild(Landroid/view/View;II)V

    .line 195
    move-object/from16 v0, p0

    invoke-virtual {v0, v12}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getChildHeight(Landroid/view/View;)I

    move-result v15

    #v15=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    move-object/from16 v16, v0

    #v16=(Reference);
    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/Rect;->top:I

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    add-int v15, v15, v16

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    move-object/from16 v16, v0

    #v16=(Reference);
    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    add-int v9, v15, v16

    .line 196
    #v9=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v12}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getChildWidth(Landroid/view/View;)I

    move-result v15

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    move-object/from16 v16, v0

    #v16=(Reference);
    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/Rect;->left:I

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    add-int v15, v15, v16

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    move-object/from16 v16, v0

    #v16=(Reference);
    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/Rect;->right:I

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    add-int v10, v15, v16

    .line 198
    #v10=(Integer);
    const/4 v4, 0x0

    .line 202
    .end local v12           #view:Landroid/view/View;
    :cond_4
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Boolean);v12=(Conflicted);v15=(Conflicted);
    if-eqz v4, :cond_5

    .line 204
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    #v15=(Reference);
    iget v15, v15, Landroid/graphics/Rect;->top:I

    #v15=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    move-object/from16 v16, v0

    #v16=(Reference);
    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    add-int v9, v15, v16

    .line 205
    if-nez v13, :cond_5

    .line 206
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    #v15=(Reference);
    iget v15, v15, Landroid/graphics/Rect;->left:I

    #v15=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;

    move-object/from16 v16, v0

    #v16=(Reference);
    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/Rect;->right:I

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    add-int v10, v15, v16

    .line 210
    :cond_5
    #v0=(Conflicted);v15=(Conflicted);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getSuggestedMinimumHeight()I

    move-result v15

    #v15=(Integer);
    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 211
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getSuggestedMinimumWidth()I

    move-result v15

    invoke-static {v10, v15}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 213
    move/from16 v0, p2

    #v0=(Integer);
    invoke-static {v9, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->resolveSize(II)I

    move-result v3

    .line 214
    .local v3, heightSize:I
    #v3=(Integer);
    move/from16 v0, p1

    invoke-static {v10, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->resolveSize(II)I

    move-result v14

    .line 216
    .local v14, widthSize:I
    #v14=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v14, v3}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setMeasuredDimension(II)V

    .line 217
    move/from16 v0, p2

    #v0=(Integer);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mHeightMeasureSpec:I

    .line 218
    move/from16 v0, p1

    move-object/from16 v1, p0

    iput v0, v1, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mWidthMeasureSpec:I

    .line 219
    return-void

    .line 156
    .end local v3           #heightSize:I
    .end local v4           #needsMeasuring:Z
    .end local v9           #preferredHeight:I
    .end local v10           #preferredWidth:I
    .end local v11           #selectedPosition:I
    .end local v14           #widthSize:I
    .restart local v5       #paddingBottom:I
    .restart local v6       #paddingLeft:I
    .restart local v7       #paddingRight:I
    .restart local v8       #paddingTop:I
    :cond_6
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v14=(Uninit);v15=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v6, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionLeftPadding:I

    goto/16 :goto_0

    .line 158
    .end local v6           #paddingLeft:I
    :cond_7
    #v0=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v8, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionTopPadding:I

    goto/16 :goto_1

    .line 160
    .end local v8           #paddingTop:I
    :cond_8
    #v0=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v7, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionRightPadding:I

    goto/16 :goto_2

    .line 162
    .end local v7           #paddingRight:I
    :cond_9
    #v0=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v5, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectionBottomPadding:I

    goto/16 :goto_3
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 6
    .parameter "state"

    .prologue
    const/4 v5, 0x1

    .line 408
    #v5=(One);
    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;

    .line 410
    .local v0, ss:Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v1

    #v1=(Reference);
    invoke-super {p0, v1}, Landroid/support/v7/internal/widget/AdapterViewICS;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 412
    iget-wide v1, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;->selectedId:J

    #v1=(LongLo);v2=(LongHi);
    const-wide/16 v3, 0x0

    #v3=(LongLo);v4=(LongHi);
    cmp-long v1, v1, v3

    #v1=(Byte);
    if-ltz v1, :cond_0

    .line 413
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mDataChanged:Z

    .line 414
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mNeedSync:Z

    .line 415
    iget-wide v1, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;->selectedId:J

    #v1=(LongLo);
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSyncRowId:J

    .line 416
    iget v1, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;->position:I

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSyncPosition:I

    .line 417
    const/4 v1, 0x0

    #v1=(Null);
    iput v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSyncMode:I

    .line 418
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->requestLayout()V

    .line 420
    :cond_0
    #v1=(Byte);
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 6

    .prologue
    .line 395
    invoke-super {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 396
    .local v1, superState:Landroid/os/Parcelable;
    #v1=(Reference);
    new-instance v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;

    #v0=(UninitRef);
    invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 397
    .local v0, ss:Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getSelectedItemId()J

    move-result-wide v2

    #v2=(LongLo);v3=(LongHi);
    iput-wide v2, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;->selectedId:J

    .line 398
    iget-wide v2, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;->selectedId:J

    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-ltz v2, :cond_0

    .line 399
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getSelectedItemPosition()I

    move-result v2

    #v2=(Integer);
    iput v2, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;->position:I

    .line 403
    :goto_0
    return-object v0

    .line 401
    :cond_0
    #v2=(Byte);
    const/4 v2, -0x1

    iput v2, v0, Landroid/support/v7/internal/widget/AbsSpinnerICS$SavedState;->position:I

    goto :goto_0
.end method

.method public pointToPosition(II)I
    .locals 5
    .parameter "x"
    .parameter "y"

    .prologue
    .line 327
    iget-object v2, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mTouchFrame:Landroid/graphics/Rect;

    .line 328
    .local v2, frame:Landroid/graphics/Rect;
    #v2=(Reference);
    if-nez v2, :cond_0

    .line 329
    new-instance v4, Landroid/graphics/Rect;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mTouchFrame:Landroid/graphics/Rect;

    .line 330
    iget-object v2, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mTouchFrame:Landroid/graphics/Rect;

    .line 333
    :cond_0
    #v4=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getChildCount()I

    move-result v1

    .line 334
    .local v1, count:I
    #v1=(Integer);
    add-int/lit8 v3, v1, -0x1

    .local v3, i:I
    :goto_0
    #v0=(Conflicted);v3=(Integer);
    if-ltz v3, :cond_2

    .line 335
    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 336
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v4

    #v4=(Integer);
    if-nez v4, :cond_1

    .line 337
    invoke-virtual {v0, v2}, Landroid/view/View;->getHitRect(Landroid/graphics/Rect;)V

    .line 338
    invoke-virtual {v2, p1, p2}, Landroid/graphics/Rect;->contains(II)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 339
    iget v4, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mFirstPosition:I

    #v4=(Integer);
    add-int/2addr v4, v3

    .line 343
    .end local v0           #child:Landroid/view/View;
    :goto_1
    #v0=(Conflicted);
    return v4

    .line 334
    .restart local v0       #child:Landroid/view/View;
    :cond_1
    #v0=(Reference);
    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    .line 343
    .end local v0           #child:Landroid/view/View;
    :cond_2
    #v0=(Conflicted);v4=(Conflicted);
    const/4 v4, -0x1

    #v4=(Byte);
    goto :goto_1
.end method

.method recycleAllViews()V
    .locals 6

    .prologue
    .line 237
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getChildCount()I

    move-result v0

    .line 238
    .local v0, childCount:I
    #v0=(Integer);
    iget-object v4, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;

    .line 239
    .local v4, recycleBin:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;
    #v4=(Reference);
    iget v3, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mFirstPosition:I

    .line 242
    .local v3, position:I
    #v3=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);v5=(Conflicted);
    if-ge v1, v0, :cond_0

    .line 243
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 244
    .local v5, v:Landroid/view/View;
    #v5=(Reference);
    add-int v2, v3, v1

    .line 245
    .local v2, index:I
    #v2=(Integer);
    invoke-virtual {v4, v2, v5}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->put(ILandroid/view/View;)V

    .line 242
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 247
    .end local v2           #index:I
    .end local v5           #v:Landroid/view/View;
    :cond_0
    #v2=(Conflicted);v5=(Conflicted);
    return-void
.end method

.method public requestLayout()V
    .locals 1

    .prologue
    .line 303
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mBlockLayoutRequests:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 304
    invoke-super {p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->requestLayout()V

    .line 306
    :cond_0
    return-void
.end method

.method resetList()V
    .locals 3

    .prologue
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v2, -0x1

    .line 125
    #v2=(Byte);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mDataChanged:Z

    .line 126
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mNeedSync:Z

    .line 128
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->removeAllViewsInLayout()V

    .line 129
    iput v2, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mOldSelectedPosition:I

    .line 130
    const-wide/high16 v0, -0x8000

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mOldSelectedRowId:J

    .line 132
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setSelectedPositionInt(I)V

    .line 133
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setNextSelectedPositionInt(I)V

    .line 134
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->invalidate()V

    .line 135
    return-void
.end method

.method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 34
    check-cast p1, Landroid/widget/SpinnerAdapter;

    .end local p1
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    return-void
.end method

.method public setAdapter(Landroid/widget/SpinnerAdapter;)V
    .locals 3
    .parameter "adapter"

    .prologue
    const/4 v0, -0x1

    .line 83
    #v0=(Byte);
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 84
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    iget-object v2, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mDataSetObserver:Landroid/database/DataSetObserver;

    #v2=(Reference);
    invoke-interface {v1, v2}, Landroid/widget/SpinnerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 85
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->resetList()V

    .line 88
    :cond_0
    #v2=(Conflicted);
    iput-object p1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    .line 90
    iput v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mOldSelectedPosition:I

    .line 91
    const-wide/high16 v1, -0x8000

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mOldSelectedRowId:J

    .line 93
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v1=(Reference);
    if-eqz v1, :cond_3

    .line 94
    iget v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mItemCount:I

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mOldItemCount:I

    .line 95
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v1=(Reference);
    invoke-interface {v1}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mItemCount:I

    .line 96
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->checkFocus()V

    .line 98
    new-instance v1, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Landroid/support/v7/internal/widget/AdapterViewICS$AdapterDataSetObserver;-><init>(Landroid/support/v7/internal/widget/AdapterViewICS;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mDataSetObserver:Landroid/database/DataSetObserver;

    .line 99
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;

    iget-object v2, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mDataSetObserver:Landroid/database/DataSetObserver;

    #v2=(Reference);
    invoke-interface {v1, v2}, Landroid/widget/SpinnerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 101
    iget v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mItemCount:I

    #v1=(Integer);
    if-lez v1, :cond_1

    const/4 v0, 0x0

    .line 103
    .local v0, position:I
    :cond_1
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setSelectedPositionInt(I)V

    .line 104
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setNextSelectedPositionInt(I)V

    .line 106
    iget v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mItemCount:I

    if-nez v1, :cond_2

    .line 108
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->checkSelectionChanged()V

    .line 118
    .end local v0           #position:I
    :cond_2
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->requestLayout()V

    .line 119
    return-void

    .line 112
    :cond_3
    #v1=(Reference);v2=(LongHi);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->checkFocus()V

    .line 113
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->resetList()V

    .line 115
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->checkSelectionChanged()V

    goto :goto_0
.end method

.method public setSelection(I)V
    .locals 0
    .parameter "position"

    .prologue
    .line 261
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setNextSelectedPositionInt(I)V

    .line 262
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->requestLayout()V

    .line 263
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->invalidate()V

    .line 264
    return-void
.end method

.method public setSelection(IZ)V
    .locals 3
    .parameter "position"
    .parameter "animate"

    .prologue
    .line 254
    if-eqz p2, :cond_0

    iget v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mFirstPosition:I

    #v1=(Integer);
    if-gt v1, p1, :cond_0

    iget v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mFirstPosition:I

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->getChildCount()I

    move-result v2

    #v2=(Integer);
    add-int/2addr v1, v2

    add-int/lit8 v1, v1, -0x1

    if-gt p1, v1, :cond_0

    const/4 v0, 0x1

    .line 256
    .local v0, shouldAnimate:Z
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    invoke-virtual {p0, p1, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setSelectionInt(IZ)V

    .line 257
    return-void

    .line 254
    .end local v0           #shouldAnimate:Z
    :cond_0
    #v0=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method setSelectionInt(IZ)V
    .locals 2
    .parameter "position"
    .parameter "animate"

    .prologue
    .line 275
    iget v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mOldSelectedPosition:I

    #v1=(Integer);
    if-eq p1, v1, :cond_0

    .line 276
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mBlockLayoutRequests:Z

    .line 277
    iget v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mSelectedPosition:I

    #v1=(Integer);
    sub-int v0, p1, v1

    .line 278
    .local v0, delta:I
    #v0=(Integer);
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setNextSelectedPositionInt(I)V

    .line 279
    invoke-virtual {p0, v0, p2}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->layout(IZ)V

    .line 280
    const/4 v1, 0x0

    #v1=(Null);
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS;->mBlockLayoutRequests:Z

    .line 282
    .end local v0           #delta:I
    :cond_0
    #v0=(Conflicted);v1=(Integer);
    return-void
.end method

*/}
