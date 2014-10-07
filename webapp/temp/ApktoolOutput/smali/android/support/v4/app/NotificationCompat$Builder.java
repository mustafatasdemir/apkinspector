package android.support.v4.app; class NotificationCompat$Builder {/*

.class public Landroid/support/v4/app/NotificationCompat$Builder;
.super Ljava/lang/Object;
.source "NotificationCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field mActions:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/NotificationCompat$Action;",
            ">;"
        }
    .end annotation
.end field

.field mContentInfo:Ljava/lang/CharSequence;

.field mContentIntent:Landroid/app/PendingIntent;

.field mContentText:Ljava/lang/CharSequence;

.field mContentTitle:Ljava/lang/CharSequence;

.field mContext:Landroid/content/Context;

.field mExtras:Landroid/os/Bundle;

.field mFullScreenIntent:Landroid/app/PendingIntent;

.field mGroupKey:Ljava/lang/String;

.field mGroupSummary:Z

.field mLargeIcon:Landroid/graphics/Bitmap;

.field mLocalOnly:Z

.field mNotification:Landroid/app/Notification;

.field mNumber:I

.field mPriority:I

.field mProgress:I

.field mProgressIndeterminate:Z

.field mProgressMax:I

.field mSortKey:Ljava/lang/String;

.field mStyle:Landroid/support/v4/app/NotificationCompat$Style;

.field mSubText:Ljava/lang/CharSequence;

.field mTickerView:Landroid/widget/RemoteViews;

.field mUseChronometer:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 4
    .parameter "context"

    .prologue
    const/4 v3, 0x0

    .line 676
    #v3=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 659
    #p0=(Reference);
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;

    .line 660
    iput-boolean v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mLocalOnly:Z

    .line 663
    new-instance v0, Landroid/app/Notification;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/app/Notification;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    .line 677
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;

    .line 680
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    #v1=(LongLo);v2=(LongHi);
    iput-wide v1, v0, Landroid/app/Notification;->when:J

    .line 681
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    const/4 v1, -0x1

    #v1=(Byte);
    iput v1, v0, Landroid/app/Notification;->audioStreamType:I

    .line 682
    iput v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I

    .line 683
    return-void
.end method

.method private setFlag(IZ)V
    .locals 3
    .parameter "mask"
    .parameter "value"

    .prologue
    .line 990
    if-eqz p2, :cond_0

    .line 991
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iget v1, v0, Landroid/app/Notification;->flags:I

    #v1=(Integer);
    or-int/2addr v1, p1

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 995
    :goto_0
    #v2=(Conflicted);
    return-void

    .line 993
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iget v1, v0, Landroid/app/Notification;->flags:I

    #v1=(Integer);
    xor-int/lit8 v2, p1, -0x1

    #v2=(Integer);
    and-int/2addr v1, v2

    iput v1, v0, Landroid/app/Notification;->flags:I

    goto :goto_0
.end method


# virtual methods
.method public addAction(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 2
    .parameter "icon"
    .parameter "title"
    .parameter "intent"

    .prologue
    .line 1133
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;

    #v0=(Reference);
    new-instance v1, Landroid/support/v4/app/NotificationCompat$Action;

    #v1=(UninitRef);
    invoke-direct {v1, p1, p2, p3}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1134
    return-object p0
.end method

.method public addAction(Landroid/support/v4/app/NotificationCompat$Action;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "action"

    .prologue
    .line 1152
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mActions:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1153
    return-object p0
.end method

.method public addExtras(Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "extras"

    .prologue
    .line 1072
    if-eqz p1, :cond_0

    .line 1073
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    #v0=(Reference);
    if-nez v0, :cond_1

    .line 1074
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    .line 1079
    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-object p0

    .line 1076
    :cond_1
    #v0=(Reference);
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public build()Landroid/app/Notification;
    .locals 1

    .prologue
    .line 1196
    invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public extend(Landroid/support/v4/app/NotificationCompat$Extender;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "extender"

    .prologue
    .line 1179
    invoke-interface {p1, p0}, Landroid/support/v4/app/NotificationCompat$Extender;->extend(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/support/v4/app/NotificationCompat$Builder;

    .line 1180
    return-object p0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 1110
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 1111
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    .line 1113
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    return-object v0
.end method

.method public getNotification()Landroid/app/Notification;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 1188
    invoke-static {}, Landroid/support/v4/app/NotificationCompat;->access$200()Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;

    move-result-object v0

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;->build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;

    move-result-object v0

    return-object v0
.end method

.method public setAutoCancel(Z)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "autoCancel"

    .prologue
    .line 956
    const/16 v0, 0x10

    #v0=(PosByte);
    invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V

    .line 957
    return-object p0
.end method

.method public setContent(Landroid/widget/RemoteViews;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "views"

    .prologue
    .line 801
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput-object p1, v0, Landroid/app/Notification;->contentView:Landroid/widget/RemoteViews;

    .line 802
    return-object p0
.end method

.method public setContentInfo(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "info"

    .prologue
    .line 782
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentInfo:Ljava/lang/CharSequence;

    .line 783
    return-object p0
.end method

.method public setContentIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "intent"

    .prologue
    .line 814
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;

    .line 815
    return-object p0
.end method

.method public setContentText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "text"

    .prologue
    .line 750
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;

    .line 751
    return-object p0
.end method

.method public setContentTitle(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "title"

    .prologue
    .line 742
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;

    .line 743
    return-object p0
.end method

.method public setDefaults(I)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 2
    .parameter "defaults"

    .prologue
    .line 982
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput p1, v0, Landroid/app/Notification;->defaults:I

    .line 983
    and-int/lit8 v0, p1, 0x4

    #v0=(Integer);
    if-eqz v0, :cond_0

    .line 984
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iget v1, v0, Landroid/app/Notification;->flags:I

    #v1=(Integer);
    or-int/lit8 v1, v1, 0x1

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 986
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-object p0
.end method

.method public setDeleteIntent(Landroid/app/PendingIntent;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "intent"

    .prologue
    .line 826
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput-object p1, v0, Landroid/app/Notification;->deleteIntent:Landroid/app/PendingIntent;

    .line 827
    return-object p0
.end method

.method public setExtras(Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "extras"

    .prologue
    .line 1095
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mExtras:Landroid/os/Bundle;

    .line 1096
    return-object p0
.end method

.method public setFullScreenIntent(Landroid/app/PendingIntent;Z)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "intent"
    .parameter "highPriority"

    .prologue
    .line 844
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mFullScreenIntent:Landroid/app/PendingIntent;

    .line 845
    const/16 v0, 0x80

    #v0=(PosShort);
    invoke-direct {p0, v0, p2}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V

    .line 846
    return-object p0
.end method

.method public setGroup(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "groupKey"

    .prologue
    .line 1031
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupKey:Ljava/lang/String;

    .line 1032
    return-object p0
.end method

.method public setGroupSummary(Z)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "isGroupSummary"

    .prologue
    .line 1043
    iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mGroupSummary:Z

    .line 1044
    return-object p0
.end method

.method public setLargeIcon(Landroid/graphics/Bitmap;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "icon"

    .prologue
    .line 873
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mLargeIcon:Landroid/graphics/Bitmap;

    .line 874
    return-object p0
.end method

.method public setLights(III)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 5
    .parameter "argb"
    .parameter "onMs"
    .parameter "offMs"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, 0x0

    .line 915
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v3=(Reference);
    iput p1, v3, Landroid/app/Notification;->ledARGB:I

    .line 916
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    iput p2, v3, Landroid/app/Notification;->ledOnMS:I

    .line 917
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    iput p3, v3, Landroid/app/Notification;->ledOffMS:I

    .line 918
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    iget v3, v3, Landroid/app/Notification;->ledOnMS:I

    #v3=(Integer);
    if-eqz v3, :cond_0

    iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v3=(Reference);
    iget v3, v3, Landroid/app/Notification;->ledOffMS:I

    #v3=(Integer);
    if-eqz v3, :cond_0

    move v0, v1

    .line 919
    .local v0, showLights:Z
    :goto_0
    #v0=(Boolean);
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v4=(Reference);
    iget v4, v4, Landroid/app/Notification;->flags:I

    #v4=(Integer);
    and-int/lit8 v4, v4, -0x2

    if-eqz v0, :cond_1

    :goto_1
    #v1=(Boolean);
    or-int/2addr v1, v4

    #v1=(Integer);
    iput v1, v3, Landroid/app/Notification;->flags:I

    .line 921
    return-object p0

    .end local v0           #showLights:Z
    :cond_0
    #v0=(Uninit);v1=(One);v3=(Integer);v4=(Uninit);
    move v0, v2

    .line 918
    #v0=(Null);
    goto :goto_0

    .restart local v0       #showLights:Z
    :cond_1
    #v0=(Boolean);v3=(Reference);v4=(Integer);
    move v1, v2

    .line 919
    #v1=(Null);
    goto :goto_1
.end method

.method public setLocalOnly(Z)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "b"

    .prologue
    .line 967
    iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mLocalOnly:Z

    .line 968
    return-object p0
.end method

.method public setNumber(I)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "number"

    .prologue
    .line 774
    iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNumber:I

    .line 775
    return-object p0
.end method

.method public setOngoing(Z)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "ongoing"

    .prologue
    .line 936
    const/4 v0, 0x2

    #v0=(PosByte);
    invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V

    .line 937
    return-object p0
.end method

.method public setOnlyAlertOnce(Z)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "onlyAlertOnce"

    .prologue
    .line 945
    const/16 v0, 0x8

    #v0=(PosByte);
    invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Builder;->setFlag(IZ)V

    .line 946
    return-object p0
.end method

.method public setPriority(I)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "pri"

    .prologue
    .line 1015
    iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I

    .line 1016
    return-object p0
.end method

.method public setProgress(IIZ)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "max"
    .parameter "progress"
    .parameter "indeterminate"

    .prologue
    .line 791
    iput p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressMax:I

    .line 792
    iput p2, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgress:I

    .line 793
    iput-boolean p3, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mProgressIndeterminate:Z

    .line 794
    return-object p0
.end method

.method public setSmallIcon(I)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "icon"

    .prologue
    .line 718
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput p1, v0, Landroid/app/Notification;->icon:I

    .line 719
    return-object p0
.end method

.method public setSmallIcon(II)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "icon"
    .parameter "level"

    .prologue
    .line 733
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput p1, v0, Landroid/app/Notification;->icon:I

    .line 734
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    iput p2, v0, Landroid/app/Notification;->iconLevel:I

    .line 735
    return-object p0
.end method

.method public setSortKey(Ljava/lang/String;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "sortKey"

    .prologue
    .line 1060
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mSortKey:Ljava/lang/String;

    .line 1061
    return-object p0
.end method

.method public setSound(Landroid/net/Uri;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 2
    .parameter "sound"

    .prologue
    .line 881
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 882
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    const/4 v1, -0x1

    #v1=(Byte);
    iput v1, v0, Landroid/app/Notification;->audioStreamType:I

    .line 883
    return-object p0
.end method

.method public setSound(Landroid/net/Uri;I)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "sound"
    .parameter "streamType"

    .prologue
    .line 893
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput-object p1, v0, Landroid/app/Notification;->sound:Landroid/net/Uri;

    .line 894
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    iput p2, v0, Landroid/app/Notification;->audioStreamType:I

    .line 895
    return-object p0
.end method

.method public setStyle(Landroid/support/v4/app/NotificationCompat$Style;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "style"

    .prologue
    .line 1165
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;

    #v0=(Reference);
    if-eq v0, p1, :cond_0

    .line 1166
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;

    .line 1167
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;

    if-eqz v0, :cond_0

    .line 1168
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mStyle:Landroid/support/v4/app/NotificationCompat$Style;

    invoke-virtual {v0, p0}, Landroid/support/v4/app/NotificationCompat$Style;->setBuilder(Landroid/support/v4/app/NotificationCompat$Builder;)V

    .line 1171
    :cond_0
    return-object p0
.end method

.method public setSubText(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "text"

    .prologue
    .line 764
    iput-object p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mSubText:Ljava/lang/CharSequence;

    .line 765
    return-object p0
.end method

.method public setTicker(Ljava/lang/CharSequence;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "tickerText"

    .prologue
    .line 854
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 855
    return-object p0
.end method

.method public setTicker(Ljava/lang/CharSequence;Landroid/widget/RemoteViews;)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "tickerText"
    .parameter "views"

    .prologue
    .line 864
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput-object p1, v0, Landroid/app/Notification;->tickerText:Ljava/lang/CharSequence;

    .line 865
    iput-object p2, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mTickerView:Landroid/widget/RemoteViews;

    .line 866
    return-object p0
.end method

.method public setUsesChronometer(Z)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 0
    .parameter "b"

    .prologue
    .line 706
    iput-boolean p1, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mUseChronometer:Z

    .line 707
    return-object p0
.end method

.method public setVibrate([J)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "pattern"

    .prologue
    .line 905
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput-object p1, v0, Landroid/app/Notification;->vibrate:[J

    .line 906
    return-object p0
.end method

.method public setWhen(J)Landroid/support/v4/app/NotificationCompat$Builder;
    .locals 1
    .parameter "when"

    .prologue
    .line 690
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    #v0=(Reference);
    iput-wide p1, v0, Landroid/app/Notification;->when:J

    .line 691
    return-object p0
.end method

*/}
