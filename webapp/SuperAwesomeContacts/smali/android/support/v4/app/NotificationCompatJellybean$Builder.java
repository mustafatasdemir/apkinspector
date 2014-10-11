package android.support.v4.app; class NotificationCompatJellybean$Builder { void a() { int a;
a=0;// .class public Landroid/support/v4/app/NotificationCompatJellybean$Builder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompatJellybean.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/NotificationBuilderWithActions;
a=0;// .implements Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompatJellybean;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "Builder"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Landroid/app/Notification$Builder;
a=0;// 
a=0;// .field private mActionExtrasList:Ljava/util/List;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/os/Bundle;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private final mExtras:Landroid/os/Bundle;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZZILjava/lang/CharSequence;ZLandroid/os/Bundle;Ljava/lang/String;ZLjava/lang/String;)V
a=0;//     .locals 7
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "n"    # Landroid/app/Notification;
a=0;//     .param p3, "contentTitle"    # Ljava/lang/CharSequence;
a=0;//     .param p4, "contentText"    # Ljava/lang/CharSequence;
a=0;//     .param p5, "contentInfo"    # Ljava/lang/CharSequence;
a=0;//     .param p6, "tickerView"    # Landroid/widget/RemoteViews;
a=0;//     .param p7, "number"    # I
a=0;//     .param p8, "contentIntent"    # Landroid/app/PendingIntent;
a=0;//     .param p9, "fullScreenIntent"    # Landroid/app/PendingIntent;
a=0;//     .param p10, "largeIcon"    # Landroid/graphics/Bitmap;
a=0;//     .param p11, "mProgressMax"    # I
a=0;//     .param p12, "mProgress"    # I
a=0;//     .param p13, "mProgressIndeterminate"    # Z
a=0;//     .param p14, "useChronometer"    # Z
a=0;//     .param p15, "priority"    # I
a=0;//     .param p16, "subText"    # Ljava/lang/CharSequence;
a=0;//     .param p17, "localOnly"    # Z
a=0;//     .param p18, "extras"    # Landroid/os/Bundle;
a=0;//     .param p19, "groupKey"    # Ljava/lang/String;
a=0;//     .param p20, "groupSummary"    # Z
a=0;//     .param p21, "sortKey"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 76
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 68
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompatJellybean$Builder;);
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mActionExtrasList:Ljava/util/List;
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v3, Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/app/Notification$Builder;);
a=0;//     invoke-direct {v3, p1}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget-wide v4, p2, Landroid/app/Notification;->when:J
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setWhen(J)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, p2, Landroid/app/Notification;->icon:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p2, Landroid/app/Notification;->iconLevel:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSmallIcon(II)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/RemoteViews;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setContent(Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v3, v4, p6}, Landroid/app/Notification$Builder;->setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->sound:Landroid/net/Uri;
a=0;// 
a=0;//     iget v5, p2, Landroid/app/Notification;->audioStreamType:I
a=0;// 
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/app/Notification$Builder;->setSound(Landroid/net/Uri;I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->vibrate:[J
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setVibrate([J)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v4, p2, Landroid/app/Notification;->ledARGB:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p2, Landroid/app/Notification;->ledOnMS:I
a=0;// 
a=0;//     iget v6, p2, Landroid/app/Notification;->ledOffMS:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v4, v5, v6}, Landroid/app/Notification$Builder;->setLights(III)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget v3, p2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setOngoing(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v3, p2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x8
a=0;// 
a=0;//     if-eqz v3, :cond_5
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setOnlyAlertOnce(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v3, p2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x10
a=0;// 
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v4, v3}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification$Builder;);
a=0;//     iget v4, p2, Landroid/app/Notification;->defaults:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDefaults(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p4}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move-object/from16 v0, p16
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setSubText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p5}, Landroid/app/Notification$Builder;->setContentInfo(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p8}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget-object v4, p2, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v3, v4}, Landroid/app/Notification$Builder;->setDeleteIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v3, p2, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit16 v3, v3, 0x80
a=0;// 
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     :goto_3
a=0;//     #v3=(Boolean);
a=0;//     move-object/from16 v0, p9
a=0;// 
a=0;//     invoke-virtual {v4, v0, v3}, Landroid/app/Notification$Builder;->setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification$Builder;);
a=0;//     move-object/from16 v0, p10
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setLargeIcon(Landroid/graphics/Bitmap;)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p7}, Landroid/app/Notification$Builder;->setNumber(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move/from16 v0, p14
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setUsesChronometer(Z)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move/from16 v0, p15
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v3, v0}, Landroid/app/Notification$Builder;->setPriority(I)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     move/from16 v0, p11
a=0;// 
a=0;//     move/from16 v1, p12
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, p13
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v3, v0, v1, v2}, Landroid/app/Notification$Builder;->setProgress(IIZ)Landroid/app/Notification$Builder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v3, Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v3}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     iput-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 103
a=0;//     if-eqz p18, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     move-object/from16 v0, p18
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v3, v0}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     if-eqz p17, :cond_1
a=0;// 
a=0;//     .line 107
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v4, "android.support.localOnly"
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 109
a=0;//     :cond_1
a=0;//     #v5=(Integer);
a=0;//     if-eqz p19, :cond_2
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v4, "android.support.groupKey"
a=0;// 
a=0;//     move-object/from16 v0, p19
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 111
a=0;//     if-eqz p20, :cond_8
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v4, "android.support.isGroupSummary"
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     .line 117
a=0;//     :cond_2
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v5=(Integer);
a=0;//     if-eqz p21, :cond_3
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v4, "android.support.sortKey"
a=0;// 
a=0;//     move-object/from16 v0, p21
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 120
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 77
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     :cond_6
a=0;//     #v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     :cond_7
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);v3=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 114
a=0;//     :cond_8
a=0;//     #v1=(Integer);v2=(Boolean);v3=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v4, "android.support.useSideChannel"
a=0;// 
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     #v5=(One);
a=0;//     invoke-virtual {v3, v4, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addAction(Landroid/support/v4/app/NotificationCompatBase$Action;)V
a=0;//     .locals 2
a=0;//     .param p1, "action"    # Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mActionExtrasList:Ljava/util/List;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-static {v1, p1}, Landroid/support/v4/app/NotificationCompatJellybean;->writeActionAndGetExtras(Landroid/app/Notification$Builder;Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 125
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public build()Landroid/app/Notification;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v6=(Reference,Landroid/app/Notification$Builder;);
a=0;//     invoke-virtual {v6}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 136
a=0;//     .local v5, "notif":Landroid/app/Notification;
a=0;//     #v5=(Reference,Landroid/app/Notification;);
a=0;//     invoke-static {v5}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 137
a=0;//     .local v1, "extras":Landroid/os/Bundle;
a=0;//     #v1=(Reference,Landroid/os/Bundle;);
a=0;//     new-instance v4, Landroid/os/Bundle;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/os/Bundle;);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-direct {v4, v6}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 138
a=0;//     .local v4, "mergeBundle":Landroid/os/Bundle;
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/util/Iterator;);v3=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/String;
a=0;// 
a=0;//     .line 139
a=0;//     .local v3, "key":Ljava/lang/String;
a=0;//     invoke-virtual {v1, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 140
a=0;//     invoke-virtual {v4, v3}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 143
a=0;//     .end local v3    # "key":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v1, v4}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v6, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->mActionExtrasList:Ljava/util/List;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     invoke-static {v6}, Landroid/support/v4/app/NotificationCompatJellybean;->buildActionExtrasMap(Ljava/util/List;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
a=0;//     #v0=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 147
a=0;//     invoke-static {v5}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "android.support.actionExtras"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7, v0}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 149
a=0;//     :cond_2
a=0;//     #v7=(Conflicted);
a=0;//     return-object v5
a=0;// .end method
a=0;// 
a=0;// .method public getBuilder()Landroid/app/Notification$Builder;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->b:Landroid/app/Notification$Builder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Notification$Builder;);
a=0;//     return-object v0
a=0;// .end method
}}
