package android.support.v4.widget; class SlidingPaneLayout$SlidingPanelLayoutImplBase { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SlidingPaneLayout.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "SlidingPanelLayoutImplBase"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1480
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "parent"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1482
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1, v0, v1, v2, v3}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 1484
a=0;//     return-void
a=0;// .end method
}}
