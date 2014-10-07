package android.support.v4.util; class SimpleArrayMap {/*

.class public Landroid/support/v4/util/SimpleArrayMap;
.super Ljava/lang/Object;
.source "SimpleArrayMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field private static final BASE_SIZE:I = 0x4

.field private static final CACHE_SIZE:I = 0xa

.field private static final DEBUG:Z = false

.field private static final TAG:Ljava/lang/String; = "ArrayMap"

.field static mBaseCache:[Ljava/lang/Object;

.field static mBaseCacheSize:I

.field static mTwiceBaseCache:[Ljava/lang/Object;

.field static mTwiceBaseCacheSize:I


# instance fields
.field mArray:[Ljava/lang/Object;

.field mHashes:[I

.field mSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 208
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 209
    #p0=(Reference);
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 210
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 211
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 212
    return-void
.end method

.method public constructor <init>(I)V
    .locals 1
    .parameter "capacity"

    .prologue
    .line 217
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 218
    #p0=(Reference);
    if-nez p1, :cond_0

    .line 219
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 220
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 224
    :goto_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 225
    return-void

    .line 222
    :cond_0
    #v0=(Uninit);
    invoke-direct {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;->allocArrays(I)V

    goto :goto_0
.end method

.method public constructor <init>(Landroid/support/v4/util/SimpleArrayMap;)V
    .locals 0
    .parameter "map"

    .prologue
    .line 231
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    invoke-direct {p0}, Landroid/support/v4/util/SimpleArrayMap;-><init>()V

    .line 232
    #p0=(Reference);
    if-eqz p1, :cond_0

    .line 233
    invoke-virtual {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;->putAll(Landroid/support/v4/util/SimpleArrayMap;)V

    .line 235
    :cond_0
    return-void
.end method

.method private allocArrays(I)V
    .locals 5
    .parameter "size"

    .prologue
    .line 138
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    const/16 v1, 0x8

    #v1=(PosByte);
    if-ne p1, v1, :cond_2

    .line 139
    const-class v2, Landroid/support/v4/util/ArrayMap;

    #v2=(Reference);
    monitor-enter v2

    .line 140
    :try_start_0
    sget-object v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 141
    sget-object v0, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;

    .line 142
    .local v0, array:[Ljava/lang/Object;
    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 143
    const/4 v1, 0x0

    #v1=(Null);
    aget-object v1, v0, v1

    check-cast v1, [Ljava/lang/Object;

    #v1=(Reference);
    check-cast v1, [Ljava/lang/Object;

    sput-object v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;

    .line 144
    const/4 v1, 0x1

    #v1=(One);
    aget-object v1, v0, v1

    #v1=(Null);
    check-cast v1, [I

    #v1=(Reference);
    check-cast v1, [I

    iput-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 145
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v4, 0x0

    #v4=(Null);
    aput-object v4, v0, v3

    aput-object v4, v0, v1

    .line 146
    sget v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    sput v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I

    .line 149
    monitor-exit v2

    .line 170
    .end local v0           #array:[Ljava/lang/Object;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 151
    :cond_0
    #v0=(Uninit);v1=(Reference);v2=(Reference);v3=(Uninit);v4=(Uninit);
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 168
    :cond_1
    :goto_1
    #v1=(Conflicted);v2=(Conflicted);
    new-array v1, p1, [I

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 169
    shl-int/lit8 v1, p1, 0x1

    #v1=(Integer);
    new-array v1, v1, [Ljava/lang/Object;

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    goto :goto_0

    .line 151
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    :try_start_1
    #v1=(Reference);
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v1

    .line 152
    :cond_2
    #v0=(Uninit);v1=(PosByte);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    const/4 v1, 0x4

    if-ne p1, v1, :cond_1

    .line 153
    const-class v2, Landroid/support/v4/util/ArrayMap;

    #v2=(Reference);
    monitor-enter v2

    .line 154
    :try_start_2
    sget-object v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;

    #v1=(Reference);
    if-eqz v1, :cond_3

    .line 155
    sget-object v0, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;

    .line 156
    .restart local v0       #array:[Ljava/lang/Object;
    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 157
    const/4 v1, 0x0

    #v1=(Null);
    aget-object v1, v0, v1

    check-cast v1, [Ljava/lang/Object;

    #v1=(Reference);
    check-cast v1, [Ljava/lang/Object;

    sput-object v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;

    .line 158
    const/4 v1, 0x1

    #v1=(One);
    aget-object v1, v0, v1

    #v1=(Null);
    check-cast v1, [I

    #v1=(Reference);
    check-cast v1, [I

    iput-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 159
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v3, 0x1

    #v3=(One);
    const/4 v4, 0x0

    #v4=(Null);
    aput-object v4, v0, v3

    aput-object v4, v0, v1

    .line 160
    sget v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    sput v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I

    .line 163
    monitor-exit v2

    goto :goto_0

    .line 165
    .end local v0           #array:[Ljava/lang/Object;
    :catchall_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v1

    #v1=(Reference);
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw v1

    :cond_3
    :try_start_3
    #v0=(Uninit);v3=(Uninit);v4=(Uninit);
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_1
.end method

.method private static freeArrays([I[Ljava/lang/Object;I)V
    .locals 5
    .parameter "hashes"
    .parameter "array"
    .parameter "size"

    .prologue
    const/16 v3, 0xa

    #v3=(PosByte);
    const/4 v4, 0x2

    .line 173
    #v4=(PosByte);
    array-length v1, p0

    #v1=(Integer);
    const/16 v2, 0x8

    #v2=(PosByte);
    if-ne v1, v2, :cond_3

    .line 174
    const-class v2, Landroid/support/v4/util/ArrayMap;

    #v2=(Reference);
    monitor-enter v2

    .line 175
    :try_start_0
    sget v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I

    if-ge v1, v3, :cond_1

    .line 176
    const/4 v1, 0x0

    #v1=(Null);
    sget-object v3, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;

    #v3=(Reference);
    aput-object v3, p1, v1

    .line 177
    const/4 v1, 0x1

    #v1=(One);
    aput-object p0, p1, v1

    .line 178
    shl-int/lit8 v1, p2, 0x1

    #v1=(Integer);
    add-int/lit8 v0, v1, -0x1

    .local v0, i:I
    :goto_0
    #v0=(Integer);
    if-lt v0, v4, :cond_0

    .line 179
    const/4 v1, 0x0

    #v1=(Null);
    aput-object v1, p1, v0

    .line 178
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 181
    :cond_0
    #v1=(Integer);
    sput-object p1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCache:[Ljava/lang/Object;

    .line 182
    sget v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Landroid/support/v4/util/SimpleArrayMap;->mTwiceBaseCacheSize:I

    .line 186
    .end local v0           #i:I
    :cond_1
    #v0=(Conflicted);v3=(Conflicted);
    monitor-exit v2

    .line 202
    :cond_2
    :goto_1
    #v2=(Conflicted);
    return-void

    .line 186
    :catchall_0
    #v1=(Conflicted);v2=(Reference);
    move-exception v1

    #v1=(Reference);
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 187
    :cond_3
    #v0=(Uninit);v1=(Integer);v2=(PosByte);v3=(PosByte);
    array-length v1, p0

    const/4 v2, 0x4

    if-ne v1, v2, :cond_2

    .line 188
    const-class v2, Landroid/support/v4/util/ArrayMap;

    #v2=(Reference);
    monitor-enter v2

    .line 189
    :try_start_1
    sget v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I

    if-ge v1, v3, :cond_5

    .line 190
    const/4 v1, 0x0

    #v1=(Null);
    sget-object v3, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;

    #v3=(Reference);
    aput-object v3, p1, v1

    .line 191
    const/4 v1, 0x1

    #v1=(One);
    aput-object p0, p1, v1

    .line 192
    shl-int/lit8 v1, p2, 0x1

    #v1=(Integer);
    add-int/lit8 v0, v1, -0x1

    .restart local v0       #i:I
    :goto_2
    #v0=(Integer);
    if-lt v0, v4, :cond_4

    .line 193
    const/4 v1, 0x0

    #v1=(Null);
    aput-object v1, p1, v0

    .line 192
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 195
    :cond_4
    #v1=(Integer);
    sput-object p1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCache:[Ljava/lang/Object;

    .line 196
    sget v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I

    add-int/lit8 v1, v1, 0x1

    sput v1, Landroid/support/v4/util/SimpleArrayMap;->mBaseCacheSize:I

    .line 200
    .end local v0           #i:I
    :cond_5
    #v0=(Conflicted);v3=(Conflicted);
    monitor-exit v2

    goto :goto_1

    :catchall_1
    #v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v1
.end method


# virtual methods
.method public clear()V
    .locals 3

    .prologue
    .line 241
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v0=(Integer);
    if-eqz v0, :cond_0

    .line 242
    iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v2=(Integer);
    invoke-static {v0, v1, v2}, Landroid/support/v4/util/SimpleArrayMap;->freeArrays([I[Ljava/lang/Object;I)V

    .line 243
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I

    iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 244
    sget-object v0, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 245
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 247
    :cond_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3
    .parameter "key"

    .prologue
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    .line 273
    #v1=(Null);
    if-nez p1, :cond_2

    invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->indexOfNull()I

    move-result v2

    #v2=(Integer);
    if-ltz v2, :cond_1

    :cond_0
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(One);
    move v0, v1

    #v0=(Null);
    goto :goto_0

    :cond_2
    #v0=(One);v2=(Uninit);
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {p0, p1, v2}, Landroid/support/v4/util/SimpleArrayMap;->indexOf(Ljava/lang/Object;I)I

    move-result v2

    if-gez v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public containsValue(Ljava/lang/Object;)Z
    .locals 1
    .parameter "value"

    .prologue
    .line 303
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    invoke-virtual {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;->indexOfValue(Ljava/lang/Object;)I

    move-result v0

    #v0=(Integer);
    if-ltz v0, :cond_0

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

.method public ensureCapacity(I)V
    .locals 5
    .parameter "minimumCapacity"

    .prologue
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    const/4 v4, 0x0

    .line 254
    #v4=(Null);
    iget-object v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v2=(Reference);
    array-length v2, v2

    #v2=(Integer);
    if-ge v2, p1, :cond_1

    .line 255
    iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 256
    .local v1, ohashes:[I
    #v1=(Reference);
    iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 257
    .local v0, oarray:[Ljava/lang/Object;
    #v0=(Reference);
    invoke-direct {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;->allocArrays(I)V

    .line 258
    iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    if-lez v2, :cond_0

    .line 259
    iget-object v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v2=(Reference);
    iget v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v3=(Integer);
    invoke-static {v1, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 260
    iget-object v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    iget v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    shl-int/lit8 v3, v3, 0x1

    invoke-static {v0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 262
    :cond_0
    #v2=(Conflicted);v3=(Conflicted);
    iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v2=(Integer);
    invoke-static {v1, v0, v2}, Landroid/support/v4/util/SimpleArrayMap;->freeArrays([I[Ljava/lang/Object;I)V

    .line 264
    .end local v0           #oarray:[Ljava/lang/Object;
    .end local v1           #ohashes:[I
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 10
    .parameter "object"

    .prologue
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    const/4 v6, 0x1

    #v6=(One);
    const/4 v7, 0x0

    .line 522
    #v7=(Null);
    if-ne p0, p1, :cond_1

    .line 551
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v8=(Conflicted);v9=(Conflicted);
    return v6

    .line 525
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v8=(Uninit);v9=(Uninit);
    instance-of v8, p1, Ljava/util/Map;

    #v8=(Boolean);
    if-eqz v8, :cond_6

    move-object v3, p1

    .line 526
    #v3=(Reference);
    check-cast v3, Ljava/util/Map;

    .line 527
    .local v3, map:Ljava/util/Map;,"Ljava/util/Map<**>;"
    invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->size()I

    move-result v8

    #v8=(Integer);
    invoke-interface {v3}, Ljava/util/Map;->size()I

    move-result v9

    #v9=(Integer);
    if-eq v8, v9, :cond_2

    move v6, v7

    .line 528
    #v6=(Null);
    goto :goto_0

    .line 532
    :cond_2
    #v6=(One);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_1
    :try_start_0
    #v0=(Integer);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    iget v8, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    if-ge v0, v8, :cond_0

    .line 533
    invoke-virtual {p0, v0}, Landroid/support/v4/util/SimpleArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v2

    .line 534
    .local v2, key:Ljava/lang/Object;,"TK;"
    #v2=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    .line 535
    .local v4, mine:Ljava/lang/Object;,"TV;"
    #v4=(Reference);
    invoke-interface {v3, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 536
    .local v5, theirs:Ljava/lang/Object;
    #v5=(Reference);
    if-nez v4, :cond_4

    .line 537
    if-nez v5, :cond_3

    invoke-interface {v3, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-nez v8, :cond_5

    :cond_3
    #v8=(Integer);
    move v6, v7

    .line 538
    #v6=(Null);
    goto :goto_0

    .line 540
    :cond_4
    #v6=(One);
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v8

    #v8=(Boolean);
    if-nez v8, :cond_5

    move v6, v7

    .line 541
    #v6=(Null);
    goto :goto_0

    .line 532
    :cond_5
    #v6=(One);
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 544
    .end local v2           #key:Ljava/lang/Object;,"TK;"
    .end local v4           #mine:Ljava/lang/Object;,"TV;"
    .end local v5           #theirs:Ljava/lang/Object;
    :catch_0
    #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Integer);
    move-exception v1

    .local v1, ignored:Ljava/lang/NullPointerException;
    #v1=(Reference);
    move v6, v7

    .line 545
    #v6=(Null);
    goto :goto_0

    .line 546
    .end local v1           #ignored:Ljava/lang/NullPointerException;
    :catch_1
    #v1=(Uninit);v6=(One);
    move-exception v1

    .local v1, ignored:Ljava/lang/ClassCastException;
    #v1=(Reference);
    move v6, v7

    .line 547
    #v6=(Null);
    goto :goto_0

    .end local v0           #i:I
    .end local v1           #ignored:Ljava/lang/ClassCastException;
    .end local v3           #map:Ljava/util/Map;,"Ljava/util/Map<**>;"
    :cond_6
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(One);v8=(Boolean);v9=(Uninit);
    move v6, v7

    .line 551
    #v6=(Null);
    goto :goto_0
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .parameter "key"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 313
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->indexOfNull()I

    move-result v0

    .line 314
    .local v0, index:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);
    if-ltz v0, :cond_1

    iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v1=(Reference);
    shl-int/lit8 v2, v0, 0x1

    #v2=(Integer);
    add-int/lit8 v2, v2, 0x1

    aget-object v1, v1, v2

    :goto_1
    #v1=(Null);v2=(Conflicted);
    return-object v1

    .line 313
    .end local v0           #index:I
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p0, p1, v1}, Landroid/support/v4/util/SimpleArrayMap;->indexOf(Ljava/lang/Object;I)I

    move-result v0

    #v0=(Integer);
    goto :goto_0

    .line 314
    .restart local v0       #index:I
    :cond_1
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_1
.end method

.method public hashCode()I
    .locals 9

    .prologue
    .line 559
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 560
    .local v1, hashes:[I
    #v1=(Reference);
    iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 561
    .local v0, array:[Ljava/lang/Object;
    #v0=(Reference);
    const/4 v3, 0x0

    .line 562
    .local v3, result:I
    #v3=(Null);
    const/4 v2, 0x0

    .local v2, i:I
    #v2=(Null);
    const/4 v5, 0x1

    .local v5, v:I
    #v5=(One);
    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .local v4, s:I
    :goto_0
    #v2=(Integer);v3=(Integer);v4=(Integer);v5=(Integer);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    if-ge v2, v4, :cond_1

    .line 563
    aget-object v6, v0, v5

    .line 564
    .local v6, value:Ljava/lang/Object;
    #v6=(Null);
    aget v8, v1, v2

    #v8=(Integer);
    if-nez v6, :cond_0

    const/4 v7, 0x0

    :goto_1
    #v7=(Integer);
    xor-int/2addr v7, v8

    add-int/2addr v3, v7

    .line 562
    add-int/lit8 v2, v2, 0x1

    add-int/lit8 v5, v5, 0x2

    goto :goto_0

    .line 564
    :cond_0
    #v7=(Conflicted);
    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v7

    #v7=(Integer);
    goto :goto_1

    .line 566
    .end local v6           #value:Ljava/lang/Object;
    :cond_1
    #v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return v3
.end method

.method indexOf(Ljava/lang/Object;I)I
    .locals 6
    .parameter "key"
    .parameter "hash"

    .prologue
    .line 62
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 65
    .local v0, N:I
    #v0=(Integer);
    if-nez v0, :cond_1

    .line 66
    const/4 v3, -0x1

    .line 96
    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    return v3

    .line 69
    :cond_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    invoke-static {v4, v0, p2}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I

    move-result v3

    .line 72
    .local v3, index:I
    #v3=(Integer);
    if-ltz v3, :cond_0

    .line 77
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    shl-int/lit8 v5, v3, 0x1

    #v5=(Integer);
    aget-object v4, v4, v5

    #v4=(Null);
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    .line 83
    add-int/lit8 v1, v3, 0x1

    .local v1, end:I
    :goto_1
    #v1=(Integer);
    if-ge v1, v0, :cond_3

    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    aget v4, v4, v1

    #v4=(Integer);
    if-ne v4, p2, :cond_3

    .line 84
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v4=(Reference);
    shl-int/lit8 v5, v1, 0x1

    aget-object v4, v4, v5

    #v4=(Null);
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_2

    move v3, v1

    goto :goto_0

    .line 83
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 88
    :cond_3
    #v4=(Integer);
    add-int/lit8 v2, v3, -0x1

    .local v2, i:I
    :goto_2
    #v2=(Integer);
    if-ltz v2, :cond_5

    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    aget v4, v4, v2

    #v4=(Integer);
    if-ne v4, p2, :cond_5

    .line 89
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v4=(Reference);
    shl-int/lit8 v5, v2, 0x1

    aget-object v4, v4, v5

    #v4=(Null);
    invoke-virtual {p1, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_4

    move v3, v2

    goto :goto_0

    .line 88
    :cond_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    .line 96
    :cond_5
    #v4=(Integer);
    xor-int/lit8 v3, v1, -0x1

    goto :goto_0
.end method

.method indexOfNull()I
    .locals 6

    .prologue
    .line 100
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 103
    .local v0, N:I
    #v0=(Integer);
    if-nez v0, :cond_1

    .line 104
    const/4 v3, -0x1

    .line 134
    :cond_0
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    return v3

    .line 107
    :cond_1
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-static {v4, v0, v5}, Landroid/support/v4/util/ContainerHelpers;->binarySearch([III)I

    move-result v3

    .line 110
    .local v3, index:I
    #v3=(Integer);
    if-ltz v3, :cond_0

    .line 115
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    shl-int/lit8 v5, v3, 0x1

    #v5=(Integer);
    aget-object v4, v4, v5

    #v4=(Null);
    if-eqz v4, :cond_0

    .line 121
    add-int/lit8 v1, v3, 0x1

    .local v1, end:I
    :goto_1
    #v1=(Integer);
    if-ge v1, v0, :cond_3

    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    aget v4, v4, v1

    #v4=(Integer);
    if-nez v4, :cond_3

    .line 122
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v4=(Reference);
    shl-int/lit8 v5, v1, 0x1

    aget-object v4, v4, v5

    #v4=(Null);
    if-nez v4, :cond_2

    move v3, v1

    goto :goto_0

    .line 121
    :cond_2
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 126
    :cond_3
    #v4=(Integer);
    add-int/lit8 v2, v3, -0x1

    .local v2, i:I
    :goto_2
    #v2=(Integer);
    if-ltz v2, :cond_5

    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    aget v4, v4, v2

    #v4=(Integer);
    if-nez v4, :cond_5

    .line 127
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v4=(Reference);
    shl-int/lit8 v5, v2, 0x1

    aget-object v4, v4, v5

    #v4=(Null);
    if-nez v4, :cond_4

    move v3, v2

    goto :goto_0

    .line 126
    :cond_4
    add-int/lit8 v2, v2, -0x1

    goto :goto_2

    .line 134
    :cond_5
    #v4=(Integer);
    xor-int/lit8 v3, v1, -0x1

    goto :goto_0
.end method

.method indexOfValue(Ljava/lang/Object;)I
    .locals 4
    .parameter "value"

    .prologue
    .line 277
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    iget v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v3=(Integer);
    mul-int/lit8 v0, v3, 0x2

    .line 278
    .local v0, N:I
    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 279
    .local v1, array:[Ljava/lang/Object;
    #v1=(Reference);
    if-nez p1, :cond_1

    .line 280
    const/4 v2, 0x1

    .local v2, i:I
    :goto_0
    #v2=(Integer);
    if-ge v2, v0, :cond_3

    .line 281
    aget-object v3, v1, v2

    #v3=(Null);
    if-nez v3, :cond_0

    .line 282
    shr-int/lit8 v3, v2, 0x1

    .line 292
    :goto_1
    #v3=(Integer);
    return v3

    .line 280
    :cond_0
    #v3=(Null);
    add-int/lit8 v2, v2, 0x2

    goto :goto_0

    .line 286
    .end local v2           #i:I
    :cond_1
    #v2=(Uninit);v3=(Integer);
    const/4 v2, 0x1

    .restart local v2       #i:I
    :goto_2
    #v2=(Integer);
    if-ge v2, v0, :cond_3

    .line 287
    aget-object v3, v1, v2

    #v3=(Null);
    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 288
    shr-int/lit8 v3, v2, 0x1

    #v3=(Integer);
    goto :goto_1

    .line 286
    :cond_2
    #v3=(Boolean);
    add-int/lit8 v2, v2, 0x2

    goto :goto_2

    .line 292
    :cond_3
    #v3=(Integer);
    const/4 v3, -0x1

    #v3=(Byte);
    goto :goto_1
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 352
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v0=(Integer);
    if-gtz v0, :cond_0

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

.method public keyAt(I)Ljava/lang/Object;
    .locals 2
    .parameter "index"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TK;"
        }
    .end annotation

    .prologue
    .line 323
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v0=(Reference);
    shl-int/lit8 v1, p1, 0x1

    #v1=(Integer);
    aget-object v0, v0, v1

    #v0=(Null);
    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    .local p1, key:Ljava/lang/Object;,"TK;"
    .local p2, value:Ljava/lang/Object;,"TV;"
    const/16 v2, 0x8

    #v2=(PosByte);
    const/4 v6, 0x4

    #v6=(PosByte);
    const/4 v9, 0x0

    .line 366
    #v9=(Null);
    if-nez p1, :cond_0

    .line 367
    const/4 v0, 0x0

    .line 368
    .local v0, hash:I
    #v0=(Null);
    invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->indexOfNull()I

    move-result v1

    .line 373
    .local v1, index:I
    :goto_0
    #v0=(Integer);v1=(Integer);
    if-ltz v1, :cond_1

    .line 374
    shl-int/lit8 v6, v1, 0x1

    #v6=(Integer);
    add-int/lit8 v1, v6, 0x1

    .line 375
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v6=(Reference);
    aget-object v5, v6, v1

    .line 376
    .local v5, old:Ljava/lang/Object;,"TV;"
    #v5=(Null);
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    aput-object p2, v6, v1

    .line 411
    .end local v5           #old:Ljava/lang/Object;,"TV;"
    :goto_1
    #v2=(Integer);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Integer);v10=(Conflicted);
    return-object v5

    .line 370
    .end local v0           #hash:I
    .end local v1           #index:I
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosByte);v7=(Uninit);v8=(Uninit);v9=(Null);v10=(Uninit);
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 371
    .restart local v0       #hash:I
    #v0=(Integer);
    invoke-virtual {p0, p1, v0}, Landroid/support/v4/util/SimpleArrayMap;->indexOf(Ljava/lang/Object;I)I

    move-result v1

    .restart local v1       #index:I
    #v1=(Integer);
    goto :goto_0

    .line 380
    :cond_1
    xor-int/lit8 v1, v1, -0x1

    .line 381
    iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v7=(Integer);
    iget-object v8, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v8=(Reference);
    array-length v8, v8

    #v8=(Integer);
    if-lt v7, v8, :cond_4

    .line 382
    iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    if-lt v7, v2, :cond_6

    iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v6=(Integer);
    iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    shr-int/lit8 v7, v7, 0x1

    add-int v2, v6, v7

    .line 387
    .local v2, n:I
    :cond_2
    :goto_2
    #v2=(Integer);
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 388
    .local v4, ohashes:[I
    #v4=(Reference);
    iget-object v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 389
    .local v3, oarray:[Ljava/lang/Object;
    #v3=(Reference);
    invoke-direct {p0, v2}, Landroid/support/v4/util/SimpleArrayMap;->allocArrays(I)V

    .line 391
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v6=(Reference);
    array-length v6, v6

    #v6=(Integer);
    if-lez v6, :cond_3

    .line 393
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v6=(Reference);
    array-length v7, v4

    invoke-static {v4, v9, v6, v9, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 394
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    array-length v7, v3

    invoke-static {v3, v9, v6, v9, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 397
    :cond_3
    #v6=(Conflicted);
    iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v6=(Integer);
    invoke-static {v4, v3, v6}, Landroid/support/v4/util/SimpleArrayMap;->freeArrays([I[Ljava/lang/Object;I)V

    .line 400
    .end local v2           #n:I
    .end local v3           #oarray:[Ljava/lang/Object;
    .end local v4           #ohashes:[I
    :cond_4
    #v3=(Conflicted);v4=(Conflicted);
    iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    if-ge v1, v6, :cond_5

    .line 403
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v6=(Reference);
    iget-object v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v7=(Reference);
    add-int/lit8 v8, v1, 0x1

    iget v9, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v9=(Integer);
    sub-int/2addr v9, v1

    invoke-static {v6, v1, v7, v8, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 404
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    shl-int/lit8 v7, v1, 0x1

    #v7=(Integer);
    iget-object v8, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v8=(Reference);
    add-int/lit8 v9, v1, 0x1

    shl-int/lit8 v9, v9, 0x1

    iget v10, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v10=(Integer);
    sub-int/2addr v10, v1

    shl-int/lit8 v10, v10, 0x1

    invoke-static {v6, v7, v8, v9, v10}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 407
    :cond_5
    #v6=(Conflicted);v8=(Conflicted);v10=(Conflicted);
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v6=(Reference);
    aput v0, v6, v1

    .line 408
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    shl-int/lit8 v7, v1, 0x1

    aput-object p1, v6, v7

    .line 409
    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    shl-int/lit8 v7, v1, 0x1

    add-int/lit8 v7, v7, 0x1

    aput-object p2, v6, v7

    .line 410
    iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v6=(Integer);
    add-int/lit8 v6, v6, 0x1

    iput v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 411
    const/4 v5, 0x0

    #v5=(Null);
    goto :goto_1

    .line 382
    :cond_6
    #v2=(PosByte);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(PosByte);v8=(Integer);v9=(Null);v10=(Uninit);
    iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    if-ge v7, v6, :cond_2

    move v2, v6

    goto :goto_2
.end method

.method public putAll(Landroid/support/v4/util/SimpleArrayMap;)V
    .locals 6
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/util/SimpleArrayMap",
            "<+TK;+TV;>;)V"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    .local p1, array:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<+TK;+TV;>;"
    const/4 v5, 0x0

    .line 419
    #v5=(Null);
    iget v0, p1, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 420
    .local v0, N:I
    #v0=(Integer);
    iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v2=(Integer);
    add-int/2addr v2, v0

    invoke-virtual {p0, v2}, Landroid/support/v4/util/SimpleArrayMap;->ensureCapacity(I)V

    .line 421
    iget v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    if-nez v2, :cond_1

    .line 422
    if-lez v0, :cond_0

    .line 423
    iget-object v2, p1, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v3=(Reference);
    invoke-static {v2, v5, v3, v5, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 424
    iget-object v2, p1, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    iget-object v3, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    shl-int/lit8 v4, v0, 0x1

    #v4=(Integer);
    invoke-static {v2, v5, v3, v5, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 425
    iput v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 432
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 428
    :cond_1
    #v1=(Uninit);v2=(Integer);v3=(Uninit);v4=(Uninit);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
    if-ge v1, v0, :cond_0

    .line 429
    invoke-virtual {p1, v1}, Landroid/support/v4/util/SimpleArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {p1, v1}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {p0, v2, v3}, Landroid/support/v4/util/SimpleArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .parameter "key"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TV;"
        }
    .end annotation

    .prologue
    .line 441
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    if-nez p1, :cond_0

    invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->indexOfNull()I

    move-result v0

    .line 442
    .local v0, index:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);
    if-ltz v0, :cond_1

    .line 443
    invoke-virtual {p0, v0}, Landroid/support/v4/util/SimpleArrayMap;->removeAt(I)Ljava/lang/Object;

    move-result-object v1

    .line 446
    :goto_1
    #v1=(Reference);
    return-object v1

    .line 441
    .end local v0           #index:I
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p0, p1, v1}, Landroid/support/v4/util/SimpleArrayMap;->indexOf(Ljava/lang/Object;I)I

    move-result v0

    #v0=(Integer);
    goto :goto_0

    .line 446
    .restart local v0       #index:I
    :cond_1
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_1
.end method

.method public removeAt(I)Ljava/lang/Object;
    .locals 10
    .parameter "index"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    const/4 v9, 0x0

    #v9=(Null);
    const/16 v0, 0x8

    #v0=(PosByte);
    const/4 v7, 0x0

    .line 455
    #v7=(Null);
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v4=(Reference);
    shl-int/lit8 v5, p1, 0x1

    #v5=(Integer);
    add-int/lit8 v5, v5, 0x1

    aget-object v3, v4, v5

    .line 456
    .local v3, old:Ljava/lang/Object;
    #v3=(Null);
    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v4=(Integer);
    const/4 v5, 0x1

    #v5=(One);
    if-gt v4, v5, :cond_1

    .line 459
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v5=(Reference);
    iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v6=(Integer);
    invoke-static {v4, v5, v6}, Landroid/support/v4/util/SimpleArrayMap;->freeArrays([I[Ljava/lang/Object;I)V

    .line 460
    sget-object v4, Landroid/support/v4/util/ContainerHelpers;->EMPTY_INTS:[I

    iput-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 461
    sget-object v4, Landroid/support/v4/util/ContainerHelpers;->EMPTY_OBJECTS:[Ljava/lang/Object;

    iput-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 462
    iput v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 502
    :cond_0
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Integer);v8=(Conflicted);
    return-object v3

    .line 464
    :cond_1
    #v0=(PosByte);v1=(Uninit);v2=(Uninit);v4=(Integer);v5=(One);v6=(Uninit);v7=(Null);v8=(Uninit);
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    array-length v4, v4

    #v4=(Integer);
    if-le v4, v0, :cond_4

    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    iget-object v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v5=(Reference);
    array-length v5, v5

    #v5=(Integer);
    div-int/lit8 v5, v5, 0x3

    if-ge v4, v5, :cond_4

    .line 468
    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    if-le v4, v0, :cond_2

    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    iget v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    shr-int/lit8 v5, v5, 0x1

    add-int v0, v4, v5

    .line 472
    .local v0, n:I
    :cond_2
    #v0=(Integer);
    iget-object v2, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    .line 473
    .local v2, ohashes:[I
    #v2=(Reference);
    iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    .line 474
    .local v1, oarray:[Ljava/lang/Object;
    #v1=(Reference);
    invoke-direct {p0, v0}, Landroid/support/v4/util/SimpleArrayMap;->allocArrays(I)V

    .line 476
    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    add-int/lit8 v4, v4, -0x1

    iput v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 477
    if-lez p1, :cond_3

    .line 479
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    invoke-static {v2, v7, v4, v7, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 480
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    shl-int/lit8 v5, p1, 0x1

    invoke-static {v1, v7, v4, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 482
    :cond_3
    #v4=(Conflicted);
    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v4=(Integer);
    if-ge p1, v4, :cond_0

    .line 485
    add-int/lit8 v4, p1, 0x1

    iget-object v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v5=(Reference);
    iget v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v6=(Integer);
    sub-int/2addr v6, p1

    invoke-static {v2, v4, v5, p1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 486
    add-int/lit8 v4, p1, 0x1

    shl-int/lit8 v4, v4, 0x1

    iget-object v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    shl-int/lit8 v6, p1, 0x1

    iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v7=(Integer);
    sub-int/2addr v7, p1

    shl-int/lit8 v7, v7, 0x1

    invoke-static {v1, v4, v5, v6, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_0

    .line 490
    .end local v0           #n:I
    .end local v1           #oarray:[Ljava/lang/Object;
    .end local v2           #ohashes:[I
    :cond_4
    #v0=(PosByte);v1=(Uninit);v2=(Uninit);v5=(Integer);v6=(Uninit);v7=(Null);
    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    add-int/lit8 v4, v4, -0x1

    iput v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    .line 491
    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    if-ge p1, v4, :cond_5

    .line 494
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v4=(Reference);
    add-int/lit8 v5, p1, 0x1

    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mHashes:[I

    #v6=(Reference);
    iget v7, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v7=(Integer);
    sub-int/2addr v7, p1

    invoke-static {v4, v5, v6, p1, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 495
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    add-int/lit8 v5, p1, 0x1

    shl-int/lit8 v5, v5, 0x1

    iget-object v6, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    shl-int/lit8 v7, p1, 0x1

    iget v8, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v8=(Integer);
    sub-int/2addr v8, p1

    shl-int/lit8 v8, v8, 0x1

    invoke-static {v4, v5, v6, v7, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 498
    :cond_5
    #v4=(Conflicted);v6=(Conflicted);v8=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v4=(Reference);
    iget v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    shl-int/lit8 v5, v5, 0x1

    aput-object v9, v4, v5

    .line 499
    iget-object v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    iget v5, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    shl-int/lit8 v5, v5, 0x1

    add-int/lit8 v5, v5, 0x1

    aput-object v9, v4, v5

    goto/16 :goto_0
.end method

.method public setValueAt(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .parameter "index"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ITV;)TV;"
        }
    .end annotation

    .prologue
    .line 342
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    .local p2, value:Ljava/lang/Object;,"TV;"
    shl-int/lit8 v1, p1, 0x1

    #v1=(Integer);
    add-int/lit8 p1, v1, 0x1

    .line 343
    iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v1=(Reference);
    aget-object v0, v1, p1

    .line 344
    .local v0, old:Ljava/lang/Object;,"TV;"
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    aput-object p2, v1, p1

    .line 345
    return-object v0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 509
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    iget v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v0=(Integer);
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    .prologue
    .line 578
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    invoke-virtual {p0}, Landroid/support/v4/util/SimpleArrayMap;->isEmpty()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 579
    const-string v4, "{}"

    .line 603
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference);
    return-object v4

    .line 582
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v4=(Integer);
    mul-int/lit8 v4, v4, 0x1c

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 583
    .local v0, buffer:Ljava/lang/StringBuilder;
    #v0=(Reference);
    const/16 v4, 0x7b

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 584
    const/4 v1, 0x0

    .local v1, i:I
    :goto_1
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget v4, p0, Landroid/support/v4/util/SimpleArrayMap;->mSize:I

    #v4=(Integer);
    if-ge v1, v4, :cond_4

    .line 585
    if-lez v1, :cond_1

    .line 586
    const-string v4, ", "

    #v4=(Reference);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 588
    :cond_1
    #v4=(Conflicted);
    invoke-virtual {p0, v1}, Landroid/support/v4/util/SimpleArrayMap;->keyAt(I)Ljava/lang/Object;

    move-result-object v2

    .line 589
    .local v2, key:Ljava/lang/Object;
    #v2=(Reference);
    if-eq v2, p0, :cond_2

    .line 590
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 594
    :goto_2
    const/16 v4, 0x3d

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 595
    invoke-virtual {p0, v1}, Landroid/support/v4/util/SimpleArrayMap;->valueAt(I)Ljava/lang/Object;

    move-result-object v3

    .line 596
    .local v3, value:Ljava/lang/Object;
    #v3=(Reference);
    if-eq v3, p0, :cond_3

    .line 597
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 584
    :goto_3
    #v4=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 592
    .end local v3           #value:Ljava/lang/Object;
    :cond_2
    #v3=(Conflicted);
    const-string v4, "(this Map)"

    #v4=(Reference);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_2

    .line 599
    .restart local v3       #value:Ljava/lang/Object;
    :cond_3
    #v3=(Reference);v4=(PosByte);
    const-string v4, "(this Map)"

    #v4=(Reference);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_3

    .line 602
    .end local v2           #key:Ljava/lang/Object;
    .end local v3           #value:Ljava/lang/Object;
    :cond_4
    #v2=(Conflicted);v3=(Conflicted);v4=(Integer);
    const/16 v4, 0x7d

    #v4=(PosByte);
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 603
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    #v4=(Reference);
    goto :goto_0
.end method

.method public valueAt(I)Ljava/lang/Object;
    .locals 2
    .parameter "index"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TV;"
        }
    .end annotation

    .prologue
    .line 332
    .local p0, this:Landroid/support/v4/util/SimpleArrayMap;,"Landroid/support/v4/util/SimpleArrayMap<TK;TV;>;"
    iget-object v0, p0, Landroid/support/v4/util/SimpleArrayMap;->mArray:[Ljava/lang/Object;

    #v0=(Reference);
    shl-int/lit8 v1, p1, 0x1

    #v1=(Integer);
    add-int/lit8 v1, v1, 0x1

    aget-object v0, v0, v1

    #v0=(Null);
    return-object v0
.end method

*/}
