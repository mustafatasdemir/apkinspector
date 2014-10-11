package android.support.v7.internal.view.menu; class ActionMenuPresenter$PopupPresenterCallback { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionMenuPresenter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "PopupPresenterCallback"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 634
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;Landroid/support/v7/internal/view/menu/ActionMenuPresenter$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/view/menu/ActionMenuPresenter$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 634
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuPresenter;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 2
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 648
a=0;//     instance-of v0, p1, Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 649
a=0;//     check-cast p1, Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .end local p1    # "menu":Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getRootMenu()Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V
a=0;// 
a=0;//     .line 651
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
a=0;//     .locals 3
a=0;//     .param p1, "subMenu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 638
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 643
a=0;//     .end local p1    # "subMenu":Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 642
a=0;//     .restart local p1    # "subMenu":Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter$PopupPresenterCallback;->this$0:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     check-cast p1, Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .end local p1    # "subMenu":Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getItem()Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, v0, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->mOpenSubMenuId:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
