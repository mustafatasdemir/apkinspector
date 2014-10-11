package android.support.v4.app; class FragmentManagerImpl$5 { void a() { int a;
a=0;// .class Landroid/support/v4/app/FragmentManagerImpl$5;
a=0;// .super Ljava/lang/Object;
a=0;// .source "FragmentManager.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/animation/Animation$AnimationListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
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
a=0;// .field final synthetic val$fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/app/FragmentManagerImpl;Landroid/support/v4/app/Fragment;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1022
a=0;//     iput-object p1, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->this$0:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->val$fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/FragmentManagerImpl$5;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAnimationEnd(Landroid/view/animation/Animation;)V
a=0;//     .locals 6
a=0;//     .param p1, "animation"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 1025
a=0;//     #v3=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->val$fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v0, v0, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1026
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->val$fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-object v1, v0, Landroid/support/v4/app/Fragment;->mAnimatingAway:Landroid/view/View;
a=0;// 
a=0;//     .line 1027
a=0;//     iget-object v0, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->this$0:Landroid/support/v4/app/FragmentManagerImpl;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->val$fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget-object v2, p0, Landroid/support/v4/app/FragmentManagerImpl$5;->val$fragment:Landroid/support/v4/app/Fragment;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/app/Fragment;);
a=0;//     iget v2, v2, Landroid/support/v4/app/Fragment;->mStateAfterAnimating:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v4, v3
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move v5, v3
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/support/v4/app/FragmentManagerImpl;->moveToState(Landroid/support/v4/app/Fragment;IIIZ)V
a=0;// 
a=0;//     .line 1030
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationRepeat(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1033
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAnimationStart(Landroid/view/animation/Animation;)V
a=0;//     .locals 0
a=0;//     .param p1, "animation"    # Landroid/view/animation/Animation;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1036
a=0;//     return-void
a=0;// .end method
}}
