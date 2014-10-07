package android.support.v4.widget; class ListViewAutoScrollHelper {/*

.class public Landroid/support/v4/widget/ListViewAutoScrollHelper;
.super Landroid/support/v4/widget/AutoScrollHelper;
.source "ListViewAutoScrollHelper.java"


# instance fields
.field private final mTarget:Landroid/widget/ListView;


# direct methods
.method public constructor <init>(Landroid/widget/ListView;)V
    .locals 0
    .parameter "target"

    .prologue
    .line 30
    invoke-direct {p0, p1}, Landroid/support/v4/widget/AutoScrollHelper;-><init>(Landroid/view/View;)V

    .line 32
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/widget/ListViewAutoScrollHelper;->mTarget:Landroid/widget/ListView;

    .line 33
    return-void
.end method


# virtual methods
.method public canTargetScrollHorizontally(I)Z
    .locals 1
    .parameter "direction"

    .prologue
    .line 55
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public canTargetScrollVertically(I)Z
    .locals 10
    .parameter "direction"

    .prologue
    const/4 v7, 0x0

    .line 60
    #v7=(Null);
    iget-object v6, p0, Landroid/support/v4/widget/ListViewAutoScrollHelper;->mTarget:Landroid/widget/ListView;

    .line 61
    .local v6, target:Landroid/widget/ListView;
    #v6=(Reference);
    invoke-virtual {v6}, Landroid/widget/ListView;->getCount()I

    move-result v3

    .line 62
    .local v3, itemCount:I
    #v3=(Integer);
    if-nez v3, :cond_1

    .line 92
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Boolean);v8=(Conflicted);v9=(Conflicted);
    return v7

    .line 66
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);
    invoke-virtual {v6}, Landroid/widget/ListView;->getChildCount()I

    move-result v0

    .line 67
    .local v0, childCount:I
    #v0=(Integer);
    invoke-virtual {v6}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v1

    .line 68
    .local v1, firstPosition:I
    #v1=(Integer);
    add-int v4, v1, v0

    .line 70
    .local v4, lastPosition:I
    #v4=(Integer);
    if-lez p1, :cond_3

    .line 72
    if-lt v4, v3, :cond_2

    .line 73
    add-int/lit8 v8, v0, -0x1

    #v8=(Integer);
    invoke-virtual {v6, v8}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    .line 74
    .local v5, lastView:Landroid/view/View;
    #v5=(Reference);
    invoke-virtual {v5}, Landroid/view/View;->getBottom()I

    move-result v8

    invoke-virtual {v6}, Landroid/widget/ListView;->getHeight()I

    move-result v9

    #v9=(Integer);
    if-le v8, v9, :cond_0

    .line 92
    .end local v5           #lastView:Landroid/view/View;
    :cond_2
    #v2=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    const/4 v7, 0x1

    #v7=(One);
    goto :goto_0

    .line 78
    :cond_3
    #v2=(Uninit);v5=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);
    if-gez p1, :cond_0

    .line 80
    if-gtz v1, :cond_2

    .line 81
    invoke-virtual {v6, v7}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    .line 82
    .local v2, firstView:Landroid/view/View;
    #v2=(Reference);
    invoke-virtual {v2}, Landroid/view/View;->getTop()I

    move-result v8

    #v8=(Integer);
    if-ltz v8, :cond_2

    goto :goto_0
.end method

.method public scrollTargetBy(II)V
    .locals 5
    .parameter "deltaX"
    .parameter "deltaY"

    .prologue
    .line 37
    iget-object v3, p0, Landroid/support/v4/widget/ListViewAutoScrollHelper;->mTarget:Landroid/widget/ListView;

    .line 38
    .local v3, target:Landroid/widget/ListView;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/widget/ListView;->getFirstVisiblePosition()I

    move-result v0

    .line 39
    .local v0, firstPosition:I
    #v0=(Integer);
    const/4 v4, -0x1

    #v4=(Byte);
    if-ne v0, v4, :cond_1

    .line 50
    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v4=(Integer);
    return-void

    .line 43
    :cond_1
    #v1=(Uninit);v2=(Uninit);v4=(Byte);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v3, v4}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;

    move-result-object v1

    .line 44
    .local v1, firstView:Landroid/view/View;
    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 48
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    move-result v4

    #v4=(Integer);
    sub-int v2, v4, p2

    .line 49
    .local v2, newTop:I
    #v2=(Integer);
    invoke-virtual {v3, v0, v2}, Landroid/widget/ListView;->setSelectionFromTop(II)V

    goto :goto_0
.end method

*/}
