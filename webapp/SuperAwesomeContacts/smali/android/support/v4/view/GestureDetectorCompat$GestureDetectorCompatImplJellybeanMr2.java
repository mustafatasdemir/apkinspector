package android.support.v4.view; class GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2 { void a() { int a;
a=0;// .class Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "GestureDetectorCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/GestureDetectorCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "GestureDetectorCompatImplJellybeanMr2"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "listener"    # Landroid/view/GestureDetector$OnGestureListener;
a=0;//     .param p3, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 464
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 465
a=0;//     #p0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;);
a=0;//     new-instance v0, Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/GestureDetector;);
a=0;//     invoke-direct {v0, p1, p2, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;->mDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     .line 466
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isLongpressEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;->mDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v0}, Landroid/view/GestureDetector;->isLongpressEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;->mDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setIsLongpressEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 480
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;->mDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setIsLongpressEnabled(Z)V
a=0;// 
a=0;//     .line 481
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 485
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;->mDetector:Landroid/view/GestureDetector;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/GestureDetector;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
a=0;// 
a=0;//     .line 486
a=0;//     return-void
a=0;// .end method
}}
