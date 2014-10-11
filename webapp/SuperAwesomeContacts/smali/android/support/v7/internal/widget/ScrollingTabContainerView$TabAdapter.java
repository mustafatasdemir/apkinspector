package android.support.v7.internal.widget; class ScrollingTabContainerView$TabAdapter { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "ScrollingTabContainerView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "TabAdapter"
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
a=0;//     .line 443
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 443
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;-><init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 447
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->access$200(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 452
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->access$200(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->getTab()Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 457
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 3
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 462
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 463
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-static {v1, v0, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->access$300(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 467
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object p2
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     .line 465
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->bindTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
