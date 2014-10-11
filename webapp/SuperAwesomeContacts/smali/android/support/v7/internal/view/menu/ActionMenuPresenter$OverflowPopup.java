package android.support.v7.internal.view.menu; class ActionMenuPresenter$OverflowPopup { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// .super Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// .source "ActionMenuPresenter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "OverflowPopup"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;//     .locals 1
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p4, "anchorView"    # Landroid/view/View;
a=0;//     .param p5, "overflowOnly"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 607
a=0;//     invoke-direct {p0, p2, p3, p4, p5}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 608
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;);
a=0;//     iget-object v0, p1, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mPopupPresenterCallback:Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 609
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onDismiss()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 613
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->onDismiss()V
a=0;// 
a=0;//     .line 614
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close()V
a=0;// 
a=0;//     .line 615
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->access$102(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;)Landroid/support/v7/internal/view/menu/ActionMenuPresenter$OverflowPopup;
a=0;// 
a=0;//     .line 616
a=0;//     return-void
a=0;// .end method
}}
