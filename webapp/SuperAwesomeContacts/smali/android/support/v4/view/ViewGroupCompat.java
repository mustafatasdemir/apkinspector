package android.support.v4.view; class ViewGroupCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/ViewGroupCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewGroupCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatJellybeanMR2Impl;,
a=0;//         Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;,
a=0;//         Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatHCImpl;,
a=0;//         Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;,
a=0;//         Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;// .field public static final LAYOUT_MODE_CLIP_BOUNDS:I = 0x0
a=0;// 
a=0;// .field public static final LAYOUT_MODE_OPTICAL_BOUNDS:I = 0x1
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 106
a=0;//     .local v0, "version":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x12
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     new-instance v1, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatJellybeanMR2Impl;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatJellybeanMR2Impl;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatJellybeanMR2Impl;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatJellybeanMR2Impl;);
a=0;//     sput-object v1, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     .line 115
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 108
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 109
a=0;//     new-instance v1, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatIcsImpl;);
a=0;//     sput-object v1, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 111
a=0;//     new-instance v1, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatHCImpl;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatHCImpl;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatHCImpl;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatHCImpl;);
a=0;//     sput-object v1, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 113
a=0;//     :cond_2
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatStubImpl;);
a=0;//     sput-object v1, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 122
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewGroupCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getLayoutMode(Landroid/view/ViewGroup;)I
a=0;//     .locals 1
a=0;//     .param p0, "group"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->getLayoutMode(Landroid/view/ViewGroup;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 1
a=0;//     .param p0, "group"    # Landroid/view/ViewGroup;
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1, p2}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->onRequestSendAccessibilityEvent(Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static setLayoutMode(Landroid/view/ViewGroup;I)V
a=0;//     .locals 1
a=0;//     .param p0, "group"    # Landroid/view/ViewGroup;
a=0;//     .param p1, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->setLayoutMode(Landroid/view/ViewGroup;I)V
a=0;// 
a=0;//     .line 191
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setMotionEventSplittingEnabled(Landroid/view/ViewGroup;Z)V
a=0;//     .locals 1
a=0;//     .param p0, "group"    # Landroid/view/ViewGroup;
a=0;//     .param p1, "split"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     sget-object v0, Landroid/support/v4/view/ViewGroupCompat;->IMPL:Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ViewGroupCompat$ViewGroupCompatImpl;->setMotionEventSplittingEnabled(Landroid/view/ViewGroup;Z)V
a=0;// 
a=0;//     .line 162
a=0;//     return-void
a=0;// .end method
}}
