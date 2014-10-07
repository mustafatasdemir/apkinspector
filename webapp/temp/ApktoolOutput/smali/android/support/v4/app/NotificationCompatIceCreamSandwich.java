package android.support.v4.app; class NotificationCompatIceCreamSandwich {/*

.class Landroid/support/v4/app/NotificationCompatIceCreamSandwich;
.super Ljava/lang/Object;
.source "NotificationCompatIceCreamSandwich.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method static add(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZ)Landroid/app/Notification;
    .locals 8
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

    .prologue
    .line 31
    new-instance v4, Landroid/app/Notification$Builder;

    #v4=(UninitRef);
    invoke-direct {v4, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    #v4=(Reference);
    iget-wide v5, p1, Landroid/app/Notification;->when:J

    #v5=(LongLo);v6=(LongHi);
    invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v5, p1, Landroid/app/Notification;->icon:I

    #v5=(Integer);
    iget v6, p1, Landroid/app/Notification;->iconLevel:I

    #v6=(Integer);
    invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    invoke-virtual {v4, v5, p5}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget v6, p1, Landroid/app/Notification;->audioStreamType:I

    invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p1, Landroid/app/Notification;->vibrate:[J

    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v4

    iget v5, p1, Landroid/app/Notification;->ledARGB:I

    #v5=(Integer);
    iget v6, p1, Landroid/app/Notification;->ledOnMS:I

    iget v7, p1, Landroid/app/Notification;->ledOffMS:I

    #v7=(Integer);
    invoke-virtual {v4, v5, v6, v7}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v5

    #v5=(Reference);
    iget v4, p1, Landroid/app/Notification;->flags:I

    #v4=(Integer);
    and-int/lit8 v4, v4, 0x2

    if-eqz v4, :cond_0

    const/4 v4, 0x1

    :goto_0
    #v4=(Boolean);
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v4, p1, Landroid/app/Notification;->flags:I

    #v4=(Integer);
    and-int/lit8 v4, v4, 0x8

    if-eqz v4, :cond_1

    const/4 v4, 0x1

    :goto_1
    #v4=(Boolean);
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v4, p1, Landroid/app/Notification;->flags:I

    #v4=(Integer);
    and-int/lit8 v4, v4, 0x10

    if-eqz v4, :cond_2

    const/4 v4, 0x1

    :goto_2
    #v4=(Boolean);
    invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v4

    #v4=(Reference);
    iget v5, p1, Landroid/app/Notification;->defaults:I

    #v5=(Integer);
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, p2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, p3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, p4}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, p7}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v4

    iget-object v5, p1, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v5

    iget v4, p1, Landroid/app/Notification;->flags:I

    #v4=(Integer);
    and-int/lit16 v4, v4, 0x80

    if-eqz v4, :cond_3

    const/4 v4, 0x1

    :goto_3
    #v4=(Boolean);
    move-object/from16 v0, p8

    #v0=(Reference);
    invoke-virtual {v5, v0, v4}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v4

    #v4=(Reference);
    move-object/from16 v0, p9

    invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v4

    invoke-virtual {v4, p6}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v4

    move/from16 v0, p10

    #v0=(Integer);
    move/from16 v1, p11

    #v1=(Integer);
    move/from16 v2, p12

    #v2=(Boolean);
    invoke-virtual {v4, v0, v1, v2}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;

    move-result-object v3

    .line 54
    .local v3, b:Landroid/app/Notification$Builder;
    #v3=(Reference);
    invoke-virtual {v3}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v4

    return-object v4

    .line 31
    .end local v3           #b:Landroid/app/Notification$Builder;
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_0

    :cond_1
    #v4=(Integer);
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_1

    :cond_2
    #v4=(Integer);
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_2

    :cond_3
    #v4=(Integer);
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_3
.end method

*/}
