package android.support.v4.view; class ViewPropertyAnimatorCompat$JBMr2ViewPropertyAnimatorCompatImpl {/*

.class Landroid/support/v4/view/ViewPropertyAnimatorCompat$JBMr2ViewPropertyAnimatorCompatImpl;
.super Landroid/support/v4/view/ViewPropertyAnimatorCompat$JBViewPropertyAnimatorCompatImpl;
.source "ViewPropertyAnimatorCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ViewPropertyAnimatorCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "JBMr2ViewPropertyAnimatorCompatImpl"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 450
    invoke-direct {p0}, Landroid/support/v4/view/ViewPropertyAnimatorCompat$JBViewPropertyAnimatorCompatImpl;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public getInterpolator(Landroid/view/View;)Landroid/view/animation/Interpolator;
    .locals 1
    .parameter "view"

    .prologue
    .line 454
    invoke-static {p1}, Landroid/support/v4/view/ViewPropertyAnimatorCompatJellybeanMr2;->getInterpolator(Landroid/view/View;)Landroid/view/animation/Interpolator;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
