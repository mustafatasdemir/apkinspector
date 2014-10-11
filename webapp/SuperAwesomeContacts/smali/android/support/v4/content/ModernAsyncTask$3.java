package android.support.v4.content; class ModernAsyncTask$3 { void a() { int a;
a=0;// .class Landroid/support/v4/content/ModernAsyncTask$3;
a=0;// .super Ljava/util/concurrent/FutureTask;
a=0;// .source "ModernAsyncTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/content/ModernAsyncTask;-><init>()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/util/concurrent/FutureTask",
a=0;//         "<TResult;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/content/ModernAsyncTask;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/content/ModernAsyncTask;Ljava/util/concurrent/Callable;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask$3;, "Landroid/support/v4/content/ModernAsyncTask.3;"
a=0;//     .local p2, "x0":Ljava/util/concurrent/Callable;, "Ljava/util/concurrent/Callable<TResult;>;"
a=0;//     iput-object p1, p0, Landroid/support/v4/content/ModernAsyncTask$3;->this$0:Landroid/support/v4/content/ModernAsyncTask;
a=0;// 
a=0;//     invoke-direct {p0, p2}, Ljava/util/concurrent/FutureTask;-><init>(Ljava/util/concurrent/Callable;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/content/ModernAsyncTask$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected done()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask$3;, "Landroid/support/v4/content/ModernAsyncTask.3;"
a=0;//     :try_start_0
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask$3;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 133
a=0;//     .local v1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     iget-object v3, p0, Landroid/support/v4/content/ModernAsyncTask$3;->this$0:Landroid/support/v4/content/ModernAsyncTask;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/content/ModernAsyncTask;);
a=0;//     invoke-static {v3, v1}, Landroid/support/v4/content/ModernAsyncTask;->access$400(Landroid/support/v4/content/ModernAsyncTask;Ljava/lang/Object;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Ljava/util/concurrent/ExecutionException; {:try_start_0 .. :try_end_0} :catch_1
a=0;//     .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_2
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_3
a=0;// 
a=0;//     .line 145
a=0;//     .end local v1    # "result":Ljava/lang/Object;, "TResult;"
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 134
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 135
a=0;//     .local v0, "e":Ljava/lang/InterruptedException;
a=0;//     #v0=(Reference,Ljava/lang/InterruptedException;);
a=0;//     const-string v3, "AsyncTask"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 136
a=0;//     .end local v0    # "e":Ljava/lang/InterruptedException;
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 137
a=0;//     .local v0, "e":Ljava/util/concurrent/ExecutionException;
a=0;//     #v0=(Reference,Ljava/util/concurrent/ExecutionException;);
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v4, "An error occured while executing doInBackground()"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/ExecutionException;->getCause()Ljava/lang/Throwable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-direct {v3, v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 139
a=0;//     .end local v0    # "e":Ljava/util/concurrent/ExecutionException;
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 140
a=0;//     .local v0, "e":Ljava/util/concurrent/CancellationException;
a=0;//     #v0=(Reference,Ljava/util/concurrent/CancellationException;);
a=0;//     iget-object v3, p0, Landroid/support/v4/content/ModernAsyncTask$3;->this$0:Landroid/support/v4/content/ModernAsyncTask;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/content/ModernAsyncTask;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4}, Landroid/support/v4/content/ModernAsyncTask;->access$400(Landroid/support/v4/content/ModernAsyncTask;Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 141
a=0;//     .end local v0    # "e":Ljava/util/concurrent/CancellationException;
a=0;//     :catch_3
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 142
a=0;//     .local v2, "t":Ljava/lang/Throwable;
a=0;//     #v2=(Reference,Ljava/lang/Throwable;);
a=0;//     new-instance v3, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v4, "An error occured while executing doInBackground()"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v3
a=0;// .end method
}}
