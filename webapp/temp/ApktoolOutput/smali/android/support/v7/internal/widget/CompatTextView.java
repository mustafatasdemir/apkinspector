package android.support.v7.internal.widget; class CompatTextView {/*

.class public Landroid/support/v7/internal/widget/CompatTextView;
.super Landroid/widget/TextView;
.source "CompatTextView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;
    }
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 36
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/CompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 37
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 40
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/CompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 41
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    const/4 v3, 0x0

    .line 44
    #v3=(Null);
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 46
    #p0=(Reference);
    const/4 v0, 0x0

    .line 48
    .local v0, allCaps:Z
    #v0=(Null);
    sget-object v2, Landroid/support/v7/appcompat/R$styleable;->CompatTextView:[I

    #v2=(Reference);
    invoke-virtual {p1, p2, v2, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 50
    .local v1, style:Landroid/content/res/TypedArray;
    #v1=(Reference);
    invoke-virtual {v1, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 51
    #v0=(Boolean);
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 56
    if-eqz v0, :cond_0

    .line 57
    new-instance v2, Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;

    #v2=(UninitRef);
    invoke-direct {v2, p1}, Landroid/support/v7/internal/widget/CompatTextView$AllCapsTransformationMethod;-><init>(Landroid/content/Context;)V

    #v2=(Reference);
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/CompatTextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 59
    :cond_0
    return-void
.end method

*/}
