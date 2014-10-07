package android.support.v4.content; class LocalBroadcastManager {/*

.class public Landroid/support/v4/content/LocalBroadcastManager;
.super Ljava/lang/Object;
.source "LocalBroadcastManager.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;,
        Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false

.field static final MSG_EXEC_PENDING_BROADCASTS:I = 0x1

.field private static final TAG:Ljava/lang/String; = "LocalBroadcastManager"

.field private static mInstance:Landroid/support/v4/content/LocalBroadcastManager;

.field private static final mLock:Ljava/lang/Object;


# instance fields
.field private final mActions:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;",
            ">;>;"
        }
    .end annotation
.end field

.field private final mAppContext:Landroid/content/Context;

.field private final mHandler:Landroid/os/Handler;

.field private final mPendingBroadcasts:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;",
            ">;"
        }
    .end annotation
.end field

.field private final mReceivers:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Landroid/content/BroadcastReceiver;",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/content/IntentFilter;",
            ">;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 96
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/content/LocalBroadcastManager;->mLock:Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 108
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    #p0=(Reference);
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    .line 86
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    .line 89
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    .line 109
    iput-object p1, p0, Landroid/support/v4/content/LocalBroadcastManager;->mAppContext:Landroid/content/Context;

    .line 110
    new-instance v0, Landroid/support/v4/content/LocalBroadcastManager$1;

    #v0=(UninitRef);
    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, p0, v1}, Landroid/support/v4/content/LocalBroadcastManager$1;-><init>(Landroid/support/v4/content/LocalBroadcastManager;Landroid/os/Looper;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/content/LocalBroadcastManager;->mHandler:Landroid/os/Handler;

    .line 123
    return-void
.end method

.method static synthetic access$000(Landroid/support/v4/content/LocalBroadcastManager;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 46
    invoke-direct {p0}, Landroid/support/v4/content/LocalBroadcastManager;->executePendingBroadcasts()V

    return-void
.end method

.method private executePendingBroadcasts()V
    .locals 8

    .prologue
    .line 284
    :cond_0
    const/4 v2, 0x0

    .line 285
    .local v2, brs:[Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
    #v2=(Null);
    iget-object v6, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    #v6=(Reference);
    monitor-enter v6

    .line 286
    :try_start_0
    iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 287
    .local v0, N:I
    #v0=(Integer);
    if-gtz v0, :cond_1

    .line 288
    monitor-exit v6

    return-void

    .line 290
    :cond_1
    new-array v2, v0, [Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;

    .line 291
    #v2=(Reference);
    iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 292
    iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 293
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 294
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v3=(Integer);v5=(Conflicted);
    array-length v5, v2

    #v5=(Integer);
    if-ge v3, v5, :cond_0

    .line 295
    aget-object v1, v2, v3

    .line 296
    .local v1, br:Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
    #v1=(Null);
    const/4 v4, 0x0

    .local v4, j:I
    :goto_1
    #v4=(Integer);v5=(Conflicted);
    iget-object v5, v1, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;->receivers:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v5

    #v5=(Integer);
    if-ge v4, v5, :cond_2

    .line 297
    iget-object v5, v1, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;->receivers:Ljava/util/ArrayList;

    #v5=(Reference);
    invoke-virtual {v5, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;

    iget-object v5, v5, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->receiver:Landroid/content/BroadcastReceiver;

    iget-object v6, p0, Landroid/support/v4/content/LocalBroadcastManager;->mAppContext:Landroid/content/Context;

    iget-object v7, v1, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;->intent:Landroid/content/Intent;

    #v7=(Reference);
    invoke-virtual {v5, v6, v7}, Landroid/content/BroadcastReceiver;->onReceive(Landroid/content/Context;Landroid/content/Intent;)V

    .line 296
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 293
    .end local v0           #N:I
    .end local v1           #br:Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
    .end local v3           #i:I
    .end local v4           #j:I
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    move-exception v5

    :try_start_1
    #v5=(Reference);
    monitor-exit v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v5

    .line 294
    .restart local v0       #N:I
    .restart local v1       #br:Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;
    .restart local v3       #i:I
    .restart local v4       #j:I
    :cond_2
    #v0=(Integer);v1=(Null);v3=(Integer);v4=(Integer);v5=(Integer);
    add-int/lit8 v3, v3, 0x1

    goto :goto_0
.end method

.method public static getInstance(Landroid/content/Context;)Landroid/support/v4/content/LocalBroadcastManager;
    .locals 3
    .parameter "context"

    .prologue
    .line 100
    sget-object v1, Landroid/support/v4/content/LocalBroadcastManager;->mLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 101
    :try_start_0
    sget-object v0, Landroid/support/v4/content/LocalBroadcastManager;->mInstance:Landroid/support/v4/content/LocalBroadcastManager;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 102
    new-instance v0, Landroid/support/v4/content/LocalBroadcastManager;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v0, v2}, Landroid/support/v4/content/LocalBroadcastManager;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/content/LocalBroadcastManager;->mInstance:Landroid/support/v4/content/LocalBroadcastManager;

    .line 104
    :cond_0
    #v2=(Conflicted);
    sget-object v0, Landroid/support/v4/content/LocalBroadcastManager;->mInstance:Landroid/support/v4/content/LocalBroadcastManager;

    monitor-exit v1

    return-object v0

    .line 105
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method


# virtual methods
.method public registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V
    .locals 7
    .parameter "receiver"
    .parameter "filter"

    .prologue
    .line 134
    iget-object v6, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    #v6=(Reference);
    monitor-enter v6

    .line 135
    :try_start_0
    new-instance v2, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;

    #v2=(UninitRef);
    invoke-direct {v2, p2, p1}, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;-><init>(Landroid/content/IntentFilter;Landroid/content/BroadcastReceiver;)V

    .line 136
    .local v2, entry:Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
    #v2=(Reference);
    iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    #v5=(Reference);
    invoke-virtual {v5, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/util/ArrayList;

    .line 137
    .local v3, filters:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
    if-nez v3, :cond_0

    .line 138
    new-instance v3, Ljava/util/ArrayList;

    .end local v3           #filters:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
    #v3=(UninitRef);
    const/4 v5, 0x1

    #v5=(One);
    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 139
    .restart local v3       #filters:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
    #v3=(Reference);
    iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    #v5=(Reference);
    invoke-virtual {v5, p1, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    :cond_0
    invoke-virtual {v3, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    const/4 v4, 0x0

    .local v4, i:I
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v4=(Integer);
    invoke-virtual {p2}, Landroid/content/IntentFilter;->countActions()I

    move-result v5

    #v5=(Integer);
    if-ge v4, v5, :cond_2

    .line 143
    invoke-virtual {p2, v4}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v0

    .line 144
    .local v0, action:Ljava/lang/String;
    #v0=(Reference);
    iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    #v5=(Reference);
    invoke-virtual {v5, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Ljava/util/ArrayList;

    .line 145
    .local v1, entries:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    if-nez v1, :cond_1

    .line 146
    new-instance v1, Ljava/util/ArrayList;

    .end local v1           #entries:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    #v1=(UninitRef);
    const/4 v5, 0x1

    #v5=(One);
    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 147
    .restart local v1       #entries:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    #v1=(Reference);
    iget-object v5, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    #v5=(Reference);
    invoke-virtual {v5, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    :cond_1
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 151
    .end local v0           #action:Ljava/lang/String;
    .end local v1           #entries:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v5=(Integer);
    monitor-exit v6

    .line 152
    return-void

    .line 151
    .end local v2           #entry:Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
    .end local v3           #filters:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
    .end local v4           #i:I
    :catchall_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    move-exception v5

    #v5=(Reference);
    monitor-exit v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v5
.end method

.method public sendBroadcast(Landroid/content/Intent;)Z
    .locals 17
    .parameter "intent"

    .prologue
    .line 201
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v15, v0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    #v15=(Reference);
    monitor-enter v15

    .line 202
    :try_start_0
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v2

    .line 203
    .local v2, action:Ljava/lang/String;
    #v2=(Reference);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mAppContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    move-object/from16 v0, p1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->resolveTypeIfNeeded(Landroid/content/ContentResolver;)Ljava/lang/String;

    move-result-object v3

    .line 205
    .local v3, type:Ljava/lang/String;
    #v3=(Reference);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v5

    .line 206
    .local v5, data:Landroid/net/Uri;
    #v5=(Reference);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getScheme()Ljava/lang/String;

    move-result-object v4

    .line 207
    .local v4, scheme:Ljava/lang/String;
    #v4=(Reference);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getCategories()Ljava/util/Set;

    move-result-object v6

    .line 209
    .local v6, categories:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    #v6=(Reference);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getFlags()I

    move-result v1

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_4

    const/4 v8, 0x1

    .line 211
    .local v8, debug:Z
    :goto_0
    #v8=(Boolean);
    if-eqz v8, :cond_0

    const-string v1, "LocalBroadcastManager"

    #v1=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v16, "Resolving type "

    #v16=(Reference);
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v16, " scheme "

    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    const-string v16, " of intent "

    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    move-object/from16 v0, p1

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 215
    :cond_0
    #v1=(Conflicted);v7=(Conflicted);v16=(Conflicted);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    #v1=(Reference);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v1, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    #v9=(Reference);
    check-cast v9, Ljava/util/ArrayList;

    .line 216
    .local v9, entries:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    if-eqz v9, :cond_c

    .line 217
    if-eqz v8, :cond_1

    const-string v1, "LocalBroadcastManager"

    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v16, "Action list: "

    #v16=(Reference);
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 219
    :cond_1
    #v16=(Conflicted);
    const/4 v14, 0x0

    .line 220
    .local v14, receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    #v14=(Null);
    const/4 v10, 0x0

    .local v10, i:I
    :goto_1
    #v1=(Conflicted);v10=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Reference);
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-ge v10, v1, :cond_9

    .line 221
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v13

    #v13=(Reference);
    check-cast v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;

    .line 222
    .local v13, receiver:Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
    if-eqz v8, :cond_2

    const-string v1, "LocalBroadcastManager"

    #v1=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v16, "Matching against filter "

    #v16=(Reference);
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v0, v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->filter:Landroid/content/IntentFilter;

    move-object/from16 v16, v0

    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    :cond_2
    #v1=(Conflicted);v16=(Conflicted);
    iget-boolean v1, v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->broadcasting:Z

    #v1=(Boolean);
    if-eqz v1, :cond_5

    .line 225
    if-eqz v8, :cond_3

    .line 226
    const-string v1, "LocalBroadcastManager"

    #v1=(Reference);
    const-string v7, "  Filter\'s target already added"

    invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 220
    :cond_3
    :goto_2
    #v1=(Conflicted);
    add-int/lit8 v10, v10, 0x1

    goto :goto_1

    .line 209
    .end local v8           #debug:Z
    .end local v9           #entries:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    .end local v10           #i:I
    .end local v13           #receiver:Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
    .end local v14           #receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    :cond_4
    #v1=(Integer);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v16=(Uninit);
    const/4 v8, 0x0

    #v8=(Null);
    goto/16 :goto_0

    .line 231
    .restart local v8       #debug:Z
    .restart local v9       #entries:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    .restart local v10       #i:I
    .restart local v13       #receiver:Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
    .restart local v14       #receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    :cond_5
    #v1=(Boolean);v7=(Reference);v8=(Boolean);v9=(Reference);v10=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Reference);v14=(Reference);v16=(Conflicted);
    iget-object v1, v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->filter:Landroid/content/IntentFilter;

    #v1=(Reference);
    const-string v7, "LocalBroadcastManager"

    invoke-virtual/range {v1 .. v7}, Landroid/content/IntentFilter;->match(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/util/Set;Ljava/lang/String;)I

    move-result v11

    .line 233
    .local v11, match:I
    #v11=(Integer);
    if-ltz v11, :cond_8

    .line 234
    if-eqz v8, :cond_6

    const-string v1, "LocalBroadcastManager"

    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v16, "  Filter matched!  match=0x"

    #v16=(Reference);
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v11}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v16

    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 236
    :cond_6
    #v16=(Conflicted);
    if-nez v14, :cond_7

    .line 237
    new-instance v14, Ljava/util/ArrayList;

    .end local v14           #receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    #v14=(UninitRef);
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 239
    .restart local v14       #receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    :cond_7
    #v14=(Reference);
    invoke-virtual {v14, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 240
    const/4 v1, 0x1

    #v1=(One);
    iput-boolean v1, v13, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->broadcasting:Z

    goto :goto_2

    .line 267
    .end local v2           #action:Ljava/lang/String;
    .end local v3           #type:Ljava/lang/String;
    .end local v4           #scheme:Ljava/lang/String;
    .end local v5           #data:Landroid/net/Uri;
    .end local v6           #categories:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    .end local v8           #debug:Z
    .end local v9           #entries:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    .end local v10           #i:I
    .end local v11           #match:I
    .end local v13           #receiver:Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
    .end local v14           #receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    :catchall_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v13=(Conflicted);v14=(Conflicted);
    move-exception v1

    #v1=(Reference);
    monitor-exit v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 242
    .restart local v2       #action:Ljava/lang/String;
    .restart local v3       #type:Ljava/lang/String;
    .restart local v4       #scheme:Ljava/lang/String;
    .restart local v5       #data:Landroid/net/Uri;
    .restart local v6       #categories:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    .restart local v8       #debug:Z
    .restart local v9       #entries:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    .restart local v10       #i:I
    .restart local v11       #match:I
    .restart local v13       #receiver:Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
    .restart local v14       #receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    :cond_8
    #v2=(Reference);v3=(Reference);v4=(Reference);v5=(Reference);v6=(Reference);v7=(Reference);v8=(Boolean);v9=(Reference);v10=(Integer);v11=(Integer);v13=(Reference);v14=(Reference);
    if-eqz v8, :cond_3

    .line 244
    packed-switch v11, :pswitch_data_0

    .line 249
    :try_start_1
    const-string v12, "unknown reason"

    .line 251
    .local v12, reason:Ljava/lang/String;
    :goto_3
    #v12=(Reference);
    const-string v1, "LocalBroadcastManager"

    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v16, "  Filter did not match: "

    #v16=(Reference);
    move-object/from16 v0, v16

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v1, v7}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2

    .line 245
    .end local v12           #reason:Ljava/lang/String;
    :pswitch_0
    #v12=(Conflicted);v16=(Conflicted);
    const-string v12, "action"

    .restart local v12       #reason:Ljava/lang/String;
    #v12=(Reference);
    goto :goto_3

    .line 246
    .end local v12           #reason:Ljava/lang/String;
    :pswitch_1
    #v12=(Conflicted);
    const-string v12, "category"

    .restart local v12       #reason:Ljava/lang/String;
    #v12=(Reference);
    goto :goto_3

    .line 247
    .end local v12           #reason:Ljava/lang/String;
    :pswitch_2
    #v12=(Conflicted);
    const-string v12, "data"

    .restart local v12       #reason:Ljava/lang/String;
    #v12=(Reference);
    goto :goto_3

    .line 248
    .end local v12           #reason:Ljava/lang/String;
    :pswitch_3
    #v12=(Conflicted);
    const-string v12, "type"

    .restart local v12       #reason:Ljava/lang/String;
    #v12=(Reference);
    goto :goto_3

    .line 256
    .end local v11           #match:I
    .end local v12           #reason:Ljava/lang/String;
    .end local v13           #receiver:Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;
    :cond_9
    #v1=(Integer);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);
    if-eqz v14, :cond_c

    .line 257
    const/4 v10, 0x0

    :goto_4
    #v1=(Conflicted);
    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    if-ge v10, v1, :cond_a

    .line 258
    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;

    const/4 v7, 0x0

    #v7=(Null);
    iput-boolean v7, v1, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->broadcasting:Z

    .line 257
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    .line 260
    :cond_a
    #v1=(Integer);v7=(Reference);
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mPendingBroadcasts:Ljava/util/ArrayList;

    #v1=(Reference);
    new-instance v7, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;

    #v7=(UninitRef);
    move-object/from16 v0, p1

    invoke-direct {v7, v0, v14}, Landroid/support/v4/content/LocalBroadcastManager$BroadcastRecord;-><init>(Landroid/content/Intent;Ljava/util/ArrayList;)V

    #v7=(Reference);
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 261
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mHandler:Landroid/os/Handler;

    const/4 v7, 0x1

    #v7=(One);
    invoke-virtual {v1, v7}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_b

    .line 262
    move-object/from16 v0, p0

    iget-object v1, v0, Landroid/support/v4/content/LocalBroadcastManager;->mHandler:Landroid/os/Handler;

    #v1=(Reference);
    const/4 v7, 0x1

    invoke-virtual {v1, v7}, Landroid/os/Handler;->sendEmptyMessage(I)Z

    .line 264
    :cond_b
    #v1=(Conflicted);
    const/4 v1, 0x1

    #v1=(One);
    monitor-exit v15

    .line 268
    .end local v10           #i:I
    .end local v14           #receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    :goto_5
    #v1=(Boolean);v7=(Conflicted);v10=(Conflicted);v14=(Conflicted);
    return v1

    .line 267
    :cond_c
    #v1=(Conflicted);v7=(Reference);
    monitor-exit v15
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 268
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_5

    .line 244
    :pswitch_data_0
    .packed-switch -0x4
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public sendBroadcastSync(Landroid/content/Intent;)V
    .locals 1
    .parameter "intent"

    .prologue
    .line 277
    invoke-virtual {p0, p1}, Landroid/support/v4/content/LocalBroadcastManager;->sendBroadcast(Landroid/content/Intent;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 278
    invoke-direct {p0}, Landroid/support/v4/content/LocalBroadcastManager;->executePendingBroadcasts()V

    .line 280
    :cond_0
    return-void
.end method

.method public unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    .locals 9
    .parameter "receiver"

    .prologue
    .line 164
    iget-object v8, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    #v8=(Reference);
    monitor-enter v8

    .line 165
    :try_start_0
    iget-object v7, p0, Landroid/support/v4/content/LocalBroadcastManager;->mReceivers:Ljava/util/HashMap;

    #v7=(Reference);
    invoke-virtual {v7, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/util/ArrayList;

    .line 166
    .local v2, filters:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
    if-nez v2, :cond_0

    .line 167
    monitor-exit v8

    .line 188
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    return-void

    .line 169
    :cond_0
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Reference);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v3=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    #v7=(Integer);
    if-ge v3, v7, :cond_5

    .line 170
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/content/IntentFilter;

    .line 171
    .local v1, filter:Landroid/content/IntentFilter;
    const/4 v4, 0x0

    .local v4, j:I
    :goto_2
    #v4=(Integer);v7=(Conflicted);
    invoke-virtual {v1}, Landroid/content/IntentFilter;->countActions()I

    move-result v7

    #v7=(Integer);
    if-ge v4, v7, :cond_4

    .line 172
    invoke-virtual {v1, v4}, Landroid/content/IntentFilter;->getAction(I)Ljava/lang/String;

    move-result-object v0

    .line 173
    .local v0, action:Ljava/lang/String;
    #v0=(Reference);
    iget-object v7, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    #v7=(Reference);
    invoke-virtual {v7, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    #v6=(Reference);
    check-cast v6, Ljava/util/ArrayList;

    .line 174
    .local v6, receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    if-eqz v6, :cond_3

    .line 175
    const/4 v5, 0x0

    .local v5, k:I
    :goto_3
    #v5=(Integer);
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    #v7=(Integer);
    if-ge v5, v7, :cond_2

    .line 176
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;

    iget-object v7, v7, Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;->receiver:Landroid/content/BroadcastReceiver;

    if-ne v7, p1, :cond_1

    .line 177
    invoke-virtual {v6, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 178
    add-int/lit8 v5, v5, -0x1

    .line 175
    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_3

    .line 181
    :cond_2
    #v7=(Integer);
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-gtz v7, :cond_3

    .line 182
    iget-object v7, p0, Landroid/support/v4/content/LocalBroadcastManager;->mActions:Ljava/util/HashMap;

    #v7=(Reference);
    invoke-virtual {v7, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 171
    .end local v5           #k:I
    :cond_3
    #v5=(Conflicted);v7=(Conflicted);
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    .line 169
    .end local v0           #action:Ljava/lang/String;
    .end local v6           #receivers:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v4/content/LocalBroadcastManager$ReceiverRecord;>;"
    :cond_4
    #v0=(Conflicted);v6=(Conflicted);v7=(Integer);
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 187
    .end local v1           #filter:Landroid/content/IntentFilter;
    .end local v4           #j:I
    :cond_5
    #v1=(Conflicted);v4=(Conflicted);
    monitor-exit v8

    goto :goto_0

    .end local v2           #filters:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/content/IntentFilter;>;"
    .end local v3           #i:I
    :catchall_0
    #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);
    move-exception v7

    #v7=(Reference);
    monitor-exit v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v7
.end method

*/}
