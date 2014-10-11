package android.support.v4.view; class ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$2 { void a() { int a;
a=0;// .class Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewPropertyAnimatorCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPropertyAnimatorListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;->withStartAction(Landroid/view/View;Ljava/lang/Runnable;)V
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
a=0;// .field final synthetic val$runnable:Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;Ljava/lang/Runnable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 394
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$2;->this$0:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$2;->val$runnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$2;);
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
a=0;//     .line 407
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationEnd(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 403
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 397
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$2;->val$runnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface {v0}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     .line 398
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl$2;->this$0:Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$ICSViewPropertyAnimatorCompatImpl;->setListener(Landroid/view/View;Landroid/support/v4/view/ViewPropertyAnimatorListener;)V
a=0;// 
a=0;//     .line 399
a=0;//     return-void
a=0;// .end method
}}
