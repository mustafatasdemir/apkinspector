package android.support.v7.internal.view.menu; class MenuItemWrapperICS$ActionProviderWrapper {/*

.class Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
.super Landroid/view/ActionProvider;
.source "MenuItemWrapperICS.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "ActionProviderWrapper"
.end annotation


# instance fields
.field final mInner:Landroid/support/v4/view/ActionProvider;

.field final synthetic this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;Landroid/support/v4/view/ActionProvider;)V
    .locals 2
    .parameter
    .parameter "inner"

    .prologue
    .line 395
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    .line 396
    invoke-virtual {p2}, Landroid/support/v4/view/ActionProvider;->getContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    invoke-direct {p0, v0}, Landroid/view/ActionProvider;-><init>(Landroid/content/Context;)V

    .line 397
    #p0=(Reference);
    iput-object p2, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;

    .line 399
    invoke-static {p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->access$000(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 400
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;

    #v0=(Reference);
    new-instance v1, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;-><init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/ActionProvider;->setVisibilityListener(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V

    .line 409
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method


# virtual methods
.method public hasSubMenu()Z
    .locals 1

    .prologue
    .line 428
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->hasSubMenu()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public onCreateActionView()Landroid/view/View;
    .locals 1

    .prologue
    .line 413
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->access$000(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 416
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->checkActionProviderOverrideVisibility()Z

    .line 418
    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->onCreateActionView()Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public onPerformDefaultAction()Z
    .locals 1

    .prologue
    .line 423
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->onPerformDefaultAction()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public onPrepareSubMenu(Landroid/view/SubMenu;)V
    .locals 2
    .parameter "subMenu"

    .prologue
    .line 433
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V

    .line 434
    return-void
.end method

*/}
