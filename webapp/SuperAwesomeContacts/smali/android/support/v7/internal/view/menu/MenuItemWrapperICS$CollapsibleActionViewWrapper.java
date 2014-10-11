package android.support.v7.internal.view.menu; class MenuItemWrapperICS$CollapsibleActionViewWrapper { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;
a=0;// .super Landroid/widget/FrameLayout;
a=0;// .source "MenuItemWrapperICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/CollapsibleActionView;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "CollapsibleActionViewWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mWrappedView:Landroid/support/v7/view/CollapsibleActionView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "actionView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 442
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 443
a=0;//     check-cast v0, Landroid/support/v7/view/CollapsibleActionView;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;->mWrappedView:Landroid/support/v7/view/CollapsibleActionView;
a=0;// 
a=0;//     .line 444
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 445
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method getWrappedView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 458
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;->mWrappedView:Landroid/support/v7/view/CollapsibleActionView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/CollapsibleActionView;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onActionViewCollapsed()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 454
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;->mWrappedView:Landroid/support/v7/view/CollapsibleActionView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/CollapsibleActionView;);
a=0;//     invoke-interface {v0}, Landroid/support/v7/view/CollapsibleActionView;->onActionViewCollapsed()V
a=0;// 
a=0;//     .line 455
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActionViewExpanded()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 449
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$CollapsibleActionViewWrapper;->mWrappedView:Landroid/support/v7/view/CollapsibleActionView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/CollapsibleActionView;);
a=0;//     invoke-interface {v0}, Landroid/support/v7/view/CollapsibleActionView;->onActionViewExpanded()V
a=0;// 
a=0;//     .line 450
a=0;//     return-void
a=0;// .end method
}}
