package android.support.v7.app; class ActionBar$LayoutParams {/*

.class public Landroid/support/v7/app/ActionBar$LayoutParams;
.super Landroid/view/ViewGroup$MarginLayoutParams;
.source "ActionBar.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/app/ActionBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "LayoutParams"
.end annotation


# instance fields
.field public gravity:I


# direct methods
.method public constructor <init>(I)V
    .locals 2
    .parameter "gravity"

    .prologue
    .line 1070
    const/4 v0, -0x2

    #v0=(Byte);
    const/4 v1, -0x1

    #v1=(Byte);
    invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/app/ActionBar$LayoutParams;-><init>(III)V

    .line 1071
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(II)V
    .locals 1
    .parameter "width"
    .parameter "height"

    .prologue
    .line 1060
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 1048
    #p0=(Reference);
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1061
    const/16 v0, 0x13

    #v0=(PosByte);
    iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1062
    return-void
.end method

.method public constructor <init>(III)V
    .locals 1
    .parameter "width"
    .parameter "height"
    .parameter "gravity"

    .prologue
    .line 1065
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 1048
    #p0=(Reference);
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1066
    iput p3, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1067
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3
    .parameter "c"
    .parameter "attrs"

    .prologue
    const/4 v2, -0x1

    .line 1051
    #v2=(Byte);
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 1048
    #p0=(Reference);
    iput v2, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1053
    sget-object v1, Landroid/support/v7/appcompat/R$styleable;->ActionBarLayout:[I

    #v1=(Reference);
    invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 1055
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1056
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 1057
    return-void
.end method

.method public constructor <init>(Landroid/support/v7/app/ActionBar$LayoutParams;)V
    .locals 1
    .parameter "source"

    .prologue
    .line 1074
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 1048
    #p0=(Reference);
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1076
    iget v0, p1, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1077
    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
    .locals 1
    .parameter "source"

    .prologue
    .line 1080
    invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1048
    #p0=(Reference);
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1081
    return-void
.end method

*/}
