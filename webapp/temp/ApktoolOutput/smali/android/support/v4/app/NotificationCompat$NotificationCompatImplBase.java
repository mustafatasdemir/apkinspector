package android.support.v4.app; class NotificationCompat$NotificationCompatImplBase {/*

.class Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;
.super Ljava/lang/Object;
.source "NotificationCompat.java"

# interfaces
.implements Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "NotificationCompatImplBase"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 299
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
    .locals 5
    .parameter "b"

    .prologue
    .line 302
    iget-object v0, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;

    .line 303
    .local v0, result:Landroid/app/Notification;
    #v0=(Reference);
    iget-object v1, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;

    #v1=(Reference);
    iget-object v2, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;

    #v2=(Reference);
    iget-object v3, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;

    #v3=(Reference);
    iget-object v4, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;

    #v4=(Reference);
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V

    .line 306
    iget v1, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I

    #v1=(Integer);
    if-lez v1, :cond_0

    .line 307
    iget v1, v0, Landroid/app/Notification;->flags:I

    or-int/lit16 v1, v1, 0x80

    iput v1, v0, Landroid/app/Notification;->flags:I

    .line 309
    :cond_0
    return-object v0
.end method

.method public getAction(Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;
    .locals 1
    .parameter "n"
    .parameter "actionIndex"

    .prologue
    .line 324
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getActionCount(Landroid/app/Notification;)I
    .locals 1
    .parameter "n"

    .prologue
    .line 319
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getActionsFromParcelableArrayList(Ljava/util/ArrayList;)[Landroid/support/v4/app/NotificationCompat$Action;
    .locals 1
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/os/Parcelable;",
            ">;)[",
            "Landroid/support/v4/app/NotificationCompat$Action;"
        }
    .end annotation

    .prologue
    .line 330
    .local p1, parcelables:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    .locals 1
    .parameter "n"

    .prologue
    .line 314
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getGroup(Landroid/app/Notification;)Ljava/lang/String;
    .locals 1
    .parameter "n"

    .prologue
    .line 345
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getLocalOnly(Landroid/app/Notification;)Z
    .locals 1
    .parameter "n"

    .prologue
    .line 340
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompat$Action;)Ljava/util/ArrayList;
    .locals 1
    .parameter "actions"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/support/v4/app/NotificationCompat$Action;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 335
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getSortKey(Landroid/app/Notification;)Ljava/lang/String;
    .locals 1
    .parameter "n"

    .prologue
    .line 355
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public isGroupSummary(Landroid/app/Notification;)Z
    .locals 1
    .parameter "n"

    .prologue
    .line 350
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

*/}
