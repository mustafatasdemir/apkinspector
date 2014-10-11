package android.support.v4.content; class LocalBroadcastManager { void a() { int a;
a=0;// .class public Landroid/support/v4/content/LocalBroadcastManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "LocalBroadcastManager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;,
a=0;//         Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEBUG:Z = false
a=0;// 
a=0;// .field static final MSG_EXEC_PENDING_BROADCASTS:I = 0x1
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "LocalBroadcastManager"
a=0;// 
a=0;// .field private static mInstance:Landroid/support/v4/content/LocalBroadcastManager;
a=0;// 
a=0;// .field private static final mLock:Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mActions:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mAppContext:Landroid/content/Context;
a=0;// 
a=0;// .field private final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private final mPendingBroadcasts:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mReceivers:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Landroid/content/BroadcastReceiver;",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/content/IntentFilter;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/content/LocalBroadcastManager;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 84
a=0;//     #p0=(Reference,Landroid/support/v4/content/LocalBroadcastManager;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 89
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 109
a=0;//     iput-object p1, p0, Landroid/support/v4/content/LocalBroadcastManager;->mAppContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v0, Landroid/support/v4/content/LocalBroadcastManager$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/content/LocalBroadcastManager$1;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Looper;);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v4/content/LocalBroadcastManager$1;-><init>(Landroid/support/v4/content/LocalBroadcastManager;Landroid/os/Looper;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/LocalBroadcastManager$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/content/LocalBroadcastManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/content/LocalBroadcastManager;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/content/LocalBroadcastManager;
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     invoke-direct {p0}, Landroid/support/v4/content/LocalBroadcastManager;->executePendingBroadcasts()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private executePendingBroadcasts()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     :cond_0
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 285
a=0;//     .local v2, "brs":[Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
a=0;//     #v2=(Null);
a=0;//     iget-object v6, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v6
a=0;// 
a=0;//     .line 286
a=0;//     :try_start_0
a=0;//     iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 287
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     if-gtz v0, :cond_1
a=0;// 
a=0;//     .line 288
a=0;//     monitor-exit v6
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     .line 290
a=0;//     :cond_1
a=0;//     new-array v2, v0, [Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
a=0;// 
a=0;//     .line 291
a=0;//     #v2=(Reference,[Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;);
a=0;//     iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 293
a=0;//     monitor-exit v6
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 294
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);v5=(Conflicted);
a=0;//     array-length v5, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v3, v5, :cond_0
a=0;// 
a=0;//     .line 295
a=0;//     aget-object v1, v2, v3
a=0;// 
a=0;//     .line 296
a=0;//     .local v1, "br":Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
a=0;//     #v1=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "j":I
a=0;//     :goto_1
a=0;//     #v4=(Integer);v5=(Conflicted);
a=0;//     iget-object v5, v1, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;->receivers:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v4, v5, :cond_2
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v5, v1, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;->receivers:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     check-cast v5, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;// 
a=0;//     iget-object v5, v5, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->receiver:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/content/LocalBroadcastManager;->mAppContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v7, v1, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;->intent:Landroid/content/Intent;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v5, v6, v7}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 296
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 293
a=0;//     .end local v0    # "N":I
a=0;//     .end local v1    # "br":Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
a=0;//     .end local v3    # "i":I
a=0;//     .end local v4    # "j":I
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     :try_start_1
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v6
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v5
a=0;// 
a=0;//     .line 294
a=0;//     .restart local v0    # "N":I
a=0;//     .restart local v1    # "br":Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
a=0;//     .restart local v3    # "i":I
a=0;//     .restart local v4    # "j":I
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Null);v3=(Integer);v4=(Integer);v5=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
a=0;//     .locals 3
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     sget-object v1, Landroid/support/v4/content/LocalBroadcastManager;->mLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 101
a=0;//     :try_start_0
a=0;//     sget-object v0, Landroid/support/v4/content/LocalBroadcastManager;->mInstance:Landroid/support/v4/content/LocalBroadcastManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/LocalBroadcastManager;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v0, Landroid/support/v4/content/LocalBroadcastManager;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/content/LocalBroadcastManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/LocalBroadcastManager;);
a=0;//     sput-object v0, Landroid/support/v4/content/LocalBroadcastManager;->mInstance:Landroid/support/v4/content/LocalBroadcastManager;
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     sget-object v0, Landroid/support/v4/content/LocalBroadcastManager;->mInstance:Landroid/support/v4/content/LocalBroadcastManager;
a=0;// 
a=0;//     monitor-exit v1
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     .line 105
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
a=0;// 
a=0;// # virtual methods
a=0;// .method public registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
a=0;//     .locals 7
a=0;//     .param p1, "receiver"    # Landroid/content/BroadcastReceiver;
a=0;//     .param p2, "filter"    # Landroid/content/IntentFilter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iget-object v6, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v6
a=0;// 
a=0;//     .line 135
a=0;//     :try_start_0
a=0;//     new-instance v2, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;);
a=0;//     invoke-direct {v2, p2, p1}, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;-><init>(Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V
a=0;// 
a=0;//     .line 136
a=0;//     .local v2, "entry":Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;//     #v2=(Reference,Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;);
a=0;//     iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 137
a=0;//     .local v3, "filters":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v3    # "filters":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 139
a=0;//     .restart local v3    # "filters":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v5, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 142
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Integer);
a=0;//     invoke-virtual {p2}, Landroid/content/IntentFilter;->countActions()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-ge v4, v5, :cond_2
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {p2, v4}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 144
a=0;//     .local v0, "action":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 145
a=0;//     .local v1, "entries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 146
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v1    # "entries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 147
a=0;//     .restart local v1    # "entries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 149
a=0;//     :cond_1
a=0;//     invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 142
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     .end local v0    # "action":Ljava/lang/String;
a=0;//     .end local v1    # "entries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v5=(Integer);
a=0;//     monitor-exit v6
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// 
a=0;//     .line 151
a=0;//     .end local v2    # "entry":Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;//     .end local v3    # "filters":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
a=0;//     .end local v4    # "i":I
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v6
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v5
a=0;// .end method
a=0;// 
a=0;// .method public sendBroadcast(Landroid/content/Intent;)Z
a=0;//     .locals 17
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/content/LocalBroadcastManager;);
a=0;//     iget-object v15, v0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v15=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v15
a=0;// 
a=0;//     .line 202
a=0;//     :try_start_0
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 203
a=0;//     .local v2, "action":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mAppContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveTypeIfNeeded(Landroid/content/ContentResolver;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 205
a=0;//     .local v3, "type":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 206
a=0;//     .local v5, "data":Landroid/net/Uri;
a=0;//     #v5=(Reference,Landroid/net/Uri;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 207
a=0;//     .local v4, "scheme":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getCategories()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 209
a=0;//     .local v6, "categories":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     #v6=(Reference,Ljava/util/Set;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getFlags()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     .line 211
a=0;//     .local v8, "debug":Z
a=0;//     :goto_0
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     const-string v1, "LocalBroadcastManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Resolving type "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v16, " scheme "
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     const-string v16, " of intent "
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v7=(Conflicted);v16=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v9, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 216
a=0;//     .local v9, "entries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     if-eqz v9, :cond_c
a=0;// 
a=0;//     .line 217
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     const-string v1, "LocalBroadcastManager"
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Action list: "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 219
a=0;//     :cond_1
a=0;//     #v16=(Conflicted);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 220
a=0;//     .local v14, "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     #v14=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     .local v10, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v10=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v9}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v10, v1, :cond_9
a=0;// 
a=0;//     .line 221
a=0;//     invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v13
a=0;// 
a=0;//     #v13=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;// 
a=0;//     .line 222
a=0;//     .local v13, "receiver":Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     const-string v1, "LocalBroadcastManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "Matching against filter "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v0, v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->filter:Landroid/content/IntentFilter;
a=0;// 
a=0;//     move-object/from16 v16, v0
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 224
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v16=(Conflicted);
a=0;//     iget-boolean v1, v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->broadcasting:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 225
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 226
a=0;//     const-string v1, "LocalBroadcastManager"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "  Filter\'s target already added"
a=0;// 
a=0;//     invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 220
a=0;//     :cond_3
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 209
a=0;//     .end local v8    # "debug":Z
a=0;//     .end local v9    # "entries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     .end local v10    # "i":I
a=0;//     .end local v13    # "receiver":Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;//     .end local v14    # "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     :cond_4
a=0;//     #v1=(Integer);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v16=(Uninit);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 231
a=0;//     .restart local v8    # "debug":Z
a=0;//     .restart local v9    # "entries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     .restart local v10    # "i":I
a=0;//     .restart local v13    # "receiver":Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;//     .restart local v14    # "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     :cond_5
a=0;//     #v1=(Boolean);v7=(Reference,Ljava/lang/String;);v8=(Boolean);v9=(Reference,Ljava/util/ArrayList;);v10=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Reference,Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;);v14=(Reference,Ljava/util/ArrayList;);v16=(Conflicted);
a=0;//     iget-object v1, v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->filter:Landroid/content/IntentFilter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/IntentFilter;);
a=0;//     const-string v7, "LocalBroadcastManager"
a=0;// 
a=0;//     invoke-virtual/range {v1 .. v7}, Landroid/content/IntentFilter;->match(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Set;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 233
a=0;//     .local v11, "match":I
a=0;//     #v11=(Integer);
a=0;//     if-ltz v11, :cond_8
a=0;// 
a=0;//     .line 234
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     const-string v1, "LocalBroadcastManager"
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "  Filter matched!  match=0x"
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v16
a=0;// 
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 236
a=0;//     :cond_6
a=0;//     #v16=(Conflicted);
a=0;//     if-nez v14, :cond_7
a=0;// 
a=0;//     .line 237
a=0;//     new-instance v14, Ljava/util/ArrayList;
a=0;// 
a=0;//     .end local v14    # "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     #v14=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 239
a=0;//     .restart local v14    # "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     :cond_7
a=0;//     #v14=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 240
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->broadcasting:Z
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 267
a=0;//     .end local v2    # "action":Ljava/lang/String;
a=0;//     .end local v3    # "type":Ljava/lang/String;
a=0;//     .end local v4    # "scheme":Ljava/lang/String;
a=0;//     .end local v5    # "data":Landroid/net/Uri;
a=0;//     .end local v6    # "categories":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     .end local v8    # "debug":Z
a=0;//     .end local v9    # "entries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     .end local v10    # "i":I
a=0;//     .end local v11    # "match":I
a=0;//     .end local v13    # "receiver":Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;//     .end local v14    # "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v15
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v1
a=0;// 
a=0;//     .line 242
a=0;//     .restart local v2    # "action":Ljava/lang/String;
a=0;//     .restart local v3    # "type":Ljava/lang/String;
a=0;//     .restart local v4    # "scheme":Ljava/lang/String;
a=0;//     .restart local v5    # "data":Landroid/net/Uri;
a=0;//     .restart local v6    # "categories":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     .restart local v8    # "debug":Z
a=0;//     .restart local v9    # "entries":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     .restart local v10    # "i":I
a=0;//     .restart local v11    # "match":I
a=0;//     .restart local v13    # "receiver":Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;//     .restart local v14    # "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     :cond_8
a=0;//     #v2=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v4=(Reference,Ljava/lang/String;);v5=(Reference,Landroid/net/Uri;);v6=(Reference,Ljava/util/Set;);v7=(Reference,Ljava/lang/String;);v8=(Boolean);v9=(Reference,Ljava/util/ArrayList;);v10=(Integer);v11=(Integer);v13=(Reference,Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;);v14=(Reference,Ljava/util/ArrayList;);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 244
a=0;//     packed-switch v11, :pswitch_data_0
a=0;// 
a=0;//     .line 249
a=0;//     :try_start_1
a=0;//     const-string v12, "unknown reason"
a=0;// 
a=0;//     .line 251
a=0;//     .local v12, "reason":Ljava/lang/String;
a=0;//     :goto_3
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "LocalBroadcastManager"
a=0;// 
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v16, "  Filter did not match: "
a=0;// 
a=0;//     #v16=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, v16
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 245
a=0;//     .end local v12    # "reason":Ljava/lang/String;
a=0;//     :pswitch_0
a=0;//     #v12=(Conflicted);v16=(Conflicted);
a=0;//     const-string v12, "action"
a=0;// 
a=0;//     .restart local v12    # "reason":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 246
a=0;//     .end local v12    # "reason":Ljava/lang/String;
a=0;//     :pswitch_1
a=0;//     #v12=(Conflicted);
a=0;//     const-string v12, "category"
a=0;// 
a=0;//     .restart local v12    # "reason":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 247
a=0;//     .end local v12    # "reason":Ljava/lang/String;
a=0;//     :pswitch_2
a=0;//     #v12=(Conflicted);
a=0;//     const-string v12, "data"
a=0;// 
a=0;//     .restart local v12    # "reason":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 248
a=0;//     .end local v12    # "reason":Ljava/lang/String;
a=0;//     :pswitch_3
a=0;//     #v12=(Conflicted);
a=0;//     const-string v12, "type"
a=0;// 
a=0;//     .restart local v12    # "reason":Ljava/lang/String;
a=0;//     #v12=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 256
a=0;//     .end local v11    # "match":I
a=0;//     .end local v12    # "reason":Ljava/lang/String;
a=0;//     .end local v13    # "receiver":Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;//     :cond_9
a=0;//     #v1=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
a=0;//     if-eqz v14, :cond_c
a=0;// 
a=0;//     .line 257
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     :goto_4
a=0;//     #v1=(Conflicted);
a=0;//     invoke-virtual {v14}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ge v10, v1, :cond_a
a=0;// 
a=0;//     .line 258
a=0;//     invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;// 
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iput-boolean v7, v1, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->broadcasting:Z
a=0;// 
a=0;//     .line 257
a=0;//     add-int/lit8 v10, v10, 0x1
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 260
a=0;//     :cond_a
a=0;//     #v1=(Integer);v7=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v7, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     invoke-direct {v7, v0, v14}, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;-><init>(Landroid/content/Intent;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;);
a=0;//     invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 261
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     invoke-virtual {v1, v7}, Landroid/os/Handler;->hasMessages(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_b
a=0;// 
a=0;//     .line 262
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     invoke-virtual {v1, v7}, Landroid/os/Handler;->sendEmptyMessage(I)Z
a=0;// 
a=0;//     .line 264
a=0;//     :cond_b
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     monitor-exit v15
a=0;// 
a=0;//     .line 268
a=0;//     .end local v10    # "i":I
a=0;//     .end local v14    # "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     :goto_5
a=0;//     #v1=(Boolean);v7=(Conflicted);v10=(Conflicted);v14=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 267
a=0;//     :cond_c
a=0;//     #v1=(Conflicted);v7=(Reference,Ljava/lang/String;);
a=0;//     monitor-exit v15
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     .line 268
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 244
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x4
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public sendBroadcastSync(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 278
a=0;//     invoke-direct {p0}, Landroid/support/v4/content/LocalBroadcastManager;->executePendingBroadcasts()V
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public unregisterReceiver(Landroid/content/BroadcastReceiver;)V
a=0;//     .locals 9
a=0;//     .param p1, "receiver"    # Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     .prologue
a=0;//     .line 164
a=0;//     iget-object v8, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/HashMap;);
a=0;//     monitor-enter v8
a=0;// 
a=0;//     .line 165
a=0;//     :try_start_0
a=0;//     iget-object v7, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v7, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 166
a=0;//     .local v2, "filters":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 167
a=0;//     monitor-exit v8
a=0;// 
a=0;//     .line 188
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference,Ljava/util/HashMap;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v3, v7, :cond_5
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/IntentFilter;
a=0;// 
a=0;//     .line 171
a=0;//     .local v1, "filter":Landroid/content/IntentFilter;
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "j":I
a=0;//     :goto_2
a=0;//     #v4=(Integer);v7=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/content/IntentFilter;->countActions()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v4, v7, :cond_4
a=0;// 
a=0;//     .line 172
a=0;//     invoke-virtual {v1, v4}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 173
a=0;//     .local v0, "action":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 174
a=0;//     .local v6, "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 175
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "k":I
a=0;//     :goto_3
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ge v5, v7, :cond_2
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
a=0;// 
a=0;//     iget-object v7, v7, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->receiver:Landroid/content/BroadcastReceiver;
a=0;// 
a=0;//     if-ne v7, p1, :cond_1
a=0;// 
a=0;//     .line 177
a=0;//     invoke-virtual {v6, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 178
a=0;//     add-int/lit8 v5, v5, -0x1
a=0;// 
a=0;//     .line 175
a=0;//     :cond_1
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 181
a=0;//     :cond_2
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v6}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-gtz v7, :cond_3
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v7, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;
a=0;// 
a=0;//     #v7=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-virtual {v7, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 171
a=0;//     .end local v5    # "k":I
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 169
a=0;//     .end local v0    # "action":Ljava/lang/String;
a=0;//     .end local v6    # "receivers":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 187
a=0;//     .end local v1    # "filter":Landroid/content/IntentFilter;
a=0;//     .end local v4    # "j":I
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     monitor-exit v8
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v2    # "filters":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
a=0;//     .end local v3    # "i":I
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v8
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     throw v7
a=0;// .end method
}}
