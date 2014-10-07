package android.support.v7.internal.widget; class SpinnerICS$DropDownAdapter {/*

.class Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
.super Ljava/lang/Object;
.source "SpinnerICS.java"

# interfaces
.implements Landroid/widget/ListAdapter;
.implements Landroid/widget/SpinnerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/SpinnerICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "DropDownAdapter"
.end annotation


# instance fields
.field private mAdapter:Landroid/widget/SpinnerAdapter;

.field private mListAdapter:Landroid/widget/ListAdapter;


# direct methods
.method public constructor <init>(Landroid/widget/SpinnerAdapter;)V
    .locals 1
    .parameter "adapter"

    .prologue
    .line 535
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 536
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    .line 537
    instance-of v0, p1, Landroid/widget/ListAdapter;

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 538
    check-cast p1, Landroid/widget/ListAdapter;

    .end local p1
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mListAdapter:Landroid/widget/ListAdapter;

    .line 540
    :cond_0
    return-void
.end method


# virtual methods
.method public areAllItemsEnabled()Z
    .locals 2

    .prologue
    .line 584
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mListAdapter:Landroid/widget/ListAdapter;

    .line 585
    .local v0, adapter:Landroid/widget/ListAdapter;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 586
    invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z

    move-result v1

    .line 588
    :goto_0
    #v1=(Boolean);
    return v1

    :cond_0
    #v1=(Uninit);
    const/4 v1, 0x1

    #v1=(One);
    goto :goto_0
.end method

.method public getCount()I
    .locals 1

    .prologue
    .line 543
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->getCount()I

    move-result v0

    #v0=(Integer);
    goto :goto_0
.end method

.method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .parameter "position"
    .parameter "convertView"
    .parameter "parent"

    .prologue
    .line 559
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    invoke-interface {v0, p1, p2, p3}, Landroid/widget/SpinnerAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter "position"

    .prologue
    .line 547
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v0=(Reference);
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0
.end method

.method public getItemId(I)J
    .locals 2
    .parameter "position"

    .prologue
    .line 551
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v0=(Reference);
    if-nez v0, :cond_0

    const-wide/16 v0, -0x1

    :goto_0
    #v0=(LongLo);v1=(LongHi);
    return-wide v0

    :cond_0
    #v0=(Reference);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->getItemId(I)J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    goto :goto_0
.end method

.method public getItemViewType(I)I
    .locals 1
    .parameter "position"

    .prologue
    .line 606
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 1
    .parameter "position"
    .parameter "convertView"
    .parameter "parent"

    .prologue
    .line 555
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 610
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 564
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->hasStableIds()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 614
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->getCount()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isEnabled(I)Z
    .locals 2
    .parameter "position"

    .prologue
    .line 597
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mListAdapter:Landroid/widget/ListAdapter;

    .line 598
    .local v0, adapter:Landroid/widget/ListAdapter;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 599
    invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z

    move-result v1

    .line 601
    :goto_0
    #v1=(Boolean);
    return v1

    :cond_0
    #v1=(Uninit);
    const/4 v1, 0x1

    #v1=(One);
    goto :goto_0
.end method

.method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1
    .parameter "observer"

    .prologue
    .line 568
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 569
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 571
    :cond_0
    return-void
.end method

.method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
    .locals 1
    .parameter "observer"

    .prologue
    .line 574
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 575
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;

    invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V

    .line 577
    :cond_0
    return-void
.end method

*/}
