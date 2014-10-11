package android.support.v7.internal.widget; class ScrollingTabContainerView$TabClickListener { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ScrollingTabContainerView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "TabClickListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 471
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;-><init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 474
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     .line 475
a=0;//     .local v3, "tabView":Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->getTab()Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v4}, Landroid/support/v7/app/ActionBar$Tab;->select()V
a=0;// 
a=0;//     .line 476
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-static {v4}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->access$200(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/LinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 477
a=0;//     .local v2, "tabCount":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 478
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-static {v4}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->access$200(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 479
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v0, v4}, Landroid/view/View;->setSelected(Z)V
a=0;// 
a=0;//     .line 477
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 479
a=0;//     :cond_0
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 481
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
