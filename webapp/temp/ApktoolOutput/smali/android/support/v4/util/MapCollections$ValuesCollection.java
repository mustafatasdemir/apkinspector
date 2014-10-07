package android.support.v4.util; class MapCollections$ValuesCollection {/*

.class final Landroid/support/v4/util/MapCollections$ValuesCollection;
.super Ljava/lang/Object;
.source "MapCollections.java"

# interfaces
.implements Ljava/util/Collection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/util/MapCollections;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "ValuesCollection"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Collection",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/util/MapCollections;


# direct methods
.method constructor <init>(Landroid/support/v4/util/MapCollections;)V
    .locals 0
    .parameter

    .prologue
    .line 353
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    iput-object p1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)Z
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .prologue
    .line 357
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    .local p1, object:Ljava/lang/Object;,"TV;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    #v0=(Reference);
    throw v0
.end method

.method public addAll(Ljava/util/Collection;)Z
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<+TV;>;)Z"
        }
    .end annotation

    .prologue
    .line 362
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    .local p1, collection:Ljava/util/Collection;,"Ljava/util/Collection<+TV;>;"
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    #v0=(Reference);
    throw v0
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 367
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colClear()V

    .line 368
    return-void
.end method

.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .parameter "object"

    .prologue
    .line 372
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v4/util/MapCollections;->colIndexOfValue(Ljava/lang/Object;)I

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

.method public containsAll(Ljava/util/Collection;)Z
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 377
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    .local p1, collection:Ljava/util/Collection;,"Ljava/util/Collection<*>;"
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .line 378
    .local v0, it:Ljava/util/Iterator;,"Ljava/util/Iterator<*>;"
    :cond_0
    #v0=(Reference);v1=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 379
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p0, v1}, Landroid/support/v4/util/MapCollections$ValuesCollection;->contains(Ljava/lang/Object;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 380
    const/4 v1, 0x0

    .line 383
    :goto_0
    return v1

    :cond_1
    const/4 v1, 0x1

    #v1=(One);
    goto :goto_0
.end method

.method public isEmpty()Z
    .locals 1

    .prologue
    .line 388
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colGetSize()I

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

.method public iterator()Ljava/util/Iterator;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 393
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    new-instance v0, Landroid/support/v4/util/MapCollections$ArrayIterator;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-direct {v0, v1, v2}, Landroid/support/v4/util/MapCollections$ArrayIterator;-><init>(Landroid/support/v4/util/MapCollections;I)V

    #v0=(Reference);
    return-object v0
.end method

.method public remove(Ljava/lang/Object;)Z
    .locals 2
    .parameter "object"

    .prologue
    .line 398
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    iget-object v1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/support/v4/util/MapCollections;->colIndexOfValue(Ljava/lang/Object;)I

    move-result v0

    .line 399
    .local v0, index:I
    #v0=(Integer);
    if-ltz v0, :cond_0

    .line 400
    iget-object v1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    invoke-virtual {v1, v0}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V

    .line 401
    const/4 v1, 0x1

    .line 403
    :goto_0
    #v1=(Boolean);
    return v1

    :cond_0
    #v1=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public removeAll(Ljava/util/Collection;)Z
    .locals 6
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 408
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    .local p1, collection:Ljava/util/Collection;,"Ljava/util/Collection<*>;"
    iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/util/MapCollections;->colGetSize()I

    move-result v0

    .line 409
    .local v0, N:I
    #v0=(Integer);
    const/4 v1, 0x0

    .line 410
    .local v1, changed:Z
    #v1=(Null);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v1=(Boolean);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    if-ge v3, v0, :cond_1

    .line 411
    iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v4=(Reference);
    const/4 v5, 0x1

    #v5=(One);
    invoke-virtual {v4, v3, v5}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;

    move-result-object v2

    .line 412
    .local v2, cur:Ljava/lang/Object;
    #v2=(Reference);
    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 413
    iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v4=(Reference);
    invoke-virtual {v4, v3}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V

    .line 414
    add-int/lit8 v3, v3, -0x1

    .line 415
    add-int/lit8 v0, v0, -0x1

    .line 416
    const/4 v1, 0x1

    .line 410
    :cond_0
    #v4=(Conflicted);
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 419
    .end local v2           #cur:Ljava/lang/Object;
    :cond_1
    #v2=(Conflicted);v5=(Conflicted);
    return v1
.end method

.method public retainAll(Ljava/util/Collection;)Z
    .locals 6
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection",
            "<*>;)Z"
        }
    .end annotation

    .prologue
    .line 424
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    .local p1, collection:Ljava/util/Collection;,"Ljava/util/Collection<*>;"
    iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/util/MapCollections;->colGetSize()I

    move-result v0

    .line 425
    .local v0, N:I
    #v0=(Integer);
    const/4 v1, 0x0

    .line 426
    .local v1, changed:Z
    #v1=(Null);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v1=(Boolean);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
    if-ge v3, v0, :cond_1

    .line 427
    iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v4=(Reference);
    const/4 v5, 0x1

    #v5=(One);
    invoke-virtual {v4, v3, v5}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;

    move-result-object v2

    .line 428
    .local v2, cur:Ljava/lang/Object;
    #v2=(Reference);
    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    .line 429
    iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v4=(Reference);
    invoke-virtual {v4, v3}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V

    .line 430
    add-int/lit8 v3, v3, -0x1

    .line 431
    add-int/lit8 v0, v0, -0x1

    .line 432
    const/4 v1, 0x1

    .line 426
    :cond_0
    #v4=(Conflicted);
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 435
    .end local v2           #cur:Ljava/lang/Object;
    :cond_1
    #v2=(Conflicted);v5=(Conflicted);
    return v1
.end method

.method public size()I
    .locals 1

    .prologue
    .line 440
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colGetSize()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public toArray()[Ljava/lang/Object;
    .locals 2

    .prologue
    .line 445
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v4/util/MapCollections;->toArrayHelper(I)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)[TT;"
        }
    .end annotation

    .prologue
    .line 450
    .local p0, this:Landroid/support/v4/util/MapCollections$ValuesCollection;,"Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
    .local p1, array:[Ljava/lang/Object;,"[TT;"
    iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, p1, v1}, Landroid/support/v4/util/MapCollections;->toArrayHelper([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

*/}
