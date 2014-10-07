package android.support.v4.app; class NotificationCompatHoneycomb {/*

.class Landroid/support/v4/app/NotificationCompatHoneycomb;
.super Ljava/lang/Object;
.source "NotificationCompatHoneycomb.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method static add(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;)Landroid/app/Notification;
    .locals 5
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

    .prologue
    .line 30
    new-instance v1, Landroid/app/Notification$Builder;

    #v1=(UninitRef);
    invoke-direct {v1, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V

    #v1=(Reference);
    iget-wide v2, p1, Landroid/app/Notification;->when:J

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v1, v2, v3}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v2, p1, Landroid/app/Notification;->icon:I

    #v2=(Integer);
    iget v3, p1, Landroid/app/Notification;->iconLevel:I

    #v3=(Integer);
    invoke-virtual {v1, v2, v3}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v2, p1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v2, p1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    invoke-virtual {v1, v2, p5}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v2, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;

    iget v3, p1, Landroid/app/Notification;->audioStreamType:I

    invoke-virtual {v1, v2, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v2, p1, Landroid/app/Notification;->vibrate:[J

    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;

    move-result-object v1

    iget v2, p1, Landroid/app/Notification;->ledARGB:I

    #v2=(Integer);
    iget v3, p1, Landroid/app/Notification;->ledOnMS:I

    iget v4, p1, Landroid/app/Notification;->ledOffMS:I

    #v4=(Integer);
    invoke-virtual {v1, v2, v3, v4}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;

    move-result-object v2

    #v2=(Reference);
    iget v1, p1, Landroid/app/Notification;->flags:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x2

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    :goto_0
    #v1=(Boolean);
    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v1, p1, Landroid/app/Notification;->flags:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_1

    const/4 v1, 0x1

    :goto_1
    #v1=(Boolean);
    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v1, p1, Landroid/app/Notification;->flags:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_2

    const/4 v1, 0x1

    :goto_2
    #v1=(Boolean);
    invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    move-result-object v1

    #v1=(Reference);
    iget v2, p1, Landroid/app/Notification;->defaults:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;

    move-result-object v1

    invoke-virtual {v1, p2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    invoke-virtual {v1, p3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    invoke-virtual {v1, p4}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    move-result-object v1

    invoke-virtual {v1, p7}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v1

    iget-object v2, p1, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    move-result-object v2

    iget v1, p1, Landroid/app/Notification;->flags:I

    #v1=(Integer);
    and-int/lit16 v1, v1, 0x80

    if-eqz v1, :cond_3

    const/4 v1, 0x1

    :goto_3
    #v1=(Boolean);
    invoke-virtual {v2, p8, v1}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1, p9}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;

    move-result-object v1

    invoke-virtual {v1, p6}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;

    move-result-object v0

    .line 52
    .local v0, b:Landroid/app/Notification$Builder;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;

    move-result-object v1

    return-object v1

    .line 30
    .end local v0           #b:Landroid/app/Notification$Builder;
    :cond_0
    #v0=(Uninit);v1=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0

    :cond_1
    #v1=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_1

    :cond_2
    #v1=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_2

    :cond_3
    #v1=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_3
.end method

*/}
