package android.support.v4.app; class NotificationManagerCompat$SideChannelManager { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationManagerCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/ServiceConnection;
a=0;// .implements Landroid/os/Handler$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationManagerCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "SideChannelManager"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final KEY_BINDER:Ljava/lang/String; = "binder"
a=0;// 
a=0;// .field private static final MSG_QUEUE_TASK:I = 0x0
a=0;// 
a=0;// .field private static final MSG_RETRY_LISTENER_QUEUE:I = 0x3
a=0;// 
a=0;// .field private static final MSG_SERVICE_CONNECTED:I = 0x1
a=0;// 
a=0;// .field private static final MSG_SERVICE_DISCONNECTED:I = 0x2
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCachedEnabledPackages:Ljava/util/Set;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private final mHandlerThread:Landroid/os/HandlerThread;
a=0;// 
a=0;// .field private final mRecordMap:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Landroid/content/ComponentName;",
a=0;//             "Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 281
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 277
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;);
a=0;//     new-instance v0, Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v0}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;
a=0;// 
a=0;//     .line 279
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mCachedEnabledPackages:Ljava/util/Set;
a=0;// 
a=0;//     .line 282
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 283
a=0;//     new-instance v0, Landroid/os/HandlerThread;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/HandlerThread;);
a=0;//     const-string v1, "NotificationManagerCompat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/HandlerThread;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandlerThread:Landroid/os/HandlerThread;
a=0;// 
a=0;//     .line 284
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandlerThread:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V
a=0;// 
a=0;//     .line 285
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandlerThread:Landroid/os/HandlerThread;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 286
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ensureServiceBound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)Z
a=0;//     .locals 4
a=0;//     .param p1, "record"    # Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 422
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 432
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 424
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     new-instance v1, Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/content/Intent;);
a=0;//     const-string v2, "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 425
a=0;//     .local v0, "intent":Landroid/content/Intent;
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {}, Landroid/support/v4/app/NotificationManagerCompat;->access$000()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v0, p0, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z
a=0;// 
a=0;//     .line 426
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 427
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I
a=0;// 
a=0;//     .line 432
a=0;//     :goto_1
a=0;//     #v1=(Reference,Landroid/content/Context;);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-boolean v1, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 429
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(Uninit);
a=0;//     const-string v1, "NotifManCompat"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Unable to bind to listener "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private ensureServiceUnbound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;//     .locals 1
a=0;//     .param p1, "record"    # Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     .prologue
a=0;//     .line 439
a=0;//     iget-boolean v0, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 440
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p0}, Landroid/content/Context;->unbindService(Landroid/content/ServiceConnection;)V
a=0;// 
a=0;//     .line 441
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->bound:Z
a=0;// 
a=0;//     .line 443
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->service:Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;//     .line 444
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private handleQueueTask(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
a=0;//     .locals 3
a=0;//     .param p1, "task"    # Landroid/support/v4/app/NotificationManagerCompat$Task;
a=0;// 
a=0;//     .prologue
a=0;//     .line 317
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->updateListenerMap()V
a=0;// 
a=0;//     .line 318
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     .line 319
a=0;//     .local v1, "record":Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;//     iget-object v2, v1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v2, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 320
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->processListenerQueue(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 322
a=0;//     .end local v1    # "record":Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private handleRetryListenerQueue(Landroid/content/ComponentName;)V
a=0;//     .locals 2
a=0;//     .param p1, "componentName"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     .line 342
a=0;//     .local v0, "record":Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 343
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->processListenerQueue(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;// 
a=0;//     .line 345
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private handleServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
a=0;//     .locals 2
a=0;//     .param p1, "componentName"    # Landroid/content/ComponentName;
a=0;//     .param p2, "iBinder"    # Landroid/os/IBinder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 325
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     .line 326
a=0;//     .local v0, "record":Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 327
a=0;//     invoke-static {p2}, Landroid/support/v4/app/INotificationSideChannel$Stub;->asInterface(Landroid/os/IBinder;)Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->service:Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;//     .line 328
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I
a=0;// 
a=0;//     .line 329
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->processListenerQueue(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;// 
a=0;//     .line 331
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private handleServiceDisconnected(Landroid/content/ComponentName;)V
a=0;//     .locals 2
a=0;//     .param p1, "componentName"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     .line 334
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     .line 335
a=0;//     .local v0, "record":Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 336
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->ensureServiceUnbound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;// 
a=0;//     .line 338
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private processListenerQueue(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;//     .locals 6
a=0;//     .param p1, "record"    # Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     .line 475
a=0;//     #v5=(PosByte);
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 476
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Processing component "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, ", "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " queued tasks"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 479
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v2}, Ljava/util/LinkedList;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 513
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 482
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->ensureServiceBound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->service:Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/INotificationSideChannel;);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 484
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->scheduleListenerRetry(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 494
a=0;//     .local v1, "task":Landroid/support/v4/app/NotificationManagerCompat$Task;
a=0;//     :cond_4
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Landroid/support/v4/app/NotificationManagerCompat$Task;);v2=(Reference,Ljava/util/LinkedList;);
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     const/4 v3, 0x3
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_5
a=0;// 
a=0;//     .line 495
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Sending task "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 497
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->service:Landroid/support/v4/app/INotificationSideChannel;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/INotificationSideChannel;);
a=0;//     invoke-interface {v1, v2}, Landroid/support/v4/app/NotificationManagerCompat$Task;->send(Landroid/support/v4/app/INotificationSideChannel;)V
a=0;// 
a=0;//     .line 498
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/LinkedList;->remove()Ljava/lang/Object;
a=0;//     :try_end_0
a=0;//     .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     .line 489
a=0;//     .end local v1    # "task":Landroid/support/v4/app/NotificationManagerCompat$Task;
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/LinkedList;->peek()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/NotificationManagerCompat$Task;
a=0;// 
a=0;//     .line 490
a=0;//     .restart local v1    # "task":Landroid/support/v4/app/NotificationManagerCompat$Task;
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 509
a=0;//     :cond_7
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/LinkedList;);
a=0;//     invoke-virtual {v2}, Ljava/util/LinkedList;->isEmpty()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 511
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->scheduleListenerRetry(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 499
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v2=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 500
a=0;//     .local v0, "e":Landroid/os/DeadObjectException;
a=0;//     #v0=(Reference,Landroid/os/DeadObjectException;);
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 501
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Remote service has died: "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 504
a=0;//     .end local v0    # "e":Landroid/os/DeadObjectException;
a=0;//     :catch_1
a=0;//     #v0=(Uninit);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 505
a=0;//     .local v0, "e":Landroid/os/RemoteException;
a=0;//     #v0=(Reference,Landroid/os/RemoteException;);
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "RemoteException communicating with "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private scheduleListenerRetry(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;//     .locals 6
a=0;//     .param p1, "record"    # Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     .line 452
a=0;//     #v5=(PosByte);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v3, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v2, v5, v3}, Landroid/os/Handler;->hasMessages(ILjava/lang/Object;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 468
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 455
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Reference,Landroid/content/ComponentName;);v4=(Uninit);
a=0;//     iget v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     iput v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I
a=0;// 
a=0;//     .line 456
a=0;//     iget v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I
a=0;// 
a=0;//     const/4 v3, 0x6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-le v2, v3, :cond_1
a=0;// 
a=0;//     .line 457
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Giving up on delivering "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/LinkedList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " tasks to "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " after "
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " retries"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 459
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->taskQueue:Ljava/util/LinkedList;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/LinkedList;->clear()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 462
a=0;//     :cond_1
a=0;//     #v2=(Integer);v3=(PosByte);v4=(Uninit);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     iget v3, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->retryCount:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     shl-int/2addr v2, v3
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     mul-int/lit16 v0, v2, 0x3e8
a=0;// 
a=0;//     .line 463
a=0;//     .local v0, "delayMs":I
a=0;//     #v0=(Integer);
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v5}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 464
a=0;//     const-string v2, "NotifManCompat"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "Scheduling retry for "
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     const-string v4, " ms"
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 466
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Handler;);
a=0;//     iget-object v3, p1, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v2, v5, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 467
a=0;//     .local v1, "msg":Landroid/os/Message;
a=0;//     #v1=(Reference,Landroid/os/Message;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     int-to-long v3, v0
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v1, v3, v4}, Landroid/os/Handler;->sendMessageDelayed(Landroid/os/Message;J)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private updateListenerMap()V
a=0;//     .locals 12
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     .line 370
a=0;//     #v11=(PosByte);
a=0;//     iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v8}, Landroid/support/v4/app/NotificationManagerCompat;->getEnabledListenerPackages(Landroid/content/Context;)Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 371
a=0;//     .local v2, "enabledPackages":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mCachedEnabledPackages:Ljava/util/Set;
a=0;// 
a=0;//     invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_1
a=0;// 
a=0;//     .line 414
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 375
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);v10=(Uninit);
a=0;//     iput-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mCachedEnabledPackages:Ljava/util/Set;
a=0;// 
a=0;//     .line 376
a=0;//     iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v8}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     new-instance v9, Landroid/content/Intent;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/content/Intent;);
a=0;//     invoke-direct {v9}, Landroid/content/Intent;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Intent;);
a=0;//     const-string v10, "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const/4 v10, 0x4
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v8, v9, v10}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 378
a=0;//     .local v7, "resolveInfos":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
a=0;//     #v7=(Reference,Ljava/util/List;);
a=0;//     new-instance v1, Ljava/util/HashSet;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v1}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     .line 379
a=0;//     .local v1, "enabledComponents":Ljava/util/Set;, "Ljava/util/Set<Landroid/content/ComponentName;>;"
a=0;//     #v1=(Reference,Ljava/util/HashSet;);
a=0;//     invoke-interface {v7}, Ljava/util/List;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .local v4, "i$":Ljava/util/Iterator;
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v4=(Reference,Ljava/util/Iterator;);v6=(Conflicted);v8=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 380
a=0;//     .local v6, "resolveInfo":Landroid/content/pm/ResolveInfo;
a=0;//     iget-object v8, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/pm/ServiceInfo;);
a=0;//     iget-object v8, v8, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v2, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 383
a=0;//     new-instance v0, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/content/ComponentName;);
a=0;//     iget-object v8, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/pm/ServiceInfo;);
a=0;//     iget-object v8, v8, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v9, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     iget-object v9, v9, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v8, v9}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 385
a=0;//     .local v0, "componentName":Landroid/content/ComponentName;
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     iget-object v8, v6, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;
a=0;// 
a=0;//     iget-object v8, v8, Landroid/content/pm/ServiceInfo;->permission:Ljava/lang/String;
a=0;// 
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 386
a=0;//     const-string v8, "NotifManCompat"
a=0;// 
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Permission present on component "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     const-string v10, ", not adding listener record."
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 390
a=0;//     :cond_3
a=0;//     #v10=(Conflicted);
a=0;//     invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 393
a=0;//     .end local v0    # "componentName":Landroid/content/ComponentName;
a=0;//     .end local v6    # "resolveInfo":Landroid/content/pm/ResolveInfo;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v6=(Conflicted);v8=(Boolean);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :cond_5
a=0;//     :goto_1
a=0;//     #v8=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_7
a=0;// 
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/content/ComponentName;
a=0;// 
a=0;//     .line 394
a=0;//     .restart local v0    # "componentName":Landroid/content/ComponentName;
a=0;//     iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v8, v0}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_5
a=0;// 
a=0;//     .line 395
a=0;//     const-string v8, "NotifManCompat"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_6
a=0;// 
a=0;//     .line 396
a=0;//     const-string v8, "NotifManCompat"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Adding listener record for "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 398
a=0;//     :cond_6
a=0;//     #v8=(Conflicted);v10=(Conflicted);
a=0;//     iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Map;);
a=0;//     new-instance v9, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;);
a=0;//     invoke-direct {v9, v0}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;-><init>(Landroid/content/ComponentName;)V
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;);
a=0;//     invoke-interface {v8, v0, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 402
a=0;//     .end local v0    # "componentName":Landroid/content/ComponentName;
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v8=(Boolean);
a=0;//     iget-object v8, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mRecordMap:Ljava/util/Map;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 404
a=0;//     .local v5, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/util/Map$Entry<Landroid/content/ComponentName;Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;>;>;"
a=0;//     :cond_8
a=0;//     :goto_2
a=0;//     #v3=(Conflicted);v5=(Reference,Ljava/util/Iterator;);v8=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_0
a=0;// 
a=0;//     .line 405
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 406
a=0;//     .local v3, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Landroid/content/ComponentName;Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;>;"
a=0;//     invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     invoke-interface {v1, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_8
a=0;// 
a=0;//     .line 407
a=0;//     const-string v8, "NotifManCompat"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v11}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     .line 408
a=0;//     const-string v8, "NotifManCompat"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "Removing listener record for "
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v8, v9}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 410
a=0;//     :cond_9
a=0;//     #v8=(Conflicted);v10=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;
a=0;// 
a=0;//     invoke-direct {p0, v8}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->ensureServiceUnbound(Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager$ListenerRecord;)V
a=0;// 
a=0;//     .line 411
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)Z
a=0;//     .locals 4
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 298
a=0;//     #v2=(One);
a=0;//     iget v1, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 313
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 300
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Integer);v3=(Uninit);
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v4/app/NotificationManagerCompat$Task;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->handleQueueTask(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 301
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 303
a=0;//     :pswitch_1
a=0;//     #v1=(Integer);
a=0;//     iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;
a=0;// 
a=0;//     .line 304
a=0;//     .local v0, "event":Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;
a=0;//     iget-object v1, v0, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;->componentName:Landroid/content/ComponentName;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/ComponentName;);
a=0;//     iget-object v3, v0, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;->iBinder:Landroid/os/IBinder;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/IBinder;);
a=0;//     invoke-direct {p0, v1, v3}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->handleServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 305
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 307
a=0;//     .end local v0    # "event":Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;
a=0;//     :pswitch_2
a=0;//     #v0=(Uninit);v1=(Integer);v3=(Uninit);
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->handleServiceDisconnected(Landroid/content/ComponentName;)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 308
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 310
a=0;//     :pswitch_3
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/content/ComponentName;
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->handleRetryListenerQueue(Landroid/content/ComponentName;)V
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 311
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 298
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
a=0;//     .locals 3
a=0;//     .param p1, "componentName"    # Landroid/content/ComponentName;
a=0;//     .param p2, "iBinder"    # Landroid/os/IBinder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 349
a=0;//     const-string v0, "NotifManCompat"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     const-string v0, "NotifManCompat"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Connected to service "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 352
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     new-instance v2, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;);
a=0;//     invoke-direct {v2, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;-><init>(Landroid/content/ComponentName;Landroid/os/IBinder;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 355
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onServiceDisconnected(Landroid/content/ComponentName;)V
a=0;//     .locals 3
a=0;//     .param p1, "componentName"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     .line 359
a=0;//     const-string v0, "NotifManCompat"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 360
a=0;//     const-string v0, "NotifManCompat"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "Disconnected from service "
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 362
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 363
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public queueTask(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
a=0;//     .locals 2
a=0;//     .param p1, "task"    # Landroid/support/v4/app/NotificationManagerCompat$Task;
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V
a=0;// 
a=0;//     .line 294
a=0;//     return-void
a=0;// .end method
}}
