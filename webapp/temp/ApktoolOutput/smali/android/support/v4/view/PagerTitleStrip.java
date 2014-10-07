package android.support.v4.view; class PagerTitleStrip {/*

.class public Landroid/support/v4/view/PagerTitleStrip;
.super Landroid/view/ViewGroup;
.source "PagerTitleStrip.java"

# interfaces
.implements Landroid/support/v4/view/ViewPager$Decor;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/PagerTitleStrip$1;,
        Landroid/support/v4/view/PagerTitleStrip$PageListener;,
        Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;,
        Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;,
        Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
    }
.end annotation


# static fields
.field private static final ATTRS:[I = null

.field private static final IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl; = null

.field private static final SIDE_ALPHA:F = 0.6f

.field private static final TAG:Ljava/lang/String; = "PagerTitleStrip"

.field private static final TEXT_ATTRS:[I = null

.field private static final TEXT_SPACING:I = 0x10


# instance fields
.field mCurrText:Landroid/widget/TextView;

.field private mGravity:I

.field private mLastKnownCurrentPage:I

.field private mLastKnownPositionOffset:F

.field mNextText:Landroid/widget/TextView;

.field private mNonPrimaryAlpha:I

.field private final mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;

.field mPager:Landroid/support/v4/view/ViewPager;

.field mPrevText:Landroid/widget/TextView;

.field private mScaledTextSpacing:I

.field mTextColor:I

.field private mUpdatingPositions:Z

.field private mUpdatingText:Z

.field private mWatchingAdapter:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/support/v4/view/PagerAdapter;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 65
    const/4 v0, 0x4

    #v0=(PosByte);
    new-array v0, v0, [I

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->ATTRS:[I

    .line 72
    const/4 v0, 0x1

    #v0=(One);
    new-array v0, v0, [I

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const v2, 0x101038c

    #v2=(Integer);
    aput v2, v0, v1

    sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->TEXT_ATTRS:[I

    .line 100
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xe

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 101
    new-instance v0, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;

    .line 105
    :goto_0
    return-void

    .line 103
    :cond_0
    #v0=(Integer);
    new-instance v0, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;

    goto :goto_0

    .line 65
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);
    nop

    :array_0
    .array-data 0x4
        0x34t 0x0t 0x1t 0x1t
        0x95t 0x0t 0x1t 0x1t
        0x98t 0x0t 0x1t 0x1t
        0xaft 0x0t 0x1t 0x1t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 112
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v4/view/PagerTitleStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 113
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 11
    .parameter "context"
    .parameter "attrs"

    .prologue
    const/4 v10, 0x2

    #v10=(PosByte);
    const/4 v9, 0x0

    .line 116
    #v9=(Null);
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    #p0=(Reference);
    const/4 v7, -0x1

    #v7=(Byte);
    iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I

    .line 54
    const/high16 v7, -0x4080

    #v7=(Integer);
    iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F

    .line 61
    new-instance v7, Landroid/support/v4/view/PagerTitleStrip$PageListener;

    #v7=(UninitRef);
    const/4 v8, 0x0

    #v8=(Null);
    invoke-direct {v7, p0, v8}, Landroid/support/v4/view/PagerTitleStrip$PageListener;-><init>(Landroid/support/v4/view/PagerTitleStrip;Landroid/support/v4/view/PagerTitleStrip$1;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;

    .line 118
    new-instance v7, Landroid/widget/TextView;

    #v7=(UninitRef);
    invoke-direct {v7, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V

    .line 119
    new-instance v7, Landroid/widget/TextView;

    #v7=(UninitRef);
    invoke-direct {v7, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V

    .line 120
    new-instance v7, Landroid/widget/TextView;

    #v7=(UninitRef);
    invoke-direct {v7, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    #v7=(Reference);
    iput-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {p0, v7}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V

    .line 122
    sget-object v7, Landroid/support/v4/view/PagerTitleStrip;->ATTRS:[I

    invoke-virtual {p1, p2, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 123
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    invoke-virtual {v0, v9, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v4

    .line 124
    .local v4, textAppearance:I
    #v4=(Integer);
    if-eqz v4, :cond_0

    .line 125
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    invoke-virtual {v7, p1, v4}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 126
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    invoke-virtual {v7, p1, v4}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 127
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {v7, p1, v4}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 129
    :cond_0
    const/4 v7, 0x1

    #v7=(One);
    invoke-virtual {v0, v7, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v6

    .line 130
    .local v6, textSize:I
    #v6=(Integer);
    if-eqz v6, :cond_1

    .line 131
    int-to-float v7, v6

    #v7=(Float);
    invoke-virtual {p0, v9, v7}, Landroid/support/v4/view/PagerTitleStrip;->setTextSize(IF)V

    .line 133
    :cond_1
    invoke-virtual {v0, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_2

    .line 134
    invoke-virtual {v0, v10, v9}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    .line 135
    .local v5, textColor:I
    #v5=(Integer);
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    #v7=(Reference);
    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 136
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 137
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 139
    .end local v5           #textColor:I
    :cond_2
    #v5=(Conflicted);v7=(Conflicted);
    const/4 v7, 0x3

    #v7=(PosByte);
    const/16 v8, 0x50

    #v8=(PosByte);
    invoke-virtual {v0, v7, v8}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v7

    #v7=(Integer);
    iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I

    .line 140
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 142
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result v7

    #v7=(Integer);
    iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I

    .line 143
    const v7, 0x3f19999a

    invoke-virtual {p0, v7}, Landroid/support/v4/view/PagerTitleStrip;->setNonPrimaryAlpha(F)V

    .line 145
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    #v7=(Reference);
    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    #v8=(Reference);
    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 146
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 147
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v7, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 149
    const/4 v1, 0x0

    .line 150
    .local v1, allCaps:Z
    #v1=(Null);
    if-eqz v4, :cond_3

    .line 151
    sget-object v7, Landroid/support/v4/view/PagerTitleStrip;->TEXT_ATTRS:[I

    invoke-virtual {p1, v4, v7}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;

    move-result-object v3

    .line 152
    .local v3, ta:Landroid/content/res/TypedArray;
    #v3=(Reference);
    invoke-virtual {v3, v9, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    .line 153
    #v1=(Boolean);
    invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V

    .line 156
    .end local v3           #ta:Landroid/content/res/TypedArray;
    :cond_3
    #v3=(Conflicted);
    if-eqz v1, :cond_4

    .line 157
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    invoke-static {v7}, Landroid/support/v4/view/PagerTitleStrip;->setSingleLineAllCaps(Landroid/widget/TextView;)V

    .line 158
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    invoke-static {v7}, Landroid/support/v4/view/PagerTitleStrip;->setSingleLineAllCaps(Landroid/widget/TextView;)V

    .line 159
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-static {v7}, Landroid/support/v4/view/PagerTitleStrip;->setSingleLineAllCaps(Landroid/widget/TextView;)V

    .line 166
    :goto_0
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v7

    iget v2, v7, Landroid/util/DisplayMetrics;->density:F

    .line 167
    .local v2, density:F
    #v2=(Integer);
    const/high16 v7, 0x4180

    #v7=(Integer);
    mul-float/2addr v7, v2

    #v7=(Float);
    float-to-int v7, v7

    #v7=(Integer);
    iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I

    .line 168
    return-void

    .line 161
    .end local v2           #density:F
    :cond_4
    #v2=(Uninit);v7=(Reference);
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/widget/TextView;->setSingleLine()V

    .line 162
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/widget/TextView;->setSingleLine()V

    .line 163
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {v7}, Landroid/widget/TextView;->setSingleLine()V

    goto :goto_0
.end method

.method static synthetic access$100(Landroid/support/v4/view/PagerTitleStrip;)F
    .locals 1
    .parameter "x0"

    .prologue
    .line 45
    iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F

    #v0=(Integer);
    return v0
.end method

.method private static setSingleLineAllCaps(Landroid/widget/TextView;)V
    .locals 1
    .parameter "text"

    .prologue
    .line 108
    sget-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;->setSingleLineAllCaps(Landroid/widget/TextView;)V

    .line 109
    return-void
.end method


# virtual methods
.method getMinHeight()I
    .locals 2

    .prologue
    .line 462
    const/4 v1, 0x0

    .line 463
    .local v1, minHeight:I
    #v1=(Null);
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 464
    .local v0, bg:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 465
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    .line 467
    :cond_0
    #v1=(Integer);
    return v1
.end method

.method public getTextSpacing()I
    .locals 1

    .prologue
    .line 184
    iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I

    #v0=(Integer);
    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 5

    .prologue
    .line 242
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 244
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    .line 245
    .local v2, parent:Landroid/view/ViewParent;
    #v2=(Reference);
    instance-of v3, v2, Landroid/support/v4/view/ViewPager;

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 246
    new-instance v3, Ljava/lang/IllegalStateException;

    #v3=(UninitRef);
    const-string v4, "PagerTitleStrip must be a direct child of a ViewPager."

    #v4=(Reference);
    invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v3=(Reference);
    throw v3

    :cond_0
    #v3=(Boolean);v4=(Uninit);
    move-object v1, v2

    .line 250
    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager;

    .line 251
    .local v1, pager:Landroid/support/v4/view/ViewPager;
    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    .line 253
    .local v0, adapter:Landroid/support/v4/view/PagerAdapter;
    #v0=(Reference);
    iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;

    #v3=(Reference);
    invoke-virtual {v1, v3}, Landroid/support/v4/view/ViewPager;->setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    .line 254
    iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;

    invoke-virtual {v1, v3}, Landroid/support/v4/view/ViewPager;->setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V

    .line 255
    iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    .line 256
    iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;

    if-eqz v3, :cond_1

    iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;

    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/support/v4/view/PagerAdapter;

    :goto_0
    invoke-virtual {p0, v3, v0}, Landroid/support/v4/view/PagerTitleStrip;->updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V

    .line 257
    return-void

    .line 256
    :cond_1
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_0
.end method

.method protected onDetachedFromWindow()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 261
    #v1=(Null);
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 262
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 263
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v0

    invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/PagerTitleStrip;->updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V

    .line 264
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;

    .line 265
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V

    .line 266
    iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    .line 268
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 3
    .parameter "changed"
    .parameter "l"
    .parameter "t"
    .parameter "r"
    .parameter "b"

    .prologue
    const/4 v0, 0x0

    .line 455
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 456
    iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F

    #v1=(Integer);
    cmpl-float v1, v1, v0

    #v1=(Byte);
    if-ltz v1, :cond_0

    iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F

    .line 457
    .local v0, offset:F
    :cond_0
    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {p0, v1, v0, v2}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V

    .line 459
    .end local v0           #offset:F
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method protected onMeasure(II)V
    .locals 12
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 422
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v8

    .line 423
    .local v8, widthMode:I
    #v8=(Integer);
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    .line 424
    .local v3, heightMode:I
    #v3=(Integer);
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v9

    .line 425
    .local v9, widthSize:I
    #v9=(Integer);
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v4

    .line 427
    .local v4, heightSize:I
    #v4=(Integer);
    const/high16 v10, 0x4000

    #v10=(Integer);
    if-eq v8, v10, :cond_0

    .line 428
    new-instance v10, Ljava/lang/IllegalStateException;

    #v10=(UninitRef);
    const-string v11, "Must measure with an exact width"

    #v11=(Reference);
    invoke-direct {v10, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v10=(Reference);
    throw v10

    .line 431
    :cond_0
    #v10=(Integer);v11=(Uninit);
    move v0, v4

    .line 432
    .local v0, childHeight:I
    #v0=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getMinHeight()I

    move-result v5

    .line 433
    .local v5, minHeight:I
    #v5=(Integer);
    const/4 v6, 0x0

    .line 434
    .local v6, padding:I
    #v6=(Null);
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I

    move-result v10

    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I

    move-result v11

    #v11=(Integer);
    add-int v6, v10, v11

    .line 435
    #v6=(Integer);
    sub-int/2addr v0, v6

    .line 437
    int-to-float v10, v9

    #v10=(Float);
    const v11, 0x3f4ccccd

    mul-float/2addr v10, v11

    float-to-int v10, v10

    #v10=(Integer);
    const/high16 v11, -0x8000

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 439
    .local v2, childWidthSpec:I
    #v2=(Integer);
    const/high16 v10, -0x8000

    invoke-static {v0, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 441
    .local v1, childHeightSpec:I
    #v1=(Integer);
    iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    #v10=(Reference);
    invoke-virtual {v10, v2, v1}, Landroid/widget/TextView;->measure(II)V

    .line 442
    iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    invoke-virtual {v10, v2, v1}, Landroid/widget/TextView;->measure(II)V

    .line 443
    iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {v10, v2, v1}, Landroid/widget/TextView;->measure(II)V

    .line 445
    const/high16 v10, 0x4000

    #v10=(Integer);
    if-ne v3, v10, :cond_1

    .line 446
    invoke-virtual {p0, v9, v4}, Landroid/support/v4/view/PagerTitleStrip;->setMeasuredDimension(II)V

    .line 451
    :goto_0
    #v7=(Conflicted);
    return-void

    .line 448
    :cond_1
    #v7=(Uninit);
    iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    #v10=(Reference);
    invoke-virtual {v10}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v7

    .line 449
    .local v7, textHeight:I
    #v7=(Integer);
    add-int v10, v7, v6

    #v10=(Integer);
    invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I

    move-result v10

    invoke-virtual {p0, v9, v10}, Landroid/support/v4/view/PagerTitleStrip;->setMeasuredDimension(II)V

    goto :goto_0
.end method

.method public requestLayout()V
    .locals 1

    .prologue
    .line 310
    iget-boolean v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 311
    invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V

    .line 313
    :cond_0
    return-void
.end method

.method public setGravity(I)V
    .locals 0
    .parameter "gravity"

    .prologue
    .line 236
    iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I

    .line 237
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V

    .line 238
    return-void
.end method

.method public setNonPrimaryAlpha(F)V
    .locals 4
    .parameter "alpha"

    .prologue
    .line 193
    const/high16 v1, 0x437f

    #v1=(Integer);
    mul-float/2addr v1, p1

    #v1=(Float);
    float-to-int v1, v1

    #v1=(Integer);
    and-int/lit16 v1, v1, 0xff

    iput v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I

    .line 194
    iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I

    shl-int/lit8 v1, v1, 0x18

    iget v2, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I

    #v2=(Integer);
    const v3, 0xffffff

    #v3=(Integer);
    and-int/2addr v2, v3

    or-int v0, v1, v2

    .line 195
    .local v0, transparentColor:I
    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 196
    iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 197
    return-void
.end method

.method public setTextColor(I)V
    .locals 4
    .parameter "color"

    .prologue
    .line 206
    iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I

    .line 207
    iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 208
    iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I

    #v1=(Integer);
    shl-int/lit8 v1, v1, 0x18

    iget v2, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I

    #v2=(Integer);
    const v3, 0xffffff

    #v3=(Integer);
    and-int/2addr v2, v3

    or-int v0, v1, v2

    .line 209
    .local v0, transparentColor:I
    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 210
    iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 211
    return-void
.end method

.method public setTextSize(IF)V
    .locals 1
    .parameter "unit"
    .parameter "size"

    .prologue
    .line 224
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 225
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 226
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 227
    return-void
.end method

.method public setTextSpacing(I)V
    .locals 0
    .parameter "spacingPixels"

    .prologue
    .line 176
    iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I

    .line 177
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V

    .line 178
    return-void
.end method

.method updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
    .locals 1
    .parameter "oldAdapter"
    .parameter "newAdapter"

    .prologue
    .line 316
    if-eqz p1, :cond_0

    .line 317
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/support/v4/view/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 318
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;

    .line 320
    :cond_0
    #v0=(Conflicted);
    if-eqz p2, :cond_1

    .line 321
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;

    #v0=(Reference);
    invoke-virtual {p2, v0}, Landroid/support/v4/view/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 322
    new-instance v0, Ljava/lang/ref/WeakReference;

    #v0=(UninitRef);
    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;

    .line 324
    :cond_1
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 325
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I

    .line 326
    const/high16 v0, -0x4080

    #v0=(Integer);
    iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F

    .line 327
    iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p0, v0, p2}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V

    .line 328
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V

    .line 330
    :cond_2
    #v0=(Conflicted);
    return-void
.end method

.method updateText(ILandroid/support/v4/view/PagerAdapter;)V
    .locals 10
    .parameter "currentItem"
    .parameter "adapter"

    .prologue
    const/4 v7, 0x1

    #v7=(One);
    const/high16 v9, -0x8000

    #v9=(Integer);
    const/4 v6, 0x0

    .line 271
    #v6=(Null);
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Landroid/support/v4/view/PagerAdapter;->getCount()I

    move-result v3

    .line 272
    .local v3, itemCount:I
    :goto_0
    #v3=(Integer);
    iput-boolean v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z

    .line 274
    const/4 v4, 0x0

    .line 275
    .local v4, text:Ljava/lang/CharSequence;
    #v4=(Null);
    if-lt p1, v7, :cond_0

    if-eqz p2, :cond_0

    .line 276
    add-int/lit8 v7, p1, -0x1

    #v7=(Integer);
    invoke-virtual {p2, v7}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 278
    :cond_0
    #v4=(Reference);
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    #v7=(Reference);
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 280
    iget-object v8, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    #v8=(Reference);
    if-eqz p2, :cond_4

    if-ge p1, v3, :cond_4

    invoke-virtual {p2, p1}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v7

    :goto_1
    invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    const/4 v4, 0x0

    .line 284
    #v4=(Null);
    add-int/lit8 v7, p1, 0x1

    #v7=(Integer);
    if-ge v7, v3, :cond_1

    if-eqz p2, :cond_1

    .line 285
    add-int/lit8 v7, p1, 0x1

    invoke-virtual {p2, v7}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;

    move-result-object v4

    .line 287
    :cond_1
    #v4=(Reference);
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    #v7=(Reference);
    invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 290
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I

    move-result v7

    #v7=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I

    move-result v8

    #v8=(Integer);
    sub-int/2addr v7, v8

    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I

    move-result v8

    sub-int v5, v7, v8

    .line 291
    .local v5, width:I
    #v5=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I

    move-result v7

    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I

    move-result v8

    sub-int/2addr v7, v8

    invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I

    move-result v8

    sub-int v0, v7, v8

    .line 292
    .local v0, childHeight:I
    #v0=(Integer);
    int-to-float v7, v5

    #v7=(Float);
    const v8, 0x3f4ccccd

    mul-float/2addr v7, v8

    float-to-int v7, v7

    #v7=(Integer);
    invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 294
    .local v2, childWidthSpec:I
    #v2=(Integer);
    invoke-static {v0, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 295
    .local v1, childHeightSpec:I
    #v1=(Integer);
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    #v7=(Reference);
    invoke-virtual {v7, v2, v1}, Landroid/widget/TextView;->measure(II)V

    .line 296
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    invoke-virtual {v7, v2, v1}, Landroid/widget/TextView;->measure(II)V

    .line 297
    iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    invoke-virtual {v7, v2, v1}, Landroid/widget/TextView;->measure(II)V

    .line 299
    iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I

    .line 301
    iget-boolean v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z

    #v7=(Boolean);
    if-nez v7, :cond_2

    .line 302
    iget v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F

    #v7=(Integer);
    invoke-virtual {p0, p1, v7, v6}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V

    .line 305
    :cond_2
    iput-boolean v6, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z

    .line 306
    return-void

    .end local v0           #childHeight:I
    .end local v1           #childHeightSpec:I
    .end local v2           #childWidthSpec:I
    .end local v3           #itemCount:I
    .end local v4           #text:Ljava/lang/CharSequence;
    .end local v5           #width:I
    :cond_3
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(One);v8=(Uninit);
    move v3, v6

    .line 271
    #v3=(Null);
    goto :goto_0

    .line 280
    .restart local v3       #itemCount:I
    .restart local v4       #text:Ljava/lang/CharSequence;
    :cond_4
    #v3=(Integer);v4=(Reference);v7=(Reference);v8=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    goto :goto_1
.end method

.method updateTextPositions(IFZ)V
    .locals 45
    .parameter "position"
    .parameter "positionOffset"
    .parameter "force"

    .prologue
    .line 333
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I

    #v0=(Integer);
    move/from16 v42, v0

    #v42=(Integer);
    move/from16 v0, p1

    move/from16 v1, v42

    #v1=(Integer);
    if-eq v0, v1, :cond_2

    .line 334
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;

    move-object/from16 v42, v0

    #v42=(Reference);
    invoke-virtual/range {v42 .. v42}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;

    move-result-object v42

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, v42

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V

    .line 339
    :cond_0
    #v0=(Conflicted);v2=(Conflicted);v42=(Conflicted);
    const/16 v42, 0x1

    #v42=(One);
    move/from16 v0, v42

    #v0=(One);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z

    .line 341
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    #v42=(Reference);
    invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v36

    .line 342
    .local v36, prevWidth:I
    #v36=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v18

    .line 343
    .local v18, currWidth:I
    #v18=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredWidth()I

    move-result v26

    .line 344
    .local v26, nextWidth:I
    #v26=(Integer);
    div-int/lit8 v19, v18, 0x2

    .line 346
    .local v19, halfCurrWidth:I
    #v19=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I

    move-result v38

    .line 347
    .local v38, stripWidth:I
    #v38=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I

    move-result v37

    .line 348
    .local v37, stripHeight:I
    #v37=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I

    move-result v29

    .line 349
    .local v29, paddingLeft:I
    #v29=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I

    move-result v30

    .line 350
    .local v30, paddingRight:I
    #v30=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I

    move-result v31

    .line 351
    .local v31, paddingTop:I
    #v31=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I

    move-result v28

    .line 352
    .local v28, paddingBottom:I
    #v28=(Integer);
    add-int v39, v29, v19

    .line 353
    .local v39, textPaddedLeft:I
    #v39=(Integer);
    add-int v40, v30, v19

    .line 354
    .local v40, textPaddedRight:I
    #v40=(Integer);
    sub-int v42, v38, v39

    #v42=(Integer);
    sub-int v10, v42, v40

    .line 356
    .local v10, contentWidth:I
    #v10=(Integer);
    const/high16 v42, 0x3f00

    add-float v14, p2, v42

    .line 357
    .local v14, currOffset:F
    #v14=(Float);
    const/high16 v42, 0x3f80

    cmpl-float v42, v14, v42

    #v42=(Byte);
    if-lez v42, :cond_1

    .line 358
    const/high16 v42, 0x3f80

    #v42=(Integer);
    sub-float v14, v14, v42

    .line 360
    :cond_1
    sub-int v42, v38, v40

    int-to-float v0, v10

    #v0=(Float);
    move/from16 v43, v0

    #v43=(Float);
    mul-float v43, v43, v14

    move/from16 v0, v43

    float-to-int v0, v0

    #v0=(Integer);
    move/from16 v43, v0

    #v43=(Integer);
    sub-int v12, v42, v43

    .line 361
    .local v12, currCenter:I
    #v12=(Integer);
    div-int/lit8 v42, v18, 0x2

    sub-int v13, v12, v42

    .line 362
    .local v13, currLeft:I
    #v13=(Integer);
    add-int v15, v13, v18

    .line 364
    .local v15, currRight:I
    #v15=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    #v42=(Reference);
    invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getBaseline()I

    move-result v32

    .line 365
    .local v32, prevBaseline:I
    #v32=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getBaseline()I

    move-result v11

    .line 366
    .local v11, currBaseline:I
    #v11=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getBaseline()I

    move-result v22

    .line 367
    .local v22, nextBaseline:I
    #v22=(Integer);
    move/from16 v0, v32

    #v0=(Integer);
    invoke-static {v0, v11}, Ljava/lang/Math;->max(II)I

    move-result v42

    #v42=(Integer);
    move/from16 v0, v42

    move/from16 v1, v22

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v20

    .line 368
    .local v20, maxBaseline:I
    #v20=(Integer);
    sub-int v35, v20, v32

    .line 369
    .local v35, prevTopOffset:I
    #v35=(Integer);
    sub-int v17, v20, v11

    .line 370
    .local v17, currTopOffset:I
    #v17=(Integer);
    sub-int v25, v20, v22

    .line 371
    .local v25, nextTopOffset:I
    #v25=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    #v42=(Reference);
    invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v42

    #v42=(Integer);
    add-int v7, v35, v42

    .line 372
    .local v7, alignedPrevHeight:I
    #v7=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    #v42=(Reference);
    invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v42

    #v42=(Integer);
    add-int v5, v17, v42

    .line 373
    .local v5, alignedCurrHeight:I
    #v5=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    #v42=(Reference);
    invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v42

    #v42=(Integer);
    add-int v6, v25, v42

    .line 374
    .local v6, alignedNextHeight:I
    #v6=(Integer);
    invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I

    move-result v42

    move/from16 v0, v42

    #v0=(Integer);
    invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I

    move-result v21

    .line 377
    .local v21, maxTextHeight:I
    #v21=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I

    #v0=(Integer);
    move/from16 v42, v0

    and-int/lit8 v41, v42, 0x70

    .line 382
    .local v41, vgrav:I
    #v41=(Integer);
    sparse-switch v41, :sswitch_data_0

    .line 385
    add-int v34, v31, v35

    .line 386
    .local v34, prevTop:I
    #v34=(Integer);
    add-int v16, v31, v17

    .line 387
    .local v16, currTop:I
    #v16=(Integer);
    add-int v24, v31, v25

    .line 404
    .local v24, nextTop:I
    :goto_0
    #v8=(Conflicted);v9=(Conflicted);v24=(Integer);v27=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    #v42=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;

    move-object/from16 v43, v0

    #v43=(Reference);
    invoke-virtual/range {v43 .. v43}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v43

    #v43=(Integer);
    add-int v43, v43, v16

    move-object/from16 v0, v42

    move/from16 v1, v16

    move/from16 v2, v43

    #v2=(Integer);
    invoke-virtual {v0, v13, v1, v15, v2}, Landroid/widget/TextView;->layout(IIII)V

    .line 407
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I

    #v0=(Integer);
    move/from16 v42, v0

    #v42=(Integer);
    sub-int v42, v13, v42

    sub-int v42, v42, v36

    move/from16 v0, v29

    move/from16 v1, v42

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v33

    .line 408
    .local v33, prevLeft:I
    #v33=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    #v42=(Reference);
    add-int v43, v33, v36

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;

    move-object/from16 v44, v0

    #v44=(Reference);
    invoke-virtual/range {v44 .. v44}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v44

    #v44=(Integer);
    add-int v44, v44, v34

    move-object/from16 v0, v42

    move/from16 v1, v33

    move/from16 v2, v34

    move/from16 v3, v43

    #v3=(Integer);
    move/from16 v4, v44

    #v4=(Integer);
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->layout(IIII)V

    .line 411
    sub-int v42, v38, v30

    #v42=(Integer);
    sub-int v42, v42, v26

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I

    #v0=(Integer);
    move/from16 v43, v0

    add-int v43, v43, v15

    invoke-static/range {v42 .. v43}, Ljava/lang/Math;->max(II)I

    move-result v23

    .line 413
    .local v23, nextLeft:I
    #v23=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    move-object/from16 v42, v0

    #v42=(Reference);
    add-int v43, v23, v26

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;

    move-object/from16 v44, v0

    #v44=(Reference);
    invoke-virtual/range {v44 .. v44}, Landroid/widget/TextView;->getMeasuredHeight()I

    move-result v44

    #v44=(Integer);
    add-int v44, v44, v24

    move-object/from16 v0, v42

    move/from16 v1, v23

    move/from16 v2, v24

    move/from16 v3, v43

    move/from16 v4, v44

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->layout(IIII)V

    .line 416
    move/from16 v0, p2

    #v0=(Float);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F

    .line 417
    const/16 v42, 0x0

    #v42=(Null);
    move/from16 v0, v42

    #v0=(Null);
    move-object/from16 v1, p0

    iput-boolean v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z

    .line 418
    .end local v5           #alignedCurrHeight:I
    .end local v6           #alignedNextHeight:I
    .end local v7           #alignedPrevHeight:I
    .end local v10           #contentWidth:I
    .end local v11           #currBaseline:I
    .end local v12           #currCenter:I
    .end local v13           #currLeft:I
    .end local v14           #currOffset:F
    .end local v15           #currRight:I
    .end local v16           #currTop:I
    .end local v17           #currTopOffset:I
    .end local v18           #currWidth:I
    .end local v19           #halfCurrWidth:I
    .end local v20           #maxBaseline:I
    .end local v21           #maxTextHeight:I
    .end local v22           #nextBaseline:I
    .end local v23           #nextLeft:I
    .end local v24           #nextTop:I
    .end local v25           #nextTopOffset:I
    .end local v26           #nextWidth:I
    .end local v28           #paddingBottom:I
    .end local v29           #paddingLeft:I
    .end local v30           #paddingRight:I
    .end local v31           #paddingTop:I
    .end local v32           #prevBaseline:I
    .end local v33           #prevLeft:I
    .end local v34           #prevTop:I
    .end local v35           #prevTopOffset:I
    .end local v36           #prevWidth:I
    .end local v37           #stripHeight:I
    .end local v38           #stripWidth:I
    .end local v39           #textPaddedLeft:I
    .end local v40           #textPaddedRight:I
    .end local v41           #vgrav:I
    :goto_1
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);v42=(Byte);v43=(Conflicted);v44=(Conflicted);
    return-void

    .line 335
    :cond_2
    #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Uninit);v38=(Uninit);v39=(Uninit);v40=(Uninit);v41=(Uninit);v42=(Integer);v43=(Uninit);v44=(Uninit);
    if-nez p3, :cond_0

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F

    #v0=(Integer);
    move/from16 v42, v0

    cmpl-float v42, p2, v42

    #v42=(Byte);
    if-nez v42, :cond_0

    goto :goto_1

    .line 390
    .restart local v5       #alignedCurrHeight:I
    .restart local v6       #alignedNextHeight:I
    .restart local v7       #alignedPrevHeight:I
    .restart local v10       #contentWidth:I
    .restart local v11       #currBaseline:I
    .restart local v12       #currCenter:I
    .restart local v13       #currLeft:I
    .restart local v14       #currOffset:F
    .restart local v15       #currRight:I
    .restart local v17       #currTopOffset:I
    .restart local v18       #currWidth:I
    .restart local v19       #halfCurrWidth:I
    .restart local v20       #maxBaseline:I
    .restart local v21       #maxTextHeight:I
    .restart local v22       #nextBaseline:I
    .restart local v25       #nextTopOffset:I
    .restart local v26       #nextWidth:I
    .restart local v28       #paddingBottom:I
    .restart local v29       #paddingLeft:I
    .restart local v30       #paddingRight:I
    .restart local v31       #paddingTop:I
    .restart local v32       #prevBaseline:I
    .restart local v35       #prevTopOffset:I
    .restart local v36       #prevWidth:I
    .restart local v37       #stripHeight:I
    .restart local v38       #stripWidth:I
    .restart local v39       #textPaddedLeft:I
    .restart local v40       #textPaddedRight:I
    .restart local v41       #vgrav:I
    :sswitch_0
    #v2=(Conflicted);v5=(Integer);v6=(Integer);v7=(Integer);v10=(Integer);v11=(Integer);v12=(Integer);v13=(Integer);v14=(Float);v15=(Integer);v17=(Integer);v18=(Integer);v19=(Integer);v20=(Integer);v21=(Integer);v22=(Integer);v25=(Integer);v26=(Integer);v28=(Integer);v29=(Integer);v30=(Integer);v31=(Integer);v32=(Integer);v35=(Integer);v36=(Integer);v37=(Integer);v38=(Integer);v39=(Integer);v40=(Integer);v41=(Integer);v42=(Integer);v43=(Integer);
    sub-int v42, v37, v31

    sub-int v27, v42, v28

    .line 391
    .local v27, paddedHeight:I
    #v27=(Integer);
    sub-int v42, v27, v21

    div-int/lit8 v9, v42, 0x2

    .line 392
    .local v9, centeredTop:I
    #v9=(Integer);
    add-int v34, v9, v35

    .line 393
    .restart local v34       #prevTop:I
    #v34=(Integer);
    add-int v16, v9, v17

    .line 394
    .restart local v16       #currTop:I
    #v16=(Integer);
    add-int v24, v9, v25

    .line 395
    .restart local v24       #nextTop:I
    #v24=(Integer);
    goto/16 :goto_0

    .line 397
    .end local v9           #centeredTop:I
    .end local v16           #currTop:I
    .end local v24           #nextTop:I
    .end local v27           #paddedHeight:I
    .end local v34           #prevTop:I
    :sswitch_1
    #v9=(Uninit);v16=(Uninit);v24=(Uninit);v27=(Uninit);v34=(Uninit);
    sub-int v42, v37, v28

    sub-int v8, v42, v21

    .line 398
    .local v8, bottomGravTop:I
    #v8=(Integer);
    add-int v34, v8, v35

    .line 399
    .restart local v34       #prevTop:I
    #v34=(Integer);
    add-int v16, v8, v17

    .line 400
    .restart local v16       #currTop:I
    #v16=(Integer);
    add-int v24, v8, v25

    .restart local v24       #nextTop:I
    #v24=(Integer);
    goto/16 :goto_0

    .line 382
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);v27=(Unknown);v28=(Unknown);v29=(Unknown);v30=(Unknown);v31=(Unknown);v32=(Unknown);v33=(Unknown);v34=(Unknown);v35=(Unknown);v36=(Unknown);v37=(Unknown);v38=(Unknown);v39=(Unknown);v40=(Unknown);v41=(Unknown);v42=(Unknown);v43=(Unknown);v44=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_0
        0x50 -> :sswitch_1
    .end sparse-switch
.end method

*/}
