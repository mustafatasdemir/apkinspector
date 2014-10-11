package android.support.v4.widget; class AutoScrollHelper$ScrollAnimationRunnable { void a() { int a;
a=0;// .class Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AutoScrollHelper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/AutoScrollHelper;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ScrollAnimationRunnable"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v4/widget/AutoScrollHelper;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 684
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v4/widget/AutoScrollHelper;Landroid/support/v4/widget/AutoScrollHelper$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .param p2, "x1"    # Landroid/support/v4/widget/AutoScrollHelper$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 684
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;-><init>(Landroid/support/v4/widget/AutoScrollHelper;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 687
a=0;//     #v4=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/AutoScrollHelper;->access$100(Landroid/support/v4/widget/AutoScrollHelper;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 715
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 691
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/AutoScrollHelper;->access$200(Landroid/support/v4/widget/AutoScrollHelper;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 692
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->access$202(Landroid/support/v4/widget/AutoScrollHelper;Z)Z
a=0;// 
a=0;//     .line 693
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/AutoScrollHelper;->access$300(Landroid/support/v4/widget/AutoScrollHelper;)Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->start()V
a=0;// 
a=0;//     .line 696
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/AutoScrollHelper;->access$300(Landroid/support/v4/widget/AutoScrollHelper;)Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 697
a=0;//     .local v2, "scroller":Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;//     #v2=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->isFinished()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/AutoScrollHelper;->access$400(Landroid/support/v4/widget/AutoScrollHelper;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 698
a=0;//     :cond_2
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->access$102(Landroid/support/v4/widget/AutoScrollHelper;Z)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 702
a=0;//     :cond_3
a=0;//     #v3=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/AutoScrollHelper;->access$500(Landroid/support/v4/widget/AutoScrollHelper;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 703
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->access$502(Landroid/support/v4/widget/AutoScrollHelper;Z)Z
a=0;// 
a=0;//     .line 704
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/AutoScrollHelper;->access$600(Landroid/support/v4/widget/AutoScrollHelper;)V
a=0;// 
a=0;//     .line 707
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->computeScrollDelta()V
a=0;// 
a=0;//     .line 709
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getDeltaX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 710
a=0;//     .local v0, "deltaX":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getDeltaY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 711
a=0;//     .local v1, "deltaY":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/support/v4/widget/AutoScrollHelper;->scrollTargetBy(II)V
a=0;// 
a=0;//     .line 714
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;->this$0:Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v4/widget/AutoScrollHelper;->access$700(Landroid/support/v4/widget/AutoScrollHelper;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, p0}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
