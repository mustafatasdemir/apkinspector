package android.support.v4.app; class FragmentManagerImpl$4 { void a() { int a;
a=0;// .class Landroid/support/v4/app/FragmentManagerImpl$4;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FragmentManager.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/app/FragmentManagerImpl;->popBackStack(II)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;// .field final synthetic val$flags:I
a=0;// 
a=0;// .field final synthetic val$id:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/app/FragmentManagerImpl;II)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 522
a=0;//     iput-object p1, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->this$0:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iput p2, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->val$id:I
a=0;// 
a=0;//     iput p3, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->val$flags:I
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentManagerImpl$4;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 524
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->this$0:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->this$0:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/FragmentManagerImpl;);
a=0;//     iget-object v1, v1, Landroid/support/v4/app/FragmentManagerImpl;->mActivity:Landroid/support/v4/app/FragmentActivity;
a=0;// 
a=0;//     iget-object v1, v1, Landroid/support/v4/app/FragmentActivity;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     iget v3, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->val$id:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     iget v4, p0, Landroid/support/v4/app/FragmentManagerImpl$4;->val$flags:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/support/v4/app/FragmentManagerImpl;->popBackStackState(Landroid/os/Handler;Ljava/lang/String;II)Z
a=0;// 
a=0;//     .line 525
a=0;//     return-void
a=0;// .end method
}}
