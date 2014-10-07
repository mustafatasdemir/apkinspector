package android.support.v4.view; class ViewPropertyAnimatorCompatJB {/*

.class Landroid/support/v4/view/ViewPropertyAnimatorCompatJB;
.super Ljava/lang/Object;
.source "ViewPropertyAnimatorCompatJB.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static withEndAction(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1
    .parameter "view"
    .parameter "runnable"

    .prologue
    .line 27
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 28
    return-void
.end method

.method public static withLayer(Landroid/view/View;)V
    .locals 1
    .parameter "view"

    .prologue
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->withLayer()Landroid/view/ViewPropertyAnimator;

    .line 32
    return-void
.end method

.method public static withStartAction(Landroid/view/View;Ljava/lang/Runnable;)V
    .locals 1
    .parameter "view"
    .parameter "runnable"

    .prologue
    .line 23
    invoke-virtual {p0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/view/ViewPropertyAnimator;->withStartAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 24
    return-void
.end method

*/}
