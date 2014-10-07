package android.support.v4.app; class NotificationCompatKitKat {/*

.class Landroid/support/v4/app/NotificationCompatKitKat;
.super Ljava/lang/Object;
.source "NotificationCompatKitKat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/NotificationCompatKitKat$Builder;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    #p0=(Reference);
    return-void
.end method

.method public static getAction(Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 8
    .parameter "notif"
    .parameter "actionIndex"
    .parameter "factory"
    .parameter "remoteInputFactory"

    .prologue
    .line 123
    iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;

    #v0=(Reference);
    aget-object v6, v0, p1

    .line 124
    .local v6, action:Landroid/app/Notification$Action;
    #v6=(Null);
    const/4 v5, 0x0

    .line 125
    .local v5, actionExtras:Landroid/os/Bundle;
    #v5=(Null);
    iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    const-string v1, "android.support.actionExtras"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v7

    .line 127
    .local v7, actionExtrasMap:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Bundle;>;"
    #v7=(Reference);
    if-eqz v7, :cond_0

    .line 128
    invoke-virtual {v7, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    .end local v5           #actionExtras:Landroid/os/Bundle;
    #v5=(Reference);
    check-cast v5, Landroid/os/Bundle;

    .line 130
    .restart local v5       #actionExtras:Landroid/os/Bundle;
    :cond_0
    iget v2, v6, Landroid/app/Notification$Action;->icon:I

    #v2=(Integer);
    iget-object v3, v6, Landroid/app/Notification$Action;->title:Ljava/lang/CharSequence;

    #v3=(Reference);
    iget-object v4, v6, Landroid/app/Notification$Action;->actionIntent:Landroid/app/PendingIntent;

    #v4=(Reference);
    move-object v0, p2

    move-object v1, p3

    invoke-static/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatJellybean;->readAction(Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v0

    return-object v0
.end method

.method public static getActionCount(Landroid/app/Notification;)I
    .locals 1
    .parameter "notif"

    .prologue
    .line 117
    iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;

    array-length v0, v0

    :goto_0
    #v0=(Integer);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public static getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
    .locals 1
    .parameter "notif"

    .prologue
    .line 113
    iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method

.method public static getGroup(Landroid/app/Notification;)Ljava/lang/String;
    .locals 2
    .parameter "notif"

    .prologue
    .line 139
    iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "android.support.groupKey"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static getLocalOnly(Landroid/app/Notification;)Z
    .locals 2
    .parameter "notif"

    .prologue
    .line 135
    iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "android.support.localOnly"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public static getSortKey(Landroid/app/Notification;)Ljava/lang/String;
    .locals 2
    .parameter "notif"

    .prologue
    .line 147
    iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "android.support.sortKey"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static isGroupSummary(Landroid/app/Notification;)Z
    .locals 2
    .parameter "notif"

    .prologue
    .line 143
    iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    #v0=(Reference);
    const-string v1, "android.support.isGroupSummary"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
