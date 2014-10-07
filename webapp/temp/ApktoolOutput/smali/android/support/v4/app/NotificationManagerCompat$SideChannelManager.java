package android.support.v4.app; class NotificationManagerCompat$SideChannelManager {/*

.class Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
.super Ljava/lang/Object;
.source "NotificationManagerCompat.java"

# interfaces
.implements Landroid/os/Handler$Callback;
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationManagerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "SideChannelManager"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
    }
.end annotation


# static fields
.field private static final KEY_BINDER:Ljava/lang/String; = "binder"

.field private static final MSG_QUEUE_TASK:I = 0x0

.field private static final MSG_RETRY_LISTENER_QUEUE:I = 0x3

.field private static final MSG_SERVICE_CONNECTED:I = 0x1

.field private static final MSG_SERVICE_DISCONNECTED:I = 0x2


# instance fields
.field private mCachedEnabledPackages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final mContext:Landroid/content/Context;

.field private final mHandler:Landroid/os/Handler;

.field private final mHandlerThread:Landroid/os/HandlerThread;

.field private final mRecordMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Landroid/content/ComponentName;",
            "Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 281
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 277
    #p0=(Reference);
    new-instance v0, Ljava/util/HashMap;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;

    .line 279
    new-instance v0, Ljava/util/HashSet;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mCachedEnabledPackages:Ljava/util/Set;

    .line 282
    iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;

    .line 283
    new-instance v0, Landroid/os/HandlerThread;

    #v0=(UninitRef);
    const-string v1, "NotificationManagerCompat"

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandlerThread:Landroid/os/HandlerThread;

    .line 284
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 285
    new-instance v0, Landroid/os/Handler;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandlerThread:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;

    .line 286
    return-void
.end method

.method private ensureServiceBound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)Z
    .locals 4
    .parameter "record"

    .prologue
    .line 421
    iget-boolean v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 422
    const/4 v1, 0x1

    .line 432
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v1

    .line 424
    :cond_0
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);
    new-instance v1, Landroid/content/Intent;

    #v1=(UninitRef);
    const-string v2, "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-result-object v0

    .line 425
    .local v0, intent:Landroid/content/Intent;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;

    invoke-static {}, Landroid/support/v4/app/NotificationManagerCompat;->access$000()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    move-result v1

    #v1=(Boolean);
    iput-boolean v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z

    .line 426
    iget-boolean v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z

    if-eqz v1, :cond_1

    .line 427
    const/4 v1, 0x0

    #v1=(Null);
    iput v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I

    .line 432
    :goto_1
    #v1=(Reference);v2=(Conflicted);v3=(Conflicted);
    iget-boolean v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z

    #v1=(Boolean);
    goto :goto_0

    .line 429
    :cond_1
    #v2=(Integer);v3=(Uninit);
    const-string v1, "NotifManCompat"

    #v1=(Reference);
    new-instance v2, Ljava/lang/StringBuilder;

    #v2=(UninitRef);
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    #v2=(Reference);
    const-string v3, "Unable to bind to listener "

    #v3=(Reference);
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 430
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;

    invoke-virtual {v1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    goto :goto_1
.end method

.method private ensureServiceUnbound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
    .locals 1
    .parameter "record"

    .prologue
    .line 439
    iget-boolean v0, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 440
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V

    .line 441
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z

    .line 443
    :cond_0
    #v0=(Boolean);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->service:Landroid/support/v4/app/INotificationSideChannel;

    .line 444
    return-void
.end method

.method private handleQueueTask(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
    .locals 3
    .parameter "task"

    .prologue
    .line 317
    invoke-direct {p0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->updateListenerMap()V

    .line 318
    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;

    #v2=(Reference);
    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, i$:Ljava/util/Iterator;
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;

    .line 319
    .local v1, record:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
    iget-object v2, v1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;

    #v2=(Reference);
    invoke-virtual {v2, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 320
    invoke-direct {p0, v1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->processListenerQueue(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V

    goto :goto_0

    .line 322
    .end local v1           #record:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
    :cond_0
    #v1=(Conflicted);v2=(Boolean);
    return-void
.end method

.method private handleRetryListenerQueue(Landroid/content/ComponentName;)V
    .locals 2
    .parameter "componentName"

    .prologue
    .line 341
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;

    #v1=(Reference);
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;

    .line 342
    .local v0, record:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
    if-eqz v0, :cond_0

    .line 343
    invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->processListenerQueue(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V

    .line 345
    :cond_0
    return-void
.end method

.method private handleServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2
    .parameter "componentName"
    .parameter "iBinder"

    .prologue
    .line 325
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;

    #v1=(Reference);
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;

    .line 326
    .local v0, record:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
    if-eqz v0, :cond_0

    .line 327
    invoke-static {p2}, Landroid/support/v4/app/INotificationSideChannel$Stub;->asInterface(Landroid/os/IBinder;)Landroid/support/v4/app/INotificationSideChannel;

    move-result-object v1

    iput-object v1, v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->service:Landroid/support/v4/app/INotificationSideChannel;

    .line 328
    const/4 v1, 0x0

    #v1=(Null);
    iput v1, v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I

    .line 329
    invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->processListenerQueue(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V

    .line 331
    :cond_0
    #v1=(Reference);
    return-void
.end method

.method private handleServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2
    .parameter "componentName"

    .prologue
    .line 334
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;

    #v1=(Reference);
    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;

    .line 335
    .local v0, record:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
    if-eqz v0, :cond_0

    .line 336
    invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->ensureServiceUnbound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V

    .line 338
    :cond_0
    return-void
.end method

.method private processListenerQueue(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
    .locals 6
    .parameter "record"

    .prologue
    const/4 v5, 0x3

    .line 475
    #v5=(PosByte);
    const-string v2, "NotifManCompat"

    #v2=(Reference);
    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 476
    const-string v2, "NotifManCompat"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Processing component "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, ", "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " queued tasks"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 479
    :cond_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    .line 513
    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 482
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);
    invoke-direct {p0, p1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->ensureServiceBound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->service:Landroid/support/v4/app/INotificationSideChannel;

    #v2=(Reference);
    if-nez v2, :cond_6

    .line 484
    :cond_3
    #v2=(Conflicted);
    invoke-direct {p0, p1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->scheduleListenerRetry(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V

    goto :goto_0

    .line 494
    .local v1, task:Landroid/support/v4/app/NotificationManagerCompat$Task;
    :cond_4
    :try_start_0
    #v1=(Reference);v2=(Reference);
    const-string v2, "NotifManCompat"

    const/4 v3, 0x3

    #v3=(PosByte);
    invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_5

    .line 495
    const-string v2, "NotifManCompat"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Sending task "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 497
    :cond_5
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->service:Landroid/support/v4/app/INotificationSideChannel;

    #v2=(Reference);
    invoke-interface {v1, v2}, Landroid/support/v4/app/NotificationManagerCompat$Task;->send(Landroid/support/v4/app/INotificationSideChannel;)V

    .line 498
    iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1

    .line 489
    .end local v1           #task:Landroid/support/v4/app/NotificationManagerCompat$Task;
    :cond_6
    #v1=(Conflicted);
    iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/app/NotificationManagerCompat$Task;

    .line 490
    .restart local v1       #task:Landroid/support/v4/app/NotificationManagerCompat$Task;
    if-nez v1, :cond_4

    .line 509
    :cond_7
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);
    iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;

    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/LinkedList;->isEmpty()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_1

    .line 511
    invoke-direct {p0, p1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->scheduleListenerRetry(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V

    goto :goto_0

    .line 499
    :catch_0
    #v0=(Uninit);v2=(Conflicted);
    move-exception v0

    .line 500
    .local v0, e:Landroid/os/DeadObjectException;
    #v0=(Reference);
    const-string v2, "NotifManCompat"

    #v2=(Reference);
    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_7

    .line 501
    const-string v2, "NotifManCompat"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Remote service has died: "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_1

    .line 504
    .end local v0           #e:Landroid/os/DeadObjectException;
    :catch_1
    #v0=(Uninit);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 505
    .local v0, e:Landroid/os/RemoteException;
    #v0=(Reference);
    const-string v2, "NotifManCompat"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "RemoteException communicating with "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method private scheduleListenerRetry(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
    .locals 6
    .parameter "record"

    .prologue
    const/4 v5, 0x3

    .line 452
    #v5=(PosByte);
    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;

    #v2=(Reference);
    iget-object v3, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;

    #v3=(Reference);
    invoke-virtual {v2, v5, v3}, Landroid/os/Handler;->hasMessages(ILjava/lang/Object;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 468
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 455
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Reference);v4=(Uninit);
    iget v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I

    #v2=(Integer);
    add-int/lit8 v2, v2, 0x1

    iput v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I

    .line 456
    iget v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I

    const/4 v3, 0x6

    #v3=(PosByte);
    if-le v2, v3, :cond_1

    .line 457
    const-string v2, "NotifManCompat"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Giving up on delivering "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;

    invoke-virtual {v4}, Ljava/util/LinkedList;->size()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " tasks to "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " after "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " retries"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 459
    iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;

    invoke-virtual {v2}, Ljava/util/LinkedList;->clear()V

    goto :goto_0

    .line 462
    :cond_1
    #v2=(Integer);v3=(PosByte);v4=(Uninit);
    const/4 v2, 0x1

    #v2=(One);
    iget v3, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I

    #v3=(Integer);
    add-int/lit8 v3, v3, -0x1

    shl-int/2addr v2, v3

    #v2=(Integer);
    mul-int/lit16 v0, v2, 0x3e8

    .line 463
    .local v0, delayMs:I
    #v0=(Integer);
    const-string v2, "NotifManCompat"

    #v2=(Reference);
    invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    .line 464
    const-string v2, "NotifManCompat"

    #v2=(Reference);
    new-instance v3, Ljava/lang/StringBuilder;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    #v3=(Reference);
    const-string v4, "Scheduling retry for "

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, " ms"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 466
    :cond_2
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;

    #v2=(Reference);
    iget-object v3, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;

    #v3=(Reference);
    invoke-virtual {v2, v5, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 467
    .local v1, msg:Landroid/os/Message;
    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;

    int-to-long v3, v0

    #v3=(LongLo);v4=(LongHi);
    invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto/16 :goto_0
.end method

.method private updateListenerMap()V
    .locals 12

    .prologue
    const/4 v11, 0x3

    .line 370
    #v11=(PosByte);
    iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;

    #v8=(Reference);
    invoke-static {v8}, Landroid/support/v4/app/NotificationManagerCompat;->getEnabledListenerPackages(Landroid/content/Context;)Ljava/util/Set;

    move-result-object v2

    .line 371
    .local v2, enabledPackages:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    #v2=(Reference);
    iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mCachedEnabledPackages:Ljava/util/Set;

    invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_1

    .line 414
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return-void

    .line 375
    :cond_1
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);
    iput-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mCachedEnabledPackages:Ljava/util/Set;

    .line 376
    iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v8

    new-instance v9, Landroid/content/Intent;

    #v9=(UninitRef);
    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    #v9=(Reference);
    const-string v10, "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"

    #v10=(Reference);
    invoke-virtual {v9, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v9

    const/4 v10, 0x4

    #v10=(PosByte);
    invoke-virtual {v8, v9, v10}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v7

    .line 378
    .local v7, resolveInfos:Ljava/util/List;,"Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    #v7=(Reference);
    new-instance v1, Ljava/util/HashSet;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    .line 379
    .local v1, enabledComponents:Ljava/util/Set;,"Ljava/util/Set<Landroid/content/ComponentName;>;"
    #v1=(Reference);
    invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    .local v4, i$:Ljava/util/Iterator;
    :cond_2
    :goto_0
    #v0=(Conflicted);v4=(Reference);v6=(Conflicted);v8=(Conflicted);v10=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    #v6=(Reference);
    check-cast v6, Landroid/content/pm/ResolveInfo;

    .line 380
    .local v6, resolveInfo:Landroid/content/pm/ResolveInfo;
    iget-object v8, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    #v8=(Reference);
    iget-object v8, v8, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-interface {v2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_2

    .line 383
    new-instance v0, Landroid/content/ComponentName;

    #v0=(UninitRef);
    iget-object v8, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    #v8=(Reference);
    iget-object v8, v8, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object v9, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v9, v9, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v0, v8, v9}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 385
    .local v0, componentName:Landroid/content/ComponentName;
    #v0=(Reference);
    iget-object v8, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    iget-object v8, v8, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;

    if-eqz v8, :cond_3

    .line 386
    const-string v8, "NotifManCompat"

    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    #v9=(Reference);
    const-string v10, "Permission present on component "

    #v10=(Reference);
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    const-string v10, ", not adding listener record."

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    .line 390
    :cond_3
    #v10=(Conflicted);
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 393
    .end local v0           #componentName:Landroid/content/ComponentName;
    .end local v6           #resolveInfo:Landroid/content/pm/ResolveInfo;
    :cond_4
    #v0=(Conflicted);v6=(Conflicted);v8=(Boolean);
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    :goto_1
    #v8=(Conflicted);
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/content/ComponentName;

    .line 394
    .restart local v0       #componentName:Landroid/content/ComponentName;
    iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;

    #v8=(Reference);
    invoke-interface {v8, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-nez v8, :cond_5

    .line 395
    const-string v8, "NotifManCompat"

    #v8=(Reference);
    invoke-static {v8, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_6

    .line 396
    const-string v8, "NotifManCompat"

    #v8=(Reference);
    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    #v9=(Reference);
    const-string v10, "Adding listener record for "

    #v10=(Reference);
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 398
    :cond_6
    #v8=(Conflicted);v10=(Conflicted);
    iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;

    #v8=(Reference);
    new-instance v9, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;

    #v9=(UninitRef);
    invoke-direct {v9, v0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;-><init>(Landroid/content/ComponentName;)V

    #v9=(Reference);
    invoke-interface {v8, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 402
    .end local v0           #componentName:Landroid/content/ComponentName;
    :cond_7
    #v0=(Conflicted);v8=(Boolean);
    iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;

    #v8=(Reference);
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v5

    .line 404
    .local v5, it:Ljava/util/Iterator;,"Ljava/util/Iterator<Ljava/util/Map$Entry<Landroid/content/ComponentName;Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;>;>;"
    :cond_8
    :goto_2
    #v3=(Conflicted);v5=(Reference);v8=(Conflicted);
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_0

    .line 405
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/util/Map$Entry;

    .line 406
    .local v3, entry:Ljava/util/Map$Entry;,"Ljava/util/Map$Entry<Landroid/content/ComponentName;Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;>;"
    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    invoke-interface {v1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-nez v8, :cond_8

    .line 407
    const-string v8, "NotifManCompat"

    #v8=(Reference);
    invoke-static {v8, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_9

    .line 408
    const-string v8, "NotifManCompat"

    #v8=(Reference);
    new-instance v9, Ljava/lang/StringBuilder;

    #v9=(UninitRef);
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    #v9=(Reference);
    const-string v10, "Removing listener record for "

    #v10=(Reference);
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 410
    :cond_9
    #v8=(Conflicted);v10=(Conflicted);
    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;

    invoke-direct {p0, v8}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->ensureServiceUnbound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V

    .line 411
    invoke-interface {v5}, Ljava/util/Iterator;->remove()V

    goto :goto_2
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)Z
    .locals 4
    .parameter "msg"

    .prologue
    const/4 v2, 0x1

    .line 298
    #v2=(One);
    iget v1, p1, Landroid/os/Message;->what:I

    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    .line 313
    const/4 v1, 0x0

    :goto_0
    #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);
    return v1

    .line 300
    :pswitch_0
    #v0=(Uninit);v1=(Integer);v3=(Uninit);
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/app/NotificationManagerCompat$Task;

    invoke-direct {p0, v1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->handleQueueTask(Landroid/support/v4/app/NotificationManagerCompat$Task;)V

    move v1, v2

    .line 301
    #v1=(One);
    goto :goto_0

    .line 303
    :pswitch_1
    #v1=(Integer);
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;

    .line 304
    .local v0, event:Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;
    iget-object v1, v0, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;->componentName:Landroid/content/ComponentName;

    #v1=(Reference);
    iget-object v3, v0, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;->iBinder:Landroid/os/IBinder;

    #v3=(Reference);
    invoke-direct {p0, v1, v3}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->handleServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    move v1, v2

    .line 305
    #v1=(One);
    goto :goto_0

    .line 307
    .end local v0           #event:Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;
    :pswitch_2
    #v0=(Uninit);v1=(Integer);v3=(Uninit);
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v1=(Reference);
    check-cast v1, Landroid/content/ComponentName;

    invoke-direct {p0, v1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->handleServiceDisconnected(Landroid/content/ComponentName;)V

    move v1, v2

    .line 308
    #v1=(One);
    goto :goto_0

    .line 310
    :pswitch_3
    #v1=(Integer);
    iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v1=(Reference);
    check-cast v1, Landroid/content/ComponentName;

    invoke-direct {p0, v1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->handleRetryListenerQueue(Landroid/content/ComponentName;)V

    move v1, v2

    .line 311
    #v1=(One);
    goto :goto_0

    .line 298
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 3
    .parameter "componentName"
    .parameter "iBinder"

    .prologue
    .line 349
    const-string v0, "NotifManCompat"

    #v0=(Reference);
    const/4 v1, 0x3

    #v1=(PosByte);
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 350
    const-string v0, "NotifManCompat"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Connected to service "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 352
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    new-instance v2, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;

    #v2=(UninitRef);
    invoke-direct {v2, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;-><init>(Landroid/content/ComponentName;Landroid/os/IBinder;)V

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 355
    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3
    .parameter "componentName"

    .prologue
    .line 359
    const-string v0, "NotifManCompat"

    #v0=(Reference);
    const/4 v1, 0x3

    #v1=(PosByte);
    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 360
    const-string v0, "NotifManCompat"

    #v0=(Reference);
    new-instance v1, Ljava/lang/StringBuilder;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    #v1=(Reference);
    const-string v2, "Disconnected from service "

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 362
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 363
    return-void
.end method

.method public queueTask(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
    .locals 2
    .parameter "task"

    .prologue
    .line 293
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    move-result-object v0

    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 294
    return-void
.end method

*/}
