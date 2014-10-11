package android.support.v4.view; class ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$3 { void a() { int a;
a=0;// .class Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewPropertyAnimatorCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPropertyAnimatorListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;->withLayer(Landroid/view/View;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;
a=0;// 
a=0;// .field final synthetic val$currentLayerType:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;I)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 414
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$3;->this$0:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;
a=0;// 
a=0;//     iput p2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$3;->val$currentLayerType:I
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationCancel(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 421
a=0;//     #v1=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$3;->val$currentLayerType:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1, v0, v1}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$3;->this$0:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;->setListener(Landroid/view/View;Landroid/support/v4/view/ViewPropertyAnimatorListener;)V
a=0;// 
a=0;//     .line 423
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 417
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1, v0, v1}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 418
a=0;//     return-void
a=0;// .end method
}}
