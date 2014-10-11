package android.support.v4.view; class MotionEventCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/MotionEventCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MotionEventCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/MotionEventCompat$EclairMotionEventVersionImpl;,
a=0;//         Landroid/support/v4/view/MotionEventCompat$BaseMotionEventVersionImpl;,
a=0;//         Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ACTION_HOVER_ENTER:I = 0x9
a=0;// 
a=0;// .field public static final ACTION_HOVER_EXIT:I = 0xa
a=0;// 
a=0;// .field public static final ACTION_HOVER_MOVE:I = 0x7
a=0;// 
a=0;// .field public static final ACTION_MASK:I = 0xff
a=0;// 
a=0;// .field public static final ACTION_POINTER_DOWN:I = 0x5
a=0;// 
a=0;// .field public static final ACTION_POINTER_INDEX_MASK:I = 0xff00
a=0;// 
a=0;// .field public static final ACTION_POINTER_INDEX_SHIFT:I = 0x8
a=0;// 
a=0;// .field public static final ACTION_POINTER_UP:I = 0x6
a=0;// 
a=0;// .field public static final ACTION_SCROLL:I = 0x8
a=0;// 
a=0;// .field static final IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v0, Landroid/support/v4/view/MotionEventCompat$EclairMotionEventVersionImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/MotionEventCompat$EclairMotionEventVersionImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/MotionEventCompat$EclairMotionEventVersionImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MotionEventCompat$EclairMotionEventVersionImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;// 
a=0;//     .line 113
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 111
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/MotionEventCompat$BaseMotionEventVersionImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/MotionEventCompat$BaseMotionEventVersionImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/MotionEventCompat$BaseMotionEventVersionImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MotionEventCompat$BaseMotionEventVersionImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 80
a=0;//     #p0=(Reference,Landroid/support/v4/view/MotionEventCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;//     .locals 1
a=0;//     .param p0, "event"    # Landroid/view/MotionEvent;
a=0;//     .param p1, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getActionIndex(Landroid/view/MotionEvent;)I
a=0;//     .locals 2
a=0;//     .param p0, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 191
a=0;//     invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const v1, 0xff00
a=0;// 
a=0;//     #v1=(Char);
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     shr-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getActionMasked(Landroid/view/MotionEvent;)I
a=0;//     .locals 1
a=0;//     .param p0, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     invoke-virtual {p0}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0xff
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getPointerCount(Landroid/view/MotionEvent;)I
a=0;//     .locals 1
a=0;//     .param p0, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->getPointerCount(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getPointerId(Landroid/view/MotionEvent;I)I
a=0;//     .locals 1
a=0;//     .param p0, "event"    # Landroid/view/MotionEvent;
a=0;//     .param p1, "pointerIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getX(Landroid/view/MotionEvent;I)F
a=0;//     .locals 1
a=0;//     .param p0, "event"    # Landroid/view/MotionEvent;
a=0;//     .param p1, "pointerIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getY(Landroid/view/MotionEvent;I)F
a=0;//     .locals 1
a=0;//     .param p0, "event"    # Landroid/view/MotionEvent;
a=0;//     .param p1, "pointerIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     sget-object v0, Landroid/support/v4/view/MotionEventCompat;->IMPL:Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MotionEventCompat$MotionEventVersionImpl;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
}}
