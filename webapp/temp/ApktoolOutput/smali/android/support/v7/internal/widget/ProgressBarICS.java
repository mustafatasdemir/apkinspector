package android.support.v7.internal.widget; class ProgressBarICS {/*

.class public Landroid/support/v7/internal/widget/ProgressBarICS;
.super Landroid/view/View;
.source "ProgressBarICS.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/ProgressBarICS$1;,
        Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;,
        Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
    }
.end annotation


# static fields
.field private static final ANIMATION_RESOLUTION:I = 0xc8

.field private static final MAX_LEVEL:I = 0x2710

.field private static final android_R_styleable_ProgressBar:[I


# instance fields
.field private mAnimation:Landroid/view/animation/AlphaAnimation;

.field private mBehavior:I

.field private mCurrentDrawable:Landroid/graphics/drawable/Drawable;

.field private mDuration:I

.field private mInDrawing:Z

.field private mIndeterminate:Z

.field private mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

.field private mInterpolator:Landroid/view/animation/Interpolator;

.field private mLastDrawTime:J

.field private mMax:I

.field mMaxHeight:I

.field mMaxWidth:I

.field mMinHeight:I

.field mMinWidth:I

.field private mNoInvalidate:Z

.field private mOnlyIndeterminate:Z

.field private mProgress:I

.field private mProgressDrawable:Landroid/graphics/drawable/Drawable;

.field private mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;

.field mSampleTile:Landroid/graphics/Bitmap;

.field private mSecondaryProgress:I

.field private mShouldStartAnimationDrawable:Z

.field private mTransformation:Landroid/view/animation/Transformation;

.field private mUiThreadId:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 60
    const/16 v0, 0xe

    #v0=(PosByte);
    new-array v0, v0, [I

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Landroid/support/v7/internal/widget/ProgressBarICS;->android_R_styleable_ProgressBar:[I

    return-void

    :array_0
    .array-data 0x4
        0x36t 0x1t 0x1t 0x1t
        0x37t 0x1t 0x1t 0x1t
        0x38t 0x1t 0x1t 0x1t
        0x39t 0x1t 0x1t 0x1t
        0x3at 0x1t 0x1t 0x1t
        0x3bt 0x1t 0x1t 0x1t
        0x3ct 0x1t 0x1t 0x1t
        0x3dt 0x1t 0x1t 0x1t
        0x3et 0x1t 0x1t 0x1t
        0x3ft 0x1t 0x1t 0x1t
        0x1ft 0x1t 0x1t 0x1t
        0x40t 0x1t 0x1t 0x1t
        0x20t 0x1t 0x1t 0x1t
        0x41t 0x1t 0x1t 0x1t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
    .locals 8
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"
    .parameter "styleRes"

    .prologue
    const/4 v5, 0x1

    #v5=(One);
    const/4 v4, 0x0

    .line 109
    #v4=(Null);
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 110
    #p0=(Reference);
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/lang/Thread;->getId()J

    move-result-wide v6

    #v6=(LongLo);v7=(LongHi);
    iput-wide v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mUiThreadId:J

    .line 111
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->initProgressBar()V

    .line 113
    sget-object v6, Landroid/support/v7/internal/widget/ProgressBarICS;->android_R_styleable_ProgressBar:[I

    #v6=(Reference);
    invoke-virtual {p1, p2, v6, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 116
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mNoInvalidate:Z

    .line 118
    iget v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    #v6=(Integer);
    invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->setMax(I)V

    .line 119
    iget v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(I)V

    .line 120
    const/4 v6, 0x2

    #v6=(PosByte);
    iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I

    #v7=(Integer);
    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    #v6=(Integer);
    invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->setSecondaryProgress(I)V

    .line 122
    const/4 v6, 0x3

    #v6=(PosByte);
    iget-boolean v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    #v7=(Boolean);
    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v2

    .line 123
    .local v2, indeterminate:Z
    #v2=(Boolean);
    const/4 v6, 0x4

    iget-boolean v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z

    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v6

    #v6=(Boolean);
    iput-boolean v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z

    .line 125
    const/4 v6, 0x5

    #v6=(PosByte);
    invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 126
    .local v1, drawable:Landroid/graphics/drawable/Drawable;
    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 127
    invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->tileifyIndeterminate(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 128
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 131
    :cond_0
    const/4 v6, 0x6

    invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 132
    if-eqz v1, :cond_1

    .line 133
    invoke-direct {p0, v1, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 136
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 139
    :cond_1
    const/4 v6, 0x7

    iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mDuration:I

    #v7=(Integer);
    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    #v6=(Integer);
    iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mDuration:I

    .line 140
    const/16 v6, 0x8

    #v6=(PosByte);
    iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mBehavior:I

    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v6

    #v6=(Integer);
    iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mBehavior:I

    .line 141
    const/16 v6, 0x9

    #v6=(PosByte);
    iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinWidth:I

    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    #v6=(Integer);
    iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinWidth:I

    .line 142
    const/16 v6, 0xa

    #v6=(PosByte);
    iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxWidth:I

    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    #v6=(Integer);
    iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxWidth:I

    .line 143
    const/16 v6, 0xb

    #v6=(PosByte);
    iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinHeight:I

    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    #v6=(Integer);
    iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinHeight:I

    .line 144
    const/16 v6, 0xc

    #v6=(PosByte);
    iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I

    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    #v6=(Integer);
    iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I

    .line 146
    const/16 v6, 0xd

    #v6=(PosByte);
    const v7, 0x10a000b

    invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    .line 147
    .local v3, resID:I
    #v3=(Integer);
    if-lez v3, :cond_2

    .line 148
    invoke-virtual {p0, p1, v3}, Landroid/support/v7/internal/widget/ProgressBarICS;->setInterpolator(Landroid/content/Context;I)V

    .line 151
    :cond_2
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 153
    iput-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mNoInvalidate:Z

    .line 154
    iget-boolean v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z

    #v6=(Boolean);
    if-nez v6, :cond_3

    if-eqz v2, :cond_4

    :cond_3
    move v4, v5

    :cond_4
    #v4=(Boolean);
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setIndeterminate(Z)V

    .line 155
    return-void
.end method

.method static synthetic access$000(Landroid/support/v7/internal/widget/ProgressBarICS;IIZZ)V
    .locals 0
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"
    .parameter "x4"

    .prologue
    .line 52
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v7/internal/widget/ProgressBarICS;->doRefreshProgress(IIZZ)V

    return-void
.end method

.method static synthetic access$102(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;)Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 52
    iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;

    return-object p1
.end method

.method private declared-synchronized doRefreshProgress(IIZZ)V
    .locals 7
    .parameter "id"
    .parameter "progress"
    .parameter "fromUser"
    .parameter "callBackToApp"

    .prologue
    .line 418
    monitor-enter p0

    :try_start_0
    iget v5, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    #v5=(Integer);
    if-lez v5, :cond_1

    int-to-float v5, p2

    #v5=(Float);
    iget v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    div-float v4, v5, v6

    .line 419
    .local v4, scale:F
    :goto_0
    #v4=(Float);v5=(Integer);v6=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;

    .line 420
    .local v1, d:Landroid/graphics/drawable/Drawable;
    #v1=(Reference);
    if-eqz v1, :cond_3

    .line 421
    const/4 v3, 0x0

    .line 423
    .local v3, progressDrawable:Landroid/graphics/drawable/Drawable;
    #v3=(Null);
    instance-of v5, v1, Landroid/graphics/drawable/LayerDrawable;

    #v5=(Boolean);
    if-eqz v5, :cond_0

    .line 424
    move-object v0, v1

    #v0=(Reference);
    check-cast v0, Landroid/graphics/drawable/LayerDrawable;

    move-object v5, v0

    #v5=(Reference);
    invoke-virtual {v5, p1}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    .line 427
    :cond_0
    #v0=(Conflicted);v3=(Reference);v5=(Conflicted);
    const v5, 0x461c4000

    #v5=(Integer);
    mul-float/2addr v5, v4

    #v5=(Float);
    float-to-int v2, v5

    .line 428
    .local v2, level:I
    #v2=(Integer);
    if-eqz v3, :cond_2

    .end local v3           #progressDrawable:Landroid/graphics/drawable/Drawable;
    :goto_1
    invoke-virtual {v3, v2}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 432
    .end local v2           #level:I
    :goto_2
    #v2=(Conflicted);v3=(Conflicted);v5=(Integer);
    monitor-exit p0

    return-void

    .line 418
    .end local v1           #d:Landroid/graphics/drawable/Drawable;
    .end local v4           #scale:F
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_0

    .restart local v1       #d:Landroid/graphics/drawable/Drawable;
    .restart local v2       #level:I
    .restart local v3       #progressDrawable:Landroid/graphics/drawable/Drawable;
    .restart local v4       #scale:F
    :cond_2
    #v0=(Conflicted);v1=(Reference);v2=(Integer);v3=(Reference);v4=(Float);v5=(Float);v6=(Conflicted);
    move-object v3, v1

    .line 428
    goto :goto_1

    .line 430
    .end local v2           #level:I
    .end local v3           #progressDrawable:Landroid/graphics/drawable/Drawable;
    :cond_3
    :try_start_1
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->invalidate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 418
    .end local v1           #d:Landroid/graphics/drawable/Drawable;
    .end local v4           #scale:F
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v5

    #v5=(Reference);
    monitor-exit p0

    throw v5
.end method

.method private initProgressBar()V
    .locals 4

    .prologue
    const/16 v3, 0x30

    #v3=(PosByte);
    const/16 v2, 0x18

    #v2=(PosByte);
    const/4 v1, 0x0

    .line 242
    #v1=(Null);
    const/16 v0, 0x64

    #v0=(PosByte);
    iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    .line 243
    iput v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    .line 244
    iput v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I

    .line 245
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    .line 246
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z

    .line 247
    const/16 v0, 0xfa0

    #v0=(PosShort);
    iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mDuration:I

    .line 248
    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mBehavior:I

    .line 249
    iput v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinWidth:I

    .line 250
    iput v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxWidth:I

    .line 251
    iput v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinHeight:I

    .line 252
    iput v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I

    .line 253
    return-void
.end method

.method private declared-synchronized refreshProgress(IIZ)V
    .locals 5
    .parameter "id"
    .parameter "progress"
    .parameter "fromUser"

    .prologue
    .line 435
    monitor-enter p0

    :try_start_0
    iget-wide v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mUiThreadId:J

    #v1=(LongLo);v2=(LongHi);
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/lang/Thread;->getId()J

    move-result-wide v3

    #v3=(LongLo);v4=(LongHi);
    cmp-long v1, v1, v3

    #v1=(Byte);
    if-nez v1, :cond_0

    .line 436
    const/4 v1, 0x1

    #v1=(One);
    invoke-direct {p0, p1, p2, p3, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->doRefreshProgress(IIZZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 451
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    monitor-exit p0

    return-void

    .line 439
    :cond_0
    :try_start_1
    #v0=(Uninit);v1=(Byte);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 441
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;

    .line 443
    .local v0, r:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;

    .line 444
    invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->setup(IIZ)V

    .line 449
    :goto_1
    #v1=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 435
    .end local v0           #r:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    #v1=(Reference);
    monitor-exit p0

    throw v1

    .line 447
    :cond_1
    :try_start_2
    #v0=(Uninit);v2=(LongHi);v3=(LongLo);v4=(LongHi);
    new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;

    #v0=(UninitRef);
    invoke-direct {v0, p0, p1, p2, p3}, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;-><init>(Landroid/support/v7/internal/widget/ProgressBarICS;IIZ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .restart local v0       #r:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
    #v0=(Reference);
    goto :goto_1
.end method

.method private tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
    .locals 12
    .parameter "drawable"
    .parameter "clip"

    .prologue
    const/4 v10, 0x1

    .line 163
    #v10=(One);
    instance-of v9, p1, Landroid/graphics/drawable/LayerDrawable;

    #v9=(Boolean);
    if-eqz v9, :cond_3

    move-object v1, p1

    .line 164
    #v1=(Reference);
    check-cast v1, Landroid/graphics/drawable/LayerDrawable;

    .line 165
    .local v1, background:Landroid/graphics/drawable/LayerDrawable;
    invoke-virtual {v1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I

    move-result v0

    .line 166
    .local v0, N:I
    #v0=(Integer);
    new-array v6, v0, [Landroid/graphics/drawable/Drawable;

    .line 168
    .local v6, outDrawables:[Landroid/graphics/drawable/Drawable;
    #v6=(Reference);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v3=(Integer);v4=(Conflicted);v9=(Conflicted);v11=(Conflicted);
    if-ge v3, v0, :cond_2

    .line 169
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I

    move-result v4

    .line 170
    .local v4, id:I
    #v4=(Integer);
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    #v11=(Reference);
    const v9, 0x102000d

    #v9=(Integer);
    if-eq v4, v9, :cond_0

    const v9, 0x102000f

    if-ne v4, v9, :cond_1

    :cond_0
    move v9, v10

    :goto_1
    #v9=(Boolean);
    invoke-direct {p0, v11, v9}, Landroid/support/v7/internal/widget/ProgressBarICS;->tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v9

    #v9=(Reference);
    aput-object v9, v6, v3

    .line 168
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 170
    :cond_1
    #v9=(Integer);
    const/4 v9, 0x0

    #v9=(Null);
    goto :goto_1

    .line 174
    .end local v4           #id:I
    :cond_2
    #v4=(Conflicted);v9=(Conflicted);v11=(Conflicted);
    new-instance v5, Landroid/graphics/drawable/LayerDrawable;

    #v5=(UninitRef);
    invoke-direct {v5, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V

    .line 176
    .local v5, newBg:Landroid/graphics/drawable/LayerDrawable;
    #v5=(Reference);
    const/4 v3, 0x0

    :goto_2
    if-ge v3, v0, :cond_6

    .line 177
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I

    move-result v9

    #v9=(Integer);
    invoke-virtual {v5, v3, v9}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V

    .line 176
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 182
    .end local v0           #N:I
    .end local v1           #background:Landroid/graphics/drawable/LayerDrawable;
    .end local v3           #i:I
    .end local v5           #newBg:Landroid/graphics/drawable/LayerDrawable;
    .end local v6           #outDrawables:[Landroid/graphics/drawable/Drawable;
    :cond_3
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v9=(Boolean);v11=(Uninit);
    instance-of v9, p1, Landroid/graphics/drawable/BitmapDrawable;

    if-eqz v9, :cond_7

    .line 183
    check-cast p1, Landroid/graphics/drawable/BitmapDrawable;

    .end local p1
    invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;

    move-result-object v8

    .line 184
    .local v8, tileBitmap:Landroid/graphics/Bitmap;
    #v8=(Reference);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSampleTile:Landroid/graphics/Bitmap;

    #v9=(Reference);
    if-nez v9, :cond_4

    .line 185
    iput-object v8, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSampleTile:Landroid/graphics/Bitmap;

    .line 188
    :cond_4
    new-instance v7, Landroid/graphics/drawable/ShapeDrawable;

    #v7=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getDrawableShape()Landroid/graphics/drawable/shapes/Shape;

    move-result-object v9

    invoke-direct {v7, v9}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V

    .line 190
    .local v7, shapeDrawable:Landroid/graphics/drawable/ShapeDrawable;
    #v7=(Reference);
    new-instance v2, Landroid/graphics/BitmapShader;

    #v2=(UninitRef);
    sget-object v9, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;

    sget-object v11, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    #v11=(Reference);
    invoke-direct {v2, v8, v9, v11}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 192
    .local v2, bitmapShader:Landroid/graphics/BitmapShader;
    #v2=(Reference);
    invoke-virtual {v7}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v9

    invoke-virtual {v9, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 194
    if-eqz p2, :cond_5

    new-instance v9, Landroid/graphics/drawable/ClipDrawable;

    #v9=(UninitRef);
    const/4 v11, 0x3

    #v11=(PosByte);
    invoke-direct {v9, v7, v11, v10}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V

    #v9=(Reference);
    move-object v7, v9

    .end local v7           #shapeDrawable:Landroid/graphics/drawable/ShapeDrawable;
    :cond_5
    #v11=(Conflicted);
    move-object v5, v7

    .line 198
    .end local v2           #bitmapShader:Landroid/graphics/BitmapShader;
    .end local v8           #tileBitmap:Landroid/graphics/Bitmap;
    :cond_6
    :goto_3
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v5

    .restart local p1
    :cond_7
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Boolean);v11=(Uninit);
    move-object v5, p1

    #v5=(Reference);
    goto :goto_3
.end method

.method private tileifyIndeterminate(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 8
    .parameter "drawable"

    .prologue
    const/16 v7, 0x2710

    .line 212
    #v7=(PosShort);
    instance-of v5, p1, Landroid/graphics/drawable/AnimationDrawable;

    #v5=(Boolean);
    if-eqz v5, :cond_1

    move-object v1, p1

    .line 213
    #v1=(Reference);
    check-cast v1, Landroid/graphics/drawable/AnimationDrawable;

    .line 214
    .local v1, background:Landroid/graphics/drawable/AnimationDrawable;
    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I

    move-result v0

    .line 215
    .local v0, N:I
    #v0=(Integer);
    new-instance v4, Landroid/graphics/drawable/AnimationDrawable;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V

    .line 216
    .local v4, newBg:Landroid/graphics/drawable/AnimationDrawable;
    #v4=(Reference);
    invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->isOneShot()Z

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V

    .line 218
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v2=(Conflicted);v3=(Integer);v5=(Integer);v6=(Conflicted);
    if-ge v3, v0, :cond_0

    .line 219
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    #v5=(Reference);
    const/4 v6, 0x1

    #v6=(One);
    invoke-direct {p0, v5, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 220
    .local v2, frame:Landroid/graphics/drawable/Drawable;
    #v2=(Reference);
    invoke-virtual {v2, v7}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z

    .line 221
    invoke-virtual {v1, v3}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v2, v5}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V

    .line 218
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 223
    .end local v2           #frame:Landroid/graphics/drawable/Drawable;
    :cond_0
    #v2=(Conflicted);v6=(Conflicted);
    invoke-virtual {v4, v7}, Landroid/graphics/drawable/AnimationDrawable;->setLevel(I)Z

    .line 224
    move-object p1, v4

    .line 226
    .end local v0           #N:I
    .end local v1           #background:Landroid/graphics/drawable/AnimationDrawable;
    .end local v3           #i:I
    .end local v4           #newBg:Landroid/graphics/drawable/AnimationDrawable;
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-object p1
.end method

.method private updateDrawableBounds(II)V
    .locals 13
    .parameter "w"
    .parameter "h"

    .prologue
    const/4 v12, 0x0

    .line 732
    #v12=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingRight()I

    move-result v10

    #v10=(Integer);
    sub-int v10, p1, v10

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingLeft()I

    move-result v11

    #v11=(Integer);
    sub-int v7, v10, v11

    .line 733
    .local v7, right:I
    #v7=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingBottom()I

    move-result v10

    sub-int v10, p2, v10

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingTop()I

    move-result v11

    sub-int v0, v10, v11

    .line 734
    .local v0, bottom:I
    #v0=(Integer);
    const/4 v8, 0x0

    .line 735
    .local v8, top:I
    #v8=(Null);
    const/4 v6, 0x0

    .line 737
    .local v6, left:I
    #v6=(Null);
    iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v10=(Reference);
    if-eqz v10, :cond_1

    .line 739
    iget-boolean v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z

    #v10=(Boolean);
    if-eqz v10, :cond_0

    iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v10=(Reference);
    instance-of v10, v10, Landroid/graphics/drawable/AnimationDrawable;

    #v10=(Boolean);
    if-nez v10, :cond_0

    .line 742
    iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v10=(Reference);
    invoke-virtual {v10}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    .line 743
    .local v5, intrinsicWidth:I
    #v5=(Integer);
    iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v10}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v4

    .line 744
    .local v4, intrinsicHeight:I
    #v4=(Integer);
    int-to-float v10, v5

    #v10=(Float);
    int-to-float v11, v4

    #v11=(Float);
    div-float v3, v10, v11

    .line 745
    .local v3, intrinsicAspect:F
    #v3=(Float);
    int-to-float v10, p1

    int-to-float v11, p2

    div-float v1, v10, v11

    .line 746
    .local v1, boundAspect:F
    #v1=(Float);
    cmpl-float v10, v3, v1

    #v10=(Byte);
    if-eqz v10, :cond_0

    .line 747
    cmpl-float v10, v1, v3

    if-lez v10, :cond_3

    .line 749
    int-to-float v10, p2

    #v10=(Float);
    mul-float/2addr v10, v3

    float-to-int v9, v10

    .line 750
    .local v9, width:I
    #v9=(Integer);
    sub-int v10, p1, v9

    #v10=(Integer);
    div-int/lit8 v6, v10, 0x2

    .line 751
    #v6=(Integer);
    add-int v7, v6, v9

    .line 760
    .end local v1           #boundAspect:F
    .end local v3           #intrinsicAspect:F
    .end local v4           #intrinsicHeight:I
    .end local v5           #intrinsicWidth:I
    .end local v9           #width:I
    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);v9=(Conflicted);v11=(Integer);
    iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v10=(Reference);
    invoke-virtual {v10, v6, v8, v7, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 763
    :cond_1
    iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    if-eqz v10, :cond_2

    .line 764
    iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v10, v12, v12, v7, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 766
    :cond_2
    return-void

    .line 754
    .restart local v1       #boundAspect:F
    .restart local v3       #intrinsicAspect:F
    .restart local v4       #intrinsicHeight:I
    .restart local v5       #intrinsicWidth:I
    :cond_3
    #v1=(Float);v2=(Uninit);v3=(Float);v4=(Integer);v5=(Integer);v6=(Null);v8=(Null);v9=(Uninit);v10=(Byte);v11=(Float);
    int-to-float v10, p1

    #v10=(Float);
    const/high16 v11, 0x3f80

    #v11=(Integer);
    div-float/2addr v11, v3

    #v11=(Float);
    mul-float/2addr v10, v11

    float-to-int v2, v10

    .line 755
    .local v2, height:I
    #v2=(Integer);
    sub-int v10, p2, v2

    #v10=(Integer);
    div-int/lit8 v8, v10, 0x2

    .line 756
    #v8=(Integer);
    add-int v0, v8, v2

    goto :goto_0
.end method

.method private updateDrawableState()V
    .locals 2

    .prologue
    .line 827
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getDrawableState()[I

    move-result-object v0

    .line 829
    .local v0, state:[I
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 830
    iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 833
    :cond_0
    #v1=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v1=(Reference);
    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 834
    iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 836
    :cond_1
    #v1=(Conflicted);
    return-void
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 0

    .prologue
    .line 822
    invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V

    .line 823
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableState()V

    .line 824
    return-void
.end method

.method getDrawableShape()Landroid/graphics/drawable/shapes/Shape;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 202
    #v2=(Null);
    const/16 v1, 0x8

    #v1=(PosByte);
    new-array v0, v1, [F

    #v0=(Reference);
    fill-array-data v0, :array_0

    .line 203
    .local v0, roundedCorners:[F
    new-instance v1, Landroid/graphics/drawable/shapes/RoundRectShape;

    #v1=(UninitRef);
    invoke-direct {v1, v0, v2, v2}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V

    #v1=(Reference);
    return-object v1

    .line 202
    :array_0
    .array-data 0x4
        0x0t 0x0t 0xa0t 0x40t
        0x0t 0x0t 0xa0t 0x40t
        0x0t 0x0t 0xa0t 0x40t
        0x0t 0x0t 0xa0t 0x40t
        0x0t 0x0t 0xa0t 0x40t
        0x0t 0x0t 0xa0t 0x40t
        0x0t 0x0t 0xa0t 0x40t
        0x0t 0x0t 0xa0t 0x40t
    .end array-data
.end method

.method public getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 299
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    return-object v0
.end method

.method public getInterpolator()Landroid/view/animation/Interpolator;
    .locals 1

    .prologue
    .line 676
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;

    #v0=(Reference);
    return-object v0
.end method

.method public declared-synchronized getMax()I
    .locals 1

    .prologue
    .line 560
    monitor-enter p0

    :try_start_0
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    #v0=(Integer);
    monitor-exit p0

    return v0

    :catchall_0
    #v0=(Uninit);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized getProgress()I
    .locals 1

    .prologue
    .line 531
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    #v0=(Boolean);
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    #v0=(Integer);
    goto :goto_0

    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public getProgressDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 332
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    return-object v0
.end method

.method public declared-synchronized getSecondaryProgress()I
    .locals 1

    .prologue
    .line 547
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    monitor-exit p0

    return v0

    :cond_0
    :try_start_1
    #v0=(Boolean);
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    #v0=(Integer);
    goto :goto_0

    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized incrementProgressBy(I)V
    .locals 1
    .parameter "diff"

    .prologue
    .line 595
    monitor-enter p0

    :try_start_0
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    #v0=(Integer);
    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 596
    monitor-exit p0

    return-void

    .line 595
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public final declared-synchronized incrementSecondaryProgressBy(I)V
    .locals 1
    .parameter "diff"

    .prologue
    .line 606
    monitor-enter p0

    :try_start_0
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I

    #v0=(Integer);
    add-int/2addr v0, p1

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->setSecondaryProgress(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 607
    monitor-exit p0

    return-void

    .line 606
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 7
    .parameter "dr"

    .prologue
    .line 711
    iget-boolean v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInDrawing:Z

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 712
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ProgressBarICS;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 713
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v0

    .line 714
    .local v0, dirty:Landroid/graphics/Rect;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getScrollX()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingLeft()I

    move-result v4

    #v4=(Integer);
    add-int v1, v3, v4

    .line 715
    .local v1, scrollX:I
    #v1=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getScrollY()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingTop()I

    move-result v4

    add-int v2, v3, v4

    .line 717
    .local v2, scrollY:I
    #v2=(Integer);
    iget v3, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v3, v1

    iget v4, v0, Landroid/graphics/Rect;->top:I

    add-int/2addr v4, v2

    iget v5, v0, Landroid/graphics/Rect;->right:I

    #v5=(Integer);
    add-int/2addr v5, v1

    iget v6, v0, Landroid/graphics/Rect;->bottom:I

    #v6=(Integer);
    add-int/2addr v6, v2

    invoke-virtual {p0, v3, v4, v5, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->invalidate(IIII)V

    .line 723
    .end local v0           #dirty:Landroid/graphics/Rect;
    .end local v1           #scrollX:I
    .end local v2           #scrollY:I
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    .line 720
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
    invoke-super {p0, p1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V

    goto :goto_0
.end method

.method public declared-synchronized isIndeterminate()Z
    .locals 1

    .prologue
    .line 261
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    #v0=(Boolean);
    monitor-exit p0

    return v0

    :catchall_0
    #v0=(Uninit);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 900
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 901
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 902
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->startAnimation()V

    .line 904
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 908
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 909
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->stopAnimation()V

    .line 911
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 912
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 917
    :cond_1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 918
    return-void
.end method

.method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
    .locals 10
    .parameter "canvas"

    .prologue
    const-wide/16 v8, 0xc8

    .line 770
    #v8=(LongLo);v9=(LongHi);
    monitor-enter p0

    :try_start_0
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 772
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;

    .line 773
    .local v0, d:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 776
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 777
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingLeft()I

    move-result v4

    #v4=(Integer);
    int-to-float v4, v4

    #v4=(Float);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingTop()I

    move-result v5

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 778
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getDrawingTime()J

    move-result-wide v2

    .line 779
    .local v2, time:J
    #v2=(LongLo);v3=(LongHi);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    #v4=(Reference);
    if-eqz v4, :cond_0

    .line 780
    iget-object v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mTransformation:Landroid/view/animation/Transformation;

    #v5=(Reference);
    invoke-virtual {v4, v2, v3, v5}, Landroid/view/animation/AlphaAnimation;->getTransformation(JLandroid/view/animation/Transformation;)Z

    .line 781
    iget-object v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mTransformation:Landroid/view/animation/Transformation;

    invoke-virtual {v4}, Landroid/view/animation/Transformation;->getAlpha()F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result v1

    .line 783
    .local v1, scale:F
    #v1=(Float);
    const/4 v4, 0x1

    :try_start_1
    #v4=(One);
    iput-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInDrawing:Z

    .line 784
    const v4, 0x461c4000

    #v4=(Integer);
    mul-float/2addr v4, v1

    #v4=(Float);
    float-to-int v4, v4

    #v4=(Integer);
    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 786
    const/4 v4, 0x0

    :try_start_2
    #v4=(Null);
    iput-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInDrawing:Z

    .line 788
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    #v4=(LongLo);v5=(LongHi);
    iget-wide v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mLastDrawTime:J

    #v6=(LongLo);v7=(LongHi);
    sub-long/2addr v4, v6

    cmp-long v4, v4, v8

    #v4=(Byte);
    if-ltz v4, :cond_0

    .line 789
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v4

    #v4=(LongLo);
    iput-wide v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mLastDrawTime:J

    .line 790
    const-wide/16 v4, 0xc8

    invoke-virtual {p0, v4, v5}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidateDelayed(J)V

    .line 793
    .end local v1           #scale:F
    :cond_0
    #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 794
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 795
    iget-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mShouldStartAnimationDrawable:Z

    #v4=(Boolean);
    if-eqz v4, :cond_1

    instance-of v4, v0, Landroid/graphics/drawable/Animatable;

    if-eqz v4, :cond_1

    .line 796
    check-cast v0, Landroid/graphics/drawable/Animatable;

    .end local v0           #d:Landroid/graphics/drawable/Drawable;
    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    .line 797
    const/4 v4, 0x0

    #v4=(Null);
    iput-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mShouldStartAnimationDrawable:Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 800
    .end local v2           #time:J
    :cond_1
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    monitor-exit p0

    return-void

    .line 786
    .restart local v0       #d:Landroid/graphics/drawable/Drawable;
    .restart local v1       #scale:F
    .restart local v2       #time:J
    :catchall_0
    #v1=(Float);v2=(LongLo);v3=(LongHi);v4=(Integer);v5=(Reference);v6=(Uninit);v7=(Uninit);
    move-exception v4

    #v4=(Reference);
    const/4 v5, 0x0

    :try_start_3
    #v5=(Null);
    iput-boolean v5, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInDrawing:Z

    throw v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 770
    .end local v0           #d:Landroid/graphics/drawable/Drawable;
    .end local v1           #scale:F
    .end local v2           #time:J
    :catchall_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v4

    #v4=(Reference);
    monitor-exit p0

    throw v4
.end method

.method protected declared-synchronized onMeasure(II)V
    .locals 6
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 804
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;

    .line 806
    .local v0, d:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    const/4 v2, 0x0

    .line 807
    .local v2, dw:I
    #v2=(Null);
    const/4 v1, 0x0

    .line 808
    .local v1, dh:I
    #v1=(Null);
    if-eqz v0, :cond_0

    .line 809
    iget v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinWidth:I

    #v3=(Integer);
    iget v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxWidth:I

    #v4=(Integer);
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    #v5=(Integer);
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 810
    #v2=(Integer);
    iget v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinHeight:I

    iget v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 812
    :cond_0
    #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableState()V

    .line 813
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingLeft()I

    move-result v3

    #v3=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingRight()I

    move-result v4

    #v4=(Integer);
    add-int/2addr v3, v4

    add-int/2addr v2, v3

    .line 814
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingTop()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingBottom()I

    move-result v4

    add-int/2addr v3, v4

    add-int/2addr v1, v3

    .line 816
    invoke-static {v2, p1}, Landroid/support/v7/internal/widget/ProgressBarICS;->resolveSize(II)I

    move-result v3

    invoke-static {v1, p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->resolveSize(II)I

    move-result v4

    invoke-virtual {p0, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setMeasuredDimension(II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 818
    monitor-exit p0

    return-void

    .line 804
    .end local v0           #d:Landroid/graphics/drawable/Drawable;
    .end local v1           #dh:I
    .end local v2           #dw:I
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v3

    #v3=(Reference);
    monitor-exit p0

    throw v3
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2
    .parameter "state"

    .prologue
    .line 891
    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;

    .line 892
    .local v0, ss:Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v1

    #v1=(Reference);
    invoke-super {p0, v1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 894
    iget v1, v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->progress:I

    #v1=(Integer);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(I)V

    .line 895
    iget v1, v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->secondaryProgress:I

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setSecondaryProgress(I)V

    .line 896
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .prologue
    .line 880
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 881
    .local v1, superState:Landroid/os/Parcelable;
    #v1=(Reference);
    new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;

    #v0=(UninitRef);
    invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 883
    .local v0, ss:Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;
    #v0=(Reference);
    iget v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    #v2=(Integer);
    iput v2, v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->progress:I

    .line 884
    iget v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I

    iput v2, v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->secondaryProgress:I

    .line 886
    return-object v0
.end method

.method protected onSizeChanged(IIII)V
    .locals 0
    .parameter "w"
    .parameter "h"
    .parameter "oldw"
    .parameter "oldh"

    .prologue
    .line 727
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableBounds(II)V

    .line 728
    return-void
.end method

.method protected onVisibilityChanged(Landroid/view/View;I)V
    .locals 1
    .parameter "changedView"
    .parameter "visibility"

    .prologue
    .line 697
    invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V

    .line 699
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 701
    const/16 v0, 0x8

    #v0=(PosByte);
    if-eq p2, v0, :cond_0

    const/4 v0, 0x4

    if-ne p2, v0, :cond_2

    .line 702
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->stopAnimation()V

    .line 707
    :cond_1
    :goto_0
    return-void

    .line 704
    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->startAnimation()V

    goto :goto_0
.end method

.method public postInvalidate()V
    .locals 1

    .prologue
    .line 385
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mNoInvalidate:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 386
    invoke-super {p0}, Landroid/view/View;->postInvalidate()V

    .line 388
    :cond_0
    return-void
.end method

.method public declared-synchronized setIndeterminate(Z)V
    .locals 1
    .parameter "indeterminate"

    .prologue
    .line 275
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    if-nez v0, :cond_1

    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    if-eq p1, v0, :cond_1

    .line 276
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    .line 278
    if-eqz p1, :cond_2

    .line 280
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;

    .line 281
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->startAnimation()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 287
    :cond_1
    :goto_0
    #v0=(Conflicted);
    monitor-exit p0

    return-void

    .line 283
    :cond_2
    :try_start_1
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;

    .line 284
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->stopAnimation()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 275
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "d"

    .prologue
    .line 312
    if-eqz p1, :cond_0

    .line 313
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 315
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    .line 316
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 317
    iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;

    .line 318
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V

    .line 320
    :cond_1
    return-void
.end method

.method public setInterpolator(Landroid/content/Context;I)V
    .locals 1
    .parameter "context"
    .parameter "resID"

    .prologue
    .line 657
    invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 658
    return-void
.end method

.method public setInterpolator(Landroid/view/animation/Interpolator;)V
    .locals 0
    .parameter "interpolator"

    .prologue
    .line 667
    iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 668
    return-void
.end method

.method public declared-synchronized setMax(I)V
    .locals 3
    .parameter "max"

    .prologue
    .line 573
    monitor-enter p0

    if-gez p1, :cond_0

    .line 574
    const/4 p1, 0x0

    .line 576
    :cond_0
    :try_start_0
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    #v0=(Integer);
    if-eq p1, v0, :cond_2

    .line 577
    iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    .line 578
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V

    .line 580
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    if-le v0, p1, :cond_1

    .line 581
    iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    .line 583
    :cond_1
    const v0, 0x102000d

    iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0, v0, v1, v2}, Landroid/support/v7/internal/widget/ProgressBarICS;->refreshProgress(IIZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 585
    :cond_2
    #v1=(Conflicted);v2=(Conflicted);
    monitor-exit p0

    return-void

    .line 573
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public declared-synchronized setProgress(I)V
    .locals 1
    .parameter "progress"

    .prologue
    .line 465
    monitor-enter p0

    const/4 v0, 0x0

    :try_start_0
    #v0=(Null);
    invoke-virtual {p0, p1, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 466
    monitor-exit p0

    return-void

    .line 465
    :catchall_0
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method declared-synchronized setProgress(IZ)V
    .locals 2
    .parameter "progress"
    .parameter "fromUser"

    .prologue
    .line 469
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 485
    :cond_0
    :goto_0
    #v0=(Integer);v1=(Conflicted);
    monitor-exit p0

    return-void

    .line 473
    :cond_1
    #v0=(Boolean);v1=(Uninit);
    if-gez p1, :cond_2

    .line 474
    const/4 p1, 0x0

    .line 477
    :cond_2
    :try_start_1
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    #v0=(Integer);
    if-le p1, v0, :cond_3

    .line 478
    iget p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    .line 481
    :cond_3
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    if-eq p1, v0, :cond_0

    .line 482
    iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    .line 483
    const v0, 0x102000d

    iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    #v1=(Integer);
    invoke-direct {p0, v0, v1, p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->refreshProgress(IIZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 469
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 5
    .parameter "d"

    .prologue
    const/4 v4, 0x0

    .line 346
    #v4=(Null);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-eqz v2, :cond_3

    iget-object v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    if-eq p1, v2, :cond_3

    .line 347
    iget-object v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 348
    const/4 v1, 0x1

    .line 353
    .local v1, needUpdate:Z
    :goto_0
    #v1=(Boolean);v3=(Conflicted);
    if-eqz p1, :cond_0

    .line 354
    invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V

    .line 357
    invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I

    move-result v0

    .line 358
    .local v0, drawableHeight:I
    #v0=(Integer);
    iget v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I

    #v2=(Integer);
    if-ge v2, v0, :cond_0

    .line 359
    iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I

    .line 360
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->requestLayout()V

    .line 363
    .end local v0           #drawableHeight:I
    :cond_0
    #v0=(Conflicted);v2=(Conflicted);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    .line 364
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    #v2=(Boolean);
    if-nez v2, :cond_1

    .line 365
    iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;

    .line 366
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V

    .line 369
    :cond_1
    if-eqz v1, :cond_2

    .line 370
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getWidth()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getHeight()I

    move-result v3

    #v3=(Integer);
    invoke-direct {p0, v2, v3}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableBounds(II)V

    .line 371
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableState()V

    .line 372
    const v2, 0x102000d

    iget v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I

    invoke-direct {p0, v2, v3, v4, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->doRefreshProgress(IIZZ)V

    .line 373
    const v2, 0x102000f

    iget v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I

    invoke-direct {p0, v2, v3, v4, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->doRefreshProgress(IIZZ)V

    .line 375
    :cond_2
    #v3=(Conflicted);
    return-void

    .line 350
    .end local v1           #needUpdate:Z
    :cond_3
    #v0=(Uninit);v1=(Uninit);v2=(Reference);v3=(Uninit);
    const/4 v1, 0x0

    .restart local v1       #needUpdate:Z
    #v1=(Null);
    goto :goto_0
.end method

.method public declared-synchronized setSecondaryProgress(I)V
    .locals 3
    .parameter "secondaryProgress"

    .prologue
    .line 500
    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 516
    :cond_0
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    monitor-exit p0

    return-void

    .line 504
    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    if-gez p1, :cond_2

    .line 505
    const/4 p1, 0x0

    .line 508
    :cond_2
    :try_start_1
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    #v0=(Integer);
    if-le p1, v0, :cond_3

    .line 509
    iget p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I

    .line 512
    :cond_3
    iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I

    if-eq p1, v0, :cond_0

    .line 513
    iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I

    .line 514
    const v0, 0x102000f

    iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {p0, v0, v1, v2}, Landroid/support/v7/internal/widget/ProgressBarICS;->refreshProgress(IIZ)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 500
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit p0

    throw v0
.end method

.method public setVisibility(I)V
    .locals 1
    .parameter "v"

    .prologue
    .line 681
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v0

    #v0=(Integer);
    if-eq v0, p1, :cond_1

    .line 682
    invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 684
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 686
    const/16 v0, 0x8

    #v0=(PosByte);
    if-eq p1, v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_2

    .line 687
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->stopAnimation()V

    .line 693
    :cond_1
    :goto_0
    #v0=(Integer);
    return-void

    .line 689
    :cond_2
    #v0=(PosByte);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->startAnimation()V

    goto :goto_0
.end method

.method startAnimation()V
    .locals 3

    .prologue
    .line 613
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_0

    .line 634
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 617
    :cond_0
    #v0=(Integer);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    instance-of v0, v0, Landroid/graphics/drawable/Animatable;

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 618
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mShouldStartAnimationDrawable:Z

    .line 619
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    .line 633
    :goto_1
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V

    goto :goto_0

    .line 621
    :cond_1
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;

    #v0=(Reference);
    if-nez v0, :cond_2

    .line 622
    new-instance v0, Landroid/view/animation/LinearInterpolator;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;

    .line 625
    :cond_2
    new-instance v0, Landroid/view/animation/Transformation;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/view/animation/Transformation;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mTransformation:Landroid/view/animation/Transformation;

    .line 626
    new-instance v0, Landroid/view/animation/AlphaAnimation;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    const/high16 v2, 0x3f80

    #v2=(Integer);
    invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    .line 627
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mBehavior:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatMode(I)V

    .line 628
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    const/4 v1, -0x1

    #v1=(Byte);
    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatCount(I)V

    .line 629
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mDuration:I

    #v1=(Integer);
    int-to-long v1, v1

    #v1=(LongLo);v2=(LongHi);
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V

    .line 630
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V

    .line 631
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    const-wide/16 v1, -0x1

    #v1=(LongLo);
    invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setStartTime(J)V

    goto :goto_1
.end method

.method stopAnimation()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 640
    #v0=(Null);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;

    .line 641
    iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mTransformation:Landroid/view/animation/Transformation;

    .line 642
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    instance-of v0, v0, Landroid/graphics/drawable/Animatable;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 643
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    check-cast v0, Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    .line 644
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mShouldStartAnimationDrawable:Z

    .line 646
    :cond_0
    #v0=(Boolean);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V

    .line 647
    return-void
.end method

.method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
    .locals 1
    .parameter "who"

    .prologue
    .line 379
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-eq p1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;

    if-eq p1, v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
