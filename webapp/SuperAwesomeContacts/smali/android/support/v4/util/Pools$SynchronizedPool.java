package android.support.v4.util; class Pools$SynchronizedPool { void a() { int a;
a=0;// .class public Landroid/support/v4/util/Pools$SynchronizedPool;
a=0;// .super Landroid/support/v4/util/Pools$SimplePool;
a=0;// .source "Pools.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/util/Pools;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "SynchronizedPool"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Landroid/support/v4/util/Pools$SimplePool",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mLock:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(I)V
a=0;//     .locals 1
a=0;//     .param p1, "maxPoolSize"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     .local p0, "this":Landroid/support/v4/util/Pools$SynchronizedPool;, "Landroid/support/v4/util/Pools$SynchronizedPool<TT;>;"
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/util/Pools$SimplePool;-><init>(I)V
a=0;// 
a=0;//     .line 139
a=0;//     #p0=(Reference,Landroid/support/v4/util/Pools$SynchronizedPool;);
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     iput-object v0, p0, Landroid/support/v4/util/Pools$SynchronizedPool;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 150
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public acquire()Ljava/lang/Object;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TT;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     .local p0, "this":Landroid/support/v4/util/Pools$SynchronizedPool;, "Landroid/support/v4/util/Pools$SynchronizedPool<TT;>;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/Pools$SynchronizedPool;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 155
a=0;//     :try_start_0
a=0;//     invoke-super {p0}, Landroid/support/v4/util/Pools$SimplePool;->acquire()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 156
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
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
a=0;//     .line 161
a=0;//     .local p0, "this":Landroid/support/v4/util/Pools$SynchronizedPool;, "Landroid/support/v4/util/Pools$SynchronizedPool<TT;>;"
a=0;//     .local p1, "element":Ljava/lang/Object;, "TT;"
a=0;//     iget-object v1, p0, Landroid/support/v4/util/Pools$SynchronizedPool;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 162
a=0;//     :try_start_0
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/util/Pools$SimplePool;->release(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return v0
a=0;// 
a=0;//     .line 163
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
}}
