package android.support.v4.content; class ContextCompatHoneycomb {/*

.class Landroid/support/v4/content/ContextCompatHoneycomb;
.super Ljava/lang/Object;
.source "ContextCompatHoneycomb.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getObbDir(Landroid/content/Context;)Ljava/io/File;
    .locals 1
    .parameter "context"

    .prologue
    .line 34
    invoke-virtual {p0}, Landroid/content/Context;->getObbDir()Ljava/io/File;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method static startActivities(Landroid/content/Context;[Landroid/content/Intent;)V
    .locals 0
    .parameter "context"
    .parameter "intents"

    .prologue
    .line 30
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivities([Landroid/content/Intent;)V

    .line 31
    return-void
.end method

*/}