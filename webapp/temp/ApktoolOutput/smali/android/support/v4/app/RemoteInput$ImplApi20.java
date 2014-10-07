package android.support.v4.app; class RemoteInput$ImplApi20 {/*

.class Landroid/support/v4/app/RemoteInput$ImplApi20;
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
    name = "ImplApi20"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 240
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public addResultsToIntent([Landroid/support/v4/app/RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V
    .locals 0
    .parameter "remoteInputs"
    .parameter "intent"
    .parameter "results"

    .prologue
    .line 248
    invoke-static {p1, p2, p3}, Landroid/support/v4/app/RemoteInputCompatApi20;->addResultsToIntent([Landroid/support/v4/app/RemoteInputCompatBase$RemoteInput;Landroid/content/Intent;Landroid/os/Bundle;)V

    .line 249
    return-void
.end method

.method public getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;
    .locals 1
    .parameter "intent"

    .prologue
    .line 243
    invoke-static {p1}, Landroid/support/v4/app/RemoteInputCompatApi20;->getResultsFromIntent(Landroid/content/Intent;)Landroid/os/Bundle;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
