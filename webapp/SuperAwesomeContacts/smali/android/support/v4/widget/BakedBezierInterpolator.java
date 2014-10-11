package android.support.v4.widget; class BakedBezierInterpolator { void a() { int a;
a=0;// .class final Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BakedBezierInterpolator.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/animation/Interpolator;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final INSTANCE:Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// 
a=0;// .field private static final STEP_SIZE:F
a=0;// 
a=0;// .field private static final VALUES:[F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     new-instance v0, Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/BakedBezierInterpolator;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/widget/BakedBezierInterpolator;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/BakedBezierInterpolator;);
a=0;//     sput-object v0, Landroid/support/v4/widget/BakedBezierInterpolator;->INSTANCE:Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// 
a=0;//     .line 48
a=0;//     const/16 v0, 0x65
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [F
a=0;// 
a=0;//     #v0=(Reference,[F);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     .line 61
a=0;//     const/high16 v0, 0x3f800000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sget-object v1, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v1=(Reference,[F);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     int-to-float v1, v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     div-float/2addr v0, v1
a=0;// 
a=0;//     #v0=(Float);
a=0;//     sput v0, Landroid/support/v4/widget/BakedBezierInterpolator;->STEP_SIZE:F
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 48
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x0
a=0;//         0x3951b717
a=0;//         0x3a6bedfa
a=0;//         0x3af9096c
a=0;//         0x3b6bedfa
a=0;//         0x3bc154ca
a=0;//         0x3c0ce704
a=0;//         0x3c42f838
a=0;//         0x3c809d49
a=0;//         0x3cab367a
a=0;//         0x3cd288ce
a=0;//         0x3d037b4a
a=0;//         0x3d20902e
a=0;//         0x3d401a37
a=0;//         0x3d67d567
a=0;//         0x3d86594b
a=0;//         0x3d9d4952
a=0;//         0x3db5a858
a=0;//         0x3dd38ef3
a=0;//         0x3df2e48f
a=0;//         0x3e0a233a
a=0;//         0x3e1b8bac
a=0;//         0x3e2dab9f
a=0;//         0x3e456d5d
a=0;//         0x3e5930be
a=0;//         0x3e72b021
a=0;//         0x3e86809d
a=0;//         0x3e941206
a=0;//         0x3e9f2e49
a=0;//         0x3ead5cfb
a=0;//         0x3ebbc01a
a=0;//         0x3eca57a8
a=0;//         0x3ed923a3
a=0;//         0x3ee5119d
a=0;//         0x3ef404ea
a=0;//         0x3f000000
a=0;//         0x3f05fd8b
a=0;//         0x3f0bfb16
a=0;//         0x3f11f213
a=0;//         0x3f17e282
a=0;//         0x3f1d07c8
a=0;//         0x3f221ff3
a=0;//         0x3f273190
a=0;//         0x3f2b7803
a=0;//         0x3f3068dc
a=0;//         0x3f349518
a=0;//         0x3f38adac
a=0;//         0x3f3c0ebf
a=0;//         0x3f400d1b
a=0;//         0x3f4353f8
a=0;//         0x3f468db9
a=0;//         0x3f49b3d0
a=0;//         0x3f4ccccd
a=0;//         0x3f4f8a09
a=0;//         0x3f523a2a
a=0;//         0x3f552546
a=0;//         0x3f576c8b
a=0;//         0x3f59ad43
a=0;//         0x3f5bda51
a=0;//         0x3f5e00d2
a=0;//         0x3f601a37
a=0;//         0x3f621ff3
a=0;//         0x3f641f21
a=0;//         0x3f65cfab
a=0;//         0x3f677319
a=0;//         0x3f694af5
a=0;//         0x3f6a9fbe
a=0;//         0x3f6c56d6
a=0;//         0x3f6d97f6
a=0;//         0x3f6ecbfb
a=0;//         0x3f702de0
a=0;//         0x3f7182aa
a=0;//         0x3f7295ea
a=0;//         0x3f73a92a
a=0;//         0x3f74a8c1
a=0;//         0x3f75a858
a=0;//         0x3f769446
a=0;//         0x3f7758e2
a=0;//         0x3f783127
a=0;//         0x3f78e219
a=0;//         0x3f79ad43
a=0;//         0x3f7a4a8c
a=0;//         0x3f7b020c
a=0;//         0x3f7b8bac
a=0;//         0x3f7c154d
a=0;//         0x3f7c91d1
a=0;//         0x3f7d07c8
a=0;//         0x3f7d7732
a=0;//         0x3f7de00d
a=0;//         0x3f7e3bcd
a=0;//         0x3f7e9100
a=0;//         0x3f7ed917
a=0;//         0x3f7f1412
a=0;//         0x3f7f4f0e
a=0;//         0x3f7f837b
a=0;//         0x3f7fa440
a=0;//         0x3f7fcb92
a=0;//         0x3f7fdf3b
a=0;//         0x3f7ff2e5
a=0;//         0x3f800000
a=0;//         0x3f800000
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 35
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 36
a=0;//     #p0=(Reference,Landroid/support/v4/widget/BakedBezierInterpolator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static final getInstance()Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     sget-object v0, Landroid/support/v4/widget/BakedBezierInterpolator;->INSTANCE:Landroid/support/v4/widget/BakedBezierInterpolator;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/BakedBezierInterpolator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getInterpolation(F)F
a=0;//     .locals 7
a=0;//     .param p1, "input"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 65
a=0;//     #v5=(Null);
a=0;//     cmpl-float v6, p1, v4
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ltz v6, :cond_0
a=0;// 
a=0;//     .line 81
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Float);v6=(Integer);
a=0;//     return v4
a=0;// 
a=0;//     .line 69
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Null);v6=(Byte);
a=0;//     cmpg-float v4, p1, v5
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_1
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 70
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_1
a=0;//     #v4=(Byte);
a=0;//     sget-object v4, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     array-length v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v4, v4, -0x1
a=0;// 
a=0;//     int-to-float v4, v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     mul-float/2addr v4, p1
a=0;// 
a=0;//     float-to-int v4, v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sget-object v5, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     array-length v5, v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int/lit8 v5, v5, -0x2
a=0;// 
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 77
a=0;//     .local v1, "position":I
a=0;//     #v1=(Integer);
a=0;//     int-to-float v4, v1
a=0;// 
a=0;//     #v4=(Float);
a=0;//     sget v5, Landroid/support/v4/widget/BakedBezierInterpolator;->STEP_SIZE:F
a=0;// 
a=0;//     mul-float v2, v4, v5
a=0;// 
a=0;//     .line 78
a=0;//     .local v2, "quantized":F
a=0;//     #v2=(Float);
a=0;//     sub-float v0, p1, v2
a=0;// 
a=0;//     .line 79
a=0;//     .local v0, "difference":F
a=0;//     #v0=(Float);
a=0;//     sget v4, Landroid/support/v4/widget/BakedBezierInterpolator;->STEP_SIZE:F
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     div-float v3, v0, v4
a=0;// 
a=0;//     .line 81
a=0;//     .local v3, "weight":F
a=0;//     #v3=(Float);
a=0;//     sget-object v4, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v4=(Reference,[F);
a=0;//     aget v4, v4, v1
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sget-object v5, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v5=(Reference,[F);
a=0;//     add-int/lit8 v6, v1, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     aget v5, v5, v6
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sget-object v6, Landroid/support/v4/widget/BakedBezierInterpolator;->VALUES:[F
a=0;// 
a=0;//     #v6=(Reference,[F);
a=0;//     aget v6, v6, v1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-float/2addr v5, v6
a=0;// 
a=0;//     #v5=(Float);
a=0;//     mul-float/2addr v5, v3
a=0;// 
a=0;//     add-float/2addr v4, v5
a=0;// 
a=0;//     #v4=(Float);
a=0;//     goto :goto_0
a=0;// .end method
}}
