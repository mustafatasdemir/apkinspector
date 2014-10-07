package android.support.v4.widget; class ScrollerCompat$ScrollerCompatImplBase {/*

.class Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplBase;
.super Ljava/lang/Object;
.source "ScrollerCompat.java"

# interfaces
.implements Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/ScrollerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ScrollerCompatImplBase"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public abortAnimation(Ljava/lang/Object;)V
    .locals 0
    .parameter "scroller"

    .prologue
    .line 119
    check-cast p1, Landroid/widget/Scroller;

    .end local p1
    invoke-virtual {p1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 120
    return-void
.end method

.method public computeScrollOffset(Ljava/lang/Object;)Z
    .locals 2
    .parameter "scroller"

    .prologue
    .line 90
    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/widget/Scroller;

    .line 91
    .local v0, s:Landroid/widget/Scroller;
    invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z

    move-result v1

    #v1=(Boolean);
    return v1
.end method

.method public createScroller(Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;
    .locals 1
    .parameter "context"
    .parameter "interpolator"

    .prologue
    .line 64
    if-eqz p2, :cond_0

    new-instance v0, Landroid/widget/Scroller;

    #v0=(UninitRef);
    invoke-direct {v0, p1, p2}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(Uninit);
    new-instance v0, Landroid/widget/Scroller;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    goto :goto_0
.end method

.method public fling(Ljava/lang/Object;IIIIIIII)V
    .locals 9
    .parameter "scroller"
    .parameter "startX"
    .parameter "startY"
    .parameter "velX"
    .parameter "velY"
    .parameter "minX"
    .parameter "maxX"
    .parameter "minY"
    .parameter "maxY"

    .prologue
    .line 108
    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/widget/Scroller;

    move v1, p2

    #v1=(Integer);
    move v2, p3

    #v2=(Integer);
    move v3, p4

    #v3=(Integer);
    move v4, p5

    #v4=(Integer);
    move v5, p6

    #v5=(Integer);
    move/from16 v6, p7

    #v6=(Integer);
    move/from16 v7, p8

    #v7=(Integer);
    move/from16 v8, p9

    #v8=(Integer);
    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 109
    return-void
.end method

.method public fling(Ljava/lang/Object;IIIIIIIIII)V
    .locals 9
    .parameter "scroller"
    .parameter "startX"
    .parameter "startY"
    .parameter "velX"
    .parameter "velY"
    .parameter "minX"
    .parameter "maxX"
    .parameter "minY"
    .parameter "maxY"
    .parameter "overX"
    .parameter "overY"

    .prologue
    .line 114
    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/widget/Scroller;

    move v1, p2

    #v1=(Integer);
    move v2, p3

    #v2=(Integer);
    move v3, p4

    #v3=(Integer);
    move v4, p5

    #v4=(Integer);
    move v5, p6

    #v5=(Integer);
    move/from16 v6, p7

    #v6=(Integer);
    move/from16 v7, p8

    #v7=(Integer);
    move/from16 v8, p9

    #v8=(Integer);
    invoke-virtual/range {v0 .. v8}, Landroid/widget/Scroller;->fling(IIIIIIII)V

    .line 115
    return-void
.end method

.method public getCurrVelocity(Ljava/lang/Object;)F
    .locals 1
    .parameter "scroller"

    .prologue
    .line 85
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getCurrX(Ljava/lang/Object;)I
    .locals 1
    .parameter "scroller"

    .prologue
    .line 75
    check-cast p1, Landroid/widget/Scroller;

    .end local p1
    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrX()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getCurrY(Ljava/lang/Object;)I
    .locals 1
    .parameter "scroller"

    .prologue
    .line 80
    check-cast p1, Landroid/widget/Scroller;

    .end local p1
    invoke-virtual {p1}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getFinalX(Ljava/lang/Object;)I
    .locals 1
    .parameter "scroller"

    .prologue
    .line 141
    check-cast p1, Landroid/widget/Scroller;

    .end local p1
    invoke-virtual {p1}, Landroid/widget/Scroller;->getFinalX()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getFinalY(Ljava/lang/Object;)I
    .locals 1
    .parameter "scroller"

    .prologue
    .line 146
    check-cast p1, Landroid/widget/Scroller;

    .end local p1
    invoke-virtual {p1}, Landroid/widget/Scroller;->getFinalY()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public isFinished(Ljava/lang/Object;)Z
    .locals 1
    .parameter "scroller"

    .prologue
    .line 70
    check-cast p1, Landroid/widget/Scroller;

    .end local p1
    invoke-virtual {p1}, Landroid/widget/Scroller;->isFinished()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isOverScrolled(Ljava/lang/Object;)Z
    .locals 1
    .parameter "scroller"

    .prologue
    .line 136
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public notifyHorizontalEdgeReached(Ljava/lang/Object;III)V
    .locals 0
    .parameter "scroller"
    .parameter "startX"
    .parameter "finalX"
    .parameter "overX"

    .prologue
    .line 126
    return-void
.end method

.method public notifyVerticalEdgeReached(Ljava/lang/Object;III)V
    .locals 0
    .parameter "scroller"
    .parameter "startY"
    .parameter "finalY"
    .parameter "overY"

    .prologue
    .line 131
    return-void
.end method

.method public startScroll(Ljava/lang/Object;IIII)V
    .locals 0
    .parameter "scroller"
    .parameter "startX"
    .parameter "startY"
    .parameter "dx"
    .parameter "dy"

    .prologue
    .line 96
    check-cast p1, Landroid/widget/Scroller;

    .end local p1
    invoke-virtual {p1, p2, p3, p4, p5}, Landroid/widget/Scroller;->startScroll(IIII)V

    .line 97
    return-void
.end method

.method public startScroll(Ljava/lang/Object;IIIII)V
    .locals 6
    .parameter "scroller"
    .parameter "startX"
    .parameter "startY"
    .parameter "dx"
    .parameter "dy"
    .parameter "duration"

    .prologue
    .line 102
    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/widget/Scroller;

    move v1, p2

    #v1=(Integer);
    move v2, p3

    #v2=(Integer);
    move v3, p4

    #v3=(Integer);
    move v4, p5

    #v4=(Integer);
    move v5, p6

    #v5=(Integer);
    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 103
    return-void
.end method

*/}
