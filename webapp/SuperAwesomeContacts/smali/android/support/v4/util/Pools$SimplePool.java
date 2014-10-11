package android.support.v4.util; class Pools$SimplePool { void a() { int a;
a=0;// .class public Landroid/support/v4/util/Pools$SimplePool;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Pools.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/util/Pools$Pool;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/util/Pools;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "SimplePool"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Landroid/support/v4/util/Pools$Pool",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mPool:[Ljava/lang/Object;
a=0;// 
a=0;// .field private mPoolSize:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 2
a=0;//     .param p1, "maxPoolSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     .local p0, "this":Landroid/support/v4/util/Pools$SimplePool;, "Landroid/support/v4/util/Pools$SimplePool<TT;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 91
a=0;//     #p0=(Reference,Landroid/support/v4/util/Pools$SimplePool;);
a=0;//     if-gtz p1, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "The max pool size must be > 0"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 94
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     new-array v0, p1, [Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private isInPool(Ljava/lang/Object;)Z
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     .local p0, "this":Landroid/support/v4/util/Pools$SimplePool;, "Landroid/support/v4/util/Pools$SimplePool<TT;>;"
a=0;//     .local p1, "instance":Ljava/lang/Object;, "TT;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     iget v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 125
a=0;//     iget-object v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v1, v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     if-ne v1, p1, :cond_0
a=0;// 
a=0;//     .line 126
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 129
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     .line 124
a=0;//     :cond_0
a=0;//     #v1=(Null);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 129
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public acquire()Ljava/lang/Object;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/util/Pools$SimplePool;, "Landroid/support/v4/util/Pools$SimplePool<TT;>;"
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 100
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     iget v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
a=0;// 
a=0;//     add-int/lit8 v1, v3, -0x1
a=0;// 
a=0;//     .line 102
a=0;//     .local v1, "lastPooledIndex":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     aget-object v0, v3, v1
a=0;// 
a=0;//     .line 103
a=0;//     .local v0, "instance":Ljava/lang/Object;, "TT;"
a=0;//     #v0=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
a=0;// 
a=0;//     aput-object v2, v3, v1
a=0;// 
a=0;//     .line 104
a=0;//     iget v2, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, -0x1
a=0;// 
a=0;//     iput v2, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
a=0;// 
a=0;//     .line 107
a=0;//     .end local v0    # "instance":Ljava/lang/Object;, "TT;"
a=0;//     .end local v1    # "lastPooledIndex":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Integer);
a=0;//     move-object v0, v2
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public release(Ljava/lang/Object;)Z
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)Z"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 112
a=0;//     .local p0, "this":Landroid/support/v4/util/Pools$SimplePool;, "Landroid/support/v4/util/Pools$SimplePool<TT;>;"
a=0;//     .local p1, "instance":Ljava/lang/Object;, "TT;"
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/util/Pools$SimplePool;->isInPool(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Already in the pool!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 115
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,[Ljava/lang/Object;);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPool:[Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,[Ljava/lang/Object;);
a=0;//     iget v1, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
a=0;// 
a=0;//     aput-object p1, v0, v1
a=0;// 
a=0;//     .line 117
a=0;//     iget v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v4/util/Pools$SimplePool;->mPoolSize:I
a=0;// 
a=0;//     .line 118
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 120
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
