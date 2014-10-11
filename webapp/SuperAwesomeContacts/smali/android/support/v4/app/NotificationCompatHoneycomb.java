package android.support.v4.app; class NotificationCompatHoneycomb { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompatHoneycomb;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompatHoneycomb.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompatHoneycomb;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static add(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;)Landroid/app/Notification;
a=0;//     .locals 5
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;//     .param p2, "contentTitle"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "contentText"    # Ljava/lang/CharSequence;
a=0;//     .param p4, "contentInfo"    # Ljava/lang/CharSequence;
a=0;//     .param p5, "tickerView"    # Landroid/widget/RemoteViews;
a=0;//     .param p6, "number"    # I
a=0;//     .param p7, "contentIntent"    # Landroid/app/PendingIntent;
a=0;//     .param p8, "fullScreenIntent"    # Landroid/app/PendingIntent;
a=0;//     .param p9, "largeIcon"    # Landroid/graphics/Bitmap;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     new-instance v1, Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v1, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget-wide v2, p1, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p1, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p1, Landroid/app/Notification;->iconLevel:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/RemoteViews;);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v1, v2, p5}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;
a=0;// 
a=0;//     iget v3, p1, Landroid/app/Notification;->audioStreamType:I
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p1, Landroid/app/Notification;->vibrate:[J
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p1, Landroid/app/Notification;->ledARGB:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, p1, Landroid/app/Notification;->ledOnMS:I
a=0;// 
a=0;//     iget v4, p1, Landroid/app/Notification;->ledOffMS:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget v1, p1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v1, p1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v1, p1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v2, v1}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget v2, p1, Landroid/app/Notification;->defaults:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p4}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p7}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p1, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v1, p1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit16 v1, v1, 0x80
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v2, p8, v1}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v1, p9}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p6}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 52
a=0;//     .local v0, "b":Landroid/app/Notification$Builder;
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v0}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 30
a=0;//     .end local v0    # "b":Landroid/app/Notification$Builder;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_3
a=0;// .end method
}}
