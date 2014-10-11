package android.support.v7.app; class ActionBarActivityDelegateJB { void a() { int a;
a=0;// .class Landroid/support/v7/app/ActionBarActivityDelegateJB;
a=0;// .super Landroid/support/v7/app/ActionBarActivityDelegateICS;
a=0;// .source "ActionBarActivityDelegateJB.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateICS;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     .line 28
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateJB;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method createActionModeCallbackWrapper(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/internal/view/ActionModeWrapper$CallbackWrapper;
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "callback"    # Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapperJB$CallbackWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/ActionModeWrapperJB$CallbackWrapper;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapperJB$CallbackWrapper;-><init>(Landroid/content/Context;Landroid/support/v7/view/ActionMode$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionModeWrapperJB$CallbackWrapper;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method createActionModeWrapper(Landroid/content/Context;Landroid/view/ActionMode;)Landroid/support/v7/internal/view/ActionModeWrapper;
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "frameworkMode"    # Landroid/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     new-instance v0, Landroid/support/v7/internal/view/ActionModeWrapperJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/ActionModeWrapperJB;);
a=0;//     invoke-direct {v0, p1, p2}, Landroid/support/v7/internal/view/ActionModeWrapperJB;-><init>(Landroid/content/Context;Landroid/view/ActionMode;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionModeWrapperJB;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public createSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarImplJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarImplJB;);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateJB;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateJB;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/support/v7/app/ActionBarImplJB;-><init>(Landroid/app/Activity;Landroid/support/v7/app/ActionBar$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplJB;);
a=0;//     return-object v0
a=0;// .end method
}}
