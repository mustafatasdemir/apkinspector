package android.support.v4.widget; class ScrollerCompat {/*

.class public Landroid/support/v4/widget/ScrollerCompat;
.super Ljava/lang/Object;
.source "ScrollerCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;,
        Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplGingerbread;,
        Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplBase;,
        Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;
    }
.end annotation


# static fields
.field static final CHASE_FRAME_TIME:I = 0x10

.field private static final TAG:Ljava/lang/String; = "ScrollerCompat"


# instance fields
.field mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

.field mScroller:Ljava/lang/Object;


# direct methods
.method private constructor <init>(ILandroid/content/Context;Landroid/view/animation/Interpolator;)V
    .locals 1
    .parameter "apiVersion"
    .parameter "context"
    .parameter "interpolator"

    .prologue
    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 263
    #p0=(Reference);
    const/16 v0, 0xe

    #v0=(PosByte);
    if-lt p1, v0, :cond_0

    .line 264
    new-instance v0, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplIcs;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    .line 270
    :goto_0
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    invoke-interface {v0, p2, p3}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->createScroller(Landroid/content/Context;Landroid/view/animation/Interpolator;)Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    .line 271
    return-void

    .line 265
    :cond_0
    #v0=(PosByte);
    const/16 v0, 0x9

    if-lt p1, v0, :cond_1

    .line 266
    new-instance v0, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplGingerbread;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplGingerbread;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    goto :goto_0

    .line 268
    :cond_1
    #v0=(PosByte);
    new-instance v0, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplBase;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImplBase;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    goto :goto_0
.end method

.method constructor <init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
    .locals 1
    .parameter "context"
    .parameter "interpolator"

    .prologue
    .line 254
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    invoke-direct {p0, v0, p1, p2}, Landroid/support/v4/widget/ScrollerCompat;-><init>(ILandroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 256
    #p0=(Reference);
    return-void
.end method

.method public static create(Landroid/content/Context;)Landroid/support/v4/widget/ScrollerCompat;
    .locals 1
    .parameter "context"

    .prologue
    .line 246
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {p0, v0}, Landroid/support/v4/widget/ScrollerCompat;->create(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static create(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;
    .locals 1
    .parameter "context"
    .parameter "interpolator"

    .prologue
    .line 250
    new-instance v0, Landroid/support/v4/widget/ScrollerCompat;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1}, Landroid/support/v4/widget/ScrollerCompat;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public abortAnimation()V
    .locals 2

    .prologue
    .line 430
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->abortAnimation(Ljava/lang/Object;)V

    .line 431
    return-void
.end method

.method public computeScrollOffset()Z
    .locals 2

    .prologue
    .line 334
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->computeScrollOffset(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public fling(IIIIIIII)V
    .locals 10
    .parameter "startX"
    .parameter "startY"
    .parameter "velocityX"
    .parameter "velocityY"
    .parameter "minX"
    .parameter "maxX"
    .parameter "minY"
    .parameter "maxY"

    .prologue
    .line 393
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move v4, p3

    #v4=(Integer);
    move v5, p4

    #v5=(Integer);
    move v6, p5

    #v6=(Integer);
    move/from16 v7, p6

    #v7=(Integer);
    move/from16 v8, p7

    #v8=(Integer);
    move/from16 v9, p8

    #v9=(Integer);
    invoke-interface/range {v0 .. v9}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->fling(Ljava/lang/Object;IIIIIIII)V

    .line 394
    return-void
.end method

.method public fling(IIIIIIIIII)V
    .locals 12
    .parameter "startX"
    .parameter "startY"
    .parameter "velocityX"
    .parameter "velocityY"
    .parameter "minX"
    .parameter "maxX"
    .parameter "minY"
    .parameter "maxY"
    .parameter "overX"
    .parameter "overY"

    .prologue
    .line 421
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move v4, p3

    #v4=(Integer);
    move/from16 v5, p4

    #v5=(Integer);
    move/from16 v6, p5

    #v6=(Integer);
    move/from16 v7, p6

    #v7=(Integer);
    move/from16 v8, p7

    #v8=(Integer);
    move/from16 v9, p8

    #v9=(Integer);
    move/from16 v10, p9

    #v10=(Integer);
    move/from16 v11, p10

    #v11=(Integer);
    invoke-interface/range {v0 .. v11}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->fling(Ljava/lang/Object;IIIIIIIIII)V

    .line 423
    return-void
.end method

.method public getCurrVelocity()F
    .locals 2

    .prologue
    .line 325
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getCurrVelocity(Ljava/lang/Object;)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method public getCurrX()I
    .locals 2

    .prologue
    .line 288
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getCurrX(Ljava/lang/Object;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getCurrY()I
    .locals 2

    .prologue
    .line 297
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getCurrY(Ljava/lang/Object;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getFinalX()I
    .locals 2

    .prologue
    .line 304
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getFinalX(Ljava/lang/Object;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getFinalY()I
    .locals 2

    .prologue
    .line 311
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->getFinalY(Ljava/lang/Object;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public isFinished()Z
    .locals 2

    .prologue
    .line 279
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->isFinished(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isOverScrolled()Z
    .locals 2

    .prologue
    .line 482
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->isOverScrolled(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public notifyHorizontalEdgeReached(III)V
    .locals 2
    .parameter "startX"
    .parameter "finalX"
    .parameter "overX"

    .prologue
    .line 448
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1, p1, p2, p3}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->notifyHorizontalEdgeReached(Ljava/lang/Object;III)V

    .line 449
    return-void
.end method

.method public notifyVerticalEdgeReached(III)V
    .locals 2
    .parameter "startY"
    .parameter "finalY"
    .parameter "overY"

    .prologue
    .line 465
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    invoke-interface {v0, v1, p1, p2, p3}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->notifyVerticalEdgeReached(Ljava/lang/Object;III)V

    .line 466
    return-void
.end method

.method public startScroll(IIII)V
    .locals 6
    .parameter "startX"
    .parameter "startY"
    .parameter "dx"
    .parameter "dy"

    .prologue
    .line 352
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move v4, p3

    #v4=(Integer);
    move v5, p4

    #v5=(Integer);
    invoke-interface/range {v0 .. v5}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->startScroll(Ljava/lang/Object;IIII)V

    .line 353
    return-void
.end method

.method public startScroll(IIIII)V
    .locals 7
    .parameter "startX"
    .parameter "startY"
    .parameter "dx"
    .parameter "dy"
    .parameter "duration"

    .prologue
    .line 369
    iget-object v0, p0, Landroid/support/v4/widget/ScrollerCompat;->mImpl:Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ScrollerCompat;->mScroller:Ljava/lang/Object;

    #v1=(Reference);
    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move v4, p3

    #v4=(Integer);
    move v5, p4

    #v5=(Integer);
    move v6, p5

    #v6=(Integer);
    invoke-interface/range {v0 .. v6}, Landroid/support/v4/widget/ScrollerCompat$ScrollerCompatImpl;->startScroll(Ljava/lang/Object;IIIII)V

    .line 370
    return-void
.end method

*/}
