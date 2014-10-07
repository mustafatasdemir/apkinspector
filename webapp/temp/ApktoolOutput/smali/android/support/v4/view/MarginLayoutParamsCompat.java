package android.support.v4.view; class MarginLayoutParamsCompat {/*

.class public Landroid/support/v4/view/MarginLayoutParamsCompat;
.super Ljava/lang/Object;
.source "MarginLayoutParamsCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1;,
        Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase;,
        Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;
    }
.end annotation


# static fields
.field static final IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 127
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 128
    .local v0, version:I
    #v0=(Integer);
    const/16 v1, 0x11

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 129
    new-instance v1, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplJbMr1;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    .line 133
    :goto_0
    return-void

    .line 131
    :cond_0
    #v1=(PosByte);
    new-instance v1, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImplBase;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 82
    #p0=(Reference);
    return-void
.end method

.method public static getLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;)I
    .locals 1
    .parameter "lp"

    .prologue
    .line 211
    sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->getLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;)I
    .locals 1
    .parameter "lp"

    .prologue
    .line 162
    sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->getMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;)I
    .locals 1
    .parameter "lp"

    .prologue
    .line 147
    sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->getMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static isMarginRelative(Landroid/view/ViewGroup$MarginLayoutParams;)Z
    .locals 1
    .parameter "lp"

    .prologue
    .line 201
    sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->isMarginRelative(Landroid/view/ViewGroup$MarginLayoutParams;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static resolveLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;I)V
    .locals 1
    .parameter "lp"
    .parameter "layoutDirection"

    .prologue
    .line 231
    sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->resolveLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 232
    return-void
.end method

.method public static setLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;I)V
    .locals 1
    .parameter "lp"
    .parameter "layoutDirection"

    .prologue
    .line 222
    sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->setLayoutDirection(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 223
    return-void
.end method

.method public static setMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;I)V
    .locals 1
    .parameter "lp"
    .parameter "marginEnd"

    .prologue
    .line 192
    sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->setMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 193
    return-void
.end method

.method public static setMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;I)V
    .locals 1
    .parameter "lp"
    .parameter "marginStart"

    .prologue
    .line 177
    sget-object v0, Landroid/support/v4/view/MarginLayoutParamsCompat;->IMPL:Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/view/MarginLayoutParamsCompat$MarginLayoutParamsCompatImpl;->setMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 178
    return-void
.end method

*/}
