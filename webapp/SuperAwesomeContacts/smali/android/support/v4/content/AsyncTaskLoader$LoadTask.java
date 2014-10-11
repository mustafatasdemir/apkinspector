package android.support.v4.content; class AsyncTaskLoader$LoadTask { void a() { int a;
a=0;// .class final Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// .super Landroid/support/v4/content/ModernAsyncTask;
a=0;// .source "AsyncTaskLoader.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/content/AsyncTaskLoader;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x10
a=0;//     name = "LoadTask"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/support/v4/content/ModernAsyncTask",
a=0;//         "<",
a=0;//         "Ljava/lang/Void;",
a=0;//         "Ljava/lang/Void;",
a=0;//         "TD;>;",
a=0;//         "Ljava/lang/Runnable;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private done:Ljava/util/concurrent/CountDownLatch;
a=0;// 
a=0;// .field result:Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "TD;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/content/AsyncTaskLoader;
a=0;// 
a=0;// .field waiting:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/content/AsyncTaskLoader;)V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
a=0;//     iput-object p1, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->this$0:Landroid/support/v4/content/AsyncTaskLoader;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/content/ModernAsyncTask;-><init>()V
a=0;// 
a=0;//     .line 45
a=0;//     #p0=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     new-instance v0, Ljava/util/concurrent/CountDownLatch;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/CountDownLatch;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/CountDownLatch;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;)Ljava/util/concurrent/CountDownLatch;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/CountDownLatch;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected bridge synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # [Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 40
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
a=0;//     check-cast p1, [Ljava/lang/Void;
a=0;// 
a=0;//     .end local p1    # "x0":[Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected varargs doInBackground([Ljava/lang/Void;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "params"    # [Ljava/lang/Void;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Ljava/lang/Void;",
a=0;//             ")TD;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->this$0:Landroid/support/v4/content/AsyncTaskLoader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/content/AsyncTaskLoader;->onLoadInBackground()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->result:Ljava/lang/Object;
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->result:Ljava/lang/Object;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected onCancelled()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->this$0:Landroid/support/v4/content/AsyncTaskLoader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader;);
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->result:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     invoke-virtual {v0, p0, v1}, Landroid/support/v4/content/AsyncTaskLoader;->dispatchOnCancelled(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// 
a=0;//     .line 73
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/CountDownLatch;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method protected onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TD;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TD;"
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->this$0:Landroid/support/v4/content/AsyncTaskLoader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader;);
a=0;//     invoke-virtual {v0, p0, p1}, Landroid/support/v4/content/AsyncTaskLoader;->dispatchOnLoadComplete(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V
a=0;// 
a=0;//     .line 65
a=0;//     return-void
a=0;// 
a=0;//     .line 63
a=0;//     :catchall_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->done:Ljava/util/concurrent/CountDownLatch;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/CountDownLatch;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->countDown()V
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public run()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     .line 80
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->this$0:Landroid/support/v4/content/AsyncTaskLoader;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/content/AsyncTaskLoader;->executePendingTask()V
a=0;// 
a=0;//     .line 81
a=0;//     return-void
a=0;// .end method
}}
