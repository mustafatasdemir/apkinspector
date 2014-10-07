package android.support.v7.internal.widget; class AbsSpinnerICS$RecycleBin {/*

.class Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;
.super Ljava/lang/Object;
.source "AbsSpinnerICS.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/AbsSpinnerICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "RecycleBin"
.end annotation


# instance fields
.field private final mScrapHeap:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Landroid/support/v7/internal/widget/AbsSpinnerICS;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/AbsSpinnerICS;)V
    .locals 1
    .parameter

    .prologue
    .line 422
    iput-object p1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->this$0:Landroid/support/v7/internal/widget/AbsSpinnerICS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 423
    #p0=(Reference);
    new-instance v0, Landroid/util/SparseArray;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;

    return-void
.end method


# virtual methods
.method clear()V
    .locals 6

    .prologue
    .line 442
    iget-object v2, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;

    .line 443
    .local v2, scrapHeap:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/view/View;>;"
    #v2=(Reference);
    invoke-virtual {v2}, Landroid/util/SparseArray;->size()I

    move-result v0

    .line 444
    .local v0, count:I
    #v0=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    if-ge v1, v0, :cond_1

    .line 445
    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/view/View;

    .line 446
    .local v3, view:Landroid/view/View;
    if-eqz v3, :cond_0

    .line 447
    iget-object v4, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->this$0:Landroid/support/v7/internal/widget/AbsSpinnerICS;

    #v4=(Reference);
    const/4 v5, 0x1

    #v5=(One);
    invoke-static {v4, v3, v5}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->access$100(Landroid/support/v7/internal/widget/AbsSpinnerICS;Landroid/view/View;Z)V

    .line 444
    :cond_0
    #v4=(Conflicted);v5=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 450
    .end local v3           #view:Landroid/view/View;
    :cond_1
    #v3=(Conflicted);
    invoke-virtual {v2}, Landroid/util/SparseArray;->clear()V

    .line 451
    return-void
.end method

.method get(I)Landroid/view/View;
    .locals 2
    .parameter "position"

    .prologue
    .line 431
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/view/View;

    .line 432
    .local v0, result:Landroid/view/View;
    if-eqz v0, :cond_0

    .line 434
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;

    invoke-virtual {v1, p1}, Landroid/util/SparseArray;->delete(I)V

    .line 438
    :cond_0
    return-object v0
.end method

.method public put(ILandroid/view/View;)V
    .locals 1
    .parameter "position"
    .parameter "v"

    .prologue
    .line 426
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->mScrapHeap:Landroid/util/SparseArray;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 427
    return-void
.end method

*/}
