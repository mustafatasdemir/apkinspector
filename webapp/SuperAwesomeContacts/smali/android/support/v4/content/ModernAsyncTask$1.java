package android.support.v4.content; class ModernAsyncTask$1 { void a() { int a;
a=0;// .class final Landroid/support/v4/content/ModernAsyncTask$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ModernAsyncTask.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/content/ModernAsyncTask;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCount:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Landroid/support/v4/content/ModernAsyncTask$1;);
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicInteger;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/ModernAsyncTask$1;->mCount:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public newThread(Ljava/lang/Runnable;)Ljava/lang/Thread;
a=0;//     .locals 3
a=0;//     .param p1, "r"    # Ljava/lang/Runnable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     new-instance v0, Ljava/lang/Thread;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Thread;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "ModernAsyncTask #"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/content/ModernAsyncTask$1;->mCount:Ljava/util/concurrent/atomic/AtomicInteger;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, p1, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Thread;);
a=0;//     return-object v0
a=0;// .end method
}}
