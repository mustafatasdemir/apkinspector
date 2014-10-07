package android.support.v4.view; class PagerTabStrip {/*

.class public Landroid/support/v4/view/PagerTabStrip;
.super Landroid/support/v4/view/PagerTitleStrip;
.source "PagerTabStrip.java"


# static fields
.field private static final FULL_UNDERLINE_HEIGHT:I = 0x1

.field private static final INDICATOR_HEIGHT:I = 0x3

.field private static final MIN_PADDING_BOTTOM:I = 0x6

.field private static final MIN_STRIP_HEIGHT:I = 0x20

.field private static final MIN_TEXT_SPACING:I = 0x40

.field private static final TAB_PADDING:I = 0x10

.field private static final TAB_SPACING:I = 0x20

.field private static final TAG:Ljava/lang/String; = "PagerTabStrip"


# instance fields
.field private mDrawFullUnderline:Z

.field private mDrawFullUnderlineSet:Z

.field private mFullUnderlineHeight:I

.field private mIgnoreTap:Z

.field private mIndicatorColor:I

.field private mIndicatorHeight:I

.field private mInitialMotionX:F

.field private mInitialMotionY:F

.field private mMinPaddingBottom:I

.field private mMinStripHeight:I

.field private mMinTextSpacing:I

.field private mTabAlpha:I

.field private mTabPadding:I

.field private final mTabPaint:Landroid/graphics/Paint;

.field private final mTempRect:Landroid/graphics/Rect;

.field private mTouchSlop:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 78
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v4/view/PagerTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 79
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v6, 0x1

    #v6=(One);
    const/4 v5, 0x0

    #v5=(Null);
    const/high16 v3, 0x3f00

    .line 82
    #v3=(Integer);
    invoke-direct {p0, p1, p2}, Landroid/support/v4/view/PagerTitleStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 63
    #p0=(Reference);
    new-instance v1, Landroid/graphics/Paint;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;

    .line 64
    new-instance v1, Landroid/graphics/Rect;

    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/graphics/Rect;-><init>()V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTempRect:Landroid/graphics/Rect;

    .line 66
    const/16 v1, 0xff

    #v1=(PosShort);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabAlpha:I

    .line 68
    iput-boolean v5, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z

    .line 69
    iput-boolean v5, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z

    .line 84
    iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTextColor:I

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I

    .line 85
    iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V

    .line 89
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v0, v1, Landroid/util/DisplayMetrics;->density:F

    .line 90
    .local v0, density:F
    #v0=(Integer);
    const/high16 v1, 0x4040

    #v1=(Integer);
    mul-float/2addr v1, v0

    #v1=(Float);
    add-float/2addr v1, v3

    float-to-int v1, v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorHeight:I

    .line 91
    const/high16 v1, 0x40c0

    mul-float/2addr v1, v0

    #v1=(Float);
    add-float/2addr v1, v3

    float-to-int v1, v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinPaddingBottom:I

    .line 92
    const/high16 v1, 0x4280

    mul-float/2addr v1, v0

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinTextSpacing:I

    .line 93
    const/high16 v1, 0x4180

    mul-float/2addr v1, v0

    #v1=(Float);
    add-float/2addr v1, v3

    float-to-int v1, v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I

    .line 94
    const/high16 v1, 0x3f80

    mul-float/2addr v1, v0

    #v1=(Float);
    add-float/2addr v1, v3

    float-to-int v1, v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mFullUnderlineHeight:I

    .line 95
    const/high16 v1, 0x4200

    mul-float/2addr v1, v0

    #v1=(Float);
    add-float/2addr v1, v3

    float-to-int v1, v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinStripHeight:I

    .line 96
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTouchSlop:I

    .line 99
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingLeft()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingTop()I

    move-result v2

    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingRight()I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingBottom()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {p0, v1, v2, v3, v4}, Landroid/support/v4/view/PagerTabStrip;->setPadding(IIII)V

    .line 100
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getTextSpacing()I

    move-result v1

    invoke-virtual {p0, v1}, Landroid/support/v4/view/PagerTabStrip;->setTextSpacing(I)V

    .line 102
    invoke-virtual {p0, v5}, Landroid/support/v4/view/PagerTabStrip;->setWillNotDraw(Z)V

    .line 104
    iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mPrevText:Landroid/widget/TextView;

    #v1=(Reference);
    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setFocusable(Z)V

    .line 105
    iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mPrevText:Landroid/widget/TextView;

    new-instance v2, Landroid/support/v4/view/PagerTabStrip$1;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/view/PagerTabStrip$1;-><init>(Landroid/support/v4/view/PagerTabStrip;)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 112
    iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {v1, v6}, Landroid/widget/TextView;->setFocusable(Z)V

    .line 113
    iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip;->mNextText:Landroid/widget/TextView;

    new-instance v2, Landroid/support/v4/view/PagerTabStrip$2;

    #v2=(UninitRef);
    invoke-direct {v2, p0}, Landroid/support/v4/view/PagerTabStrip$2;-><init>(Landroid/support/v4/view/PagerTabStrip;)V

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 120
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_0

    .line 121
    iput-boolean v6, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z

    .line 123
    :cond_0
    return-void
.end method


# virtual methods
.method public getDrawFullUnderline()Z
    .locals 1

    .prologue
    .line 212
    iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z

    #v0=(Boolean);
    return v0
.end method

.method getMinHeight()I
    .locals 2

    .prologue
    .line 217
    invoke-super {p0}, Landroid/support/v4/view/PagerTitleStrip;->getMinHeight()I

    move-result v0

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinStripHeight:I

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    return v0
.end method

.method public getTabIndicatorColor()I
    .locals 1

    .prologue
    .line 149
    iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I

    #v0=(Integer);
    return v0
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 12
    .parameter "canvas"

    .prologue
    const v11, 0xffffff

    .line 259
    #v11=(Integer);
    invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->onDraw(Landroid/graphics/Canvas;)V

    .line 261
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getHeight()I

    move-result v7

    .line 262
    .local v7, height:I
    #v7=(Integer);
    move v6, v7

    .line 263
    .local v6, bottom:I
    #v6=(Integer);
    iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/TextView;->getLeft()I

    move-result v0

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I

    #v1=(Integer);
    sub-int v8, v0, v1

    .line 264
    .local v8, left:I
    #v8=(Integer);
    iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/TextView;->getRight()I

    move-result v0

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I

    add-int v9, v0, v1

    .line 265
    .local v9, right:I
    #v9=(Integer);
    iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorHeight:I

    sub-int v10, v6, v0

    .line 267
    .local v10, top:I
    #v10=(Integer);
    iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mTabAlpha:I

    shl-int/lit8 v1, v1, 0x18

    iget v2, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I

    #v2=(Integer);
    and-int/2addr v2, v11

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 268
    int-to-float v1, v8

    #v1=(Float);
    int-to-float v2, v10

    #v2=(Float);
    int-to-float v3, v9

    #v3=(Float);
    int-to-float v4, v6

    #v4=(Float);
    iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;

    #v5=(Reference);
    move-object v0, p1

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 270
    iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 271
    iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;

    #v0=(Reference);
    const/high16 v1, -0x100

    #v1=(Integer);
    iget v2, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I

    #v2=(Integer);
    and-int/2addr v2, v11

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 272
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingLeft()I

    move-result v0

    #v0=(Integer);
    int-to-float v1, v0

    #v1=(Float);
    iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mFullUnderlineHeight:I

    sub-int v0, v7, v0

    int-to-float v2, v0

    #v2=(Float);
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getWidth()I

    move-result v0

    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getPaddingRight()I

    move-result v3

    #v3=(Integer);
    sub-int/2addr v0, v3

    int-to-float v3, v0

    #v3=(Float);
    int-to-float v4, v7

    iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;

    move-object v0, p1

    #v0=(Reference);
    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 275
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 6
    .parameter "ev"

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, 0x0

    .line 222
    #v3=(Null);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    .line 223
    .local v0, action:I
    #v0=(Integer);
    if-eqz v0, :cond_0

    iget-boolean v5, p0, Landroid/support/v4/view/PagerTabStrip;->mIgnoreTap:Z

    #v5=(Boolean);
    if-eqz v5, :cond_0

    .line 254
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v5=(Conflicted);
    return v3

    .line 229
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Null);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v1

    .line 230
    .local v1, x:F
    #v1=(Float);
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v2

    .line 231
    .local v2, y:F
    #v2=(Float);
    packed-switch v0, :pswitch_data_0

    :cond_1
    :goto_1
    #v3=(Conflicted);
    move v3, v4

    .line 254
    #v3=(One);
    goto :goto_0

    .line 233
    :pswitch_0
    #v3=(Null);
    iput v1, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionX:F

    .line 234
    iput v2, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionY:F

    .line 235
    iput-boolean v3, p0, Landroid/support/v4/view/PagerTabStrip;->mIgnoreTap:Z

    goto :goto_1

    .line 239
    :pswitch_1
    iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionX:F

    #v3=(Integer);
    sub-float v3, v1, v3

    #v3=(Float);
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTouchSlop:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    cmpl-float v3, v3, v5

    #v3=(Byte);
    if-gtz v3, :cond_2

    iget v3, p0, Landroid/support/v4/view/PagerTabStrip;->mInitialMotionY:F

    #v3=(Integer);
    sub-float v3, v2, v3

    #v3=(Float);
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTouchSlop:I

    #v5=(Integer);
    int-to-float v5, v5

    #v5=(Float);
    cmpl-float v3, v3, v5

    #v3=(Byte);
    if-lez v3, :cond_1

    .line 241
    :cond_2
    iput-boolean v4, p0, Landroid/support/v4/view/PagerTabStrip;->mIgnoreTap:Z

    goto :goto_1

    .line 246
    :pswitch_2
    #v3=(Null);v5=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/widget/TextView;->getLeft()I

    move-result v3

    #v3=(Integer);
    iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I

    #v5=(Integer);
    sub-int/2addr v3, v5

    int-to-float v3, v3

    #v3=(Float);
    cmpg-float v3, v1, v3

    #v3=(Byte);
    if-gez v3, :cond_3

    .line 247
    iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;

    #v3=(Reference);
    iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v5

    #v5=(Integer);
    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v3, v5}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_1

    .line 248
    :cond_3
    #v3=(Byte);
    iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/widget/TextView;->getRight()I

    move-result v3

    #v3=(Integer);
    iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I

    add-int/2addr v3, v5

    int-to-float v3, v3

    #v3=(Float);
    cmpl-float v3, v1, v3

    #v3=(Byte);
    if-lez v3, :cond_1

    .line 249
    iget-object v3, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;

    #v3=(Reference);
    iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v5

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x1

    invoke-virtual {v3, v5}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    goto :goto_1

    .line 231
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public setBackgroundColor(I)V
    .locals 1
    .parameter "color"

    .prologue
    .line 178
    invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundColor(I)V

    .line 179
    iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 180
    const/high16 v0, -0x100

    #v0=(Integer);
    and-int/2addr v0, p1

    if-nez v0, :cond_1

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z

    .line 182
    :cond_0
    return-void

    .line 180
    :cond_1
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "d"

    .prologue
    .line 170
    invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 171
    iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 172
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z

    .line 174
    :cond_0
    return-void

    .line 172
    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setBackgroundResource(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 186
    invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setBackgroundResource(I)V

    .line 187
    iget-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 188
    if-nez p1, :cond_1

    const/4 v0, 0x1

    :goto_0
    iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z

    .line 190
    :cond_0
    return-void

    .line 188
    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setDrawFullUnderline(Z)V
    .locals 1
    .parameter "drawFull"

    .prologue
    .line 199
    iput-boolean p1, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderline:Z

    .line 200
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/view/PagerTabStrip;->mDrawFullUnderlineSet:Z

    .line 201
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->invalidate()V

    .line 202
    return-void
.end method

.method public setPadding(IIII)V
    .locals 1
    .parameter "left"
    .parameter "top"
    .parameter "right"
    .parameter "bottom"

    .prologue
    .line 154
    iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mMinPaddingBottom:I

    #v0=(Integer);
    if-ge p4, v0, :cond_0

    .line 155
    iget p4, p0, Landroid/support/v4/view/PagerTabStrip;->mMinPaddingBottom:I

    .line 157
    :cond_0
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/view/PagerTitleStrip;->setPadding(IIII)V

    .line 158
    return-void
.end method

.method public setTabIndicatorColor(I)V
    .locals 2
    .parameter "color"

    .prologue
    .line 131
    iput p1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I

    .line 132
    iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPaint:Landroid/graphics/Paint;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorColor:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 133
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->invalidate()V

    .line 134
    return-void
.end method

.method public setTabIndicatorColorResource(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 142
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getContext()Landroid/content/Context;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getColor(I)I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v4/view/PagerTabStrip;->setTabIndicatorColor(I)V

    .line 143
    return-void
.end method

.method public setTextSpacing(I)V
    .locals 1
    .parameter "textSpacing"

    .prologue
    .line 162
    iget v0, p0, Landroid/support/v4/view/PagerTabStrip;->mMinTextSpacing:I

    #v0=(Integer);
    if-ge p1, v0, :cond_0

    .line 163
    iget p1, p0, Landroid/support/v4/view/PagerTabStrip;->mMinTextSpacing:I

    .line 165
    :cond_0
    invoke-super {p0, p1}, Landroid/support/v4/view/PagerTitleStrip;->setTextSpacing(I)V

    .line 166
    return-void
.end method

.method updateTextPositions(IFZ)V
    .locals 7
    .parameter "position"
    .parameter "positionOffset"
    .parameter "force"

    .prologue
    .line 279
    iget-object v2, p0, Landroid/support/v4/view/PagerTabStrip;->mTempRect:Landroid/graphics/Rect;

    .line 280
    .local v2, r:Landroid/graphics/Rect;
    #v2=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTabStrip;->getHeight()I

    move-result v0

    .line 281
    .local v0, bottom:I
    #v0=(Integer);
    iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/widget/TextView;->getLeft()I

    move-result v5

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I

    #v6=(Integer);
    sub-int v1, v5, v6

    .line 282
    .local v1, left:I
    #v1=(Integer);
    iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/widget/TextView;->getRight()I

    move-result v5

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I

    add-int v3, v5, v6

    .line 283
    .local v3, right:I
    #v3=(Integer);
    iget v5, p0, Landroid/support/v4/view/PagerTabStrip;->mIndicatorHeight:I

    sub-int v4, v0, v5

    .line 285
    .local v4, top:I
    #v4=(Integer);
    invoke-virtual {v2, v1, v4, v3, v0}, Landroid/graphics/Rect;->set(IIII)V

    .line 287
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V

    .line 288
    const/high16 v5, 0x3f00

    sub-float v5, p2, v5

    #v5=(Float);
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    move-result v5

    const/high16 v6, 0x4000

    mul-float/2addr v5, v6

    const/high16 v6, 0x437f

    mul-float/2addr v5, v6

    float-to-int v5, v5

    #v5=(Integer);
    iput v5, p0, Landroid/support/v4/view/PagerTabStrip;->mTabAlpha:I

    .line 290
    iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/widget/TextView;->getLeft()I

    move-result v5

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I

    sub-int v1, v5, v6

    .line 291
    iget-object v5, p0, Landroid/support/v4/view/PagerTabStrip;->mCurrText:Landroid/widget/TextView;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/widget/TextView;->getRight()I

    move-result v5

    #v5=(Integer);
    iget v6, p0, Landroid/support/v4/view/PagerTabStrip;->mTabPadding:I

    add-int v3, v5, v6

    .line 292
    invoke-virtual {v2, v1, v4, v3, v0}, Landroid/graphics/Rect;->union(IIII)V

    .line 294
    invoke-virtual {p0, v2}, Landroid/support/v4/view/PagerTabStrip;->invalidate(Landroid/graphics/Rect;)V

    .line 295
    return-void
.end method

*/}
