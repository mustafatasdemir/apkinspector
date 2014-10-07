package android.support.v7.internal.widget; class ActionBarOverlayLayout {/*

.class public Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
.super Landroid/widget/FrameLayout;
.source "ActionBarOverlayLayout.java"


# static fields
.field static final mActionBarSizeAttr:[I


# instance fields
.field private mActionBar:Landroid/support/v7/app/ActionBar;

.field private mActionBarBottom:Landroid/view/View;

.field private mActionBarHeight:I

.field private mActionBarTop:Landroid/view/View;

.field private mActionView:Landroid/support/v7/internal/widget/ActionBarView;

.field private mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

.field private mContent:Landroid/view/View;

.field private final mZeroRect:Landroid/graphics/Rect;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 45
    const/4 v0, 0x1

    #v0=(One);
    new-array v0, v0, [I

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    sget v2, Landroid/support/v7/appcompat/R$attr;->actionBarSize:I

    #v2=(Integer);
    aput v2, v0, v1

    sput-object v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarSizeAttr:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    const/4 v1, 0x0

    .line 50
    #v1=(Null);
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 43
    #p0=(Reference);
    new-instance v0, Landroid/graphics/Rect;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mZeroRect:Landroid/graphics/Rect;

    .line 51
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->init(Landroid/content/Context;)V

    .line 52
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v1, 0x0

    .line 55
    #v1=(Null);
    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    #p0=(Reference);
    new-instance v0, Landroid/graphics/Rect;

    #v0=(UninitRef);
    invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mZeroRect:Landroid/graphics/Rect;

    .line 56
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->init(Landroid/content/Context;)V

    .line 57
    return-void
.end method

.method private applyInsets(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z
    .locals 4
    .parameter "view"
    .parameter "insets"
    .parameter "left"
    .parameter "top"
    .parameter "bottom"
    .parameter "right"

    .prologue
    .line 71
    const/4 v0, 0x0

    .line 72
    .local v0, changed:Z
    #v0=(Null);
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/widget/FrameLayout$LayoutParams;

    .line 73
    .local v1, lp:Landroid/widget/FrameLayout$LayoutParams;
    if-eqz p3, :cond_0

    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    #v2=(Integer);
    iget v3, p2, Landroid/graphics/Rect;->left:I

    #v3=(Integer);
    if-eq v2, v3, :cond_0

    .line 74
    const/4 v0, 0x1

    .line 75
    #v0=(One);
    iget v2, p2, Landroid/graphics/Rect;->left:I

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 77
    :cond_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    if-eqz p4, :cond_1

    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    #v2=(Integer);
    iget v3, p2, Landroid/graphics/Rect;->top:I

    #v3=(Integer);
    if-eq v2, v3, :cond_1

    .line 78
    const/4 v0, 0x1

    .line 79
    #v0=(One);
    iget v2, p2, Landroid/graphics/Rect;->top:I

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 81
    :cond_1
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    if-eqz p6, :cond_2

    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    #v2=(Integer);
    iget v3, p2, Landroid/graphics/Rect;->right:I

    #v3=(Integer);
    if-eq v2, v3, :cond_2

    .line 82
    const/4 v0, 0x1

    .line 83
    #v0=(One);
    iget v2, p2, Landroid/graphics/Rect;->right:I

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 85
    :cond_2
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    if-eqz p5, :cond_3

    iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    #v2=(Integer);
    iget v3, p2, Landroid/graphics/Rect;->bottom:I

    #v3=(Integer);
    if-eq v2, v3, :cond_3

    .line 86
    const/4 v0, 0x1

    .line 87
    #v0=(One);
    iget v2, p2, Landroid/graphics/Rect;->bottom:I

    iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 89
    :cond_3
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v0
.end method

.method private init(Landroid/content/Context;)V
    .locals 4
    .parameter "context"

    .prologue
    const/4 v3, 0x0

    .line 60
    #v3=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    sget-object v2, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarSizeAttr:[I

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 61
    .local v0, ta:Landroid/content/res/TypedArray;
    #v0=(Reference);
    invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarHeight:I

    .line 62
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 63
    return-void
.end method


# virtual methods
.method pullChildren()V
    .locals 1

    .prologue
    .line 93
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContent:Landroid/view/View;

    #v0=(Reference);
    if-nez v0, :cond_1

    .line 94
    sget v0, Landroid/support/v7/appcompat/R$id;->action_bar_activity_content:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContent:Landroid/view/View;

    .line 95
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContent:Landroid/view/View;

    if-nez v0, :cond_0

    .line 96
    const v0, 0x1020002

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContent:Landroid/view/View;

    .line 98
    :cond_0
    sget v0, Landroid/support/v7/appcompat/R$id;->top_action_bar:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarTop:Landroid/view/View;

    .line 99
    sget v0, Landroid/support/v7/appcompat/R$id;->action_bar_container:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ActionBarContainer;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 100
    sget v0, Landroid/support/v7/appcompat/R$id;->action_bar:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ActionBarView;

    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;

    .line 101
    sget v0, Landroid/support/v7/appcompat/R$id;->split_action_bar:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarBottom:Landroid/view/View;

    .line 103
    :cond_1
    return-void
.end method

.method public setActionBar(Landroid/support/v7/app/ActionBar;)V
    .locals 0
    .parameter "impl"

    .prologue
    .line 66
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBar:Landroid/support/v7/app/ActionBar;

    .line 67
    return-void
.end method

*/}
