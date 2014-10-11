package android.support.v4.view; class PagerTabStrip { void a() { int a;
a=0;// .class public Landroid/support/v4/view/PagerTabStrip;
a=0;// .super Landroid/support/v4/view/PagerTitleStrip;
a=0;// .source "PagerTabStrip.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final FULL_UNDERLINE_HEIGHT:I = 0x1
a=0;// 
a=0;// .field private static final INDICATOR_HEIGHT:I = 0x3
a=0;// 
a=0;// .field private static final MIN_PADDING_BOTTOM:I = 0x6
a=0;// 
a=0;// .field private static final MIN_STRIP_HEIGHT:I = 0x20
a=0;// 
a=0;// .field private static final MIN_TEXT_SPACING:I = 0x40
a=0;// 
a=0;// .field private static final TAB_PADDING:I = 0x10
a=0;// 
a=0;// .field private static final TAB_SPACING:I = 0x20
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "PagerTabStrip"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDrawFullUnderline:Z
a=0;// 
a=0;// .field private mDrawFullUnderlineSet:Z
a=0;// 
a=0;// .field private mFullUnderlineHeight:I
a=0;// 
a=0;// .field private mIgnoreTap:Z
a=0;// 
a=0;// .field private mIndicatorColor:I
a=0;// 
a=0;// .field private mIndicatorHeight:I
a=0;// 
a=0;// .field private mInitialMotionX:F
a=0;// 
a=0;// .field private mInitialMotionY:F
a=0;// 
a=0;// .field private mMinPaddingBottom:I
a=0;// 
a=0;// .field private mMinStripHeight:I
a=0;// 
a=0;// .field private mMinTextSpacing:I
a=0;// 
a=0;// .field private mTabAlpha:I
a=0;// 
a=0;// .field private mTabPadding:I
a=0;// 
a=0;// .field private final mTabPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field private final mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;// .field private mTouchSlop:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/view/PagerTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTabStrip;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/high16 v3, 0x3f000000
a=0;// 
a=0;//     .line 82
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/view/PagerTitleStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 63
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTabStrip;);
a=0;//     new-instance v1, Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Paint;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     .line 64
a=0;//     new-instance v1, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 66
a=0;//     const/16 v1, 0xff
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabAlpha:I
a=0;// 
a=0;//     .line 68
a=0;//     iput-boolean v5, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
a=0;// 
a=0;//     .line 69
a=0;//     iput-boolean v5, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z
a=0;// 
a=0;//     .line 84
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTextColor:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v2, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 89
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v0, v1, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 90
a=0;//     .local v0, "density":F
a=0;//     #v0=(Integer);
a=0;//     const/high16 v1, 0x40400000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorHeight:I
a=0;// 
a=0;//     .line 91
a=0;//     const/high16 v1, 0x40c00000
a=0;// 
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinPaddingBottom:I
a=0;// 
a=0;//     .line 92
a=0;//     const/high16 v1, 0x42800000
a=0;// 
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinTextSpacing:I
a=0;// 
a=0;//     .line 93
a=0;//     const/high16 v1, 0x41800000
a=0;// 
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
a=0;// 
a=0;//     .line 94
a=0;//     const/high16 v1, 0x3f800000
a=0;// 
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mFullUnderlineHeight:I
a=0;// 
a=0;//     .line 95
a=0;//     const/high16 v1, 0x42000000
a=0;// 
a=0;//     mul-float/2addr v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     add-float/2addr v1, v3
a=0;// 
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinStripHeight:I
a=0;// 
a=0;//     .line 96
a=0;//     invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewConfiguration;);
a=0;//     invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTouchSlop:I
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0, v1, v2, v3, v4}, Landroid/support/v4/view/PagerTabStrip;->setPadding(IIII)V
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getTextSpacing()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/view/PagerTabStrip;->setTextSpacing(I)V
a=0;// 
a=0;//     .line 102
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v4/view/PagerTabStrip;->setWillNotDraw(Z)V
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v6}, Landroid/widget/TextView;->setFocusable(Z)V
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v2, Landroid/support/v4/view/PagerTabStrip$1;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/view/PagerTabStrip$1;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/view/PagerTabStrip$1;-><init>(Landroid/support/v4/view/PagerTabStrip;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerTabStrip$1;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Landroid/widget/TextView;->setFocusable(Z)V
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     new-instance v2, Landroid/support/v4/view/PagerTabStrip$2;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/view/PagerTabStrip$2;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v4/view/PagerTabStrip$2;-><init>(Landroid/support/v4/view/PagerTabStrip;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerTabStrip$2;);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 121
a=0;//     iput-boolean v6, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
a=0;// 
a=0;//     .line 123
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getDrawFullUnderline()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getMinHeight()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     invoke-super {p0}, Landroid/support/v4/view/PagerTitleStrip;->getMinHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinStripHeight:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTabIndicatorColor()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onDraw(Landroid/graphics/Canvas;)V
a=0;//     .locals 12
a=0;//     .param p1, "canvas"    # Landroid/graphics/Canvas;
a=0;// 
a=0;//     .prologue
a=0;//     const v11, 0xffffff
a=0;// 
a=0;//     .line 259
a=0;//     #v11=(Integer);
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->onDraw(Landroid/graphics/Canvas;)V
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 262
a=0;//     .local v7, "height":I
a=0;//     #v7=(Integer);
a=0;//     move v6, v7
a=0;// 
a=0;//     .line 263
a=0;//     .local v6, "bottom":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v8, v0, v1
a=0;// 
a=0;//     .line 264
a=0;//     .local v8, "left":I
a=0;//     #v8=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Landroid/widget/TextView;->getRight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
a=0;// 
a=0;//     add-int v9, v0, v1
a=0;// 
a=0;//     .line 265
a=0;//     .local v9, "right":I
a=0;//     #v9=(Integer);
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorHeight:I
a=0;// 
a=0;//     sub-int v10, v6, v0
a=0;// 
a=0;//     .line 267
a=0;//     .local v10, "top":I
a=0;//     #v10=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabAlpha:I
a=0;// 
a=0;//     shl-int/lit8 v1, v1, 0x18
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v2, v11
a=0;// 
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 268
a=0;//     int-to-float v1, v8
a=0;// 
a=0;//     #v1=(Float);
a=0;//     int-to-float v2, v10
a=0;// 
a=0;//     #v2=(Float);
a=0;//     int-to-float v3, v9
a=0;// 
a=0;//     #v3=(Float);
a=0;//     int-to-float v4, v6
a=0;// 
a=0;//     #v4=(Float);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Paint;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 270
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 271
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     const/high16 v1, -0x1000000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/2addr v2, v11
a=0;// 
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 272
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     int-to-float v1, v0
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mFullUnderlineHeight:I
a=0;// 
a=0;//     sub-int v0, v7, v0
a=0;// 
a=0;//     int-to-float v2, v0
a=0;// 
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v0, v3
a=0;// 
a=0;//     int-to-float v3, v0
a=0;// 
a=0;//     #v3=(Float);
a=0;//     int-to-float v4, v7
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     move-object v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Canvas;);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V
a=0;// 
a=0;//     .line 275
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTouchEvent(Landroid/view/MotionEvent;)Z
a=0;//     .locals 6
a=0;//     .param p1, "ev"    # Landroid/view/MotionEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 222
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 223
a=0;//     .local v0, "action":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-boolean v5, p0, Landroid/support/v4/view/PagerTabStrip;->mIgnoreTap:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 254
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v5=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 229
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 230
a=0;//     .local v1, "x":F
a=0;//     #v1=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 231
a=0;//     .local v2, "y":F
a=0;//     #v2=(Float);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 254
a=0;//     #v3=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 233
a=0;//     :pswitch_0
a=0;//     #v3=(Null);
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionX:F
a=0;// 
a=0;//     .line 234
a=0;//     iput v2, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionY:F
a=0;// 
a=0;//     .line 235
a=0;//     iput-boolean v3, p0, Landroid/support/v4/view/PagerTabStrip;->mIgnoreTap:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 239
a=0;//     :pswitch_1
a=0;//     iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionX:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float v3, v1, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTouchSlop:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     cmpl-float v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gtz v3, :cond_2
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionY:F
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-float v3, v2, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     invoke-static {v3}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTouchSlop:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-float v5, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     cmpl-float v3, v3, v5
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     .line 241
a=0;//     :cond_2
a=0;//     iput-boolean v4, p0, Landroid/support/v4/view/PagerTabStrip;->mIgnoreTap:Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 246
a=0;//     :pswitch_2
a=0;//     #v3=(Null);v5=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v3}, Landroid/widget/TextView;->getLeft()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v3, v5
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpg-float v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-gez v3, :cond_3
a=0;// 
a=0;//     .line 247
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 248
a=0;//     :cond_3
a=0;//     #v3=(Byte);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v3}, Landroid/widget/TextView;->getRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
a=0;// 
a=0;//     add-int/2addr v3, v5
a=0;// 
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     cmpl-float v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-lez v3, :cond_1
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 231
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setBackgroundColor(I)V
a=0;//     .locals 1
a=0;//     .param p1, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 178
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundColor(I)V
a=0;// 
a=0;//     .line 179
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     const/high16 v0, -0x1000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/2addr v0, p1
a=0;// 
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 180
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 171
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 172
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
a=0;// 
a=0;//     .line 174
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 172
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setBackgroundResource(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 187
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 188
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
a=0;// 
a=0;//     .line 190
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 188
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDrawFullUnderline(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "drawFull"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     iput-boolean p1, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z
a=0;// 
a=0;//     .line 200
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z
a=0;// 
a=0;//     .line 201
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->invalidate()V
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPadding(IIII)V
a=0;//     .locals 1
a=0;//     .param p1, "left"    # I
a=0;//     .param p2, "top"    # I
a=0;//     .param p3, "right"    # I
a=0;//     .param p4, "bottom"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mMinPaddingBottom:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p4, v0, :cond_0
a=0;// 
a=0;//     .line 155
a=0;//     iget p4, p0, Landroid/support/v4/view/PagerTabStrip;->mMinPaddingBottom:I
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/view/PagerTitleStrip;->setPadding(IIII)V
a=0;// 
a=0;//     .line 158
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTabIndicatorColor(I)V
a=0;//     .locals 2
a=0;//     .param p1, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
a=0;// 
a=0;//     .line 132
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Paint;);
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
a=0;// 
a=0;//     .line 133
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->invalidate()V
a=0;// 
a=0;//     .line 134
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTabIndicatorColorResource(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/view/PagerTabStrip;->setTabIndicatorColor(I)V
a=0;// 
a=0;//     .line 143
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTextSpacing(I)V
a=0;//     .locals 1
a=0;//     .param p1, "textSpacing"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mMinTextSpacing:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge p1, v0, :cond_0
a=0;// 
a=0;//     .line 163
a=0;//     iget p1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinTextSpacing:I
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setTextSpacing(I)V
a=0;// 
a=0;//     .line 166
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method updateTextPositions(IFZ)V
a=0;//     .locals 7
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "positionOffset"    # F
a=0;//     .param p3, "force"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     iget-object v2, p0, Landroid/support/v4/view/PagerTabStrip;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 280
a=0;//     .local v2, "r":Landroid/graphics/Rect;
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 281
a=0;//     .local v0, "bottom":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v5}, Landroid/widget/TextView;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int v1, v5, v6
a=0;// 
a=0;//     .line 282
a=0;//     .local v1, "left":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v5}, Landroid/widget/TextView;->getRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
a=0;// 
a=0;//     add-int v3, v5, v6
a=0;// 
a=0;//     .line 283
a=0;//     .local v3, "right":I
a=0;//     #v3=(Integer);
a=0;//     iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorHeight:I
a=0;// 
a=0;//     sub-int v4, v0, v5
a=0;// 
a=0;//     .line 285
a=0;//     .local v4, "top":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v1, v4, v3, v0}, Landroid/graphics/Rect;->set(IIII)V
a=0;// 
a=0;//     .line 287
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
a=0;// 
a=0;//     .line 288
a=0;//     const/high16 v5, 0x3f000000
a=0;// 
a=0;//     sub-float v5, p2, v5
a=0;// 
a=0;//     #v5=(Float);
a=0;//     invoke-static {v5}, Ljava/lang/Math;->abs(F)F
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     const/high16 v6, 0x40000000
a=0;// 
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     const/high16 v6, 0x437f0000
a=0;// 
a=0;//     mul-float/2addr v5, v6
a=0;// 
a=0;//     float-to-int v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iput v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabAlpha:I
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v5}, Landroid/widget/TextView;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
a=0;// 
a=0;//     sub-int v1, v5, v6
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v5}, Landroid/widget/TextView;->getRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I
a=0;// 
a=0;//     add-int v3, v5, v6
a=0;// 
a=0;//     .line 292
a=0;//     invoke-virtual {v2, v1, v4, v3, v0}, Landroid/graphics/Rect;->union(IIII)V
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/view/PagerTabStrip;->invalidate(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 295
a=0;//     return-void
a=0;// .end method
}}
