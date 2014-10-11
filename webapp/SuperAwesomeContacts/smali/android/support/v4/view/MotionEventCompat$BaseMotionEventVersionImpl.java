package android.support.v4.view; class MotionEventCompat$BaseMotionEventVersionImpl { void a() { int a;
a=0;// .class Landroid/support/v4/view/MotionEventCompat$BaseMotionEventVersionImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MotionEventCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/MotionEventCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "BaseMotionEventVersionImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/MotionEventCompat$BaseMotionEventVersionImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 45
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 47
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPointerCount(Landroid/view/MotionEvent;)I
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPointerId(Landroid/view/MotionEvent;I)I
a=0;//     .locals 2
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "pointerIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IndexOutOfBoundsException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     const-string v1, "Pre-Eclair does not support multiple pointers"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getX(Landroid/view/MotionEvent;I)F
a=0;//     .locals 2
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "pointerIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IndexOutOfBoundsException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     const-string v1, "Pre-Eclair does not support multiple pointers"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getY(Landroid/view/MotionEvent;I)F
a=0;//     .locals 2
a=0;//     .param p1, "event"    # Landroid/view/MotionEvent;
a=0;//     .param p2, "pointerIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IndexOutOfBoundsException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     const-string v1, "Pre-Eclair does not support multiple pointers"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IndexOutOfBoundsException;);
a=0;//     throw v0
a=0;// .end method
}}
