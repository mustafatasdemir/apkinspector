package android.support.v7.internal.view.menu; class SubMenuWrapperICS { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;
a=0;// .super Landroid/support/v7/internal/view/menu/MenuWrapperICS;
a=0;// .source "SubMenuWrapperICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/internal/view/SupportSubMenu;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/view/SubMenu;)V
a=0;//     .locals 0
a=0;//     .param p1, "subMenu"    # Landroid/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;-><init>(Landroid/view/Menu;)V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clearHeader()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 67
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/SubMenu;->clearHeader()V
a=0;// 
a=0;//     .line 68
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getItem()Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/SubMenu;->getItem()Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getWrappedObject()Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getWrappedObject()Ljava/lang/Object;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 25
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->getWrappedObject()Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderIcon(I)Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "iconRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(I)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 50
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 56
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderTitle(I)Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(I)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 38
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 44
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 61
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 62
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "iconRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 72
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(I)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 73
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/view/SubMenu;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 79
a=0;//     return-object p0
a=0;// .end method
}}
