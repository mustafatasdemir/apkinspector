package android.support.v4.app; class NotificationCompat$NotificationCompatImplKitKat {/*

.class Landroid/support/v4/app/NotificationCompat$NotificationCompatImplKitKat;
.super Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;
.source "NotificationCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "NotificationCompatImplKitKat"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 458
    invoke-direct {p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplJellybean;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
    .locals 23
    .parameter "b"

    .prologue
    .line 461
    new-instance v1, Landroid/support/v4/app/NotificationCompatKitKat$Builder;

    #v1=(UninitRef);
    move-object/from16 v0, p1

    #v0=(Reference);
    iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;

    #v2=(Reference);
    move-object/from16 v0, p1

    iget-object v3, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v3=(Reference);
    move-object/from16 v0, p1

    iget-object v4, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;

    #v4=(Reference);
    move-object/from16 v0, p1

    iget-object v5, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;

    #v5=(Reference);
    move-object/from16 v0, p1

    iget-object v6, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentInfo:Ljava/lang/CharSequence;

    #v6=(Reference);
    move-object/from16 v0, p1

    iget-object v7, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mTickerView:Landroid/widget/RemoteViews;

    #v7=(Reference);
    move-object/from16 v0, p1

    iget v8, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mNumber:I

    #v8=(Integer);
    move-object/from16 v0, p1

    iget-object v9, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;

    #v9=(Reference);
    move-object/from16 v0, p1

    iget-object v10, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mFullScreenIntent:Landroid/app/PendingIntent;

    #v10=(Reference);
    move-object/from16 v0, p1

    iget-object v11, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mLargeIcon:Landroid/graphics/Bitmap;

    #v11=(Reference);
    move-object/from16 v0, p1

    iget v12, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressMax:I

    #v12=(Integer);
    move-object/from16 v0, p1

    iget v13, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgress:I

    #v13=(Integer);
    move-object/from16 v0, p1

    iget-boolean v14, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressIndeterminate:Z

    #v14=(Boolean);
    move-object/from16 v0, p1

    iget-boolean v15, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mUseChronometer:Z

    #v15=(Boolean);
    move-object/from16 v0, p1

    iget v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I

    #v0=(Integer);
    move/from16 v16, v0

    #v16=(Integer);
    move-object/from16 v0, p1

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mSubText:Ljava/lang/CharSequence;

    move-object/from16 v17, v0

    #v17=(Reference);
    move-object/from16 v0, p1

    iget-boolean v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mLocalOnly:Z

    #v0=(Boolean);
    move/from16 v18, v0

    #v18=(Boolean);
    move-object/from16 v0, p1

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    move-object/from16 v19, v0

    #v19=(Reference);
    move-object/from16 v0, p1

    iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupKey:Ljava/lang/String;

    move-object/from16 v20, v0

    #v20=(Reference);
    move-object/from16 v0, p1

    iget-boolean v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupSummary:Z

    #v0=(Boolean);
    move/from16 v21, v0

    #v21=(Boolean);
    move-object/from16 v0, p1

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mSortKey:Ljava/lang/String;

    move-object/from16 v22, v0

    #v22=(Reference);
    invoke-direct/range {v1 .. v22}, Landroid/support/v4/app/NotificationCompatKitKat$Builder;-><init>(Landroid/content/Context;Landroid/app/Notification;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/widget/RemoteViews;ILandroid/app/PendingIntent;Landroid/app/PendingIntent;Landroid/graphics/Bitmap;IIZZILjava/lang/CharSequence;ZLandroid/os/Bundle;Ljava/lang/String;ZLjava/lang/String;)V

    .line 467
    .local v1, builder:Landroid/support/v4/app/NotificationCompatKitKat$Builder;
    #v1=(Reference);
    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;

    invoke-static {v1, v2}, Landroid/support/v4/app/NotificationCompat;->access$000(Landroid/support/v4/app/NotificationBuilderWithActions;Ljava/util/ArrayList;)V

    .line 468
    move-object/from16 v0, p1

    iget-object v2, v0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;

    invoke-static {v1, v2}, Landroid/support/v4/app/NotificationCompat;->access$100(Landroid/support/v4/app/NotificationBuilderWithBuilderAccessor;Landroid/support/v4/app/NotificationCompat$Style;)V

    .line 469
    invoke-virtual {v1}, Landroid/support/v4/app/NotificationCompatKitKat$Builder;->build()Landroid/app/Notification;

    move-result-object v2

    return-object v2
.end method

.method public getAction(Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;
    .locals 2
    .parameter "n"
    .parameter "actionIndex"

    .prologue
    .line 484
    sget-object v0, Landroid/support/v4/app/NotificationCompat$Action;->FACTORY:Landroid/support/v4/app/NotificationCompatBase$Action$Factory;

    #v0=(Reference);
    sget-object v1, Landroid/support/v4/app/RemoteInput;->FACTORY:Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;

    #v1=(Reference);
    invoke-static {p1, p2, v0, v1}, Landroid/support/v4/app/NotificationCompatKitKat;->getAction(Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v0

    check-cast v0, Landroid/support/v4/app/NotificationCompat$Action;

    return-object v0
.end method

.method public getActionCount(Landroid/app/Notification;)I
    .locals 1
    .parameter "n"

    .prologue
    .line 479
    invoke-static {p1}, Landroid/support/v4/app/NotificationCompatKitKat;->getActionCount(Landroid/app/Notification;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    .locals 1
    .parameter "n"

    .prologue
    .line 474
    invoke-static {p1}, Landroid/support/v4/app/NotificationCompatKitKat;->getExtras(Landroid/app/Notification;)Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getGroup(Landroid/app/Notification;)Ljava/lang/String;
    .locals 1
    .parameter "n"

    .prologue
    .line 495
    invoke-static {p1}, Landroid/support/v4/app/NotificationCompatKitKat;->getGroup(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getLocalOnly(Landroid/app/Notification;)Z
    .locals 1
    .parameter "n"

    .prologue
    .line 490
    invoke-static {p1}, Landroid/support/v4/app/NotificationCompatKitKat;->getLocalOnly(Landroid/app/Notification;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public getSortKey(Landroid/app/Notification;)Ljava/lang/String;
    .locals 1
    .parameter "n"

    .prologue
    .line 505
    invoke-static {p1}, Landroid/support/v4/app/NotificationCompatKitKat;->getSortKey(Landroid/app/Notification;)Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public isGroupSummary(Landroid/app/Notification;)Z
    .locals 1
    .parameter "n"

    .prologue
    .line 500
    invoke-static {p1}, Landroid/support/v4/app/NotificationCompatKitKat;->isGroupSummary(Landroid/app/Notification;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
