package android.support.v4.app; class NotificationCompat$Action$1 { void a() { int a;
a=0;// .class final Landroid/support/v4/app/NotificationCompat$Action$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompat.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/NotificationCompat$Action;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1700
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompat$Action$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .locals 7
a=0;//     .param p1, "icon"    # I
a=0;//     .param p2, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "actionIntent"    # Landroid/app/PendingIntent;
a=0;//     .param p4, "extras"    # Landroid/os/Bundle;
a=0;//     .param p5, "remoteInputs"    # [Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1705
a=0;//     new-instance v0, Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     check-cast p5, [Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     .end local p5    # "remoteInputs":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     move-object v5, p5
a=0;// 
a=0;//     #v5=(Reference,[Landroid/support/v4/app/RemoteInput;);
a=0;//     check-cast v5, [Landroid/support/v4/app/RemoteInput;
a=0;// 
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v2, p2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object v3, p3
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/PendingIntent;);
a=0;//     move-object v4, p4
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-direct/range {v0 .. v6}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;Landroid/support/v4/app/NotificationCompat$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # I
a=0;//     .param p2, "x1"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "x2"    # Landroid/app/PendingIntent;
a=0;//     .param p4, "x3"    # Landroid/os/Bundle;
a=0;//     .param p5, "x4"    # [Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1700
a=0;//     invoke-virtual/range {p0 .. p5}, Landroid/support/v4/app/NotificationCompat$Action$1;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public newArray(I)[Landroid/support/v4/app/NotificationCompat$Action;
a=0;//     .locals 1
a=0;//     .param p1, "length"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1711
a=0;//     new-array v0, p1, [Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic newArray(I)[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1700
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/NotificationCompat$Action$1;->newArray(I)[Landroid/support/v4/app/NotificationCompat$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Landroid/support/v4/app/NotificationCompat$Action;);
a=0;//     return-object v0
a=0;// .end method
}}
