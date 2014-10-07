package android.support.v4.widget; class SlidingPaneLayout {/*

.class public Landroid/support/v4/widget/SlidingPaneLayout;
.super Landroid/view/ViewGroup;
.source "SlidingPaneLayout.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/widget/SlidingPaneLayout$1;,
        Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;,
        Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;,
        Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;,
        Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;,
        Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;,
        Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;,
        Landroid/support/v4/widget/SlidingPaneLayout$SavedState;,
        Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;,
        Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;,
        Landroid/support/v4/widget/SlidingPaneLayout$SimplePanelSlideListener;,
        Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_FADE_COLOR:I = -0x33333334

.field private static final DEFAULT_OVERHANG_SIZE:I = 0x20

.field static final IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl; = null

.field private static final MIN_FLING_VELOCITY:I = 0x190

.field private static final TAG:Ljava/lang/String; = "SlidingPaneLayout"


# instance fields
.field private mCanSlide:Z

.field private mCoveredFadeColor:I

.field private final mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

.field private mFirstLayout:Z

.field private mInitialMotionX:F

.field private mInitialMotionY:F

.field private mIsUnableToDrag:Z

.field private final mOverhangSize:I

.field private mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;

.field private mParallaxBy:I

.field private mParallaxOffset:F

.field private final mPostedRunnables:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;",
            ">;"
        }
    .end annotation
.end field

.field private mPreservedOpenState:Z

.field private mShadowDrawableLeft:Landroid/graphics/drawable/Drawable;

.field private mShadowDrawableRight:Landroid/graphics/drawable/Drawable;

.field private mSlideOffset:F

.field private mSlideRange:I

.field private mSlideableView:Landroid/view/View;

.field private mSliderFadeColor:I

.field private final mTmpRect:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 198
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 199
    .local v0, deviceVersion:I
    #v0=(Integer);
    const/16 v1, 0x11

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 200
    new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJBMR1;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;

    .line 206
    :goto_0
    return-void

    .line 201
    :cond_0
    #v1=(PosByte);
    const/16 v1, 0x10

    if-lt v0, v1, :cond_1

    .line 202
    new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplJB;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;

    goto :goto_0

    .line 204
    :cond_1
    #v1=(PosByte);
    new-instance v1, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImplBase;-><init>()V

    #v1=(Reference);
    sput-object v1, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 250
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v4/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 251
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 254
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v4/widget/SlidingPaneLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 255
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    const/4 v3, 0x1

    #v3=(One);
    const/high16 v4, 0x3f00

    .line 258
    #v4=(Integer);
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 108
    #p0=(Reference);
    const v2, -0x33333334

    #v2=(Integer);
    iput v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I

    .line 188
    iput-boolean v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z

    .line 190
    new-instance v2, Landroid/graphics/Rect;

    #v2=(UninitRef);
    invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;

    .line 192
    new-instance v2, Ljava/util/ArrayList;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;

    .line 260
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v0, v2, Landroid/util/DisplayMetrics;->density:F

    .line 261
    .local v0, density:F
    #v0=(Integer);
    const/high16 v2, 0x4200

    #v2=(Integer);
    mul-float/2addr v2, v0

    #v2=(Float);
    add-float/2addr v2, v4

    float-to-int v2, v2

    #v2=(Integer);
    iput v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mOverhangSize:I

    .line 263
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    .line 265
    .local v1, viewConfig:Landroid/view/ViewConfiguration;
    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {p0, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->setWillNotDraw(Z)V

    .line 267
    new-instance v2, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/widget/SlidingPaneLayout$AccessibilityDelegate;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;)V

    #v2=(Reference);
    invoke-static {p0, v2}, Landroid/support/v4/view/ViewCompat;->setAccessibilityDelegate(Landroid/view/View;Landroid/support/v4/view/AccessibilityDelegateCompat;)V

    .line 268
    invoke-static {p0, v3}, Landroid/support/v4/view/ViewCompat;->setImportantForAccessibility(Landroid/view/View;I)V

    .line 270
    new-instance v2, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;

    #v2=(UninitRef);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-direct {v2, p0, v3}, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/support/v4/widget/SlidingPaneLayout$1;)V

    #v2=(Reference);
    invoke-static {p0, v4, v2}, Landroid/support/v4/widget/ViewDragHelper;->create(Landroid/view/ViewGroup;FLandroid/support/v4/widget/ViewDragHelper$Callback;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v2

    iput-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    .line 271
    iget-object v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    const/high16 v3, 0x43c8

    #v3=(Integer);
    mul-float/2addr v3, v0

    #v3=(Float);
    invoke-virtual {v2, v3}, Landroid/support/v4/widget/ViewDragHelper;->setMinVelocity(F)V

    .line 272
    return-void
.end method

.method static synthetic access$100(Landroid/support/v4/widget/SlidingPaneLayout;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 89
    iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$1000(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 89
    invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidateChildRegion(Landroid/view/View;)V

    return-void
.end method

.method static synthetic access$1100(Landroid/support/v4/widget/SlidingPaneLayout;)Ljava/util/ArrayList;
    .locals 1
    .parameter "x0"

    .prologue
    .line 89
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
    .locals 1
    .parameter "x0"

    .prologue
    .line 89
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
    .locals 1
    .parameter "x0"

    .prologue
    .line 89
    iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
    .locals 1
    .parameter "x0"

    .prologue
    .line 89
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 89
    iput-boolean p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z

    return p1
.end method

.method static synthetic access$600(Landroid/support/v4/widget/SlidingPaneLayout;I)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 89
    invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->onPanelDragged(I)V

    return-void
.end method

.method static synthetic access$700(Landroid/support/v4/widget/SlidingPaneLayout;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 89
    invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 89
    iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I

    #v0=(Integer);
    return v0
.end method

.method private closePane(Landroid/view/View;I)Z
    .locals 2
    .parameter "pane"
    .parameter "initialVelocity"

    .prologue
    const/4 v0, 0x0

    .line 859
    #v0=(Null);
    iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0, v1, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->smoothSlideTo(FI)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 860
    :cond_0
    iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z

    .line 861
    const/4 v0, 0x1

    .line 863
    :cond_1
    #v0=(Boolean);
    return v0
.end method

.method private dimChildView(Landroid/view/View;FI)V
    .locals 9
    .parameter "v"
    .parameter "mag"
    .parameter "fadeColor"

    .prologue
    const/4 v8, 0x2

    .line 968
    #v8=(PosByte);
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 970
    .local v4, lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    const/4 v5, 0x0

    #v5=(Null);
    cmpl-float v5, p2, v5

    #v5=(Byte);
    if-lez v5, :cond_3

    if-eqz p3, :cond_3

    .line 971
    const/high16 v5, -0x100

    #v5=(Integer);
    and-int/2addr v5, p3

    ushr-int/lit8 v0, v5, 0x18

    .line 972
    .local v0, baseAlpha:I
    #v0=(Char);
    int-to-float v5, v0

    #v5=(Float);
    mul-float/2addr v5, p2

    float-to-int v3, v5

    .line 973
    .local v3, imag:I
    #v3=(Integer);
    shl-int/lit8 v5, v3, 0x18

    #v5=(Integer);
    const v6, 0xffffff

    #v6=(Integer);
    and-int/2addr v6, p3

    or-int v1, v5, v6

    .line 974
    .local v1, color:I
    #v1=(Integer);
    iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;

    #v5=(Reference);
    if-nez v5, :cond_0

    .line 975
    new-instance v5, Landroid/graphics/Paint;

    #v5=(UninitRef);
    invoke-direct {v5}, Landroid/graphics/Paint;-><init>()V

    #v5=(Reference);
    iput-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;

    .line 977
    :cond_0
    iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;

    new-instance v6, Landroid/graphics/PorterDuffColorFilter;

    #v6=(UninitRef);
    sget-object v7, Landroid/graphics/PorterDuff$Mode;->SRC_OVER:Landroid/graphics/PorterDuff$Mode;

    #v7=(Reference);
    invoke-direct {v6, v1, v7}, Landroid/graphics/PorterDuffColorFilter;-><init>(ILandroid/graphics/PorterDuff$Mode;)V

    #v6=(Reference);
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 978
    invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayerType(Landroid/view/View;)I

    move-result v5

    #v5=(Integer);
    if-eq v5, v8, :cond_1

    .line 979
    iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;

    #v5=(Reference);
    invoke-static {p1, v8, v5}, Landroid/support/v4/view/ViewCompat;->setLayerType(Landroid/view/View;ILandroid/graphics/Paint;)V

    .line 981
    :cond_1
    #v5=(Conflicted);
    invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidateChildRegion(Landroid/view/View;)V

    .line 990
    .end local v0           #baseAlpha:I
    .end local v1           #color:I
    .end local v3           #imag:I
    :cond_2
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    .line 982
    :cond_3
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Byte);v6=(Uninit);v7=(Uninit);
    invoke-static {p1}, Landroid/support/v4/view/ViewCompat;->getLayerType(Landroid/view/View;)I

    move-result v5

    #v5=(Integer);
    if-eqz v5, :cond_2

    .line 983
    iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;

    #v5=(Reference);
    if-eqz v5, :cond_4

    .line 984
    iget-object v5, v4, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;

    const/4 v6, 0x0

    #v6=(Null);
    invoke-virtual {v5, v6}, Landroid/graphics/Paint;->setColorFilter(Landroid/graphics/ColorFilter;)Landroid/graphics/ColorFilter;

    .line 986
    :cond_4
    #v6=(Conflicted);
    new-instance v2, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;

    #v2=(UninitRef);
    invoke-direct {v2, p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V

    .line 987
    .local v2, dlr:Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
    #v2=(Reference);
    iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 988
    invoke-static {p0, v2}, Landroid/support/v4/view/ViewCompat;->postOnAnimation(Landroid/view/View;Ljava/lang/Runnable;)V

    goto :goto_0
.end method

.method private invalidateChildRegion(Landroid/view/View;)V
    .locals 1
    .parameter "v"

    .prologue
    .line 1038
    sget-object v0, Landroid/support/v4/widget/SlidingPaneLayout;->IMPL:Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;

    #v0=(Reference);
    invoke-interface {v0, p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$SlidingPanelLayoutImpl;->invalidateChildRegion(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/view/View;)V

    .line 1039
    return-void
.end method

.method private isLayoutRtlSupport()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1642
    #v0=(One);
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v1

    #v1=(Integer);
    if-ne v1, v0, :cond_0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private onPanelDragged(I)V
    .locals 10
    .parameter "newLeft"

    .prologue
    .line 940
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v7=(Reference);
    if-nez v7, :cond_0

    .line 942
    const/4 v7, 0x0

    #v7=(Null);
    iput v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    .line 965
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Reference);v8=(Conflicted);v9=(Conflicted);
    return-void

    .line 945
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);
    invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v1

    .line 946
    .local v1, isLayoutRtl:Z
    #v1=(Boolean);
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 948
    .local v2, lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    invoke-virtual {v7}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 949
    .local v0, childWidth:I
    #v0=(Integer);
    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I

    move-result v7

    #v7=(Integer);
    sub-int/2addr v7, p1

    sub-int v4, v7, v0

    .line 951
    .local v4, newStart:I
    :goto_1
    #v4=(Integer);v7=(Conflicted);
    if-eqz v1, :cond_4

    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I

    move-result v5

    .line 952
    .local v5, paddingStart:I
    :goto_2
    #v5=(Integer);
    if-eqz v1, :cond_5

    iget v3, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I

    .line 953
    .local v3, lpMargin:I
    :goto_3
    #v3=(Integer);
    add-int v6, v5, v3

    .line 955
    .local v6, startBound:I
    #v6=(Integer);
    sub-int v7, v4, v6

    #v7=(Integer);
    int-to-float v7, v7

    #v7=(Float);
    iget v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I

    #v8=(Integer);
    int-to-float v8, v8

    #v8=(Float);
    div-float/2addr v7, v8

    iput v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    .line 957
    iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I

    #v7=(Integer);
    if-eqz v7, :cond_1

    .line 958
    iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    invoke-direct {p0, v7}, Landroid/support/v4/widget/SlidingPaneLayout;->parallaxOtherViews(F)V

    .line 961
    :cond_1
    iget-boolean v7, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z

    #v7=(Boolean);
    if-eqz v7, :cond_2

    .line 962
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v7=(Reference);
    iget v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v8=(Integer);
    iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I

    #v9=(Integer);
    invoke-direct {p0, v7, v8, v9}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V

    .line 964
    :cond_2
    #v7=(Conflicted);v9=(Conflicted);
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v7=(Reference);
    invoke-virtual {p0, v7}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelSlide(Landroid/view/View;)V

    goto :goto_0

    .end local v3           #lpMargin:I
    .end local v4           #newStart:I
    .end local v5           #paddingStart:I
    .end local v6           #startBound:I
    :cond_3
    #v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);
    move v4, p1

    .line 949
    #v4=(Integer);
    goto :goto_1

    .line 951
    .restart local v4       #newStart:I
    :cond_4
    #v7=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I

    move-result v5

    #v5=(Integer);
    goto :goto_2

    .line 952
    .restart local v5       #paddingStart:I
    :cond_5
    iget v3, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I

    #v3=(Integer);
    goto :goto_3
.end method

.method private openPane(Landroid/view/View;I)Z
    .locals 2
    .parameter "pane"
    .parameter "initialVelocity"

    .prologue
    const/4 v0, 0x1

    .line 867
    #v0=(One);
    iget-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    const/high16 v1, 0x3f80

    #v1=(Integer);
    invoke-virtual {p0, v1, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->smoothSlideTo(FI)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 868
    :cond_0
    iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z

    .line 871
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private parallaxOtherViews(F)V
    .locals 12
    .parameter "slideOffset"

    .prologue
    const/high16 v11, 0x3f80

    .line 1186
    #v11=(Integer);
    invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v4

    .line 1187
    .local v4, isLayoutRtl:Z
    #v4=(Boolean);
    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 1188
    .local v7, slideLp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    iget-boolean v9, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z

    #v9=(Boolean);
    if-eqz v9, :cond_2

    if-eqz v4, :cond_1

    iget v9, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I

    :goto_0
    #v9=(Integer);
    if-gtz v9, :cond_2

    const/4 v1, 0x1

    .line 1190
    .local v1, dimViews:Z
    :goto_1
    #v1=(Boolean);
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I

    move-result v0

    .line 1191
    .local v0, childCount:I
    #v0=(Integer);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_2
    #v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    if-ge v3, v0, :cond_6

    .line 1192
    invoke-virtual {p0, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 1193
    .local v8, v:Landroid/view/View;
    #v8=(Reference);
    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v9=(Reference);
    if-ne v8, v9, :cond_3

    .line 1191
    :cond_0
    :goto_3
    #v9=(Conflicted);
    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    .line 1188
    .end local v0           #childCount:I
    .end local v1           #dimViews:Z
    .end local v3           #i:I
    .end local v8           #v:Landroid/view/View;
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Boolean);v10=(Uninit);
    iget v9, v7, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I

    #v9=(Integer);
    goto :goto_0

    :cond_2
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_1

    .line 1195
    .restart local v0       #childCount:I
    .restart local v1       #dimViews:Z
    .restart local v3       #i:I
    .restart local v8       #v:Landroid/view/View;
    :cond_3
    #v0=(Integer);v1=(Boolean);v2=(Conflicted);v3=(Integer);v5=(Conflicted);v6=(Conflicted);v8=(Reference);v9=(Reference);v10=(Conflicted);
    iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F

    #v9=(Integer);
    sub-float v9, v11, v9

    #v9=(Float);
    iget v10, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I

    #v10=(Integer);
    int-to-float v10, v10

    #v10=(Float);
    mul-float/2addr v9, v10

    float-to-int v6, v9

    .line 1196
    .local v6, oldOffset:I
    #v6=(Integer);
    iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F

    .line 1197
    sub-float v9, v11, p1

    iget v10, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I

    #v10=(Integer);
    int-to-float v10, v10

    #v10=(Float);
    mul-float/2addr v9, v10

    float-to-int v5, v9

    .line 1198
    .local v5, newOffset:I
    #v5=(Integer);
    sub-int v2, v6, v5

    .line 1200
    .local v2, dx:I
    #v2=(Integer);
    if-eqz v4, :cond_4

    neg-int v2, v2

    .end local v2           #dx:I
    :cond_4
    invoke-virtual {v8, v2}, Landroid/view/View;->offsetLeftAndRight(I)V

    .line 1202
    if-eqz v1, :cond_0

    .line 1203
    if-eqz v4, :cond_5

    iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F

    #v9=(Integer);
    sub-float/2addr v9, v11

    :goto_4
    #v9=(Float);
    iget v10, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCoveredFadeColor:I

    #v10=(Integer);
    invoke-direct {p0, v8, v9, v10}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V

    goto :goto_3

    :cond_5
    #v10=(Float);
    iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxOffset:F

    #v9=(Integer);
    sub-float v9, v11, v9

    #v9=(Float);
    goto :goto_4

    .line 1207
    .end local v5           #newOffset:I
    .end local v6           #oldOffset:I
    .end local v8           #v:Landroid/view/View;
    :cond_6
    #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-void
.end method

.method private static viewIsOpaque(Landroid/view/View;)Z
    .locals 5
    .parameter "v"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 408
    #v2=(Null);
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->isOpaque(Landroid/view/View;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    .line 419
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v3=(Integer);v4=(Conflicted);
    return v1

    .line 413
    :cond_1
    #v0=(Uninit);v1=(One);v3=(Boolean);v4=(Uninit);
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    #v3=(Integer);
    const/16 v4, 0x12

    #v4=(PosByte);
    if-lt v3, v4, :cond_2

    move v1, v2

    #v1=(Null);
    goto :goto_0

    .line 415
    :cond_2
    #v1=(One);
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 416
    .local v0, bg:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-eqz v0, :cond_3

    .line 417
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getOpacity()I

    move-result v3

    const/4 v4, -0x1

    #v4=(Byte);
    if-eq v3, v4, :cond_0

    move v1, v2

    #v1=(Null);
    goto :goto_0

    :cond_3
    #v1=(One);v4=(PosByte);
    move v1, v2

    .line 419
    #v1=(Null);
    goto :goto_0
.end method


# virtual methods
.method protected canScroll(Landroid/view/View;ZIII)Z
    .locals 11
    .parameter "v"
    .parameter "checkV"
    .parameter "dx"
    .parameter "x"
    .parameter "y"

    .prologue
    .line 1221
    instance-of v0, p1, Landroid/view/ViewGroup;

    #v0=(Boolean);
    if-eqz v0, :cond_1

    move-object v7, p1

    .line 1222
    #v7=(Reference);
    check-cast v7, Landroid/view/ViewGroup;

    .line 1223
    .local v7, group:Landroid/view/ViewGroup;
    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v9

    .line 1224
    .local v9, scrollX:I
    #v9=(Integer);
    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v10

    .line 1225
    .local v10, scrollY:I
    #v10=(Integer);
    invoke-virtual {v7}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v6

    .line 1227
    .local v6, count:I
    #v6=(Integer);
    add-int/lit8 v8, v6, -0x1

    .local v8, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);
    if-ltz v8, :cond_1

    .line 1230
    invoke-virtual {v7, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 1231
    .local v1, child:Landroid/view/View;
    #v1=(Reference);
    add-int v0, p4, v9

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v2

    #v2=(Integer);
    if-lt v0, v2, :cond_0

    add-int v0, p4, v9

    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    move-result v2

    if-ge v0, v2, :cond_0

    add-int v0, p5, v10

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v2

    if-lt v0, v2, :cond_0

    add-int v0, p5, v10

    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    move-result v2

    if-ge v0, v2, :cond_0

    const/4 v2, 0x1

    #v2=(One);
    add-int v0, p4, v9

    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    move-result v3

    #v3=(Integer);
    sub-int v4, v0, v3

    #v4=(Integer);
    add-int v0, p5, v10

    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v3

    sub-int v5, v0, v3

    #v5=(Integer);
    move-object v0, p0

    #v0=(Reference);
    move v3, p3

    invoke-virtual/range {v0 .. v5}, Landroid/support/v4/widget/SlidingPaneLayout;->canScroll(Landroid/view/View;ZIII)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1235
    const/4 v0, 0x1

    .line 1240
    .end local v1           #child:Landroid/view/View;
    .end local v6           #count:I
    .end local v7           #group:Landroid/view/ViewGroup;
    .end local v8           #i:I
    .end local v9           #scrollX:I
    .end local v10           #scrollY:I
    .end local p3
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return v0

    .line 1227
    .restart local v1       #child:Landroid/view/View;
    .restart local v6       #count:I
    .restart local v7       #group:Landroid/view/ViewGroup;
    .restart local v8       #i:I
    .restart local v9       #scrollX:I
    .restart local v10       #scrollY:I
    .restart local p3
    :cond_0
    #v0=(Integer);v1=(Reference);v2=(Integer);v6=(Integer);v7=(Reference);v8=(Integer);v9=(Integer);v10=(Integer);
    add-int/lit8 v8, v8, -0x1

    goto :goto_0

    .line 1240
    .end local v1           #child:Landroid/view/View;
    .end local v6           #count:I
    .end local v7           #group:Landroid/view/ViewGroup;
    .end local v8           #i:I
    .end local v9           #scrollX:I
    .end local v10           #scrollY:I
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    if-eqz p2, :cond_3

    invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_2

    .end local p3
    :goto_2
    invoke-static {p1, p3}, Landroid/support/v4/view/ViewCompat;->canScrollHorizontally(Landroid/view/View;I)Z

    move-result v0

    if-eqz v0, :cond_3

    const/4 v0, 0x1

    #v0=(One);
    goto :goto_1

    .restart local p3
    :cond_2
    #v0=(Boolean);
    neg-int p3, p3

    goto :goto_2

    .end local p3
    :cond_3
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_1
.end method

.method public canSlide()Z
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 926
    iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v0=(Boolean);
    return v0
.end method

.method protected checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1
    .parameter "p"

    .prologue
    .line 1265
    instance-of v0, p1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public closePane()Z
    .locals 2

    .prologue
    .line 907
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane(Landroid/view/View;I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public computeScroll()V
    .locals 2

    .prologue
    .line 1076
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v4/widget/ViewDragHelper;->continueSettling(Z)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1077
    iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    if-nez v0, :cond_1

    .line 1078
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->abort()V

    .line 1084
    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 1082
    :cond_1
    #v0=(Boolean);
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    goto :goto_0
.end method

.method dispatchOnPanelClosed(Landroid/view/View;)V
    .locals 1
    .parameter "panel"

    .prologue
    .line 346
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 347
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;

    invoke-interface {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;->onPanelClosed(Landroid/view/View;)V

    .line 349
    :cond_0
    const/16 v0, 0x20

    #v0=(PosByte);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->sendAccessibilityEvent(I)V

    .line 350
    return-void
.end method

.method dispatchOnPanelOpened(Landroid/view/View;)V
    .locals 1
    .parameter "panel"

    .prologue
    .line 339
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 340
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;

    invoke-interface {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;->onPanelOpened(Landroid/view/View;)V

    .line 342
    :cond_0
    const/16 v0, 0x20

    #v0=(PosByte);
    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->sendAccessibilityEvent(I)V

    .line 343
    return-void
.end method

.method dispatchOnPanelSlide(Landroid/view/View;)V
    .locals 2
    .parameter "panel"

    .prologue
    .line 333
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 334
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;

    iget v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v1=(Integer);
    invoke-interface {v0, p1, v1}, Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;->onPanelSlide(Landroid/view/View;F)V

    .line 336
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 10
    .parameter "c"

    .prologue
    const/4 v9, 0x1

    .line 1152
    #v9=(One);
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 1153
    invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v1

    .line 1155
    .local v1, isLayoutRtl:Z
    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 1156
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawableRight:Landroid/graphics/drawable/Drawable;

    .line 1161
    .local v4, shadowDrawable:Landroid/graphics/drawable/Drawable;
    :goto_0
    #v4=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I

    move-result v8

    #v8=(Integer);
    if-le v8, v9, :cond_2

    invoke-virtual {p0, v9}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 1162
    .local v5, shadowView:Landroid/view/View;
    :goto_1
    #v5=(Reference);
    if-eqz v5, :cond_0

    if-nez v4, :cond_3

    .line 1183
    :cond_0
    :goto_2
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    .line 1158
    .end local v4           #shadowDrawable:Landroid/graphics/drawable/Drawable;
    .end local v5           #shadowView:Landroid/view/View;
    :cond_1
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawableLeft:Landroid/graphics/drawable/Drawable;

    .restart local v4       #shadowDrawable:Landroid/graphics/drawable/Drawable;
    #v4=(Reference);
    goto :goto_0

    .line 1161
    :cond_2
    #v8=(Integer);
    const/4 v5, 0x0

    #v5=(Null);
    goto :goto_1

    .line 1167
    .restart local v5       #shadowView:Landroid/view/View;
    :cond_3
    #v5=(Reference);
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    move-result v7

    .line 1168
    .local v7, top:I
    #v7=(Integer);
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v0

    .line 1170
    .local v0, bottom:I
    #v0=(Integer);
    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v6

    .line 1173
    .local v6, shadowWidth:I
    #v6=(Integer);
    invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_4

    .line 1174
    invoke-virtual {v5}, Landroid/view/View;->getRight()I

    move-result v2

    .line 1175
    .local v2, left:I
    #v2=(Integer);
    add-int v3, v2, v6

    .line 1181
    .local v3, right:I
    :goto_3
    #v3=(Integer);
    invoke-virtual {v4, v2, v7, v3, v0}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 1182
    invoke-virtual {v4, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_2

    .line 1177
    .end local v2           #left:I
    .end local v3           #right:I
    :cond_4
    #v2=(Uninit);v3=(Uninit);
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    move-result v3

    .line 1178
    .restart local v3       #right:I
    #v3=(Integer);
    sub-int v2, v3, v6

    .restart local v2       #left:I
    #v2=(Integer);
    goto :goto_3
.end method

.method protected drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 7
    .parameter "canvas"
    .parameter "child"
    .parameter "drawingTime"

    .prologue
    .line 994
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 996
    .local v1, lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    const/4 v4, 0x2

    #v4=(PosByte);
    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->save(I)I

    move-result v3

    .line 998
    .local v3, save:I
    #v3=(Integer);
    iget-boolean v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v4=(Boolean);
    if-eqz v4, :cond_0

    iget-boolean v4, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z

    if-nez v4, :cond_0

    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v4=(Reference);
    if-eqz v4, :cond_0

    .line 1000
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->getClipBounds(Landroid/graphics/Rect;)Z

    .line 1001
    invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 1002
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;

    #v5=(Reference);
    iget v5, v5, Landroid/graphics/Rect;->left:I

    #v5=(Integer);
    iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/view/View;->getRight()I

    move-result v6

    #v6=(Integer);
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    iput v5, v4, Landroid/graphics/Rect;->left:I

    .line 1006
    :goto_0
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;

    invoke-virtual {p1, v4}, Landroid/graphics/Canvas;->clipRect(Landroid/graphics/Rect;)Z

    .line 1009
    :cond_0
    #v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    #v4=(Integer);
    const/16 v5, 0xb

    #v5=(PosByte);
    if-lt v4, v5, :cond_2

    .line 1010
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v2

    .line 1032
    .local v2, result:Z
    :goto_1
    #v0=(Conflicted);v2=(Boolean);v4=(Conflicted);v5=(Conflicted);
    invoke-virtual {p1, v3}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 1034
    return v2

    .line 1004
    .end local v2           #result:Z
    :cond_1
    #v0=(Uninit);v2=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mTmpRect:Landroid/graphics/Rect;

    #v5=(Reference);
    iget v5, v5, Landroid/graphics/Rect;->right:I

    #v5=(Integer);
    iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/view/View;->getLeft()I

    move-result v6

    #v6=(Integer);
    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v5

    iput v5, v4, Landroid/graphics/Rect;->right:I

    goto :goto_0

    .line 1012
    :cond_2
    #v4=(Integer);v5=(PosByte);v6=(Conflicted);
    iget-boolean v4, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z

    #v4=(Boolean);
    if-eqz v4, :cond_5

    iget v4, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v4=(Integer);
    const/4 v5, 0x0

    #v5=(Null);
    cmpl-float v4, v4, v5

    #v4=(Byte);
    if-lez v4, :cond_5

    .line 1013
    invoke-virtual {p2}, Landroid/view/View;->isDrawingCacheEnabled()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_3

    .line 1014
    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {p2, v4}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 1016
    :cond_3
    #v4=(Boolean);
    invoke-virtual {p2}, Landroid/view/View;->getDrawingCache()Landroid/graphics/Bitmap;

    move-result-object v0

    .line 1017
    .local v0, cache:Landroid/graphics/Bitmap;
    #v0=(Reference);
    if-eqz v0, :cond_4

    .line 1018
    invoke-virtual {p2}, Landroid/view/View;->getLeft()I

    move-result v4

    #v4=(Integer);
    int-to-float v4, v4

    #v4=(Float);
    invoke-virtual {p2}, Landroid/view/View;->getTop()I

    move-result v5

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    iget-object v6, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimPaint:Landroid/graphics/Paint;

    #v6=(Reference);
    invoke-virtual {p1, v0, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 1019
    const/4 v2, 0x0

    .restart local v2       #result:Z
    #v2=(Null);
    goto :goto_1

    .line 1021
    .end local v2           #result:Z
    :cond_4
    #v2=(Uninit);v4=(Boolean);v5=(Null);v6=(Conflicted);
    const-string v4, "SlidingPaneLayout"

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "drawChild: child view "

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, " returned null drawing cache"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 1022
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v2

    .restart local v2       #result:Z
    #v2=(Boolean);
    goto :goto_1

    .line 1025
    .end local v0           #cache:Landroid/graphics/Bitmap;
    .end local v2           #result:Z
    :cond_5
    #v0=(Uninit);v2=(Uninit);v4=(Byte);v5=(PosByte);v6=(Conflicted);
    invoke-virtual {p2}, Landroid/view/View;->isDrawingCacheEnabled()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_6

    .line 1026
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {p2, v4}, Landroid/view/View;->setDrawingCacheEnabled(Z)V

    .line 1028
    :cond_6
    #v4=(Boolean);
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    move-result v2

    .restart local v2       #result:Z
    #v2=(Boolean);
    goto :goto_1
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 1

    .prologue
    .line 1253
    new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>()V

    #v0=(Reference);
    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2
    .parameter "attrs"

    .prologue
    .line 1270
    new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    #v0=(Reference);
    return-object v0
.end method

.method protected generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 1
    .parameter "p"

    .prologue
    .line 1258
    instance-of v0, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    #v0=(UninitRef);
    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    .end local p1
    invoke-direct {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    :goto_0
    #v0=(Reference);
    return-object v0

    .restart local p1
    :cond_0
    #v0=(Boolean);
    new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    #v0=(Reference);
    goto :goto_0
.end method

.method public getCoveredFadeColor()I
    .locals 1

    .prologue
    .line 325
    iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCoveredFadeColor:I

    #v0=(Integer);
    return v0
.end method

.method public getParallaxDistance()I
    .locals 1

    .prologue
    .line 292
    iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I

    #v0=(Integer);
    return v0
.end method

.method public getSliderFadeColor()I
    .locals 1

    .prologue
    .line 308
    iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I

    #v0=(Integer);
    return v0
.end method

.method isDimmed(Landroid/view/View;)Z
    .locals 4
    .parameter "child"

    .prologue
    const/4 v1, 0x0

    .line 1244
    #v1=(Null);
    if-nez p1, :cond_1

    .line 1248
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v1

    .line 1247
    :cond_1
    #v0=(Uninit);v1=(Null);v2=(Uninit);v3=(Uninit);
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 1248
    .local v0, lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    iget-boolean v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    iget-boolean v2, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z

    if-eqz v2, :cond_0

    iget v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v2=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    cmpl-float v2, v2, v3

    #v2=(Byte);
    if-lez v2, :cond_0

    const/4 v1, 0x1

    #v1=(One);
    goto :goto_0
.end method

.method public isOpen()Z
    .locals 2

    .prologue
    .line 917
    iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v0=(Integer);
    const/high16 v1, 0x3f80

    #v1=(Integer);
    cmpl-float v0, v0, v1

    #v0=(Byte);
    if-nez v0, :cond_1

    :cond_0
    #v1=(Conflicted);
    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Byte);v1=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isSlideable()Z
    .locals 1

    .prologue
    .line 936
    iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v0=(Boolean);
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 1

    .prologue
    .line 424
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 425
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z

    .line 426
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 4

    .prologue
    .line 430
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 431
    const/4 v3, 0x1

    #v3=(One);
    iput-boolean v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z

    .line 433
    const/4 v2, 0x0

    .local v2, i:I
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    .local v0, count:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Integer);
    if-ge v2, v0, :cond_0

    .line 434
    iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;

    .line 435
    .local v1, dlr:Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
    invoke-virtual {v1}, Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;->run()V

    .line 433
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 437
    .end local v1           #dlr:Landroid/support/v4/widget/SlidingPaneLayout$DisableLayerRunnable;
    :cond_0
    #v1=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPostedRunnables:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 438
    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 13
    .parameter "ev"

    .prologue
    .line 759
    invoke-static {p1}, Landroid/support/v4/view/MotionEventCompat;->getActionMasked(Landroid/view/MotionEvent;)I

    move-result v0

    .line 762
    .local v0, action:I
    #v0=(Integer);
    iget-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v9=(Boolean);
    if-nez v9, :cond_0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I

    move-result v9

    #v9=(Integer);
    const/4 v10, 0x1

    #v10=(One);
    if-le v9, v10, :cond_0

    .line 764
    const/4 v9, 0x1

    #v9=(One);
    invoke-virtual {p0, v9}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 765
    .local v5, secondChild:Landroid/view/View;
    #v5=(Reference);
    if-eqz v5, :cond_0

    .line 766
    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v9=(Reference);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v10

    #v10=(Float);
    float-to-int v10, v10

    #v10=(Integer);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v11

    #v11=(Float);
    float-to-int v11, v11

    #v11=(Integer);
    invoke-virtual {v9, v5, v10, v11}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z

    move-result v9

    #v9=(Boolean);
    if-nez v9, :cond_2

    const/4 v9, 0x1

    :goto_0
    iput-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z

    .line 771
    .end local v5           #secondChild:Landroid/view/View;
    :cond_0
    #v5=(Conflicted);v9=(Integer);v10=(Conflicted);v11=(Conflicted);
    iget-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v9=(Boolean);
    if-eqz v9, :cond_1

    iget-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z

    if-eqz v9, :cond_3

    if-eqz v0, :cond_3

    .line 772
    :cond_1
    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    .line 773
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v9

    .line 814
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Boolean);v12=(Conflicted);
    return v9

    .line 766
    .restart local v5       #secondChild:Landroid/view/View;
    :cond_2
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Reference);v6=(Uninit);v7=(Uninit);v8=(Uninit);v10=(Integer);v11=(Integer);v12=(Uninit);
    const/4 v9, 0x0

    #v9=(Null);
    goto :goto_0

    .line 776
    .end local v5           #secondChild:Landroid/view/View;
    :cond_3
    #v5=(Conflicted);v9=(Boolean);v10=(Conflicted);v11=(Conflicted);
    const/4 v9, 0x3

    #v9=(PosByte);
    if-eq v0, v9, :cond_4

    const/4 v9, 0x1

    #v9=(One);
    if-ne v0, v9, :cond_5

    .line 777
    :cond_4
    #v9=(PosByte);
    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    .line 778
    const/4 v9, 0x0

    #v9=(Null);
    goto :goto_1

    .line 781
    :cond_5
    #v9=(One);
    const/4 v4, 0x0

    .line 783
    .local v4, interceptTap:Z
    #v4=(Null);
    packed-switch v0, :pswitch_data_0

    .line 812
    :cond_6
    :goto_2
    :pswitch_0
    #v1=(Conflicted);v2=(Conflicted);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Byte);v12=(Conflicted);
    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v9=(Reference);
    invoke-virtual {v9, p1}, Landroid/support/v4/widget/ViewDragHelper;->shouldInterceptTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v3

    .line 814
    .local v3, interceptForDrag:Z
    #v3=(Boolean);
    if-nez v3, :cond_7

    if-eqz v4, :cond_8

    :cond_7
    const/4 v9, 0x1

    #v9=(One);
    goto :goto_1

    .line 785
    .end local v3           #interceptForDrag:Z
    :pswitch_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);v12=(Uninit);
    const/4 v9, 0x0

    #v9=(Null);
    iput-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z

    .line 786
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    .line 787
    .local v7, x:F
    #v7=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v8

    .line 788
    .local v8, y:F
    #v8=(Float);
    iput v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F

    .line 789
    iput v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F

    .line 791
    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v9=(Reference);
    iget-object v10, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v10=(Reference);
    float-to-int v11, v7

    #v11=(Integer);
    float-to-int v12, v8

    #v12=(Integer);
    invoke-virtual {v9, v10, v11, v12}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_6

    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v9=(Reference);
    invoke-virtual {p0, v9}, Landroid/support/v4/widget/SlidingPaneLayout;->isDimmed(Landroid/view/View;)Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_6

    .line 793
    const/4 v4, 0x1

    #v4=(One);
    goto :goto_2

    .line 799
    .end local v7           #x:F
    .end local v8           #y:F
    :pswitch_2
    #v4=(Null);v7=(Uninit);v8=(Uninit);v9=(One);v10=(Conflicted);v11=(Conflicted);v12=(Uninit);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v7

    .line 800
    .restart local v7       #x:F
    #v7=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v8

    .line 801
    .restart local v8       #y:F
    #v8=(Float);
    iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F

    #v9=(Integer);
    sub-float v9, v7, v9

    #v9=(Float);
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v1

    .line 802
    .local v1, adx:F
    #v1=(Float);
    iget v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F

    #v9=(Integer);
    sub-float v9, v8, v9

    #v9=(Float);
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    move-result v2

    .line 803
    .local v2, ady:F
    #v2=(Float);
    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I

    move-result v6

    .line 804
    .local v6, slop:I
    #v6=(Integer);
    int-to-float v9, v6

    #v9=(Float);
    cmpl-float v9, v1, v9

    #v9=(Byte);
    if-lez v9, :cond_6

    cmpl-float v9, v2, v1

    if-lez v9, :cond_6

    .line 805
    iget-object v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v9=(Reference);
    invoke-virtual {v9}, Landroid/support/v4/widget/ViewDragHelper;->cancel()V

    .line 806
    const/4 v9, 0x1

    #v9=(One);
    iput-boolean v9, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mIsUnableToDrag:Z

    .line 807
    const/4 v9, 0x0

    #v9=(Null);
    goto :goto_1

    .line 814
    .end local v1           #adx:F
    .end local v2           #ady:F
    .end local v6           #slop:I
    .end local v7           #x:F
    .end local v8           #y:F
    .restart local v3       #interceptForDrag:Z
    :cond_8
    #v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Boolean);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Reference);v12=(Conflicted);
    const/4 v9, 0x0

    #v9=(Null);
    goto :goto_1

    .line 783
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method protected onLayout(ZIIII)V
    .locals 28
    .parameter "changed"
    .parameter "l"
    .parameter "t"
    .parameter "r"
    .parameter "b"

    .prologue
    .line 654
    invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v12

    .line 655
    .local v12, isLayoutRtl:Z
    #v12=(Boolean);
    if-eqz v12, :cond_1

    .line 656
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    move-object/from16 v25, v0

    #v25=(Reference);
    const/16 v26, 0x2

    #v26=(PosByte);
    invoke-virtual/range {v25 .. v26}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V

    .line 660
    :goto_0
    sub-int v23, p4, p2

    .line 661
    .local v23, width:I
    #v23=(Integer);
    if-eqz v12, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I

    move-result v19

    .line 662
    .local v19, paddingStart:I
    :goto_1
    #v19=(Integer);
    if-eqz v12, :cond_3

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I

    move-result v18

    .line 663
    .local v18, paddingEnd:I
    :goto_2
    #v18=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I

    move-result v20

    .line 665
    .local v20, paddingTop:I
    #v20=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I

    move-result v6

    .line 666
    .local v6, childCount:I
    #v6=(Integer);
    move/from16 v24, v19

    .line 667
    .local v24, xStart:I
    #v24=(Integer);
    move/from16 v16, v24

    .line 669
    .local v16, nextXStart:I
    #v16=(Integer);
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z

    #v0=(Boolean);
    move/from16 v25, v0

    #v25=(Boolean);
    if-eqz v25, :cond_0

    .line 670
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v0=(Boolean);
    move/from16 v25, v0

    if-eqz v25, :cond_4

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z

    #v0=(Boolean);
    move/from16 v25, v0

    if-eqz v25, :cond_4

    const/high16 v25, 0x3f80

    :goto_3
    #v25=(Integer);
    move/from16 v0, v25

    #v0=(Integer);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    .line 673
    :cond_0
    #v1=(Conflicted);
    const/4 v11, 0x0

    .local v11, i:I
    :goto_4
    #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v21=(Conflicted);v22=(Conflicted);v26=(Float);
    if-ge v11, v6, :cond_b

    .line 674
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v11}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 676
    .local v4, child:Landroid/view/View;
    #v4=(Reference);
    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v25

    const/16 v26, 0x8

    #v26=(PosByte);
    move/from16 v0, v25

    #v0=(Integer);
    move/from16 v1, v26

    #v1=(PosByte);
    if-ne v0, v1, :cond_5

    .line 673
    :goto_5
    #v1=(Conflicted);v26=(Float);
    add-int/lit8 v11, v11, 0x1

    goto :goto_4

    .line 658
    .end local v4           #child:Landroid/view/View;
    .end local v6           #childCount:I
    .end local v11           #i:I
    .end local v16           #nextXStart:I
    .end local v18           #paddingEnd:I
    .end local v19           #paddingStart:I
    .end local v20           #paddingTop:I
    .end local v23           #width:I
    .end local v24           #xStart:I
    :cond_1
    #v0=(Uninit);v1=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    move-object/from16 v25, v0

    #v25=(Reference);
    const/16 v26, 0x1

    #v26=(One);
    invoke-virtual/range {v25 .. v26}, Landroid/support/v4/widget/ViewDragHelper;->setEdgeTrackingEnabled(I)V

    goto :goto_0

    .line 661
    .restart local v23       #width:I
    :cond_2
    #v23=(Integer);v26=(PosByte);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I

    move-result v19

    #v19=(Integer);
    goto :goto_1

    .line 662
    .restart local v19       #paddingStart:I
    :cond_3
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I

    move-result v18

    #v18=(Integer);
    goto :goto_2

    .line 670
    .restart local v6       #childCount:I
    .restart local v16       #nextXStart:I
    .restart local v18       #paddingEnd:I
    .restart local v20       #paddingTop:I
    .restart local v24       #xStart:I
    :cond_4
    #v0=(Boolean);v6=(Integer);v16=(Integer);v20=(Integer);v24=(Integer);v25=(Boolean);
    const/16 v25, 0x0

    #v25=(Null);
    goto :goto_3

    .line 680
    .restart local v4       #child:Landroid/view/View;
    .restart local v11       #i:I
    :cond_5
    #v0=(Integer);v1=(PosByte);v4=(Reference);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Integer);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Conflicted);v21=(Conflicted);v22=(Conflicted);v25=(Integer);
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v13

    #v13=(Reference);
    check-cast v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 682
    .local v13, lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v10

    .line 683
    .local v10, childWidth:I
    #v10=(Integer);
    const/16 v17, 0x0

    .line 685
    .local v17, offset:I
    #v17=(Null);
    iget-boolean v0, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z

    #v0=(Boolean);
    move/from16 v25, v0

    #v25=(Boolean);
    if-eqz v25, :cond_8

    .line 686
    iget v0, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I

    #v0=(Integer);
    move/from16 v25, v0

    #v25=(Integer);
    iget v0, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I

    move/from16 v26, v0

    #v26=(Integer);
    add-int v15, v25, v26

    .line 687
    .local v15, margin:I
    #v15=(Integer);
    sub-int v25, v23, v18

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mOverhangSize:I

    #v0=(Integer);
    move/from16 v26, v0

    sub-int v25, v25, v26

    move/from16 v0, v16

    move/from16 v1, v25

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v25

    sub-int v25, v25, v24

    sub-int v22, v25, v15

    .line 689
    .local v22, range:I
    #v22=(Integer);
    move/from16 v0, v22

    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I

    .line 690
    if-eqz v12, :cond_6

    iget v14, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I

    .line 691
    .local v14, lpMargin:I
    :goto_6
    #v14=(Integer);
    add-int v25, v24, v14

    add-int v25, v25, v22

    div-int/lit8 v26, v10, 0x2

    add-int v25, v25, v26

    sub-int v26, v23, v18

    move/from16 v0, v25

    move/from16 v1, v26

    #v1=(Integer);
    if-le v0, v1, :cond_7

    const/16 v25, 0x1

    :goto_7
    #v25=(Boolean);
    move/from16 v0, v25

    #v0=(Boolean);
    iput-boolean v0, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z

    .line 693
    move/from16 v0, v22

    #v0=(Integer);
    int-to-float v0, v0

    #v0=(Float);
    move/from16 v25, v0

    #v25=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v0=(Integer);
    move/from16 v26, v0

    mul-float v25, v25, v26

    move/from16 v0, v25

    #v0=(Float);
    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v21, v0

    .line 694
    .local v21, pos:I
    #v21=(Integer);
    add-int v25, v21, v14

    #v25=(Integer);
    add-int v24, v24, v25

    .line 695
    move/from16 v0, v21

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v25, v0

    #v25=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I

    #v0=(Integer);
    move/from16 v26, v0

    move/from16 v0, v26

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v26, v0

    #v26=(Float);
    div-float v25, v25, v26

    move/from16 v0, v25

    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    .line 705
    .end local v14           #lpMargin:I
    .end local v15           #margin:I
    .end local v21           #pos:I
    .end local v22           #range:I
    :goto_8
    #v0=(Integer);v1=(Conflicted);v14=(Conflicted);v15=(Conflicted);v17=(Integer);v21=(Conflicted);v22=(Conflicted);v25=(Integer);
    if-eqz v12, :cond_a

    .line 706
    sub-int v25, v23, v24

    add-int v8, v25, v17

    .line 707
    .local v8, childRight:I
    #v8=(Integer);
    sub-int v7, v8, v10

    .line 713
    .local v7, childLeft:I
    :goto_9
    #v7=(Integer);
    move/from16 v9, v20

    .line 714
    .local v9, childTop:I
    #v9=(Integer);
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    move-result v25

    add-int v5, v9, v25

    .line 715
    .local v5, childBottom:I
    #v5=(Integer);
    move/from16 v0, v20

    invoke-virtual {v4, v7, v0, v8, v5}, Landroid/view/View;->layout(IIII)V

    .line 717
    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v25

    add-int v16, v16, v25

    goto/16 :goto_5

    .line 690
    .end local v5           #childBottom:I
    .end local v7           #childLeft:I
    .end local v8           #childRight:I
    .end local v9           #childTop:I
    .restart local v15       #margin:I
    .restart local v22       #range:I
    :cond_6
    #v1=(Reference);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v15=(Integer);v17=(Null);v22=(Integer);v26=(Integer);
    iget v14, v13, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I

    #v14=(Integer);
    goto :goto_6

    .line 691
    .restart local v14       #lpMargin:I
    :cond_7
    #v1=(Integer);
    const/16 v25, 0x0

    #v25=(Null);
    goto :goto_7

    .line 696
    .end local v14           #lpMargin:I
    .end local v15           #margin:I
    .end local v22           #range:I
    :cond_8
    #v0=(Boolean);v1=(PosByte);v14=(Conflicted);v15=(Conflicted);v22=(Conflicted);v25=(Boolean);v26=(PosByte);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v0=(Boolean);
    move/from16 v25, v0

    if-eqz v25, :cond_9

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I

    #v0=(Integer);
    move/from16 v25, v0

    #v25=(Integer);
    if-eqz v25, :cond_9

    .line 697
    const/high16 v25, 0x3f80

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v0=(Integer);
    move/from16 v26, v0

    #v26=(Integer);
    sub-float v25, v25, v26

    #v25=(Float);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I

    #v0=(Integer);
    move/from16 v26, v0

    move/from16 v0, v26

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v26, v0

    #v26=(Float);
    mul-float v25, v25, v26

    move/from16 v0, v25

    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v17, v0

    .line 698
    #v17=(Integer);
    move/from16 v24, v16

    goto :goto_8

    .line 700
    :cond_9
    #v17=(Null);v25=(Integer);v26=(PosByte);
    move/from16 v24, v16

    goto :goto_8

    .line 709
    :cond_a
    #v1=(Conflicted);v17=(Integer);v26=(Float);
    sub-int v7, v24, v17

    .line 710
    .restart local v7       #childLeft:I
    #v7=(Integer);
    add-int v8, v7, v10

    .restart local v8       #childRight:I
    #v8=(Integer);
    goto :goto_9

    .line 720
    .end local v4           #child:Landroid/view/View;
    .end local v7           #childLeft:I
    .end local v8           #childRight:I
    .end local v10           #childWidth:I
    .end local v13           #lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    .end local v17           #offset:I
    :cond_b
    #v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v10=(Conflicted);v13=(Conflicted);v17=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z

    #v0=(Boolean);
    move/from16 v25, v0

    #v25=(Boolean);
    if-eqz v25, :cond_e

    .line 721
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v0=(Boolean);
    move/from16 v25, v0

    if-eqz v25, :cond_f

    .line 722
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I

    #v0=(Integer);
    move/from16 v25, v0

    #v25=(Integer);
    if-eqz v25, :cond_c

    .line 723
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v0=(Integer);
    move/from16 v25, v0

    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v25

    #v1=(Integer);
    invoke-direct {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->parallaxOtherViews(F)V

    .line 725
    :cond_c
    #v0=(Conflicted);v1=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    move-object/from16 v25, v0

    #v25=(Reference);
    invoke-virtual/range {v25 .. v25}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v25

    check-cast v25, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    move-object/from16 v0, v25

    iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z

    #v0=(Boolean);
    move/from16 v25, v0

    #v25=(Boolean);
    if-eqz v25, :cond_d

    .line 726
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    move-object/from16 v25, v0

    #v25=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideOffset:F

    #v0=(Integer);
    move/from16 v26, v0

    #v26=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I

    #v0=(Integer);
    move/from16 v27, v0

    #v27=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v25

    #v1=(Reference);
    move/from16 v2, v26

    #v2=(Integer);
    move/from16 v3, v27

    #v3=(Integer);
    invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V

    .line 734
    :cond_d
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v25=(Conflicted);v27=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    move-object/from16 v25, v0

    #v25=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v25

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->updateObscuredViewsVisibility(Landroid/view/View;)V

    .line 737
    :cond_e
    #v0=(Conflicted);v1=(Conflicted);v25=(Conflicted);
    const/16 v25, 0x0

    #v25=(Null);
    move/from16 v0, v25

    #v0=(Null);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z

    .line 738
    return-void

    .line 730
    :cond_f
    #v0=(Boolean);v1=(Conflicted);v2=(Uninit);v3=(Uninit);v25=(Boolean);v26=(Float);v27=(Uninit);
    const/4 v11, 0x0

    :goto_a
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v25=(Conflicted);v27=(Conflicted);
    if-ge v11, v6, :cond_d

    .line 731
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v11}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v25

    #v25=(Reference);
    const/16 v26, 0x0

    #v26=(Null);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I

    #v0=(Integer);
    move/from16 v27, v0

    #v27=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v25

    #v1=(Reference);
    move/from16 v2, v26

    #v2=(Null);
    move/from16 v3, v27

    #v3=(Integer);
    invoke-direct {v0, v1, v2, v3}, Landroid/support/v4/widget/SlidingPaneLayout;->dimChildView(Landroid/view/View;FI)V

    .line 730
    add-int/lit8 v11, v11, 0x1

    goto :goto_a
.end method

.method protected onMeasure(II)V
    .locals 31
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 442
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v25

    .line 443
    .local v25, widthMode:I
    #v25=(Integer);
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v27

    .line 444
    .local v27, widthSize:I
    #v27=(Integer);
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v12

    .line 445
    .local v12, heightMode:I
    #v12=(Integer);
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v13

    .line 447
    .local v13, heightSize:I
    #v13=(Integer);
    const/high16 v29, 0x4000

    #v29=(Integer);
    move/from16 v0, v25

    #v0=(Integer);
    move/from16 v1, v29

    #v1=(Integer);
    if-eq v0, v1, :cond_5

    .line 448
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInEditMode()Z

    move-result v29

    #v29=(Boolean);
    if-eqz v29, :cond_4

    .line 453
    const/high16 v29, -0x8000

    #v29=(Integer);
    move/from16 v0, v25

    move/from16 v1, v29

    if-ne v0, v1, :cond_3

    .line 454
    const/high16 v25, 0x4000

    .line 476
    :cond_0
    :goto_0
    const/16 v16, 0x0

    .line 477
    .local v16, layoutHeight:I
    #v16=(Null);
    const/16 v18, -0x1

    .line 478
    .local v18, maxLayoutHeight:I
    #v18=(Byte);
    sparse-switch v12, :sswitch_data_0

    .line 487
    :goto_1
    #v16=(Integer);v18=(Integer);v30=(Conflicted);
    const/16 v23, 0x0

    .line 488
    .local v23, weightSum:F
    #v23=(Null);
    const/4 v4, 0x0

    .line 489
    .local v4, canSlide:Z
    #v4=(Null);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I

    move-result v29

    sub-int v29, v27, v29

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I

    move-result v30

    #v30=(Integer);
    sub-int v24, v29, v30

    .line 490
    .local v24, widthAvailable:I
    #v24=(Integer);
    move/from16 v26, v24

    .line 491
    .local v26, widthRemaining:I
    #v26=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I

    move-result v6

    .line 493
    .local v6, childCount:I
    #v6=(Integer);
    const/16 v29, 0x2

    #v29=(PosByte);
    move/from16 v0, v29

    #v0=(PosByte);
    if-le v6, v0, :cond_1

    .line 494
    const-string v29, "SlidingPaneLayout"

    #v29=(Reference);
    const-string v30, "onMeasure: More than two child views are not supported."

    #v30=(Reference);
    invoke-static/range {v29 .. v30}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 498
    :cond_1
    #v29=(Conflicted);v30=(Conflicted);
    const/16 v29, 0x0

    #v29=(Null);
    move-object/from16 v0, v29

    #v0=(Null);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-object v0, v1, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    .line 502
    const/4 v15, 0x0

    .local v15, i:I
    :goto_2
    #v0=(Conflicted);v1=(Conflicted);v4=(Boolean);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v15=(Integer);v17=(Conflicted);v23=(Float);v29=(Integer);
    if-ge v15, v6, :cond_f

    .line 503
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v15}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 504
    .local v5, child:Landroid/view/View;
    #v5=(Reference);
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v17

    #v17=(Reference);
    check-cast v17, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 506
    .local v17, lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v29

    const/16 v30, 0x8

    #v30=(PosByte);
    move/from16 v0, v29

    #v0=(Integer);
    move/from16 v1, v30

    #v1=(PosByte);
    if-ne v0, v1, :cond_7

    .line 507
    const/16 v29, 0x0

    #v29=(Null);
    move/from16 v0, v29

    #v0=(Null);
    move-object/from16 v1, v17

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->dimWhenOffset:Z

    .line 502
    :cond_2
    :goto_3
    #v0=(Conflicted);v1=(Conflicted);v29=(Integer);v30=(Integer);
    add-int/lit8 v15, v15, 0x1

    goto :goto_2

    .line 455
    .end local v4           #canSlide:Z
    .end local v5           #child:Landroid/view/View;
    .end local v6           #childCount:I
    .end local v15           #i:I
    .end local v16           #layoutHeight:I
    .end local v17           #lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    .end local v18           #maxLayoutHeight:I
    .end local v23           #weightSum:F
    .end local v24           #widthAvailable:I
    .end local v26           #widthRemaining:I
    :cond_3
    #v0=(Integer);v1=(Integer);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v23=(Uninit);v24=(Uninit);v26=(Uninit);v30=(Uninit);
    if-nez v25, :cond_0

    .line 456
    const/high16 v25, 0x4000

    .line 457
    const/16 v27, 0x12c

    #v27=(PosShort);
    goto :goto_0

    .line 460
    :cond_4
    #v27=(Integer);v29=(Boolean);
    new-instance v29, Ljava/lang/IllegalStateException;

    #v29=(UninitRef);
    const-string v30, "Width must have an exact value or MATCH_PARENT"

    #v30=(Reference);
    invoke-direct/range {v29 .. v30}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v29=(Reference);
    throw v29

    .line 462
    :cond_5
    #v29=(Integer);v30=(Uninit);
    if-nez v12, :cond_0

    .line 463
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInEditMode()Z

    move-result v29

    #v29=(Boolean);
    if-eqz v29, :cond_6

    .line 467
    if-nez v12, :cond_0

    .line 468
    const/high16 v12, -0x8000

    .line 469
    const/16 v13, 0x12c

    #v13=(PosShort);
    goto :goto_0

    .line 472
    :cond_6
    #v13=(Integer);
    new-instance v29, Ljava/lang/IllegalStateException;

    #v29=(UninitRef);
    const-string v30, "Height must not be UNSPECIFIED"

    #v30=(Reference);
    invoke-direct/range {v29 .. v30}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v29=(Reference);
    throw v29

    .line 480
    .restart local v16       #layoutHeight:I
    .restart local v18       #maxLayoutHeight:I
    :sswitch_0
    #v16=(Null);v18=(Byte);v29=(Integer);v30=(Uninit);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I

    move-result v29

    sub-int v29, v13, v29

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I

    move-result v30

    #v30=(Integer);
    sub-int v18, v29, v30

    #v18=(Integer);
    move/from16 v16, v18

    .line 481
    #v16=(Integer);
    goto/16 :goto_1

    .line 483
    :sswitch_1
    #v16=(Null);v18=(Byte);v30=(Uninit);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I

    move-result v29

    sub-int v29, v13, v29

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I

    move-result v30

    #v30=(Integer);
    sub-int v18, v29, v30

    #v18=(Integer);
    goto/16 :goto_1

    .line 511
    .restart local v4       #canSlide:Z
    .restart local v5       #child:Landroid/view/View;
    .restart local v6       #childCount:I
    .restart local v15       #i:I
    .restart local v17       #lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    .restart local v23       #weightSum:F
    .restart local v24       #widthAvailable:I
    .restart local v26       #widthRemaining:I
    :cond_7
    #v1=(PosByte);v4=(Boolean);v5=(Reference);v6=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v15=(Integer);v16=(Integer);v17=(Reference);v23=(Float);v24=(Integer);v26=(Integer);v30=(PosByte);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, 0x0

    #v30=(Null);
    cmpl-float v29, v29, v30

    #v29=(Byte);
    if-lez v29, :cond_8

    .line 512
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F

    #v0=(Integer);
    move/from16 v29, v0

    #v29=(Integer);
    add-float v23, v23, v29

    .line 516
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v29, v0

    if-eqz v29, :cond_2

    .line 520
    :cond_8
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I

    #v0=(Integer);
    move/from16 v29, v0

    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I

    #v0=(Integer);
    move/from16 v30, v0

    #v30=(Integer);
    add-int v14, v29, v30

    .line 521
    .local v14, horizontalMargin:I
    #v14=(Integer);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, -0x2

    #v30=(Byte);
    move/from16 v0, v29

    move/from16 v1, v30

    #v1=(Byte);
    if-ne v0, v1, :cond_a

    .line 522
    sub-int v29, v24, v14

    const/high16 v30, -0x8000

    #v30=(Integer);
    invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 532
    .local v10, childWidthSpec:I
    :goto_4
    #v10=(Integer);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, -0x2

    #v30=(Byte);
    move/from16 v0, v29

    move/from16 v1, v30

    if-ne v0, v1, :cond_c

    .line 533
    const/high16 v29, -0x8000

    move/from16 v0, v18

    move/from16 v1, v29

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 540
    .local v8, childHeightSpec:I
    :goto_5
    #v8=(Integer);v30=(Integer);
    invoke-virtual {v5, v10, v8}, Landroid/view/View;->measure(II)V

    .line 541
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    .line 542
    .local v9, childWidth:I
    #v9=(Integer);
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v7

    .line 544
    .local v7, childHeight:I
    #v7=(Integer);
    const/high16 v29, -0x8000

    move/from16 v0, v29

    if-ne v12, v0, :cond_9

    move/from16 v0, v16

    if-le v7, v0, :cond_9

    .line 545
    move/from16 v0, v18

    invoke-static {v7, v0}, Ljava/lang/Math;->min(II)I

    move-result v16

    .line 548
    :cond_9
    sub-int v26, v26, v9

    .line 549
    if-gez v26, :cond_e

    const/16 v29, 0x1

    :goto_6
    #v29=(Boolean);
    move/from16 v0, v29

    #v0=(Boolean);
    move-object/from16 v1, v17

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z

    or-int v4, v4, v29

    .line 550
    move-object/from16 v0, v17

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z

    #v0=(Boolean);
    move/from16 v29, v0

    if-eqz v29, :cond_2

    .line 551
    move-object/from16 v0, p0

    #v0=(Reference);
    iput-object v5, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    goto/16 :goto_3

    .line 524
    .end local v7           #childHeight:I
    .end local v8           #childHeightSpec:I
    .end local v9           #childWidth:I
    .end local v10           #childWidthSpec:I
    :cond_a
    #v0=(Integer);v1=(Byte);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v29=(Integer);v30=(Byte);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, -0x1

    move/from16 v0, v29

    move/from16 v1, v30

    if-ne v0, v1, :cond_b

    .line 525
    sub-int v29, v24, v14

    const/high16 v30, 0x4000

    #v30=(Integer);
    invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .restart local v10       #childWidthSpec:I
    #v10=(Integer);
    goto :goto_4

    .line 528
    .end local v10           #childWidthSpec:I
    :cond_b
    #v10=(Conflicted);v30=(Byte);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v29, v0

    const/high16 v30, 0x4000

    #v30=(Integer);
    invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .restart local v10       #childWidthSpec:I
    #v10=(Integer);
    goto :goto_4

    .line 534
    :cond_c
    #v30=(Byte);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, -0x1

    move/from16 v0, v29

    move/from16 v1, v30

    if-ne v0, v1, :cond_d

    .line 535
    const/high16 v29, 0x4000

    move/from16 v0, v18

    move/from16 v1, v29

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8       #childHeightSpec:I
    #v8=(Integer);
    goto :goto_5

    .line 537
    .end local v8           #childHeightSpec:I
    :cond_d
    #v1=(Byte);v8=(Conflicted);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v29, v0

    const/high16 v30, 0x4000

    #v30=(Integer);
    invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8       #childHeightSpec:I
    #v8=(Integer);
    goto :goto_5

    .line 549
    .restart local v7       #childHeight:I
    .restart local v9       #childWidth:I
    :cond_e
    #v1=(Integer);v7=(Integer);v9=(Integer);
    const/16 v29, 0x0

    #v29=(Null);
    goto :goto_6

    .line 556
    .end local v5           #child:Landroid/view/View;
    .end local v7           #childHeight:I
    .end local v8           #childHeightSpec:I
    .end local v9           #childWidth:I
    .end local v10           #childWidthSpec:I
    .end local v14           #horizontalMargin:I
    .end local v17           #lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    :cond_f
    #v0=(Conflicted);v1=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v17=(Conflicted);v29=(Integer);v30=(Conflicted);
    if-nez v4, :cond_10

    const/16 v29, 0x0

    #v29=(Null);
    cmpl-float v29, v23, v29

    #v29=(Byte);
    if-lez v29, :cond_1e

    .line 557
    :cond_10
    #v29=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mOverhangSize:I

    #v0=(Integer);
    move/from16 v29, v0

    sub-int v11, v24, v29

    .line 559
    .local v11, fixedPanelWidthLimit:I
    #v11=(Integer);
    const/4 v15, 0x0

    :goto_7
    #v3=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v28=(Conflicted);
    if-ge v15, v6, :cond_1e

    .line 560
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v15}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 562
    .restart local v5       #child:Landroid/view/View;
    #v5=(Reference);
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v29

    const/16 v30, 0x8

    #v30=(PosByte);
    move/from16 v0, v29

    #v0=(Integer);
    move/from16 v1, v30

    #v1=(PosByte);
    if-ne v0, v1, :cond_12

    .line 559
    :cond_11
    :goto_8
    #v1=(Integer);v30=(Integer);
    add-int/lit8 v15, v15, 0x1

    goto :goto_7

    .line 566
    :cond_12
    #v1=(PosByte);v30=(PosByte);
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v17

    #v17=(Reference);
    check-cast v17, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 568
    .restart local v17       #lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    move-result v29

    const/16 v30, 0x8

    move/from16 v0, v29

    move/from16 v1, v30

    if-eq v0, v1, :cond_11

    .line 572
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v29, v0

    if-nez v29, :cond_14

    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, 0x0

    #v30=(Null);
    cmpl-float v29, v29, v30

    #v29=(Byte);
    if-lez v29, :cond_14

    const/16 v22, 0x1

    .line 573
    .local v22, skippedFirstPass:Z
    :goto_9
    #v22=(Boolean);v29=(Integer);v30=(PosByte);
    if-eqz v22, :cond_15

    const/16 v20, 0x0

    .line 574
    .local v20, measuredWidth:I
    :goto_a
    #v20=(Integer);
    if-eqz v4, :cond_19

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    move-object/from16 v29, v0

    #v29=(Reference);
    move-object/from16 v0, v29

    if-eq v5, v0, :cond_19

    .line 575
    move-object/from16 v0, v17

    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v29, v0

    #v29=(Integer);
    if-gez v29, :cond_11

    move/from16 v0, v20

    if-gt v0, v11, :cond_13

    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, 0x0

    #v30=(Null);
    cmpl-float v29, v29, v30

    #v29=(Byte);
    if-lez v29, :cond_11

    .line 579
    :cond_13
    #v29=(Integer);v30=(PosByte);
    if-eqz v22, :cond_18

    .line 582
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, -0x2

    #v30=(Byte);
    move/from16 v0, v29

    move/from16 v1, v30

    #v1=(Byte);
    if-ne v0, v1, :cond_16

    .line 583
    const/high16 v29, -0x8000

    move/from16 v0, v18

    move/from16 v1, v29

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 596
    .restart local v8       #childHeightSpec:I
    :goto_b
    #v8=(Integer);v30=(Integer);
    const/high16 v29, 0x4000

    move/from16 v0, v29

    invoke-static {v11, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 598
    .restart local v10       #childWidthSpec:I
    #v10=(Integer);
    invoke-virtual {v5, v10, v8}, Landroid/view/View;->measure(II)V

    goto :goto_8

    .line 572
    .end local v8           #childHeightSpec:I
    .end local v10           #childWidthSpec:I
    .end local v20           #measuredWidth:I
    .end local v22           #skippedFirstPass:Z
    :cond_14
    #v1=(PosByte);v8=(Conflicted);v10=(Conflicted);v20=(Conflicted);v22=(Conflicted);v30=(PosByte);
    const/16 v22, 0x0

    #v22=(Null);
    goto :goto_9

    .line 573
    .restart local v22       #skippedFirstPass:Z
    :cond_15
    #v22=(Boolean);
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    move-result v20

    #v20=(Integer);
    goto :goto_a

    .line 585
    .restart local v20       #measuredWidth:I
    :cond_16
    #v1=(Byte);v30=(Byte);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, -0x1

    move/from16 v0, v29

    move/from16 v1, v30

    if-ne v0, v1, :cond_17

    .line 586
    const/high16 v29, 0x4000

    move/from16 v0, v18

    move/from16 v1, v29

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8       #childHeightSpec:I
    #v8=(Integer);
    goto :goto_b

    .line 589
    .end local v8           #childHeightSpec:I
    :cond_17
    #v1=(Byte);v8=(Conflicted);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v29, v0

    const/high16 v30, 0x4000

    #v30=(Integer);
    invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8       #childHeightSpec:I
    #v8=(Integer);
    goto :goto_b

    .line 593
    .end local v8           #childHeightSpec:I
    :cond_18
    #v1=(PosByte);v8=(Conflicted);v30=(PosByte);
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v29

    const/high16 v30, 0x4000

    #v30=(Integer);
    invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8       #childHeightSpec:I
    #v8=(Integer);
    goto :goto_b

    .line 600
    .end local v8           #childHeightSpec:I
    :cond_19
    #v0=(Conflicted);v8=(Conflicted);v29=(Conflicted);v30=(PosByte);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F

    #v0=(Integer);
    move/from16 v29, v0

    #v29=(Integer);
    const/16 v30, 0x0

    #v30=(Null);
    cmpl-float v29, v29, v30

    #v29=(Byte);
    if-lez v29, :cond_11

    .line 602
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v29, v0

    #v29=(Integer);
    if-nez v29, :cond_1c

    .line 604
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, -0x2

    #v30=(Byte);
    move/from16 v0, v29

    move/from16 v1, v30

    #v1=(Byte);
    if-ne v0, v1, :cond_1a

    .line 605
    const/high16 v29, -0x8000

    move/from16 v0, v18

    move/from16 v1, v29

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 619
    .restart local v8       #childHeightSpec:I
    :goto_c
    #v8=(Integer);v30=(Integer);
    if-eqz v4, :cond_1d

    .line 621
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I

    #v0=(Integer);
    move/from16 v29, v0

    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I

    #v0=(Integer);
    move/from16 v30, v0

    add-int v14, v29, v30

    .line 622
    .restart local v14       #horizontalMargin:I
    #v14=(Integer);
    sub-int v21, v24, v14

    .line 623
    .local v21, newWidth:I
    #v21=(Integer);
    const/high16 v29, 0x4000

    move/from16 v0, v21

    move/from16 v1, v29

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 625
    .restart local v10       #childWidthSpec:I
    #v10=(Integer);
    move/from16 v0, v20

    move/from16 v1, v21

    if-eq v0, v1, :cond_11

    .line 626
    invoke-virtual {v5, v10, v8}, Landroid/view/View;->measure(II)V

    goto/16 :goto_8

    .line 607
    .end local v8           #childHeightSpec:I
    .end local v10           #childWidthSpec:I
    .end local v14           #horizontalMargin:I
    .end local v21           #newWidth:I
    :cond_1a
    #v1=(Byte);v8=(Conflicted);v10=(Conflicted);v14=(Conflicted);v21=(Conflicted);v30=(Byte);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v29, v0

    const/16 v30, -0x1

    move/from16 v0, v29

    move/from16 v1, v30

    if-ne v0, v1, :cond_1b

    .line 608
    const/high16 v29, 0x4000

    move/from16 v0, v18

    move/from16 v1, v29

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8       #childHeightSpec:I
    #v8=(Integer);
    goto :goto_c

    .line 611
    .end local v8           #childHeightSpec:I
    :cond_1b
    #v1=(Byte);v8=(Conflicted);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v29, v0

    const/high16 v30, 0x4000

    #v30=(Integer);
    invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8       #childHeightSpec:I
    #v8=(Integer);
    goto :goto_c

    .line 615
    .end local v8           #childHeightSpec:I
    :cond_1c
    #v1=(PosByte);v8=(Conflicted);v30=(Null);
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredHeight()I

    move-result v29

    const/high16 v30, 0x4000

    #v30=(Integer);
    invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .restart local v8       #childHeightSpec:I
    #v8=(Integer);
    goto :goto_c

    .line 630
    :cond_1d
    #v1=(Integer);
    const/16 v29, 0x0

    #v29=(Null);
    move/from16 v0, v29

    #v0=(Null);
    move/from16 v1, v26

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v28

    .line 631
    .local v28, widthToDistribute:I
    #v28=(Integer);
    move-object/from16 v0, v17

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F

    #v0=(Integer);
    move/from16 v29, v0

    #v29=(Integer);
    move/from16 v0, v28

    int-to-float v0, v0

    #v0=(Float);
    move/from16 v30, v0

    #v30=(Float);
    mul-float v29, v29, v30

    #v29=(Float);
    div-float v29, v29, v23

    move/from16 v0, v29

    float-to-int v3, v0

    .line 632
    .local v3, addedWidth:I
    #v3=(Integer);
    add-int v29, v20, v3

    #v29=(Integer);
    const/high16 v30, 0x4000

    #v30=(Integer);
    invoke-static/range {v29 .. v30}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v10

    .line 634
    .restart local v10       #childWidthSpec:I
    #v10=(Integer);
    invoke-virtual {v5, v10, v8}, Landroid/view/View;->measure(II)V

    goto/16 :goto_8

    .line 640
    .end local v3           #addedWidth:I
    .end local v5           #child:Landroid/view/View;
    .end local v8           #childHeightSpec:I
    .end local v10           #childWidthSpec:I
    .end local v11           #fixedPanelWidthLimit:I
    .end local v17           #lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    .end local v20           #measuredWidth:I
    .end local v22           #skippedFirstPass:Z
    .end local v28           #widthToDistribute:I
    :cond_1e
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);v8=(Conflicted);v10=(Conflicted);v11=(Conflicted);v17=(Conflicted);v20=(Conflicted);v22=(Conflicted);v28=(Conflicted);v30=(Conflicted);
    move/from16 v20, v27

    .line 641
    .restart local v20       #measuredWidth:I
    #v20=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I

    move-result v29

    add-int v29, v29, v16

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I

    move-result v30

    #v30=(Integer);
    add-int v19, v29, v30

    .line 643
    .local v19, measuredHeight:I
    #v19=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    move/from16 v2, v19

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->setMeasuredDimension(II)V

    .line 644
    move-object/from16 v0, p0

    iput-boolean v4, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    .line 646
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    move-object/from16 v29, v0

    #v29=(Reference);
    invoke-virtual/range {v29 .. v29}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I

    move-result v29

    #v29=(Integer);
    if-eqz v29, :cond_1f

    if-nez v4, :cond_1f

    .line 648
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    move-object/from16 v29, v0

    #v29=(Reference);
    invoke-virtual/range {v29 .. v29}, Landroid/support/v4/widget/ViewDragHelper;->abort()V

    .line 650
    :cond_1f
    #v29=(Conflicted);
    return-void

    .line 478
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_1
        0x40000000 -> :sswitch_0
    .end sparse-switch
.end method

.method protected onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 2
    .parameter "state"

    .prologue
    .line 1285
    move-object v0, p1

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;

    .line 1286
    .local v0, ss:Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
    invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v1

    #v1=(Reference);
    invoke-super {p0, v1}, Landroid/view/ViewGroup;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1288
    iget-boolean v1, v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 1289
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->openPane()Z

    .line 1293
    :goto_0
    iget-boolean v1, v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z

    iput-boolean v1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z

    .line 1294
    return-void

    .line 1291
    :cond_0
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane()Z

    goto :goto_0
.end method

.method protected onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .prologue
    .line 1275
    invoke-super {p0}, Landroid/view/ViewGroup;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 1277
    .local v1, superState:Landroid/os/Parcelable;
    #v1=(Reference);
    new-instance v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;

    #v0=(UninitRef);
    invoke-direct {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1278
    .local v0, ss:Landroid/support/v4/widget/SlidingPaneLayout$SavedState;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isSlideable()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isOpen()Z

    move-result v2

    :goto_0
    iput-boolean v2, v0, Landroid/support/v4/widget/SlidingPaneLayout$SavedState;->isOpen:Z

    .line 1280
    return-object v0

    .line 1278
    :cond_0
    iget-boolean v2, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z

    goto :goto_0
.end method

.method protected onSizeChanged(IIII)V
    .locals 1
    .parameter "w"
    .parameter "h"
    .parameter "oldw"
    .parameter "oldh"

    .prologue
    .line 742
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->onSizeChanged(IIII)V

    .line 744
    if-eq p1, p3, :cond_0

    .line 745
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mFirstLayout:Z

    .line 747
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 11
    .parameter "ev"

    .prologue
    .line 819
    iget-boolean v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v7=(Boolean);
    if-nez v7, :cond_1

    .line 820
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v4

    .line 855
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Boolean);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return v4

    .line 823
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Uninit);v9=(Uninit);v10=(Uninit);
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v7=(Reference);
    invoke-virtual {v7, p1}, Landroid/support/v4/widget/ViewDragHelper;->processTouchEvent(Landroid/view/MotionEvent;)V

    .line 825
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 826
    .local v0, action:I
    #v0=(Integer);
    const/4 v4, 0x1

    .line 828
    .local v4, wantTouchEvents:Z
    #v4=(One);
    and-int/lit16 v7, v0, 0xff

    #v7=(Integer);
    packed-switch v7, :pswitch_data_0

    goto :goto_0

    .line 830
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    .line 831
    .local v5, x:F
    #v5=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    .line 832
    .local v6, y:F
    #v6=(Float);
    iput v5, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F

    .line 833
    iput v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F

    goto :goto_0

    .line 838
    .end local v5           #x:F
    .end local v6           #y:F
    :pswitch_1
    #v5=(Uninit);v6=(Uninit);
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v7=(Reference);
    invoke-virtual {p0, v7}, Landroid/support/v4/widget/SlidingPaneLayout;->isDimmed(Landroid/view/View;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_0

    .line 839
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v5

    .line 840
    .restart local v5       #x:F
    #v5=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v6

    .line 841
    .restart local v6       #y:F
    #v6=(Float);
    iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionX:F

    #v7=(Integer);
    sub-float v1, v5, v7

    .line 842
    .local v1, dx:F
    #v1=(Float);
    iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mInitialMotionY:F

    sub-float v2, v6, v7

    .line 843
    .local v2, dy:F
    #v2=(Float);
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/support/v4/widget/ViewDragHelper;->getTouchSlop()I

    move-result v3

    .line 844
    .local v3, slop:I
    #v3=(Integer);
    mul-float v7, v1, v1

    #v7=(Float);
    mul-float v8, v2, v2

    #v8=(Float);
    add-float/2addr v7, v8

    mul-int v8, v3, v3

    #v8=(Integer);
    int-to-float v8, v8

    #v8=(Float);
    cmpg-float v7, v7, v8

    #v7=(Byte);
    if-gez v7, :cond_0

    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v7=(Reference);
    iget-object v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v8=(Reference);
    float-to-int v9, v5

    #v9=(Integer);
    float-to-int v10, v6

    #v10=(Integer);
    invoke-virtual {v7, v8, v9, v10}, Landroid/support/v4/widget/ViewDragHelper;->isViewUnder(Landroid/view/View;II)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_0

    .line 847
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v7=(Reference);
    const/4 v8, 0x0

    #v8=(Null);
    invoke-direct {p0, v7, v8}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane(Landroid/view/View;I)Z

    goto :goto_0

    .line 828
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public openPane()Z
    .locals 2

    .prologue
    .line 889
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->openPane(Landroid/view/View;I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 1
    .parameter "child"
    .parameter "focused"

    .prologue
    .line 751
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 752
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isInTouchMode()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    if-nez v0, :cond_0

    .line 753
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v0=(Reference);
    if-ne p1, v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPreservedOpenState:Z

    .line 755
    :cond_0
    return-void

    .line 753
    :cond_1
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method setAllChildrenVisible()V
    .locals 5

    .prologue
    .line 399
    const/4 v2, 0x0

    .local v2, i:I
    #v2=(Null);
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I

    move-result v1

    .local v1, childCount:I
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
    if-ge v2, v1, :cond_1

    .line 400
    invoke-virtual {p0, v2}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 401
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v3

    #v3=(Integer);
    const/4 v4, 0x4

    #v4=(PosByte);
    if-ne v3, v4, :cond_0

    .line 402
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 399
    :cond_0
    #v3=(Integer);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 405
    .end local v0           #child:Landroid/view/View;
    :cond_1
    #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void
.end method

.method public setCoveredFadeColor(I)V
    .locals 0
    .parameter "color"

    .prologue
    .line 318
    iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCoveredFadeColor:I

    .line 319
    return-void
.end method

.method public setPanelSlideListener(Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 329
    iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mPanelSlideListener:Landroid/support/v4/widget/SlidingPaneLayout$PanelSlideListener;

    .line 330
    return-void
.end method

.method public setParallaxDistance(I)V
    .locals 0
    .parameter "parallaxBy"

    .prologue
    .line 282
    iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mParallaxBy:I

    .line 283
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->requestLayout()V

    .line 284
    return-void
.end method

.method public setShadowDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .parameter "d"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1095
    invoke-virtual {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V

    .line 1096
    return-void
.end method

.method public setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .parameter "d"

    .prologue
    .line 1105
    iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawableLeft:Landroid/graphics/drawable/Drawable;

    .line 1106
    return-void
.end method

.method public setShadowDrawableRight(Landroid/graphics/drawable/Drawable;)V
    .locals 0
    .parameter "d"

    .prologue
    .line 1115
    iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mShadowDrawableRight:Landroid/graphics/drawable/Drawable;

    .line 1116
    return-void
.end method

.method public setShadowResource(I)V
    .locals 1
    .parameter "resId"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1126
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1127
    return-void
.end method

.method public setShadowResourceLeft(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 1136
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawableLeft(Landroid/graphics/drawable/Drawable;)V

    .line 1137
    return-void
.end method

.method public setShadowResourceRight(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 1146
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setShadowDrawableRight(Landroid/graphics/drawable/Drawable;)V

    .line 1147
    return-void
.end method

.method public setSliderFadeColor(I)V
    .locals 0
    .parameter "color"

    .prologue
    .line 301
    iput p1, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSliderFadeColor:I

    .line 302
    return-void
.end method

.method public smoothSlideClosed()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 897
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->closePane()Z

    .line 898
    return-void
.end method

.method public smoothSlideOpen()V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 879
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->openPane()Z

    .line 880
    return-void
.end method

.method smoothSlideTo(FI)Z
    .locals 9
    .parameter "slideOffset"
    .parameter "velocity"

    .prologue
    const/4 v5, 0x0

    .line 1048
    #v5=(Null);
    iget-boolean v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mCanSlide:Z

    #v6=(Boolean);
    if-nez v6, :cond_1

    .line 1071
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v7=(Conflicted);v8=(Conflicted);
    return v5

    .line 1053
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v7=(Uninit);v8=(Uninit);
    invoke-direct {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v1

    .line 1054
    .local v1, isLayoutRtl:Z
    #v1=(Boolean);
    iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 1057
    .local v2, lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    if-eqz v1, :cond_2

    .line 1058
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I

    move-result v6

    #v6=(Integer);
    iget v7, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I

    #v7=(Integer);
    add-int v3, v6, v7

    .line 1059
    .local v3, startBound:I
    #v3=(Integer);
    iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1060
    .local v0, childWidth:I
    #v0=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I

    move-result v6

    #v6=(Integer);
    int-to-float v6, v6

    #v6=(Float);
    int-to-float v7, v3

    #v7=(Float);
    iget v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I

    #v8=(Integer);
    int-to-float v8, v8

    #v8=(Float);
    mul-float/2addr v8, p1

    add-float/2addr v7, v8

    int-to-float v8, v0

    add-float/2addr v7, v8

    sub-float/2addr v6, v7

    float-to-int v4, v6

    .line 1066
    .end local v0           #childWidth:I
    .local v4, x:I
    :goto_1
    #v0=(Conflicted);v4=(Integer);v8=(Conflicted);
    iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mDragHelper:Landroid/support/v4/widget/ViewDragHelper;

    #v6=(Reference);
    iget-object v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v7=(Reference);
    iget-object v8, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideableView:Landroid/view/View;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/view/View;->getTop()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {v6, v7, v4, v8}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_0

    .line 1067
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->setAllChildrenVisible()V

    .line 1068
    invoke-static {p0}, Landroid/support/v4/view/ViewCompat;->postInvalidateOnAnimation(Landroid/view/View;)V

    .line 1069
    const/4 v5, 0x1

    #v5=(One);
    goto :goto_0

    .line 1062
    .end local v3           #startBound:I
    .end local v4           #x:I
    :cond_2
    #v0=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Null);v6=(Reference);v7=(Uninit);v8=(Uninit);
    invoke-virtual {p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I

    move-result v6

    #v6=(Integer);
    iget v7, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I

    #v7=(Integer);
    add-int v3, v6, v7

    .line 1063
    .restart local v3       #startBound:I
    #v3=(Integer);
    int-to-float v6, v3

    #v6=(Float);
    iget v7, p0, Landroid/support/v4/widget/SlidingPaneLayout;->mSlideRange:I

    int-to-float v7, v7

    #v7=(Float);
    mul-float/2addr v7, p1

    add-float/2addr v6, v7

    float-to-int v4, v6

    .restart local v4       #x:I
    #v4=(Integer);
    goto :goto_1
.end method

.method updateObscuredViewsVisibility(Landroid/view/View;)V
    .locals 21
    .parameter "panel"

    .prologue
    .line 353
    invoke-direct/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->isLayoutRtlSupport()Z

    move-result v12

    .line 354
    .local v12, isLayoutRtl:Z
    #v12=(Boolean);
    if-eqz v12, :cond_1

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I

    move-result v19

    #v19=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I

    move-result v20

    #v20=(Integer);
    sub-int v15, v19, v20

    .line 356
    .local v15, startBound:I
    :goto_0
    #v15=(Integer);v19=(Conflicted);v20=(Conflicted);
    if-eqz v12, :cond_2

    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I

    move-result v10

    .line 358
    .local v10, endBound:I
    :goto_1
    #v10=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingTop()I

    move-result v17

    .line 359
    .local v17, topBound:I
    #v17=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getHeight()I

    move-result v19

    #v19=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingBottom()I

    move-result v20

    #v20=(Integer);
    sub-int v3, v19, v20

    .line 364
    .local v3, bottomBound:I
    #v3=(Integer);
    if-eqz p1, :cond_3

    invoke-static/range {p1 .. p1}, Landroid/support/v4/widget/SlidingPaneLayout;->viewIsOpaque(Landroid/view/View;)Z

    move-result v19

    #v19=(Boolean);
    if-eqz v19, :cond_3

    .line 365
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getLeft()I

    move-result v13

    .line 366
    .local v13, left:I
    #v13=(Integer);
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getRight()I

    move-result v14

    .line 367
    .local v14, right:I
    #v14=(Integer);
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getTop()I

    move-result v16

    .line 368
    .local v16, top:I
    #v16=(Integer);
    invoke-virtual/range {p1 .. p1}, Landroid/view/View;->getBottom()I

    move-result v2

    .line 373
    .local v2, bottom:I
    :goto_2
    #v2=(Integer);v19=(Integer);
    const/4 v11, 0x0

    .local v11, i:I
    #v11=(Null);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildCount()I

    move-result v5

    .local v5, childCount:I
    :goto_3
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Integer);v18=(Conflicted);
    if-ge v11, v5, :cond_0

    .line 374
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v11}, Landroid/support/v4/widget/SlidingPaneLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v4

    .line 376
    .local v4, child:Landroid/view/View;
    #v4=(Reference);
    move-object/from16 v0, p1

    if-ne v4, v0, :cond_4

    .line 396
    .end local v4           #child:Landroid/view/View;
    :cond_0
    #v0=(Conflicted);v4=(Conflicted);
    return-void

    .line 354
    .end local v2           #bottom:I
    .end local v3           #bottomBound:I
    .end local v5           #childCount:I
    .end local v10           #endBound:I
    .end local v11           #i:I
    .end local v13           #left:I
    .end local v14           #right:I
    .end local v15           #startBound:I
    .end local v16           #top:I
    .end local v17           #topBound:I
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I

    move-result v15

    #v15=(Integer);
    goto :goto_0

    .line 356
    .restart local v15       #startBound:I
    :cond_2
    #v19=(Conflicted);v20=(Conflicted);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I

    move-result v19

    #v19=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I

    move-result v20

    #v20=(Integer);
    sub-int v10, v19, v20

    #v10=(Integer);
    goto :goto_1

    .line 370
    .restart local v3       #bottomBound:I
    .restart local v10       #endBound:I
    .restart local v17       #topBound:I
    :cond_3
    #v3=(Integer);v17=(Integer);
    const/4 v2, 0x0

    .restart local v2       #bottom:I
    #v2=(Null);
    move/from16 v16, v2

    .restart local v16       #top:I
    #v16=(Null);
    move v14, v2

    .restart local v14       #right:I
    #v14=(Null);
    move v13, v2

    .restart local v13       #left:I
    #v13=(Null);
    goto :goto_2

    .line 381
    .restart local v4       #child:Landroid/view/View;
    .restart local v5       #childCount:I
    .restart local v11       #i:I
    :cond_4
    #v0=(Reference);v1=(Conflicted);v2=(Integer);v4=(Reference);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v11=(Integer);v13=(Integer);v14=(Integer);v16=(Integer);v18=(Conflicted);
    if-eqz v12, :cond_5

    move/from16 v19, v10

    :goto_4
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v20

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->max(II)I

    move-result v7

    .line 383
    .local v7, clampedChildLeft:I
    #v7=(Integer);
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v19

    move/from16 v0, v17

    #v0=(Integer);
    move/from16 v1, v19

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v9

    .line 384
    .local v9, clampedChildTop:I
    #v9=(Integer);
    if-eqz v12, :cond_6

    move/from16 v19, v15

    :goto_5
    invoke-virtual {v4}, Landroid/view/View;->getRight()I

    move-result v20

    invoke-static/range {v19 .. v20}, Ljava/lang/Math;->min(II)I

    move-result v8

    .line 386
    .local v8, clampedChildRight:I
    #v8=(Integer);
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    move-result v19

    move/from16 v0, v19

    invoke-static {v3, v0}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 388
    .local v6, clampedChildBottom:I
    #v6=(Integer);
    if-lt v7, v13, :cond_7

    move/from16 v0, v16

    if-lt v9, v0, :cond_7

    if-gt v8, v14, :cond_7

    if-gt v6, v2, :cond_7

    .line 390
    const/16 v18, 0x4

    .line 394
    .local v18, vis:I
    :goto_6
    #v18=(PosByte);
    move/from16 v0, v18

    #v0=(PosByte);
    invoke-virtual {v4, v0}, Landroid/view/View;->setVisibility(I)V

    .line 373
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    .end local v6           #clampedChildBottom:I
    .end local v7           #clampedChildLeft:I
    .end local v8           #clampedChildRight:I
    .end local v9           #clampedChildTop:I
    .end local v18           #vis:I
    :cond_5
    #v0=(Reference);v1=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v18=(Conflicted);
    move/from16 v19, v15

    .line 381
    goto :goto_4

    .restart local v7       #clampedChildLeft:I
    .restart local v9       #clampedChildTop:I
    :cond_6
    #v0=(Integer);v1=(Integer);v7=(Integer);v9=(Integer);
    move/from16 v19, v10

    .line 384
    goto :goto_5

    .line 392
    .restart local v6       #clampedChildBottom:I
    .restart local v8       #clampedChildRight:I
    :cond_7
    #v6=(Integer);v8=(Integer);
    const/16 v18, 0x0

    .restart local v18       #vis:I
    #v18=(Null);
    goto :goto_6
.end method

*/}
