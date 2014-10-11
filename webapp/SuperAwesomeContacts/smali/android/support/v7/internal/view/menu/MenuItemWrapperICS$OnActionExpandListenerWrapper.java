package android.support.v7.internal.view.menu; class MenuItemWrapperICS$OnActionExpandListenerWrapper { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnActionExpandListenerWrapper;
a=0;// .super Landroid/support/v7/internal/view/menu/BaseWrapper;
a=0;// .source "MenuItemWrapperICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "OnActionExpandListenerWrapper"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/support/v7/internal/view/menu/BaseWrapper",
a=0;//         "<",
a=0;//         "Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;",
a=0;//         ">;",
a=0;//         "Landroid/view/MenuItem$OnActionExpandListener;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)V
a=0;//     .locals 0
a=0;//     .param p2, "object"    # Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 377
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnActionExpandListenerWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     .line 378
a=0;//     invoke-direct {p0, p2}, Landroid/support/v7/internal/view/menu/BaseWrapper;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 379
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnActionExpandListenerWrapper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnActionExpandListenerWrapper;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnActionExpandListenerWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemActionExpand(Landroid/view/MenuItem;)Z
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 383
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnActionExpandListenerWrapper;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnActionExpandListenerWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
