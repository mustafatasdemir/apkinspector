package android.support.v7.internal.view.menu; class ActionMenuPresenter$OverflowMenuButton {/*

.class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;
.super Landroid/widget/ImageButton;
.source "ActionMenuPresenter.java"

# interfaces
.implements Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "OverflowMenuButton"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;)V
    .locals 3
    .parameter
    .parameter "context"

    .prologue
    const/4 v2, 0x1

    .line 574
    #v2=(One);
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    .line 575
    const/4 v0, 0x0

    #v0=(Null);
    sget v1, Landroid/support/v7/appcompat/R$attr;->actionOverflowButtonStyle:I

    #v1=(Integer);
    invoke-direct {p0, p2, v0, v1}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 577
    #p0=(Reference);
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setClickable(Z)V

    .line 578
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setFocusable(Z)V

    .line 579
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setVisibility(I)V

    .line 580
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->setEnabled(Z)V

    .line 581
    return-void
.end method


# virtual methods
.method public needsDividerAfter()Z
    .locals 1

    .prologue
    .line 599
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public needsDividerBefore()Z
    .locals 1

    .prologue
    .line 595
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public performClick()Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 585
    #v1=(One);
    invoke-super {p0}, Landroid/widget/ImageButton;->performClick()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 591
    :goto_0
    #v0=(Conflicted);
    return v1

    .line 589
    :cond_0
    #v0=(Boolean);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->playSoundEffect(I)V

    .line 590
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowMenuButton;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z

    goto :goto_0
.end method

*/}
