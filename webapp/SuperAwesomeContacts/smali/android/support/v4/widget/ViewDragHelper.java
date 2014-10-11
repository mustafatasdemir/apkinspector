package android.support.v4.widget; class ViewDragHelper { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/ViewDragHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewDragHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final BASE_SETTLE_DURATION:I = 0x100
a=0;// 
a=0;// .field public static final DIRECTION_ALL:I = 0x3
a=0;// 
a=0;// .field public static final DIRECTION_HORIZONTAL:I = 0x1
a=0;// 
a=0;// .field public static final DIRECTION_VERTICAL:I = 0x2
a=0;// 
a=0;// .field public static final EDGE_ALL:I = 0xf
a=0;// 
a=0;// .field public static final EDGE_BOTTOM:I = 0x8
a=0;// 
a=0;// .field public static final EDGE_LEFT:I = 0x1
a=0;// 
a=0;// .field public static final EDGE_RIGHT:I = 0x2
a=0;// 
a=0;// .field private static final EDGE_SIZE:I = 0x14
a=0;// 
a=0;// .field public static final EDGE_TOP:I = 0x4
a=0;// 
a=0;// .field public static final INVALID_POINTER:I = -0x1
a=0;// 
a=0;// .field private static final MAX_SETTLE_DURATION:I = 0x258
a=0;// 
a=0;// .field public static final STATE_DRAGGING:I = 0x1
a=0;// 
a=0;// .field public static final STATE_IDLE:I = 0x0
a=0;// 
a=0;// .field public static final STATE_SETTLING:I = 0x2
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ViewDragHelper"
a=0;// 
a=0;// .field private static final sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActivePointerId:I
a=0;// 
a=0;// .field private final mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;// .field private mCapturedView:Landroid/view/View;
a=0;// 
a=0;// .field private mDragState:I
a=0;// 
a=0;// .field private mEdgeDragsInProgress:[I
a=0;// 
a=0;// .field private mEdgeDragsLocked:[I
a=0;// 
a=0;// .field private mEdgeSize:I
a=0;// 
a=0;// .field private mInitialEdgesTouched:[I
a=0;// 
a=0;// .field private mInitialMotionX:[F
a=0;// 
a=0;// .field private mInitialMotionY:[F
a=0;// 
a=0;// .field private mLastMotionX:[F
a=0;// 
a=0;// .field private mLastMotionY:[F
a=0;// 
a=0;// .field private mMaxVelocity:F
a=0;// 
a=0;// .field private mMinVelocity:F
a=0;// 
a=0;// .field private final mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;// .field private mPointersDown:I
a=0;// 
a=0;// .field private mReleaseInProgress:Z
a=0;// 
a=0;// .field private mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;// .field private final mSetIdleRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mTouchSlop:I
a=0;// 
a=0;// .field private mTrackingEdges:I
a=0;// 
a=0;// .field private mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 326
a=0;//     new-instance v0, Landroid/support/v4/widget/ViewDragHelper$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/ViewDragHelper$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/ViewDragHelper$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper$1;);
a=0;//     sput-object v0, Landroid/support/v4/widget/ViewDragHelper;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "forParent"    # Landroid/view/ViewGroup;
a=0;//     .param p3, "cb"    # Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 115
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     .line 333
a=0;//     new-instance v2, Landroid/support/v4/widget/ViewDragHelper$2;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/ViewDragHelper$2;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/ViewDragHelper$2;-><init>(Landroid/support/v4/widget/ViewDragHelper;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper$2;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mSetIdleRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 374
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 375
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "Parent view may not be null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 377
a=0;//     :cond_0
a=0;//     #v3=(Uninit);
a=0;//     if-nez p3, :cond_1
a=0;// 
a=0;//     .line 378
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "Callback may not be null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 381
a=0;//     :cond_1
a=0;//     #v3=(Uninit);
a=0;//     iput-object p2, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 382
a=0;//     iput-object p3, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     .line 384
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 385
a=0;//     .local v1, "vc":Landroid/view/ViewConfiguration;
a=0;//     #v1=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v0, v2, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 386
a=0;//     .local v0, "density":F
a=0;//     #v0=(Integer);
a=0;//     const/high16 v2, 0x41a00000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     const/high16 v3, 0x3f000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I
a=0;// 
a=0;//     .line 388
a=0;//     invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     .line 389
a=0;//     invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F
a=0;// 
a=0;//     .line 390
a=0;//     invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v2, v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F
a=0;// 
a=0;//     .line 391
a=0;//     sget-object v2, Landroid/support/v4/widget/ViewDragHelper;->sInterpolator:Landroid/view/animation/Interpolator;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/animation/Interpolator;);
a=0;//     invoke-static {p1, v2}, Landroid/support/v4/widget/ScrollerCompat;->create(Landroid/content/Context;Landroid/view/animation/Interpolator;)Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     .line 392
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkNewEdgeDrag(FFII)Z
a=0;//     .locals 5
a=0;//     .param p1, "delta"    # F
a=0;//     .param p2, "odelta"    # F
a=0;//     .param p3, "pointerId"    # I
a=0;//     .param p4, "edge"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1218
a=0;//     #v2=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1219
a=0;//     .local v0, "absDelta":F
a=0;//     #v0=(Float);
a=0;//     invoke-static {p2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1221
a=0;//     .local v1, "absODelta":F
a=0;//     #v1=(Float);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, p4
a=0;// 
a=0;//     if-ne v3, p4, :cond_0
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     and-int/2addr v3, p4
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, p4
a=0;// 
a=0;//     if-eq v3, p4, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, p4
a=0;// 
a=0;//     if-eq v3, p4, :cond_0
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v3, v0, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_1
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_1
a=0;// 
a=0;//     .line 1231
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 1227
a=0;//     :cond_1
a=0;//     #v2=(Null);v3=(Byte);v4=(Uninit);
a=0;//     const/high16 v3, 0x3f000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v3, v1
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v3, v0, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     invoke-virtual {v3, p4}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeLock(I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 1228
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v4, v3, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     or-int/2addr v4, p4
a=0;// 
a=0;//     aput v4, v3, p3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1231
a=0;//     :cond_2
a=0;//     #v3=(Byte);v4=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     aget v3, v3, p3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, p4
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpl-float v3, v0, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private checkTouchSlop(Landroid/view/View;FF)Z
a=0;//     .locals 7
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "dx"    # F
a=0;//     .param p3, "dy"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1245
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 1258
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 1248
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     invoke-virtual {v4, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getViewHorizontalDragRange(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 1249
a=0;//     .local v0, "checkHorizontal":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     invoke-virtual {v4, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getViewVerticalDragRange(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-lez v4, :cond_3
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 1251
a=0;//     .local v1, "checkVertical":Z
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1252
a=0;//     mul-float v4, p2, p2
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float v5, p3, p3
a=0;// 
a=0;//     #v5=(Float);
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-int/2addr v5, v6
a=0;// 
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     cmpl-float v4, v4, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_0
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "checkHorizontal":Z
a=0;//     .end local v1    # "checkVertical":Z
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v4=(Integer);v5=(Uninit);v6=(Uninit);
a=0;//     move v0, v3
a=0;// 
a=0;//     .line 1248
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v0    # "checkHorizontal":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 1249
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1253
a=0;//     .restart local v1    # "checkVertical":Z
a=0;//     :cond_4
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1254
a=0;//     invoke-static {p2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     cmpl-float v4, v4, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_0
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1255
a=0;//     :cond_5
a=0;//     #v2=(One);v4=(Integer);v5=(Uninit);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 1256
a=0;//     invoke-static {p3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     cmpl-float v4, v4, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_0
a=0;// 
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v2=(One);v4=(Integer);v5=(Uninit);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 1258
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private clampMag(FFF)F
a=0;//     .locals 3
a=0;//     .param p1, "value"    # F
a=0;//     .param p2, "absMin"    # F
a=0;//     .param p3, "absMax"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 667
a=0;//     #v1=(Null);
a=0;//     invoke-static {p1}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 668
a=0;//     .local v0, "absValue":F
a=0;//     #v0=(Float);
a=0;//     cmpg-float v2, v0, p2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_1
a=0;// 
a=0;//     move p3, v1
a=0;// 
a=0;//     .line 670
a=0;//     .end local p3    # "absMax":F
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Byte);
a=0;//     return p3
a=0;// 
a=0;//     .line 669
a=0;//     .restart local p3    # "absMax":F
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     cmpl-float v2, v0, p3
a=0;// 
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     cmpl-float v1, p1, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-gtz v1, :cond_0
a=0;// 
a=0;//     neg-float p3, p3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Null);
a=0;//     move p3, p1
a=0;// 
a=0;//     .line 670
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private clampMag(III)I
a=0;//     .locals 1
a=0;//     .param p1, "value"    # I
a=0;//     .param p2, "absMin"    # I
a=0;//     .param p3, "absMax"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 650
a=0;//     invoke-static {p1}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 651
a=0;//     .local v0, "absValue":I
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, p2, :cond_1
a=0;// 
a=0;//     const/4 p3, 0x0
a=0;// 
a=0;//     .line 653
a=0;//     .end local p3    # "absMax":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return p3
a=0;// 
a=0;//     .line 652
a=0;//     .restart local p3    # "absMax":I
a=0;//     :cond_1
a=0;//     if-le v0, p3, :cond_2
a=0;// 
a=0;//     if-gtz p1, :cond_0
a=0;// 
a=0;//     neg-int p3, p3
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     move p3, p1
a=0;// 
a=0;//     .line 653
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private clearMotionHistory()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 770
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 781
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 773
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V
a=0;// 
a=0;//     .line 774
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V
a=0;// 
a=0;//     .line 775
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V
a=0;// 
a=0;//     .line 776
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/util/Arrays;->fill([FF)V
a=0;// 
a=0;//     .line 777
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V
a=0;// 
a=0;//     .line 778
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V
a=0;// 
a=0;//     .line 779
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I
a=0;// 
a=0;//     invoke-static {v0, v2}, Ljava/util/Arrays;->fill([II)V
a=0;// 
a=0;//     .line 780
a=0;//     iput v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private clearMotionHistory(I)V
a=0;//     .locals 3
a=0;//     .param p1, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 784
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 795
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 787
a=0;//     :cond_0
a=0;//     #v0=(Reference,[F);v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     aput v1, v0, p1
a=0;// 
a=0;//     .line 788
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F
a=0;// 
a=0;//     aput v1, v0, p1
a=0;// 
a=0;//     .line 789
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F
a=0;// 
a=0;//     aput v1, v0, p1
a=0;// 
a=0;//     .line 790
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F
a=0;// 
a=0;//     aput v1, v0, p1
a=0;// 
a=0;//     .line 791
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     aput v2, v0, p1
a=0;// 
a=0;//     .line 792
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I
a=0;// 
a=0;//     aput v2, v0, p1
a=0;// 
a=0;//     .line 793
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I
a=0;// 
a=0;//     aput v2, v0, p1
a=0;// 
a=0;//     .line 794
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     shl-int/2addr v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     xor-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     and-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private computeAxisDuration(III)I
a=0;//     .locals 10
a=0;//     .param p1, "delta"    # I
a=0;//     .param p2, "velocity"    # I
a=0;//     .param p3, "motionRange"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v9, 0x3f800000
a=0;// 
a=0;//     .line 618
a=0;//     #v9=(Integer);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 619
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 636
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v6
a=0;// 
a=0;//     .line 622
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v6}, Landroid/view/ViewGroup;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 623
a=0;//     .local v5, "width":I
a=0;//     #v5=(Integer);
a=0;//     div-int/lit8 v3, v5, 0x2
a=0;// 
a=0;//     .line 624
a=0;//     .local v3, "halfWidth":I
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     int-to-float v7, v5
a=0;// 
a=0;//     #v7=(Float);
a=0;//     div-float/2addr v6, v7
a=0;// 
a=0;//     invoke-static {v9, v6}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 625
a=0;//     .local v1, "distanceRatio":F
a=0;//     #v1=(Float);
a=0;//     int-to-float v6, v3
a=0;// 
a=0;//     int-to-float v7, v3
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/widget/ViewDragHelper;->distanceInfluenceForSnapDuration(F)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     mul-float/2addr v7, v8
a=0;// 
a=0;//     add-float v0, v6, v7
a=0;// 
a=0;//     .line 629
a=0;//     .local v0, "distance":F
a=0;//     #v0=(Float);
a=0;//     invoke-static {p2}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result p2
a=0;// 
a=0;//     .line 630
a=0;//     if-lez p2, :cond_1
a=0;// 
a=0;//     .line 631
a=0;//     const/high16 v6, 0x447a0000
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v7, p2
a=0;// 
a=0;//     div-float v7, v0, v7
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     #v6=(Float);
a=0;//     invoke-static {v6}, Ljava/lang/Math;->round(F)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     mul-int/lit8 v2, v6, 0x4
a=0;// 
a=0;//     .line 636
a=0;//     .local v2, "duration":I
a=0;//     :goto_1
a=0;//     #v2=(Integer);v4=(Conflicted);v7=(Integer);
a=0;//     const/16 v6, 0x258
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 633
a=0;//     .end local v2    # "duration":I
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v4=(Uninit);v6=(Float);v7=(Float);
a=0;//     invoke-static {p1}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     int-to-float v7, p3
a=0;// 
a=0;//     div-float v4, v6, v7
a=0;// 
a=0;//     .line 634
a=0;//     .local v4, "range":F
a=0;//     #v4=(Float);
a=0;//     add-float v6, v4, v9
a=0;// 
a=0;//     const/high16 v7, 0x43800000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-float/2addr v6, v7
a=0;// 
a=0;//     float-to-int v2, v6
a=0;// 
a=0;//     .restart local v2    # "duration":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private computeSettleDuration(Landroid/view/View;IIII)I
a=0;//     .locals 14
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "dx"    # I
a=0;//     .param p3, "dy"    # I
a=0;//     .param p4, "xvel"    # I
a=0;//     .param p5, "yvel"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 597
a=0;//     iget v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     float-to-int v12, v12
a=0;// 
a=0;//     iget v13, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     float-to-int v13, v13
a=0;// 
a=0;//     move/from16 v0, p4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0, v12, v13}, Landroid/support/v4/widget/ViewDragHelper;->clampMag(III)I
a=0;// 
a=0;//     move-result p4
a=0;// 
a=0;//     .line 598
a=0;//     iget v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F
a=0;// 
a=0;//     float-to-int v12, v12
a=0;// 
a=0;//     iget v13, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F
a=0;// 
a=0;//     float-to-int v13, v13
a=0;// 
a=0;//     move/from16 v0, p5
a=0;// 
a=0;//     invoke-direct {p0, v0, v12, v13}, Landroid/support/v4/widget/ViewDragHelper;->clampMag(III)I
a=0;// 
a=0;//     move-result p5
a=0;// 
a=0;//     .line 599
a=0;//     invoke-static/range {p2 .. p2}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 600
a=0;//     .local v2, "absDx":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static/range {p3 .. p3}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 601
a=0;//     .local v3, "absDy":I
a=0;//     #v3=(Integer);
a=0;//     invoke-static/range {p4 .. p4}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 602
a=0;//     .local v4, "absXVel":I
a=0;//     #v4=(Integer);
a=0;//     invoke-static/range {p5 .. p5}, Ljava/lang/Math;->abs(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 603
a=0;//     .local v5, "absYVel":I
a=0;//     #v5=(Integer);
a=0;//     add-int v7, v4, v5
a=0;// 
a=0;//     .line 604
a=0;//     .local v7, "addedVel":I
a=0;//     #v7=(Integer);
a=0;//     add-int v6, v2, v3
a=0;// 
a=0;//     .line 606
a=0;//     .local v6, "addedDistance":I
a=0;//     #v6=(Integer);
a=0;//     if-eqz p4, :cond_0
a=0;// 
a=0;//     int-to-float v12, v4
a=0;// 
a=0;//     #v12=(Float);
a=0;//     int-to-float v13, v7
a=0;// 
a=0;//     #v13=(Float);
a=0;//     div-float v9, v12, v13
a=0;// 
a=0;//     .line 608
a=0;//     .local v9, "xweight":F
a=0;//     :goto_0
a=0;//     #v9=(Float);
a=0;//     if-eqz p5, :cond_1
a=0;// 
a=0;//     int-to-float v12, v5
a=0;// 
a=0;//     int-to-float v13, v7
a=0;// 
a=0;//     div-float v11, v12, v13
a=0;// 
a=0;//     .line 611
a=0;//     .local v11, "yweight":F
a=0;//     :goto_1
a=0;//     #v11=(Float);
a=0;//     iget-object v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     invoke-virtual {v12, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getViewHorizontalDragRange(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     move/from16 v1, p4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, v0, v1, v12}, Landroid/support/v4/widget/ViewDragHelper;->computeAxisDuration(III)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 612
a=0;//     .local v8, "xduration":I
a=0;//     #v8=(Integer);
a=0;//     iget-object v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v12=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     invoke-virtual {v12, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getViewVerticalDragRange(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     move/from16 v1, p5
a=0;// 
a=0;//     invoke-direct {p0, v0, v1, v12}, Landroid/support/v4/widget/ViewDragHelper;->computeAxisDuration(III)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 614
a=0;//     .local v10, "yduration":I
a=0;//     #v10=(Integer);
a=0;//     int-to-float v12, v8
a=0;// 
a=0;//     #v12=(Float);
a=0;//     mul-float/2addr v12, v9
a=0;// 
a=0;//     int-to-float v13, v10
a=0;// 
a=0;//     mul-float/2addr v13, v11
a=0;// 
a=0;//     add-float/2addr v12, v13
a=0;// 
a=0;//     float-to-int v12, v12
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     return v12
a=0;// 
a=0;//     .line 606
a=0;//     .end local v8    # "xduration":I
a=0;//     .end local v9    # "xweight":F
a=0;//     .end local v10    # "yduration":I
a=0;//     .end local v11    # "yweight":F
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Integer);
a=0;//     int-to-float v12, v2
a=0;// 
a=0;//     #v12=(Float);
a=0;//     int-to-float v13, v6
a=0;// 
a=0;//     #v13=(Float);
a=0;//     div-float v9, v12, v13
a=0;// 
a=0;//     #v9=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 608
a=0;//     .restart local v9    # "xweight":F
a=0;//     :cond_1
a=0;//     int-to-float v12, v3
a=0;// 
a=0;//     int-to-float v13, v6
a=0;// 
a=0;//     div-float v11, v12, v13
a=0;// 
a=0;//     #v11=(Float);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;//     .locals 3
a=0;//     .param p0, "forParent"    # Landroid/view/ViewGroup;
a=0;//     .param p1, "sensitivity"    # F
a=0;//     .param p2, "cb"    # Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 360
a=0;//     invoke-static {p0, p2}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 361
a=0;//     .local v0, "helper":Landroid/support/v4/widget/ViewDragHelper;
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget v1, v0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     const/high16 v2, 0x3f800000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     div-float/2addr v2, p1
a=0;// 
a=0;//     #v2=(Float);
a=0;//     mul-float/2addr v1, v2
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     .line 362
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static create(Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;//     .locals 2
a=0;//     .param p0, "forParent"    # Landroid/view/ViewGroup;
a=0;//     .param p1, "cb"    # Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 347
a=0;//     new-instance v0, Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p0}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p0, p1}, Landroid/support/v4/widget/ViewDragHelper;-><init>(Landroid/content/Context;Landroid/view/ViewGroup;Landroid/support/v4/widget/ViewDragHelper$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private dispatchViewReleased(FF)V
a=0;//     .locals 4
a=0;//     .param p1, "xvel"    # F
a=0;//     .param p2, "yvel"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 759
a=0;//     #v2=(Null);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mReleaseInProgress:Z
a=0;// 
a=0;//     .line 760
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, p1, p2}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewReleased(Landroid/view/View;FF)V
a=0;// 
a=0;//     .line 761
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mReleaseInProgress:Z
a=0;// 
a=0;//     .line 763
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v3, :cond_0
a=0;// 
a=0;//     .line 765
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V
a=0;// 
a=0;//     .line 767
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private distanceInfluenceForSnapDuration(F)F
a=0;//     .locals 4
a=0;//     .param p1, "f"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 674
a=0;//     const/high16 v0, 0x3f000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-float/2addr p1, v0
a=0;// 
a=0;//     .line 675
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
a=0;//     .line 676
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
a=0;// .method private dragTo(IIII)V
a=0;//     .locals 8
a=0;//     .param p1, "left"    # I
a=0;//     .param p2, "top"    # I
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "dy"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1366
a=0;//     move v2, p1
a=0;// 
a=0;//     .line 1367
a=0;//     .local v2, "clampedX":I
a=0;//     #v2=(Integer);
a=0;//     move v3, p2
a=0;// 
a=0;//     .line 1368
a=0;//     .local v3, "clampedY":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1369
a=0;//     .local v6, "oldLeft":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1370
a=0;//     .local v7, "oldTop":I
a=0;//     #v7=(Integer);
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 1371
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, p1, p3}, Landroid/support/v4/widget/ViewDragHelper$Callback;->clampViewPositionHorizontal(Landroid/view/View;II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1372
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     sub-int v1, v2, v6
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     .line 1374
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     .line 1375
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, p2, p4}, Landroid/support/v4/widget/ViewDragHelper$Callback;->clampViewPositionVertical(Landroid/view/View;II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1376
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     sub-int v1, v3, v7
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->offsetTopAndBottom(I)V
a=0;// 
a=0;//     .line 1379
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     if-nez p3, :cond_2
a=0;// 
a=0;//     if-eqz p4, :cond_3
a=0;// 
a=0;//     .line 1380
a=0;//     :cond_2
a=0;//     sub-int v4, v2, v6
a=0;// 
a=0;//     .line 1381
a=0;//     .local v4, "clampedDx":I
a=0;//     #v4=(Integer);
a=0;//     sub-int v5, v3, v7
a=0;// 
a=0;//     .line 1382
a=0;//     .local v5, "clampedDy":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewPositionChanged(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 1385
a=0;//     .end local v4    # "clampedDx":I
a=0;//     .end local v5    # "clampedDy":I
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ensureMotionHistorySizeForId(I)V
a=0;//     .locals 10
a=0;//     .param p1, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 798
a=0;//     #v9=(Null);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     #v7=(Reference,[F);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     array-length v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-gt v7, p1, :cond_2
a=0;// 
a=0;//     .line 799
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     add-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     new-array v3, v7, [F
a=0;// 
a=0;//     .line 800
a=0;//     .local v3, "imx":[F
a=0;//     #v3=(Reference,[F);
a=0;//     add-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     new-array v4, v7, [F
a=0;// 
a=0;//     .line 801
a=0;//     .local v4, "imy":[F
a=0;//     #v4=(Reference,[F);
a=0;//     add-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     new-array v5, v7, [F
a=0;// 
a=0;//     .line 802
a=0;//     .local v5, "lmx":[F
a=0;//     #v5=(Reference,[F);
a=0;//     add-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     new-array v6, v7, [F
a=0;// 
a=0;//     .line 803
a=0;//     .local v6, "lmy":[F
a=0;//     #v6=(Reference,[F);
a=0;//     add-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     new-array v2, v7, [I
a=0;// 
a=0;//     .line 804
a=0;//     .local v2, "iit":[I
a=0;//     #v2=(Reference,[I);
a=0;//     add-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     new-array v0, v7, [I
a=0;// 
a=0;//     .line 805
a=0;//     .local v0, "edip":[I
a=0;//     #v0=(Reference,[I);
a=0;//     add-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     new-array v1, v7, [I
a=0;// 
a=0;//     .line 807
a=0;//     .local v1, "edl":[I
a=0;//     #v1=(Reference,[I);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     #v7=(Reference,[F);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 808
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     #v8=(Reference,[F);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v7, v9, v3, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 809
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F
a=0;// 
a=0;//     #v8=(Reference,[F);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v7, v9, v4, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 810
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F
a=0;// 
a=0;//     #v8=(Reference,[F);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v7, v9, v5, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 811
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F
a=0;// 
a=0;//     #v8=(Reference,[F);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v7, v9, v6, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 812
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     #v8=(Reference,[I);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v7, v9, v2, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 813
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I
a=0;// 
a=0;//     #v8=(Reference,[I);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v7, v9, v0, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 814
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I
a=0;// 
a=0;//     #v8=(Reference,[I);
a=0;//     array-length v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v7, v9, v1, v9, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
a=0;// 
a=0;//     .line 817
a=0;//     :cond_1
a=0;//     #v8=(Conflicted);
a=0;//     iput-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     .line 818
a=0;//     iput-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F
a=0;// 
a=0;//     .line 819
a=0;//     iput-object v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F
a=0;// 
a=0;//     .line 820
a=0;//     iput-object v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F
a=0;// 
a=0;//     .line 821
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     .line 822
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I
a=0;// 
a=0;//     .line 823
a=0;//     iput-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsLocked:[I
a=0;// 
a=0;//     .line 825
a=0;//     .end local v0    # "edip":[I
a=0;//     .end local v1    # "edl":[I
a=0;//     .end local v2    # "iit":[I
a=0;//     .end local v3    # "imx":[F
a=0;//     .end local v4    # "imy":[F
a=0;//     .end local v5    # "lmx":[F
a=0;//     .end local v6    # "lmy":[F
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private forceSettleCapturedViewAt(IIII)Z
a=0;//     .locals 11
a=0;//     .param p1, "finalLeft"    # I
a=0;//     .param p2, "finalTop"    # I
a=0;//     .param p3, "xvel"    # I
a=0;//     .param p4, "yvel"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 577
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 578
a=0;//     .local v10, "startLeft":I
a=0;//     #v10=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 579
a=0;//     .local v6, "startTop":I
a=0;//     #v6=(Integer);
a=0;//     sub-int v2, p1, v10
a=0;// 
a=0;//     .line 580
a=0;//     .local v2, "dx":I
a=0;//     #v2=(Integer);
a=0;//     sub-int v3, p2, v6
a=0;// 
a=0;//     .line 582
a=0;//     .local v3, "dy":I
a=0;//     #v3=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 584
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V
a=0;// 
a=0;//     .line 585
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V
a=0;// 
a=0;//     .line 593
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 589
a=0;//     :cond_0
a=0;//     #v0=(Null);v4=(Uninit);v5=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v4/widget/ViewDragHelper;->computeSettleDuration(Landroid/view/View;IIII)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 590
a=0;//     .local v9, "duration":I
a=0;//     #v9=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     move v5, v10
a=0;// 
a=0;//     move v7, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v8, v3
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {v4 .. v9}, Landroid/support/v4/widget/ScrollerCompat;->startScroll(IIIII)V
a=0;// 
a=0;//     .line 592
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V
a=0;// 
a=0;//     .line 593
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getEdgesTouched(II)I
a=0;//     .locals 3
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1440
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1442
a=0;//     .local v0, "result":I
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v1}, Landroid/view/ViewGroup;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     if-ge p1, v1, :cond_0
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 1443
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v1}, Landroid/view/ViewGroup;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I
a=0;// 
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     if-ge p2, v1, :cond_1
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     .line 1444
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v1}, Landroid/view/ViewGroup;->getRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     if-le p1, v1, :cond_2
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     .line 1445
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v1}, Landroid/view/ViewGroup;->getBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     if-le p2, v1, :cond_3
a=0;// 
a=0;//     or-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     .line 1447
a=0;//     :cond_3
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private releaseViewForPointerUp()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 1355
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/VelocityTracker;);
a=0;//     const/16 v3, 0x3e8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     iget v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V
a=0;// 
a=0;//     .line 1356
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F
a=0;// 
a=0;//     invoke-direct {p0, v2, v3, v4}, Landroid/support/v4/widget/ViewDragHelper;->clampMag(FFF)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1359
a=0;//     .local v0, "xvel":F
a=0;//     #v0=(Float);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Float);
a=0;//     iget v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mMaxVelocity:F
a=0;// 
a=0;//     invoke-direct {p0, v2, v3, v4}, Landroid/support/v4/widget/ViewDragHelper;->clampMag(FFF)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1362
a=0;//     .local v1, "yvel":F
a=0;//     #v1=(Float);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->dispatchViewReleased(FF)V
a=0;// 
a=0;//     .line 1363
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private reportNewEdgeDrags(FFI)V
a=0;//     .locals 3
a=0;//     .param p1, "dx"    # F
a=0;//     .param p2, "dy"    # F
a=0;//     .param p3, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1197
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1198
a=0;//     .local v0, "dragsStarted":I
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, p1, p2, p3, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkNewEdgeDrag(FFII)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1199
a=0;//     or-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     .line 1201
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, p2, p1, p3, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkNewEdgeDrag(FFII)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1202
a=0;//     or-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     .line 1204
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, p1, p2, p3, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkNewEdgeDrag(FFII)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1205
a=0;//     or-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     .line 1207
a=0;//     :cond_2
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {p0, p2, p1, p3, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkNewEdgeDrag(FFII)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1208
a=0;//     or-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     .line 1211
a=0;//     :cond_3
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1212
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeDragsInProgress:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     aget v2, v1, p3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/2addr v2, v0
a=0;// 
a=0;//     aput v2, v1, p3
a=0;// 
a=0;//     .line 1213
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     invoke-virtual {v1, v0, p3}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeDragStarted(II)V
a=0;// 
a=0;//     .line 1215
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private saveInitialMotion(FFI)V
a=0;//     .locals 3
a=0;//     .param p1, "x"    # F
a=0;//     .param p2, "y"    # F
a=0;//     .param p3, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 828
a=0;//     invoke-direct {p0, p3}, Landroid/support/v4/widget/ViewDragHelper;->ensureMotionHistorySizeForId(I)V
a=0;// 
a=0;//     .line 829
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     aput p1, v1, p3
a=0;// 
a=0;//     aput p1, v0, p3
a=0;// 
a=0;//     .line 830
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F
a=0;// 
a=0;//     aput p2, v1, p3
a=0;// 
a=0;//     aput p2, v0, p3
a=0;// 
a=0;//     .line 831
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     float-to-int v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     float-to-int v2, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->getEdgesTouched(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     aput v1, v0, p3
a=0;// 
a=0;//     .line 832
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     shl-int/2addr v1, p3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I
a=0;// 
a=0;//     .line 833
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private saveLastMotion(Landroid/view/MotionEvent;)V
a=0;//     .locals 6
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 836
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 837
a=0;//     .local v1, "pointerCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 838
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 839
a=0;//     .local v2, "pointerId":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 840
a=0;//     .local v3, "x":F
a=0;//     #v3=(Float);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 841
a=0;//     .local v4, "y":F
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     aput v3, v5, v2
a=0;// 
a=0;//     .line 842
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F
a=0;// 
a=0;//     aput v4, v5, v2
a=0;// 
a=0;//     .line 837
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 844
a=0;//     .end local v2    # "pointerId":I
a=0;//     .end local v3    # "x":F
a=0;//     .end local v4    # "y":F
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public abort()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 513
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 514
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrX()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 515
a=0;//     .local v6, "oldX":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrY()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 516
a=0;//     .local v7, "oldY":I
a=0;//     #v7=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V
a=0;// 
a=0;//     .line 517
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 518
a=0;//     .local v2, "newX":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 519
a=0;//     .local v3, "newY":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     sub-int v4, v2, v6
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v5, v3, v7
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewPositionChanged(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 521
a=0;//     .end local v2    # "newX":I
a=0;//     .end local v3    # "newY":I
a=0;//     .end local v6    # "oldX":I
a=0;//     .end local v7    # "oldY":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V
a=0;// 
a=0;//     .line 522
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected canScroll(Landroid/view/View;ZIIII)Z
a=0;//     .locals 13
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "checkV"    # Z
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "dy"    # I
a=0;//     .param p5, "x"    # I
a=0;//     .param p6, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 908
a=0;//     instance-of v1, p1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     move-object v9, p1
a=0;// 
a=0;//     .line 909
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     check-cast v9, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 910
a=0;//     .local v9, "group":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 911
a=0;//     .local v11, "scrollX":I
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 912
a=0;//     .local v12, "scrollY":I
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v9}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 914
a=0;//     .local v8, "count":I
a=0;//     #v8=(Integer);
a=0;//     add-int/lit8 v10, v8, -0x1
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Integer);
a=0;//     if-ltz v10, :cond_1
a=0;// 
a=0;//     .line 917
a=0;//     invoke-virtual {v9, v10}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 918
a=0;//     .local v2, "child":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     add-int v1, p5, v11
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     add-int v1, p5, v11
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     add-int v1, p6, v12
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     add-int v1, p6, v12
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ge v1, v3, :cond_0
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     add-int v1, p5, v11
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v6, v1, v4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int v1, p6, v12
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     sub-int v7, v1, v4
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     move/from16 v4, p3
a=0;// 
a=0;//     move/from16 v5, p4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual/range {v1 .. v7}, Landroid/support/v4/widget/ViewDragHelper;->canScroll(Landroid/view/View;ZIIII)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 922
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 927
a=0;//     .end local v2    # "child":Landroid/view/View;
a=0;//     .end local v8    # "count":I
a=0;//     .end local v9    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v10    # "i":I
a=0;//     .end local v11    # "scrollX":I
a=0;//     .end local v12    # "scrollY":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 914
a=0;//     .restart local v2    # "child":Landroid/view/View;
a=0;//     .restart local v8    # "count":I
a=0;//     .restart local v9    # "group":Landroid/view/ViewGroup;
a=0;//     .restart local v10    # "i":I
a=0;//     .restart local v11    # "scrollX":I
a=0;//     .restart local v12    # "scrollY":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Reference,Landroid/view/View;);v3=(Integer);v8=(Integer);v9=(Reference,Landroid/view/ViewGroup;);v10=(Integer);v11=(Integer);v12=(Integer);
a=0;//     add-int/lit8 v10, v10, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 927
a=0;//     .end local v2    # "child":Landroid/view/View;
a=0;//     .end local v8    # "count":I
a=0;//     .end local v9    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v10    # "i":I
a=0;//     .end local v11    # "scrollX":I
a=0;//     .end local v12    # "scrollY":I
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     neg-int v1, v0
a=0;// 
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     move/from16 v0, p4
a=0;// 
a=0;//     neg-int v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/ViewCompat;->canScrollVertically(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public cancel()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 498
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     .line 499
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper;->clearMotionHistory()V
a=0;// 
a=0;//     .line 501
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 502
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V
a=0;// 
a=0;//     .line 503
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 505
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public captureChildView(Landroid/view/View;I)V
a=0;//     .locals 3
a=0;//     .param p1, "childView"    # Landroid/view/View;
a=0;//     .param p2, "activePointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 460
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 461
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "captureChildView: parameter must be a descendant of the ViewDragHelper\'s tracked parent view ("
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, ")"
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 465
a=0;//     :cond_0
a=0;//     #v2=(Uninit);
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     .line 466
a=0;//     iput p2, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewCaptured(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 468
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V
a=0;// 
a=0;//     .line 469
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public checkTouchSlop(I)Z
a=0;//     .locals 3
a=0;//     .param p1, "directions"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1276
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     #v2=(Reference,[F);
a=0;//     array-length v0, v2
a=0;// 
a=0;//     .line 1277
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 1278
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(II)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1279
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1282
a=0;//     :goto_1
a=0;//     return v2
a=0;// 
a=0;//     .line 1277
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1282
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public checkTouchSlop(II)Z
a=0;//     .locals 9
a=0;//     .param p1, "directions"    # I
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1301
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/widget/ViewDragHelper;->isPointerDown(I)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 1318
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v6=(Integer);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 1305
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);v6=(Boolean);v7=(Uninit);v8=(Uninit);
a=0;//     and-int/lit8 v6, p1, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-ne v6, v4, :cond_2
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 1306
a=0;//     .local v0, "checkHorizontal":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     and-int/lit8 v6, p1, 0x2
a=0;// 
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v6, v7, :cond_3
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 1308
a=0;//     .local v1, "checkVertical":Z
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F
a=0;// 
a=0;//     #v6=(Reference,[F);
a=0;//     aget v6, v6, p2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     #v7=(Reference,[F);
a=0;//     aget v7, v7, p2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float v2, v6, v7
a=0;// 
a=0;//     .line 1309
a=0;//     .local v2, "dx":F
a=0;//     #v2=(Float);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F
a=0;// 
a=0;//     #v6=(Reference,[F);
a=0;//     aget v6, v6, p2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F
a=0;// 
a=0;//     #v7=(Reference,[F);
a=0;//     aget v7, v7, p2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float v3, v6, v7
a=0;// 
a=0;//     .line 1311
a=0;//     .local v3, "dy":F
a=0;//     #v3=(Float);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1312
a=0;//     mul-float v6, v2, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     mul-float v7, v3, v3
a=0;// 
a=0;//     #v7=(Float);
a=0;//     add-float/2addr v6, v7
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iget v8, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     mul-int/2addr v7, v8
a=0;// 
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     cmpl-float v6, v6, v7
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gtz v6, :cond_0
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v0    # "checkHorizontal":Z
a=0;//     .end local v1    # "checkVertical":Z
a=0;//     .end local v2    # "dx":F
a=0;//     .end local v3    # "dy":F
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(One);v6=(Integer);v7=(Uninit);v8=(Uninit);
a=0;//     move v0, v5
a=0;// 
a=0;//     .line 1305
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v0    # "checkHorizontal":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v7=(PosByte);
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 1306
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1313
a=0;//     .restart local v1    # "checkVertical":Z
a=0;//     .restart local v2    # "dx":F
a=0;//     .restart local v3    # "dy":F
a=0;//     :cond_4
a=0;//     #v1=(Boolean);v2=(Float);v3=(Float);v7=(Integer);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 1314
a=0;//     invoke-static {v2}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     cmpl-float v6, v6, v7
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gtz v6, :cond_0
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1315
a=0;//     :cond_5
a=0;//     #v4=(One);v6=(Integer);v7=(Integer);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 1316
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     cmpl-float v6, v6, v7
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-gtz v6, :cond_0
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_6
a=0;//     #v4=(One);v6=(Integer);v7=(Integer);
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 1318
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public continueSettling(Z)Z
a=0;//     .locals 9
a=0;//     .param p1, "deferCallbacks"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 715
a=0;//     #v7=(Null);
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v8, :cond_5
a=0;// 
a=0;//     .line 716
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->computeScrollOffset()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 717
a=0;//     .local v6, "keepGoing":Z
a=0;//     #v6=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrX()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 718
a=0;//     .local v2, "x":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getCurrY()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 719
a=0;//     .local v3, "y":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v4, v2, v0
a=0;// 
a=0;//     .line 720
a=0;//     .local v4, "dx":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sub-int v5, v3, v0
a=0;// 
a=0;//     .line 722
a=0;//     .local v5, "dy":I
a=0;//     #v5=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 723
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v4}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     .line 725
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 726
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v5}, Landroid/view/View;->offsetTopAndBottom(I)V
a=0;// 
a=0;//     .line 729
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     if-eqz v5, :cond_3
a=0;// 
a=0;//     .line 730
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewPositionChanged(Landroid/view/View;IIII)V
a=0;// 
a=0;//     .line 733
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getFinalX()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v2, v0, :cond_4
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->getFinalY()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v3, v0, :cond_4
a=0;// 
a=0;//     .line 736
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->abortAnimation()V
a=0;// 
a=0;//     .line 737
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ScrollerCompat;->isFinished()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 740
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     if-nez v6, :cond_5
a=0;// 
a=0;//     .line 741
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     .line 742
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mSetIdleRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 749
a=0;//     .end local v2    # "x":I
a=0;//     .end local v3    # "y":I
a=0;//     .end local v4    # "dx":I
a=0;//     .end local v5    # "dy":I
a=0;//     .end local v6    # "keepGoing":Z
a=0;//     :cond_5
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v8, :cond_7
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 744
a=0;//     .restart local v2    # "x":I
a=0;//     .restart local v3    # "y":I
a=0;//     .restart local v4    # "dx":I
a=0;//     .restart local v5    # "dy":I
a=0;//     .restart local v6    # "keepGoing":Z
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Boolean);
a=0;//     invoke-virtual {p0, v7}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v2    # "x":I
a=0;//     .end local v3    # "y":I
a=0;//     .end local v4    # "dx":I
a=0;//     .end local v5    # "dy":I
a=0;//     .end local v6    # "keepGoing":Z
a=0;//     :cond_7
a=0;//     #v0=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 749
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public findTopChildUnder(II)Landroid/view/View;
a=0;//     .locals 5
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1428
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1429
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, v1, -0x1
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ltz v2, :cond_1
a=0;// 
a=0;//     .line 1430
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mParentView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup;);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     invoke-virtual {v4, v2}, Landroid/support/v4/widget/ViewDragHelper$Callback;->getOrderedChildIndex(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1431
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lt p1, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ge p1, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-lt p2, v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-ge p2, v3, :cond_0
a=0;// 
a=0;//     .line 1436
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1429
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v3=(Integer);v4=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1436
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public flingCapturedView(IIII)V
a=0;//     .locals 9
a=0;//     .param p1, "minLeft"    # I
a=0;//     .param p2, "minTop"    # I
a=0;//     .param p3, "maxLeft"    # I
a=0;//     .param p4, "maxTop"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 690
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mReleaseInProgress:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 691
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot flingCapturedView outside of a call to Callback#onViewReleased"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 695
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mScroller:Landroid/support/v4/widget/ScrollerCompat;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ScrollerCompat;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iget v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iget v5, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v5, p1
a=0;// 
a=0;//     move v6, p3
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     move v7, p2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move v8, p4
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual/range {v0 .. v8}, Landroid/support/v4/widget/ScrollerCompat;->fling(IIIIIIII)V
a=0;// 
a=0;//     .line 700
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/ViewDragHelper;->setDragState(I)V
a=0;// 
a=0;//     .line 701
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getActivePointerId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 483
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCapturedView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getEdgeSize()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mEdgeSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMinVelocity()F
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTouchSlop()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 490
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mTouchSlop:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getViewDragState()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCapturedViewUnder(II)Z
a=0;//     .locals 1
a=0;//     .param p1, "x"    # I
a=0;//     .param p2, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1397
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0, p1, p2}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isEdgeTouched(I)Z
a=0;//     .locals 3
a=0;//     .param p1, "edges"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1331
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     array-length v0, v2
a=0;// 
a=0;//     .line 1332
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 1333
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/ViewDragHelper;->isEdgeTouched(II)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1334
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 1337
a=0;//     :goto_1
a=0;//     return v2
a=0;// 
a=0;//     .line 1332
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1337
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public isEdgeTouched(II)Z
a=0;//     .locals 1
a=0;//     .param p1, "edges"    # I
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1351
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/widget/ViewDragHelper;->isPointerDown(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     aget v0, v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p1
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isPointerDown(I)Z
a=0;//     .locals 3
a=0;//     .param p1, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 860
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mPointersDown:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int v2, v0, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v1, v2
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
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
a=0;// .method public isViewUnder(Landroid/view/View;II)Z
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "x"    # I
a=0;//     .param p3, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1410
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 1413
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt p2, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ge p2, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-lt p3, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-ge p3, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public processTouchEvent(Landroid/view/MotionEvent;)V
a=0;//     .locals 21
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1046
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1047
a=0;//     .local v3, "action":I
a=0;//     #v3=(Integer);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1049
a=0;//     .local v4, "actionIndex":I
a=0;//     #v4=(Integer);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 1052
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 1055
a=0;//     :cond_0
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v19, :cond_1
a=0;// 
a=0;//     .line 1056
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iput-object v0, v1, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 1058
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1060
a=0;//     packed-switch v3, :pswitch_data_0
a=0;// 
a=0;//     .line 1194
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1062
a=0;//     :pswitch_1
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);v1=(Reference,Landroid/view/MotionEvent;);v2=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Reference,Landroid/view/VelocityTracker;);v20=(Uninit);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 1063
a=0;//     .local v17, "x":F
a=0;//     #v17=(Float);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 1064
a=0;//     .local v18, "y":F
a=0;//     #v18=(Float);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1065
a=0;//     .local v15, "pointerId":I
a=0;//     #v15=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 1067
a=0;//     .local v16, "toCapture":Landroid/view/View;
a=0;//     #v16=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-direct {v0, v1, v2, v15}, Landroid/support/v4/widget/ViewDragHelper;->saveInitialMotion(FFI)V
a=0;// 
a=0;//     .line 1072
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v16
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z
a=0;// 
a=0;//     .line 1074
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,[I);
a=0;//     aget v7, v19, v15
a=0;// 
a=0;//     .line 1075
a=0;//     .local v7, "edgesTouched":I
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     and-int v19, v19, v7
a=0;// 
a=0;//     if-eqz v19, :cond_2
a=0;// 
a=0;//     .line 1076
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     and-int v20, v20, v7
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeTouched(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1082
a=0;//     .end local v7    # "edgesTouched":I
a=0;//     .end local v15    # "pointerId":I
a=0;//     .end local v16    # "toCapture":Landroid/view/View;
a=0;//     .end local v17    # "x":F
a=0;//     .end local v18    # "y":F
a=0;//     :pswitch_2
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);v2=(Uninit);v7=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v20=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v4}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1083
a=0;//     .restart local v15    # "pointerId":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v4}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 1084
a=0;//     .restart local v17    # "x":F
a=0;//     #v17=(Float);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v4}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 1086
a=0;//     .restart local v18    # "y":F
a=0;//     #v18=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Float);
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-direct {v0, v1, v2, v15}, Landroid/support/v4/widget/ViewDragHelper;->saveInitialMotion(FFI)V
a=0;// 
a=0;//     .line 1089
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     if-nez v19, :cond_3
a=0;// 
a=0;//     .line 1092
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 1093
a=0;//     .restart local v16    # "toCapture":Landroid/view/View;
a=0;//     #v16=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v16
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z
a=0;// 
a=0;//     .line 1095
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,[I);
a=0;//     aget v7, v19, v15
a=0;// 
a=0;//     .line 1096
a=0;//     .restart local v7    # "edgesTouched":I
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     and-int v19, v19, v7
a=0;// 
a=0;//     if-eqz v19, :cond_2
a=0;// 
a=0;//     .line 1097
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     and-int v20, v20, v7
a=0;// 
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeTouched(II)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1099
a=0;//     .end local v7    # "edgesTouched":I
a=0;//     .end local v16    # "toCapture":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Float);v2=(Float);v7=(Uninit);v16=(Uninit);v19=(Integer);v20=(Uninit);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->isCapturedViewUnder(II)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_2
a=0;// 
a=0;//     .line 1104
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v19
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1110
a=0;//     .end local v15    # "pointerId":I
a=0;//     .end local v17    # "x":F
a=0;//     .end local v18    # "y":F
a=0;//     :pswitch_3
a=0;//     #v2=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v20=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_4
a=0;// 
a=0;//     .line 1111
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/MotionEventCompat;->findPointerIndex(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 1112
a=0;//     .local v12, "index":I
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v12}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 1113
a=0;//     .restart local v17    # "x":F
a=0;//     #v17=(Float);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v12}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 1114
a=0;//     .restart local v18    # "y":F
a=0;//     #v18=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionX:[F
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,[F);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     aget v19, v19, v20
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     sub-float v19, v17, v19
a=0;// 
a=0;//     #v19=(Float);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v10, v0
a=0;// 
a=0;//     .line 1115
a=0;//     .local v10, "idx":I
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mLastMotionY:[F
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,[F);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     aget v19, v19, v20
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     sub-float v19, v18, v19
a=0;// 
a=0;//     #v19=(Float);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v11, v0
a=0;// 
a=0;//     .line 1117
a=0;//     .local v11, "idy":I
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v19 .. v19}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     add-int v19, v19, v10
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v20 .. v20}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     add-int v20, v20, v11
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v0, v1, v2, v10, v11}, Landroid/support/v4/widget/ViewDragHelper;->dragTo(IIII)V
a=0;// 
a=0;//     .line 1119
a=0;//     invoke-direct/range {p0 .. p1}, Landroid/support/v4/widget/ViewDragHelper;->saveLastMotion(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1122
a=0;//     .end local v10    # "idx":I
a=0;//     .end local v11    # "idy":I
a=0;//     .end local v12    # "index":I
a=0;//     .end local v17    # "x":F
a=0;//     .end local v18    # "y":F
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(One);v2=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v17=(Uninit);v18=(Uninit);v20=(One);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1123
a=0;//     .local v14, "pointerCount":I
a=0;//     #v14=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Integer);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Integer);
a=0;//     if-ge v8, v14, :cond_5
a=0;// 
a=0;//     .line 1124
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1125
a=0;//     .restart local v15    # "pointerId":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 1126
a=0;//     .restart local v17    # "x":F
a=0;//     #v17=(Float);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 1127
a=0;//     .restart local v18    # "y":F
a=0;//     #v18=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,[F);
a=0;//     aget v19, v19, v15
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     sub-float v5, v17, v19
a=0;// 
a=0;//     .line 1128
a=0;//     .local v5, "dx":F
a=0;//     #v5=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,[F);
a=0;//     aget v19, v19, v15
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     sub-float v6, v18, v19
a=0;// 
a=0;//     .line 1130
a=0;//     .local v6, "dy":F
a=0;//     #v6=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v0, v5, v6, v15}, Landroid/support/v4/widget/ViewDragHelper;->reportNewEdgeDrags(FFI)V
a=0;// 
a=0;//     .line 1131
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     .line 1142
a=0;//     .end local v5    # "dx":F
a=0;//     .end local v6    # "dy":F
a=0;//     .end local v15    # "pointerId":I
a=0;//     .end local v17    # "x":F
a=0;//     .end local v18    # "y":F
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);v15=(Conflicted);v17=(Conflicted);v18=(Conflicted);v20=(Integer);
a=0;//     invoke-direct/range {p0 .. p1}, Landroid/support/v4/widget/ViewDragHelper;->saveLastMotion(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1136
a=0;//     .restart local v5    # "dx":F
a=0;//     .restart local v6    # "dy":F
a=0;//     .restart local v15    # "pointerId":I
a=0;//     .restart local v17    # "x":F
a=0;//     .restart local v18    # "y":F
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(One);v5=(Float);v6=(Float);v15=(Integer);v17=(Float);v18=(Float);v20=(One);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     .line 1137
a=0;//     .restart local v16    # "toCapture":Landroid/view/View;
a=0;//     #v16=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v16
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {v0, v1, v5, v6}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(Landroid/view/View;FF)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_7
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v16
a=0;// 
a=0;//     invoke-virtual {v0, v1, v15}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     if-nez v19, :cond_5
a=0;// 
a=0;//     .line 1123
a=0;//     :cond_7
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1148
a=0;//     .end local v5    # "dx":F
a=0;//     .end local v6    # "dy":F
a=0;//     .end local v8    # "i":I
a=0;//     .end local v14    # "pointerCount":I
a=0;//     .end local v15    # "pointerId":I
a=0;//     .end local v16    # "toCapture":Landroid/view/View;
a=0;//     .end local v17    # "x":F
a=0;//     .end local v18    # "y":F
a=0;//     :pswitch_4
a=0;//     #v2=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Reference,Landroid/view/VelocityTracker;);v20=(Uninit);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v4}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 1149
a=0;//     .restart local v15    # "pointerId":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     if-ne v15, v0, :cond_b
a=0;// 
a=0;//     .line 1151
a=0;//     const/4 v13, -0x1
a=0;// 
a=0;//     .line 1152
a=0;//     .local v13, "newActivePointer":I
a=0;//     #v13=(Byte);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1153
a=0;//     .restart local v14    # "pointerCount":I
a=0;//     #v14=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .restart local v8    # "i":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v8=(Integer);v9=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     if-ge v8, v14, :cond_a
a=0;// 
a=0;//     .line 1154
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1155
a=0;//     .local v9, "id":I
a=0;//     #v9=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     if-ne v9, v0, :cond_9
a=0;// 
a=0;//     .line 1153
a=0;//     :cond_8
a=0;//     #v0=(Conflicted);v19=(Conflicted);
a=0;//     add-int/lit8 v8, v8, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1160
a=0;//     :cond_9
a=0;//     #v0=(Integer);v19=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 1161
a=0;//     .restart local v17    # "x":F
a=0;//     #v17=(Float);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-static {v0, v8}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 1162
a=0;//     .restart local v18    # "y":F
a=0;//     #v18=(Float);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     #v19=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, v19
a=0;// 
a=0;//     move-object/from16 v1, v20
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v19
a=0;// 
a=0;//     invoke-virtual {v0, v1, v9}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_8
a=0;// 
a=0;//     .line 1164
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     .line 1169
a=0;//     .end local v9    # "id":I
a=0;//     .end local v17    # "x":F
a=0;//     .end local v18    # "y":F
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v9=(Conflicted);v13=(Integer);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);
a=0;//     const/16 v19, -0x1
a=0;// 
a=0;//     #v19=(Byte);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v13, v0, :cond_b
a=0;// 
a=0;//     .line 1171
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->releaseViewForPointerUp()V
a=0;// 
a=0;//     .line 1174
a=0;//     .end local v8    # "i":I
a=0;//     .end local v13    # "newActivePointer":I
a=0;//     .end local v14    # "pointerCount":I
a=0;//     :cond_b
a=0;//     #v0=(Integer);v8=(Conflicted);v13=(Conflicted);v14=(Conflicted);v19=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-direct {v0, v15}, Landroid/support/v4/widget/ViewDragHelper;->clearMotionHistory(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1179
a=0;//     .end local v15    # "pointerId":I
a=0;//     :pswitch_5
a=0;//     #v1=(Reference,Landroid/view/MotionEvent;);v2=(Uninit);v8=(Uninit);v9=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Reference,Landroid/view/VelocityTracker;);v20=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_c
a=0;// 
a=0;//     .line 1180
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->releaseViewForPointerUp()V
a=0;// 
a=0;//     .line 1182
a=0;//     :cond_c
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1187
a=0;//     :pswitch_6
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);v1=(Reference,Landroid/view/MotionEvent;);v19=(Reference,Landroid/view/VelocityTracker;);v20=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     #v20=(One);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_d
a=0;// 
a=0;//     .line 1188
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/support/v4/widget/ViewDragHelper;->dispatchViewReleased(FF)V
a=0;// 
a=0;//     .line 1190
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v19=(Integer);v20=(Boolean);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1060
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_5
a=0;//         :pswitch_3
a=0;//         :pswitch_6
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method setDragState(I)V
a=0;//     .locals 1
a=0;//     .param p1, "state"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 864
a=0;//     iget v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 865
a=0;//     iput p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     .line 866
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onViewDragStateChanged(I)V
a=0;// 
a=0;//     .line 867
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 868
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     .line 871
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setEdgeTrackingEnabled(I)V
a=0;//     .locals 0
a=0;//     .param p1, "edgeFlags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     iput p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     .line 438
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMinVelocity(F)V
a=0;//     .locals 0
a=0;//     .param p1, "minVel"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     iput p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mMinVelocity:F
a=0;// 
a=0;//     .line 402
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public settleCapturedViewAt(II)Z
a=0;//     .locals 3
a=0;//     .param p1, "finalLeft"    # I
a=0;//     .param p2, "finalTop"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 557
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mReleaseInProgress:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 558
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 562
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/VelocityTrackerCompat;->getXVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/VelocityTracker;);
a=0;//     iget v2, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Landroid/support/v4/view/VelocityTrackerCompat;->getYVelocity(Landroid/view/VelocityTracker;I)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, p2, v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->forceSettleCapturedViewAt(IIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 13
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 939
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 940
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionIndex(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 942
a=0;//     .local v1, "actionIndex":I
a=0;//     #v1=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 945
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 948
a=0;//     :cond_0
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/VelocityTracker;);
a=0;//     if-nez v11, :cond_1
a=0;// 
a=0;//     .line 949
a=0;//     invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     iput-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     .line 951
a=0;//     :cond_1
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mVelocityTracker:Landroid/view/VelocityTracker;
a=0;// 
a=0;//     invoke-virtual {v11, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 953
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 1036
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     if-ne v11, v12, :cond_8
a=0;// 
a=0;//     const/4 v11, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v11=(Boolean);
a=0;//     return v11
a=0;// 
a=0;//     .line 955
a=0;//     :pswitch_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Reference,Landroid/view/VelocityTracker;);v12=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 956
a=0;//     .local v9, "x":F
a=0;//     #v9=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 957
a=0;//     .local v10, "y":F
a=0;//     #v10=(Float);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {p1, v11}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 958
a=0;//     .local v7, "pointerId":I
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {p0, v9, v10, v7}, Landroid/support/v4/widget/ViewDragHelper;->saveInitialMotion(FFI)V
a=0;// 
a=0;//     .line 960
a=0;//     float-to-int v11, v9
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     float-to-int v12, v10
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {p0, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 963
a=0;//     .local v8, "toCapture":Landroid/view/View;
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     if-ne v8, v11, :cond_3
a=0;// 
a=0;//     iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     if-ne v11, v12, :cond_3
a=0;// 
a=0;//     .line 964
a=0;//     invoke-virtual {p0, v8, v7}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z
a=0;// 
a=0;//     .line 967
a=0;//     :cond_3
a=0;//     #v11=(Conflicted);v12=(Integer);
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     #v11=(Reference,[I);
a=0;//     aget v4, v11, v7
a=0;// 
a=0;//     .line 968
a=0;//     .local v4, "edgesTouched":I
a=0;//     #v4=(Integer);
a=0;//     iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     and-int/2addr v11, v4
a=0;// 
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     .line 969
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     iget v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     and-int/2addr v12, v4
a=0;// 
a=0;//     invoke-virtual {v11, v12, v7}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeTouched(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 975
a=0;//     .end local v4    # "edgesTouched":I
a=0;//     .end local v7    # "pointerId":I
a=0;//     .end local v8    # "toCapture":Landroid/view/View;
a=0;//     .end local v9    # "x":F
a=0;//     .end local v10    # "y":F
a=0;//     :pswitch_2
a=0;//     #v4=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Uninit);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 976
a=0;//     .restart local v7    # "pointerId":I
a=0;//     #v7=(Integer);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 977
a=0;//     .restart local v9    # "x":F
a=0;//     #v9=(Float);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 979
a=0;//     .restart local v10    # "y":F
a=0;//     #v10=(Float);
a=0;//     invoke-direct {p0, v9, v10, v7}, Landroid/support/v4/widget/ViewDragHelper;->saveInitialMotion(FFI)V
a=0;// 
a=0;//     .line 982
a=0;//     iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     if-nez v11, :cond_4
a=0;// 
a=0;//     .line 983
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialEdgesTouched:[I
a=0;// 
a=0;//     #v11=(Reference,[I);
a=0;//     aget v4, v11, v7
a=0;// 
a=0;//     .line 984
a=0;//     .restart local v4    # "edgesTouched":I
a=0;//     #v4=(Integer);
a=0;//     iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     and-int/2addr v11, v4
a=0;// 
a=0;//     if-eqz v11, :cond_2
a=0;// 
a=0;//     .line 985
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     iget v12, p0, Landroid/support/v4/widget/ViewDragHelper;->mTrackingEdges:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     and-int/2addr v12, v4
a=0;// 
a=0;//     invoke-virtual {v11, v12, v7}, Landroid/support/v4/widget/ViewDragHelper$Callback;->onEdgeTouched(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 987
a=0;//     .end local v4    # "edgesTouched":I
a=0;//     :cond_4
a=0;//     #v4=(Uninit);v11=(Integer);v12=(Uninit);
a=0;//     iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     const/4 v12, 0x2
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     if-ne v11, v12, :cond_2
a=0;// 
a=0;//     .line 989
a=0;//     float-to-int v11, v9
a=0;// 
a=0;//     float-to-int v12, v10
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {p0, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 990
a=0;//     .restart local v8    # "toCapture":Landroid/view/View;
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v11=(Reference,Landroid/view/View;);
a=0;//     if-ne v8, v11, :cond_2
a=0;// 
a=0;//     .line 991
a=0;//     invoke-virtual {p0, v8, v7}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 999
a=0;//     .end local v7    # "pointerId":I
a=0;//     .end local v8    # "toCapture":Landroid/view/View;
a=0;//     .end local v9    # "x":F
a=0;//     .end local v10    # "y":F
a=0;//     :pswitch_3
a=0;//     #v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v12=(Uninit);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getPointerCount(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1000
a=0;//     .local v6, "pointerCount":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v5=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-ge v5, v6, :cond_5
a=0;// 
a=0;//     .line 1001
a=0;//     invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1002
a=0;//     .restart local v7    # "pointerId":I
a=0;//     #v7=(Integer);
a=0;//     invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getX(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1003
a=0;//     .restart local v9    # "x":F
a=0;//     #v9=(Float);
a=0;//     invoke-static {p1, v5}, Landroid/support/v4/view/MotionEventCompat;->getY(Landroid/view/MotionEvent;I)F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1004
a=0;//     .restart local v10    # "y":F
a=0;//     #v10=(Float);
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionX:[F
a=0;// 
a=0;//     #v11=(Reference,[F);
a=0;//     aget v11, v11, v7
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     sub-float v2, v9, v11
a=0;// 
a=0;//     .line 1005
a=0;//     .local v2, "dx":F
a=0;//     #v2=(Float);
a=0;//     iget-object v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mInitialMotionY:[F
a=0;// 
a=0;//     #v11=(Reference,[F);
a=0;//     aget v11, v11, v7
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     sub-float v3, v10, v11
a=0;// 
a=0;//     .line 1007
a=0;//     .local v3, "dy":F
a=0;//     #v3=(Float);
a=0;//     invoke-direct {p0, v2, v3, v7}, Landroid/support/v4/widget/ViewDragHelper;->reportNewEdgeDrags(FFI)V
a=0;// 
a=0;//     .line 1008
a=0;//     iget v11, p0, Landroid/support/v4/widget/ViewDragHelper;->mDragState:I
a=0;// 
a=0;//     const/4 v12, 0x1
a=0;// 
a=0;//     #v12=(One);
a=0;//     if-ne v11, v12, :cond_6
a=0;// 
a=0;//     .line 1019
a=0;//     .end local v2    # "dx":F
a=0;//     .end local v3    # "dy":F
a=0;//     .end local v7    # "pointerId":I
a=0;//     .end local v9    # "x":F
a=0;//     .end local v10    # "y":F
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/ViewDragHelper;->saveLastMotion(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1013
a=0;//     .restart local v2    # "dx":F
a=0;//     .restart local v3    # "dy":F
a=0;//     .restart local v7    # "pointerId":I
a=0;//     .restart local v9    # "x":F
a=0;//     .restart local v10    # "y":F
a=0;//     :cond_6
a=0;//     #v2=(Float);v3=(Float);v7=(Integer);v9=(Float);v10=(Float);v11=(Integer);v12=(One);
a=0;//     float-to-int v11, v9
a=0;// 
a=0;//     float-to-int v12, v10
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {p0, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1014
a=0;//     .restart local v8    # "toCapture":Landroid/view/View;
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     invoke-direct {p0, v8, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(Landroid/view/View;FF)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_7
a=0;// 
a=0;//     invoke-virtual {p0, v8, v7}, Landroid/support/v4/widget/ViewDragHelper;->tryCaptureViewForDrag(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     if-nez v11, :cond_5
a=0;// 
a=0;//     .line 1000
a=0;//     :cond_7
a=0;//     #v11=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1024
a=0;//     .end local v2    # "dx":F
a=0;//     .end local v3    # "dy":F
a=0;//     .end local v5    # "i":I
a=0;//     .end local v6    # "pointerCount":I
a=0;//     .end local v7    # "pointerId":I
a=0;//     .end local v8    # "toCapture":Landroid/view/View;
a=0;//     .end local v9    # "x":F
a=0;//     .end local v10    # "y":F
a=0;//     :pswitch_4
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Reference,Landroid/view/VelocityTracker;);v12=(Uninit);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/MotionEventCompat;->getPointerId(Landroid/view/MotionEvent;I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1025
a=0;//     .restart local v7    # "pointerId":I
a=0;//     #v7=(Integer);
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/widget/ViewDragHelper;->clearMotionHistory(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1031
a=0;//     .end local v7    # "pointerId":I
a=0;//     :pswitch_5
a=0;//     #v7=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1036
a=0;//     :cond_8
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Integer);v12=(One);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 953
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_5
a=0;//         :pswitch_3
a=0;//         :pswitch_5
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_4
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public smoothSlideViewTo(Landroid/view/View;II)Z
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "finalLeft"    # I
a=0;//     .param p3, "finalTop"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 539
a=0;//     #v1=(Null);
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     .line 540
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     .line 542
a=0;//     invoke-direct {p0, p2, p3, v1, v1}, Landroid/support/v4/widget/ViewDragHelper;->forceSettleCapturedViewAt(IIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method tryCaptureViewForDrag(Landroid/view/View;I)Z
a=0;//     .locals 2
a=0;//     .param p1, "toCapture"    # Landroid/view/View;
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 883
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCapturedView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-ne p1, v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, p2, :cond_0
a=0;// 
a=0;//     .line 892
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 887
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/ViewDragHelper;->mCallback:Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper$Callback;);
a=0;//     invoke-virtual {v1, p1, p2}, Landroid/support/v4/widget/ViewDragHelper$Callback;->tryCaptureView(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 888
a=0;//     iput p2, p0, Landroid/support/v4/widget/ViewDragHelper;->mActivePointerId:I
a=0;// 
a=0;//     .line 889
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 892
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
