package android.support.v4.view; class PagerTitleStrip { void a() { int a;
a=0;// .class public Landroid/support/v4/view/PagerTitleStrip;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "PagerTitleStrip.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPager$Decor;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/PagerTitleStrip$1;,
a=0;//         Landroid/support/v4/view/PagerTitleStrip$PageListener;,
a=0;//         Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;,
a=0;//         Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;,
a=0;//         Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ATTRS:[I
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
a=0;// 
a=0;// .field private static final SIDE_ALPHA:F = 0.6f
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "PagerTitleStrip"
a=0;// 
a=0;// .field private static final TEXT_ATTRS:[I
a=0;// 
a=0;// .field private static final TEXT_SPACING:I = 0x10
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mGravity:I
a=0;// 
a=0;// .field private mLastKnownCurrentPage:I
a=0;// 
a=0;// .field private mLastKnownPositionOffset:F
a=0;// 
a=0;// .field mNextText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mNonPrimaryAlpha:I
a=0;// 
a=0;// .field private final mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;// .field mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;// .field mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mScaledTextSpacing:I
a=0;// 
a=0;// .field mTextColor:I
a=0;// 
a=0;// .field private mUpdatingPositions:Z
a=0;// 
a=0;// .field private mUpdatingText:Z
a=0;// 
a=0;// .field private mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/lang/ref/WeakReference",
a=0;//             "<",
a=0;//             "Landroid/support/v4/view/PagerAdapter;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->ATTRS:[I
a=0;// 
a=0;//     .line 72
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x101038c
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->TEXT_ATTRS:[I
a=0;// 
a=0;//     .line 100
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     new-instance v0, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplIcs;);
a=0;//     sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 65
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x1010034
a=0;//         0x1010095
a=0;//         0x1010098
a=0;//         0x10100af
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/view/PagerTitleStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 113
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 11
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 116
a=0;//     #v9=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     .line 54
a=0;//     const/high16 v7, -0x40800000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     .line 61
a=0;//     new-instance v7, Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-direct {v7, p0, v8}, Landroid/support/v4/view/PagerTitleStrip$PageListener;-><init>(Landroid/support/v4/view/PagerTitleStrip;Landroid/support/v4/view/PagerTitleStrip$1;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     iput-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     .line 118
a=0;//     new-instance v7, Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v7, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0, v7}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 119
a=0;//     new-instance v7, Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v7, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0, v7}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 120
a=0;//     new-instance v7, Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/widget/TextView;);
a=0;//     invoke-direct {v7, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     iput-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {p0, v7}, Landroid/support/v4/view/PagerTitleStrip;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 122
a=0;//     sget-object v7, Landroid/support/v4/view/PagerTitleStrip;->ATTRS:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 123
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v9, v9}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 124
a=0;//     .local v4, "textAppearance":I
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7, p1, v4}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7, p1, v4}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 127
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7, p1, v4}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 129
a=0;//     :cond_0
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v0, v7, v9}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 130
a=0;//     .local v6, "textSize":I
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 131
a=0;//     int-to-float v7, v6
a=0;// 
a=0;//     #v7=(Float);
a=0;//     invoke-virtual {p0, v9, v7}, Landroid/support/v4/view/PagerTitleStrip;->setTextSize(IF)V
a=0;// 
a=0;//     .line 133
a=0;//     :cond_1
a=0;//     invoke-virtual {v0, v10}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 134
a=0;//     invoke-virtual {v0, v10, v9}, Landroid/content/res/TypedArray;->getColor(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 135
a=0;//     .local v5, "textColor":I
a=0;//     #v5=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 136
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 139
a=0;//     .end local v5    # "textColor":I
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);v7=(Conflicted);
a=0;//     const/4 v7, 0x3
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/16 v8, 0x50
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     invoke-virtual {v0, v7, v8}, Landroid/content/res/TypedArray;->getInteger(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v7}, Landroid/widget/TextView;->getTextColors()Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/content/res/ColorStateList;->getDefaultColor()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
a=0;// 
a=0;//     .line 143
a=0;//     const v7, 0x3f19999a
a=0;// 
a=0;//     invoke-virtual {p0, v7}, Landroid/support/v4/view/PagerTitleStrip;->setNonPrimaryAlpha(F)V
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     #v8=(Reference,Landroid/text/TextUtils$TruncateAt;);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     sget-object v8, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V
a=0;// 
a=0;//     .line 149
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     .local v1, "allCaps":Z
a=0;//     #v1=(Null);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 151
a=0;//     sget-object v7, Landroid/support/v4/view/PagerTitleStrip;->TEXT_ATTRS:[I
a=0;// 
a=0;//     invoke-virtual {p1, v4, v7}, Landroid/content/Context;->obtainStyledAttributes(I[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 152
a=0;//     .local v3, "ta":Landroid/content/res/TypedArray;
a=0;//     #v3=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v3, v9, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 153
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v3}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 156
a=0;//     .end local v3    # "ta":Landroid/content/res/TypedArray;
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {v7}, Landroid/support/v4/view/PagerTitleStrip;->setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {v7}, Landroid/support/v4/view/PagerTitleStrip;->setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-static {v7}, Landroid/support/v4/view/PagerTitleStrip;->setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 166
a=0;//     :goto_0
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget v2, v7, Landroid/util/DisplayMetrics;->density:F
a=0;// 
a=0;//     .line 167
a=0;//     .local v2, "density":F
a=0;//     #v2=(Integer);
a=0;//     const/high16 v7, 0x41800000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     mul-float/2addr v7, v2
a=0;// 
a=0;//     #v7=(Float);
a=0;//     float-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     iput v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     .line 168
a=0;//     return-void
a=0;// 
a=0;//     .line 161
a=0;//     .end local v2    # "density":F
a=0;//     :cond_4
a=0;//     #v2=(Uninit);v7=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/widget/TextView;->setSingleLine()V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/widget/TextView;->setSingleLine()V
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/widget/TextView;->setSingleLine()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v4/view/PagerTitleStrip;)F
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     .prologue
a=0;//     .line 45
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private static setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;//     .locals 1
a=0;//     .param p0, "text"    # Landroid/widget/TextView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     sget-object v0, Landroid/support/v4/view/PagerTitleStrip;->IMPL:Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;);
a=0;//     invoke-interface {v0, p0}, Landroid/support/v4/view/PagerTitleStrip$PagerTitleStripImpl;->setSingleLineAllCaps(Landroid/widget/TextView;)V
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method getMinHeight()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 463
a=0;//     .local v1, "minHeight":I
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 464
a=0;//     .local v0, "bg":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 465
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 467
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public getTextSpacing()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onAttachedToWindow()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 245
a=0;//     .local v2, "parent":Landroid/view/ViewParent;
a=0;//     #v2=(Reference,Landroid/view/ViewParent;);
a=0;//     instance-of v3, v2, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 246
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v4, "PagerTitleStrip must be a direct child of a ViewPager."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Boolean);v4=(Uninit);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 250
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 251
a=0;//     .local v1, "pager":Landroid/support/v4/view/ViewPager;
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 253
a=0;//     .local v0, "adapter":Landroid/support/v4/view/PagerAdapter;
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v4/view/ViewPager;->setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v4/view/ViewPager;->setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
a=0;// 
a=0;//     .line 255
a=0;//     iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 256
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p0, v3, v0}, Landroid/support/v4/view/PagerTitleStrip;->updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 257
a=0;//     return-void
a=0;// 
a=0;//     .line 256
a=0;//     :cond_1
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 261
a=0;//     #v1=(Null);
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v4/view/PagerTitleStrip;->updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setInternalPageChangeListener(Landroid/support/v4/view/ViewPager$OnPageChangeListener;)Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;//     .line 265
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setOnAdapterChangeListener(Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;)V
a=0;// 
a=0;//     .line 266
a=0;//     iput-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     .line 268
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 3
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 455
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 456
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v1, v1, v0
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     .line 457
a=0;//     .local v0, "offset":F
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, v1, v0, v2}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
a=0;// 
a=0;//     .line 459
a=0;//     .end local v0    # "offset":F
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 12
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 422
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 423
a=0;//     .local v8, "widthMode":I
a=0;//     #v8=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 424
a=0;//     .local v3, "heightMode":I
a=0;//     #v3=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 425
a=0;//     .local v9, "widthSize":I
a=0;//     #v9=(Integer);
a=0;//     invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 427
a=0;//     .local v4, "heightSize":I
a=0;//     #v4=(Integer);
a=0;//     const/high16 v10, 0x40000000
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-eq v8, v10, :cond_0
a=0;// 
a=0;//     .line 428
a=0;//     new-instance v10, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v10=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v11, "Must measure with an exact width"
a=0;// 
a=0;//     #v11=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v10, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v10
a=0;// 
a=0;//     .line 431
a=0;//     :cond_0
a=0;//     #v10=(Integer);v11=(Uninit);
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 432
a=0;//     .local v0, "childHeight":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getMinHeight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 433
a=0;//     .local v5, "minHeight":I
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 434
a=0;//     .local v6, "padding":I
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int v6, v10, v11
a=0;// 
a=0;//     .line 435
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v0, v6
a=0;// 
a=0;//     .line 437
a=0;//     int-to-float v10, v9
a=0;// 
a=0;//     #v10=(Float);
a=0;//     const v11, 0x3f4ccccd
a=0;// 
a=0;//     mul-float/2addr v10, v11
a=0;// 
a=0;//     float-to-int v10, v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/high16 v11, -0x80000000
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 439
a=0;//     .local v2, "childWidthSpec":I
a=0;//     #v2=(Integer);
a=0;//     const/high16 v10, -0x80000000
a=0;// 
a=0;//     invoke-static {v0, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 441
a=0;//     .local v1, "childHeightSpec":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v10=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v10, v2, v1}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 442
a=0;//     iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v10, v2, v1}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 443
a=0;//     iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v10, v2, v1}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 445
a=0;//     const/high16 v10, 0x40000000
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-ne v3, v10, :cond_1
a=0;// 
a=0;//     .line 446
a=0;//     invoke-virtual {p0, v9, v4}, Landroid/support/v4/view/PagerTitleStrip;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 451
a=0;//     :goto_0
a=0;//     #v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 448
a=0;//     :cond_1
a=0;//     #v7=(Uninit);
a=0;//     iget-object v10, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v10=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v10}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 449
a=0;//     .local v7, "textHeight":I
a=0;//     #v7=(Integer);
a=0;//     add-int v10, v7, v6
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v5, v10}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     invoke-virtual {p0, v9, v10}, Landroid/support/v4/view/PagerTitleStrip;->setMeasuredDimension(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public requestLayout()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 310
a=0;//     iget-boolean v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 311
a=0;//     invoke-super {p0}, Landroid/view/ViewGroup;->requestLayout()V
a=0;// 
a=0;//     .line 313
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGravity(I)V
a=0;//     .locals 0
a=0;//     .param p1, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I
a=0;// 
a=0;//     .line 237
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
a=0;// 
a=0;//     .line 238
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setNonPrimaryAlpha(F)V
a=0;//     .locals 4
a=0;//     .param p1, "alpha"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     const/high16 v1, 0x437f0000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     mul-float/2addr v1, p1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     float-to-int v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit16 v1, v1, 0xff
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I
a=0;// 
a=0;//     .line 194
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I
a=0;// 
a=0;//     shl-int/lit8 v1, v1, 0x18
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const v3, 0xffffff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     or-int v0, v1, v2
a=0;// 
a=0;//     .line 195
a=0;//     .local v0, "transparentColor":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTextColor(I)V
a=0;//     .locals 4
a=0;//     .param p1, "color"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
a=0;// 
a=0;//     .line 207
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, p1}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 208
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNonPrimaryAlpha:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x18
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/view/PagerTitleStrip;->mTextColor:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const v3, 0xffffff
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v2, v3
a=0;// 
a=0;//     or-int v0, v1, v2
a=0;// 
a=0;//     .line 209
a=0;//     .local v0, "transparentColor":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 210
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/widget/TextView;->setTextColor(I)V
a=0;// 
a=0;//     .line 211
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTextSize(IF)V
a=0;//     .locals 1
a=0;//     .param p1, "unit"    # I
a=0;//     .param p2, "size"    # F
a=0;// 
a=0;//     .prologue
a=0;//     .line 224
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextSize(IF)V
a=0;// 
a=0;//     .line 227
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTextSpacing(I)V
a=0;//     .locals 0
a=0;//     .param p1, "spacingPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
a=0;// 
a=0;//     .line 178
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;//     .locals 1
a=0;//     .param p1, "oldAdapter"    # Landroid/support/v4/view/PagerAdapter;
a=0;//     .param p2, "newAdapter"    # Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 316
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 317
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/PagerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 318
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 320
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 321
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPageListener:Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     invoke-virtual {p2, v0}, Landroid/support/v4/view/PagerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 322
a=0;//     new-instance v0, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     iput-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mWatchingAdapter:Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 324
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 325
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     .line 326
a=0;//     const/high16 v0, -0x40800000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     .line 327
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0, p2}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 328
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->requestLayout()V
a=0;// 
a=0;//     .line 330
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method updateText(ILandroid/support/v4/view/PagerAdapter;)V
a=0;//     .locals 10
a=0;//     .param p1, "currentItem"    # I
a=0;//     .param p2, "adapter"    # Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/high16 v9, -0x80000000
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 271
a=0;//     #v6=(Null);
a=0;//     if-eqz p2, :cond_3
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/PagerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 272
a=0;//     .local v3, "itemCount":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     iput-boolean v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z
a=0;// 
a=0;//     .line 274
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 275
a=0;//     .local v4, "text":Ljava/lang/CharSequence;
a=0;//     #v4=(Null);
a=0;//     if-lt p1, v7, :cond_0
a=0;// 
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 276
a=0;//     add-int/lit8 v7, p1, -0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p2, v7}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 278
a=0;//     :cond_0
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 280
a=0;//     iget-object v8, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz p2, :cond_4
a=0;// 
a=0;//     if-ge p1, v3, :cond_4
a=0;// 
a=0;//     invoke-virtual {p2, p1}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     :goto_1
a=0;//     invoke-virtual {v8, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 283
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 284
a=0;//     #v4=(Null);
a=0;//     add-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v7, v3, :cond_1
a=0;// 
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 285
a=0;//     add-int/lit8 v7, p1, 0x1
a=0;// 
a=0;//     invoke-virtual {p2, v7}, Landroid/support/v4/view/PagerAdapter;->getPageTitle(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 287
a=0;//     :cond_1
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v7, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 290
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int/2addr v7, v8
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     sub-int v5, v7, v8
a=0;// 
a=0;//     .line 291
a=0;//     .local v5, "width":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     sub-int/2addr v7, v8
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     sub-int v0, v7, v8
a=0;// 
a=0;//     .line 292
a=0;//     .local v0, "childHeight":I
a=0;//     #v0=(Integer);
a=0;//     int-to-float v7, v5
a=0;// 
a=0;//     #v7=(Float);
a=0;//     const v8, 0x3f4ccccd
a=0;// 
a=0;//     mul-float/2addr v7, v8
a=0;// 
a=0;//     float-to-int v7, v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v7, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 294
a=0;//     .local v2, "childWidthSpec":I
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v0, v9}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 295
a=0;//     .local v1, "childHeightSpec":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v7, v2, v1}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 296
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7, v2, v1}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v7, v2, v1}, Landroid/widget/TextView;->measure(II)V
a=0;// 
a=0;//     .line 299
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     .line 301
a=0;//     iget-boolean v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     .line 302
a=0;//     iget v7, p0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0, p1, v7, v6}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
a=0;// 
a=0;//     .line 305
a=0;//     :cond_2
a=0;//     iput-boolean v6, p0, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingText:Z
a=0;// 
a=0;//     .line 306
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "childHeight":I
a=0;//     .end local v1    # "childHeightSpec":I
a=0;//     .end local v2    # "childWidthSpec":I
a=0;//     .end local v3    # "itemCount":I
a=0;//     .end local v4    # "text":Ljava/lang/CharSequence;
a=0;//     .end local v5    # "width":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v7=(One);v8=(Uninit);
a=0;//     move v3, v6
a=0;// 
a=0;//     .line 271
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 280
a=0;//     .restart local v3    # "itemCount":I
a=0;//     .restart local v4    # "text":Ljava/lang/CharSequence;
a=0;//     :cond_4
a=0;//     #v3=(Integer);v4=(Reference,Ljava/lang/CharSequence;);v7=(Reference,Landroid/widget/TextView;);v8=(Reference,Landroid/widget/TextView;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method updateTextPositions(IFZ)V
a=0;//     .locals 45
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "positionOffset"    # F
a=0;//     .param p3, "force"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownCurrentPage:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v42, v0
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     move/from16 v0, p1
a=0;// 
a=0;//     move/from16 v1, v42
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_2
a=0;// 
a=0;//     .line 334
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Landroid/support/v4/view/ViewPager;);
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v42
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move/from16 v1, p1
a=0;// 
a=0;//     move-object/from16 v2, v42
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerAdapter;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v42=(Conflicted);
a=0;//     const/16 v42, 0x1
a=0;// 
a=0;//     #v42=(One);
a=0;//     move/from16 v0, v42
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z
a=0;// 
a=0;//     .line 341
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v36
a=0;// 
a=0;//     .line 342
a=0;//     .local v36, "prevWidth":I
a=0;//     #v36=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v18
a=0;// 
a=0;//     .line 343
a=0;//     .local v18, "currWidth":I
a=0;//     #v18=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     .line 344
a=0;//     .local v26, "nextWidth":I
a=0;//     #v26=(Integer);
a=0;//     div-int/lit8 v19, v18, 0x2
a=0;// 
a=0;//     .line 346
a=0;//     .local v19, "halfCurrWidth":I
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getWidth()I
a=0;// 
a=0;//     move-result v38
a=0;// 
a=0;//     .line 347
a=0;//     .local v38, "stripWidth":I
a=0;//     #v38=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getHeight()I
a=0;// 
a=0;//     move-result v37
a=0;// 
a=0;//     .line 348
a=0;//     .local v37, "stripHeight":I
a=0;//     #v37=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v29
a=0;// 
a=0;//     .line 349
a=0;//     .local v29, "paddingLeft":I
a=0;//     #v29=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingRight()I
a=0;// 
a=0;//     move-result v30
a=0;// 
a=0;//     .line 350
a=0;//     .local v30, "paddingRight":I
a=0;//     #v30=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingTop()I
a=0;// 
a=0;//     move-result v31
a=0;// 
a=0;//     .line 351
a=0;//     .local v31, "paddingTop":I
a=0;//     #v31=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v4/view/PagerTitleStrip;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     .line 352
a=0;//     .local v28, "paddingBottom":I
a=0;//     #v28=(Integer);
a=0;//     add-int v39, v29, v19
a=0;// 
a=0;//     .line 353
a=0;//     .local v39, "textPaddedLeft":I
a=0;//     #v39=(Integer);
a=0;//     add-int v40, v30, v19
a=0;// 
a=0;//     .line 354
a=0;//     .local v40, "textPaddedRight":I
a=0;//     #v40=(Integer);
a=0;//     sub-int v42, v38, v39
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     sub-int v10, v42, v40
a=0;// 
a=0;//     .line 356
a=0;//     .local v10, "contentWidth":I
a=0;//     #v10=(Integer);
a=0;//     const/high16 v42, 0x3f000000
a=0;// 
a=0;//     add-float v14, p2, v42
a=0;// 
a=0;//     .line 357
a=0;//     .local v14, "currOffset":F
a=0;//     #v14=(Float);
a=0;//     const/high16 v42, 0x3f800000
a=0;// 
a=0;//     cmpl-float v42, v14, v42
a=0;// 
a=0;//     #v42=(Byte);
a=0;//     if-lez v42, :cond_1
a=0;// 
a=0;//     .line 358
a=0;//     const/high16 v42, 0x3f800000
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     sub-float v14, v14, v42
a=0;// 
a=0;//     .line 360
a=0;//     :cond_1
a=0;//     sub-int v42, v38, v40
a=0;// 
a=0;//     int-to-float v0, v10
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move/from16 v43, v0
a=0;// 
a=0;//     #v43=(Float);
a=0;//     mul-float v43, v43, v14
a=0;// 
a=0;//     move/from16 v0, v43
a=0;// 
a=0;//     float-to-int v0, v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v43, v0
a=0;// 
a=0;//     #v43=(Integer);
a=0;//     sub-int v12, v42, v43
a=0;// 
a=0;//     .line 361
a=0;//     .local v12, "currCenter":I
a=0;//     #v12=(Integer);
a=0;//     div-int/lit8 v42, v18, 0x2
a=0;// 
a=0;//     sub-int v13, v12, v42
a=0;// 
a=0;//     .line 362
a=0;//     .local v13, "currLeft":I
a=0;//     #v13=(Integer);
a=0;//     add-int v15, v13, v18
a=0;// 
a=0;//     .line 364
a=0;//     .local v15, "currRight":I
a=0;//     #v15=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getBaseline()I
a=0;// 
a=0;//     move-result v32
a=0;// 
a=0;//     .line 365
a=0;//     .local v32, "prevBaseline":I
a=0;//     #v32=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getBaseline()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 366
a=0;//     .local v11, "currBaseline":I
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getBaseline()I
a=0;// 
a=0;//     move-result v22
a=0;// 
a=0;//     .line 367
a=0;//     .local v22, "nextBaseline":I
a=0;//     #v22=(Integer);
a=0;//     move/from16 v0, v32
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0, v11}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v42
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     move/from16 v0, v42
a=0;// 
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 368
a=0;//     .local v20, "maxBaseline":I
a=0;//     #v20=(Integer);
a=0;//     sub-int v35, v20, v32
a=0;// 
a=0;//     .line 369
a=0;//     .local v35, "prevTopOffset":I
a=0;//     #v35=(Integer);
a=0;//     sub-int v17, v20, v11
a=0;// 
a=0;//     .line 370
a=0;//     .local v17, "currTopOffset":I
a=0;//     #v17=(Integer);
a=0;//     sub-int v25, v20, v22
a=0;// 
a=0;//     .line 371
a=0;//     .local v25, "nextTopOffset":I
a=0;//     #v25=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v42
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     add-int v7, v35, v42
a=0;// 
a=0;//     .line 372
a=0;//     .local v7, "alignedPrevHeight":I
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v42
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     add-int v5, v17, v42
a=0;// 
a=0;//     .line 373
a=0;//     .local v5, "alignedCurrHeight":I
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v42 .. v42}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v42
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     add-int v6, v25, v42
a=0;// 
a=0;//     .line 374
a=0;//     .local v6, "alignedNextHeight":I
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v7, v5}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v42
a=0;// 
a=0;//     move/from16 v0, v42
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v21
a=0;// 
a=0;//     .line 377
a=0;//     .local v21, "maxTextHeight":I
a=0;//     #v21=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mGravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v42, v0
a=0;// 
a=0;//     and-int/lit8 v41, v42, 0x70
a=0;// 
a=0;//     .line 382
a=0;//     .local v41, "vgrav":I
a=0;//     #v41=(Integer);
a=0;//     sparse-switch v41, :sswitch_data_0
a=0;// 
a=0;//     .line 385
a=0;//     add-int v34, v31, v35
a=0;// 
a=0;//     .line 386
a=0;//     .local v34, "prevTop":I
a=0;//     #v34=(Integer);
a=0;//     add-int v16, v31, v17
a=0;// 
a=0;//     .line 387
a=0;//     .local v16, "currTop":I
a=0;//     #v16=(Integer);
a=0;//     add-int v24, v31, v25
a=0;// 
a=0;//     .line 404
a=0;//     .local v24, "nextTop":I
a=0;//     :goto_0
a=0;//     #v8=(Conflicted);v9=(Conflicted);v24=(Integer);v27=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Landroid/widget/TextView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mCurrText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v43, v0
a=0;// 
a=0;//     #v43=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v43 .. v43}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v43
a=0;// 
a=0;//     #v43=(Integer);
a=0;//     add-int v43, v43, v16
a=0;// 
a=0;//     move-object/from16 v0, v42
a=0;// 
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     move/from16 v2, v43
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v13, v1, v15, v2}, Landroid/widget/TextView;->layout(IIII)V
a=0;// 
a=0;//     .line 407
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v42, v0
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     sub-int v42, v13, v42
a=0;// 
a=0;//     sub-int v42, v42, v36
a=0;// 
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     move/from16 v1, v42
a=0;// 
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v33
a=0;// 
a=0;//     .line 408
a=0;//     .local v33, "prevLeft":I
a=0;//     #v33=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Landroid/widget/TextView;);
a=0;//     add-int v43, v33, v36
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mPrevText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v44, v0
a=0;// 
a=0;//     #v44=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v44 .. v44}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v44
a=0;// 
a=0;//     #v44=(Integer);
a=0;//     add-int v44, v44, v34
a=0;// 
a=0;//     move-object/from16 v0, v42
a=0;// 
a=0;//     move/from16 v1, v33
a=0;// 
a=0;//     move/from16 v2, v34
a=0;// 
a=0;//     move/from16 v3, v43
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move/from16 v4, v44
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->layout(IIII)V
a=0;// 
a=0;//     .line 411
a=0;//     sub-int v42, v38, v30
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     sub-int v42, v42, v26
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mScaledTextSpacing:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v43, v0
a=0;// 
a=0;//     add-int v43, v43, v15
a=0;// 
a=0;//     invoke-static/range {v42 .. v43}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 413
a=0;//     .local v23, "nextLeft":I
a=0;//     #v23=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v42, v0
a=0;// 
a=0;//     #v42=(Reference,Landroid/widget/TextView;);
a=0;//     add-int v43, v23, v26
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mNextText:Landroid/widget/TextView;
a=0;// 
a=0;//     move-object/from16 v44, v0
a=0;// 
a=0;//     #v44=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual/range {v44 .. v44}, Landroid/widget/TextView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v44
a=0;// 
a=0;//     #v44=(Integer);
a=0;//     add-int v44, v44, v24
a=0;// 
a=0;//     move-object/from16 v0, v42
a=0;// 
a=0;//     move/from16 v1, v23
a=0;// 
a=0;//     move/from16 v2, v24
a=0;// 
a=0;//     move/from16 v3, v43
a=0;// 
a=0;//     move/from16 v4, v44
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/widget/TextView;->layout(IIII)V
a=0;// 
a=0;//     .line 416
a=0;//     move/from16 v0, p2
a=0;// 
a=0;//     #v0=(Float);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iput v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     .line 417
a=0;//     const/16 v42, 0x0
a=0;// 
a=0;//     #v42=(Null);
a=0;//     move/from16 v0, v42
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     iput-boolean v0, v1, Landroid/support/v4/view/PagerTitleStrip;->mUpdatingPositions:Z
a=0;// 
a=0;//     .line 418
a=0;//     .end local v5    # "alignedCurrHeight":I
a=0;//     .end local v6    # "alignedNextHeight":I
a=0;//     .end local v7    # "alignedPrevHeight":I
a=0;//     .end local v10    # "contentWidth":I
a=0;//     .end local v11    # "currBaseline":I
a=0;//     .end local v12    # "currCenter":I
a=0;//     .end local v13    # "currLeft":I
a=0;//     .end local v14    # "currOffset":F
a=0;//     .end local v15    # "currRight":I
a=0;//     .end local v16    # "currTop":I
a=0;//     .end local v17    # "currTopOffset":I
a=0;//     .end local v18    # "currWidth":I
a=0;//     .end local v19    # "halfCurrWidth":I
a=0;//     .end local v20    # "maxBaseline":I
a=0;//     .end local v21    # "maxTextHeight":I
a=0;//     .end local v22    # "nextBaseline":I
a=0;//     .end local v23    # "nextLeft":I
a=0;//     .end local v24    # "nextTop":I
a=0;//     .end local v25    # "nextTopOffset":I
a=0;//     .end local v26    # "nextWidth":I
a=0;//     .end local v28    # "paddingBottom":I
a=0;//     .end local v29    # "paddingLeft":I
a=0;//     .end local v30    # "paddingRight":I
a=0;//     .end local v31    # "paddingTop":I
a=0;//     .end local v32    # "prevBaseline":I
a=0;//     .end local v33    # "prevLeft":I
a=0;//     .end local v34    # "prevTop":I
a=0;//     .end local v35    # "prevTopOffset":I
a=0;//     .end local v36    # "prevWidth":I
a=0;//     .end local v37    # "stripHeight":I
a=0;//     .end local v38    # "stripWidth":I
a=0;//     .end local v39    # "textPaddedLeft":I
a=0;//     .end local v40    # "textPaddedRight":I
a=0;//     .end local v41    # "vgrav":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Conflicted);v42=(Byte);v43=(Conflicted);v44=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 335
a=0;//     :cond_2
a=0;//     #v1=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Uninit);v38=(Uninit);v39=(Uninit);v40=(Uninit);v41=(Uninit);v42=(Integer);v43=(Uninit);v44=(Uninit);
a=0;//     if-nez p3, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget v0, v0, Landroid/support/v4/view/PagerTitleStrip;->mLastKnownPositionOffset:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v42, v0
a=0;// 
a=0;//     cmpl-float v42, p2, v42
a=0;// 
a=0;//     #v42=(Byte);
a=0;//     if-nez v42, :cond_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 390
a=0;//     .restart local v5    # "alignedCurrHeight":I
a=0;//     .restart local v6    # "alignedNextHeight":I
a=0;//     .restart local v7    # "alignedPrevHeight":I
a=0;//     .restart local v10    # "contentWidth":I
a=0;//     .restart local v11    # "currBaseline":I
a=0;//     .restart local v12    # "currCenter":I
a=0;//     .restart local v13    # "currLeft":I
a=0;//     .restart local v14    # "currOffset":F
a=0;//     .restart local v15    # "currRight":I
a=0;//     .restart local v17    # "currTopOffset":I
a=0;//     .restart local v18    # "currWidth":I
a=0;//     .restart local v19    # "halfCurrWidth":I
a=0;//     .restart local v20    # "maxBaseline":I
a=0;//     .restart local v21    # "maxTextHeight":I
a=0;//     .restart local v22    # "nextBaseline":I
a=0;//     .restart local v25    # "nextTopOffset":I
a=0;//     .restart local v26    # "nextWidth":I
a=0;//     .restart local v28    # "paddingBottom":I
a=0;//     .restart local v29    # "paddingLeft":I
a=0;//     .restart local v30    # "paddingRight":I
a=0;//     .restart local v31    # "paddingTop":I
a=0;//     .restart local v32    # "prevBaseline":I
a=0;//     .restart local v35    # "prevTopOffset":I
a=0;//     .restart local v36    # "prevWidth":I
a=0;//     .restart local v37    # "stripHeight":I
a=0;//     .restart local v38    # "stripWidth":I
a=0;//     .restart local v39    # "textPaddedLeft":I
a=0;//     .restart local v40    # "textPaddedRight":I
a=0;//     .restart local v41    # "vgrav":I
a=0;//     :sswitch_0
a=0;//     #v2=(Conflicted);v5=(Integer);v6=(Integer);v7=(Integer);v10=(Integer);v11=(Integer);v12=(Integer);v13=(Integer);v14=(Float);v15=(Integer);v17=(Integer);v18=(Integer);v19=(Integer);v20=(Integer);v21=(Integer);v22=(Integer);v25=(Integer);v26=(Integer);v28=(Integer);v29=(Integer);v30=(Integer);v31=(Integer);v32=(Integer);v35=(Integer);v36=(Integer);v37=(Integer);v38=(Integer);v39=(Integer);v40=(Integer);v41=(Integer);v42=(Integer);v43=(Integer);
a=0;//     sub-int v42, v37, v31
a=0;// 
a=0;//     sub-int v27, v42, v28
a=0;// 
a=0;//     .line 391
a=0;//     .local v27, "paddedHeight":I
a=0;//     #v27=(Integer);
a=0;//     sub-int v42, v27, v21
a=0;// 
a=0;//     div-int/lit8 v9, v42, 0x2
a=0;// 
a=0;//     .line 392
a=0;//     .local v9, "centeredTop":I
a=0;//     #v9=(Integer);
a=0;//     add-int v34, v9, v35
a=0;// 
a=0;//     .line 393
a=0;//     .restart local v34    # "prevTop":I
a=0;//     #v34=(Integer);
a=0;//     add-int v16, v9, v17
a=0;// 
a=0;//     .line 394
a=0;//     .restart local v16    # "currTop":I
a=0;//     #v16=(Integer);
a=0;//     add-int v24, v9, v25
a=0;// 
a=0;//     .line 395
a=0;//     .restart local v24    # "nextTop":I
a=0;//     #v24=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 397
a=0;//     .end local v9    # "centeredTop":I
a=0;//     .end local v16    # "currTop":I
a=0;//     .end local v24    # "nextTop":I
a=0;//     .end local v27    # "paddedHeight":I
a=0;//     .end local v34    # "prevTop":I
a=0;//     :sswitch_1
a=0;//     #v9=(Uninit);v16=(Uninit);v24=(Uninit);v27=(Uninit);v34=(Uninit);
a=0;//     sub-int v42, v37, v28
a=0;// 
a=0;//     sub-int v8, v42, v21
a=0;// 
a=0;//     .line 398
a=0;//     .local v8, "bottomGravTop":I
a=0;//     #v8=(Integer);
a=0;//     add-int v34, v8, v35
a=0;// 
a=0;//     .line 399
a=0;//     .restart local v34    # "prevTop":I
a=0;//     #v34=(Integer);
a=0;//     add-int v16, v8, v17
a=0;// 
a=0;//     .line 400
a=0;//     .restart local v16    # "currTop":I
a=0;//     #v16=(Integer);
a=0;//     add-int v24, v8, v25
a=0;// 
a=0;//     .restart local v24    # "nextTop":I
a=0;//     #v24=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 382
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);v27=(Unknown);v28=(Unknown);v29=(Unknown);v30=(Unknown);v31=(Unknown);v32=(Unknown);v33=(Unknown);v34=(Unknown);v35=(Unknown);v36=(Unknown);v37=(Unknown);v38=(Unknown);v39=(Unknown);v40=(Unknown);v41=(Unknown);v42=(Unknown);v43=(Unknown);v44=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x10 -> :sswitch_0
a=0;//         0x50 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
}}
