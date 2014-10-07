package android.support.v7.internal.widget; class ProgressBarICS$RefreshProgressRunnable {/*

.class Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
.super Ljava/lang/Object;
.source "ProgressBarICS.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ProgressBarICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "RefreshProgressRunnable"
.end annotation


# instance fields
.field private mFromUser:Z

.field private mId:I

.field private mProgress:I

.field final synthetic this$0:Landroid/support/v7/internal/widget/ProgressBarICS;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/ProgressBarICS;IIZ)V
    .locals 0
    .parameter
    .parameter "id"
    .parameter "progress"
    .parameter "fromUser"

    .prologue
    .line 396
    iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->this$0:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 397
    #p0=(Reference);
    iput p2, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mId:I

    .line 398
    iput p3, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mProgress:I

    .line 399
    iput-boolean p4, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mFromUser:Z

    .line 400
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 403
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->this$0:Landroid/support/v7/internal/widget/ProgressBarICS;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mId:I

    #v1=(Integer);
    iget v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mProgress:I

    #v2=(Integer);
    iget-boolean v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mFromUser:Z

    #v3=(Boolean);
    const/4 v4, 0x1

    #v4=(One);
    invoke-static {v0, v1, v2, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->access$000(Landroid/support/v7/internal/widget/ProgressBarICS;IIZZ)V

    .line 405
    iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->this$0:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-static {v0, p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->access$102(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;)Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;

    .line 406
    return-void
.end method

.method public setup(IIZ)V
    .locals 0
    .parameter "id"
    .parameter "progress"
    .parameter "fromUser"

    .prologue
    .line 409
    iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mId:I

    .line 410
    iput p2, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mProgress:I

    .line 411
    iput-boolean p3, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mFromUser:Z

    .line 412
    return-void
.end method

*/}
