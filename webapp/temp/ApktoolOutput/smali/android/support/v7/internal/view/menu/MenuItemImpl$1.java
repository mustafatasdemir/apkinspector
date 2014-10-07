package android.support.v7.internal.view.menu; class MenuItemImpl$1 {/*

.class Landroid/support/v7/internal/view/menu/MenuItemImpl$1;
.super Ljava/lang/Object;
.source "MenuItemImpl.java"

# interfaces
.implements Landroid/support/v4/view/ActionProvider$VisibilityListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/internal/view/menu/MenuItemImpl;->setSupportActionProvider(Landroid/support/v4/view/ActionProvider;)Landroid/support/v4/internal/view/SupportMenuItem;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/view/menu/MenuItemImpl;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
    .locals 0
    .parameter

    .prologue
    .line 662
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl$1;->this$0:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onActionProviderVisibilityChanged(Z)V
    .locals 2
    .parameter "isVisible"

    .prologue
    .line 665
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl$1;->this$0:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->access$000(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Landroid/support/v7/internal/view/menu/MenuBuilder;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl$1;->this$0:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemVisibleChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V

    .line 666
    return-void
.end method

*/}
