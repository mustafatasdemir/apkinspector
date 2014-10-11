package android.support.v4.app; class NotificationCompat$NotificationCompatImplJellybean { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;
a=0;// .super Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "NotificationCompatImplJellybean"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 394
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
a=0;//     .locals 23
a=0;//     .param p1, "b"    # Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 397
a=0;//     new-instance v1, Landroid/support/v4/app/NotificationCompatJellybean$Builder;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v4/app/NotificationCompatJellybean$Builder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v4, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v5, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v6, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentInfo:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v7, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mTickerView:Landroid/widget/RemoteViews;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/RemoteViews;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v8, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mNumber:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v9, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v9=(Reference,Landroid/app/PendingIntent;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v10, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mFullScreenIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/PendingIntent;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v11, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mLargeIcon:Landroid/graphics/Bitmap;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/Bitmap;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v12, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressMax:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v13, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgress:I
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-boolean v14, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressIndeterminate:Z
a=0;// 
a=0;//     #v14=(Boolean);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-boolean v15, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mUseChronometer:Z
a=0;// 
a=0;//     #v15=(Boolean);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v16, v0
a=0;// 
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mSubText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-object/from16 v17, v0
a=0;// 
a=0;//     #v17=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mLocalOnly:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v18, v0
a=0;// 
a=0;//     #v18=(Boolean);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;
a=0;// 
a=0;//     move-object/from16 v19, v0
a=0;// 
a=0;//     #v19=(Reference,Landroid/os/Bundle;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupKey:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v20, v0
a=0;// 
a=0;//     #v20=(Reference,Ljava/lang/String;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupSummary:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     #v21=(Boolean);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Builder;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mSortKey:Ljava/lang/String;
a=0;// 
a=0;//     move-object/from16 v22, v0
a=0;// 
a=0;//     #v22=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct/range {v1 .. v22}, Landroid/support/v4/app/NotificationCompatJellybean$Builder;-><init>(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZZILjava/lang/CharSequence;ZLandroid/os/Bundle;Ljava/lang/String;ZLjava/lang/String;)V
a=0;// 
a=0;//     .line 403
a=0;//     .local v1, "builder":Landroid/support/v4/app/NotificationCompatJellybean$Builder;
a=0;//     #v1=(Reference,Landroid/support/v4/app/NotificationCompatJellybean$Builder;);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/support/v4/app/NotificationCompat;->access$000(Landroid/support/v4/app/NotificationBuilderWithActions;Ljava/util/ArrayList;)V
a=0;// 
a=0;//     .line 404
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;
a=0;// 
a=0;//     invoke-static {v1, v2}, Landroid/support/v4/app/NotificationCompat;->access$100(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Landroid/support/v4/app/NotificationCompat$Style;)V
a=0;// 
a=0;//     .line 405
a=0;//     invoke-virtual {v1}, Landroid/support/v4/app/NotificationCompatJellybean$Builder;->build()Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public getAction(Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .locals 2
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;//     .param p2, "actionIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 420
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat$Action;->FACTORY:Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompatBase$Action$Factory;);
a=0;//     sget-object v1, Landroid/support/v4/app/RemoteInput;->FACTORY:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;);
a=0;//     invoke-static {p1, p2, v0, v1}, Landroid/support/v4/app/NotificationCompatJellybean;->getAction(Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionCount(Landroid/app/Notification;)I
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 415
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionCount(Landroid/app/Notification;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionsFromParcelableArrayList(Ljava/util/ArrayList;)[Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .locals 2
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;)[",
a=0;//             "Landroid/support/v4/app/NotificationCompat$Action;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 427
a=0;//     .local p1, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
a=0;//     sget-object v0, Landroid/support/v4/app/NotificationCompat$Action;->FACTORY:Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompatBase$Action$Factory;);
a=0;//     sget-object v1, Landroid/support/v4/app/RemoteInput;->FACTORY:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;);
a=0;//     invoke-static {p1, v0, v1}, Landroid/support/v4/app/NotificationCompatJellybean;->getActionsFromParcelableArrayList(Ljava/util/ArrayList;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, [Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     check-cast v0, [Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 410
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getGroup(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 444
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getGroup(Landroid/app/Notification;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLocalOnly(Landroid/app/Notification;)Z
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 439
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getLocalOnly(Landroid/app/Notification;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompat$Action;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .param p1, "actions"    # [Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Landroid/support/v4/app/NotificationCompat$Action;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 434
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompatBase$Action;)Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSortKey(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 454
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->getSortKey(Landroid/app/Notification;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isGroupSummary(Landroid/app/Notification;)Z
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 449
a=0;//     invoke-static {p1}, Landroid/support/v4/app/NotificationCompatJellybean;->isGroupSummary(Landroid/app/Notification;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
