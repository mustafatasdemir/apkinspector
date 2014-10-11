package android.support.v4.widget; class SwipeRefreshLayout$6 { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SwipeRefreshLayout$6;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SwipeRefreshLayout.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
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
a=0;//     .line 151
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$6;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$902(Landroid/support/v4/widget/SwipeRefreshLayout;Z)Z
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$500(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$800(Landroid/support/v4/widget/SwipeRefreshLayout;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$402(Landroid/support/v4/widget/SwipeRefreshLayout;F)F
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1300(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1200(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 161
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1300(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1400(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1300(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1300(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1500(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1300(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 166
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$700(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout$6;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     invoke-static {v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1000(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$1100(Landroid/support/v4/widget/SwipeRefreshLayout;ILandroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 168
a=0;//     return-void
a=0;// .end method
}}
