package android.support.v4.content; class ModernAsyncTask$InternalHandler {/*

.class Landroid/support/v4/content/ModernAsyncTask$InternalHandler;
.super Landroid/os/Handler;
.source "ModernAsyncTask.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/content/ModernAsyncTask;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "InternalHandler"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 466
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v4/content/ModernAsyncTask$1;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 466
    invoke-direct {p0}, Landroid/support/v4/content/ModernAsyncTask$InternalHandler;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public handleMessage(Landroid/os/Message;)V
    .locals 4
    .parameter "msg"

    .prologue
    .line 470
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;

    .line 471
    .local v0, result:Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;
    iget v1, p1, Landroid/os/Message;->what:I

    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    .line 480
    :goto_0
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 474
    :pswitch_0
    #v1=(Integer);v2=(Uninit);v3=(Uninit);
    iget-object v1, v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;->mTask:Landroid/support/v4/content/ModernAsyncTask;

    #v1=(Reference);
    iget-object v2, v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;->mData:[Ljava/lang/Object;

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    aget-object v2, v2, v3

    #v2=(Null);
    invoke-static {v1, v2}, Landroid/support/v4/content/ModernAsyncTask;->access$500(Landroid/support/v4/content/ModernAsyncTask;Ljava/lang/Object;)V

    goto :goto_0

    .line 477
    :pswitch_1
    #v1=(Integer);v2=(Uninit);v3=(Uninit);
    iget-object v1, v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;->mTask:Landroid/support/v4/content/ModernAsyncTask;

    #v1=(Reference);
    iget-object v2, v0, Landroid/support/v4/content/ModernAsyncTask$AsyncTaskResult;->mData:[Ljava/lang/Object;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/support/v4/content/ModernAsyncTask;->onProgressUpdate([Ljava/lang/Object;)V

    goto :goto_0

    .line 471
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

*/}
