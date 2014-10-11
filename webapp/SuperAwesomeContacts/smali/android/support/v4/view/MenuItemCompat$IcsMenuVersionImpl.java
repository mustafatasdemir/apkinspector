package android.support.v4.view; class MenuItemCompat$IcsMenuVersionImpl { void a() { int a;
a=0;// .class Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl;
a=0;// .super Landroid/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;
a=0;// .source "MenuItemCompat.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/MenuItemCompat;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "IcsMenuVersionImpl"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     invoke-direct {p0}, Landroid/support/v4/view/MenuItemCompat$HoneycombMenuVersionImpl;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public collapseActionView(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 208
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MenuItemCompatIcs;->collapseActionView(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public expandActionView(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MenuItemCompatIcs;->expandActionView(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isActionViewExpanded(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     invoke-static {p1}, Landroid/support/v4/view/MenuItemCompatIcs;->isActionViewExpanded(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;//     .param p2, "listener"    # Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 220
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompatIcs;->setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 227
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     new-instance v0, Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl$1;);
a=0;//     invoke-direct {v0, p0, p2}, Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl$1;-><init>(Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl;Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MenuItemCompat$IcsMenuVersionImpl$1;);
a=0;//     invoke-static {p1, v0}, Landroid/support/v4/view/MenuItemCompatIcs;->setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
