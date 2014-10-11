package android.support.v4.widget; class DrawerLayout { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/DrawerLayout;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "DrawerLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;,
a=0;//         Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;,
a=0;//         Landroid/support/v4/widget/DrawerLayout$LayoutParams;,
a=0;//         Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;,
a=0;//         Landroid/support/v4/widget/DrawerLayout$SavedState;,
a=0;//         Landroid/support/v4/widget/DrawerLayout$SimpleDrawerListener;,
a=0;//         Landroid/support/v4/widget/DrawerLayout$DrawerListener;,
a=0;//         Landroid/support/v4/widget/DrawerLayout$EdgeGravity;,
a=0;//         Landroid/support/v4/widget/DrawerLayout$LockMode;,
a=0;//         Landroid/support/v4/widget/DrawerLayout$State;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ALLOW_EDGE_LOCK:Z = false
a=0;// 
a=0;// .field private static final CHILDREN_DISALLOW_INTERCEPT:Z = true
a=0;// 
a=0;// .field private static final DEFAULT_SCRIM_COLOR:I = -0x67000000
a=0;// 
a=0;// .field private static final LAYOUT_ATTRS:[I
a=0;// 
a=0;// .field public static final LOCK_MODE_LOCKED_CLOSED:I = 0x1
a=0;// 
a=0;// .field public static final LOCK_MODE_LOCKED_OPEN:I = 0x2
a=0;// 
a=0;// .field public static final LOCK_MODE_UNLOCKED:I = 0x0
a=0;// 
a=0;// .field private static final MIN_DRAWER_MARGIN:I = 0x40
a=0;// 
a=0;// .field private static final MIN_FLING_VELOCITY:I = 0x190
a=0;// 
a=0;// .field private static final PEEK_DELAY:I = 0xa0
a=0;// 
a=0;// .field public static final STATE_DRAGGING:I = 0x1
a=0;// 
a=0;// .field public static final STATE_IDLE:I = 0x0
a=0;// 
a=0;// .field public static final STATE_SETTLING:I = 0x2
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "DrawerLayout"
a=0;// 
a=0;// .field private static final TOUCH_SLOP_SENSITIVITY:F = 1.0f
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mChildAccessibilityDelegate:Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;
a=0;// 
a=0;// .field private mChildrenCanceledTouch:Z
a=0;// 
a=0;// .field private mDisallowInterceptRequested:Z
a=0;// 
a=0;// .field private mDrawerState:I
a=0;// 
a=0;// .field private mFirstLayout:Z
a=0;// 
a=0;// .field private mInLayout:Z
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInitialMotionY:F
a=0;// 
a=0;// .field private final mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;// .field private final mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;// .field private mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;// .field private mLockModeLeft:I
a=0;// 
a=0;// .field private mLockModeRight:I
a=0;// 
a=0;// .field private mMinDrawerMargin:I
a=0;// 
a=0;// .field private final mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;// .field private final mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;// .field private mScrimColor:I
a=0;// 
a=0;// .field private mScrimOpacity:F
a=0;// 
a=0;// .field private mScrimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mTitleLeft:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mTitleRight:Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
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
a=0;//     sput-object v0, Landroid/support/v4/widget/DrawerLayout;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 253
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/DrawerLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 257
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 6
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v5, 0x3f800000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 260
a=0;//     #v4=(One);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 162
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     new-instance v2, Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;-><init>(Landroid/support/v4/widget/DrawerLayout;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mChildAccessibilityDelegate:Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;
a=0;// 
a=0;//     .line 167
a=0;//     const/high16 v2, -0x67000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
a=0;// 
a=0;//     .line 169
a=0;//     new-instance v2, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 177
a=0;//     iput-boolean v4, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 262
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v0, v2, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 263
a=0;//     .local v0, "density":F
a=0;//     #v0=(Integer);
a=0;//     const/high16 v2, 0x42800000
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
a=0;//     iput v2, p0, Landroid/support/v4/widget/DrawerLayout;->mMinDrawerMargin:I
a=0;// 
a=0;//     .line 264
a=0;//     const/high16 v2, 0x43c80000
a=0;// 
a=0;//     mul-float v1, v2, v0
a=0;// 
a=0;//     .line 266
a=0;//     .local v1, "minVel":F
a=0;//     #v1=(Float);
a=0;//     new-instance v2, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-direct {v2, p0, v3}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;-><init>(Landroid/support/v4/widget/DrawerLayout;I)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     .line 267
a=0;//     new-instance v2, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     invoke-direct {v2, p0, v3}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;-><init>(Landroid/support/v4/widget/DrawerLayout;I)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     invoke-static {p0, v5, v2}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v2, v4}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->setDragger(Landroid/support/v4/widget/ViewDragHelper;)V
a=0;// 
a=0;//     .line 274
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     invoke-static {p0, v5, v2}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V
a=0;// 
a=0;//     .line 276
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->setDragger(Landroid/support/v4/widget/ViewDragHelper;)V
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/widget/DrawerLayout;->setFocusableInTouchMode(Z)V
a=0;// 
a=0;//     .line 282
a=0;//     invoke-static {p0, v4}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 285
a=0;//     new-instance v2, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;-><init>(Landroid/support/v4/widget/DrawerLayout;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/DrawerLayout$AccessibilityDelegate;);
a=0;//     invoke-static {p0, v2}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;// 
a=0;//     .line 286
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0, v2}, Landroid/support/v4/view/ViewGroupCompat;->setMotionEventSplittingEnabled(Landroid/view/ViewGroup;Z)V
a=0;// 
a=0;//     .line 287
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100()[I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     sget-object v0, Landroid/support/v4/widget/DrawerLayout;->LAYOUT_ATTRS:[I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/widget/DrawerLayout;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->findVisibleDrawer()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/view/View;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-static {p0}, Landroid/support/v4/widget/DrawerLayout;->includeChildForAccessibilitiy(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private findVisibleDrawer()Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1308
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1309
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v2, v1, :cond_1
a=0;// 
a=0;//     .line 1310
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1311
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerVisible(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 1315
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1309
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v3=(Boolean);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1315
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static gravityToString(I)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 689
a=0;//     and-int/lit8 v0, p0, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 690
a=0;//     const-string v0, "LEFT"
a=0;// 
a=0;//     .line 695
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 692
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, p0, 0x5
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 693
a=0;//     const-string v0, "RIGHT"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 695
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static hasOpaqueBackground(Landroid/view/View;)Z
a=0;//     .locals 4
a=0;//     .param p0, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 894
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 895
a=0;//     .local v0, "bg":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 896
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v2, v3, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 898
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method private hasPeekingDrawer()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 1269
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1270
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 1271
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1272
a=0;//     .local v2, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     iget-boolean v3, v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 1273
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 1276
a=0;//     .end local v2    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 1270
a=0;//     .restart local v2    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :cond_0
a=0;//     #v2=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1276
a=0;//     .end local v2    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private hasVisibleDrawer()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1304
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->findVisibleDrawer()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static includeChildForAccessibilitiy(Landroid/view/View;)Z
a=0;//     .locals 2
a=0;//     .param p0, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1420
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getImportantForAccessibility(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
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
a=0;// 
a=0;// # virtual methods
a=0;// .method public addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "index"    # I
a=0;//     .param p3, "params"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1400
a=0;//     if-gtz p2, :cond_0
a=0;// 
a=0;//     if-gez p2, :cond_1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 1401
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 1405
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mChildAccessibilityDelegate:Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$ChildAccessibilityDelegate;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;// 
a=0;//     .line 1411
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 1412
a=0;//     return-void
a=0;// 
a=0;//     .line 1408
a=0;//     :cond_1
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method cancelChildViewTouch()V
a=0;//     .locals 11
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1320
a=0;//     #v5=(Null);
a=0;//     iget-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 1321
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 1322
a=0;//     .local v0, "now":J
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
a=0;//     .line 1324
a=0;//     .local v8, "cancelEvent":Landroid/view/MotionEvent;
a=0;//     #v8=(Reference,Landroid/view/MotionEvent;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1325
a=0;//     .local v9, "childCount":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v10=(Integer);
a=0;//     if-ge v10, v9, :cond_0
a=0;// 
a=0;//     .line 1326
a=0;//     invoke-virtual {p0, v10}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2, v8}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     .line 1325
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1328
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v8}, Landroid/view/MotionEvent;->recycle()V
a=0;// 
a=0;//     .line 1329
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iput-boolean v2, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     .line 1331
a=0;//     .end local v0    # "now":J
a=0;//     .end local v8    # "cancelEvent":Landroid/view/MotionEvent;
a=0;//     .end local v9    # "childCount":I
a=0;//     .end local v10    # "i":I
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;//     .locals 2
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;//     .param p2, "checkFor"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 635
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewAbsoluteGravity(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 636
a=0;//     .local v0, "absGravity":I
a=0;//     #v0=(Integer);
a=0;//     and-int v1, v0, p2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, p2, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1295
a=0;//     instance-of v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
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
a=0;// .method public closeDrawer(I)V
a=0;//     .locals 4
a=0;//     .param p1, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1195
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1196
a=0;//     .local v0, "drawerView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1197
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "No drawer view found with gravity "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->gravityToString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 1200
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1201
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeDrawer(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1169
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1170
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "View "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " is not a sliding drawer"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 1173
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1174
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1175
a=0;//     .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     .line 1176
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     .line 1185
a=0;//     .end local v0    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1186
a=0;//     return-void
a=0;// 
a=0;//     .line 1178
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1179
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     neg-int v2, v2
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, p1, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1182
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, p1, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public closeDrawers()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1088
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 1089
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method closeDrawers(Z)V
a=0;//     .locals 9
a=0;//     .param p1, "peekingOnly"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1092
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1093
a=0;//     .local v5, "needsInvalidate":Z
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1094
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     if-ge v3, v1, :cond_3
a=0;// 
a=0;//     .line 1095
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1096
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1098
a=0;//     .local v4, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget-boolean v6, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 1094
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1102
a=0;//     :cond_1
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1104
a=0;//     .local v2, "childWidth":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v6, 0x3
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {p0, v0, v6}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 1105
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     neg-int v7, v2
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     or-int/2addr v5, v6
a=0;// 
a=0;//     .line 1112
a=0;//     :goto_2
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     iput-boolean v6, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1108
a=0;//     :cond_2
a=0;//     #v6=(Boolean);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v0, v7, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     or-int/2addr v5, v6
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1115
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v2    # "childWidth":I
a=0;//     .end local v4    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     invoke-virtual {v6}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
a=0;// 
a=0;//     .line 1116
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
a=0;// 
a=0;//     .line 1118
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 1119
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1121
a=0;//     :cond_4
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     .line 879
a=0;//     #v6=(One);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 880
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 881
a=0;//     .local v3, "scrimOpacity":F
a=0;//     #v3=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Float);v4=(Conflicted);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 882
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v2, v4, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     .line 883
a=0;//     .local v2, "onscreen":F
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v3, v2}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 881
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 885
a=0;//     .end local v2    # "onscreen":F
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     iput v3, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
a=0;// 
a=0;//     .line 888
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v4, v6}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v5, v6}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 889
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 891
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnDrawerClosed(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 553
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 554
a=0;//     .local v1, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     iget-boolean v3, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 555
a=0;//     iput-boolean v4, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     .line 556
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/DrawerLayout$DrawerListener;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 557
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     invoke-interface {v3, p1}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerClosed(Landroid/view/View;)V
a=0;// 
a=0;//     .line 562
a=0;//     :cond_0
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 563
a=0;//     .local v0, "content":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 564
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-static {v0, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 567
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 573
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->hasWindowFocus()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 574
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getRootView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 575
a=0;//     .local v2, "rootView":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 576
a=0;//     const/16 v3, 0x20
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 580
a=0;//     .end local v0    # "content":Landroid/view/View;
a=0;//     .end local v2    # "rootView":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnDrawerOpened(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 583
a=0;//     #v3=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 584
a=0;//     .local v1, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     iget-boolean v2, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 585
a=0;//     iput-boolean v3, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     .line 586
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/DrawerLayout$DrawerListener;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 587
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     invoke-interface {v2, p1}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerOpened(Landroid/view/View;)V
a=0;// 
a=0;//     .line 592
a=0;//     :cond_0
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 593
a=0;//     .local v0, "content":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 594
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-static {v0, v2}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 597
a=0;//     :cond_1
a=0;//     invoke-static {p1, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 600
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 601
a=0;//     invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z
a=0;// 
a=0;//     .line 603
a=0;//     .end local v0    # "content":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnDrawerSlide(Landroid/view/View;F)V
a=0;//     .locals 1
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;//     .param p2, "slideOffset"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$DrawerListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 607
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerSlide(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 609
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;//     .locals 28
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;//     .param p3, "drawingTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 903
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 904
a=0;//     .local v18, "height":I
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 905
a=0;//     .local v17, "drawingContent":Z
a=0;//     #v17=(Boolean);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .local v13, "clipLeft":I
a=0;//     #v13=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 907
a=0;//     .local v14, "clipRight":I
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/graphics/Canvas;->save()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     .line 908
a=0;//     .local v21, "restoreCount":I
a=0;//     #v21=(Integer);
a=0;//     if-eqz v17, :cond_4
a=0;// 
a=0;//     .line 909
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 910
a=0;//     .local v10, "childCount":I
a=0;//     #v10=(Integer);
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     .local v19, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v13=(Integer);v19=(Integer);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v10, :cond_3
a=0;// 
a=0;//     .line 911
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     .line 912
a=0;//     .local v25, "v":Landroid/view/View;
a=0;//     #v25=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     invoke-static/range {v25 .. v25}, Landroid/support/v4/widget/DrawerLayout;->hasOpaqueBackground(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     .line 910
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     add-int/lit8 v19, v19, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 918
a=0;//     :cond_1
a=0;//     #v0=(Integer);v2=(Integer);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 919
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     .line 920
a=0;//     .local v27, "vright":I
a=0;//     #v27=(Integer);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-le v0, v13, :cond_0
a=0;// 
a=0;//     move/from16 v13, v27
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 922
a=0;//     .end local v27    # "vright":I
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);v27=(Conflicted);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     .line 923
a=0;//     .local v26, "vleft":I
a=0;//     #v26=(Integer);
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v14, :cond_0
a=0;// 
a=0;//     move/from16 v14, v26
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 926
a=0;//     .end local v25    # "v":Landroid/view/View;
a=0;//     .end local v26    # "vleft":I
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v25=(Conflicted);v26=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual {v0, v13, v2, v14, v3}, Landroid/graphics/Canvas;->clipRect(IIII)Z
a=0;// 
a=0;//     .line 928
a=0;//     .end local v10    # "childCount":I
a=0;//     .end local v19    # "i":I
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);v10=(Conflicted);v19=(Conflicted);
a=0;//     invoke-super/range {p0 .. p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 929
a=0;//     .local v22, "result":Z
a=0;//     #v22=(Boolean);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 931
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_6
a=0;// 
a=0;//     if-eqz v17, :cond_6
a=0;// 
a=0;//     .line 932
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/high16 v3, -0x1000000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     ushr-int/lit8 v9, v2, 0x18
a=0;// 
a=0;//     .line 933
a=0;//     .local v9, "baseAlpha":I
a=0;//     #v9=(Char);
a=0;//     int-to-float v2, v9
a=0;// 
a=0;//     #v2=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v3, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
a=0;// 
a=0;//     mul-float/2addr v2, v3
a=0;// 
a=0;//     float-to-int v0, v2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     .line 934
a=0;//     .local v20, "imag":I
a=0;//     #v20=(Integer);
a=0;//     shl-int/lit8 v2, v20, 0x18
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget v3, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
a=0;// 
a=0;//     const v4, 0xffffff
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/2addr v3, v4
a=0;// 
a=0;//     or-int v15, v2, v3
a=0;// 
a=0;//     .line 935
a=0;//     .local v15, "color":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {v2, v15}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 937
a=0;//     int-to-float v3, v13
a=0;// 
a=0;//     #v3=(Float);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     int-to-float v5, v14
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     int-to-float v6, v2
a=0;// 
a=0;//     #v6=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v7, v0, Landroid/support/v4/widget/DrawerLayout;->mScrimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object/from16 v2, p1
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 960
a=0;//     .end local v9    # "baseAlpha":I
a=0;//     .end local v15    # "color":I
a=0;//     .end local v20    # "imag":I
a=0;//     :cond_5
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);v15=(Conflicted);v16=(Conflicted);v20=(Conflicted);v23=(Conflicted);v24=(Conflicted);
a=0;//     return v22
a=0;// 
a=0;//     .line 938
a=0;//     :cond_6
a=0;//     #v1=(Integer);v2=(Byte);v3=(Null);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);v15=(Uninit);v16=(Uninit);v20=(Uninit);v23=(Uninit);v24=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 939
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 940
a=0;//     .local v23, "shadowWidth":I
a=0;//     #v23=(Integer);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 941
a=0;//     .local v12, "childRight":I
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 942
a=0;//     .local v16, "drawerPeekDistance":I
a=0;//     #v16=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     int-to-float v3, v12
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v3, v4
a=0;// 
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 944
a=0;//     .local v8, "alpha":F
a=0;//     #v8=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int v4, v12, v23
a=0;// 
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v12, v3, v4, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 946
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/high16 v3, 0x437f0000
a=0;// 
a=0;//     mul-float/2addr v3, v8
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
a=0;// 
a=0;//     .line 947
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 948
a=0;//     .end local v8    # "alpha":F
a=0;//     .end local v12    # "childRight":I
a=0;//     .end local v16    # "drawerPeekDistance":I
a=0;//     .end local v23    # "shadowWidth":I
a=0;//     :cond_7
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Null);v4=(Uninit);v5=(Uninit);v8=(Uninit);v12=(Uninit);v16=(Uninit);v23=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 949
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 950
a=0;//     .restart local v23    # "shadowWidth":I
a=0;//     #v23=(Integer);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 951
a=0;//     .local v11, "childLeft":I
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int v24, v2, v11
a=0;// 
a=0;//     .line 952
a=0;//     .local v24, "showing":I
a=0;//     #v24=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 953
a=0;//     .restart local v16    # "drawerPeekDistance":I
a=0;//     #v16=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float/2addr v3, v4
a=0;// 
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Ljava/lang/Math;->min(FF)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/Math;->max(FF)F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 955
a=0;//     .restart local v8    # "alpha":F
a=0;//     #v8=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     sub-int v3, v11, v23
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual/range {p2 .. p2}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v2, v3, v4, v11, v5}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 957
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     const/high16 v3, 0x437f0000
a=0;// 
a=0;//     mul-float/2addr v3, v8
a=0;// 
a=0;//     #v3=(Float);
a=0;//     float-to-int v3, v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/graphics/drawable/Drawable;->setAlpha(I)V
a=0;// 
a=0;//     .line 958
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto/16 :goto_2
a=0;// .end method
a=0;// 
a=0;// .method findDrawerWithGravity(I)Landroid/view/View;
a=0;//     .locals 6
a=0;//     .param p1, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 669
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p1, v5}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     and-int/lit8 v0, v5, 0x7
a=0;// 
a=0;//     .line 671
a=0;//     .local v0, "absHorizGravity":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 672
a=0;//     .local v3, "childCount":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Integer);
a=0;//     if-ge v4, v3, :cond_1
a=0;// 
a=0;//     .line 673
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 674
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewAbsoluteGravity(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 675
a=0;//     .local v2, "childAbsGravity":I
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v5, v2, 0x7
a=0;// 
a=0;//     if-ne v5, v0, :cond_0
a=0;// 
a=0;//     .line 679
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v2    # "childAbsGravity":I
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 672
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     .restart local v2    # "childAbsGravity":I
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 679
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v2    # "childAbsGravity":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method findOpenDrawer()Landroid/view/View;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 640
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 641
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v2, v1, :cond_1
a=0;// 
a=0;//     .line 642
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 643
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget-boolean v3, v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 647
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 641
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v3=(Boolean);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 647
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 1281
a=0;//     #v1=(Byte);
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     invoke-direct {v0, v1, v1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1300
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1286
a=0;//     instance-of v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     check-cast p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .end local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/support/v4/widget/DrawerLayout$LayoutParams;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .end local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDrawerLockMode(I)I
a=0;//     .locals 2
a=0;//     .param p1, "edgeGravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 449
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 451
a=0;//     .local v0, "absGravity":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 452
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
a=0;// 
a=0;//     .line 456
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 453
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 454
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 456
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDrawerLockMode(Landroid/view/View;)I
a=0;//     .locals 2
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewAbsoluteGravity(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 469
a=0;//     .local v0, "absGravity":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 470
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
a=0;// 
a=0;//     .line 474
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// 
a=0;//     .line 471
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 472
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 474
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDrawerTitle(I)Ljava/lang/CharSequence;
a=0;//     .locals 2
a=0;//     .param p1, "edgeGravity"    # I
a=0;//     .annotation build Landroid/support/annotation/Nullable;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 507
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 509
a=0;//     .local v0, "absGravity":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 510
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mTitleLeft:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 514
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 511
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 512
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mTitleRight:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 514
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getDrawerViewAbsoluteGravity(Landroid/view/View;)I
a=0;//     .locals 2
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 630
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 631
a=0;//     .local v0, "gravity":I
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method getDrawerViewOffset(Landroid/view/View;)F
a=0;//     .locals 1
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 622
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method isContentView(Landroid/view/View;)Z
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 964
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
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
a=0;// .method public isDrawerOpen(I)Z
a=0;//     .locals 2
a=0;//     .param p1, "drawerGravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1230
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1231
a=0;//     .local v0, "drawerView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1232
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerOpen(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1234
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isDrawerOpen(Landroid/view/View;)Z
a=0;//     .locals 3
a=0;//     .param p1, "drawer"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1214
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1215
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "View "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a drawer"
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
a=0;//     .line 1217
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method isDrawerView(Landroid/view/View;)Z
a=0;//     .locals 3
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 968
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v1, v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 969
a=0;//     .local v1, "gravity":I
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 971
a=0;//     .local v0, "absGravity":I
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v2, v0, 0x7
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isDrawerVisible(I)Z
a=0;//     .locals 2
a=0;//     .param p1, "drawerGravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1261
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1262
a=0;//     .local v0, "drawerView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1263
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerVisible(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1265
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isDrawerVisible(Landroid/view/View;)Z
a=0;//     .locals 3
a=0;//     .param p1, "drawer"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1246
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1247
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "View "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, " is not a drawer"
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
a=0;//     .line 1249
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method moveDrawerToOffset(Landroid/view/View;F)V
a=0;//     .locals 6
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;//     .param p2, "slideOffset"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 651
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewOffset(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 652
a=0;//     .local v2, "oldOffset":F
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 653
a=0;//     .local v4, "width":I
a=0;//     #v4=(Integer);
a=0;//     int-to-float v5, v4
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v5, v2
a=0;// 
a=0;//     float-to-int v3, v5
a=0;// 
a=0;//     .line 654
a=0;//     .local v3, "oldPos":I
a=0;//     #v3=(Integer);
a=0;//     int-to-float v5, v4
a=0;// 
a=0;//     mul-float/2addr v5, p2
a=0;// 
a=0;//     float-to-int v1, v5
a=0;// 
a=0;//     .line 655
a=0;//     .local v1, "newPos":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, v1, v3
a=0;// 
a=0;//     .line 657
a=0;//     .local v0, "dx":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p0, p1, v5}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .end local v0    # "dx":I
a=0;//     :goto_0
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     .line 659
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 660
a=0;//     return-void
a=0;// 
a=0;//     .line 657
a=0;//     .restart local v0    # "dx":I
a=0;//     :cond_0
a=0;//     neg-int v0, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 706
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 707
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 708
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 700
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 701
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 702
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 10
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 976
a=0;//     #v5=(Null);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 979
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v7, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v8, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     or-int v1, v7, v8
a=0;// 
a=0;//     .line 982
a=0;//     .local v1, "interceptForDrag":Z
a=0;//     #v1=(Boolean);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 984
a=0;//     .local v2, "interceptForTap":Z
a=0;//     #v2=(Null);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 1016
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Boolean);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Integer);v9=(Conflicted);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->hasPeekingDrawer()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     iget-boolean v7, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     #v7=(Conflicted);
a=0;//     move v5, v6
a=0;// 
a=0;//     :cond_2
a=0;//     #v5=(Boolean);
a=0;//     return v5
a=0;// 
a=0;//     .line 986
a=0;//     :pswitch_0
a=0;//     #v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Null);v7=(Boolean);v8=(Boolean);v9=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 987
a=0;//     .local v3, "x":F
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 988
a=0;//     .local v4, "y":F
a=0;//     #v4=(Float);
a=0;//     iput v3, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionX:F
a=0;// 
a=0;//     .line 989
a=0;//     iput v4, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionY:F
a=0;// 
a=0;//     .line 990
a=0;//     iget v7, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimOpacity:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     cmpl-float v7, v7, v8
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-lez v7, :cond_3
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     float-to-int v8, v3
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     float-to-int v9, v4
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v7, v8, v9}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {p0, v7}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 992
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 994
a=0;//     :cond_3
a=0;//     #v2=(Boolean);v7=(Byte);v9=(Conflicted);
a=0;//     iput-boolean v5, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 995
a=0;//     iput-boolean v5, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1001
a=0;//     .end local v3    # "x":F
a=0;//     .end local v4    # "y":F
a=0;//     :pswitch_1
a=0;//     #v2=(Null);v3=(Uninit);v4=(Uninit);v7=(Boolean);v8=(Boolean);v9=(Uninit);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v4/widget/ViewDragHelper;->checkTouchSlop(I)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 1002
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     invoke-virtual {v7}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
a=0;// 
a=0;//     .line 1003
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout;->mRightCallback:Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->removeCallbacks()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1010
a=0;//     :pswitch_2
a=0;//     #v7=(Boolean);v8=(Boolean);
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 1011
a=0;//     iput-boolean v5, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 1012
a=0;//     iput-boolean v5, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 984
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);
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
a=0;// .method public onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1335
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->hasVisibleDrawer()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1336
a=0;//     invoke-static {p2}, Landroid/support/v4/view/KeyEventCompat;->startTracking(Landroid/view/KeyEvent;)V
a=0;// 
a=0;//     .line 1337
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1339
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyDown(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1344
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p1, v1, :cond_2
a=0;// 
a=0;//     .line 1345
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout;->findVisibleDrawer()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1346
a=0;//     .local v0, "visibleDrawer":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1347
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers()V
a=0;// 
a=0;//     .line 1349
a=0;//     :cond_0
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1351
a=0;//     .end local v0    # "visibleDrawer":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 1349
a=0;//     .restart local v0    # "visibleDrawer":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1351
a=0;//     .end local v0    # "visibleDrawer":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(PosByte);
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onKeyUp(ILandroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 23
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 788
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     #v18=(One);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/widget/DrawerLayout;->mInLayout:Z
a=0;// 
a=0;//     .line 789
a=0;//     sub-int v17, p4, p2
a=0;// 
a=0;//     .line 790
a=0;//     .local v17, "width":I
a=0;//     #v17=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 791
a=0;//     .local v6, "childCount":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v12, 0x0
a=0;// 
a=0;//     .local v12, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v18=(Integer);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     if-ge v12, v6, :cond_9
a=0;// 
a=0;//     .line 792
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v12}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 794
a=0;//     .local v5, "child":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     const/16 v19, 0x8
a=0;// 
a=0;//     #v19=(PosByte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 791
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Integer);v19=(Integer);
a=0;//     add-int/lit8 v12, v12, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 798
a=0;//     :cond_1
a=0;//     #v1=(PosByte);v19=(PosByte);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 800
a=0;//     .local v13, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     #v18=(Boolean);
a=0;//     if-eqz v18, :cond_2
a=0;// 
a=0;//     .line 801
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     #v21=(Integer);
a=0;//     add-int v20, v20, v21
a=0;// 
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     #v22=(Integer);
a=0;//     add-int v21, v21, v22
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v21
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v5, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 805
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);v1=(PosByte);v2=(Conflicted);v3=(Conflicted);v18=(Boolean);v19=(PosByte);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 806
a=0;//     .local v10, "childWidth":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 810
a=0;//     .local v7, "childHeight":I
a=0;//     #v7=(Integer);
a=0;//     const/16 v18, 0x3
a=0;// 
a=0;//     #v18=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     invoke-virtual {v0, v5, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     #v18=(Boolean);
a=0;//     if-eqz v18, :cond_4
a=0;// 
a=0;//     .line 811
a=0;//     neg-int v0, v10
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     int-to-float v0, v10
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Float);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     mul-float v19, v19, v20
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     add-int v8, v18, v19
a=0;// 
a=0;//     .line 812
a=0;//     .local v8, "childLeft":I
a=0;//     #v8=(Integer);
a=0;//     add-int v18, v10, v8
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Float);
a=0;//     int-to-float v0, v10
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Float);
a=0;//     div-float v14, v18, v19
a=0;// 
a=0;//     .line 818
a=0;//     .local v14, "newOffset":F
a=0;//     :goto_2
a=0;//     #v14=(Float);v20=(Conflicted);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     cmpl-float v18, v14, v18
a=0;// 
a=0;//     #v18=(Byte);
a=0;//     if-eqz v18, :cond_5
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 820
a=0;//     .local v4, "changeOffset":Z
a=0;//     :goto_3
a=0;//     #v4=(Boolean);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     and-int/lit8 v16, v18, 0x70
a=0;// 
a=0;//     .line 822
a=0;//     .local v16, "vgrav":I
a=0;//     #v16=(Integer);
a=0;//     sparse-switch v16, :sswitch_data_0
a=0;// 
a=0;//     .line 825
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     add-int v19, v8, v10
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     add-int v20, v20, v7
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v5, v8, v0, v1, v2}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 856
a=0;//     :goto_4
a=0;//     #v2=(Conflicted);v20=(Conflicted);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 857
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v5, v14}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 860
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     const/16 v19, 0x0
a=0;// 
a=0;//     #v19=(Null);
a=0;//     cmpl-float v18, v18, v19
a=0;// 
a=0;//     #v18=(Byte);
a=0;//     if-lez v18, :cond_8
a=0;// 
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .line 861
a=0;//     .local v15, "newVisibility":I
a=0;//     :goto_5
a=0;//     #v15=(PosByte);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     if-eq v0, v15, :cond_0
a=0;// 
a=0;//     .line 862
a=0;//     invoke-virtual {v5, v15}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 814
a=0;//     .end local v4    # "changeOffset":Z
a=0;//     .end local v8    # "childLeft":I
a=0;//     .end local v14    # "newOffset":F
a=0;//     .end local v15    # "newVisibility":I
a=0;//     .end local v16    # "vgrav":I
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);v1=(PosByte);v4=(Conflicted);v8=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v18=(Boolean);v19=(PosByte);
a=0;//     int-to-float v0, v10
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Float);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     mul-float v18, v18, v19
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     sub-int v8, v17, v18
a=0;// 
a=0;//     .line 815
a=0;//     .restart local v8    # "childLeft":I
a=0;//     #v8=(Integer);
a=0;//     sub-int v18, v17, v8
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Float);
a=0;//     int-to-float v0, v10
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Float);
a=0;//     div-float v14, v18, v19
a=0;// 
a=0;//     .restart local v14    # "newOffset":F
a=0;//     #v14=(Float);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 818
a=0;//     :cond_5
a=0;//     #v0=(Integer);v18=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 831
a=0;//     .restart local v4    # "changeOffset":Z
a=0;//     .restart local v16    # "vgrav":I
a=0;//     :sswitch_0
a=0;//     #v4=(Boolean);v16=(Integer);v18=(Integer);
a=0;//     sub-int v11, p5, p3
a=0;// 
a=0;//     .line 832
a=0;//     .local v11, "height":I
a=0;//     #v11=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     sub-int v18, v11, v18
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     sub-int v18, v18, v19
a=0;// 
a=0;//     add-int v19, v8, v10
a=0;// 
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     move/from16 v20, v0
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     sub-int v20, v11, v20
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v20
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v5, v8, v0, v1, v2}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 840
a=0;//     .end local v11    # "height":I
a=0;//     :sswitch_1
a=0;//     #v1=(PosByte);v2=(Conflicted);v11=(Conflicted);v19=(Float);v20=(Conflicted);
a=0;//     sub-int v11, p5, p3
a=0;// 
a=0;//     .line 841
a=0;//     .restart local v11    # "height":I
a=0;//     #v11=(Integer);
a=0;//     sub-int v18, v11, v7
a=0;// 
a=0;//     div-int/lit8 v9, v18, 0x2
a=0;// 
a=0;//     .line 845
a=0;//     .local v9, "childTop":I
a=0;//     #v9=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     if-ge v9, v0, :cond_7
a=0;// 
a=0;//     .line 846
a=0;//     iget v9, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 850
a=0;//     :cond_6
a=0;//     :goto_6
a=0;//     #v1=(Integer);v19=(Integer);
a=0;//     add-int v18, v8, v10
a=0;// 
a=0;//     add-int v19, v9, v7
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     invoke-virtual {v5, v8, v9, v0, v1}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 847
a=0;//     :cond_7
a=0;//     #v1=(PosByte);v19=(Float);
a=0;//     add-int v18, v9, v7
a=0;// 
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     move/from16 v19, v0
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     sub-int v19, v11, v19
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_6
a=0;// 
a=0;//     .line 848
a=0;//     iget v0, v13, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     sub-int v18, v11, v18
a=0;// 
a=0;//     sub-int v9, v18, v7
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 860
a=0;//     .end local v9    # "childTop":I
a=0;//     .end local v11    # "height":I
a=0;//     :cond_8
a=0;//     #v9=(Conflicted);v11=(Conflicted);v18=(Byte);v19=(Null);
a=0;//     const/4 v15, 0x4
a=0;// 
a=0;//     #v15=(PosByte);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 866
a=0;//     .end local v4    # "changeOffset":Z
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     .end local v7    # "childHeight":I
a=0;//     .end local v8    # "childLeft":I
a=0;//     .end local v10    # "childWidth":I
a=0;//     .end local v13    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     .end local v14    # "newOffset":F
a=0;//     .end local v16    # "vgrav":I
a=0;//     :cond_9
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v18=(Integer);v19=(Conflicted);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/widget/DrawerLayout;->mInLayout:Z
a=0;// 
a=0;//     .line 867
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 868
a=0;//     return-void
a=0;// 
a=0;//     .line 822
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x10 -> :sswitch_1
a=0;//         0x50 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 20
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 712
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .line 713
a=0;//     .local v15, "widthMode":I
a=0;//     #v15=(Integer);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 714
a=0;//     .local v11, "heightMode":I
a=0;//     #v11=(Integer);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 715
a=0;//     .local v16, "widthSize":I
a=0;//     #v16=(Integer);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 717
a=0;//     .local v12, "heightSize":I
a=0;//     #v12=(Integer);
a=0;//     const/high16 v17, 0x40000000
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ne v15, v0, :cond_0
a=0;// 
a=0;//     const/high16 v17, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     if-eq v11, v0, :cond_2
a=0;// 
a=0;//     .line 718
a=0;//     :cond_0
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->isInEditMode()Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_5
a=0;// 
a=0;//     .line 723
a=0;//     const/high16 v17, -0x80000000
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     if-ne v15, v0, :cond_3
a=0;// 
a=0;//     .line 724
a=0;//     const/high16 v15, 0x40000000
a=0;// 
a=0;//     .line 729
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     const/high16 v17, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     if-ne v11, v0, :cond_4
a=0;// 
a=0;//     .line 730
a=0;//     const/high16 v11, 0x40000000
a=0;// 
a=0;//     .line 742
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v12}, Landroid/support/v4/widget/DrawerLayout;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 745
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .line 746
a=0;//     .local v10, "foundDrawers":I
a=0;//     #v10=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 747
a=0;//     .local v4, "childCount":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .local v13, "i":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v13=(Integer);v14=(Conflicted);v18=(Conflicted);
a=0;//     if-ge v13, v4, :cond_a
a=0;// 
a=0;//     .line 748
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v13}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 750
a=0;//     .local v3, "child":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     const/16 v18, 0x8
a=0;// 
a=0;//     #v18=(PosByte);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v18
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_6
a=0;// 
a=0;//     .line 747
a=0;//     :goto_3
a=0;//     #v1=(Integer);v18=(Integer);
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 725
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     .end local v4    # "childCount":I
a=0;//     .end local v10    # "foundDrawers":I
a=0;//     .end local v13    # "i":I
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v13=(Uninit);v14=(Uninit);v18=(Uninit);
a=0;//     if-nez v15, :cond_1
a=0;// 
a=0;//     .line 726
a=0;//     const/high16 v15, 0x40000000
a=0;// 
a=0;//     .line 727
a=0;//     const/16 v16, 0x12c
a=0;// 
a=0;//     #v16=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 732
a=0;//     :cond_4
a=0;//     #v16=(Integer);
a=0;//     if-nez v11, :cond_2
a=0;// 
a=0;//     .line 733
a=0;//     const/high16 v11, 0x40000000
a=0;// 
a=0;//     .line 734
a=0;//     const/16 v12, 0x12c
a=0;// 
a=0;//     #v12=(PosShort);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 737
a=0;//     :cond_5
a=0;//     #v12=(Integer);v17=(Boolean);
a=0;//     new-instance v17, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v18, "DrawerLayout must be measured with MeasureSpec.EXACTLY."
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 754
a=0;//     .restart local v3    # "child":Landroid/view/View;
a=0;//     .restart local v4    # "childCount":I
a=0;//     .restart local v10    # "foundDrawers":I
a=0;//     .restart local v13    # "i":I
a=0;//     :cond_6
a=0;//     #v1=(PosByte);v2=(Conflicted);v3=(Reference,Landroid/view/View;);v4=(Integer);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Null);v13=(Integer);v14=(Conflicted);v17=(Integer);v18=(PosByte);
a=0;//     invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 756
a=0;//     .local v14, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, v3}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Boolean);
a=0;//     if-eqz v17, :cond_7
a=0;// 
a=0;//     .line 758
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     sub-int v17, v16, v17
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     sub-int v17, v17, v18
a=0;// 
a=0;//     const/high16 v18, 0x40000000
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 760
a=0;//     .local v7, "contentWidthSpec":I
a=0;//     #v7=(Integer);
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     sub-int v17, v12, v17
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     sub-int v17, v17, v18
a=0;// 
a=0;//     const/high16 v18, 0x40000000
a=0;// 
a=0;//     invoke-static/range {v17 .. v18}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 762
a=0;//     .local v6, "contentHeightSpec":I
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v7, v6}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 763
a=0;//     .end local v6    # "contentHeightSpec":I
a=0;//     .end local v7    # "contentWidthSpec":I
a=0;//     :cond_7
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);v6=(Conflicted);v7=(Conflicted);v17=(Boolean);v18=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     if-eqz v17, :cond_9
a=0;// 
a=0;//     .line 764
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewAbsoluteGravity(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     #v17=(Integer);
a=0;//     and-int/lit8 v5, v17, 0x7
a=0;// 
a=0;//     .line 766
a=0;//     .local v5, "childGravity":I
a=0;//     #v5=(Integer);
a=0;//     and-int v17, v10, v5
a=0;// 
a=0;//     if-eqz v17, :cond_8
a=0;// 
a=0;//     .line 767
a=0;//     new-instance v17, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Child drawer has absolute gravity "
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-static {v5}, Landroid/support/v4/widget/DrawerLayout;->gravityToString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v19
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " but this "
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, "DrawerLayout"
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " already has a "
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, "drawer view along that edge"
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 771
a=0;//     :cond_8
a=0;//     #v17=(Integer);v18=(PosByte);v19=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/DrawerLayout;->mMinDrawerMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     add-int v17, v17, v18
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     add-int v17, v17, v18
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->width:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 774
a=0;//     .local v9, "drawerWidthSpec":I
a=0;//     #v9=(Integer);
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     add-int v17, v17, v18
a=0;// 
a=0;//     iget v0, v14, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     move/from16 v1, v17
a=0;// 
a=0;//     move/from16 v2, v18
a=0;// 
a=0;//     invoke-static {v0, v1, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 777
a=0;//     .local v8, "drawerHeightSpec":I
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v3, v9, v8}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 779
a=0;//     .end local v5    # "childGravity":I
a=0;//     .end local v8    # "drawerHeightSpec":I
a=0;//     .end local v9    # "drawerWidthSpec":I
a=0;//     :cond_9
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);v1=(PosByte);v2=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v17=(Boolean);v18=(PosByte);
a=0;//     new-instance v17, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v17=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v18, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v18=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v18 .. v18}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v18=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v19, "Child "
a=0;// 
a=0;//     #v19=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " at index "
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, " does not have a valid layout_gravity - must be Gravity.LEFT, "
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     const-string v19, "Gravity.RIGHT or Gravity.NO_GRAVITY"
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v19}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v18
a=0;// 
a=0;//     invoke-direct/range {v17 .. v18}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v17
a=0;// 
a=0;//     .line 784
a=0;//     .end local v3    # "child":Landroid/view/View;
a=0;//     .end local v14    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :cond_a
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);v14=(Conflicted);v17=(Integer);v18=(Conflicted);v19=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 4
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1356
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$SavedState;
a=0;// 
a=0;//     .line 1357
a=0;//     .local v0, "ss":Landroid/support/v4/widget/DrawerLayout$SavedState;
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/DrawerLayout$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v2}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1359
a=0;//     iget v2, v0, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1360
a=0;//     iget v2, v0, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1361
a=0;//     .local v1, "toOpen":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1362
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1366
a=0;//     .end local v1    # "toOpen":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget v2, v0, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeLeft:I
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 1367
a=0;//     iget v2, v0, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeRight:I
a=0;// 
a=0;//     const/4 v3, 0x5
a=0;// 
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 1368
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 1372
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1374
a=0;//     .local v5, "superState":Landroid/os/Parcelable;
a=0;//     #v5=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v4, Landroid/support/v4/widget/DrawerLayout$SavedState;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v4/widget/DrawerLayout$SavedState;);
a=0;//     invoke-direct {v4, v5}, Landroid/support/v4/widget/DrawerLayout$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1376
a=0;//     .local v4, "ss":Landroid/support/v4/widget/DrawerLayout$SavedState;
a=0;//     #v4=(Reference,Landroid/support/v4/widget/DrawerLayout$SavedState;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1377
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);v6=(Conflicted);
a=0;//     if-ge v2, v1, :cond_2
a=0;// 
a=0;//     .line 1378
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1379
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 1377
a=0;//     :cond_0
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1383
a=0;//     :cond_1
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1384
a=0;//     .local v3, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     iget-boolean v6, v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 1385
a=0;//     iget v6, v3, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v4, Landroid/support/v4/widget/DrawerLayout$SavedState;->openDrawerGravity:I
a=0;// 
a=0;//     .line 1391
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .end local v3    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     iget v6, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iput v6, v4, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeLeft:I
a=0;// 
a=0;//     .line 1392
a=0;//     iget v6, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
a=0;// 
a=0;//     iput v6, v4, Landroid/support/v4/widget/DrawerLayout$SavedState;->lockModeRight:I
a=0;// 
a=0;//     .line 1394
a=0;//     return-object v4
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 13
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1021
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v10, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1022
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v10, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 1024
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1025
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 1027
a=0;//     .local v7, "wantTouchEvents":Z
a=0;//     #v7=(One);
a=0;//     and-int/lit16 v10, v0, 0xff
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     packed-switch v10, :pswitch_data_0
a=0;// 
a=0;//     .line 1068
a=0;//     :goto_0
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return v7
a=0;// 
a=0;//     .line 1029
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 1030
a=0;//     .local v8, "x":F
a=0;//     #v8=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1031
a=0;//     .local v9, "y":F
a=0;//     #v9=(Float);
a=0;//     iput v8, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionX:F
a=0;// 
a=0;//     .line 1032
a=0;//     iput v9, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionY:F
a=0;// 
a=0;//     .line 1033
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 1034
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1039
a=0;//     .end local v8    # "x":F
a=0;//     .end local v9    # "y":F
a=0;//     :pswitch_2
a=0;//     #v8=(Uninit);v9=(Uninit);v10=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 1040
a=0;//     .restart local v8    # "x":F
a=0;//     #v8=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1041
a=0;//     .restart local v9    # "y":F
a=0;//     #v9=(Float);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 1042
a=0;//     .local v4, "peekingOnly":Z
a=0;//     #v4=(One);
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     float-to-int v11, v8
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     float-to-int v12, v9
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v10, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->findTopChildUnder(II)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 1043
a=0;//     .local v6, "touchedView":Landroid/view/View;
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v4/widget/DrawerLayout;->isContentView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 1044
a=0;//     iget v10, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionX:F
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-float v1, v8, v10
a=0;// 
a=0;//     .line 1045
a=0;//     .local v1, "dx":F
a=0;//     #v1=(Float);
a=0;//     iget v10, p0, Landroid/support/v4/widget/DrawerLayout;->mInitialMotionY:F
a=0;// 
a=0;//     sub-float v2, v9, v10
a=0;// 
a=0;//     .line 1046
a=0;//     .local v2, "dy":F
a=0;//     #v2=(Float);
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v10}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 1047
a=0;//     .local v5, "slop":I
a=0;//     #v5=(Integer);
a=0;//     mul-float v10, v1, v1
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float v11, v2, v2
a=0;// 
a=0;//     #v11=(Float);
a=0;//     add-float/2addr v10, v11
a=0;// 
a=0;//     mul-int v11, v5, v5
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     int-to-float v11, v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     cmpg-float v10, v10, v11
a=0;// 
a=0;//     #v10=(Byte);
a=0;//     if-gez v10, :cond_0
a=0;// 
a=0;//     .line 1049
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->findOpenDrawer()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 1050
a=0;//     .local v3, "openDrawer":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 1051
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v11, 0x2
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     if-ne v10, v11, :cond_1
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 1055
a=0;//     .end local v1    # "dx":F
a=0;//     .end local v2    # "dy":F
a=0;//     .end local v3    # "openDrawer":Landroid/view/View;
a=0;//     .end local v5    # "slop":I
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v10=(Conflicted);v11=(Integer);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 1056
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1051
a=0;//     .restart local v1    # "dx":F
a=0;//     .restart local v2    # "dy":F
a=0;//     .restart local v3    # "openDrawer":Landroid/view/View;
a=0;//     .restart local v5    # "slop":I
a=0;//     :cond_1
a=0;//     #v1=(Float);v2=(Float);v3=(Reference,Landroid/view/View;);v4=(One);v5=(Integer);v10=(Integer);v11=(PosByte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1061
a=0;//     .end local v1    # "dx":F
a=0;//     .end local v2    # "dy":F
a=0;//     .end local v3    # "openDrawer":Landroid/view/View;
a=0;//     .end local v4    # "peekingOnly":Z
a=0;//     .end local v5    # "slop":I
a=0;//     .end local v6    # "touchedView":Landroid/view/View;
a=0;//     .end local v8    # "x":F
a=0;//     .end local v9    # "y":F
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     invoke-virtual {p0, v10}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 1062
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 1063
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     iput-boolean v10, p0, Landroid/support/v4/widget/DrawerLayout;->mChildrenCanceledTouch:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1027
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_0
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public openDrawer(I)V
a=0;//     .locals 4
a=0;//     .param p1, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1155
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1156
a=0;//     .local v0, "drawerView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1157
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "No drawer view found with gravity "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {p1}, Landroid/support/v4/widget/DrawerLayout;->gravityToString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 1160
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public openDrawer(Landroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1129
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1130
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "View "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " is not a sliding drawer"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 1133
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/widget/DrawerLayout;->mFirstLayout:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1134
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1135
a=0;//     .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     const/high16 v1, 0x3f800000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     .line 1136
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->knownOpen:Z
a=0;// 
a=0;//     .line 1145
a=0;//     .end local v0    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1146
a=0;//     return-void
a=0;// 
a=0;//     .line 1138
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {p0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1139
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, p1, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1141
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {v1, p1, v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public requestDisallowInterceptTouchEvent(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "disallowIntercept"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1076
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V
a=0;// 
a=0;//     .line 1078
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/DrawerLayout;->mDisallowInterceptRequested:Z
a=0;// 
a=0;//     .line 1079
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 1080
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->closeDrawers(Z)V
a=0;// 
a=0;//     .line 1082
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public requestLayout()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 872
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/DrawerLayout;->mInLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 873
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V
a=0;// 
a=0;//     .line 875
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerListener(Landroid/support/v4/widget/DrawerLayout$DrawerListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 343
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     .line 344
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerLockMode(I)V
a=0;//     .locals 1
a=0;//     .param p1, "lockMode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 360
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 361
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 362
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerLockMode(II)V
a=0;//     .locals 6
a=0;//     .param p1, "lockMode"    # I
a=0;//     .param p2, "edgeGravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     .line 384
a=0;//     #v5=(PosByte);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p2, v4}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 386
a=0;//     .local v0, "absGravity":I
a=0;//     #v0=(Integer);
a=0;//     if-ne v0, v5, :cond_3
a=0;// 
a=0;//     .line 387
a=0;//     iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeLeft:I
a=0;// 
a=0;//     .line 391
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 393
a=0;//     if-ne v0, v5, :cond_4
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 394
a=0;//     .local v1, "helper":Landroid/support/v4/widget/ViewDragHelper;
a=0;//     :goto_1
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 396
a=0;//     .end local v1    # "helper":Landroid/support/v4/widget/ViewDragHelper;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 411
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 388
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v0, v4, :cond_0
a=0;// 
a=0;//     .line 389
a=0;//     iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->mLockModeRight:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 393
a=0;//     :cond_4
a=0;//     #v4=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 398
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 399
a=0;//     .local v3, "toOpen":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 400
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/DrawerLayout;->openDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 404
a=0;//     .end local v3    # "toOpen":Landroid/view/View;
a=0;//     :pswitch_1
a=0;//     #v3=(Uninit);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 405
a=0;//     .local v2, "toClose":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 406
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 396
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerLockMode(ILandroid/view/View;)V
a=0;//     .locals 4
a=0;//     .param p1, "lockMode"    # I
a=0;//     .param p2, "drawerView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 432
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 433
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "View "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " is not a "
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "drawer with appropriate layout_gravity"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 436
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     iget v0, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 437
a=0;//     .local v0, "gravity":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v4/widget/DrawerLayout;->setDrawerLockMode(II)V
a=0;// 
a=0;//     .line 438
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerShadow(II)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;//     .param p2, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 323
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0, p2}, Landroid/support/v4/widget/DrawerLayout;->setDrawerShadow(Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 324
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerShadow(Landroid/graphics/drawable/Drawable;I)V
a=0;//     .locals 3
a=0;//     .param p1, "shadowDrawable"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p2, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p2, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 305
a=0;//     .local v0, "absGravity":I
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, 0x3
a=0;// 
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 306
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 307
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 309
a=0;//     :cond_0
a=0;//     and-int/lit8 v1, v0, 0x5
a=0;// 
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 310
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout;->mShadowRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 311
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 313
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDrawerTitle(ILjava/lang/CharSequence;)V
a=0;//     .locals 2
a=0;//     .param p1, "edgeGravity"    # I
a=0;//     .param p2, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 488
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {p1, v1}, Landroid/support/v4/view/GravityCompat;->getAbsoluteGravity(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 490
a=0;//     .local v0, "absGravity":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_1
a=0;// 
a=0;//     .line 491
a=0;//     iput-object p2, p0, Landroid/support/v4/widget/DrawerLayout;->mTitleLeft:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 495
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 492
a=0;//     :cond_1
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 493
a=0;//     iput-object p2, p0, Landroid/support/v4/widget/DrawerLayout;->mTitleRight:Ljava/lang/CharSequence;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setDrawerViewOffset(Landroid/view/View;F)V
a=0;//     .locals 2
a=0;//     .param p1, "drawerView"    # Landroid/view/View;
a=0;//     .param p2, "slideOffset"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 612
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 613
a=0;//     .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     iget v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, p2, v1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 619
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 617
a=0;//     :cond_0
a=0;//     iput p2, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     .line 618
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout;->dispatchOnDrawerSlide(Landroid/view/View;F)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setScrimColor(I)V
a=0;//     .locals 0
a=0;//     .param p1, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     iput p1, p0, Landroid/support/v4/widget/DrawerLayout;->mScrimColor:I
a=0;// 
a=0;//     .line 333
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 334
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method updateDrawerState(IILandroid/view/View;)V
a=0;//     .locals 7
a=0;//     .param p1, "forGravity"    # I
a=0;//     .param p2, "activeState"    # I
a=0;//     .param p3, "activeDrawer"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x2
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 522
a=0;//     #v5=(One);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mLeftDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 523
a=0;//     .local v0, "leftState":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mRightDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 526
a=0;//     .local v2, "rightState":I
a=0;//     #v2=(Integer);
a=0;//     if-eq v0, v5, :cond_0
a=0;// 
a=0;//     if-ne v2, v5, :cond_3
a=0;// 
a=0;//     .line 527
a=0;//     :cond_0
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 534
a=0;//     .local v3, "state":I
a=0;//     :goto_0
a=0;//     #v3=(PosByte);
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 535
a=0;//     invoke-virtual {p3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 536
a=0;//     .local v1, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     iget v4, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     cmpl-float v4, v4, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     .line 537
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/widget/DrawerLayout;->dispatchOnDrawerClosed(Landroid/view/View;)V
a=0;// 
a=0;//     .line 543
a=0;//     .end local v1    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v4=(Conflicted);v5=(Integer);
a=0;//     iget v4, p0, Landroid/support/v4/widget/DrawerLayout;->mDrawerState:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v3, v4, :cond_2
a=0;// 
a=0;//     .line 544
a=0;//     iput v3, p0, Landroid/support/v4/widget/DrawerLayout;->mDrawerState:I
a=0;// 
a=0;//     .line 546
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/DrawerLayout$DrawerListener;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 547
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout;->mListener:Landroid/support/v4/widget/DrawerLayout$DrawerListener;
a=0;// 
a=0;//     invoke-interface {v4, v3}, Landroid/support/v4/widget/DrawerLayout$DrawerListener;->onDrawerStateChanged(I)V
a=0;// 
a=0;//     .line 550
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 528
a=0;//     .end local v3    # "state":I
a=0;//     :cond_3
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);v5=(One);
a=0;//     if-eq v0, v6, :cond_4
a=0;// 
a=0;//     if-ne v2, v6, :cond_5
a=0;// 
a=0;//     .line 529
a=0;//     :cond_4
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     .restart local v3    # "state":I
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 531
a=0;//     .end local v3    # "state":I
a=0;//     :cond_5
a=0;//     #v3=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .restart local v3    # "state":I
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 538
a=0;//     .restart local v1    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :cond_6
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);v3=(PosByte);v4=(Byte);v5=(Null);
a=0;//     iget v4, v1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->onScreen:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/high16 v5, 0x3f800000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     cmpl-float v4, v4, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 539
a=0;//     invoke-virtual {p0, p3}, Landroid/support/v4/widget/DrawerLayout;->dispatchOnDrawerOpened(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
