package android.support.v4.view; class MotionEventCompatEclair {/*

.class Landroid/support/v4/view/MotionEventCompatEclair;
.super Ljava/lang/Object;
.source "MotionEventCompatEclair.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static findPointerIndex(Landroid/view/MotionEvent;I)I
    .locals 1
    .parameter "event"
    .parameter "pointerId"

    .prologue
    .line 26
    invoke-virtual {p0, p1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getPointerCount(Landroid/view/MotionEvent;)I
    .locals 1
    .parameter "event"

    .prologue
    .line 38
    invoke-virtual {p0}, Landroid/view/MotionEvent;->getPointerCount()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getPointerId(Landroid/view/MotionEvent;I)I
    .locals 1
    .parameter "event"
    .parameter "pointerIndex"

    .prologue
    .line 29
    invoke-virtual {p0, p1}, Landroid/view/MotionEvent;->getPointerId(I)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getX(Landroid/view/MotionEvent;I)F
    .locals 1
    .parameter "event"
    .parameter "pointerIndex"

    .prologue
    .line 32
    invoke-virtual {p0, p1}, Landroid/view/MotionEvent;->getX(I)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getY(Landroid/view/MotionEvent;I)F
    .locals 1
    .parameter "event"
    .parameter "pointerIndex"

    .prologue
    .line 35
    invoke-virtual {p0, p1}, Landroid/view/MotionEvent;->getY(I)F

    move-result v0

    #v0=(Float);
    return v0
.end method

*/}
