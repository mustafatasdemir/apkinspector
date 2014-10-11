package android.support.v7.internal.view.menu; class MenuDialogHelper { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/view/menu/MenuDialogHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuDialogHelper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// .implements Landroid/content/DialogInterface$OnDismissListener;
a=0;// .implements Landroid/content/DialogInterface$OnKeyListener;
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mDialog:Landroid/app/AlertDialog;
a=0;// 
a=0;// .field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field mPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;// .field private mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuDialogHelper;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public dismiss()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 141
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mDialog:Landroid/app/AlertDialog;
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/AlertDialog;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 142
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mDialog:Landroid/app/AlertDialog;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V
a=0;// 
a=0;//     .line 144
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 3
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "which"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0, p2}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z
a=0;// 
a=0;//     .line 171
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->dismiss()V
a=0;// 
a=0;//     .line 156
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;->onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;// 
a=0;//     .line 159
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDismiss(Landroid/content/DialogInterface;)V
a=0;//     .locals 3
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 5
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "keyCode"    # I
a=0;//     .param p3, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 96
a=0;//     #v3=(One);
a=0;//     const/16 v4, 0x52
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-eq p2, v4, :cond_0
a=0;// 
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     if-ne p2, v4, :cond_2
a=0;// 
a=0;//     .line 97
a=0;//     :cond_0
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getRepeatCount()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 99
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mDialog:Landroid/app/AlertDialog;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/AlertDialog;);
a=0;//     invoke-virtual {v4}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 100
a=0;//     .local v2, "win":Landroid/view/Window;
a=0;//     #v2=(Reference,Landroid/view/Window;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 101
a=0;//     invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 102
a=0;//     .local v0, "decor":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 103
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 104
a=0;//     .local v1, "ds":Landroid/view/KeyEvent$DispatcherState;
a=0;//     #v1=(Reference,Landroid/view/KeyEvent$DispatcherState;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 105
a=0;//     invoke-virtual {v1, p3, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 127
a=0;//     .end local v0    # "decor":Landroid/view/View;
a=0;//     .end local v1    # "ds":Landroid/view/KeyEvent$DispatcherState;
a=0;//     .end local v2    # "win":Landroid/view/Window;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     .line 110
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(One);v4=(Integer);
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-ne v4, v3, :cond_2
a=0;// 
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->isCanceled()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 111
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mDialog:Landroid/app/AlertDialog;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/AlertDialog;);
a=0;//     invoke-virtual {v4}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 112
a=0;//     .restart local v2    # "win":Landroid/view/Window;
a=0;//     #v2=(Reference,Landroid/view/Window;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {v2}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 114
a=0;//     .restart local v0    # "decor":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 116
a=0;//     .restart local v1    # "ds":Landroid/view/KeyEvent$DispatcherState;
a=0;//     #v1=(Reference,Landroid/view/KeyEvent$DispatcherState;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1, p3}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v4, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V
a=0;// 
a=0;//     .line 118
a=0;//     invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 127
a=0;//     .end local v0    # "decor":Landroid/view/View;
a=0;//     .end local v1    # "ds":Landroid/view/KeyEvent$DispatcherState;
a=0;//     .end local v2    # "win":Landroid/view/Window;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, p2, p3, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performShortcut(ILandroid/view/KeyEvent;I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
a=0;//     .locals 1
a=0;//     .param p1, "subMenu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;->onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 166
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setPresenterCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;//     .locals 0
a=0;//     .param p1, "cb"    # Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     .line 133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show(Landroid/os/IBinder;)V
a=0;//     .locals 7
a=0;//     .param p1, "windowToken"    # Landroid/os/IBinder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 57
a=0;//     .local v3, "menu":Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     new-instance v0, Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/app/AlertDialog$Builder;);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v4}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 61
a=0;//     .local v0, "builder":Landroid/app/AlertDialog$Builder;
a=0;//     #v0=(Reference,Landroid/app/AlertDialog$Builder;);
a=0;//     new-instance v4, Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     sget v5, Landroid/support/v7/appcompat/R$layout;->abc_list_menu_item_layout:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sget v6, Landroid/support/v7/appcompat/R$style;->Theme_AppCompat_CompactMenu_Dialog:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v4, v5, v6}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;-><init>(II)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     .line 64
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 66
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4, p0}, Landroid/app/AlertDialog$Builder;->setAdapter(Landroid/widget/ListAdapter;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 69
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getHeaderView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 70
a=0;//     .local v1, "headerView":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setCustomTitle(Landroid/view/View;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 79
a=0;//     :goto_0
a=0;//     invoke-virtual {v0, p0}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     .line 82
a=0;//     invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mDialog:Landroid/app/AlertDialog;
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mDialog:Landroid/app/AlertDialog;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mDialog:Landroid/app/AlertDialog;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/AlertDialog;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 86
a=0;//     .local v2, "lp":Landroid/view/WindowManager$LayoutParams;
a=0;//     #v2=(Reference,Landroid/view/WindowManager$LayoutParams;);
a=0;//     const/16 v4, 0x3eb
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     iput v4, v2, Landroid/view/WindowManager$LayoutParams;->type:I
a=0;// 
a=0;//     .line 87
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 88
a=0;//     iput-object p1, v2, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;
a=0;// 
a=0;//     .line 90
a=0;//     :cond_0
a=0;//     iget v4, v2, Landroid/view/WindowManager$LayoutParams;->flags:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/high16 v5, 0x20000
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     or-int/2addr v4, v5
a=0;// 
a=0;//     iput v4, v2, Landroid/view/WindowManager$LayoutParams;->flags:I
a=0;// 
a=0;//     .line 92
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuDialogHelper;->mDialog:Landroid/app/AlertDialog;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/AlertDialog;);
a=0;//     invoke-virtual {v4}, Landroid/app/AlertDialog;->show()V
a=0;// 
a=0;//     .line 93
a=0;//     return-void
a=0;// 
a=0;//     .line 75
a=0;//     .end local v2    # "lp":Landroid/view/WindowManager$LayoutParams;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v5=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getHeaderIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/app/AlertDialog$Builder;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getHeaderTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
