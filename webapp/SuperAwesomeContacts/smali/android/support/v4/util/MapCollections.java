package android.support.v4.util; class MapCollections { void a() { int a;
a=0;// .class abstract Landroid/support/v4/util/MapCollections;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MapCollections.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/util/MapCollections$ValuesCollection;,
a=0;//         Landroid/support/v4/util/MapCollections$KeySet;,
a=0;//         Landroid/support/v4/util/MapCollections$EntrySet;,
a=0;//         Landroid/support/v4/util/MapCollections$MapIterator;,
a=0;//         Landroid/support/v4/util/MapCollections$ArrayIterator;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<K:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "V:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mEntrySet:Landroid/support/v4/util/MapCollections$EntrySet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/util/MapCollections",
a=0;//             "<TK;TV;>.EntrySet;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mKeySet:Landroid/support/v4/util/MapCollections$KeySet;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/util/MapCollections",
a=0;//             "<TK;TV;>.KeySet;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mValues:Landroid/support/v4/util/MapCollections$ValuesCollection;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/util/MapCollections",
a=0;//             "<TK;TV;>.ValuesCollection;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections;, "Landroid/support/v4/util/MapCollections<TK;TV;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static containsAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<K:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "V:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 455
a=0;//     .local p0, "map":Ljava/util/Map;, "Ljava/util/Map<TK;TV;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 456
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
a=0;//     .line 457
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {p0, v1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 458
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 461
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
a=0;// .method public static equalsSetHelper(Ljava/util/Set;Ljava/lang/Object;)Z
a=0;//     .locals 6
a=0;//     .param p1, "object"    # Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/util/Set",
a=0;//             "<TT;>;",
a=0;//             "Ljava/lang/Object;",
a=0;//             ")Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "set":Ljava/util/Set;, "Ljava/util/Set<TT;>;"
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 511
a=0;//     #v3=(Null);
a=0;//     if-ne p0, p1, :cond_1
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 525
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);v3=(Boolean);v4=(Conflicted);v5=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 514
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(One);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     instance-of v4, p1, Ljava/util/Set;
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     move-object v1, p1
a=0;// 
a=0;//     .line 515
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Set;
a=0;// 
a=0;//     .line 518
a=0;//     .local v1, "s":Ljava/util/Set;, "Ljava/util/Set<*>;"
a=0;//     :try_start_0
a=0;//     invoke-interface {p0}, Ljava/util/Set;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ne v4, v5, :cond_2
a=0;// 
a=0;//     invoke-interface {p0, v1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);v4=(Integer);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(One);v3=(Null);
a=0;//     move v2, v3
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 519
a=0;//     :catch_0
a=0;//     #v2=(One);v5=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 520
a=0;//     .local v0, "ignored":Ljava/lang/NullPointerException;
a=0;//     #v0=(Reference,Ljava/lang/NullPointerException;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 521
a=0;//     .end local v0    # "ignored":Ljava/lang/NullPointerException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 522
a=0;//     .local v0, "ignored":Ljava/lang/ClassCastException;
a=0;//     #v0=(Reference,Ljava/lang/ClassCastException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static removeAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<K:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "V:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 465
a=0;//     .local p0, "map":Ljava/util/Map;, "Ljava/util/Map<TK;TV;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     invoke-interface {p0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 466
a=0;//     .local v1, "oldSize":I
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 467
a=0;//     .local v0, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<*>;"
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 468
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {p0, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 470
a=0;//     :cond_0
a=0;//     #v2=(Boolean);
a=0;//     invoke-interface {p0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static retainAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<K:",
a=0;//             "Ljava/lang/Object;",
a=0;//             "V:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">(",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;",
a=0;//             "Ljava/util/Collection",
a=0;//             "<*>;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     .local p0, "map":Ljava/util/Map;, "Ljava/util/Map<TK;TV;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     invoke-interface {p0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 475
a=0;//     .local v1, "oldSize":I
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 476
a=0;//     .local v0, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<TK;>;"
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 477
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 478
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 481
a=0;//     :cond_1
a=0;//     invoke-interface {p0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v1, v2, :cond_2
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected abstract colClear()V
a=0;// .end method
a=0;// 
a=0;// .method protected abstract colGetEntry(II)Ljava/lang/Object;
a=0;// .end method
a=0;// 
a=0;// .method protected abstract colGetMap()Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method protected abstract colGetSize()I
a=0;// .end method
a=0;// 
a=0;// .method protected abstract colIndexOfKey(Ljava/lang/Object;)I
a=0;// .end method
a=0;// 
a=0;// .method protected abstract colIndexOfValue(Ljava/lang/Object;)I
a=0;// .end method
a=0;// 
a=0;// .method protected abstract colPut(Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;TV;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method protected abstract colRemoveAt(I)V
a=0;// .end method
a=0;// 
a=0;// .method protected abstract colSetValue(ILjava/lang/Object;)Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(ITV;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public getEntrySet()Ljava/util/Set;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/util/Map$Entry",
a=0;//             "<TK;TV;>;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 529
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections;, "Landroid/support/v4/util/MapCollections<TK;TV;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections;->mEntrySet:Landroid/support/v4/util/MapCollections$EntrySet;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections$EntrySet;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 530
a=0;//     new-instance v0, Landroid/support/v4/util/MapCollections$EntrySet;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/MapCollections$EntrySet;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/util/MapCollections$EntrySet;-><init>(Landroid/support/v4/util/MapCollections;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections$EntrySet;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/MapCollections;->mEntrySet:Landroid/support/v4/util/MapCollections$EntrySet;
a=0;// 
a=0;//     .line 532
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections;->mEntrySet:Landroid/support/v4/util/MapCollections$EntrySet;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getKeySet()Ljava/util/Set;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Set",
a=0;//             "<TK;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections;, "Landroid/support/v4/util/MapCollections<TK;TV;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections;->mKeySet:Landroid/support/v4/util/MapCollections$KeySet;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections$KeySet;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 537
a=0;//     new-instance v0, Landroid/support/v4/util/MapCollections$KeySet;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/MapCollections$KeySet;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/util/MapCollections$KeySet;-><init>(Landroid/support/v4/util/MapCollections;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections$KeySet;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/MapCollections;->mKeySet:Landroid/support/v4/util/MapCollections$KeySet;
a=0;// 
a=0;//     .line 539
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections;->mKeySet:Landroid/support/v4/util/MapCollections$KeySet;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getValues()Ljava/util/Collection;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Collection",
a=0;//             "<TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections;, "Landroid/support/v4/util/MapCollections<TK;TV;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections;->mValues:Landroid/support/v4/util/MapCollections$ValuesCollection;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections$ValuesCollection;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 544
a=0;//     new-instance v0, Landroid/support/v4/util/MapCollections$ValuesCollection;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/MapCollections$ValuesCollection;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/util/MapCollections$ValuesCollection;-><init>(Landroid/support/v4/util/MapCollections;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections$ValuesCollection;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/MapCollections;->mValues:Landroid/support/v4/util/MapCollections$ValuesCollection;
a=0;// 
a=0;//     .line 546
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/MapCollections;->mValues:Landroid/support/v4/util/MapCollections$ValuesCollection;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public toArrayHelper(I)[Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .param p1, "offset"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 486
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections;, "Landroid/support/v4/util/MapCollections<TK;TV;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 487
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     new-array v2, v0, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 488
a=0;//     .local v2, "result":[Ljava/lang/Object;
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 489
a=0;//     invoke-virtual {p0, v1, p1}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v3, v2, v1
a=0;// 
a=0;//     .line 488
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 491
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public toArrayHelper([Ljava/lang/Object;I)[Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .param p2, "offset"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "<T:",
a=0;//             "Ljava/lang/Object;",
a=0;//             ">([TT;I)[TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     .local p0, "this":Landroid/support/v4/util/MapCollections;, "Landroid/support/v4/util/MapCollections<TK;TV;>;"
a=0;//     .local p1, "array":[Ljava/lang/Object;, "[TT;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/util/MapCollections;->colGetSize()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 496
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v3, v0, :cond_0
a=0;// 
a=0;//     .line 497
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v3}, Ljava/lang/Class;->getComponentType()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, [Ljava/lang/Object;
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Object;);
a=0;//     check-cast v2, [Ljava/lang/Object;
a=0;// 
a=0;//     .line 499
a=0;//     .local v2, "newArray":[Ljava/lang/Object;, "[TT;"
a=0;//     move-object p1, v2
a=0;// 
a=0;//     .line 501
a=0;//     .end local v2    # "newArray":[Ljava/lang/Object;, "[TT;"
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 502
a=0;//     invoke-virtual {p0, v1, p2}, Landroid/support/v4/util/MapCollections;->colGetEntry(II)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     aput-object v3, p1, v1
a=0;// 
a=0;//     .line 501
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 504
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     array-length v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-le v3, v0, :cond_2
a=0;// 
a=0;//     .line 505
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v3, p1, v0
a=0;// 
a=0;//     .line 507
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     return-object p1
a=0;// .end method
}}
