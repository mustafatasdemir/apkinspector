package android.support.v7.internal.view.menu; class ActionMenuPresenter$OpenOverflowRunnable { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionMenuPresenter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "OpenOverflowRunnable"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;)V
a=0;//     .locals 0
a=0;//     .param p2, "popup"    # Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 658
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 659
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;);
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->mPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     .line 660
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 663
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v1, v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->changeMenuMode()V
a=0;// 
a=0;//     .line 664
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenuView:Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuView;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 665
a=0;//     .local v0, "menuView":Landroid/view/View;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->mPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->tryShow()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 666
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->mPopup:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;);
a=0;//     invoke-static {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->access$102(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     .line 668
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->access$302(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OpenOverflowRunnable;
a=0;// 
a=0;//     .line 669
a=0;//     return-void
a=0;// .end method
}}
