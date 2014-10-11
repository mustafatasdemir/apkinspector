package android.support.v7.internal.widget; class ProgressBarICS$RefreshProgressRunnable { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProgressBarICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "RefreshProgressRunnable"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mFromUser:Z
a=0;// 
a=0;// .field private mId:I
a=0;// 
a=0;// .field private mProgress:I
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/widget/ProgressBarICS;IIZ)V
a=0;//     .locals 0
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "progress"    # I
a=0;//     .param p4, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 396
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->this$0:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 397
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;);
a=0;//     iput p2, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mId:I
a=0;// 
a=0;//     .line 398
a=0;//     iput p3, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mProgress:I
a=0;// 
a=0;//     .line 399
a=0;//     iput-boolean p4, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mFromUser:Z
a=0;// 
a=0;//     .line 400
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 403
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->this$0:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mProgress:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mFromUser:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-static {v0, v1, v2, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->access$000(Landroid/support/v7/internal/widget/ProgressBarICS;IIZZ)V
a=0;// 
a=0;//     .line 405
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->this$0:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     invoke-static {v0, p0}, Landroid/support/v7/internal/widget/ProgressBarICS;->access$102(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;)Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;
a=0;// 
a=0;//     .line 406
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setup(IIZ)V
a=0;//     .locals 0
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "progress"    # I
a=0;//     .param p3, "fromUser"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 409
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mId:I
a=0;// 
a=0;//     .line 410
a=0;//     iput p2, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mProgress:I
a=0;// 
a=0;//     .line 411
a=0;//     iput-boolean p3, p0, Landroid/support/v7/internal/widget/ProgressBarICS$RefreshProgressRunnable;->mFromUser:Z
a=0;// 
a=0;//     .line 412
a=0;//     return-void
a=0;// .end method
}}
