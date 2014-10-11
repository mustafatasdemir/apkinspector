package android.support.v7.internal.widget; class ActionBarView$2 { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ActionBarView$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ActionBarView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/widget/ActionBarView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView$2;->this$0:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView$2;->this$0:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/widget/ActionBarView;->access$100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 153
a=0;//     .local v0, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->collapseActionView()Z
a=0;// 
a=0;//     .line 156
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
