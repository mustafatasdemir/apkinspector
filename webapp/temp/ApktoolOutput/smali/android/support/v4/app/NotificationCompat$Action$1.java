package android.support.v4.app; class NotificationCompat$Action$1 {/*

.class final Landroid/support/v4/app/NotificationCompat$Action$1;
.super Ljava/lang/Object;
.source "NotificationCompat.java"

# interfaces
.implements Landroid/support/v4/app/NotificationCompatBase$Action$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompat$Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 1700
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompat$Action;
    .locals 7
    .parameter "icon"
    .parameter "title"
    .parameter "actionIntent"
    .parameter "extras"
    .parameter "remoteInputs"

    .prologue
    .line 1705
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Action;

    #v0=(UninitRef);
    check-cast p5, [Landroid/support/v4/app/RemoteInput;

    .end local p5
    move-object v5, p5

    #v5=(Reference);
    check-cast v5, [Landroid/support/v4/app/RemoteInput;

    const/4 v6, 0x0

    #v6=(Null);
    move v1, p1

    #v1=(Integer);
    move-object v2, p2

    #v2=(Reference);
    move-object v3, p3

    #v3=(Reference);
    move-object v4, p4

    #v4=(Reference);
    invoke-direct/range {v0 .. v6}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;Landroid/support/v4/app/NotificationCompat$1;)V

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"
    .parameter "x4"

    .prologue
    .line 1700
    invoke-virtual/range {p0 .. p5}, Landroid/support/v4/app/NotificationCompat$Action$1;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompat$Action;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public newArray(I)[Landroid/support/v4/app/NotificationCompat$Action;
    .locals 1
    .parameter "length"

    .prologue
    .line 1711
    new-array v0, p1, [Landroid/support/v4/app/NotificationCompat$Action;

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic newArray(I)[Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 1
    .parameter "x0"

    .prologue
    .line 1700
    invoke-virtual {p0, p1}, Landroid/support/v4/app/NotificationCompat$Action$1;->newArray(I)[Landroid/support/v4/app/NotificationCompat$Action;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
