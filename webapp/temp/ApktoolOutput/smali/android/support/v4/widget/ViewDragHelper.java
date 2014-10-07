package android.support.v4.widget; class ViewDragHelper {/*

.class public Landroid/support/v4/widget/ViewDragHelper;
.super Ljava/lang/Object;
.source "ViewDragHelper.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/ViewDragHelper$Callback;
    }
.end annotation


# static fields
.field private static final BASE_SETTLE_DURATION:I = 0x100

.field public static final DIRECTION_ALL:I = 0x3

.field public static final DIRECTION_HORIZONTAL:I = 0x1

.field public static final DIRECTION_VERTICAL:I = 0x2

.field public static final EDGE_ALL:I = 0xf

.field public static final EDGE_BOTTOM:I = 0x8

.field public static final EDGE_LEFT:I = 0x1

.field public static final EDGE_RIGHT:I = 0x2

.field private static final EDGE_SIZE:I = 0x14

.field public static final EDGE_TOP:I = 0x4

.field public static final INVALID_POINTER:I = -0x1

.field private static final MAX_SETTLE_DURATION:I = 0x258

.field public static final STATE_DRAGGING:I = 0x1

.field public static final STATE_IDLE:I = 0x0

.field public static final STATE_SETTLING:I = 0x2

.field private static final TAG:Ljava/lang/String; = "ViewDragHelper"

.field private static final sInterpolator:Landroid/view/animation/Interpolator;


# instance fields
.field private mActivePointerId:I

.field private final mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

.field private mCapturedView:Landroid/view/View;

.field private mDragState:I

.field private mEdgeDragsInProgress:[I

.field private mEdgeDragsLocked:[I

.field private mEdgeSize:I

.field private mInitialEdgesTouched:[I

.field private mInitialMotionX:[F

.field private mInitialMotionY:[F

.field private mLastMotionX:[F

.field private mLastMotionY:[F

.field private mMaxVelocity:F

.field private mMinVelocity:F

.field private final mParentView:Landroid/view/ViewGroup;

.field private mPointersDown:I

.field private mReleaseInProgress:Z

.field private mScroller:Landroid/support/v4/widget/ScrollerCompat;

.field private final mSetIdleRunnable:Ljava/lang/Runnable;

.field private mTouchSlop:I

.field private mTrackingEdges:I

.field private mVelocityTracker:Landroid/view/VelocityTracker;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 326
    new-instance v0, Landroid/support/v4/widget/ViewDragHelper$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/widget/ViewDragHelper$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/widget/ViewDragHelper;->sInterpolator:Landroid/view/animation/Interpolator;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)V
    .locals 4
    .parameter "context"
    .parameter "forParent"
    .parameter "cb"

    .prologue
    .line 373
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 115
    #p0=(Reference);
    const/4 v2, -0x1

    #v2=(Byte);
    iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    .line 333
    new-instance v2, Landroid/support/v4/widget/ViewDragHelper$2;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/widget/ViewDragHelper$2;-><init>(Landroid/support/v4/widget/ViewDragHelper;)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mSetIdleRunnable:Ljava/lang/Runnable;

    .line 374
    if-nez p2, :cond_0

    .line 375
    new-instance v2, Ljava/lang/IllegalArgumentException;

    #v2=(UninitRef);
    const-string v3, "Parent view may not be null"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 377
    :cond_0
    #v3=(Uninit);
    if-nez p3, :cond_1

    .line 378
    new-instance v2, Ljava/lang/IllegalArgumentException;

    #v2=(UninitRef);
    const-string v3, "Callback may not be null"

    #v3=(Reference);
    invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v2=(Reference);
    throw v2

    .line 381
    :cond_1
    #v3=(Uninit);
    iput-object p2, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    .line 382
    iput-object p3, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    .line 384
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    .line 385
    .local v1, vc:Landroid/view/ViewConfiguration;
    #v1=(Reference);
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v0, v2, Landroid/util/DisplayMetrics;->density:F

    .line 386
    .local v0, density:F
    #v0=(Integer);
    const/high16 v2, 0x41a0

    #v2=(Integer);
    mul-float/2addr v2, v0

    #v2=(Float);
    const/high16 v3, 0x3f00

    #v3=(Integer);
    add-float/2addr v2, v3

    float-to-int v2, v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I

    .line 388
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v2

    iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    .line 389
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v2

    int-to-float v2, v2

    #v2=(Float);
    iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F

    .line 390
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v2

    #v2=(Integer);
    int-to-float v2, v2

    #v2=(Float);
    iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F

    .line 391
    sget-object v2, Landroid/support/v4/widget/ViewDragHelper;->sInterpolator:Landroid/view/animation/Interpolator;

    #v2=(Reference);
    invoke-static {p1, v2}, Landroid/support/v4/widget/ScrollerCompat;->create(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;

    move-result-object v2

    iput-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    .line 392
    return-void
.end method

.method private checkNewEdgeDrag(FFII)Z
    .locals 5
    .parameter "delta"
    .parameter "odelta"
    .parameter "pointerId"
    .parameter "edge"

    .prologue
    const/4 v2, 0x0

    .line 1218
    #v2=(Null);
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 1219
    .local v0, absDelta:F
    #v0=(Float);
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 1221
    .local v1, absODelta:F
    #v1=(Float);
    iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    #v3=(Reference);
    aget v3, v3, p3

    #v3=(Integer);
    and-int/2addr v3, p4

    if-ne v3, p4, :cond_0

    iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    and-int/2addr v3, p4

    if-eqz v3, :cond_0

    iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I

    #v3=(Reference);
    aget v3, v3, p3

    #v3=(Integer);
    and-int/2addr v3, p4

    if-eq v3, p4, :cond_0

    iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I

    #v3=(Reference);
    aget v3, v3, p3

    #v3=(Integer);
    and-int/2addr v3, p4

    if-eq v3, p4, :cond_0

    iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    int-to-float v3, v3

    #v3=(Float);
    cmpg-float v3, v0, v3

    #v3=(Byte);
    if-gtz v3, :cond_1

    iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    #v3=(Integer);
    int-to-float v3, v3

    #v3=(Float);
    cmpg-float v3, v1, v3

    #v3=(Byte);
    if-gtz v3, :cond_1

    .line 1231
    :cond_0
    :goto_0
    #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
    return v2

    .line 1227
    :cond_1
    #v2=(Null);v3=(Byte);v4=(Uninit);
    const/high16 v3, 0x3f00

    #v3=(Integer);
    mul-float/2addr v3, v1

    #v3=(Float);
    cmpg-float v3, v0, v3

    #v3=(Byte);
    if-gez v3, :cond_2

    iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v3=(Reference);
    invoke-virtual {v3, p4}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeLock(I)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 1228
    iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I

    #v3=(Reference);
    aget v4, v3, p3

    #v4=(Integer);
    or-int/2addr v4, p4

    aput v4, v3, p3

    goto :goto_0

    .line 1231
    :cond_2
    #v3=(Byte);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I

    #v3=(Reference);
    aget v3, v3, p3

    #v3=(Integer);
    and-int/2addr v3, p4

    if-nez v3, :cond_0

    iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    int-to-float v3, v3

    #v3=(Float);
    cmpl-float v3, v0, v3

    #v3=(Byte);
    if-lez v3, :cond_0

    const/4 v2, 0x1

    #v2=(One);
    goto :goto_0
.end method

.method private checkTouchSlop(Landroid/view/View;FF)Z
    .locals 7
    .parameter "child"
    .parameter "dx"
    .parameter "dy"

    .prologue
    const/4 v2, 0x1

    #v2=(One);
    const/4 v3, 0x0

    .line 1245
    #v3=(Null);
    if-nez p1, :cond_1

    move v2, v3

    .line 1258
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return v2

    .line 1248
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v4=(Reference);
    invoke-virtual {v4, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getViewHorizontalDragRange(Landroid/view/View;)I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_2

    move v0, v2

    .line 1249
    .local v0, checkHorizontal:Z
    :goto_1
    #v0=(Boolean);
    iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v4=(Reference);
    invoke-virtual {v4, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getViewVerticalDragRange(Landroid/view/View;)I

    move-result v4

    #v4=(Integer);
    if-lez v4, :cond_3

    move v1, v2

    .line 1251
    .local v1, checkVertical:Z
    :goto_2
    #v1=(Boolean);
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    .line 1252
    mul-float v4, p2, p2

    #v4=(Float);
    mul-float v5, p3, p3

    #v5=(Float);
    add-float/2addr v4, v5

    iget v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    #v6=(Integer);
    mul-int/2addr v5, v6

    int-to-float v5, v5

    #v5=(Float);
    cmpl-float v4, v4, v5

    #v4=(Byte);
    if-gtz v4, :cond_0

    move v2, v3

    #v2=(Null);
    goto :goto_0

    .end local v0           #checkHorizontal:Z
    .end local v1           #checkVertical:Z
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(One);v4=(Integer);v5=(Uninit);v6=(Uninit);
    move v0, v3

    .line 1248
    #v0=(Null);
    goto :goto_1

    .restart local v0       #checkHorizontal:Z
    :cond_3
    #v0=(Boolean);
    move v1, v3

    .line 1249
    #v1=(Null);
    goto :goto_2

    .line 1253
    .restart local v1       #checkVertical:Z
    :cond_4
    #v1=(Boolean);
    if-eqz v0, :cond_5

    .line 1254
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    move-result v4

    #v4=(Float);
    iget v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    cmpl-float v4, v4, v5

    #v4=(Byte);
    if-gtz v4, :cond_0

    move v2, v3

    #v2=(Null);
    goto :goto_0

    .line 1255
    :cond_5
    #v2=(One);v4=(Integer);v5=(Uninit);
    if-eqz v1, :cond_6

    .line 1256
    invoke-static {p3}, Ljava/lang/Math;->abs(F)F

    move-result v4

    #v4=(Float);
    iget v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    cmpl-float v4, v4, v5

    #v4=(Byte);
    if-gtz v4, :cond_0

    move v2, v3

    #v2=(Null);
    goto :goto_0

    :cond_6
    #v2=(One);v4=(Integer);v5=(Uninit);
    move v2, v3

    .line 1258
    #v2=(Null);
    goto :goto_0
.end method

.method private clampMag(FFF)F
    .locals 3
    .parameter "value"
    .parameter "absMin"
    .parameter "absMax"

    .prologue
    const/4 v1, 0x0

    .line 667
    #v1=(Null);
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    move-result v0

    .line 668
    .local v0, absValue:F
    #v0=(Float);
    cmpg-float v2, v0, p2

    #v2=(Byte);
    if-gez v2, :cond_1

    move p3, v1

    .line 670
    .end local p3
    :cond_0
    :goto_0
    #v1=(Byte);
    return p3

    .line 669
    .restart local p3
    :cond_1
    #v1=(Null);
    cmpl-float v2, v0, p3

    if-lez v2, :cond_2

    cmpl-float v1, p1, v1

    #v1=(Byte);
    if-gtz v1, :cond_0

    neg-float p3, p3

    goto :goto_0

    :cond_2
    #v1=(Null);
    move p3, p1

    .line 670
    goto :goto_0
.end method

.method private clampMag(III)I
    .locals 1
    .parameter "value"
    .parameter "absMin"
    .parameter "absMax"

    .prologue
    .line 650
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v0

    .line 651
    .local v0, absValue:I
    #v0=(Integer);
    if-ge v0, p2, :cond_1

    const/4 p3, 0x0

    .line 653
    .end local p3
    :cond_0
    :goto_0
    return p3

    .line 652
    .restart local p3
    :cond_1
    if-le v0, p3, :cond_2

    if-gtz p1, :cond_0

    neg-int p3, p3

    goto :goto_0

    :cond_2
    move p3, p1

    .line 653
    goto :goto_0
.end method

.method private clearMotionHistory()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    .line 770
    #v1=(Null);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 781
    :goto_0
    return-void

    .line 773
    :cond_0
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 774
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 775
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 776
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F

    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V

    .line 777
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 778
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 779
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I

    invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V

    .line 780
    iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I

    goto :goto_0
.end method

.method private clearMotionHistory(I)V
    .locals 3
    .parameter "pointerId"

    .prologue
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    .line 784
    #v1=(Null);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 795
    :goto_0
    #v0=(Conflicted);v1=(Integer);
    return-void

    .line 787
    :cond_0
    #v0=(Reference);v1=(Null);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    aput v1, v0, p1

    .line 788
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F

    aput v1, v0, p1

    .line 789
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F

    aput v1, v0, p1

    .line 790
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F

    aput v1, v0, p1

    .line 791
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    aput v2, v0, p1

    .line 792
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I

    aput v2, v0, p1

    .line 793
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I

    aput v2, v0, p1

    .line 794
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    shl-int/2addr v1, p1

    #v1=(Integer);
    xor-int/lit8 v1, v1, -0x1

    and-int/2addr v0, v1

    iput v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I

    goto :goto_0
.end method

.method private computeAxisDuration(III)I
    .locals 10
    .parameter "delta"
    .parameter "velocity"
    .parameter "motionRange"

    .prologue
    const/high16 v9, 0x3f80

    .line 618
    #v9=(Integer);
    if-nez p1, :cond_0

    .line 619
    const/4 v6, 0x0

    .line 636
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
    return v6

    .line 622
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-object v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/view/ViewGroup;->getWidth()I

    move-result v5

    .line 623
    .local v5, width:I
    #v5=(Integer);
    div-int/lit8 v3, v5, 0x2

    .line 624
    .local v3, halfWidth:I
    #v3=(Integer);
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v6

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    int-to-float v7, v5

    #v7=(Float);
    div-float/2addr v6, v7

    invoke-static {v9, v6}, Ljava/lang/Math;->min(FF)F

    move-result v1

    .line 625
    .local v1, distanceRatio:F
    #v1=(Float);
    int-to-float v6, v3

    int-to-float v7, v3

    invoke-direct {p0, v1}, Landroid/support/v4/widget/ViewDragHelper;->distanceInfluenceForSnapDuration(F)F

    move-result v8

    #v8=(Float);
    mul-float/2addr v7, v8

    add-float v0, v6, v7

    .line 629
    .local v0, distance:F
    #v0=(Float);
    invoke-static {p2}, Ljava/lang/Math;->abs(I)I

    move-result p2

    .line 630
    if-lez p2, :cond_1

    .line 631
    const/high16 v6, 0x447a

    #v6=(Integer);
    int-to-float v7, p2

    div-float v7, v0, v7

    invoke-static {v7}, Ljava/lang/Math;->abs(F)F

    move-result v7

    mul-float/2addr v6, v7

    #v6=(Float);
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v6

    #v6=(Integer);
    mul-int/lit8 v2, v6, 0x4

    .line 636
    .local v2, duration:I
    :goto_1
    #v2=(Integer);v4=(Conflicted);v7=(Integer);
    const/16 v6, 0x258

    #v6=(PosShort);
    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    #v6=(Integer);
    goto :goto_0

    .line 633
    .end local v2           #duration:I
    :cond_1
    #v2=(Uninit);v4=(Uninit);v6=(Float);v7=(Float);
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v6

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    int-to-float v7, p3

    div-float v4, v6, v7

    .line 634
    .local v4, range:F
    #v4=(Float);
    add-float v6, v4, v9

    const/high16 v7, 0x4380

    #v7=(Integer);
    mul-float/2addr v6, v7

    float-to-int v2, v6

    .restart local v2       #duration:I
    #v2=(Integer);
    goto :goto_1
.end method

.method private computeSettleDuration(Landroid/view/View;IIII)I
    .locals 14
    .parameter "child"
    .parameter "dx"
    .parameter "dy"
    .parameter "xvel"
    .parameter "yvel"

    .prologue
    .line 597
    iget v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F

    #v12=(Integer);
    float-to-int v12, v12

    iget v13, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F

    #v13=(Integer);
    float-to-int v13, v13

    move/from16 v0, p4

    #v0=(Integer);
    invoke-direct {p0, v0, v12, v13}, Landroid/support/v4/widget/ViewDragHelper;->clampMag(III)I

    move-result p4

    .line 598
    iget v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F

    float-to-int v12, v12

    iget v13, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F

    float-to-int v13, v13

    move/from16 v0, p5

    invoke-direct {p0, v0, v12, v13}, Landroid/support/v4/widget/ViewDragHelper;->clampMag(III)I

    move-result p5

    .line 599
    invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    .line 600
    .local v2, absDx:I
    #v2=(Integer);
    invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 601
    .local v3, absDy:I
    #v3=(Integer);
    invoke-static/range {p4 .. p4}, Ljava/lang/Math;->abs(I)I

    move-result v4

    .line 602
    .local v4, absXVel:I
    #v4=(Integer);
    invoke-static/range {p5 .. p5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    .line 603
    .local v5, absYVel:I
    #v5=(Integer);
    add-int v7, v4, v5

    .line 604
    .local v7, addedVel:I
    #v7=(Integer);
    add-int v6, v2, v3

    .line 606
    .local v6, addedDistance:I
    #v6=(Integer);
    if-eqz p4, :cond_0

    int-to-float v12, v4

    #v12=(Float);
    int-to-float v13, v7

    #v13=(Float);
    div-float v9, v12, v13

    .line 608
    .local v9, xweight:F
    :goto_0
    #v9=(Float);
    if-eqz p5, :cond_1

    int-to-float v12, v5

    int-to-float v13, v7

    div-float v11, v12, v13

    .line 611
    .local v11, yweight:F
    :goto_1
    #v11=(Float);
    iget-object v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v12=(Reference);
    invoke-virtual {v12, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getViewHorizontalDragRange(Landroid/view/View;)I

    move-result v12

    #v12=(Integer);
    move/from16 v0, p2

    move/from16 v1, p4

    #v1=(Integer);
    invoke-direct {p0, v0, v1, v12}, Landroid/support/v4/widget/ViewDragHelper;->computeAxisDuration(III)I

    move-result v8

    .line 612
    .local v8, xduration:I
    #v8=(Integer);
    iget-object v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v12=(Reference);
    invoke-virtual {v12, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getViewVerticalDragRange(Landroid/view/View;)I

    move-result v12

    #v12=(Integer);
    move/from16 v0, p3

    move/from16 v1, p5

    invoke-direct {p0, v0, v1, v12}, Landroid/support/v4/widget/ViewDragHelper;->computeAxisDuration(III)I

    move-result v10

    .line 614
    .local v10, yduration:I
    #v10=(Integer);
    int-to-float v12, v8

    #v12=(Float);
    mul-float/2addr v12, v9

    int-to-float v13, v10

    mul-float/2addr v13, v11

    add-float/2addr v12, v13

    float-to-int v12, v12

    #v12=(Integer);
    return v12

    .line 606
    .end local v8           #xduration:I
    .end local v9           #xweight:F
    .end local v10           #yduration:I
    .end local v11           #yweight:F
    :cond_0
    #v1=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Integer);
    int-to-float v12, v2

    #v12=(Float);
    int-to-float v13, v6

    #v13=(Float);
    div-float v9, v12, v13

    #v9=(Float);
    goto :goto_0

    .line 608
    .restart local v9       #xweight:F
    :cond_1
    int-to-float v12, v3

    int-to-float v13, v6

    div-float v11, v12, v13

    #v11=(Float);
    goto :goto_1
.end method

.method public static create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
    .locals 3
    .parameter "forParent"
    .parameter "sensitivity"
    .parameter "cb"

    .prologue
    .line 360
    invoke-static {p0, p2}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    .line 361
    .local v0, helper:Landroid/support/v4/widget/ViewDragHelper;
    #v0=(Reference);
    iget v1, v0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    #v1=(Integer);
    int-to-float v1, v1

    #v1=(Float);
    const/high16 v2, 0x3f80

    #v2=(Integer);
    div-float/2addr v2, p1

    #v2=(Float);
    mul-float/2addr v1, v2

    float-to-int v1, v1

    #v1=(Integer);
    iput v1, v0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    .line 362
    return-object v0
.end method

.method public static create(Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
    .locals 2
    .parameter "forParent"
    .parameter "cb"

    .prologue
    .line 347
    new-instance v0, Landroid/support/v4/widget/ViewDragHelper;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1, p0, p1}, Landroid/support/v4/widget/ViewDragHelper;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)V

    #v0=(Reference);
    return-object v0
.end method

.method private dispatchViewReleased(FF)V
    .locals 4
    .parameter "xvel"
    .parameter "yvel"

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, 0x0

    .line 759
    #v2=(Null);
    iput-boolean v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mReleaseInProgress:Z

    .line 760
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v0, v1, p1, p2}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewReleased(Landroid/view/View;FF)V

    .line 761
    iput-boolean v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mReleaseInProgress:Z

    .line 763
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    if-ne v0, v3, :cond_0

    .line 765
    invoke-virtual {p0, v2}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V

    .line 767
    :cond_0
    return-void
.end method

.method private distanceInfluenceForSnapDuration(F)F
    .locals 4
    .parameter "f"

    .prologue
    .line 674
    const/high16 v0, 0x3f00

    #v0=(Integer);
    sub-float/2addr p1, v0

    .line 675
    float-to-double v0, p1

    #v0=(DoubleLo);v1=(DoubleHi);
    const-wide v2, 0x3fde28c7460698c7L

    #v2=(LongLo);v3=(LongHi);
    mul-double/2addr v0, v2

    double-to-float p1, v0

    .line 676
    float-to-double v0, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D

    move-result-wide v0

    double-to-float v0, v0

    #v0=(Float);
    return v0
.end method

.method private dragTo(IIII)V
    .locals 8
    .parameter "left"
    .parameter "top"
    .parameter "dx"
    .parameter "dy"

    .prologue
    .line 1366
    move v2, p1

    .line 1367
    .local v2, clampedX:I
    #v2=(Integer);
    move v3, p2

    .line 1368
    .local v3, clampedY:I
    #v3=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v6

    .line 1369
    .local v6, oldLeft:I
    #v6=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v7

    .line 1370
    .local v7, oldTop:I
    #v7=(Integer);
    if-eqz p3, :cond_0

    .line 1371
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v0, v1, p1, p3}, Landroid/support/v4/widget/ViewDragHelper$Callback;->clampViewPositionHorizontal(Landroid/view/View;II)I

    move-result v2

    .line 1372
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    sub-int v1, v2, v6

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 1374
    :cond_0
    #v1=(Conflicted);
    if-eqz p4, :cond_1

    .line 1375
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v0, v1, p2, p4}, Landroid/support/v4/widget/ViewDragHelper$Callback;->clampViewPositionVertical(Landroid/view/View;II)I

    move-result v3

    .line 1376
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    sub-int v1, v3, v7

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 1379
    :cond_1
    #v1=(Conflicted);
    if-nez p3, :cond_2

    if-eqz p4, :cond_3

    .line 1380
    :cond_2
    sub-int v4, v2, v6

    .line 1381
    .local v4, clampedDx:I
    #v4=(Integer);
    sub-int v5, v3, v7

    .line 1382
    .local v5, clampedDy:I
    #v5=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewPositionChanged(Landroid/view/View;IIII)V

    .line 1385
    .end local v4           #clampedDx:I
    .end local v5           #clampedDy:I
    :cond_3
    #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void
.end method

.method private ensureMotionHistorySizeForId(I)V
    .locals 10
    .parameter "pointerId"

    .prologue
    const/4 v9, 0x0

    .line 798
    #v9=(Null);
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    #v7=(Reference);
    if-eqz v7, :cond_0

    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    array-length v7, v7

    #v7=(Integer);
    if-gt v7, p1, :cond_2

    .line 799
    :cond_0
    #v7=(Conflicted);
    add-int/lit8 v7, p1, 0x1

    #v7=(Integer);
    new-array v3, v7, [F

    .line 800
    .local v3, imx:[F
    #v3=(Reference);
    add-int/lit8 v7, p1, 0x1

    new-array v4, v7, [F

    .line 801
    .local v4, imy:[F
    #v4=(Reference);
    add-int/lit8 v7, p1, 0x1

    new-array v5, v7, [F

    .line 802
    .local v5, lmx:[F
    #v5=(Reference);
    add-int/lit8 v7, p1, 0x1

    new-array v6, v7, [F

    .line 803
    .local v6, lmy:[F
    #v6=(Reference);
    add-int/lit8 v7, p1, 0x1

    new-array v2, v7, [I

    .line 804
    .local v2, iit:[I
    #v2=(Reference);
    add-int/lit8 v7, p1, 0x1

    new-array v0, v7, [I

    .line 805
    .local v0, edip:[I
    #v0=(Reference);
    add-int/lit8 v7, p1, 0x1

    new-array v1, v7, [I

    .line 807
    .local v1, edl:[I
    #v1=(Reference);
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    #v7=(Reference);
    if-eqz v7, :cond_1

    .line 808
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    #v8=(Reference);
    array-length v8, v8

    #v8=(Integer);
    invoke-static {v7, v9, v3, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 809
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F

    iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F

    #v8=(Reference);
    array-length v8, v8

    #v8=(Integer);
    invoke-static {v7, v9, v4, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 810
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F

    iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F

    #v8=(Reference);
    array-length v8, v8

    #v8=(Integer);
    invoke-static {v7, v9, v5, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 811
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F

    iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F

    #v8=(Reference);
    array-length v8, v8

    #v8=(Integer);
    invoke-static {v7, v9, v6, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 812
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    #v8=(Reference);
    array-length v8, v8

    #v8=(Integer);
    invoke-static {v7, v9, v2, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 813
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I

    iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I

    #v8=(Reference);
    array-length v8, v8

    #v8=(Integer);
    invoke-static {v7, v9, v0, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 814
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I

    iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I

    #v8=(Reference);
    array-length v8, v8

    #v8=(Integer);
    invoke-static {v7, v9, v1, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 817
    :cond_1
    #v8=(Conflicted);
    iput-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    .line 818
    iput-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F

    .line 819
    iput-object v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F

    .line 820
    iput-object v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F

    .line 821
    iput-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    .line 822
    iput-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I

    .line 823
    iput-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I

    .line 825
    .end local v0           #edip:[I
    .end local v1           #edl:[I
    .end local v2           #iit:[I
    .end local v3           #imx:[F
    .end local v4           #imy:[F
    .end local v5           #lmx:[F
    .end local v6           #lmy:[F
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void
.end method

.method private forceSettleCapturedViewAt(IIII)Z
    .locals 11
    .parameter "finalLeft"
    .parameter "finalTop"
    .parameter "xvel"
    .parameter "yvel"

    .prologue
    const/4 v0, 0x0

    .line 577
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v10

    .line 578
    .local v10, startLeft:I
    #v10=(Integer);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v6

    .line 579
    .local v6, startTop:I
    #v6=(Integer);
    sub-int v2, p1, v10

    .line 580
    .local v2, dx:I
    #v2=(Integer);
    sub-int v3, p2, v6

    .line 582
    .local v3, dy:I
    #v3=(Integer);
    if-nez v2, :cond_0

    if-nez v3, :cond_0

    .line 584
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v1}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V

    .line 585
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V

    .line 593
    :goto_0
    #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return v0

    .line 589
    :cond_0
    #v0=(Null);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    move-object v0, p0

    #v0=(Reference);
    move v4, p3

    #v4=(Integer);
    move v5, p4

    #v5=(Integer);
    invoke-direct/range {v0 .. v5}, Landroid/support/v4/widget/ViewDragHelper;->computeSettleDuration(Landroid/view/View;IIII)I

    move-result v9

    .line 590
    .local v9, duration:I
    #v9=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    #v4=(Reference);
    move v5, v10

    move v7, v2

    #v7=(Integer);
    move v8, v3

    #v8=(Integer);
    invoke-virtual/range {v4 .. v9}, Landroid/support/v4/widget/ScrollerCompat;->startScroll(IIIII)V

    .line 592
    const/4 v0, 0x2

    #v0=(PosByte);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V

    .line 593
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method private getEdgesTouched(II)I
    .locals 3
    .parameter "x"
    .parameter "y"

    .prologue
    .line 1440
    const/4 v0, 0x0

    .line 1442
    .local v0, result:I
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLeft()I

    move-result v1

    #v1=(Integer);
    iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I

    #v2=(Integer);
    add-int/2addr v1, v2

    if-ge p1, v1, :cond_0

    or-int/lit8 v0, v0, 0x1

    .line 1443
    :cond_0
    #v0=(Boolean);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getTop()I

    move-result v1

    #v1=(Integer);
    iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I

    add-int/2addr v1, v2

    if-ge p2, v1, :cond_1

    or-int/lit8 v0, v0, 0x4

    .line 1444
    :cond_1
    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getRight()I

    move-result v1

    #v1=(Integer);
    iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I

    sub-int/2addr v1, v2

    if-le p1, v1, :cond_2

    or-int/lit8 v0, v0, 0x2

    .line 1445
    :cond_2
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getBottom()I

    move-result v1

    #v1=(Integer);
    iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I

    sub-int/2addr v1, v2

    if-le p2, v1, :cond_3

    or-int/lit8 v0, v0, 0x8

    .line 1447
    :cond_3
    return v0
.end method

.method private releaseViewForPointerUp()V
    .locals 5

    .prologue
    .line 1355
    iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v2=(Reference);
    const/16 v3, 0x3e8

    #v3=(PosShort);
    iget v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F

    #v4=(Integer);
    invoke-virtual {v2, v3, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 1356
    iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v3=(Integer);
    invoke-static {v2, v3}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v2

    #v2=(Float);
    iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F

    iget v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F

    invoke-direct {p0, v2, v3, v4}, Landroid/support/v4/widget/ViewDragHelper;->clampMag(FFF)F

    move-result v0

    .line 1359
    .local v0, xvel:F
    #v0=(Float);
    iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    invoke-static {v2, v3}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F

    move-result v2

    #v2=(Float);
    iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F

    iget v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F

    invoke-direct {p0, v2, v3, v4}, Landroid/support/v4/widget/ViewDragHelper;->clampMag(FFF)F

    move-result v1

    .line 1362
    .local v1, yvel:F
    #v1=(Float);
    invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->dispatchViewReleased(FF)V

    .line 1363
    return-void
.end method

.method private reportNewEdgeDrags(FFI)V
    .locals 3
    .parameter "dx"
    .parameter "dy"
    .parameter "pointerId"

    .prologue
    .line 1197
    const/4 v0, 0x0

    .line 1198
    .local v0, dragsStarted:I
    #v0=(Null);
    const/4 v1, 0x1

    #v1=(One);
    invoke-direct {p0, p1, p2, p3, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkNewEdgeDrag(FFII)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 1199
    or-int/lit8 v0, v0, 0x1

    .line 1201
    :cond_0
    #v0=(Boolean);
    const/4 v1, 0x4

    #v1=(PosByte);
    invoke-direct {p0, p2, p1, p3, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkNewEdgeDrag(FFII)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 1202
    or-int/lit8 v0, v0, 0x4

    .line 1204
    :cond_1
    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-direct {p0, p1, p2, p3, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkNewEdgeDrag(FFII)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    .line 1205
    or-int/lit8 v0, v0, 0x2

    .line 1207
    :cond_2
    const/16 v1, 0x8

    #v1=(PosByte);
    invoke-direct {p0, p2, p1, p3, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkNewEdgeDrag(FFII)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    .line 1208
    or-int/lit8 v0, v0, 0x8

    .line 1211
    :cond_3
    if-eqz v0, :cond_4

    .line 1212
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I

    #v1=(Reference);
    aget v2, v1, p3

    #v2=(Integer);
    or-int/2addr v2, v0

    aput v2, v1, p3

    .line 1213
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    invoke-virtual {v1, v0, p3}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeDragStarted(II)V

    .line 1215
    :cond_4
    #v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method private saveInitialMotion(FFI)V
    .locals 3
    .parameter "x"
    .parameter "y"
    .parameter "pointerId"

    .prologue
    .line 828
    invoke-direct {p0, p3}, Landroid/support/v4/widget/ViewDragHelper;->ensureMotionHistorySizeForId(I)V

    .line 829
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F

    #v1=(Reference);
    aput p1, v1, p3

    aput p1, v0, p3

    .line 830
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F

    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F

    aput p2, v1, p3

    aput p2, v0, p3

    .line 831
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    float-to-int v1, p1

    #v1=(Integer);
    float-to-int v2, p2

    #v2=(Integer);
    invoke-direct {p0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->getEdgesTouched(II)I

    move-result v1

    aput v1, v0, p3

    .line 832
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    shl-int/2addr v1, p3

    #v1=(Integer);
    or-int/2addr v0, v1

    iput v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I

    .line 833
    return-void
.end method

.method private saveLastMotion(Landroid/view/MotionEvent;)V
    .locals 6
    .parameter "ev"

    .prologue
    .line 836
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I

    move-result v1

    .line 837
    .local v1, pointerCount:I
    #v1=(Integer);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    if-ge v0, v1, :cond_0

    .line 838
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v2

    .line 839
    .local v2, pointerId:I
    #v2=(Integer);
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v3

    .line 840
    .local v3, x:F
    #v3=(Float);
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v4

    .line 841
    .local v4, y:F
    #v4=(Float);
    iget-object v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F

    #v5=(Reference);
    aput v3, v5, v2

    .line 842
    iget-object v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F

    aput v4, v5, v2

    .line 837
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 844
    .end local v2           #pointerId:I
    .end local v3           #x:F
    .end local v4           #y:F
    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void
.end method


# virtual methods
.method public abort()V
    .locals 8

    .prologue
    .line 512
    invoke-virtual {p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    .line 513
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

    .line 514
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrX()I

    move-result v6

    .line 515
    .local v6, oldX:I
    #v6=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrY()I

    move-result v7

    .line 516
    .local v7, oldY:I
    #v7=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V

    .line 517
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrX()I

    move-result v2

    .line 518
    .local v2, newX:I
    #v2=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrY()I

    move-result v3

    .line 519
    .local v3, newY:I
    #v3=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v1=(Reference);
    sub-int v4, v2, v6

    #v4=(Integer);
    sub-int v5, v3, v7

    #v5=(Integer);
    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewPositionChanged(Landroid/view/View;IIII)V

    .line 521
    .end local v2           #newX:I
    .end local v3           #newY:I
    .end local v6           #oldX:I
    .end local v7           #oldY:I
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V

    .line 522
    return-void
.end method

.method protected canScroll(Landroid/view/View;ZIIII)Z
    .locals 13
    .parameter "v"
    .parameter "checkV"
    .parameter "dx"
    .parameter "dy"
    .parameter "x"
    .parameter "y"

    .prologue
    .line 908
    instance-of v1, p1, Landroid/view/ViewGroup;

    #v1=(Boolean);
    if-eqz v1, :cond_1

    move-object v9, p1

    .line 909
    #v9=(Reference);
    check-cast v9, Landroid/view/ViewGroup;

    .line 910
    .local v9, group:Landroid/view/ViewGroup;
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v11

    .line 911
    .local v11, scrollX:I
    #v11=(Integer);
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v12

    .line 912
    .local v12, scrollY:I
    #v12=(Integer);
    invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v8

    .line 914
    .local v8, count:I
    #v8=(Integer);
    add-int/lit8 v10, v8, -0x1

    .local v10, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Integer);
    if-ltz v10, :cond_1

    .line 917
    invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 918
    .local v2, child:Landroid/view/View;
    #v2=(Reference);
    add-int v1, p5, v11

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v3

    #v3=(Integer);
    if-lt v1, v3, :cond_0

    add-int v1, p5, v11

    invoke-virtual {v2}, Landroid/view/View;->getRight()I

    move-result v3

    if-ge v1, v3, :cond_0

    add-int v1, p6, v12

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v3

    if-lt v1, v3, :cond_0

    add-int v1, p6, v12

    invoke-virtual {v2}, Landroid/view/View;->getBottom()I

    move-result v3

    if-ge v1, v3, :cond_0

    const/4 v3, 0x1

    #v3=(One);
    add-int v1, p5, v11

    invoke-virtual {v2}, Landroid/view/View;->getLeft()I

    move-result v4

    #v4=(Integer);
    sub-int v6, v1, v4

    #v6=(Integer);
    add-int v1, p6, v12

    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v4

    sub-int v7, v1, v4

    #v7=(Integer);
    move-object v1, p0

    #v1=(Reference);
    move/from16 v4, p3

    move/from16 v5, p4

    #v5=(Integer);
    invoke-virtual/range {v1 .. v7}, Landroid/support/v4/widget/ViewDragHelper;->canScroll(Landroid/view/View;ZIIII)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 922
    const/4 v1, 0x1

    .line 927
    .end local v2           #child:Landroid/view/View;
    .end local v8           #count:I
    .end local v9           #group:Landroid/view/ViewGroup;
    .end local v10           #i:I
    .end local v11           #scrollX:I
    .end local v12           #scrollY:I
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    return v1

    .line 914
    .restart local v2       #child:Landroid/view/View;
    .restart local v8       #count:I
    .restart local v9       #group:Landroid/view/ViewGroup;
    .restart local v10       #i:I
    .restart local v11       #scrollX:I
    .restart local v12       #scrollY:I
    :cond_0
    #v0=(Uninit);v1=(Integer);v2=(Reference);v3=(Integer);v8=(Integer);v9=(Reference);v10=(Integer);v11=(Integer);v12=(Integer);
    add-int/lit8 v10, v10, -0x1

    goto :goto_0

    .line 927
    .end local v2           #child:Landroid/view/View;
    .end local v8           #count:I
    .end local v9           #group:Landroid/view/ViewGroup;
    .end local v10           #i:I
    .end local v11           #scrollX:I
    .end local v12           #scrollY:I
    :cond_1
    #v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-eqz p2, :cond_3

    move/from16 v0, p3

    #v0=(Integer);
    neg-int v1, v0

    invoke-static {p1, v1}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_2

    move/from16 v0, p4

    neg-int v1, v0

    #v1=(Integer);
    invoke-static {p1, v1}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_3

    :cond_2
    const/4 v1, 0x1

    #v1=(One);
    goto :goto_1

    :cond_3
    #v0=(Conflicted);v1=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_1
.end method

.method public cancel()V
    .locals 1

    .prologue
    .line 498
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    .line 499
    invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper;->clearMotionHistory()V

    .line 501
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 502
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    .line 503
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 505
    :cond_0
    #v0=(Reference);
    return-void
.end method

.method public captureChildView(Landroid/view/View;I)V
    .locals 3
    .parameter "childView"
    .parameter "activePointerId"

    .prologue
    .line 460
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    #v1=(Reference);
    if-eq v0, v1, :cond_0

    .line 461
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ")"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 465
    :cond_0
    #v2=(Uninit);
    iput-object p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    .line 466
    iput p2, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    .line 467
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    invoke-virtual {v0, p1, p2}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewCaptured(Landroid/view/View;I)V

    .line 468
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V

    .line 469
    return-void
.end method

.method public checkTouchSlop(I)Z
    .locals 3
    .parameter "directions"

    .prologue
    .line 1276
    iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    #v2=(Reference);
    array-length v0, v2

    .line 1277
    .local v0, count:I
    #v0=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);
    if-ge v1, v0, :cond_1

    .line 1278
    invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(II)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 1279
    const/4 v2, 0x1

    .line 1282
    :goto_1
    return v2

    .line 1277
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1282
    :cond_1
    #v2=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_1
.end method

.method public checkTouchSlop(II)Z
    .locals 9
    .parameter "directions"
    .parameter "pointerId"

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/4 v5, 0x0

    .line 1301
    #v5=(Null);
    invoke-virtual {p0, p2}, Landroid/support/v4/widget/ViewDragHelper;->isPointerDown(I)Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_1

    move v4, v5

    .line 1318
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
    return v4

    .line 1305
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);v6=(Boolean);v7=(Uninit);v8=(Uninit);
    and-int/lit8 v6, p1, 0x1

    #v6=(Integer);
    if-ne v6, v4, :cond_2

    move v0, v4

    .line 1306
    .local v0, checkHorizontal:Z
    :goto_1
    #v0=(Boolean);
    and-int/lit8 v6, p1, 0x2

    const/4 v7, 0x2

    #v7=(PosByte);
    if-ne v6, v7, :cond_3

    move v1, v4

    .line 1308
    .local v1, checkVertical:Z
    :goto_2
    #v1=(Boolean);
    iget-object v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F

    #v6=(Reference);
    aget v6, v6, p2

    #v6=(Integer);
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    #v7=(Reference);
    aget v7, v7, p2

    #v7=(Integer);
    sub-float v2, v6, v7

    .line 1309
    .local v2, dx:F
    #v2=(Float);
    iget-object v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F

    #v6=(Reference);
    aget v6, v6, p2

    #v6=(Integer);
    iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F

    #v7=(Reference);
    aget v7, v7, p2

    #v7=(Integer);
    sub-float v3, v6, v7

    .line 1311
    .local v3, dy:F
    #v3=(Float);
    if-eqz v0, :cond_4

    if-eqz v1, :cond_4

    .line 1312
    mul-float v6, v2, v2

    #v6=(Float);
    mul-float v7, v3, v3

    #v7=(Float);
    add-float/2addr v6, v7

    iget v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    #v7=(Integer);
    iget v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    #v8=(Integer);
    mul-int/2addr v7, v8

    int-to-float v7, v7

    #v7=(Float);
    cmpl-float v6, v6, v7

    #v6=(Byte);
    if-gtz v6, :cond_0

    move v4, v5

    #v4=(Null);
    goto :goto_0

    .end local v0           #checkHorizontal:Z
    .end local v1           #checkVertical:Z
    .end local v2           #dx:F
    .end local v3           #dy:F
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);v6=(Integer);v7=(Uninit);v8=(Uninit);
    move v0, v5

    .line 1305
    #v0=(Null);
    goto :goto_1

    .restart local v0       #checkHorizontal:Z
    :cond_3
    #v0=(Boolean);v7=(PosByte);
    move v1, v5

    .line 1306
    #v1=(Null);
    goto :goto_2

    .line 1313
    .restart local v1       #checkVertical:Z
    .restart local v2       #dx:F
    .restart local v3       #dy:F
    :cond_4
    #v1=(Boolean);v2=(Float);v3=(Float);v7=(Integer);
    if-eqz v0, :cond_5

    .line 1314
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v6

    #v6=(Float);
    iget v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    int-to-float v7, v7

    #v7=(Float);
    cmpl-float v6, v6, v7

    #v6=(Byte);
    if-gtz v6, :cond_0

    move v4, v5

    #v4=(Null);
    goto :goto_0

    .line 1315
    :cond_5
    #v4=(One);v6=(Integer);v7=(Integer);
    if-eqz v1, :cond_6

    .line 1316
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v6

    #v6=(Float);
    iget v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    int-to-float v7, v7

    #v7=(Float);
    cmpl-float v6, v6, v7

    #v6=(Byte);
    if-gtz v6, :cond_0

    move v4, v5

    #v4=(Null);
    goto :goto_0

    :cond_6
    #v4=(One);v6=(Integer);v7=(Integer);
    move v4, v5

    .line 1318
    #v4=(Null);
    goto :goto_0
.end method

.method public continueSettling(Z)Z
    .locals 9
    .parameter "deferCallbacks"

    .prologue
    const/4 v8, 0x2

    #v8=(PosByte);
    const/4 v7, 0x0

    .line 715
    #v7=(Null);
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    if-ne v0, v8, :cond_5

    .line 716
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->computeScrollOffset()Z

    move-result v6

    .line 717
    .local v6, keepGoing:Z
    #v6=(Boolean);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrX()I

    move-result v2

    .line 718
    .local v2, x:I
    #v2=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrY()I

    move-result v3

    .line 719
    .local v3, y:I
    #v3=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v0

    #v0=(Integer);
    sub-int v4, v2, v0

    .line 720
    .local v4, dx:I
    #v4=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    #v0=(Integer);
    sub-int v5, v3, v0

    .line 722
    .local v5, dy:I
    #v5=(Integer);
    if-eqz v4, :cond_0

    .line 723
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0, v4}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 725
    :cond_0
    #v0=(Conflicted);
    if-eqz v5, :cond_1

    .line 726
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0, v5}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 729
    :cond_1
    #v0=(Conflicted);
    if-nez v4, :cond_2

    if-eqz v5, :cond_3

    .line 730
    :cond_2
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewPositionChanged(Landroid/view/View;IIII)V

    .line 733
    :cond_3
    #v0=(Conflicted);v1=(Conflicted);
    if-eqz v6, :cond_4

    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getFinalX()I

    move-result v0

    #v0=(Integer);
    if-ne v2, v0, :cond_4

    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getFinalY()I

    move-result v0

    #v0=(Integer);
    if-ne v3, v0, :cond_4

    .line 736
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V

    .line 737
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->isFinished()Z

    move-result v6

    .line 740
    :cond_4
    #v0=(Conflicted);
    if-nez v6, :cond_5

    .line 741
    if-eqz p1, :cond_6

    .line 742
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mSetIdleRunnable:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    .line 749
    .end local v2           #x:I
    .end local v3           #y:I
    .end local v4           #dx:I
    .end local v5           #dy:I
    .end local v6           #keepGoing:Z
    :cond_5
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    if-ne v0, v8, :cond_7

    const/4 v0, 0x1

    :goto_1
    #v0=(Boolean);
    return v0

    .line 744
    .restart local v2       #x:I
    .restart local v3       #y:I
    .restart local v4       #dx:I
    .restart local v5       #dy:I
    .restart local v6       #keepGoing:Z
    :cond_6
    #v0=(Conflicted);v2=(Integer);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Boolean);
    invoke-virtual {p0, v7}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V

    goto :goto_0

    .end local v2           #x:I
    .end local v3           #y:I
    .end local v4           #dx:I
    .end local v5           #dy:I
    .end local v6           #keepGoing:Z
    :cond_7
    #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move v0, v7

    .line 749
    #v0=(Null);
    goto :goto_1
.end method

.method public findTopChildUnder(II)Landroid/view/View;
    .locals 5
    .parameter "x"
    .parameter "y"

    .prologue
    .line 1428
    iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    .line 1429
    .local v1, childCount:I
    #v1=(Integer);
    add-int/lit8 v2, v1, -0x1

    .local v2, i:I
    :goto_0
    #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
    if-ltz v2, :cond_1

    .line 1430
    iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v4=(Reference);
    invoke-virtual {v4, v2}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getOrderedChildIndex(I)I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 1431
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    move-result v3

    #v3=(Integer);
    if-lt p1, v3, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getRight()I

    move-result v3

    if-ge p1, v3, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v3

    if-lt p2, v3, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v3

    if-ge p2, v3, :cond_0

    .line 1436
    .end local v0           #child:Landroid/view/View;
    :goto_1
    #v3=(Conflicted);v4=(Conflicted);
    return-object v0

    .line 1429
    .restart local v0       #child:Landroid/view/View;
    :cond_0
    #v3=(Integer);v4=(Integer);
    add-int/lit8 v2, v2, -0x1

    goto :goto_0

    .line 1436
    .end local v0           #child:Landroid/view/View;
    :cond_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method public flingCapturedView(IIII)V
    .locals 9
    .parameter "minLeft"
    .parameter "minTop"
    .parameter "maxLeft"
    .parameter "maxTop"

    .prologue
    .line 690
    iget-boolean v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mReleaseInProgress:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 691
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "Cannot flingCapturedView outside of a call to Callback#onViewReleased"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 695
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v1

    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v2

    #v2=(Integer);
    iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v3=(Reference);
    iget v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v4=(Integer);
    invoke-static {v3, v4}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v3

    #v3=(Float);
    float-to-int v3, v3

    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v5=(Integer);
    invoke-static {v4, v5}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F

    move-result v4

    #v4=(Float);
    float-to-int v4, v4

    #v4=(Integer);
    move v5, p1

    move v6, p3

    #v6=(Integer);
    move v7, p2

    #v7=(Integer);
    move v8, p4

    #v8=(Integer);
    invoke-virtual/range {v0 .. v8}, Landroid/support/v4/widget/ScrollerCompat;->fling(IIIIIIII)V

    .line 700
    const/4 v0, 0x2

    #v0=(PosByte);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V

    .line 701
    return-void
.end method

.method public getActivePointerId()I
    .locals 1

    .prologue
    .line 483
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v0=(Integer);
    return v0
.end method

.method public getCapturedView()Landroid/view/View;
    .locals 1

    .prologue
    .line 475
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method public getEdgeSize()I
    .locals 1

    .prologue
    .line 448
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I

    #v0=(Integer);
    return v0
.end method

.method public getMinVelocity()F
    .locals 1

    .prologue
    .line 412
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F

    #v0=(Integer);
    return v0
.end method

.method public getTouchSlop()I
    .locals 1

    .prologue
    .line 490
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I

    #v0=(Integer);
    return v0
.end method

.method public getViewDragState()I
    .locals 1

    .prologue
    .line 421
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    return v0
.end method

.method public isCapturedViewUnder(II)Z
    .locals 1
    .parameter "x"
    .parameter "y"

    .prologue
    .line 1397
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {p0, v0, p1, p2}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isEdgeTouched(I)Z
    .locals 3
    .parameter "edges"

    .prologue
    .line 1331
    iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    #v2=(Reference);
    array-length v0, v2

    .line 1332
    .local v0, count:I
    #v0=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);
    if-ge v1, v0, :cond_1

    .line 1333
    invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ViewDragHelper;->isEdgeTouched(II)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 1334
    const/4 v2, 0x1

    .line 1337
    :goto_1
    return v2

    .line 1332
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1337
    :cond_1
    #v2=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_1
.end method

.method public isEdgeTouched(II)Z
    .locals 1
    .parameter "edges"
    .parameter "pointerId"

    .prologue
    .line 1351
    invoke-virtual {p0, p2}, Landroid/support/v4/widget/ViewDragHelper;->isPointerDown(I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    #v0=(Reference);
    aget v0, v0, p2

    #v0=(Integer);
    and-int/2addr v0, p1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isPointerDown(I)Z
    .locals 3
    .parameter "pointerId"

    .prologue
    const/4 v0, 0x1

    .line 860
    #v0=(One);
    iget v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I

    #v1=(Integer);
    shl-int v2, v0, p1

    #v2=(Integer);
    and-int/2addr v1, v2

    if-eqz v1, :cond_0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isViewUnder(Landroid/view/View;II)Z
    .locals 2
    .parameter "view"
    .parameter "x"
    .parameter "y"

    .prologue
    const/4 v0, 0x0

    .line 1410
    #v0=(Null);
    if-nez p1, :cond_1

    .line 1413
    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_1
    #v0=(Null);v1=(Uninit);
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    #v1=(Integer);
    if-lt p2, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    if-ge p2, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v1

    if-lt p3, v1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    move-result v1

    if-ge p3, v1, :cond_0

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0
.end method

.method public processTouchEvent(Landroid/view/MotionEvent;)V
    .locals 21
    .parameter "ev"

    .prologue
    .line 1046
    invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v3

    .line 1047
    .local v3, action:I
    #v3=(Integer);
    invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v4

    .line 1049
    .local v4, actionIndex:I
    #v4=(Integer);
    if-nez v3, :cond_0

    .line 1052
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    .line 1055
    :cond_0
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v19, v0

    #v19=(Reference);
    if-nez v19, :cond_1

    .line 1056
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v19

    move-object/from16 v0, v19

    move-object/from16 v1, p0

    #v1=(Reference);
    iput-object v0, v1, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 1058
    :cond_1
    #v1=(Conflicted);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    move-object/from16 v1, p1

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1060
    packed-switch v3, :pswitch_data_0

    .line 1194
    :cond_2
    :goto_0
    :pswitch_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    return-void

    .line 1062
    :pswitch_1
    #v0=(Reference);v1=(Reference);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Reference);v20=(Uninit);
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F

    move-result v17

    .line 1063
    .local v17, x:F
    #v17=(Float);
    invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F

    move-result v18

    .line 1064
    .local v18, y:F
    #v18=(Float);
    const/16 v19, 0x0

    #v19=(Null);
    move-object/from16 v0, p1

    move/from16 v1, v19

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v15

    .line 1065
    .local v15, pointerId:I
    #v15=(Integer);
    move/from16 v0, v17

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    move/from16 v0, v18

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v20, v0

    #v20=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v19

    #v1=(Integer);
    move/from16 v2, v20

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;

    move-result-object v16

    .line 1067
    .local v16, toCapture:Landroid/view/View;
    #v16=(Reference);
    move-object/from16 v0, p0

    move/from16 v1, v17

    #v1=(Float);
    move/from16 v2, v18

    #v2=(Float);
    invoke-direct {v0, v1, v2, v15}, Landroid/support/v4/widget/ViewDragHelper;->saveInitialMotion(FFI)V

    .line 1072
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    #v1=(Reference);
    invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z

    .line 1074
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    move-object/from16 v19, v0

    #v19=(Reference);
    aget v7, v19, v15

    .line 1075
    .local v7, edgesTouched:I
    #v7=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    and-int v19, v19, v7

    if-eqz v19, :cond_2

    .line 1076
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    move-object/from16 v19, v0

    #v19=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    #v0=(Integer);
    move/from16 v20, v0

    and-int v20, v20, v7

    move-object/from16 v0, v19

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeTouched(II)V

    goto :goto_0

    .line 1082
    .end local v7           #edgesTouched:I
    .end local v15           #pointerId:I
    .end local v16           #toCapture:Landroid/view/View;
    .end local v17           #x:F
    .end local v18           #y:F
    :pswitch_2
    #v1=(Reference);v2=(Uninit);v7=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v20=(Uninit);
    move-object/from16 v0, p1

    invoke-static {v0, v4}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v15

    .line 1083
    .restart local v15       #pointerId:I
    #v15=(Integer);
    move-object/from16 v0, p1

    invoke-static {v0, v4}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v17

    .line 1084
    .restart local v17       #x:F
    #v17=(Float);
    move-object/from16 v0, p1

    invoke-static {v0, v4}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v18

    .line 1086
    .restart local v18       #y:F
    #v18=(Float);
    move-object/from16 v0, p0

    move/from16 v1, v17

    #v1=(Float);
    move/from16 v2, v18

    #v2=(Float);
    invoke-direct {v0, v1, v2, v15}, Landroid/support/v4/widget/ViewDragHelper;->saveInitialMotion(FFI)V

    .line 1089
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    if-nez v19, :cond_3

    .line 1092
    move/from16 v0, v17

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v19, v0

    move/from16 v0, v18

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v20, v0

    #v20=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v19

    #v1=(Integer);
    move/from16 v2, v20

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;

    move-result-object v16

    .line 1093
    .restart local v16       #toCapture:Landroid/view/View;
    #v16=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    #v1=(Reference);
    invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z

    .line 1095
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    move-object/from16 v19, v0

    #v19=(Reference);
    aget v7, v19, v15

    .line 1096
    .restart local v7       #edgesTouched:I
    #v7=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    and-int v19, v19, v7

    if-eqz v19, :cond_2

    .line 1097
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    move-object/from16 v19, v0

    #v19=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    #v0=(Integer);
    move/from16 v20, v0

    and-int v20, v20, v7

    move-object/from16 v0, v19

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeTouched(II)V

    goto/16 :goto_0

    .line 1099
    .end local v7           #edgesTouched:I
    .end local v16           #toCapture:Landroid/view/View;
    :cond_3
    #v0=(Integer);v1=(Float);v2=(Float);v7=(Uninit);v16=(Uninit);v19=(Integer);v20=(Uninit);
    move/from16 v0, v17

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v19, v0

    move/from16 v0, v18

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v20, v0

    #v20=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v19

    #v1=(Integer);
    move/from16 v2, v20

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->isCapturedViewUnder(II)Z

    move-result v19

    #v19=(Boolean);
    if-eqz v19, :cond_2

    .line 1104
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    move-object/from16 v19, v0

    #v19=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v19

    #v1=(Reference);
    invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z

    goto/16 :goto_0

    .line 1110
    .end local v15           #pointerId:I
    .end local v17           #x:F
    .end local v18           #y:F
    :pswitch_3
    #v2=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v20=(Uninit);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    const/16 v20, 0x1

    #v20=(One);
    move/from16 v0, v19

    move/from16 v1, v20

    #v1=(One);
    if-ne v0, v1, :cond_4

    .line 1111
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v19, v0

    move-object/from16 v0, p1

    #v0=(Reference);
    move/from16 v1, v19

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v12

    .line 1112
    .local v12, index:I
    #v12=(Integer);
    move-object/from16 v0, p1

    invoke-static {v0, v12}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v17

    .line 1113
    .restart local v17       #x:F
    #v17=(Float);
    move-object/from16 v0, p1

    invoke-static {v0, v12}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v18

    .line 1114
    .restart local v18       #y:F
    #v18=(Float);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F

    move-object/from16 v19, v0

    #v19=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v20, v0

    #v20=(Integer);
    aget v19, v19, v20

    #v19=(Integer);
    sub-float v19, v17, v19

    #v19=(Float);
    move/from16 v0, v19

    #v0=(Float);
    float-to-int v10, v0

    .line 1115
    .local v10, idx:I
    #v10=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F

    move-object/from16 v19, v0

    #v19=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v20, v0

    aget v19, v19, v20

    #v19=(Integer);
    sub-float v19, v18, v19

    #v19=(Float);
    move/from16 v0, v19

    #v0=(Float);
    float-to-int v11, v0

    .line 1117
    .local v11, idy:I
    #v11=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    move-object/from16 v19, v0

    #v19=(Reference);
    invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLeft()I

    move-result v19

    #v19=(Integer);
    add-int v19, v19, v10

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    move-object/from16 v20, v0

    #v20=(Reference);
    invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getTop()I

    move-result v20

    #v20=(Integer);
    add-int v20, v20, v11

    move-object/from16 v0, p0

    move/from16 v1, v19

    move/from16 v2, v20

    #v2=(Integer);
    invoke-direct {v0, v1, v2, v10, v11}, Landroid/support/v4/widget/ViewDragHelper;->dragTo(IIII)V

    .line 1119
    invoke-direct/range {p0 .. p1}, Landroid/support/v4/widget/ViewDragHelper;->saveLastMotion(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    .line 1122
    .end local v10           #idx:I
    .end local v11           #idy:I
    .end local v12           #index:I
    .end local v17           #x:F
    .end local v18           #y:F
    :cond_4
    #v0=(Integer);v1=(One);v2=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v17=(Uninit);v18=(Uninit);v20=(One);
    invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I

    move-result v14

    .line 1123
    .local v14, pointerCount:I
    #v14=(Integer);
    const/4 v8, 0x0

    .local v8, i:I
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Integer);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Integer);
    if-ge v8, v14, :cond_5

    .line 1124
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v15

    .line 1125
    .restart local v15       #pointerId:I
    #v15=(Integer);
    move-object/from16 v0, p1

    invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v17

    .line 1126
    .restart local v17       #x:F
    #v17=(Float);
    move-object/from16 v0, p1

    invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v18

    .line 1127
    .restart local v18       #y:F
    #v18=(Float);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    move-object/from16 v19, v0

    #v19=(Reference);
    aget v19, v19, v15

    #v19=(Integer);
    sub-float v5, v17, v19

    .line 1128
    .local v5, dx:F
    #v5=(Float);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F

    move-object/from16 v19, v0

    #v19=(Reference);
    aget v19, v19, v15

    #v19=(Integer);
    sub-float v6, v18, v19

    .line 1130
    .local v6, dy:F
    #v6=(Float);
    move-object/from16 v0, p0

    invoke-direct {v0, v5, v6, v15}, Landroid/support/v4/widget/ViewDragHelper;->reportNewEdgeDrags(FFI)V

    .line 1131
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    move/from16 v19, v0

    const/16 v20, 0x1

    #v20=(One);
    move/from16 v0, v19

    move/from16 v1, v20

    #v1=(One);
    if-ne v0, v1, :cond_6

    .line 1142
    .end local v5           #dx:F
    .end local v6           #dy:F
    .end local v15           #pointerId:I
    .end local v17           #x:F
    .end local v18           #y:F
    :cond_5
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Integer);
    invoke-direct/range {p0 .. p1}, Landroid/support/v4/widget/ViewDragHelper;->saveLastMotion(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    .line 1136
    .restart local v5       #dx:F
    .restart local v6       #dy:F
    .restart local v15       #pointerId:I
    .restart local v17       #x:F
    .restart local v18       #y:F
    :cond_6
    #v0=(Integer);v1=(One);v5=(Float);v6=(Float);v15=(Integer);v17=(Float);v18=(Float);v20=(One);
    move/from16 v0, v17

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v19, v0

    move/from16 v0, v18

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v20, v0

    #v20=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v19

    #v1=(Integer);
    move/from16 v2, v20

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;

    move-result-object v16

    .line 1137
    .restart local v16       #toCapture:Landroid/view/View;
    #v16=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v16

    #v1=(Reference);
    invoke-direct {v0, v1, v5, v6}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(Landroid/view/View;FF)Z

    move-result v19

    #v19=(Boolean);
    if-eqz v19, :cond_7

    move-object/from16 v0, p0

    move-object/from16 v1, v16

    invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z

    move-result v19

    if-nez v19, :cond_5

    .line 1123
    :cond_7
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    .line 1148
    .end local v5           #dx:F
    .end local v6           #dy:F
    .end local v8           #i:I
    .end local v14           #pointerCount:I
    .end local v15           #pointerId:I
    .end local v16           #toCapture:Landroid/view/View;
    .end local v17           #x:F
    .end local v18           #y:F
    :pswitch_4
    #v2=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Reference);v20=(Uninit);
    move-object/from16 v0, p1

    invoke-static {v0, v4}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v15

    .line 1149
    .restart local v15       #pointerId:I
    #v15=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    const/16 v20, 0x1

    #v20=(One);
    move/from16 v0, v19

    move/from16 v1, v20

    #v1=(One);
    if-ne v0, v1, :cond_b

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v19, v0

    move/from16 v0, v19

    if-ne v15, v0, :cond_b

    .line 1151
    const/4 v13, -0x1

    .line 1152
    .local v13, newActivePointer:I
    #v13=(Byte);
    invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I

    move-result v14

    .line 1153
    .restart local v14       #pointerCount:I
    #v14=(Integer);
    const/4 v8, 0x0

    .restart local v8       #i:I
    :goto_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v8=(Integer);v9=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    if-ge v8, v14, :cond_a

    .line 1154
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v9

    .line 1155
    .local v9, id:I
    #v9=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    move/from16 v0, v19

    if-ne v9, v0, :cond_9

    .line 1153
    :cond_8
    #v0=(Conflicted);v19=(Conflicted);
    add-int/lit8 v8, v8, 0x1

    goto :goto_2

    .line 1160
    :cond_9
    #v0=(Integer);v19=(Integer);
    move-object/from16 v0, p1

    #v0=(Reference);
    invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v17

    .line 1161
    .restart local v17       #x:F
    #v17=(Float);
    move-object/from16 v0, p1

    invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v18

    .line 1162
    .restart local v18       #y:F
    #v18=(Float);
    move/from16 v0, v17

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v19, v0

    move/from16 v0, v18

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v20, v0

    #v20=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v19

    #v1=(Integer);
    move/from16 v2, v20

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;

    move-result-object v19

    #v19=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    move-object/from16 v20, v0

    #v20=(Reference);
    move-object/from16 v0, v19

    move-object/from16 v1, v20

    #v1=(Reference);
    if-ne v0, v1, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    move-object/from16 v19, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v19

    invoke-virtual {v0, v1, v9}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z

    move-result v19

    #v19=(Boolean);
    if-eqz v19, :cond_8

    .line 1164
    move-object/from16 v0, p0

    iget v13, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    .line 1169
    .end local v9           #id:I
    .end local v17           #x:F
    .end local v18           #y:F
    :cond_a
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v9=(Conflicted);v13=(Integer);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
    const/16 v19, -0x1

    #v19=(Byte);
    move/from16 v0, v19

    #v0=(Byte);
    if-ne v13, v0, :cond_b

    .line 1171
    invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->releaseViewForPointerUp()V

    .line 1174
    .end local v8           #i:I
    .end local v13           #newActivePointer:I
    .end local v14           #pointerCount:I
    :cond_b
    #v0=(Integer);v8=(Conflicted);v13=(Conflicted);v14=(Conflicted);v19=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-direct {v0, v15}, Landroid/support/v4/widget/ViewDragHelper;->clearMotionHistory(I)V

    goto/16 :goto_0

    .line 1179
    .end local v15           #pointerId:I
    :pswitch_5
    #v1=(Reference);v2=(Uninit);v8=(Uninit);v9=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Reference);v20=(Uninit);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    const/16 v20, 0x1

    #v20=(One);
    move/from16 v0, v19

    move/from16 v1, v20

    #v1=(One);
    if-ne v0, v1, :cond_c

    .line 1180
    invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->releaseViewForPointerUp()V

    .line 1182
    :cond_c
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    goto/16 :goto_0

    .line 1187
    :pswitch_6
    #v0=(Reference);v1=(Reference);v19=(Reference);v20=(Uninit);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    move/from16 v19, v0

    #v19=(Integer);
    const/16 v20, 0x1

    #v20=(One);
    move/from16 v0, v19

    move/from16 v1, v20

    #v1=(One);
    if-ne v0, v1, :cond_d

    .line 1188
    const/16 v19, 0x0

    #v19=(Null);
    const/16 v20, 0x0

    #v20=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v19

    #v1=(Null);
    move/from16 v2, v20

    #v2=(Null);
    invoke-direct {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->dispatchViewReleased(FF)V

    .line 1190
    :cond_d
    #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v19=(Integer);v20=(Boolean);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    goto/16 :goto_0

    .line 1060
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_3
        :pswitch_6
        :pswitch_0
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method

.method setDragState(I)V
    .locals 1
    .parameter "state"

    .prologue
    .line 864
    iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v0=(Integer);
    if-eq v0, p1, :cond_0

    .line 865
    iput p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    .line 866
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewDragStateChanged(I)V

    .line 867
    if-nez p1, :cond_0

    .line 868
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    .line 871
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public setEdgeTrackingEnabled(I)V
    .locals 0
    .parameter "edgeFlags"

    .prologue
    .line 437
    iput p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    .line 438
    return-void
.end method

.method public setMinVelocity(F)V
    .locals 0
    .parameter "minVel"

    .prologue
    .line 401
    iput p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F

    .line 402
    return-void
.end method

.method public settleCapturedViewAt(II)Z
    .locals 3
    .parameter "finalLeft"
    .parameter "finalTop"

    .prologue
    .line 557
    iget-boolean v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mReleaseInProgress:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 558
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 562
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F

    move-result v0

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v2=(Integer);
    invoke-static {v1, v2}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F

    move-result v1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->forceSettleCapturedViewAt(IIII)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13
    .parameter "ev"

    .prologue
    .line 939
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    .line 940
    .local v0, action:I
    #v0=(Integer);
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v1

    .line 942
    .local v1, actionIndex:I
    #v1=(Integer);
    if-nez v0, :cond_0

    .line 945
    invoke-virtual {p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    .line 948
    :cond_0
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    #v11=(Reference);
    if-nez v11, :cond_1

    .line 949
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v11

    iput-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    .line 951
    :cond_1
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;

    invoke-virtual {v11, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 953
    packed-switch v0, :pswitch_data_0

    .line 1036
    :cond_2
    :goto_0
    :pswitch_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v11=(Integer);
    const/4 v12, 0x1

    #v12=(One);
    if-ne v11, v12, :cond_8

    const/4 v11, 0x1

    :goto_1
    #v11=(Boolean);
    return v11

    .line 955
    :pswitch_1
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Reference);v12=(Uninit);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v9

    .line 956
    .local v9, x:F
    #v9=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v10

    .line 957
    .local v10, y:F
    #v10=(Float);
    const/4 v11, 0x0

    #v11=(Null);
    invoke-static {p1, v11}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v7

    .line 958
    .local v7, pointerId:I
    #v7=(Integer);
    invoke-direct {p0, v9, v10, v7}, Landroid/support/v4/widget/ViewDragHelper;->saveInitialMotion(FFI)V

    .line 960
    float-to-int v11, v9

    #v11=(Integer);
    float-to-int v12, v10

    #v12=(Integer);
    invoke-virtual {p0, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;

    move-result-object v8

    .line 963
    .local v8, toCapture:Landroid/view/View;
    #v8=(Reference);
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v11=(Reference);
    if-ne v8, v11, :cond_3

    iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v11=(Integer);
    const/4 v12, 0x2

    #v12=(PosByte);
    if-ne v11, v12, :cond_3

    .line 964
    invoke-virtual {p0, v8, v7}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z

    .line 967
    :cond_3
    #v11=(Conflicted);v12=(Integer);
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    #v11=(Reference);
    aget v4, v11, v7

    .line 968
    .local v4, edgesTouched:I
    #v4=(Integer);
    iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    #v11=(Integer);
    and-int/2addr v11, v4

    if-eqz v11, :cond_2

    .line 969
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v11=(Reference);
    iget v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    and-int/2addr v12, v4

    invoke-virtual {v11, v12, v7}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeTouched(II)V

    goto :goto_0

    .line 975
    .end local v4           #edgesTouched:I
    .end local v7           #pointerId:I
    .end local v8           #toCapture:Landroid/view/View;
    .end local v9           #x:F
    .end local v10           #y:F
    :pswitch_2
    #v4=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Uninit);
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v7

    .line 976
    .restart local v7       #pointerId:I
    #v7=(Integer);
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v9

    .line 977
    .restart local v9       #x:F
    #v9=(Float);
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v10

    .line 979
    .restart local v10       #y:F
    #v10=(Float);
    invoke-direct {p0, v9, v10, v7}, Landroid/support/v4/widget/ViewDragHelper;->saveInitialMotion(FFI)V

    .line 982
    iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    #v11=(Integer);
    if-nez v11, :cond_4

    .line 983
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I

    #v11=(Reference);
    aget v4, v11, v7

    .line 984
    .restart local v4       #edgesTouched:I
    #v4=(Integer);
    iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    #v11=(Integer);
    and-int/2addr v11, v4

    if-eqz v11, :cond_2

    .line 985
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v11=(Reference);
    iget v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I

    #v12=(Integer);
    and-int/2addr v12, v4

    invoke-virtual {v11, v12, v7}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeTouched(II)V

    goto :goto_0

    .line 987
    .end local v4           #edgesTouched:I
    :cond_4
    #v4=(Uninit);v11=(Integer);v12=(Uninit);
    iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    const/4 v12, 0x2

    #v12=(PosByte);
    if-ne v11, v12, :cond_2

    .line 989
    float-to-int v11, v9

    float-to-int v12, v10

    #v12=(Integer);
    invoke-virtual {p0, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;

    move-result-object v8

    .line 990
    .restart local v8       #toCapture:Landroid/view/View;
    #v8=(Reference);
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v11=(Reference);
    if-ne v8, v11, :cond_2

    .line 991
    invoke-virtual {p0, v8, v7}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z

    goto :goto_0

    .line 999
    .end local v7           #pointerId:I
    .end local v8           #toCapture:Landroid/view/View;
    .end local v9           #x:F
    .end local v10           #y:F
    :pswitch_3
    #v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Uninit);
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I

    move-result v6

    .line 1000
    .local v6, pointerCount:I
    #v6=(Integer);
    const/4 v5, 0x0

    .local v5, i:I
    :goto_2
    #v2=(Conflicted);v3=(Conflicted);v5=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-ge v5, v6, :cond_5

    .line 1001
    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v7

    .line 1002
    .restart local v7       #pointerId:I
    #v7=(Integer);
    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F

    move-result v9

    .line 1003
    .restart local v9       #x:F
    #v9=(Float);
    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v10

    .line 1004
    .restart local v10       #y:F
    #v10=(Float);
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F

    #v11=(Reference);
    aget v11, v11, v7

    #v11=(Integer);
    sub-float v2, v9, v11

    .line 1005
    .local v2, dx:F
    #v2=(Float);
    iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F

    #v11=(Reference);
    aget v11, v11, v7

    #v11=(Integer);
    sub-float v3, v10, v11

    .line 1007
    .local v3, dy:F
    #v3=(Float);
    invoke-direct {p0, v2, v3, v7}, Landroid/support/v4/widget/ViewDragHelper;->reportNewEdgeDrags(FFI)V

    .line 1008
    iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I

    const/4 v12, 0x1

    #v12=(One);
    if-ne v11, v12, :cond_6

    .line 1019
    .end local v2           #dx:F
    .end local v3           #dy:F
    .end local v7           #pointerId:I
    .end local v9           #x:F
    .end local v10           #y:F
    :cond_5
    #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    invoke-direct {p0, p1}, Landroid/support/v4/widget/ViewDragHelper;->saveLastMotion(Landroid/view/MotionEvent;)V

    goto/16 :goto_0

    .line 1013
    .restart local v2       #dx:F
    .restart local v3       #dy:F
    .restart local v7       #pointerId:I
    .restart local v9       #x:F
    .restart local v10       #y:F
    :cond_6
    #v2=(Float);v3=(Float);v7=(Integer);v9=(Float);v10=(Float);v11=(Integer);v12=(One);
    float-to-int v11, v9

    float-to-int v12, v10

    #v12=(Integer);
    invoke-virtual {p0, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;

    move-result-object v8

    .line 1014
    .restart local v8       #toCapture:Landroid/view/View;
    #v8=(Reference);
    if-eqz v8, :cond_7

    invoke-direct {p0, v8, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(Landroid/view/View;FF)Z

    move-result v11

    #v11=(Boolean);
    if-eqz v11, :cond_7

    invoke-virtual {p0, v8, v7}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z

    move-result v11

    if-nez v11, :cond_5

    .line 1000
    :cond_7
    #v11=(Integer);
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 1024
    .end local v2           #dx:F
    .end local v3           #dy:F
    .end local v5           #i:I
    .end local v6           #pointerCount:I
    .end local v7           #pointerId:I
    .end local v8           #toCapture:Landroid/view/View;
    .end local v9           #x:F
    .end local v10           #y:F
    :pswitch_4
    #v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Reference);v12=(Uninit);
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v7

    .line 1025
    .restart local v7       #pointerId:I
    #v7=(Integer);
    invoke-direct {p0, v7}, Landroid/support/v4/widget/ViewDragHelper;->clearMotionHistory(I)V

    goto/16 :goto_0

    .line 1031
    .end local v7           #pointerId:I
    :pswitch_5
    #v7=(Uninit);
    invoke-virtual {p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    goto/16 :goto_0

    .line 1036
    :cond_8
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Integer);v12=(One);
    const/4 v11, 0x0

    #v11=(Null);
    goto/16 :goto_1

    .line 953
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_3
        :pswitch_5
        :pswitch_0
        :pswitch_2
        :pswitch_4
    .end packed-switch
.end method

.method public smoothSlideViewTo(Landroid/view/View;II)Z
    .locals 2
    .parameter "child"
    .parameter "finalLeft"
    .parameter "finalTop"

    .prologue
    const/4 v1, 0x0

    .line 539
    #v1=(Null);
    iput-object p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    .line 540
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    .line 542
    invoke-direct {p0, p2, p3, v1, v1}, Landroid/support/v4/widget/ViewDragHelper;->forceSettleCapturedViewAt(IIII)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method tryCaptureViewForDrag(Landroid/view/View;I)Z
    .locals 2
    .parameter "toCapture"
    .parameter "pointerId"

    .prologue
    const/4 v0, 0x1

    .line 883
    #v0=(One);
    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;

    #v1=(Reference);
    if-ne p1, v1, :cond_0

    iget v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    #v1=(Integer);
    if-ne v1, p2, :cond_0

    .line 892
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    .line 887
    :cond_0
    #v0=(One);
    if-eqz p1, :cond_1

    iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;

    #v1=(Reference);
    invoke-virtual {v1, p1, p2}, Landroid/support/v4/widget/ViewDragHelper$Callback;->tryCaptureView(Landroid/view/View;I)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 888
    iput p2, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I

    .line 889
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V

    goto :goto_0

    .line 892
    :cond_1
    #v1=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
