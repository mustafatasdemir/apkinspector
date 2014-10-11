package android.support.v4.app; class NotificationManagerCompat$NotifyTask { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationManagerCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/NotificationManagerCompat$Task;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationManagerCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "NotifyTask"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final id:I
a=0;// 
a=0;// .field final notif:Landroid/app/Notification;
a=0;// 
a=0;// .field final packageName:Ljava/lang/String;
a=0;// 
a=0;// .field final tag:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
a=0;//     .locals 0
a=0;//     .param p1, "packageName"    # Ljava/lang/String;
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "tag"    # Ljava/lang/String;
a=0;//     .param p4, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 554
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 555
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 556
a=0;//     iput p2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->id:I
a=0;// 
a=0;//     .line 557
a=0;//     iput-object p3, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->tag:Ljava/lang/String;
a=0;// 
a=0;//     .line 558
a=0;//     iput-object p4, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->notif:Landroid/app/Notification;
a=0;// 
a=0;//     .line 559
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public send(Landroid/support/v4/app/INotificationSideChannel;)V
a=0;//     .locals 4
a=0;//     .param p1, "service"    # Landroid/support/v4/app/INotificationSideChannel;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 563
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->id:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->tag:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     iget-object v3, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->notif:Landroid/app/Notification;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/Notification;);
a=0;//     invoke-interface {p1, v0, v1, v2, v3}, Landroid/support/v4/app/INotificationSideChannel;->notify(Ljava/lang/String;ILjava/lang/String;Landroid/app/Notification;)V
a=0;// 
a=0;//     .line 564
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 567
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "NotifyTask["
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 568
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "packageName:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 569
a=0;//     const-string v1, ", id:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->id:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 570
a=0;//     const-string v1, ", tag:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$NotifyTask;->tag:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 571
a=0;//     const-string v1, "]"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 572
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
