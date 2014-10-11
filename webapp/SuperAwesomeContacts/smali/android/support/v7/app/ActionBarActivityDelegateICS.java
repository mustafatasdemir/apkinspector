package android.support.v7.app; class ActionBarActivityDelegateICS { void a() { int a;
a=0;// .class Landroid/support/v7/app/ActionBarActivityDelegateICS;
a=0;// .super Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// .source "ActionBarActivityDelegateICS.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mMenu:Landroid/view/Menu;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegate;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     .line 42
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateICS;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "lp"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 120
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superAddContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method createActionModeCallbackWrapper(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "callback"    # Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;-><init>(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "frameworkMode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/ActionModeWrapper;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapper;-><init>(Landroid/content/Context;Landroid/view/ActionMode;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionModeWrapper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public createSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 46
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarImplICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarImplICS;);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/support/v7/app/ActionBarImplICS;-><init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplICS;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method createWindowCallbackWrapper(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;
a=0;//     .locals 1
a=0;//     .param p1, "cb"    # Landroid/view/Window$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;);
a=0;//     invoke-direct {v0, p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;-><init>(Landroid/support/v7/app/ActionBarActivityDelegateICS;Landroid/view/Window$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateICS$WindowCallbackWrapper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getHomeAsUpIndicatorAttrId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     const v0, 0x101030b
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onActionModeFinished(Landroid/view/ActionMode;)V
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->getActionBarThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p0, v1, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportActionModeFinished(Landroid/support/v7/view/ActionMode;)V
a=0;// 
a=0;//     .line 222
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onActionModeStarted(Landroid/view/ActionMode;)V
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->getActionBarThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p0, v1, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportActionModeStarted(Landroid/support/v7/view/ActionMode;)V
a=0;// 
a=0;//     .line 197
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 0
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onContentChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V
a=0;// 
a=0;//     .line 127
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 4
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 52
a=0;//     #v3=(One);
a=0;//     const-string v1, "splitActionBarWhenNarrow"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->getUiOptionsFromMetadata()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 53
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, v3, v3}, Landroid/view/Window;->setUiOptions(II)V
a=0;// 
a=0;//     .line 57
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegate;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 59
a=0;//     iget-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mHasActionBar:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 62
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 64
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mOverlayActionBar:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 65
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     const/16 v2, 0x9
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     .line 83
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 84
a=0;//     .local v0, "w":Landroid/view/Window;
a=0;//     #v0=(Reference,Landroid/view/Window;);
a=0;//     invoke-virtual {v0}, Landroid/view/Window;->getCallback()Landroid/view/Window$Callback;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createWindowCallbackWrapper(Landroid/view/Window$Callback;)Landroid/view/Window$Callback;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/Window;->setCallback(Landroid/view/Window$Callback;)V
a=0;// 
a=0;//     .line 85
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;//     .locals 2
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_2
a=0;// 
a=0;//     .line 143
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/Menu;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 144
a=0;//     invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuWrapper(Landroid/view/Menu;)Landroid/view/Menu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;
a=0;// 
a=0;//     .line 146
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Menu;);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v7/app/ActionBarActivity;->superOnCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 148
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreatePanelView(I)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 161
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 162
a=0;//     invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuItemWrapper(Landroid/view/MenuItem;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 164
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostResume()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;//     .locals 2
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 154
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/Menu;);
a=0;//     invoke-virtual {v0, p1, p2, v1}, Landroid/support/v7/app/ActionBarActivity;->superOnPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 156
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(PosByte);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/app/ActionBarActivity;->superOnPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTitleChanged(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(I)V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 106
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "lp"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 116
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setSupportProgress(I)V
a=0;//     .locals 1
a=0;//     .param p1, "progress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->setProgress(I)V
a=0;// 
a=0;//     .line 217
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setSupportProgressBarIndeterminate(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "indeterminate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 211
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->setProgressBarIndeterminate(Z)V
a=0;// 
a=0;//     .line 212
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setSupportProgressBarIndeterminateVisibility(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 206
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->setProgressBarIndeterminateVisibility(Z)V
a=0;// 
a=0;//     .line 207
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setSupportProgressBarVisibility(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 201
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->setProgressBarVisibility(Z)V
a=0;// 
a=0;//     .line 202
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startSupportActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
a=0;//     .locals 6
a=0;//     .param p1, "callback"    # Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 175
a=0;//     new-instance v4, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v5, "ActionMode callback can not be null."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 178
a=0;//     :cond_0
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->getActionBarThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 180
a=0;//     .local v0, "context":Landroid/content/Context;
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p0, v0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createActionModeCallbackWrapper(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 182
a=0;//     .local v2, "wrappedCallback":Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 184
a=0;//     .local v3, "wrappedMode":Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v4, v2}, Landroid/support/v7/app/ActionBarActivity;->startActionMode(Landroid/view/ActionMode$Callback;)Landroid/view/ActionMode;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 186
a=0;//     .local v1, "frameworkMode":Landroid/view/ActionMode;
a=0;//     #v1=(Reference,Landroid/view/ActionMode;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 187
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;->createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 188
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/ActionModeWrapper;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->setLastStartedActionMode(Landroid/support/v7/internal/view/ActionModeWrapper;)V
a=0;// 
a=0;//     .line 191
a=0;//     :cond_1
a=0;//     return-object v3
a=0;// .end method
a=0;// 
a=0;// .method public supportInvalidateOptionsMenu()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 226
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mMenu:Landroid/view/Menu;
a=0;// 
a=0;//     .line 227
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public supportRequestWindowFeature(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateICS;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
