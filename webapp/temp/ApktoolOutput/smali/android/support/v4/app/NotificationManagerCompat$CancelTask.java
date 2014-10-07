package android.support.v4.app; class NotificationManagerCompat$CancelTask {/*

.class Landroid/support/v4/app/NotificationManagerCompat$CancelTask;
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
    name = "CancelTask"
.end annotation


# instance fields
.field final all:Z

.field final id:I

.field final packageName:Ljava/lang/String;

.field final tag:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1
    .parameter "packageName"

    .prologue
    .line 582
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 583
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;

    .line 584
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->id:I

    .line 585
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->tag:Ljava/lang/String;

    .line 586
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->all:Z

    .line 587
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1
    .parameter "packageName"
    .parameter "id"
    .parameter "tag"

    .prologue
    .line 589
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 590
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;

    .line 591
    iput p2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->id:I

    .line 592
    iput-object p3, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->tag:Ljava/lang/String;

    .line 593
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->all:Z

    .line 594
    return-void
.end method


# virtual methods
.method public send(Landroid/support/v4/app/INotificationSideChannel;)V
    .locals 3
    .parameter "service"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Landroid/os/RemoteException;
        }
    .end annotation

    .prologue
    .line 598
    iget-boolean v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->all:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 599
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;

    #v0=(Reference);
    invoke-interface {p1, v0}, Landroid/support/v4/app/INotificationSideChannel;->cancelAll(Ljava/lang/String;)V

    .line 603
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 601
    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->id:I

    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->tag:Ljava/lang/String;

    #v2=(Reference);
    invoke-interface {p1, v0, v1, v2}, Landroid/support/v4/app/INotificationSideChannel;->cancel(Ljava/lang/String;ILjava/lang/String;)V

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .prologue
    .line 606
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    const-string v1, "CancelTask["

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 607
    .local v0, sb:Ljava/lang/StringBuilder;
    #v0=(Reference);
    const-string v1, "packageName:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 608
    const-string v1, ", id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->id:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 609
    const-string v1, ", tag:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->tag:Ljava/lang/String;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 610
    const-string v1, ", all:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-boolean v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->all:Z

    #v2=(Boolean);
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 611
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 612
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    return-object v1
.end method

*/}
