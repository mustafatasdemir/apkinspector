package android.support.v7.internal.widget; class ActionBarView$3 {/*

.class Landroid/support/v7/internal/widget/ActionBarView$3;
.super Ljava/lang/Object;
.source "ActionBarView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActionBarView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ActionBarView;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/ActionBarView;)V
    .locals 0
    .parameter

    .prologue
    .line 159
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView$3;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3
    .parameter "v"

    .prologue
    .line 161
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView$3;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mWindowCallback:Landroid/view/Window$Callback;

    const/4 v1, 0x0

    #v1=(Null);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView$3;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v2=(Reference);
    invoke-static {v2}, Landroid/support/v7/internal/widget/ActionBarView;->access$200(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/view/menu/ActionMenuItem;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/view/Window$Callback;->onMenuItemSelected(ILandroid/view/MenuItem;)Z

    .line 162
    return-void
.end method

*/}
