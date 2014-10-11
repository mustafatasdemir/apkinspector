package android.support.v4.util; class MapCollections$EntrySet { void a() { int a;
a=0;// .class final Landroid/support/v4/util/MapCollections$EntrySet;
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
a=0;//     name = "EntrySet"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Set",
a=0;//         "<",
a=0;//         "Ljava/util/Map$Entry",
a=0;//         "<TK;TV;>;>;"
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
a=0;//     .line 163
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     iput-object p1, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/util/MapCollections$EntrySet;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic add(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     check-cast p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .end local p1    # "x0":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/util/MapCollections$EntrySet;->add(Ljava/util/Map$Entry;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public add(Ljava/util/Map$Entry;)Z
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map$Entry",
a=0;//             "<TK;TV;>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     .local p1, "object":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
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
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Collection",
a=0;//             "<+",
a=0;//             "Ljava/util/Map$Entry",
a=0;//             "<TK;TV;>;>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 171
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<+Ljava/util/Map$Entry<TK;TV;>;>;"
a=0;//     iget-object v3, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 172
a=0;//     .local v2, "oldSize":I
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 173
a=0;//     .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
a=0;//     iget-object v3, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/support/v4/util/MapCollections;->colPut(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 175
a=0;//     .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eq v2, v3, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     :cond_1
a=0;//     #v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->colClear()V
a=0;// 
a=0;//     .line 181
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public contains(Ljava/lang/Object;)Z
a=0;//     .locals 6
a=0;//     .param p1, "o"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 185
a=0;//     #v3=(Null);
a=0;//     instance-of v4, p1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Boolean);v5=(Uninit);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 187
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 188
a=0;//     .local v0, "e":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<**>;"
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v4/util/MapCollections;->colIndexOfKey(Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 189
a=0;//     .local v2, "index":I
a=0;//     #v2=(Integer);
a=0;//     if-ltz v2, :cond_0
a=0;// 
a=0;//     .line 192
a=0;//     iget-object v3, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v3, v2, v4}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 193
a=0;//     .local v1, "foundVal":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/support/v4/util/ContainerHelpers;->equal(Ljava/lang/Object;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
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
a=0;//     .line 198
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 199
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
a=0;//     .line 200
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/MapCollections$EntrySet;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 201
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 204
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
a=0;// .method public equals(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 249
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/util/MapCollections;->equalsSetHelper(Ljava/util/Set;Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public hashCode()I
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 254
a=0;//     #v5=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 255
a=0;//     .local v2, "result":I
a=0;//     #v2=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v0, v4, -0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Integer);v3=(Conflicted);v6=(Conflicted);
a=0;//     if-ltz v0, :cond_2
a=0;// 
a=0;//     .line 256
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v4, v0, v5}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 257
a=0;//     .local v1, "key":Ljava/lang/Object;
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v4, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v4, v0, v6}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 258
a=0;//     .local v3, "value":Ljava/lang/Object;
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     move v6, v5
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);v6=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     move v4, v5
a=0;// 
a=0;//     :goto_2
a=0;//     #v4=(Integer);
a=0;//     xor-int/2addr v4, v6
a=0;// 
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 255
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 258
a=0;//     :cond_0
a=0;//     #v4=(Reference,Landroid/support/v4/util/MapCollections;);v6=(One);
a=0;//     invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move v6, v4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 261
a=0;//     .end local v1    # "key":Ljava/lang/Object;
a=0;//     .end local v3    # "value":Ljava/lang/Object;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
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
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Iterator",
a=0;//             "<",
a=0;//             "Ljava/util/Map$Entry",
a=0;//             "<TK;TV;>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     new-instance v0, Landroid/support/v4/util/MapCollections$MapIterator;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/MapCollections$MapIterator;);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/util/MapCollections$MapIterator;-><init>(Landroid/support/v4/util/MapCollections;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections$MapIterator;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public remove(Ljava/lang/Object;)Z
a=0;//     .locals 1
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
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
a=0;//     .line 224
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
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
a=0;//     .line 229
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections$EntrySet;->this$0:Landroid/support/v4/util/MapCollections;
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
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">([TT;)[TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections$EntrySet;, "Landroid/support/v4/util/MapCollections<TK;TV;>.EntrySet;"
a=0;//     .local p1, "array":[Ljava/lang/Object;, "[TT;"
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
}}
