package android.support.v4.app; class NotificationCompat$Action {/*

.class public Landroid/support/v4/app/NotificationCompat$Action;
.super Landroid/support/v4/app/NotificationCompatBase$Action;
.source "NotificationCompat.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Action"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;,
        Landroid/support/v4/app/NotificationCompat$Action$Extender;,
        Landroid/support/v4/app/NotificationCompat$Action$Builder;
    }
.end annotation


# static fields
.field public static final FACTORY:Landroid/support/v4/app/NotificationCompatBase$Action$Factory;


# instance fields
.field public actionIntent:Landroid/app/PendingIntent;

.field public icon:I

.field private final mExtras:Landroid/os/Bundle;

.field private final mRemoteInputs:[Landroid/support/v4/app/RemoteInput;

.field public title:Ljava/lang/CharSequence;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 1700
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Action$1;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$Action$1;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/app/NotificationCompat$Action;->FACTORY:Landroid/support/v4/app/NotificationCompatBase$Action$Factory;

    return-void
.end method

.method public constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
    .locals 6
    .parameter "icon"
    .parameter "title"
    .parameter "intent"

    .prologue
    .line 1447
    new-instance v4, Landroid/os/Bundle;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    move-object v0, p0

    #v0=(UninitThis);
    move v1, p1

    #v1=(Integer);
    move-object v2, p2

    #v2=(Reference);
    move-object v3, p3

    #v3=(Reference);
    invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;)V

    .line 1448
    #v0=(Reference);p0=(Reference);
    return-void
.end method

.method private constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;)V
    .locals 0
    .parameter "icon"
    .parameter "title"
    .parameter "intent"
    .parameter "extras"
    .parameter "remoteInputs"

    .prologue
    .line 1451
    invoke-direct {p0}, Landroid/support/v4/app/NotificationCompatBase$Action;-><init>()V

    .line 1452
    #p0=(Reference);
    iput p1, p0, Landroid/support/v4/app/NotificationCompat$Action;->icon:I

    .line 1453
    iput-object p2, p0, Landroid/support/v4/app/NotificationCompat$Action;->title:Ljava/lang/CharSequence;

    .line 1454
    iput-object p3, p0, Landroid/support/v4/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;

    .line 1455
    if-eqz p4, :cond_0

    .end local p4
    :goto_0
    iput-object p4, p0, Landroid/support/v4/app/NotificationCompat$Action;->mExtras:Landroid/os/Bundle;

    .line 1456
    iput-object p5, p0, Landroid/support/v4/app/NotificationCompat$Action;->mRemoteInputs:[Landroid/support/v4/app/RemoteInput;

    .line 1457
    return-void

    .line 1455
    .restart local p4
    :cond_0
    new-instance p4, Landroid/os/Bundle;

    .end local p4
    #p4=(UninitRef);
    invoke-direct {p4}, Landroid/os/Bundle;-><init>()V

    #p4=(Reference);
    goto :goto_0
.end method

.method synthetic constructor <init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;Landroid/support/v4/app/NotificationCompat$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"
    .parameter "x4"
    .parameter "x5"

    .prologue
    .line 1428
    invoke-direct/range {p0 .. p5}, Landroid/support/v4/app/NotificationCompat$Action;-><init>(ILjava/lang/CharSequence;Landroid/app/PendingIntent;Landroid/os/Bundle;[Landroid/support/v4/app/RemoteInput;)V

    #p0=(Reference);
    return-void
.end method

.method static synthetic access$300(Landroid/support/v4/app/NotificationCompat$Action;)Landroid/os/Bundle;
    .locals 1
    .parameter "x0"

    .prologue
    .line 1428
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->mExtras:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method protected getActionIntent()Landroid/app/PendingIntent;
    .locals 1

    .prologue
    .line 1471
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->actionIntent:Landroid/app/PendingIntent;

    #v0=(Reference);
    return-object v0
.end method

.method public getExtras()Landroid/os/Bundle;
    .locals 1

    .prologue
    .line 1478
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->mExtras:Landroid/os/Bundle;

    #v0=(Reference);
    return-object v0
.end method

.method protected getIcon()I
    .locals 1

    .prologue
    .line 1461
    iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->icon:I

    #v0=(Integer);
    return v0
.end method

.method public getRemoteInputs()[Landroid/support/v4/app/RemoteInput;
    .locals 1

    .prologue
    .line 1486
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->mRemoteInputs:[Landroid/support/v4/app/RemoteInput;

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic getRemoteInputs()[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    .locals 1

    .prologue
    .line 1428
    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompat$Action;->getRemoteInputs()[Landroid/support/v4/app/RemoteInput;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method protected getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 1466
    iget-object v0, p0, Landroid/support/v4/app/NotificationCompat$Action;->title:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

*/}
