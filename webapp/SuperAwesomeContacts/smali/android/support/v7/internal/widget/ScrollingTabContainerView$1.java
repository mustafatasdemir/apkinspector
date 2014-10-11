package android.support.v7.internal.widget; class ScrollingTabContainerView$1 { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ScrollingTabContainerView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v7/internal/widget/ScrollingTabContainerView;->animateToTab(I)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;// .field final synthetic val$tabView:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/view/View;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->val$tabView:Landroid/view/View;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->val$tabView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->val$tabView:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     div-int/lit8 v2, v2, 0x2
a=0;// 
a=0;//     sub-int v0, v1, v2
a=0;// 
a=0;//     .line 214
a=0;//     .local v0, "scrollPos":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->smoothScrollTo(II)V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     iput-object v2, v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 216
a=0;//     return-void
a=0;// .end method
}}
