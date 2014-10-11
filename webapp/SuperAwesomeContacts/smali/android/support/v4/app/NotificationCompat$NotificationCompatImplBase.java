package android.support.v4.app; class NotificationCompat$NotificationCompatImplBase { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/NotificationCompat$NotificationCompatImpl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "NotificationCompatImplBase"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
a=0;//     .locals 5
a=0;//     .param p1, "b"    # Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 302
a=0;//     iget-object v0, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     .line 303
a=0;//     .local v0, "result":Landroid/app/Notification;
a=0;//     #v0=(Reference,Landroid/app/Notification;);
a=0;//     iget-object v1, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v3, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v4, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/app/Notification;->setLatestEventInfo(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     .line 306
a=0;//     iget v1, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 307
a=0;//     iget v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     or-int/lit16 v1, v1, 0x80
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 309
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAction(Landroid/app/Notification;I)Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;//     .param p2, "actionIndex"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionCount(Landroid/app/Notification;)I
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionsFromParcelableArrayList(Ljava/util/ArrayList;)[Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;)[",
a=0;//             "Landroid/support/v4/app/NotificationCompat$Action;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 330
a=0;//     .local p1, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 314
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getGroup(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 345
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getLocalOnly(Landroid/app/Notification;)Z
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 340
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompat$Action;)Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .param p1, "actions"    # [Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Landroid/support/v4/app/NotificationCompat$Action;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 335
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSortKey(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 355
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public isGroupSummary(Landroid/app/Notification;)Z
a=0;//     .locals 1
a=0;//     .param p1, "n"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 350
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
}}
