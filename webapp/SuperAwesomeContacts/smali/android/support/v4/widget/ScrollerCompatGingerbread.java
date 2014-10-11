package android.support.v4.widget; class ScrollerCompatGingerbread { void a() { int a;
a=0;// .class Landroid/support/v4/widget/ScrollerCompatGingerbread;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ScrollerCompatGingerbread.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ScrollerCompatGingerbread;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static abortAnimation(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/OverScroller;->abortAnimation()V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static computeScrollOffset(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/OverScroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static createScroller(Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "interpolator"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/OverScroller;);
a=0;//     invoke-direct {v0, p0, p1}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/widget/OverScroller;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/widget/OverScroller;);
a=0;//     invoke-direct {v0, p0}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/OverScroller;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static fling(Ljava/lang/Object;IIIIIIII)V
a=0;//     .locals 9
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "startY"    # I
a=0;//     .param p3, "velX"    # I
a=0;//     .param p4, "velY"    # I
a=0;//     .param p5, "minX"    # I
a=0;//     .param p6, "maxX"    # I
a=0;//     .param p7, "minY"    # I
a=0;//     .param p8, "maxY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 57
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move v6, p6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move/from16 v7, p7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move/from16 v8, p8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {v0 .. v8}, Landroid/widget/OverScroller;->fling(IIIIIIII)V
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static fling(Ljava/lang/Object;IIIIIIIIII)V
a=0;//     .locals 11
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "startY"    # I
a=0;//     .param p3, "velX"    # I
a=0;//     .param p4, "velY"    # I
a=0;//     .param p5, "minX"    # I
a=0;//     .param p6, "maxX"    # I
a=0;//     .param p7, "minY"    # I
a=0;//     .param p8, "maxY"    # I
a=0;//     .param p9, "overX"    # I
a=0;//     .param p10, "overY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move/from16 v5, p5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move/from16 v6, p6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move/from16 v7, p7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move/from16 v8, p8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move/from16 v9, p9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     move/from16 v10, p10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual/range {v0 .. v10}, Landroid/widget/OverScroller;->fling(IIIIIIIIII)V
a=0;// 
a=0;//     .line 64
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getCurrX(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/OverScroller;->getCurrX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getCurrY(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/OverScroller;->getCurrY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFinalX(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/OverScroller;->getFinalX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getFinalY(Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/OverScroller;->getFinalY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isFinished(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/OverScroller;->isFinished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isOverScrolled(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 80
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0}, Landroid/widget/OverScroller;->isOverScrolled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static notifyHorizontalEdgeReached(Ljava/lang/Object;III)V
a=0;//     .locals 0
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "finalX"    # I
a=0;//     .param p3, "overX"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/widget/OverScroller;->notifyHorizontalEdgeReached(III)V
a=0;// 
a=0;//     .line 73
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static notifyVerticalEdgeReached(Ljava/lang/Object;III)V
a=0;//     .locals 0
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;//     .param p1, "startY"    # I
a=0;//     .param p2, "finalY"    # I
a=0;//     .param p3, "overY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/widget/OverScroller;->notifyVerticalEdgeReached(III)V
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static startScroll(Ljava/lang/Object;IIII)V
a=0;//     .locals 0
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "startY"    # I
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "dy"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     check-cast p0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     .end local p0    # "scroller":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Landroid/widget/OverScroller;->startScroll(IIII)V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static startScroll(Ljava/lang/Object;IIIII)V
a=0;//     .locals 6
a=0;//     .param p0, "scroller"    # Ljava/lang/Object;
a=0;//     .param p1, "startX"    # I
a=0;//     .param p2, "startY"    # I
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "dy"    # I
a=0;//     .param p5, "duration"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/widget/OverScroller;
a=0;// 
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/OverScroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
}}
