package android.support.v4.net; class ConnectivityManagerCompatGingerbread {/*

.class Landroid/support/v4/net/ConnectivityManagerCompatGingerbread;
.super Ljava/lang/Object;
.source "ConnectivityManagerCompatGingerbread.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static isActiveNetworkMetered(Landroid/net/ConnectivityManager;)Z
    .locals 3
    .parameter "cm"

    .prologue
    const/4 v2, 0x1

    .line 35
    #v2=(One);
    invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v0

    .line 36
    .local v0, info:Landroid/net/NetworkInfo;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 54
    :goto_0
    :pswitch_0
    #v1=(Conflicted);v2=(Boolean);
    return v2

    .line 41
    :cond_0
    #v1=(Uninit);v2=(One);
    invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I

    move-result v1

    .line 42
    .local v1, type:I
    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    goto :goto_0

    .line 51
    :pswitch_1
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_0

    .line 42
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

*/}
