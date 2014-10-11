package android.support.v4.app; class NotificationCompatKitKat { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompatKitKat;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompatKitKat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NotificationCompatKitKat$Builder;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompatKitKat;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getAction(Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 8
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;//     .param p1, "actionIndex"    # I
a=0;//     .param p2, "factory"    # Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;//     .param p3, "remoteInputFactory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/app/Notification$Action;);
a=0;//     aget-object v6, v0, p1
a=0;// 
a=0;//     .line 124
a=0;//     .local v6, "action":Landroid/app/Notification$Action;
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 125
a=0;//     .local v5, "actionExtras":Landroid/os/Bundle;
a=0;//     #v5=(Null);
a=0;//     iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "android.support.actionExtras"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 127
a=0;//     .local v7, "actionExtrasMap":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Bundle;>;"
a=0;//     #v7=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {v7, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .end local v5    # "actionExtras":Landroid/os/Bundle;
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Landroid/os/Bundle;
a=0;// 
a=0;//     .line 130
a=0;//     .restart local v5    # "actionExtras":Landroid/os/Bundle;
a=0;//     :cond_0
a=0;//     iget v2, v6, Landroid/app/Notification$Action;->icon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, v6, Landroid/app/Notification$Action;->title:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v4, v6, Landroid/app/Notification$Action;->actionIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/PendingIntent;);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     move-object v1, p3
a=0;// 
a=0;//     invoke-static/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatJellybean;->readAction(Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getActionCount(Landroid/app/Notification;)I
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/app/Notification$Action;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;
a=0;// 
a=0;//     array-length v0, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,[Landroid/app/Notification$Action;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getExtras(Landroid/app/Notification;)Landroid/os/Bundle;
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getGroup(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android.support.groupKey"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getLocalOnly(Landroid/app/Notification;)Z
a=0;//     .locals 2
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android.support.localOnly"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static getSortKey(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android.support.sortKey"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static isGroupSummary(Landroid/app/Notification;)Z
a=0;//     .locals 2
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     iget-object v0, p0, Landroid/app/Notification;->extras:Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     const-string v1, "android.support.isGroupSummary"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
