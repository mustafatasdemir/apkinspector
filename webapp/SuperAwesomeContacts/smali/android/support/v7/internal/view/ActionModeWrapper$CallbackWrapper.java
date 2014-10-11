package android.support.v7.internal.view; class ActionModeWrapper$CallbackWrapper { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionModeWrapper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/ActionMode$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "CallbackWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mLastStartedActionMode:Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;// .field final mWrappedCallback:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "supportCallback"    # Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 118
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 119
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 120
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mWrappedCallback:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private getActionModeWrapper(Landroid/view/ActionMode;)Landroid/support/v7/view/ActionMode;
a=0;//     .locals 1
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mLastStartedActionMode:Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionModeWrapper;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mLastStartedActionMode:Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/view/ActionModeWrapper;->mWrappedObject:Landroid/view/ActionMode;
a=0;// 
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mLastStartedActionMode:Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     .line 156
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {p0, v0, p1}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "mode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/ActionModeWrapper;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapper;-><init>(Landroid/content/Context;Landroid/view/ActionMode;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionModeWrapper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
a=0;//     .locals 3
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 138
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mWrappedCallback:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/ActionMode$Callback;);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->getActionModeWrapper(Landroid/view/ActionMode;)Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/view/ActionMode;);
a=0;//     invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuItemWrapper(Landroid/view/MenuItem;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/support/v7/view/ActionMode$Callback;->onActionItemClicked(Landroid/support/v7/view/ActionMode;Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
a=0;//     .locals 3
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mWrappedCallback:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/ActionMode$Callback;);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->getActionModeWrapper(Landroid/view/ActionMode;)Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/view/ActionMode;);
a=0;//     invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuWrapper(Landroid/view/Menu;)Landroid/view/Menu;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/support/v7/view/ActionMode$Callback;->onCreateActionMode(Landroid/support/v7/view/ActionMode;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onDestroyActionMode(Landroid/view/ActionMode;)V
a=0;//     .locals 2
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 144
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mWrappedCallback:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/ActionMode$Callback;);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->getActionModeWrapper(Landroid/view/ActionMode;)Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/view/ActionMode;);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v7/view/ActionMode$Callback;->onDestroyActionMode(Landroid/support/v7/view/ActionMode;)V
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
a=0;//     .locals 3
a=0;//     .param p1, "mode"    # Landroid/view/ActionMode;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 131
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mWrappedCallback:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/view/ActionMode$Callback;);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->getActionModeWrapper(Landroid/view/ActionMode;)Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/view/ActionMode;);
a=0;//     invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuWrapper(Landroid/view/Menu;)Landroid/view/Menu;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/Menu;);
a=0;//     invoke-interface {v0, v1, v2}, Landroid/support/v7/view/ActionMode$Callback;->onPrepareActionMode(Landroid/support/v7/view/ActionMode;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setLastStartedActionMode(Landroid/support/v7/internal/view/ActionModeWrapper;)V
a=0;//     .locals 0
a=0;//     .param p1, "modeWrapper"    # Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 148
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;->mLastStartedActionMode:Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;// 
a=0;//     .line 149
a=0;//     return-void
a=0;// .end method
}}
