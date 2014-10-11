package android.support.v4.view; class MenuItemCompatIcs { void a() { int a;
a=0;// .class Landroid/support/v4/view/MenuItemCompatIcs;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuItemCompatIcs.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;,
a=0;//         Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     #p0=(Reference,Landroid/support/v4/view/MenuItemCompatIcs;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static collapseActionView(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p0, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-interface {p0}, Landroid/view/MenuItem;->collapseActionView()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static expandActionView(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p0, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     invoke-interface {p0}, Landroid/view/MenuItem;->expandActionView()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static isActionViewExpanded(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p0, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 32
a=0;//     invoke-interface {p0}, Landroid/view/MenuItem;->isActionViewExpanded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public static setOnActionExpandListener(Landroid/view/MenuItem;Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p0, "item"    # Landroid/view/MenuItem;
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     new-instance v0, Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;-><init>(Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;);
a=0;//     invoke-interface {p0, v0}, Landroid/view/MenuItem;->setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
