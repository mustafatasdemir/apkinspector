package android.support.v7.internal.view.menu; class ActionMenuPresenter$OpenOverflowRunnable {/*

.class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
.super Ljava/lang/Object;
.source "ActionMenuPresenter.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OpenOverflowRunnable"
.end annotation


# instance fields
.field private mPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

.field final synthetic this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;)V
    .locals 0
    .parameter
    .parameter "popup"

    .prologue
    .line 658
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 659
    #p0=(Reference);
    iput-object p2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->mPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    .line 660
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 663
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v1=(Reference);
    iget-object v1, v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->changeMenuMode()V

    .line 664
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    iget-object v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;

    #v0=(Reference);
    check-cast v0, Landroid/view/View;

    .line 665
    .local v0, menuView:Landroid/view/View;
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->mPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->tryShow()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 666
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->mPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->access$102(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;

    .line 668
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->access$302(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;

    .line 669
    return-void
.end method

*/}
