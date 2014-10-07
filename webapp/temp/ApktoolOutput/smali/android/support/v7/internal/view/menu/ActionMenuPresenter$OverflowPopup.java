package android.support.v7.internal.view.menu; class ActionMenuPresenter$OverflowPopup {/*

.class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
.super Landroid/support/v7/internal/view/menu/MenuPopupHelper;
.source "ActionMenuPresenter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OverflowPopup"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
    .locals 1
    .parameter
    .parameter "context"
    .parameter "menu"
    .parameter "anchorView"
    .parameter "overflowOnly"

    .prologue
    .line 606
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    .line 607
    invoke-direct {p0, p2, p3, p4, p5}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V

    .line 608
    #p0=(Reference);
    iget-object v0, p1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPopupPresenterCallback:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 609
    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .prologue
    .line 613
    invoke-super {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->onDismiss()V

    .line 614
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close()V

    .line 615
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->access$102(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    .line 616
    return-void
.end method

*/}
