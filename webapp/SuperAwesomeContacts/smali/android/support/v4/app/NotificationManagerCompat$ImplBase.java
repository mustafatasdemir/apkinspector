package android.support.v4.app; class NotificationManagerCompat$ImplBase { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationManagerCompat$ImplBase;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationManagerCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/NotificationManagerCompat$Impl;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationManagerCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "ImplBase"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationManagerCompat$ImplBase;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public cancelNotification(Landroid/app/NotificationManager;Ljava/lang/String;I)V
a=0;//     .locals 0
a=0;//     .param p1, "notificationManager"    # Landroid/app/NotificationManager;
a=0;//     .param p2, "tag"    # Ljava/lang/String;
a=0;//     .param p3, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     invoke-virtual {p1, p3}, Landroid/app/NotificationManager;->cancel(I)V
a=0;// 
a=0;//     .line 122
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getSideChannelBindFlags()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public postNotification(Landroid/app/NotificationManager;Ljava/lang/String;ILandroid/app/Notification;)V
a=0;//     .locals 0
a=0;//     .param p1, "notificationManager"    # Landroid/app/NotificationManager;
a=0;//     .param p2, "tag"    # Ljava/lang/String;
a=0;//     .param p3, "id"    # I
a=0;//     .param p4, "notification"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     invoke-virtual {p1, p3, p4}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V
a=0;// 
a=0;//     .line 128
a=0;//     return-void
a=0;// .end method
}}
