package android.support.v4.app; class Fragment$1 { void a() { int a;
a=0;// .class Landroid/support/v4/app/Fragment$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "Fragment.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/app/FragmentContainer;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/app/Fragment;->instantiateChildFragmentManager()V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1465
a=0;//     iput-object p1, p0, Landroid/support/v4/app/Fragment$1;->this$0:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/Fragment$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public findViewById(I)Landroid/view/View;
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1468
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment$1;->this$0:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1469
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "Fragment does not have a view"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 1471
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/Fragment$1;->this$0:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->mView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
