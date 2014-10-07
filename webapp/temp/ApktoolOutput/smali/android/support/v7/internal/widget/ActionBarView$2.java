package android.support.v7.internal.widget; class ActionBarView$2 {/*

.class Landroid/support/v7/internal/widget/ActionBarView$2;
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
    .line 149
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView$2;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter "v"

    .prologue
    .line 152
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$2;->this$0:Landroid/support/v7/internal/widget/ActionBarView;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v7/internal/widget/ActionBarView;->access$100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    move-result-object v1

    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 153
    .local v0, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 154
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->collapseActionView()Z

    .line 156
    :cond_0
    return-void
.end method

*/}
