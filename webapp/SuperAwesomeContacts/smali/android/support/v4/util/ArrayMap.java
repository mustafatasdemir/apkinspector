package android.support.v4.util; class ArrayMap { void a() { int a;
a=0;// .class public Landroid/support/v4/util/ArrayMap;
a=0;// .super Landroid/support/v4/util/SimpleArrayMap;
a=0;// .source "ArrayMap.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Map;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<K:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "V:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Landroid/support/v4/util/SimpleArrayMap",
a=0;//         "<TK;TV;>;",
a=0;//         "Ljava/util/Map",
a=0;//         "<TK;TV;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mCollections:Landroid/support/v4/util/MapCollections;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/util/MapCollections",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/SimpleArrayMap;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 0
a=0;//     .param p1, "capacity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;-><init>(I)V
a=0;// 
a=0;//     .line 62
a=0;//     #p0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/util/SimpleArrayMap;)V
a=0;//     .locals 0
a=0;//     .param p1, "map"    # Landroid/support/v4/util/SimpleArrayMap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/util/SimpleArrayMap;-><init>(Landroid/support/v4/util/SimpleArrayMap;)V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Landroid/support/v4/util/ArrayMap;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getCollection()Landroid/support/v4/util/MapCollections;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Landroid/support/v4/util/MapCollections",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap;->mCollections:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 73
a=0;//     new-instance v0, Landroid/support/v4/util/ArrayMap$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/util/ArrayMap$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/util/ArrayMap$1;-><init>(Landroid/support/v4/util/ArrayMap;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/ArrayMap$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/ArrayMap;->mCollections:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     .line 120
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/util/ArrayMap;->mCollections:Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
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
a=0;//     .line 130
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/util/MapCollections;->containsAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public entrySet()Ljava/util/Set;
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
a=0;//     .line 179
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/ArrayMap;->getCollection()Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->getEntrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public keySet()Ljava/util/Set;
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
a=0;//     .line 191
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/ArrayMap;->getCollection()Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->getKeySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public putAll(Ljava/util/Map;)V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<+TK;+TV;>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     .local p1, "map":Ljava/util/Map;, "Ljava/util/Map<+TK;+TV;>;"
a=0;//     iget v2, p0, Landroid/support/v4/util/ArrayMap;->mSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-interface {p1}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/util/ArrayMap;->ensureCapacity(I)V
a=0;// 
a=0;//     .line 140
a=0;//     invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/util/Iterator;);v3=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 141
a=0;//     .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {p0, v2, v3}, Landroid/support/v4/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<+TK;+TV;>;"
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Boolean);v3=(Conflicted);
a=0;//     return-void
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
a=0;//     .line 151
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/util/MapCollections;->removeAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
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
a=0;//     .line 161
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     .local p1, "collection":Ljava/util/Collection;, "Ljava/util/Collection<*>;"
a=0;//     invoke-static {p0, p1}, Landroid/support/v4/util/MapCollections;->retainAllHelper(Ljava/util/Map;Ljava/util/Collection;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public values()Ljava/util/Collection;
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
a=0;//     .line 203
a=0;//     .local p0, "this":Landroid/support/v4/util/ArrayMap;, "Landroid/support/v4/util/ArrayMap<TK;TV;>;"
a=0;//     invoke-direct {p0}, Landroid/support/v4/util/ArrayMap;->getCollection()Landroid/support/v4/util/MapCollections;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/util/MapCollections;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/util/MapCollections;->getValues()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
