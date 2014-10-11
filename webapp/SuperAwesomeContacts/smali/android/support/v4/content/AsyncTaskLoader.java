package android.support.v4.content; class AsyncTaskLoader { void a() { int a;
a=0;// .class public abstract Landroid/support/v4/content/AsyncTaskLoader;
a=0;// .super Landroid/support/v4/content/Loader;
a=0;// .source "AsyncTaskLoader.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<D:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Landroid/support/v4/content/Loader",
a=0;//         "<TD;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final DEBUG:Z = false
a=0;// 
a=0;// .field static final TAG:Ljava/lang/String; = "AsyncTaskLoader"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field volatile mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/content/AsyncTaskLoader",
a=0;//             "<TD;>.",
a=0;//             "LoadTask;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field mLastLoadCompleteTime:J
a=0;// 
a=0;// .field volatile mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/content/AsyncTaskLoader",
a=0;//             "<TD;>.",
a=0;//             "LoadTask;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field mUpdateThrottle:J
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/content/Loader;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 88
a=0;//     #p0=(Reference,Landroid/support/v4/content/AsyncTaskLoader;);
a=0;//     const-wide/16 v0, -0x2710
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cancelLoad()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 136
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     iget-boolean v1, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 146
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iput-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     .line 166
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     iget-boolean v1, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 152
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     iput-boolean v0, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 154
a=0;//     iput-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 157
a=0;//     :cond_3
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->cancel(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "cancelled":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     .line 162
a=0;//     :cond_4
a=0;//     iput-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnCancelled(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/content/AsyncTaskLoader",
a=0;//             "<TD;>.",
a=0;//             "LoadTask;",
a=0;//             "TD;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     .local p1, "task":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TD;"
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/content/AsyncTaskLoader;->onCanceled(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 201
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->rollbackContentChanged()V
a=0;// 
a=0;//     .line 204
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
a=0;// 
a=0;//     .line 205
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     .line 206
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->executePendingTask()V
a=0;// 
a=0;//     .line 208
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method dispatchOnLoadComplete(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v4/content/AsyncTaskLoader",
a=0;//             "<TD;>.",
a=0;//             "LoadTask;",
a=0;//             "TD;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     .local p1, "task":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
a=0;//     .local p2, "data":Ljava/lang/Object;, "TD;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 213
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/content/AsyncTaskLoader;->dispatchOnCancelled(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 226
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);v1=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->isAbandoned()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/content/AsyncTaskLoader;->onCanceled(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 219
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->commitContentChanged()V
a=0;// 
a=0;//     .line 220
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iput-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
a=0;// 
a=0;//     .line 221
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     .line 223
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v4/content/AsyncTaskLoader;->deliverResult(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;//     .locals 4
a=0;//     .param p1, "prefix"    # Ljava/lang/String;
a=0;//     .param p2, "fd"    # Ljava/io/FileDescriptor;
a=0;//     .param p3, "writer"    # Ljava/io/PrintWriter;
a=0;//     .param p4, "args"    # [Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 268
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/content/Loader;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
a=0;// 
a=0;//     .line 269
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 270
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mTask="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 271
a=0;//     const-string v0, " waiting="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 273
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 274
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mCancellingTask="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 275
a=0;//     const-string v0, " waiting="
a=0;// 
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V
a=0;// 
a=0;//     .line 277
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     const-wide/16 v2, 0x0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     cmp-long v0, v0, v2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 278
a=0;//     invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     const-string v0, "mUpdateThrottle="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 279
a=0;//     iget-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-static {v0, v1, p3}, Landroid/support/v4/util/TimeUtils;->formatDuration(JLjava/io/PrintWriter;)V
a=0;// 
a=0;//     .line 280
a=0;//     const-string v0, " mLastLoadCompleteTime="
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 281
a=0;//     iget-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
a=0;// 
a=0;//     #v0=(LongLo);
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v2
a=0;// 
a=0;//     invoke-static {v0, v1, v2, v3, p3}, Landroid/support/v4/util/TimeUtils;->formatDuration(JJLjava/io/PrintWriter;)V
a=0;// 
a=0;//     .line 283
a=0;//     invoke-virtual {p3}, Ljava/io/PrintWriter;->println()V
a=0;// 
a=0;//     .line 285
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method executePendingTask()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 178
a=0;//     iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     iget-boolean v2, v2, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 179
a=0;//     iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, v2, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 182
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-wide v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     const-wide/16 v4, 0x0
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     cmp-long v2, v2, v4
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-lez v2, :cond_2
a=0;// 
a=0;//     .line 183
a=0;//     invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     .line 184
a=0;//     .local v0, "now":J
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     iget-wide v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
a=0;// 
a=0;//     #v2=(LongLo);
a=0;//     iget-wide v4, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
a=0;// 
a=0;//     add-long/2addr v2, v4
a=0;// 
a=0;//     cmp-long v2, v0, v2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-gez v2, :cond_2
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, v2, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z
a=0;// 
a=0;//     .line 190
a=0;//     iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     iget-wide v4, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J
a=0;// 
a=0;//     iget-wide v6, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
a=0;// 
a=0;//     #v6=(LongLo);v7=(LongHi);
a=0;//     add-long/2addr v4, v6
a=0;// 
a=0;//     invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 197
a=0;//     .end local v0    # "now":J
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 195
a=0;//     :cond_2
a=0;//     #v2=(Byte);v3=(LongHi);v4=(LongLo);v5=(LongHi);v6=(Uninit);v7=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     sget-object v4, Landroid/support/v4/content/ModernAsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     check-cast v2, [Ljava/lang/Void;
a=0;// 
a=0;//     #v2=(Reference,[Ljava/lang/Void;);
a=0;//     invoke-virtual {v3, v4, v2}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/support/v4/content/ModernAsyncTask;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public abstract loadInBackground()Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TD;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public onCanceled(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TD;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     .local p1, "data":Ljava/lang/Object;, "TD;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onForceLoad()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     invoke-super {p0}, Landroid/support/v4/content/Loader;->onForceLoad()V
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->cancelLoad()Z
a=0;// 
a=0;//     .line 113
a=0;//     new-instance v0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;-><init>(Landroid/support/v4/content/AsyncTaskLoader;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->executePendingTask()V
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLoadInBackground()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TD;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->loadInBackground()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setUpdateThrottle(J)V
a=0;//     .locals 2
a=0;//     .param p1, "delayMS"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     iput-wide p1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J
a=0;// 
a=0;//     .line 104
a=0;//     const-wide/16 v0, 0x0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     cmp-long v0, p1, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public waitForLoader()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     .local p0, "this":Landroid/support/v4/content/AsyncTaskLoader;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
a=0;// 
a=0;//     .line 257
a=0;//     .local v0, "task":Landroid/support/v4/content/AsyncTaskLoader$LoadTask;, "Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
a=0;//     #v0=(Reference,Landroid/support/v4/content/AsyncTaskLoader$LoadTask;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     :try_start_0
a=0;//     invoke-static {v0}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->access$000(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;)Ljava/util/concurrent/CountDownLatch;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/CountDownLatch;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 260
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/InterruptedException;);
a=0;//     goto :goto_0
a=0;// .end method
}}
