package android.support.v4.widget; class SlidingPaneLayout$SlidingPanelLayoutImplJBMR1 { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;
a=0;// .super Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;
a=0;// .source "SlidingPaneLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "SlidingPanelLayoutImplJBMR1"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1531
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "parent"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1534
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     invoke-static {p2, v0}, Landroid/support/v4/view/ViewCompat;->setLayerPaint(Landroid/view/View;Landroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 1535
a=0;//     return-void
a=0;// .end method
}}
