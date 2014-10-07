package android.support.v4.net; class ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl {/*

.class Landroid/support/v4/net/ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl;
.super Ljava/lang/Object;
.source "ConnectivityManagerCompat.java"

# interfaces
.implements Landroid/support/v4/net/ConnectivityManagerCompat$ConnectivityManagerCompatImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/net/ConnectivityManagerCompat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "BaseConnectivityManagerCompatImpl"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z
    .locals 3
    .parameter "cm"

    .prologue
    const/4 v2, 0x1

    .line 40
    #v2=(One);
    invoke-virtual {p1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 41
    .local v0, info:Landroid/net/NetworkInfo;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 54
    :goto_0
    :pswitch_0
    #v1=(Conflicted);v2=(Boolean);
    return v2

    .line 46
    :cond_0
    #v1=(Uninit);v2=(One);
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    .line 47
    .local v1, type:I
    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 51
    :pswitch_1
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

*/}
