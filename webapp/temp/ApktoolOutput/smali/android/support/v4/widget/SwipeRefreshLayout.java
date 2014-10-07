package android.support.v4.widget; class SwipeRefreshLayout {/*

.class public Landroid/support/v4/widget/SwipeRefreshLayout;
.super Landroid/view/ViewGroup;
.source "SwipeRefreshLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/SwipeRefreshLayout$BaseAnimationListener;,
        Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
    }
.end annotation


# static fields
.field private static final ACCELERATE_INTERPOLATION_FACTOR:F = 1.5f

.field private static final DECELERATE_INTERPOLATION_FACTOR:F = 2.0f

.field private static final INVALID_POINTER:I = -0x1

.field private static final LAYOUT_ATTRS:[I = null

.field private static final LOG_TAG:Ljava/lang/String; = null

.field private static final MAX_SWIPE_DISTANCE_FACTOR:F = 0.6f

.field private static final PROGRESS_BAR_HEIGHT:F = 4.0f

.field private static final REFRESH_TRIGGER_DISTANCE:I = 0x78

.field private static final RETURN_TO_ORIGINAL_POSITION_TIMEOUT:J = 0x12cL


# instance fields
.field private final mAccelerateInterpolator:Landroid/view/animation/AccelerateInterpolator;

.field private mActivePointerId:I

.field private final mAnimateToStartPosition:Landroid/view/animation/Animation;

.field private final mCancel:Ljava/lang/Runnable;

.field private mCurrPercentage:F

.field private mCurrentTargetOffsetTop:I

.field private final mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

.field private mDistanceToTriggerSync:F

.field private mFrom:I

.field private mFromPercentage:F

.field private mInitialMotionY:F

.field private mIsBeingDragged:Z

.field private mLastMotionY:F

.field private mListener:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;

.field private mMediumAnimationDuration:I

.field private mOriginalOffsetTop:I

.field private mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;

.field private mProgressBarHeight:I

.field private mRefreshing:Z

.field private final mReturnToStartPosition:Ljava/lang/Runnable;

.field private final mReturnToStartPositionListener:Landroid/view/animation/Animation$AnimationListener;

.field private mReturningToStart:Z

.field private final mShrinkAnimationListener:Landroid/view/animation/Animation$AnimationListener;

.field private mShrinkTrigger:Landroid/view/animation/Animation;

.field private mTarget:Landroid/view/View;

.field private mTouchSlop:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 61
    const-class v0, Landroid/support/v4/widget/SwipeRefreshLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;

    .line 95
    const/4 v0, 0x1

    #v0=(One);
    new-array v0, v0, [I

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const v2, 0x101000e

    #v2=(Integer);
    aput v2, v0, v1

    sput-object v0, Landroid/support/v4/widget/SwipeRefreshLayout;->LAYOUT_ATTRS:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 177
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 178
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 5
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v4, 0x0

    .line 186
    #v4=(Null);
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 76
    #p0=(Reference);
    iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z

    .line 78
    const/high16 v2, -0x4080

    #v2=(Integer);
    iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F

    .line 80
    iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFromPercentage:F

    .line 81
    iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    .line 88
    const/4 v2, -0x1

    #v2=(Byte);
    iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    .line 99
    new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$1;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$1;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    .line 115
    new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$2;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$2;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mShrinkTrigger:Landroid/view/animation/Animation;

    .line 123
    new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$3;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$3;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPositionListener:Landroid/view/animation/Animation$AnimationListener;

    .line 132
    new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$4;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$4;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mShrinkAnimationListener:Landroid/view/animation/Animation$AnimationListener;

    .line 139
    new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$5;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$5;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPosition:Ljava/lang/Runnable;

    .line 151
    new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$6;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$6;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;

    .line 188
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTouchSlop:I

    .line 190
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    #v2=(Reference);
    const v3, 0x10e0001

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mMediumAnimationDuration:I

    .line 193
    invoke-virtual {p0, v4}, Landroid/support/v4/widget/SwipeRefreshLayout;->setWillNotDraw(Z)V

    .line 194
    new-instance v2, Landroid/support/v4/widget/SwipeProgressBar;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeProgressBar;-><init>(Landroid/view/View;)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;

    .line 195
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    .line 196
    .local v1, metrics:Landroid/util/DisplayMetrics;
    #v1=(Reference);
    iget v2, v1, Landroid/util/DisplayMetrics;->density:F

    #v2=(Integer);
    const/high16 v3, 0x4080

    mul-float/2addr v2, v3

    #v2=(Float);
    float-to-int v2, v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBarHeight:I

    .line 197
    new-instance v2, Landroid/view/animation/DecelerateInterpolator;

    #v2=(UninitRef);
    const/high16 v3, 0x4000

    invoke-direct {v2, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    .line 198
    new-instance v2, Landroid/view/animation/AccelerateInterpolator;

    #v2=(UninitRef);
    const/high16 v3, 0x3fc0

    invoke-direct {v2, v3}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAccelerateInterpolator:Landroid/view/animation/AccelerateInterpolator;

    .line 200
    sget-object v2, Landroid/support/v4/widget/SwipeRefreshLayout;->LAYOUT_ATTRS:[I

    invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 201
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v0, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    #v2=(Boolean);
    invoke-virtual {p0, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 202
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 203
    return-void
.end method

.method static synthetic access$000(Landroid/support/v4/widget/SwipeRefreshLayout;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFrom:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$100(Landroid/support/v4/widget/SwipeRefreshLayout;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$1000(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation$AnimationListener;
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPositionListener:Landroid/view/animation/Animation$AnimationListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1100(Landroid/support/v4/widget/SwipeRefreshLayout;ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"

    .prologue
    .line 60
    invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;->animateOffsetToStartPosition(ILandroid/view/animation/Animation$AnimationListener;)V

    return-void
.end method

.method static synthetic access$1200(Landroid/support/v4/widget/SwipeRefreshLayout;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mMediumAnimationDuration:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$1300(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation;
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mShrinkTrigger:Landroid/view/animation/Animation;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1400(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation$AnimationListener;
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mShrinkAnimationListener:Landroid/view/animation/Animation$AnimationListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1500(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/DecelerateInterpolator;
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/View;
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Landroid/support/v4/widget/SwipeRefreshLayout;I)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 60
    invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    return-void
.end method

.method static synthetic access$400(Landroid/support/v4/widget/SwipeRefreshLayout;)F
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFromPercentage:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$402(Landroid/support/v4/widget/SwipeRefreshLayout;F)F
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 60
    iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFromPercentage:F

    return p1
.end method

.method static synthetic access$500(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/support/v4/widget/SwipeProgressBar;
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$700(Landroid/support/v4/widget/SwipeRefreshLayout;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$702(Landroid/support/v4/widget/SwipeRefreshLayout;I)I
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 60
    iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I

    return p1
.end method

.method static synthetic access$800(Landroid/support/v4/widget/SwipeRefreshLayout;)F
    .locals 1
    .parameter "x0"

    .prologue
    .line 60
    iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$802(Landroid/support/v4/widget/SwipeRefreshLayout;F)F
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 60
    iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    return p1
.end method

.method static synthetic access$902(Landroid/support/v4/widget/SwipeRefreshLayout;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 60
    iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z

    return p1
.end method

.method private animateOffsetToStartPosition(ILandroid/view/animation/Animation$AnimationListener;)V
    .locals 3
    .parameter "from"
    .parameter "listener"

    .prologue
    .line 220
    iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFrom:I

    .line 221
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V

    .line 222
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mMediumAnimationDuration:I

    #v1=(Integer);
    int-to-long v1, v1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V

    .line 223
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    invoke-virtual {v0, p2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V

    .line 224
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 225
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;

    invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V

    .line 226
    return-void
.end method

.method private ensureTarget()V
    .locals 4

    .prologue
    .line 306
    iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    #v1=(Reference);
    if-nez v1, :cond_1

    .line 307
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I

    move-result v1

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    if-le v1, v2, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isInEditMode()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 308
    new-instance v1, Ljava/lang/IllegalStateException;

    #v1=(UninitRef);
    const-string v2, "SwipeRefreshLayout can host only one direct child"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 311
    :cond_0
    #v1=(Integer);v2=(One);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    .line 312
    iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I

    move-result v2

    #v2=(Integer);
    add-int/2addr v1, v2

    iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I

    .line 314
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);
    iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F

    #v1=(Integer);
    const/high16 v2, -0x4080

    #v2=(Integer);
    cmpl-float v1, v1, v2

    #v1=(Byte);
    if-nez v1, :cond_2

    .line 315
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    #v1=(Reference);
    if-eqz v1, :cond_2

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    #v1=(Integer);
    if-lez v1, :cond_2

    .line 316
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    .line 317
    .local v0, metrics:Landroid/util/DisplayMetrics;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    #v1=(Integer);
    int-to-float v1, v1

    #v1=(Float);
    const v2, 0x3f19999a

    mul-float/2addr v1, v2

    const/high16 v2, 0x42f0

    iget v3, v0, Landroid/util/DisplayMetrics;->density:F

    #v3=(Integer);
    mul-float/2addr v2, v3

    #v2=(Float);
    invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F

    move-result v1

    float-to-int v1, v1

    #v1=(Integer);
    int-to-float v1, v1

    #v1=(Float);
    iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F

    .line 322
    .end local v0           #metrics:Landroid/util/DisplayMetrics;
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
    return-void
.end method

.method private onSecondaryPointerUp(Landroid/view/MotionEvent;)V
    .locals 4
    .parameter "ev"

    .prologue
    .line 554
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v2

    .line 555
    .local v2, pointerIndex:I
    #v2=(Integer);
    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v1

    .line 556
    .local v1, pointerId:I
    #v1=(Integer);
    iget v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    #v3=(Integer);
    if-ne v1, v3, :cond_0

    .line 559
    if-nez v2, :cond_1

    const/4 v0, 0x1

    .line 560
    .local v0, newPointerIndex:I
    :goto_0
    #v0=(Boolean);
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v3

    #v3=(Float);
    iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F

    .line 561
    invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v3

    #v3=(Integer);
    iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    .line 563
    .end local v0           #newPointerIndex:I
    :cond_0
    #v0=(Conflicted);
    return-void

    .line 559
    :cond_1
    #v0=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private setTargetOffsetTopAndBottom(I)V
    .locals 1
    .parameter "offset"

    .prologue
    .line 544
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V

    .line 545
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I

    .line 546
    return-void
.end method

.method private setTriggerPercentage(F)V
    .locals 2
    .parameter "percent"

    .prologue
    const/4 v1, 0x0

    .line 237
    #v1=(Null);
    cmpl-float v0, p1, v1

    #v0=(Byte);
    if-nez v0, :cond_0

    .line 240
    iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    .line 245
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 243
    :cond_0
    #v0=(Byte);
    iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    .line 244
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v4/widget/SwipeProgressBar;->setTriggerPercentage(F)V

    goto :goto_0
.end method

.method private startRefresh()V
    .locals 1

    .prologue
    .line 527
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 528
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPosition:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    .line 529
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 530
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mListener:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;

    #v0=(Reference);
    invoke-interface {v0}, Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;->onRefresh()V

    .line 531
    return-void
.end method

.method private updateContentOffsetTop(I)V
    .locals 3
    .parameter "targetTop"

    .prologue
    .line 534
    iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v0

    .line 535
    .local v0, currentTop:I
    #v0=(Integer);
    int-to-float v1, p1

    #v1=(Float);
    iget v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F

    #v2=(Integer);
    cmpl-float v1, v1, v2

    #v1=(Byte);
    if-lez v1, :cond_1

    .line 536
    iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F

    #v1=(Integer);
    float-to-int p1, v1

    .line 540
    :cond_0
    :goto_0
    sub-int v1, p1, v0

    invoke-direct {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V

    .line 541
    return-void

    .line 537
    :cond_1
    #v1=(Byte);
    if-gez p1, :cond_0

    .line 538
    const/4 p1, 0x0

    #p1=(Null);
    goto :goto_0
.end method

.method private updatePositionTimeout()V
    .locals 3

    .prologue
    .line 549
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 550
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;

    const-wide/16 v1, 0x12c

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 551
    return-void
.end method


# virtual methods
.method public canChildScrollUp()Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 368
    #v2=(Null);
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    #v3=(Integer);
    const/16 v4, 0xe

    #v4=(PosByte);
    if-ge v3, v4, :cond_3

    .line 369
    iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    #v3=(Reference);
    instance-of v3, v3, Landroid/widget/AbsListView;

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 370
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    #v0=(Reference);
    check-cast v0, Landroid/widget/AbsListView;

    .line 371
    .local v0, absListView:Landroid/widget/AbsListView;
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getChildCount()I

    move-result v3

    #v3=(Integer);
    if-lez v3, :cond_1

    invoke-virtual {v0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I

    move-result v3

    if-gtz v3, :cond_0

    invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0}, Landroid/widget/AbsListView;->getPaddingTop()I

    move-result v4

    #v4=(Integer);
    if-ge v3, v4, :cond_1

    .line 378
    .end local v0           #absListView:Landroid/widget/AbsListView;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Byte);
    return v1

    .restart local v0       #absListView:Landroid/widget/AbsListView;
    :cond_1
    #v0=(Reference);v1=(One);v2=(Null);
    move v1, v2

    .line 371
    #v1=(Null);
    goto :goto_0

    .line 375
    .end local v0           #absListView:Landroid/widget/AbsListView;
    :cond_2
    #v0=(Uninit);v1=(One);v3=(Boolean);v4=(PosByte);
    iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/view/View;->getScrollY()I

    move-result v3

    #v3=(Integer);
    if-gtz v3, :cond_0

    move v1, v2

    #v1=(Null);
    goto :goto_0

    .line 378
    :cond_3
    #v1=(One);
    iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    #v1=(Reference);
    const/4 v2, -0x1

    #v2=(Byte);
    invoke-static {v1, v2}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z

    move-result v1

    #v1=(Boolean);
    goto :goto_0
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1
    .parameter "canvas"

    .prologue
    .line 326
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 327
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v4/widget/SwipeProgressBar;->draw(Landroid/graphics/Canvas;)V

    .line 328
    return-void
.end method

.method public isRefreshing()Z
    .locals 1

    .prologue
    .line 301
    iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z

    #v0=(Boolean);
    return v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .prologue
    .line 207
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 208
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 209
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPosition:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 210
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 214
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 215
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPosition:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 216
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 217
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8
    .parameter "ev"

    .prologue
    const/4 v7, -0x1

    #v7=(Byte);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v4, 0x0

    .line 384
    #v4=(Null);
    invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V

    .line 386
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    .line 388
    .local v0, action:I
    #v0=(Integer);
    iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z

    #v5=(Boolean);
    if-eqz v5, :cond_0

    if-nez v0, :cond_0

    .line 389
    iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z

    .line 392
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z

    move-result v5

    if-eqz v5, :cond_1

    iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z

    if-nez v5, :cond_1

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->canChildScrollUp()Z

    move-result v5

    if-eqz v5, :cond_2

    .line 437
    :cond_1
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v6=(Reference);
    return v4

    .line 397
    :cond_2
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Boolean);v6=(Null);
    packed-switch v0, :pswitch_data_0

    .line 437
    :cond_3
    :goto_1
    :pswitch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Byte);v5=(Integer);
    iget-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z

    #v4=(Boolean);
    goto :goto_0

    .line 399
    :pswitch_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Boolean);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    #v5=(Float);
    iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F

    iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F

    .line 400
    invoke-static {p1, v4}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v5

    #v5=(Integer);
    iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    .line 401
    iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z

    .line 402
    iput v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    goto :goto_1

    .line 406
    :pswitch_2
    #v5=(Boolean);
    iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    #v5=(Integer);
    if-ne v5, v7, :cond_4

    .line 407
    sget-object v5, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;

    #v5=(Reference);
    const-string v6, "Got ACTION_MOVE event but don\'t have an active pointer id."

    #v6=(Reference);
    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 411
    :cond_4
    #v5=(Integer);v6=(Null);
    iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v1

    .line 412
    .local v1, pointerIndex:I
    #v1=(Integer);
    if-gez v1, :cond_5

    .line 413
    sget-object v5, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;

    #v5=(Reference);
    const-string v6, "Got ACTION_MOVE event but have an invalid active pointer id."

    #v6=(Reference);
    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 417
    :cond_5
    #v5=(Integer);v6=(Null);
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v2

    .line 418
    .local v2, y:F
    #v2=(Float);
    iget v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F

    #v4=(Integer);
    sub-float v3, v2, v4

    .line 419
    .local v3, yDiff:F
    #v3=(Float);
    iget v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTouchSlop:I

    int-to-float v4, v4

    #v4=(Float);
    cmpl-float v4, v3, v4

    #v4=(Byte);
    if-lez v4, :cond_3

    .line 420
    iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F

    .line 421
    const/4 v4, 0x1

    #v4=(One);
    iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z

    goto :goto_1

    .line 426
    .end local v1           #pointerIndex:I
    .end local v2           #y:F
    .end local v3           #yDiff:F
    :pswitch_3
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Boolean);
    invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V

    goto :goto_1

    .line 431
    :pswitch_4
    iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z

    .line 432
    iput v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    .line 433
    iput v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    goto :goto_1

    .line 397
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_4
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 10
    .parameter "changed"
    .parameter "left"
    .parameter "top"
    .parameter "right"
    .parameter "bottom"

    .prologue
    const/4 v9, 0x0

    .line 332
    #v9=(Null);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredWidth()I

    move-result v6

    .line 333
    .local v6, width:I
    #v6=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredHeight()I

    move-result v5

    .line 334
    .local v5, height:I
    #v5=(Integer);
    iget-object v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;

    #v7=(Reference);
    iget v8, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBarHeight:I

    #v8=(Integer);
    invoke-virtual {v7, v9, v9, v6, v8}, Landroid/support/v4/widget/SwipeProgressBar;->setBounds(IIII)V

    .line 335
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I

    move-result v7

    #v7=(Integer);
    if-nez v7, :cond_0

    .line 344
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 338
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    invoke-virtual {p0, v9}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 339
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I

    move-result v2

    .line 340
    .local v2, childLeft:I
    #v2=(Integer);
    iget v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I

    move-result v8

    add-int v3, v7, v8

    .line 341
    .local v3, childTop:I
    #v3=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I

    move-result v7

    sub-int v7, v6, v7

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingRight()I

    move-result v8

    sub-int v4, v7, v8

    .line 342
    .local v4, childWidth:I
    #v4=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I

    move-result v7

    sub-int v7, v5, v7

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingBottom()I

    move-result v8

    sub-int v1, v7, v8

    .line 343
    .local v1, childHeight:I
    #v1=(Integer);
    add-int v7, v2, v4

    add-int v8, v3, v1

    invoke-virtual {v0, v2, v3, v7, v8}, Landroid/view/View;->layout(IIII)V

    goto :goto_0
.end method

.method public onMeasure(II)V
    .locals 5
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    const/high16 v4, 0x4000

    .line 348
    #v4=(Integer);
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V

    .line 349
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I

    move-result v0

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    if-le v0, v1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isInEditMode()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 350
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "SwipeRefreshLayout can host only one direct child"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 352
    :cond_0
    #v0=(Integer);v1=(One);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I

    move-result v0

    if-lez v0, :cond_1

    .line 353
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredWidth()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I

    move-result v2

    #v2=(Integer);
    sub-int/2addr v1, v2

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingRight()I

    move-result v2

    sub-int/2addr v1, v2

    invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredHeight()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I

    move-result v3

    #v3=(Integer);
    sub-int/2addr v2, v3

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V

    .line 361
    :cond_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 9
    .parameter "ev"

    .prologue
    const/4 v6, 0x1

    #v6=(One);
    const/4 v8, 0x0

    #v8=(Null);
    const/4 v5, 0x0

    .line 447
    #v5=(Null);
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    .line 449
    .local v0, action:I
    #v0=(Integer);
    iget-boolean v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z

    #v7=(Boolean);
    if-eqz v7, :cond_0

    if-nez v0, :cond_0

    .line 450
    iput-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z

    .line 453
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z

    move-result v7

    if-eqz v7, :cond_1

    iget-boolean v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z

    if-nez v7, :cond_1

    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->canChildScrollUp()Z

    move-result v7

    if-eqz v7, :cond_2

    .line 523
    :cond_1
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);
    return v5

    .line 458
    :cond_2
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(One);v7=(Boolean);
    packed-switch v0, :pswitch_data_0

    :cond_3
    :goto_1
    :pswitch_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Integer);
    move v5, v6

    .line 523
    #v5=(One);
    goto :goto_0

    .line 460
    :pswitch_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v7=(Boolean);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v7

    #v7=(Float);
    iput v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F

    iput v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F

    .line 461
    invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v7

    #v7=(Integer);
    iput v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    .line 462
    iput-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z

    .line 463
    iput v8, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    goto :goto_1

    .line 467
    :pswitch_2
    #v7=(Boolean);
    iget v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    #v7=(Integer);
    invoke-static {p1, v7}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I

    move-result v2

    .line 468
    .local v2, pointerIndex:I
    #v2=(Integer);
    if-gez v2, :cond_4

    .line 469
    sget-object v6, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;

    #v6=(Reference);
    const-string v7, "Got ACTION_MOVE event but have an invalid active pointer id."

    #v7=(Reference);
    invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 473
    :cond_4
    #v6=(One);v7=(Integer);
    invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v3

    .line 474
    .local v3, y:F
    #v3=(Float);
    iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F

    #v5=(Integer);
    sub-float v4, v3, v5

    .line 476
    .local v4, yDiff:F
    #v4=(Float);
    iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z

    #v5=(Boolean);
    if-nez v5, :cond_5

    iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTouchSlop:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    cmpl-float v5, v4, v5

    #v5=(Byte);
    if-lez v5, :cond_5

    .line 477
    iput-boolean v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z

    .line 480
    :cond_5
    iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z

    #v5=(Boolean);
    if-eqz v5, :cond_3

    .line 482
    iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F

    #v5=(Integer);
    cmpl-float v5, v4, v5

    #v5=(Byte);
    if-lez v5, :cond_6

    .line 484
    invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->startRefresh()V

    .line 500
    :goto_2
    #v5=(Conflicted);
    iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F

    goto :goto_1

    .line 487
    :cond_6
    #v5=(Byte);
    iget-object v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAccelerateInterpolator:Landroid/view/animation/AccelerateInterpolator;

    #v5=(Reference);
    iget v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F

    div-float v7, v4, v7

    #v7=(Float);
    invoke-virtual {v5, v7}, Landroid/view/animation/AccelerateInterpolator;->getInterpolation(F)F

    move-result v5

    #v5=(Float);
    invoke-direct {p0, v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTriggerPercentage(F)V

    .line 490
    float-to-int v5, v4

    #v5=(Integer);
    invoke-direct {p0, v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->updateContentOffsetTop(I)V

    .line 491
    iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F

    cmpl-float v5, v5, v3

    #v5=(Byte);
    if-lez v5, :cond_7

    iget-object v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I

    move-result v7

    #v7=(Integer);
    if-ne v5, v7, :cond_7

    .line 495
    iget-object v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;

    #v5=(Reference);
    invoke-virtual {p0, v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 497
    :cond_7
    #v5=(Integer);
    invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->updatePositionTimeout()V

    goto :goto_2

    .line 505
    .end local v2           #pointerIndex:I
    .end local v3           #y:F
    .end local v4           #yDiff:F
    :pswitch_3
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v7=(Boolean);
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I

    move-result v1

    .line 506
    .local v1, index:I
    #v1=(Integer);
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F

    move-result v5

    #v5=(Float);
    iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F

    .line 507
    invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I

    move-result v5

    #v5=(Integer);
    iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    goto/16 :goto_1

    .line 512
    .end local v1           #index:I
    :pswitch_4
    #v1=(Uninit);v5=(Null);
    invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V

    goto/16 :goto_1

    .line 517
    :pswitch_5
    iput-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z

    .line 518
    iput v8, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    .line 519
    const/4 v6, -0x1

    #v6=(Byte);
    iput v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I

    goto/16 :goto_0

    .line 458
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_5
        :pswitch_2
        :pswitch_5
        :pswitch_0
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public requestDisallowInterceptTouchEvent(Z)V
    .locals 0
    .parameter "b"

    .prologue
    .line 443
    return-void
.end method

.method public setColorScheme(IIII)V
    .locals 0
    .parameter "colorRes1"
    .parameter "colorRes2"
    .parameter "colorRes3"
    .parameter "colorRes4"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 271
    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorSchemeResources(IIII)V

    .line 272
    return-void
.end method

.method public setColorSchemeColors(IIII)V
    .locals 1
    .parameter "color1"
    .parameter "color2"
    .parameter "color3"
    .parameter "color4"

    .prologue
    .line 292
    invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V

    .line 293
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/widget/SwipeProgressBar;->setColorScheme(IIII)V

    .line 294
    return-void
.end method

.method public setColorSchemeResources(IIII)V
    .locals 5
    .parameter "colorRes1"
    .parameter "colorRes2"
    .parameter "colorRes3"
    .parameter "colorRes4"

    .prologue
    .line 281
    invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 282
    .local v0, res:Landroid/content/res/Resources;
    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    #v3=(Integer);
    invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    #v4=(Integer);
    invoke-virtual {p0, v1, v2, v3, v4}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorSchemeColors(IIII)V

    .line 284
    return-void
.end method

.method public setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 233
    iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mListener:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;

    .line 234
    return-void
.end method

.method public setRefreshing(Z)V
    .locals 1
    .parameter "refreshing"

    .prologue
    .line 254
    iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z

    #v0=(Boolean);
    if-eq v0, p1, :cond_0

    .line 255
    invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V

    .line 256
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F

    .line 257
    iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z

    .line 258
    iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 259
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/SwipeProgressBar;->start()V

    .line 264
    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 261
    :cond_1
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/SwipeProgressBar;->stop()V

    goto :goto_0
.end method

*/}
