package android.support.v4.app; class NotificationManagerCompat$ImplBase {/*

.class Landroid/support/v4/app/NotificationManagerCompat$ImplBase;
.super Ljava/lang/Object;
.source "NotificationManagerCompat.java"

# interfaces
.implements Landroid/support/v4/app/NotificationManagerCompat$Impl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationManagerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ImplBase"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 117
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public cancelNotification(Landroid/app/NotificationManager;Ljava/lang/String;I)V
    .locals 0
    .parameter "notificationManager"
    .parameter "tag"
    .parameter "id"

    .prologue
    .line 121
    invoke-virtual {p1, p3}, Landroid/app/NotificationManager;->cancel(I)V

    .line 122
    return-void
.end method

.method public getSideChannelBindFlags()I
    .locals 1

    .prologue
    .line 132
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public postNotification(Landroid/app/NotificationManager;Ljava/lang/String;ILandroid/app/Notification;)V
    .locals 0
    .parameter "notificationManager"
    .parameter "tag"
    .parameter "id"
    .parameter "notification"

    .prologue
    .line 127
    invoke-virtual {p1, p3, p4}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 128
    return-void
.end method

*/}
