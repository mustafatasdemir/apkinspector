package android.support.v4.app; class NotificationCompatApi20$Builder {/*

.class public Landroid/support/v4/app/NotificationCompatApi20$Builder;
.super Ljava/lang/Object;
.source "NotificationCompatApi20.java"

# interfaces
.implements Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;
.implements Landroid/support/v4/app/NotificationBuilderWithActions;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompatApi20;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private b:Landroid/app/Notification$Builder;


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
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    #p0=(Reference);
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

    if-eqz v3, :cond_0

    const/4 v3, 0x1

    :goto_0
    #v3=(Boolean);
    invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v3, p2, Landroid/app/Notification;->flags:I

    #v3=(Integer);
    and-int/lit8 v3, v3, 0x8

    if-eqz v3, :cond_1

    const/4 v3, 0x1

    :goto_1
    #v3=(Boolean);
    invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v3, p2, Landroid/app/Notification;->flags:I

    #v3=(Integer);
    and-int/lit8 v3, v3, 0x10

    if-eqz v3, :cond_2

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

    if-eqz v3, :cond_3

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

    move/from16 v0, p17

    #v0=(Boolean);
    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setLocalOnly(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    move-object/from16 v0, p18

    #v0=(Reference);
    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setExtras(Landroid/os/Bundle;)Landroid/app/Notification$Builder;

    move-result-object v3

    move-object/from16 v0, p19

    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setGroup(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v3

    move/from16 v0, p20

    #v0=(Boolean);
    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setGroupSummary(Z)Landroid/app/Notification$Builder;

    move-result-object v3

    move-object/from16 v0, p21

    #v0=(Reference);
    invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setSortKey(Ljava/lang/String;)Landroid/app/Notification$Builder;

    move-result-object v3

    iput-object v3, p0, Landroid/support/v4/app/NotificationCompatApi20$Builder;->b:Landroid/app/Notification$Builder;

    .line 72
    return-void

    .line 42
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    goto/16 :goto_0

    :cond_1
    #v3=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    goto/16 :goto_1

    :cond_2
    #v3=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_2

    :cond_3
    #v0=(Reference);v3=(Integer);
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_3
.end method


# virtual methods
.method public addAction(Landroid/support/v4/app/NotificationCompatBase$Action;)V
    .locals 8
    .parameter "action"

    .prologue
    .line 76
    new-instance v0, Landroid/app/Notification$Action$Builder;

    #v0=(UninitRef);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getIcon()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getTitle()Ljava/lang/CharSequence;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getActionIntent()Landroid/app/PendingIntent;

    move-result-object v7

    #v7=(Reference);
    invoke-direct {v0, v5, v6, v7}, Landroid/app/Notification$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 78
    .local v0, actionBuilder:Landroid/app/Notification$Action$Builder;
    #v0=(Reference);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v5

    #v5=(Reference);
    if-eqz v5, :cond_0

    .line 79
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v5

    invoke-static {v5}, Landroid/support/v4/app/RemoteInputCompatApi20;->fromCompat([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/app/RemoteInput;

    move-result-object v1

    .local v1, arr$:[Landroid/app/RemoteInput;
    #v1=(Reference);
    array-length v3, v1

    .local v3, len$:I
    #v3=(Integer);
    const/4 v2, 0x0

    .local v2, i$:I
    :goto_0
    #v2=(Integer);v4=(Conflicted);
    if-ge v2, v3, :cond_0

    aget-object v4, v1, v2

    .line 81
    .local v4, remoteInput:Landroid/app/RemoteInput;
    #v4=(Null);
    invoke-virtual {v0, v4}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    .line 79
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 84
    .end local v1           #arr$:[Landroid/app/RemoteInput;
    .end local v2           #i$:I
    .end local v3           #len$:I
    .end local v4           #remoteInput:Landroid/app/RemoteInput;
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    if-eqz v5, :cond_1

    .line 85
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    .line 87
    :cond_1
    iget-object v5, p0, Landroid/support/v4/app/NotificationCompatApi20$Builder;->b:Landroid/app/Notification$Builder;

    invoke-virtual {v0}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/app/Notification$Builder;->addAction(Landroid/app/Notification$Action;)Landroid/app/Notification$Builder;

    .line 88
    return-void
.end method

.method public build()Landroid/app/Notification;
    .locals 1

    .prologue
    .line 96
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompatApi20$Builder;->b:Landroid/app/Notification$Builder;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public getBuilder()Landroid/app/Notification$Builder;
    .locals 1

    .prologue
    .line 92
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompatApi20$Builder;->b:Landroid/app/Notification$Builder;

    #v0=(Reference);
    return-object v0
.end method

*/}
