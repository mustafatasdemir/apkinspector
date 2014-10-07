package android.support.v4.widget; class AutoScrollHelper {/*

.class public abstract Landroid/support/v4/widget/AutoScrollHelper;
.super Ljava/lang/Object;
.source "AutoScrollHelper.java"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/AutoScrollHelper$1;,
        Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;,
        Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;
    }
.end annotation


# static fields
#the value of this static final field might be set in the static constructor
.field private static final DEFAULT_ACTIVATION_DELAY:I = 0x0

.field private static final DEFAULT_EDGE_TYPE:I = 0x1

.field private static final DEFAULT_MAXIMUM_EDGE:F = 3.4028235E38f

.field private static final DEFAULT_MAXIMUM_VELOCITY_DIPS:I = 0x627

.field private static final DEFAULT_MINIMUM_VELOCITY_DIPS:I = 0x13b

.field private static final DEFAULT_RAMP_DOWN_DURATION:I = 0x1f4

.field private static final DEFAULT_RAMP_UP_DURATION:I = 0x1f4

.field private static final DEFAULT_RELATIVE_EDGE:F = 0.2f

.field private static final DEFAULT_RELATIVE_VELOCITY:F = 1.0f

.field public static final EDGE_TYPE_INSIDE:I = 0x0

.field public static final EDGE_TYPE_INSIDE_EXTEND:I = 0x1

.field public static final EDGE_TYPE_OUTSIDE:I = 0x2

.field private static final HORIZONTAL:I = 0x0

.field public static final NO_MAX:F = 3.4028235E38f

.field public static final NO_MIN:F = 0.0f

.field public static final RELATIVE_UNSPECIFIED:F = 0.0f

.field private static final VERTICAL:I = 0x1


# instance fields
.field private mActivationDelay:I

.field private mAlreadyDelayed:Z

.field private mAnimating:Z

.field private final mEdgeInterpolator:Landroid/view/animation/Interpolator;

.field private mEdgeType:I

.field private mEnabled:Z

.field private mExclusive:Z

.field private mMaximumEdges:[F

.field private mMaximumVelocity:[F

.field private mMinimumVelocity:[F

.field private mNeedsCancel:Z

.field private mNeedsReset:Z

.field private mRelativeEdges:[F

.field private mRelativeVelocity:[F

.field private mRunnable:Ljava/lang/Runnable;

.field private final mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;

.field private final mTarget:Landroid/view/View;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 194
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v0

    #v0=(Integer);
    sput v0, Landroid/support/v4/widget/AutoScrollHelper;->DEFAULT_ACTIVATION_DELAY:I

    return-void
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 9
    .parameter "target"

    .prologue
    const v8, 0x7f7fffff

    #v8=(Integer);
    const/high16 v7, 0x3f80

    #v7=(Integer);
    const/high16 v6, 0x3f00

    #v6=(Integer);
    const v5, 0x3e4ccccd

    #v5=(Integer);
    const/4 v4, 0x2

    .line 209
    #v4=(PosByte);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 137
    #p0=(Reference);
    new-instance v3, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;-><init>()V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;

    .line 140
    new-instance v3, Landroid/view/animation/AccelerateInterpolator;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeInterpolator:Landroid/view/animation/Interpolator;

    .line 149
    new-array v3, v4, [F

    fill-array-data v3, :array_0

    iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F

    .line 152
    new-array v3, v4, [F

    fill-array-data v3, :array_1

    iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F

    .line 161
    new-array v3, v4, [F

    fill-array-data v3, :array_2

    iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F

    .line 164
    new-array v3, v4, [F

    fill-array-data v3, :array_3

    iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F

    .line 167
    new-array v3, v4, [F

    fill-array-data v3, :array_4

    iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F

    .line 210
    iput-object p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;

    .line 212
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 213
    .local v1, metrics:Landroid/util/DisplayMetrics;
    #v1=(Reference);
    const v3, 0x44c4e000

    #v3=(Integer);
    iget v4, v1, Landroid/util/DisplayMetrics;->density:F

    #v4=(Integer);
    mul-float/2addr v3, v4

    #v3=(Float);
    add-float/2addr v3, v6

    float-to-int v0, v3

    .line 214
    .local v0, maxVelocity:I
    #v0=(Integer);
    const v3, 0x439d8000

    #v3=(Integer);
    iget v4, v1, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v3, v4

    #v3=(Float);
    add-float/2addr v3, v6

    float-to-int v2, v3

    .line 215
    .local v2, minVelocity:I
    #v2=(Integer);
    int-to-float v3, v0

    int-to-float v4, v0

    #v4=(Float);
    invoke-virtual {p0, v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->setMaximumVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;

    .line 216
    int-to-float v3, v2

    int-to-float v4, v2

    invoke-virtual {p0, v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->setMinimumVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;

    .line 218
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {p0, v3}, Landroid/support/v4/widget/AutoScrollHelper;->setEdgeType(I)Landroid/support/v4/widget/AutoScrollHelper;

    .line 219
    invoke-virtual {p0, v8, v8}, Landroid/support/v4/widget/AutoScrollHelper;->setMaximumEdges(FF)Landroid/support/v4/widget/AutoScrollHelper;

    .line 220
    invoke-virtual {p0, v5, v5}, Landroid/support/v4/widget/AutoScrollHelper;->setRelativeEdges(FF)Landroid/support/v4/widget/AutoScrollHelper;

    .line 221
    invoke-virtual {p0, v7, v7}, Landroid/support/v4/widget/AutoScrollHelper;->setRelativeVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;

    .line 222
    sget v3, Landroid/support/v4/widget/AutoScrollHelper;->DEFAULT_ACTIVATION_DELAY:I

    #v3=(Integer);
    invoke-virtual {p0, v3}, Landroid/support/v4/widget/AutoScrollHelper;->setActivationDelay(I)Landroid/support/v4/widget/AutoScrollHelper;

    .line 223
    const/16 v3, 0x1f4

    #v3=(PosShort);
    invoke-virtual {p0, v3}, Landroid/support/v4/widget/AutoScrollHelper;->setRampUpDuration(I)Landroid/support/v4/widget/AutoScrollHelper;

    .line 224
    const/16 v3, 0x1f4

    invoke-virtual {p0, v3}, Landroid/support/v4/widget/AutoScrollHelper;->setRampDownDuration(I)Landroid/support/v4/widget/AutoScrollHelper;

    .line 225
    return-void

    .line 149
    :array_0
    .array-data 0x4
        0x0t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x0t 0x0t
    .end array-data

    .line 152
    :array_1
    .array-data 0x4
        0xfft 0xfft 0x7ft 0x7ft
        0xfft 0xfft 0x7ft 0x7ft
    .end array-data

    .line 161
    :array_2
    .array-data 0x4
        0x0t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x0t 0x0t
    .end array-data

    .line 164
    :array_3
    .array-data 0x4
        0x0t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x0t 0x0t
    .end array-data

    .line 167
    :array_4
    .array-data 0x4
        0xfft 0xfft 0x7ft 0x7ft
        0xfft 0xfft 0x7ft 0x7ft
    .end array-data
.end method

.method static synthetic access$100(Landroid/support/v4/widget/AutoScrollHelper;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 84
    iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$102(Landroid/support/v4/widget/AutoScrollHelper;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 84
    iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z

    return p1
.end method

.method static synthetic access$200(Landroid/support/v4/widget/AutoScrollHelper;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 84
    iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$202(Landroid/support/v4/widget/AutoScrollHelper;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 84
    iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z

    return p1
.end method

.method static synthetic access$300(Landroid/support/v4/widget/AutoScrollHelper;)Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
    .locals 1
    .parameter "x0"

    .prologue
    .line 84
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400(Landroid/support/v4/widget/AutoScrollHelper;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 84
    invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->shouldAnimate()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$500(Landroid/support/v4/widget/AutoScrollHelper;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 84
    iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsCancel:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$502(Landroid/support/v4/widget/AutoScrollHelper;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 84
    iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsCancel:Z

    return p1
.end method

.method static synthetic access$600(Landroid/support/v4/widget/AutoScrollHelper;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 84
    invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->cancelTargetTouch()V

    return-void
.end method

.method static synthetic access$700(Landroid/support/v4/widget/AutoScrollHelper;)Landroid/view/View;
    .locals 1
    .parameter "x0"

    .prologue
    .line 84
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$800(III)I
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"

    .prologue
    .line 84
    invoke-static {p0, p1, p2}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(III)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$900(FFF)F
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"

    .prologue
    .line 84
    invoke-static {p0, p1, p2}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F

    move-result v0

    #v0=(Float);
    return v0
.end method

.method private cancelTargetTouch()V
    .locals 9

    .prologue
    const/4 v5, 0x0

    .line 677
    #v5=(Null);
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 678
    .local v0, eventTime:J
    #v0=(LongLo);v1=(LongHi);
    const/4 v4, 0x3

    #v4=(PosByte);
    const/4 v7, 0x0

    #v7=(Null);
    move-wide v2, v0

    #v2=(LongLo);v3=(LongHi);
    move v6, v5

    #v6=(Null);
    invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    move-result-object v8

    .line 680
    .local v8, cancel:Landroid/view/MotionEvent;
    #v8=(Reference);
    iget-object v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;

    #v2=(Reference);
    invoke-virtual {v2, v8}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 681
    invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V

    .line 682
    return-void
.end method

.method private computeTargetVelocity(IFFF)F
    .locals 9
    .parameter "direction"
    .parameter "coordinate"
    .parameter "srcSize"
    .parameter "dstSize"

    .prologue
    const/4 v7, 0x0

    .line 539
    #v7=(Null);
    iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F

    #v8=(Reference);
    aget v3, v8, p1

    .line 540
    .local v3, relativeEdge:F
    #v3=(Integer);
    iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F

    aget v0, v8, p1

    .line 541
    .local v0, maximumEdge:F
    #v0=(Integer);
    invoke-direct {p0, v3, p3, v0, p2}, Landroid/support/v4/widget/AutoScrollHelper;->getEdgeValue(FFFF)F

    move-result v6

    .line 542
    .local v6, value:F
    #v6=(Float);
    cmpl-float v8, v6, v7

    #v8=(Byte);
    if-nez v8, :cond_0

    .line 558
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Float);v8=(Conflicted);
    return v7

    .line 547
    :cond_0
    #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Null);v8=(Byte);
    iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F

    #v8=(Reference);
    aget v4, v8, p1

    .line 548
    .local v4, relativeVelocity:F
    #v4=(Integer);
    iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F

    aget v2, v8, p1

    .line 549
    .local v2, minimumVelocity:F
    #v2=(Integer);
    iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F

    aget v1, v8, p1

    .line 550
    .local v1, maximumVelocity:F
    #v1=(Integer);
    mul-float v5, v4, p4

    .line 555
    .local v5, targetVelocity:F
    #v5=(Float);
    cmpl-float v7, v6, v7

    #v7=(Byte);
    if-lez v7, :cond_1

    .line 556
    mul-float v7, v6, v5

    #v7=(Float);
    invoke-static {v7, v2, v1}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F

    move-result v7

    goto :goto_0

    .line 558
    :cond_1
    #v7=(Byte);
    neg-float v7, v6

    #v7=(Float);
    mul-float/2addr v7, v5

    invoke-static {v7, v2, v1}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F

    move-result v7

    neg-float v7, v7

    goto :goto_0
.end method

.method private static constrain(FFF)F
    .locals 1
    .parameter "value"
    .parameter "min"
    .parameter "max"

    .prologue
    .line 663
    cmpl-float v0, p0, p2

    #v0=(Byte);
    if-lez v0, :cond_0

    .line 668
    .end local p2
    :goto_0
    return p2

    .line 665
    .restart local p2
    :cond_0
    cmpg-float v0, p0, p1

    if-gez v0, :cond_1

    move p2, p1

    .line 666
    goto :goto_0

    :cond_1
    move p2, p0

    .line 668
    goto :goto_0
.end method

.method private static constrain(III)I
    .locals 0
    .parameter "value"
    .parameter "min"
    .parameter "max"

    .prologue
    .line 653
    if-le p0, p2, :cond_0

    .line 658
    .end local p2
    :goto_0
    return p2

    .line 655
    .restart local p2
    :cond_0
    if-ge p0, p1, :cond_1

    move p2, p1

    .line 656
    goto :goto_0

    :cond_1
    move p2, p0

    .line 658
    goto :goto_0
.end method

.method private constrainEdgeValue(FF)F
    .locals 4
    .parameter "current"
    .parameter "leading"

    .prologue
    const/high16 v1, 0x3f80

    #v1=(Integer);
    const/4 v0, 0x0

    .line 624
    #v0=(Null);
    cmpl-float v2, p2, v0

    #v2=(Byte);
    if-nez v2, :cond_1

    .line 649
    :cond_0
    :goto_0
    #v0=(Integer);v2=(Integer);v3=(Conflicted);
    return v0

    .line 628
    :cond_1
    #v0=(Null);v2=(Byte);v3=(Uninit);
    iget v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeType:I

    #v2=(Integer);
    packed-switch v2, :pswitch_data_0

    goto :goto_0

    .line 631
    :pswitch_0
    cmpg-float v2, p1, p2

    #v2=(Byte);
    if-gez v2, :cond_0

    .line 632
    cmpl-float v2, p1, v0

    if-ltz v2, :cond_2

    .line 634
    div-float v0, p1, p2

    #v0=(Float);
    sub-float v0, v1, v0

    goto :goto_0

    .line 635
    :cond_2
    #v0=(Null);
    iget-boolean v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    iget v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeType:I

    #v2=(Integer);
    const/4 v3, 0x1

    #v3=(One);
    if-ne v2, v3, :cond_0

    move v0, v1

    .line 637
    #v0=(Integer);
    goto :goto_0

    .line 642
    :pswitch_1
    #v0=(Null);v3=(Uninit);
    cmpg-float v1, p1, v0

    #v1=(Byte);
    if-gez v1, :cond_0

    .line 644
    neg-float v0, p2

    #v0=(Float);
    div-float v0, p1, v0

    goto :goto_0

    .line 628
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private getEdgeValue(FFFF)F
    .locals 7
    .parameter "relativeValue"
    .parameter "size"
    .parameter "maxValue"
    .parameter "current"

    .prologue
    const/4 v5, 0x0

    .line 607
    #v5=(Null);
    mul-float v6, p1, p2

    #v6=(Float);
    invoke-static {v6, v5, p3}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F

    move-result v0

    .line 608
    .local v0, edgeSize:F
    #v0=(Float);
    invoke-direct {p0, p4, v0}, Landroid/support/v4/widget/AutoScrollHelper;->constrainEdgeValue(FF)F

    move-result v3

    .line 609
    .local v3, valueLeading:F
    #v3=(Float);
    sub-float v6, p2, p4

    invoke-direct {p0, v6, v0}, Landroid/support/v4/widget/AutoScrollHelper;->constrainEdgeValue(FF)F

    move-result v4

    .line 610
    .local v4, valueTrailing:F
    #v4=(Float);
    sub-float v2, v4, v3

    .line 612
    .local v2, value:F
    #v2=(Float);
    cmpg-float v6, v2, v5

    #v6=(Byte);
    if-gez v6, :cond_1

    .line 613
    iget-object v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeInterpolator:Landroid/view/animation/Interpolator;

    #v5=(Reference);
    neg-float v6, v2

    #v6=(Float);
    invoke-interface {v5, v6}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v5

    #v5=(Float);
    neg-float v1, v5

    .line 620
    .local v1, interpolated:F
    :goto_0
    #v1=(Float);v5=(Conflicted);
    const/high16 v5, -0x4080

    #v5=(Integer);
    const/high16 v6, 0x3f80

    #v6=(Integer);
    invoke-static {v1, v5, v6}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F

    move-result v5

    .end local v1           #interpolated:F
    :cond_0
    #v1=(Conflicted);v5=(Float);
    return v5

    .line 614
    :cond_1
    #v1=(Uninit);v5=(Null);v6=(Byte);
    cmpl-float v6, v2, v5

    if-lez v6, :cond_0

    .line 615
    iget-object v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeInterpolator:Landroid/view/animation/Interpolator;

    #v5=(Reference);
    invoke-interface {v5, v2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F

    move-result v1

    .restart local v1       #interpolated:F
    #v1=(Float);
    goto :goto_0
.end method

.method private requestStop()V
    .locals 1

    .prologue
    .line 528
    iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 531
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z

    .line 535
    :goto_0
    #v0=(Reference);
    return-void

    .line 533
    :cond_0
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->requestStop()V

    goto :goto_0
.end method

.method private shouldAnimate()Z
    .locals 4

    .prologue
    .line 492
    iget-object v1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;

    .line 493
    .local v1, scroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getVerticalDirection()I

    move-result v2

    .line 494
    .local v2, verticalDirection:I
    #v2=(Integer);
    invoke-virtual {v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getHorizontalDirection()I

    move-result v0

    .line 496
    .local v0, horizontalDirection:I
    #v0=(Integer);
    if-eqz v2, :cond_0

    invoke-virtual {p0, v2}, Landroid/support/v4/widget/AutoScrollHelper;->canTargetScrollVertically(I)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_1

    :cond_0
    #v3=(Conflicted);
    if-eqz v0, :cond_2

    invoke-virtual {p0, v0}, Landroid/support/v4/widget/AutoScrollHelper;->canTargetScrollHorizontally(I)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    :cond_1
    const/4 v3, 0x1

    :goto_0
    return v3

    :cond_2
    #v3=(Conflicted);
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_0
.end method

.method private startAnimating()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    .line 504
    #v4=(One);
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 505
    new-instance v0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;-><init>(Landroid/support/v4/widget/AutoScrollHelper;Landroid/support/v4/widget/AutoScrollHelper$1;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;

    .line 508
    :cond_0
    #v1=(Conflicted);
    iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z

    .line 509
    iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z

    .line 511
    iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAlreadyDelayed:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mActivationDelay:I

    #v0=(Integer);
    if-lez v0, :cond_1

    .line 512
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mActivationDelay:I

    #v2=(Integer);
    int-to-long v2, v2

    #v2=(LongLo);v3=(LongHi);
    invoke-static {v0, v1, v2, v3}, Landroid/support/v4/view/ViewCompat;->postOnAnimationDelayed(Landroid/view/View;Ljava/lang/Runnable;J)V

    .line 519
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAlreadyDelayed:Z

    .line 520
    return-void

    .line 514
    :cond_1
    #v0=(Integer);v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    goto :goto_0
.end method


# virtual methods
.method public abstract canTargetScrollHorizontally(I)Z
.end method

.method public abstract canTargetScrollVertically(I)Z
.end method

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 247
    iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z

    #v0=(Boolean);
    return v0
.end method

.method public isExclusive()Z
    .locals 1

    .prologue
    .line 276
    iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mExclusive:Z

    #v0=(Boolean);
    return v0
.end method

.method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 8
    .parameter "v"
    .parameter "event"

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/4 v4, 0x0

    .line 456
    #v4=(Null);
    iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z

    #v5=(Boolean);
    if-nez v5, :cond_0

    .line 485
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);
    return v4

    .line 460
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(One);v4=(Null);v6=(Uninit);v7=(Uninit);
    invoke-static {p2}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    .line 461
    .local v0, action:I
    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    .line 485
    :cond_1
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mExclusive:Z

    if-eqz v5, :cond_2

    iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z

    if-eqz v5, :cond_2

    :goto_2
    #v3=(Boolean);
    move v4, v3

    #v4=(Boolean);
    goto :goto_0

    .line 463
    :pswitch_0
    #v1=(Uninit);v2=(Uninit);v3=(One);v4=(Null);v6=(Uninit);v7=(Uninit);
    iput-boolean v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsCancel:Z

    .line 464
    iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAlreadyDelayed:Z

    .line 467
    :pswitch_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    #v5=(Float);
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v6

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    iget-object v7, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v7

    #v7=(Integer);
    int-to-float v7, v7

    #v7=(Float);
    invoke-direct {p0, v4, v5, v6, v7}, Landroid/support/v4/widget/AutoScrollHelper;->computeTargetVelocity(IFFF)F

    move-result v1

    .line 469
    .local v1, xTargetVelocity:F
    #v1=(Float);
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v6

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    iget-object v7, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/view/View;->getHeight()I

    move-result v7

    #v7=(Integer);
    int-to-float v7, v7

    #v7=(Float);
    invoke-direct {p0, v3, v5, v6, v7}, Landroid/support/v4/widget/AutoScrollHelper;->computeTargetVelocity(IFFF)F

    move-result v2

    .line 471
    .local v2, yTargetVelocity:F
    #v2=(Float);
    iget-object v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;

    #v5=(Reference);
    invoke-virtual {v5, v1, v2}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->setTargetVelocity(FF)V

    .line 475
    iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z

    #v5=(Boolean);
    if-nez v5, :cond_1

    invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->shouldAnimate()Z

    move-result v5

    if-eqz v5, :cond_1

    .line 476
    invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->startAnimating()V

    goto :goto_1

    .line 481
    .end local v1           #xTargetVelocity:F
    .end local v2           #yTargetVelocity:F
    :pswitch_2
    #v1=(Uninit);v2=(Uninit);v6=(Uninit);v7=(Uninit);
    invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->requestStop()V

    goto :goto_1

    :cond_2
    #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move v3, v4

    .line 485
    #v3=(Null);
    goto :goto_2

    .line 461
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public abstract scrollTargetBy(II)V
.end method

.method public setActivationDelay(I)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 0
    .parameter "delayMillis"

    .prologue
    .line 412
    iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mActivationDelay:I

    .line 413
    return-object p0
.end method

.method public setEdgeType(I)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 0
    .parameter "type"

    .prologue
    .line 354
    iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeType:I

    .line 355
    return-object p0
.end method

.method public setEnabled(Z)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 1
    .parameter "enabled"

    .prologue
    .line 235
    iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 236
    invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->requestStop()V

    .line 239
    :cond_0
    iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z

    .line 240
    return-object p0
.end method

.method public setExclusive(Z)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 0
    .parameter "exclusive"

    .prologue
    .line 263
    iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mExclusive:Z

    .line 264
    return-object p0
.end method

.method public setMaximumEdges(FF)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 2
    .parameter "horizontalMax"
    .parameter "verticalMax"

    .prologue
    .line 395
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    aput p1, v0, v1

    .line 396
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F

    const/4 v1, 0x1

    #v1=(One);
    aput p2, v0, v1

    .line 397
    return-object p0
.end method

.method public setMaximumVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 4
    .parameter "horizontalMax"
    .parameter "verticalMax"

    .prologue
    const/high16 v3, 0x447a

    .line 294
    #v3=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    div-float v2, p1, v3

    #v2=(Float);
    aput v2, v0, v1

    .line 295
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F

    const/4 v1, 0x1

    #v1=(One);
    div-float v2, p2, v3

    aput v2, v0, v1

    .line 296
    return-object p0
.end method

.method public setMinimumVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 4
    .parameter "horizontalMin"
    .parameter "verticalMin"

    .prologue
    const/high16 v3, 0x447a

    .line 312
    #v3=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    div-float v2, p1, v3

    #v2=(Float);
    aput v2, v0, v1

    .line 313
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F

    const/4 v1, 0x1

    #v1=(One);
    div-float v2, p2, v3

    aput v2, v0, v1

    .line 314
    return-object p0
.end method

.method public setRampDownDuration(I)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 1
    .parameter "durationMillis"

    .prologue
    .line 442
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->setRampDownDuration(I)V

    .line 443
    return-object p0
.end method

.method public setRampUpDuration(I)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 1
    .parameter "durationMillis"

    .prologue
    .line 427
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->setRampUpDuration(I)V

    .line 428
    return-object p0
.end method

.method public setRelativeEdges(FF)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 2
    .parameter "horizontal"
    .parameter "vertical"

    .prologue
    .line 373
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    aput p1, v0, v1

    .line 374
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F

    const/4 v1, 0x1

    #v1=(One);
    aput p2, v0, v1

    .line 375
    return-object p0
.end method

.method public setRelativeVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;
    .locals 4
    .parameter "horizontal"
    .parameter "vertical"

    .prologue
    const/high16 v3, 0x447a

    .line 333
    #v3=(Integer);
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    div-float v2, p1, v3

    #v2=(Float);
    aput v2, v0, v1

    .line 334
    iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F

    const/4 v1, 0x1

    #v1=(One);
    div-float v2, p2, v3

    aput v2, v0, v1

    .line 335
    return-object p0
.end method

*/}
