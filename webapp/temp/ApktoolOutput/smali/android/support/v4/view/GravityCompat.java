package android.support.v4.view; class GravityCompat {/*

.class public Landroid/support/v4/view/GravityCompat;
.super Ljava/lang/Object;
.source "GravityCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/GravityCompat$GravityCompatImplJellybeanMr1;,
        Landroid/support/v4/view/GravityCompat$GravityCompatImplBase;,
        Landroid/support/v4/view/GravityCompat$GravityCompatImpl;
    }
.end annotation


# static fields
.field public static final END:I = 0x800005

.field static final IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl; = null

.field public static final RELATIVE_HORIZONTAL_GRAVITY_MASK:I = 0x800007

.field public static final RELATIVE_LAYOUT_DIRECTION:I = 0x800000

.field public static final START:I = 0x800003


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 89
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 90
    .local v0, version:I
    #v0=(Integer);
    const/16 v1, 0x11

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 91
    new-instance v1, Landroid/support/v4/view/GravityCompat$GravityCompatImplJellybeanMr1;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/GravityCompat$GravityCompatImplJellybeanMr1;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;

    .line 95
    :goto_0
    return-void

    .line 93
    :cond_0
    #v1=(PosByte);
    new-instance v1, Landroid/support/v4/view/GravityCompat$GravityCompatImplBase;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/GravityCompat$GravityCompatImplBase;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    #p0=(Reference);
    return-void
.end method

.method public static apply(IIILandroid/graphics/Rect;IILandroid/graphics/Rect;I)V
    .locals 9
    .parameter "gravity"
    .parameter "w"
    .parameter "h"
    .parameter "container"
    .parameter "xAdj"
    .parameter "yAdj"
    .parameter "outRect"
    .parameter "layoutDirection"

    .prologue
    .line 162
    sget-object v0, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;

    #v0=(Reference);
    move v1, p0

    #v1=(Integer);
    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move-object v4, p3

    #v4=(Reference);
    move v5, p4

    #v5=(Integer);
    move v6, p5

    #v6=(Integer);
    move-object v7, p6

    #v7=(Reference);
    move/from16 v8, p7

    #v8=(Integer);
    invoke-interface/range {v0 .. v8}, Landroid/support/v4/view/GravityCompat$GravityCompatImpl;->apply(IIILandroid/graphics/Rect;IILandroid/graphics/Rect;I)V

    .line 163
    return-void
.end method

.method public static apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V
    .locals 7
    .parameter "gravity"
    .parameter "w"
    .parameter "h"
    .parameter "container"
    .parameter "outRect"
    .parameter "layoutDirection"

    .prologue
    .line 132
    sget-object v0, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;

    #v0=(Reference);
    move v1, p0

    #v1=(Integer);
    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move-object v4, p3

    #v4=(Reference);
    move-object v5, p4

    #v5=(Reference);
    move v6, p5

    #v6=(Integer);
    invoke-interface/range {v0 .. v6}, Landroid/support/v4/view/GravityCompat$GravityCompatImpl;->apply(IIILandroid/graphics/Rect;Landroid/graphics/Rect;I)V

    .line 133
    return-void
.end method

.method public static applyDisplay(ILandroid/graphics/Rect;Landroid/graphics/Rect;I)V
    .locals 1
    .parameter "gravity"
    .parameter "display"
    .parameter "inoutObj"
    .parameter "layoutDirection"

    .prologue
    .line 186
    sget-object v0, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1, p2, p3}, Landroid/support/v4/view/GravityCompat$GravityCompatImpl;->applyDisplay(ILandroid/graphics/Rect;Landroid/graphics/Rect;I)V

    .line 187
    return-void
.end method

.method public static getAbsoluteGravity(II)I
    .locals 1
    .parameter "gravity"
    .parameter "layoutDirection"

    .prologue
    .line 201
    sget-object v0, Landroid/support/v4/view/GravityCompat;->IMPL:Landroid/support/v4/view/GravityCompat$GravityCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/GravityCompat$GravityCompatImpl;->getAbsoluteGravity(II)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

*/}
