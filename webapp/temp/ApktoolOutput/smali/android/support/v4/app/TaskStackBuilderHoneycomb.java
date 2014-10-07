package android.support.v4.app; class TaskStackBuilderHoneycomb {/*

.class Landroid/support/v4/app/TaskStackBuilderHoneycomb;
.super Ljava/lang/Object;
.source "TaskStackBuilderHoneycomb.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method public static getActivitiesPendingIntent(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;
    .locals 1
    .parameter "context"
    .parameter "requestCode"
    .parameter "intents"
    .parameter "flags"

    .prologue
    .line 29
    invoke-static {p0, p1, p2, p3}, Landroid/app/PendingIntent;->getActivities(Landroid/content/Context;I[Landroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

*/}
