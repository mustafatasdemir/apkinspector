package android.support.v4.app; class NotificationCompatJellybean {/*

.class Landroid/support/v4/app/NotificationCompatJellybean;
.super Ljava/lang/Object;
.source "NotificationCompatJellybean.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/NotificationCompatJellybean$Builder;
    }
.end annotation


# static fields
.field static final EXTRA_ACTION_EXTRAS:Ljava/lang/String; = "android.support.actionExtras"

.field static final EXTRA_GROUP_KEY:Ljava/lang/String; = "android.support.groupKey"

.field static final EXTRA_GROUP_SUMMARY:Ljava/lang/String; = "android.support.isGroupSummary"

.field static final EXTRA_LOCAL_ONLY:Ljava/lang/String; = "android.support.localOnly"

.field static final EXTRA_REMOTE_INPUTS:Ljava/lang/String; = "android.support.remoteInputs"

.field static final EXTRA_SORT_KEY:Ljava/lang/String; = "android.support.sortKey"

.field static final EXTRA_USE_SIDE_CHANNEL:Ljava/lang/String; = "android.support.useSideChannel"

.field private static final KEY_ACTION_INTENT:Ljava/lang/String; = "actionIntent"

.field private static final KEY_EXTRAS:Ljava/lang/String; = "extras"

.field private static final KEY_ICON:Ljava/lang/String; = "icon"

.field private static final KEY_REMOTE_INPUTS:Ljava/lang/String; = "remoteInputs"

.field private static final KEY_TITLE:Ljava/lang/String; = "title"

.field public static final TAG:Ljava/lang/String; = "NotificationCompat"

.field private static sActionClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private static sActionIconField:Ljava/lang/reflect/Field;

.field private static sActionIntentField:Ljava/lang/reflect/Field;

.field private static sActionTitleField:Ljava/lang/reflect/Field;

.field private static sActionsAccessFailed:Z

.field private static sActionsField:Ljava/lang/reflect/Field;

.field private static final sActionsLock:Ljava/lang/Object;

.field private static sExtrasField:Ljava/lang/reflect/Field;

.field private static sExtrasFieldAccessFailed:Z

.field private static final sExtrasLock:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 52
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasLock:Ljava/lang/Object;

    .line 56
    new-instance v0, Ljava/lang/Object;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    #p0=(Reference);
    return-void
.end method

.method public static addBigPictureStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Z)V
    .locals 3
    .parameter "b"
    .parameter "bigContentTitle"
    .parameter "useSummary"
    .parameter "summaryText"
    .parameter "bigPicture"
    .parameter "bigLargeIcon"
    .parameter "bigLargeIconSet"

    .prologue
    .line 168
    new-instance v1, Landroid/app/Notification$BigPictureStyle;

    #v1=(UninitRef);
    invoke-interface {p0}, Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/app/Notification$BigPictureStyle;-><init>(Landroid/app/Notification$Builder;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/app/Notification$BigPictureStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v1

    invoke-virtual {v1, p4}, Landroid/app/Notification$BigPictureStyle;->bigPicture(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    move-result-object v0

    .line 171
    .local v0, style:Landroid/app/Notification$BigPictureStyle;
    #v0=(Reference);
    if-eqz p6, :cond_0

    .line 172
    invoke-virtual {v0, p5}, Landroid/app/Notification$BigPictureStyle;->bigLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$BigPictureStyle;

    .line 174
    :cond_0
    if-eqz p2, :cond_1

    .line 175
    invoke-virtual {v0, p3}, Landroid/app/Notification$BigPictureStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigPictureStyle;

    .line 177
    :cond_1
    return-void
.end method

.method public static addBigTextStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 3
    .parameter "b"
    .parameter "bigContentTitle"
    .parameter "useSummary"
    .parameter "summaryText"
    .parameter "bigText"

    .prologue
    .line 156
    new-instance v1, Landroid/app/Notification$BigTextStyle;

    #v1=(UninitRef);
    invoke-interface {p0}, Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;

    move-result-object v2

    #v2=(Reference);
    invoke-direct {v1, v2}, Landroid/app/Notification$BigTextStyle;-><init>(Landroid/app/Notification$Builder;)V

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/app/Notification$BigTextStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object v1

    invoke-virtual {v1, p4}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    move-result-object v0

    .line 159
    .local v0, style:Landroid/app/Notification$BigTextStyle;
    #v0=(Reference);
    if-eqz p2, :cond_0

    .line 160
    invoke-virtual {v0, p3}, Landroid/app/Notification$BigTextStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    .line 162
    :cond_0
    return-void
.end method

.method public static addInboxStyle(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Ljava/lang/CharSequence;ZLjava/lang/CharSequence;Ljava/util/ArrayList;)V
    .locals 5
    .parameter "b"
    .parameter "bigContentTitle"
    .parameter "useSummary"
    .parameter "summaryText"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;",
            "Ljava/lang/CharSequence;",
            "Z",
            "Ljava/lang/CharSequence;",
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/CharSequence;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 182
    .local p4, texts:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Ljava/lang/CharSequence;>;"
    new-instance v3, Landroid/app/Notification$InboxStyle;

    #v3=(UninitRef);
    invoke-interface {p0}, Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;->getBuilder()Landroid/app/Notification$Builder;

    move-result-object v4

    #v4=(Reference);
    invoke-direct {v3, v4}, Landroid/app/Notification$InboxStyle;-><init>(Landroid/app/Notification$Builder;)V

    #v3=(Reference);
    invoke-virtual {v3, p1}, Landroid/app/Notification$InboxStyle;->setBigContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;

    move-result-object v1

    .line 184
    .local v1, style:Landroid/app/Notification$InboxStyle;
    #v1=(Reference);
    if-eqz p2, :cond_0

    .line 185
    invoke-virtual {v1, p3}, Landroid/app/Notification$InboxStyle;->setSummaryText(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;

    .line 187
    :cond_0
    invoke-virtual {p4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, i$:Ljava/util/Iterator;
    :goto_0
    #v0=(Reference);v2=(Conflicted);v3=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/CharSequence;

    .line 188
    .local v2, text:Ljava/lang/CharSequence;
    invoke-virtual {v1, v2}, Landroid/app/Notification$InboxStyle;->addLine(Ljava/lang/CharSequence;)Landroid/app/Notification$InboxStyle;

    goto :goto_0

    .line 190
    .end local v2           #text:Ljava/lang/CharSequence;
    :cond_1
    #v2=(Conflicted);
    return-void
.end method

.method public static buildActionExtrasMap(Ljava/util/List;)Landroid/util/SparseArray;
    .locals 4
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/os/Bundle;",
            ">;)",
            "Landroid/util/SparseArray",
            "<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation

    .prologue
    .line 194
    .local p0, actionExtrasList:Ljava/util/List;,"Ljava/util/List<Landroid/os/Bundle;>;"
    const/4 v1, 0x0

    .line 195
    .local v1, actionExtrasMap:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    #v1=(Null);
    const/4 v3, 0x0

    .local v3, i:I
    #v3=(Null);
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    .local v2, count:I
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Integer);v3=(Integer);
    if-ge v3, v2, :cond_2

    .line 196
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/os/Bundle;

    .line 197
    .local v0, actionExtras:Landroid/os/Bundle;
    if-eqz v0, :cond_1

    .line 198
    if-nez v1, :cond_0

    .line 199
    new-instance v1, Landroid/util/SparseArray;

    .end local v1           #actionExtrasMap:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 201
    .restart local v1       #actionExtrasMap:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    :cond_0
    #v1=(Reference);
    invoke-virtual {v1, v3, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 195
    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 204
    .end local v0           #actionExtras:Landroid/os/Bundle;
    :cond_2
    #v0=(Conflicted);
    return-object v1
.end method

.method private static ensureActionReflectionReadyLocked()Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x1

    .line 318
    #v1=(One);
    sget-boolean v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 337
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Boolean);v4=(Conflicted);
    return v2

    .line 322
    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(One);v2=(Null);v4=(Uninit);
    sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;

    #v3=(Reference);
    if-nez v3, :cond_1

    .line 323
    const-string v3, "android.app.Notification$Action"

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;

    .line 324
    sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;

    const-string v4, "icon"

    #v4=(Reference);
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIconField:Ljava/lang/reflect/Field;

    .line 325
    sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;

    const-string v4, "title"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionTitleField:Ljava/lang/reflect/Field;

    .line 326
    sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionClass:Ljava/lang/Class;

    const-string v4, "actionIntent"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIntentField:Ljava/lang/reflect/Field;

    .line 327
    const-class v3, Landroid/app/Notification;

    const-string v4, "actions"

    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v3

    sput-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;

    .line 328
    sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;

    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Field;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1

    .line 337
    :cond_1
    :goto_1
    #v0=(Conflicted);v4=(Conflicted);
    sget-boolean v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z

    #v3=(Boolean);
    if-nez v3, :cond_2

    :goto_2
    #v1=(Boolean);
    move v2, v1

    #v2=(Boolean);
    goto :goto_0

    .line 330
    :catch_0
    #v0=(Uninit);v1=(One);v2=(Null);v3=(Conflicted);
    move-exception v0

    .line 331
    .local v0, e:Ljava/lang/ClassNotFoundException;
    #v0=(Reference);
    const-string v3, "NotificationCompat"

    #v3=(Reference);
    const-string v4, "Unable to access notification actions"

    #v4=(Reference);
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 332
    sput-boolean v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z

    goto :goto_1

    .line 333
    .end local v0           #e:Ljava/lang/ClassNotFoundException;
    :catch_1
    #v0=(Uninit);v3=(Conflicted);v4=(Conflicted);
    move-exception v0

    .line 334
    .local v0, e:Ljava/lang/NoSuchFieldException;
    #v0=(Reference);
    const-string v3, "NotificationCompat"

    #v3=(Reference);
    const-string v4, "Unable to access notification actions"

    #v4=(Reference);
    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 335
    sput-boolean v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z

    goto :goto_1

    .end local v0           #e:Ljava/lang/NoSuchFieldException;
    :cond_2
    #v0=(Conflicted);v3=(Boolean);v4=(Conflicted);
    move v1, v2

    .line 337
    #v1=(Null);
    goto :goto_2
.end method

.method public static getAction(Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 11
    .parameter "notif"
    .parameter "actionIndex"
    .parameter "factory"
    .parameter "remoteInputFactory"

    .prologue
    .line 277
    sget-object v10, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;

    #v10=(Reference);
    monitor-enter v10

    .line 279
    :try_start_0
    invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionObjectsLocked(Landroid/app/Notification;)[Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    aget-object v7, v0, p1

    .line 280
    .local v7, actionObject:Ljava/lang/Object;
    #v7=(Null);
    const/4 v5, 0x0

    .line 281
    .local v5, actionExtras:Landroid/os/Bundle;
    #v5=(Null);
    invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v9

    .line 282
    .local v9, extras:Landroid/os/Bundle;
    #v9=(Reference);
    if-eqz v9, :cond_0

    .line 283
    const-string v0, "android.support.actionExtras"

    invoke-virtual {v9, v0}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v6

    .line 285
    .local v6, actionExtrasMap:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    #v6=(Reference);
    if-eqz v6, :cond_0

    .line 286
    invoke-virtual {v6, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .end local v5           #actionExtras:Landroid/os/Bundle;
    #v5=(Reference);
    check-cast v5, Landroid/os/Bundle;

    .line 289
    .end local v6           #actionExtrasMap:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    .restart local v5       #actionExtras:Landroid/os/Bundle;
    :cond_0
    #v6=(Conflicted);
    sget-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIconField:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    move-result v2

    #v2=(Integer);
    sget-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionTitleField:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/lang/CharSequence;

    sget-object v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionIntentField:Ljava/lang/reflect/Field;

    invoke-virtual {v0, v7}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/app/PendingIntent;

    move-object v0, p2

    move-object v1, p3

    #v1=(Reference);
    invoke-static/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatJellybean;->readAction(Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompatBase$Action;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    :try_start_1
    monitor-exit v10

    .line 299
    .end local v5           #actionExtras:Landroid/os/Bundle;
    .end local v7           #actionObject:Ljava/lang/Object;
    .end local v9           #extras:Landroid/os/Bundle;
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v0

    .line 294
    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v8=(Uninit);
    move-exception v8

    .line 295
    .local v8, e:Ljava/lang/IllegalAccessException;
    #v8=(Reference);
    const-string v0, "NotificationCompat"

    #v0=(Reference);
    const-string v1, "Unable to access notification actions"

    #v1=(Reference);
    invoke-static {v0, v1, v8}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 296
    const/4 v0, 0x1

    #v0=(One);
    sput-boolean v0, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z

    .line 298
    monitor-exit v10

    .line 299
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0

    .line 298
    .end local v8           #e:Ljava/lang/IllegalAccessException;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v8=(Conflicted);
    move-exception v0

    #v0=(Reference);
    monitor-exit v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public static getActionCount(Landroid/app/Notification;)I
    .locals 3
    .parameter "notif"

    .prologue
    .line 268
    sget-object v2, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;

    #v2=(Reference);
    monitor-enter v2

    .line 269
    :try_start_0
    invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionObjectsLocked(Landroid/app/Notification;)[Ljava/lang/Object;

    move-result-object v0

    .line 270
    .local v0, actionObjects:[Ljava/lang/Object;
    #v0=(Reference);
    if-eqz v0, :cond_0

    array-length v1, v0

    :goto_0
    #v1=(Integer);
    monitor-exit v2

    return v1

    :cond_0
    #v1=(Uninit);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0

    .line 271
    .end local v0           #actionObjects:[Ljava/lang/Object;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);
    move-exception v1

    #v1=(Reference);
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private static getActionFromBundle(Landroid/os/Bundle;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 6
    .parameter "bundle"
    .parameter "actionFactory"
    .parameter "remoteInputFactory"

    .prologue
    .line 358
    const-string v0, "icon"

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    const-string v0, "title"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getCharSequence(Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object v2

    #v2=(Reference);
    const-string v0, "actionIntent"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/app/PendingIntent;

    const-string v0, "extras"

    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    #v4=(Reference);
    const-string v0, "remoteInputs"

    invoke-static {p0, v0}, Landroid/support/v4/app/BundleUtil;->getBundleArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0, p2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->fromBundleArray([Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v5

    #v5=(Reference);
    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v0

    return-object v0
.end method

.method private static getActionObjectsLocked(Landroid/app/Notification;)[Ljava/lang/Object;
    .locals 5
    .parameter "notif"

    .prologue
    const/4 v2, 0x0

    .line 303
    #v2=(Null);
    sget-object v3, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsLock:Ljava/lang/Object;

    #v3=(Reference);
    monitor-enter v3

    .line 304
    :try_start_0
    invoke-static {}, Landroid/support/v4/app/NotificationCompatJellybean;->ensureActionReflectionReadyLocked()Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 305
    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v2

    .line 312
    :goto_0
    #v0=(Conflicted);v1=(Reference);v4=(Conflicted);
    return-object v1

    .line 308
    :cond_0
    :try_start_1
    #v0=(Uninit);v1=(Boolean);v4=(Uninit);
    sget-object v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsField:Ljava/lang/reflect/Field;

    #v1=(Reference);
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    check-cast v1, [Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    monitor-exit v3

    goto :goto_0

    .line 314
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);
    move-exception v1

    #v1=(Reference);
    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v1

    .line 309
    :catch_0
    #v0=(Uninit);v1=(Conflicted);v4=(Uninit);
    move-exception v0

    .line 310
    .local v0, e:Ljava/lang/IllegalAccessException;
    :try_start_3
    #v0=(Reference);
    const-string v1, "NotificationCompat"

    #v1=(Reference);
    const-string v4, "Unable to access notification actions"

    #v4=(Reference);
    invoke-static {v1, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 311
    const/4 v1, 0x1

    #v1=(One);
    sput-boolean v1, Landroid/support/v4/app/NotificationCompatJellybean;->sActionsAccessFailed:Z

    .line 312
    monitor-exit v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v1, v2

    #v1=(Null);
    goto :goto_0
.end method

.method public static getActionsFromParcelableArrayList(Ljava/util/ArrayList;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 3
    .parameter
    .parameter "actionFactory"
    .parameter "remoteInputFactory"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/os/Parcelable;",
            ">;",
            "Landroid/support/v4/app/NotificationCompatBase$Action$Factory;",
            "Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;",
            ")[",
            "Landroid/support/v4/app/NotificationCompatBase$Action;"
        }
    .end annotation

    .prologue
    .line 344
    .local p0, parcelables:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
    if-nez p0, :cond_1

    .line 345
    const/4 v0, 0x0

    .line 352
    :cond_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    .line 347
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    invoke-interface {p1, v2}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->newArray(I)[Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v0

    .line 348
    .local v0, actions:[Landroid/support/v4/app/NotificationCompatBase$Action;
    #v0=(Reference);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);
    array-length v2, v0

    #v2=(Integer);
    if-ge v1, v2, :cond_0

    .line 349
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/os/Bundle;

    invoke-static {v2, p1, p2}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionFromBundle(Landroid/os/Bundle;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v2

    aput-object v2, v0, v1

    .line 348
    add-int/lit8 v1, v1, 0x1

    goto :goto_0
.end method

.method private static getBundleForAction(Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;
    .locals 3
    .parameter "action"

    .prologue
    .line 381
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 382
    .local v0, bundle:Landroid/os/Bundle;
    #v0=(Reference);
    const-string v1, "icon"

    #v1=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getIcon()I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 383
    const-string v1, "title"

    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putCharSequence(Ljava/lang/String;Ljava/lang/CharSequence;)V

    .line 384
    const-string v1, "actionIntent"

    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getActionIntent()Landroid/app/PendingIntent;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 385
    const-string v1, "extras"

    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 386
    const-string v1, "remoteInputs"

    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->toBundleArray([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 388
    return-object v0
.end method

.method public static getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    .locals 7
    .parameter "notif"

    .prologue
    const/4 v3, 0x0

    .line 212
    #v3=(Null);
    sget-object v4, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasLock:Ljava/lang/Object;

    #v4=(Reference);
    monitor-enter v4

    .line 213
    :try_start_0
    sget-boolean v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasFieldAccessFailed:Z

    #v5=(Boolean);
    if-eqz v5, :cond_0

    .line 214
    monitor-exit v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v3

    .line 239
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-object v1

    .line 217
    :cond_0
    :try_start_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v5=(Boolean);v6=(Uninit);
    sget-object v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;

    #v5=(Reference);
    if-nez v5, :cond_2

    .line 218
    const-class v5, Landroid/app/Notification;

    const-string v6, "extras"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v2

    .line 219
    .local v2, extrasField:Ljava/lang/reflect/Field;
    #v2=(Reference);
    const-class v5, Landroid/os/Bundle;

    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v5

    #v5=(Boolean);
    if-nez v5, :cond_1

    .line 220
    const-string v5, "NotificationCompat"

    #v5=(Reference);
    const-string v6, "Notification.extras field is not of type Bundle"

    invoke-static {v5, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 221
    const/4 v5, 0x1

    #v5=(One);
    sput-boolean v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasFieldAccessFailed:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_1 .. :try_end_1} :catch_1

    .line 222
    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v1, v3

    #v1=(Null);
    goto :goto_0

    .line 224
    :cond_1
    #v1=(Uninit);v5=(Boolean);
    const/4 v5, 0x1

    :try_start_3
    #v5=(One);
    invoke-virtual {v2, v5}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 225
    sput-object v2, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;

    .line 227
    .end local v2           #extrasField:Ljava/lang/reflect/Field;
    :cond_2
    #v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    sget-object v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;

    #v5=(Reference);
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/os/Bundle;

    .line 228
    .local v1, extras:Landroid/os/Bundle;
    if-nez v1, :cond_3

    .line 229
    new-instance v1, Landroid/os/Bundle;

    .end local v1           #extras:Landroid/os/Bundle;
    #v1=(UninitRef);
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 230
    .restart local v1       #extras:Landroid/os/Bundle;
    #v1=(Reference);
    sget-object v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasField:Ljava/lang/reflect/Field;

    invoke-virtual {v5, p0, v1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_3 .. :try_end_3} :catch_1

    .line 232
    :cond_3
    :try_start_4
    monitor-exit v4

    goto :goto_0

    .line 240
    .end local v1           #extras:Landroid/os/Bundle;
    :catchall_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Reference);v5=(Conflicted);
    move-exception v3

    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v3

    .line 233
    :catch_0
    #v0=(Uninit);v3=(Null);
    move-exception v0

    .line 234
    .local v0, e:Ljava/lang/IllegalAccessException;
    :try_start_5
    #v0=(Reference);
    const-string v5, "NotificationCompat"

    #v5=(Reference);
    const-string v6, "Unable to access notification extras"

    #v6=(Reference);
    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 238
    .end local v0           #e:Ljava/lang/IllegalAccessException;
    :goto_1
    const/4 v5, 0x1

    #v5=(One);
    sput-boolean v5, Landroid/support/v4/app/NotificationCompatJellybean;->sExtrasFieldAccessFailed:Z

    .line 239
    monitor-exit v4

    move-object v1, v3

    #v1=(Null);
    goto :goto_0

    .line 235
    :catch_1
    #v0=(Uninit);v1=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    move-exception v0

    .line 236
    .local v0, e:Ljava/lang/NoSuchFieldException;
    #v0=(Reference);
    const-string v5, "NotificationCompat"

    #v5=(Reference);
    const-string v6, "Unable to access notification extras"

    #v6=(Reference);
    invoke-static {v5, v6, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_1
.end method

.method public static getGroup(Landroid/app/Notification;)Ljava/lang/String;
    .locals 2
    .parameter "n"

    .prologue
    .line 396
    invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "android.support.groupKey"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getLocalOnly(Landroid/app/Notification;)Z
    .locals 2
    .parameter "notif"

    .prologue
    .line 392
    invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "android.support.localOnly"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompatBase$Action;)Ljava/util/ArrayList;
    .locals 6
    .parameter "actions"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/support/v4/app/NotificationCompatBase$Action;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 370
    if-nez p0, :cond_1

    .line 371
    const/4 v4, 0x0

    .line 377
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference);v5=(Conflicted);
    return-object v4

    .line 373
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    array-length v5, p0

    #v5=(Integer);
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 374
    .local v4, parcelables:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
    #v4=(Reference);
    move-object v1, p0

    .local v1, arr$:[Landroid/support/v4/app/NotificationCompatBase$Action;
    #v1=(Reference);
    array-length v3, v1

    .local v3, len$:I
    #v3=(Integer);
    const/4 v2, 0x0

    .local v2, i$:I
    :goto_0
    #v0=(Conflicted);v2=(Integer);v5=(Conflicted);
    if-ge v2, v3, :cond_0

    aget-object v0, v1, v2

    .line 375
    .local v0, action:Landroid/support/v4/app/NotificationCompatBase$Action;
    #v0=(Null);
    invoke-static {v0}, Landroid/support/v4/app/NotificationCompatJellybean;->getBundleForAction(Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 374
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public static getSortKey(Landroid/app/Notification;)Ljava/lang/String;
    .locals 2
    .parameter "n"

    .prologue
    .line 404
    invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "android.support.sortKey"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static isGroupSummary(Landroid/app/Notification;)Z
    .locals 2
    .parameter "n"

    .prologue
    .line 400
    invoke-static {p0}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    const-string v1, "android.support.isGroupSummary"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static readAction(Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 6
    .parameter "factory"
    .parameter "remoteInputFactory"
    .parameter "icon"
    .parameter "title"
    .parameter "actionIntent"
    .parameter "extras"

    .prologue
    .line 247
    const/4 v5, 0x0

    .line 248
    .local v5, remoteInputs:[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    #v5=(Null);
    if-eqz p5, :cond_0

    .line 249
    const-string v0, "android.support.remoteInputs"

    #v0=(Reference);
    invoke-static {p5, v0}, Landroid/support/v4/app/BundleUtil;->getBundleArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0, p1}, Landroid/support/v4/app/RemoteInputCompatJellybean;->fromBundleArray([Landroid/os/Bundle;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v5

    :cond_0
    #v0=(Conflicted);v5=(Reference);
    move-object v0, p0

    #v0=(Reference);
    move v1, p2

    #v1=(Integer);
    move-object v2, p3

    #v2=(Reference);
    move-object v3, p4

    #v3=(Reference);
    move-object v4, p5

    .line 253
    #v4=(Reference);
    invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v0

    return-object v0
.end method

.method public static writeActionAndGetExtras(Landroid/app/Notification$Builder;Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;
    .locals 4
    .parameter "builder"
    .parameter "action"

    .prologue
    .line 258
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getIcon()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getTitle()Ljava/lang/CharSequence;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getActionIntent()Landroid/app/PendingIntent;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {p0, v1, v2, v3}, Landroid/app/Notification$Builder;->addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 259
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 260
    .local v0, actionExtras:Landroid/os/Bundle;
    #v0=(Reference);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 261
    const-string v1, "android.support.remoteInputs"

    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v2

    invoke-static {v2}, Landroid/support/v4/app/RemoteInputCompatJellybean;->toBundleArray([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 264
    :cond_0
    return-object v0
.end method

*/}
