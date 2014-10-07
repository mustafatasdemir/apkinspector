package android.support.v7.internal.widget; class ActionBarView$ExpandedActionViewMenuPresenter {/*

.class Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
.super Ljava/lang/Object;
.source "ActionBarView.java"

# interfaces
.implements Landroid/support/v7/internal/view/menu/MenuPresenter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActionBarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ExpandedActionViewMenuPresenter"
.end annotation


# instance fields
.field mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

.field mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field final synthetic this$0:Landroid/support/v7/internal/widget/ActionBarView;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ActionBarView;)V
    .locals 0
    .parameter

    .prologue
    .line 1377
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ActionBarView;Landroid/support/v7/internal/widget/ActionBarView$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 1377
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 5
    .parameter "menu"
    .parameter "item"

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, 0x0

    .line 1476
    #v2=(Null);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    instance-of v0, v0, Landroid/support/v7/view/CollapsibleActionView;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1477
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    check-cast v0, Landroid/support/v7/view/CollapsibleActionView;

    invoke-interface {v0}, Landroid/support/v7/view/CollapsibleActionView;->onActionViewCollapsed()V

    .line 1480
    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v1=(Reference);
    iget-object v1, v1, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 1481
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v1}, Landroid/support/v7/internal/widget/ActionBarView;->access$600(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 1482
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    iput-object v3, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    .line 1483
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1200(Landroid/support/v7/internal/widget/ActionBarView;)I

    move-result v0

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_1

    .line 1484
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$700(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setVisibility(I)V

    .line 1486
    :cond_1
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1200(Landroid/support/v7/internal/widget/ActionBarView;)I

    move-result v0

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_2

    .line 1487
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$800(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-nez v0, :cond_6

    .line 1488
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1300(Landroid/support/v7/internal/widget/ActionBarView;)V

    .line 1493
    :cond_2
    :goto_0
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$900(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1400(Landroid/support/v7/internal/widget/ActionBarView;)I

    move-result v0

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_3

    .line 1494
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$900(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 1496
    :cond_3
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/SpinnerICS;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1400(Landroid/support/v7/internal/widget/ActionBarView;)I

    move-result v0

    #v0=(Integer);
    if-ne v0, v4, :cond_4

    .line 1497
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/SpinnerICS;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/SpinnerICS;->setVisibility(I)V

    .line 1499
    :cond_4
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1200(Landroid/support/v7/internal/widget/ActionBarView;)I

    move-result v0

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_5

    .line 1500
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 1502
    :cond_5
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$600(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1503
    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 1504
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->requestLayout()V

    .line 1505
    invoke-virtual {p2, v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setActionViewExpanded(Z)V

    .line 1507
    return v4

    .line 1490
    :cond_6
    #v1=(Reference);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$800(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method public expandItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 5
    .parameter "menu"
    .parameter "item"

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/16 v3, 0x8

    .line 1440
    #v3=(PosByte);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    invoke-virtual {p2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getActionView()Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    .line 1441
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$600(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v1}, Landroid/support/v7/internal/widget/ActionBarView;->access$500(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 1442
    iput-object p2, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 1443
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    if-eq v0, v1, :cond_0

    .line 1444
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v1, v1, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 1446
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$600(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    if-eq v0, v1, :cond_1

    .line 1447
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v1}, Landroid/support/v7/internal/widget/ActionBarView;->access$600(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 1449
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$700(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setVisibility(I)V

    .line 1450
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$800(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1451
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$800(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1453
    :cond_2
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$900(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 1454
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$900(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V

    .line 1456
    :cond_3
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/SpinnerICS;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 1457
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/SpinnerICS;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/SpinnerICS;->setVisibility(I)V

    .line 1459
    :cond_4
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_5

    .line 1460
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActionBarView;->access$1100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1462
    :cond_5
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->requestLayout()V

    .line 1463
    invoke-virtual {p2, v4}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setActionViewExpanded(Z)V

    .line 1465
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    instance-of v0, v0, Landroid/support/v7/view/CollapsibleActionView;

    #v0=(Boolean);
    if-eqz v0, :cond_6

    .line 1466
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    check-cast v0, Landroid/support/v7/view/CollapsibleActionView;

    invoke-interface {v0}, Landroid/support/v7/view/CollapsibleActionView;->onActionViewExpanded()V

    .line 1469
    :cond_6
    #v0=(Conflicted);
    return v4
.end method

.method public flagActionItems()Z
    .locals 1

    .prologue
    .line 1435
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 1512
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
    .locals 1
    .parameter "root"

    .prologue
    .line 1393
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 2
    .parameter "context"
    .parameter "menu"

    .prologue
    .line 1385
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    if-eqz v0, :cond_0

    .line 1386
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z

    .line 1388
    :cond_0
    #v1=(Conflicted);
    iput-object p2, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 1389
    return-void
.end method

.method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 0
    .parameter "menu"
    .parameter "allMenusAreClosing"

    .prologue
    .line 1431
    return-void
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0
    .parameter "state"

    .prologue
    .line 1522
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 1517
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z
    .locals 1
    .parameter "subMenu"

    .prologue
    .line 1426
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
    .locals 0
    .parameter "cb"

    .prologue
    .line 1422
    return-void
.end method

.method public updateMenuView(Z)V
    .locals 6
    .parameter "cleared"

    .prologue
    .line 1399
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v4=(Reference);
    if-eqz v4, :cond_1

    .line 1400
    const/4 v1, 0x0

    .line 1402
    .local v1, found:Z
    #v1=(Null);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v4, :cond_0

    .line 1403
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I

    move-result v0

    .line 1404
    .local v0, count:I
    #v0=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v2=(Integer);v3=(Conflicted);
    if-ge v2, v0, :cond_0

    .line 1405
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v4, v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getItem(I)Landroid/view/MenuItem;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v4/internal/view/SupportMenuItem;

    .line 1406
    .local v3, item:Landroid/support/v4/internal/view/SupportMenuItem;
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    if-ne v3, v4, :cond_2

    .line 1407
    const/4 v1, 0x1

    .line 1413
    .end local v0           #count:I
    .end local v2           #i:I
    .end local v3           #item:Landroid/support/v4/internal/view/SupportMenuItem;
    :cond_0
    #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
    if-nez v1, :cond_1

    .line 1415
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v5=(Reference);
    invoke-virtual {p0, v4, v5}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z

    .line 1418
    .end local v1           #found:Z
    :cond_1
    #v1=(Conflicted);v5=(Conflicted);
    return-void

    .line 1404
    .restart local v0       #count:I
    .restart local v1       #found:Z
    .restart local v2       #i:I
    .restart local v3       #item:Landroid/support/v4/internal/view/SupportMenuItem;
    :cond_2
    #v0=(Integer);v1=(Null);v2=(Integer);v3=(Reference);v5=(Uninit);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

*/}
