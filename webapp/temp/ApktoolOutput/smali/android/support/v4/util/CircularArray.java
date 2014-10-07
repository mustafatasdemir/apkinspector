package android.support.v4.util; class CircularArray {/*

.class public Landroid/support/v4/util/CircularArray;
.super Ljava/lang/Object;
.source "CircularArray.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private mCapacityBitmask:I

.field private mElements:[Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[TE;"
        }
    .end annotation
.end field

.field private mHead:I

.field private mTail:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 47
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    const/16 v0, 0x8

    #v0=(PosByte);
    invoke-direct {p0, v0}, Landroid/support/v4/util/CircularArray;-><init>(I)V

    .line 48
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(I)V
    .locals 3
    .parameter "minCapacity"

    .prologue
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    const/4 v2, 0x1

    .line 55
    #v2=(One);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    #p0=(Reference);
    if-gtz p1, :cond_0

    .line 57
    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    const-string v2, "capacity must be positive"

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 59
    :cond_0
    #v1=(Uninit);v2=(One);
    move v0, p1

    .line 62
    .local v0, arrayCapacity:I
    #v0=(Integer);
    invoke-static {p1}, Ljava/lang/Integer;->bitCount(I)I

    move-result v1

    #v1=(Integer);
    if-eq v1, v2, :cond_1

    .line 63
    invoke-static {p1}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    shl-int v0, v2, v1

    .line 65
    :cond_1
    add-int/lit8 v1, v0, -0x1

    iput v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I

    .line 66
    new-array v1, v0, [Ljava/lang/Object;

    #v1=(Reference);
    check-cast v1, [Ljava/lang/Object;

    iput-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    .line 67
    return-void
.end method

.method private doubleCapacity()V
    .locals 7

    .prologue
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    const/4 v6, 0x0

    .line 28
    #v6=(Null);
    iget-object v4, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    #v4=(Reference);
    array-length v1, v4

    .line 29
    .local v1, n:I
    #v1=(Integer);
    iget v4, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v4=(Integer);
    sub-int v3, v1, v4

    .line 30
    .local v3, r:I
    #v3=(Integer);
    shl-int/lit8 v2, v1, 0x1

    .line 31
    .local v2, newCapacity:I
    #v2=(Integer);
    if-gez v2, :cond_0

    .line 32
    new-instance v4, Ljava/lang/RuntimeException;

    #v4=(UninitRef);
    const-string v5, "Too big"

    #v5=(Reference);
    invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4

    .line 34
    :cond_0
    #v4=(Integer);v5=(Uninit);
    new-array v0, v2, [Ljava/lang/Object;

    .line 35
    .local v0, a:[Ljava/lang/Object;
    #v0=(Reference);
    iget-object v4, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v5=(Integer);
    invoke-static {v4, v5, v0, v6, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 36
    iget-object v4, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    iget v5, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    invoke-static {v4, v6, v0, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 37
    check-cast v0, [Ljava/lang/Object;

    .end local v0           #a:[Ljava/lang/Object;
    iput-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    .line 38
    iput v6, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    .line 39
    iput v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    .line 40
    add-int/lit8 v4, v2, -0x1

    #v4=(Integer);
    iput v4, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I

    .line 41
    return-void
.end method


# virtual methods
.method public final addFirst(Ljava/lang/Object;)V
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .prologue
    .line 70
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    .local p1, e:Ljava/lang/Object;,"TE;"
    iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v0=(Integer);
    add-int/lit8 v0, v0, -0x1

    iget v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I

    #v1=(Integer);
    and-int/2addr v0, v1

    iput v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    .line 71
    iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    aput-object p1, v0, v1

    .line 72
    iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    if-ne v0, v1, :cond_0

    .line 73
    invoke-direct {p0}, Landroid/support/v4/util/CircularArray;->doubleCapacity()V

    .line 75
    :cond_0
    return-void
.end method

.method public final addLast(Ljava/lang/Object;)V
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    .prologue
    .line 78
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    .local p1, e:Ljava/lang/Object;,"TE;"
    iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    #v1=(Integer);
    aput-object p1, v0, v1

    .line 79
    iget v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    iget v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I

    and-int/2addr v0, v1

    iput v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    .line 80
    iget v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    if-ne v0, v1, :cond_0

    .line 81
    invoke-direct {p0}, Landroid/support/v4/util/CircularArray;->doubleCapacity()V

    .line 83
    :cond_0
    return-void
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 3
    .parameter "i"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 113
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    if-ltz p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/util/CircularArray;->size()I

    move-result v1

    #v1=(Integer);
    if-lt p1, v1, :cond_1

    :cond_0
    #v1=(Conflicted);
    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    #v1=(Reference);
    throw v1

    .line 114
    :cond_1
    #v1=(Integer);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    add-int/2addr v1, p1

    iget v2, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I

    #v2=(Integer);
    and-int v0, v1, v2

    .line 115
    .local v0, p:I
    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    #v1=(Reference);
    aget-object v1, v1, v0

    #v1=(Null);
    return-object v1
.end method

.method public final getFirst()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 103
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    #v1=(Integer);
    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    #v0=(Reference);
    throw v0

    .line 104
    :cond_0
    #v0=(Integer);
    iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    aget-object v0, v0, v1

    #v0=(Null);
    return-object v0
.end method

.method public final getLast()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 108
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    #v1=(Integer);
    if-ne v0, v1, :cond_0

    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    #v0=(Reference);
    throw v0

    .line 109
    :cond_0
    #v0=(Integer);
    iget-object v0, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    add-int/lit8 v1, v1, -0x1

    iget v2, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I

    #v2=(Integer);
    and-int/2addr v1, v2

    aget-object v0, v0, v1

    #v0=(Null);
    return-object v0
.end method

.method public final isEmpty()Z
    .locals 2

    .prologue
    .line 123
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    iget v0, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    #v1=(Integer);
    if-ne v0, v1, :cond_0

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

.method public final popFirst()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 86
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v1=(Integer);
    iget v2, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    #v2=(Integer);
    if-ne v1, v2, :cond_0

    new-instance v1, Ljava/lang/ArrayIndexOutOfBoundsException;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    #v1=(Reference);
    throw v1

    .line 87
    :cond_0
    #v1=(Integer);
    iget-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    aget-object v0, v1, v2

    .line 88
    .local v0, result:Ljava/lang/Object;,"TE;"
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    iget v2, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    const/4 v3, 0x0

    #v3=(Null);
    aput-object v3, v1, v2

    .line 89
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x1

    iget v2, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I

    and-int/2addr v1, v2

    iput v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    .line 90
    return-object v0
.end method

.method public final popLast()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    .prologue
    .line 94
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    iget v2, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v2=(Integer);
    iget v3, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    #v3=(Integer);
    if-ne v2, v3, :cond_0

    new-instance v2, Ljava/lang/ArrayIndexOutOfBoundsException;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    #v2=(Reference);
    throw v2

    .line 95
    :cond_0
    #v2=(Integer);
    iget v2, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    add-int/lit8 v2, v2, -0x1

    iget v3, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I

    and-int v1, v2, v3

    .line 96
    .local v1, t:I
    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    #v2=(Reference);
    aget-object v0, v2, v1

    .line 97
    .local v0, result:Ljava/lang/Object;,"TE;"
    #v0=(Null);
    iget-object v2, p0, Landroid/support/v4/util/CircularArray;->mElements:[Ljava/lang/Object;

    const/4 v3, 0x0

    #v3=(Null);
    aput-object v3, v2, v1

    .line 98
    iput v1, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    .line 99
    return-object v0
.end method

.method public final size()I
    .locals 2

    .prologue
    .line 119
    .local p0, this:Landroid/support/v4/util/CircularArray;,"Landroid/support/v4/util/CircularArray<TE;>;"
    iget v0, p0, Landroid/support/v4/util/CircularArray;->mTail:I

    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/util/CircularArray;->mHead:I

    #v1=(Integer);
    sub-int/2addr v0, v1

    iget v1, p0, Landroid/support/v4/util/CircularArray;->mCapacityBitmask:I

    and-int/2addr v0, v1

    return v0
.end method

*/}
