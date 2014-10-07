package android.support.v4.widget; class CursorAdapter$ChangeObserver {/*

.class Landroid/support/v4/widget/CursorAdapter$ChangeObserver;
.super Landroid/database/ContentObserver;
.source "CursorAdapter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/CursorAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ChangeObserver"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/widget/CursorAdapter;


# direct methods
.method public constructor <init>(Landroid/support/v4/widget/CursorAdapter;)V
    .locals 1
    .parameter

    .prologue
    .line 454
    iput-object p1, p0, Landroid/support/v4/widget/CursorAdapter$ChangeObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;

    .line 455
    new-instance v0, Landroid/os/Handler;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    #v0=(Reference);
    invoke-direct {p0, v0}, Landroid/database/ContentObserver;-><init>(Landroid/os/Handler;)V

    .line 456
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public deliverSelfNotifications()Z
    .locals 1

    .prologue
    .line 460
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public onChange(Z)V
    .locals 1
    .parameter "selfChange"

    .prologue
    .line 465
    iget-object v0, p0, Landroid/support/v4/widget/CursorAdapter$ChangeObserver;->this$0:Landroid/support/v4/widget/CursorAdapter;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/CursorAdapter;->onContentChanged()V

    .line 466
    return-void
.end method

*/}
