package android.support.v4.widget; class SwipeRefreshLayout$2 { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SwipeRefreshLayout$2;
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
a=0;//     .line 115
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$2;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public applyTransformation(FLandroid/view/animation/Transformation;)V
a=0;//     .locals 4
a=0;//     .param p1, "interpolatedTime"    # F
a=0;//     .param p2, "t"    # Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$2;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$400(Landroid/support/v4/widget/SwipeRefreshLayout;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$2;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$400(Landroid/support/v4/widget/SwipeRefreshLayout;)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     sub-float/2addr v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v2, p1
a=0;// 
a=0;//     add-float v0, v1, v2
a=0;// 
a=0;//     .line 119
a=0;//     .local v0, "percent":F
a=0;//     #v0=(Float);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$2;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$500(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/SwipeProgressBar;->setTriggerPercentage(F)V
a=0;// 
a=0;//     .line 120
a=0;//     return-void
a=0;// .end method
}}
