package android.support.v7.internal.view.menu; class ActionMenuView$LayoutParams {/*

.class public Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;
.super Landroid/widget/LinearLayout$LayoutParams;
.source "ActionMenuView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/ActionMenuView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field public cellsUsed:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public expandable:Z
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public expanded:Z

.field public extraPixels:I
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public isOverflowButton:Z
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field

.field public preventEdgeOffset:Z
    .annotation runtime Landroid/view/ViewDebug$ExportedProperty;
    .end annotation
.end field


# direct methods
.method public constructor <init>(II)V
    .locals 1
    .parameter "width"
    .parameter "height"

    .prologue
    .line 608
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 609
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    .line 610
    return-void
.end method

.method public constructor <init>(IIZ)V
    .locals 0
    .parameter "width"
    .parameter "height"
    .parameter "isOverflowButton"

    .prologue
    .line 613
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 614
    #p0=(Reference);
    iput-boolean p3, p0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    .line 615
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter "c"
    .parameter "attrs"

    .prologue
    .line 599
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 600
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;)V
    .locals 1
    .parameter "other"

    .prologue
    .line 603
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/widget/LinearLayout$LayoutParams;)V

    .line 604
    #p0=(Reference);
    iget-boolean v0, p1, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuView$LayoutParams;->isOverflowButton:Z

    .line 605
    return-void
.end method

*/}
