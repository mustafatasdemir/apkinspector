package android.support.v4.view; class ViewCompatHC {/*

.class Landroid/support/v4/view/ViewCompatHC;
.super Ljava/lang/Object;
.source "ViewCompatHC.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getAlpha(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getAlpha()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method static getFrameTime()J
    .locals 2

    .prologue
    .line 25
    invoke-static {}, Landroid/animation/ValueAnimator;->getFrameDelay()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public static getLayerType(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 37
    invoke-virtual {p0}, Landroid/view/View;->getLayerType()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMeasuredHeightAndState(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeightAndState()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMeasuredState(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 53
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredState()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getMeasuredWidthAndState(Landroid/view/View;)I
    .locals 1
    .parameter "view"

    .prologue
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidthAndState()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static getPivotX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 141
    invoke-virtual {p0}, Landroid/view/View;->getPivotX()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getPivotY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 145
    invoke-virtual {p0}, Landroid/view/View;->getPivotY()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getRotation(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 73
    invoke-virtual {p0}, Landroid/view/View;->getRotation()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getRotationX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getRotationX()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getRotationY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 81
    invoke-virtual {p0}, Landroid/view/View;->getRotationY()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getScaleX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getScaleX()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getScaleY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 89
    invoke-virtual {p0}, Landroid/view/View;->getScaleY()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getTranslationX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 57
    invoke-virtual {p0}, Landroid/view/View;->getTranslationX()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getTranslationY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 61
    invoke-virtual {p0}, Landroid/view/View;->getTranslationY()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getX(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 65
    invoke-virtual {p0}, Landroid/view/View;->getX()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static getY(Landroid/view/View;)F
    .locals 1
    .parameter "view"

    .prologue
    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getY()F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public static resolveSizeAndState(III)I
    .locals 1
    .parameter "size"
    .parameter "measureSpec"
    .parameter "childMeasuredState"

    .prologue
    .line 41
    invoke-static {p0, p1, p2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public static setAlpha(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 101
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 102
    return-void
.end method

.method public static setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
    .locals 0
    .parameter "view"
    .parameter "layerType"
    .parameter "paint"

    .prologue
    .line 33
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V

    .line 34
    return-void
.end method

.method public static setPivotX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 133
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotX(F)V

    .line 134
    return-void
.end method

.method public static setPivotY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 137
    invoke-virtual {p0, p1}, Landroid/view/View;->setPivotY(F)V

    .line 138
    return-void
.end method

.method public static setRotation(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 113
    invoke-virtual {p0, p1}, Landroid/view/View;->setRotation(F)V

    .line 114
    return-void
.end method

.method public static setRotationX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 117
    invoke-virtual {p0, p1}, Landroid/view/View;->setRotationX(F)V

    .line 118
    return-void
.end method

.method public static setRotationY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 121
    invoke-virtual {p0, p1}, Landroid/view/View;->setRotationY(F)V

    .line 122
    return-void
.end method

.method public static setScaleX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 125
    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleX(F)V

    .line 126
    return-void
.end method

.method public static setScaleY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 129
    invoke-virtual {p0, p1}, Landroid/view/View;->setScaleY(F)V

    .line 130
    return-void
.end method

.method public static setTranslationX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 93
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationX(F)V

    .line 94
    return-void
.end method

.method public static setTranslationY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 97
    invoke-virtual {p0, p1}, Landroid/view/View;->setTranslationY(F)V

    .line 98
    return-void
.end method

.method public static setX(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 105
    invoke-virtual {p0, p1}, Landroid/view/View;->setX(F)V

    .line 106
    return-void
.end method

.method public static setY(Landroid/view/View;F)V
    .locals 0
    .parameter "view"
    .parameter "value"

    .prologue
    .line 109
    invoke-virtual {p0, p1}, Landroid/view/View;->setY(F)V

    .line 110
    return-void
.end method

*/}
