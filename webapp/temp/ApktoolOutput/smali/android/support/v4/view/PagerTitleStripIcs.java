package android.support.v4.view; class PagerTitleStripIcs {/*

.class Landroid/support/v4/view/PagerTitleStripIcs;
.super Ljava/lang/Object;
.source "PagerTitleStripIcs.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    #p0=(Reference);
    return-void
.end method

.method public static setSingleLineAllCaps(Landroid/widget/TextView;)V
    .locals 2
    .parameter "text"

    .prologue
    .line 28
    new-instance v0, Landroid/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/widget/TextView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/support/v4/view/PagerTitleStripIcs$SingleLineAllCapsTransform;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 29
    return-void
.end method

*/}
