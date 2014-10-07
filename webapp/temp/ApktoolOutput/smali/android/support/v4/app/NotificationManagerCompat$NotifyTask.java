package android.support.v4.app; class NotificationManagerCompat$NotifyTask {/*

.class Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;
.super Ljava/lang/Object;
.source "NotificationManagerCompat.java"

# interfaces
.implements Landroid/support/v4/app/NotificationManagerCompat$Task;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationManagerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NotifyTask"
.end annotation


# instance fields
.field final id:I

.field final notif:Landroid/app/Notification;

.field final packageName:Ljava/lang/String;

.field final tag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
    .locals 0
    .parameter "packageName"
    .parameter "id"
    .parameter "tag"
    .parameter "notif"

    .prologue
    .line 554
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 555
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->packageName:Ljava/lang/String;

    .line 556
    iput p2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->id:I

    .line 557
    iput-object p3, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->tag:Ljava/lang/String;

    .line 558
    iput-object p4, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->notif:Landroid/app/Notification;

    .line 559
    return-void
.end method


# virtual methods
.method public send(Landroid/support/v4/app/INotificationSideChannel;)V
    .locals 4
    .parameter "service"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 563
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->packageName:Ljava/lang/String;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->id:I

    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->tag:Ljava/lang/String;

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->notif:Landroid/app/Notification;

    #v3=(Reference);
    invoke-interface {p1, v0, v1, v2, v3}, Landroid/support/v4/app/INotificationSideChannel;->notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V

    .line 564
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 567
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v1, "NotifyTask["

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 568
    .local v0, sb:Ljava/lang/StringBuilder;
    #v0=(Reference);
    const-string v1, "packageName:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->packageName:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 569
    const-string v1, ", id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->id:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 570
    const-string v1, ", tag:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->tag:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 571
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 572
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

*/}
