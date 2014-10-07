package android.support.v7.internal.widget; class ScrollingTabContainerView$1 {/*

.class Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;
.super Ljava/lang/Object;
.source "ScrollingTabContainerView.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/internal/widget/ScrollingTabContainerView;->animateToTab(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

.field final synthetic val$tabView:Landroid/view/View;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/view/View;)V
    .locals 0
    .parameter
    .parameter

    .prologue
    .line 211
    iput-object p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    iput-object p2, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->val$tabView:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 213
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->val$tabView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getWidth()I

    move-result v2

    #v2=(Integer);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->val$tabView:Landroid/view/View;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    #v3=(Integer);
    sub-int/2addr v2, v3

    div-int/lit8 v2, v2, 0x2

    sub-int v0, v1, v2

    .line 214
    .local v0, scrollPos:I
    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v1, v0, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->smoothScrollTo(II)V

    .line 215
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    const/4 v2, 0x0

    iput-object v2, v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    .line 216
    return-void
.end method

*/}
