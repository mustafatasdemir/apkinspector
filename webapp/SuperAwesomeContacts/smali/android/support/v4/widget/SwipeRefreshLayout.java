package android.support.v4.widget; class SwipeRefreshLayout { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "SwipeRefreshLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/SwipeRefreshLayout$BaseAnimationListener;,
a=0;//         Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ACCELERATE_INTERPOLATION_FACTOR:F = 1.5f
a=0;// 
a=0;// .field private static final DECELERATE_INTERPOLATION_FACTOR:F = 2.0f
a=0;// 
a=0;// .field private static final INVALID_POINTER:I = -0x1
a=0;// 
a=0;// .field private static final LAYOUT_ATTRS:[I
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;// .field private static final MAX_SWIPE_DISTANCE_FACTOR:F = 0.6f
a=0;// 
a=0;// .field private static final PROGRESS_BAR_HEIGHT:F = 4.0f
a=0;// 
a=0;// .field private static final REFRESH_TRIGGER_DISTANCE:I = 0x78
a=0;// 
a=0;// .field private static final RETURN_TO_ORIGINAL_POSITION_TIMEOUT:J = 0x12cL
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mAccelerateInterpolator:Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;// .field private mActivePointerId:I
a=0;// 
a=0;// .field private final mAnimateToStartPosition:Landroid/view/animation/Animation;
a=0;// 
a=0;// .field private final mCancel:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mCurrPercentage:F
a=0;// 
a=0;// .field private mCurrentTargetOffsetTop:I
a=0;// 
a=0;// .field private final mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;// .field private mDistanceToTriggerSync:F
a=0;// 
a=0;// .field private mFrom:I
a=0;// 
a=0;// .field private mFromPercentage:F
a=0;// 
a=0;// .field private mInitialMotionY:F
a=0;// 
a=0;// .field private mIsBeingDragged:Z
a=0;// 
a=0;// .field private mLastMotionY:F
a=0;// 
a=0;// .field private mListener:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
a=0;// 
a=0;// .field private mMediumAnimationDuration:I
a=0;// 
a=0;// .field private mOriginalOffsetTop:I
a=0;// 
a=0;// .field private mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;// .field private mProgressBarHeight:I
a=0;// 
a=0;// .field private mRefreshing:Z
a=0;// 
a=0;// .field private final mReturnToStartPosition:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private final mReturnToStartPositionListener:Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;// .field private mReturningToStart:Z
a=0;// 
a=0;// .field private final mShrinkAnimationListener:Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;// .field private mShrinkTrigger:Landroid/view/animation/Animation;
a=0;// 
a=0;// .field private mTarget:Landroid/view/View;
a=0;// 
a=0;// .field private mTouchSlop:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     const-class v0, Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     .line 95
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x101000e
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/widget/SwipeRefreshLayout;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 178
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 186
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout;);
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
a=0;// 
a=0;//     .line 78
a=0;//     const/high16 v2, -0x40800000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F
a=0;// 
a=0;//     .line 80
a=0;//     iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFromPercentage:F
a=0;// 
a=0;//     .line 81
a=0;//     iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     .line 88
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$1;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SwipeRefreshLayout$1;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$1;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$1;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 115
a=0;//     new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$2;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SwipeRefreshLayout$2;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$2;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$2;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mShrinkTrigger:Landroid/view/animation/Animation;
a=0;// 
a=0;//     .line 123
a=0;//     new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$3;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SwipeRefreshLayout$3;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$3;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$3;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPositionListener:Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     .line 132
a=0;//     new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$4;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SwipeRefreshLayout$4;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$4;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$4;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mShrinkAnimationListener:Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     .line 139
a=0;//     new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$5;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SwipeRefreshLayout$5;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$5;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$5;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPosition:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 151
a=0;//     new-instance v2, Landroid/support/v4/widget/SwipeRefreshLayout$6;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SwipeRefreshLayout$6;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeRefreshLayout$6;-><init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$6;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 188
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTouchSlop:I
a=0;// 
a=0;//     .line 190
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     const v3, 0x10e0001
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getInteger(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mMediumAnimationDuration:I
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/widget/SwipeRefreshLayout;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 194
a=0;//     new-instance v2, Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/SwipeProgressBar;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 196
a=0;//     .local v1, "metrics":Landroid/util/DisplayMetrics;
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v2, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v3, 0x40800000
a=0;// 
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBarHeight:I
a=0;// 
a=0;//     .line 197
a=0;//     new-instance v2, Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     invoke-direct {v2, v3}, Landroid/view/animation/DecelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     .line 198
a=0;//     new-instance v2, Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     const/high16 v3, 0x3fc00000
a=0;// 
a=0;//     invoke-direct {v2, v3}, Landroid/view/animation/AccelerateInterpolator;-><init>(F)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAccelerateInterpolator:Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     .line 200
a=0;//     sget-object v2, Landroid/support/v4/widget/SwipeRefreshLayout;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 201
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v4, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->setEnabled(Z)V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 203
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFrom:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1000(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation$AnimationListener;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPositionListener:Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation$AnimationListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1100(Landroid/support/v4/widget/SwipeRefreshLayout;ILandroid/view/animation/Animation$AnimationListener;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;//     .param p1, "x1"    # I
a=0;//     .param p2, "x2"    # Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/SwipeRefreshLayout;->animateOffsetToStartPosition(ILandroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1200(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mMediumAnimationDuration:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1300(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mShrinkTrigger:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1400(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/Animation$AnimationListener;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mShrinkAnimationListener:Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation$AnimationListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1500(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/animation/DecelerateInterpolator;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/widget/SwipeRefreshLayout;I)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;//     .param p1, "x1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v4/widget/SwipeRefreshLayout;)F
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFromPercentage:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$402(Landroid/support/v4/widget/SwipeRefreshLayout;F)F
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;//     .param p1, "x1"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFromPercentage:F
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/support/v4/widget/SwipeProgressBar;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Landroid/support/v4/widget/SwipeRefreshLayout;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$702(Landroid/support/v4/widget/SwipeRefreshLayout;I)I
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;//     .param p1, "x1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$800(Landroid/support/v4/widget/SwipeRefreshLayout;)F
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$802(Landroid/support/v4/widget/SwipeRefreshLayout;F)F
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;//     .param p1, "x1"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$902(Landroid/support/v4/widget/SwipeRefreshLayout;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SwipeRefreshLayout;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method private animateOffsetToStartPosition(ILandroid/view/animation/Animation$AnimationListener;)V
a=0;//     .locals 3
a=0;//     .param p1, "from"    # I
a=0;//     .param p2, "listener"    # Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mFrom:I
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {v0}, Landroid/view/animation/Animation;->reset()V
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mMediumAnimationDuration:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-long v1, v1
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/animation/Animation;->setDuration(J)V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Landroid/view/animation/Animation;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDecelerateInterpolator:Landroid/view/animation/DecelerateInterpolator;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/animation/DecelerateInterpolator;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/animation/Animation;->setInterpolator(Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAnimateToStartPosition:Landroid/view/animation/Animation;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 226
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ensureTarget()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 307
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-le v1, v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isInEditMode()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 308
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "SwipeRefreshLayout can host only one direct child"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 311
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     .line 312
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mOriginalOffsetTop:I
a=0;// 
a=0;//     .line 314
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, -0x40800000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v1, v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 315
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 316
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 317
a=0;//     .local v0, "metrics":Landroid/util/DisplayMetrics;
a=0;//     #v0=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const v2, 0x3f19999a
a=0;// 
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     const/high16 v2, 0x42f00000
a=0;// 
a=0;//     iget v3, v0, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F
a=0;// 
a=0;//     .line 322
a=0;//     .end local v0    # "metrics":Landroid/util/DisplayMetrics;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;//     .locals 4
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 554
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 555
a=0;//     .local v2, "pointerIndex":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 556
a=0;//     .local v1, "pointerId":I
a=0;//     #v1=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     .line 559
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 560
a=0;//     .local v0, "newPointerIndex":I
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F
a=0;// 
a=0;//     .line 561
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     .line 563
a=0;//     .end local v0    # "newPointerIndex":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 559
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setTargetOffsetTopAndBottom(I)V
a=0;//     .locals 1
a=0;//     .param p1, "offset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 544
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->offsetTopAndBottom(I)V
a=0;// 
a=0;//     .line 545
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
a=0;// 
a=0;//     .line 546
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setTriggerPercentage(F)V
a=0;//     .locals 2
a=0;//     .param p1, "percent"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 237
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, p1, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 240
a=0;//     iput v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     .line 245
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 243
a=0;//     :cond_0
a=0;//     #v0=(Byte);
a=0;//     iput p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     .line 244
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/SwipeProgressBar;->setTriggerPercentage(F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private startRefresh()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 527
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 528
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPosition:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     .line 529
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->setRefreshing(Z)V
a=0;// 
a=0;//     .line 530
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mListener:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;);
a=0;//     invoke-interface {v0}, Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;->onRefresh()V
a=0;// 
a=0;//     .line 531
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateContentOffsetTop(I)V
a=0;//     .locals 3
a=0;//     .param p1, "targetTop"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 534
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 535
a=0;//     .local v0, "currentTop":I
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     cmpl-float v1, v1, v2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 536
a=0;//     iget v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int p1, v1
a=0;// 
a=0;//     .line 540
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     sub-int v1, p1, v0
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTargetOffsetTopAndBottom(I)V
a=0;// 
a=0;//     .line 541
a=0;//     return-void
a=0;// 
a=0;//     .line 537
a=0;//     :cond_1
a=0;//     #v1=(Byte);
a=0;//     if-gez p1, :cond_0
a=0;// 
a=0;//     .line 538
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     #p1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updatePositionTimeout()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 549
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 550
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;
a=0;// 
a=0;//     const-wide/16 v1, 0x12c
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-virtual {p0, v0, v1, v2}, Landroid/support/v4/widget/SwipeRefreshLayout;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 551
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public canChildScrollUp()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 368
a=0;//     #v2=(Null);
a=0;//     sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0xe
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ge v3, v4, :cond_3
a=0;// 
a=0;//     .line 369
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     instance-of v3, v3, Landroid/widget/AbsListView;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 370
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/widget/AbsListView;
a=0;// 
a=0;//     .line 371
a=0;//     .local v0, "absListView":Landroid/widget/AbsListView;
a=0;//     invoke-virtual {v0}, Landroid/widget/AbsListView;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/AbsListView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-gtz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/widget/AbsListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/widget/AbsListView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v3, v4, :cond_1
a=0;// 
a=0;//     .line 378
a=0;//     .end local v0    # "absListView":Landroid/widget/AbsListView;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Byte);
a=0;//     return v1
a=0;// 
a=0;//     .restart local v0    # "absListView":Landroid/widget/AbsListView;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/widget/AbsListView;);v1=(One);v2=(Null);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 371
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 375
a=0;//     .end local v0    # "absListView":Landroid/widget/AbsListView;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(One);v3=(Boolean);v4=(PosByte);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 378
a=0;//     :cond_3
a=0;//     #v1=(One);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-static {v1, v2}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 1
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 327
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/SwipeProgressBar;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 328
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isRefreshing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 208
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPosition:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 215
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturnToStartPosition:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 217
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 8
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 384
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V
a=0;// 
a=0;//     .line 386
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 388
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 389
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
a=0;// 
a=0;//     .line 392
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
a=0;// 
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->canChildScrollUp()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 437
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v6=(Reference,Ljava/lang/String;);
a=0;//     return v4
a=0;// 
a=0;//     .line 397
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Boolean);v6=(Null);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 437
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Byte);v5=(Integer);
a=0;//     iget-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 399
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Boolean);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F
a=0;// 
a=0;//     iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F
a=0;// 
a=0;//     .line 400
a=0;//     invoke-static {p1, v4}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     .line 401
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 402
a=0;//     iput v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 406
a=0;//     :pswitch_2
a=0;//     #v5=(Boolean);
a=0;//     iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v7, :cond_4
a=0;// 
a=0;//     .line 407
a=0;//     sget-object v5, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "Got ACTION_MOVE event but don\'t have an active pointer id."
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 411
a=0;//     :cond_4
a=0;//     #v5=(Integer);v6=(Null);
a=0;//     iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 412
a=0;//     .local v1, "pointerIndex":I
a=0;//     #v1=(Integer);
a=0;//     if-gez v1, :cond_5
a=0;// 
a=0;//     .line 413
a=0;//     sget-object v5, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     const-string v6, "Got ACTION_MOVE event but have an invalid active pointer id."
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 417
a=0;//     :cond_5
a=0;//     #v5=(Integer);v6=(Null);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 418
a=0;//     .local v2, "y":F
a=0;//     #v2=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-float v3, v2, v4
a=0;// 
a=0;//     .line 419
a=0;//     .local v3, "yDiff":F
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTouchSlop:I
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpl-float v4, v3, v4
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_3
a=0;// 
a=0;//     .line 420
a=0;//     iput v2, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F
a=0;// 
a=0;//     .line 421
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 426
a=0;//     .end local v1    # "pointerIndex":I
a=0;//     .end local v2    # "y":F
a=0;//     .end local v3    # "yDiff":F
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Boolean);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 431
a=0;//     :pswitch_4
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 432
a=0;//     iput v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     .line 433
a=0;//     iput v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 397
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_4
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 10
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "right"    # I
a=0;//     .param p5, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 332
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 333
a=0;//     .local v6, "width":I
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 334
a=0;//     .local v5, "height":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     iget v8, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBarHeight:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v9, v9, v6, v8}, Landroid/support/v4/widget/SwipeProgressBar;->setBounds(IIII)V
a=0;// 
a=0;//     .line 335
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 344
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 338
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     invoke-virtual {p0, v9}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 339
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 340
a=0;//     .local v2, "childLeft":I
a=0;//     #v2=(Integer);
a=0;//     iget v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrentTargetOffsetTop:I
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     add-int v3, v7, v8
a=0;// 
a=0;//     .line 341
a=0;//     .local v3, "childTop":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     sub-int v7, v6, v7
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     sub-int v4, v7, v8
a=0;// 
a=0;//     .line 342
a=0;//     .local v4, "childWidth":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     sub-int v7, v5, v7
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     sub-int v1, v7, v8
a=0;// 
a=0;//     .line 343
a=0;//     .local v1, "childHeight":I
a=0;//     #v1=(Integer);
a=0;//     add-int v7, v2, v4
a=0;// 
a=0;//     add-int v8, v3, v1
a=0;// 
a=0;//     invoke-virtual {v0, v2, v3, v7, v8}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onMeasure(II)V
a=0;//     .locals 5
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v4, 0x40000000
a=0;// 
a=0;//     .line 348
a=0;//     #v4=(Integer);
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onMeasure(II)V
a=0;// 
a=0;//     .line 349
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isInEditMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "SwipeRefreshLayout can host only one direct child"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 352
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 353
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     invoke-static {v1, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 361
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 9
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 447
a=0;//     #v5=(Null);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 449
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 450
a=0;//     iput-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
a=0;// 
a=0;//     .line 453
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->isEnabled()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     iget-boolean v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mReturningToStart:Z
a=0;// 
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->canChildScrollUp()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 523
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 458
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(One);v7=(Boolean);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Integer);
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 523
a=0;//     #v5=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 460
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v7=(Boolean);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     iput v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F
a=0;// 
a=0;//     iput v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F
a=0;// 
a=0;//     .line 461
a=0;//     invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     .line 462
a=0;//     iput-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 463
a=0;//     iput v8, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 467
a=0;//     :pswitch_2
a=0;//     #v7=(Boolean);
a=0;//     iget v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {p1, v7}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 468
a=0;//     .local v2, "pointerIndex":I
a=0;//     #v2=(Integer);
a=0;//     if-gez v2, :cond_4
a=0;// 
a=0;//     .line 469
a=0;//     sget-object v6, Landroid/support/v4/widget/SwipeRefreshLayout;->LOG_TAG:Ljava/lang/String;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "Got ACTION_MOVE event but have an invalid active pointer id."
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 473
a=0;//     :cond_4
a=0;//     #v6=(One);v7=(Integer);
a=0;//     invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 474
a=0;//     .local v3, "y":F
a=0;//     #v3=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mInitialMotionY:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-float v4, v3, v5
a=0;// 
a=0;//     .line 476
a=0;//     .local v4, "yDiff":F
a=0;//     #v4=(Float);
a=0;//     iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_5
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTouchSlop:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     cmpl-float v5, v4, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-lez v5, :cond_5
a=0;// 
a=0;//     .line 477
a=0;//     iput-boolean v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 480
a=0;//     :cond_5
a=0;//     iget-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 482
a=0;//     iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     cmpl-float v5, v4, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-lez v5, :cond_6
a=0;// 
a=0;//     .line 484
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->startRefresh()V
a=0;// 
a=0;//     .line 500
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);
a=0;//     iput v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 487
a=0;//     :cond_6
a=0;//     #v5=(Byte);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mAccelerateInterpolator:Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     iget v7, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mDistanceToTriggerSync:F
a=0;// 
a=0;//     div-float v7, v4, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-virtual {v5, v7}, Landroid/view/animation/AccelerateInterpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-direct {p0, v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->setTriggerPercentage(F)V
a=0;// 
a=0;//     .line 490
a=0;//     float-to-int v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {p0, v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->updateContentOffsetTop(I)V
a=0;// 
a=0;//     .line 491
a=0;//     iget v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F
a=0;// 
a=0;//     cmpl-float v5, v5, v3
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-lez v5, :cond_7
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v5, v7, :cond_7
a=0;// 
a=0;//     .line 495
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCancel:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 497
a=0;//     :cond_7
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->updatePositionTimeout()V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 505
a=0;//     .end local v2    # "pointerIndex":I
a=0;//     .end local v3    # "y":F
a=0;//     .end local v4    # "yDiff":F
a=0;//     :pswitch_3
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v7=(Boolean);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 506
a=0;//     .local v1, "index":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mLastMotionY:F
a=0;// 
a=0;//     .line 507
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 512
a=0;//     .end local v1    # "index":I
a=0;//     :pswitch_4
a=0;//     #v1=(Uninit);v5=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SwipeRefreshLayout;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 517
a=0;//     :pswitch_5
a=0;//     iput-boolean v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 518
a=0;//     iput v8, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     .line 519
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     iput v6, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mActivePointerId:I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 458
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_5
a=0;//         :pswitch_2
a=0;//         :pswitch_5
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public requestDisallowInterceptTouchEvent(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "b"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 443
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setColorScheme(IIII)V
a=0;//     .locals 0
a=0;//     .param p1, "colorRes1"    # I
a=0;//     .param p2, "colorRes2"    # I
a=0;//     .param p3, "colorRes3"    # I
a=0;//     .param p4, "colorRes4"    # I
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 271
a=0;//     invoke-virtual {p0, p1, p2, p3, p4}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorSchemeResources(IIII)V
a=0;// 
a=0;//     .line 272
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setColorSchemeColors(IIII)V
a=0;//     .locals 1
a=0;//     .param p1, "color1"    # I
a=0;//     .param p2, "color2"    # I
a=0;//     .param p3, "color3"    # I
a=0;//     .param p4, "color4"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Landroid/support/v4/widget/SwipeProgressBar;->setColorScheme(IIII)V
a=0;// 
a=0;//     .line 294
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setColorSchemeResources(IIII)V
a=0;//     .locals 5
a=0;//     .param p1, "colorRes1"    # I
a=0;//     .param p2, "colorRes2"    # I
a=0;//     .param p3, "colorRes3"    # I
a=0;//     .param p4, "colorRes4"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 282
a=0;//     .local v0, "res":Landroid/content/res/Resources;
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p2}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v1, v2, v3, v4}, Landroid/support/v4/widget/SwipeRefreshLayout;->setColorSchemeColors(IIII)V
a=0;// 
a=0;//     .line 284
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnRefreshListener(Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mListener:Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;
a=0;// 
a=0;//     .line 234
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setRefreshing(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "refreshing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 255
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SwipeRefreshLayout;->ensureTarget()V
a=0;// 
a=0;//     .line 256
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mCurrPercentage:F
a=0;// 
a=0;//     .line 257
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
a=0;// 
a=0;//     .line 258
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mRefreshing:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SwipeProgressBar;->start()V
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 261
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SwipeRefreshLayout;->mProgressBar:Landroid/support/v4/widget/SwipeProgressBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SwipeProgressBar;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SwipeProgressBar;->stop()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
