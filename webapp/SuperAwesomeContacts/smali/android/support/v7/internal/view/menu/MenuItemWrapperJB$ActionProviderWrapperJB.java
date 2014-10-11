package android.support.v7.internal.view.menu; class MenuItemWrapperJB$ActionProviderWrapperJB { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;
a=0;// .super Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
a=0;// .source "MenuItemWrapperJB.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = "ActionProviderWrapperJB"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mListener:Landroid/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;Landroid/support/v4/view/ActionProvider;)V
a=0;//     .locals 0
a=0;//     .param p2, "inner"    # Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;
a=0;// 
a=0;//     .line 39
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;-><init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;Landroid/support/v4/view/ActionProvider;)V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public isVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->isVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onActionProviderVisibilityChanged(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "isVisible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 71
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mListener:Landroid/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionProvider$VisibilityListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mListener:Landroid/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/ActionProvider$VisibilityListener;->onActionProviderVisibilityChanged(Z)V
a=0;// 
a=0;//     .line 74
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "forItem"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public overridesItemVisibility()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->overridesItemVisibility()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public refreshVisibility()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->refreshVisibility()V
a=0;// 
a=0;//     .line 60
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVisibilityListener(Landroid/view/ActionProvider$VisibilityListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mListener:Landroid/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .end local p0    # "this":Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;
a=0;//     :goto_0
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/view/ActionProvider;->setVisibilityListener(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V
a=0;// 
a=0;//     .line 67
a=0;//     return-void
a=0;// 
a=0;//     .line 66
a=0;//     .restart local p0    # "this":Landroid/support/v7/internal/view/menu/MenuItemWrapperJB$ActionProviderWrapperJB;
a=0;//     :cond_0
a=0;//     const/4 p0, 0x0
a=0;// 
a=0;//     #p0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
