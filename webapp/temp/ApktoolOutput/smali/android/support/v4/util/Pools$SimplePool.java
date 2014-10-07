package android.support.v4.util; class Pools$SimplePool {/*

.class public Landroid/support/v4/util/Pools$SimplePool;
.super Ljava/lang/Object;
.source "Pools.java"

# interfaces
.implements Landroid/support/v4/util/Pools$Pool;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/util/Pools;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SimplePool"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/support/v4/util/Pools$Pool",
        "<TT;>;"
    }
.end annotation


# instance fields
.field private final mPool:[Ljava/lang/Object;

.field private mPoolSize:I


# direct methods
.method public constructor <init>(I)V
    .locals 2
    .parameter "maxPoolSize"

    .prologue
    .line 90
    .local p0, this:Landroid/support/v4/util/Pools$SimplePool;,"Landroid/support/v4/util/Pools$SimplePool<TT;>;"
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    #p0=(Reference);
    if-gtz p1, :cond_0

    .line 92
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "The max pool size must be > 0"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 94
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    new-array v0, p1, [Ljava/lang/Object;

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;

    .line 95
    return-void
.end method

.method private isInPool(Ljava/lang/Object;)Z
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .prologue
    .line 124
    .local p0, this:Landroid/support/v4/util/Pools$SimplePool;,"Landroid/support/v4/util/Pools$SimplePool<TT;>;"
    .local p1, instance:Ljava/lang/Object;,"TT;"
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);
    iget v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I

    #v1=(Integer);
    if-ge v0, v1, :cond_1

    .line 125
    iget-object v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;

    #v1=(Reference);
    aget-object v1, v1, v0

    #v1=(Null);
    if-ne v1, p1, :cond_0

    .line 126
    const/4 v1, 0x1

    .line 129
    :goto_1
    #v1=(Boolean);
    return v1

    .line 124
    :cond_0
    #v1=(Null);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 129
    :cond_1
    #v1=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_1
.end method


# virtual methods
.method public acquire()Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .local p0, this:Landroid/support/v4/util/Pools$SimplePool;,"Landroid/support/v4/util/Pools$SimplePool<TT;>;"
    const/4 v2, 0x0

    .line 100
    #v2=(Null);
    iget v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I

    #v3=(Integer);
    if-lez v3, :cond_0

    .line 101
    iget v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I

    add-int/lit8 v1, v3, -0x1

    .line 102
    .local v1, lastPooledIndex:I
    #v1=(Integer);
    iget-object v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;

    #v3=(Reference);
    aget-object v0, v3, v1

    .line 103
    .local v0, instance:Ljava/lang/Object;,"TT;"
    #v0=(Null);
    iget-object v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;

    aput-object v2, v3, v1

    .line 104
    iget v2, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I

    #v2=(Integer);
    add-int/lit8 v2, v2, -0x1

    iput v2, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I

    .line 107
    .end local v0           #instance:Ljava/lang/Object;,"TT;"
    .end local v1           #lastPooledIndex:I
    :goto_0
    #v1=(Conflicted);v3=(Conflicted);
    return-object v0

    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Integer);
    move-object v0, v2

    #v0=(Null);
    goto :goto_0
.end method

.method public release(Ljava/lang/Object;)Z
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    .prologue
    .line 112
    .local p0, this:Landroid/support/v4/util/Pools$SimplePool;,"Landroid/support/v4/util/Pools$SimplePool<TT;>;"
    .local p1, instance:Ljava/lang/Object;,"TT;"
    invoke-direct {p0, p1}, Landroid/support/v4/util/Pools$SimplePool;->isInPool(Ljava/lang/Object;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 113
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "Already in the pool!"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 115
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    iget v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I

    #v0=(Integer);
    iget-object v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;

    #v1=(Reference);
    array-length v1, v1

    #v1=(Integer);
    if-ge v0, v1, :cond_1

    .line 116
    iget-object v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I

    aput-object p1, v0, v1

    .line 117
    iget v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I

    #v0=(Integer);
    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I

    .line 118
    const/4 v0, 0x1

    .line 120
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_1
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
