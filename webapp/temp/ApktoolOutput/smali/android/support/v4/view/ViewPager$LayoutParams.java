package android.support.v4.view; class ViewPager$LayoutParams {/*

.class public Landroid/support/v4/view/ViewPager$LayoutParams;
.super Landroid/view/ViewGroup$LayoutParams;
.source "ViewPager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field childIndex:I

.field public gravity:I

.field public isDecor:Z

.field needsMeasure:Z

.field position:I

.field widthFactor:F


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 2872
    #v0=(Byte);
    invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 2853
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F

    .line 2873
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 2876
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 2853
    #p0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    iput v1, p0, Landroid/support/v4/view/ViewPager$LayoutParams;->widthFactor:F

    .line 2878
    invoke-static {}, Landroid/support/v4/view/ViewPager;->access$400()[I

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 2879
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const/16 v2, 0x30

    #v2=(PosByte);
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInteger(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/view/ViewPager$LayoutParams;->gravity:I

    .line 2880
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 2881
    return-void
.end method

*/}
