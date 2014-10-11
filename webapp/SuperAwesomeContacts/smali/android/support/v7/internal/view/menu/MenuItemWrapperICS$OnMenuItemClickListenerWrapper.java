package android.support.v7.internal.view.menu; class MenuItemWrapperICS$OnMenuItemClickListenerWrapper { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;
a=0;// .super Landroid/support/v7/internal/view/menu/BaseWrapper;
a=0;// .source "MenuItemWrapperICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "OnMenuItemClickListenerWrapper"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Landroid/support/v7/internal/view/menu/BaseWrapper",
a=0;//         "<",
a=0;//         "Landroid/view/MenuItem$OnMenuItemClickListener;",
a=0;//         ">;",
a=0;//         "Landroid/view/MenuItem$OnMenuItemClickListener;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;Landroid/view/MenuItem$OnMenuItemClickListener;)V
a=0;//     .locals 0
a=0;//     .param p2, "object"    # Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     .line 365
a=0;//     invoke-direct {p0, p2}, Landroid/support/v7/internal/view/menu/BaseWrapper;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 366
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onMenuItemClick(Landroid/view/MenuItem;)Z
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 370
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;->mWrappedObject:Ljava/lang/Object;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$OnMenuItemClickListenerWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->getMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-interface {v0, v1}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
