package android.support.v4.net; class ConnectivityManagerCompat {/*

.class public Landroid/support/v4/net/ConnectivityManagerCompat;
.super Ljava/lang/Object;
.source "ConnectivityManagerCompat.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/net/ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl;,
        Landroid/support/v4/net/ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl;,
        Landroid/support/v4/net/ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl;,
        Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;,
        Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;
    }
.end annotation


# static fields
.field private static final IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 84
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x10

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 85
    new-instance v0, Landroid/support/v4/net/ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/net/ConnectivityManagerCompat$JellyBeanConnectivityManagerCompatImpl;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;

    .line 93
    :goto_0
    return-void

    .line 86
    :cond_0
    #v0=(Integer);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xd

    if-lt v0, v1, :cond_1

    .line 87
    new-instance v0, Landroid/support/v4/net/ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/net/ConnectivityManagerCompat$HoneycombMR2ConnectivityManagerCompatImpl;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;

    goto :goto_0

    .line 88
    :cond_1
    #v0=(Integer);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_2

    .line 89
    new-instance v0, Landroid/support/v4/net/ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/net/ConnectivityManagerCompat$GingerbreadConnectivityManagerCompatImpl;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;

    goto :goto_0

    .line 91
    :cond_2
    #v0=(Integer);
    new-instance v0, Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;-><init>()V

    #v0=(Reference);
    sput-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 31
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 74
    #p0=(Reference);
    return-void
.end method

.method public static getNetworkInfoFromBroadcast(Landroid/net/ConnectivityManager;Landroid/content/Intent;)Landroid/net/NetworkInfo;
    .locals 2
    .parameter "cm"
    .parameter "intent"

    .prologue
    .line 114
    const-string v1, "networkInfo"

    #v1=(Reference);
    invoke-virtual {p1, v1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/net/NetworkInfo;

    .line 115
    .local v0, info:Landroid/net/NetworkInfo;
    if-eqz v0, :cond_0

    .line 116
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v1

    .line 118
    :goto_0
    #v1=(Reference);
    return-object v1

    :cond_0
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public static isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z
    .locals 1
    .parameter "cm"

    .prologue
    .line 103
    sget-object v0, Landroid/support/v4/net/ConnectivityManagerCompat;->IMPL:Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;

    #v0=(Reference);
    invoke-interface {v0, p0}, Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;->isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
