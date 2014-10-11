package android.support.v7.internal.widget; class ActionBarOverlayLayout { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// .source "ActionBarOverlayLayout.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final mActionBarSizeAttr:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;// .field private mActionBarBottom:Landroid/view/View;
a=0;// 
a=0;// .field private mActionBarHeight:I
a=0;// 
a=0;// .field private mActionBarTop:Landroid/view/View;
a=0;// 
a=0;// .field private mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;// .field private mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;// .field private mContent:Landroid/view/View;
a=0;// 
a=0;// .field private final mZeroRect:Landroid/graphics/Rect;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget v2, Landroid/support/v7/appcompat/R$attr;->actionBarSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarSizeAttr:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 50
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarOverlayLayout;);
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mZeroRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 51
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 52
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 55
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 43
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarOverlayLayout;);
a=0;//     new-instance v0, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v0, v1, v1, v1, v1}, Landroid/graphics/Rect;-><init>(IIII)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mZeroRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 56
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->init(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 57
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private applyInsets(Landroid/view/View;Landroid/graphics/Rect;ZZZZ)Z
a=0;//     .locals 4
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "insets"    # Landroid/graphics/Rect;
a=0;//     .param p3, "left"    # Z
a=0;//     .param p4, "top"    # Z
a=0;//     .param p5, "bottom"    # Z
a=0;//     .param p6, "right"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 72
a=0;//     .local v0, "changed":Z
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/widget/FrameLayout$LayoutParams;
a=0;// 
a=0;//     .line 73
a=0;//     .local v1, "lp":Landroid/widget/FrameLayout$LayoutParams;
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p2, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_0
a=0;// 
a=0;//     .line 74
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 75
a=0;//     #v0=(One);
a=0;//     iget v2, p2, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     .line 77
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz p4, :cond_1
a=0;// 
a=0;//     iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p2, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_1
a=0;// 
a=0;//     .line 78
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 79
a=0;//     #v0=(One);
a=0;//     iget v2, p2, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz p6, :cond_2
a=0;// 
a=0;//     iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p2, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_2
a=0;// 
a=0;//     .line 82
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 83
a=0;//     #v0=(One);
a=0;//     iget v2, p2, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     .line 85
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-eqz p5, :cond_3
a=0;// 
a=0;//     iget v2, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p2, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_3
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 87
a=0;//     #v0=(One);
a=0;//     iget v2, p2, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     iput v2, v1, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     .line 89
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/content/Context;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget-object v2, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarSizeAttr:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 61
a=0;//     .local v0, "ta":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarHeight:I
a=0;// 
a=0;//     .line 62
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 63
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method pullChildren()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContent:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 94
a=0;//     sget v0, Landroid/support/v7/appcompat/R$id;->action_bar_activity_content:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContent:Landroid/view/View;
a=0;// 
a=0;//     .line 95
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContent:Landroid/view/View;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 96
a=0;//     const v0, 0x1020002
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContent:Landroid/view/View;
a=0;// 
a=0;//     .line 98
a=0;//     :cond_0
a=0;//     sget v0, Landroid/support/v7/appcompat/R$id;->top_action_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarTop:Landroid/view/View;
a=0;// 
a=0;//     .line 99
a=0;//     sget v0, Landroid/support/v7/appcompat/R$id;->action_bar_container:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .line 100
a=0;//     sget v0, Landroid/support/v7/appcompat/R$id;->action_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .line 101
a=0;//     sget v0, Landroid/support/v7/appcompat/R$id;->split_action_bar:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBarBottom:Landroid/view/View;
a=0;// 
a=0;//     .line 103
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setActionBar(Landroid/support/v7/app/ActionBar;)V
a=0;//     .locals 0
a=0;//     .param p1, "impl"    # Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// .end method
}}
