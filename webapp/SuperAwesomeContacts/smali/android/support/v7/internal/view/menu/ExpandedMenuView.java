package android.support.v7.internal.view.menu; class ExpandedMenuView { void a() { int a;
a=0;// .class public final Landroid/support/v7/internal/view/menu/ExpandedMenuView;
a=0;// .super Landroid/widget/ListView;
a=0;// .source "ExpandedMenuView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuView;
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAnimations:I
a=0;// 
a=0;// .field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 43
a=0;//     invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 44
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ExpandedMenuView;);
a=0;//     invoke-virtual {p0, p0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 45
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getWindowAnimations()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->mAnimations:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public initialize(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 50
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public invokeItem(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 2
a=0;//     .param p1, "item"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-super {p0}, Landroid/widget/ListView;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 57
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->setChildrenDrawingCacheEnabled(Z)V
a=0;// 
a=0;//     .line 58
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 1
a=0;//     .param p1, "parent"    # Landroid/widget/AdapterView;
a=0;//     .param p2, "v"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->getAdapter()Landroid/widget/ListAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     invoke-interface {v0, p3}, Landroid/widget/ListAdapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ExpandedMenuView;->invokeItem(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;// 
a=0;//     .line 69
a=0;//     return-void
a=0;// .end method
}}
