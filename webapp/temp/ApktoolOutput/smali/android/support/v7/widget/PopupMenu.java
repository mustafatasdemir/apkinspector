package android.support.v7.widget; class PopupMenu {/*

.class public Landroid/support/v7/widget/PopupMenu;
.super Ljava/lang/Object;
.source "PopupMenu.java"

# interfaces
.implements Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
.implements Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;,
        Landroid/support/v7/widget/PopupMenu$OnDismissListener;
    }
.end annotation


# instance fields
.field private mAnchor:Landroid/view/View;

.field private mContext:Landroid/content/Context;

.field private mDismissListener:Landroid/support/v7/widget/PopupMenu$OnDismissListener;

.field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private mMenuItemClickListener:Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;

.field private mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
    .locals 2
    .parameter "context"
    .parameter "anchor"

    .prologue
    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/widget/PopupMenu;->mContext:Landroid/content/Context;

    .line 67
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 68
    iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setCallback(Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;)V

    .line 69
    iput-object p2, p0, Landroid/support/v7/widget/PopupMenu;->mAnchor:Landroid/view/View;

    .line 70
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v1=(Reference);
    invoke-direct {v0, p1, v1, p2}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;

    .line 71
    iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 72
    return-void
.end method


# virtual methods
.method public dismiss()V
    .locals 1

    .prologue
    .line 117
    iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->dismiss()V

    .line 118
    return-void
.end method

.method public getMenu()Landroid/view/Menu;
    .locals 1

    .prologue
    .line 82
    iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    return-object v0
.end method

.method public getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .prologue
    .line 92
    new-instance v0, Landroid/support/v7/internal/view/SupportMenuInflater;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v7/widget/PopupMenu;->mContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/support/v7/internal/view/SupportMenuInflater;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    return-object v0
.end method

.method public inflate(I)V
    .locals 2
    .parameter "menuRes"

    .prologue
    .line 101
    invoke-virtual {p0}, Landroid/support/v7/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v1=(Reference);
    invoke-virtual {v0, p1, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V

    .line 102
    return-void
.end method

.method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 1
    .parameter "menu"
    .parameter "allMenusAreClosing"

    .prologue
    .line 152
    iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mDismissListener:Landroid/support/v7/widget/PopupMenu$OnDismissListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 153
    iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mDismissListener:Landroid/support/v7/widget/PopupMenu$OnDismissListener;

    invoke-interface {v0, p0}, Landroid/support/v7/widget/PopupMenu$OnDismissListener;->onDismiss(Landroid/support/v7/widget/PopupMenu;)V

    .line 155
    :cond_0
    return-void
.end method

.method public onCloseSubMenu(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V
    .locals 0
    .parameter "menu"

    .prologue
    .line 176
    return-void
.end method

.method public onMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
    .locals 1
    .parameter "menu"
    .parameter "item"

    .prologue
    .line 142
    iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenuItemClickListener:Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 143
    iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenuItemClickListener:Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;

    invoke-interface {v0, p2}, Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v0

    .line 145
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public onMenuModeChange(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 0
    .parameter "menu"

    .prologue
    .line 182
    return-void
.end method

.method public onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
    .locals 4
    .parameter "subMenu"

    .prologue
    const/4 v0, 0x1

    .line 161
    #v0=(One);
    if-nez p1, :cond_1

    const/4 v0, 0x0

    .line 169
    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    .line 163
    :cond_1
    #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->hasVisibleItems()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 168
    new-instance v1, Landroid/support/v7/internal/view/menu/MenuPopupHelper;

    #v1=(UninitRef);
    iget-object v2, p0, Landroid/support/v7/widget/PopupMenu;->mContext:Landroid/content/Context;

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v7/widget/PopupMenu;->mAnchor:Landroid/view/View;

    #v3=(Reference);
    invoke-direct {v1, v2, p1, v3}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;)V

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->show()V

    goto :goto_0
.end method

.method public setOnDismissListener(Landroid/support/v7/widget/PopupMenu$OnDismissListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 135
    iput-object p1, p0, Landroid/support/v7/widget/PopupMenu;->mDismissListener:Landroid/support/v7/widget/PopupMenu$OnDismissListener;

    .line 136
    return-void
.end method

.method public setOnMenuItemClickListener(Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 126
    iput-object p1, p0, Landroid/support/v7/widget/PopupMenu;->mMenuItemClickListener:Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;

    .line 127
    return-void
.end method

.method public show()V
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->show()V

    .line 110
    return-void
.end method

*/}
