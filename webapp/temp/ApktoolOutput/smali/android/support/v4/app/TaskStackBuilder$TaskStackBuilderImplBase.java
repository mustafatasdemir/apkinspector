package android.support.v4.app; class TaskStackBuilder$TaskStackBuilderImplBase {/*

.class Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImplBase;
.super Ljava/lang/Object;
.source "TaskStackBuilder.java"

# interfaces
.implements Landroid/support/v4/app/TaskStackBuilder$TaskStackBuilderImpl;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/TaskStackBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "TaskStackBuilderImplBase"
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public getPendingIntent(Landroid/content/Context;[Landroid/content/Intent;IILandroid/os/Bundle;)Landroid/app/PendingIntent;
    .locals 2
    .parameter "context"
    .parameter "intents"
    .parameter "requestCode"
    .parameter "flags"
    .parameter "options"

    .prologue
    .line 84
    new-instance v0, Landroid/content/Intent;

    #v0=(UninitRef);
    array-length v1, p2

    #v1=(Integer);
    add-int/lit8 v1, v1, -0x1

    aget-object v1, p2, v1

    #v1=(Null);
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 85
    .local v0, topIntent:Landroid/content/Intent;
    #v0=(Reference);
    const/high16 v1, 0x1000

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 86
    invoke-static {p1, p3, v0, p4}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    #v1=(Reference);
    return-object v1
.end method

*/}
