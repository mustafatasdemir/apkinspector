package android.support.v4.content; class ModernAsyncTask { void a() { int a;
a=0;// .class abstract Landroid/support/v4/content/ModernAsyncTask;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ModernAsyncTask.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/content/ModernAsyncTask$4;,
a=0;//         Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;,
a=0;//         Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable;,
a=0;//         Landroid/support/v4/content/ModernAsyncTask$InternalHandler;,
a=0;//         Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<Params:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Progress:",
a=0;//         "Ljava/lang/Object;",
a=0;//         "Result:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Ljava/lang/Object;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CORE_POOL_SIZE:I = 0x5
a=0;// 
a=0;// .field private static final KEEP_ALIVE:I = 0x1
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String; = "AsyncTask"
a=0;// 
a=0;// .field private static final MAXIMUM_POOL_SIZE:I = 0x80
a=0;// 
a=0;// .field private static final MESSAGE_POST_PROGRESS:I = 0x2
a=0;// 
a=0;// .field private static final MESSAGE_POST_RESULT:I = 0x1
a=0;// 
a=0;// .field public static final THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field private static volatile sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;// .field private static final sHandler:Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
a=0;// 
a=0;// .field private static final sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/BlockingQueue",
a=0;//             "<",
a=0;//             "Ljava/lang/Runnable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private static final sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mFuture:Ljava/util/concurrent/FutureTask;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/FutureTask",
a=0;//             "<TResult;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private volatile mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;// .field private final mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;// .field private final mWorker:Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable",
a=0;//             "<TParams;TResult;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     new-instance v0, Landroid/support/v4/content/ModernAsyncTask$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/content/ModernAsyncTask$1;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/content/ModernAsyncTask$1;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$1;);
a=0;//     sput-object v0, Landroid/support/v4/content/ModernAsyncTask;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     .line 62
a=0;//     new-instance v0, Ljava/util/concurrent/LinkedBlockingQueue;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     const/16 v1, 0xa
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Ljava/util/concurrent/LinkedBlockingQueue;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/LinkedBlockingQueue;);
a=0;//     sput-object v0, Landroid/support/v4/content/ModernAsyncTask;->sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     .line 68
a=0;//     new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     const-wide/16 v3, 0x1
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/concurrent/TimeUnit;);
a=0;//     sget-object v6, Landroid/support/v4/content/ModernAsyncTask;->sPoolWorkQueue:Ljava/util/concurrent/BlockingQueue;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/BlockingQueue;);
a=0;//     sget-object v7, Landroid/support/v4/content/ModernAsyncTask;->sThreadFactory:Ljava/util/concurrent/ThreadFactory;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/concurrent/ThreadFactory;);
a=0;//     invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/ThreadPoolExecutor;);
a=0;//     sput-object v0, Landroid/support/v4/content/ModernAsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 75
a=0;//     new-instance v0, Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/content/ModernAsyncTask$InternalHandler;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/content/ModernAsyncTask$InternalHandler;-><init>(Landroid/support/v4/content/ModernAsyncTask$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$InternalHandler;);
a=0;//     sput-object v0, Landroid/support/v4/content/ModernAsyncTask;->sHandler:Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
a=0;// 
a=0;//     .line 77
a=0;//     sget-object v0, Landroid/support/v4/content/ModernAsyncTask;->THREAD_POOL_EXECUTOR:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/content/ModernAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 81
a=0;//     #p0=(Reference,Landroid/support/v4/content/ModernAsyncTask;);
a=0;//     sget-object v0, Landroid/support/v4/content/ModernAsyncTask$Status;->PENDING:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$Status;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     .line 118
a=0;//     new-instance v0, Landroid/support/v4/content/ModernAsyncTask$2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/content/ModernAsyncTask$2;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/content/ModernAsyncTask$2;-><init>(Landroid/support/v4/content/ModernAsyncTask;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$2;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mWorker:Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable;
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Landroid/support/v4/content/ModernAsyncTask$3;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/content/ModernAsyncTask$3;);
a=0;//     iget-object v1, p0, Landroid/support/v4/content/ModernAsyncTask;->mWorker:Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v4/content/ModernAsyncTask$3;-><init>(Landroid/support/v4/content/ModernAsyncTask;Ljava/util/concurrent/Callable;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$3;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     .line 147
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v4/content/ModernAsyncTask;)Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/content/ModernAsyncTask;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v4/content/ModernAsyncTask;Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v4/content/ModernAsyncTask;
a=0;//     .param p1, "x1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/content/ModernAsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v4/content/ModernAsyncTask;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/content/ModernAsyncTask;
a=0;//     .param p1, "x1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/content/ModernAsyncTask;->postResultIfNotInvoked(Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Landroid/support/v4/content/ModernAsyncTask;Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/content/ModernAsyncTask;
a=0;//     .param p1, "x1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/content/ModernAsyncTask;->finish(Ljava/lang/Object;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static execute(Ljava/lang/Runnable;)V
a=0;//     .locals 1
a=0;//     .param p0, "runnable"    # Ljava/lang/Runnable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 433
a=0;//     sget-object v0, Landroid/support/v4/content/ModernAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     invoke-interface {v0, p0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 434
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private finish(Ljava/lang/Object;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask;->isCancelled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 459
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/content/ModernAsyncTask;->onCancelled(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 463
a=0;//     :goto_0
a=0;//     sget-object v0, Landroid/support/v4/content/ModernAsyncTask$Status;->FINISHED:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$Status;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     .line 464
a=0;//     return-void
a=0;// 
a=0;//     .line 461
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/content/ModernAsyncTask;->onPostExecute(Ljava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static init()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     sget-object v0, Landroid/support/v4/content/ModernAsyncTask;->sHandler:Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$InternalHandler;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/content/ModernAsyncTask$InternalHandler;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     .line 107
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private postResult(Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 157
a=0;//     #v5=(One);
a=0;//     sget-object v1, Landroid/support/v4/content/ModernAsyncTask;->sHandler:Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/ModernAsyncTask$InternalHandler;);
a=0;//     new-instance v2, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;);
a=0;//     new-array v3, v5, [Ljava/lang/Object;
a=0;// 
a=0;//     #v3=(Reference,[Ljava/lang/Object;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object p1, v3, v4
a=0;// 
a=0;//     invoke-direct {v2, p0, v3}, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;-><init>(Landroid/support/v4/content/ModernAsyncTask;[Ljava/lang/Object;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;);
a=0;//     invoke-virtual {v1, v5, v2}, Landroid/support/v4/content/ModernAsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 159
a=0;//     .local v0, "message":Landroid/os/Message;
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 160
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private postResultIfNotInvoked(Ljava/lang/Object;)V
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     iget-object v1, p0, Landroid/support/v4/content/ModernAsyncTask;->mTaskInvoked:Ljava/util/concurrent/atomic/AtomicBoolean;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/concurrent/atomic/AtomicBoolean;);
a=0;//     invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 151
a=0;//     .local v0, "wasTaskInvoked":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 152
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/content/ModernAsyncTask;->postResult(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static setDefaultExecutor(Ljava/util/concurrent/Executor;)V
a=0;//     .locals 0
a=0;//     .param p0, "exec"    # Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     sput-object p0, Landroid/support/v4/content/ModernAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     .line 112
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public final cancel(Z)Z
a=0;//     .locals 1
a=0;//     .param p1, "mayInterruptIfRunning"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 306
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/FutureTask;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/concurrent/FutureTask;->cancel(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected varargs abstract doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TParams;)TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end method
a=0;// 
a=0;// .method public final varargs execute([Ljava/lang/Object;)Landroid/support/v4/content/ModernAsyncTask;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TParams;)",
a=0;//             "Landroid/support/v4/content/ModernAsyncTask",
a=0;//             "<TParams;TProgress;TResult;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 371
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "params":[Ljava/lang/Object;, "[TParams;"
a=0;//     sget-object v0, Landroid/support/v4/content/ModernAsyncTask;->sDefaultExecutor:Ljava/util/concurrent/Executor;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/Executor;);
a=0;//     invoke-virtual {p0, v0, p1}, Landroid/support/v4/content/ModernAsyncTask;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/support/v4/content/ModernAsyncTask;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final varargs executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/support/v4/content/ModernAsyncTask;
a=0;//     .locals 2
a=0;//     .param p1, "exec"    # Ljava/util/concurrent/Executor;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/concurrent/Executor;",
a=0;//             "[TParams;)",
a=0;//             "Landroid/support/v4/content/ModernAsyncTask",
a=0;//             "<TParams;TProgress;TResult;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 406
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p2, "params":[Ljava/lang/Object;, "[TParams;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$Status;);
a=0;//     sget-object v1, Landroid/support/v4/content/ModernAsyncTask$Status;->PENDING:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/content/ModernAsyncTask$Status;);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 407
a=0;//     sget-object v0, Landroid/support/v4/content/ModernAsyncTask$4;->$SwitchMap$android$support$v4$content$ModernAsyncTask$Status:[I
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/content/ModernAsyncTask$Status;->ordinal()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     aget v0, v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 418
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     sget-object v0, Landroid/support/v4/content/ModernAsyncTask$Status;->RUNNING:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$Status;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     .line 420
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask;->onPreExecute()V
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mWorker:Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable;
a=0;// 
a=0;//     iput-object p2, v0, Landroid/support/v4/content/ModernAsyncTask$WorkerRunnable;->mParams:[Ljava/lang/Object;
a=0;// 
a=0;//     .line 423
a=0;//     iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 425
a=0;//     return-object p0
a=0;// 
a=0;//     .line 409
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot execute task: the task is already running."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 412
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Integer);
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Cannot execute task: the task has already been executed (a task can be executed only once)"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 407
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public final get()Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/InterruptedException;,
a=0;//             Ljava/util/concurrent/ExecutionException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 321
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/FutureTask;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "timeout"    # J
a=0;//     .param p3, "unit"    # Ljava/util/concurrent/TimeUnit;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(J",
a=0;//             "Ljava/util/concurrent/TimeUnit;",
a=0;//             ")TResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/InterruptedException;,
a=0;//             Ljava/util/concurrent/ExecutionException;,
a=0;//             Ljava/util/concurrent/TimeoutException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/FutureTask;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Ljava/util/concurrent/FutureTask;->get(JLjava/util/concurrent/TimeUnit;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final getStatus()Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mStatus:Landroid/support/v4/content/ModernAsyncTask$Status;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$Status;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public final isCancelled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     iget-object v0, p0, Landroid/support/v4/content/ModernAsyncTask;->mFuture:Ljava/util/concurrent/FutureTask;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/FutureTask;);
a=0;//     invoke-virtual {v0}, Ljava/util/concurrent/FutureTask;->isCancelled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onCancelled()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 260
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onCancelled(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 244
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask;->onCancelled()V
a=0;// 
a=0;//     .line 245
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPostExecute(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TResult;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "result":Ljava/lang/Object;, "TResult;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onPreExecute()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 197
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected varargs onProgressUpdate([Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TProgress;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "values":[Ljava/lang/Object;, "[TProgress;"
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected final varargs publishProgress([Ljava/lang/Object;)V
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([TProgress;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     .local p0, "this":Landroid/support/v4/content/ModernAsyncTask;, "Landroid/support/v4/content/ModernAsyncTask<TParams;TProgress;TResult;>;"
a=0;//     .local p1, "values":[Ljava/lang/Object;, "[TProgress;"
a=0;//     invoke-virtual {p0}, Landroid/support/v4/content/ModernAsyncTask;->isCancelled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 452
a=0;//     sget-object v0, Landroid/support/v4/content/ModernAsyncTask;->sHandler:Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/ModernAsyncTask$InternalHandler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     new-instance v2, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;);
a=0;//     invoke-direct {v2, p0, p1}, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;-><init>(Landroid/support/v4/content/ModernAsyncTask;[Ljava/lang/Object;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v4/content/ModernAsyncTask$InternalHandler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 455
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
