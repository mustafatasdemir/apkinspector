package android.support.v4.app; class NotificationCompatJellybean$Builder {/*

.class public Landroid/support/v4/app/NotificationCompatJellybean$Builder;
.super Ljava/lang/Object;
.source "NotificationCompatJellybean.java"

# interfaces
.implements Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;
.implements Landroid/support/v4/app/NotificationBuilderWithActions;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompatJellybean;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private b:Landroid/app/Notification$Builder;

.field private mActionExtrasList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Landroid/os/Bundle;",
            ">;"
        }
    .end annotation
.end field

.field private final mExtras:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZZILjava/lang/CharSequence;ZLandroid/os/Bundle;Ljava/lang/String;ZLjava/lang/String;)V
    .locals 7
    .parameter "context"
    .parameter "n"
    .parameter "contentTitle"
    .parameter "contentText"
    .parameter "contentInfo"
    .parameter "tickerView"
    .parameter "number"
    .parameter "contentIntent"
    .parameter "fullScreenIntent"
    .parameter "largeIcon"
    .parameter "mProgressMax"
    .parameter "mProgress"
    .parameter "mProgressIndeterminate"
    .parameter "useChronometer"
    .parameter "priority"
    .parameter "subText"
    .parameter "localOnly"
    .parameter "extras"
    .parameter "groupKey"
    .parameter "groupSummary"
    .parameter "sortKey"

    .prologue
    .line 76
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 68
    #p0=(Reference);
    new-instance v3, Ljava/util/ArrayList;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mActionExtrasList:Ljava/util/List;

    .line 77
    new-instance v3, Landroid/app/Notification$Builder;

    #v3=(UninitRef);
    invoke-direct {v3, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    #v3=(Reference);
    iget-wide v4, p2, Landroid/app/Notification;->when:J

    #v4=(LongLo);v5=(LongHi);
    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, p2, Landroid/app/Notification;->icon:I

    #v4=(Integer);
    iget v5, p2, Landroid/app/Notification;->iconLevel:I

    #v5=(Integer);
    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    invoke-virtual {v3, v4, p6}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p2, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget v5, p2, Landroid/app/Notification;->audioStreamType:I

    invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p2, Landroid/app/Notification;->vibrate:[J

    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v3

    iget v4, p2, Landroid/app/Notification;->ledARGB:I

    #v4=(Integer);
    iget v5, p2, Landroid/app/Notification;->ledOnMS:I

    iget v6, p2, Landroid/app/Notification;->ledOffMS:I

    #v6=(Integer);
    invoke-virtual {v3, v4, v5, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v4

    #v4=(Reference);
    iget v3, p2, Landroid/app/Notification;->flags:I

    #v3=(Integer);
    and-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    :goto_0
    #v3=(Boolean);
    invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v3, p2, Landroid/app/Notification;->flags:I

    #v3=(Integer);
    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_5

    const/4 v3, 0x1

    :goto_1
    #v3=(Boolean);
    invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v3, p2, Landroid/app/Notification;->flags:I

    #v3=(Integer);
    and-int/lit8 v3, v3, 0x10

    if-eqz v3, :cond_6

    const/4 v3, 0x1

    :goto_2
    #v3=(Boolean);
    invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    #v3=(Reference);
    iget v4, p2, Landroid/app/Notification;->defaults:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, p3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, p4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    move-object/from16 v0, p16

    #v0=(Reference);
    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, p5}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, p8}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v3

    iget-object v4, p2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v3, p2, Landroid/app/Notification;->flags:I

    #v3=(Integer);
    and-int/lit16 v3, v3, 0x80

    if-eqz v3, :cond_7

    const/4 v3, 0x1

    :goto_3
    #v3=(Boolean);
    move-object/from16 v0, p9

    invoke-virtual {v4, v0, v3}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v3

    #v3=(Reference);
    move-object/from16 v0, p10

    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v3

    invoke-virtual {v3, p7}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v3

    move/from16 v0, p14

    #v0=(Boolean);
    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    move/from16 v0, p15

    #v0=(Integer);
    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;

    move-result-object v3

    move/from16 v0, p11

    move/from16 v1, p12

    #v1=(Integer);
    move/from16 v2, p13

    #v2=(Boolean);
    invoke-virtual {v3, v0, v1, v2}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    move-result-object v3

    iput-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;

    .line 102
    new-instance v3, Landroid/os/Bundle;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;

    .line 103
    if-eqz p18, :cond_0

    .line 104
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;

    move-object/from16 v0, p18

    #v0=(Reference);
    invoke-virtual {v3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 106
    :cond_0
    #v0=(Conflicted);
    if-eqz p17, :cond_1

    .line 107
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;

    const-string v4, "android.support.localOnly"

    const/4 v5, 0x1

    #v5=(One);
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 109
    :cond_1
    #v5=(Integer);
    if-eqz p19, :cond_2

    .line 110
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;

    const-string v4, "android.support.groupKey"

    move-object/from16 v0, p19

    #v0=(Reference);
    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    if-eqz p20, :cond_8

    .line 112
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;

    const-string v4, "android.support.isGroupSummary"

    const/4 v5, 0x1

    #v5=(One);
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 117
    :cond_2
    :goto_4
    #v0=(Conflicted);v5=(Integer);
    if-eqz p21, :cond_3

    .line 118
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;

    const-string v4, "android.support.sortKey"

    move-object/from16 v0, p21

    #v0=(Reference);
    invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 120
    :cond_3
    #v0=(Conflicted);
    return-void

    .line 77
    :cond_4
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    goto/16 :goto_0

    :cond_5
    #v3=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    goto/16 :goto_1

    :cond_6
    #v3=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    goto/16 :goto_2

    :cond_7
    #v0=(Reference);v3=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_3

    .line 114
    :cond_8
    #v1=(Integer);v2=(Boolean);v3=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;

    const-string v4, "android.support.useSideChannel"

    const/4 v5, 0x1

    #v5=(One);
    invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    goto :goto_4
.end method


# virtual methods
.method public addAction(Landroid/support/v4/app/NotificationCompatBase$Action;)V
    .locals 2
    .parameter "action"

    .prologue
    .line 124
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mActionExtrasList:Ljava/util/List;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;

    #v1=(Reference);
    invoke-static {v1, p1}, Landroid/support/v4/app/NotificationCompatJellybean;->writeActionAndGetExtras(Landroid/app/Notification$Builder;Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 125
    return-void
.end method

.method public build()Landroid/app/Notification;
    .locals 8

    .prologue
    .line 133
    iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v5

    .line 136
    .local v5, notif:Landroid/app/Notification;
    #v5=(Reference);
    invoke-static {v5}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v1

    .line 137
    .local v1, extras:Landroid/os/Bundle;
    #v1=(Reference);
    new-instance v4, Landroid/os/Bundle;

    #v4=(UninitRef);
    iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;

    invoke-direct {v4, v6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 138
    .local v4, mergeBundle:Landroid/os/Bundle;
    #v4=(Reference);
    iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;

    invoke-virtual {v6}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, i$:Ljava/util/Iterator;
    :cond_0
    :goto_0
    #v2=(Reference);v3=(Conflicted);v6=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/lang/String;

    .line 139
    .local v3, key:Ljava/lang/String;
    invoke-virtual {v1, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    .line 140
    invoke-virtual {v4, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    goto :goto_0

    .line 143
    .end local v3           #key:Ljava/lang/String;
    :cond_1
    #v3=(Conflicted);
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 144
    iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mActionExtrasList:Ljava/util/List;

    #v6=(Reference);
    invoke-static {v6}, Landroid/support/v4/app/NotificationCompatJellybean;->buildActionExtrasMap(Ljava/util/List;)Landroid/util/SparseArray;

    move-result-object v0

    .line 145
    .local v0, actionExtrasMap:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 147
    invoke-static {v5}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v6

    const-string v7, "android.support.actionExtras"

    #v7=(Reference);
    invoke-virtual {v6, v7, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 149
    :cond_2
    #v7=(Conflicted);
    return-object v5
.end method

.method public getBuilder()Landroid/app/Notification$Builder;
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;

    #v0=(Reference);
    return-object v0
.end method

*/}