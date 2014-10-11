package android.support.v4.hardware.display; class DisplayManagerCompat { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DisplayManagerCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;,
a=0;//         Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final DISPLAY_CATEGORY_PRESENTATION:Ljava/lang/String; = "android.hardware.display.category.PRESENTATION"
a=0;// 
a=0;// .field private static final sInstances:Ljava/util/WeakHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/WeakHashMap",
a=0;//             "<",
a=0;//             "Landroid/content/Context;",
a=0;//             "Landroid/support/v4/hardware/display/DisplayManagerCompat;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v0, Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/WeakHashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     sput-object v0, Landroid/support/v4/hardware/display/DisplayManagerCompat;->sInstances:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Landroid/support/v4/hardware/display/DisplayManagerCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Landroid/content/Context;)Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;//     .locals 4
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sget-object v3, Landroid/support/v4/hardware/display/DisplayManagerCompat;->sInstances:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/WeakHashMap;);
a=0;//     monitor-enter v3
a=0;// 
a=0;//     .line 55
a=0;//     :try_start_0
a=0;//     sget-object v2, Landroid/support/v4/hardware/display/DisplayManagerCompat;->sInstances:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v2, p0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;// 
a=0;//     .line 56
a=0;//     .local v0, "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 58
a=0;//     .local v1, "version":I
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;
a=0;// 
a=0;//     .end local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;//     #v0=(UninitRef,Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat$JellybeanMr1Impl;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 63
a=0;//     .restart local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     sget-object v2, Landroid/support/v4/hardware/display/DisplayManagerCompat;->sInstances:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v2, p0, v0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 65
a=0;//     .end local v1    # "version":I
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit v3
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
a=0;//     .restart local v1    # "version":I
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(PosByte);
a=0;//     new-instance v0, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;
a=0;// 
a=0;//     .end local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;//     #v0=(UninitRef,Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .restart local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;//     #v0=(Reference,Landroid/support/v4/hardware/display/DisplayManagerCompat$LegacyImpl;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 66
a=0;//     .end local v0    # "instance":Landroid/support/v4/hardware/display/DisplayManagerCompat;
a=0;//     .end local v1    # "version":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v3
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract getDisplay(I)Landroid/view/Display;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getDisplays()[Landroid/view/Display;
a=0;// .end method
a=0;// 
a=0;// .method public abstract getDisplays(Ljava/lang/String;)[Landroid/view/Display;
a=0;// .end method
}}
