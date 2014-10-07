package android.support.v4.app; class NotificationManagerCompatEclair {/*

.class Landroid/support/v4/app/NotificationManagerCompatEclair;
.super Ljava/lang/Object;
.source "NotificationManagerCompatEclair.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method static cancelNotification(Landroid/app/NotificationManager;Ljava/lang/String;I)V
    .locals 0
    .parameter "notificationManager"
    .parameter "tag"
    .parameter "id"

    .prologue
    .line 25
    invoke-virtual {p0, p1, p2}, Landroid/app/NotificationManager;->cancel(Ljava/lang/String;I)V

    .line 26
    return-void
.end method

.method public static postNotification(Landroid/app/NotificationManager;Ljava/lang/String;ILandroid/app/Notification;)V
    .locals 0
    .parameter "notificationManager"
    .parameter "tag"
    .parameter "id"
    .parameter "notification"

    .prologue
    .line 30
    invoke-virtual {p0, p1, p2, p3}, Landroid/app/NotificationManager;->notify(Ljava/lang/String;ILandroid/app/Notification;)V

    .line 31
    return-void
.end method

*/}
