package android.support.v4.app; class FragmentActivity$1 { void a() { int a;
a=0;// .class Landroid/support/v4/app/FragmentActivity$1;
a=0;// .super Landroid/os/Handler;
a=0;// .source "FragmentActivity.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/FragmentActivity;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/app/FragmentActivity;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 87
a=0;//     iput-object p1, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentActivity$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public handleMessage(Landroid/os/Message;)V
a=0;//     .locals 2
a=0;//     .param p1, "msg"    # Landroid/os/Message;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iget v0, p1, Landroid/os/Message;->what:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 101
a=0;//     invoke-super {p0, p1}, Landroid/os/Handler;->handleMessage(Landroid/os/Message;)V
a=0;// 
a=0;//     .line 103
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 92
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     iget-boolean v0, v0, Landroid/support/v4/app/FragmentActivity;->mStopped:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentActivity;->doReallyStop(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 97
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentActivity;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentActivity;->onResumeFragments()V
a=0;// 
a=0;//     .line 98
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentActivity$1;->this$0:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/FragmentActivity;->mFragments:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentManagerImpl;->execPendingActions()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 90
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
}}
