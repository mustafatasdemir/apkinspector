package android.support.v4.app; class BundleUtil {/*

.class Landroid/support/v4/app/BundleUtil;
.super Ljava/lang/Object;
.source "BundleUtil.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getBundleArrayFromBundle(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Bundle;
    .locals 4
    .parameter "bundle"
    .parameter "key"

    .prologue
    .line 18
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    move-result-object v0

    .line 19
    .local v0, array:[Landroid/os/Parcelable;
    #v0=(Reference);
    instance-of v2, v0, [Landroid/os/Bundle;

    #v2=(Boolean);
    if-nez v2, :cond_0

    if-nez v0, :cond_1

    .line 20
    :cond_0
    check-cast v0, [Landroid/os/Bundle;

    .end local v0           #array:[Landroid/os/Parcelable;
    check-cast v0, [Landroid/os/Bundle;

    move-object v1, v0

    .line 25
    :goto_0
    #v1=(Reference);v2=(Integer);v3=(Conflicted);
    return-object v1

    .line 22
    .restart local v0       #array:[Landroid/os/Parcelable;
    :cond_1
    #v1=(Uninit);v2=(Boolean);v3=(Uninit);
    array-length v2, v0

    #v2=(Integer);
    const-class v3, [Landroid/os/Bundle;

    #v3=(Reference);
    invoke-static {v0, v2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, [Landroid/os/Bundle;

    .line 24
    .local v1, typedArray:[Landroid/os/Bundle;
    invoke-virtual {p0, p1, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    goto :goto_0
.end method

*/}
