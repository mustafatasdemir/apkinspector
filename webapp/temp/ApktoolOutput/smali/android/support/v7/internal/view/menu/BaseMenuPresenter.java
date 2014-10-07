package android.support.v7.internal.view.menu; class BaseMenuPresenter {/*

.class public abstract Landroid/support/v7/internal/view/menu/BaseMenuPresenter;
.super Ljava/lang/Object;
.source "BaseMenuPresenter.java"

# interfaces
.implements Landroid/support/v7/internal/view/menu/MenuPresenter;


# instance fields
.field private mCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

.field protected mContext:Landroid/content/Context;

.field private mId:I

.field protected mInflater:Landroid/view/LayoutInflater;

.field private mItemLayoutRes:I

.field protected mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private mMenuLayoutRes:I

.field protected mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

.field protected mSystemContext:Landroid/content/Context;

.field protected mSystemInflater:Landroid/view/LayoutInflater;


# direct methods
.method public constructor <init>(Landroid/content/Context;II)V
    .locals 1
    .parameter "context"
    .parameter "menuLayoutRes"
    .parameter "itemLayoutRes"

    .prologue
    .line 56
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mSystemContext:Landroid/content/Context;

    .line 58
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mSystemInflater:Landroid/view/LayoutInflater;

    .line 59
    iput p2, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenuLayoutRes:I

    .line 60
    iput p3, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mItemLayoutRes:I

    .line 61
    return-void
.end method


# virtual methods
.method protected addItemView(Landroid/view/View;I)V
    .locals 2
    .parameter "itemView"
    .parameter "childIndex"

    .prologue
    .line 130
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/view/ViewGroup;

    .line 131
    .local v0, currentParent:Landroid/view/ViewGroup;
    if-eqz v0, :cond_0

    .line 132
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 134
    :cond_0
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v1=(Reference);
    check-cast v1, Landroid/view/ViewGroup;

    invoke-virtual {v1, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 135
    return-void
.end method

.method public abstract bindItemView(Landroid/support/v7/internal/view/menu/MenuItemImpl;Landroid/support/v7/internal/view/menu/MenuView$ItemView;)V
.end method

.method public collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 1
    .parameter "menu"
    .parameter "item"

    .prologue
    .line 225
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public createItemView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView$ItemView;
    .locals 3
    .parameter "parent"

    .prologue
    .line 159
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mSystemInflater:Landroid/view/LayoutInflater;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mItemLayoutRes:I

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/view/menu/MenuView$ItemView;

    return-object v0
.end method

.method public expandItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 1
    .parameter "menu"
    .parameter "item"

    .prologue
    .line 221
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method protected filterLeftoverView(Landroid/view/ViewGroup;I)Z
    .locals 1
    .parameter "parent"
    .parameter "childIndex"

    .prologue
    .line 145
    invoke-virtual {p1, p2}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 146
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public flagActionItems()Z
    .locals 1

    .prologue
    .line 217
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 229
    iget v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mId:I

    #v0=(Integer);
    return v0
.end method

.method public getItemView(Landroid/support/v7/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .parameter "item"
    .parameter "convertView"
    .parameter "parent"

    .prologue
    .line 175
    instance-of v1, p2, Landroid/support/v7/internal/view/menu/MenuView$ItemView;

    #v1=(Boolean);
    if-eqz v1, :cond_0

    move-object v0, p2

    .line 176
    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/view/menu/MenuView$ItemView;

    .line 180
    .local v0, itemView:Landroid/support/v7/internal/view/menu/MenuView$ItemView;
    :goto_0
    invoke-virtual {p0, p1, v0}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->bindItemView(Landroid/support/v7/internal/view/menu/MenuItemImpl;Landroid/support/v7/internal/view/menu/MenuView$ItemView;)V

    .line 181
    check-cast v0, Landroid/view/View;

    .end local v0           #itemView:Landroid/support/v7/internal/view/menu/MenuView$ItemView;
    return-object v0

    .line 178
    :cond_0
    #v0=(Uninit);
    invoke-virtual {p0, p3}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->createItemView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView$ItemView;

    move-result-object v0

    .restart local v0       #itemView:Landroid/support/v7/internal/view/menu/MenuView$ItemView;
    #v0=(Reference);
    goto :goto_0
.end method

.method public getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
    .locals 3
    .parameter "root"

    .prologue
    .line 71
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 72
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mSystemInflater:Landroid/view/LayoutInflater;

    iget v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenuLayoutRes:I

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/view/menu/MenuView;

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    .line 73
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v7/internal/view/menu/MenuView;->initialize(Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 74
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->updateMenuView(Z)V

    .line 77
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v0=(Reference);
    return-object v0
.end method

.method public initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 1
    .parameter "context"
    .parameter "menu"

    .prologue
    .line 65
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mContext:Landroid/content/Context;

    .line 66
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mInflater:Landroid/view/LayoutInflater;

    .line 67
    iput-object p2, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 68
    return-void
.end method

.method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 1
    .parameter "menu"
    .parameter "allMenusAreClosing"

    .prologue
    .line 204
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;->onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V

    .line 207
    :cond_0
    return-void
.end method

.method public onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z
    .locals 1
    .parameter "menu"

    .prologue
    .line 210
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 211
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    invoke-interface {v0, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;->onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z

    move-result v0

    .line 213
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
    .locals 0
    .parameter "cb"

    .prologue
    .line 150
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    .line 151
    return-void
.end method

.method public setId(I)V
    .locals 0
    .parameter "id"

    .prologue
    .line 233
    iput p1, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mId:I

    .line 234
    return-void
.end method

.method public shouldIncludeItem(ILandroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 1
    .parameter "childIndex"
    .parameter "item"

    .prologue
    .line 200
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public updateMenuView(Z)V
    .locals 10
    .parameter "cleared"

    .prologue
    .line 84
    iget-object v7, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v7=(Reference);
    check-cast v7, Landroid/view/ViewGroup;

    .line 85
    .local v7, parent:Landroid/view/ViewGroup;
    if-nez v7, :cond_1

    .line 121
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-void

    .line 89
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);
    const/4 v0, 0x0

    .line 90
    .local v0, childIndex:I
    #v0=(Null);
    iget-object v9, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v9=(Reference);
    if-eqz v9, :cond_6

    .line 91
    iget-object v9, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v9}, Landroid/support/v7/internal/view/menu/MenuBuilder;->flagActionItems()V

    .line 92
    iget-object v9, p0, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v9}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v8

    .line 93
    .local v8, visibleItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    #v8=(Reference);
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 94
    .local v4, itemCount:I
    #v4=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);
    if-ge v2, v4, :cond_6

    .line 95
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 96
    .local v3, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {p0, v0, v3}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->shouldIncludeItem(ILandroid/support/v7/internal/view/menu/MenuItemImpl;)Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_4

    .line 97
    invoke-virtual {v7, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 98
    .local v1, convertView:Landroid/view/View;
    #v1=(Reference);
    instance-of v9, v1, Landroid/support/v7/internal/view/menu/MenuView$ItemView;

    if-eqz v9, :cond_5

    move-object v9, v1

    #v9=(Reference);
    check-cast v9, Landroid/support/v7/internal/view/menu/MenuView$ItemView;

    invoke-interface {v9}, Landroid/support/v7/internal/view/menu/MenuView$ItemView;->getItemData()Landroid/support/v7/internal/view/menu/MenuItemImpl;

    move-result-object v6

    .line 100
    .local v6, oldItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :goto_1
    #v6=(Reference);v9=(Conflicted);
    invoke-virtual {p0, v3, v1, v7}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->getItemView(Landroid/support/v7/internal/view/menu/MenuItemImpl;Landroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v5

    .line 101
    .local v5, itemView:Landroid/view/View;
    #v5=(Reference);
    if-eq v3, v6, :cond_2

    .line 103
    const/4 v9, 0x0

    #v9=(Null);
    invoke-virtual {v5, v9}, Landroid/view/View;->setPressed(Z)V

    .line 107
    :cond_2
    #v9=(Conflicted);
    if-eq v5, v1, :cond_3

    .line 108
    invoke-virtual {p0, v5, v0}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->addItemView(Landroid/view/View;I)V

    .line 110
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 94
    .end local v1           #convertView:Landroid/view/View;
    .end local v5           #itemView:Landroid/view/View;
    .end local v6           #oldItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_4
    #v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 98
    .restart local v1       #convertView:Landroid/view/View;
    :cond_5
    #v1=(Reference);v9=(Boolean);
    const/4 v6, 0x0

    #v6=(Null);
    goto :goto_1

    .line 116
    .end local v1           #convertView:Landroid/view/View;
    .end local v2           #i:I
    .end local v3           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .end local v4           #itemCount:I
    .end local v8           #visibleItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    :cond_6
    :goto_2
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v9

    #v9=(Integer);
    if-ge v0, v9, :cond_0

    .line 117
    invoke-virtual {p0, v7, v0}, Landroid/support/v7/internal/view/menu/BaseMenuPresenter;->filterLeftoverView(Landroid/view/ViewGroup;I)Z

    move-result v9

    #v9=(Boolean);
    if-nez v9, :cond_6

    .line 118
    add-int/lit8 v0, v0, 0x1

    goto :goto_2
.end method

*/}
