package android.support.v4.view; class ViewPropertyAnimatorCompatJellybeanMr2 {/*

.class Landroid/support/v4/view/ViewPropertyAnimatorCompatJellybeanMr2;
.super Ljava/lang/Object;
.source "ViewPropertyAnimatorCompatJellybeanMr2.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getInterpolator(Landroid/view/View;)Landroid/view/animation/Interpolator;
    .locals 1
    .parameter "view"

    .prologue
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->getInterpolator()Landroid/animation/TimeInterpolator;

    move-result-object v0

    check-cast v0, Landroid/view/animation/Interpolator;

    return-object v0
.end method

*/}
