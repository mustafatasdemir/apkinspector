package android.support.v4.util; class SparseArrayCompat {/*

.class public Landroid/support/v4/util/SparseArrayCompat;
.super Ljava/lang/Object;
.source "SparseArrayCompat.java"

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

.field private mKeys:[I

.field private mSize:I

.field private mValues:[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 24
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 35
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    const/16 v0, 0xa

    #v0=(PosByte);
    invoke-direct {p0, v0}, Landroid/support/v4/util/SparseArrayCompat;-><init>(I)V

    .line 36
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(I)V
    .locals 2
    .parameter "initialCapacity"

    .prologue
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    const/4 v1, 0x0

    .line 45
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    #p0=(Reference);
    iput-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    .line 46
    if-nez p1, :cond_0

    .line 47
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    .line 48
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    .line 54
    :goto_0
    iput v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    .line 55
    return-void

    .line 50
    :cond_0
    #v0=(Uninit);
    invoke-static {p1}, Landroid/support/v4/util/ContainerHelpers;->idealIntArraySize(I)I

    move-result p1

    .line 51
    new-array v0, p1, [I

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    .line 52
    new-array v0, p1, [Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    goto :goto_0
.end method

.method private gc()V
    .locals 7

    .prologue
    .line 141
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    .line 142
    .local v2, n:I
    #v2=(Integer);
    const/4 v3, 0x0

    .line 143
    .local v3, o:I
    #v3=(Null);
    iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    .line 144
    .local v1, keys:[I
    #v1=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    .line 146
    .local v5, values:[Ljava/lang/Object;
    #v5=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v3=(Integer);v4=(Conflicted);v6=(Conflicted);
    if-ge v0, v2, :cond_2

    .line 147
    aget-object v4, v5, v0

    .line 149
    .local v4, val:Ljava/lang/Object;
    #v4=(Null);
    sget-object v6, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;

    #v6=(Reference);
    if-eq v4, v6, :cond_1

    .line 150
    if-eq v0, v3, :cond_0

    .line 151
    aget v6, v1, v0

    #v6=(Integer);
    aput v6, v1, v3

    .line 152
    aput-object v4, v5, v3

    .line 153
    const/4 v6, 0x0

    #v6=(Null);
    aput-object v6, v5, v0

    .line 156
    :cond_0
    #v6=(Reference);
    add-int/lit8 v3, v3, 0x1

    .line 146
    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 160
    .end local v4           #val:Ljava/lang/Object;
    :cond_2
    #v4=(Conflicted);v6=(Conflicted);
    const/4 v6, 0x0

    #v6=(Null);
    iput-boolean v6, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    .line 161
    iput v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    .line 164
    return-void
.end method


# virtual methods
.method public append(ILjava/lang/Object;)V
    .locals 7
    .parameter "key"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    .local p2, value:Ljava/lang/Object;,"TE;"
    const/4 v6, 0x0

    .line 325
    #v6=(Null);
    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v4=(Integer);
    if-eqz v4, :cond_0

    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v5=(Integer);
    add-int/lit8 v5, v5, -0x1

    aget v4, v4, v5

    #v4=(Integer);
    if-gt p1, v4, :cond_0

    .line 326
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/SparseArrayCompat;->put(ILjava/lang/Object;)V

    .line 352
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);
    return-void

    .line 330
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-boolean v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    #v4=(Boolean);
    if-eqz v4, :cond_1

    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    if-lt v4, v5, :cond_1

    .line 331
    invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V

    .line 334
    :cond_1
    #v5=(Conflicted);
    iget v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    .line 335
    .local v3, pos:I
    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    array-length v4, v4

    #v4=(Integer);
    if-lt v3, v4, :cond_2

    .line 336
    add-int/lit8 v4, v3, 0x1

    invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealIntArraySize(I)I

    move-result v0

    .line 338
    .local v0, n:I
    #v0=(Integer);
    new-array v1, v0, [I

    .line 339
    .local v1, nkeys:[I
    #v1=(Reference);
    new-array v2, v0, [Ljava/lang/Object;

    .line 342
    .local v2, nvalues:[Ljava/lang/Object;
    #v2=(Reference);
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v1, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 343
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 345
    iput-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    .line 346
    iput-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    .line 349
    .end local v0           #n:I
    .end local v1           #nkeys:[I
    .end local v2           #nvalues:[Ljava/lang/Object;
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    aput p1, v4, v3

    .line 350
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    aput-object p2, v4, v3

    .line 351
    add-int/lit8 v4, v3, 0x1

    #v4=(Integer);
    iput v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    goto :goto_0
.end method

.method public clear()V
    .locals 5

    .prologue
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    const/4 v4, 0x0

    .line 309
    #v4=(Null);
    iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    .line 310
    .local v1, n:I
    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    .line 312
    .local v2, values:[Ljava/lang/Object;
    #v2=(Reference);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v3=(Conflicted);
    if-ge v0, v1, :cond_0

    .line 313
    const/4 v3, 0x0

    #v3=(Null);
    aput-object v3, v2, v0

    .line 312
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 316
    :cond_0
    #v3=(Conflicted);
    iput v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    .line 317
    iput-boolean v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    .line 318
    return-void
.end method

.method public clone()Landroid/support/v4/util/SparseArrayCompat;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/support/v4/util/SparseArrayCompat",
            "<TE;>;"
        }
    .end annotation

    .prologue
    .line 60
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    const/4 v1, 0x0

    .line 62
    .local v1, clone:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    :try_start_0
    #v1=(Null);
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    move-object v0, v2

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/util/SparseArrayCompat;

    move-object v1, v0

    .line 63
    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    invoke-virtual {v2}, [I->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [I

    iput-object v2, v1, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    .line 64
    iget-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    invoke-virtual {v2}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Ljava/lang/Object;

    iput-object v2, v1, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    :goto_0
    #v0=(Conflicted);
    return-object v1

    .line 65
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
    .line 23
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    invoke-virtual {p0}, Landroid/support/v4/util/SparseArrayCompat;->clone()Landroid/support/v4/util/SparseArrayCompat;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public delete(I)V
    .locals 3
    .parameter "key"

    .prologue
    .line 98
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v2=(Integer);
    invoke-static {v1, v2, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I

    move-result v0

    .line 100
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    .line 101
    iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    aget-object v1, v1, v0

    #v1=(Null);
    sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;

    #v2=(Reference);
    if-eq v1, v2, :cond_0

    .line 102
    iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v1=(Reference);
    sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;

    aput-object v2, v1, v0

    .line 103
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    .line 106
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method public get(I)Ljava/lang/Object;
    .locals 1
    .parameter "key"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 76
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, v0}, Landroid/support/v4/util/SparseArrayCompat;->get(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public get(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .parameter "key"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)TE;"
        }
    .end annotation

    .prologue
    .line 85
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    .local p2, valueIfKeyNotFound:Ljava/lang/Object;,"TE;"
    iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v2=(Integer);
    invoke-static {v1, v2, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I

    move-result v0

    .line 87
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    aget-object v1, v1, v0

    #v1=(Null);
    sget-object v2, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;

    #v2=(Reference);
    if-ne v1, v2, :cond_1

    .line 90
    .end local p2           #valueIfKeyNotFound:Ljava/lang/Object;,"TE;"
    :cond_0
    :goto_0
    #v1=(Reference);v2=(Conflicted);
    return-object p2

    .restart local p2       #valueIfKeyNotFound:Ljava/lang/Object;,"TE;"
    :cond_1
    #v1=(Null);v2=(Reference);
    iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v1=(Reference);
    aget-object p2, v1, v0

    #p2=(Null);
    goto :goto_0
.end method

.method public indexOfKey(I)I
    .locals 2
    .parameter "key"

    .prologue
    .line 276
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 277
    invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V

    .line 280
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v1=(Integer);
    invoke-static {v0, v1, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I

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
    .line 294
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    .local p1, value:Ljava/lang/Object;,"TE;"
    iget-boolean v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 295
    invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V

    .line 298
    :cond_0
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);
    iget v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v1=(Integer);
    if-ge v0, v1, :cond_2

    .line 299
    iget-object v1, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v1=(Reference);
    aget-object v1, v1, v0

    #v1=(Null);
    if-ne v1, p1, :cond_1

    .line 302
    .end local v0           #i:I
    :goto_1
    #v1=(Integer);
    return v0

    .line 298
    .restart local v0       #i:I
    :cond_1
    #v1=(Null);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 302
    :cond_2
    #v1=(Integer);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_1
.end method

.method public keyAt(I)I
    .locals 1
    .parameter "index"

    .prologue
    .line 236
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 237
    invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V

    .line 240
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v0=(Reference);
    aget v0, v0, p1

    #v0=(Integer);
    return v0
.end method

.method public put(ILjava/lang/Object;)V
    .locals 8
    .parameter "key"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITE;)V"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    .local p2, value:Ljava/lang/Object;,"TE;"
    const/4 v6, 0x0

    .line 172
    #v6=(Null);
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v5=(Integer);
    invoke-static {v4, v5, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I

    move-result v0

    .line 174
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    .line 175
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    aput-object p2, v4, v0

    .line 216
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Integer);v7=(Conflicted);
    return-void

    .line 177
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference);v5=(Integer);v6=(Null);v7=(Uninit);
    xor-int/lit8 v0, v0, -0x1

    .line 179
    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v4=(Integer);
    if-ge v0, v4, :cond_1

    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v4=(Reference);
    aget-object v4, v4, v0

    #v4=(Null);
    sget-object v5, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;

    #v5=(Reference);
    if-ne v4, v5, :cond_1

    .line 180
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    aput p1, v4, v0

    .line 181
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    aput-object p2, v4, v0

    goto :goto_0

    .line 185
    :cond_1
    #v4=(Integer);v5=(Conflicted);
    iget-boolean v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    #v4=(Boolean);
    if-eqz v4, :cond_2

    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    if-lt v4, v5, :cond_2

    .line 186
    invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V

    .line 189
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    invoke-static {v4, v5, p1}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I

    move-result v4

    #v4=(Integer);
    xor-int/lit8 v0, v4, -0x1

    .line 192
    :cond_2
    #v5=(Conflicted);
    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    if-lt v4, v5, :cond_3

    .line 193
    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    add-int/lit8 v4, v4, 0x1

    invoke-static {v4}, Landroid/support/v4/util/ContainerHelpers;->idealIntArraySize(I)I

    move-result v1

    .line 195
    .local v1, n:I
    #v1=(Integer);
    new-array v2, v1, [I

    .line 196
    .local v2, nkeys:[I
    #v2=(Reference);
    new-array v3, v1, [Ljava/lang/Object;

    .line 199
    .local v3, nvalues:[Ljava/lang/Object;
    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v2, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 200
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    invoke-static {v4, v6, v3, v6, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 202
    iput-object v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    .line 203
    iput-object v3, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    .line 206
    .end local v1           #n:I
    .end local v2           #nkeys:[I
    .end local v3           #nvalues:[Ljava/lang/Object;
    :cond_3
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v4=(Integer);
    sub-int/2addr v4, v0

    if-eqz v4, :cond_4

    .line 208
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v5=(Reference);
    add-int/lit8 v6, v0, 0x1

    #v6=(Integer);
    iget v7, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v7=(Integer);
    sub-int/2addr v7, v0

    invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 209
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    iget-object v5, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    add-int/lit8 v6, v0, 0x1

    iget v7, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    sub-int/2addr v7, v0

    invoke-static {v4, v0, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 212
    :cond_4
    #v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mKeys:[I

    #v4=(Reference);
    aput p1, v4, v0

    .line 213
    iget-object v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    aput-object p2, v4, v0

    .line 214
    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v4=(Integer);
    add-int/lit8 v4, v4, 0x1

    iput v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    goto/16 :goto_0
.end method

.method public remove(I)V
    .locals 0
    .parameter "key"

    .prologue
    .line 112
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    invoke-virtual {p0, p1}, Landroid/support/v4/util/SparseArrayCompat;->delete(I)V

    .line 113
    return-void
.end method

.method public removeAt(I)V
    .locals 2
    .parameter "index"

    .prologue
    .line 119
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    aget-object v0, v0, p1

    #v0=(Null);
    sget-object v1, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;

    #v1=(Reference);
    if-eq v0, v1, :cond_0

    .line 120
    iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    sget-object v1, Landroid/support/v4/util/SparseArrayCompat;->DELETED:Ljava/lang/Object;

    aput-object v1, v0, p1

    .line 121
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    .line 123
    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public removeAtRange(II)V
    .locals 4
    .parameter "index"
    .parameter "size"

    .prologue
    .line 132
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    iget v2, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v2=(Integer);
    add-int v3, p1, p2

    #v3=(Integer);
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 133
    .local v0, end:I
    #v0=(Integer);
    move v1, p1

    .local v1, i:I
    :goto_0
    #v1=(Integer);
    if-ge v1, v0, :cond_0

    .line 134
    invoke-virtual {p0, v1}, Landroid/support/v4/util/SparseArrayCompat;->removeAt(I)V

    .line 133
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 136
    :cond_0
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
    .line 263
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    .local p2, value:Ljava/lang/Object;,"TE;"
    iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 264
    invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V

    .line 267
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    aput-object p2, v0, p1

    .line 268
    return-void
.end method

.method public size()I
    .locals 1

    .prologue
    .line 223
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 224
    invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V

    .line 227
    :cond_0
    iget v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v0=(Integer);
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 363
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    invoke-virtual {p0}, Landroid/support/v4/util/SparseArrayCompat;->size()I

    move-result v4

    #v4=(Integer);
    if-gtz v4, :cond_0

    .line 364
    const-string v4, "{}"

    .line 384
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference);
    return-object v4

    .line 367
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    mul-int/lit8 v4, v4, 0x1c

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 368
    .local v0, buffer:Ljava/lang/StringBuilder;
    #v0=(Reference);
    const/16 v4, 0x7b

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 369
    const/4 v1, 0x0

    .local v1, i:I
    :goto_1
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget v4, p0, Landroid/support/v4/util/SparseArrayCompat;->mSize:I

    #v4=(Integer);
    if-ge v1, v4, :cond_3

    .line 370
    if-lez v1, :cond_1

    .line 371
    const-string v4, ", "

    #v4=(Reference);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    :cond_1
    #v4=(Conflicted);
    invoke-virtual {p0, v1}, Landroid/support/v4/util/SparseArrayCompat;->keyAt(I)I

    move-result v2

    .line 374
    .local v2, key:I
    #v2=(Integer);
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 375
    const/16 v4, 0x3d

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 376
    invoke-virtual {p0, v1}, Landroid/support/v4/util/SparseArrayCompat;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    .line 377
    .local v3, value:Ljava/lang/Object;
    #v3=(Reference);
    if-eq v3, p0, :cond_2

    .line 378
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 369
    :goto_2
    #v4=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 380
    :cond_2
    #v4=(PosByte);
    const-string v4, "(this Map)"

    #v4=(Reference);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 383
    .end local v2           #key:I
    .end local v3           #value:Ljava/lang/Object;
    :cond_3
    #v2=(Conflicted);v3=(Conflicted);v4=(Integer);
    const/16 v4, 0x7d

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 384
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
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
    .line 250
    .local p0, this:Landroid/support/v4/util/SparseArrayCompat;,"Landroid/support/v4/util/SparseArrayCompat<TE;>;"
    iget-boolean v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mGarbage:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 251
    invoke-direct {p0}, Landroid/support/v4/util/SparseArrayCompat;->gc()V

    .line 254
    :cond_0
    iget-object v0, p0, Landroid/support/v4/util/SparseArrayCompat;->mValues:[Ljava/lang/Object;

    #v0=(Reference);
    aget-object v0, v0, p1

    #v0=(Null);
    return-object v0
.end method

*/}
