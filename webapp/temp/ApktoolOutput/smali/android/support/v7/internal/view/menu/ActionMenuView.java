package android.support.v7.internal.view.menu; class ActionMenuView {/*

.class public Landroid/support/v7/internal/view/menu/ActionMenuView;
.super Landroid/support/v7/internal/widget/LinearLayoutICS;
.source "ActionMenuView.java"

# interfaces
.implements Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;
.implements Landroid/support/v7/internal/view/menu/MenuView;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;,
        Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;
    }
.end annotation


# static fields
.field static final GENERATED_ITEM_PADDING:I = 0x4

.field static final MIN_CELL_SIZE:I = 0x38

.field private static final TAG:Ljava/lang/String; = "ActionMenuView"


# instance fields
.field private mFormatItems:Z

.field private mFormatItemsWidth:I

.field private mGeneratedItemPadding:I

.field private mMaxItemHeight:I

.field private mMeasuredExtraWidth:I

.field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private mMinCellSize:I

.field private mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

.field private mReserveOverflow:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 54
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/view/menu/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 55
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v4, 0x0

    .line 58
    #v4=(Null);
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/LinearLayoutICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 59
    #p0=(Reference);
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBaselineAligned(Z)V

    .line 60
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v1, v2, Landroid/util/DisplayMetrics;->density:F

    .line 61
    .local v1, density:F
    #v1=(Integer);
    const/high16 v2, 0x4260

    #v2=(Integer);
    mul-float/2addr v2, v1

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I

    .line 62
    const/high16 v2, 0x4080

    mul-float/2addr v2, v1

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    .line 64
    sget-object v2, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I

    #v2=(Reference);
    sget v3, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I

    #v3=(Integer);
    invoke-virtual {p1, p2, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 66
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    invoke-virtual {v0, v4, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMaxItemHeight:I

    .line 67
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 68
    return-void
.end method

.method static measureChildForCells(Landroid/view/View;IIII)I
    .locals 13
    .parameter "child"
    .parameter "cellSize"
    .parameter "cellsRemaining"
    .parameter "parentHeightMeasureSpec"
    .parameter "parentHeightPadding"

    .prologue
    .line 377
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 379
    .local v8, lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v11

    #v11=(Integer);
    sub-int v2, v11, p4

    .line 381
    .local v2, childHeightSize:I
    #v2=(Integer);
    invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 382
    .local v1, childHeightMode:I
    #v1=(Integer);
    invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 384
    .local v3, childHeightSpec:I
    #v3=(Integer);
    instance-of v11, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    #v11=(Boolean);
    if-eqz v11, :cond_3

    move-object v11, p0

    #v11=(Reference);
    check-cast v11, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    move-object v7, v11

    .line 386
    .local v7, itemView:Landroid/support/v7/internal/view/menu/ActionMenuItemView;
    :goto_0
    #v7=(Reference);v11=(Conflicted);
    if-eqz v7, :cond_4

    invoke-virtual {v7}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z

    move-result v11

    #v11=(Boolean);
    if-eqz v11, :cond_4

    const/4 v6, 0x1

    .line 388
    .local v6, hasText:Z
    :goto_1
    #v6=(Boolean);v11=(Conflicted);
    const/4 v0, 0x0

    .line 389
    .local v0, cellsUsed:I
    #v0=(Null);
    if-lez p2, :cond_2

    if-eqz v6, :cond_0

    const/4 v11, 0x2

    #v11=(PosByte);
    if-lt p2, v11, :cond_2

    .line 390
    :cond_0
    #v11=(Conflicted);
    mul-int v11, p1, p2

    #v11=(Integer);
    const/high16 v12, -0x8000

    #v12=(Integer);
    invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 392
    .local v4, childWidthSpec:I
    #v4=(Integer);
    invoke-virtual {p0, v4, v3}, Landroid/view/View;->measure(II)V

    .line 394
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    .line 395
    .local v9, measuredWidth:I
    #v9=(Integer);
    div-int v0, v9, p1

    .line 396
    #v0=(Integer);
    rem-int v11, v9, p1

    if-eqz v11, :cond_1

    .line 397
    add-int/lit8 v0, v0, 0x1

    .line 399
    :cond_1
    if-eqz v6, :cond_2

    const/4 v11, 0x2

    #v11=(PosByte);
    if-ge v0, v11, :cond_2

    .line 400
    const/4 v0, 0x2

    .line 404
    .end local v4           #childWidthSpec:I
    .end local v9           #measuredWidth:I
    :cond_2
    #v4=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    iget-boolean v11, v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    #v11=(Boolean);
    if-nez v11, :cond_5

    if-eqz v6, :cond_5

    const/4 v5, 0x1

    .line 405
    .local v5, expandable:Z
    :goto_2
    #v5=(Boolean);
    iput-boolean v5, v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z

    .line 407
    iput v0, v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    .line 408
    mul-int v10, v0, p1

    .line 409
    .local v10, targetWidth:I
    #v10=(Integer);
    const/high16 v11, 0x4000

    #v11=(Integer);
    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v11

    invoke-virtual {p0, v11, v3}, Landroid/view/View;->measure(II)V

    .line 411
    return v0

    .line 384
    .end local v0           #cellsUsed:I
    .end local v5           #expandable:Z
    .end local v6           #hasText:Z
    .end local v7           #itemView:Landroid/support/v7/internal/view/menu/ActionMenuItemView;
    .end local v10           #targetWidth:I
    :cond_3
    #v0=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Boolean);v12=(Uninit);
    const/4 v7, 0x0

    #v7=(Null);
    goto :goto_0

    .line 386
    .restart local v7       #itemView:Landroid/support/v7/internal/view/menu/ActionMenuItemView;
    :cond_4
    #v7=(Reference);v11=(Conflicted);
    const/4 v6, 0x0

    #v6=(Null);
    goto :goto_1

    .line 404
    .restart local v0       #cellsUsed:I
    .restart local v6       #hasText:Z
    :cond_5
    #v0=(Integer);v4=(Conflicted);v6=(Boolean);v9=(Conflicted);v11=(Boolean);v12=(Conflicted);
    const/4 v5, 0x0

    #v5=(Null);
    goto :goto_2
.end method

.method private onMeasureExactFormat(II)V
    .locals 42
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 126
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v17

    .line 127
    .local v17, heightMode:I
    #v17=(Integer);
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v37

    .line 128
    .local v37, widthSize:I
    #v37=(Integer);
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v19

    .line 130
    .local v19, heightSize:I
    #v19=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingLeft()I

    move-result v38

    #v38=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingRight()I

    move-result v39

    #v39=(Integer);
    add-int v36, v38, v39

    .line 131
    .local v36, widthPadding:I
    #v36=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingTop()I

    move-result v38

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingBottom()I

    move-result v39

    add-int v18, v38, v39

    .line 133
    .local v18, heightPadding:I
    #v18=(Integer);
    const/high16 v38, 0x4000

    move/from16 v0, v17

    #v0=(Integer);
    move/from16 v1, v38

    #v1=(Integer);
    if-ne v0, v1, :cond_0

    sub-int v38, v19, v18

    const/high16 v39, 0x4000

    invoke-static/range {v38 .. v39}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v22

    .line 138
    .local v22, itemHeightSpec:I
    :goto_0
    #v22=(Integer);
    sub-int v37, v37, v36

    .line 141
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I

    #v0=(Integer);
    move/from16 v38, v0

    div-int v4, v37, v38

    .line 142
    .local v4, cellCount:I
    #v4=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I

    #v0=(Integer);
    move/from16 v38, v0

    rem-int v6, v37, v38

    .line 144
    .local v6, cellSizeRemaining:I
    #v6=(Integer);
    if-nez v4, :cond_1

    .line 146
    const/16 v38, 0x0

    #v38=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v37

    move/from16 v2, v38

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setMeasuredDimension(II)V

    .line 360
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);v21=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v38=(Integer);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
    return-void

    .line 133
    .end local v4           #cellCount:I
    .end local v6           #cellSizeRemaining:I
    .end local v22           #itemHeightSpec:I
    :cond_0
    #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v39=(Integer);v40=(Uninit);v41=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMaxItemHeight:I

    #v0=(Integer);
    move/from16 v38, v0

    sub-int v39, v19, v18

    invoke-static/range {v38 .. v39}, Ljava/lang/Math;->min(II)I

    move-result v38

    const/high16 v39, -0x8000

    invoke-static/range {v38 .. v39}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v22

    #v22=(Integer);
    goto :goto_0

    .line 150
    .restart local v4       #cellCount:I
    .restart local v6       #cellSizeRemaining:I
    .restart local v22       #itemHeightSpec:I
    :cond_1
    #v4=(Integer);v6=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I

    #v0=(Integer);
    move/from16 v38, v0

    div-int v39, v6, v4

    add-int v5, v38, v39

    .line 152
    .local v5, cellSize:I
    #v5=(Integer);
    move v8, v4

    .line 153
    .local v8, cellsRemaining:I
    #v8=(Integer);
    const/16 v25, 0x0

    .line 154
    .local v25, maxChildHeight:I
    #v25=(Null);
    const/16 v24, 0x0

    .line 155
    .local v24, maxCellsUsed:I
    #v24=(Null);
    const/4 v14, 0x0

    .line 156
    .local v14, expandableItemCount:I
    #v14=(Null);
    const/16 v34, 0x0

    .line 157
    .local v34, visibleItemCount:I
    #v34=(Null);
    const/16 v16, 0x0

    .line 160
    .local v16, hasOverflow:Z
    #v16=(Null);
    const-wide/16 v32, 0x0

    .line 162
    .local v32, smallestItemsAt:J
    #v32=(LongLo);v33=(LongHi);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v12

    .line 163
    .local v12, childCount:I
    #v12=(Integer);
    const/16 v20, 0x0

    .local v20, i:I
    :goto_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v9=(Conflicted);v11=(Conflicted);v14=(Integer);v16=(Boolean);v20=(Integer);v21=(Conflicted);v23=(Conflicted);v24=(Integer);v25=(Integer);v34=(Integer);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
    move/from16 v0, v20

    #v0=(Integer);
    if-ge v0, v12, :cond_9

    .line 164
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 165
    .local v11, child:Landroid/view/View;
    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getVisibility()I

    move-result v38

    #v38=(Integer);
    const/16 v39, 0x8

    #v39=(PosByte);
    move/from16 v0, v38

    #v0=(Integer);
    move/from16 v1, v39

    #v1=(PosByte);
    if-ne v0, v1, :cond_3

    .line 163
    :cond_2
    :goto_3
    #v0=(Conflicted);v1=(Conflicted);v38=(Conflicted);v39=(Conflicted);
    add-int/lit8 v20, v20, 0x1

    goto :goto_2

    .line 169
    :cond_3
    #v0=(Integer);v1=(PosByte);v38=(Integer);v39=(PosByte);
    instance-of v0, v11, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    #v0=(Boolean);
    move/from16 v21, v0

    .line 170
    .local v21, isGeneratedItem:Z
    #v21=(Boolean);
    add-int/lit8 v34, v34, 0x1

    .line 172
    if-eqz v21, :cond_4

    .line 175
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    #v0=(Integer);
    move/from16 v38, v0

    const/16 v39, 0x0

    #v39=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    const/16 v41, 0x0

    #v41=(Null);
    move/from16 v0, v38

    move/from16 v1, v39

    #v1=(Null);
    move/from16 v2, v40

    #v2=(Integer);
    move/from16 v3, v41

    #v3=(Null);
    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 178
    :cond_4
    #v1=(PosByte);v2=(Conflicted);v3=(Conflicted);v39=(PosByte);v40=(Conflicted);v41=(Conflicted);
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    #v23=(Reference);
    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 179
    .local v23, lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    const/16 v38, 0x0

    #v38=(Null);
    move/from16 v0, v38

    #v0=(Null);
    move-object/from16 v1, v23

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    .line 180
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I

    .line 181
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    .line 182
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z

    .line 183
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    .line 184
    const/16 v38, 0x0

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    .line 185
    if-eqz v21, :cond_7

    move-object/from16 v38, v11

    #v38=(Reference);
    check-cast v38, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    invoke-virtual/range {v38 .. v38}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z

    move-result v38

    #v38=(Boolean);
    if-eqz v38, :cond_7

    const/16 v38, 0x1

    :goto_4
    move/from16 v0, v38

    #v0=(Boolean);
    move-object/from16 v1, v23

    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    .line 188
    move-object/from16 v0, v23

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    #v0=(Boolean);
    move/from16 v38, v0

    if-eqz v38, :cond_8

    const/4 v7, 0x1

    .line 190
    .local v7, cellsAvailable:I
    :goto_5
    #v7=(Integer);
    move/from16 v0, v22

    #v0=(Integer);
    move/from16 v1, v18

    #v1=(Integer);
    invoke-static {v11, v5, v7, v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->measureChildForCells(Landroid/view/View;IIII)I

    move-result v9

    .line 193
    .local v9, cellsUsed:I
    #v9=(Integer);
    move/from16 v0, v24

    invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 194
    move-object/from16 v0, v23

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z

    #v0=(Boolean);
    move/from16 v38, v0

    if-eqz v38, :cond_5

    .line 195
    add-int/lit8 v14, v14, 0x1

    .line 197
    :cond_5
    move-object/from16 v0, v23

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    #v0=(Boolean);
    move/from16 v38, v0

    if-eqz v38, :cond_6

    .line 198
    const/16 v16, 0x1

    .line 201
    :cond_6
    sub-int/2addr v8, v9

    .line 202
    invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I

    move-result v38

    #v38=(Integer);
    move/from16 v0, v25

    #v0=(Integer);
    move/from16 v1, v38

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v25

    .line 203
    const/16 v38, 0x1

    #v38=(One);
    move/from16 v0, v38

    #v0=(One);
    if-ne v9, v0, :cond_2

    .line 204
    const/16 v38, 0x1

    shl-int v38, v38, v20

    #v38=(Integer);
    move/from16 v0, v38

    #v0=(Integer);
    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v38, v0

    #v38=(LongLo);v39=(LongHi);
    or-long v32, v32, v38

    goto/16 :goto_3

    .line 185
    .end local v7           #cellsAvailable:I
    .end local v9           #cellsUsed:I
    :cond_7
    #v0=(Null);v1=(Reference);v7=(Conflicted);v9=(Conflicted);v38=(Boolean);v39=(PosByte);
    const/16 v38, 0x0

    #v38=(Null);
    goto :goto_4

    :cond_8
    #v0=(Boolean);v38=(Boolean);
    move v7, v8

    .line 188
    #v7=(Integer);
    goto :goto_5

    .line 210
    .end local v11           #child:Landroid/view/View;
    .end local v21           #isGeneratedItem:Z
    .end local v23           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_9
    #v0=(Integer);v1=(Conflicted);v7=(Conflicted);v11=(Conflicted);v21=(Conflicted);v23=(Conflicted);v38=(Conflicted);v39=(Conflicted);
    if-eqz v16, :cond_b

    const/16 v38, 0x2

    #v38=(PosByte);
    move/from16 v0, v34

    move/from16 v1, v38

    #v1=(PosByte);
    if-ne v0, v1, :cond_b

    const/4 v10, 0x1

    .line 215
    .local v10, centerSingleExpandedItem:Z
    :goto_6
    #v1=(Conflicted);v10=(Boolean);v38=(Conflicted);
    const/16 v30, 0x0

    .line 216
    .local v30, needsExpansion:Z
    :goto_7
    #v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Boolean);
    if-lez v14, :cond_f

    if-lez v8, :cond_f

    .line 217
    const v26, 0x7fffffff

    .line 218
    .local v26, minCells:I
    #v26=(Integer);
    const-wide/16 v27, 0x0

    .line 219
    .local v27, minCellsAt:J
    #v27=(LongLo);v28=(LongHi);
    const/16 v29, 0x0

    .line 220
    .local v29, minCellsItemCount:I
    #v29=(Null);
    const/16 v20, 0x0

    :goto_8
    #v0=(Conflicted);v29=(Integer);
    move/from16 v0, v20

    #v0=(Integer);
    if-ge v0, v12, :cond_e

    .line 221
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 222
    .restart local v11       #child:Landroid/view/View;
    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    #v23=(Reference);
    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 225
    .restart local v23       #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z

    #v0=(Boolean);
    move/from16 v38, v0

    #v38=(Boolean);
    if-nez v38, :cond_c

    .line 220
    :cond_a
    :goto_9
    #v0=(Conflicted);v1=(Conflicted);v38=(Conflicted);
    add-int/lit8 v20, v20, 0x1

    goto :goto_8

    .line 210
    .end local v10           #centerSingleExpandedItem:Z
    .end local v11           #child:Landroid/view/View;
    .end local v23           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .end local v26           #minCells:I
    .end local v27           #minCellsAt:J
    .end local v29           #minCellsItemCount:I
    .end local v30           #needsExpansion:Z
    :cond_b
    #v0=(Integer);v10=(Uninit);v11=(Conflicted);v23=(Conflicted);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);
    const/4 v10, 0x0

    #v10=(Null);
    goto :goto_6

    .line 230
    .restart local v10       #centerSingleExpandedItem:Z
    .restart local v11       #child:Landroid/view/View;
    .restart local v23       #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .restart local v26       #minCells:I
    .restart local v27       #minCellsAt:J
    .restart local v29       #minCellsItemCount:I
    .restart local v30       #needsExpansion:Z
    :cond_c
    #v0=(Boolean);v1=(Integer);v10=(Boolean);v11=(Reference);v23=(Reference);v26=(Integer);v27=(LongLo);v28=(LongHi);v29=(Integer);v30=(Boolean);v38=(Boolean);
    move-object/from16 v0, v23

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    #v0=(Integer);
    move/from16 v38, v0

    #v38=(Integer);
    move/from16 v0, v38

    move/from16 v1, v26

    if-ge v0, v1, :cond_d

    .line 231
    move-object/from16 v0, v23

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    #v0=(Integer);
    move/from16 v26, v0

    .line 232
    const/16 v38, 0x1

    #v38=(One);
    shl-int v38, v38, v20

    #v38=(Integer);
    move/from16 v0, v38

    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v27, v0

    .line 233
    const/16 v29, 0x1

    #v29=(One);
    goto :goto_9

    .line 234
    :cond_d
    #v0=(Integer);v1=(Integer);v29=(Integer);
    move-object/from16 v0, v23

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    #v0=(Integer);
    move/from16 v38, v0

    move/from16 v0, v38

    move/from16 v1, v26

    if-ne v0, v1, :cond_a

    .line 235
    const/16 v38, 0x1

    #v38=(One);
    shl-int v38, v38, v20

    #v38=(Integer);
    move/from16 v0, v38

    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v38, v0

    #v38=(LongLo);v39=(LongHi);
    or-long v27, v27, v38

    .line 236
    add-int/lit8 v29, v29, 0x1

    goto :goto_9

    .line 241
    .end local v11           #child:Landroid/view/View;
    .end local v23           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_e
    #v0=(Integer);v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v38=(Conflicted);v39=(Conflicted);
    or-long v32, v32, v27

    .line 243
    move/from16 v0, v29

    if-le v0, v8, :cond_14

    .line 276
    .end local v26           #minCells:I
    .end local v27           #minCellsAt:J
    .end local v29           #minCellsItemCount:I
    :cond_f
    #v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);
    if-nez v16, :cond_19

    const/16 v38, 0x1

    #v38=(One);
    move/from16 v0, v34

    move/from16 v1, v38

    #v1=(One);
    if-ne v0, v1, :cond_19

    const/16 v31, 0x1

    .line 277
    .local v31, singleItem:Z
    :goto_a
    #v1=(Conflicted);v31=(Boolean);v38=(Conflicted);
    if-lez v8, :cond_21

    const-wide/16 v38, 0x0

    #v38=(LongLo);v39=(LongHi);
    cmp-long v38, v32, v38

    #v38=(Byte);
    if-eqz v38, :cond_21

    add-int/lit8 v38, v34, -0x1

    #v38=(Integer);
    move/from16 v0, v38

    if-lt v8, v0, :cond_10

    if-nez v31, :cond_10

    const/16 v38, 0x1

    #v38=(One);
    move/from16 v0, v24

    move/from16 v1, v38

    #v1=(One);
    if-le v0, v1, :cond_21

    .line 279
    :cond_10
    #v1=(Conflicted);v38=(Integer);
    invoke-static/range {v32 .. v33}, Ljava/lang/Long;->bitCount(J)I

    move-result v38

    move/from16 v0, v38

    int-to-float v13, v0

    .line 281
    .local v13, expandCount:F
    #v13=(Float);
    if-nez v31, :cond_12

    .line 283
    const-wide/16 v38, 0x1

    #v38=(LongLo);
    and-long v38, v38, v32

    const-wide/16 v40, 0x0

    #v40=(LongLo);v41=(LongHi);
    cmp-long v38, v38, v40

    #v38=(Byte);
    if-eqz v38, :cond_11

    .line 284
    const/16 v38, 0x0

    #v38=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v38

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v38

    #v38=(Reference);
    invoke-virtual/range {v38 .. v38}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    #v23=(Reference);
    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 285
    .restart local v23       #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    #v0=(Boolean);
    move/from16 v38, v0

    #v38=(Boolean);
    if-nez v38, :cond_11

    .line 286
    const/high16 v38, 0x3f00

    #v38=(Integer);
    sub-float v13, v13, v38

    .line 289
    .end local v23           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_11
    #v0=(Integer);v1=(Conflicted);v23=(Conflicted);
    const/16 v38, 0x1

    #v38=(One);
    add-int/lit8 v39, v12, -0x1

    #v39=(Integer);
    shl-int v38, v38, v39

    #v38=(Integer);
    move/from16 v0, v38

    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v38, v0

    #v38=(LongLo);v39=(LongHi);
    and-long v38, v38, v32

    const-wide/16 v40, 0x0

    cmp-long v38, v38, v40

    #v38=(Byte);
    if-eqz v38, :cond_12

    .line 290
    add-int/lit8 v38, v12, -0x1

    #v38=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v38

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v38

    #v38=(Reference);
    invoke-virtual/range {v38 .. v38}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    #v23=(Reference);
    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 291
    .restart local v23       #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    #v0=(Boolean);
    move/from16 v38, v0

    #v38=(Boolean);
    if-nez v38, :cond_12

    .line 292
    const/high16 v38, 0x3f00

    #v38=(Integer);
    sub-float v13, v13, v38

    .line 297
    .end local v23           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_12
    #v0=(Conflicted);v1=(Conflicted);v23=(Conflicted);v40=(Conflicted);v41=(Conflicted);
    const/16 v38, 0x0

    #v38=(Null);
    cmpl-float v38, v13, v38

    #v38=(Byte);
    if-lez v38, :cond_1a

    mul-int v38, v8, v5

    #v38=(Integer);
    move/from16 v0, v38

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    move/from16 v38, v0

    #v38=(Float);
    div-float v38, v38, v13

    move/from16 v0, v38

    float-to-int v15, v0

    .line 300
    .local v15, extraPixels:I
    :goto_b
    #v0=(Conflicted);v15=(Integer);
    const/16 v20, 0x0

    :goto_c
    #v38=(Integer);
    move/from16 v0, v20

    #v0=(Integer);
    if-ge v0, v12, :cond_20

    .line 301
    const/16 v38, 0x1

    #v38=(One);
    shl-int v38, v38, v20

    #v38=(Integer);
    move/from16 v0, v38

    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v38, v0

    #v38=(LongLo);
    and-long v38, v38, v32

    const-wide/16 v40, 0x0

    #v40=(LongLo);v41=(LongHi);
    cmp-long v38, v38, v40

    #v38=(Byte);
    if-nez v38, :cond_1b

    .line 300
    :cond_13
    :goto_d
    #v0=(Conflicted);v1=(Conflicted);v38=(Integer);
    add-int/lit8 v20, v20, 0x1

    goto :goto_c

    .line 248
    .end local v13           #expandCount:F
    .end local v15           #extraPixels:I
    .end local v31           #singleItem:Z
    .restart local v26       #minCells:I
    .restart local v27       #minCellsAt:J
    .restart local v29       #minCellsItemCount:I
    :cond_14
    #v0=(Integer);v13=(Uninit);v15=(Uninit);v26=(Integer);v27=(LongLo);v28=(LongHi);v29=(Integer);v31=(Uninit);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
    add-int/lit8 v26, v26, 0x1

    .line 250
    const/16 v20, 0x0

    :goto_e
    #v0=(Conflicted);
    move/from16 v0, v20

    #v0=(Integer);
    if-ge v0, v12, :cond_18

    .line 251
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 252
    .restart local v11       #child:Landroid/view/View;
    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    #v23=(Reference);
    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 253
    .restart local v23       #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    const/16 v38, 0x1

    #v38=(One);
    shl-int v38, v38, v20

    #v38=(Integer);
    move/from16 v0, v38

    #v0=(Integer);
    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v38, v0

    #v38=(LongLo);v39=(LongHi);
    and-long v38, v38, v27

    const-wide/16 v40, 0x0

    #v40=(LongLo);v41=(LongHi);
    cmp-long v38, v38, v40

    #v38=(Byte);
    if-nez v38, :cond_16

    .line 255
    move-object/from16 v0, v23

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    #v0=(Integer);
    move/from16 v38, v0

    #v38=(Integer);
    move/from16 v0, v38

    move/from16 v1, v26

    #v1=(Integer);
    if-ne v0, v1, :cond_15

    .line 256
    const/16 v38, 0x1

    #v38=(One);
    shl-int v38, v38, v20

    #v38=(Integer);
    move/from16 v0, v38

    int-to-long v0, v0

    #v0=(LongLo);v1=(LongHi);
    move-wide/from16 v38, v0

    #v38=(LongLo);
    or-long v32, v32, v38

    .line 250
    :cond_15
    :goto_f
    #v0=(Conflicted);v1=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
    add-int/lit8 v20, v20, 0x1

    goto :goto_e

    .line 261
    :cond_16
    #v0=(LongLo);v1=(LongHi);v38=(Byte);v39=(LongHi);v40=(LongLo);v41=(LongHi);
    if-eqz v10, :cond_17

    move-object/from16 v0, v23

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    #v0=(Boolean);
    move/from16 v38, v0

    #v38=(Boolean);
    if-eqz v38, :cond_17

    const/16 v38, 0x1

    #v38=(One);
    move/from16 v0, v38

    #v0=(One);
    if-ne v8, v0, :cond_17

    .line 263
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    #v0=(Integer);
    move/from16 v38, v0

    #v38=(Integer);
    add-int v38, v38, v5

    const/16 v39, 0x0

    #v39=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    const/16 v41, 0x0

    #v41=(Null);
    move/from16 v0, v38

    move/from16 v1, v39

    #v1=(Null);
    move/from16 v2, v40

    #v2=(Integer);
    move/from16 v3, v41

    #v3=(Null);
    invoke-virtual {v11, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V

    .line 265
    :cond_17
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
    move-object/from16 v0, v23

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    #v0=(Integer);
    move/from16 v38, v0

    add-int/lit8 v38, v38, 0x1

    move/from16 v0, v38

    move-object/from16 v1, v23

    #v1=(Reference);
    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    .line 266
    const/16 v38, 0x1

    #v38=(One);
    move/from16 v0, v38

    #v0=(One);
    move-object/from16 v1, v23

    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    .line 267
    add-int/lit8 v8, v8, -0x1

    goto :goto_f

    .line 270
    .end local v11           #child:Landroid/view/View;
    .end local v23           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_18
    #v0=(Integer);v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v38=(Conflicted);
    const/16 v30, 0x1

    .line 271
    #v30=(One);
    goto/16 :goto_7

    .line 276
    .end local v26           #minCells:I
    .end local v27           #minCellsAt:J
    .end local v29           #minCellsItemCount:I
    :cond_19
    #v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Boolean);
    const/16 v31, 0x0

    #v31=(Null);
    goto/16 :goto_a

    .line 297
    .restart local v13       #expandCount:F
    .restart local v31       #singleItem:Z
    :cond_1a
    #v0=(Conflicted);v13=(Float);v31=(Boolean);v38=(Byte);v39=(LongHi);
    const/4 v15, 0x0

    #v15=(Null);
    goto/16 :goto_b

    .line 305
    .restart local v15       #extraPixels:I
    :cond_1b
    #v0=(LongLo);v1=(LongHi);v15=(Integer);v40=(LongLo);v41=(LongHi);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 306
    .restart local v11       #child:Landroid/view/View;
    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    #v23=(Reference);
    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 307
    .restart local v23       #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    instance-of v0, v11, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    #v0=(Boolean);
    move/from16 v38, v0

    #v38=(Boolean);
    if-eqz v38, :cond_1d

    .line 309
    move-object/from16 v0, v23

    #v0=(Reference);
    iput v15, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I

    .line 310
    const/16 v38, 0x1

    #v38=(One);
    move/from16 v0, v38

    #v0=(One);
    move-object/from16 v1, v23

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    .line 311
    if-nez v20, :cond_1c

    move-object/from16 v0, v23

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z

    #v0=(Boolean);
    move/from16 v38, v0

    #v38=(Boolean);
    if-nez v38, :cond_1c

    .line 314
    neg-int v0, v15

    #v0=(Integer);
    move/from16 v38, v0

    #v38=(Integer);
    div-int/lit8 v38, v38, 0x2

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    .line 316
    :cond_1c
    const/16 v30, 0x1

    #v30=(One);
    goto/16 :goto_d

    .line 317
    :cond_1d
    #v0=(Boolean);v1=(Integer);v30=(Boolean);v38=(Boolean);
    move-object/from16 v0, v23

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    #v0=(Boolean);
    move/from16 v38, v0

    if-eqz v38, :cond_1e

    .line 318
    move-object/from16 v0, v23

    #v0=(Reference);
    iput v15, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I

    .line 319
    const/16 v38, 0x1

    #v38=(One);
    move/from16 v0, v38

    #v0=(One);
    move-object/from16 v1, v23

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    .line 320
    neg-int v0, v15

    #v0=(Integer);
    move/from16 v38, v0

    #v38=(Integer);
    div-int/lit8 v38, v38, 0x2

    move/from16 v0, v38

    move-object/from16 v1, v23

    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    .line 321
    const/16 v30, 0x1

    #v30=(One);
    goto/16 :goto_d

    .line 326
    :cond_1e
    #v0=(Boolean);v1=(Integer);v30=(Boolean);v38=(Boolean);
    if-eqz v20, :cond_1f

    .line 327
    div-int/lit8 v38, v15, 0x2

    #v38=(Integer);
    move/from16 v0, v38

    #v0=(Integer);
    move-object/from16 v1, v23

    #v1=(Reference);
    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    .line 329
    :cond_1f
    #v1=(Conflicted);
    add-int/lit8 v38, v12, -0x1

    move/from16 v0, v20

    move/from16 v1, v38

    #v1=(Integer);
    if-eq v0, v1, :cond_13

    .line 330
    div-int/lit8 v38, v15, 0x2

    move/from16 v0, v38

    move-object/from16 v1, v23

    #v1=(Reference);
    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    goto/16 :goto_d

    .line 335
    .end local v11           #child:Landroid/view/View;
    .end local v23           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_20
    #v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v40=(Conflicted);v41=(Conflicted);
    const/4 v8, 0x0

    .line 339
    .end local v13           #expandCount:F
    .end local v15           #extraPixels:I
    :cond_21
    #v13=(Conflicted);v15=(Conflicted);v38=(Conflicted);v39=(Conflicted);
    if-eqz v30, :cond_23

    .line 340
    const/16 v20, 0x0

    :goto_10
    #v35=(Conflicted);
    move/from16 v0, v20

    if-ge v0, v12, :cond_23

    .line 341
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v11

    .line 342
    .restart local v11       #child:Landroid/view/View;
    #v11=(Reference);
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v23

    #v23=(Reference);
    check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 344
    .restart local v23       #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v23

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z

    #v0=(Boolean);
    move/from16 v38, v0

    #v38=(Boolean);
    if-nez v38, :cond_22

    .line 340
    :goto_11
    #v0=(Integer);v38=(Integer);
    add-int/lit8 v20, v20, 0x1

    goto :goto_10

    .line 348
    :cond_22
    #v0=(Boolean);v38=(Boolean);
    move-object/from16 v0, v23

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I

    #v0=(Integer);
    move/from16 v38, v0

    #v38=(Integer);
    mul-int v38, v38, v5

    move-object/from16 v0, v23

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I

    #v0=(Integer);
    move/from16 v39, v0

    #v39=(Integer);
    add-int v35, v38, v39

    .line 349
    .local v35, width:I
    #v35=(Integer);
    const/high16 v38, 0x4000

    move/from16 v0, v35

    move/from16 v1, v38

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v38

    move/from16 v0, v38

    move/from16 v1, v22

    invoke-virtual {v11, v0, v1}, Landroid/view/View;->measure(II)V

    goto :goto_11

    .line 354
    .end local v11           #child:Landroid/view/View;
    .end local v23           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .end local v35           #width:I
    :cond_23
    #v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v35=(Conflicted);v38=(Conflicted);v39=(Conflicted);
    const/high16 v38, 0x4000

    #v38=(Integer);
    move/from16 v0, v17

    move/from16 v1, v38

    #v1=(Integer);
    if-eq v0, v1, :cond_24

    .line 355
    move/from16 v19, v25

    .line 358
    :cond_24
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v37

    move/from16 v2, v19

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setMeasuredDimension(II)V

    .line 359
    mul-int v38, v8, v5

    move/from16 v0, v38

    #v0=(Integer);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMeasuredExtraWidth:I

    goto/16 :goto_1
.end method


# virtual methods
.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1
    .parameter "p"

    .prologue
    .line 534
    if-eqz p1, :cond_0

    instance-of v0, p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 1
    .parameter "event"

    .prologue
    .line 569
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method protected generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x2

    .line 509
    #v1=(Byte);
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;-><init>(II)V

    .line 511
    .local v0, params:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    #v0=(Reference);
    const/16 v1, 0x10

    #v1=(PosByte);
    iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I

    .line 512
    return-object v0
.end method

.method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected bridge synthetic generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
    .locals 1

    .prologue
    .line 35
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .locals 2
    .parameter "attrs"

    .prologue
    .line 517
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    #v0=(Reference);
    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .locals 2
    .parameter "p"

    .prologue
    .line 522
    instance-of v1, p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 523
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    #v0=(UninitRef);
    check-cast p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .end local p1
    invoke-direct {v0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;)V

    .line 524
    .local v0, result:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    #v0=(Reference);
    iget v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I

    #v1=(Integer);
    if-gtz v1, :cond_0

    .line 525
    const/16 v1, 0x10

    #v1=(PosByte);
    iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I

    .line 529
    .end local v0           #result:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_0
    :goto_0
    #v1=(Integer);
    return-object v0

    .restart local p1
    :cond_1
    #v0=(Uninit);v1=(Boolean);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1
    .parameter "x0"

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1
    .parameter "x0"

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 1
    .parameter "x0"

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;
    .locals 1
    .parameter "x0"

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public generateOverflowButtonLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .locals 2

    .prologue
    .line 538
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v0

    .line 539
    .local v0, result:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    .line 540
    return-object v0
.end method

.method public getWindowAnimations()I
    .locals 1

    .prologue
    .line 548
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method protected hasSupportDividerBeforeChildAt(I)Z
    .locals 4
    .parameter "childIndex"

    .prologue
    .line 556
    add-int/lit8 v3, p1, -0x1

    #v3=(Integer);
    invoke-virtual {p0, v3}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 557
    .local v1, childBefore:Landroid/view/View;
    #v1=(Reference);
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 558
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    const/4 v2, 0x0

    .line 559
    .local v2, result:Z
    #v2=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v3

    if-ge p1, v3, :cond_0

    instance-of v3, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 560
    check-cast v1, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;

    .end local v1           #childBefore:Landroid/view/View;
    invoke-interface {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;->needsDividerAfter()Z

    move-result v3

    or-int/2addr v2, v3

    .line 562
    :cond_0
    #v2=(Boolean);v3=(Integer);
    if-lez p1, :cond_1

    instance-of v3, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;

    #v3=(Boolean);
    if-eqz v3, :cond_1

    .line 563
    check-cast v0, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;

    .end local v0           #child:Landroid/view/View;
    invoke-interface {v0}, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;->needsDividerBefore()Z

    move-result v3

    or-int/2addr v2, v3

    .line 565
    :cond_1
    #v3=(Integer);
    return v2
.end method

.method public initialize(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 0
    .parameter "menu"

    .prologue
    .line 552
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 553
    return-void
.end method

.method public invokeItem(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 2
    .parameter "item"

    .prologue
    .line 544
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, p1, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isExpandedFormat()Z
    .locals 1

    .prologue
    .line 75
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    #v0=(Boolean);
    return v0
.end method

.method public isOverflowReserved()Z
    .locals 1

    .prologue
    .line 500
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mReserveOverflow:Z

    #v0=(Boolean);
    return v0
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .parameter "newConfig"

    .prologue
    .line 80
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x8

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 81
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 84
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->updateMenuView(Z)V

    .line 86
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    if-eqz v0, :cond_1

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 87
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z

    .line 88
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z

    .line 90
    :cond_1
    #v0=(Conflicted);
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 495
    invoke-super {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onDetachedFromWindow()V

    .line 496
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z

    .line 497
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 30
    .parameter "changed"
    .parameter "left"
    .parameter "top"
    .parameter "right"
    .parameter "bottom"

    .prologue
    .line 416
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    #v0=(Boolean);
    move/from16 v28, v0

    #v28=(Boolean);
    if-nez v28, :cond_1

    .line 417
    invoke-super/range {p0 .. p5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onLayout(ZIIII)V

    .line 491
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Integer);v29=(Conflicted);
    return-void

    .line 421
    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Boolean);v29=(Uninit);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v6

    .line 422
    .local v6, childCount:I
    #v6=(Integer);
    add-int v28, p3, p5

    #v28=(Integer);
    div-int/lit8 v14, v28, 0x2

    .line 423
    .local v14, midVertical:I
    #v14=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getSupportDividerWidth()I

    move-result v7

    .line 424
    .local v7, dividerWidth:I
    #v7=(Integer);
    const/16 v17, 0x0

    .line 425
    .local v17, overflowWidth:I
    #v17=(Null);
    const/16 v16, 0x0

    .line 426
    .local v16, nonOverflowWidth:I
    #v16=(Null);
    const/4 v15, 0x0

    .line 427
    .local v15, nonOverflowCount:I
    #v15=(Null);
    sub-int v28, p4, p2

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingRight()I

    move-result v29

    #v29=(Integer);
    sub-int v28, v28, v29

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingLeft()I

    move-result v29

    sub-int v27, v28, v29

    .line 428
    .local v27, widthRemaining:I
    #v27=(Integer);
    const/4 v8, 0x0

    .line 429
    .local v8, hasOverflow:Z
    #v8=(Null);
    const/4 v10, 0x0

    .local v10, i:I
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v8=(Boolean);v9=(Conflicted);v10=(Integer);v11=(Conflicted);v15=(Integer);v16=(Integer);v17=(Integer);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v24=(Conflicted);v25=(Conflicted);
    if-ge v10, v6, :cond_6

    .line 430
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v25

    .line 431
    .local v25, v:Landroid/view/View;
    #v25=(Reference);
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getVisibility()I

    move-result v28

    const/16 v29, 0x8

    #v29=(PosByte);
    move/from16 v0, v28

    #v0=(Integer);
    move/from16 v1, v29

    #v1=(PosByte);
    if-ne v0, v1, :cond_2

    .line 429
    :goto_2
    #v0=(Conflicted);v1=(Integer);v29=(Integer);
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 435
    :cond_2
    #v0=(Integer);v1=(PosByte);v29=(PosByte);
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v18

    #v18=(Reference);
    check-cast v18, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 436
    .local v18, p:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    move-object/from16 v0, v18

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    #v0=(Boolean);
    move/from16 v28, v0

    #v28=(Boolean);
    if-eqz v28, :cond_4

    .line 437
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I

    move-result v17

    .line 438
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->hasSupportDividerBeforeChildAt(I)Z

    move-result v28

    if-eqz v28, :cond_3

    .line 439
    add-int v17, v17, v7

    .line 441
    :cond_3
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    .line 442
    .local v9, height:I
    #v9=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getWidth()I

    move-result v28

    #v28=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingRight()I

    move-result v29

    #v29=(Integer);
    sub-int v28, v28, v29

    move-object/from16 v0, v18

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    #v0=(Integer);
    move/from16 v29, v0

    sub-int v19, v28, v29

    .line 443
    .local v19, r:I
    #v19=(Integer);
    sub-int v11, v19, v17

    .line 444
    .local v11, l:I
    #v11=(Integer);
    div-int/lit8 v28, v9, 0x2

    sub-int v24, v14, v28

    .line 445
    .local v24, t:I
    #v24=(Integer);
    add-int v5, v24, v9

    .line 446
    .local v5, b:I
    #v5=(Integer);
    move-object/from16 v0, v25

    #v0=(Reference);
    move/from16 v1, v24

    #v1=(Integer);
    move/from16 v2, v19

    #v2=(Integer);
    invoke-virtual {v0, v11, v1, v2, v5}, Landroid/view/View;->layout(IIII)V

    .line 448
    sub-int v27, v27, v17

    .line 449
    const/4 v8, 0x1

    .line 450
    #v8=(One);
    goto :goto_2

    .line 451
    .end local v5           #b:I
    .end local v9           #height:I
    .end local v11           #l:I
    .end local v19           #r:I
    .end local v24           #t:I
    :cond_4
    #v0=(Boolean);v1=(PosByte);v2=(Conflicted);v5=(Conflicted);v8=(Boolean);v9=(Conflicted);v11=(Conflicted);v19=(Conflicted);v24=(Conflicted);v28=(Boolean);v29=(PosByte);
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I

    move-result v28

    #v28=(Integer);
    move-object/from16 v0, v18

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    #v0=(Integer);
    move/from16 v29, v0

    #v29=(Integer);
    add-int v28, v28, v29

    move-object/from16 v0, v18

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    #v0=(Integer);
    move/from16 v29, v0

    add-int v20, v28, v29

    .line 452
    .local v20, size:I
    #v20=(Integer);
    add-int v16, v16, v20

    .line 453
    sub-int v27, v27, v20

    .line 454
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->hasSupportDividerBeforeChildAt(I)Z

    move-result v28

    #v28=(Boolean);
    if-eqz v28, :cond_5

    .line 455
    add-int v16, v16, v7

    .line 457
    :cond_5
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    .line 461
    .end local v18           #p:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .end local v20           #size:I
    .end local v25           #v:Landroid/view/View;
    :cond_6
    #v0=(Conflicted);v1=(Conflicted);v18=(Conflicted);v20=(Conflicted);v25=(Conflicted);v28=(Integer);
    const/16 v28, 0x1

    #v28=(One);
    move/from16 v0, v28

    #v0=(One);
    if-ne v6, v0, :cond_7

    if-nez v8, :cond_7

    .line 463
    const/16 v28, 0x0

    #v28=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v28

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v25

    .line 464
    .restart local v25       #v:Landroid/view/View;
    #v25=(Reference);
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I

    move-result v26

    .line 465
    .local v26, width:I
    #v26=(Integer);
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    .line 466
    .restart local v9       #height:I
    #v9=(Integer);
    sub-int v28, p4, p2

    #v28=(Integer);
    div-int/lit8 v13, v28, 0x2

    .line 467
    .local v13, midHorizontal:I
    #v13=(Integer);
    div-int/lit8 v28, v26, 0x2

    sub-int v11, v13, v28

    .line 468
    .restart local v11       #l:I
    #v11=(Integer);
    div-int/lit8 v28, v9, 0x2

    sub-int v24, v14, v28

    .line 469
    .restart local v24       #t:I
    #v24=(Integer);
    add-int v28, v11, v26

    add-int v29, v24, v9

    move-object/from16 v0, v25

    move/from16 v1, v24

    #v1=(Integer);
    move/from16 v2, v28

    #v2=(Integer);
    move/from16 v3, v29

    #v3=(Integer);
    invoke-virtual {v0, v11, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    goto/16 :goto_0

    .line 473
    .end local v9           #height:I
    .end local v11           #l:I
    .end local v13           #midHorizontal:I
    .end local v24           #t:I
    .end local v25           #v:Landroid/view/View;
    .end local v26           #width:I
    :cond_7
    #v0=(One);v1=(Conflicted);v2=(Conflicted);v3=(Uninit);v9=(Conflicted);v11=(Conflicted);v13=(Uninit);v24=(Conflicted);v25=(Conflicted);v26=(Uninit);v28=(One);
    if-eqz v8, :cond_9

    const/16 v28, 0x0

    :goto_3
    #v28=(Boolean);
    sub-int v21, v15, v28

    .line 474
    .local v21, spacerCount:I
    #v21=(Integer);
    const/16 v29, 0x0

    #v29=(Null);
    if-lez v21, :cond_a

    div-int v28, v27, v21

    :goto_4
    #v28=(Integer);
    move/from16 v0, v29

    #v0=(Null);
    move/from16 v1, v28

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v22

    .line 476
    .local v22, spacerSize:I
    #v22=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingLeft()I

    move-result v23

    .line 477
    .local v23, startLeft:I
    #v23=(Integer);
    const/4 v10, 0x0

    :goto_5
    #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v12=(Conflicted);v26=(Conflicted);v29=(Integer);
    if-ge v10, v6, :cond_0

    .line 478
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v25

    .line 479
    .restart local v25       #v:Landroid/view/View;
    #v25=(Reference);
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v12

    #v12=(Reference);
    check-cast v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 480
    .local v12, lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getVisibility()I

    move-result v28

    const/16 v29, 0x8

    #v29=(PosByte);
    move/from16 v0, v28

    #v0=(Integer);
    move/from16 v1, v29

    #v1=(PosByte);
    if-eq v0, v1, :cond_8

    iget-boolean v0, v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    #v0=(Boolean);
    move/from16 v28, v0

    #v28=(Boolean);
    if-eqz v28, :cond_b

    .line 477
    :cond_8
    :goto_6
    #v0=(Integer);v1=(Integer);v28=(Integer);v29=(Integer);
    add-int/lit8 v10, v10, 0x1

    goto :goto_5

    .line 473
    .end local v12           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .end local v21           #spacerCount:I
    .end local v22           #spacerSize:I
    .end local v23           #startLeft:I
    .end local v25           #v:Landroid/view/View;
    :cond_9
    #v0=(One);v1=(Conflicted);v3=(Uninit);v4=(Uninit);v12=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v25=(Conflicted);v26=(Uninit);v28=(One);
    const/16 v28, 0x1

    goto :goto_3

    .line 474
    .restart local v21       #spacerCount:I
    :cond_a
    #v21=(Integer);v28=(Boolean);v29=(Null);
    const/16 v28, 0x0

    #v28=(Null);
    goto :goto_4

    .line 484
    .restart local v12       #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    .restart local v22       #spacerSize:I
    .restart local v23       #startLeft:I
    .restart local v25       #v:Landroid/view/View;
    :cond_b
    #v0=(Boolean);v1=(PosByte);v3=(Conflicted);v4=(Conflicted);v12=(Reference);v22=(Integer);v23=(Integer);v25=(Reference);v26=(Conflicted);v28=(Boolean);v29=(PosByte);
    iget v0, v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    #v0=(Integer);
    move/from16 v28, v0

    #v28=(Integer);
    add-int v23, v23, v28

    .line 485
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I

    move-result v26

    .line 486
    .restart local v26       #width:I
    #v26=(Integer);
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I

    move-result v9

    .line 487
    .restart local v9       #height:I
    #v9=(Integer);
    div-int/lit8 v28, v9, 0x2

    sub-int v24, v14, v28

    .line 488
    .restart local v24       #t:I
    #v24=(Integer);
    add-int v28, v23, v26

    add-int v29, v24, v9

    #v29=(Integer);
    move-object/from16 v0, v25

    #v0=(Reference);
    move/from16 v1, v23

    #v1=(Integer);
    move/from16 v2, v24

    #v2=(Integer);
    move/from16 v3, v28

    #v3=(Integer);
    move/from16 v4, v29

    #v4=(Integer);
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 489
    iget v0, v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    #v0=(Integer);
    move/from16 v28, v0

    add-int v28, v28, v26

    add-int v28, v28, v22

    add-int v23, v23, v28

    goto :goto_6
.end method

.method protected onMeasure(II)V
    .locals 10
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    const/4 v7, 0x1

    #v7=(One);
    const/4 v8, 0x0

    .line 95
    #v8=(Null);
    iget-boolean v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    .line 96
    .local v4, wasFormatted:Z
    #v4=(Boolean);
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v6

    #v6=(Integer);
    const/high16 v9, 0x4000

    #v9=(Integer);
    if-ne v6, v9, :cond_2

    move v6, v7

    :goto_0
    #v6=(Boolean);
    iput-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    .line 98
    iget-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    if-eq v4, v6, :cond_0

    .line 99
    iput v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I

    .line 104
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    .line 105
    .local v5, widthSize:I
    #v5=(Integer);
    iget-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    if-eqz v6, :cond_1

    iget-object v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v6=(Reference);
    if-eqz v6, :cond_1

    iget v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I

    #v6=(Integer);
    if-eq v5, v6, :cond_1

    .line 106
    iput v5, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I

    .line 107
    iget-object v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v6=(Reference);
    invoke-virtual {v6, v7}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 110
    :cond_1
    #v6=(Conflicted);
    iget-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z

    #v6=(Boolean);
    if-eqz v6, :cond_3

    .line 111
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->onMeasureExactFormat(II)V

    .line 122
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .end local v5           #widthSize:I
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Integer);
    move v6, v8

    .line 96
    #v6=(Null);
    goto :goto_0

    .line 114
    .restart local v5       #widthSize:I
    :cond_3
    #v5=(Integer);v6=(Boolean);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v1

    .line 115
    .local v1, childCount:I
    #v1=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_2
    #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
    if-ge v2, v1, :cond_4

    .line 116
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 117
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    .line 118
    .local v3, lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    iput v8, v3, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I

    iput v8, v3, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I

    .line 115
    add-int/lit8 v2, v2, 0x1

    goto :goto_2

    .line 120
    .end local v0           #child:Landroid/view/View;
    .end local v3           #lp:Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
    :cond_4
    #v0=(Conflicted);v3=(Conflicted);
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onMeasure(II)V

    goto :goto_1
.end method

.method public setOverflowReserved(Z)V
    .locals 0
    .parameter "reserveOverflow"

    .prologue
    .line 504
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mReserveOverflow:Z

    .line 505
    return-void
.end method

.method public setPresenter(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;)V
    .locals 0
    .parameter "presenter"

    .prologue
    .line 71
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    .line 72
    return-void
.end method

*/}
