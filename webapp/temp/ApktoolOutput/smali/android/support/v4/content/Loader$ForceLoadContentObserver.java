package android.support.v4.content; class Loader$ForceLoadContentObserver {/*

.class public final Landroid/support/v4/content/Loader$ForceLoadContentObserver;
.super Landroid/database/ContentObserver;
.source "Loader.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/content/Loader;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "ForceLoadContentObserver"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/content/Loader;


# direct methods
.method public constructor <init>(Landroid/support/v4/content/Loader;)V
    .locals 1
    .parameter

    .prologue
    .line 52
    .local p0, this:Landroid/support/v4/content/Loader$ForceLoadContentObserver;,"Landroid/support/v4/content/Loader<TD;>.ForceLoadContentObserver;"
    iput-object p1, p0, Landroid/support/v4/content/Loader$ForceLoadContentObserver;->this$0:Landroid/support/v4/content/Loader;

    .line 53
    new-instance v0, Landroid/os/Handler;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    #v0=(Reference);
    invoke-direct {p0, v0}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 54
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    .prologue
    .line 58
    .local p0, this:Landroid/support/v4/content/Loader$ForceLoadContentObserver;,"Landroid/support/v4/content/Loader<TD;>.ForceLoadContentObserver;"
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public onChange(Z)V
    .locals 1
    .parameter "selfChange"

    .prologue
    .line 63
    .local p0, this:Landroid/support/v4/content/Loader$ForceLoadContentObserver;,"Landroid/support/v4/content/Loader<TD;>.ForceLoadContentObserver;"
    iget-object v0, p0, Landroid/support/v4/content/Loader$ForceLoadContentObserver;->this$0:Landroid/support/v4/content/Loader;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/content/Loader;->onContentChanged()V

    .line 64
    return-void
.end method

*/}
