package android.support.v7.internal.view.menu; class ActionMenuPresenter {/*

.class public Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
.super Landroid/support/v7/internal/view/menu/BaseMenuPresenter;
.source "ActionMenuPresenter.java"

# interfaces
.implements Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/menu/ActionMenuPresenter$1;,
        Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;,
        Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;,
        Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;,
        Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;,
        Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;,
        Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ActionMenuPresenter"


# instance fields
.field private final mActionButtonGroups:Landroid/util/SparseBooleanArray;

.field private mActionButtonPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;

.field private mActionItemWidthLimit:I

.field private mExpandedActionViewsExclusive:Z

.field private mMaxItems:I

.field private mMaxItemsSet:Z

.field private mMinCellSize:I

.field mOpenSubMenuId:I

.field private mOverflowButton:Landroid/view/View;

.field private mOverflowPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

.field final mPopupPresenterCallback:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;

.field private mPostedOpenRunnable:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

.field private mReserveOverflow:Z

.field private mReserveOverflowSet:Z

.field private mScrapActionButtonView:Landroid/view/View;

.field private mStrictWidthLimit:Z

.field private mWidthLimit:I

.field private mWidthLimitSet:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 76
    sget v0, Landroid/support/v7/appcompat/R$layout;->abc_action_menu_layout:I

    #v0=(Integer);
    sget v1, Landroid/support/v7/appcompat/R$layout;->abc_action_menu_item_layout:I

    #v1=(Integer);
    invoke-direct {p0, p1, v0, v1}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;-><init>(Landroid/content/Context;II)V

    .line 63
    #p0=(Reference);
    new-instance v0, Landroid/util/SparseBooleanArray;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/util/SparseBooleanArray;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionButtonGroups:Landroid/util/SparseBooleanArray;

    .line 72
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$1;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPopupPresenterCallback:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;

    .line 77
    return-void
.end method

.method static synthetic access$102(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 44
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    return-object p1
.end method

.method static synthetic access$202(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 44
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;

    return-object p1
.end method

.method static synthetic access$302(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 44
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

    return-object p1
.end method

.method private findViewForItem(Landroid/view/MenuItem;)Landroid/view/View;
    .locals 6
    .parameter "item"

    .prologue
    const/4 v5, 0x0

    .line 273
    #v5=(Null);
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v3=(Reference);
    check-cast v3, Landroid/view/ViewGroup;

    .line 274
    .local v3, parent:Landroid/view/ViewGroup;
    if-nez v3, :cond_1

    move-object v0, v5

    .line 286
    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    return-object v0

    .line 278
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 279
    .local v1, count:I
    #v1=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_1
    #v0=(Conflicted);v2=(Integer);v4=(Conflicted);
    if-ge v2, v1, :cond_3

    .line 280
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 281
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    instance-of v4, v0, Landroid/support/v7/internal/view/menu/MenuView$ItemView;

    #v4=(Boolean);
    if-eqz v4, :cond_2

    move-object v4, v0

    #v4=(Reference);
    check-cast v4, Landroid/support/v7/internal/view/menu/MenuView$ItemView;

    invoke-interface {v4}, Landroid/support/v7/internal/view/menu/MenuView$ItemView;->getItemData()Landroid/support/v7/internal/view/menu/MenuItemImpl;

    move-result-object v4

    if-eq v4, p1, :cond_0

    .line 279
    :cond_2
    #v4=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .end local v0           #child:Landroid/view/View;
    :cond_3
    #v0=(Conflicted);
    move-object v0, v5

    .line 286
    #v0=(Null);
    goto :goto_0
.end method


# virtual methods
.method public bindItemView(Landroid/support/v7/internal/view/menu/MenuItemImpl;Landroid/support/v7/internal/view/menu/MenuView$ItemView;)V
    .locals 3
    .parameter "item"
    .parameter "itemView"

    .prologue
    .line 177
    const/4 v2, 0x0

    #v2=(Null);
    invoke-interface {p2, p1, v2}, Landroid/support/v7/internal/view/menu/MenuView$ItemView;->initialize(Landroid/support/v7/internal/view/menu/MenuItemImpl;I)V

    .line 179
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/ActionMenuView;

    .local v1, menuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
    move-object v0, p2

    .line 180
    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    .line 181
    .local v0, actionItemView:Landroid/support/v7/internal/view/menu/ActionMenuItemView;
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setItemInvoker(Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;)V

    .line 182
    return-void
.end method

.method public dismissPopupMenus()Z
    .locals 2

    .prologue
    .line 337
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z

    move-result v0

    .line 338
    .local v0, result:Z
    #v0=(Boolean);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideSubMenus()Z

    move-result v1

    #v1=(Boolean);
    or-int/2addr v0, v1

    .line 339
    return v0
.end method

.method public filterLeftoverView(Landroid/view/ViewGroup;I)Z
    .locals 2
    .parameter "parent"
    .parameter "childIndex"

    .prologue
    .line 242
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    #v1=(Reference);
    if-ne v0, v1, :cond_0

    .line 243
    const/4 v0, 0x0

    .line 245
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->filterLeftoverView(Landroid/view/ViewGroup;I)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public flagActionItems()Z
    .locals 29

    .prologue
    .line 370
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    move-object/from16 v27, v0

    #v27=(Reference);
    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v25

    .line 371
    .local v25, visibleItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    #v25=(Reference);
    invoke-virtual/range {v25 .. v25}, Ljava/util/ArrayList;->size()I

    move-result v15

    .line 372
    .local v15, itemsSize:I
    #v15=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMaxItems:I

    #v0=(Integer);
    move/from16 v17, v0

    .line 373
    .local v17, maxActions:I
    #v17=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionItemWidthLimit:I

    #v0=(Integer);
    move/from16 v26, v0

    .line 374
    .local v26, widthLimit:I
    #v26=(Integer);
    const/16 v27, 0x0

    #v27=(Null);
    const/16 v28, 0x0

    #v28=(Null);
    invoke-static/range {v27 .. v28}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .line 375
    .local v20, querySpec:I
    #v20=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    move-object/from16 v19, v0

    #v19=(Reference);
    check-cast v19, Landroid/view/ViewGroup;

    .line 377
    .local v19, parent:Landroid/view/ViewGroup;
    const/16 v22, 0x0

    .line 378
    .local v22, requiredItems:I
    #v22=(Null);
    const/16 v21, 0x0

    .line 379
    .local v21, requestedItems:I
    #v21=(Null);
    const/4 v8, 0x0

    .line 380
    .local v8, firstActionWidth:I
    #v8=(Null);
    const/4 v10, 0x0

    .line 381
    .local v10, hasOverflow:Z
    #v10=(Null);
    const/4 v11, 0x0

    .local v11, i:I
    :goto_0
    #v0=(Conflicted);v10=(Boolean);v11=(Integer);v14=(Conflicted);v21=(Integer);v22=(Integer);v27=(Boolean);
    if-ge v11, v15, :cond_3

    .line 382
    move-object/from16 v0, v25

    #v0=(Reference);
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    #v14=(Reference);
    check-cast v14, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 383
    .local v14, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v14}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->requiresActionButton()Z

    move-result v27

    if-eqz v27, :cond_1

    .line 384
    add-int/lit8 v22, v22, 0x1

    .line 390
    :goto_1
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mExpandedActionViewsExclusive:Z

    #v0=(Boolean);
    move/from16 v27, v0

    if-eqz v27, :cond_0

    invoke-virtual {v14}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isActionViewExpanded()Z

    move-result v27

    if-eqz v27, :cond_0

    .line 393
    const/16 v17, 0x0

    .line 381
    :cond_0
    add-int/lit8 v11, v11, 0x1

    goto :goto_0

    .line 385
    :cond_1
    #v0=(Reference);
    invoke-virtual {v14}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->requestsActionButton()Z

    move-result v27

    if-eqz v27, :cond_2

    .line 386
    add-int/lit8 v21, v21, 0x1

    goto :goto_1

    .line 388
    :cond_2
    const/4 v10, 0x1

    #v10=(One);
    goto :goto_1

    .line 398
    .end local v14           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_3
    #v0=(Conflicted);v10=(Boolean);v14=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z

    #v0=(Boolean);
    move/from16 v27, v0

    if-eqz v27, :cond_5

    if-nez v10, :cond_4

    add-int v27, v22, v21

    #v27=(Integer);
    move/from16 v0, v27

    #v0=(Integer);
    move/from16 v1, v17

    #v1=(Integer);
    if-le v0, v1, :cond_5

    .line 400
    :cond_4
    #v1=(Conflicted);
    add-int/lit8 v17, v17, -0x1

    .line 402
    :cond_5
    sub-int v17, v17, v22

    .line 404
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionButtonGroups:Landroid/util/SparseBooleanArray;

    move-object/from16 v23, v0

    .line 405
    .local v23, seenGroups:Landroid/util/SparseBooleanArray;
    #v23=(Reference);
    invoke-virtual/range {v23 .. v23}, Landroid/util/SparseBooleanArray;->clear()V

    .line 407
    const/4 v4, 0x0

    .line 408
    .local v4, cellSize:I
    #v4=(Null);
    const/4 v7, 0x0

    .line 409
    .local v7, cellsRemaining:I
    #v7=(Null);
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z

    #v0=(Boolean);
    move/from16 v27, v0

    #v27=(Boolean);
    if-eqz v27, :cond_6

    .line 410
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMinCellSize:I

    #v0=(Integer);
    move/from16 v27, v0

    #v27=(Integer);
    div-int v7, v26, v27

    .line 411
    #v7=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMinCellSize:I

    #v0=(Integer);
    move/from16 v27, v0

    rem-int v5, v26, v27

    .line 412
    .local v5, cellSizeRemaining:I
    #v5=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMinCellSize:I

    #v0=(Integer);
    move/from16 v27, v0

    div-int v28, v5, v7

    #v28=(Integer);
    add-int v4, v27, v28

    .line 416
    .end local v5           #cellSizeRemaining:I
    :cond_6
    #v4=(Integer);v5=(Conflicted);
    const/4 v11, 0x0

    :goto_2
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v8=(Integer);v9=(Conflicted);v12=(Conflicted);v13=(Conflicted);v16=(Conflicted);v18=(Conflicted);v24=(Conflicted);
    if-ge v11, v15, :cond_1d

    .line 417
    move-object/from16 v0, v25

    #v0=(Reference);
    invoke-virtual {v0, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v14

    #v14=(Reference);
    check-cast v14, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 419
    .restart local v14       #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v14}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->requiresActionButton()Z

    move-result v27

    #v27=(Boolean);
    if-eqz v27, :cond_c

    .line 420
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;

    move-object/from16 v27, v0

    #v27=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    #v1=(Reference);
    move-object/from16 v2, v19

    #v2=(Reference);
    invoke-virtual {v0, v14, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getItemView(Landroid/support/v7/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v24

    .line 421
    .local v24, v:Landroid/view/View;
    #v24=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;

    move-object/from16 v27, v0

    if-nez v27, :cond_7

    .line 422
    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;

    .line 424
    :cond_7
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z

    #v0=(Boolean);
    move/from16 v27, v0

    #v27=(Boolean);
    if-eqz v27, :cond_b

    .line 425
    const/16 v27, 0x0

    #v27=(Null);
    move-object/from16 v0, v24

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    move/from16 v2, v27

    #v2=(Null);
    invoke-static {v0, v4, v7, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->measureChildForCells(Landroid/view/View;IIII)I

    move-result v27

    #v27=(Integer);
    sub-int v7, v7, v27

    .line 430
    :goto_3
    #v2=(Integer);
    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredWidth()I

    move-result v18

    .line 431
    .local v18, measuredWidth:I
    #v18=(Integer);
    sub-int v26, v26, v18

    .line 432
    if-nez v8, :cond_8

    .line 433
    move/from16 v8, v18

    .line 435
    :cond_8
    invoke-virtual {v14}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I

    move-result v9

    .line 436
    .local v9, groupId:I
    #v9=(Integer);
    if-eqz v9, :cond_9

    .line 437
    const/16 v27, 0x1

    #v27=(One);
    move-object/from16 v0, v23

    move/from16 v1, v27

    #v1=(One);
    invoke-virtual {v0, v9, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 439
    :cond_9
    #v1=(Integer);v27=(Integer);
    const/16 v27, 0x1

    #v27=(One);
    move/from16 v0, v27

    #v0=(One);
    invoke-virtual {v14, v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setIsActionButton(Z)V

    .line 416
    .end local v9           #groupId:I
    .end local v18           #measuredWidth:I
    .end local v24           #v:Landroid/view/View;
    :cond_a
    :goto_4
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v9=(Conflicted);v18=(Conflicted);v24=(Conflicted);v27=(Integer);
    add-int/lit8 v11, v11, 0x1

    goto :goto_2

    .line 428
    .restart local v24       #v:Landroid/view/View;
    :cond_b
    #v0=(Boolean);v1=(Reference);v2=(Reference);v24=(Reference);v27=(Boolean);
    move-object/from16 v0, v24

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    move/from16 v2, v20

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    goto :goto_3

    .line 440
    .end local v24           #v:Landroid/view/View;
    :cond_c
    #v1=(Conflicted);v2=(Conflicted);v24=(Conflicted);
    invoke-virtual {v14}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->requestsActionButton()Z

    move-result v27

    if-eqz v27, :cond_a

    .line 443
    invoke-virtual {v14}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I

    move-result v9

    .line 444
    .restart local v9       #groupId:I
    #v9=(Integer);
    move-object/from16 v0, v23

    invoke-virtual {v0, v9}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result v12

    .line 445
    .local v12, inGroup:Z
    #v12=(Boolean);
    if-gtz v17, :cond_d

    if-eqz v12, :cond_15

    :cond_d
    if-lez v26, :cond_15

    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z

    #v0=(Boolean);
    move/from16 v27, v0

    if-eqz v27, :cond_e

    if-lez v7, :cond_15

    :cond_e
    const/4 v13, 0x1

    .line 448
    .local v13, isAction:Z
    :goto_5
    #v0=(Conflicted);v13=(Boolean);
    if-eqz v13, :cond_12

    .line 449
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;

    move-object/from16 v27, v0

    #v27=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    #v1=(Reference);
    move-object/from16 v2, v19

    #v2=(Reference);
    invoke-virtual {v0, v14, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getItemView(Landroid/support/v7/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v24

    .line 450
    .restart local v24       #v:Landroid/view/View;
    #v24=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;

    move-object/from16 v27, v0

    if-nez v27, :cond_f

    .line 451
    move-object/from16 v0, v24

    move-object/from16 v1, p0

    iput-object v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;

    .line 453
    :cond_f
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z

    #v0=(Boolean);
    move/from16 v27, v0

    #v27=(Boolean);
    if-eqz v27, :cond_16

    .line 454
    const/16 v27, 0x0

    #v27=(Null);
    move-object/from16 v0, v24

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    move/from16 v2, v27

    #v2=(Null);
    invoke-static {v0, v4, v7, v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->measureChildForCells(Landroid/view/View;IIII)I

    move-result v6

    .line 456
    .local v6, cells:I
    #v6=(Integer);
    sub-int/2addr v7, v6

    .line 457
    if-nez v6, :cond_10

    .line 458
    const/4 v13, 0x0

    .line 463
    .end local v6           #cells:I
    :cond_10
    :goto_6
    #v2=(Integer);v6=(Conflicted);v27=(Boolean);
    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMeasuredWidth()I

    move-result v18

    .line 464
    .restart local v18       #measuredWidth:I
    #v18=(Integer);
    sub-int v26, v26, v18

    .line 465
    if-nez v8, :cond_11

    .line 466
    move/from16 v8, v18

    .line 469
    :cond_11
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z

    #v0=(Boolean);
    move/from16 v27, v0

    if-eqz v27, :cond_18

    .line 470
    if-ltz v26, :cond_17

    const/16 v27, 0x1

    :goto_7
    and-int v13, v13, v27

    .line 477
    .end local v18           #measuredWidth:I
    .end local v24           #v:Landroid/view/View;
    :cond_12
    :goto_8
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v18=(Conflicted);v24=(Conflicted);
    if-eqz v13, :cond_1a

    if-eqz v9, :cond_1a

    .line 478
    const/16 v27, 0x1

    #v27=(One);
    move-object/from16 v0, v23

    #v0=(Reference);
    move/from16 v1, v27

    #v1=(One);
    invoke-virtual {v0, v9, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 494
    :cond_13
    #v0=(Conflicted);v1=(Conflicted);v27=(Integer);
    if-eqz v13, :cond_14

    .line 495
    add-int/lit8 v17, v17, -0x1

    .line 498
    :cond_14
    invoke-virtual {v14, v13}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setIsActionButton(Z)V

    goto/16 :goto_4

    .line 445
    .end local v13           #isAction:Z
    :cond_15
    #v13=(Conflicted);v27=(Boolean);
    const/4 v13, 0x0

    #v13=(Null);
    goto :goto_5

    .line 461
    .restart local v13       #isAction:Z
    .restart local v24       #v:Landroid/view/View;
    :cond_16
    #v0=(Boolean);v1=(Reference);v2=(Reference);v13=(Boolean);v24=(Reference);
    move-object/from16 v0, v24

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    move/from16 v2, v20

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    goto :goto_6

    .line 470
    .restart local v18       #measuredWidth:I
    :cond_17
    #v0=(Boolean);v18=(Integer);
    const/16 v27, 0x0

    #v27=(Null);
    goto :goto_7

    .line 473
    :cond_18
    #v27=(Boolean);
    add-int v27, v26, v8

    #v27=(Integer);
    if-lez v27, :cond_19

    const/16 v27, 0x1

    :goto_9
    #v27=(Boolean);
    and-int v13, v13, v27

    goto :goto_8

    :cond_19
    #v27=(Integer);
    const/16 v27, 0x0

    #v27=(Null);
    goto :goto_9

    .line 479
    .end local v18           #measuredWidth:I
    .end local v24           #v:Landroid/view/View;
    :cond_1a
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v18=(Conflicted);v24=(Conflicted);v27=(Boolean);
    if-eqz v12, :cond_13

    .line 481
    const/16 v27, 0x0

    #v27=(Null);
    move-object/from16 v0, v23

    #v0=(Reference);
    move/from16 v1, v27

    #v1=(Null);
    invoke-virtual {v0, v9, v1}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 482
    const/16 v16, 0x0

    .local v16, j:I
    :goto_a
    #v0=(Conflicted);v1=(Integer);v16=(Integer);v27=(Integer);
    move/from16 v0, v16

    #v0=(Integer);
    if-ge v0, v11, :cond_13

    .line 483
    move-object/from16 v0, v25

    #v0=(Reference);
    move/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 484
    .local v3, areYouMyGroupie:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I

    move-result v27

    move/from16 v0, v27

    #v0=(Integer);
    if-ne v0, v9, :cond_1c

    .line 486
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isActionButton()Z

    move-result v27

    #v27=(Boolean);
    if-eqz v27, :cond_1b

    .line 487
    add-int/lit8 v17, v17, 0x1

    .line 489
    :cond_1b
    const/16 v27, 0x0

    #v27=(Null);
    move/from16 v0, v27

    #v0=(Null);
    invoke-virtual {v3, v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setIsActionButton(Z)V

    .line 482
    :cond_1c
    #v0=(Integer);v27=(Integer);
    add-int/lit8 v16, v16, 0x1

    goto :goto_a

    .line 501
    .end local v3           #areYouMyGroupie:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .end local v9           #groupId:I
    .end local v12           #inGroup:Z
    .end local v13           #isAction:Z
    .end local v14           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .end local v16           #j:I
    :cond_1d
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v9=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);
    const/16 v27, 0x1

    #v27=(One);
    return v27
.end method

.method public getItemView(Landroid/support/v7/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .parameter "item"
    .parameter "convertView"
    .parameter "parent"

    .prologue
    .line 158
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getActionView()Landroid/view/View;

    move-result-object v0

    .line 159
    .local v0, actionView:Landroid/view/View;
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasCollapsibleActionView()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 160
    :cond_0
    #v3=(Conflicted);
    instance-of v3, p2, Landroid/support/v7/internal/view/menu/ActionMenuItemView;

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 161
    const/4 p2, 0x0

    .line 163
    :cond_1
    invoke-super {p0, p1, p2, p3}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->getItemView(Landroid/support/v7/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 165
    :cond_2
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isActionViewExpanded()Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x8

    :goto_0
    #v3=(PosByte);
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    move-object v2, p3

    .line 167
    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 168
    .local v2, menuParent:Landroid/support/v7/internal/view/menu/ActionMenuView;
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 169
    .local v1, lp:Landroid/view/ViewGroup$LayoutParams;
    #v1=(Reference);
    invoke-virtual {v2, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_3

    .line 170
    invoke-virtual {v2, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v0, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 172
    :cond_3
    #v3=(Conflicted);
    return-object v0

    .line 165
    .end local v1           #lp:Landroid/view/ViewGroup$LayoutParams;
    .end local v2           #menuParent:Landroid/support/v7/internal/view/menu/ActionMenuView;
    :cond_4
    #v1=(Uninit);v2=(Uninit);v3=(Boolean);
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_0
.end method

.method public getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
    .locals 2
    .parameter "root"

    .prologue
    .line 151
    invoke-super {p0, p1}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v0

    .local v0, result:Landroid/support/v7/internal/view/menu/MenuView;
    #v0=(Reference);
    move-object v1, v0

    .line 152
    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1, p0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setPresenter(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;)V

    .line 153
    return-object v0
.end method

.method public hideOverflowMenu()Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 317
    #v2=(One);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    if-eqz v1, :cond_0

    .line 318
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    check-cast v1, Landroid/view/View;

    iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

    #v3=(Reference);
    invoke-virtual {v1, v3}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 319
    const/4 v1, 0x0

    #v1=(Null);
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

    move v1, v2

    .line 328
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);
    return v1

    .line 323
    :cond_0
    #v0=(Uninit);v1=(Reference);v3=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    .line 324
    .local v0, popup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 325
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->dismiss()V

    move v1, v2

    .line 326
    #v1=(One);
    goto :goto_0

    .line 328
    :cond_1
    #v1=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public hideSubMenus()Z
    .locals 1

    .prologue
    .line 348
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 349
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->dismiss()V

    .line 350
    const/4 v0, 0x1

    .line 352
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 8
    .parameter "context"
    .parameter "menu"

    .prologue
    const/4 v7, 0x0

    #v7=(Null);
    const/4 v6, 0x0

    .line 81
    #v6=(Null);
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 83
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 85
    .local v1, res:Landroid/content/res/Resources;
    #v1=(Reference);
    invoke-static {p1}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;

    move-result-object v0

    .line 86
    .local v0, abp:Landroid/support/v7/internal/view/ActionBarPolicy;
    #v0=(Reference);
    iget-boolean v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflowSet:Z

    #v4=(Boolean);
    if-nez v4, :cond_0

    .line 87
    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->showsOverflowMenuButton()Z

    move-result v4

    iput-boolean v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z

    .line 90
    :cond_0
    iget-boolean v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mWidthLimitSet:Z

    if-nez v4, :cond_1

    .line 91
    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getEmbeddedMenuWidthLimit()I

    move-result v4

    #v4=(Integer);
    iput v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mWidthLimit:I

    .line 95
    :cond_1
    iget-boolean v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMaxItemsSet:Z

    #v4=(Boolean);
    if-nez v4, :cond_2

    .line 96
    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getMaxActionButtons()I

    move-result v4

    #v4=(Integer);
    iput v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMaxItems:I

    .line 99
    :cond_2
    iget v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mWidthLimit:I

    .line 100
    .local v3, width:I
    #v3=(Integer);
    iget-boolean v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z

    #v4=(Boolean);
    if-eqz v4, :cond_4

    .line 101
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    #v4=(Reference);
    if-nez v4, :cond_3

    .line 102
    new-instance v4, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;

    #v4=(UninitRef);
    iget-object v5, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mSystemContext:Landroid/content/Context;

    #v5=(Reference);
    invoke-direct {v4, p0, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;)V

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    .line 103
    invoke-static {v6, v6}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 104
    .local v2, spec:I
    #v2=(Integer);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    invoke-virtual {v4, v2, v2}, Landroid/view/View;->measure(II)V

    .line 106
    .end local v2           #spec:I
    :cond_3
    #v2=(Conflicted);v5=(Conflicted);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v4

    #v4=(Integer);
    sub-int/2addr v3, v4

    .line 111
    :goto_0
    iput v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionItemWidthLimit:I

    .line 113
    const/high16 v4, 0x4260

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    #v5=(Reference);
    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    #v5=(Integer);
    mul-float/2addr v4, v5

    #v4=(Float);
    float-to-int v4, v4

    #v4=(Integer);
    iput v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMinCellSize:I

    .line 116
    iput-object v7, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mScrapActionButtonView:Landroid/view/View;

    .line 117
    return-void

    .line 108
    :cond_4
    #v2=(Uninit);v4=(Boolean);v5=(Uninit);
    iput-object v7, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    goto :goto_0
.end method

.method public isOverflowMenuShowing()Z
    .locals 1

    .prologue
    .line 359
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->isShowing()Z

    move-result v0

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

.method public isOverflowReserved()Z
    .locals 1

    .prologue
    .line 366
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z

    #v0=(Boolean);
    return v0
.end method

.method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 0
    .parameter "menu"
    .parameter "allMenusAreClosing"

    .prologue
    .line 506
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z

    .line 507
    invoke-super {p0, p1, p2}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V

    .line 508
    return-void
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .parameter "newConfig"

    .prologue
    .line 120
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMaxItemsSet:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 121
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/appcompat/R$integer;->abc_max_action_buttons:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMaxItems:I

    .line 124
    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 125
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 127
    :cond_1
    #v1=(Conflicted);
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 5
    .parameter "state"

    .prologue
    .line 519
    move-object v1, p1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;

    .line 520
    .local v1, saved:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;
    iget v3, v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;->openSubMenuId:I

    #v3=(Integer);
    if-lez v3, :cond_0

    .line 521
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v3=(Reference);
    iget v4, v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;->openSubMenuId:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 522
    .local v0, item:Landroid/view/MenuItem;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 523
    invoke-interface {v0}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    .line 524
    .local v2, subMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z

    .line 527
    .end local v0           #item:Landroid/view/MenuItem;
    .end local v2           #subMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    :cond_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .prologue
    .line 512
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;-><init>()V

    .line 513
    .local v0, state:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;
    #v0=(Reference);
    iget v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOpenSubMenuId:I

    #v1=(Integer);
    iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$SavedState;->openSubMenuId:I

    .line 514
    return-object v0
.end method

.method public onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z
    .locals 5
    .parameter "subMenu"

    .prologue
    const/4 v2, 0x0

    .line 249
    #v2=(Null);
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->hasVisibleItems()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    .line 269
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v2

    .line 253
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Boolean);v4=(Uninit);
    move-object v1, p1

    .line 254
    .local v1, topSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    :goto_1
    #v1=(Reference);v3=(Conflicted);v4=(Conflicted);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getParentMenu()Landroid/view/Menu;

    move-result-object v3

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v4=(Reference);
    if-eq v3, v4, :cond_2

    .line 255
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getParentMenu()Landroid/view/Menu;

    move-result-object v1

    .end local v1           #topSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    check-cast v1, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    .restart local v1       #topSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    goto :goto_1

    .line 257
    :cond_2
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getItem()Landroid/view/MenuItem;

    move-result-object v3

    invoke-direct {p0, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->findViewForItem(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    .line 258
    .local v0, anchor:Landroid/view/View;
    #v0=(Reference);
    if-nez v0, :cond_3

    .line 259
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    if-eqz v3, :cond_0

    .line 262
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    .line 265
    :cond_3
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getItem()Landroid/view/MenuItem;

    move-result-object v2

    #v2=(Reference);
    invoke-interface {v2}, Landroid/view/MenuItem;->getItemId()I

    move-result v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOpenSubMenuId:I

    .line 266
    new-instance v2, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;

    #v2=(UninitRef);
    invoke-direct {v2, p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;

    .line 267
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mActionButtonPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$ActionButtonSubmenu;->show(Landroid/os/IBinder;)V

    .line 268
    invoke-super {p0, p1}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z

    .line 269
    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0
.end method

.method public onSubUiVisibilityChanged(Z)V
    .locals 2
    .parameter "isVisible"

    .prologue
    .line 531
    if-eqz p1, :cond_0

    .line 533
    const/4 v0, 0x0

    #v0=(Null);
    invoke-super {p0, v0}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z

    .line 537
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-void

    .line 535
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V

    goto :goto_0
.end method

.method public setExpandedActionViewsExclusive(Z)V
    .locals 0
    .parameter "isExclusive"

    .prologue
    .line 146
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mExpandedActionViewsExclusive:Z

    .line 147
    return-void
.end method

.method public setItemLimit(I)V
    .locals 1
    .parameter "itemCount"

    .prologue
    .line 141
    iput p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMaxItems:I

    .line 142
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMaxItemsSet:Z

    .line 143
    return-void
.end method

.method public setReserveOverflow(Z)V
    .locals 1
    .parameter "reserveOverflow"

    .prologue
    .line 136
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z

    .line 137
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflowSet:Z

    .line 138
    return-void
.end method

.method public setWidthLimit(IZ)V
    .locals 1
    .parameter "width"
    .parameter "strict"

    .prologue
    .line 130
    iput p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mWidthLimit:I

    .line 131
    iput-boolean p2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mStrictWidthLimit:Z

    .line 132
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mWidthLimitSet:Z

    .line 133
    return-void
.end method

.method public shouldIncludeItem(ILandroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 1
    .parameter "childIndex"
    .parameter "item"

    .prologue
    .line 186
    invoke-virtual {p2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isActionButton()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public showOverflowMenu()Z
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 295
    #v5=(One);
    iget-boolean v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

    if-nez v1, :cond_0

    .line 297
    new-instance v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    #v0=(UninitRef);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mContext:Landroid/content/Context;

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    #v4=(Reference);
    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V

    .line 298
    .local v0, popup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
    #v0=(Reference);
    new-instance v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

    .line 300
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    check-cast v1, Landroid/view/View;

    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPostedOpenRunnable:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

    invoke-virtual {v1, v2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 304
    const/4 v1, 0x0

    #v1=(Null);
    invoke-super {p0, v1}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z

    .line 308
    .end local v0           #popup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);
    return v5

    :cond_0
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(One);
    const/4 v5, 0x0

    #v5=(Null);
    goto :goto_0
.end method

.method public updateMenuView(Z)V
    .locals 11
    .parameter "cleared"

    .prologue
    const/4 v9, 0x1

    #v9=(One);
    const/4 v10, 0x0

    .line 191
    #v10=(Null);
    invoke-super {p0, p1}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->updateMenuView(Z)V

    .line 193
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v8=(Reference);
    if-nez v8, :cond_0

    .line 238
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Boolean);
    return-void

    .line 197
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(One);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v8, :cond_2

    .line 198
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v8}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getActionItems()Ljava/util/ArrayList;

    move-result-object v0

    .line 199
    .local v0, actionItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 200
    .local v1, count:I
    #v1=(Integer);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_1
    #v3=(Integer);v7=(Conflicted);
    if-ge v3, v1, :cond_2

    .line 201
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-virtual {v8}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getSupportActionProvider()Landroid/support/v4/view/ActionProvider;

    move-result-object v7

    .line 202
    .local v7, provider:Landroid/support/v4/view/ActionProvider;
    #v7=(Reference);
    if-eqz v7, :cond_1

    .line 203
    invoke-virtual {v7, p0}, Landroid/support/v4/view/ActionProvider;->setSubUiVisibilityListener(Landroid/support/v4/view/ActionProvider$SubUiVisibilityListener;)V

    .line 200
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 208
    .end local v0           #actionItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    .end local v1           #count:I
    .end local v3           #i:I
    .end local v7           #provider:Landroid/support/v4/view/ActionProvider;
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v8, :cond_7

    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v8}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v5

    .line 211
    .local v5, nonActionItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    :goto_2
    #v5=(Reference);
    const/4 v2, 0x0

    .line 212
    .local v2, hasOverflow:Z
    #v2=(Null);
    iget-boolean v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z

    #v8=(Boolean);
    if-eqz v8, :cond_3

    if-eqz v5, :cond_3

    .line 213
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v1

    .line 214
    .restart local v1       #count:I
    #v1=(Integer);
    if-ne v1, v9, :cond_9

    .line 215
    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-virtual {v8}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isActionViewExpanded()Z

    move-result v8

    #v8=(Boolean);
    if-nez v8, :cond_8

    move v2, v9

    .line 221
    .end local v1           #count:I
    :cond_3
    :goto_3
    #v1=(Conflicted);v2=(Boolean);
    if-eqz v2, :cond_b

    .line 222
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    #v8=(Reference);
    if-nez v8, :cond_4

    .line 223
    new-instance v8, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;

    #v8=(UninitRef);
    iget-object v9, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mSystemContext:Landroid/content/Context;

    #v9=(Reference);
    invoke-direct {v8, p0, v9}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;)V

    #v8=(Reference);
    iput-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    .line 225
    :cond_4
    #v9=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v6

    #v6=(Reference);
    check-cast v6, Landroid/view/ViewGroup;

    .line 226
    .local v6, parent:Landroid/view/ViewGroup;
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    if-eq v6, v8, :cond_6

    .line 227
    if-eqz v6, :cond_5

    .line 228
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    invoke-virtual {v6, v8}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 230
    :cond_5
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v4=(Reference);
    check-cast v4, Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 231
    .local v4, menuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->generateOverflowButtonLayoutParams()Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {v4, v8, v9}, Landroid/support/v7/internal/view/menu/ActionMenuView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 237
    .end local v4           #menuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
    .end local v6           #parent:Landroid/view/ViewGroup;
    :cond_6
    :goto_4
    #v4=(Conflicted);v6=(Conflicted);v9=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    check-cast v8, Landroid/support/v7/internal/view/menu/ActionMenuView;

    iget-boolean v9, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mReserveOverflow:Z

    #v9=(Boolean);
    invoke-virtual {v8, v9}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setOverflowReserved(Z)V

    goto :goto_0

    .line 208
    .end local v2           #hasOverflow:Z
    .end local v5           #nonActionItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    :cond_7
    #v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v9=(One);
    const/4 v5, 0x0

    #v5=(Null);
    goto :goto_2

    .restart local v1       #count:I
    .restart local v2       #hasOverflow:Z
    .restart local v5       #nonActionItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    :cond_8
    #v1=(Integer);v2=(Null);v5=(Reference);v8=(Boolean);
    move v2, v10

    .line 215
    goto :goto_3

    .line 217
    :cond_9
    if-lez v1, :cond_a

    move v2, v9

    :goto_5
    #v2=(Boolean);
    goto :goto_3

    :cond_a
    #v2=(Null);
    move v2, v10

    goto :goto_5

    .line 233
    .end local v1           #count:I
    :cond_b
    #v1=(Conflicted);v2=(Boolean);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    #v8=(Reference);
    if-eqz v8, :cond_6

    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    invoke-virtual {v8}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v8

    iget-object v9, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v9=(Reference);
    if-ne v8, v9, :cond_6

    .line 234
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    check-cast v8, Landroid/view/ViewGroup;

    iget-object v9, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOverflowButton:Landroid/view/View;

    invoke-virtual {v8, v9}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    goto :goto_4
.end method

*/}
