package android.support.v4.view; class ViewPager$ViewPositionComparator {/*

.class Landroid/support/v4/view/ViewPager$ViewPositionComparator;
.super Ljava/lang/Object;
.source "ViewPager.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/view/ViewPager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ViewPositionComparator"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator",
        "<",
        "Landroid/view/View;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2884
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public compare(Landroid/view/View;Landroid/view/View;)I
    .locals 4
    .parameter "lhs"
    .parameter "rhs"

    .prologue
    .line 2887
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 2888
    .local v0, llp:Landroid/support/v4/view/ViewPager$LayoutParams;
    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/view/ViewPager$LayoutParams;

    .line 2889
    .local v1, rlp:Landroid/support/v4/view/ViewPager$LayoutParams;
    iget-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v2=(Boolean);
    iget-boolean v3, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    #v3=(Boolean);
    if-eq v2, v3, :cond_1

    .line 2890
    iget-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z

    if-eqz v2, :cond_0

    const/4 v2, 0x1

    .line 2892
    :goto_0
    #v2=(Integer);v3=(Integer);
    return v2

    .line 2890
    :cond_0
    #v2=(Boolean);v3=(Boolean);
    const/4 v2, -0x1

    #v2=(Byte);
    goto :goto_0

    .line 2892
    :cond_1
    #v2=(Boolean);
    iget v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I

    #v2=(Integer);
    iget v3, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I

    #v3=(Integer);
    sub-int/2addr v2, v3

    goto :goto_0
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 2884
    check-cast p1, Landroid/view/View;

    .end local p1
    check-cast p2, Landroid/view/View;

    .end local p2
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/view/ViewPager$ViewPositionComparator;->compare(Landroid/view/View;Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

*/}
