package android.support.v7.internal.view.menu; class MenuItemWrapperICS$ActionProviderWrapper { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
a=0;// .super Landroid/view/ActionProvider;
a=0;// .source "MenuItemWrapperICS.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "ActionProviderWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;Landroid/support/v4/view/ActionProvider;)V
a=0;//     .locals 2
a=0;//     .param p2, "inner"    # Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 395
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     .line 396
a=0;//     invoke-virtual {p2}, Landroid/support/v4/view/ActionProvider;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0}, Landroid/view/ActionProvider;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 397
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;);
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .line 399
a=0;//     invoke-static {p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->access$000(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 400
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     new-instance v1, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;);
a=0;//     invoke-direct {v1, p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;-><init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ActionProvider;->setVisibilityListener(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V
a=0;// 
a=0;//     .line 409
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hasSubMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 428
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 413
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->access$000(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 416
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->checkActionProviderOverrideVisibility()Z
a=0;// 
a=0;//     .line 418
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->onCreateActionView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPerformDefaultAction()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 423
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->onPerformDefaultAction()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareSubMenu(Landroid/view/SubMenu;)V
a=0;//     .locals 2
a=0;//     .param p1, "subMenu"    # Landroid/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 433
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V
a=0;// 
a=0;//     .line 434
a=0;//     return-void
a=0;// .end method
}}
