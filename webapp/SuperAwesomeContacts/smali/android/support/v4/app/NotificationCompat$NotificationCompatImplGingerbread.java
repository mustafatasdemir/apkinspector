package android.support.v4.app; class NotificationCompat$NotificationCompatImplGingerbread { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompat$NotificationCompatImplGingerbread;
a=0;// .super Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "NotificationCompatImplGingerbread"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 359
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/NotificationCompat$NotificationCompatImplBase;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$NotificationCompatImplGingerbread;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public build(Landroid/support/v4/app/NotificationCompat$Builder;)Landroid/app/Notification;
a=0;//     .locals 6
a=0;//     .param p1, "b"    # Landroid/support/v4/app/NotificationCompat$Builder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     iget-object v0, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mNotification:Landroid/app/Notification;
a=0;// 
a=0;//     .line 363
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
a=0;//     .line 365
a=0;//     iget-object v1, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     iget-object v3, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     iget-object v4, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mContentIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     iget-object v5, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mFullScreenIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-static/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatGingerbread;->add(Landroid/app/Notification;Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/app/PendingIntent;)Landroid/app/Notification;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 368
a=0;//     iget v1, p1, Landroid/support/v4/app/NotificationCompat$Builder;->mPriority:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 369
a=0;//     iget v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     or-int/lit16 v1, v1, 0x80
a=0;// 
a=0;//     iput v1, v0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     .line 371
a=0;//     :cond_0
a=0;//     return-object v0
a=0;// .end method
}}
