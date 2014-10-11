package android.support.v4.widget; class AutoScrollHelper { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/widget/AutoScrollHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "AutoScrollHelper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnTouchListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/AutoScrollHelper$1;,
a=0;//         Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;,
a=0;//         Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_ACTIVATION_DELAY:I
a=0;// 
a=0;// .field private static final DEFAULT_EDGE_TYPE:I = 0x1
a=0;// 
a=0;// .field private static final DEFAULT_MAXIMUM_EDGE:F = 3.4028235E38f
a=0;// 
a=0;// .field private static final DEFAULT_MAXIMUM_VELOCITY_DIPS:I = 0x627
a=0;// 
a=0;// .field private static final DEFAULT_MINIMUM_VELOCITY_DIPS:I = 0x13b
a=0;// 
a=0;// .field private static final DEFAULT_RAMP_DOWN_DURATION:I = 0x1f4
a=0;// 
a=0;// .field private static final DEFAULT_RAMP_UP_DURATION:I = 0x1f4
a=0;// 
a=0;// .field private static final DEFAULT_RELATIVE_EDGE:F = 0.2f
a=0;// 
a=0;// .field private static final DEFAULT_RELATIVE_VELOCITY:F = 1.0f
a=0;// 
a=0;// .field public static final EDGE_TYPE_INSIDE:I = 0x0
a=0;// 
a=0;// .field public static final EDGE_TYPE_INSIDE_EXTEND:I = 0x1
a=0;// 
a=0;// .field public static final EDGE_TYPE_OUTSIDE:I = 0x2
a=0;// 
a=0;// .field private static final HORIZONTAL:I = 0x0
a=0;// 
a=0;// .field public static final NO_MAX:F = 3.4028235E38f
a=0;// 
a=0;// .field public static final NO_MIN:F = 0.0f
a=0;// 
a=0;// .field public static final RELATIVE_UNSPECIFIED:F = 0.0f
a=0;// 
a=0;// .field private static final VERTICAL:I = 0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivationDelay:I
a=0;// 
a=0;// .field private mAlreadyDelayed:Z
a=0;// 
a=0;// .field private mAnimating:Z
a=0;// 
a=0;// .field private final mEdgeInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// .field private mEdgeType:I
a=0;// 
a=0;// .field private mEnabled:Z
a=0;// 
a=0;// .field private mExclusive:Z
a=0;// 
a=0;// .field private mMaximumEdges:[F
a=0;// 
a=0;// .field private mMaximumVelocity:[F
a=0;// 
a=0;// .field private mMinimumVelocity:[F
a=0;// 
a=0;// .field private mNeedsCancel:Z
a=0;// 
a=0;// .field private mNeedsReset:Z
a=0;// 
a=0;// .field private mRelativeEdges:[F
a=0;// 
a=0;// .field private mRelativeVelocity:[F
a=0;// 
a=0;// .field private mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private final mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;// .field private final mTarget:Landroid/view/View;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 194
a=0;//     invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Landroid/support/v4/widget/AutoScrollHelper;->DEFAULT_ACTIVATION_DELAY:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/View;)V
a=0;//     .locals 9
a=0;//     .param p1, "target"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const v8, 0x7f7fffff
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/high16 v7, 0x3f800000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/high16 v6, 0x3f000000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const v5, 0x3e4ccccd
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     .line 209
a=0;//     #v4=(PosByte);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 137
a=0;//     #p0=(Reference,Landroid/support/v4/widget/AutoScrollHelper;);
a=0;//     new-instance v3, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     invoke-direct {v3}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     .line 140
a=0;//     new-instance v3, Landroid/view/animation/AccelerateInterpolator;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     invoke-direct {v3}, Landroid/view/animation/AccelerateInterpolator;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/animation/AccelerateInterpolator;);
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     .line 149
a=0;//     new-array v3, v4, [F
a=0;// 
a=0;//     fill-array-data v3, :array_0
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F
a=0;// 
a=0;//     .line 152
a=0;//     new-array v3, v4, [F
a=0;// 
a=0;//     fill-array-data v3, :array_1
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F
a=0;// 
a=0;//     .line 161
a=0;//     new-array v3, v4, [F
a=0;// 
a=0;//     fill-array-data v3, :array_2
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F
a=0;// 
a=0;//     .line 164
a=0;//     new-array v3, v4, [F
a=0;// 
a=0;//     fill-array-data v3, :array_3
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F
a=0;// 
a=0;//     .line 167
a=0;//     new-array v3, v4, [F
a=0;// 
a=0;//     fill-array-data v3, :array_4
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F
a=0;// 
a=0;//     .line 210
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     .line 212
a=0;//     invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 213
a=0;//     .local v1, "metrics":Landroid/util/DisplayMetrics;
a=0;//     #v1=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     const v3, 0x44c4e000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-float/2addr v3, v6
a=0;// 
a=0;//     float-to-int v0, v3
a=0;// 
a=0;//     .line 214
a=0;//     .local v0, "maxVelocity":I
a=0;//     #v0=(Integer);
a=0;//     const v3, 0x439d8000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     mul-float/2addr v3, v4
a=0;// 
a=0;//     #v3=(Float);
a=0;//     add-float/2addr v3, v6
a=0;// 
a=0;//     float-to-int v2, v3
a=0;// 
a=0;//     .line 215
a=0;//     .local v2, "minVelocity":I
a=0;//     #v2=(Integer);
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {p0, v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->setMaximumVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .line 216
a=0;//     int-to-float v3, v2
a=0;// 
a=0;//     int-to-float v4, v2
a=0;// 
a=0;//     invoke-virtual {p0, v3, v4}, Landroid/support/v4/widget/AutoScrollHelper;->setMinimumVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .line 218
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/AutoScrollHelper;->setEdgeType(I)Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .line 219
a=0;//     invoke-virtual {p0, v8, v8}, Landroid/support/v4/widget/AutoScrollHelper;->setMaximumEdges(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .line 220
a=0;//     invoke-virtual {p0, v5, v5}, Landroid/support/v4/widget/AutoScrollHelper;->setRelativeEdges(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {p0, v7, v7}, Landroid/support/v4/widget/AutoScrollHelper;->setRelativeVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .line 222
a=0;//     sget v3, Landroid/support/v4/widget/AutoScrollHelper;->DEFAULT_ACTIVATION_DELAY:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/AutoScrollHelper;->setActivationDelay(I)Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .line 223
a=0;//     const/16 v3, 0x1f4
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/AutoScrollHelper;->setRampUpDuration(I)Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .line 224
a=0;//     const/16 v3, 0x1f4
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/AutoScrollHelper;->setRampDownDuration(I)Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .line 225
a=0;//     return-void
a=0;// 
a=0;//     .line 149
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x0
a=0;//     .end array-data
a=0;// 
a=0;//     .line 152
a=0;//     :array_1
a=0;//     .array-data 4
a=0;//         0x7f7fffff
a=0;//         0x7f7fffff
a=0;//     .end array-data
a=0;// 
a=0;//     .line 161
a=0;//     :array_2
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x0
a=0;//     .end array-data
a=0;// 
a=0;//     .line 164
a=0;//     :array_3
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x0
a=0;//     .end array-data
a=0;// 
a=0;//     .line 167
a=0;//     :array_4
a=0;//     .array-data 4
a=0;//         0x7f7fffff
a=0;//         0x7f7fffff
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/widget/AutoScrollHelper;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$102(Landroid/support/v4/widget/AutoScrollHelper;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/widget/AutoScrollHelper;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$202(Landroid/support/v4/widget/AutoScrollHelper;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/widget/AutoScrollHelper;)Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v4/widget/AutoScrollHelper;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->shouldAnimate()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Landroid/support/v4/widget/AutoScrollHelper;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsCancel:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$502(Landroid/support/v4/widget/AutoScrollHelper;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsCancel:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Landroid/support/v4/widget/AutoScrollHelper;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->cancelTargetTouch()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Landroid/support/v4/widget/AutoScrollHelper;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/AutoScrollHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$800(III)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # I
a=0;//     .param p1, "x1"    # I
a=0;//     .param p2, "x2"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-static {p0, p1, p2}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(III)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$900(FFF)F
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # F
a=0;//     .param p1, "x1"    # F
a=0;//     .param p2, "x2"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-static {p0, p1, p2}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private cancelTargetTouch()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 677
a=0;//     #v5=(Null);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 678
a=0;//     .local v0, "eventTime":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-wide v2, v0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     move v6, v5
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-static/range {v0 .. v7}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 680
a=0;//     .local v8, "cancel":Landroid/view/MotionEvent;
a=0;//     #v8=(Reference,Landroid/view/MotionEvent;);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2, v8}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 681
a=0;//     invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 682
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private computeTargetVelocity(IFFF)F
a=0;//     .locals 9
a=0;//     .param p1, "direction"    # I
a=0;//     .param p2, "coordinate"    # F
a=0;//     .param p3, "srcSize"    # F
a=0;//     .param p4, "dstSize"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 539
a=0;//     #v7=(Null);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F
a=0;// 
a=0;//     #v8=(Reference,[F);
a=0;//     aget v3, v8, p1
a=0;// 
a=0;//     .line 540
a=0;//     .local v3, "relativeEdge":F
a=0;//     #v3=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F
a=0;// 
a=0;//     aget v0, v8, p1
a=0;// 
a=0;//     .line 541
a=0;//     .local v0, "maximumEdge":F
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v3, p3, v0, p2}, Landroid/support/v4/widget/AutoScrollHelper;->getEdgeValue(FFFF)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 542
a=0;//     .local v6, "value":F
a=0;//     #v6=(Float);
a=0;//     cmpl-float v8, v6, v7
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 558
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Float);v8=(Conflicted);
a=0;//     return v7
a=0;// 
a=0;//     .line 547
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Null);v8=(Byte);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F
a=0;// 
a=0;//     #v8=(Reference,[F);
a=0;//     aget v4, v8, p1
a=0;// 
a=0;//     .line 548
a=0;//     .local v4, "relativeVelocity":F
a=0;//     #v4=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F
a=0;// 
a=0;//     aget v2, v8, p1
a=0;// 
a=0;//     .line 549
a=0;//     .local v2, "minimumVelocity":F
a=0;//     #v2=(Integer);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F
a=0;// 
a=0;//     aget v1, v8, p1
a=0;// 
a=0;//     .line 550
a=0;//     .local v1, "maximumVelocity":F
a=0;//     #v1=(Integer);
a=0;//     mul-float v5, v4, p4
a=0;// 
a=0;//     .line 555
a=0;//     .local v5, "targetVelocity":F
a=0;//     #v5=(Float);
a=0;//     cmpl-float v7, v6, v7
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_1
a=0;// 
a=0;//     .line 556
a=0;//     mul-float v7, v6, v5
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-static {v7, v2, v1}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 558
a=0;//     :cond_1
a=0;//     #v7=(Byte);
a=0;//     neg-float v7, v6
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v7, v5
a=0;// 
a=0;//     invoke-static {v7, v2, v1}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     neg-float v7, v7
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static constrain(FFF)F
a=0;//     .locals 1
a=0;//     .param p0, "value"    # F
a=0;//     .param p1, "min"    # F
a=0;//     .param p2, "max"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 663
a=0;//     cmpl-float v0, p0, p2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 668
a=0;//     .end local p2    # "max":F
a=0;//     :goto_0
a=0;//     return p2
a=0;// 
a=0;//     .line 665
a=0;//     .restart local p2    # "max":F
a=0;//     :cond_0
a=0;//     cmpg-float v0, p0, p1
a=0;// 
a=0;//     if-gez v0, :cond_1
a=0;// 
a=0;//     move p2, p1
a=0;// 
a=0;//     .line 666
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     move p2, p0
a=0;// 
a=0;//     .line 668
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static constrain(III)I
a=0;//     .locals 0
a=0;//     .param p0, "value"    # I
a=0;//     .param p1, "min"    # I
a=0;//     .param p2, "max"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 653
a=0;//     if-le p0, p2, :cond_0
a=0;// 
a=0;//     .line 658
a=0;//     .end local p2    # "max":I
a=0;//     :goto_0
a=0;//     return p2
a=0;// 
a=0;//     .line 655
a=0;//     .restart local p2    # "max":I
a=0;//     :cond_0
a=0;//     if-ge p0, p1, :cond_1
a=0;// 
a=0;//     move p2, p1
a=0;// 
a=0;//     .line 656
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     move p2, p0
a=0;// 
a=0;//     .line 658
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constrainEdgeValue(FF)F
a=0;//     .locals 4
a=0;//     .param p1, "current"    # F
a=0;//     .param p2, "leading"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v1, 0x3f800000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 624
a=0;//     #v0=(Null);
a=0;//     cmpl-float v2, p2, v0
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 649
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 628
a=0;//     :cond_1
a=0;//     #v0=(Null);v2=(Byte);v3=(Uninit);
a=0;//     iget v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeType:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 631
a=0;//     :pswitch_0
a=0;//     cmpg-float v2, p1, p2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 632
a=0;//     cmpl-float v2, p1, v0
a=0;// 
a=0;//     if-ltz v2, :cond_2
a=0;// 
a=0;//     .line 634
a=0;//     div-float v0, p1, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sub-float v0, v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 635
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeType:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 637
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 642
a=0;//     :pswitch_1
a=0;//     #v0=(Null);v3=(Uninit);
a=0;//     cmpg-float v1, p1, v0
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gez v1, :cond_0
a=0;// 
a=0;//     .line 644
a=0;//     neg-float v0, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     div-float v0, p1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 628
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private getEdgeValue(FFFF)F
a=0;//     .locals 7
a=0;//     .param p1, "relativeValue"    # F
a=0;//     .param p2, "size"    # F
a=0;//     .param p3, "maxValue"    # F
a=0;//     .param p4, "current"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 607
a=0;//     #v5=(Null);
a=0;//     mul-float v6, p1, p2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-static {v6, v5, p3}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 608
a=0;//     .local v0, "edgeSize":F
a=0;//     #v0=(Float);
a=0;//     invoke-direct {p0, p4, v0}, Landroid/support/v4/widget/AutoScrollHelper;->constrainEdgeValue(FF)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 609
a=0;//     .local v3, "valueLeading":F
a=0;//     #v3=(Float);
a=0;//     sub-float v6, p2, p4
a=0;// 
a=0;//     invoke-direct {p0, v6, v0}, Landroid/support/v4/widget/AutoScrollHelper;->constrainEdgeValue(FF)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 610
a=0;//     .local v4, "valueTrailing":F
a=0;//     #v4=(Float);
a=0;//     sub-float v2, v4, v3
a=0;// 
a=0;//     .line 612
a=0;//     .local v2, "value":F
a=0;//     #v2=(Float);
a=0;//     cmpg-float v6, v2, v5
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gez v6, :cond_1
a=0;// 
a=0;//     .line 613
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     neg-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-interface {v5, v6}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     neg-float v1, v5
a=0;// 
a=0;//     .line 620
a=0;//     .local v1, "interpolated":F
a=0;//     :goto_0
a=0;//     #v1=(Float);v5=(Conflicted);
a=0;//     const/high16 v5, -0x40800000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/high16 v6, 0x3f800000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v1, v5, v6}, Landroid/support/v4/widget/AutoScrollHelper;->constrain(FFF)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .end local v1    # "interpolated":F
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v5=(Float);
a=0;//     return v5
a=0;// 
a=0;//     .line 614
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v5=(Null);v6=(Byte);
a=0;//     cmpl-float v6, v2, v5
a=0;// 
a=0;//     if-lez v6, :cond_0
a=0;// 
a=0;//     .line 615
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-interface {v5, v2}, Landroid/view/animation/Interpolator;->getInterpolation(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .restart local v1    # "interpolated":F
a=0;//     #v1=(Float);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private requestStop()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 528
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 531
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
a=0;// 
a=0;//     .line 535
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     return-void
a=0;// 
a=0;//     .line 533
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->requestStop()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private shouldAnimate()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     .line 493
a=0;//     .local v1, "scroller":Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;//     #v1=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getVerticalDirection()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 494
a=0;//     .local v2, "verticalDirection":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->getHorizontalDirection()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 496
a=0;//     .local v0, "horizontalDirection":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/AutoScrollHelper;->canTargetScrollVertically(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/AutoScrollHelper;->canTargetScrollHorizontally(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v3
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private startAnimating()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 504
a=0;//     #v4=(One);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 505
a=0;//     new-instance v0, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;-><init>(Landroid/support/v4/widget/AutoScrollHelper;Landroid/support/v4/widget/AutoScrollHelper$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ScrollAnimationRunnable;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 508
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
a=0;// 
a=0;//     .line 509
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsReset:Z
a=0;// 
a=0;//     .line 511
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAlreadyDelayed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mActivationDelay:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 512
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     iget v2, p0, Landroid/support/v4/widget/AutoScrollHelper;->mActivationDelay:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-long v2, v2
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-static {v0, v1, v2, v3}, Landroid/support/v4/view/ViewCompat;->postOnAnimationDelayed(Landroid/view/View;Ljava/lang/Runnable;J)V
a=0;// 
a=0;//     .line 519
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAlreadyDelayed:Z
a=0;// 
a=0;//     .line 520
a=0;//     return-void
a=0;// 
a=0;//     .line 514
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-interface {v0}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abstract canTargetScrollHorizontally(I)Z
a=0;// .end method
a=0;// 
a=0;// .method public abstract canTargetScrollVertically(I)Z
a=0;// .end method
a=0;// 
a=0;// .method public isEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 247
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isExclusive()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mExclusive:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
a=0;//     .locals 8
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "event"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 456
a=0;//     #v4=(Null);
a=0;//     iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 485
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 460
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(One);v4=(Null);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {p2}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 461
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 485
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mExclusive:Z
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Boolean);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 463
a=0;//     :pswitch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(One);v4=(Null);v6=(Uninit);v7=(Uninit);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/widget/AutoScrollHelper;->mNeedsCancel:Z
a=0;// 
a=0;//     .line 464
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAlreadyDelayed:Z
a=0;// 
a=0;//     .line 467
a=0;//     :pswitch_1
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-direct {p0, v4, v5, v6, v7}, Landroid/support/v4/widget/AutoScrollHelper;->computeTargetVelocity(IFFF)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 469
a=0;//     .local v1, "xTargetVelocity":F
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/AutoScrollHelper;->mTarget:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-direct {p0, v3, v5, v6, v7}, Landroid/support/v4/widget/AutoScrollHelper;->computeTargetVelocity(IFFF)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 471
a=0;//     .local v2, "yTargetVelocity":F
a=0;//     #v2=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     invoke-virtual {v5, v1, v2}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->setTargetVelocity(FF)V
a=0;// 
a=0;//     .line 475
a=0;//     iget-boolean v5, p0, Landroid/support/v4/widget/AutoScrollHelper;->mAnimating:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->shouldAnimate()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 476
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->startAnimating()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 481
a=0;//     .end local v1    # "xTargetVelocity":F
a=0;//     .end local v2    # "yTargetVelocity":F
a=0;//     :pswitch_2
a=0;//     #v1=(Uninit);v2=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->requestStop()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 485
a=0;//     #v3=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 461
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public abstract scrollTargetBy(II)V
a=0;// .end method
a=0;// 
a=0;// .method public setActivationDelay(I)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 0
a=0;//     .param p1, "delayMillis"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mActivationDelay:I
a=0;// 
a=0;//     .line 413
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setEdgeType(I)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 0
a=0;//     .param p1, "type"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 354
a=0;//     iput p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEdgeType:I
a=0;// 
a=0;//     .line 355
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setEnabled(Z)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 235
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 236
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/AutoScrollHelper;->requestStop()V
a=0;// 
a=0;//     .line 239
a=0;//     :cond_0
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mEnabled:Z
a=0;// 
a=0;//     .line 240
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setExclusive(Z)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 0
a=0;//     .param p1, "exclusive"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 263
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/AutoScrollHelper;->mExclusive:Z
a=0;// 
a=0;//     .line 264
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setMaximumEdges(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 2
a=0;//     .param p1, "horizontalMax"    # F
a=0;//     .param p2, "verticalMax"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 395
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput p1, v0, v1
a=0;// 
a=0;//     .line 396
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumEdges:[F
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aput p2, v0, v1
a=0;// 
a=0;//     .line 397
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setMaximumVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 4
a=0;//     .param p1, "horizontalMax"    # F
a=0;//     .param p2, "verticalMax"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v3, 0x447a0000
a=0;// 
a=0;//     .line 294
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     div-float v2, p1, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     .line 295
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMaximumVelocity:[F
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     div-float v2, p2, v3
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     .line 296
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setMinimumVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 4
a=0;//     .param p1, "horizontalMin"    # F
a=0;//     .param p2, "verticalMin"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v3, 0x447a0000
a=0;// 
a=0;//     .line 312
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     div-float v2, p1, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     .line 313
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mMinimumVelocity:[F
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     div-float v2, p2, v3
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     .line 314
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setRampDownDuration(I)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 1
a=0;//     .param p1, "durationMillis"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->setRampDownDuration(I)V
a=0;// 
a=0;//     .line 443
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setRampUpDuration(I)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 1
a=0;//     .param p1, "durationMillis"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mScroller:Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/AutoScrollHelper$ClampedScroller;->setRampUpDuration(I)V
a=0;// 
a=0;//     .line 428
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setRelativeEdges(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 2
a=0;//     .param p1, "horizontal"    # F
a=0;//     .param p2, "vertical"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     aput p1, v0, v1
a=0;// 
a=0;//     .line 374
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeEdges:[F
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aput p2, v0, v1
a=0;// 
a=0;//     .line 375
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setRelativeVelocity(FF)Landroid/support/v4/widget/AutoScrollHelper;
a=0;//     .locals 4
a=0;//     .param p1, "horizontal"    # F
a=0;//     .param p2, "vertical"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v3, 0x447a0000
a=0;// 
a=0;//     .line 333
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     div-float v2, p1, v3
a=0;// 
a=0;//     #v2=(Float);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/AutoScrollHelper;->mRelativeVelocity:[F
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     div-float v2, p2, v3
a=0;// 
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     .line 335
a=0;//     return-object p0
a=0;// .end method
}}
