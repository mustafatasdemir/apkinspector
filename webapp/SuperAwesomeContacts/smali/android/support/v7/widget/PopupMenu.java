package android.support.v7.widget; class PopupMenu { void a() { int a;
a=0;// .class public Landroid/support/v7/widget/PopupMenu;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PopupMenu.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;,
a=0;//         Landroid/support/v7/widget/PopupMenu$OnDismissListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnchor:Landroid/view/View;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mDismissListener:Landroid/support/v7/widget/PopupMenu$OnDismissListener;
a=0;// 
a=0;// .field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mMenuItemClickListener:Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;
a=0;// 
a=0;// .field private mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "anchor"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 66
a=0;//     #p0=(Reference,Landroid/support/v7/widget/PopupMenu;);
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/PopupMenu;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 68
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setCallback(Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;)V
a=0;// 
a=0;//     .line 69
a=0;//     iput-object p2, p0, Landroid/support/v7/widget/PopupMenu;->mAnchor:Landroid/view/View;
a=0;// 
a=0;//     .line 70
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-direct {v0, p1, v1, p2}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     .line 71
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 72
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dismiss()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->dismiss()V
a=0;// 
a=0;//     .line 118
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getMenu()Landroid/view/Menu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuInflater()Landroid/view/MenuInflater;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     new-instance v0, Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/PopupMenu;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v7/internal/view/SupportMenuInflater;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public inflate(I)V
a=0;//     .locals 2
a=0;//     .param p1, "menuRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     invoke-virtual {p0}, Landroid/support/v7/widget/PopupMenu;->getMenuInflater()Landroid/view/MenuInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuInflater;);
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/PopupMenu;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V
a=0;// 
a=0;//     .line 102
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mDismissListener:Landroid/support/v7/widget/PopupMenu$OnDismissListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/widget/PopupMenu$OnDismissListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 153
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mDismissListener:Landroid/support/v7/widget/PopupMenu$OnDismissListener;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Landroid/support/v7/widget/PopupMenu$OnDismissListener;->onDismiss(Landroid/support/v7/widget/PopupMenu;)V
a=0;// 
a=0;//     .line 155
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCloseSubMenu(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenuItemClickListener:Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mMenuItemClickListener:Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;
a=0;// 
a=0;//     invoke-interface {v0, p2}, Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 145
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuModeChange(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
a=0;//     .locals 4
a=0;//     .param p1, "subMenu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 161
a=0;//     #v0=(One);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 169
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 163
a=0;//     :cond_1
a=0;//     #v0=(One);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->hasVisibleItems()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 168
a=0;//     new-instance v1, Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     iget-object v2, p0, Landroid/support/v7/widget/PopupMenu;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     iget-object v3, p0, Landroid/support/v7/widget/PopupMenu;->mAnchor:Landroid/view/View;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {v1, v2, p1, v3}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setOnDismissListener(Landroid/support/v7/widget/PopupMenu$OnDismissListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v7/widget/PopupMenu$OnDismissListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 135
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/PopupMenu;->mDismissListener:Landroid/support/v7/widget/PopupMenu$OnDismissListener;
a=0;// 
a=0;//     .line 136
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnMenuItemClickListener(Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/PopupMenu;->mMenuItemClickListener:Landroid/support/v7/widget/PopupMenu$OnMenuItemClickListener;
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/PopupMenu;->mPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->show()V
a=0;// 
a=0;//     .line 110
a=0;//     return-void
a=0;// .end method
}}
