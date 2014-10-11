package android.support.v4.view; class ViewPager { void a() { int a;
a=0;// .class public Landroid/support/v4/view/ViewPager;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "ViewPager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/ViewPager$ViewPositionComparator;,
a=0;//         Landroid/support/v4/view/ViewPager$LayoutParams;,
a=0;//         Landroid/support/v4/view/ViewPager$PagerObserver;,
a=0;//         Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;,
a=0;//         Landroid/support/v4/view/ViewPager$SavedState;,
a=0;//         Landroid/support/v4/view/ViewPager$Decor;,
a=0;//         Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;,
a=0;//         Landroid/support/v4/view/ViewPager$PageTransformer;,
a=0;//         Landroid/support/v4/view/ViewPager$SimpleOnPageChangeListener;,
a=0;//         Landroid/support/v4/view/ViewPager$OnPageChangeListener;,
a=0;//         Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CLOSE_ENOUGH:I = 0x2
a=0;// 
a=0;// .field private static final COMPARATOR:Ljava/util/Comparator;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Comparator",
a=0;//             "<",
a=0;//             "Landroid/support/v4/view/ViewPager$ItemInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field private static final DEFAULT_GUTTER_SIZE:I = 0x10
a=0;// 
a=0;// .field private static final DEFAULT_OFFSCREEN_PAGES:I = 0x1
a=0;// 
a=0;// .field private static final DRAW_ORDER_DEFAULT:I = 0x0
a=0;// 
a=0;// .field private static final DRAW_ORDER_FORWARD:I = 0x1
a=0;// 
a=0;// .field private static final DRAW_ORDER_REVERSE:I = 0x2
a=0;// 
a=0;// .field private static final INVALID_POINTER:I = -0x1
a=0;// 
a=0;// .field private static final LAYOUT_ATTRS:[I
a=0;// 
a=0;// .field private static final MAX_SETTLE_DURATION:I = 0x258
a=0;// 
a=0;// .field private static final MIN_DISTANCE_FOR_FLING:I = 0x19
a=0;// 
a=0;// .field private static final MIN_FLING_VELOCITY:I = 0x190
a=0;// 
a=0;// .field public static final SCROLL_STATE_DRAGGING:I = 0x1
a=0;// 
a=0;// .field public static final SCROLL_STATE_IDLE:I = 0x0
a=0;// 
a=0;// .field public static final SCROLL_STATE_SETTLING:I = 0x2
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ViewPager"
a=0;// 
a=0;// .field private static final USE_CACHE:Z
a=0;// 
a=0;// .field private static final sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private static final sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivePointerId:I
a=0;// 
a=0;// .field private mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;// .field private mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;// .field private mBottomPageBounds:I
a=0;// 
a=0;// .field private mCalledSuper:Z
a=0;// 
a=0;// .field private mChildHeightMeasureSpec:I
a=0;// 
a=0;// .field private mChildWidthMeasureSpec:I
a=0;// 
a=0;// .field private mCloseEnough:I
a=0;// 
a=0;// .field private mCurItem:I
a=0;// 
a=0;// .field private mDecorChildCount:I
a=0;// 
a=0;// .field private mDefaultGutterSize:I
a=0;// 
a=0;// .field private mDrawingOrder:I
a=0;// 
a=0;// .field private mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mExpectedAdapterCount:I
a=0;// 
a=0;// .field private mFakeDragBeginTime:J
a=0;// 
a=0;// .field private mFakeDragging:Z
a=0;// 
a=0;// .field private mFirstLayout:Z
a=0;// 
a=0;// .field private mFirstOffset:F
a=0;// 
a=0;// .field private mFlingDistance:I
a=0;// 
a=0;// .field private mGutterSize:I
a=0;// 
a=0;// .field private mIgnoreGutter:Z
a=0;// 
a=0;// .field private mInLayout:Z
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInitialMotionY:F
a=0;// 
a=0;// .field private mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// .field private mIsBeingDragged:Z
a=0;// 
a=0;// .field private mIsUnableToDrag:Z
a=0;// 
a=0;// .field private final mItems:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/view/ViewPager$ItemInfo;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mLastMotionX:F
a=0;// 
a=0;// .field private mLastMotionY:F
a=0;// 
a=0;// .field private mLastOffset:F
a=0;// 
a=0;// .field private mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;// .field private mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mMaximumVelocity:I
a=0;// 
a=0;// .field private mMinimumVelocity:I
a=0;// 
a=0;// .field private mNeedCalculatePageOffsets:Z
a=0;// 
a=0;// .field private mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;// .field private mOffscreenPageLimit:I
a=0;// 
a=0;// .field private mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// .field private mPageMargin:I
a=0;// 
a=0;// .field private mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;// .field private mPopulatePending:Z
a=0;// 
a=0;// .field private mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;// .field private mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;// .field private mRestoredCurItem:I
a=0;// 
a=0;// .field private mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;// .field private mScrollState:I
a=0;// 
a=0;// .field private mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;// .field private mScrollingCacheEnabled:Z
a=0;// 
a=0;// .field private mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;// 
a=0;// .field private final mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;// .field private final mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private mTopPageBounds:I
a=0;// 
a=0;// .field private mTouchSlop:I
a=0;// 
a=0;// .field private mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x10100b3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     .line 121
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$1;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->COMPARATOR:Ljava/util/Comparator;
a=0;// 
a=0;//     .line 128
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$2;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$2;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$2;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 228
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ViewPositionComparator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     sput-object v0, Landroid/support/v4/view/ViewPager;->sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 349
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 135
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 136
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 142
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 143
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 144
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 156
a=0;//     const v0, -0x800001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 157
a=0;//     const v0, 0x7f7fffff
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 166
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 185
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 212
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 213
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z
a=0;// 
a=0;//     .line 246
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$3;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$3;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/ViewPager$3;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$3;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 253
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->initViewPager()V
a=0;// 
a=0;//     .line 351
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 354
a=0;//     #v1=(Byte);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 135
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 136
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 142
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 143
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 144
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 156
a=0;//     const v0, -0x800001
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 157
a=0;//     const v0, 0x7f7fffff
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 166
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 185
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 212
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 213
a=0;//     iput-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z
a=0;// 
a=0;//     .line 246
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$3;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$3;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/view/ViewPager$3;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$3;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 253
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     .line 355
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->initViewPager()V
a=0;// 
a=0;//     .line 356
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/view/ViewPager;I)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/view/ViewPager;
a=0;//     .param p1, "x1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/view/ViewPager;)Landroid/support/v4/view/PagerAdapter;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/view/ViewPager;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400()[I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     sget-object v0, Landroid/support/v4/view/ViewPager;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private calculatePageOffsets(Landroid/support/v4/view/ViewPager$ItemInfo;ILandroid/support/v4/view/ViewPager$ItemInfo;)V
a=0;//     .locals 14
a=0;//     .param p1, "curItem"    # Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .param p2, "curIndex"    # I
a=0;//     .param p3, "oldCurInfo"    # Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1127
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1128
a=0;//     .local v1, "N":I
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1129
a=0;//     .local v11, "width":I
a=0;//     #v11=(Integer);
a=0;//     if-lez v11, :cond_0
a=0;// 
a=0;//     iget v12, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     int-to-float v12, v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     int-to-float v13, v11
a=0;// 
a=0;//     #v13=(Float);
a=0;//     div-float v6, v12, v13
a=0;// 
a=0;//     .line 1131
a=0;//     .local v6, "marginOffset":F
a=0;//     :goto_0
a=0;//     #v6=(Float);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-eqz p3, :cond_6
a=0;// 
a=0;//     .line 1132
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v8, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 1134
a=0;//     .local v8, "oldCurPosition":I
a=0;//     #v8=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v8, v12, :cond_3
a=0;// 
a=0;//     .line 1135
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1136
a=0;//     .local v5, "itemIndex":I
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1137
a=0;//     .local v3, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget v12, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-float/2addr v12, v13
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float v7, v12, v6
a=0;// 
a=0;//     .line 1138
a=0;//     .local v7, "offset":F
a=0;//     #v7=(Float);
a=0;//     add-int/lit8 v9, v8, 0x1
a=0;// 
a=0;//     .line 1139
a=0;//     .local v9, "pos":I
a=0;//     :goto_1
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Integer);v9=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-gt v9, v12, :cond_6
a=0;// 
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v5, v12, :cond_6
a=0;// 
a=0;//     .line 1140
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1141
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_2
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-le v9, v12, :cond_1
a=0;// 
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v12, v12, -0x1
a=0;// 
a=0;//     if-ge v5, v12, :cond_1
a=0;// 
a=0;//     .line 1142
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     .line 1143
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1129
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v5    # "itemIndex":I
a=0;//     .end local v6    # "marginOffset":F
a=0;//     .end local v7    # "offset":F
a=0;//     .end local v8    # "oldCurPosition":I
a=0;//     .end local v9    # "pos":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v13=(Uninit);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1145
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v5    # "itemIndex":I
a=0;//     .restart local v6    # "marginOffset":F
a=0;//     .restart local v7    # "offset":F
a=0;//     .restart local v8    # "oldCurPosition":I
a=0;//     .restart local v9    # "pos":I
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Integer);v6=(Float);v7=(Float);v8=(Integer);v9=(Integer);v12=(Integer);v13=(Integer);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-ge v9, v12, :cond_2
a=0;// 
a=0;//     .line 1148
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     add-float/2addr v7, v12
a=0;// 
a=0;//     .line 1149
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1151
a=0;//     :cond_2
a=0;//     #v12=(Integer);
a=0;//     iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1152
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v7, v12
a=0;// 
a=0;//     .line 1139
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1154
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v5    # "itemIndex":I
a=0;//     .end local v7    # "offset":F
a=0;//     .end local v9    # "pos":I
a=0;//     :cond_3
a=0;//     #v3=(Uninit);v5=(Uninit);v7=(Uninit);v9=(Uninit);v12=(Integer);v13=(Conflicted);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-le v8, v12, :cond_6
a=0;// 
a=0;//     .line 1155
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v5, v12, -0x1
a=0;// 
a=0;//     .line 1156
a=0;//     .restart local v5    # "itemIndex":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1157
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v3=(Null);
a=0;//     move-object/from16 v0, p3
a=0;// 
a=0;//     iget v7, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1158
a=0;//     .restart local v7    # "offset":F
a=0;//     #v7=(Integer);
a=0;//     add-int/lit8 v9, v8, -0x1
a=0;// 
a=0;//     .line 1159
a=0;//     .restart local v9    # "pos":I
a=0;//     :goto_4
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v9=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-lt v9, v12, :cond_6
a=0;// 
a=0;//     if-ltz v5, :cond_6
a=0;// 
a=0;//     .line 1160
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1161
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_5
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v9, v12, :cond_4
a=0;// 
a=0;//     if-lez v5, :cond_4
a=0;// 
a=0;//     .line 1162
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     .line 1163
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 1165
a=0;//     :cond_4
a=0;//     :goto_6
a=0;//     #v12=(Integer);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-le v9, v12, :cond_5
a=0;// 
a=0;//     .line 1168
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     sub-float/2addr v7, v12
a=0;// 
a=0;//     .line 1169
a=0;//     #v7=(Float);
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 1171
a=0;//     :cond_5
a=0;//     #v7=(Integer);v12=(Integer);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     #v12=(Float);
a=0;//     sub-float/2addr v7, v12
a=0;// 
a=0;//     .line 1172
a=0;//     #v7=(Float);
a=0;//     iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1159
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1178
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v5    # "itemIndex":I
a=0;//     .end local v7    # "offset":F
a=0;//     .end local v8    # "oldCurPosition":I
a=0;//     .end local v9    # "pos":I
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1179
a=0;//     .local v4, "itemCount":I
a=0;//     #v4=(Integer);
a=0;//     iget v7, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1180
a=0;//     .restart local v7    # "offset":F
a=0;//     #v7=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v9, v12, -0x1
a=0;// 
a=0;//     .line 1181
a=0;//     .restart local v9    # "pos":I
a=0;//     #v9=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-nez v12, :cond_7
a=0;// 
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     :goto_7
a=0;//     iput v12, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 1182
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     add-int/lit8 v13, v1, -0x1
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-ne v12, v13, :cond_8
a=0;// 
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v13, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v13
a=0;// 
a=0;//     #v12=(Float);
a=0;//     const/high16 v13, 0x3f800000
a=0;// 
a=0;//     sub-float/2addr v12, v13
a=0;// 
a=0;//     :goto_8
a=0;//     #v12=(Integer);
a=0;//     iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 1185
a=0;//     add-int/lit8 v2, p2, -0x1
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_9
a=0;//     #v2=(Integer);v10=(Conflicted);
a=0;//     if-ltz v2, :cond_b
a=0;// 
a=0;//     .line 1186
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1187
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_a
a=0;//     #v12=(Conflicted);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-le v9, v12, :cond_9
a=0;// 
a=0;//     .line 1188
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     add-int/lit8 v10, v9, -0x1
a=0;// 
a=0;//     .end local v9    # "pos":I
a=0;//     .local v10, "pos":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     sub-float/2addr v7, v12
a=0;// 
a=0;//     #v7=(Float);
a=0;//     move v9, v10
a=0;// 
a=0;//     .end local v10    # "pos":I
a=0;//     .restart local v9    # "pos":I
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 1181
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_7
a=0;//     #v2=(Uninit);v3=(Conflicted);v7=(Integer);v10=(Uninit);v12=(Integer);v13=(Conflicted);
a=0;//     const v12, -0x800001
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 1182
a=0;//     :cond_8
a=0;//     #v13=(Integer);
a=0;//     const v12, 0x7f7fffff
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 1190
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_9
a=0;//     #v2=(Integer);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v10=(Conflicted);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     #v12=(Float);
a=0;//     sub-float/2addr v7, v12
a=0;// 
a=0;//     .line 1191
a=0;//     #v7=(Float);
a=0;//     iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1192
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-nez v12, :cond_a
a=0;// 
a=0;//     iput v7, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     .line 1185
a=0;//     :cond_a
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     add-int/lit8 v9, v9, -0x1
a=0;// 
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 1194
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_b
a=0;//     #v3=(Conflicted);v7=(Integer);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v13, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v13
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float v7, v12, v6
a=0;// 
a=0;//     .line 1195
a=0;//     #v7=(Float);
a=0;//     iget v12, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     add-int/lit8 v9, v12, 0x1
a=0;// 
a=0;//     .line 1197
a=0;//     add-int/lit8 v2, p2, 0x1
a=0;// 
a=0;//     :goto_b
a=0;//     if-ge v2, v4, :cond_e
a=0;// 
a=0;//     .line 1198
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1199
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_c
a=0;//     #v12=(Conflicted);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v9, v12, :cond_c
a=0;// 
a=0;//     .line 1200
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     add-int/lit8 v10, v9, 0x1
a=0;// 
a=0;//     .end local v9    # "pos":I
a=0;//     .restart local v10    # "pos":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v12, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     add-float/2addr v7, v12
a=0;// 
a=0;//     move v9, v10
a=0;// 
a=0;//     .end local v10    # "pos":I
a=0;//     .restart local v9    # "pos":I
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 1202
a=0;//     :cond_c
a=0;//     #v10=(Conflicted);v12=(Integer);
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     add-int/lit8 v13, v1, -0x1
a=0;// 
a=0;//     if-ne v12, v13, :cond_d
a=0;// 
a=0;//     .line 1203
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v7
a=0;// 
a=0;//     #v12=(Float);
a=0;//     const/high16 v13, 0x3f800000
a=0;// 
a=0;//     sub-float/2addr v12, v13
a=0;// 
a=0;//     iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     .line 1205
a=0;//     :cond_d
a=0;//     #v12=(Integer);
a=0;//     iput v7, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 1206
a=0;//     iget v12, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v12, v6
a=0;// 
a=0;//     #v12=(Float);
a=0;//     add-float/2addr v7, v12
a=0;// 
a=0;//     .line 1197
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 1209
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_e
a=0;//     #v3=(Conflicted);v12=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     iput-boolean v12, p0, Landroid/support/v4/view/ViewPager;->mNeedCalculatePageOffsets:Z
a=0;// 
a=0;//     .line 1210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private completeScroll(Z)V
a=0;//     .locals 10
a=0;//     .param p1, "postEvents"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1741
a=0;//     #v7=(Null);
a=0;//     iget v8, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-ne v8, v9, :cond_3
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1742
a=0;//     .local v2, "needPopulate":Z
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1744
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1745
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v8}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1746
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1747
a=0;//     .local v3, "oldX":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1748
a=0;//     .local v4, "oldY":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1749
a=0;//     .local v5, "x":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1750
a=0;//     .local v6, "y":I
a=0;//     #v6=(Integer);
a=0;//     if-ne v3, v5, :cond_0
a=0;// 
a=0;//     if-eq v4, v6, :cond_1
a=0;// 
a=0;//     .line 1751
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v5, v6}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1754
a=0;//     .end local v3    # "oldX":I
a=0;//     .end local v4    # "oldY":I
a=0;//     .end local v5    # "x":I
a=0;//     .end local v6    # "y":I
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1755
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ge v0, v8, :cond_4
a=0;// 
a=0;//     .line 1756
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1757
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-boolean v8, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 1758
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1759
a=0;//     #v2=(One);
a=0;//     iput-boolean v7, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     .line 1755
a=0;//     :cond_2
a=0;//     #v2=(Boolean);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v2    # "needPopulate":Z
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Integer);
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 1741
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1762
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v2    # "needPopulate":Z
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 1763
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     .line 1764
a=0;//     iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-static {p0, v7}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1769
a=0;//     :cond_5
a=0;//     :goto_2
a=0;//     return-void
a=0;// 
a=0;//     .line 1766
a=0;//     :cond_6
a=0;//     #v7=(Null);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface {v7}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private determineTargetPage(IFII)I
a=0;//     .locals 6
a=0;//     .param p1, "currentPage"    # I
a=0;//     .param p2, "pageOffset"    # F
a=0;//     .param p3, "velocity"    # I
a=0;//     .param p4, "deltaX"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2156
a=0;//     invoke-static {p4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mFlingDistance:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v4, v5, :cond_2
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mMinimumVelocity:I
a=0;// 
a=0;//     if-le v4, v5, :cond_2
a=0;// 
a=0;//     .line 2157
a=0;//     if-lez p3, :cond_1
a=0;// 
a=0;//     move v2, p1
a=0;// 
a=0;//     .line 2163
a=0;//     .local v2, "targetPage":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_0
a=0;// 
a=0;//     .line 2164
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2165
a=0;//     .local v0, "firstItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2168
a=0;//     .local v1, "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v4, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2171
a=0;//     .end local v0    # "firstItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v1    # "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 2157
a=0;//     .end local v2    # "targetPage":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     add-int/lit8 v2, p1, 0x1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2159
a=0;//     :cond_2
a=0;//     #v2=(Uninit);
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-lt p1, v4, :cond_3
a=0;// 
a=0;//     const v3, 0x3ecccccd
a=0;// 
a=0;//     .line 2160
a=0;//     .local v3, "truncator":F
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     int-to-float v4, p1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     add-float/2addr v4, p2
a=0;// 
a=0;//     add-float/2addr v4, v3
a=0;// 
a=0;//     float-to-int v2, v4
a=0;// 
a=0;//     .restart local v2    # "targetPage":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2159
a=0;//     .end local v2    # "targetPage":I
a=0;//     .end local v3    # "truncator":F
a=0;//     :cond_3
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Integer);
a=0;//     const v3, 0x3f19999a
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private enableLayers(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "enable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1776
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1777
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 1778
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     .line 1780
a=0;//     .local v2, "layerType":I
a=0;//     :goto_1
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v2, v4}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 1777
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1778
a=0;//     .end local v2    # "layerType":I
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1782
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private endDrag()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2404
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 2405
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 2407
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2408
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 2409
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 2411
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;//     .locals 4
a=0;//     .param p1, "outRect"    # Landroid/graphics/Rect;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 2585
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 2586
a=0;//     new-instance p1, Landroid/graphics/Rect;
a=0;// 
a=0;//     .end local p1    # "outRect":Landroid/graphics/Rect;
a=0;//     #p1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 2588
a=0;//     .restart local p1    # "outRect":Landroid/graphics/Rect;
a=0;//     :cond_0
a=0;//     #p1=(Reference,Landroid/graphics/Rect;);
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     .line 2589
a=0;//     invoke-virtual {p1, v2, v2, v2, v2}, Landroid/graphics/Rect;->set(IIII)V
a=0;// 
a=0;//     .line 2607
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return-object p1
a=0;// 
a=0;//     .line 2592
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2593
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 2594
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 2595
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 2597
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2598
a=0;//     .local v1, "parent":Landroid/view/ViewParent;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/view/ViewParent;);v3=(Conflicted);
a=0;//     instance-of v2, v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     if-eq v1, p0, :cond_1
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 2599
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 2600
a=0;//     .local v0, "group":Landroid/view/ViewGroup;
a=0;//     iget v2, p1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2601
a=0;//     iget v2, p1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     .line 2602
a=0;//     iget v2, p1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     .line 2603
a=0;//     iget v2, p1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p1, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     .line 2605
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2606
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getClientWidth()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 483
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 2113
a=0;//     #v8=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 2114
a=0;//     .local v12, "width":I
a=0;//     #v12=(Integer);
a=0;//     if-lez v12, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v12
a=0;// 
a=0;//     #v14=(Float);
a=0;//     div-float v11, v13, v14
a=0;// 
a=0;//     .line 2115
a=0;//     .local v11, "scrollOffset":F
a=0;//     :goto_0
a=0;//     #v11=(Float);v13=(Conflicted);v14=(Conflicted);
a=0;//     if-lez v12, :cond_0
a=0;// 
a=0;//     iget v13, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v12
a=0;// 
a=0;//     #v14=(Float);
a=0;//     div-float v8, v13, v14
a=0;// 
a=0;//     .line 2116
a=0;//     .local v8, "marginOffset":F
a=0;//     :cond_0
a=0;//     #v8=(Float);v13=(Conflicted);v14=(Conflicted);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 2117
a=0;//     .local v5, "lastPos":I
a=0;//     #v5=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 2118
a=0;//     .local v4, "lastOffset":F
a=0;//     #v4=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 2119
a=0;//     .local v6, "lastWidth":F
a=0;//     #v6=(Null);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2121
a=0;//     .local v0, "first":Z
a=0;//     #v0=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 2122
a=0;//     .local v3, "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Conflicted);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-ge v1, v13, :cond_4
a=0;// 
a=0;//     .line 2123
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v13, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2125
a=0;//     .local v2, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/lit8 v14, v5, 0x1
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-eq v13, v14, :cond_1
a=0;// 
a=0;//     .line 2127
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mTempItem:Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2128
a=0;//     add-float v13, v4, v6
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float/2addr v13, v8
a=0;// 
a=0;//     iput v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 2129
a=0;//     add-int/lit8 v13, v5, 0x1
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     iput v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2130
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v13=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget v14, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     invoke-virtual {v13, v14}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     iput v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 2131
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 2133
a=0;//     :cond_1
a=0;//     #v13=(Conflicted);v14=(Conflicted);
a=0;//     iget v9, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 2135
a=0;//     .local v9, "offset":F
a=0;//     #v9=(Integer);
a=0;//     move v7, v9
a=0;// 
a=0;//     .line 2136
a=0;//     .local v7, "leftBound":F
a=0;//     #v7=(Integer);
a=0;//     iget v13, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-float/2addr v13, v9
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float v10, v13, v8
a=0;// 
a=0;//     .line 2137
a=0;//     .local v10, "rightBound":F
a=0;//     #v10=(Float);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     cmpl-float v13, v11, v7
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-ltz v13, :cond_4
a=0;// 
a=0;//     .line 2138
a=0;//     :cond_2
a=0;//     #v13=(Float);
a=0;//     cmpg-float v13, v11, v10
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-ltz v13, :cond_3
a=0;// 
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     add-int/lit8 v13, v13, -0x1
a=0;// 
a=0;//     if-ne v1, v13, :cond_6
a=0;// 
a=0;//     :cond_3
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 2151
a=0;//     .end local v2    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v3    # "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v7    # "leftBound":F
a=0;//     .end local v9    # "offset":F
a=0;//     .end local v10    # "rightBound":F
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .end local v0    # "first":Z
a=0;//     .end local v1    # "i":I
a=0;//     .end local v4    # "lastOffset":F
a=0;//     .end local v5    # "lastPos":I
a=0;//     .end local v6    # "lastWidth":F
a=0;//     .end local v8    # "marginOffset":F
a=0;//     .end local v11    # "scrollOffset":F
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     move v11, v8
a=0;// 
a=0;//     .line 2114
a=0;//     #v11=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2144
a=0;//     .restart local v0    # "first":Z
a=0;//     .restart local v1    # "i":I
a=0;//     .restart local v2    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v3    # "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v4    # "lastOffset":F
a=0;//     .restart local v5    # "lastPos":I
a=0;//     .restart local v6    # "lastWidth":F
a=0;//     .restart local v7    # "leftBound":F
a=0;//     .restart local v8    # "marginOffset":F
a=0;//     .restart local v9    # "offset":F
a=0;//     .restart local v10    # "rightBound":F
a=0;//     .restart local v11    # "scrollOffset":F
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v1=(Integer);v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Integer);v8=(Float);v9=(Integer);v10=(Float);v11=(Float);v13=(Integer);v14=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2145
a=0;//     #v0=(Null);
a=0;//     iget v5, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2146
a=0;//     move v4, v9
a=0;// 
a=0;//     .line 2147
a=0;//     iget v6, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 2148
a=0;//     move-object v3, v2
a=0;// 
a=0;//     .line 2122
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private isGutterDrag(FF)Z
a=0;//     .locals 3
a=0;//     .param p1, "x"    # F
a=0;//     .param p2, "dx"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1772
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mGutterSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpg-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     cmpl-float v0, p2, v2
a=0;// 
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mGutterSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     cmpg-float v0, p2, v2
a=0;// 
a=0;//     if-gez v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;//     .locals 4
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2389
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2390
a=0;//     .local v2, "pointerIndex":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1, v2}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2391
a=0;//     .local v1, "pointerId":I
a=0;//     #v1=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     .line 2394
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2395
a=0;//     .local v0, "newPointerIndex":I
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2396
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 2397
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 2398
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/VelocityTracker;->clear()V
a=0;// 
a=0;//     .line 2401
a=0;//     .end local v0    # "newPointerIndex":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 2394
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private pageScrolled(I)Z
a=0;//     .locals 10
a=0;//     .param p1, "xpos"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1636
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 1637
a=0;//     iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     .line 1638
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0, v7, v8, v7}, Landroid/support/v4/view/ViewPager;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1639
a=0;//     iget-boolean v8, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 1640
a=0;//     new-instance v7, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v8, "onPageScrolled did not call superclass implementation"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1645
a=0;//     :cond_0
a=0;//     #v7=(Null);v8=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1646
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1647
a=0;//     .local v5, "width":I
a=0;//     #v5=(Integer);
a=0;//     iget v8, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     add-int v6, v5, v8
a=0;// 
a=0;//     .line 1648
a=0;//     .local v6, "widthWithMargin":I
a=0;//     #v6=(Integer);
a=0;//     iget v8, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     int-to-float v9, v5
a=0;// 
a=0;//     #v9=(Float);
a=0;//     div-float v2, v8, v9
a=0;// 
a=0;//     .line 1649
a=0;//     .local v2, "marginOffset":F
a=0;//     #v2=(Float);
a=0;//     iget v0, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 1650
a=0;//     .local v0, "currentPage":I
a=0;//     #v0=(Integer);
a=0;//     int-to-float v8, p1
a=0;// 
a=0;//     int-to-float v9, v5
a=0;// 
a=0;//     div-float/2addr v8, v9
a=0;// 
a=0;//     iget v9, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-float/2addr v8, v9
a=0;// 
a=0;//     iget v9, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v9, v2
a=0;// 
a=0;//     #v9=(Float);
a=0;//     div-float v4, v8, v9
a=0;// 
a=0;//     .line 1652
a=0;//     .local v4, "pageOffset":F
a=0;//     #v4=(Float);
a=0;//     int-to-float v8, v6
a=0;// 
a=0;//     mul-float/2addr v8, v4
a=0;// 
a=0;//     float-to-int v3, v8
a=0;// 
a=0;//     .line 1654
a=0;//     .local v3, "offsetPixels":I
a=0;//     #v3=(Integer);
a=0;//     iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     .line 1655
a=0;//     invoke-virtual {p0, v0, v4, v3}, Landroid/support/v4/view/ViewPager;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1656
a=0;//     iget-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 1657
a=0;//     new-instance v7, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v8, "onPageScrolled did not call superclass implementation"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v7, v8}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 1660
a=0;//     :cond_1
a=0;//     #v7=(Boolean);v8=(Float);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .end local v0    # "currentPage":I
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v2    # "marginOffset":F
a=0;//     .end local v3    # "offsetPixels":I
a=0;//     .end local v4    # "pageOffset":F
a=0;//     .end local v5    # "width":I
a=0;//     .end local v6    # "widthWithMargin":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v9=(Conflicted);
a=0;//     return v7
a=0;// .end method
a=0;// 
a=0;// .method private performDrag(F)Z
a=0;//     .locals 17
a=0;//     .param p1, "x"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 2062
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 2064
a=0;//     .local v7, "needsInvalidate":Z
a=0;//     #v7=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v14, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     sub-float v2, v14, p1
a=0;// 
a=0;//     .line 2065
a=0;//     .local v2, "deltaX":F
a=0;//     #v2=(Float);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2067
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     int-to-float v8, v14
a=0;// 
a=0;//     .line 2068
a=0;//     .local v8, "oldScrollX":F
a=0;//     #v8=(Float);
a=0;//     add-float v12, v8, v2
a=0;// 
a=0;//     .line 2069
a=0;//     .local v12, "scrollX":F
a=0;//     #v12=(Float);
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 2071
a=0;//     .local v13, "width":I
a=0;//     #v13=(Integer);
a=0;//     int-to-float v14, v13
a=0;// 
a=0;//     #v14=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     mul-float v6, v14, v15
a=0;// 
a=0;//     .line 2072
a=0;//     .local v6, "leftBound":F
a=0;//     #v6=(Float);
a=0;//     int-to-float v14, v13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     mul-float v11, v14, v15
a=0;// 
a=0;//     .line 2073
a=0;//     .local v11, "rightBound":F
a=0;//     #v11=(Float);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 2074
a=0;//     .local v5, "leftAbsolute":Z
a=0;//     #v5=(One);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     .line 2076
a=0;//     .local v10, "rightAbsolute":Z
a=0;//     #v10=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     #v15=(Null);
a=0;//     invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2077
a=0;//     .local v3, "firstItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v15}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     add-int/lit8 v15, v15, -0x1
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2078
a=0;//     .local v4, "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     if-eqz v14, :cond_0
a=0;// 
a=0;//     .line 2079
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 2080
a=0;//     #v5=(Null);
a=0;//     iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     int-to-float v15, v13
a=0;// 
a=0;//     #v15=(Float);
a=0;//     mul-float v6, v14, v15
a=0;// 
a=0;//     .line 2082
a=0;//     :cond_0
a=0;//     #v5=(Boolean);v15=(Integer);
a=0;//     iget v14, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v15=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v15}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     add-int/lit8 v15, v15, -0x1
a=0;// 
a=0;//     if-eq v14, v15, :cond_1
a=0;// 
a=0;//     .line 2083
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 2084
a=0;//     #v10=(Null);
a=0;//     iget v14, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     int-to-float v15, v13
a=0;// 
a=0;//     #v15=(Float);
a=0;//     mul-float v11, v14, v15
a=0;// 
a=0;//     .line 2087
a=0;//     :cond_1
a=0;//     #v10=(Boolean);v15=(Integer);
a=0;//     cmpg-float v14, v12, v6
a=0;// 
a=0;//     #v14=(Byte);
a=0;//     if-gez v14, :cond_4
a=0;// 
a=0;//     .line 2088
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 2089
a=0;//     sub-float v9, v6, v12
a=0;// 
a=0;//     .line 2090
a=0;//     .local v9, "over":F
a=0;//     #v9=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v14=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     int-to-float v0, v13
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     div-float v15, v15, v16
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(F)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 2092
a=0;//     .end local v9    # "over":F
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v7=(Boolean);v9=(Conflicted);v14=(Conflicted);v15=(Integer);v16=(Conflicted);
a=0;//     move v12, v6
a=0;// 
a=0;//     .line 2101
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v14, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     float-to-int v15, v12
a=0;// 
a=0;//     int-to-float v15, v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     sub-float v15, v12, v15
a=0;// 
a=0;//     add-float/2addr v14, v15
a=0;// 
a=0;//     #v14=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v14, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2102
a=0;//     float-to-int v14, v12
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v14, v15}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 2103
a=0;//     float-to-int v14, v12
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v14}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     .line 2105
a=0;//     return v7
a=0;// 
a=0;//     .line 2093
a=0;//     :cond_4
a=0;//     #v7=(Null);v9=(Uninit);v14=(Byte);v16=(Uninit);
a=0;//     cmpl-float v14, v12, v11
a=0;// 
a=0;//     if-lez v14, :cond_3
a=0;// 
a=0;//     .line 2094
a=0;//     if-eqz v10, :cond_5
a=0;// 
a=0;//     .line 2095
a=0;//     sub-float v9, v12, v11
a=0;// 
a=0;//     .line 2096
a=0;//     .restart local v9    # "over":F
a=0;//     #v9=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v14=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     int-to-float v0, v13
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     div-float v15, v15, v16
a=0;// 
a=0;//     invoke-virtual {v14, v15}, Landroid/support/v4/widget/EdgeEffectCompat;->onPull(F)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 2098
a=0;//     .end local v9    # "over":F
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v7=(Boolean);v9=(Conflicted);v14=(Conflicted);v15=(Integer);v16=(Conflicted);
a=0;//     move v12, v11
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private recomputeScrollPosition(IIII)V
a=0;//     .locals 14
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "oldWidth"    # I
a=0;//     .param p3, "margin"    # I
a=0;//     .param p4, "oldMargin"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1473
a=0;//     if-lez p2, :cond_1
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1474
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     add-int v12, v0, p3
a=0;// 
a=0;//     .line 1475
a=0;//     .local v12, "widthWithMargin":I
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sub-int v0, p2, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     add-int v7, v0, p4
a=0;// 
a=0;//     .line 1477
a=0;//     .local v7, "oldWidthWithMargin":I
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 1478
a=0;//     .local v13, "xpos":I
a=0;//     #v13=(Integer);
a=0;//     int-to-float v0, v13
a=0;// 
a=0;//     #v0=(Float);
a=0;//     int-to-float v2, v7
a=0;// 
a=0;//     #v2=(Float);
a=0;//     div-float v8, v0, v2
a=0;// 
a=0;//     .line 1479
a=0;//     .local v8, "pageOffset":F
a=0;//     #v8=(Float);
a=0;//     int-to-float v0, v12
a=0;// 
a=0;//     mul-float/2addr v0, v8
a=0;// 
a=0;//     float-to-int v1, v0
a=0;// 
a=0;//     .line 1481
a=0;//     .local v1, "newOffsetPixels":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1482
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1484
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->getDuration()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v2}, Landroid/widget/Scroller;->timePassed()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v5, v0, v2
a=0;// 
a=0;//     .line 1485
a=0;//     .local v5, "newDuration":I
a=0;//     #v5=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     .line 1486
a=0;//     .local v11, "targetInfo":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v11=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v4, p1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 1499
a=0;//     .end local v1    # "newOffsetPixels":I
a=0;//     .end local v5    # "newDuration":I
a=0;//     .end local v7    # "oldWidthWithMargin":I
a=0;//     .end local v8    # "pageOffset":F
a=0;//     .end local v11    # "targetInfo":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v12    # "widthWithMargin":I
a=0;//     .end local v13    # "xpos":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1490
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1491
a=0;//     .local v6, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v6=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     iget v0, v6, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v2}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1492
a=0;//     .local v9, "scrollOffset":F
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v9=(Float);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sub-int v0, p1, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v0, v2
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     mul-float/2addr v0, v9
a=0;// 
a=0;//     float-to-int v10, v0
a=0;// 
a=0;//     .line 1494
a=0;//     .local v10, "scrollPos":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v10, v0, :cond_0
a=0;// 
a=0;//     .line 1495
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 1496
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v10, v0}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1491
a=0;//     .end local v9    # "scrollOffset":F
a=0;//     .end local v10    # "scrollPos":I
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private removeNonDecorViews()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 459
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 460
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 461
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 462
a=0;//     .local v2, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v3, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 463
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->removeViewAt(I)V
a=0;// 
a=0;//     .line 464
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     .line 459
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 467
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v2    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Integer);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private requestParentDisallowInterceptTouchEvent(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "disallowIntercept"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 2055
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2056
a=0;//     .local v0, "parent":Landroid/view/ViewParent;
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2057
a=0;//     invoke-interface {v0, p1}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V
a=0;// 
a=0;//     .line 2059
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private scrollToItem(IZIZ)V
a=0;//     .locals 8
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;//     .param p3, "velocity"    # I
a=0;//     .param p4, "dispatchSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 562
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 563
a=0;//     .local v0, "curInfo":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 564
a=0;//     .local v1, "destX":I
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 565
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 566
a=0;//     .local v2, "width":I
a=0;//     #v2=(Integer);
a=0;//     int-to-float v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     float-to-int v1, v3
a=0;// 
a=0;//     .line 569
a=0;//     .end local v2    # "width":I
a=0;//     :cond_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     .line 570
a=0;//     invoke-virtual {p0, v1, v7, p3}, Landroid/support/v4/view/ViewPager;->smoothScrollTo(III)V
a=0;// 
a=0;//     .line 571
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 572
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 574
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 575
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 588
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 578
a=0;//     :cond_3
a=0;//     if-eqz p4, :cond_4
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 579
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 581
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz p4, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     .line 582
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 584
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 585
a=0;//     invoke-virtual {p0, v1, v7}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 586
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setScrollState(I)V
a=0;//     .locals 1
a=0;//     .param p1, "newState"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 393
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, p1, :cond_1
a=0;// 
a=0;//     .line 405
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 397
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     .line 398
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 400
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->enableLayers(Z)V
a=0;// 
a=0;//     .line 402
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrollStateChanged(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 400
a=0;//     :cond_3
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private setScrollingCacheEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 2414
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mScrollingCacheEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 2415
a=0;//     iput-boolean p1, p0, Landroid/support/v4/view/ViewPager;->mScrollingCacheEnabled:Z
a=0;// 
a=0;//     .line 2426
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private sortChildDrawingOrder()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 1111
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 1112
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 1113
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1117
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1118
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v1, :cond_1
a=0;// 
a=0;//     .line 1119
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1120
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1118
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1115
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v1    # "childCount":I
a=0;//     .end local v2    # "i":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1122
a=0;//     .restart local v1    # "childCount":I
a=0;//     .restart local v2    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     sget-object v4, Landroid/support/v4/view/ViewPager;->sPositionComparator:Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     invoke-static {v3, v4}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 1124
a=0;//     .end local v1    # "childCount":I
a=0;//     .end local v2    # "i":I
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addFocusables(Ljava/util/ArrayList;II)V
a=0;//     .locals 7
a=0;//     .param p2, "direction"    # I
a=0;//     .param p3, "focusableMode"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;II)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 2631
a=0;//     .local p1, "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2633
a=0;//     .local v2, "focusableCount":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDescendantFocusability()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2635
a=0;//     .local v1, "descendantFocusability":I
a=0;//     #v1=(Integer);
a=0;//     const/high16 v5, 0x60000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v1, v5, :cond_1
a=0;// 
a=0;//     .line 2636
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-ge v3, v5, :cond_1
a=0;// 
a=0;//     .line 2637
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2638
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 2639
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 2640
a=0;//     .local v4, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget v5, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v5, v6, :cond_0
a=0;// 
a=0;//     .line 2641
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/view/View;->addFocusables(Ljava/util/ArrayList;II)V
a=0;// 
a=0;//     .line 2636
a=0;//     .end local v4    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v6=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2651
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v3    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const/high16 v5, 0x40000
a=0;// 
a=0;//     if-ne v1, v5, :cond_2
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-ne v2, v5, :cond_3
a=0;// 
a=0;//     .line 2657
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusable()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     .line 2668
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 2660
a=0;//     :cond_4
a=0;//     #v5=(Boolean);
a=0;//     and-int/lit8 v5, p3, 0x1
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     if-ne v5, v6, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->isFocusableInTouchMode()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 2664
a=0;//     :cond_5
a=0;//     #v5=(Integer);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     .line 2665
a=0;//     invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 835
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$ItemInfo;-><init>()V
a=0;// 
a=0;//     .line 836
a=0;//     .local v0, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iput p1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 837
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v1, p0, p1}, Landroid/support/v4/view/PagerAdapter;->instantiateItem(Landroid/view/ViewGroup;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     .line 838
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 839
a=0;//     if-ltz p2, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt p2, v1, :cond_1
a=0;// 
a=0;//     .line 840
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 844
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 842
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1, p2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public addTouchables(Ljava/util/ArrayList;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/view/View;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 2678
a=0;//     .local p1, "views":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/view/View;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 2679
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2680
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 2681
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 2682
a=0;//     .local v2, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v2=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v3, v2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 2683
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->addTouchables(Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 2678
a=0;//     .end local v2    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2687
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 3
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "index"    # I
a=0;//     .param p3, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1297
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1298
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/view/ViewPager;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object p3
a=0;// 
a=0;//     :cond_0
a=0;//     move-object v0, p3
a=0;// 
a=0;//     .line 1300
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1301
a=0;//     .local v0, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     instance-of v2, p1, Landroid/support/v4/view/ViewPager$Decor;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     iput-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     .line 1302
a=0;//     iget-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1303
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     iget-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1304
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "Cannot add pager decor view during layout"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 1306
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Boolean);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z
a=0;// 
a=0;//     .line 1307
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/view/ViewPager;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     .line 1319
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 1309
a=0;//     :cond_2
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public arrowScroll(I)Z
a=0;//     .locals 13
a=0;//     .param p1, "direction"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v12, 0x42
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     const/16 v11, 0x11
a=0;// 
a=0;//     .line 2519
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2520
a=0;//     .local v1, "currentFocused":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-ne v1, p0, :cond_3
a=0;// 
a=0;//     .line 2521
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 2545
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 2547
a=0;//     .local v2, "handled":Z
a=0;//     #v2=(Null);
a=0;//     invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/FocusFinder;);
a=0;//     invoke-virtual {v8, p0, v1, p1}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 2549
a=0;//     .local v4, "nextFocused":Landroid/view/View;
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz v4, :cond_a
a=0;// 
a=0;//     if-eq v4, v1, :cond_a
a=0;// 
a=0;//     .line 2550
a=0;//     if-ne p1, v11, :cond_8
a=0;// 
a=0;//     .line 2553
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v8, v4}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget v5, v8, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2554
a=0;//     .local v5, "nextLeft":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v8, v1}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget v0, v8, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2555
a=0;//     .local v0, "currLeft":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v1, :cond_7
a=0;// 
a=0;//     if-lt v5, v0, :cond_7
a=0;// 
a=0;//     .line 2556
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageLeft()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2578
a=0;//     .end local v0    # "currLeft":I
a=0;//     .end local v5    # "nextLeft":I
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Boolean);v5=(Conflicted);v8=(Conflicted);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 2579
a=0;//     invoke-static {p1}, Landroid/view/SoundEffectConstants;->getContantForFocusDirection(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/view/ViewPager;->playSoundEffect(I)V
a=0;// 
a=0;//     .line 2581
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 2522
a=0;//     .end local v2    # "handled":Z
a=0;//     .end local v4    # "nextFocused":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 2523
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 2524
a=0;//     .local v3, "isChild":Z
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .local v6, "parent":Landroid/view/ViewParent;
a=0;//     :goto_2
a=0;//     #v6=(Reference,Landroid/view/ViewParent;);v8=(Conflicted);
a=0;//     instance-of v8, v6, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     .line 2526
a=0;//     if-ne v6, p0, :cond_5
a=0;// 
a=0;//     .line 2527
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 2531
a=0;//     :cond_4
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 2533
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 2534
a=0;//     .local v7, "sb":Ljava/lang/StringBuilder;
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 2535
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     :goto_3
a=0;//     #v9=(Conflicted);
a=0;//     instance-of v8, v6, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     .line 2537
a=0;//     const-string v8, " => "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 2536
a=0;//     invoke-interface {v6}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 2525
a=0;//     .end local v7    # "sb":Ljava/lang/StringBuilder;
a=0;//     :cond_5
a=0;//     #v3=(Null);v7=(Uninit);v8=(Boolean);v9=(Uninit);
a=0;//     invoke-interface {v6}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 2539
a=0;//     .restart local v7    # "sb":Ljava/lang/StringBuilder;
a=0;//     :cond_6
a=0;//     #v3=(Boolean);v7=(Reference,Ljava/lang/StringBuilder;);v9=(Conflicted);
a=0;//     const-string v8, "ViewPager"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "arrowScroll tried to find focus based on non-child current focused view "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 2541
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 2558
a=0;//     .end local v3    # "isChild":Z
a=0;//     .end local v6    # "parent":Landroid/view/ViewParent;
a=0;//     .end local v7    # "sb":Ljava/lang/StringBuilder;
a=0;//     .restart local v0    # "currLeft":I
a=0;//     .restart local v2    # "handled":Z
a=0;//     .restart local v4    # "nextFocused":Landroid/view/View;
a=0;//     .restart local v5    # "nextLeft":I
a=0;//     :cond_7
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/View;);v2=(Null);v3=(Conflicted);v4=(Reference,Landroid/view/View;);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2560
a=0;//     .end local v0    # "currLeft":I
a=0;//     .end local v5    # "nextLeft":I
a=0;//     :cond_8
a=0;//     #v0=(Uninit);v2=(Null);v5=(Uninit);
a=0;//     if-ne p1, v12, :cond_1
a=0;// 
a=0;//     .line 2563
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v8, v4}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget v5, v8, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2564
a=0;//     .restart local v5    # "nextLeft":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/view/ViewPager;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-direct {p0, v8, v1}, Landroid/support/v4/view/ViewPager;->getChildRectInPagerCoordinates(Landroid/graphics/Rect;Landroid/view/View;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     iget v0, v8, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 2565
a=0;//     .restart local v0    # "currLeft":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v1, :cond_9
a=0;// 
a=0;//     if-gt v5, v0, :cond_9
a=0;// 
a=0;//     .line 2566
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageRight()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2568
a=0;//     :cond_9
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2571
a=0;//     .end local v0    # "currLeft":I
a=0;//     .end local v5    # "nextLeft":I
a=0;//     :cond_a
a=0;//     #v0=(Uninit);v2=(Null);v5=(Uninit);
a=0;//     if-eq p1, v11, :cond_b
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     if-ne p1, v8, :cond_c
a=0;// 
a=0;//     .line 2573
a=0;//     :cond_b
a=0;//     #v8=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageLeft()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2574
a=0;//     :cond_c
a=0;//     #v2=(Null);v8=(One);
a=0;//     if-eq p1, v12, :cond_d
a=0;// 
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne p1, v8, :cond_1
a=0;// 
a=0;//     .line 2576
a=0;//     :cond_d
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->pageRight()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public beginFakeDrag()Z
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 2278
a=0;//     #v5=(Null);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 2294
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 2281
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iput-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     .line 2282
a=0;//     invoke-direct {p0, v9}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 2283
a=0;//     iput v5, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     iput v5, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     .line 2284
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 2285
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 2289
a=0;//     :goto_1
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .local v0, "time":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     move-wide v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v7, v4
a=0;// 
a=0;//     .line 2290
a=0;//     #v7=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 2291
a=0;//     .local v8, "ev":Landroid/view/MotionEvent;
a=0;//     #v8=(Reference,Landroid/view/MotionEvent;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-virtual {v2, v8}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 2292
a=0;//     invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 2293
a=0;//     iput-wide v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragBeginTime:J
a=0;// 
a=0;//     move v4, v9
a=0;// 
a=0;//     .line 2294
a=0;//     #v4=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2287
a=0;//     .end local v0    # "time":J
a=0;//     .end local v8    # "ev":Landroid/view/MotionEvent;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/VelocityTracker;->clear()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected canScroll(Landroid/view/View;ZIII)Z
a=0;//     .locals 11
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "checkV"    # Z
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "x"    # I
a=0;//     .param p5, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 2456
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move-object v7, p1
a=0;// 
a=0;//     .line 2457
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 2458
a=0;//     .local v7, "group":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 2459
a=0;//     .local v9, "scrollX":I
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 2460
a=0;//     .local v10, "scrollY":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 2462
a=0;//     .local v6, "count":I
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v8, v6, -0x1
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);
a=0;//     if-ltz v8, :cond_1
a=0;// 
a=0;//     .line 2465
a=0;//     invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2466
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     add-int v0, p4, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     add-int v0, p4, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     add-int v0, p5, v10
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-lt v0, v2, :cond_0
a=0;// 
a=0;//     add-int v0, p5, v10
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-ge v0, v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     add-int v0, p4, v9
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, v0, v3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v0, p5, v10
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     sub-int v5, v0, v3
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move v3, p3
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 2470
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2475
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v6    # "count":I
a=0;//     .end local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "scrollX":I
a=0;//     .end local v10    # "scrollY":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2462
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     .restart local v6    # "count":I
a=0;//     .restart local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .restart local v8    # "i":I
a=0;//     .restart local v9    # "scrollX":I
a=0;//     .restart local v10    # "scrollY":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/View;);v2=(Integer);v6=(Integer);v7=(Reference,Landroid/view/ViewGroup;);v8=(Integer);v9=(Integer);v10=(Integer);
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2475
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v6    # "count":I
a=0;//     .end local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "scrollX":I
a=0;//     .end local v10    # "scrollY":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     neg-int v0, p3
a=0;// 
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public canScrollHorizontally(I)Z
a=0;//     .locals 6
a=0;//     .param p1, "direction"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 2429
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 2440
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 2433
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v3=(Null);v4=(Reference,Landroid/support/v4/view/PagerAdapter;);v5=(Uninit);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2434
a=0;//     .local v1, "width":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2435
a=0;//     .local v0, "scrollX":I
a=0;//     #v0=(Integer);
a=0;//     if-gez p1, :cond_3
a=0;// 
a=0;//     .line 2436
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v4, v5
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-le v0, v4, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(One);v3=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2437
a=0;//     :cond_3
a=0;//     #v2=(One);v4=(Reference,Landroid/support/v4/view/PagerAdapter;);v5=(Uninit);
a=0;//     if-lez p1, :cond_0
a=0;// 
a=0;//     .line 2438
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     mul-float/2addr v4, v5
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_4
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(Boolean);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_4
a=0;//     #v2=(One);v3=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2757
a=0;//     instance-of v0, p1, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 1612
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->isFinished()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 1613
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1614
a=0;//     .local v0, "oldX":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1615
a=0;//     .local v1, "oldY":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1616
a=0;//     .local v2, "x":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->getCurrY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1618
a=0;//     .local v3, "y":I
a=0;//     #v3=(Integer);
a=0;//     if-ne v0, v2, :cond_0
a=0;// 
a=0;//     if-eq v1, v3, :cond_1
a=0;// 
a=0;//     .line 1619
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1620
a=0;//     invoke-direct {p0, v2}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 1621
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v4}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1622
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0, v4, v3}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 1627
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1633
a=0;//     .end local v0    # "oldX":I
a=0;//     .end local v1    # "oldY":I
a=0;//     .end local v2    # "x":I
a=0;//     .end local v3    # "y":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1632
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-direct {p0, v4}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method dataSetChanged()V
a=0;//     .locals 15
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 850
a=0;//     #v11=(Null);
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 851
a=0;//     .local v0, "adapterCount":I
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     .line 852
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     iget v13, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     mul-int/lit8 v13, v13, 0x2
a=0;// 
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     if-ge v12, v13, :cond_1
a=0;// 
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v12, v0, :cond_1
a=0;// 
a=0;//     move v7, v10
a=0;// 
a=0;//     .line 854
a=0;//     .local v7, "needPopulate":Z
a=0;//     :goto_0
a=0;//     #v7=(Boolean);
a=0;//     iget v8, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     .line 856
a=0;//     .local v8, "newCurrItem":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 857
a=0;//     .local v5, "isUpdating":Z
a=0;//     #v5=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);v4=(Conflicted);v5=(Boolean);v9=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v3, v12, :cond_6
a=0;// 
a=0;//     .line 858
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 859
a=0;//     .local v4, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v13, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v12, v13}, Landroid/support/v4/view/PagerAdapter;->getItemPosition(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 861
a=0;//     .local v9, "newPos":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v12, -0x1
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     if-ne v9, v12, :cond_2
a=0;// 
a=0;//     .line 857
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v12=(Integer);v13=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v5    # "isUpdating":Z
a=0;//     .end local v7    # "needPopulate":Z
a=0;//     .end local v8    # "newCurrItem":I
a=0;//     .end local v9    # "newPos":I
a=0;//     :cond_1
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v13=(Integer);v14=(Uninit);
a=0;//     move v7, v11
a=0;// 
a=0;//     .line 852
a=0;//     #v7=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 865
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v4    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v5    # "isUpdating":Z
a=0;//     .restart local v7    # "needPopulate":Z
a=0;//     .restart local v8    # "newCurrItem":I
a=0;//     .restart local v9    # "newPos":I
a=0;//     :cond_2
a=0;//     #v3=(Integer);v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v5=(Boolean);v7=(Boolean);v8=(Integer);v9=(Integer);v12=(Byte);v13=(Reference,Ljava/lang/Object;);v14=(Conflicted);
a=0;//     const/4 v12, -0x2
a=0;// 
a=0;//     if-ne v9, v12, :cond_4
a=0;// 
a=0;//     .line 866
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v12, v3}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 867
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     .line 869
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 870
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v12, p0}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 871
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 874
a=0;//     :cond_3
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget v13, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     iget-object v14, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v14=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v12, p0, v13, v14}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 875
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 877
a=0;//     #v7=(One);
a=0;//     iget v12, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     iget v13, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-ne v12, v13, :cond_0
a=0;// 
a=0;//     .line 879
a=0;//     iget v12, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v13, v0, -0x1
a=0;// 
a=0;//     invoke-static {v12, v13}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     invoke-static {v11, v12}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 880
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 885
a=0;//     :cond_4
a=0;//     #v7=(Boolean);v12=(Byte);v13=(Reference,Ljava/lang/Object;);v14=(Conflicted);
a=0;//     iget v12, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-eq v12, v9, :cond_0
a=0;// 
a=0;//     .line 886
a=0;//     iget v12, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v13, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-ne v12, v13, :cond_5
a=0;// 
a=0;//     .line 888
a=0;//     move v8, v9
a=0;// 
a=0;//     .line 891
a=0;//     :cond_5
a=0;//     iput v9, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 892
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 896
a=0;//     .end local v4    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v9    # "newPos":I
a=0;//     :cond_6
a=0;//     #v4=(Conflicted);v7=(Boolean);v9=(Conflicted);v13=(Conflicted);
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     .line 897
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v12, p0}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 900
a=0;//     :cond_7
a=0;//     #v12=(Conflicted);
a=0;//     iget-object v12, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v12=(Reference,Ljava/util/ArrayList;);
a=0;//     sget-object v13, Landroid/support/v4/view/ViewPager;->COMPARATOR:Ljava/util/Comparator;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/Comparator;);
a=0;//     invoke-static {v12, v13}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V
a=0;// 
a=0;//     .line 902
a=0;//     if-eqz v7, :cond_a
a=0;// 
a=0;//     .line 904
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 905
a=0;//     .local v2, "childCount":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v6=(Conflicted);v12=(Conflicted);
a=0;//     if-ge v3, v2, :cond_9
a=0;// 
a=0;//     .line 906
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 907
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v6, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 908
a=0;//     .local v6, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v12, v6, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v12=(Boolean);
a=0;//     if-nez v12, :cond_8
a=0;// 
a=0;//     .line 909
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     #v12=(Null);
a=0;//     iput v12, v6, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     .line 905
a=0;//     :cond_8
a=0;//     #v12=(Boolean);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 913
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v6    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v6=(Conflicted);v12=(Conflicted);
a=0;//     invoke-virtual {p0, v8, v11, v10}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 914
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     .line 916
a=0;//     .end local v2    # "childCount":I
a=0;//     :cond_a
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2481
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->executeKeyEvent(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "event"    # Landroid/view/accessibility/AccessibilityEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2725
a=0;//     invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getEventType()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0x1000
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     if-ne v4, v5, :cond_0
a=0;// 
a=0;//     .line 2726
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 2742
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Integer);
a=0;//     return v4
a=0;// 
a=0;//     .line 2730
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(PosShort);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2731
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v5=(Integer);
a=0;//     if-ge v2, v1, :cond_2
a=0;// 
a=0;//     .line 2732
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2733
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 2734
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 2735
a=0;//     .local v3, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget v4, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-ne v4, v5, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 2737
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2731
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2742
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method distanceInfluenceForSnapDuration(F)F
a=0;//     .locals 4
a=0;//     .param p1, "f"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 771
a=0;//     const/high16 v0, 0x3f000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float/2addr p1, v0
a=0;// 
a=0;//     .line 772
a=0;//     float-to-double v0, p1
a=0;// 
a=0;//     #v0=(DoubleLo);v1=(DoubleHi);
a=0;//     const-wide v2, 0x3fde28c7460698c7L
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     mul-double/2addr v0, v2
a=0;// 
a=0;//     double-to-float p1, v0
a=0;// 
a=0;//     .line 773
a=0;//     float-to-double v0, p1
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->sin(D)D
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     double-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 8
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 2176
a=0;//     #v6=(One);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 2177
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 2179
a=0;//     .local v1, "needsInvalidate":Z
a=0;//     #v1=(Null);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getOverScrollMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 2180
a=0;//     .local v2, "overScrollMode":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     if-ne v2, v6, :cond_4
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-le v5, v6, :cond_4
a=0;// 
a=0;//     .line 2183
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 2184
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2185
a=0;//     .local v3, "restoreCount":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     sub-int v0, v5, v6
a=0;// 
a=0;//     .line 2186
a=0;//     .local v0, "height":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 2188
a=0;//     .local v4, "width":I
a=0;//     #v4=(Integer);
a=0;//     const/high16 v5, 0x43870000
a=0;// 
a=0;//     invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V
a=0;// 
a=0;//     .line 2189
a=0;//     neg-int v5, v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     int-to-float v7, v4
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 2190
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5, v0, v4}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V
a=0;// 
a=0;//     .line 2191
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     .line 2192
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 2194
a=0;//     .end local v0    # "height":I
a=0;//     .end local v3    # "restoreCount":I
a=0;//     .end local v4    # "width":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->isFinished()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_2
a=0;// 
a=0;//     .line 2195
a=0;//     invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2196
a=0;//     .restart local v3    # "restoreCount":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 2197
a=0;//     .restart local v4    # "width":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     sub-int v0, v5, v6
a=0;// 
a=0;//     .line 2199
a=0;//     .restart local v0    # "height":I
a=0;//     #v0=(Integer);
a=0;//     const/high16 v5, 0x42b40000
a=0;// 
a=0;//     invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V
a=0;// 
a=0;//     .line 2200
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     neg-int v5, v5
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget v6, p0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     const/high16 v7, 0x3f800000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     neg-float v6, v6
a=0;// 
a=0;//     int-to-float v7, v4
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V
a=0;// 
a=0;//     .line 2201
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5, v0, v4}, Landroid/support/v4/widget/EdgeEffectCompat;->setSize(II)V
a=0;// 
a=0;//     .line 2202
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     invoke-virtual {v5, p1}, Landroid/support/v4/widget/EdgeEffectCompat;->draw(Landroid/graphics/Canvas;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v1, v5
a=0;// 
a=0;//     .line 2203
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 2210
a=0;//     .end local v0    # "height":I
a=0;//     .end local v3    # "restoreCount":I
a=0;//     .end local v4    # "width":I
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 2212
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 2214
a=0;//     :cond_3
a=0;//     return-void
a=0;// 
a=0;//     .line 2206
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Null);v3=(Uninit);v4=(Uninit);v6=(One);v7=(Uninit);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->finish()V
a=0;// 
a=0;//     .line 2207
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/EdgeEffectCompat;->finish()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected drawableStateChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 759
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->drawableStateChanged()V
a=0;// 
a=0;//     .line 760
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 761
a=0;//     .local v0, "d":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->isStateful()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 762
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getDrawableState()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setState([I)Z
a=0;// 
a=0;//     .line 764
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public endFakeDrag()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     .line 2304
a=0;//     #v11=(One);
a=0;//     iget-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_0
a=0;// 
a=0;//     .line 2305
a=0;//     new-instance v9, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v10, "No fake drag in progress. Call beginFakeDrag first."
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v9
a=0;// 
a=0;//     .line 2308
a=0;//     :cond_0
a=0;//     #v9=(Boolean);v10=(Uninit);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 2309
a=0;//     .local v7, "velocityTracker":Landroid/view/VelocityTracker;
a=0;//     #v7=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v9, 0x3e8
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     iget v10, p0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     invoke-virtual {v7, v9, v10}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 2310
a=0;//     iget v9, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v7, v9}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     float-to-int v2, v9
a=0;// 
a=0;//     .line 2312
a=0;//     .local v2, "initialVelocity":I
a=0;//     #v2=(Integer);
a=0;//     iput-boolean v11, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 2313
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 2314
a=0;//     .local v8, "width":I
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 2315
a=0;//     .local v5, "scrollX":I
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 2316
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2317
a=0;//     .local v0, "currentPage":I
a=0;//     #v0=(Integer);
a=0;//     int-to-float v9, v5
a=0;// 
a=0;//     int-to-float v10, v8
a=0;// 
a=0;//     div-float/2addr v9, v10
a=0;// 
a=0;//     iget v10, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-float/2addr v9, v10
a=0;// 
a=0;//     iget v10, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     div-float v4, v9, v10
a=0;// 
a=0;//     .line 2318
a=0;//     .local v4, "pageOffset":F
a=0;//     #v4=(Float);
a=0;//     iget v9, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget v10, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     sub-float/2addr v9, v10
a=0;// 
a=0;//     #v9=(Float);
a=0;//     float-to-int v6, v9
a=0;// 
a=0;//     .line 2319
a=0;//     .local v6, "totalDelta":I
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {p0, v0, v4, v2, v6}, Landroid/support/v4/view/ViewPager;->determineTargetPage(IFII)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 2321
a=0;//     .local v3, "nextPage":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3, v11, v11, v2}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 2322
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->endDrag()V
a=0;// 
a=0;//     .line 2324
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     iput-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     .line 2325
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public executeKeyEvent(Landroid/view/KeyEvent;)Z
a=0;//     .locals 4
a=0;//     .param p1, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 2493
a=0;//     #v3=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 2494
a=0;//     .local v0, "handled":Z
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 2495
a=0;//     invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 2515
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 2497
a=0;//     :sswitch_0
a=0;//     #v0=(Null);v2=(Uninit);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2498
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2500
a=0;//     :sswitch_1
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     const/16 v1, 0x42
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 2501
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2503
a=0;//     :sswitch_2
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v2, 0xb
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 2506
a=0;//     invoke-static {p1}, Landroid/support/v4/view/KeyEventCompat;->hasNoModifiers(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 2507
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2508
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Boolean);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/KeyEventCompat;->hasModifiers(Landroid/view/KeyEvent;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 2509
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->arrowScroll(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2495
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x15 -> :sswitch_0
a=0;//         0x16 -> :sswitch_1
a=0;//         0x3d -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public fakeDragBy(F)V
a=0;//     .locals 17
a=0;//     .param p1, "xOffset"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 2335
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v1, v0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 2336
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "No fake drag in progress. Call beginFakeDrag first."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 2339
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float v1, v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2341
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v13, v1
a=0;// 
a=0;//     .line 2342
a=0;//     .local v13, "oldScrollX":F
a=0;//     #v13=(Float);
a=0;//     sub-float v15, v13, p1
a=0;// 
a=0;//     .line 2343
a=0;//     .local v15, "scrollX":F
a=0;//     #v15=(Float);
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 2345
a=0;//     .local v16, "width":I
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager;->mFirstOffset:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float v12, v1, v2
a=0;// 
a=0;//     .line 2346
a=0;//     .local v12, "leftBound":F
a=0;//     #v12=(Float);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager;->mLastOffset:F
a=0;// 
a=0;//     mul-float v14, v1, v2
a=0;// 
a=0;//     .line 2348
a=0;//     .local v14, "rightBound":F
a=0;//     #v14=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v10, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2349
a=0;//     .local v10, "firstItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v11, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2350
a=0;//     .local v11, "lastItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v1, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 2351
a=0;//     iget v1, v10, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float v12, v1, v2
a=0;// 
a=0;//     .line 2353
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     iget v1, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     if-eq v1, v2, :cond_2
a=0;// 
a=0;//     .line 2354
a=0;//     iget v1, v11, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float v14, v1, v2
a=0;// 
a=0;//     .line 2357
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Integer);
a=0;//     cmpg-float v1, v15, v12
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_4
a=0;// 
a=0;//     .line 2358
a=0;//     move v15, v12
a=0;// 
a=0;//     .line 2363
a=0;//     :cond_3
a=0;//     :goto_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int v2, v15
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     sub-float v2, v15, v2
a=0;// 
a=0;//     add-float/2addr v1, v2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v1, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2364
a=0;//     float-to-int v1, v15
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 2365
a=0;//     float-to-int v1, v15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->pageScrolled(I)Z
a=0;// 
a=0;//     .line 2368
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     .line 2369
a=0;//     .local v3, "time":J
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-wide v1, v0, Landroid/support/v4/view/ViewPager;->mFakeDragBeginTime:J
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v6, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 2371
a=0;//     .local v9, "ev":Landroid/view/MotionEvent;
a=0;//     #v9=(Reference,Landroid/view/MotionEvent;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/VelocityTracker;);
a=0;//     invoke-virtual {v1, v9}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 2372
a=0;//     invoke-virtual {v9}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 2373
a=0;//     return-void
a=0;// 
a=0;//     .line 2359
a=0;//     .end local v3    # "time":J
a=0;//     .end local v9    # "ev":Landroid/view/MotionEvent;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Byte);v2=(Integer);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     cmpl-float v1, v15, v14
a=0;// 
a=0;//     if-lez v1, :cond_3
a=0;// 
a=0;//     .line 2360
a=0;//     move v15, v14
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2747
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2762
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v4/view/ViewPager$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2752
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getChildDrawingOrder(II)I
a=0;//     .locals 4
a=0;//     .param p1, "childCount"    # I
a=0;//     .param p2, "i"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 647
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     add-int/lit8 v2, p1, -0x1
a=0;// 
a=0;//     sub-int v0, v2, p2
a=0;// 
a=0;//     .line 648
a=0;//     .local v0, "index":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrderedChildren:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     iget v1, v2, Landroid/support/v4/view/ViewPager$LayoutParams;->childIndex:I
a=0;// 
a=0;//     .line 649
a=0;//     .local v1, "result":I
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .end local v0    # "index":I
a=0;//     .end local v1    # "result":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);
a=0;//     move v0, p2
a=0;// 
a=0;//     .line 647
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCurrentItem()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 510
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOffscreenPageLimit()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 672
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getPageMargin()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 728
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method infoForAnyChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1342
a=0;//     :goto_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "parent":Landroid/view/ViewParent;
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eq v0, p0, :cond_2
a=0;// 
a=0;//     .line 1343
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     instance-of v1, v0, Landroid/view/View;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 1344
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1348
a=0;//     :goto_1
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);
a=0;//     move-object p1, v0
a=0;// 
a=0;//     .line 1346
a=0;//     check-cast p1, Landroid/view/View;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1348
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 4
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1331
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 1332
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1333
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v3, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v2, p1, v3}, Landroid/support/v4/view/PagerAdapter;->isViewFromObject(Landroid/view/View;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1337
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_1
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1331
a=0;//     .restart local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Reference,Ljava/lang/Object;);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1337
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1352
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 1353
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 1354
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v2, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, p1, :cond_0
a=0;// 
a=0;//     .line 1358
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_1
a=0;//     return-object v1
a=0;// 
a=0;//     .line 1352
a=0;//     .restart local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1358
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method initViewPager()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 359
a=0;//     #v5=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 360
a=0;//     const/high16 v3, 0x40000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->setDescendantFocusability(I)V
a=0;// 
a=0;//     .line 361
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/view/ViewPager;->setFocusable(Z)V
a=0;// 
a=0;//     .line 362
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 363
a=0;//     .local v1, "context":Landroid/content/Context;
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     new-instance v3, Landroid/widget/Scroller;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/Scroller;);
a=0;//     sget-object v4, Landroid/support/v4/view/ViewPager;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-direct {v3, v1, v4}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/Scroller;);
a=0;//     iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     .line 364
a=0;//     invoke-static {v1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 365
a=0;//     .local v0, "configuration":Landroid/view/ViewConfiguration;
a=0;//     #v0=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v2, v3, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 367
a=0;//     .local v2, "density":F
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0}, Landroid/support/v4/view/ViewConfigurationCompat;->getScaledPagingTouchSlop(Landroid/view/ViewConfiguration;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     .line 368
a=0;//     const/high16 v3, 0x43c80000
a=0;// 
a=0;//     mul-float/2addr v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mMinimumVelocity:I
a=0;// 
a=0;//     .line 369
a=0;//     invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I
a=0;// 
a=0;//     .line 370
a=0;//     new-instance v3, Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-direct {v3, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     .line 371
a=0;//     new-instance v3, Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-direct {v3, v1}, Landroid/support/v4/widget/EdgeEffectCompat;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     iput-object v3, p0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     .line 373
a=0;//     const/high16 v3, 0x41c80000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mFlingDistance:I
a=0;// 
a=0;//     .line 374
a=0;//     const/high16 v3, 0x40000000
a=0;// 
a=0;//     mul-float/2addr v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mCloseEnough:I
a=0;// 
a=0;//     .line 375
a=0;//     const/high16 v3, 0x41800000
a=0;// 
a=0;//     mul-float/2addr v3, v2
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mDefaultGutterSize:I
a=0;// 
a=0;//     .line 377
a=0;//     new-instance v3, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;);
a=0;//     invoke-direct {v3, p0}, Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;-><init>(Landroid/support/v4/view/ViewPager;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$MyAccessibilityDelegate;);
a=0;//     invoke-static {p0, v3}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;// 
a=0;//     .line 379
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 381
a=0;//     invoke-static {p0, v5}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 384
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isFakeDragging()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 2385
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1363
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 1364
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 1365
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mEndScrollRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 389
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 390
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 18
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2218
a=0;//     invoke-super/range {p0 .. p1}, Landroid/view/ViewGroup;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 2221
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v13, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-lez v13, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-lez v13, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v13=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v13, :cond_2
a=0;// 
a=0;//     .line 2222
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 2223
a=0;//     .local v10, "scrollX":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 2225
a=0;//     .local v11, "width":I
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v11
a=0;// 
a=0;//     #v14=(Float);
a=0;//     div-float v7, v13, v14
a=0;// 
a=0;//     .line 2226
a=0;//     .local v7, "marginOffset":F
a=0;//     #v7=(Float);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 2227
a=0;//     .local v5, "itemIndex":I
a=0;//     #v5=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     #v14=(Null);
a=0;//     invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 2228
a=0;//     .local v3, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget v8, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     .line 2229
a=0;//     .local v8, "offset":F
a=0;//     #v8=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v13}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 2230
a=0;//     .local v4, "itemCount":I
a=0;//     #v4=(Integer);
a=0;//     iget v2, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2231
a=0;//     .local v2, "firstPos":I
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     add-int/lit8 v14, v4, -0x1
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     check-cast v13, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     iget v6, v13, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2232
a=0;//     .local v6, "lastPos":I
a=0;//     #v6=(Integer);
a=0;//     move v9, v2
a=0;// 
a=0;//     .local v9, "pos":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Integer);v9=(Integer);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     if-ge v9, v6, :cond_2
a=0;// 
a=0;//     .line 2233
a=0;//     :goto_1
a=0;//     iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     if-le v9, v13, :cond_0
a=0;// 
a=0;//     if-ge v5, v4, :cond_0
a=0;// 
a=0;//     .line 2234
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v13=(Reference,Ljava/util/ArrayList;);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     invoke-virtual {v13, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2238
a=0;//     :cond_0
a=0;//     #v13=(Integer);
a=0;//     iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     if-ne v9, v13, :cond_3
a=0;// 
a=0;//     .line 2239
a=0;//     iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     add-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v11
a=0;// 
a=0;//     #v14=(Float);
a=0;//     mul-float v1, v13, v14
a=0;// 
a=0;//     .line 2240
a=0;//     .local v1, "drawAt":F
a=0;//     #v1=(Float);
a=0;//     iget v13, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     iget v14, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     add-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float v8, v13, v7
a=0;// 
a=0;//     .line 2247
a=0;//     :goto_2
a=0;//     #v8=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float/2addr v13, v1
a=0;// 
a=0;//     int-to-float v14, v10
a=0;// 
a=0;//     #v14=(Float);
a=0;//     cmpl-float v13, v13, v14
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-lez v13, :cond_1
a=0;// 
a=0;//     .line 2248
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v13=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     float-to-int v14, v1
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mTopPageBounds:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     add-float v16, v16, v1
a=0;// 
a=0;//     const/high16 v17, 0x3f000000
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     add-float v16, v16, v17
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mBottomPageBounds:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     invoke-virtual/range {v13 .. v17}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 2250
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v13, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 2253
a=0;//     :cond_1
a=0;//     #v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     add-int v13, v10, v11
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     cmpl-float v13, v1, v13
a=0;// 
a=0;//     #v13=(Byte);
a=0;//     if-lez v13, :cond_4
a=0;// 
a=0;//     .line 2258
a=0;//     .end local v1    # "drawAt":F
a=0;//     .end local v2    # "firstPos":I
a=0;//     .end local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v4    # "itemCount":I
a=0;//     .end local v5    # "itemIndex":I
a=0;//     .end local v6    # "lastPos":I
a=0;//     .end local v7    # "marginOffset":F
a=0;//     .end local v8    # "offset":F
a=0;//     .end local v9    # "pos":I
a=0;//     .end local v10    # "scrollX":I
a=0;//     .end local v11    # "width":I
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 2242
a=0;//     .restart local v2    # "firstPos":I
a=0;//     .restart local v3    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v4    # "itemCount":I
a=0;//     .restart local v5    # "itemIndex":I
a=0;//     .restart local v6    # "lastPos":I
a=0;//     .restart local v7    # "marginOffset":F
a=0;//     .restart local v8    # "offset":F
a=0;//     .restart local v9    # "pos":I
a=0;//     .restart local v10    # "scrollX":I
a=0;//     .restart local v11    # "width":I
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v4=(Integer);v5=(Integer);v6=(Integer);v7=(Float);v8=(Integer);v9=(Integer);v10=(Integer);v11=(Integer);v13=(Integer);v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v13=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v13, v9}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 2243
a=0;//     .local v12, "widthFactor":F
a=0;//     #v12=(Float);
a=0;//     add-float v13, v8, v12
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v11
a=0;// 
a=0;//     #v14=(Float);
a=0;//     mul-float v1, v13, v14
a=0;// 
a=0;//     .line 2244
a=0;//     .restart local v1    # "drawAt":F
a=0;//     #v1=(Float);
a=0;//     add-float v13, v12, v7
a=0;// 
a=0;//     add-float/2addr v8, v13
a=0;// 
a=0;//     #v8=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 2232
a=0;//     .end local v12    # "widthFactor":F
a=0;//     :cond_4
a=0;//     #v12=(Conflicted);v13=(Byte);v14=(Integer);
a=0;//     add-int/lit8 v9, v9, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 14
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1792
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v6, v0, 0xff
a=0;// 
a=0;//     .line 1795
a=0;//     .local v6, "action":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq v6, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v6, v0, :cond_2
a=0;// 
a=0;//     .line 1798
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1799
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 1800
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1801
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1802
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 1803
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1805
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1925
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1810
a=0;//     :cond_2
a=0;//     #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     .line 1811
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1813
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1815
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1817
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1821
a=0;//     :cond_4
a=0;//     #v0=(Boolean);
a=0;//     sparse-switch v6, :sswitch_data_0
a=0;// 
a=0;//     .line 1916
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 1917
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1919
a=0;//     :cond_6
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1925
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1832
a=0;//     :sswitch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     iget v7, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1833
a=0;//     .local v7, "activePointerId":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eq v7, v0, :cond_5
a=0;// 
a=0;//     .line 1838
a=0;//     invoke-static {p1, v7}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1839
a=0;//     .local v9, "pointerIndex":I
a=0;//     #v9=(Integer);
a=0;//     invoke-static {p1, v9}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1840
a=0;//     .local v10, "x":F
a=0;//     #v10=(Float);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float v8, v10, v0
a=0;// 
a=0;//     .line 1841
a=0;//     .local v8, "dx":F
a=0;//     #v8=(Float);
a=0;//     invoke-static {v8}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1842
a=0;//     .local v11, "xDiff":F
a=0;//     #v11=(Float);
a=0;//     invoke-static {p1, v9}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1843
a=0;//     .local v12, "y":F
a=0;//     #v12=(Float);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionY:F
a=0;// 
a=0;//     sub-float v0, v12, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 1846
a=0;//     .local v13, "yDiff":F
a=0;//     #v13=(Float);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmpl-float v0, v8, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0, v8}, Landroid/support/v4/view/ViewPager;->isGutterDrag(FF)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     float-to-int v3, v8
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     float-to-int v4, v10
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     float-to-int v5, v12
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/view/ViewPager;->canScroll(Landroid/view/View;ZIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 1849
a=0;//     iput v10, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1850
a=0;//     iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1851
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 1852
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1854
a=0;//     :cond_7
a=0;//     #v0=(Byte);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v11, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_a
a=0;// 
a=0;//     const/high16 v0, 0x3f000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     mul-float/2addr v0, v11
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v0, v13
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_a
a=0;// 
a=0;//     .line 1856
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1857
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->requestParentDisallowInterceptTouchEvent(Z)V
a=0;// 
a=0;//     .line 1858
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 1859
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     cmpl-float v0, v8, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_9
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1861
a=0;//     iput v12, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1862
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1871
a=0;//     :cond_8
a=0;//     :goto_3
a=0;//     #v0=(Byte);v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1873
a=0;//     invoke-direct {p0, v10}, Landroid/support/v4/view/ViewPager;->performDrag(F)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1874
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1859
a=0;//     :cond_9
a=0;//     #v0=(Byte);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     sub-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1863
a=0;//     :cond_a
a=0;//     #v0=(Byte);v1=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     cmpl-float v0, v13, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_8
a=0;// 
a=0;//     .line 1869
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1885
a=0;//     .end local v7    # "activePointerId":I
a=0;//     .end local v8    # "dx":F
a=0;//     .end local v9    # "pointerIndex":I
a=0;//     .end local v10    # "x":F
a=0;//     .end local v11    # "xDiff":F
a=0;//     .end local v12    # "y":F
a=0;//     .end local v13    # "yDiff":F
a=0;//     :sswitch_1
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1886
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mInitialMotionY:F
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1887
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 1888
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 1890
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->computeScrollOffset()Z
a=0;// 
a=0;//     .line 1891
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mScrollState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->getFinalX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v1}, Landroid/widget/Scroller;->getCurrX()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     invoke-static {v0}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCloseEnough:I
a=0;// 
a=0;//     if-le v0, v1, :cond_b
a=0;// 
a=0;//     .line 1894
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual {v0}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1895
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1896
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1897
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1898
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->requestParentDisallowInterceptTouchEvent(Z)V
a=0;// 
a=0;//     .line 1899
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1901
a=0;//     :cond_b
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 1902
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1912
a=0;//     :sswitch_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/ViewPager;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1821
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x0 -> :sswitch_1
a=0;//         0x2 -> :sswitch_0
a=0;//         0x6 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 30
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1503
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1504
a=0;//     .local v9, "count":I
a=0;//     #v9=(Integer);
a=0;//     sub-int v24, p4, p2
a=0;// 
a=0;//     .line 1505
a=0;//     .local v24, "width":I
a=0;//     #v24=(Integer);
a=0;//     sub-int v11, p5, p3
a=0;// 
a=0;//     .line 1506
a=0;//     .local v11, "height":I
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 1507
a=0;//     .local v19, "paddingLeft":I
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     .line 1508
a=0;//     .local v21, "paddingTop":I
a=0;//     #v21=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 1509
a=0;//     .local v20, "paddingRight":I
a=0;//     #v20=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 1510
a=0;//     .local v18, "paddingBottom":I
a=0;//     #v18=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 1512
a=0;//     .local v22, "scrollX":I
a=0;//     #v22=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 1516
a=0;//     .local v10, "decorCount":I
a=0;//     #v10=(Null);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .local v14, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Integer);v13=(Conflicted);v14=(Integer);v17=(Conflicted);v23=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     if-ge v14, v9, :cond_1
a=0;// 
a=0;//     .line 1517
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v14}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1518
a=0;//     .local v5, "child":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     const/16 v27, 0x8
a=0;// 
a=0;//     #v27=(PosByte);
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 1519
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v17, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1520
a=0;//     .local v17, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1521
a=0;//     .local v6, "childLeft":I
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 1522
a=0;//     .local v7, "childTop":I
a=0;//     #v7=(Null);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Boolean);
a=0;//     if-eqz v26, :cond_0
a=0;// 
a=0;//     .line 1523
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     and-int/lit8 v13, v26, 0x7
a=0;// 
a=0;//     .line 1524
a=0;//     .local v13, "hgrav":I
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     and-int/lit8 v23, v26, 0x70
a=0;// 
a=0;//     .line 1525
a=0;//     .local v23, "vgrav":I
a=0;//     #v23=(Integer);
a=0;//     packed-switch v13, :pswitch_data_0
a=0;// 
a=0;//     .line 1527
a=0;//     :pswitch_0
a=0;//     move/from16 v6, v19
a=0;// 
a=0;//     .line 1542
a=0;//     :goto_1
a=0;//     #v1=(Integer);v6=(Integer);v27=(Integer);
a=0;//     sparse-switch v23, :sswitch_data_0
a=0;// 
a=0;//     .line 1544
a=0;//     move/from16 v7, v21
a=0;// 
a=0;//     .line 1559
a=0;//     :goto_2
a=0;//     #v7=(Integer);
a=0;//     add-int v6, v6, v22
a=0;// 
a=0;//     .line 1560
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     add-int v26, v26, v6
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     add-int v27, v27, v7
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     invoke-virtual {v5, v6, v7, v0, v1}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 1563
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     .line 1516
a=0;//     .end local v6    # "childLeft":I
a=0;//     .end local v7    # "childTop":I
a=0;//     .end local v13    # "hgrav":I
a=0;//     .end local v17    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v23    # "vgrav":I
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);v7=(Conflicted);v13=(Conflicted);v17=(Conflicted);v23=(Conflicted);
a=0;//     add-int/lit8 v14, v14, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1530
a=0;//     .restart local v6    # "childLeft":I
a=0;//     .restart local v7    # "childTop":I
a=0;//     .restart local v13    # "hgrav":I
a=0;//     .restart local v17    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .restart local v23    # "vgrav":I
a=0;//     :pswitch_1
a=0;//     #v1=(PosByte);v6=(Null);v7=(Null);v13=(Integer);v17=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);v23=(Integer);v27=(PosByte);
a=0;//     move/from16 v6, v19
a=0;// 
a=0;//     .line 1531
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     add-int v19, v19, v26
a=0;// 
a=0;//     .line 1532
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1534
a=0;//     :pswitch_2
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     sub-int v26, v24, v26
a=0;// 
a=0;//     div-int/lit8 v26, v26, 0x2
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1536
a=0;//     #v6=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1538
a=0;//     :pswitch_3
a=0;//     #v1=(PosByte);v6=(Null);
a=0;//     sub-int v26, v24, v20
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     sub-int v6, v26, v27
a=0;// 
a=0;//     .line 1539
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     add-int v20, v20, v26
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1547
a=0;//     :sswitch_0
a=0;//     #v1=(Integer);
a=0;//     move/from16 v7, v21
a=0;// 
a=0;//     .line 1548
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     add-int v21, v21, v26
a=0;// 
a=0;//     .line 1549
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1551
a=0;//     :sswitch_1
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     sub-int v26, v11, v26
a=0;// 
a=0;//     div-int/lit8 v26, v26, 0x2
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1553
a=0;//     #v7=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1555
a=0;//     :sswitch_2
a=0;//     #v7=(Null);
a=0;//     sub-int v26, v11, v18
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     sub-int v7, v26, v27
a=0;// 
a=0;//     .line 1556
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     add-int v18, v18, v26
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1568
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     .end local v6    # "childLeft":I
a=0;//     .end local v7    # "childTop":I
a=0;//     .end local v13    # "hgrav":I
a=0;//     .end local v17    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v23    # "vgrav":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v13=(Conflicted);v17=(Conflicted);v23=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     sub-int v26, v24, v19
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     sub-int v8, v26, v20
a=0;// 
a=0;//     .line 1570
a=0;//     .local v8, "childWidth":I
a=0;//     #v8=(Integer);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v12=(Conflicted);v15=(Conflicted);v16=(Conflicted);v25=(Conflicted);
a=0;//     if-ge v14, v9, :cond_4
a=0;// 
a=0;//     .line 1571
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v14}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1572
a=0;//     .restart local v5    # "child":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     const/16 v27, 0x8
a=0;// 
a=0;//     #v27=(PosByte);
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 1573
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v17, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1575
a=0;//     .restart local v17    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Boolean);
a=0;//     if-nez v26, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .local v15, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v15=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v15, :cond_3
a=0;// 
a=0;//     .line 1576
a=0;//     int-to-float v0, v8
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Float);
a=0;//     iget v0, v15, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     mul-float v26, v26, v27
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     .line 1577
a=0;//     .local v16, "loff":I
a=0;//     #v16=(Integer);
a=0;//     add-int v6, v19, v16
a=0;// 
a=0;//     .line 1578
a=0;//     .restart local v6    # "childLeft":I
a=0;//     #v6=(Integer);
a=0;//     move/from16 v7, v21
a=0;// 
a=0;//     .line 1579
a=0;//     .restart local v7    # "childTop":I
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Boolean);
a=0;//     if-eqz v26, :cond_2
a=0;// 
a=0;//     .line 1582
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     #v26=(Null);
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->needsMeasure:Z
a=0;// 
a=0;//     .line 1583
a=0;//     int-to-float v0, v8
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Float);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     mul-float v26, v26, v27
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     const/high16 v27, 0x40000000
a=0;// 
a=0;//     invoke-static/range {v26 .. v27}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     .line 1586
a=0;//     .local v25, "widthSpec":I
a=0;//     #v25=(Integer);
a=0;//     sub-int v26, v11, v21
a=0;// 
a=0;//     sub-int v26, v26, v18
a=0;// 
a=0;//     const/high16 v27, 0x40000000
a=0;// 
a=0;//     invoke-static/range {v26 .. v27}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1589
a=0;//     .local v12, "heightSpec":I
a=0;//     #v12=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     invoke-virtual {v5, v0, v12}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1594
a=0;//     .end local v12    # "heightSpec":I
a=0;//     .end local v25    # "widthSpec":I
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v12=(Conflicted);v25=(Conflicted);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     add-int v26, v26, v6
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     add-int v27, v27, v7
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v5, v6, v7, v0, v1}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 1570
a=0;//     .end local v6    # "childLeft":I
a=0;//     .end local v7    # "childTop":I
a=0;//     .end local v15    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v16    # "loff":I
a=0;//     .end local v17    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);
a=0;//     add-int/lit8 v14, v14, 0x1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 1600
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v5=(Conflicted);v27=(Conflicted);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mTopPageBounds:I
a=0;// 
a=0;//     .line 1601
a=0;//     sub-int v26, v11, v18
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mBottomPageBounds:I
a=0;// 
a=0;//     .line 1602
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v10, v0, Landroid/support/v4/view/ViewPager;->mDecorChildCount:I
a=0;// 
a=0;//     .line 1604
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Boolean);
a=0;//     if-eqz v26, :cond_5
a=0;// 
a=0;//     .line 1605
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     const/16 v28, 0x0
a=0;// 
a=0;//     #v28=(Null);
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     #v29=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v27
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move/from16 v3, v28
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move/from16 v4, v29
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V
a=0;// 
a=0;//     .line 1607
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     #v26=(Null);
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 1608
a=0;//     return-void
a=0;// 
a=0;//     .line 1525
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);v27=(Unknown);v28=(Unknown);v29=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 1542
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x10 -> :sswitch_1
a=0;//         0x30 -> :sswitch_0
a=0;//         0x50 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 23
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1374
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move/from16 v1, p2
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/ViewPager;->getDefaultSize(II)I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     move/from16 v2, v22
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 1377
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1378
a=0;//     .local v15, "measuredWidth":I
a=0;//     #v15=(Integer);
a=0;//     div-int/lit8 v14, v15, 0xa
a=0;// 
a=0;//     .line 1379
a=0;//     .local v14, "maxGutterSize":I
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mDefaultGutterSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-static {v14, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mGutterSize:I
a=0;// 
a=0;//     .line 1382
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     sub-int v21, v15, v21
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     sub-int v5, v21, v22
a=0;// 
a=0;//     .line 1383
a=0;//     .local v5, "childWidthSize":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingTop()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     sub-int v21, v21, v22
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     sub-int v4, v21, v22
a=0;// 
a=0;//     .line 1390
a=0;//     .local v4, "childHeightSize":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 1391
a=0;//     .local v16, "size":I
a=0;//     #v16=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .local v12, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Integer);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-ge v12, v0, :cond_a
a=0;// 
a=0;//     .line 1392
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v12}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1393
a=0;//     .local v3, "child":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     const/16 v22, 0x8
a=0;// 
a=0;//     #v22=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_5
a=0;// 
a=0;//     .line 1394
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1395
a=0;//     .local v13, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     if-eqz v13, :cond_5
a=0;// 
a=0;//     iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Boolean);
a=0;//     if-eqz v21, :cond_5
a=0;// 
a=0;//     .line 1396
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     and-int/lit8 v11, v21, 0x7
a=0;// 
a=0;//     .line 1397
a=0;//     .local v11, "hgrav":I
a=0;//     #v11=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     and-int/lit8 v17, v21, 0x70
a=0;// 
a=0;//     .line 1398
a=0;//     .local v17, "vgrav":I
a=0;//     #v17=(Integer);
a=0;//     const/high16 v18, -0x80000000
a=0;// 
a=0;//     .line 1399
a=0;//     .local v18, "widthMode":I
a=0;//     #v18=(Integer);
a=0;//     const/high16 v8, -0x80000000
a=0;// 
a=0;//     .line 1400
a=0;//     .local v8, "heightMode":I
a=0;//     #v8=(Integer);
a=0;//     const/16 v21, 0x30
a=0;// 
a=0;//     #v21=(PosByte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/16 v21, 0x50
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 1401
a=0;//     .local v7, "consumeVertical":Z
a=0;//     :goto_1
a=0;//     #v7=(Boolean);
a=0;//     const/16 v21, 0x3
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-eq v11, v0, :cond_1
a=0;// 
a=0;//     const/16 v21, 0x5
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     if-ne v11, v0, :cond_7
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 1403
a=0;//     .local v6, "consumeHorizontal":Z
a=0;//     :goto_2
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v7, :cond_8
a=0;// 
a=0;//     .line 1404
a=0;//     const/high16 v18, 0x40000000
a=0;// 
a=0;//     .line 1409
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     move/from16 v19, v5
a=0;// 
a=0;//     .line 1410
a=0;//     .local v19, "widthSize":I
a=0;//     #v19=(Integer);
a=0;//     move v9, v4
a=0;// 
a=0;//     .line 1411
a=0;//     .local v9, "heightSize":I
a=0;//     #v9=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     const/16 v22, -0x2
a=0;// 
a=0;//     #v22=(Byte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 1412
a=0;//     const/high16 v18, 0x40000000
a=0;// 
a=0;//     .line 1413
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     const/16 v22, -0x1
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 1414
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->width:I
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     .line 1417
a=0;//     :cond_3
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     const/16 v22, -0x2
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     .line 1418
a=0;//     const/high16 v8, 0x40000000
a=0;// 
a=0;//     .line 1419
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     const/16 v22, -0x1
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     if-eq v0, v1, :cond_4
a=0;// 
a=0;//     .line 1420
a=0;//     iget v9, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->height:I
a=0;// 
a=0;//     .line 1423
a=0;//     :cond_4
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 1424
a=0;//     .local v20, "widthSpec":I
a=0;//     #v20=(Integer);
a=0;//     invoke-static {v9, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1425
a=0;//     .local v10, "heightSpec":I
a=0;//     #v10=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v3, v0, v10}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1427
a=0;//     if-eqz v7, :cond_9
a=0;// 
a=0;//     .line 1428
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     sub-int v4, v4, v21
a=0;// 
a=0;//     .line 1391
a=0;//     .end local v6    # "consumeHorizontal":Z
a=0;//     .end local v7    # "consumeVertical":Z
a=0;//     .end local v8    # "heightMode":I
a=0;//     .end local v9    # "heightSize":I
a=0;//     .end local v10    # "heightSpec":I
a=0;//     .end local v11    # "hgrav":I
a=0;//     .end local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v17    # "vgrav":I
a=0;//     .end local v18    # "widthMode":I
a=0;//     .end local v19    # "widthSize":I
a=0;//     .end local v20    # "widthSpec":I
a=0;//     :cond_5
a=0;//     :goto_4
a=0;//     #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1400
a=0;//     .restart local v8    # "heightMode":I
a=0;//     .restart local v11    # "hgrav":I
a=0;//     .restart local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .restart local v17    # "vgrav":I
a=0;//     .restart local v18    # "widthMode":I
a=0;//     :cond_6
a=0;//     #v1=(PosByte);v8=(Integer);v11=(Integer);v13=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);v17=(Integer);v18=(Integer);v21=(PosByte);v22=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1401
a=0;//     .restart local v7    # "consumeVertical":Z
a=0;//     :cond_7
a=0;//     #v0=(PosByte);v7=(Boolean);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1405
a=0;//     .restart local v6    # "consumeHorizontal":Z
a=0;//     :cond_8
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 1406
a=0;//     const/high16 v8, 0x40000000
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1429
a=0;//     .restart local v9    # "heightSize":I
a=0;//     .restart local v10    # "heightSpec":I
a=0;//     .restart local v19    # "widthSize":I
a=0;//     .restart local v20    # "widthSpec":I
a=0;//     :cond_9
a=0;//     #v0=(Integer);v1=(Integer);v9=(Integer);v10=(Integer);v19=(Integer);v20=(Integer);v21=(Integer);v22=(Byte);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 1430
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     sub-int v5, v5, v21
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1436
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     .end local v6    # "consumeHorizontal":Z
a=0;//     .end local v7    # "consumeVertical":Z
a=0;//     .end local v8    # "heightMode":I
a=0;//     .end local v9    # "heightSize":I
a=0;//     .end local v10    # "heightSpec":I
a=0;//     .end local v11    # "hgrav":I
a=0;//     .end local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v17    # "vgrav":I
a=0;//     .end local v18    # "widthMode":I
a=0;//     .end local v19    # "widthSize":I
a=0;//     .end local v20    # "widthSpec":I
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v22=(Integer);
a=0;//     const/high16 v21, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mChildWidthMeasureSpec:I
a=0;// 
a=0;//     .line 1437
a=0;//     const/high16 v21, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     invoke-static {v4, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mChildHeightMeasureSpec:I
a=0;// 
a=0;//     .line 1440
a=0;//     const/16 v21, 0x1
a=0;// 
a=0;//     #v21=(One);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     .line 1441
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1442
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     #v21=(Null);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     .line 1445
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 1446
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     :goto_5
a=0;//     #v0=(Integer);v1=(Conflicted);v21=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-ge v12, v0, :cond_d
a=0;// 
a=0;//     .line 1447
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v12}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1448
a=0;//     .restart local v3    # "child":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     const/16 v22, 0x8
a=0;// 
a=0;//     #v22=(PosByte);
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_c
a=0;// 
a=0;//     .line 1452
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v13, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1453
a=0;//     .restart local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     if-eqz v13, :cond_b
a=0;// 
a=0;//     iget-boolean v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Boolean);
a=0;//     if-nez v21, :cond_c
a=0;// 
a=0;//     .line 1454
a=0;//     :cond_b
a=0;//     #v0=(Integer);v21=(Integer);
a=0;//     int-to-float v0, v5
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Float);
a=0;//     iget v0, v13, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     mul-float v21, v21, v22
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     const/high16 v22, 0x40000000
a=0;// 
a=0;//     invoke-static/range {v21 .. v22}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 1456
a=0;//     .restart local v20    # "widthSpec":I
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mChildHeightMeasureSpec:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v3, v0, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 1446
a=0;//     .end local v13    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v20    # "widthSpec":I
a=0;//     :cond_c
a=0;//     #v13=(Conflicted);v20=(Conflicted);
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 1460
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     :cond_d
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPageScrolled(IFI)V
a=0;//     .locals 17
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "offset"    # F
a=0;//     .param p3, "offsetPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1677
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v15, v0, Landroid/support/v4/view/ViewPager;->mDecorChildCount:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     if-lez v15, :cond_2
a=0;// 
a=0;//     .line 1678
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1679
a=0;//     .local v12, "scrollX":I
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1680
a=0;//     .local v10, "paddingLeft":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 1681
a=0;//     .local v11, "paddingRight":I
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1682
a=0;//     .local v14, "width":I
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1683
a=0;//     .local v4, "childCount":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v9=(Conflicted);v16=(Conflicted);
a=0;//     if-ge v8, v4, :cond_2
a=0;// 
a=0;//     .line 1684
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1685
a=0;//     .local v3, "child":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v9, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1686
a=0;//     .local v9, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v15, v9, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-nez v15, :cond_1
a=0;// 
a=0;//     .line 1683
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v15=(Integer);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1688
a=0;//     :cond_1
a=0;//     #v15=(Boolean);
a=0;//     iget v15, v9, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     and-int/lit8 v7, v15, 0x7
a=0;// 
a=0;//     .line 1689
a=0;//     .local v7, "hgrav":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1690
a=0;//     .local v5, "childLeft":I
a=0;//     #v5=(Null);
a=0;//     packed-switch v7, :pswitch_data_0
a=0;// 
a=0;//     .line 1692
a=0;//     :pswitch_0
a=0;//     move v5, v10
a=0;// 
a=0;//     .line 1707
a=0;//     :goto_2
a=0;//     #v5=(Integer);
a=0;//     add-int/2addr v5, v12
a=0;// 
a=0;//     .line 1709
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     sub-int v6, v5, v15
a=0;// 
a=0;//     .line 1710
a=0;//     .local v6, "childOffset":I
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 1711
a=0;//     invoke-virtual {v3, v6}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1695
a=0;//     .end local v6    # "childOffset":I
a=0;//     :pswitch_1
a=0;//     #v5=(Null);v6=(Conflicted);
a=0;//     move v5, v10
a=0;// 
a=0;//     .line 1696
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     add-int/2addr v10, v15
a=0;// 
a=0;//     .line 1697
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1699
a=0;//     :pswitch_2
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     sub-int v15, v14, v15
a=0;// 
a=0;//     div-int/lit8 v15, v15, 0x2
a=0;// 
a=0;//     invoke-static {v15, v10}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1701
a=0;//     #v5=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1703
a=0;//     :pswitch_3
a=0;//     #v5=(Null);
a=0;//     sub-int v15, v14, v11
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     sub-int v5, v15, v16
a=0;// 
a=0;//     .line 1704
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     add-int/2addr v11, v15
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1716
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     .end local v4    # "childCount":I
a=0;//     .end local v5    # "childLeft":I
a=0;//     .end local v7    # "hgrav":I
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v10    # "paddingLeft":I
a=0;//     .end local v11    # "paddingRight":I
a=0;//     .end local v12    # "scrollX":I
a=0;//     .end local v14    # "width":I
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v14=(Conflicted);v16=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v15=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v15, :cond_3
a=0;// 
a=0;//     .line 1717
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, p2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v15, v0, v1, v2}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1719
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     if-eqz v15, :cond_4
a=0;// 
a=0;//     .line 1720
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, p2
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v2, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {v15, v0, v1, v2}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageScrolled(IFI)V
a=0;// 
a=0;//     .line 1723
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     if-eqz v15, :cond_6
a=0;// 
a=0;//     .line 1724
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1725
a=0;//     .restart local v12    # "scrollX":I
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1726
a=0;//     .restart local v4    # "childCount":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .restart local v8    # "i":I
a=0;//     :goto_3
a=0;//     #v8=(Integer);v13=(Conflicted);v15=(Conflicted);
a=0;//     if-ge v8, v4, :cond_6
a=0;// 
a=0;//     .line 1727
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1728
a=0;//     .restart local v3    # "child":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v9, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1730
a=0;//     .restart local v9    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v15, v9, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     if-eqz v15, :cond_5
a=0;// 
a=0;//     .line 1726
a=0;//     :goto_4
a=0;//     #v15=(Conflicted);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1732
a=0;//     :cond_5
a=0;//     #v15=(Boolean);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     sub-int/2addr v15, v12
a=0;// 
a=0;//     int-to-float v15, v15
a=0;// 
a=0;//     #v15=(Float);
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Float);
a=0;//     div-float v13, v15, v16
a=0;// 
a=0;//     .line 1733
a=0;//     .local v13, "transformPos":F
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v15, v0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     #v15=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     invoke-interface {v15, v3, v13}, Landroid/support/v4/view/ViewPager$PageTransformer;->transformPage(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1737
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     .end local v4    # "childCount":I
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .end local v12    # "scrollX":I
a=0;//     .end local v13    # "transformPos":F
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);v4=(Conflicted);v8=(Conflicted);v9=(Conflicted);v12=(Conflicted);v13=(Conflicted);v15=(Conflicted);v16=(Conflicted);
a=0;//     const/4 v15, 0x1
a=0;// 
a=0;//     #v15=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v15, v0, Landroid/support/v4/view/ViewPager;->mCalledSuper:Z
a=0;// 
a=0;//     .line 1738
a=0;//     return-void
a=0;// 
a=0;//     .line 1690
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
a=0;//     .locals 9
a=0;//     .param p1, "direction"    # I
a=0;//     .param p2, "previouslyFocusedRect"    # Landroid/graphics/Rect;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2698
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 2699
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v7, p1, 0x2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 2700
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 2701
a=0;//     .local v6, "index":I
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 2702
a=0;//     .local v5, "increment":I
a=0;//     #v5=(One);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 2708
a=0;//     .local v2, "end":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v5=(Byte);v6=(Integer);
a=0;//     move v3, v6
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Conflicted);v8=(Conflicted);
a=0;//     if-eq v3, v2, :cond_2
a=0;// 
a=0;//     .line 2709
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 2710
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 2711
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 2712
a=0;//     .local v4, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget v7, v4, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ne v7, v8, :cond_1
a=0;// 
a=0;//     .line 2713
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/view/View;->requestFocus(ILandroid/graphics/Rect;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 2714
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 2719
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v4    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);v8=(Conflicted);
a=0;//     return v7
a=0;// 
a=0;//     .line 2704
a=0;//     .end local v2    # "end":I
a=0;//     .end local v3    # "i":I
a=0;//     .end local v5    # "increment":I
a=0;//     .end local v6    # "index":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Integer);v8=(Uninit);
a=0;//     add-int/lit8 v6, v1, -0x1
a=0;// 
a=0;//     .line 2705
a=0;//     .restart local v6    # "index":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 2706
a=0;//     .restart local v5    # "increment":I
a=0;//     #v5=(Byte);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .restart local v2    # "end":I
a=0;//     #v2=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2708
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     .restart local v3    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);v2=(Integer);v3=(Integer);v4=(Conflicted);v8=(Conflicted);
a=0;//     add-int/2addr v3, v5
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 2719
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 4
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1277
a=0;//     instance-of v1, p1, Landroid/support/v4/view/ViewPager$SavedState;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1278
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1293
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 1282
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$SavedState;
a=0;// 
a=0;//     .line 1283
a=0;//     .local v0, "ss":Landroid/support/v4/view/ViewPager$SavedState;
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ViewPager$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1285
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1286
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Parcelable;);
a=0;//     iget-object v3, v0, Landroid/support/v4/view/ViewPager$SavedState;->loader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/ClassLoader;);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 1287
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0, v1, v2, v3}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1289
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);v2=(Uninit);v3=(Uninit);
a=0;//     iget v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 1290
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 1291
a=0;//     iget-object v1, v0, Landroid/support/v4/view/ViewPager$SavedState;->loader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1266
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1267
a=0;//     .local v1, "superState":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v0, Landroid/support/v4/view/ViewPager$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/ViewPager$SavedState;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1268
a=0;//     .local v0, "ss":Landroid/support/v4/view/ViewPager$SavedState;
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$SavedState;);
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Landroid/support/v4/view/ViewPager$SavedState;->position:I
a=0;// 
a=0;//     .line 1269
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1270
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->saveState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v4/view/ViewPager$SavedState;->adapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 1272
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 2
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;//     .param p3, "oldw"    # I
a=0;//     .param p4, "oldh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1464
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 1467
a=0;//     if-eq p1, p3, :cond_0
a=0;// 
a=0;//     .line 1468
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, p3, v0, v1}, Landroid/support/v4/view/ViewPager;->recomputeScrollPosition(IIII)V
a=0;// 
a=0;//     .line 1470
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 28
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1930
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mFakeDragging:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     if-eqz v24, :cond_0
a=0;// 
a=0;//     .line 1934
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     .line 2051
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     return v24
a=0;// 
a=0;//     .line 1937
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     if-nez v24, :cond_1
a=0;// 
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getEdgeFlags()I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     if-eqz v24, :cond_1
a=0;// 
a=0;//     .line 1940
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     #v24=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1943
a=0;//     :cond_1
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v24, :cond_2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     if-nez v24, :cond_3
a=0;// 
a=0;//     .line 1945
a=0;//     :cond_2
a=0;//     #v24=(Conflicted);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     #v24=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1948
a=0;//     :cond_3
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v24, :cond_4
a=0;// 
a=0;//     .line 1949
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput-object v0, v1, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1951
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1953
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1954
a=0;//     .local v5, "action":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 1956
a=0;//     .local v11, "needsInvalidate":Z
a=0;//     #v11=(Null);
a=0;//     and-int/lit16 v0, v5, 0xff
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     packed-switch v24, :pswitch_data_0
a=0;// 
a=0;//     .line 2048
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Boolean);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     if-eqz v11, :cond_6
a=0;// 
a=0;//     .line 2049
a=0;//     invoke-static/range {p0 .. p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 2051
a=0;//     :cond_6
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     #v24=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1958
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/MotionEvent;);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Null);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Integer);v25=(Uninit);v26=(Uninit);v27=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/widget/Scroller;->abortAnimation()V
a=0;// 
a=0;//     .line 1959
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     #v24=(Null);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 1960
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 1963
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Float);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1964
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mInitialMotionY:F
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1965
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     #v24=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1969
a=0;//     :pswitch_2
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     if-nez v24, :cond_7
a=0;// 
a=0;//     .line 1970
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1971
a=0;//     .local v15, "pointerIndex":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v15}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 1972
a=0;//     .local v20, "x":F
a=0;//     #v20=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     sub-float v24, v20, v24
a=0;// 
a=0;//     #v24=(Float);
a=0;//     invoke-static/range {v24 .. v24}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     .line 1973
a=0;//     .local v21, "xDiff":F
a=0;//     #v21=(Float);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v15}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 1974
a=0;//     .local v22, "y":F
a=0;//     #v22=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     sub-float v24, v22, v24
a=0;// 
a=0;//     #v24=(Float);
a=0;//     invoke-static/range {v24 .. v24}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 1976
a=0;//     .local v23, "yDiff":F
a=0;//     #v23=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Float);
a=0;//     cmpl-float v24, v21, v24
a=0;// 
a=0;//     #v24=(Byte);
a=0;//     if-lez v24, :cond_7
a=0;// 
a=0;//     cmpl-float v24, v21, v23
a=0;// 
a=0;//     if-lez v24, :cond_7
a=0;// 
a=0;//     .line 1978
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     #v24=(One);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     .line 1979
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->requestParentDisallowInterceptTouchEvent(Z)V
a=0;// 
a=0;//     .line 1980
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     sub-float v24, v20, v24
a=0;// 
a=0;//     #v24=(Float);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     cmpl-float v24, v24, v25
a=0;// 
a=0;//     #v24=(Byte);
a=0;//     if-lez v24, :cond_8
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Float);
a=0;//     add-float v24, v24, v25
a=0;// 
a=0;//     :goto_2
a=0;//     #v24=(Float);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 1982
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionY:F
a=0;// 
a=0;//     .line 1983
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     #v24=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 1984
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1987
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 1988
a=0;//     .local v14, "parent":Landroid/view/ViewParent;
a=0;//     #v14=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eqz v14, :cond_7
a=0;// 
a=0;//     .line 1989
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-interface {v14, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V
a=0;// 
a=0;//     .line 1994
a=0;//     .end local v14    # "parent":Landroid/view/ViewParent;
a=0;//     .end local v15    # "pointerIndex":I
a=0;//     .end local v20    # "x":F
a=0;//     .end local v21    # "xDiff":F
a=0;//     .end local v22    # "y":F
a=0;//     .end local v23    # "yDiff":F
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);v14=(Conflicted);v15=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Byte);v25=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     if-eqz v24, :cond_5
a=0;// 
a=0;//     .line 1996
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1998
a=0;//     .local v6, "activePointerIndex":I
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v6}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 1999
a=0;//     .restart local v20    # "x":F
a=0;//     #v20=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/view/ViewPager;->performDrag(F)Z
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     or-int v11, v11, v24
a=0;// 
a=0;//     .line 2000
a=0;//     #v11=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1980
a=0;//     .end local v6    # "activePointerIndex":I
a=0;//     .restart local v15    # "pointerIndex":I
a=0;//     .restart local v21    # "xDiff":F
a=0;//     .restart local v22    # "y":F
a=0;//     .restart local v23    # "yDiff":F
a=0;//     :cond_8
a=0;//     #v0=(Integer);v1=(One);v6=(Uninit);v11=(Null);v14=(Uninit);v15=(Integer);v21=(Float);v22=(Float);v23=(Float);v24=(Byte);v25=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Float);
a=0;//     sub-float v24, v24, v25
a=0;// 
a=0;//     #v24=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 2003
a=0;//     .end local v15    # "pointerIndex":I
a=0;//     .end local v20    # "x":F
a=0;//     .end local v21    # "xDiff":F
a=0;//     .end local v22    # "y":F
a=0;//     .end local v23    # "yDiff":F
a=0;//     :pswitch_3
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/MotionEvent;);v15=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Integer);v25=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     if-eqz v24, :cond_5
a=0;// 
a=0;//     .line 2004
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     .line 2005
a=0;//     .local v18, "velocityTracker":Landroid/view/VelocityTracker;
a=0;//     #v18=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v24, 0x3e8
a=0;// 
a=0;//     #v24=(PosShort);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mMaximumVelocity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Float);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     move/from16 v2, v25
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 2006
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Float);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v10, v0
a=0;// 
a=0;//     .line 2008
a=0;//     .local v10, "initialVelocity":I
a=0;//     #v10=(Integer);
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     #v24=(One);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 2009
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 2010
a=0;//     .local v19, "width":I
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 2011
a=0;//     .local v16, "scrollX":I
a=0;//     #v16=(Integer);
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->infoForCurrentScrollPosition()Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 2012
a=0;//     .local v8, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v8=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v7, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     .line 2013
a=0;//     .local v7, "currentPage":I
a=0;//     #v7=(Integer);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Float);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     div-float v24, v24, v25
a=0;// 
a=0;//     iget v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->offset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     sub-float v24, v24, v25
a=0;// 
a=0;//     iget v0, v8, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     div-float v13, v24, v25
a=0;// 
a=0;//     .line 2014
a=0;//     .local v13, "pageOffset":F
a=0;//     #v13=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 2016
a=0;//     .restart local v6    # "activePointerIndex":I
a=0;//     #v6=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v6}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 2017
a=0;//     .restart local v20    # "x":F
a=0;//     #v20=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mInitialMotionX:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     sub-float v24, v20, v24
a=0;// 
a=0;//     #v24=(Float);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     .line 2018
a=0;//     .local v17, "totalDelta":I
a=0;//     #v17=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     invoke-direct {v0, v7, v13, v10, v1}, Landroid/support/v4/view/ViewPager;->determineTargetPage(IFII)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 2020
a=0;//     .local v12, "nextPage":I
a=0;//     #v12=(Integer);
a=0;//     const/16 v24, 0x1
a=0;// 
a=0;//     #v24=(One);
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     #v25=(One);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(One);
a=0;//     move/from16 v2, v25
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v12, v1, v2, v10}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 2022
a=0;//     const/16 v24, -0x1
a=0;// 
a=0;//     #v24=(Byte);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 2023
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->endDrag()V
a=0;// 
a=0;//     .line 2024
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     or-int v11, v24, v25
a=0;// 
a=0;//     .line 2025
a=0;//     #v11=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2028
a=0;//     .end local v6    # "activePointerIndex":I
a=0;//     .end local v7    # "currentPage":I
a=0;//     .end local v8    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v10    # "initialVelocity":I
a=0;//     .end local v12    # "nextPage":I
a=0;//     .end local v13    # "pageOffset":F
a=0;//     .end local v16    # "scrollX":I
a=0;//     .end local v17    # "totalDelta":I
a=0;//     .end local v18    # "velocityTracker":Landroid/view/VelocityTracker;
a=0;//     .end local v19    # "width":I
a=0;//     .end local v20    # "x":F
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v2=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Null);v12=(Uninit);v13=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v24=(Integer);v25=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mIsBeingDragged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     if-eqz v24, :cond_5
a=0;// 
a=0;//     .line 2029
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     #v25=(One);
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     #v26=(Null);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v25
a=0;// 
a=0;//     #v2=(One);
a=0;//     move/from16 v3, v26
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move/from16 v4, v27
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V
a=0;// 
a=0;//     .line 2030
a=0;//     const/16 v24, -0x1
a=0;// 
a=0;//     #v24=(Byte);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     .line 2031
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->endDrag()V
a=0;// 
a=0;//     .line 2032
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mLeftEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mRightEdge:Landroid/support/v4/widget/EdgeEffectCompat;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,Landroid/support/v4/widget/EdgeEffectCompat;);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/support/v4/widget/EdgeEffectCompat;->onRelease()Z
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     or-int v11, v24, v25
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2036
a=0;//     :pswitch_5
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v11=(Null);v24=(Integer);v25=(Uninit);v26=(Uninit);v27=(Uninit);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 2037
a=0;//     .local v9, "index":I
a=0;//     #v9=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v9}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 2038
a=0;//     .restart local v20    # "x":F
a=0;//     #v20=(Float);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     .line 2039
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v9}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 2043
a=0;//     .end local v9    # "index":I
a=0;//     .end local v20    # "x":F
a=0;//     :pswitch_6
a=0;//     #v9=(Uninit);v20=(Uninit);
a=0;//     invoke-direct/range {p0 .. p1}, Landroid/support/v4/view/ViewPager;->onSecondaryPointerUp(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 2044
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     #v24=(Float);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mLastMotionX:F
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1956
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_5
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method pageLeft()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2611
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 2612
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 2615
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method pageRight()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 2619
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     if-ge v1, v2, :cond_0
a=0;// 
a=0;//     .line 2620
a=0;//     iget v1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     invoke-virtual {p0, v1, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(IZ)V
a=0;// 
a=0;//     .line 2623
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method populate()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 919
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->populate(I)V
a=0;// 
a=0;//     .line 920
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method populate(I)V
a=0;//     .locals 30
a=0;//     .param p1, "newCurrentItem"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 923
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .line 924
a=0;//     .local v21, "oldCurInfo":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v21=(Null);
a=0;//     const/4 v15, 0x2
a=0;// 
a=0;//     .line 925
a=0;//     .local v15, "focusDirection":I
a=0;//     #v15=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 926
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     if-ge v0, v1, :cond_2
a=0;// 
a=0;//     const/16 v15, 0x42
a=0;// 
a=0;//     .line 927
a=0;//     :goto_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->infoForPosition(I)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .line 928
a=0;//     #v21=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     .line 931
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-nez v27, :cond_3
a=0;// 
a=0;//     .line 932
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->sortChildDrawingOrder()V
a=0;// 
a=0;//     .line 1108
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v22=(Conflicted);v23=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 926
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Null);v22=(Uninit);v23=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Integer);v28=(Uninit);v29=(Uninit);
a=0;//     const/16 v15, 0x11
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 940
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);v1=(Conflicted);v21=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v27=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_4
a=0;// 
a=0;//     .line 942
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->sortChildDrawingOrder()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 949
a=0;//     :cond_4
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     #v27=(Reference,Landroid/os/IBinder;);
a=0;//     if-eqz v27, :cond_1
a=0;// 
a=0;//     .line 953
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 955
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v22, v0
a=0;// 
a=0;//     .line 956
a=0;//     .local v22, "pageLimit":I
a=0;//     #v22=(Integer);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     sub-int v28, v28, v22
a=0;// 
a=0;//     invoke-static/range {v27 .. v28}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     .line 957
a=0;//     .local v26, "startPos":I
a=0;//     #v26=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual/range {v27 .. v27}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 958
a=0;//     .local v4, "N":I
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v27, v4, -0x1
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     add-int v28, v28, v22
a=0;// 
a=0;//     invoke-static/range {v27 .. v28}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 960
a=0;//     .local v12, "endPos":I
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     if-eq v4, v0, :cond_5
a=0;// 
a=0;//     .line 963
a=0;//     :try_start_0
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     #v27=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getId()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v28}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .line 967
a=0;//     .local v24, "resName":Ljava/lang/String;
a=0;//     :goto_2
a=0;//     #v11=(Conflicted);v24=(Reference,Ljava/lang/String;);v27=(Conflicted);
a=0;//     new-instance v27, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v27=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v28, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v28=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v28 .. v28}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v28=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v29, "The application\'s PagerAdapter changed the adapter\'s contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: "
a=0;// 
a=0;//     #v29=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     const-string v29, ", found: "
a=0;// 
a=0;//     #v29=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     move-object/from16 v0, v28
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     const-string v29, " Pager id: "
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     move-object/from16 v0, v28
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     const-string v29, " Pager class: "
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v29
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     const-string v29, " Problematic adapter: "
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v29, v0
a=0;// 
a=0;//     invoke-virtual/range {v29 .. v29}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v29
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v29}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     invoke-virtual/range {v28 .. v28}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v28
a=0;// 
a=0;//     invoke-direct/range {v27 .. v28}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v27=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v27
a=0;// 
a=0;//     .line 964
a=0;//     .end local v24    # "resName":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Integer);v11=(Uninit);v24=(Uninit);v27=(Conflicted);v28=(Integer);v29=(Uninit);
a=0;//     move-exception v11
a=0;// 
a=0;//     .line 965
a=0;//     .local v11, "e":Landroid/content/res/Resources$NotFoundException;
a=0;//     #v11=(Reference,Landroid/content/res/Resources$NotFoundException;);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getId()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     .restart local v24    # "resName":Ljava/lang/String;
a=0;//     #v24=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 976
a=0;//     .end local v11    # "e":Landroid/content/res/Resources$NotFoundException;
a=0;//     .end local v24    # "resName":Ljava/lang/String;
a=0;//     :cond_5
a=0;//     #v11=(Uninit);v24=(Uninit);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     .line 977
a=0;//     .local v8, "curIndex":I
a=0;//     #v8=(Byte);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 978
a=0;//     .local v9, "curItem":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v9=(Null);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v8=(Integer);v17=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v8, v0, :cond_6
a=0;// 
a=0;//     .line 979
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v17, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 980
a=0;//     .local v17, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_c
a=0;// 
a=0;//     .line 981
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     move-object/from16 v9, v17
a=0;// 
a=0;//     .line 986
a=0;//     .end local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v9=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v17=(Conflicted);
a=0;//     if-nez v9, :cond_7
a=0;// 
a=0;//     if-lez v4, :cond_7
a=0;// 
a=0;//     .line 987
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v8}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 993
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     if-eqz v9, :cond_a
a=0;// 
a=0;//     .line 994
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .line 995
a=0;//     .local v13, "extraWidthLeft":F
a=0;//     #v13=(Null);
a=0;//     add-int/lit8 v18, v8, -0x1
a=0;// 
a=0;//     .line 996
a=0;//     .local v18, "itemIndex":I
a=0;//     #v18=(Integer);
a=0;//     if-ltz v18, :cond_d
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     check-cast v27, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v17, v27
a=0;// 
a=0;//     .line 997
a=0;//     .restart local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v27=(Conflicted);
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 998
a=0;//     .local v7, "clientWidth":I
a=0;//     #v7=(Integer);
a=0;//     if-gtz v7, :cond_e
a=0;// 
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     .line 1000
a=0;//     .local v19, "leftWidthNeeded":F
a=0;//     :goto_5
a=0;//     #v19=(Float);v29=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     add-int/lit8 v23, v27, -0x1
a=0;// 
a=0;//     .local v23, "pos":I
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v13=(Float);v23=(Integer);v27=(Conflicted);v28=(Conflicted);
a=0;//     if-ltz v23, :cond_8
a=0;// 
a=0;//     .line 1001
a=0;//     cmpl-float v27, v13, v19
a=0;// 
a=0;//     #v27=(Byte);
a=0;//     if-ltz v27, :cond_12
a=0;// 
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_12
a=0;// 
a=0;//     .line 1002
a=0;//     if-nez v17, :cond_f
a=0;// 
a=0;//     .line 1028
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v1=(Conflicted);v27=(Conflicted);
a=0;//     iget v14, v9, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     .line 1029
a=0;//     .local v14, "extraWidthRight":F
a=0;//     #v14=(Integer);
a=0;//     add-int/lit8 v18, v8, 0x1
a=0;// 
a=0;//     .line 1030
a=0;//     const/high16 v27, 0x40000000
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     cmpg-float v27, v14, v27
a=0;// 
a=0;//     #v27=(Byte);
a=0;//     if-gez v27, :cond_9
a=0;// 
a=0;//     .line 1031
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_16
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     check-cast v27, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v17, v27
a=0;// 
a=0;//     .line 1032
a=0;//     :goto_7
a=0;//     #v0=(Conflicted);v27=(Conflicted);
a=0;//     if-gtz v7, :cond_17
a=0;// 
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     .line 1034
a=0;//     .local v25, "rightWidthNeeded":F
a=0;//     :goto_8
a=0;//     #v25=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     add-int/lit8 v23, v27, 0x1
a=0;// 
a=0;//     :goto_9
a=0;//     #v0=(Conflicted);v27=(Conflicted);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v4, :cond_9
a=0;// 
a=0;//     .line 1035
a=0;//     cmpl-float v27, v14, v25
a=0;// 
a=0;//     #v27=(Byte);
a=0;//     if-ltz v27, :cond_1b
a=0;// 
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     if-le v0, v12, :cond_1b
a=0;// 
a=0;//     .line 1036
a=0;//     if-nez v17, :cond_18
a=0;// 
a=0;//     .line 1061
a=0;//     .end local v25    # "rightWidthNeeded":F
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v25=(Conflicted);v27=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move-object/from16 v1, v21
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     invoke-direct {v0, v9, v8, v1}, Landroid/support/v4/view/ViewPager;->calculatePageOffsets(Landroid/support/v4/view/ViewPager$ItemInfo;ILandroid/support/v4/view/ViewPager$ItemInfo;)V
a=0;// 
a=0;//     .line 1071
a=0;//     .end local v7    # "clientWidth":I
a=0;//     .end local v13    # "extraWidthLeft":F
a=0;//     .end local v14    # "extraWidthRight":F
a=0;//     .end local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v18    # "itemIndex":I
a=0;//     .end local v19    # "leftWidthNeeded":F
a=0;//     .end local v23    # "pos":I
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v1=(Conflicted);v7=(Conflicted);v13=(Conflicted);v14=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v23=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v28, v0
a=0;// 
a=0;//     #v28=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     if-eqz v9, :cond_1f
a=0;// 
a=0;//     iget-object v0, v9, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     :goto_a
a=0;//     #v0=(Conflicted);v27=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v28
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v2, v29
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v3, v27
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->setPrimaryItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1073
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 1077
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1078
a=0;//     .local v6, "childCount":I
a=0;//     #v6=(Integer);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .local v16, "i":I
a=0;//     :goto_b
a=0;//     #v0=(Conflicted);v5=(Conflicted);v16=(Integer);v20=(Conflicted);v27=(Conflicted);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v6, :cond_20
a=0;// 
a=0;//     .line 1079
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1080
a=0;//     .local v5, "child":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v20
a=0;// 
a=0;//     #v20=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v20, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 1081
a=0;//     .local v20, "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->childIndex:I
a=0;// 
a=0;//     .line 1082
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-nez v27, :cond_b
a=0;// 
a=0;//     move-object/from16 v0, v20
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     const/16 v28, 0x0
a=0;// 
a=0;//     #v28=(Null);
a=0;//     cmpl-float v27, v27, v28
a=0;// 
a=0;//     #v27=(Byte);
a=0;//     if-nez v27, :cond_b
a=0;// 
a=0;//     .line 1084
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 1085
a=0;//     .restart local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     #v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v17, :cond_b
a=0;// 
a=0;//     .line 1086
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F
a=0;// 
a=0;//     .line 1087
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     iput v0, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I
a=0;// 
a=0;//     .line 1078
a=0;//     .end local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v17=(Conflicted);v28=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     add-int/lit8 v16, v16, 0x1
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 978
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     .end local v6    # "childCount":I
a=0;//     .end local v16    # "i":I
a=0;//     .end local v20    # "lp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     .restart local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_c
a=0;//     #v0=(Integer);v1=(Integer);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Null);v13=(Uninit);v14=(Uninit);v16=(Uninit);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v18=(Uninit);v19=(Uninit);v20=(Uninit);v23=(Uninit);v25=(Uninit);v28=(Integer);v29=(Uninit);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 996
a=0;//     .end local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .restart local v13    # "extraWidthLeft":F
a=0;//     .restart local v18    # "itemIndex":I
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);v1=(Conflicted);v9=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v13=(Null);v17=(Conflicted);v18=(Integer);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 998
a=0;//     .restart local v7    # "clientWidth":I
a=0;//     .restart local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_e
a=0;//     #v7=(Integer);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v27=(Conflicted);
a=0;//     const/high16 v27, 0x40000000
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     iget v0, v9, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     sub-float v27, v27, v28
a=0;// 
a=0;//     #v27=(Float);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     move/from16 v0, v28
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Float);
a=0;//     int-to-float v0, v7
a=0;// 
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Float);
a=0;//     div-float v28, v28, v29
a=0;// 
a=0;//     add-float v19, v27, v28
a=0;// 
a=0;//     #v19=(Float);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 1005
a=0;//     .restart local v19    # "leftWidthNeeded":F
a=0;//     .restart local v23    # "pos":I
a=0;//     :cond_f
a=0;//     #v0=(Integer);v1=(Integer);v2=(Conflicted);v3=(Conflicted);v13=(Float);v23=(Integer);v27=(Byte);v28=(Conflicted);v29=(Conflicted);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     if-ne v0, v1, :cond_10
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-nez v27, :cond_10
a=0;// 
a=0;//     .line 1006
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1007
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     move-object/from16 v28, v0
a=0;// 
a=0;//     #v28=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v3, v28
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1012
a=0;//     add-int/lit8 v18, v18, -0x1
a=0;// 
a=0;//     .line 1013
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     .line 1014
a=0;//     if-ltz v18, :cond_11
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     check-cast v27, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v17, v27
a=0;// 
a=0;//     .line 1000
a=0;//     :cond_10
a=0;//     :goto_c
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v27=(Conflicted);v28=(Conflicted);
a=0;//     add-int/lit8 v23, v23, -0x1
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 1014
a=0;//     :cond_11
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);v1=(Reference,Landroid/support/v4/view/ViewPager;);v2=(Integer);v3=(Reference,Ljava/lang/Object;);v27=(Reference,Landroid/support/v4/view/PagerAdapter;);v28=(Reference,Ljava/lang/Object;);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 1016
a=0;//     :cond_12
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v27=(Byte);v28=(Conflicted);
a=0;//     if-eqz v17, :cond_14
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v0, v1, :cond_14
a=0;// 
a=0;//     .line 1017
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     add-float v13, v13, v27
a=0;// 
a=0;//     .line 1018
a=0;//     add-int/lit8 v18, v18, -0x1
a=0;// 
a=0;//     .line 1019
a=0;//     if-ltz v18, :cond_13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     check-cast v27, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v17, v27
a=0;// 
a=0;//     :goto_d
a=0;//     #v0=(Conflicted);v27=(Conflicted);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :cond_13
a=0;//     #v0=(Integer);v27=(Integer);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     goto :goto_d
a=0;// 
a=0;//     .line 1021
a=0;//     :cond_14
a=0;//     #v0=(Conflicted);v1=(Conflicted);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     add-int/lit8 v27, v18, 0x1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v27
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 1022
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     add-float v13, v13, v27
a=0;// 
a=0;//     .line 1023
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     .line 1024
a=0;//     if-ltz v18, :cond_15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     check-cast v27, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v17, v27
a=0;// 
a=0;//     :goto_e
a=0;//     #v0=(Conflicted);v27=(Conflicted);
a=0;//     goto :goto_c
a=0;// 
a=0;//     :cond_15
a=0;//     #v0=(Integer);v27=(Integer);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     goto :goto_e
a=0;// 
a=0;//     .line 1031
a=0;//     .restart local v14    # "extraWidthRight":F
a=0;//     :cond_16
a=0;//     #v2=(Conflicted);v14=(Integer);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 1032
a=0;//     :cond_17
a=0;//     #v0=(Conflicted);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v27=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getPaddingRight()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Float);
a=0;//     int-to-float v0, v7
a=0;// 
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Float);
a=0;//     div-float v27, v27, v28
a=0;// 
a=0;//     const/high16 v28, 0x40000000
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     add-float v25, v27, v28
a=0;// 
a=0;//     #v25=(Float);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 1039
a=0;//     .restart local v25    # "rightWidthNeeded":F
a=0;//     :cond_18
a=0;//     #v0=(Integer);v27=(Byte);v28=(Conflicted);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     if-ne v0, v1, :cond_19
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-nez v27, :cond_19
a=0;// 
a=0;//     .line 1040
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 1041
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     move-object/from16 v28, v0
a=0;// 
a=0;//     #v28=(Reference,Ljava/lang/Object;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v3, v28
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 1046
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1a
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     check-cast v27, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v17, v27
a=0;// 
a=0;//     .line 1034
a=0;//     :cond_19
a=0;//     :goto_f
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v27=(Conflicted);v28=(Conflicted);
a=0;//     add-int/lit8 v23, v23, 0x1
a=0;// 
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 1046
a=0;//     :cond_1a
a=0;//     #v0=(Integer);v2=(Integer);v3=(Reference,Ljava/lang/Object;);v27=(Integer);v28=(Reference,Ljava/lang/Object;);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     goto :goto_f
a=0;// 
a=0;//     .line 1048
a=0;//     :cond_1b
a=0;//     #v2=(Conflicted);v3=(Conflicted);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);v27=(Byte);v28=(Conflicted);
a=0;//     if-eqz v17, :cond_1d
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     if-ne v0, v1, :cond_1d
a=0;// 
a=0;//     .line 1049
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     add-float v14, v14, v27
a=0;// 
a=0;//     .line 1050
a=0;//     #v14=(Float);
a=0;//     add-int/lit8 v18, v18, 0x1
a=0;// 
a=0;//     .line 1051
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     if-ge v0, v1, :cond_1c
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     check-cast v27, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v17, v27
a=0;// 
a=0;//     :goto_10
a=0;//     #v0=(Conflicted);v27=(Conflicted);
a=0;//     goto :goto_f
a=0;// 
a=0;//     :cond_1c
a=0;//     #v0=(Integer);v27=(Integer);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     goto :goto_10
a=0;// 
a=0;//     .line 1053
a=0;//     :cond_1d
a=0;//     #v14=(Integer);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/ViewPager;->addNewItem(II)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 1054
a=0;//     add-int/lit8 v18, v18, 0x1
a=0;// 
a=0;//     .line 1055
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->widthFactor:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     add-float v14, v14, v27
a=0;// 
a=0;//     .line 1056
a=0;//     #v14=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual/range {v27 .. v27}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     if-ge v0, v1, :cond_1e
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     check-cast v27, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-object/from16 v17, v27
a=0;// 
a=0;//     :goto_11
a=0;//     #v0=(Conflicted);v27=(Conflicted);
a=0;//     goto :goto_f
a=0;// 
a=0;//     :cond_1e
a=0;//     #v0=(Integer);v27=(Integer);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     goto :goto_11
a=0;// 
a=0;//     .line 1071
a=0;//     .end local v7    # "clientWidth":I
a=0;//     .end local v13    # "extraWidthLeft":F
a=0;//     .end local v14    # "extraWidthRight":F
a=0;//     .end local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .end local v18    # "itemIndex":I
a=0;//     .end local v19    # "leftWidthNeeded":F
a=0;//     .end local v23    # "pos":I
a=0;//     .end local v25    # "rightWidthNeeded":F
a=0;//     :cond_1f
a=0;//     #v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);v13=(Conflicted);v14=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v23=(Conflicted);v25=(Conflicted);v27=(Conflicted);v28=(Reference,Landroid/support/v4/view/PagerAdapter;);v29=(Integer);
a=0;//     const/16 v27, 0x0
a=0;// 
a=0;//     #v27=(Null);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .line 1091
a=0;//     .restart local v6    # "childCount":I
a=0;//     .restart local v16    # "i":I
a=0;//     :cond_20
a=0;//     #v1=(Reference,Ujava/lang/Object;);v2=(Integer);v3=(Reference,Ljava/lang/Object;);v5=(Conflicted);v6=(Integer);v16=(Integer);v20=(Conflicted);v27=(Conflicted);
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->sortChildDrawingOrder()V
a=0;// 
a=0;//     .line 1093
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->hasFocus()Z
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_1
a=0;// 
a=0;//     .line 1094
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->findFocus()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 1095
a=0;//     .local v10, "currentFocused":Landroid/view/View;
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     if-eqz v10, :cond_23
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0, v10}, Landroid/support/v4/view/ViewPager;->infoForAnyChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 1096
a=0;//     .restart local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :goto_12
a=0;//     #v0=(Conflicted);v17=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     if-eqz v17, :cond_21
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$ItemInfo;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     .line 1097
a=0;//     :cond_21
a=0;//     #v0=(Conflicted);v1=(Conflicted);v28=(Conflicted);
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     :goto_13
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 1098
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1099
a=0;//     .restart local v5    # "child":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v4/view/ViewPager;->infoForChild(Landroid/view/View;)Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     .line 1100
a=0;//     if-eqz v17, :cond_22
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget v0, v0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     if-ne v0, v1, :cond_22
a=0;// 
a=0;//     .line 1101
a=0;//     invoke-virtual {v5, v15}, Landroid/view/View;->requestFocus(I)Z
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-nez v27, :cond_1
a=0;// 
a=0;//     .line 1097
a=0;//     :cond_22
a=0;//     #v0=(Conflicted);v27=(Integer);v28=(Conflicted);
a=0;//     add-int/lit8 v16, v16, 0x1
a=0;// 
a=0;//     goto :goto_13
a=0;// 
a=0;//     .line 1095
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     .end local v17    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_23
a=0;//     #v0=(Integer);v1=(Reference,Ujava/lang/Object;);v5=(Conflicted);v17=(Conflicted);v27=(Boolean);v28=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     #v17=(Null);
a=0;//     goto :goto_12
a=0;// .end method
a=0;// 
a=0;// .method public removeView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1323
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mInLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1324
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->removeViewInLayout(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1328
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1326
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/support/v4/view/PagerAdapter;)V
a=0;//     .locals 10
a=0;//     .param p1, "adapter"    # Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 413
a=0;//     #v7=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 414
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v4/view/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 415
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Landroid/support/v4/view/PagerAdapter;->startUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 416
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ge v0, v4, :cond_0
a=0;// 
a=0;//     .line 417
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .line 418
a=0;//     .local v1, "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget v5, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, v1, Landroid/support/v4/view/ViewPager$ItemInfo;->object:Ljava/lang/Object;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v4, p0, v5, v6}, Landroid/support/v4/view/PagerAdapter;->destroyItem(Landroid/view/ViewGroup;ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 416
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 420
a=0;//     .end local v1    # "ii":Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v4, p0}, Landroid/support/v4/view/PagerAdapter;->finishUpdate(Landroid/view/ViewGroup;)V
a=0;// 
a=0;//     .line 421
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 422
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->removeNonDecorViews()V
a=0;// 
a=0;//     .line 423
a=0;//     iput v7, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     .line 424
a=0;//     invoke-virtual {p0, v7, v7}, Landroid/support/v4/view/ViewPager;->scrollTo(II)V
a=0;// 
a=0;//     .line 427
a=0;//     .end local v0    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .line 428
a=0;//     .local v2, "oldAdapter":Landroid/support/v4/view/PagerAdapter;
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .line 429
a=0;//     iput v7, p0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     .line 431
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 432
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 433
a=0;//     new-instance v4, Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-direct {v4, p0, v8}, Landroid/support/v4/view/ViewPager$PagerObserver;-><init>(Landroid/support/v4/view/ViewPager;Landroid/support/v4/view/ViewPager$1;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     iput-object v4, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     .line 435
a=0;//     :cond_2
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mObserver:Landroid/support/v4/view/ViewPager$PagerObserver;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v4/view/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 436
a=0;//     iput-boolean v7, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 437
a=0;//     iget-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 438
a=0;//     .local v3, "wasFirstLayout":Z
a=0;//     #v3=(Boolean);
a=0;//     iput-boolean v9, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     .line 439
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v4/view/ViewPager;->mExpectedAdapterCount:I
a=0;// 
a=0;//     .line 440
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     if-ltz v4, :cond_5
a=0;// 
a=0;//     .line 441
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/ClassLoader;);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/support/v4/view/PagerAdapter;->restoreState(Landroid/os/Parcelable;Ljava/lang/ClassLoader;)V
a=0;// 
a=0;//     .line 442
a=0;//     iget v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v4, v7, v9}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 443
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     iput v4, p0, Landroid/support/v4/view/ViewPager;->mRestoredCurItem:I
a=0;// 
a=0;//     .line 444
a=0;//     iput-object v8, p0, Landroid/support/v4/view/ViewPager;->mRestoredAdapterState:Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 445
a=0;//     iput-object v8, p0, Landroid/support/v4/view/ViewPager;->mRestoredClassLoader:Ljava/lang/ClassLoader;
a=0;// 
a=0;//     .line 453
a=0;//     .end local v3    # "wasFirstLayout":Z
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     if-eq v2, p1, :cond_4
a=0;// 
a=0;//     .line 454
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     invoke-interface {v4, v2, p1}, Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;->onAdapterChanged(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 456
a=0;//     :cond_4
a=0;//     return-void
a=0;// 
a=0;//     .line 446
a=0;//     .restart local v3    # "wasFirstLayout":Z
a=0;//     :cond_5
a=0;//     #v3=(Boolean);v4=(Integer);v5=(Reference,Landroid/support/v4/view/ViewPager$PagerObserver;);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 449
a=0;//     :cond_6
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method setChildrenDrawingOrderEnabledCompat(Z)V
a=0;//     .locals 6
a=0;//     .param p1, "enable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 628
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_1
a=0;// 
a=0;//     .line 629
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/reflect/Method;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 631
a=0;//     :try_start_0
a=0;//     const-class v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     const-string v2, "setChildrenDrawingOrderEnabled"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljava/lang/Class;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Class;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 638
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     :try_start_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mSetChildrenDrawingOrderEnabled:Ljava/lang/reflect/Method;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljava/lang/Object;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Boolean;);
a=0;//     aput-object v4, v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 643
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 633
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Reference,Ujava/lang/Object;);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 634
a=0;//     .local v0, "e":Ljava/lang/NoSuchMethodException;
a=0;//     #v0=(Reference,Ljava/lang/NoSuchMethodException;);
a=0;//     const-string v1, "ViewPager"
a=0;// 
a=0;//     const-string v2, "Can\'t find setChildrenDrawingOrderEnabled"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 639
a=0;//     .end local v0    # "e":Ljava/lang/NoSuchMethodException;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 640
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "ViewPager"
a=0;// 
a=0;//     const-string v2, "Error changing children drawing order"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(I)V
a=0;//     .locals 2
a=0;//     .param p1, "item"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 494
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 495
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p0, p1, v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 496
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 495
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentItem(IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 505
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/ViewPager;->mPopulatePending:Z
a=0;// 
a=0;//     .line 506
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZ)V
a=0;// 
a=0;//     .line 507
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setCurrentItemInternal(IZZ)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;//     .param p3, "always"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 514
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItemInternal(IZZI)V
a=0;// 
a=0;//     .line 515
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setCurrentItemInternal(IZZI)V
a=0;//     .locals 5
a=0;//     .param p1, "item"    # I
a=0;//     .param p2, "smoothScroll"    # Z
a=0;//     .param p3, "always"    # Z
a=0;//     .param p4, "velocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 518
a=0;//     #v4=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-gtz v3, :cond_1
a=0;// 
a=0;//     .line 519
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     invoke-direct {p0, v4}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 558
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 522
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Integer);
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-ne v3, p1, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 523
a=0;//     invoke-direct {p0, v4}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 527
a=0;//     :cond_2
a=0;//     if-gez p1, :cond_5
a=0;// 
a=0;//     .line 528
a=0;//     const/4 p1, 0x0
a=0;// 
a=0;//     .line 532
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     iget v2, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 533
a=0;//     .local v2, "pageLimit":I
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     add-int/2addr v3, v2
a=0;// 
a=0;//     if-gt p1, v3, :cond_4
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     sub-int/2addr v3, v2
a=0;// 
a=0;//     if-ge p1, v3, :cond_6
a=0;// 
a=0;//     .line 537
a=0;//     :cond_4
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v1, v3, :cond_6
a=0;// 
a=0;//     .line 538
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     iput-boolean v0, v3, Landroid/support/v4/view/ViewPager$ItemInfo;->scrolling:Z
a=0;// 
a=0;//     .line 537
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 529
a=0;//     .end local v1    # "i":I
a=0;//     .end local v2    # "pageLimit":I
a=0;//     :cond_5
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt p1, v3, :cond_3
a=0;// 
a=0;//     .line 530
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 p1, v3, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 541
a=0;//     .restart local v2    # "pageLimit":I
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     if-eq v3, p1, :cond_9
a=0;// 
a=0;//     .line 543
a=0;//     .local v0, "dispatchSelected":Z
a=0;//     :goto_3
a=0;//     #v0=(Boolean);
a=0;//     iget-boolean v3, p0, Landroid/support/v4/view/ViewPager;->mFirstLayout:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_a
a=0;// 
a=0;//     .line 546
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     .line 547
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 548
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 550
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v0, :cond_8
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 551
a=0;//     iget-object v3, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/view/ViewPager$OnPageChangeListener;->onPageSelected(I)V
a=0;// 
a=0;//     .line 553
a=0;//     :cond_8
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "dispatchSelected":Z
a=0;//     :cond_9
a=0;//     #v0=(One);v3=(Integer);
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 541
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 555
a=0;//     .restart local v0    # "dispatchSelected":Z
a=0;//     :cond_a
a=0;//     #v0=(Boolean);v3=(Boolean);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/view/ViewPager;->populate(I)V
a=0;// 
a=0;//     .line 556
a=0;//     invoke-direct {p0, p1, p2, p4, v0}, Landroid/support/v4/view/ViewPager;->scrollToItem(IZIZ)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 659
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 660
a=0;//     .local v0, "oldListener":Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager$OnPageChangeListener;);
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mInternalPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 661
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setOffscreenPageLimit(I)V
a=0;//     .locals 4
a=0;//     .param p1, "limit"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 693
a=0;//     #v3=(One);
a=0;//     if-ge p1, v3, :cond_0
a=0;// 
a=0;//     .line 694
a=0;//     const-string v0, "ViewPager"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Requested offscreen page limit "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " too small; defaulting to "
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 696
a=0;//     const/4 p1, 0x1
a=0;// 
a=0;//     .line 698
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     .line 699
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mOffscreenPageLimit:I
a=0;// 
a=0;//     .line 700
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 702
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mAdapterChangeListener:Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// 
a=0;//     .line 480
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 597
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mOnPageChangeListener:Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 598
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPageMargin(I)V
a=0;//     .locals 2
a=0;//     .param p1, "marginPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     iget v0, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     .line 714
a=0;//     .local v0, "oldMargin":I
a=0;//     #v0=(Integer);
a=0;//     iput p1, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     .line 716
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 717
a=0;//     .local v1, "width":I
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v1, v1, p1, v0}, Landroid/support/v4/view/ViewPager;->recomputeScrollPosition(IIII)V
a=0;// 
a=0;//     .line 719
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->requestLayout()V
a=0;// 
a=0;//     .line 720
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPageMarginDrawable(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 749
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 750
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPageMarginDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 737
a=0;//     iput-object p1, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 738
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->refreshDrawableState()V
a=0;// 
a=0;//     .line 739
a=0;//     :cond_0
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 740
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->invalidate()V
a=0;// 
a=0;//     .line 741
a=0;//     return-void
a=0;// 
a=0;//     .line 739
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setPageTransformer(ZLandroid/support/v4/view/ViewPager$PageTransformer;)V
a=0;//     .locals 6
a=0;//     .param p1, "reverseDrawingOrder"    # Z
a=0;//     .param p2, "transformer"    # Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 613
a=0;//     #v3=(Null);
a=0;//     sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0xb
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-lt v4, v5, :cond_1
a=0;// 
a=0;//     .line 614
a=0;//     if-eqz p2, :cond_2
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 615
a=0;//     .local v0, "hasTransformer":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v4, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     move v4, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     if-eq v0, v4, :cond_4
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 616
a=0;//     .local v1, "needsPopulate":Z
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     iput-object p2, p0, Landroid/support/v4/view/ViewPager;->mPageTransformer:Landroid/support/v4/view/ViewPager$PageTransformer;
a=0;// 
a=0;//     .line 617
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/ViewPager;->setChildrenDrawingOrderEnabledCompat(Z)V
a=0;// 
a=0;//     .line 618
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 619
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(PosByte);
a=0;//     iput v2, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     .line 623
a=0;//     :goto_3
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 625
a=0;//     .end local v0    # "hasTransformer":Z
a=0;//     .end local v1    # "needsPopulate":Z
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 614
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v0    # "hasTransformer":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v4=(Reference,Landroid/support/v4/view/ViewPager$PageTransformer;);
a=0;//     move v4, v3
a=0;// 
a=0;//     .line 615
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Boolean);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 621
a=0;//     .restart local v1    # "needsPopulate":Z
a=0;//     :cond_5
a=0;//     #v1=(Boolean);
a=0;//     iput v3, p0, Landroid/support/v4/view/ViewPager;->mDrawingOrder:I
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method smoothScrollTo(II)V
a=0;//     .locals 1
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 783
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/view/ViewPager;->smoothScrollTo(III)V
a=0;// 
a=0;//     .line 784
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method smoothScrollTo(III)V
a=0;//     .locals 15
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;//     .param p3, "velocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 794
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 796
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 832
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/widget/Scroller;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 799
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 800
a=0;//     .local v2, "sx":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->getScrollY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 801
a=0;//     .local v3, "sy":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, p1, v2
a=0;// 
a=0;//     .line 802
a=0;//     .local v4, "dx":I
a=0;//     #v4=(Integer);
a=0;//     sub-int v5, p2, v3
a=0;// 
a=0;//     .line 803
a=0;//     .local v5, "dy":I
a=0;//     #v5=(Integer);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 804
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->completeScroll(Z)V
a=0;// 
a=0;//     .line 805
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/ViewPager;->populate()V
a=0;// 
a=0;//     .line 806
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 810
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 811
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/view/ViewPager;->setScrollState(I)V
a=0;// 
a=0;//     .line 813
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/ViewPager;->getClientWidth()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 814
a=0;//     .local v12, "width":I
a=0;//     #v12=(Integer);
a=0;//     div-int/lit8 v9, v12, 0x2
a=0;// 
a=0;//     .line 815
a=0;//     .local v9, "halfWidth":I
a=0;//     #v9=(Integer);
a=0;//     const/high16 v1, 0x3f800000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v13, 0x3f800000
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     int-to-float v14, v14
a=0;// 
a=0;//     #v14=(Float);
a=0;//     mul-float/2addr v13, v14
a=0;// 
a=0;//     #v13=(Float);
a=0;//     int-to-float v14, v12
a=0;// 
a=0;//     div-float/2addr v13, v14
a=0;// 
a=0;//     invoke-static {v1, v13}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 816
a=0;//     .local v8, "distanceRatio":F
a=0;//     #v8=(Float);
a=0;//     int-to-float v1, v9
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v13, v9
a=0;// 
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v4/view/ViewPager;->distanceInfluenceForSnapDuration(F)F
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     mul-float/2addr v13, v14
a=0;// 
a=0;//     add-float v7, v1, v13
a=0;// 
a=0;//     .line 819
a=0;//     .local v7, "distance":F
a=0;//     #v7=(Float);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 820
a=0;//     .local v6, "duration":I
a=0;//     #v6=(Null);
a=0;//     invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result p3
a=0;// 
a=0;//     .line 821
a=0;//     if-lez p3, :cond_2
a=0;// 
a=0;//     .line 822
a=0;//     const/high16 v1, 0x447a0000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v13, v0
a=0;// 
a=0;//     div-float v13, v7, v13
a=0;// 
a=0;//     invoke-static {v13}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     mul-float/2addr v1, v13
a=0;// 
a=0;//     #v1=(Float);
a=0;//     invoke-static {v1}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-int/lit8 v6, v1, 0x4
a=0;// 
a=0;//     .line 828
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v6=(Integer);v10=(Conflicted);v11=(Conflicted);v13=(Integer);v14=(Integer);
a=0;//     const/16 v1, 0x258
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 830
a=0;//     iget-object v1, p0, Landroid/support/v4/view/ViewPager;->mScroller:Landroid/widget/Scroller;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/Scroller;);
a=0;//     invoke-virtual/range {v1 .. v6}, Landroid/widget/Scroller;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 831
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 824
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Float);v6=(Null);v10=(Uninit);v11=(Uninit);v13=(Float);v14=(Float);
a=0;//     int-to-float v1, v12
a=0;// 
a=0;//     iget-object v13, p0, Landroid/support/v4/view/ViewPager;->mAdapter:Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     #v13=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget v14, p0, Landroid/support/v4/view/ViewPager;->mCurItem:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual {v13, v14}, Landroid/support/v4/view/PagerAdapter;->getPageWidth(I)F
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     mul-float v11, v1, v13
a=0;// 
a=0;//     .line 825
a=0;//     .local v11, "pageWidth":F
a=0;//     #v11=(Float);
a=0;//     invoke-static {v4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v13, p0, Landroid/support/v4/view/ViewPager;->mPageMargin:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     int-to-float v13, v13
a=0;// 
a=0;//     #v13=(Float);
a=0;//     add-float/2addr v13, v11
a=0;// 
a=0;//     div-float v10, v1, v13
a=0;// 
a=0;//     .line 826
a=0;//     .local v10, "pageDelta":F
a=0;//     #v10=(Float);
a=0;//     const/high16 v1, 0x3f800000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-float/2addr v1, v10
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v13, 0x42c80000
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     mul-float/2addr v1, v13
a=0;// 
a=0;//     float-to-int v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;//     .locals 1
a=0;//     .param p1, "who"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 754
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->verifyDrawable(Landroid/graphics/drawable/Drawable;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/view/ViewPager;->mMarginDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-ne p1, v0, :cond_1
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
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
