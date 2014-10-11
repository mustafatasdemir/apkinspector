package android.support.v7.internal.view.menu; class BaseMenuWrapper { void a() { int a;
a=0;// .class abstract Landroid/support/v7/internal/view/menu/BaseMenuWrapper;
a=0;// .super Landroid/support/v7/internal/view/menu/BaseWrapper;
a=0;// .source "BaseMenuWrapper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "<T:",
a=0;//         "Ljava/lang/Object;",
a=0;//         ">",
a=0;//         "Landroid/support/v7/internal/view/menu/BaseWrapper",
a=0;//         "<TT;>;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mMenuItems:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Landroid/view/MenuItem;",
a=0;//             "Landroid/support/v4/internal/view/SupportMenuItem;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mSubMenus:Ljava/util/HashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/HashMap",
a=0;//             "<",
a=0;//             "Landroid/view/SubMenu;",
a=0;//             "Landroid/view/SubMenu;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Ljava/lang/Object;)V
a=0;//     .locals 0
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(TT;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
a=0;//     .local p1, "object":Ljava/lang/Object;, "TT;"
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/BaseWrapper;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 34
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/BaseMenuWrapper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method final getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "frameworkItem"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 39
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 40
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 43
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     .line 45
a=0;//     .local v0, "compatItem":Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 46
a=0;//     invoke-static {p1}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createSupportMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 47
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 52
a=0;//     .end local v0    # "compatItem":Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final getSubMenuWrapper(Landroid/view/SubMenu;)Landroid/view/SubMenu;
a=0;//     .locals 2
a=0;//     .param p1, "frameworkSubMenu"    # Landroid/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 58
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v1, Ljava/util/HashMap;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v1}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/HashMap;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;
a=0;// 
a=0;//     .line 62
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 64
a=0;//     .local v0, "compatSubMenu":Landroid/view/SubMenu;
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 65
a=0;//     invoke-static {p1}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createSupportSubMenuWrapper(Landroid/view/SubMenu;)Landroid/support/v4/internal/view/SupportSubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 70
a=0;//     .end local v0    # "compatSubMenu":Landroid/view/SubMenu;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final internalClear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/HashMap;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     .line 78
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 79
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mSubMenus:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
a=0;// 
a=0;//     .line 81
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final internalRemoveGroup(I)V
a=0;//     .locals 3
a=0;//     .param p1, "groupId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 88
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 91
a=0;//     .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Landroid/view/MenuItem;>;"
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 93
a=0;//     .local v1, "menuItem":Landroid/view/MenuItem;
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->getGroupId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne p1, v2, :cond_2
a=0;// 
a=0;//     .line 94
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method final internalRemoveItem(I)V
a=0;//     .locals 3
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     .local p0, "this":Landroid/support/v7/internal/view/menu/BaseMenuWrapper;, "Landroid/support/v7/internal/view/menu/BaseMenuWrapper<TT;>;"
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 114
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 104
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/util/HashMap;);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/BaseMenuWrapper;->mMenuItems:Ljava/util/HashMap;
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 107
a=0;//     .local v0, "iterator":Ljava/util/Iterator;, "Ljava/util/Iterator<Landroid/view/MenuItem;>;"
a=0;//     :cond_2
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 108
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 109
a=0;//     .local v1, "menuItem":Landroid/view/MenuItem;
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne p1, v2, :cond_2
a=0;// 
a=0;//     .line 110
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->remove()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
