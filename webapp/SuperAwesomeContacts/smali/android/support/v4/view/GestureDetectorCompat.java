package android.support.v4.view; class GestureDetectorCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/GestureDetectorCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "GestureDetectorCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;,
a=0;//         Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;,
a=0;//         Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "listener"    # Landroid/view/GestureDetector$OnGestureListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/view/GestureDetectorCompat;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
a=0;// 
a=0;//     .line 502
a=0;//     #p0=(Reference,Landroid/support/v4/view/GestureDetectorCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "listener"    # Landroid/view/GestureDetector$OnGestureListener;
a=0;//     .param p3, "handler"    # Landroid/os/Handler;
a=0;// 
a=0;//     .prologue
a=0;//     .line 514
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 515
a=0;//     #p0=(Reference,Landroid/support/v4/view/GestureDetectorCompat;);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     .line 516
a=0;//     new-instance v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;);
a=0;//     invoke-direct {v0, p1, p2, p3}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplJellybeanMr2;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;// 
a=0;//     .line 520
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 518
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;);
a=0;//     invoke-direct {v0, p1, p2, p3}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;Landroid/os/Handler;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImplBase;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isLongpressEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 526
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;);
a=0;//     invoke-interface {v0}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;->isLongpressEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 538
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;->onTouchEvent(Landroid/view/MotionEvent;)Z
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
a=0;//     .line 551
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;->setIsLongpressEnabled(Z)V
a=0;// 
a=0;//     .line 552
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/view/GestureDetector$OnDoubleTapListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     iget-object v0, p0, Landroid/support/v4/view/GestureDetectorCompat;->mImpl:Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/GestureDetectorCompat$GestureDetectorCompatImpl;->setOnDoubleTapListener(Landroid/view/GestureDetector$OnDoubleTapListener;)V
a=0;// 
a=0;//     .line 563
a=0;//     return-void
a=0;// .end method
}}
