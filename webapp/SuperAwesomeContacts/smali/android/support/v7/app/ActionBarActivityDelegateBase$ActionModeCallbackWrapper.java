package android.support.v7.app; class ActionBarActivityDelegateBase$ActionModeCallbackWrapper { void a() { int a;
a=0;// .class Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarActivityDelegateBase.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/app/ActionBarActivityDelegateBase;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ActionModeCallbackWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mWrapped:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/app/ActionBarActivityDelegateBase;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/app/ActionBarActivityDelegateBase;Landroid/support/v7/view/ActionMode$Callback;)V
a=0;//     .locals 0
a=0;//     .param p2, "wrapped"    # Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 668
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;->this$0:Landroid/support/v7/app/ActionBarActivityDelegateBase;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 669
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;);
a=0;//     iput-object p2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;->mWrapped:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .line 670
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onActionItemClicked(Landroid/support/v7/view/ActionMode;Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Landroid/support/v7/view/ActionMode;
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 681
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;->mWrapped:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v7/view/ActionMode$Callback;->onActionItemClicked(Landroid/support/v7/view/ActionMode;Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionMode(Landroid/support/v7/view/ActionMode;Landroid/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Landroid/support/v7/view/ActionMode;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 673
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;->mWrapped:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v7/view/ActionMode$Callback;->onCreateActionMode(Landroid/support/v7/view/ActionMode;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyActionMode(Landroid/support/v7/view/ActionMode;)V
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 685
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;->mWrapped:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v7/view/ActionMode$Callback;->onDestroyActionMode(Landroid/support/v7/view/ActionMode;)V
a=0;// 
a=0;//     .line 686
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;->this$0:Landroid/support/v7/app/ActionBarActivityDelegateBase;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->onSupportActionModeFinished(Landroid/support/v7/view/ActionMode;)V
a=0;// 
a=0;//     .line 687
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;->this$0:Landroid/support/v7/app/ActionBarActivityDelegateBase;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->access$002(Landroid/support/v7/app/ActionBarActivityDelegateBase;Landroid/support/v7/view/ActionMode;)Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     .line 688
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareActionMode(Landroid/support/v7/view/ActionMode;Landroid/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Landroid/support/v7/view/ActionMode;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 677
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;->mWrapped:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v7/view/ActionMode$Callback;->onPrepareActionMode(Landroid/support/v7/view/ActionMode;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
