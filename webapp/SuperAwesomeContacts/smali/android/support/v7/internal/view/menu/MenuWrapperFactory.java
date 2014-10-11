package android.support.v7.internal.view.menu; class MenuWrapperFactory { void a() { int a;
a=0;// .class public final Landroid/support/v7/internal/view/menu/MenuWrapperFactory;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuWrapperFactory.java"
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 31
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuWrapperFactory;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static createMenuItemWrapper(Landroid/view/MenuItem;)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p0, "frameworkMenuItem"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 42
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;-><init>(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;);
a=0;//     move-object p0, v0
a=0;// 
a=0;//     .line 46
a=0;//     .end local p0    # "frameworkMenuItem":Landroid/view/MenuItem;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 43
a=0;//     .restart local p0    # "frameworkMenuItem":Landroid/view/MenuItem;
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 44
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;-><init>(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     move-object p0, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static createMenuWrapper(Landroid/view/Menu;)Landroid/view/Menu;
a=0;//     .locals 2
a=0;//     .param p0, "frameworkMenu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuWrapperICS;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;-><init>(Landroid/view/Menu;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuWrapperICS;);
a=0;//     move-object p0, v0
a=0;// 
a=0;//     .line 37
a=0;//     .end local p0    # "frameworkMenu":Landroid/view/Menu;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public static createSupportMenuItemWrapper(Landroid/view/MenuItem;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 2
a=0;//     .param p0, "frameworkMenuItem"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 66
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperJB;-><init>(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     .line 69
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 68
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;-><init>(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemWrapperICS;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 71
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static createSupportMenuWrapper(Landroid/view/Menu;)Landroid/support/v4/internal/view/SupportMenu;
a=0;//     .locals 2
a=0;//     .param p0, "frameworkMenu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuWrapperICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuWrapperICS;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuWrapperICS;-><init>(Landroid/view/Menu;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuWrapperICS;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 53
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public static createSupportSubMenuWrapper(Landroid/view/SubMenu;)Landroid/support/v4/internal/view/SupportSubMenu;
a=0;//     .locals 2
a=0;//     .param p0, "frameworkSubMenu"    # Landroid/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 58
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;-><init>(Landroid/view/SubMenu;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/SubMenuWrapperICS;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 61
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
}}
