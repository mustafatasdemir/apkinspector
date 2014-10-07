package android.support.v4.app; class NoSaveStateFrameLayout {/*

.class Landroid/support/v4/app/NoSaveStateFrameLayout;
.super Landroid/widget/FrameLayout;
.source "NoSaveStateFrameLayout.java"


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .parameter "context"

    .prologue
    .line 45
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 46
    #p0=(Reference);
    return-void
.end method

.method static wrap(Landroid/view/View;)Landroid/view/ViewGroup;
    .locals 5
    .parameter "child"

    .prologue
    const/4 v4, -0x1

    .line 32
    #v4=(Byte);
    new-instance v2, Landroid/support/v4/app/NoSaveStateFrameLayout;

    #v2=(UninitRef);
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    #v3=(Reference);
    invoke-direct {v2, v3}, Landroid/support/v4/app/NoSaveStateFrameLayout;-><init>(Landroid/content/Context;)V

    .line 33
    .local v2, wrapper:Landroid/support/v4/app/NoSaveStateFrameLayout;
    #v2=(Reference);
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 34
    .local v0, childParams:Landroid/view/ViewGroup$LayoutParams;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 35
    invoke-virtual {v2, v0}, Landroid/support/v4/app/NoSaveStateFrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    :cond_0
    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    #v1=(UninitRef);
    invoke-direct {v1, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 39
    .local v1, lp:Landroid/widget/FrameLayout$LayoutParams;
    #v1=(Reference);
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 40
    invoke-virtual {v2, p0}, Landroid/support/v4/app/NoSaveStateFrameLayout;->addView(Landroid/view/View;)V

    .line 41
    return-object v2
.end method


# virtual methods
.method protected dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 61
    .local p1, container:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    invoke-virtual {p0, p1}, Landroid/support/v4/app/NoSaveStateFrameLayout;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 62
    return-void
.end method

.method protected dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Parcelable;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 53
    .local p1, container:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    invoke-virtual {p0, p1}, Landroid/support/v4/app/NoSaveStateFrameLayout;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 54
    return-void
.end method

*/}
