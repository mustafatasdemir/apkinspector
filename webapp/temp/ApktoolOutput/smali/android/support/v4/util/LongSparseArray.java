package android.support.v4.util; class LongSparseArray {/*

.class public Landroid/support/v4/util/LongSparseArray;
.super Ljava/lang/Object;
.source "LongSparseArray.java"

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Cloneable;"
    }
.end annotation


# static fields
.field private static final DELETED:Ljava/lang/Object;


# instance fields
.field private mGarbage:Z

.field private mKeys:[J

.field private mSize:I

.field private mValues:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 44
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 55
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/16 v0, 0xa

    #v0=(PosByte);
    invoke-direct {p0, v0}, Landroid/support/v4/util/LongSparseArray;-><init>(I)V

    .line 56
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .parameter "initialCapacity"

    .prologue
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/4 v1, 0x0

    .line 65
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    #p0=(Reference);
    iput-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 66
    if-nez p1, :cond_0

    .line 67
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_LONGS:[J

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 68
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 74
    :goto_0
    iput v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 75
    return-void

    .line 70
    :cond_0
    #v0=(Uninit);
    invoke-static {p1}, Landroid/support/v4/util/ContainerHelpers;->idealLongArraySize(I)I

    move-result p1

    .line 71
    new-array v0, p1, [J

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 72
    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    goto :goto_0
.end method

.method private gc()V
    .locals 8

    .prologue
    .line 148
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 149
    .local v2, n:I
    #v2=(Integer);
    const/4 v3, 0x0

    .line 150
    .local v3, o:I
    #v3=(Null);
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 151
    .local v1, keys:[J
    #v1=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 153
    .local v5, values:[Ljava/lang/Object;
    #v5=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v3=(Integer);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    if-ge v0, v2, :cond_2

    .line 154
    aget-object v4, v5, v0

    .line 156
    .local v4, val:Ljava/lang/Object;
    #v4=(Null);
    sget-object v6, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v6=(Reference);
    if-eq v4, v6, :cond_1

    .line 157
    if-eq v0, v3, :cond_0

    .line 158
    aget-wide v6, v1, v0

    #v6=(LongLo);v7=(LongHi);
    aput-wide v6, v1, v3

    .line 159
    aput-object v4, v5, v3

    .line 160
    const/4 v6, 0x0

    #v6=(Null);
    aput-object v6, v5, v0

    .line 163
    :cond_0
    #v6=(Reference);v7=(Conflicted);
    add-int/lit8 v3, v3, 0x1

    .line 153
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 167
    .end local v4           #val:Ljava/lang/Object;
    :cond_2
    #v4=(Conflicted);v6=(Conflicted);
    const/4 v6, 0x0

    #v6=(Null);
    iput-boolean v6, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 168
    iput v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 171
    return-void
.end method


# virtual methods
.method public append(JLjava/lang/Object;)V
    .locals 7
    .parameter "key"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTE;)V"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p3, value:Ljava/lang/Object;,"TE;"
    const/4 v6, 0x0

    .line 330
    #v6=(Null);
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    if-eqz v4, :cond_0

    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v5=(Integer);
    add-int/lit8 v5, v5, -0x1

    aget-wide v4, v4, v5

    #v4=(LongLo);v5=(LongHi);
    cmp-long v4, p1, v4

    #v4=(Byte);
    if-gtz v4, :cond_0

    .line 331
    invoke-virtual {p0, p1, p2, p3}, Landroid/support/v4/util/LongSparseArray;->put(JLjava/lang/Object;)V

    .line 357
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Integer);v5=(Conflicted);
    return-void

    .line 335
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v4=(Boolean);
    if-eqz v4, :cond_1

    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    if-lt v4, v5, :cond_1

    .line 336
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 339
    :cond_1
    #v5=(Conflicted);
    iget v3, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 340
    .local v3, pos:I
    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    array-length v4, v4

    #v4=(Integer);
    if-lt v3, v4, :cond_2

    .line 341
    add-int/lit8 v4, v3, 0x1

    invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealLongArraySize(I)I

    move-result v0

    .line 343
    .local v0, n:I
    #v0=(Integer);
    new-array v1, v0, [J

    .line 344
    .local v1, nkeys:[J
    #v1=(Reference);
    new-array v2, v0, [Ljava/lang/Object;

    .line 347
    .local v2, nvalues:[Ljava/lang/Object;
    #v2=(Reference);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 348
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 350
    iput-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 351
    iput-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 354
    .end local v0           #n:I
    .end local v1           #nkeys:[J
    .end local v2           #nvalues:[Ljava/lang/Object;
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    aput-wide p1, v4, v3

    .line 355
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aput-object p3, v4, v3

    .line 356
    add-int/lit8 v4, v3, 0x1

    #v4=(Integer);
    iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    goto :goto_0
.end method

.method public clear()V
    .locals 5

    .prologue
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/4 v4, 0x0

    .line 314
    #v4=(Null);
    iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 315
    .local v1, n:I
    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 317
    .local v2, values:[Ljava/lang/Object;
    #v2=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v3=(Conflicted);
    if-ge v0, v1, :cond_0

    .line 318
    const/4 v3, 0x0

    #v3=(Null);
    aput-object v3, v2, v0

    .line 317
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 321
    :cond_0
    #v3=(Conflicted);
    iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    .line 322
    iput-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 323
    return-void
.end method

.method public clone()Landroid/support/v4/util/LongSparseArray;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/support/v4/util/LongSparseArray",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 80
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/4 v1, 0x0

    .line 82
    .local v1, clone:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    :try_start_0
    #v1=(Null);
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    move-object v0, v2

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/util/LongSparseArray;

    move-object v1, v0

    .line 83
    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    invoke-virtual {v2}, [J->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [J

    iput-object v2, v1, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 84
    iget-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    iput-object v2, v1, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 88
    :goto_0
    #v0=(Conflicted);
    return-object v1

    .line 85
    :catch_0
    #v2=(Conflicted);
    move-exception v2

    #v2=(Reference);
    goto :goto_0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 43
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    invoke-virtual {p0}, Landroid/support/v4/util/LongSparseArray;->clone()Landroid/support/v4/util/LongSparseArray;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public delete(J)V
    .locals 3
    .parameter "key"

    .prologue
    .line 118
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v2=(Integer);
    invoke-static {v1, v2, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I

    move-result v0

    .line 120
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    .line 121
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aget-object v1, v1, v0

    #v1=(Null);
    sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v2=(Reference);
    if-eq v1, v2, :cond_0

    .line 122
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v1=(Reference);
    sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    aput-object v2, v1, v0

    .line 123
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 126
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method public get(J)Ljava/lang/Object;
    .locals 1
    .parameter "key"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)TE;"
        }
    .end annotation

    .prologue
    .line 96
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, p2, v0}, Landroid/support/v4/util/LongSparseArray;->get(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public get(JLjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .parameter "key"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTE;)TE;"
        }
    .end annotation

    .prologue
    .line 105
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p3, valueIfKeyNotFound:Ljava/lang/Object;,"TE;"
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v2=(Integer);
    invoke-static {v1, v2, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I

    move-result v0

    .line 107
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aget-object v1, v1, v0

    #v1=(Null);
    sget-object v2, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v2=(Reference);
    if-ne v1, v2, :cond_1

    .line 110
    .end local p3           #valueIfKeyNotFound:Ljava/lang/Object;,"TE;"
    :cond_0
    :goto_0
    #v1=(Reference);v2=(Conflicted);
    return-object p3

    .restart local p3       #valueIfKeyNotFound:Ljava/lang/Object;,"TE;"
    :cond_1
    #v1=(Null);v2=(Reference);
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v1=(Reference);
    aget-object p3, v1, v0

    #p3=(Null);
    goto :goto_0
.end method

.method public indexOfKey(J)I
    .locals 2
    .parameter "key"

    .prologue
    .line 283
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 284
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 287
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v1=(Integer);
    invoke-static {v0, v1, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public indexOfValue(Ljava/lang/Object;)I
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)I"
        }
    .end annotation

    .prologue
    .line 299
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p1, value:Ljava/lang/Object;,"TE;"
    iget-boolean v1, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 300
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 303
    :cond_0
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v1=(Integer);
    if-ge v0, v1, :cond_2

    .line 304
    iget-object v1, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v1=(Reference);
    aget-object v1, v1, v0

    #v1=(Null);
    if-ne v1, p1, :cond_1

    .line 307
    .end local v0           #i:I
    :goto_1
    #v1=(Integer);
    return v0

    .line 303
    .restart local v0       #i:I
    :cond_1
    #v1=(Null);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 307
    :cond_2
    #v1=(Integer);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_1
.end method

.method public keyAt(I)J
    .locals 2
    .parameter "index"

    .prologue
    .line 243
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 244
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 247
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v0=(Reference);
    aget-wide v0, v0, p1

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public put(JLjava/lang/Object;)V
    .locals 8
    .parameter "key"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTE;)V"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p3, value:Ljava/lang/Object;,"TE;"
    const/4 v6, 0x0

    .line 179
    #v6=(Null);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v5=(Integer);
    invoke-static {v4, v5, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I

    move-result v0

    .line 181
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    .line 182
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aput-object p3, v4, v0

    .line 223
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);
    return-void

    .line 184
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference);v5=(Integer);v6=(Null);v7=(Uninit);
    xor-int/lit8 v0, v0, -0x1

    .line 186
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    if-ge v0, v4, :cond_1

    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v4=(Reference);
    aget-object v4, v4, v0

    #v4=(Null);
    sget-object v5, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v5=(Reference);
    if-ne v4, v5, :cond_1

    .line 187
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    aput-wide p1, v4, v0

    .line 188
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aput-object p3, v4, v0

    goto :goto_0

    .line 192
    :cond_1
    #v4=(Integer);v5=(Conflicted);
    iget-boolean v4, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v4=(Boolean);
    if-eqz v4, :cond_2

    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    if-lt v4, v5, :cond_2

    .line 193
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 196
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    invoke-static {v4, v5, p1, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([JIJ)I

    move-result v4

    #v4=(Integer);
    xor-int/lit8 v0, v4, -0x1

    .line 199
    :cond_2
    #v5=(Conflicted);
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    if-lt v4, v5, :cond_3

    .line 200
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealLongArraySize(I)I

    move-result v1

    .line 202
    .local v1, n:I
    #v1=(Integer);
    new-array v2, v1, [J

    .line 203
    .local v2, nkeys:[J
    #v2=(Reference);
    new-array v3, v1, [Ljava/lang/Object;

    .line 206
    .local v3, nvalues:[Ljava/lang/Object;
    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 207
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v3, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 209
    iput-object v2, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    .line 210
    iput-object v3, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    .line 213
    .end local v1           #n:I
    .end local v2           #nkeys:[J
    .end local v3           #nvalues:[Ljava/lang/Object;
    :cond_3
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    sub-int/2addr v4, v0

    if-eqz v4, :cond_4

    .line 215
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v5=(Reference);
    add-int/lit8 v6, v0, 0x1

    #v6=(Integer);
    iget v7, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v7=(Integer);
    sub-int/2addr v7, v0

    invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 216
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    iget-object v5, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    add-int/lit8 v6, v0, 0x1

    iget v7, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    sub-int/2addr v7, v0

    invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 219
    :cond_4
    #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mKeys:[J

    #v4=(Reference);
    aput-wide p1, v4, v0

    .line 220
    iget-object v4, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    aput-object p3, v4, v0

    .line 221
    iget v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    goto/16 :goto_0
.end method

.method public remove(J)V
    .locals 0
    .parameter "key"

    .prologue
    .line 132
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/LongSparseArray;->delete(J)V

    .line 133
    return-void
.end method

.method public removeAt(I)V
    .locals 2
    .parameter "index"

    .prologue
    .line 139
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    aget-object v0, v0, p1

    #v0=(Null);
    sget-object v1, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    #v1=(Reference);
    if-eq v0, v1, :cond_0

    .line 140
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    sget-object v1, Landroid/support/v4/util/LongSparseArray;->DELETED:Ljava/lang/Object;

    aput-object v1, v0, p1

    .line 141
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    .line 143
    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public setValueAt(ILjava/lang/Object;)V
    .locals 1
    .parameter "index"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .prologue
    .line 270
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    .local p2, value:Ljava/lang/Object;,"TE;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 271
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 274
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    aput-object p2, v0, p1

    .line 275
    return-void
.end method

.method public size()I
    .locals 1

    .prologue
    .line 230
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 231
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 234
    :cond_0
    iget v0, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v0=(Integer);
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    .prologue
    .line 368
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    invoke-virtual {p0}, Landroid/support/v4/util/LongSparseArray;->size()I

    move-result v5

    #v5=(Integer);
    if-gtz v5, :cond_0

    .line 369
    const-string v5, "{}"

    .line 389
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference);
    return-object v5

    .line 372
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Integer);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    mul-int/lit8 v5, v5, 0x1c

    invoke-direct {v0, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 373
    .local v0, buffer:Ljava/lang/StringBuilder;
    #v0=(Reference);
    const/16 v5, 0x7b

    #v5=(PosByte);
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 374
    const/4 v1, 0x0

    .local v1, i:I
    :goto_1
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget v5, p0, Landroid/support/v4/util/LongSparseArray;->mSize:I

    #v5=(Integer);
    if-ge v1, v5, :cond_3

    .line 375
    if-lez v1, :cond_1

    .line 376
    const-string v5, ", "

    #v5=(Reference);
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    :cond_1
    #v5=(Conflicted);
    invoke-virtual {p0, v1}, Landroid/support/v4/util/LongSparseArray;->keyAt(I)J

    move-result-wide v2

    .line 379
    .local v2, key:J
    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 380
    const/16 v5, 0x3d

    #v5=(PosByte);
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 381
    invoke-virtual {p0, v1}, Landroid/support/v4/util/LongSparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    .line 382
    .local v4, value:Ljava/lang/Object;
    #v4=(Reference);
    if-eq v4, p0, :cond_2

    .line 383
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 374
    :goto_2
    #v5=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 385
    :cond_2
    #v5=(PosByte);
    const-string v5, "(this Map)"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 388
    .end local v2           #key:J
    .end local v4           #value:Ljava/lang/Object;
    :cond_3
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Integer);
    const/16 v5, 0x7d

    #v5=(PosByte);
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 389
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    #v5=(Reference);
    goto :goto_0
.end method

.method public valueAt(I)Ljava/lang/Object;
    .locals 1
    .parameter "index"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 257
    .local p0, this:Landroid/support/v4/util/LongSparseArray;,"Landroid/support/v4/util/LongSparseArray<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/LongSparseArray;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 258
    invoke-direct {p0}, Landroid/support/v4/util/LongSparseArray;->gc()V

    .line 261
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/LongSparseArray;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    aget-object v0, v0, p1

    #v0=(Null);
    return-object v0
.end method

*/}
