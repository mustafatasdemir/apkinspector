package android.support.v4.app; class RemoteInput$ImplBase {/*

.class Landroid/support/v4/app/RemoteInput$ImplBase;
.super Ljava/lang/Object;
.source "RemoteInput.java"

# interfaces
.implements Landroid/support/v4/app/RemoteInput$Impl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/RemoteInput;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "ImplBase"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 215
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public addResultsToIntent([Landroid/support/v4/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 2
    .parameter "remoteInputs"
    .parameter "intent"
    .parameter "results"

    .prologue
    .line 224
    const-string v0, "RemoteInput"

    #v0=(Reference);
    const-string v1, "RemoteInput is only supported from API Level 16"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 225
    return-void
.end method

.method public getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 2
    .parameter "intent"

    .prologue
    .line 218
    const-string v0, "RemoteInput"

    #v0=(Reference);
    const-string v1, "RemoteInput is only supported from API Level 16"

    #v1=(Reference);
    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 219
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

*/}
