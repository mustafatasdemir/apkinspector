package android.support.v7.internal.view.menu; class MenuItemWrapperICS$ActionProviderWrapper$1 {/*

.class Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;
.super Ljava/lang/Object;
.source "MenuItemWrapperICS.java"

# interfaces
.implements Landroid/support/v4/view/ActionProvider$VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;-><init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;Landroid/support/v4/view/ActionProvider;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;

.field final synthetic val$this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 400
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;

    iput-object p2, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->val$this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onActionProviderVisibilityChanged(Z)V
    .locals 1
    .parameter "isVisible"

    .prologue
    .line 403
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->overridesItemVisibility()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    invoke-static {v0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->access$100(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 404
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->wrappedSetVisible(Z)Landroid/view/MenuItem;

    .line 406
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

*/}
