package android.support.v4.app; class NotificationManagerCompat {/*

.class public Landroid/support/v4/app/NotificationManagerCompat;
.super Ljava/lang/Object;
.source "NotificationManagerCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/NotificationManagerCompat$CancelTask;,
        Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;,
        Landroid/support/v4/app/NotificationManagerCompat$Task;,
        Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;,
        Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;,
        Landroid/support/v4/app/NotificationManagerCompat$ImplIceCreamSandwich;,
        Landroid/support/v4/app/NotificationManagerCompat$ImplEclair;,
        Landroid/support/v4/app/NotificationManagerCompat$ImplBase;,
        Landroid/support/v4/app/NotificationManagerCompat$Impl;
    }
.end annotation


# static fields
.field public static final ACTION_BIND_SIDE_CHANNEL:Ljava/lang/String; = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"

.field public static final EXTRA_USE_SIDE_CHANNEL:Ljava/lang/String; = "android.support.useSideChannel"

.field private static final IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl; = null

.field private static final SETTING_ENABLED_NOTIFICATION_LISTENERS:Ljava/lang/String; = "enabled_notification_listeners"

#the value of this static final field might be set in the static constructor
.field private static final SIDE_CHANNEL_BIND_FLAGS:I = 0x0

.field private static final SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS:I = 0x3e8

.field private static final SIDE_CHANNEL_RETRY_MAX_COUNT:I = 0x6

.field private static final TAG:Ljava/lang/String; = "NotifManCompat"

.field private static sEnabledNotificationListenerPackages:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static sEnabledNotificationListeners:Ljava/lang/String;

.field private static final sEnabledNotificationListenersLock:Ljava/lang/Object;

.field private static final sLock:Ljava/lang/Object;

.field private static sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;


# instance fields
.field private final mContext:Landroid/content/Context;

.field private final mNotificationManager:Landroid/app/NotificationManager;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 82
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenersLock:Ljava/lang/Object;

    .line 86
    new-instance v0, Ljava/util/HashSet;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenerPackages:Ljava/util/Set;

    .line 91
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sLock:Ljava/lang/Object;

    .line 159
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xe

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 160
    new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$ImplIceCreamSandwich;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/NotificationManagerCompat$ImplIceCreamSandwich;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;

    .line 166
    :goto_0
    sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;

    invoke-interface {v0}, Landroid/support/v4/app/NotificationManagerCompat$Impl;->getSideChannelBindFlags()I

    move-result v0

    #v0=(Integer);
    sput v0, Landroid/support/v4/app/NotificationManagerCompat;->SIDE_CHANNEL_BIND_FLAGS:I

    .line 167
    return-void

    .line 161
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/4 v1, 0x5

    if-lt v0, v1, :cond_1

    .line 162
    new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$ImplEclair;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/NotificationManagerCompat$ImplEclair;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;

    goto :goto_0

    .line 164
    :cond_1
    #v0=(Integer);
    new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$ImplBase;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/NotificationManagerCompat$ImplBase;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;

    goto :goto_0
.end method

.method private constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 100
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;

    .line 102
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;

    #v0=(Reference);
    const-string v1, "notification"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/NotificationManager;

    iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;

    .line 104
    return-void
.end method

.method static synthetic access$000()I
    .locals 1

    .prologue
    .line 54
    sget v0, Landroid/support/v4/app/NotificationManagerCompat;->SIDE_CHANNEL_BIND_FLAGS:I

    #v0=(Integer);
    return v0
.end method

.method public static from(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;
    .locals 1
    .parameter "context"

    .prologue
    .line 97
    new-instance v0, Landroid/support/v4/app/NotificationManagerCompat;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/app/NotificationManagerCompat;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    return-object v0
.end method

.method public static getEnabledListenerPackages(Landroid/content/Context;)Ljava/util/Set;
    .locals 10
    .parameter "context"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 220
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v8

    #v8=(Reference);
    const-string v9, "enabled_notification_listeners"

    #v9=(Reference);
    invoke-static {v8, v9}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 224
    .local v4, enabledNotificationListeners:Ljava/lang/String;
    #v4=(Reference);
    if-eqz v4, :cond_2

    sget-object v8, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListeners:Ljava/lang/String;

    invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    #v8=(Boolean);
    if-nez v8, :cond_2

    .line 226
    const-string v8, ":"

    #v8=(Reference);
    invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    .line 227
    .local v3, components:[Ljava/lang/String;
    #v3=(Reference);
    new-instance v7, Ljava/util/HashSet;

    #v7=(UninitRef);
    array-length v8, v3

    #v8=(Integer);
    invoke-direct {v7, v8}, Ljava/util/HashSet;-><init>(I)V

    .line 228
    .local v7, packageNames:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    #v7=(Reference);
    move-object v0, v3

    .local v0, arr$:[Ljava/lang/String;
    #v0=(Reference);
    array-length v6, v0

    .local v6, len$:I
    #v6=(Integer);
    const/4 v5, 0x0

    .local v5, i$:I
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v5=(Integer);v8=(Conflicted);
    if-ge v5, v6, :cond_1

    aget-object v1, v0, v5

    .line 229
    .local v1, component:Ljava/lang/String;
    #v1=(Null);
    invoke-static {v1}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;

    move-result-object v2

    .line 230
    .local v2, componentName:Landroid/content/ComponentName;
    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 231
    invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    invoke-interface {v7, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 228
    :cond_0
    #v8=(Conflicted);
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 234
    .end local v1           #component:Ljava/lang/String;
    .end local v2           #componentName:Landroid/content/ComponentName;
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);
    sget-object v9, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenersLock:Ljava/lang/Object;

    monitor-enter v9

    .line 235
    :try_start_0
    sput-object v7, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenerPackages:Ljava/util/Set;

    .line 236
    sput-object v4, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListeners:Ljava/lang/String;

    .line 237
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 239
    .end local v0           #arr$:[Ljava/lang/String;
    .end local v3           #components:[Ljava/lang/String;
    .end local v5           #i$:I
    .end local v6           #len$:I
    .end local v7           #packageNames:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    :cond_2
    #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    sget-object v8, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenerPackages:Ljava/util/Set;

    #v8=(Reference);
    return-object v8

    .line 237
    .restart local v0       #arr$:[Ljava/lang/String;
    .restart local v3       #components:[Ljava/lang/String;
    .restart local v5       #i$:I
    .restart local v6       #len$:I
    .restart local v7       #packageNames:Ljava/util/Set;,"Ljava/util/Set<Ljava/lang/String;>;"
    :catchall_0
    #v0=(Reference);v3=(Reference);v5=(Integer);v6=(Integer);v7=(Reference);v8=(Conflicted);
    move-exception v8

    :try_start_1
    #v8=(Reference);
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v8
.end method

.method private pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
    .locals 3
    .parameter "task"

    .prologue
    .line 254
    sget-object v1, Landroid/support/v4/app/NotificationManagerCompat;->sLock:Ljava/lang/Object;

    #v1=(Reference);
    monitor-enter v1

    .line 255
    :try_start_0
    sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 256
    new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;

    #v0=(UninitRef);
    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;

    .line 258
    :cond_0
    #v2=(Conflicted);
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 259
    sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;

    invoke-virtual {v0, p1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->queueTask(Landroid/support/v4/app/NotificationManagerCompat$Task;)V

    .line 260
    return-void

    .line 258
    :catchall_0
    #v0=(Conflicted);
    move-exception v0

    :try_start_1
    #v0=(Reference);
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method private static useSideChannelForNotification(Landroid/app/Notification;)Z
    .locals 2
    .parameter "notification"

    .prologue
    .line 246
    invoke-static {p0}, Landroid/support/v4/app/NotificationCompat;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v0

    .line 247
    .local v0, extras:Landroid/os/Bundle;
    #v0=(Reference);
    if-eqz v0, :cond_0

    const-string v1, "android.support.useSideChannel"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    return v1

    :cond_0
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method


# virtual methods
.method public cancel(I)V
    .locals 1
    .parameter "id"

    .prologue
    .line 174
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0, p1}, Landroid/support/v4/app/NotificationManagerCompat;->cancel(Ljava/lang/String;I)V

    .line 175
    return-void
.end method

.method public cancel(Ljava/lang/String;I)V
    .locals 2
    .parameter "tag"
    .parameter "id"

    .prologue
    .line 183
    sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;

    #v1=(Reference);
    invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat$Impl;->cancelNotification(Landroid/app/NotificationManager;Ljava/lang/String;I)V

    .line 184
    new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2, p1}, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    #v0=(Reference);
    invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat;->pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V

    .line 185
    return-void
.end method

.method public cancelAll()V
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V

    .line 190
    new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat;->pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V

    .line 191
    return-void
.end method

.method public notify(ILandroid/app/Notification;)V
    .locals 1
    .parameter "id"
    .parameter "notification"

    .prologue
    .line 199
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 200
    return-void
.end method

.method public notify(Ljava/lang/String;ILandroid/app/Notification;)V
    .locals 2
    .parameter "tag"
    .parameter "id"
    .parameter "notification"

    .prologue
    .line 209
    invoke-static {p3}, Landroid/support/v4/app/NotificationManagerCompat;->useSideChannelForNotification(Landroid/app/Notification;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 210
    new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p2, p1, p3}, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V

    #v0=(Reference);
    invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat;->pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V

    .line 214
    :goto_0
    return-void

    .line 212
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;

    #v1=(Reference);
    invoke-interface {v0, v1, p1, p2, p3}, Landroid/support/v4/app/NotificationManagerCompat$Impl;->postNotification(Landroid/app/NotificationManager;Ljava/lang/String;ILandroid/app/Notification;)V

    goto :goto_0
.end method

*/}
