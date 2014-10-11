package android.support.v4.util; class MapCollections$ValuesCollection { void a() { int a;
a=0;// .class final Landroid/support/v4/util/MapCollections$ValuesCollection;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MapCollections.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Collection;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/util/MapCollections;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "ValuesCollection"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Collection",
a=0;//         "<TV;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/util/MapCollections;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 353
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     iput-object p1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/util/MapCollections$ValuesCollection;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TV;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     .local p1, "object":Ljava/lang/Object;, "TV;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public addAll(Ljava/util/Collection;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<+TV;>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TV;>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colClear()V
a=0;// 
a=0;//     .line 368
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public contains(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 372
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/util/MapCollections;->colIndexOfValue(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public containsAll(Ljava/util/Collection;)Z
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 378
a=0;//     .local v0, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 379
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/MapCollections$ValuesCollection;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 380
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 383
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     :cond_1
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public iterator()Ljava/util/Iterator;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 393
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     new-instance v0, Landroid/support/v4/util/MapCollections$ArrayIterator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/MapCollections$ArrayIterator;);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/support/v4/util/MapCollections$ArrayIterator;-><init>(Landroid/support/v4/util/MapCollections;I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections$ArrayIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Object;)Z
a=0;//     .locals 2
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/util/MapCollections;->colIndexOfValue(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 399
a=0;//     .local v0, "index":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 400
a=0;//     iget-object v1, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
a=0;// 
a=0;//     .line 401
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 403
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public removeAll(Ljava/util/Collection;)Z
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 408
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 409
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 410
a=0;//     .local v1, "changed":Z
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v3, v0, :cond_1
a=0;// 
a=0;//     .line 411
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v4, v3, v5}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 412
a=0;//     .local v2, "cur":Ljava/lang/Object;
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v4, v3}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
a=0;// 
a=0;//     .line 414
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     .line 415
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 416
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 410
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 419
a=0;//     .end local v2    # "cur":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public retainAll(Ljava/util/Collection;)Z
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 424
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 425
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 426
a=0;//     .local v1, "changed":Z
a=0;//     #v1=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-ge v3, v0, :cond_1
a=0;// 
a=0;//     .line 427
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v4, v3, v5}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 428
a=0;//     .local v2, "cur":Ljava/lang/Object;
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v4, v3}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
a=0;// 
a=0;//     .line 430
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     .line 431
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     .line 432
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 426
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 435
a=0;//     .end local v2    # "cur":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 440
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public toArray()[Ljava/lang/Object;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 445
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/util/MapCollections;->toArrayHelper(I)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">([TT;)[TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 450
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$ValuesCollection;, "Landroid/support/v4/util/MapCollections<TK;TV;>.ValuesCollection;"
a=0;//     .local p1, "array":[Ljava/lang/Object;, "[TT;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$ValuesCollection;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/util/MapCollections;->toArrayHelper([Ljava/lang/Object;I)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
