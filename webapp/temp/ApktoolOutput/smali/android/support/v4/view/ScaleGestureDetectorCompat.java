package android.support.v4.view; class ScaleGestureDetectorCompat {/*

.class public Landroid/support/v4/view/ScaleGestureDetectorCompat;
.super Ljava/lang/Object;
.source "ScaleGestureDetectorCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/ScaleGestureDetectorCompat$1;,
        Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorCompatKitKatImpl;,
        Landroid/support/v4/view/ScaleGestureDetectorCompat$BaseScaleGestureDetectorImpl;,
        Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorImpl;
    }
.end annotation


# static fields
.field static final IMPL:Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 58
    #v2=(Null);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 59
    .local v0, version:I
    #v0=(Integer);
    const/16 v1, 0x13

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 60
    new-instance v1, Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorCompatKitKatImpl;

    #v1=(UninitRef);
    invoke-direct {v1, v2}, Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorCompatKitKatImpl;-><init>(Landroid/support/v4/view/ScaleGestureDetectorCompat$1;)V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ScaleGestureDetectorCompat;->IMPL:Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorImpl;

    .line 64
    :goto_0
    return-void

    .line 62
    :cond_0
    #v1=(PosByte);
    new-instance v1, Landroid/support/v4/view/ScaleGestureDetectorCompat$BaseScaleGestureDetectorImpl;

    #v1=(UninitRef);
    invoke-direct {v1, v2}, Landroid/support/v4/view/ScaleGestureDetectorCompat$BaseScaleGestureDetectorImpl;-><init>(Landroid/support/v4/view/ScaleGestureDetectorCompat$1;)V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/ScaleGestureDetectorCompat;->IMPL:Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorImpl;

    goto :goto_0
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static isQuickScaleEnabled(Ljava/lang/Object;)Z
    .locals 1
    .parameter "scaleGestureDetector"

    .prologue
    .line 83
    sget-object v0, Landroid/support/v4/view/ScaleGestureDetectorCompat;->IMPL:Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorImpl;->isQuickScaleEnabled(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static setQuickScaleEnabled(Ljava/lang/Object;Z)V
    .locals 1
    .parameter "scaleGestureDetector"
    .parameter "enabled"

    .prologue
    .line 75
    sget-object v0, Landroid/support/v4/view/ScaleGestureDetectorCompat;->IMPL:Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/ScaleGestureDetectorCompat$ScaleGestureDetectorImpl;->setQuickScaleEnabled(Ljava/lang/Object;Z)V

    .line 76
    return-void
.end method

*/}
