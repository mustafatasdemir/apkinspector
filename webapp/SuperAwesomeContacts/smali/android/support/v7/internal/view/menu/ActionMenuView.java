package android.support.v7.internal.view.menu; class ActionMenuView { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// .super Landroid/support/v7/internal/widget/LinearLayoutICS;
a=0;// .source "ActionMenuView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;,
a=0;//         Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final GENERATED_ITEM_PADDING:I = 0x4
a=0;// 
a=0;// .field static final MIN_CELL_SIZE:I = 0x38
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ActionMenuView"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mFormatItems:Z
a=0;// 
a=0;// .field private mFormatItemsWidth:I
a=0;// 
a=0;// .field private mGeneratedItemPadding:I
a=0;// 
a=0;// .field private mMaxItemHeight:I
a=0;// 
a=0;// .field private mMeasuredExtraWidth:I
a=0;// 
a=0;// .field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mMinCellSize:I
a=0;// 
a=0;// .field private mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// .field private mReserveOverflow:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/view/menu/ActionMenuView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 58
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/LinearLayoutICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 59
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBaselineAligned(Z)V
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v1, v2, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 61
a=0;//     .local v1, "density":F
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, 0x42600000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v2, v1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I
a=0;// 
a=0;//     .line 62
a=0;//     const/high16 v2, 0x40800000
a=0;// 
a=0;//     mul-float/2addr v2, v1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     .line 64
a=0;//     sget-object v2, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, p2, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v4, v4}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMaxItemHeight:I
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static measureChildForCells(Landroid/view/View;IIII)I
a=0;//     .locals 13
a=0;//     .param p0, "child"    # Landroid/view/View;
a=0;//     .param p1, "cellSize"    # I
a=0;//     .param p2, "cellsRemaining"    # I
a=0;//     .param p3, "parentHeightMeasureSpec"    # I
a=0;//     .param p4, "parentHeightPadding"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 379
a=0;//     .local v8, "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     sub-int v2, v11, p4
a=0;// 
a=0;//     .line 381
a=0;//     .local v2, "childHeightSize":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static/range {p3 .. p3}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 382
a=0;//     .local v1, "childHeightMode":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v2, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 384
a=0;//     .local v3, "childHeightSpec":I
a=0;//     #v3=(Integer);
a=0;//     instance-of v11, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_3
a=0;// 
a=0;//     move-object v11, p0
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     check-cast v11, Landroid/support/v7/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     move-object v7, v11
a=0;// 
a=0;//     .line 386
a=0;//     .local v7, "itemView":Landroid/support/v7/internal/view/menu/ActionMenuItemView;
a=0;//     :goto_0
a=0;//     #v7=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItemView;);v11=(Conflicted);
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_4
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 388
a=0;//     .local v6, "hasText":Z
a=0;//     :goto_1
a=0;//     #v6=(Boolean);v11=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 389
a=0;//     .local v0, "cellsUsed":I
a=0;//     #v0=(Null);
a=0;//     if-lez p2, :cond_2
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     if-lt p2, v11, :cond_2
a=0;// 
a=0;//     .line 390
a=0;//     :cond_0
a=0;//     #v11=(Conflicted);
a=0;//     mul-int v11, p1, p2
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/high16 v12, -0x80000000
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-static {v11, v12}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 392
a=0;//     .local v4, "childWidthSpec":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4, v3}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 394
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 395
a=0;//     .local v9, "measuredWidth":I
a=0;//     #v9=(Integer);
a=0;//     div-int v0, v9, p1
a=0;// 
a=0;//     .line 396
a=0;//     #v0=(Integer);
a=0;//     rem-int v11, v9, p1
a=0;// 
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     .line 397
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 399
a=0;//     :cond_1
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     if-ge v0, v11, :cond_2
a=0;// 
a=0;//     .line 400
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     .line 404
a=0;//     .end local v4    # "childWidthSpec":I
a=0;//     .end local v9    # "measuredWidth":I
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget-boolean v11, v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-nez v11, :cond_5
a=0;// 
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 405
a=0;//     .local v5, "expandable":Z
a=0;//     :goto_2
a=0;//     #v5=(Boolean);
a=0;//     iput-boolean v5, v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z
a=0;// 
a=0;//     .line 407
a=0;//     iput v0, v8, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     .line 408
a=0;//     mul-int v10, v0, p1
a=0;// 
a=0;//     .line 409
a=0;//     .local v10, "targetWidth":I
a=0;//     #v10=(Integer);
a=0;//     const/high16 v11, 0x40000000
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     invoke-virtual {p0, v11, v3}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 411
a=0;//     return v0
a=0;// 
a=0;//     .line 384
a=0;//     .end local v0    # "cellsUsed":I
a=0;//     .end local v5    # "expandable":Z
a=0;//     .end local v6    # "hasText":Z
a=0;//     .end local v7    # "itemView":Landroid/support/v7/internal/view/menu/ActionMenuItemView;
a=0;//     .end local v10    # "targetWidth":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Boolean);v12=(Uninit);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 386
a=0;//     .restart local v7    # "itemView":Landroid/support/v7/internal/view/menu/ActionMenuItemView;
a=0;//     :cond_4
a=0;//     #v7=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItemView;);v11=(Conflicted);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 404
a=0;//     .restart local v0    # "cellsUsed":I
a=0;//     .restart local v6    # "hasText":Z
a=0;//     :cond_5
a=0;//     #v0=(Integer);v4=(Conflicted);v6=(Boolean);v9=(Conflicted);v11=(Boolean);v12=(Conflicted);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private onMeasureExactFormat(II)V
a=0;//     .locals 42
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 127
a=0;//     .local v17, "heightMode":I
a=0;//     #v17=(Integer);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     .line 128
a=0;//     .local v37, "widthSize":I
a=0;//     #v37=(Integer);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 130
a=0;//     .local v19, "heightSize":I
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v39
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     add-int v36, v38, v39
a=0;// 
a=0;//     .line 131
a=0;//     .local v36, "widthPadding":I
a=0;//     #v36=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v39
a=0;// 
a=0;//     add-int v18, v38, v39
a=0;// 
a=0;//     .line 133
a=0;//     .local v18, "heightPadding":I
a=0;//     #v18=(Integer);
a=0;//     const/high16 v38, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     sub-int v38, v19, v18
a=0;// 
a=0;//     const/high16 v39, 0x40000000
a=0;// 
a=0;//     invoke-static/range {v38 .. v39}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 138
a=0;//     .local v22, "itemHeightSpec":I
a=0;//     :goto_0
a=0;//     #v22=(Integer);
a=0;//     sub-int v37, v37, v36
a=0;// 
a=0;//     .line 141
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     div-int v4, v37, v38
a=0;// 
a=0;//     .line 142
a=0;//     .local v4, "cellCount":I
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     rem-int v6, v37, v38
a=0;// 
a=0;//     .line 144
a=0;//     .local v6, "cellSizeRemaining":I
a=0;//     #v6=(Integer);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 146
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     move/from16 v2, v38
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 360
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);v21=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v38=(Integer);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 133
a=0;//     .end local v4    # "cellCount":I
a=0;//     .end local v6    # "cellSizeRemaining":I
a=0;//     .end local v22    # "itemHeightSpec":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v39=(Integer);v40=(Uninit);v41=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMaxItemHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     sub-int v39, v19, v18
a=0;// 
a=0;//     invoke-static/range {v38 .. v39}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     const/high16 v39, -0x80000000
a=0;// 
a=0;//     invoke-static/range {v38 .. v39}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 150
a=0;//     .restart local v4    # "cellCount":I
a=0;//     .restart local v6    # "cellSizeRemaining":I
a=0;//     .restart local v22    # "itemHeightSpec":I
a=0;//     :cond_1
a=0;//     #v4=(Integer);v6=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMinCellSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     div-int v39, v6, v4
a=0;// 
a=0;//     add-int v5, v38, v39
a=0;// 
a=0;//     .line 152
a=0;//     .local v5, "cellSize":I
a=0;//     #v5=(Integer);
a=0;//     move v8, v4
a=0;// 
a=0;//     .line 153
a=0;//     .local v8, "cellsRemaining":I
a=0;//     #v8=(Integer);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     .line 154
a=0;//     .local v25, "maxChildHeight":I
a=0;//     #v25=(Null);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     .line 155
a=0;//     .local v24, "maxCellsUsed":I
a=0;//     #v24=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 156
a=0;//     .local v14, "expandableItemCount":I
a=0;//     #v14=(Null);
a=0;//     const/16 v34, 0x0
a=0;// 
a=0;//     .line 157
a=0;//     .local v34, "visibleItemCount":I
a=0;//     #v34=(Null);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 160
a=0;//     .local v16, "hasOverflow":Z
a=0;//     #v16=(Null);
a=0;//     const-wide/16 v32, 0x0
a=0;// 
a=0;//     .line 162
a=0;//     .local v32, "smallestItemsAt":J
a=0;//     #v32=(LongLo);v33=(LongHi);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 163
a=0;//     .local v12, "childCount":I
a=0;//     #v12=(Integer);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     .local v20, "i":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v9=(Conflicted);v11=(Conflicted);v14=(Integer);v16=(Boolean);v20=(Integer);v21=(Conflicted);v23=(Conflicted);v24=(Integer);v25=(Integer);v34=(Integer);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v12, :cond_9
a=0;// 
a=0;//     .line 164
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 165
a=0;//     .local v11, "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     const/16 v39, 0x8
a=0;// 
a=0;//     #v39=(PosByte);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 163
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v38=(Conflicted);v39=(Conflicted);
a=0;//     add-int/lit8 v20, v20, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 169
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(PosByte);v38=(Integer);v39=(PosByte);
a=0;//     instance-of v0, v11, Landroid/support/v7/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     .line 170
a=0;//     .local v21, "isGeneratedItem":Z
a=0;//     #v21=(Boolean);
a=0;//     add-int/lit8 v34, v34, 0x1
a=0;// 
a=0;//     .line 172
a=0;//     if-eqz v21, :cond_4
a=0;// 
a=0;//     .line 175
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     const/16 v39, 0x0
a=0;// 
a=0;//     #v39=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v40
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v41
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v11, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V
a=0;// 
a=0;//     .line 178
a=0;//     :cond_4
a=0;//     #v1=(PosByte);v2=(Conflicted);v3=(Conflicted);v39=(PosByte);v40=(Conflicted);v41=(Conflicted);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 179
a=0;//     .local v23, "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     .line 180
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I
a=0;// 
a=0;//     .line 181
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     .line 182
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z
a=0;// 
a=0;//     .line 183
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 184
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 185
a=0;//     if-eqz v21, :cond_7
a=0;// 
a=0;//     move-object/from16 v38, v11
a=0;// 
a=0;//     #v38=(Reference,Landroid/view/View;);
a=0;//     check-cast v38, Landroid/support/v7/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     invoke-virtual/range {v38 .. v38}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-eqz v38, :cond_7
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     :goto_4
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     .line 188
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     if-eqz v38, :cond_8
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 190
a=0;//     .local v7, "cellsAvailable":I
a=0;//     :goto_5
a=0;//     #v7=(Integer);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v11, v5, v7, v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->measureChildForCells(Landroid/view/View;IIII)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 193
a=0;//     .local v9, "cellsUsed":I
a=0;//     #v9=(Integer);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     invoke-static {v0, v9}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     .line 194
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     if-eqz v38, :cond_5
a=0;// 
a=0;//     .line 195
a=0;//     add-int/lit8 v14, v14, 0x1
a=0;// 
a=0;//     .line 197
a=0;//     :cond_5
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     if-eqz v38, :cond_6
a=0;// 
a=0;//     .line 198
a=0;//     const/16 v16, 0x1
a=0;// 
a=0;//     .line 201
a=0;//     :cond_6
a=0;//     sub-int/2addr v8, v9
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     .line 203
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v9, v0, :cond_2
a=0;// 
a=0;//     .line 204
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     shl-int v38, v38, v20
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     or-long v32, v32, v38
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 185
a=0;//     .end local v7    # "cellsAvailable":I
a=0;//     .end local v9    # "cellsUsed":I
a=0;//     :cond_7
a=0;//     #v0=(Null);v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);v7=(Conflicted);v9=(Conflicted);v38=(Boolean);v39=(PosByte);
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v38=(Boolean);
a=0;//     move v7, v8
a=0;// 
a=0;//     .line 188
a=0;//     #v7=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 210
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v21    # "isGeneratedItem":Z
a=0;//     .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Conflicted);v7=(Conflicted);v11=(Conflicted);v21=(Conflicted);v23=(Conflicted);v38=(Conflicted);v39=(Conflicted);
a=0;//     if-eqz v16, :cond_b
a=0;// 
a=0;//     const/16 v38, 0x2
a=0;// 
a=0;//     #v38=(PosByte);
a=0;//     move/from16 v0, v34
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 215
a=0;//     .local v10, "centerSingleExpandedItem":Z
a=0;//     :goto_6
a=0;//     #v1=(Conflicted);v10=(Boolean);v38=(Conflicted);
a=0;//     const/16 v30, 0x0
a=0;// 
a=0;//     .line 216
a=0;//     .local v30, "needsExpansion":Z
a=0;//     :goto_7
a=0;//     #v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Boolean);
a=0;//     if-lez v14, :cond_f
a=0;// 
a=0;//     if-lez v8, :cond_f
a=0;// 
a=0;//     .line 217
a=0;//     const v26, 0x7fffffff
a=0;// 
a=0;//     .line 218
a=0;//     .local v26, "minCells":I
a=0;//     #v26=(Integer);
a=0;//     const-wide/16 v27, 0x0
a=0;// 
a=0;//     .line 219
a=0;//     .local v27, "minCellsAt":J
a=0;//     #v27=(LongLo);v28=(LongHi);
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     .line 220
a=0;//     .local v29, "minCellsItemCount":I
a=0;//     #v29=(Null);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     :goto_8
a=0;//     #v0=(Conflicted);v29=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v12, :cond_e
a=0;// 
a=0;//     .line 221
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 222
a=0;//     .restart local v11    # "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 225
a=0;//     .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expandable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_c
a=0;// 
a=0;//     .line 220
a=0;//     :cond_a
a=0;//     :goto_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v38=(Conflicted);
a=0;//     add-int/lit8 v20, v20, 0x1
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 210
a=0;//     .end local v10    # "centerSingleExpandedItem":Z
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .end local v26    # "minCells":I
a=0;//     .end local v27    # "minCellsAt":J
a=0;//     .end local v29    # "minCellsItemCount":I
a=0;//     .end local v30    # "needsExpansion":Z
a=0;//     :cond_b
a=0;//     #v0=(Integer);v10=(Uninit);v11=(Conflicted);v23=(Conflicted);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 230
a=0;//     .restart local v10    # "centerSingleExpandedItem":Z
a=0;//     .restart local v11    # "child":Landroid/view/View;
a=0;//     .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .restart local v26    # "minCells":I
a=0;//     .restart local v27    # "minCellsAt":J
a=0;//     .restart local v29    # "minCellsItemCount":I
a=0;//     .restart local v30    # "needsExpansion":Z
a=0;//     :cond_c
a=0;//     #v0=(Boolean);v1=(Integer);v10=(Boolean);v11=(Reference,Landroid/view/View;);v23=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);v26=(Integer);v27=(LongLo);v28=(LongHi);v29=(Integer);v30=(Boolean);v38=(Boolean);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     if-ge v0, v1, :cond_d
a=0;// 
a=0;//     .line 231
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     .line 232
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v20
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v27, v0
a=0;// 
a=0;//     .line 233
a=0;//     const/16 v29, 0x1
a=0;// 
a=0;//     #v29=(One);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 234
a=0;//     :cond_d
a=0;//     #v0=(Integer);v1=(Integer);v29=(Integer);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     if-ne v0, v1, :cond_a
a=0;// 
a=0;//     .line 235
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v20
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     or-long v27, v27, v38
a=0;// 
a=0;//     .line 236
a=0;//     add-int/lit8 v29, v29, 0x1
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 241
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_e
a=0;//     #v0=(Integer);v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v38=(Conflicted);v39=(Conflicted);
a=0;//     or-long v32, v32, v27
a=0;// 
a=0;//     .line 243
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     if-le v0, v8, :cond_14
a=0;// 
a=0;//     .line 276
a=0;//     .end local v26    # "minCells":I
a=0;//     .end local v27    # "minCellsAt":J
a=0;//     .end local v29    # "minCellsItemCount":I
a=0;//     :cond_f
a=0;//     #v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);
a=0;//     if-nez v16, :cond_19
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v34
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_19
a=0;// 
a=0;//     const/16 v31, 0x1
a=0;// 
a=0;//     .line 277
a=0;//     .local v31, "singleItem":Z
a=0;//     :goto_a
a=0;//     #v1=(Conflicted);v31=(Boolean);v38=(Conflicted);
a=0;//     if-lez v8, :cond_21
a=0;// 
a=0;//     const-wide/16 v38, 0x0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     cmp-long v38, v32, v38
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-eqz v38, :cond_21
a=0;// 
a=0;//     add-int/lit8 v38, v34, -0x1
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     if-lt v8, v0, :cond_10
a=0;// 
a=0;//     if-nez v31, :cond_10
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-le v0, v1, :cond_21
a=0;// 
a=0;//     .line 279
a=0;//     :cond_10
a=0;//     #v1=(Conflicted);v38=(Integer);
a=0;//     invoke-static/range {v32 .. v33}, Ljava/lang/Long;->bitCount(J)I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-float v13, v0
a=0;// 
a=0;//     .line 281
a=0;//     .local v13, "expandCount":F
a=0;//     #v13=(Float);
a=0;//     if-nez v31, :cond_12
a=0;// 
a=0;//     .line 283
a=0;//     const-wide/16 v38, 0x1
a=0;// 
a=0;//     #v38=(LongLo);
a=0;//     and-long v38, v38, v32
a=0;// 
a=0;//     const-wide/16 v40, 0x0
a=0;// 
a=0;//     #v40=(LongLo);v41=(LongHi);
a=0;//     cmp-long v38, v38, v40
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-eqz v38, :cond_11
a=0;// 
a=0;//     .line 284
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v38
a=0;// 
a=0;//     #v38=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v38 .. v38}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 285
a=0;//     .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_11
a=0;// 
a=0;//     .line 286
a=0;//     const/high16 v38, 0x3f000000
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     sub-float v13, v13, v38
a=0;// 
a=0;//     .line 289
a=0;//     .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_11
a=0;//     #v0=(Integer);v1=(Conflicted);v23=(Conflicted);
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     add-int/lit8 v39, v12, -0x1
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     shl-int v38, v38, v39
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     and-long v38, v38, v32
a=0;// 
a=0;//     const-wide/16 v40, 0x0
a=0;// 
a=0;//     cmp-long v38, v38, v40
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-eqz v38, :cond_12
a=0;// 
a=0;//     .line 290
a=0;//     add-int/lit8 v38, v12, -0x1
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v38
a=0;// 
a=0;//     #v38=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v38 .. v38}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 291
a=0;//     .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_12
a=0;// 
a=0;//     .line 292
a=0;//     const/high16 v38, 0x3f000000
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     sub-float v13, v13, v38
a=0;// 
a=0;//     .line 297
a=0;//     .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v1=(Conflicted);v23=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     #v38=(Null);
a=0;//     cmpl-float v38, v13, v38
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-lez v38, :cond_1a
a=0;// 
a=0;//     mul-int v38, v8, v5
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Float);
a=0;//     div-float v38, v38, v13
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     float-to-int v15, v0
a=0;// 
a=0;//     .line 300
a=0;//     .local v15, "extraPixels":I
a=0;//     :goto_b
a=0;//     #v0=(Conflicted);v15=(Integer);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     :goto_c
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v12, :cond_20
a=0;// 
a=0;//     .line 301
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v20
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);
a=0;//     and-long v38, v38, v32
a=0;// 
a=0;//     const-wide/16 v40, 0x0
a=0;// 
a=0;//     #v40=(LongLo);v41=(LongHi);
a=0;//     cmp-long v38, v38, v40
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-nez v38, :cond_1b
a=0;// 
a=0;//     .line 300
a=0;//     :cond_13
a=0;//     :goto_d
a=0;//     #v0=(Conflicted);v1=(Conflicted);v38=(Integer);
a=0;//     add-int/lit8 v20, v20, 0x1
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 248
a=0;//     .end local v13    # "expandCount":F
a=0;//     .end local v15    # "extraPixels":I
a=0;//     .end local v31    # "singleItem":Z
a=0;//     .restart local v26    # "minCells":I
a=0;//     .restart local v27    # "minCellsAt":J
a=0;//     .restart local v29    # "minCellsItemCount":I
a=0;//     :cond_14
a=0;//     #v0=(Integer);v13=(Uninit);v15=(Uninit);v26=(Integer);v27=(LongLo);v28=(LongHi);v29=(Integer);v31=(Uninit);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     add-int/lit8 v26, v26, 0x1
a=0;// 
a=0;//     .line 250
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     :goto_e
a=0;//     #v0=(Conflicted);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v12, :cond_18
a=0;// 
a=0;//     .line 251
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 252
a=0;//     .restart local v11    # "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 253
a=0;//     .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v20
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);v39=(LongHi);
a=0;//     and-long v38, v38, v27
a=0;// 
a=0;//     const-wide/16 v40, 0x0
a=0;// 
a=0;//     #v40=(LongLo);v41=(LongHi);
a=0;//     cmp-long v38, v38, v40
a=0;// 
a=0;//     #v38=(Byte);
a=0;//     if-nez v38, :cond_16
a=0;// 
a=0;//     .line 255
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_15
a=0;// 
a=0;//     .line 256
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     shl-int v38, v38, v20
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     int-to-long v0, v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide/from16 v38, v0
a=0;// 
a=0;//     #v38=(LongLo);
a=0;//     or-long v32, v32, v38
a=0;// 
a=0;//     .line 250
a=0;//     :cond_15
a=0;//     :goto_f
a=0;//     #v0=(Conflicted);v1=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     add-int/lit8 v20, v20, 0x1
a=0;// 
a=0;//     goto :goto_e
a=0;// 
a=0;//     .line 261
a=0;//     :cond_16
a=0;//     #v0=(LongLo);v1=(LongHi);v38=(Byte);v39=(LongHi);v40=(LongLo);v41=(LongHi);
a=0;//     if-eqz v10, :cond_17
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-eqz v38, :cond_17
a=0;// 
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v8, v0, :cond_17
a=0;// 
a=0;//     .line 263
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     add-int v38, v38, v5
a=0;// 
a=0;//     const/16 v39, 0x0
a=0;// 
a=0;//     #v39=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mGeneratedItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v39
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v40
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v41
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v11, v0, v1, v2, v3}, Landroid/view/View;->setPadding(IIII)V
a=0;// 
a=0;//     .line 265
a=0;//     :cond_17
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     add-int/lit8 v38, v38, 0x1
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     .line 266
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     .line 267
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     goto :goto_f
a=0;// 
a=0;//     .line 270
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_18
a=0;//     #v0=(Integer);v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v38=(Conflicted);
a=0;//     const/16 v30, 0x1
a=0;// 
a=0;//     .line 271
a=0;//     #v30=(One);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 276
a=0;//     .end local v26    # "minCells":I
a=0;//     .end local v27    # "minCellsAt":J
a=0;//     .end local v29    # "minCellsItemCount":I
a=0;//     :cond_19
a=0;//     #v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Boolean);
a=0;//     const/16 v31, 0x0
a=0;// 
a=0;//     #v31=(Null);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .line 297
a=0;//     .restart local v13    # "expandCount":F
a=0;//     .restart local v31    # "singleItem":Z
a=0;//     :cond_1a
a=0;//     #v0=(Conflicted);v13=(Float);v31=(Boolean);v38=(Byte);v39=(LongHi);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     .line 305
a=0;//     .restart local v15    # "extraPixels":I
a=0;//     :cond_1b
a=0;//     #v0=(LongLo);v1=(LongHi);v15=(Integer);v40=(LongLo);v41=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 306
a=0;//     .restart local v11    # "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 307
a=0;//     .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     instance-of v0, v11, Landroid/support/v7/internal/view/menu/ActionMenuItemView;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-eqz v38, :cond_1d
a=0;// 
a=0;//     .line 309
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v15, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I
a=0;// 
a=0;//     .line 310
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     .line 311
a=0;//     if-nez v20, :cond_1c
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->preventEdgeOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_1c
a=0;// 
a=0;//     .line 314
a=0;//     neg-int v0, v15
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     div-int/lit8 v38, v38, 0x2
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 316
a=0;//     :cond_1c
a=0;//     const/16 v30, 0x1
a=0;// 
a=0;//     #v30=(One);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     .line 317
a=0;//     :cond_1d
a=0;//     #v0=(Boolean);v1=(Integer);v30=(Boolean);v38=(Boolean);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     if-eqz v38, :cond_1e
a=0;// 
a=0;//     .line 318
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v15, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I
a=0;// 
a=0;//     .line 319
a=0;//     const/16 v38, 0x1
a=0;// 
a=0;//     #v38=(One);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput-boolean v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     .line 320
a=0;//     neg-int v0, v15
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     div-int/lit8 v38, v38, 0x2
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 321
a=0;//     const/16 v30, 0x1
a=0;// 
a=0;//     #v30=(One);
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     .line 326
a=0;//     :cond_1e
a=0;//     #v0=(Boolean);v1=(Integer);v30=(Boolean);v38=(Boolean);
a=0;//     if-eqz v20, :cond_1f
a=0;// 
a=0;//     .line 327
a=0;//     div-int/lit8 v38, v15, 0x2
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 329
a=0;//     :cond_1f
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v38, v12, -0x1
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_13
a=0;// 
a=0;//     .line 330
a=0;//     div-int/lit8 v38, v15, 0x2
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move-object/from16 v1, v23
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     goto/16 :goto_d
a=0;// 
a=0;//     .line 335
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_20
a=0;//     #v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v40=(Conflicted);v41=(Conflicted);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 339
a=0;//     .end local v13    # "expandCount":F
a=0;//     .end local v15    # "extraPixels":I
a=0;//     :cond_21
a=0;//     #v13=(Conflicted);v15=(Conflicted);v38=(Conflicted);v39=(Conflicted);
a=0;//     if-eqz v30, :cond_23
a=0;// 
a=0;//     .line 340
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     :goto_10
a=0;//     #v35=(Conflicted);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     if-ge v0, v12, :cond_23
a=0;// 
a=0;//     .line 341
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 342
a=0;//     .restart local v11    # "child":Landroid/view/View;
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v23
a=0;// 
a=0;//     #v23=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v23, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 344
a=0;//     .restart local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->expanded:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Boolean);
a=0;//     if-nez v38, :cond_22
a=0;// 
a=0;//     .line 340
a=0;//     :goto_11
a=0;//     #v0=(Integer);v38=(Integer);
a=0;//     add-int/lit8 v20, v20, 0x1
a=0;// 
a=0;//     goto :goto_10
a=0;// 
a=0;//     .line 348
a=0;//     :cond_22
a=0;//     #v0=(Boolean);v38=(Boolean);
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->cellsUsed:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v38, v0
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     mul-int v38, v38, v5
a=0;// 
a=0;//     move-object/from16 v0, v23
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->extraPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v39, v0
a=0;// 
a=0;//     #v39=(Integer);
a=0;//     add-int v35, v38, v39
a=0;// 
a=0;//     .line 349
a=0;//     .local v35, "width":I
a=0;//     #v35=(Integer);
a=0;//     const/high16 v38, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v35
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     invoke-virtual {v11, v0, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_11
a=0;// 
a=0;//     .line 354
a=0;//     .end local v11    # "child":Landroid/view/View;
a=0;//     .end local v23    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .end local v35    # "width":I
a=0;//     :cond_23
a=0;//     #v1=(Conflicted);v11=(Conflicted);v23=(Conflicted);v35=(Conflicted);v38=(Conflicted);v39=(Conflicted);
a=0;//     const/high16 v38, 0x40000000
a=0;// 
a=0;//     #v38=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v38
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_24
a=0;// 
a=0;//     .line 355
a=0;//     move/from16 v19, v25
a=0;// 
a=0;//     .line 358
a=0;//     :cond_24
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v37
a=0;// 
a=0;//     move/from16 v2, v19
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 359
a=0;//     mul-int v38, v8, v5
a=0;// 
a=0;//     move/from16 v0, v38
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iput v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMeasuredExtraWidth:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 534
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     instance-of v0, p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 569
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     .line 509
a=0;//     #v1=(Byte);
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     invoke-direct {v0, v1, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 511
a=0;//     .local v0, "params":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 512
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic generateDefaultLayoutParams()Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 517
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     instance-of v1, p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 523
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     check-cast p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .end local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     invoke-direct {v0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;)V
a=0;// 
a=0;//     .line 524
a=0;//     .local v0, "result":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     .line 525
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 529
a=0;//     .end local v0    # "result":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic generateLayoutParams(Landroid/util/AttributeSet;)Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/util/AttributeSet;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected bridge synthetic generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/widget/LinearLayout$LayoutParams;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateOverflowButtonLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateDefaultLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 539
a=0;//     .local v0, "result":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     .line 540
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getWindowAnimations()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 548
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected hasSupportDividerBeforeChildAt(I)Z
a=0;//     .locals 4
a=0;//     .param p1, "childIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     add-int/lit8 v3, p1, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 557
a=0;//     .local v1, "childBefore":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 558
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 559
a=0;//     .local v2, "result":Z
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ge p1, v3, :cond_0
a=0;// 
a=0;//     instance-of v3, v1, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 560
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;//     .end local v1    # "childBefore":Landroid/view/View;
a=0;//     invoke-interface {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;->needsDividerAfter()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     .line 562
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Integer);
a=0;//     if-lez p1, :cond_1
a=0;// 
a=0;//     instance-of v3, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 563
a=0;//     check-cast v0, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// 
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     invoke-interface {v0}, Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;->needsDividerBefore()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     .line 565
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public initialize(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 552
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 553
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public invokeItem(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 544
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isExpandedFormat()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isOverflowReserved()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mReserveOverflow:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 2
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->updateMenuView(Z)V
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z
a=0;// 
a=0;//     .line 90
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 496
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z
a=0;// 
a=0;//     .line 497
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 30
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "right"    # I
a=0;//     .param p5, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 416
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Boolean);
a=0;//     if-nez v28, :cond_1
a=0;// 
a=0;//     .line 417
a=0;//     invoke-super/range {p0 .. p5}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 491
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Integer);v29=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 421
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Boolean);v29=(Uninit);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 422
a=0;//     .local v6, "childCount":I
a=0;//     #v6=(Integer);
a=0;//     add-int v28, p3, p5
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     div-int/lit8 v14, v28, 0x2
a=0;// 
a=0;//     .line 423
a=0;//     .local v14, "midVertical":I
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getSupportDividerWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 424
a=0;//     .local v7, "dividerWidth":I
a=0;//     #v7=(Integer);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 425
a=0;//     .local v17, "overflowWidth":I
a=0;//     #v17=(Null);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 426
a=0;//     .local v16, "nonOverflowWidth":I
a=0;//     #v16=(Null);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 427
a=0;//     .local v15, "nonOverflowCount":I
a=0;//     #v15=(Null);
a=0;//     sub-int v28, p4, p2
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     sub-int v28, v28, v29
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     sub-int v27, v28, v29
a=0;// 
a=0;//     .line 428
a=0;//     .local v27, "widthRemaining":I
a=0;//     #v27=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 429
a=0;//     .local v8, "hasOverflow":Z
a=0;//     #v8=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v8=(Boolean);v9=(Conflicted);v10=(Integer);v11=(Conflicted);v15=(Integer);v16=(Integer);v17=(Integer);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v24=(Conflicted);v25=(Conflicted);
a=0;//     if-ge v10, v6, :cond_6
a=0;// 
a=0;//     .line 430
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     .line 431
a=0;//     .local v25, "v":Landroid/view/View;
a=0;//     #v25=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     const/16 v29, 0x8
a=0;// 
a=0;//     #v29=(PosByte);
a=0;//     move/from16 v0, v28
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_2
a=0;// 
a=0;//     .line 429
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Integer);v29=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 435
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(PosByte);v29=(PosByte);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     #v18=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v18, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 436
a=0;//     .local v18, "p":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Boolean);
a=0;//     if-eqz v28, :cond_4
a=0;// 
a=0;//     .line 437
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 438
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     if-eqz v28, :cond_3
a=0;// 
a=0;//     .line 439
a=0;//     add-int v17, v17, v7
a=0;// 
a=0;//     .line 441
a=0;//     :cond_3
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 442
a=0;//     .local v9, "height":I
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getWidth()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     sub-int v28, v28, v29
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     sub-int v19, v28, v29
a=0;// 
a=0;//     .line 443
a=0;//     .local v19, "r":I
a=0;//     #v19=(Integer);
a=0;//     sub-int v11, v19, v17
a=0;// 
a=0;//     .line 444
a=0;//     .local v11, "l":I
a=0;//     #v11=(Integer);
a=0;//     div-int/lit8 v28, v9, 0x2
a=0;// 
a=0;//     sub-int v24, v14, v28
a=0;// 
a=0;//     .line 445
a=0;//     .local v24, "t":I
a=0;//     #v24=(Integer);
a=0;//     add-int v5, v24, v9
a=0;// 
a=0;//     .line 446
a=0;//     .local v5, "b":I
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v19
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v11, v1, v2, v5}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 448
a=0;//     sub-int v27, v27, v17
a=0;// 
a=0;//     .line 449
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 450
a=0;//     #v8=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 451
a=0;//     .end local v5    # "b":I
a=0;//     .end local v9    # "height":I
a=0;//     .end local v11    # "l":I
a=0;//     .end local v19    # "r":I
a=0;//     .end local v24    # "t":I
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(PosByte);v2=(Conflicted);v5=(Conflicted);v8=(Boolean);v9=(Conflicted);v11=(Conflicted);v19=(Conflicted);v24=(Conflicted);v28=(Boolean);v29=(PosByte);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     add-int v28, v28, v29
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     add-int v20, v28, v29
a=0;// 
a=0;//     .line 452
a=0;//     .local v20, "size":I
a=0;//     #v20=(Integer);
a=0;//     add-int v16, v16, v20
a=0;// 
a=0;//     .line 453
a=0;//     sub-int v27, v27, v20
a=0;// 
a=0;//     .line 454
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->hasSupportDividerBeforeChildAt(I)Z
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     #v28=(Boolean);
a=0;//     if-eqz v28, :cond_5
a=0;// 
a=0;//     .line 455
a=0;//     add-int v16, v16, v7
a=0;// 
a=0;//     .line 457
a=0;//     :cond_5
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 461
a=0;//     .end local v18    # "p":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .end local v20    # "size":I
a=0;//     .end local v25    # "v":Landroid/view/View;
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v18=(Conflicted);v20=(Conflicted);v25=(Conflicted);v28=(Integer);
a=0;//     const/16 v28, 0x1
a=0;// 
a=0;//     #v28=(One);
a=0;//     move/from16 v0, v28
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v6, v0, :cond_7
a=0;// 
a=0;//     if-nez v8, :cond_7
a=0;// 
a=0;//     .line 463
a=0;//     const/16 v28, 0x0
a=0;// 
a=0;//     #v28=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     .line 464
a=0;//     .restart local v25    # "v":Landroid/view/View;
a=0;//     #v25=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     .line 465
a=0;//     .local v26, "width":I
a=0;//     #v26=(Integer);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 466
a=0;//     .restart local v9    # "height":I
a=0;//     #v9=(Integer);
a=0;//     sub-int v28, p4, p2
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     div-int/lit8 v13, v28, 0x2
a=0;// 
a=0;//     .line 467
a=0;//     .local v13, "midHorizontal":I
a=0;//     #v13=(Integer);
a=0;//     div-int/lit8 v28, v26, 0x2
a=0;// 
a=0;//     sub-int v11, v13, v28
a=0;// 
a=0;//     .line 468
a=0;//     .restart local v11    # "l":I
a=0;//     #v11=(Integer);
a=0;//     div-int/lit8 v28, v9, 0x2
a=0;// 
a=0;//     sub-int v24, v14, v28
a=0;// 
a=0;//     .line 469
a=0;//     .restart local v24    # "t":I
a=0;//     #v24=(Integer);
a=0;//     add-int v28, v11, v26
a=0;// 
a=0;//     add-int v29, v24, v9
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v28
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v29
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v11, v1, v2, v3}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 473
a=0;//     .end local v9    # "height":I
a=0;//     .end local v11    # "l":I
a=0;//     .end local v13    # "midHorizontal":I
a=0;//     .end local v24    # "t":I
a=0;//     .end local v25    # "v":Landroid/view/View;
a=0;//     .end local v26    # "width":I
a=0;//     :cond_7
a=0;//     #v0=(One);v1=(Conflicted);v2=(Conflicted);v3=(Uninit);v9=(Conflicted);v11=(Conflicted);v13=(Uninit);v24=(Conflicted);v25=(Conflicted);v26=(Uninit);v28=(One);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     const/16 v28, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v28=(Boolean);
a=0;//     sub-int v21, v15, v28
a=0;// 
a=0;//     .line 474
a=0;//     .local v21, "spacerCount":I
a=0;//     #v21=(Integer);
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     #v29=(Null);
a=0;//     if-lez v21, :cond_a
a=0;// 
a=0;//     div-int v28, v27, v21
a=0;// 
a=0;//     :goto_4
a=0;//     #v28=(Integer);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 476
a=0;//     .local v22, "spacerSize":I
a=0;//     #v22=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 477
a=0;//     .local v23, "startLeft":I
a=0;//     #v23=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Integer);v3=(Conflicted);v4=(Conflicted);v12=(Conflicted);v26=(Conflicted);v29=(Integer);
a=0;//     if-ge v10, v6, :cond_0
a=0;// 
a=0;//     .line 478
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v0, v10}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     .line 479
a=0;//     .restart local v25    # "v":Landroid/view/View;
a=0;//     #v25=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v12
a=0;// 
a=0;//     #v12=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 480
a=0;//     .local v12, "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     const/16 v29, 0x8
a=0;// 
a=0;//     #v29=(PosByte);
a=0;//     move/from16 v0, v28
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_8
a=0;// 
a=0;//     iget-boolean v0, v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Boolean);
a=0;//     if-eqz v28, :cond_b
a=0;// 
a=0;//     .line 477
a=0;//     :cond_8
a=0;//     :goto_6
a=0;//     #v0=(Integer);v1=(Integer);v28=(Integer);v29=(Integer);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 473
a=0;//     .end local v12    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .end local v21    # "spacerCount":I
a=0;//     .end local v22    # "spacerSize":I
a=0;//     .end local v23    # "startLeft":I
a=0;//     .end local v25    # "v":Landroid/view/View;
a=0;//     :cond_9
a=0;//     #v0=(One);v1=(Conflicted);v3=(Uninit);v4=(Uninit);v12=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v25=(Conflicted);v26=(Uninit);v28=(One);
a=0;//     const/16 v28, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 474
a=0;//     .restart local v21    # "spacerCount":I
a=0;//     :cond_a
a=0;//     #v21=(Integer);v28=(Boolean);v29=(Null);
a=0;//     const/16 v28, 0x0
a=0;// 
a=0;//     #v28=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 484
a=0;//     .restart local v12    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     .restart local v22    # "spacerSize":I
a=0;//     .restart local v23    # "startLeft":I
a=0;//     .restart local v25    # "v":Landroid/view/View;
a=0;//     :cond_b
a=0;//     #v0=(Boolean);v1=(PosByte);v3=(Conflicted);v4=(Conflicted);v12=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;);v22=(Integer);v23=(Integer);v25=(Reference,Landroid/view/View;);v26=(Conflicted);v28=(Boolean);v29=(PosByte);
a=0;//     iget v0, v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     add-int v23, v23, v28
a=0;// 
a=0;//     .line 485
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     .line 486
a=0;//     .restart local v26    # "width":I
a=0;//     #v26=(Integer);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 487
a=0;//     .restart local v9    # "height":I
a=0;//     #v9=(Integer);
a=0;//     div-int/lit8 v28, v9, 0x2
a=0;// 
a=0;//     sub-int v24, v14, v28
a=0;// 
a=0;//     .line 488
a=0;//     .restart local v24    # "t":I
a=0;//     #v24=(Integer);
a=0;//     add-int v28, v23, v26
a=0;// 
a=0;//     add-int v29, v24, v9
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v24
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v28
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move/from16 v4, v29
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 489
a=0;//     iget v0, v12, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     add-int v28, v28, v26
a=0;// 
a=0;//     add-int v28, v28, v22
a=0;// 
a=0;//     add-int v23, v23, v28
a=0;// 
a=0;//     goto :goto_6
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 10
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 95
a=0;//     #v8=(Null);
a=0;//     iget-boolean v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     .line 96
a=0;//     .local v4, "wasFormatted":Z
a=0;//     #v4=(Boolean);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/high16 v9, 0x40000000
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-ne v6, v9, :cond_2
a=0;// 
a=0;//     move v6, v7
a=0;// 
a=0;//     :goto_0
a=0;//     #v6=(Boolean);
a=0;//     iput-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     .line 98
a=0;//     iget-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     if-eq v4, v6, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     iput v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 105
a=0;//     .local v5, "widthSize":I
a=0;//     #v5=(Integer);
a=0;//     iget-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eq v5, v6, :cond_1
a=0;// 
a=0;//     .line 106
a=0;//     iput v5, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItemsWidth:I
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v6, v7}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 110
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);
a=0;//     iget-boolean v6, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mFormatItems:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 111
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->onMeasureExactFormat(II)V
a=0;// 
a=0;//     .line 122
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .end local v5    # "widthSize":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Integer);
a=0;//     move v6, v8
a=0;// 
a=0;//     .line 96
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     .restart local v5    # "widthSize":I
a=0;//     :cond_3
a=0;//     #v5=(Integer);v6=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 115
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v2, v1, :cond_4
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 117
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;// 
a=0;//     .line 118
a=0;//     .local v3, "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     iput v8, v3, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     iput v8, v3, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 115
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 120
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v3    # "lp":Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v7/internal/widget/LinearLayoutICS;->onMeasure(II)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setOverflowReserved(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "reserveOverflow"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 504
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mReserveOverflow:Z
a=0;// 
a=0;//     .line 505
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPresenter(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;)V
a=0;//     .locals 0
a=0;//     .param p1, "presenter"    # Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuView;->mPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
}}
