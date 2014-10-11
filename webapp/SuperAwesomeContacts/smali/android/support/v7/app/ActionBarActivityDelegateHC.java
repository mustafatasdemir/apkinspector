package android.support.v7.app; class ActionBarActivityDelegateHC { void a() { int a;
a=0;// .class Landroid/support/v7/app/ActionBarActivityDelegateHC;
a=0;// .super Landroid/support/v7/app/ActionBarActivityDelegateBase;
a=0;// .source "ActionBarActivityDelegateHC.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateBase;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     .line 23
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateHC;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateHC;->ensureSubDecor()V
a=0;// 
a=0;//     .line 28
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarImplHC;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarImplHC;);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateHC;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateHC;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/support/v7/app/ActionBarImplHC;-><init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplHC;);
a=0;//     return-object v0
a=0;// .end method
}}
