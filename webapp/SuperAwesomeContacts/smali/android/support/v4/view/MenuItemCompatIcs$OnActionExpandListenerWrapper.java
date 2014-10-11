package android.support.v4.view; class MenuItemCompatIcs$OnActionExpandListenerWrapper { void a() { int a;
a=0;// .class Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuItemCompatIcs.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/MenuItemCompatIcs;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "OnActionExpandListenerWrapper"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mWrapped:Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;)V
a=0;//     .locals 0
a=0;//     .param p1, "wrapped"    # Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 55
a=0;//     #p0=(Reference,Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;);
a=0;//     iput-object p1, p0, Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;->mWrapped:Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;
a=0;// 
a=0;//     .line 56
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 65
a=0;//     iget-object v0, p0, Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;->mWrapped:Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     iget-object v0, p0, Landroid/support/v4/view/MenuItemCompatIcs$OnActionExpandListenerWrapper;->mWrapped:Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v4/view/MenuItemCompatIcs$SupportActionExpandProxy;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
