package android.support.v4.app; class FragmentManagerImpl$4 {/*

.class Landroid/support/v4/app/FragmentManagerImpl$4;
.super Ljava/lang/Object;
.source "FragmentManager.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v4/app/FragmentManagerImpl;->popBackStack(II)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/app/FragmentManagerImpl;

.field final synthetic val$flags:I

.field final synthetic val$id:I


# direct methods
.method constructor <init>(Landroid/support/v4/app/FragmentManagerImpl;II)V
    .locals 0
    .parameter
    .parameter
    .parameter

    .prologue
    .line 522
    iput-object p1, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->this$0:Landroid/support/v4/app/FragmentManagerImpl;

    iput p2, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->val$id:I

    iput p3, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->val$flags:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    .line 524
    iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->this$0:Landroid/support/v4/app/FragmentManagerImpl;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->this$0:Landroid/support/v4/app/FragmentManagerImpl;

    #v1=(Reference);
    iget-object v1, v1, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;

    iget-object v1, v1, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;

    const/4 v2, 0x0

    #v2=(Null);
    iget v3, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->val$id:I

    #v3=(Integer);
    iget v4, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->val$flags:I

    #v4=(Integer);
    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/support/v4/app/FragmentManagerImpl;->popBackStackState(Landroid/os/Handler;Ljava/lang/String;II)Z

    .line 525
    return-void
.end method

*/}
