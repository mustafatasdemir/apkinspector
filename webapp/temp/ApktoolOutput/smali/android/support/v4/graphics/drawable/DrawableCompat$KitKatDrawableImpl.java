package android.support.v4.graphics.drawable; class DrawableCompat$KitKatDrawableImpl {/*

.class Landroid/support/v4/graphics/drawable/DrawableCompat$KitKatDrawableImpl;
.super Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;
.source "DrawableCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/graphics/drawable/DrawableCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "KitKatDrawableImpl"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Landroid/support/v4/graphics/drawable/DrawableCompat$HoneycombDrawableImpl;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public isAutoMirrored(Landroid/graphics/drawable/Drawable;)Z
    .locals 1
    .parameter "drawable"

    .prologue
    .line 74
    invoke-static {p1}, Landroid/support/v4/graphics/drawable/DrawableCompatKitKat;->isAutoMirrored(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public setAutoMirrored(Landroid/graphics/drawable/Drawable;Z)V
    .locals 0
    .parameter "drawable"
    .parameter "mirrored"

    .prologue
    .line 69
    invoke-static {p1, p2}, Landroid/support/v4/graphics/drawable/DrawableCompatKitKat;->setAutoMirrored(Landroid/graphics/drawable/Drawable;Z)V

    .line 70
    return-void
.end method

*/}
