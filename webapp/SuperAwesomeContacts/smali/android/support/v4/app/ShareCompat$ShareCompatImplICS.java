package android.support.v4.app; class ShareCompat$ShareCompatImplICS { void a() { int a;
a=0;// .class Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;
a=0;// .super Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;
a=0;// .source "ShareCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/app/ShareCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "ShareCompatImplICS"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     invoke-direct {p0}, Landroid/support/v4/app/ShareCompat$ShareCompatImplBase;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public configureMenuItem(Landroid/view/MenuItem;Landroid/support/v4/app/ShareCompat$IntentBuilder;)V
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;//     .param p2, "shareIntent"    # Landroid/support/v4/app/ShareCompat$IntentBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     invoke-virtual {p2}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->getActivity()Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {p2}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->getIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     invoke-static {p1, v0, v1}, Landroid/support/v4/app/ShareCompatICS;->configureMenuItem(Landroid/view/MenuItem;Landroid/app/Activity;Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 128
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v4/app/ShareCompat$ShareCompatImplICS;->shouldAddChooserIntent(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     invoke-virtual {p2}, Landroid/support/v4/app/ShareCompat$IntentBuilder;->createChooserIntent()Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     invoke-interface {p1, v0}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 131
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method shouldAddChooserIntent(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     invoke-interface {p1}, Landroid/view/MenuItem;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
