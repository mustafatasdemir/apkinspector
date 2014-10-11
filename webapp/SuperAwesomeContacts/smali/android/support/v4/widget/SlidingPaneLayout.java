package android.support.v4.widget; class SlidingPaneLayout { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "SlidingPaneLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$1;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$SavedState;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$SimplePanelSlideListener;,
a=0;//         Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_FADE_COLOR:I = -0x33333334
a=0;// 
a=0;// .field private static final DEFAULT_OVERHANG_SIZE:I = 0x20
a=0;// 
a=0;// .field static final IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;// .field private static final MIN_FLING_VELOCITY:I = 0x190
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "SlidingPaneLayout"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCanSlide:Z
a=0;// 
a=0;// .field private mCoveredFadeColor:I
a=0;// 
a=0;// .field private final mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;// .field private mFirstLayout:Z
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInitialMotionY:F
a=0;// 
a=0;// .field private mIsUnableToDrag:Z
a=0;// 
a=0;// .field private final mOverhangSize:I
a=0;// 
a=0;// .field private mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;// .field private mParallaxBy:I
a=0;// 
a=0;// .field private mParallaxOffset:F
a=0;// 
a=0;// .field private final mPostedRunnables:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mPreservedOpenState:Z
a=0;// 
a=0;// .field private mShadowDrawableLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mShadowDrawableRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mSlideOffset:F
a=0;// 
a=0;// .field private mSlideRange:I
a=0;// 
a=0;// .field private mSlideableView:Landroid/view/View;
a=0;// 
a=0;// .field private mSliderFadeColor:I
a=0;// 
a=0;// .field private final mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 198
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     .line 199
a=0;//     .local v0, "deviceVersion":I
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x11
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 200
a=0;//     new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;);
a=0;//     sput-object v1, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;//     .line 206
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 201
a=0;//     :cond_0
a=0;//     #v1=(PosByte);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 202
a=0;//     new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;);
a=0;//     sput-object v1, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 204
a=0;//     :cond_1
a=0;//     #v1=(PosByte);
a=0;//     new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;);
a=0;//     invoke-direct {v1}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;);
a=0;//     sput-object v1, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 250
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 251
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 255
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/high16 v4, 0x3f000000
a=0;// 
a=0;//     .line 258
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 108
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     const v2, -0x33333334
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     .line 188
a=0;//     iput-boolean v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 190
a=0;//     new-instance v2, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 192
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 260
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
a=0;//     .line 261
a=0;//     .local v0, "density":F
a=0;//     #v0=(Integer);
a=0;//     const/high16 v2, 0x42000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-float/2addr v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     add-float/2addr v2, v4
a=0;// 
a=0;//     float-to-int v2, v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mOverhangSize:I
a=0;// 
a=0;//     .line 263
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 265
a=0;//     .local v1, "viewConfig":Landroid/view/ViewConfiguration;
a=0;//     #v1=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 267
a=0;//     new-instance v2, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;);
a=0;//     invoke-static {p0, v2}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V
a=0;// 
a=0;//     .line 268
a=0;//     invoke-static {p0, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 270
a=0;//     new-instance v2, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-direct {v2, p0, v3}, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/support/v4/widget/SlidingPaneLayout$1;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     invoke-static {p0, v4, v2}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     const/high16 v3, 0x43c80000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     mul-float/2addr v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V
a=0;// 
a=0;//     .line 272
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/widget/SlidingPaneLayout;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1000(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;//     .param p1, "x1"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidateChildRegion(Landroid/view/View;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1100(Landroid/support/v4/widget/SlidingPaneLayout;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;//     .param p1, "x1"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iput-boolean p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     return p1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Landroid/support/v4/widget/SlidingPaneLayout;I)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;//     .param p1, "x1"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->onPanelDragged(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Landroid/support/v4/widget/SlidingPaneLayout;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private closePane(Landroid/view/View;I)Z
a=0;//     .locals 2
a=0;//     .param p1, "pane"    # Landroid/view/View;
a=0;//     .param p2, "initialVelocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 859
a=0;//     #v0=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->smoothSlideTo(FI)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 860
a=0;//     :cond_0
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 861
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 863
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private dimChildView(Landroid/view/View;FI)V
a=0;//     .locals 9
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "mag"    # F
a=0;//     .param p3, "fadeColor"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     .line 968
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 970
a=0;//     .local v4, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     cmpl-float v5, p2, v5
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-lez v5, :cond_3
a=0;// 
a=0;//     if-eqz p3, :cond_3
a=0;// 
a=0;//     .line 971
a=0;//     const/high16 v5, -0x1000000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     and-int/2addr v5, p3
a=0;// 
a=0;//     ushr-int/lit8 v0, v5, 0x18
a=0;// 
a=0;//     .line 972
a=0;//     .local v0, "baseAlpha":I
a=0;//     #v0=(Char);
a=0;//     int-to-float v5, v0
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v5, p2
a=0;// 
a=0;//     float-to-int v3, v5
a=0;// 
a=0;//     .line 973
a=0;//     .local v3, "imag":I
a=0;//     #v3=(Integer);
a=0;//     shl-int/lit8 v5, v3, 0x18
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const v6, 0xffffff
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     and-int/2addr v6, p3
a=0;// 
a=0;//     or-int v1, v5, v6
a=0;// 
a=0;//     .line 974
a=0;//     .local v1, "color":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 975
a=0;//     new-instance v5, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 977
a=0;//     :cond_0
a=0;//     iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     new-instance v6, Landroid/graphics/PorterDuffColorFilter;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/graphics/PorterDuffColorFilter;);
a=0;//     sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/PorterDuff$Mode;);
a=0;//     invoke-direct {v6, v1, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/PorterDuffColorFilter;);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
a=0;// 
a=0;//     .line 978
a=0;//     invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayerType(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eq v5, v8, :cond_1
a=0;// 
a=0;//     .line 979
a=0;//     iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-static {p1, v8, v5}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 981
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidateChildRegion(Landroid/view/View;)V
a=0;// 
a=0;//     .line 990
a=0;//     .end local v0    # "baseAlpha":I
a=0;//     .end local v1    # "color":I
a=0;//     .end local v3    # "imag":I
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 982
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Byte);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayerType(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 983
a=0;//     iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 984
a=0;//     iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;
a=0;// 
a=0;//     .line 986
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     new-instance v2, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;);
a=0;//     invoke-direct {v2, p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;// 
a=0;//     .line 987
a=0;//     .local v2, "dlr":Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
a=0;//     #v2=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 988
a=0;//     invoke-static {p0, v2}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private invalidateChildRegion(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1038
a=0;//     sget-object v0, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;);
a=0;//     invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;->invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1039
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private isLayoutRtlSupport()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1642
a=0;//     #v0=(One);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_0
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
a=0;// .method private onPanelDragged(I)V
a=0;//     .locals 10
a=0;//     .param p1, "newLeft"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 940
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     if-nez v7, :cond_0
a=0;// 
a=0;//     .line 942
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iput v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     .line 965
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference,Landroid/view/View;);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 945
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 946
a=0;//     .local v1, "isLayoutRtl":Z
a=0;//     #v1=(Boolean);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 948
a=0;//     .local v2, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 949
a=0;//     .local v0, "childWidth":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-int/2addr v7, p1
a=0;// 
a=0;//     sub-int v4, v7, v0
a=0;// 
a=0;//     .line 951
a=0;//     .local v4, "newStart":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);v7=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 952
a=0;//     .local v5, "paddingStart":I
a=0;//     :goto_2
a=0;//     #v5=(Integer);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     iget v3, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 953
a=0;//     .local v3, "lpMargin":I
a=0;//     :goto_3
a=0;//     #v3=(Integer);
a=0;//     add-int v6, v5, v3
a=0;// 
a=0;//     .line 955
a=0;//     .local v6, "startBound":I
a=0;//     #v6=(Integer);
a=0;//     sub-int v7, v4, v6
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     iget v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     div-float/2addr v7, v8
a=0;// 
a=0;//     iput v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     .line 957
a=0;//     iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 958
a=0;//     iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     invoke-direct {p0, v7}, Landroid/support/v4/widget/SlidingPaneLayout;->parallaxOtherViews(F)V
a=0;// 
a=0;//     .line 961
a=0;//     :cond_1
a=0;//     iget-boolean v7, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 962
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     iget v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-direct {p0, v7, v8, v9}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V
a=0;// 
a=0;//     .line 964
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);v9=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v7}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelSlide(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v3    # "lpMargin":I
a=0;//     .end local v4    # "newStart":I
a=0;//     .end local v5    # "paddingStart":I
a=0;//     .end local v6    # "startBound":I
a=0;//     :cond_3
a=0;//     #v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     move v4, p1
a=0;// 
a=0;//     .line 949
a=0;//     #v4=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 951
a=0;//     .restart local v4    # "newStart":I
a=0;//     :cond_4
a=0;//     #v7=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 952
a=0;//     .restart local v5    # "paddingStart":I
a=0;//     :cond_5
a=0;//     iget v3, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private openPane(Landroid/view/View;I)Z
a=0;//     .locals 2
a=0;//     .param p1, "pane"    # Landroid/view/View;
a=0;//     .param p2, "initialVelocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 867
a=0;//     #v0=(One);
a=0;//     iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     const/high16 v1, 0x3f800000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->smoothSlideTo(FI)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 868
a=0;//     :cond_0
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 871
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private parallaxOtherViews(F)V
a=0;//     .locals 12
a=0;//     .param p1, "slideOffset"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v11, 0x3f800000
a=0;// 
a=0;//     .line 1186
a=0;//     #v11=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1187
a=0;//     .local v4, "isLayoutRtl":Z
a=0;//     #v4=(Boolean);
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1188
a=0;//     .local v7, "slideLp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     iget-boolean v9, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget v9, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     :goto_0
a=0;//     #v9=(Integer);
a=0;//     if-gtz v9, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1190
a=0;//     .local v1, "dimViews":Z
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1191
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-ge v3, v0, :cond_6
a=0;// 
a=0;//     .line 1192
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 1193
a=0;//     .local v8, "v":Landroid/view/View;
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     if-ne v8, v9, :cond_3
a=0;// 
a=0;//     .line 1191
a=0;//     :cond_0
a=0;//     :goto_3
a=0;//     #v9=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1188
a=0;//     .end local v0    # "childCount":I
a=0;//     .end local v1    # "dimViews":Z
a=0;//     .end local v3    # "i":I
a=0;//     .end local v8    # "v":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Boolean);v10=(Uninit);
a=0;//     iget v9, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1195
a=0;//     .restart local v0    # "childCount":I
a=0;//     .restart local v1    # "dimViews":Z
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v8    # "v":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Boolean);v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v8=(Reference,Landroid/view/View;);v9=(Reference,Landroid/view/View;);v10=(Conflicted);
a=0;//     iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-float v9, v11, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     iget v10, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v9, v10
a=0;// 
a=0;//     float-to-int v6, v9
a=0;// 
a=0;//     .line 1196
a=0;//     .local v6, "oldOffset":I
a=0;//     #v6=(Integer);
a=0;//     iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F
a=0;// 
a=0;//     .line 1197
a=0;//     sub-float v9, v11, p1
a=0;// 
a=0;//     iget v10, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     int-to-float v10, v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     mul-float/2addr v9, v10
a=0;// 
a=0;//     float-to-int v5, v9
a=0;// 
a=0;//     .line 1198
a=0;//     .local v5, "newOffset":I
a=0;//     #v5=(Integer);
a=0;//     sub-int v2, v6, v5
a=0;// 
a=0;//     .line 1200
a=0;//     .local v2, "dx":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     neg-int v2, v2
a=0;// 
a=0;//     .end local v2    # "dx":I
a=0;//     :cond_4
a=0;//     invoke-virtual {v8, v2}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     .line 1202
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1203
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-float/2addr v9, v11
a=0;// 
a=0;//     :goto_4
a=0;//     #v9=(Float);
a=0;//     iget v10, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCoveredFadeColor:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-direct {p0, v8, v9, v10}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_5
a=0;//     #v10=(Float);
a=0;//     iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-float v9, v11, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 1207
a=0;//     .end local v5    # "newOffset":I
a=0;//     .end local v6    # "oldOffset":I
a=0;//     .end local v8    # "v":Landroid/view/View;
a=0;//     :cond_6
a=0;//     #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static viewIsOpaque(Landroid/view/View;)Z
a=0;//     .locals 5
a=0;//     .param p0, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 408
a=0;//     #v2=(Null);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->isOpaque(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 419
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Integer);v4=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 413
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v3=(Boolean);v4=(Uninit);
a=0;//     sget v3, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/16 v4, 0x12
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-lt v3, v4, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 415
a=0;//     :cond_2
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 416
a=0;//     .local v0, "bg":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 417
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-eq v3, v4, :cond_0
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(One);v4=(PosByte);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 419
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected canScroll(Landroid/view/View;ZIII)Z
a=0;//     .locals 11
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "checkV"    # Z
a=0;//     .param p3, "dx"    # I
a=0;//     .param p4, "x"    # I
a=0;//     .param p5, "y"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1221
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     move-object v7, p1
a=0;// 
a=0;//     .line 1222
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     check-cast v7, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 1223
a=0;//     .local v7, "group":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollX()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1224
a=0;//     .local v9, "scrollX":I
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getScrollY()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 1225
a=0;//     .local v10, "scrollY":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1227
a=0;//     .local v6, "count":I
a=0;//     #v6=(Integer);
a=0;//     add-int/lit8 v8, v6, -0x1
a=0;// 
a=0;//     .local v8, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);
a=0;//     if-ltz v8, :cond_1
a=0;// 
a=0;//     .line 1230
a=0;//     invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1231
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
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     move v3, p3
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/SlidingPaneLayout;->canScroll(Landroid/view/View;ZIII)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1235
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1240
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v6    # "count":I
a=0;//     .end local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "scrollX":I
a=0;//     .end local v10    # "scrollY":I
a=0;//     .end local p3    # "dx":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1227
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     .restart local v6    # "count":I
a=0;//     .restart local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .restart local v8    # "i":I
a=0;//     .restart local v9    # "scrollX":I
a=0;//     .restart local v10    # "scrollY":I
a=0;//     .restart local p3    # "dx":I
a=0;//     :cond_0
a=0;//     #v0=(Integer);v1=(Reference,Landroid/view/View;);v2=(Integer);v6=(Integer);v7=(Reference,Landroid/view/ViewGroup;);v8=(Integer);v9=(Integer);v10=(Integer);
a=0;//     add-int/lit8 v8, v8, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1240
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     .end local v6    # "count":I
a=0;//     .end local v7    # "group":Landroid/view/ViewGroup;
a=0;//     .end local v8    # "i":I
a=0;//     .end local v9    # "scrollX":I
a=0;//     .end local v10    # "scrollY":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .end local p3    # "dx":I
a=0;//     :goto_2
a=0;//     invoke-static {p1, p3}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local p3    # "dx":I
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     neg-int p3, p3
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .end local p3    # "dx":I
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public canSlide()Z
a=0;//     .locals 1
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 926
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1265
a=0;//     instance-of v0, p1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
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
a=0;// .method public closePane()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 907
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public computeScroll()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1076
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1077
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1078
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->abort()V
a=0;// 
a=0;//     .line 1084
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1082
a=0;//     :cond_1
a=0;//     #v0=(Boolean);
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnPanelClosed(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "panel"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 346
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 347
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;->onPanelClosed(Landroid/view/View;)V
a=0;// 
a=0;//     .line 349
a=0;//     :cond_0
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 350
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnPanelOpened(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "panel"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 339
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 340
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;->onPanelOpened(Landroid/view/View;)V
a=0;// 
a=0;//     .line 342
a=0;//     :cond_0
a=0;//     const/16 v0, 0x20
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 343
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnPanelSlide(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "panel"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {v0, p1, v1}, Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;->onPanelSlide(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 336
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public draw(Landroid/graphics/Canvas;)V
a=0;//     .locals 10
a=0;//     .param p1, "c"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     .line 1152
a=0;//     #v9=(One);
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 1153
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1155
a=0;//     .local v1, "isLayoutRtl":Z
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1156
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawableRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 1161
a=0;//     .local v4, "shadowDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     :goto_0
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-le v8, v9, :cond_2
a=0;// 
a=0;//     invoke-virtual {p0, v9}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 1162
a=0;//     .local v5, "shadowView":Landroid/view/View;
a=0;//     :goto_1
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 1183
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1158
a=0;//     .end local v4    # "shadowDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v5    # "shadowView":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawableLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .restart local v4    # "shadowDrawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1161
a=0;//     :cond_2
a=0;//     #v8=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1167
a=0;//     .restart local v5    # "shadowView":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 1168
a=0;//     .local v7, "top":I
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1170
a=0;//     .local v0, "bottom":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 1173
a=0;//     .local v6, "shadowWidth":I
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     .line 1174
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1175
a=0;//     .local v2, "left":I
a=0;//     #v2=(Integer);
a=0;//     add-int v3, v2, v6
a=0;// 
a=0;//     .line 1181
a=0;//     .local v3, "right":I
a=0;//     :goto_3
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v4, v2, v7, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
a=0;// 
a=0;//     .line 1182
a=0;//     invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1177
a=0;//     .end local v2    # "left":I
a=0;//     .end local v3    # "right":I
a=0;//     :cond_4
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1178
a=0;//     .restart local v3    # "right":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v2, v3, v6
a=0;// 
a=0;//     .restart local v2    # "left":I
a=0;//     #v2=(Integer);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;//     .locals 7
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;//     .param p2, "child"    # Landroid/view/View;
a=0;//     .param p3, "drawingTime"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 994
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 996
a=0;//     .local v1, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->save(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 998
a=0;//     .local v3, "save":I
a=0;//     #v3=(Integer);
a=0;//     iget-boolean v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-boolean v4, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1000
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 1001
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1002
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v5, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iput v5, v4, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 1006
a=0;//     :goto_0
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 1009
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     sget v4, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/16 v5, 0xb
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     if-lt v4, v5, :cond_2
a=0;// 
a=0;//     .line 1010
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1032
a=0;//     .local v2, "result":Z
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V
a=0;// 
a=0;//     .line 1034
a=0;//     return v2
a=0;// 
a=0;//     .line 1004
a=0;//     .end local v2    # "result":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v5, v5, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     iput v5, v4, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1012
a=0;//     :cond_2
a=0;//     #v4=(Integer);v5=(PosByte);v6=(Conflicted);
a=0;//     iget-boolean v4, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     cmpl-float v4, v4, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_5
a=0;// 
a=0;//     .line 1013
a=0;//     invoke-virtual {p2}, Landroid/view/View;->isDrawingCacheEnabled()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 1014
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p2, v4}, Landroid/view/View;->setDrawingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1016
a=0;//     :cond_3
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1017
a=0;//     .local v0, "cache":Landroid/graphics/Bitmap;
a=0;//     #v0=(Reference,Landroid/graphics/Bitmap;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1018
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     iget-object v6, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Paint;);
a=0;//     invoke-virtual {p1, v0, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 1019
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .restart local v2    # "result":Z
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1021
a=0;//     .end local v2    # "result":Z
a=0;//     :cond_4
a=0;//     #v2=(Uninit);v4=(Boolean);v5=(Null);v6=(Conflicted);
a=0;//     const-string v4, "SlidingPaneLayout"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "drawChild: child view "
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, " returned null drawing cache"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 1022
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .restart local v2    # "result":Z
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1025
a=0;//     .end local v0    # "cache":Landroid/graphics/Bitmap;
a=0;//     .end local v2    # "result":Z
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v2=(Uninit);v4=(Byte);v5=(PosByte);v6=(Conflicted);
a=0;//     invoke-virtual {p2}, Landroid/view/View;->isDrawingCacheEnabled()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_6
a=0;// 
a=0;//     .line 1026
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p2, v4}, Landroid/view/View;->setDrawingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 1028
a=0;//     :cond_6
a=0;//     #v4=(Boolean);
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .restart local v2    # "result":Z
a=0;//     #v2=(Boolean);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1253
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1270
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 1
a=0;//     .param p1, "p"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1258
a=0;//     instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .end local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local p1    # "p":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCoveredFadeColor()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCoveredFadeColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getParallaxDistance()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSliderFadeColor()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method isDimmed(Landroid/view/View;)Z
a=0;//     .locals 4
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1244
a=0;//     #v1=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 1248
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 1247
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1248
a=0;//     .local v0, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     iget-boolean v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-boolean v2, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     cmpl-float v2, v2, v3
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isOpen()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 917
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x3f800000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isSlideable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 936
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 424
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 425
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 426
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 430
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 431
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 433
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .local v0, "count":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);
a=0;//     if-ge v2, v0, :cond_0
a=0;// 
a=0;//     .line 434
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
a=0;// 
a=0;//     .line 435
a=0;//     .local v1, "dlr":Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;->run()V
a=0;// 
a=0;//     .line 433
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 437
a=0;//     .end local v1    # "dlr":Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 438
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 13
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 759
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 762
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     iget-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_0
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v10, 0x1
a=0;// 
a=0;//     #v10=(One);
a=0;//     if-le v9, v10, :cond_0
a=0;// 
a=0;//     .line 764
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {p0, v9}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 765
a=0;//     .local v5, "secondChild":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 766
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Float);
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     float-to-int v11, v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {v9, v5, v10, v11}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-nez v9, :cond_2
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 771
a=0;//     .end local v5    # "secondChild":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v5=(Conflicted);v9=(Integer);v10=(Conflicted);v11=(Conflicted);
a=0;//     iget-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     iget-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z
a=0;// 
a=0;//     if-eqz v9, :cond_3
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 772
a=0;//     :cond_1
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v9}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 773
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 814
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Boolean);v12=(Conflicted);
a=0;//     return v9
a=0;// 
a=0;//     .line 766
a=0;//     .restart local v5    # "secondChild":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference,Landroid/view/View;);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Integer);v11=(Integer);v12=(Uninit);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 776
a=0;//     .end local v5    # "secondChild":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v9=(Boolean);v10=(Conflicted);v11=(Conflicted);
a=0;//     const/4 v9, 0x3
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-eq v0, v9, :cond_4
a=0;// 
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     if-ne v0, v9, :cond_5
a=0;// 
a=0;//     .line 777
a=0;//     :cond_4
a=0;//     #v9=(PosByte);
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v9}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 778
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 781
a=0;//     :cond_5
a=0;//     #v9=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 783
a=0;//     .local v4, "interceptTap":Z
a=0;//     #v4=(Null);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 812
a=0;//     :cond_6
a=0;//     :goto_2
a=0;//     :pswitch_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Byte);v12=(Conflicted);
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v9, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 814
a=0;//     .local v3, "interceptForDrag":Z
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_7
a=0;// 
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     :cond_7
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 785
a=0;//     .end local v3    # "interceptForDrag":Z
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v12=(Uninit);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     iput-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 786
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 787
a=0;//     .local v7, "x":F
a=0;//     #v7=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 788
a=0;//     .local v8, "y":F
a=0;//     #v8=(Float);
a=0;//     iput v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F
a=0;// 
a=0;//     .line 789
a=0;//     iput v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F
a=0;// 
a=0;//     .line 791
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v10, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/View;);
a=0;//     float-to-int v11, v7
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     float-to-int v12, v8
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     invoke-virtual {v9, v10, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v9}, Landroid/support/v4/widget/SlidingPaneLayout;->isDimmed(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_6
a=0;// 
a=0;//     .line 793
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 799
a=0;//     .end local v7    # "x":F
a=0;//     .end local v8    # "y":F
a=0;//     :pswitch_2
a=0;//     #v4=(Null);v7=(Uninit);v8=(Uninit);v9=(One);v10=(Conflicted);v11=(Conflicted);v12=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 800
a=0;//     .restart local v7    # "x":F
a=0;//     #v7=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 801
a=0;//     .restart local v8    # "y":F
a=0;//     #v8=(Float);
a=0;//     iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-float v9, v7, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 802
a=0;//     .local v1, "adx":F
a=0;//     #v1=(Float);
a=0;//     iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     sub-float v9, v8, v9
a=0;// 
a=0;//     #v9=(Float);
a=0;//     invoke-static {v9}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 803
a=0;//     .local v2, "ady":F
a=0;//     #v2=(Float);
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v9}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 804
a=0;//     .local v6, "slop":I
a=0;//     #v6=(Integer);
a=0;//     int-to-float v9, v6
a=0;// 
a=0;//     #v9=(Float);
a=0;//     cmpl-float v9, v1, v9
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-lez v9, :cond_6
a=0;// 
a=0;//     cmpl-float v9, v2, v1
a=0;// 
a=0;//     if-lez v9, :cond_6
a=0;// 
a=0;//     .line 805
a=0;//     iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v9}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V
a=0;// 
a=0;//     .line 806
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     iput-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z
a=0;// 
a=0;//     .line 807
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 814
a=0;//     .end local v1    # "adx":F
a=0;//     .end local v2    # "ady":F
a=0;//     .end local v6    # "slop":I
a=0;//     .end local v7    # "x":F
a=0;//     .end local v8    # "y":F
a=0;//     .restart local v3    # "interceptForDrag":Z
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference,Landroid/support/v4/widget/ViewDragHelper;);v12=(Conflicted);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 783
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 28
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 654
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 655
a=0;//     .local v12, "isLayoutRtl":Z
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1
a=0;// 
a=0;//     .line 656
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     const/16 v26, 0x2
a=0;// 
a=0;//     #v26=(PosByte);
a=0;//     invoke-virtual/range {v25 .. v26}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V
a=0;// 
a=0;//     .line 660
a=0;//     :goto_0
a=0;//     sub-int v23, p4, p2
a=0;// 
a=0;//     .line 661
a=0;//     .local v23, "width":I
a=0;//     #v23=(Integer);
a=0;//     if-eqz v12, :cond_2
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 662
a=0;//     .local v19, "paddingStart":I
a=0;//     :goto_1
a=0;//     #v19=(Integer);
a=0;//     if-eqz v12, :cond_3
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 663
a=0;//     .local v18, "paddingEnd":I
a=0;//     :goto_2
a=0;//     #v18=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 665
a=0;//     .local v20, "paddingTop":I
a=0;//     #v20=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 666
a=0;//     .local v6, "childCount":I
a=0;//     #v6=(Integer);
a=0;//     move/from16 v24, v19
a=0;// 
a=0;//     .line 667
a=0;//     .local v24, "xStart":I
a=0;//     #v24=(Integer);
a=0;//     move/from16 v16, v24
a=0;// 
a=0;//     .line 669
a=0;//     .local v16, "nextXStart":I
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_0
a=0;// 
a=0;//     .line 670
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     if-eqz v25, :cond_4
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     if-eqz v25, :cond_4
a=0;// 
a=0;//     const/high16 v25, 0x3f800000
a=0;// 
a=0;//     :goto_3
a=0;//     #v25=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iput v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     .line 673
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .local v11, "i":I
a=0;//     :goto_4
a=0;//     #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v21=(Conflicted);v22=(Conflicted);v26=(Float);
a=0;//     if-ge v11, v6, :cond_b
a=0;// 
a=0;//     .line 674
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0, v11}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 676
a=0;//     .local v4, "child":Landroid/view/View;
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     const/16 v26, 0x8
a=0;// 
a=0;//     #v26=(PosByte);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     .line 673
a=0;//     :goto_5
a=0;//     #v1=(Conflicted);v26=(Float);
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 658
a=0;//     .end local v4    # "child":Landroid/view/View;
a=0;//     .end local v6    # "childCount":I
a=0;//     .end local v11    # "i":I
a=0;//     .end local v16    # "nextXStart":I
a=0;//     .end local v18    # "paddingEnd":I
a=0;//     .end local v19    # "paddingStart":I
a=0;//     .end local v20    # "paddingTop":I
a=0;//     .end local v23    # "width":I
a=0;//     .end local v24    # "xStart":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     const/16 v26, 0x1
a=0;// 
a=0;//     #v26=(One);
a=0;//     invoke-virtual/range {v25 .. v26}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 661
a=0;//     .restart local v23    # "width":I
a=0;//     :cond_2
a=0;//     #v23=(Integer);v26=(PosByte);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 662
a=0;//     .restart local v19    # "paddingStart":I
a=0;//     :cond_3
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 670
a=0;//     .restart local v6    # "childCount":I
a=0;//     .restart local v16    # "nextXStart":I
a=0;//     .restart local v18    # "paddingEnd":I
a=0;//     .restart local v20    # "paddingTop":I
a=0;//     .restart local v24    # "xStart":I
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v6=(Integer);v16=(Integer);v20=(Integer);v24=(Integer);v25=(Boolean);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 680
a=0;//     .restart local v4    # "child":Landroid/view/View;
a=0;//     .restart local v11    # "i":I
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(PosByte);v4=(Reference,Landroid/view/View;);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v21=(Conflicted);v22=(Conflicted);v25=(Integer);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 682
a=0;//     .local v13, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 683
a=0;//     .local v10, "childWidth":I
a=0;//     #v10=(Integer);
a=0;//     const/16 v17, 0x0
a=0;// 
a=0;//     .line 685
a=0;//     .local v17, "offset":I
a=0;//     #v17=(Null);
a=0;//     iget-boolean v0, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_8
a=0;// 
a=0;//     .line 686
a=0;//     iget v0, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     iget v0, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     add-int v15, v25, v26
a=0;// 
a=0;//     .line 687
a=0;//     .local v15, "margin":I
a=0;//     #v15=(Integer);
a=0;//     sub-int v25, v23, v18
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mOverhangSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     sub-int v25, v25, v26
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     move/from16 v1, v25
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     sub-int v25, v25, v24
a=0;// 
a=0;//     sub-int v22, v25, v15
a=0;// 
a=0;//     .line 689
a=0;//     .local v22, "range":I
a=0;//     #v22=(Integer);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iput v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     .line 690
a=0;//     if-eqz v12, :cond_6
a=0;// 
a=0;//     iget v14, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 691
a=0;//     .local v14, "lpMargin":I
a=0;//     :goto_6
a=0;//     #v14=(Integer);
a=0;//     add-int v25, v24, v14
a=0;// 
a=0;//     add-int v25, v25, v22
a=0;// 
a=0;//     div-int/lit8 v26, v10, 0x2
a=0;// 
a=0;//     add-int v25, v25, v26
a=0;// 
a=0;//     sub-int v26, v23, v18
a=0;// 
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_7
a=0;// 
a=0;//     const/16 v25, 0x1
a=0;// 
a=0;//     :goto_7
a=0;//     #v25=(Boolean);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     .line 693
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     mul-float v25, v25, v26
a=0;// 
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Float);
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     .line 694
a=0;//     .local v21, "pos":I
a=0;//     #v21=(Integer);
a=0;//     add-int v25, v21, v14
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     add-int v24, v24, v25
a=0;// 
a=0;//     .line 695
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Float);
a=0;//     div-float v25, v25, v26
a=0;// 
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iput v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     .line 705
a=0;//     .end local v14    # "lpMargin":I
a=0;//     .end local v15    # "margin":I
a=0;//     .end local v21    # "pos":I
a=0;//     .end local v22    # "range":I
a=0;//     :goto_8
a=0;//     #v0=(Integer);v1=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Integer);v21=(Conflicted);v22=(Conflicted);v25=(Integer);
a=0;//     if-eqz v12, :cond_a
a=0;// 
a=0;//     .line 706
a=0;//     sub-int v25, v23, v24
a=0;// 
a=0;//     add-int v8, v25, v17
a=0;// 
a=0;//     .line 707
a=0;//     .local v8, "childRight":I
a=0;//     #v8=(Integer);
a=0;//     sub-int v7, v8, v10
a=0;// 
a=0;//     .line 713
a=0;//     .local v7, "childLeft":I
a=0;//     :goto_9
a=0;//     #v7=(Integer);
a=0;//     move/from16 v9, v20
a=0;// 
a=0;//     .line 714
a=0;//     .local v9, "childTop":I
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     add-int v5, v9, v25
a=0;// 
a=0;//     .line 715
a=0;//     .local v5, "childBottom":I
a=0;//     #v5=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     invoke-virtual {v4, v7, v0, v8, v5}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 717
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     add-int v16, v16, v25
a=0;// 
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 690
a=0;//     .end local v5    # "childBottom":I
a=0;//     .end local v7    # "childLeft":I
a=0;//     .end local v8    # "childRight":I
a=0;//     .end local v9    # "childTop":I
a=0;//     .restart local v15    # "margin":I
a=0;//     .restart local v22    # "range":I
a=0;//     :cond_6
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v15=(Integer);v17=(Null);v22=(Integer);v26=(Integer);
a=0;//     iget v14, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v14=(Integer);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 691
a=0;//     .restart local v14    # "lpMargin":I
a=0;//     :cond_7
a=0;//     #v1=(Integer);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 696
a=0;//     .end local v14    # "lpMargin":I
a=0;//     .end local v15    # "margin":I
a=0;//     .end local v22    # "range":I
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(PosByte);v14=(Conflicted);v15=(Conflicted);v22=(Conflicted);v25=(Boolean);v26=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     if-eqz v25, :cond_9
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     if-eqz v25, :cond_9
a=0;// 
a=0;//     .line 697
a=0;//     const/high16 v25, 0x3f800000
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     sub-float v25, v25, v26
a=0;// 
a=0;//     #v25=(Float);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     move/from16 v0, v26
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Float);
a=0;//     mul-float v25, v25, v26
a=0;// 
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v17, v0
a=0;// 
a=0;//     .line 698
a=0;//     #v17=(Integer);
a=0;//     move/from16 v24, v16
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 700
a=0;//     :cond_9
a=0;//     #v17=(Null);v25=(Integer);v26=(PosByte);
a=0;//     move/from16 v24, v16
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 709
a=0;//     :cond_a
a=0;//     #v1=(Conflicted);v17=(Integer);v26=(Float);
a=0;//     sub-int v7, v24, v17
a=0;// 
a=0;//     .line 710
a=0;//     .restart local v7    # "childLeft":I
a=0;//     #v7=(Integer);
a=0;//     add-int v8, v7, v10
a=0;// 
a=0;//     .restart local v8    # "childRight":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 720
a=0;//     .end local v4    # "child":Landroid/view/View;
a=0;//     .end local v7    # "childLeft":I
a=0;//     .end local v8    # "childRight":I
a=0;//     .end local v10    # "childWidth":I
a=0;//     .end local v13    # "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     .end local v17    # "offset":I
a=0;//     :cond_b
a=0;//     #v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v13=(Conflicted);v17=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_e
a=0;// 
a=0;//     .line 721
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     if-eqz v25, :cond_f
a=0;// 
a=0;//     .line 722
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     if-eqz v25, :cond_c
a=0;// 
a=0;//     .line 723
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     move/from16 v1, v25
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->parallaxOtherViews(F)V
a=0;// 
a=0;//     .line 725
a=0;//     :cond_c
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     check-cast v25, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Boolean);
a=0;//     if-eqz v25, :cond_d
a=0;// 
a=0;//     .line 726
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v26, v0
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     move/from16 v2, v26
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v27
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V
a=0;// 
a=0;//     .line 734
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v25=(Conflicted);v27=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->updateObscuredViewsVisibility(Landroid/view/View;)V
a=0;// 
a=0;//     .line 737
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);v1=(Conflicted);v25=(Conflicted);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 738
a=0;//     return-void
a=0;// 
a=0;//     .line 730
a=0;//     :cond_f
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v25=(Boolean);v26=(Float);v27=(Uninit);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     :goto_a
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v25=(Conflicted);v27=(Conflicted);
a=0;//     if-ge v11, v6, :cond_d
a=0;// 
a=0;//     .line 731
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0, v11}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     #v25=(Reference,Landroid/view/View;);
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     #v26=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     move-object/from16 v1, v25
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     move/from16 v2, v26
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move/from16 v3, v27
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V
a=0;// 
a=0;//     .line 730
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_a
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 31
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     .line 443
a=0;//     .local v25, "widthMode":I
a=0;//     #v25=(Integer);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     .line 444
a=0;//     .local v27, "widthSize":I
a=0;//     #v27=(Integer);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 445
a=0;//     .local v12, "heightMode":I
a=0;//     #v12=(Integer);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 447
a=0;//     .local v13, "heightSize":I
a=0;//     #v13=(Integer);
a=0;//     const/high16 v29, 0x40000000
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_5
a=0;// 
a=0;//     .line 448
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInEditMode()Z
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     #v29=(Boolean);
a=0;//     if-eqz v29, :cond_4
a=0;// 
a=0;//     .line 453
a=0;//     const/high16 v29, -0x80000000
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     move/from16 v0, v25
a=0;// 
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 454
a=0;//     const/high16 v25, 0x40000000
a=0;// 
a=0;//     .line 476
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 477
a=0;//     .local v16, "layoutHeight":I
a=0;//     #v16=(Null);
a=0;//     const/16 v18, -0x1
a=0;// 
a=0;//     .line 478
a=0;//     .local v18, "maxLayoutHeight":I
a=0;//     #v18=(Byte);
a=0;//     sparse-switch v12, :sswitch_data_0
a=0;// 
a=0;//     .line 487
a=0;//     :goto_1
a=0;//     #v16=(Integer);v18=(Integer);v30=(Conflicted);
a=0;//     const/16 v23, 0x0
a=0;// 
a=0;//     .line 488
a=0;//     .local v23, "weightSum":F
a=0;//     #v23=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 489
a=0;//     .local v4, "canSlide":Z
a=0;//     #v4=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     sub-int v29, v27, v29
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v30
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     sub-int v24, v29, v30
a=0;// 
a=0;//     .line 490
a=0;//     .local v24, "widthAvailable":I
a=0;//     #v24=(Integer);
a=0;//     move/from16 v26, v24
a=0;// 
a=0;//     .line 491
a=0;//     .local v26, "widthRemaining":I
a=0;//     #v26=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 493
a=0;//     .local v6, "childCount":I
a=0;//     #v6=(Integer);
a=0;//     const/16 v29, 0x2
a=0;// 
a=0;//     #v29=(PosByte);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-le v6, v0, :cond_1
a=0;// 
a=0;//     .line 494
a=0;//     const-string v29, "SlidingPaneLayout"
a=0;// 
a=0;//     #v29=(Reference,Ljava/lang/String;);
a=0;//     const-string v30, "onMeasure: More than two child views are not supported."
a=0;// 
a=0;//     #v30=(Reference,Ljava/lang/String;);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 498
a=0;//     :cond_1
a=0;//     #v29=(Conflicted);v30=(Conflicted);
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     #v29=(Null);
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iput-object v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     .line 502
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     .local v15, "i":I
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Boolean);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v15=(Integer);v17=(Conflicted);v23=(Float);v29=(Integer);
a=0;//     if-ge v15, v6, :cond_f
a=0;// 
a=0;//     .line 503
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0, v15}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 504
a=0;//     .local v5, "child":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v17, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 506
a=0;//     .local v17, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     const/16 v30, 0x8
a=0;// 
a=0;//     #v30=(PosByte);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_7
a=0;// 
a=0;//     .line 507
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     #v29=(Null);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z
a=0;// 
a=0;//     .line 502
a=0;//     :cond_2
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v29=(Integer);v30=(Integer);
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 455
a=0;//     .end local v4    # "canSlide":Z
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     .end local v6    # "childCount":I
a=0;//     .end local v15    # "i":I
a=0;//     .end local v16    # "layoutHeight":I
a=0;//     .end local v17    # "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     .end local v18    # "maxLayoutHeight":I
a=0;//     .end local v23    # "weightSum":F
a=0;//     .end local v24    # "widthAvailable":I
a=0;//     .end local v26    # "widthRemaining":I
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v23=(Uninit);v24=(Uninit);v26=(Uninit);v30=(Uninit);
a=0;//     if-nez v25, :cond_0
a=0;// 
a=0;//     .line 456
a=0;//     const/high16 v25, 0x40000000
a=0;// 
a=0;//     .line 457
a=0;//     const/16 v27, 0x12c
a=0;// 
a=0;//     #v27=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 460
a=0;//     :cond_4
a=0;//     #v27=(Integer);v29=(Boolean);
a=0;//     new-instance v29, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v29=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v30, "Width must have an exact value or MATCH_PARENT"
a=0;// 
a=0;//     #v30=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v29 .. v30}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v29=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v29
a=0;// 
a=0;//     .line 462
a=0;//     :cond_5
a=0;//     #v29=(Integer);v30=(Uninit);
a=0;//     if-nez v12, :cond_0
a=0;// 
a=0;//     .line 463
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInEditMode()Z
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     #v29=(Boolean);
a=0;//     if-eqz v29, :cond_6
a=0;// 
a=0;//     .line 467
a=0;//     if-nez v12, :cond_0
a=0;// 
a=0;//     .line 468
a=0;//     const/high16 v12, -0x80000000
a=0;// 
a=0;//     .line 469
a=0;//     const/16 v13, 0x12c
a=0;// 
a=0;//     #v13=(PosShort);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 472
a=0;//     :cond_6
a=0;//     #v13=(Integer);
a=0;//     new-instance v29, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v29=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v30, "Height must not be UNSPECIFIED"
a=0;// 
a=0;//     #v30=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v29 .. v30}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v29=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v29
a=0;// 
a=0;//     .line 480
a=0;//     .restart local v16    # "layoutHeight":I
a=0;//     .restart local v18    # "maxLayoutHeight":I
a=0;//     :sswitch_0
a=0;//     #v16=(Null);v18=(Byte);v29=(Integer);v30=(Uninit);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     sub-int v29, v13, v29
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v30
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     sub-int v18, v29, v30
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     move/from16 v16, v18
a=0;// 
a=0;//     .line 481
a=0;//     #v16=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 483
a=0;//     :sswitch_1
a=0;//     #v16=(Null);v18=(Byte);v30=(Uninit);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     sub-int v29, v13, v29
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v30
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     sub-int v18, v29, v30
a=0;// 
a=0;//     #v18=(Integer);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 511
a=0;//     .restart local v4    # "canSlide":Z
a=0;//     .restart local v5    # "child":Landroid/view/View;
a=0;//     .restart local v6    # "childCount":I
a=0;//     .restart local v15    # "i":I
a=0;//     .restart local v17    # "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     .restart local v23    # "weightSum":F
a=0;//     .restart local v24    # "widthAvailable":I
a=0;//     .restart local v26    # "widthRemaining":I
a=0;//     :cond_7
a=0;//     #v1=(PosByte);v4=(Boolean);v5=(Reference,Landroid/view/View;);v6=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v15=(Integer);v16=(Integer);v17=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);v23=(Float);v24=(Integer);v26=(Integer);v30=(PosByte);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, 0x0
a=0;// 
a=0;//     #v30=(Null);
a=0;//     cmpl-float v29, v29, v30
a=0;// 
a=0;//     #v29=(Byte);
a=0;//     if-lez v29, :cond_8
a=0;// 
a=0;//     .line 512
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     add-float v23, v23, v29
a=0;// 
a=0;//     .line 516
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     if-eqz v29, :cond_2
a=0;// 
a=0;//     .line 520
a=0;//     :cond_8
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v30, v0
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     add-int v14, v29, v30
a=0;// 
a=0;//     .line 521
a=0;//     .local v14, "horizontalMargin":I
a=0;//     #v14=(Integer);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, -0x2
a=0;// 
a=0;//     #v30=(Byte);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_a
a=0;// 
a=0;//     .line 522
a=0;//     sub-int v29, v24, v14
a=0;// 
a=0;//     const/high16 v30, -0x80000000
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 532
a=0;//     .local v10, "childWidthSpec":I
a=0;//     :goto_4
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, -0x2
a=0;// 
a=0;//     #v30=(Byte);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     if-ne v0, v1, :cond_c
a=0;// 
a=0;//     .line 533
a=0;//     const/high16 v29, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 540
a=0;//     .local v8, "childHeightSpec":I
a=0;//     :goto_5
a=0;//     #v8=(Integer);v30=(Integer);
a=0;//     invoke-virtual {v5, v10, v8}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 541
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 542
a=0;//     .local v9, "childWidth":I
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 544
a=0;//     .local v7, "childHeight":I
a=0;//     #v7=(Integer);
a=0;//     const/high16 v29, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     if-ne v12, v0, :cond_9
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-le v7, v0, :cond_9
a=0;// 
a=0;//     .line 545
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 548
a=0;//     :cond_9
a=0;//     sub-int v26, v26, v9
a=0;// 
a=0;//     .line 549
a=0;//     if-gez v26, :cond_e
a=0;// 
a=0;//     const/16 v29, 0x1
a=0;// 
a=0;//     :goto_6
a=0;//     #v29=(Boolean);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move-object/from16 v1, v17
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     or-int v4, v4, v29
a=0;// 
a=0;//     .line 550
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     if-eqz v29, :cond_2
a=0;// 
a=0;//     .line 551
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iput-object v5, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 524
a=0;//     .end local v7    # "childHeight":I
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     .end local v9    # "childWidth":I
a=0;//     .end local v10    # "childWidthSpec":I
a=0;//     :cond_a
a=0;//     #v0=(Integer);v1=(Byte);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v29=(Integer);v30=(Byte);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, -0x1
a=0;// 
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     if-ne v0, v1, :cond_b
a=0;// 
a=0;//     .line 525
a=0;//     sub-int v29, v24, v14
a=0;// 
a=0;//     const/high16 v30, 0x40000000
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .restart local v10    # "childWidthSpec":I
a=0;//     #v10=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 528
a=0;//     .end local v10    # "childWidthSpec":I
a=0;//     :cond_b
a=0;//     #v10=(Conflicted);v30=(Byte);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/high16 v30, 0x40000000
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .restart local v10    # "childWidthSpec":I
a=0;//     #v10=(Integer);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 534
a=0;//     :cond_c
a=0;//     #v30=(Byte);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, -0x1
a=0;// 
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     if-ne v0, v1, :cond_d
a=0;// 
a=0;//     .line 535
a=0;//     const/high16 v29, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 537
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     :cond_d
a=0;//     #v1=(Byte);v8=(Conflicted);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/high16 v30, 0x40000000
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 549
a=0;//     .restart local v7    # "childHeight":I
a=0;//     .restart local v9    # "childWidth":I
a=0;//     :cond_e
a=0;//     #v1=(Integer);v7=(Integer);v9=(Integer);
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     #v29=(Null);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .line 556
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     .end local v7    # "childHeight":I
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     .end local v9    # "childWidth":I
a=0;//     .end local v10    # "childWidthSpec":I
a=0;//     .end local v14    # "horizontalMargin":I
a=0;//     .end local v17    # "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v17=(Conflicted);v29=(Integer);v30=(Conflicted);
a=0;//     if-nez v4, :cond_10
a=0;// 
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     #v29=(Null);
a=0;//     cmpl-float v29, v23, v29
a=0;// 
a=0;//     #v29=(Byte);
a=0;//     if-lez v29, :cond_1e
a=0;// 
a=0;//     .line 557
a=0;//     :cond_10
a=0;//     #v29=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mOverhangSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     sub-int v11, v24, v29
a=0;// 
a=0;//     .line 559
a=0;//     .local v11, "fixedPanelWidthLimit":I
a=0;//     #v11=(Integer);
a=0;//     const/4 v15, 0x0
a=0;// 
a=0;//     :goto_7
a=0;//     #v3=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v28=(Conflicted);
a=0;//     if-ge v15, v6, :cond_1e
a=0;// 
a=0;//     .line 560
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0, v15}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 562
a=0;//     .restart local v5    # "child":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     const/16 v30, 0x8
a=0;// 
a=0;//     #v30=(PosByte);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_12
a=0;// 
a=0;//     .line 559
a=0;//     :cond_11
a=0;//     :goto_8
a=0;//     #v1=(Integer);v30=(Integer);
a=0;//     add-int/lit8 v15, v15, 0x1
a=0;// 
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 566
a=0;//     :cond_12
a=0;//     #v1=(PosByte);v30=(PosByte);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v17
a=0;// 
a=0;//     #v17=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v17, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 568
a=0;//     .restart local v17    # "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     const/16 v30, 0x8
a=0;// 
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     if-eq v0, v1, :cond_11
a=0;// 
a=0;//     .line 572
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     if-nez v29, :cond_14
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, 0x0
a=0;// 
a=0;//     #v30=(Null);
a=0;//     cmpl-float v29, v29, v30
a=0;// 
a=0;//     #v29=(Byte);
a=0;//     if-lez v29, :cond_14
a=0;// 
a=0;//     const/16 v22, 0x1
a=0;// 
a=0;//     .line 573
a=0;//     .local v22, "skippedFirstPass":Z
a=0;//     :goto_9
a=0;//     #v22=(Boolean);v29=(Integer);v30=(PosByte);
a=0;//     if-eqz v22, :cond_15
a=0;// 
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     .line 574
a=0;//     .local v20, "measuredWidth":I
a=0;//     :goto_a
a=0;//     #v20=(Integer);
a=0;//     if-eqz v4, :cond_19
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v29, v0
a=0;// 
a=0;//     #v29=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, v29
a=0;// 
a=0;//     if-eq v5, v0, :cond_19
a=0;// 
a=0;//     .line 575
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     if-gez v29, :cond_11
a=0;// 
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     if-gt v0, v11, :cond_13
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, 0x0
a=0;// 
a=0;//     #v30=(Null);
a=0;//     cmpl-float v29, v29, v30
a=0;// 
a=0;//     #v29=(Byte);
a=0;//     if-lez v29, :cond_11
a=0;// 
a=0;//     .line 579
a=0;//     :cond_13
a=0;//     #v29=(Integer);v30=(PosByte);
a=0;//     if-eqz v22, :cond_18
a=0;// 
a=0;//     .line 582
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, -0x2
a=0;// 
a=0;//     #v30=(Byte);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_16
a=0;// 
a=0;//     .line 583
a=0;//     const/high16 v29, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 596
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     :goto_b
a=0;//     #v8=(Integer);v30=(Integer);
a=0;//     const/high16 v29, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     invoke-static {v11, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 598
a=0;//     .restart local v10    # "childWidthSpec":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v5, v10, v8}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 572
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     .end local v10    # "childWidthSpec":I
a=0;//     .end local v20    # "measuredWidth":I
a=0;//     .end local v22    # "skippedFirstPass":Z
a=0;//     :cond_14
a=0;//     #v1=(PosByte);v8=(Conflicted);v10=(Conflicted);v20=(Conflicted);v22=(Conflicted);v30=(PosByte);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     #v22=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 573
a=0;//     .restart local v22    # "skippedFirstPass":Z
a=0;//     :cond_15
a=0;//     #v22=(Boolean);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 585
a=0;//     .restart local v20    # "measuredWidth":I
a=0;//     :cond_16
a=0;//     #v1=(Byte);v30=(Byte);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, -0x1
a=0;// 
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     if-ne v0, v1, :cond_17
a=0;// 
a=0;//     .line 586
a=0;//     const/high16 v29, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 589
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     :cond_17
a=0;//     #v1=(Byte);v8=(Conflicted);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/high16 v30, 0x40000000
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 593
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     :cond_18
a=0;//     #v1=(PosByte);v8=(Conflicted);v30=(PosByte);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     const/high16 v30, 0x40000000
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 600
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     :cond_19
a=0;//     #v0=(Conflicted);v8=(Conflicted);v29=(Conflicted);v30=(PosByte);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     const/16 v30, 0x0
a=0;// 
a=0;//     #v30=(Null);
a=0;//     cmpl-float v29, v29, v30
a=0;// 
a=0;//     #v29=(Byte);
a=0;//     if-lez v29, :cond_11
a=0;// 
a=0;//     .line 602
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     if-nez v29, :cond_1c
a=0;// 
a=0;//     .line 604
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, -0x2
a=0;// 
a=0;//     #v30=(Byte);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_1a
a=0;// 
a=0;//     .line 605
a=0;//     const/high16 v29, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 619
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     :goto_c
a=0;//     #v8=(Integer);v30=(Integer);
a=0;//     if-eqz v4, :cond_1d
a=0;// 
a=0;//     .line 621
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v30, v0
a=0;// 
a=0;//     add-int v14, v29, v30
a=0;// 
a=0;//     .line 622
a=0;//     .restart local v14    # "horizontalMargin":I
a=0;//     #v14=(Integer);
a=0;//     sub-int v21, v24, v14
a=0;// 
a=0;//     .line 623
a=0;//     .local v21, "newWidth":I
a=0;//     #v21=(Integer);
a=0;//     const/high16 v29, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v21
a=0;// 
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 625
a=0;//     .restart local v10    # "childWidthSpec":I
a=0;//     #v10=(Integer);
a=0;//     move/from16 v0, v20
a=0;// 
a=0;//     move/from16 v1, v21
a=0;// 
a=0;//     if-eq v0, v1, :cond_11
a=0;// 
a=0;//     .line 626
a=0;//     invoke-virtual {v5, v10, v8}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 607
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     .end local v10    # "childWidthSpec":I
a=0;//     .end local v14    # "horizontalMargin":I
a=0;//     .end local v21    # "newWidth":I
a=0;//     :cond_1a
a=0;//     #v1=(Byte);v8=(Conflicted);v10=(Conflicted);v14=(Conflicted);v21=(Conflicted);v30=(Byte);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/16 v30, -0x1
a=0;// 
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v30
a=0;// 
a=0;//     if-ne v0, v1, :cond_1b
a=0;// 
a=0;//     .line 608
a=0;//     const/high16 v29, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     move/from16 v1, v29
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 611
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     :cond_1b
a=0;//     #v1=(Byte);v8=(Conflicted);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     const/high16 v30, 0x40000000
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 615
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     :cond_1c
a=0;//     #v1=(PosByte);v8=(Conflicted);v30=(Null);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     const/high16 v30, 0x40000000
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .restart local v8    # "childHeightSpec":I
a=0;//     #v8=(Integer);
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 630
a=0;//     :cond_1d
a=0;//     #v1=(Integer);
a=0;//     const/16 v29, 0x0
a=0;// 
a=0;//     #v29=(Null);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     .line 631
a=0;//     .local v28, "widthToDistribute":I
a=0;//     #v28=(Integer);
a=0;//     move-object/from16 v0, v17
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     move/from16 v0, v28
a=0;// 
a=0;//     int-to-float v0, v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v30, v0
a=0;// 
a=0;//     #v30=(Float);
a=0;//     mul-float v29, v29, v30
a=0;// 
a=0;//     #v29=(Float);
a=0;//     div-float v29, v29, v23
a=0;// 
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     float-to-int v3, v0
a=0;// 
a=0;//     .line 632
a=0;//     .local v3, "addedWidth":I
a=0;//     #v3=(Integer);
a=0;//     add-int v29, v20, v3
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     const/high16 v30, 0x40000000
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 634
a=0;//     .restart local v10    # "childWidthSpec":I
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v5, v10, v8}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 640
a=0;//     .end local v3    # "addedWidth":I
a=0;//     .end local v5    # "child":Landroid/view/View;
a=0;//     .end local v8    # "childHeightSpec":I
a=0;//     .end local v10    # "childWidthSpec":I
a=0;//     .end local v11    # "fixedPanelWidthLimit":I
a=0;//     .end local v17    # "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     .end local v20    # "measuredWidth":I
a=0;//     .end local v22    # "skippedFirstPass":Z
a=0;//     .end local v28    # "widthToDistribute":I
a=0;//     :cond_1e
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v17=(Conflicted);v20=(Conflicted);v22=(Conflicted);v28=(Conflicted);v30=(Conflicted);
a=0;//     move/from16 v20, v27
a=0;// 
a=0;//     .line 641
a=0;//     .restart local v20    # "measuredWidth":I
a=0;//     #v20=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     add-int v29, v29, v16
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v30
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     add-int v19, v29, v30
a=0;// 
a=0;//     .line 643
a=0;//     .local v19, "measuredHeight":I
a=0;//     #v19=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v19
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 644
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-boolean v4, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     .line 646
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-object/from16 v29, v0
a=0;// 
a=0;//     #v29=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual/range {v29 .. v29}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     if-eqz v29, :cond_1f
a=0;// 
a=0;//     if-nez v4, :cond_1f
a=0;// 
a=0;//     .line 648
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-object/from16 v29, v0
a=0;// 
a=0;//     #v29=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual/range {v29 .. v29}, Landroid/support/v4/widget/ViewDragHelper;->abort()V
a=0;// 
a=0;//     .line 650
a=0;//     :cond_1f
a=0;//     #v29=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 478
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         -0x80000000 -> :sswitch_1
a=0;//         0x40000000 -> :sswitch_0
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 2
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1285
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
a=0;// 
a=0;//     .line 1286
a=0;//     .local v0, "ss":Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1288
a=0;//     iget-boolean v1, v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1289
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->openPane()Z
a=0;// 
a=0;//     .line 1293
a=0;//     :goto_0
a=0;//     iget-boolean v1, v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z
a=0;// 
a=0;//     iput-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 1294
a=0;//     return-void
a=0;// 
a=0;//     .line 1291
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1275
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1277
a=0;//     .local v1, "superState":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/SlidingPaneLayout$SavedState;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1278
a=0;//     .local v0, "ss":Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$SavedState;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isSlideable()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isOpen()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v2, v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z
a=0;// 
a=0;//     .line 1280
a=0;//     return-object v0
a=0;// 
a=0;//     .line 1278
a=0;//     :cond_0
a=0;//     iget-boolean v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onSizeChanged(IIII)V
a=0;//     .locals 1
a=0;//     .param p1, "w"    # I
a=0;//     .param p2, "h"    # I
a=0;//     .param p3, "oldw"    # I
a=0;//     .param p4, "oldh"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 742
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V
a=0;// 
a=0;//     .line 744
a=0;//     if-eq p1, p3, :cond_0
a=0;// 
a=0;//     .line 745
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z
a=0;// 
a=0;//     .line 747
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 11
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 819
a=0;//     iget-boolean v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_1
a=0;// 
a=0;//     .line 820
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 855
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 823
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v7, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V
a=0;// 
a=0;//     .line 825
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 826
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 828
a=0;//     .local v4, "wantTouchEvents":Z
a=0;//     #v4=(One);
a=0;//     and-int/lit16 v7, v0, 0xff
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     packed-switch v7, :pswitch_data_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 830
a=0;//     :pswitch_0
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 831
a=0;//     .local v5, "x":F
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 832
a=0;//     .local v6, "y":F
a=0;//     #v6=(Float);
a=0;//     iput v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F
a=0;// 
a=0;//     .line 833
a=0;//     iput v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 838
a=0;//     .end local v5    # "x":F
a=0;//     .end local v6    # "y":F
a=0;//     :pswitch_1
a=0;//     #v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v7}, Landroid/support/v4/widget/SlidingPaneLayout;->isDimmed(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 839
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 840
a=0;//     .restart local v5    # "x":F
a=0;//     #v5=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 841
a=0;//     .restart local v6    # "y":F
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     sub-float v1, v5, v7
a=0;// 
a=0;//     .line 842
a=0;//     .local v1, "dx":F
a=0;//     #v1=(Float);
a=0;//     iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F
a=0;// 
a=0;//     sub-float v2, v6, v7
a=0;// 
a=0;//     .line 843
a=0;//     .local v2, "dy":F
a=0;//     #v2=(Float);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v7}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 844
a=0;//     .local v3, "slop":I
a=0;//     #v3=(Integer);
a=0;//     mul-float v7, v1, v1
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float v8, v2, v2
a=0;// 
a=0;//     #v8=(Float);
a=0;//     add-float/2addr v7, v8
a=0;// 
a=0;//     mul-int v8, v3, v3
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     cmpg-float v7, v7, v8
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-gez v7, :cond_0
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     float-to-int v9, v5
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     float-to-int v10, v6
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v7, v8, v9, v10}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 847
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-direct {p0, v7, v8}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane(Landroid/view/View;I)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 828
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public openPane()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 889
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->openPane(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "focused"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 751
a=0;//     invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V
a=0;// 
a=0;//     .line 752
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInTouchMode()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 753
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z
a=0;// 
a=0;//     .line 755
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 753
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setAllChildrenVisible()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 399
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .local v1, "childCount":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v2, v1, :cond_1
a=0;// 
a=0;//     .line 400
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 401
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v3, v4, :cond_0
a=0;// 
a=0;//     .line 402
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 399
a=0;//     :cond_0
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 405
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCoveredFadeColor(I)V
a=0;//     .locals 0
a=0;//     .param p1, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 318
a=0;//     iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCoveredFadeColor:I
a=0;// 
a=0;//     .line 319
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPanelSlideListener(Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 329
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
a=0;// 
a=0;//     .line 330
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setParallaxDistance(I)V
a=0;//     .locals 0
a=0;//     .param p1, "parallaxBy"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 282
a=0;//     iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->requestLayout()V
a=0;// 
a=0;//     .line 284
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1095
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1096
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1105
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawableLeft:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 1106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowDrawableRight(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 0
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1115
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawableRight:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 1116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowResource(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1126
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowResourceLeft(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1136
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1137
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShadowResourceRight(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1146
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawableRight(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1147
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSliderFadeColor(I)V
a=0;//     .locals 0
a=0;//     .param p1, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I
a=0;// 
a=0;//     .line 302
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public smoothSlideClosed()V
a=0;//     .locals 0
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 897
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane()Z
a=0;// 
a=0;//     .line 898
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public smoothSlideOpen()V
a=0;//     .locals 0
a=0;//     .annotation runtime Ljava/lang/Deprecated;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 879
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->openPane()Z
a=0;// 
a=0;//     .line 880
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method smoothSlideTo(FI)Z
a=0;//     .locals 9
a=0;//     .param p1, "slideOffset"    # F
a=0;//     .param p2, "velocity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1048
a=0;//     #v5=(Null);
a=0;//     iget-boolean v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 1071
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v7=(Conflicted);v8=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 1053
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1054
a=0;//     .local v1, "isLayoutRtl":Z
a=0;//     #v1=(Boolean);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1057
a=0;//     .local v2, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 1058
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int v3, v6, v7
a=0;// 
a=0;//     .line 1059
a=0;//     .local v3, "startBound":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1060
a=0;//     .local v0, "childWidth":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     int-to-float v6, v6
a=0;// 
a=0;//     #v6=(Float);
a=0;//     int-to-float v7, v3
a=0;// 
a=0;//     #v7=(Float);
a=0;//     iget v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     mul-float/2addr v8, p1
a=0;// 
a=0;//     add-float/2addr v7, v8
a=0;// 
a=0;//     int-to-float v8, v0
a=0;// 
a=0;//     add-float/2addr v7, v8
a=0;// 
a=0;//     sub-float/2addr v6, v7
a=0;// 
a=0;//     float-to-int v4, v6
a=0;// 
a=0;//     .line 1066
a=0;//     .end local v0    # "childWidth":I
a=0;//     .local v4, "x":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Integer);v8=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     iget-object v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v7, v4, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 1067
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->setAllChildrenVisible()V
a=0;// 
a=0;//     .line 1068
a=0;//     invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1069
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1062
a=0;//     .end local v3    # "startBound":I
a=0;//     .end local v4    # "x":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Reference,Landroid/view/View;);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     iget v7, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     add-int v3, v6, v7
a=0;// 
a=0;//     .line 1063
a=0;//     .restart local v3    # "startBound":I
a=0;//     #v3=(Integer);
a=0;//     int-to-float v6, v3
a=0;// 
a=0;//     #v6=(Float);
a=0;//     iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I
a=0;// 
a=0;//     int-to-float v7, v7
a=0;// 
a=0;//     #v7=(Float);
a=0;//     mul-float/2addr v7, p1
a=0;// 
a=0;//     add-float/2addr v6, v7
a=0;// 
a=0;//     float-to-int v4, v6
a=0;// 
a=0;//     .restart local v4    # "x":I
a=0;//     #v4=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method updateObscuredViewsVisibility(Landroid/view/View;)V
a=0;//     .locals 21
a=0;//     .param p1, "panel"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 353
a=0;//     invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 354
a=0;//     .local v12, "isLayoutRtl":Z
a=0;//     #v12=(Boolean);
a=0;//     if-eqz v12, :cond_1
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     sub-int v15, v19, v20
a=0;// 
a=0;//     .line 356
a=0;//     .local v15, "startBound":I
a=0;//     :goto_0
a=0;//     #v15=(Integer);v19=(Conflicted);v20=(Conflicted);
a=0;//     if-eqz v12, :cond_2
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 358
a=0;//     .local v10, "endBound":I
a=0;//     :goto_1
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 359
a=0;//     .local v17, "topBound":I
a=0;//     #v17=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getHeight()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     sub-int v3, v19, v20
a=0;// 
a=0;//     .line 364
a=0;//     .local v3, "bottomBound":I
a=0;//     #v3=(Integer);
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     invoke-static/range {p1 .. p1}, Landroid/support/v4/widget/SlidingPaneLayout;->viewIsOpaque(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Boolean);
a=0;//     if-eqz v19, :cond_3
a=0;// 
a=0;//     .line 365
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 366
a=0;//     .local v13, "left":I
a=0;//     #v13=(Integer);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 367
a=0;//     .local v14, "right":I
a=0;//     #v14=(Integer);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 368
a=0;//     .local v16, "top":I
a=0;//     #v16=(Integer);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 373
a=0;//     .local v2, "bottom":I
a=0;//     :goto_2
a=0;//     #v2=(Integer);v19=(Integer);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .local v11, "i":I
a=0;//     #v11=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .local v5, "childCount":I
a=0;//     :goto_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Integer);v18=(Conflicted);
a=0;//     if-ge v11, v5, :cond_0
a=0;// 
a=0;//     .line 374
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0, v11}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 376
a=0;//     .local v4, "child":Landroid/view/View;
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     if-ne v4, v0, :cond_4
a=0;// 
a=0;//     .line 396
a=0;//     .end local v4    # "child":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 354
a=0;//     .end local v2    # "bottom":I
a=0;//     .end local v3    # "bottomBound":I
a=0;//     .end local v5    # "childCount":I
a=0;//     .end local v10    # "endBound":I
a=0;//     .end local v11    # "i":I
a=0;//     .end local v13    # "left":I
a=0;//     .end local v14    # "right":I
a=0;//     .end local v15    # "startBound":I
a=0;//     .end local v16    # "top":I
a=0;//     .end local v17    # "topBound":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 356
a=0;//     .restart local v15    # "startBound":I
a=0;//     :cond_2
a=0;//     #v19=(Conflicted);v20=(Conflicted);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     #v20=(Integer);
a=0;//     sub-int v10, v19, v20
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 370
a=0;//     .restart local v3    # "bottomBound":I
a=0;//     .restart local v10    # "endBound":I
a=0;//     .restart local v17    # "topBound":I
a=0;//     :cond_3
a=0;//     #v3=(Integer);v17=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .restart local v2    # "bottom":I
a=0;//     #v2=(Null);
a=0;//     move/from16 v16, v2
a=0;// 
a=0;//     .restart local v16    # "top":I
a=0;//     #v16=(Null);
a=0;//     move v14, v2
a=0;// 
a=0;//     .restart local v14    # "right":I
a=0;//     #v14=(Null);
a=0;//     move v13, v2
a=0;// 
a=0;//     .restart local v13    # "left":I
a=0;//     #v13=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 381
a=0;//     .restart local v4    # "child":Landroid/view/View;
a=0;//     .restart local v5    # "childCount":I
a=0;//     .restart local v11    # "i":I
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v2=(Integer);v4=(Reference,Landroid/view/View;);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Integer);v13=(Integer);v14=(Integer);v16=(Integer);v18=(Conflicted);
a=0;//     if-eqz v12, :cond_5
a=0;// 
a=0;//     move/from16 v19, v10
a=0;// 
a=0;//     :goto_4
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     invoke-static/range {v19 .. v20}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 383
a=0;//     .local v7, "clampedChildLeft":I
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v19
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 384
a=0;//     .local v9, "clampedChildTop":I
a=0;//     #v9=(Integer);
a=0;//     if-eqz v12, :cond_6
a=0;// 
a=0;//     move/from16 v19, v15
a=0;// 
a=0;//     :goto_5
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getRight()I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     invoke-static/range {v19 .. v20}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 386
a=0;//     .local v8, "clampedChildRight":I
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 388
a=0;//     .local v6, "clampedChildBottom":I
a=0;//     #v6=(Integer);
a=0;//     if-lt v7, v13, :cond_7
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     if-lt v9, v0, :cond_7
a=0;// 
a=0;//     if-gt v8, v14, :cond_7
a=0;// 
a=0;//     if-gt v6, v2, :cond_7
a=0;// 
a=0;//     .line 390
a=0;//     const/16 v18, 0x4
a=0;// 
a=0;//     .line 394
a=0;//     .local v18, "vis":I
a=0;//     :goto_6
a=0;//     #v18=(PosByte);
a=0;//     move/from16 v0, v18
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 373
a=0;//     add-int/lit8 v11, v11, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .end local v6    # "clampedChildBottom":I
a=0;//     .end local v7    # "clampedChildLeft":I
a=0;//     .end local v8    # "clampedChildRight":I
a=0;//     .end local v9    # "clampedChildTop":I
a=0;//     .end local v18    # "vis":I
a=0;//     :cond_5
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v18=(Conflicted);
a=0;//     move/from16 v19, v15
a=0;// 
a=0;//     .line 381
a=0;//     goto :goto_4
a=0;// 
a=0;//     .restart local v7    # "clampedChildLeft":I
a=0;//     .restart local v9    # "clampedChildTop":I
a=0;//     :cond_6
a=0;//     #v0=(Integer);v1=(Integer);v7=(Integer);v9=(Integer);
a=0;//     move/from16 v19, v10
a=0;// 
a=0;//     .line 384
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 392
a=0;//     .restart local v6    # "clampedChildBottom":I
a=0;//     .restart local v8    # "clampedChildRight":I
a=0;//     :cond_7
a=0;//     #v6=(Integer);v8=(Integer);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     .restart local v18    # "vis":I
a=0;//     #v18=(Null);
a=0;//     goto :goto_6
a=0;// .end method
}}
