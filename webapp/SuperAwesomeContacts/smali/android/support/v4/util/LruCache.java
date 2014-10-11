package android.support.v4.util; class LruCache { void a() { int a;
a=0;// .class public Landroid/support/v4/util/LruCache;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LruCache.java"
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
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private createCount:I
a=0;// 
a=0;// .field private evictionCount:I
a=0;// 
a=0;// .field private hitCount:I
a=0;// 
a=0;// .field private final map:Ljava/util/LinkedHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/LinkedHashMap",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private maxSize:I
a=0;// 
a=0;// .field private missCount:I
a=0;// 
a=0;// .field private putCount:I
a=0;// 
a=0;// .field private size:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 4
a=0;//     .param p1, "maxSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 48
a=0;//     #p0=(Reference,Landroid/support/v4/util/LruCache;);
a=0;//     if-gtz p1, :cond_0
a=0;// 
a=0;//     .line 49
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "maxSize <= 0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 51
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iput p1, p0, Landroid/support/v4/util/LruCache;->maxSize:I
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedHashMap;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/high16 v2, 0x3f400000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-direct {v0, v1, v2, v3}, Ljava/util/LinkedHashMap;-><init>(IFZ)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;TV;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TV;"
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/util/LruCache;->sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 234
a=0;//     .local v0, "result":I
a=0;//     #v0=(Integer);
a=0;//     if-gez v0, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Negative size: "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 237
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected create(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized createCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v4/util/LruCache;->createCount:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p1, "evicted"    # Z
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(ZTK;TV;TV;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     .local p2, "key":Ljava/lang/Object;, "TK;"
a=0;//     .local p3, "oldValue":Ljava/lang/Object;, "TV;"
a=0;//     .local p4, "newValue":Ljava/lang/Object;, "TV;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final evictAll()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 255
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v4/util/LruCache;->trimToSize(I)V
a=0;// 
a=0;//     .line 256
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized evictionCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v4/util/LruCache;->evictionCount:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 63
a=0;//     new-instance v2, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v3, "key == null"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 68
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 69
a=0;//     .local v1, "mapValue":Ljava/lang/Object;, "TV;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 70
a=0;//     iget v2, p0, Landroid/support/v4/util/LruCache;->hitCount:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/util/LruCache;->hitCount:I
a=0;// 
a=0;//     .line 71
a=0;//     monitor-exit p0
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/Object;);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 73
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v2=(Reference,Ljava/util/LinkedHashMap;);v3=(Uninit);
a=0;//     iget v2, p0, Landroid/support/v4/util/LruCache;->missCount:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/util/LruCache;->missCount:I
a=0;// 
a=0;//     .line 74
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 83
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/util/LruCache;->create(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     .local v0, "createdValue":Ljava/lang/Object;, "TV;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 85
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 74
a=0;//     .end local v0    # "createdValue":Ljava/lang/Object;, "TV;"
a=0;//     .end local v1    # "mapValue":Ljava/lang/Object;, "TV;"
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     :try_start_1
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 88
a=0;//     .restart local v0    # "createdValue":Ljava/lang/Object;, "TV;"
a=0;//     .restart local v1    # "mapValue":Ljava/lang/Object;, "TV;"
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/lang/Object;);v1=(Reference,Ljava/lang/Object;);v2=(Integer);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 89
a=0;//     :try_start_2
a=0;//     iget v2, p0, Landroid/support/v4/util/LruCache;->createCount:I
a=0;// 
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/util/LruCache;->createCount:I
a=0;// 
a=0;//     .line 90
a=0;//     iget-object v2, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v2, p1, v0}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 92
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v2, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     invoke-virtual {v2, p1, v1}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 98
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     .line 100
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 101
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v2, p1, v0, v1}, Landroid/support/v4/util/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     move-object v0, v1
a=0;// 
a=0;//     .line 102
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 96
a=0;//     :cond_3
a=0;//     :try_start_3
a=0;//     #v2=(Reference,Ljava/util/LinkedHashMap;);v3=(Uninit);
a=0;//     iget v2, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/2addr v2, v3
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 98
a=0;//     :catchall_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     throw v2
a=0;// 
a=0;//     .line 104
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     iget v2, p0, Landroid/support/v4/util/LruCache;->maxSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v4/util/LruCache;->trimToSize(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized hitCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v4/util/LruCache;->hitCount:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized maxSize()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v4/util/LruCache;->maxSize:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized missCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 288
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v4/util/LruCache;->missCount:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;TV;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TV;"
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_1
a=0;// 
a=0;//     .line 117
a=0;//     :cond_0
a=0;//     new-instance v1, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v2, "key == null || value == null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 121
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 122
a=0;//     :try_start_0
a=0;//     iget v1, p0, Landroid/support/v4/util/LruCache;->putCount:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/util/LruCache;->putCount:I
a=0;// 
a=0;//     .line 123
a=0;//     iget v1, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v1, p1, p2}, Ljava/util/LinkedHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 125
a=0;//     .local v0, "previous":Ljava/lang/Object;, "TV;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 126
a=0;//     iget v1, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     .line 128
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 130
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 131
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1, p1, v0, p2}, Landroid/support/v4/util/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 134
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/util/LruCache;->maxSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v4/util/LruCache;->trimToSize(I)V
a=0;// 
a=0;//     .line 135
a=0;//     return-object v0
a=0;// 
a=0;//     .line 128
a=0;//     .end local v0    # "previous":Ljava/lang/Object;, "TV;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized putCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 302
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v4/util/LruCache;->putCount:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;)TV;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 178
a=0;//     new-instance v1, Ljava/lang/NullPointerException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/NullPointerException;);
a=0;//     const-string v2, "key == null"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/NullPointerException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 183
a=0;//     :try_start_0
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 184
a=0;//     .local v0, "previous":Ljava/lang/Object;, "TV;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 185
a=0;//     iget v1, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     sub-int/2addr v1, v2
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     .line 187
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 189
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 190
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v1, p1, v0, v2}, Landroid/support/v4/util/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 193
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 187
a=0;//     .end local v0    # "previous":Ljava/lang/Object;, "TV;"
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 264
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v0, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected sizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TK;TV;)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     .local p1, "key":Ljava/lang/Object;, "TK;"
a=0;//     .local p2, "value":Ljava/lang/Object;, "TV;"
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized snapshot()Ljava/util/Map;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/Map",
a=0;//             "<TK;TV;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/LinkedHashMap;);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public final declared-synchronized toString()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 321
a=0;//     #v1=(Null);
a=0;//     monitor-enter p0
a=0;// 
a=0;//     :try_start_0
a=0;//     iget v2, p0, Landroid/support/v4/util/LruCache;->hitCount:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p0, Landroid/support/v4/util/LruCache;->missCount:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int v0, v2, v3
a=0;// 
a=0;//     .line 322
a=0;//     .local v0, "accesses":I
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/util/LruCache;->hitCount:I
a=0;// 
a=0;//     mul-int/lit8 v2, v2, 0x64
a=0;// 
a=0;//     div-int v1, v2, v0
a=0;// 
a=0;//     .line 323
a=0;//     .local v1, "hitPercent":I
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     const-string v2, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     new-array v3, v3, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iget v5, p0, Landroid/support/v4/util/LruCache;->maxSize:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     iget v5, p0, Landroid/support/v4/util/LruCache;->hitCount:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     iget v5, p0, Landroid/support/v4/util/LruCache;->missCount:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Integer;);
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     aput-object v5, v3, v4
a=0;// 
a=0;//     invoke-static {v2, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     monitor-exit p0
a=0;// 
a=0;//     return-object v2
a=0;// 
a=0;//     .line 321
a=0;//     .end local v0    # "accesses":I
a=0;//     .end local v1    # "hitPercent":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     throw v2
a=0;// .end method
a=0;// 
a=0;// .method public trimToSize(I)V
a=0;//     .locals 6
a=0;//     .param p1, "maxSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     .local p0, "this":Landroid/support/v4/util/LruCache;, "Landroid/support/v4/util/LruCache<TK;TV;>;"
a=0;//     :goto_0
a=0;//     monitor-enter p0
a=0;// 
a=0;//     .line 150
a=0;//     :try_start_0
a=0;//     iget v3, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ltz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v3}, Ljava/util/LinkedHashMap;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget v3, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 151
a=0;//     :cond_0
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, ".sizeOf() is reporting inconsistent results!"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 165
a=0;//     :catchall_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit p0
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v3
a=0;// 
a=0;//     .line 155
a=0;//     :cond_1
a=0;//     :try_start_1
a=0;//     #v3=(Integer);v5=(Uninit);
a=0;//     iget v3, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     if-le v3, p1, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v3}, Ljava/util/LinkedHashMap;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 156
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     monitor-exit p0
a=0;// 
a=0;//     .line 169
a=0;//     return-void
a=0;// 
a=0;//     .line 159
a=0;//     :cond_3
a=0;//     #v3=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/LinkedHashMap;);
a=0;//     invoke-virtual {v3}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 160
a=0;//     .local v1, "toEvict":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<TK;TV;>;"
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 161
a=0;//     .local v0, "key":Ljava/lang/Object;, "TK;"
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 162
a=0;//     .local v2, "value":Ljava/lang/Object;, "TV;"
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/LruCache;->map:Ljava/util/LinkedHashMap;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/util/LinkedHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 163
a=0;//     iget v3, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {p0, v0, v2}, Landroid/support/v4/util/LruCache;->safeSizeOf(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v3, v4
a=0;// 
a=0;//     iput v3, p0, Landroid/support/v4/util/LruCache;->size:I
a=0;// 
a=0;//     .line 164
a=0;//     iget v3, p0, Landroid/support/v4/util/LruCache;->evictionCount:I
a=0;// 
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     iput v3, p0, Landroid/support/v4/util/LruCache;->evictionCount:I
a=0;// 
a=0;//     .line 165
a=0;//     monitor-exit p0
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 167
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p0, v3, v0, v2, v4}, Landroid/support/v4/util/LruCache;->entryRemoved(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
