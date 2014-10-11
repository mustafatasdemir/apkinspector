package android.support.v4.util; class MapCollections$KeySet { void a() { int a;
a=0;// .class final Landroid/support/v4/util/MapCollections$KeySet;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MapCollections.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Set;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/util/MapCollections;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "KeySet"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Set",
a=0;//         "<TK;>;"
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
a=0;//     .line 265
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     iput-object p1, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/util/MapCollections$KeySet;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     .local p1, "object":Ljava/lang/Object;, "TK;"
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
a=0;//             "<+TK;>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+TK;>;"
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
a=0;//     .line 279
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colClear()V
a=0;// 
a=0;//     .line 280
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public contains(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/util/MapCollections;->colIndexOfKey(Ljava/lang/Object;)I
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
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colGetMap()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1}, Landroid/support/v4/util/MapCollections;->containsAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 339
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/util/MapCollections;->equalsSetHelper(Ljava/util/Set;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 344
a=0;//     #v4=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 345
a=0;//     .local v2, "result":I
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v0, v3, -0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 346
a=0;//     iget-object v3, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v3, v0, v4}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 347
a=0;//     .local v1, "obj":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     .line 345
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 347
a=0;//     :cond_0
a=0;//     #v3=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 349
a=0;//     .end local v1    # "obj":Ljava/lang/Object;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
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
a=0;//             "<TK;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     new-instance v0, Landroid/support/v4/util/MapCollections$ArrayIterator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/MapCollections$ArrayIterator;);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
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
a=0;//     .line 304
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v4/util/MapCollections;->colIndexOfKey(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 305
a=0;//     .local v0, "index":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     .line 306
a=0;//     iget-object v1, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/util/MapCollections;->colRemoveAt(I)V
a=0;// 
a=0;//     .line 307
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 309
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
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 314
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colGetMap()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1}, Landroid/support/v4/util/MapCollections;->removeAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public retainAll(Ljava/util/Collection;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colGetMap()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0, p1}, Landroid/support/v4/util/MapCollections;->retainAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
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
a=0;//     .line 329
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
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
a=0;//     .line 334
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$KeySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.KeySet;"
a=0;//     .local p1, "array":[Ljava/lang/Object;, "[TT;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$KeySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/util/MapCollections;->toArrayHelper([Ljava/lang/Object;I)[Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
