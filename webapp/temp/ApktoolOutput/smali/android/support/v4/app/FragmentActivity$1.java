package android.support.v4.app; class FragmentActivity$1 {/*

.class Landroid/support/v4/app/FragmentActivity$1;
.super Landroid/os/Handler;
.source "FragmentActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/app/FragmentActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/app/FragmentActivity;


# direct methods
.method constructor <init>(Landroid/support/v4/app/FragmentActivity;)V
    .locals 0
    .parameter

    .prologue
    .line 87
    iput-object p1, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 2
    .parameter "msg"

    .prologue
    .line 90
    iget v0, p1, Landroid/os/Message;->what:I

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    .line 101
    invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V

    .line 103
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 92
    :pswitch_0
    #v0=(Integer);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 93
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V

    goto :goto_0

    .line 97
    :pswitch_1
    #v0=(Integer);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V

    .line 98
    iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;

    iget-object v0, v0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z

    goto :goto_0

    .line 90
    #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

*/}
