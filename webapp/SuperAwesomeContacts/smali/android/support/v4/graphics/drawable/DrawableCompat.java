package android.support.v4.graphics.drawable; class DrawableCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/graphics/drawable/DrawableCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DrawableCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/graphics/drawable/DrawableCompat$KitKatDrawableImpl;,
a=0;//         Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;,
a=0;//         Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;,
a=0;//         Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 84
a=0;//     .local v0, "version":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x13
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 85
a=0;//     new-instance v1, Landroid/support/v4/graphics/drawable/DrawableCompat$KitKatDrawableImpl;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/graphics/drawable/DrawableCompat$KitKatDrawableImpl;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/graphics/drawable/DrawableCompat$KitKatDrawableImpl;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat$KitKatDrawableImpl;);
a=0;//     sput-object v1, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;//     .line 91
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 87
a=0;//     new-instance v1, Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;);
a=0;//     sput-object v1, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;);
a=0;//     sput-object v1, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
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
a=0;//     .line 66
a=0;//     #p0=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static isAutoMirrored(Landroid/graphics/drawable/Drawable;)Z
a=0;//     .locals 1
a=0;//     .param p0, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->isAutoMirrored(Landroid/graphics/drawable/Drawable;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static jumpToCurrentState(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p0, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->jumpToCurrentState(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 103
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setAutoMirrored(Landroid/graphics/drawable/Drawable;Z)V
a=0;//     .locals 1
a=0;//     .param p0, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p1, "mirrored"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->setAutoMirrored(Landroid/graphics/drawable/Drawable;Z)V
a=0;// 
a=0;//     .line 119
a=0;//     return-void
a=0;// .end method
}}
