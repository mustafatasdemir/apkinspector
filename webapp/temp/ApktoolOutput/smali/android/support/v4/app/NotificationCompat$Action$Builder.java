package android.support.v4.app; class NotificationCompat$Action$Builder {/*

.class public final Landroid/support/v4/app/NotificationCompat$Action$Builder;
.super Ljava/lang/Object;
.source "NotificationCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompat$Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation


# instance fields
.field private final mExtras:Landroid/os/Bundle;

.field private final mIcon:I

.field private final mIntent:Landroid/app/PendingIntent;

.field private mRemoteInputs:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v4/app/RemoteInput;",
            ">;"
        }
    .end annotation
.end field

.field private final mTitle:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
    .locals 1
    .parameter "icon"
    .parameter "title"
    .parameter "intent"

    .prologue
    .line 1506
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    #v0=(Reference);
    invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v4/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)V

    .line 1507
    #p0=(Reference);
    return-void
.end method

.method private constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)V
    .locals 0
    .parameter "icon"
    .parameter "title"
    .parameter "intent"
    .parameter "extras"

    .prologue
    .line 1518
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1519
    #p0=(Reference);
    iput p1, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIcon:I

    .line 1520
    iput-object p2, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mTitle:Ljava/lang/CharSequence;

    .line 1521
    iput-object p3, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIntent:Landroid/app/PendingIntent;

    .line 1522
    iput-object p4, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;

    .line 1523
    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/NotificationCompat$Action;)V
    .locals 5
    .parameter "action"

    .prologue
    .line 1515
    iget v0, p1, Landroid/support/v4/app/NotificationCompat$Action;->icon:I

    #v0=(Integer);
    iget-object v1, p1, Landroid/support/v4/app/NotificationCompat$Action;->title:Ljava/lang/CharSequence;

    #v1=(Reference);
    iget-object v2, p1, Landroid/support/v4/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;

    #v2=(Reference);
    new-instance v3, Landroid/os/Bundle;

    #v3=(UninitRef);
    invoke-static {p1}, Landroid/support/v4/app/NotificationCompat$Action;->access$300(Landroid/support/v4/app/NotificationCompat$Action;)Landroid/os/Bundle;

    move-result-object v4

    #v4=(Reference);
    invoke-direct {v3, v4}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    #v3=(Reference);
    invoke-direct {p0, v0, v1, v2, v3}, Landroid/support/v4/app/NotificationCompat$Action$Builder;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;)V

    .line 1516
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public addExtras(Landroid/os/Bundle;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
    .locals 1
    .parameter "extras"

    .prologue
    .line 1533
    if-eqz p1, :cond_0

    .line 1534
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V

    .line 1536
    :cond_0
    #v0=(Conflicted);
    return-object p0
.end method

.method public addRemoteInput(Landroid/support/v4/app/RemoteInput;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
    .locals 1
    .parameter "remoteInput"

    .prologue
    .line 1556
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 1557
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;

    .line 1559
    :cond_0
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1560
    return-object p0
.end method

.method public build()Landroid/support/v4/app/NotificationCompat$Action;
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1578
    #v6=(Null);
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mRemoteInputs:Ljava/util/ArrayList;

    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    #v1=(Integer);
    new-array v1, v1, [Landroid/support/v4/app/RemoteInput;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/support/v4/app/RemoteInput;

    move-object v5, v0

    .line 1580
    .local v5, remoteInputs:[Landroid/support/v4/app/RemoteInput;
    :goto_0
    #v1=(Conflicted);v5=(Reference);
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Action;

    #v0=(UninitRef);
    iget v1, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIcon:I

    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mTitle:Ljava/lang/CharSequence;

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mIntent:Landroid/app/PendingIntent;

    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;

    #v4=(Reference);
    invoke-direct/range {v0 .. v6}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;Landroid/support/v4/app/NotificationCompat$1;)V

    #v0=(Reference);
    return-object v0

    .end local v5           #remoteInputs:[Landroid/support/v4/app/RemoteInput;
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);
    move-object v5, v6

    .line 1578
    #v5=(Null);
    goto :goto_0
.end method

.method public extend(Landroid/support/v4/app/NotificationCompat$Action$Extender;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
    .locals 0
    .parameter "extender"

    .prologue
    .line 1568
    invoke-interface {p1, p0}, Landroid/support/v4/app/NotificationCompat$Action$Extender;->extend(Landroid/support/v4/app/NotificationCompat$Action$Builder;)Landroid/support/v4/app/NotificationCompat$Action$Builder;

    .line 1569
    return-object p0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 1545
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action$Builder;->mExtras:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method

*/}
