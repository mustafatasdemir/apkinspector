package android.support.v4.view; class VelocityTrackerCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/view/VelocityTrackerCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "VelocityTrackerCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl;,
a=0;//         Landroid/support/v4/view/VelocityTrackerCompat$BaseVelocityTrackerVersionImpl;,
a=0;//         Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Landroid/support/v4/view/VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/VelocityTrackerCompat$HoneycombVelocityTrackerVersionImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/VelocityTrackerCompat;->IMPL:Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;
a=0;// 
a=0;//     .line 72
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 70
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/VelocityTrackerCompat$BaseVelocityTrackerVersionImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/VelocityTrackerCompat$BaseVelocityTrackerVersionImpl;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/VelocityTrackerCompat$BaseVelocityTrackerVersionImpl;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/VelocityTrackerCompat$BaseVelocityTrackerVersionImpl;);
a=0;//     sput-object v0, Landroid/support/v4/view/VelocityTrackerCompat;->IMPL:Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;
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
a=0;//     .line 51
a=0;//     #p0=(Reference,Landroid/support/v4/view/VelocityTrackerCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;//     .locals 1
a=0;//     .param p0, "tracker"    # Landroid/view/VelocityTracker;
a=0;//     .param p1, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     sget-object v0, Landroid/support/v4/view/VelocityTrackerCompat;->IMPL:Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getYVelocity(Landroid/view/VelocityTracker;I)F
a=0;//     .locals 1
a=0;//     .param p0, "tracker"    # Landroid/view/VelocityTracker;
a=0;//     .param p1, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 91
a=0;//     sget-object v0, Landroid/support/v4/view/VelocityTrackerCompat;->IMPL:Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/view/VelocityTrackerCompat$VelocityTrackerVersionImpl;->getYVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
}}
