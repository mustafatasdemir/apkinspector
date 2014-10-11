package android.support.v4.app; class NotificationCompatIceCreamSandwich { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompatIceCreamSandwich;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompatIceCreamSandwich.java"
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
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompatIceCreamSandwich;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static add(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZ)Landroid/app/Notification;
a=0;//     .locals 8
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
a=0;//     .param p10, "mProgressMax"    # I
a=0;//     .param p11, "mProgress"    # I
a=0;//     .param p12, "mProgressIndeterminate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     new-instance v4, Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v4, p0}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget-wide v5, p1, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, p1, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p1, Landroid/app/Notification;->iconLevel:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p1, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/RemoteViews;);
a=0;//     invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p1, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v4, v5, p5}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p1, Landroid/app/Notification;->sound:Landroid/net/Uri;
a=0;// 
a=0;//     iget v6, p1, Landroid/app/Notification;->audioStreamType:I
a=0;// 
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p1, Landroid/app/Notification;->vibrate:[J
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, p1, Landroid/app/Notification;->ledARGB:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, p1, Landroid/app/Notification;->ledOnMS:I
a=0;// 
a=0;//     iget v7, p1, Landroid/app/Notification;->ledOffMS:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v4, v5, v6, v7}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget v4, p1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit8 v4, v4, 0x2
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v4, p1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit8 v4, v4, 0x8
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v4, p1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit8 v4, v4, 0x10
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v5, v4}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget v5, p1, Landroid/app/Notification;->defaults:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p2}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p3}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p4}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p7}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget-object v5, p1, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v4, v5}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v4, p1, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     and-int/lit16 v4, v4, 0x80
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(Boolean);
a=0;//     move-object/from16 v0, p8
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v5, v0, v4}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Notification$Builder;);
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p6}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     move/from16 v0, p10
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, p11
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, p12
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v4, v0, v1, v2}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 54
a=0;//     .local v3, "b":Landroid/app/Notification$Builder;
a=0;//     #v3=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v3}, Landroid/app/Notification$Builder;->getNotification()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     return-object v4
a=0;// 
a=0;//     .line 31
a=0;//     .end local v3    # "b":Landroid/app/Notification$Builder;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_1
a=0;//     #v4=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     #v4=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v4=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_3
a=0;// .end method
}}
