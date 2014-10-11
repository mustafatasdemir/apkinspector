package android.support.v7.internal.widget; class ProgressBarICS { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// .super Landroid/view/View;
a=0;// .source "ProgressBarICS.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/widget/ProgressBarICS$1;,
a=0;//         Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;,
a=0;//         Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ANIMATION_RESOLUTION:I = 0xc8
a=0;// 
a=0;// .field private static final MAX_LEVEL:I = 0x2710
a=0;// 
a=0;// .field private static final android_R_styleable_ProgressBar:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;// .field private mBehavior:I
a=0;// 
a=0;// .field private mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mDuration:I
a=0;// 
a=0;// .field private mInDrawing:Z
a=0;// 
a=0;// .field private mIndeterminate:Z
a=0;// 
a=0;// .field private mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private mLastDrawTime:J
a=0;// 
a=0;// .field private mMax:I
a=0;// 
a=0;// .field mMaxHeight:I
a=0;// 
a=0;// .field mMaxWidth:I
a=0;// 
a=0;// .field mMinHeight:I
a=0;// 
a=0;// .field mMinWidth:I
a=0;// 
a=0;// .field private mNoInvalidate:Z
a=0;// 
a=0;// .field private mOnlyIndeterminate:Z
a=0;// 
a=0;// .field private mProgress:I
a=0;// 
a=0;// .field private mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;// .field mSampleTile:Landroid/graphics/Bitmap;
a=0;// 
a=0;// .field private mSecondaryProgress:I
a=0;// 
a=0;// .field private mShouldStartAnimationDrawable:Z
a=0;// 
a=0;// .field private mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;// .field private mUiThreadId:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     const/16 v0, 0xe
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v7/internal/widget/ProgressBarICS;->android_R_styleable_ProgressBar:[I
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x1010136
a=0;//         0x1010137
a=0;//         0x1010138
a=0;//         0x1010139
a=0;//         0x101013a
a=0;//         0x101013b
a=0;//         0x101013c
a=0;//         0x101013d
a=0;//         0x101013e
a=0;//         0x101013f
a=0;//         0x101011f
a=0;//         0x1010140
a=0;//         0x1010120
a=0;//         0x1010141
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;//     .locals 8
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;//     .param p4, "styleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 109
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 110
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v6}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v6
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     iput-wide v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mUiThreadId:J
a=0;// 
a=0;//     .line 111
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->initProgressBar()V
a=0;// 
a=0;//     .line 113
a=0;//     sget-object v6, Landroid/support/v7/internal/widget/ProgressBarICS;->android_R_styleable_ProgressBar:[I
a=0;// 
a=0;//     #v6=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v6, p3, p4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 116
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     iput-boolean v5, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mNoInvalidate:Z
a=0;// 
a=0;//     .line 118
a=0;//     iget v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->setMax(I)V
a=0;// 
a=0;//     .line 119
a=0;//     iget v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     invoke-virtual {v0, v5, v6}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(I)V
a=0;// 
a=0;//     .line 120
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->setSecondaryProgress(I)V
a=0;// 
a=0;//     .line 122
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget-boolean v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 123
a=0;//     .local v2, "indeterminate":Z
a=0;//     #v2=(Boolean);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     iget-boolean v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     iput-boolean v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     .line 125
a=0;//     const/4 v6, 0x5
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 126
a=0;//     .local v1, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->tileifyIndeterminate(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     const/4 v6, 0x6
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 132
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 133
a=0;//     invoke-direct {p0, v1, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 136
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 139
a=0;//     :cond_1
a=0;//     const/4 v6, 0x7
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mDuration:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mDuration:I
a=0;// 
a=0;//     .line 140
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mBehavior:I
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mBehavior:I
a=0;// 
a=0;//     .line 141
a=0;//     const/16 v6, 0x9
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinWidth:I
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinWidth:I
a=0;// 
a=0;//     .line 142
a=0;//     const/16 v6, 0xa
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxWidth:I
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxWidth:I
a=0;// 
a=0;//     .line 143
a=0;//     const/16 v6, 0xb
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinHeight:I
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinHeight:I
a=0;// 
a=0;//     .line 144
a=0;//     const/16 v6, 0xc
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     iget v7, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I
a=0;// 
a=0;//     .line 146
a=0;//     const/16 v6, 0xd
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const v7, 0x10a000b
a=0;// 
a=0;//     invoke-virtual {v0, v6, v7}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 147
a=0;//     .local v3, "resID":I
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 148
a=0;//     invoke-virtual {p0, p1, v3}, Landroid/support/v7/internal/widget/ProgressBarICS;->setInterpolator(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 151
a=0;//     :cond_2
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 153
a=0;//     iput-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mNoInvalidate:Z
a=0;// 
a=0;//     .line 154
a=0;//     iget-boolean v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_3
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     move v4, v5
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setIndeterminate(Z)V
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v7/internal/widget/ProgressBarICS;IIZZ)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     .param p1, "x1"    # I
a=0;//     .param p2, "x2"    # I
a=0;//     .param p3, "x3"    # Z
a=0;//     .param p4, "x4"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v7/internal/widget/ProgressBarICS;->doRefreshProgress(IIZZ)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$102(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;)Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     .param p1, "x1"    # Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized doRefreshProgress(IIZZ)V
a=0;//     .locals 7
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "progress"    # I
a=0;//     .param p3, "fromUser"    # Z
a=0;//     .param p4, "callBackToApp"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 418
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-lez v5, :cond_1
a=0;// 
a=0;//     int-to-float v5, p2
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     div-float v4, v5, v6
a=0;// 
a=0;//     .line 419
a=0;//     .local v4, "scale":F
a=0;//     :goto_0
a=0;//     #v4=(Float);v5=(Integer);v6=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 420
a=0;//     .local v1, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 421
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 423
a=0;//     .local v3, "progressDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v3=(Null);
a=0;//     instance-of v5, v1, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 424
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     check-cast v0, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     move-object v5, v0
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/LayerDrawable;);
a=0;//     invoke-virtual {v5, p1}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Reference,Landroid/graphics/drawable/Drawable;);v5=(Conflicted);
a=0;//     const v5, 0x461c4000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v5, v4
a=0;// 
a=0;//     #v5=(Float);
a=0;//     float-to-int v2, v5
a=0;// 
a=0;//     .line 428
a=0;//     .local v2, "level":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .end local v3    # "progressDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     :goto_1
a=0;//     invoke-virtual {v3, v2}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 432
a=0;//     .end local v2    # "level":I
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 418
a=0;//     .end local v1    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v4    # "scale":F
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .restart local v2    # "level":I
a=0;//     .restart local v3    # "progressDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     .restart local v4    # "scale":F
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/graphics/drawable/Drawable;);v2=(Integer);v3=(Reference,Landroid/graphics/drawable/Drawable;);v4=(Float);v5=(Float);v6=(Conflicted);
a=0;//     move-object v3, v1
a=0;// 
a=0;//     .line 428
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 430
a=0;//     .end local v2    # "level":I
a=0;//     .end local v3    # "progressDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_3
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->invalidate()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 418
a=0;//     .end local v1    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v4    # "scale":F
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method private initProgressBar()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x30
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/16 v2, 0x18
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 242
a=0;//     #v1=(Null);
a=0;//     const/16 v0, 0x64
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     .line 243
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     .line 244
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
a=0;// 
a=0;//     .line 245
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     .line 246
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     .line 247
a=0;//     const/16 v0, 0xfa0
a=0;// 
a=0;//     #v0=(PosShort);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mDuration:I
a=0;// 
a=0;//     .line 248
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mBehavior:I
a=0;// 
a=0;//     .line 249
a=0;//     iput v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinWidth:I
a=0;// 
a=0;//     .line 250
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxWidth:I
a=0;// 
a=0;//     .line 251
a=0;//     iput v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinHeight:I
a=0;// 
a=0;//     .line 252
a=0;//     iput v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I
a=0;// 
a=0;//     .line 253
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private declared-synchronized refreshProgress(IIZ)V
a=0;//     .locals 5
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "progress"    # I
a=0;//     .param p3, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 435
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-wide v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mUiThreadId:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Thread;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Thread;->getId()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     cmp-long v1, v1, v3
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 436
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1, p2, p3, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->doRefreshProgress(IIZZ)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 451
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 439
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Byte);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 441
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;//     .line 443
a=0;//     .local v0, "r":Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;//     .line 444
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->setup(IIZ)V
a=0;// 
a=0;//     .line 449
a=0;//     :goto_1
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->post(Ljava/lang/Runnable;)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 435
a=0;//     .end local v0    # "r":Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 447
a=0;//     :cond_1
a=0;//     :try_start_2
a=0;//     #v0=(Uninit);v2=(LongHi);v3=(LongLo);v4=(LongHi);
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;);
a=0;//     invoke-direct {v0, p0, p1, p2, p3}, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;-><init>(Landroid/support/v7/internal/widget/ProgressBarICS;IIZ)V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .restart local v0    # "r":Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 12
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p2, "clip"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 163
a=0;//     #v10=(One);
a=0;//     instance-of v9, p1, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .line 164
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     check-cast v1, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     .line 165
a=0;//     .local v1, "background":Landroid/graphics/drawable/LayerDrawable;
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/LayerDrawable;->getNumberOfLayers()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 166
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     new-array v6, v0, [Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 168
a=0;//     .local v6, "outDrawables":[Landroid/graphics/drawable/Drawable;
a=0;//     #v6=(Reference,[Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);v4=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     if-ge v3, v0, :cond_2
a=0;// 
a=0;//     .line 169
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 170
a=0;//     .local v4, "id":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const v9, 0x102000d
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eq v4, v9, :cond_0
a=0;// 
a=0;//     const v9, 0x102000f
a=0;// 
a=0;//     if-ne v4, v9, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     move v9, v10
a=0;// 
a=0;//     :goto_1
a=0;//     #v9=(Boolean);
a=0;//     invoke-direct {p0, v11, v9}, Landroid/support/v7/internal/widget/ProgressBarICS;->tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     aput-object v9, v6, v3
a=0;// 
a=0;//     .line 168
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 170
a=0;//     :cond_1
a=0;//     #v9=(Integer);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 174
a=0;//     .end local v4    # "id":I
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);v9=(Conflicted);v11=(Conflicted);
a=0;//     new-instance v5, Landroid/graphics/drawable/LayerDrawable;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/drawable/LayerDrawable;);
a=0;//     invoke-direct {v5, v6}, Landroid/graphics/drawable/LayerDrawable;-><init>([Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 176
a=0;//     .local v5, "newBg":Landroid/graphics/drawable/LayerDrawable;
a=0;//     #v5=(Reference,Landroid/graphics/drawable/LayerDrawable;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     if-ge v3, v0, :cond_6
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/LayerDrawable;->getId(I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v5, v3, v9}, Landroid/graphics/drawable/LayerDrawable;->setId(II)V
a=0;// 
a=0;//     .line 176
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 182
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "background":Landroid/graphics/drawable/LayerDrawable;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v5    # "newBg":Landroid/graphics/drawable/LayerDrawable;
a=0;//     .end local v6    # "outDrawables":[Landroid/graphics/drawable/Drawable;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v9=(Boolean);v11=(Uninit);
a=0;//     instance-of v9, p1, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     if-eqz v9, :cond_7
a=0;// 
a=0;//     .line 183
a=0;//     check-cast p1, Landroid/graphics/drawable/BitmapDrawable;
a=0;// 
a=0;//     .end local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 184
a=0;//     .local v8, "tileBitmap":Landroid/graphics/Bitmap;
a=0;//     #v8=(Reference,Landroid/graphics/Bitmap;);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSampleTile:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-nez v9, :cond_4
a=0;// 
a=0;//     .line 185
a=0;//     iput-object v8, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSampleTile:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .line 188
a=0;//     :cond_4
a=0;//     new-instance v7, Landroid/graphics/drawable/ShapeDrawable;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getDrawableShape()Landroid/graphics/drawable/shapes/Shape;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-direct {v7, v9}, Landroid/graphics/drawable/ShapeDrawable;-><init>(Landroid/graphics/drawable/shapes/Shape;)V
a=0;// 
a=0;//     .line 190
a=0;//     .local v7, "shapeDrawable":Landroid/graphics/drawable/ShapeDrawable;
a=0;//     #v7=(Reference,Landroid/graphics/drawable/ShapeDrawable;);
a=0;//     new-instance v2, Landroid/graphics/BitmapShader;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/BitmapShader;);
a=0;//     sget-object v9, Landroid/graphics/Shader$TileMode;->REPEAT:Landroid/graphics/Shader$TileMode;
a=0;// 
a=0;//     sget-object v11, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/Shader$TileMode;);
a=0;//     invoke-direct {v2, v8, v9, v11}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V
a=0;// 
a=0;//     .line 192
a=0;//     .local v2, "bitmapShader":Landroid/graphics/BitmapShader;
a=0;//     #v2=(Reference,Landroid/graphics/BitmapShader;);
a=0;//     invoke-virtual {v7}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
a=0;// 
a=0;//     .line 194
a=0;//     if-eqz p2, :cond_5
a=0;// 
a=0;//     new-instance v9, Landroid/graphics/drawable/ClipDrawable;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/graphics/drawable/ClipDrawable;);
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-direct {v9, v7, v11, v10}, Landroid/graphics/drawable/ClipDrawable;-><init>(Landroid/graphics/drawable/Drawable;II)V
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/drawable/ClipDrawable;);
a=0;//     move-object v7, v9
a=0;// 
a=0;//     .end local v7    # "shapeDrawable":Landroid/graphics/drawable/ShapeDrawable;
a=0;//     :cond_5
a=0;//     #v11=(Conflicted);
a=0;//     move-object v5, v7
a=0;// 
a=0;//     .line 198
a=0;//     .end local v2    # "bitmapShader":Landroid/graphics/BitmapShader;
a=0;//     .end local v8    # "tileBitmap":Landroid/graphics/Bitmap;
a=0;//     :cond_6
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Ujava/lang/Object;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v5
a=0;// 
a=0;//     .restart local p1    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_7
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Boolean);v11=(Uninit);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private tileifyIndeterminate(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 8
a=0;//     .param p1, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x2710
a=0;// 
a=0;//     .line 212
a=0;//     #v7=(PosShort);
a=0;//     instance-of v5, p1, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .line 213
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     check-cast v1, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     .line 214
a=0;//     .local v1, "background":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->getNumberOfFrames()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 215
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     new-instance v4, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/drawable/AnimationDrawable;);
a=0;//     invoke-direct {v4}, Landroid/graphics/drawable/AnimationDrawable;-><init>()V
a=0;// 
a=0;//     .line 216
a=0;//     .local v4, "newBg":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     #v4=(Reference,Landroid/graphics/drawable/AnimationDrawable;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/AnimationDrawable;->isOneShot()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/graphics/drawable/AnimationDrawable;->setOneShot(Z)V
a=0;// 
a=0;//     .line 218
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Integer);v5=(Integer);v6=(Conflicted);
a=0;//     if-ge v3, v0, :cond_0
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/AnimationDrawable;->getFrame(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-direct {p0, v5, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->tileify(Landroid/graphics/drawable/Drawable;Z)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 220
a=0;//     .local v2, "frame":Landroid/graphics/drawable/Drawable;
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2, v7}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {v1, v3}, Landroid/graphics/drawable/AnimationDrawable;->getDuration(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v2, v5}, Landroid/graphics/drawable/AnimationDrawable;->addFrame(Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 218
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 223
a=0;//     .end local v2    # "frame":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v4, v7}, Landroid/graphics/drawable/AnimationDrawable;->setLevel(I)Z
a=0;// 
a=0;//     .line 224
a=0;//     move-object p1, v4
a=0;// 
a=0;//     .line 226
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "background":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "newBg":Landroid/graphics/drawable/AnimationDrawable;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private updateDrawableBounds(II)V
a=0;//     .locals 13
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .line 732
a=0;//     #v12=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingRight()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-int v10, p1, v10
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     sub-int v7, v10, v11
a=0;// 
a=0;//     .line 733
a=0;//     .local v7, "right":I
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     sub-int v10, p2, v10
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingTop()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     sub-int v0, v10, v11
a=0;// 
a=0;//     .line 734
a=0;//     .local v0, "bottom":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 735
a=0;//     .local v8, "top":I
a=0;//     #v8=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 737
a=0;//     .local v6, "left":I
a=0;//     #v6=(Null);
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v10, :cond_1
a=0;// 
a=0;//     .line 739
a=0;//     iget-boolean v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     instance-of v10, v10, Landroid/graphics/drawable/AnimationDrawable;
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-nez v10, :cond_0
a=0;// 
a=0;//     .line 742
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v10}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 743
a=0;//     .local v5, "intrinsicWidth":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 744
a=0;//     .local v4, "intrinsicHeight":I
a=0;//     #v4=(Integer);
a=0;//     int-to-float v10, v5
a=0;// 
a=0;//     #v10=(Float);
a=0;//     int-to-float v11, v4
a=0;// 
a=0;//     #v11=(Float);
a=0;//     div-float v3, v10, v11
a=0;// 
a=0;//     .line 745
a=0;//     .local v3, "intrinsicAspect":F
a=0;//     #v3=(Float);
a=0;//     int-to-float v10, p1
a=0;// 
a=0;//     int-to-float v11, p2
a=0;// 
a=0;//     div-float v1, v10, v11
a=0;// 
a=0;//     .line 746
a=0;//     .local v1, "boundAspect":F
a=0;//     #v1=(Float);
a=0;//     cmpl-float v10, v3, v1
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 747
a=0;//     cmpl-float v10, v1, v3
a=0;// 
a=0;//     if-lez v10, :cond_3
a=0;// 
a=0;//     .line 749
a=0;//     int-to-float v10, p2
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v10, v3
a=0;// 
a=0;//     float-to-int v9, v10
a=0;// 
a=0;//     .line 750
a=0;//     .local v9, "width":I
a=0;//     #v9=(Integer);
a=0;//     sub-int v10, p1, v9
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     div-int/lit8 v6, v10, 0x2
a=0;// 
a=0;//     .line 751
a=0;//     #v6=(Integer);
a=0;//     add-int v7, v6, v9
a=0;// 
a=0;//     .line 760
a=0;//     .end local v1    # "boundAspect":F
a=0;//     .end local v3    # "intrinsicAspect":F
a=0;//     .end local v4    # "intrinsicHeight":I
a=0;//     .end local v5    # "intrinsicWidth":I
a=0;//     .end local v9    # "width":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);v9=(Conflicted);v11=(Integer);
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v10, v6, v8, v7, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 763
a=0;//     :cond_1
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eqz v10, :cond_2
a=0;// 
a=0;//     .line 764
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v10, v12, v12, v7, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 766
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 754
a=0;//     .restart local v1    # "boundAspect":F
a=0;//     .restart local v3    # "intrinsicAspect":F
a=0;//     .restart local v4    # "intrinsicHeight":I
a=0;//     .restart local v5    # "intrinsicWidth":I
a=0;//     :cond_3
a=0;//     #v1=(Float);v2=(Uninit);v3=(Float);v4=(Integer);v5=(Integer);v6=(Null);v8=(Null);v9=(Uninit);v10=(Byte);v11=(Float);
a=0;//     int-to-float v10, p1
a=0;// 
a=0;//     #v10=(Float);
a=0;//     const/high16 v11, 0x3f800000
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     div-float/2addr v11, v3
a=0;// 
a=0;//     #v11=(Float);
a=0;//     mul-float/2addr v10, v11
a=0;// 
a=0;//     float-to-int v2, v10
a=0;// 
a=0;//     .line 755
a=0;//     .local v2, "height":I
a=0;//     #v2=(Integer);
a=0;//     sub-int v10, p2, v2
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     div-int/lit8 v8, v10, 0x2
a=0;// 
a=0;//     .line 756
a=0;//     #v8=(Integer);
a=0;//     add-int v0, v8, v2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateDrawableState()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 827
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 829
a=0;//     .local v0, "state":[I
a=0;//     #v0=(Reference,[I);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 830
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 833
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 834
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 836
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected drawableStateChanged()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 822
a=0;//     invoke-super {p0}, Landroid/view/View;->drawableStateChanged()V
a=0;// 
a=0;//     .line 823
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableState()V
a=0;// 
a=0;//     .line 824
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method getDrawableShape()Landroid/graphics/drawable/shapes/Shape;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 202
a=0;//     #v2=(Null);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-array v0, v1, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "roundedCorners":[F
a=0;//     new-instance v1, Landroid/graphics/drawable/shapes/RoundRectShape;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     invoke-direct {v1, v0, v2, v2}, Landroid/graphics/drawable/shapes/RoundRectShape;-><init>([FLandroid/graphics/RectF;[F)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/shapes/RoundRectShape;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 202
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x40a00000
a=0;//         0x40a00000
a=0;//         0x40a00000
a=0;//         0x40a00000
a=0;//         0x40a00000
a=0;//         0x40a00000
a=0;//         0x40a00000
a=0;//         0x40a00000
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public getIndeterminateDrawable()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getInterpolator()Landroid/view/animation/Interpolator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 676
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized getMax()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 560
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized getProgress()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getProgressDrawable()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized getSecondaryProgress()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 547
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized incrementProgressBy(I)V
a=0;//     .locals 1
a=0;//     .param p1, "diff"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 595
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(I)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 596
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 595
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized incrementSecondaryProgressBy(I)V
a=0;//     .locals 1
a=0;//     .param p1, "diff"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/2addr v0, p1
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->setSecondaryProgress(I)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 607
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 606
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 7
a=0;//     .param p1, "dr"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 711
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInDrawing:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 712
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ProgressBarICS;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 713
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 714
a=0;//     .local v0, "dirty":Landroid/graphics/Rect;
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getScrollX()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v1, v3, v4
a=0;// 
a=0;//     .line 715
a=0;//     .local v1, "scrollX":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getScrollY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int v2, v3, v4
a=0;// 
a=0;//     .line 717
a=0;//     .local v2, "scrollY":I
a=0;//     #v2=(Integer);
a=0;//     iget v3, v0, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     add-int/2addr v3, v1
a=0;// 
a=0;//     iget v4, v0, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     add-int/2addr v4, v2
a=0;// 
a=0;//     iget v5, v0, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v1
a=0;// 
a=0;//     iget v6, v0, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v6, v2
a=0;// 
a=0;//     invoke-virtual {p0, v3, v4, v5, v6}, Landroid/support/v7/internal/widget/ProgressBarICS;->invalidate(IIII)V
a=0;// 
a=0;//     .line 723
a=0;//     .end local v0    # "dirty":Landroid/graphics/Rect;
a=0;//     .end local v1    # "scrollX":I
a=0;//     .end local v2    # "scrollY":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 720
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->invalidateDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized isIndeterminate()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 900
a=0;//     invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 901
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 902
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->startAnimation()V
a=0;// 
a=0;//     .line 904
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 908
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 909
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->stopAnimation()V
a=0;// 
a=0;//     .line 911
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 912
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mRefreshProgressRunnable:Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 917
a=0;//     :cond_1
a=0;//     invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 918
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected declared-synchronized onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 10
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const-wide/16 v8, 0xc8
a=0;// 
a=0;//     .line 770
a=0;//     #v8=(LongLo);v9=(LongHi);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 772
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 773
a=0;//     .local v0, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 776
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     .line 777
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 778
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getDrawingTime()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     .line 779
a=0;//     .local v2, "time":J
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 780
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/animation/Transformation;);
a=0;//     invoke-virtual {v4, v2, v3, v5}, Landroid/view/animation/AlphaAnimation;->getTransformation(JLandroid/view/animation/Transformation;)Z
a=0;// 
a=0;//     .line 781
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/animation/Transformation;->getAlpha()F
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_1
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 783
a=0;//     .local v1, "scale":F
a=0;//     #v1=(Float);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInDrawing:Z
a=0;// 
a=0;//     .line 784
a=0;//     const v4, 0x461c4000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable;->setLevel(I)Z
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 786
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_2
a=0;//     #v4=(Null);
a=0;//     iput-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInDrawing:Z
a=0;// 
a=0;//     .line 788
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     iget-wide v6, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mLastDrawTime:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     sub-long/2addr v4, v6
a=0;// 
a=0;//     cmp-long v4, v4, v8
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ltz v4, :cond_0
a=0;// 
a=0;//     .line 789
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);
a=0;//     iput-wide v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mLastDrawTime:J
a=0;// 
a=0;//     .line 790
a=0;//     const-wide/16 v4, 0xc8
a=0;// 
a=0;//     invoke-virtual {p0, v4, v5}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidateDelayed(J)V
a=0;// 
a=0;//     .line 793
a=0;//     .end local v1    # "scale":F
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 794
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
a=0;// 
a=0;//     .line 795
a=0;//     iget-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mShouldStartAnimationDrawable:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     instance-of v4, v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 796
a=0;//     check-cast v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     .end local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V
a=0;// 
a=0;//     .line 797
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-boolean v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mShouldStartAnimationDrawable:Z
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 800
a=0;//     .end local v2    # "time":J
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 786
a=0;//     .restart local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .restart local v1    # "scale":F
a=0;//     .restart local v2    # "time":J
a=0;//     :catchall_0
a=0;//     #v1=(Float);v2=(LongLo);v3=(LongHi);v4=(Integer);v5=(Reference,Landroid/view/animation/Transformation;);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :try_start_3
a=0;//     #v5=(Null);
a=0;//     iput-boolean v5, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInDrawing:Z
a=0;// 
a=0;//     throw v4
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     .line 770
a=0;//     .end local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v1    # "scale":F
a=0;//     .end local v2    # "time":J
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v4
a=0;// .end method
a=0;// 
a=0;// .method protected declared-synchronized onMeasure(II)V
a=0;//     .locals 6
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 804
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 806
a=0;//     .local v0, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 807
a=0;//     .local v2, "dw":I
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 808
a=0;//     .local v1, "dh":I
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 809
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinWidth:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxWidth:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 810
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMinHeight:I
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 812
a=0;//     :cond_0
a=0;//     #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableState()V
a=0;// 
a=0;//     .line 813
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingRight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     .line 814
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     add-int/2addr v1, v3
a=0;// 
a=0;//     .line 816
a=0;//     invoke-static {v2, p1}, Landroid/support/v7/internal/widget/ProgressBarICS;->resolveSize(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-static {v1, p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->resolveSize(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {p0, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setMeasuredDimension(II)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 818
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 804
a=0;//     .end local v0    # "d":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v1    # "dh":I
a=0;//     .end local v2    # "dw":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 2
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 891
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;
a=0;// 
a=0;//     .line 892
a=0;//     .local v0, "ss":Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 894
a=0;//     iget v1, v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->progress:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(I)V
a=0;// 
a=0;//     .line 895
a=0;//     iget v1, v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->secondaryProgress:I
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setSecondaryProgress(I)V
a=0;// 
a=0;//     .line 896
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 880
a=0;//     invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 881
a=0;//     .local v1, "superState":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 883
a=0;//     .local v0, "ss":Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->progress:I
a=0;// 
a=0;//     .line 884
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ProgressBarICS$SavedState;->secondaryProgress:I
a=0;// 
a=0;//     .line 886
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 0
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;//     .param p3, "oldw"    # I
a=0;//     .param p4, "oldh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 727
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableBounds(II)V
a=0;// 
a=0;//     .line 728
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onVisibilityChanged(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;//     .param p1, "changedView"    # Landroid/view/View;
a=0;//     .param p2, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 697
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/View;->onVisibilityChanged(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 699
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 701
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p2, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     if-ne p2, v0, :cond_2
a=0;// 
a=0;//     .line 702
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->stopAnimation()V
a=0;// 
a=0;//     .line 707
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 704
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->startAnimation()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public postInvalidate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 385
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mNoInvalidate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 386
a=0;//     invoke-super {p0}, Landroid/view/View;->postInvalidate()V
a=0;// 
a=0;//     .line 388
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized setIndeterminate(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "indeterminate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mOnlyIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     .line 276
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     .line 278
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 281
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->startAnimation()V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 287
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 283
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->stopAnimation()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 275
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 313
a=0;//     invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 315
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 316
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 317
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 318
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V
a=0;// 
a=0;//     .line 320
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/content/Context;I)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "resID"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 657
a=0;//     invoke-static {p1, p2}, Landroid/view/animation/AnimationUtils;->loadInterpolator(Landroid/content/Context;I)Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 658
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;//     .locals 0
a=0;//     .param p1, "interpolator"    # Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .prologue
a=0;//     .line 667
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 668
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized setMax(I)V
a=0;//     .locals 3
a=0;//     .param p1, "max"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 573
a=0;//     monitor-enter p0
a=0;// 
a=0;//     if-gez p1, :cond_0
a=0;// 
a=0;//     .line 574
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 576
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     .line 577
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     .line 578
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V
a=0;// 
a=0;//     .line 580
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     if-le v0, p1, :cond_1
a=0;// 
a=0;//     .line 581
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     .line 583
a=0;//     :cond_1
a=0;//     const v0, 0x102000d
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, v0, v1, v2}, Landroid/support/v7/internal/widget/ProgressBarICS;->refreshProgress(IIZ)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 585
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 573
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized setProgress(I)V
a=0;//     .locals 1
a=0;//     .param p1, "progress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 465
a=0;//     monitor-enter p0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(IZ)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 466
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 465
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method declared-synchronized setProgress(IZ)V
a=0;//     .locals 2
a=0;//     .param p1, "progress"    # I
a=0;//     .param p2, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 469
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 485
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 473
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     if-gez p1, :cond_2
a=0;// 
a=0;//     .line 474
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 477
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p1, v0, :cond_3
a=0;// 
a=0;//     .line 478
a=0;//     iget p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     .line 481
a=0;//     :cond_3
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 482
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     .line 483
a=0;//     const v0, 0x102000d
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v1, p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->refreshProgress(IIZ)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 469
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setProgressDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 5
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 346
a=0;//     #v4=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eq p1, v2, :cond_3
a=0;// 
a=0;//     .line 347
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 348
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 353
a=0;//     .local v1, "needUpdate":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v3=(Conflicted);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 354
a=0;//     invoke-virtual {p1, p0}, Landroid/graphics/drawable/Drawable;->setCallback(Landroid/graphics/drawable/Drawable$Callback;)V
a=0;// 
a=0;//     .line 357
a=0;//     invoke-virtual {p1}, Landroid/graphics/drawable/Drawable;->getMinimumHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 358
a=0;//     .local v0, "drawableHeight":I
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     .line 359
a=0;//     iput v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMaxHeight:I
a=0;// 
a=0;//     .line 360
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->requestLayout()V
a=0;// 
a=0;//     .line 363
a=0;//     .end local v0    # "drawableHeight":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 364
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 365
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mCurrentDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 366
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V
a=0;// 
a=0;//     .line 369
a=0;//     :cond_1
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 370
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0, v2, v3}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableBounds(II)V
a=0;// 
a=0;//     .line 371
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->updateDrawableState()V
a=0;// 
a=0;//     .line 372
a=0;//     const v2, 0x102000d
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgress:I
a=0;// 
a=0;//     invoke-direct {p0, v2, v3, v4, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->doRefreshProgress(IIZZ)V
a=0;// 
a=0;//     .line 373
a=0;//     const v2, 0x102000f
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
a=0;// 
a=0;//     invoke-direct {p0, v2, v3, v4, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->doRefreshProgress(IIZZ)V
a=0;// 
a=0;//     .line 375
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 350
a=0;//     .end local v1    # "needUpdate":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Landroid/graphics/drawable/Drawable;);v3=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .restart local v1    # "needUpdate":Z
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public declared-synchronized setSecondaryProgress(I)V
a=0;//     .locals 3
a=0;//     .param p1, "secondaryProgress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 516
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 504
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     if-gez p1, :cond_2
a=0;// 
a=0;//     .line 505
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 508
a=0;//     :cond_2
a=0;//     :try_start_1
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le p1, v0, :cond_3
a=0;// 
a=0;//     .line 509
a=0;//     iget p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mMax:I
a=0;// 
a=0;//     .line 512
a=0;//     :cond_3
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 513
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
a=0;// 
a=0;//     .line 514
a=0;//     const v0, 0x102000f
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mSecondaryProgress:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, v0, v1, v2}, Landroid/support/v7/internal/widget/ProgressBarICS;->refreshProgress(IIZ)V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 500
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setVisibility(I)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 681
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p1, :cond_1
a=0;// 
a=0;//     .line 682
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 684
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminate:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 686
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 687
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->stopAnimation()V
a=0;// 
a=0;//     .line 693
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 689
a=0;//     :cond_2
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->startAnimation()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method startAnimation()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 634
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 617
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     instance-of v0, v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 618
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mShouldStartAnimationDrawable:Z
a=0;// 
a=0;//     .line 619
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     .line 633
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 621
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 622
a=0;//     new-instance v0, Landroid/view/animation/LinearInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/LinearInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/LinearInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/LinearInterpolator;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 625
a=0;//     :cond_2
a=0;//     new-instance v0, Landroid/view/animation/Transformation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/Transformation;);
a=0;//     invoke-direct {v0}, Landroid/view/animation/Transformation;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Transformation;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .line 626
a=0;//     new-instance v0, Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/animation/AlphaAnimation;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v2, 0x3f800000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/AlphaAnimation;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     .line 627
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mBehavior:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatMode(I)V
a=0;// 
a=0;//     .line 628
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setRepeatCount(I)V
a=0;// 
a=0;//     .line 629
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mDuration:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
a=0;// 
a=0;//     .line 630
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 631
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     const-wide/16 v1, -0x1
a=0;// 
a=0;//     #v1=(LongLo);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setStartTime(J)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method stopAnimation()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 640
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mAnimation:Landroid/view/animation/AlphaAnimation;
a=0;// 
a=0;//     .line 641
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mTransformation:Landroid/view/animation/Transformation;
a=0;// 
a=0;//     .line 642
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     instance-of v0, v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 643
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     check-cast v0, Landroid/graphics/drawable/Animatable;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V
a=0;// 
a=0;//     .line 644
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mShouldStartAnimationDrawable:Z
a=0;// 
a=0;//     .line 646
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->postInvalidate()V
a=0;// 
a=0;//     .line 647
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;//     .locals 1
a=0;//     .param p1, "who"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 379
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mProgressDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS;->mIndeterminateDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/View;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
