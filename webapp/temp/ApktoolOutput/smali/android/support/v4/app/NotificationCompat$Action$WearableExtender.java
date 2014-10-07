package android.support.v4.app; class NotificationCompat$Action$WearableExtender {/*

.class public final Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
.super Ljava/lang/Object;
.source "NotificationCompat.java"

# interfaces
.implements Landroid/support/v4/app/NotificationCompat$Action$Extender;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/NotificationCompat$Action;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "WearableExtender"
.end annotation


# static fields
.field private static final DEFAULT_FLAGS:I = 0x1

.field private static final EXTRA_WEARABLE_EXTENSIONS:Ljava/lang/String; = "android.wearable.EXTENSIONS"

.field private static final FLAG_AVAILABLE_OFFLINE:I = 0x1

.field private static final KEY_FLAGS:Ljava/lang/String; = "flags"


# instance fields
.field private mFlags:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 1630
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1624
    #p0=(Reference);
    const/4 v0, 0x1

    #v0=(One);
    iput v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    .line 1631
    return-void
.end method

.method public constructor <init>(Landroid/support/v4/app/NotificationCompat$Action;)V
    .locals 4
    .parameter "action"

    .prologue
    const/4 v3, 0x1

    .line 1638
    #v3=(One);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1624
    #p0=(Reference);
    iput v3, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    .line 1639
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Action;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "android.wearable.EXTENSIONS"

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 1640
    .local v0, wearableBundle:Landroid/os/Bundle;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 1641
    const-string v1, "flags"

    invoke-virtual {v0, v1, v3}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    .line 1643
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method private setFlag(IZ)V
    .locals 2
    .parameter "mask"
    .parameter "value"

    .prologue
    .line 1691
    if-eqz p2, :cond_0

    .line 1692
    iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    #v0=(Integer);
    or-int/2addr v0, p1

    iput v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    .line 1696
    :goto_0
    #v1=(Conflicted);
    return-void

    .line 1694
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    #v0=(Integer);
    xor-int/lit8 v1, p1, -0x1

    #v1=(Integer);
    and-int/2addr v0, v1

    iput v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    goto :goto_0
.end method


# virtual methods
.method public clone()Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
    .locals 2

    .prologue
    .line 1664
    new-instance v0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;-><init>()V

    .line 1665
    .local v0, that:Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    #v1=(Integer);
    iput v1, v0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    .line 1666
    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .prologue
    .line 1612
    invoke-virtual {p0}, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->clone()Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public extend(Landroid/support/v4/app/NotificationCompat$Action$Builder;)Landroid/support/v4/app/NotificationCompat$Action$Builder;
    .locals 3
    .parameter "builder"

    .prologue
    .line 1652
    new-instance v0, Landroid/os/Bundle;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 1654
    .local v0, wearableBundle:Landroid/os/Bundle;
    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    if-eq v1, v2, :cond_0

    .line 1655
    const-string v1, "flags"

    #v1=(Reference);
    iget v2, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 1658
    :cond_0
    #v1=(Conflicted);
    invoke-virtual {p1}, Landroid/support/v4/app/NotificationCompat$Action$Builder;->getExtras()Landroid/os/Bundle;

    move-result-object v1

    #v1=(Reference);
    const-string v2, "android.wearable.EXTENSIONS"

    #v2=(Reference);
    invoke-virtual {v1, v2, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1659
    return-object p1
.end method

.method public isAvailableOffline()Z
    .locals 1

    .prologue
    .line 1687
    iget v0, p0, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x1

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

.method public setAvailableOffline(Z)Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;
    .locals 1
    .parameter "availableOffline"

    .prologue
    .line 1676
    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0, v0, p1}, Landroid/support/v4/app/NotificationCompat$Action$WearableExtender;->setFlag(IZ)V

    .line 1677
    return-object p0
.end method

*/}
