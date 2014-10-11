package android.support.v4.widget; class SwipeRefreshLayout$1 { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SwipeRefreshLayout$1;
a=0;// .super Landroid/view/animation/Animation;
a=0;// .source "SwipeRefreshLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public applyTransformation(FLandroid/view/animation/Transformation;)V
a=0;//     .locals 6
a=0;//     .param p1, "interpolatedTime"    # F
a=0;//     .param p2, "t"    # Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 103
a=0;//     .local v2, "targetTop":I
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$000(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$100(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$000(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$100(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$000(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v4, v5
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v4, p1
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v2, v3, v4
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     #v2=(Integer);v5=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$200(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v1, v2, v3
a=0;// 
a=0;//     .line 107
a=0;//     .local v1, "offset":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$200(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 108
a=0;//     .local v0, "currentTop":I
a=0;//     #v0=(Integer);
a=0;//     add-int v3, v1, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gez v3, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     rsub-int/lit8 v1, v0, 0x0
a=0;// 
a=0;//     .line 111
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v3, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$300(Landroid/support/v4/widget/SwipeRefreshLayout;I)V
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
}}
