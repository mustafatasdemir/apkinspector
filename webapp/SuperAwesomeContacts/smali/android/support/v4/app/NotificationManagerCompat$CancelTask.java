package android.support.v4.app; class NotificationManagerCompat$CancelTask { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationManagerCompat$CancelTask;
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
a=0;//     name = "CancelTask"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final all:Z
a=0;// 
a=0;// .field final id:I
a=0;// 
a=0;// .field final packageName:Ljava/lang/String;
a=0;// 
a=0;// .field final tag:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "packageName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 582
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 583
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$CancelTask;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 584
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->id:I
a=0;// 
a=0;//     .line 585
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->tag:Ljava/lang/String;
a=0;// 
a=0;//     .line 586
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->all:Z
a=0;// 
a=0;//     .line 587
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
a=0;//     .locals 1
a=0;//     .param p1, "packageName"    # Ljava/lang/String;
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "tag"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 589
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 590
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$CancelTask;);
a=0;//     iput-object p1, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     .line 591
a=0;//     iput p2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->id:I
a=0;// 
a=0;//     .line 592
a=0;//     iput-object p3, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->tag:Ljava/lang/String;
a=0;// 
a=0;//     .line 593
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->all:Z
a=0;// 
a=0;//     .line 594
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public send(Landroid/support/v4/app/INotificationSideChannel;)V
a=0;//     .locals 3
a=0;//     .param p1, "service"    # Landroid/support/v4/app/INotificationSideChannel;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Landroid/os/RemoteException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 598
a=0;//     iget-boolean v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->all:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 599
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v0}, Landroid/support/v4/app/INotificationSideChannel;->cancelAll(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 603
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 601
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     iget v1, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->id:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->tag:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v0, v1, v2}, Landroid/support/v4/app/INotificationSideChannel;->cancel(Ljava/lang/String;ILjava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "CancelTask["
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 607
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v1, "packageName:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 608
a=0;//     const-string v1, ", id:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->id:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 609
a=0;//     const-string v1, ", tag:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->tag:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 610
a=0;//     const-string v1, ", all:"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-boolean v2, p0, Landroid/support/v4/app/NotificationManagerCompat$CancelTask;->all:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 611
a=0;//     const-string v1, "]"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 612
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     return-object v1
a=0;// .end method
}}
