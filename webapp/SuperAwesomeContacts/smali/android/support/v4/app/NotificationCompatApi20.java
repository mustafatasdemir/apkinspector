package android.support.v4.app; class NotificationCompatApi20 { void a() { int a;
a=0;// .class Landroid/support/v4/app/NotificationCompatApi20;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NotificationCompatApi20.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/app/NotificationCompatApi20$Builder;
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
a=0;//     #p0=(Reference,Landroid/support/v4/app/NotificationCompatApi20;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getAction(Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;//     .param p1, "actionIndex"    # I
a=0;//     .param p2, "actionFactory"    # Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;//     .param p3, "remoteInputFactory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;
a=0;// 
a=0;//     #v0=(Reference,[Landroid/app/Notification$Action;);
a=0;//     aget-object v0, v0, p1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0, p2, p3}, Landroid/support/v4/app/NotificationCompatApi20;->getActionCompatFromAction(Landroid/app/Notification$Action;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/NotificationCompatBase$Action;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getActionCompatFromAction(Landroid/app/Notification$Action;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 6
a=0;//     .param p0, "action"    # Landroid/app/Notification$Action;
a=0;//     .param p1, "actionFactory"    # Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;//     .param p2, "remoteInputFactory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     invoke-virtual {p0}, Landroid/app/Notification$Action;->getRemoteInputs()[Landroid/app/RemoteInput;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[Landroid/app/RemoteInput;);
a=0;//     invoke-static {v0, p2}, Landroid/support/v4/app/RemoteInputCompatApi20;->toCompat([Landroid/app/RemoteInput;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 111
a=0;//     .local v5, "remoteInputs":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     #v5=(Reference,[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);
a=0;//     iget v1, p0, Landroid/app/Notification$Action;->icon:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/app/Notification$Action;->title:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     iget-object v3, p0, Landroid/app/Notification$Action;->actionIntent:Landroid/app/PendingIntent;
a=0;// 
a=0;//     #v3=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-virtual {p0}, Landroid/app/Notification$Action;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/os/Bundle;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static getActionFromActionCompat(Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/app/Notification$Action;
a=0;//     .locals 11
a=0;//     .param p0, "actionCompat"    # Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     new-instance v7, Landroid/app/Notification$Action$Builder;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/app/Notification$Action$Builder;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getIcon()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getActionIntent()Landroid/app/PendingIntent;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/app/PendingIntent;);
a=0;//     invoke-direct {v7, v8, v9, v10}, Landroid/app/Notification$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
a=0;// 
a=0;//     #v7=(Reference,Landroid/app/Notification$Action$Builder;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v7, v8}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 120
a=0;//     .local v0, "actionBuilder":Landroid/app/Notification$Action$Builder;
a=0;//     #v0=(Reference,Landroid/app/Notification$Action$Builder;);
a=0;//     invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 121
a=0;//     .local v5, "remoteInputCompats":[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
a=0;//     #v5=(Reference,[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     invoke-static {v5}, Landroid/support/v4/app/RemoteInputCompatApi20;->fromCompat([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/app/RemoteInput;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 123
a=0;//     .local v6, "remoteInputs":[Landroid/app/RemoteInput;
a=0;//     #v6=(Reference,[Landroid/app/RemoteInput;);
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .local v1, "arr$":[Landroid/app/RemoteInput;
a=0;//     #v1=(Reference,[Landroid/app/RemoteInput;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v4=(Conflicted);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     aget-object v4, v1, v2
a=0;// 
a=0;//     .line 124
a=0;//     .local v4, "remoteInput":Landroid/app/RemoteInput;
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0, v4}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;
a=0;// 
a=0;//     .line 123
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     .end local v1    # "arr$":[Landroid/app/RemoteInput;
a=0;//     .end local v2    # "i$":I
a=0;//     .end local v3    # "len$":I
a=0;//     .end local v4    # "remoteInput":Landroid/app/RemoteInput;
a=0;//     .end local v6    # "remoteInputs":[Landroid/app/RemoteInput;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     return-object v7
a=0;// .end method
a=0;// 
a=0;// .method public static getActionsFromParcelableArrayList(Ljava/util/ArrayList;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .locals 4
a=0;//     .param p1, "actionFactory"    # Landroid/support/v4/app/NotificationCompatBase$Action$Factory;
a=0;//     .param p2, "remoteInputFactory"    # Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;",
a=0;//             "Landroid/support/v4/app/NotificationCompatBase$Action$Factory;",
a=0;//             "Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;",
a=0;//             ")[",
a=0;//             "Landroid/support/v4/app/NotificationCompatBase$Action;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     .local p0, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Reference,[Landroid/support/v4/app/NotificationCompatBase$Action;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 143
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-interface {p1, v3}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->newArray(I)[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 144
a=0;//     .local v1, "actions":[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     #v1=(Reference,[Landroid/support/v4/app/NotificationCompatBase$Action;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     .line 145
a=0;//     invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/app/Notification$Action;
a=0;// 
a=0;//     .line 146
a=0;//     .local v0, "action":Landroid/app/Notification$Action;
a=0;//     invoke-static {v0, p1, p2}, Landroid/support/v4/app/NotificationCompatApi20;->getActionCompatFromAction(Landroid/app/Notification$Action;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/app/NotificationCompatBase$Action;);
a=0;//     aput-object v3, v1, v2
a=0;// 
a=0;//     .line 144
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getGroup(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     invoke-virtual {p0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static getLocalOnly(Landroid/app/Notification;)Z
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iget v0, p0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0x100
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompatBase$Action;)Ljava/util/ArrayList;
a=0;//     .locals 6
a=0;//     .param p0, "actions"    # [Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Landroid/support/v4/app/NotificationCompatBase$Action;",
a=0;//             ")",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/os/Parcelable;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     if-nez p0, :cond_1
a=0;// 
a=0;//     .line 159
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 165
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Ljava/util/ArrayList;);v5=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 161
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
a=0;//     new-instance v4, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/util/ArrayList;);
a=0;//     array-length v5, p0
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 162
a=0;//     .local v4, "parcelables":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     .local v1, "arr$":[Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     #v1=(Reference,[Landroid/support/v4/app/NotificationCompatBase$Action;);
a=0;//     array-length v3, v1
a=0;// 
a=0;//     .local v3, "len$":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i$":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v5=(Conflicted);
a=0;//     if-ge v2, v3, :cond_0
a=0;// 
a=0;//     aget-object v0, v1, v2
a=0;// 
a=0;//     .line 163
a=0;//     .local v0, "action":Landroid/support/v4/app/NotificationCompatBase$Action;
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0}, Landroid/support/v4/app/NotificationCompatApi20;->getActionFromActionCompat(Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/app/Notification$Action;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/app/Notification$Action;);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 162
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static getSortKey(Landroid/app/Notification;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     invoke-virtual {p0}, Landroid/app/Notification;->getSortKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static isGroupSummary(Landroid/app/Notification;)Z
a=0;//     .locals 1
a=0;//     .param p0, "notif"    # Landroid/app/Notification;
a=0;// 
a=0;//     .prologue
a=0;//     .line 177
a=0;//     iget v0, p0, Landroid/app/Notification;->flags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit16 v0, v0, 0x200
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
