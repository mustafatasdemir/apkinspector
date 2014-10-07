package android.support.v4.app; class NotificationCompatApi20 {/*

.class Landroid/support/v4/app/NotificationCompatApi20;
.super Ljava/lang/Object;
.source "NotificationCompatApi20.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/NotificationCompatApi20$Builder;
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 31
    #p0=(Reference);
    return-void
.end method

.method public static getAction(Landroid/app/Notification;ILandroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 1
    .parameter "notif"
    .parameter "actionIndex"
    .parameter "actionFactory"
    .parameter "remoteInputFactory"

    .prologue
    .line 103
    iget-object v0, p0, Landroid/app/Notification;->actions:[Landroid/app/Notification$Action;

    #v0=(Reference);
    aget-object v0, v0, p1

    #v0=(Null);
    invoke-static {v0, p2, p3}, Landroid/support/v4/app/NotificationCompatApi20;->getActionCompatFromAction(Landroid/app/Notification$Action;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method private static getActionCompatFromAction(Landroid/app/Notification$Action;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 6
    .parameter "action"
    .parameter "actionFactory"
    .parameter "remoteInputFactory"

    .prologue
    .line 109
    invoke-virtual {p0}, Landroid/app/Notification$Action;->getRemoteInputs()[Landroid/app/RemoteInput;

    move-result-object v0

    #v0=(Reference);
    invoke-static {v0, p2}, Landroid/support/v4/app/RemoteInputCompatApi20;->toCompat([Landroid/app/RemoteInput;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v5

    .line 111
    .local v5, remoteInputs:[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    #v5=(Reference);
    iget v1, p0, Landroid/app/Notification$Action;->icon:I

    #v1=(Integer);
    iget-object v2, p0, Landroid/app/Notification$Action;->title:Ljava/lang/CharSequence;

    #v2=(Reference);
    iget-object v3, p0, Landroid/app/Notification$Action;->actionIntent:Landroid/app/PendingIntent;

    #v3=(Reference);
    invoke-virtual {p0}, Landroid/app/Notification$Action;->getExtras()Landroid/os/Bundle;

    move-result-object v4

    #v4=(Reference);
    move-object v0, p1

    invoke-interface/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->build(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v0

    return-object v0
.end method

.method private static getActionFromActionCompat(Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/app/Notification$Action;
    .locals 11
    .parameter "actionCompat"

    .prologue
    .line 117
    new-instance v7, Landroid/app/Notification$Action$Builder;

    #v7=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getIcon()I

    move-result v8

    #v8=(Integer);
    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getTitle()Ljava/lang/CharSequence;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getActionIntent()Landroid/app/PendingIntent;

    move-result-object v10

    #v10=(Reference);
    invoke-direct {v7, v8, v9, v10}, Landroid/app/Notification$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V

    #v7=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getExtras()Landroid/os/Bundle;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {v7, v8}, Landroid/app/Notification$Action$Builder;->addExtras(Landroid/os/Bundle;)Landroid/app/Notification$Action$Builder;

    move-result-object v0

    .line 120
    .local v0, actionBuilder:Landroid/app/Notification$Action$Builder;
    #v0=(Reference);
    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;

    move-result-object v5

    .line 121
    .local v5, remoteInputCompats:[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    #v5=(Reference);
    if-eqz v5, :cond_0

    .line 122
    invoke-static {v5}, Landroid/support/v4/app/RemoteInputCompatApi20;->fromCompat([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;)[Landroid/app/RemoteInput;

    move-result-object v6

    .line 123
    .local v6, remoteInputs:[Landroid/app/RemoteInput;
    #v6=(Reference);
    move-object v1, v6

    .local v1, arr$:[Landroid/app/RemoteInput;
    #v1=(Reference);
    array-length v3, v1

    .local v3, len$:I
    #v3=(Integer);
    const/4 v2, 0x0

    .local v2, i$:I
    :goto_0
    #v2=(Integer);v4=(Conflicted);
    if-ge v2, v3, :cond_0

    aget-object v4, v1, v2

    .line 124
    .local v4, remoteInput:Landroid/app/RemoteInput;
    #v4=(Null);
    invoke-virtual {v0, v4}, Landroid/app/Notification$Action$Builder;->addRemoteInput(Landroid/app/RemoteInput;)Landroid/app/Notification$Action$Builder;

    .line 123
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 127
    .end local v1           #arr$:[Landroid/app/RemoteInput;
    .end local v2           #i$:I
    .end local v3           #len$:I
    .end local v4           #remoteInput:Landroid/app/RemoteInput;
    .end local v6           #remoteInputs:[Landroid/app/RemoteInput;
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
    invoke-virtual {v0}, Landroid/app/Notification$Action$Builder;->build()Landroid/app/Notification$Action;

    move-result-object v7

    return-object v7
.end method

.method public static getActionsFromParcelableArrayList(Ljava/util/ArrayList;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)[Landroid/support/v4/app/NotificationCompatBase$Action;
    .locals 4
    .parameter
    .parameter "actionFactory"
    .parameter "remoteInputFactory"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/os/Parcelable;",
            ">;",
            "Landroid/support/v4/app/NotificationCompatBase$Action$Factory;",
            "Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;",
            ")[",
            "Landroid/support/v4/app/NotificationCompatBase$Action;"
        }
    .end annotation

    .prologue
    .line 140
    .local p0, parcelables:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
    if-nez p0, :cond_1

    .line 141
    const/4 v1, 0x0

    .line 148
    :cond_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);
    return-object v1

    .line 143
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v3

    #v3=(Integer);
    invoke-interface {p1, v3}, Landroid/support/v4/app/NotificationCompatBase$Action$Factory;->newArray(I)[Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v1

    .line 144
    .local v1, actions:[Landroid/support/v4/app/NotificationCompatBase$Action;
    #v1=(Reference);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v0=(Conflicted);v2=(Integer);v3=(Conflicted);
    array-length v3, v1

    #v3=(Integer);
    if-ge v2, v3, :cond_0

    .line 145
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/app/Notification$Action;

    .line 146
    .local v0, action:Landroid/app/Notification$Action;
    invoke-static {v0, p1, p2}, Landroid/support/v4/app/NotificationCompatApi20;->getActionCompatFromAction(Landroid/app/Notification$Action;Landroid/support/v4/app/NotificationCompatBase$Action$Factory;Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;)Landroid/support/v4/app/NotificationCompatBase$Action;

    move-result-object v3

    #v3=(Reference);
    aput-object v3, v1, v2

    .line 144
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public static getGroup(Landroid/app/Notification;)Ljava/lang/String;
    .locals 1
    .parameter "notif"

    .prologue
    .line 173
    invoke-virtual {p0}, Landroid/app/Notification;->getGroup()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static getLocalOnly(Landroid/app/Notification;)Z
    .locals 1
    .parameter "notif"

    .prologue
    .line 169
    iget v0, p0, Landroid/app/Notification;->flags:I

    #v0=(Integer);
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public static getParcelableArrayListForActions([Landroid/support/v4/app/NotificationCompatBase$Action;)Ljava/util/ArrayList;
    .locals 6
    .parameter "actions"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Landroid/support/v4/app/NotificationCompatBase$Action;",
            ")",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/os/Parcelable;",
            ">;"
        }
    .end annotation

    .prologue
    .line 158
    if-nez p0, :cond_1

    .line 159
    const/4 v4, 0x0

    .line 165
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference);v5=(Conflicted);
    return-object v4

    .line 161
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    new-instance v4, Ljava/util/ArrayList;

    #v4=(UninitRef);
    array-length v5, p0

    #v5=(Integer);
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 162
    .local v4, parcelables:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/os/Parcelable;>;"
    #v4=(Reference);
    move-object v1, p0

    .local v1, arr$:[Landroid/support/v4/app/NotificationCompatBase$Action;
    #v1=(Reference);
    array-length v3, v1

    .local v3, len$:I
    #v3=(Integer);
    const/4 v2, 0x0

    .local v2, i$:I
    :goto_0
    #v0=(Conflicted);v2=(Integer);v5=(Conflicted);
    if-ge v2, v3, :cond_0

    aget-object v0, v1, v2

    .line 163
    .local v0, action:Landroid/support/v4/app/NotificationCompatBase$Action;
    #v0=(Null);
    invoke-static {v0}, Landroid/support/v4/app/NotificationCompatApi20;->getActionFromActionCompat(Landroid/support/v4/app/NotificationCompatBase$Action;)Landroid/app/Notification$Action;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 162
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public static getSortKey(Landroid/app/Notification;)Ljava/lang/String;
    .locals 1
    .parameter "notif"

    .prologue
    .line 181
    invoke-virtual {p0}, Landroid/app/Notification;->getSortKey()Ljava/lang/String;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public static isGroupSummary(Landroid/app/Notification;)Z
    .locals 1
    .parameter "notif"

    .prologue
    .line 177
    iget v0, p0, Landroid/app/Notification;->flags:I

    #v0=(Integer);
    and-int/lit16 v0, v0, 0x200

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
