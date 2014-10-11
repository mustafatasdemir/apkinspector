package android.support.v7.internal.view.menu; class MenuItemWrapperICS$ActionProviderWrapper$1 { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuItemWrapperICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ActionProvider$VisibilityListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;-><init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;Landroid/support/v4/view/ActionProvider;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
a=0;// 
a=0;// .field final synthetic val$this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
a=0;// 
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->val$this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onActionProviderVisibilityChanged(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "isVisible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 403
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->mInner:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/view/ActionProvider;->overridesItemVisibility()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->access$100(Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 404
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper$1;->this$1:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS$ActionProviderWrapper;->this$0:Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;->wrappedSetVisible(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 406
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
