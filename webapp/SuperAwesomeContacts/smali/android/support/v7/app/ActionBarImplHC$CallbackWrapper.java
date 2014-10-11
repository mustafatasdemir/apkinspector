package android.support.v7.app; class ActionBarImplHC$CallbackWrapper { void a() { int a;
a=0;// .class Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarImplHC.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ActionMode$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/app/ActionBarImplHC;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "CallbackWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mWrappedCallback:Landroid/view/ActionMode$Callback;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/app/ActionBarImplHC;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/app/ActionBarImplHC;Landroid/view/ActionMode$Callback;)V
a=0;//     .locals 0
a=0;//     .param p2, "callback"    # Landroid/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->this$0:Landroid/support/v7/app/ActionBarImplHC;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 76
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;);
a=0;//     iput-object p2, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->mWrappedCallback:Landroid/view/ActionMode$Callback;
a=0;// 
a=0;//     .line 77
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->mWrappedCallback:Landroid/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->mWrappedCallback:Landroid/view/ActionMode$Callback;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ActionMode$Callback;);
a=0;//     invoke-interface {v1, p1, p2}, Landroid/view/ActionMode$Callback;->onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 82
a=0;//     .local v0, "wrappedResult":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 84
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->this$0:Landroid/support/v7/app/ActionBarImplHC;
a=0;// 
a=0;//     invoke-static {v1, p1}, Landroid/support/v7/app/ActionBarImplHC;->access$002(Landroid/support/v7/app/ActionBarImplHC;Landroid/view/ActionMode;)Landroid/view/ActionMode;
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->this$0:Landroid/support/v7/app/ActionBarImplHC;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarImplHC;->showForActionMode()V
a=0;// 
a=0;//     .line 88
a=0;//     :cond_0
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyActionMode(Landroid/view/ActionMode;)V
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 103
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->mWrappedCallback:Landroid/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1}, Landroid/view/ActionMode$Callback;->onDestroyActionMode(Landroid/view/ActionMode;)V
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->this$0:Landroid/support/v7/app/ActionBarImplHC;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplHC;->hideForActionMode()V
a=0;// 
a=0;//     .line 108
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->this$0:Landroid/support/v7/app/ActionBarImplHC;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v7/app/ActionBarImplHC;->access$002(Landroid/support/v7/app/ActionBarImplHC;Landroid/view/ActionMode;)Landroid/view/ActionMode;
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplHC$CallbackWrapper;->mWrappedCallback:Landroid/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ActionMode$Callback;);
a=0;//     invoke-interface {v0, p1, p2}, Landroid/view/ActionMode$Callback;->onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
