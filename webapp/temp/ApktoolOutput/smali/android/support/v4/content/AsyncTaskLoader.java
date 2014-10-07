package android.support.v4.content; class AsyncTaskLoader {/*

.class public abstract Landroid/support/v4/content/AsyncTaskLoader;
.super Landroid/support/v4/content/Loader;
.source "AsyncTaskLoader.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<D:",
        "Ljava/lang/Object;",
        ">",
        "Landroid/support/v4/content/Loader",
        "<TD;>;"
    }
.end annotation


# static fields
.field static final DEBUG:Z = false

.field static final TAG:Ljava/lang/String; = "AsyncTaskLoader"


# instance fields
.field volatile mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/content/AsyncTaskLoader",
            "<TD;>.",
            "LoadTask;"
        }
    .end annotation
.end field

.field mHandler:Landroid/os/Handler;

.field mLastLoadCompleteTime:J

.field volatile mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/support/v4/content/AsyncTaskLoader",
            "<TD;>.",
            "LoadTask;"
        }
    .end annotation
.end field

.field mUpdateThrottle:J


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 92
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    invoke-direct {p0, p1}, Landroid/support/v4/content/Loader;-><init>(Landroid/content/Context;)V

    .line 88
    #p0=(Reference);
    const-wide/16 v0, -0x2710

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J

    .line 93
    return-void
.end method


# virtual methods
.method public cancelLoad()Z
    .locals 4

    .prologue
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v0, 0x0

    .line 136
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 137
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    if-eqz v1, :cond_2

    .line 142
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    iget-boolean v1, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 143
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z

    .line 144
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 146
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    iput-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    .line 166
    :cond_1
    :goto_0
    #v0=(Boolean);
    return v0

    .line 148
    :cond_2
    #v0=(Null);v1=(Reference);v2=(Uninit);
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    iget-boolean v1, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z

    #v1=(Boolean);
    if-eqz v1, :cond_3

    .line 152
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z

    .line 153
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;

    iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 154
    iput-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    goto :goto_0

    .line 157
    :cond_3
    #v1=(Boolean);v2=(Uninit);
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->cancel(Z)Z

    move-result v0

    .line 159
    .local v0, cancelled:Z
    #v0=(Boolean);
    if-eqz v0, :cond_4

    .line 160
    iget-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    iput-object v1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    .line 162
    :cond_4
    iput-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    goto :goto_0
.end method

.method dispatchOnCancelled(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/content/AsyncTaskLoader",
            "<TD;>.",
            "LoadTask;",
            "TD;)V"
        }
    .end annotation

    .prologue
    .line 200
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    .local p1, task:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    .local p2, data:Ljava/lang/Object;,"TD;"
    invoke-virtual {p0, p2}, Landroid/support/v4/content/AsyncTaskLoader;->onCanceled(Ljava/lang/Object;)V

    .line 201
    iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v0=(Reference);
    if-ne v0, p1, :cond_0

    .line 203
    invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->rollbackContentChanged()V

    .line 204
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J

    .line 205
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    .line 206
    invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->executePendingTask()V

    .line 208
    :cond_0
    #v0=(Reference);v1=(Conflicted);
    return-void
.end method

.method dispatchOnLoadComplete(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V
    .locals 2
    .parameter
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/content/AsyncTaskLoader",
            "<TD;>.",
            "LoadTask;",
            "TD;)V"
        }
    .end annotation

    .prologue
    .line 211
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    .local p1, task:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    .local p2, data:Ljava/lang/Object;,"TD;"
    iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v0=(Reference);
    if-eq v0, p1, :cond_0

    .line 213
    invoke-virtual {p0, p1, p2}, Landroid/support/v4/content/AsyncTaskLoader;->dispatchOnCancelled(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;Ljava/lang/Object;)V

    .line 226
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 215
    :cond_0
    #v0=(Reference);v1=(Uninit);
    invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->isAbandoned()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 217
    invoke-virtual {p0, p2}, Landroid/support/v4/content/AsyncTaskLoader;->onCanceled(Ljava/lang/Object;)V

    goto :goto_0

    .line 219
    :cond_1
    invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->commitContentChanged()V

    .line 220
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    #v0=(LongLo);v1=(LongHi);
    iput-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J

    .line 221
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    .line 223
    invoke-virtual {p0, p2}, Landroid/support/v4/content/AsyncTaskLoader;->deliverResult(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method public dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V
    .locals 4
    .parameter "prefix"
    .parameter "fd"
    .parameter "writer"
    .parameter "args"

    .prologue
    .line 268
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v4/content/Loader;->dump(Ljava/lang/String;Ljava/io/FileDescriptor;Ljava/io/PrintWriter;[Ljava/lang/String;)V

    .line 269
    iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 270
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mTask="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 271
    const-string v0, " waiting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    iget-boolean v0, v0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z

    #v0=(Boolean);
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 273
    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v0=(Reference);
    if-eqz v0, :cond_1

    .line 274
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mCancellingTask="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/Object;)V

    .line 275
    const-string v0, " waiting="

    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    iget-boolean v0, v0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z

    #v0=(Boolean);
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->println(Z)V

    .line 277
    :cond_1
    #v0=(Conflicted);
    iget-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J

    #v0=(LongLo);v1=(LongHi);
    const-wide/16 v2, 0x0

    #v2=(LongLo);v3=(LongHi);
    cmp-long v0, v0, v2

    #v0=(Byte);
    if-eqz v0, :cond_2

    .line 278
    invoke-virtual {p3, p1}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    const-string v0, "mUpdateThrottle="

    #v0=(Reference);
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 279
    iget-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J

    #v0=(LongLo);
    invoke-static {v0, v1, p3}, Landroid/support/v4/util/TimeUtils;->formatDuration(JLjava/io/PrintWriter;)V

    .line 280
    const-string v0, " mLastLoadCompleteTime="

    #v0=(Reference);
    invoke-virtual {p3, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    .line 281
    iget-wide v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J

    #v0=(LongLo);
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3, p3}, Landroid/support/v4/util/TimeUtils;->formatDuration(JJLjava/io/PrintWriter;)V

    .line 283
    invoke-virtual {p3}, Ljava/io/PrintWriter;->println()V

    .line 285
    :cond_2
    #v0=(Conflicted);
    return-void
.end method

.method executePendingTask()V
    .locals 8

    .prologue
    .line 177
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mCancellingTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v2=(Reference);
    if-nez v2, :cond_1

    iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    if-eqz v2, :cond_1

    .line 178
    iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    iget-boolean v2, v2, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 179
    iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    iput-boolean v3, v2, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z

    .line 180
    iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;

    iget-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 182
    :cond_0
    #v2=(Conflicted);v3=(Conflicted);
    iget-wide v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J

    #v2=(LongLo);v3=(LongHi);
    const-wide/16 v4, 0x0

    #v4=(LongLo);v5=(LongHi);
    cmp-long v2, v2, v4

    #v2=(Byte);
    if-lez v2, :cond_2

    .line 183
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    .line 184
    .local v0, now:J
    #v0=(LongLo);v1=(LongHi);
    iget-wide v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J

    #v2=(LongLo);
    iget-wide v4, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J

    add-long/2addr v2, v4

    cmp-long v2, v0, v2

    #v2=(Byte);
    if-gez v2, :cond_2

    .line 189
    iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v2=(Reference);
    const/4 v3, 0x1

    #v3=(One);
    iput-boolean v3, v2, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->waiting:Z

    .line 190
    iget-object v2, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;

    iget-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v3=(Reference);
    iget-wide v4, p0, Landroid/support/v4/content/AsyncTaskLoader;->mLastLoadCompleteTime:J

    iget-wide v6, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J

    #v6=(LongLo);v7=(LongHi);
    add-long/2addr v4, v6

    invoke-virtual {v2, v3, v4, v5}, Landroid/os/Handler;->postAtTime(Ljava/lang/Runnable;J)Z

    .line 197
    .end local v0           #now:J
    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    .line 195
    :cond_2
    #v2=(Byte);v3=(LongHi);v4=(LongLo);v5=(LongHi);v6=(Uninit);v7=(Uninit);
    iget-object v3, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v3=(Reference);
    sget-object v4, Landroid/support/v4/content/ModernAsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;

    #v4=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    check-cast v2, [Ljava/lang/Void;

    #v2=(Reference);
    invoke-virtual {v3, v4, v2}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/support/v4/content/ModernAsyncTask;

    goto :goto_0
.end method

.method public abstract loadInBackground()Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation
.end method

.method public onCanceled(Ljava/lang/Object;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TD;)V"
        }
    .end annotation

    .prologue
    .line 174
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    .local p1, data:Ljava/lang/Object;,"TD;"
    return-void
.end method

.method protected onForceLoad()V
    .locals 1

    .prologue
    .line 111
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    invoke-super {p0}, Landroid/support/v4/content/Loader;->onForceLoad()V

    .line 112
    invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->cancelLoad()Z

    .line 113
    new-instance v0, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;-><init>(Landroid/support/v4/content/AsyncTaskLoader;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    .line 115
    invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->executePendingTask()V

    .line 116
    return-void
.end method

.method protected onLoadInBackground()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TD;"
        }
    .end annotation

    .prologue
    .line 242
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    invoke-virtual {p0}, Landroid/support/v4/content/AsyncTaskLoader;->loadInBackground()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public setUpdateThrottle(J)V
    .locals 2
    .parameter "delayMS"

    .prologue
    .line 103
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    iput-wide p1, p0, Landroid/support/v4/content/AsyncTaskLoader;->mUpdateThrottle:J

    .line 104
    const-wide/16 v0, 0x0

    #v0=(LongLo);v1=(LongHi);
    cmp-long v0, p1, v0

    #v0=(Byte);
    if-eqz v0, :cond_0

    .line 105
    new-instance v0, Landroid/os/Handler;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mHandler:Landroid/os/Handler;

    .line 107
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public waitForLoader()V
    .locals 2

    .prologue
    .line 256
    .local p0, this:Landroid/support/v4/content/AsyncTaskLoader;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>;"
    iget-object v0, p0, Landroid/support/v4/content/AsyncTaskLoader;->mTask:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;

    .line 257
    .local v0, task:Landroid/support/v4/content/AsyncTaskLoader$LoadTask;,"Landroid/support/v4/content/AsyncTaskLoader<TD;>.LoadTask;"
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 259
    :try_start_0
    invoke-static {v0}, Landroid/support/v4/content/AsyncTaskLoader$LoadTask;->access$000(Landroid/support/v4/content/AsyncTaskLoader$LoadTask;)Ljava/util/concurrent/CountDownLatch;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 264
    :cond_0
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 260
    :catch_0
    move-exception v1

    #v1=(Reference);
    goto :goto_0
.end method

*/}
