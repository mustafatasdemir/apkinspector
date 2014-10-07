package android.support.v7.internal.view.menu; class MenuItemWrapperICS$OnMenuItemClickListenerWrapper {/*

.class Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;
.super Landroid/support/v7/internal/view/menu/BaseWrapper;
.source "MenuItemWrapperICS.java"

# interfaces
.implements Landroid/view/MenuItem$OnMenuItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OnMenuItemClickListenerWrapper"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroid/support/v7/internal/view/menu/BaseWrapper",
        "<",
        "Landroid/view/MenuItem$OnMenuItemClickListener;",
        ">;",
        "Landroid/view/MenuItem$OnMenuItemClickListener;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;Landroid/view/MenuItem$OnMenuItemClickListener;)V
    .locals 0
    .parameter
    .parameter "object"

    .prologue
    .line 364
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    .line 365
    invoke-direct {p0, p2}, Landroid/support/v7/internal/view/menu/BaseWrapper;-><init>(Ljava/lang/Object;)V

    .line 366
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onMenuItemClick(Landroid/view/MenuItem;)Z
    .locals 2
    .parameter "item"

    .prologue
    .line 370
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;->mWrappedObject:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/view/MenuItem$OnMenuItemClickListener;

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
