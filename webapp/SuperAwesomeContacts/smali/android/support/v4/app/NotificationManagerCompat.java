package android.support.v4.app; class NotificationManagerCompat { void a() { int a;
a=0;// .class public Landroid/support/v4/app/NotificationManagerCompat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationManagerCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$CancelTask;,
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;,
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$Task;,
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$ServiceConnectedEvent;,
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;,
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$ImplIceCreamSandwich;,
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$ImplEclair;,
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$ImplBase;,
a=0;//         Landroid/support/v4/app/NotificationManagerCompat$Impl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static final ACTION_BIND_SIDE_CHANNEL:Ljava/lang/String; = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL"
a=0;// 
a=0;// .field public static final EXTRA_USE_SIDE_CHANNEL:Ljava/lang/String; = "android.support.useSideChannel"
a=0;// 
a=0;// .field private static final IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
a=0;// 
a=0;// .field private static final SETTING_ENABLED_NOTIFICATION_LISTENERS:Ljava/lang/String; = "enabled_notification_listeners"
a=0;// 
a=0;// .field private static final SIDE_CHANNEL_BIND_FLAGS:I
a=0;// 
a=0;// .field private static final SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS:I = 0x3e8
a=0;// 
a=0;// .field private static final SIDE_CHANNEL_RETRY_MAX_COUNT:I = 0x6
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "NotifManCompat"
a=0;// 
a=0;// .field private static sEnabledNotificationListenerPackages:Ljava/util/Set;
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
a=0;// .field private static sEnabledNotificationListeners:Ljava/lang/String;
a=0;// 
a=0;// .field private static final sEnabledNotificationListenersLock:Ljava/lang/Object;
a=0;// 
a=0;// .field private static final sLock:Ljava/lang/Object;
a=0;// 
a=0;// .field private static sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private final mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenersLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 86
a=0;//     new-instance v0, Ljava/util/HashSet;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/HashSet;);
a=0;//     invoke-direct {v0}, Ljava/util/HashSet;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashSet;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenerPackages:Ljava/util/Set;
a=0;// 
a=0;//     .line 91
a=0;//     new-instance v0, Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Object;);
a=0;//     invoke-direct {v0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sLock:Ljava/lang/Object;
a=0;// 
a=0;//     .line 159
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 160
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$ImplIceCreamSandwich;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat$ImplIceCreamSandwich;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationManagerCompat$ImplIceCreamSandwich;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$ImplIceCreamSandwich;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
a=0;// 
a=0;//     .line 166
a=0;//     :goto_0
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/support/v4/app/NotificationManagerCompat$Impl;->getSideChannelBindFlags()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Landroid/support/v4/app/NotificationManagerCompat;->SIDE_CHANNEL_BIND_FLAGS:I
a=0;// 
a=0;//     .line 167
a=0;//     return-void
a=0;// 
a=0;//     .line 161
a=0;//     :cond_0
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/4 v1, 0x5
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 162
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$ImplEclair;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat$ImplEclair;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationManagerCompat$ImplEclair;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$ImplEclair;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 164
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$ImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat$ImplBase;);
a=0;//     invoke-direct {v0}, Landroid/support/v4/app/NotificationManagerCompat$ImplBase;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$ImplBase;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 101
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationManagerCompat;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "notification"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/NotificationManager;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     .line 104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     sget v0, Landroid/support/v4/app/NotificationManagerCompat;->SIDE_CHANNEL_BIND_FLAGS:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static from(Landroid/content/Context;)Landroid/support/v4/app/NotificationManagerCompat;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationManagerCompat;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/app/NotificationManagerCompat;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getEnabledListenerPackages(Landroid/content/Context;)Ljava/util/Set;
a=0;//     .locals 10
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/Set",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/content/ContentResolver;);
a=0;//     const-string v9, "enabled_notification_listeners"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v8, v9}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 224
a=0;//     .local v4, "enabledNotificationListeners":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     sget-object v8, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListeners:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_2
a=0;// 
a=0;//     .line 226
a=0;//     const-string v8, ":"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 227
a=0;//     .local v3, "components":[Ljava/lang/String;
a=0;//     #v3=(Reference,[Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/util/HashSet;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/util/HashSet;);
a=0;//     array-length v8, v3
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-direct {v7, v8}, Ljava/util/HashSet;-><init>(I)V
a=0;// 
a=0;//     .line 228
a=0;//     .local v7, "packageNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     #v7=(Reference,Ljava/util/HashSet;);
a=0;//     move-object v0, v3
a=0;// 
a=0;//     .local v0, "arr$":[Ljava/lang/String;
a=0;//     #v0=(Reference,[Ljava/lang/String;);
a=0;//     array-length v6, v0
a=0;// 
a=0;//     .local v6, "len$":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i$":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v5=(Integer);v8=(Conflicted);
a=0;//     if-ge v5, v6, :cond_1
a=0;// 
a=0;//     aget-object v1, v0, v5
a=0;// 
a=0;//     .line 229
a=0;//     .local v1, "component":Ljava/lang/String;
a=0;//     #v1=(Null);
a=0;//     invoke-static {v1}, Landroid/content/ComponentName;->unflattenFromString(Ljava/lang/String;)Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 230
a=0;//     .local v2, "componentName":Landroid/content/ComponentName;
a=0;//     #v2=(Reference,Landroid/content/ComponentName;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {v2}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v7, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     #v8=(Conflicted);
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 234
a=0;//     .end local v1    # "component":Ljava/lang/String;
a=0;//     .end local v2    # "componentName":Landroid/content/ComponentName;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     sget-object v9, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenersLock:Ljava/lang/Object;
a=0;// 
a=0;//     monitor-enter v9
a=0;// 
a=0;//     .line 235
a=0;//     :try_start_0
a=0;//     sput-object v7, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenerPackages:Ljava/util/Set;
a=0;// 
a=0;//     .line 236
a=0;//     sput-object v4, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListeners:Ljava/lang/String;
a=0;// 
a=0;//     .line 237
a=0;//     monitor-exit v9
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 239
a=0;//     .end local v0    # "arr$":[Ljava/lang/String;
a=0;//     .end local v3    # "components":[Ljava/lang/String;
a=0;//     .end local v5    # "i$":I
a=0;//     .end local v6    # "len$":I
a=0;//     .end local v7    # "packageNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     sget-object v8, Landroid/support/v4/app/NotificationManagerCompat;->sEnabledNotificationListenerPackages:Ljava/util/Set;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/Set;);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 237
a=0;//     .restart local v0    # "arr$":[Ljava/lang/String;
a=0;//     .restart local v3    # "components":[Ljava/lang/String;
a=0;//     .restart local v5    # "i$":I
a=0;//     .restart local v6    # "len$":I
a=0;//     .restart local v7    # "packageNames":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;"
a=0;//     :catchall_0
a=0;//     #v0=(Reference,[Ljava/lang/String;);v3=(Reference,[Ljava/lang/String;);v5=(Integer);v6=(Integer);v7=(Reference,Ljava/util/HashSet;);v8=(Conflicted);
a=0;//     move-exception v8
a=0;// 
a=0;//     :try_start_1
a=0;//     #v8=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v9
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v8
a=0;// .end method
a=0;// 
a=0;// .method private pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
a=0;//     .locals 3
a=0;//     .param p1, "task"    # Landroid/support/v4/app/NotificationManagerCompat$Task;
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     sget-object v1, Landroid/support/v4/app/NotificationManagerCompat;->sLock:Ljava/lang/Object;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     monitor-enter v1
a=0;// 
a=0;//     .line 255
a=0;//     :try_start_0
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v0, v2}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;);
a=0;//     sput-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
a=0;// 
a=0;//     .line 258
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     monitor-exit v1
a=0;//     :try_end_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 259
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->sSideChannelManager:Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/app/NotificationManagerCompat$SideChannelManager;->queueTask(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
a=0;// 
a=0;//     .line 260
a=0;//     return-void
a=0;// 
a=0;//     .line 258
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     monitor-exit v1
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static useSideChannelForNotification(Landroid/app/Notification;)Z
a=0;//     .locals 2
a=0;//     .param p0, "notification"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     invoke-static {p0}, Landroid/support/v4/app/NotificationCompat;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 247
a=0;//     .local v0, "extras":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "android.support.useSideChannel"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cancel(I)V
a=0;//     .locals 1
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0, p1}, Landroid/support/v4/app/NotificationManagerCompat;->cancel(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 175
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public cancel(Ljava/lang/String;I)V
a=0;//     .locals 2
a=0;//     .param p1, "tag"    # Ljava/lang/String;
a=0;//     .param p2, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$Impl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-interface {v0, v1, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat$Impl;->cancelNotification(Landroid/app/NotificationManager;Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 184
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat$CancelTask;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1, p2, p1}, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;-><init>(Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$CancelTask;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat;->pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
a=0;// 
a=0;//     .line 185
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public cancelAll()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-virtual {v0}, Landroid/app/NotificationManager;->cancelAll()V
a=0;// 
a=0;//     .line 190
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat$CancelTask;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$CancelTask;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat;->pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
a=0;// 
a=0;//     .line 191
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public notify(ILandroid/app/Notification;)V
a=0;//     .locals 1
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "notification"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0, p1, p2}, Landroid/support/v4/app/NotificationManagerCompat;->notify(Ljava/lang/String;ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 200
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public notify(Ljava/lang/String;ILandroid/app/Notification;)V
a=0;//     .locals 2
a=0;//     .param p1, "tag"    # Ljava/lang/String;
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "notification"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     invoke-static {p3}, Landroid/support/v4/app/NotificationManagerCompat;->useSideChannelForNotification(Landroid/app/Notification;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v0, v1, p2, p1, p3}, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;-><init>(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v4/app/NotificationManagerCompat;->pushSideChannelQueue(Landroid/support/v4/app/NotificationManagerCompat$Task;)V
a=0;// 
a=0;//     .line 214
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 212
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationManagerCompat;->IMPL:Landroid/support/v4/app/NotificationManagerCompat$Impl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$Impl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationManagerCompat;->mNotificationManager:Landroid/app/NotificationManager;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/NotificationManager;);
a=0;//     invoke-interface {v0, v1, p1, p2, p3}, Landroid/support/v4/app/NotificationManagerCompat$Impl;->postNotification(Landroid/app/NotificationManager;Ljava/lang/String;ILandroid/app/Notification;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
