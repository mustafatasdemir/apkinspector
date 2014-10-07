package android.support.v4.app; class RemoteInput$1 {/*

.class final Landroid/support/v4/app/RemoteInput$1;
.super Ljava/lang/Object;
.source "RemoteInput.java"

# interfaces
.implements Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/RemoteInput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 263
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public build(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)Landroid/support/v4/app/RemoteInput;
    .locals 6
    .parameter "resultKey"
    .parameter "label"
    .parameter "choices"
    .parameter "allowFreeFormInput"
    .parameter "extras"

    .prologue
    .line 268
    new-instance v0, Landroid/support/v4/app/RemoteInput;

    #v0=(UninitRef);
    move-object v1, p1

    #v1=(Reference);
    move-object v2, p2

    #v2=(Reference);
    move-object v3, p3

    #v3=(Reference);
    move v4, p4

    #v4=(Boolean);
    move-object v5, p5

    #v5=(Reference);
    invoke-direct/range {v0 .. v5}, Landroid/support/v4/app/RemoteInput;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)V

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic build(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"
    .parameter "x3"
    .parameter "x4"

    .prologue
    .line 263
    invoke-virtual/range {p0 .. p5}, Landroid/support/v4/app/RemoteInput$1;->build(Ljava/lang/String;Ljava/lang/CharSequence;[Ljava/lang/CharSequence;ZLandroid/os/Bundle;)Landroid/support/v4/app/RemoteInput;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public newArray(I)[Landroid/support/v4/app/RemoteInput;
    .locals 1
    .parameter "size"

    .prologue
    .line 273
    new-array v0, p1, [Landroid/support/v4/app/RemoteInput;

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic newArray(I)[Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;
    .locals 1
    .parameter "x0"

    .prologue
    .line 263
    invoke-virtual {p0, p1}, Landroid/support/v4/app/RemoteInput$1;->newArray(I)[Landroid/support/v4/app/RemoteInput;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
