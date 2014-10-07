package android.support.v4.graphics.drawable; class DrawableCompat {/*

.class public Landroid/support/v4/graphics/drawable/DrawableCompat;
.super Ljava/lang/Object;
.source "DrawableCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/graphics/drawable/DrawableCompat$KitKatDrawableImpl;,
        Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;,
        Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;,
        Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;
    }
.end annotation


# static fields
.field static final IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 83
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 84
    .local v0, version:I
    #v0=(Integer);
    const/16 v1, 0x13

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 85
    new-instance v1, Landroid/support/v4/graphics/drawable/DrawableCompat$KitKatDrawableImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/graphics/drawable/DrawableCompat$KitKatDrawableImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;

    .line 91
    :goto_0
    return-void

    .line 86
    :cond_0
    #v1=(PosByte);
    const/16 v1, 0xb

    if-lt v0, v1, :cond_1

    .line 87
    new-instance v1, Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;

    goto :goto_0

    .line 89
    :cond_1
    #v1=(PosByte);
    new-instance v1, Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/graphics/drawable/DrawableCompat$BaseDrawableImpl;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    #p0=(Reference);
    return-void
.end method

.method public static isAutoMirrored(Landroid/graphics/drawable/Drawable;)Z
    .locals 1
    .parameter "drawable"

    .prologue
    .line 133
    sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->isAutoMirrored(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static jumpToCurrentState(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "drawable"

    .prologue
    .line 102
    sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->jumpToCurrentState(Landroid/graphics/drawable/Drawable;)V

    .line 103
    return-void
.end method

.method public static setAutoMirrored(Landroid/graphics/drawable/Drawable;Z)V
    .locals 1
    .parameter "drawable"
    .parameter "mirrored"

    .prologue
    .line 118
    sget-object v0, Landroid/support/v4/graphics/drawable/DrawableCompat;->IMPL:Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/graphics/drawable/DrawableCompat$DrawableImpl;->setAutoMirrored(Landroid/graphics/drawable/Drawable;Z)V

    .line 119
    return-void
.end method

*/}
