package android.support.v7.internal.widget; class ScrollingTabContainerView { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// .super Landroid/widget/HorizontalScrollView;
a=0;// .source "ScrollingTabContainerView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;,
a=0;//         Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;,
a=0;//         Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "ScrollingTabContainerView"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAllowCollapse:Z
a=0;// 
a=0;// .field private mContentHeight:I
a=0;// 
a=0;// .field private final mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field mMaxTabWidth:I
a=0;// 
a=0;// .field private mSelectedTabIndex:I
a=0;// 
a=0;// .field mStackedTabMaxWidth:I
a=0;// 
a=0;// .field private mTabClickListener:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;// .field private mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 5
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 63
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 64
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 66
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setHorizontalScrollBarEnabled(Z)V
a=0;// 
a=0;//     .line 68
a=0;//     invoke-static {p1}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 69
a=0;//     .local v0, "abp":Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionBarPolicy;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getTabContainerHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setContentHeight(I)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getStackedTabMaxWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mStackedTabMaxWidth:I
a=0;// 
a=0;//     .line 72
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v2, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_tabbar:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 73
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     new-instance v2, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p0, v1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;//     .param p1, "x1"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .param p2, "x2"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->createTabView(Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createSpinner()Landroid/support/v7/internal/widget/SpinnerICS;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$attr;->actionDropDownStyle:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 192
a=0;//     .local v0, "spinner":Landroid/support/v7/internal/widget/SpinnerICS;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     new-instance v1, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/SpinnerICS;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/SpinnerICS;->setOnItemClickListenerInt(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
a=0;// 
a=0;//     .line 195
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private createTabView(Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     .locals 6
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .param p2, "forAdapter"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     #v5=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v2, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_tab:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     .line 241
a=0;//     .local v0, "tabView":Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     invoke-virtual {v0, p0, p1, p2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->attach(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/app/ActionBar$Tab;Z)V
a=0;// 
a=0;//     .line 243
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 244
a=0;//     invoke-virtual {v0, v5}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 245
a=0;//     new-instance v1, Landroid/widget/AbsListView$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/widget/AbsListView$LayoutParams;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mContentHeight:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/AbsListView$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 255
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 248
a=0;//     :cond_0
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setFocusable(Z)V
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabClickListener:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 251
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;);
a=0;//     invoke-direct {v1, p0, v5}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;-><init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabClickListener:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;//     .line 253
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabClickListener:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private isCollapsed()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 128
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-ne v0, p0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private performCollapse()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 136
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 141
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->createSpinner()Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     .line 143
a=0;//     :cond_1
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-nez v0, :cond_2
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;);
a=0;//     invoke-direct {v1, p0, v4}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;-><init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     .line 149
a=0;//     :cond_2
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 150
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 151
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 153
a=0;//     :cond_3
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mSelectedTabIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private performExpand()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 157
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v4
a=0;// 
a=0;//     .line 161
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 164
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V
a=0;//     .locals 6
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .param p2, "position"    # I
a=0;//     .param p3, "setSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 274
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, p1, v5}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->createTabView(Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 275
a=0;//     .local v0, "tabView":Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v2, v5, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v0, p2, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 277
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 278
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     if-eqz p3, :cond_1
a=0;// 
a=0;//     .line 281
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setSelected(Z)V
a=0;// 
a=0;//     .line 283
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 286
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V
a=0;//     .locals 6
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .param p2, "setSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 259
a=0;//     #v5=(Null);
a=0;//     invoke-direct {p0, p1, v5}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->createTabView(Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 260
a=0;//     .local v0, "tabView":Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     new-instance v2, Landroid/widget/LinearLayout$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     const/high16 v4, 0x3f800000
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v2, v5, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     invoke-virtual {v1, v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 263
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 265
a=0;//     :cond_0
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 266
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setSelected(Z)V
a=0;// 
a=0;//     .line 268
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 271
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public animateToTab(I)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 207
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 208
a=0;//     .local v0, "tabView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 209
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 211
a=0;//     :cond_0
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;);
a=0;//     invoke-direct {v1, p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;-><init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/view/View;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 219
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onAttachedToWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V
a=0;// 
a=0;//     .line 224
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 2
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 202
a=0;//     .local v0, "abp":Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionBarPolicy;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getTabContainerHeight()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setContentHeight(I)V
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getStackedTabMaxWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mStackedTabMaxWidth:I
a=0;// 
a=0;//     .line 204
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 236
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onItemClick(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V
a=0;//     .locals 2
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/support/v7/internal/widget/AdapterViewICS",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     .local p1, "parent":Landroid/support/v7/internal/widget/AdapterViewICS;, "Landroid/support/v7/internal/widget/AdapterViewICS<*>;"
a=0;//     move-object v0, p2
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     .line 321
a=0;//     .local v0, "tabView":Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->getTab()Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBar$Tab;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBar$Tab;->select()V
a=0;// 
a=0;//     .line 322
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onMeasure(II)V
a=0;//     .locals 11
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v10, 0x40000000
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 79
a=0;//     #v7=(Null);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 80
a=0;//     .local v5, "widthMode":I
a=0;//     #v5=(Integer);
a=0;//     if-ne v5, v10, :cond_2
a=0;// 
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 81
a=0;//     .local v2, "lockedExpanded":Z
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setFillViewport(Z)V
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v8}, Landroid/widget/LinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 84
a=0;//     .local v1, "childCount":I
a=0;//     #v1=(Integer);
a=0;//     if-le v1, v6, :cond_4
a=0;// 
a=0;//     if-eq v5, v10, :cond_0
a=0;// 
a=0;//     const/high16 v8, -0x80000000
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ne v5, v8, :cond_4
a=0;// 
a=0;//     .line 86
a=0;//     :cond_0
a=0;//     #v8=(Conflicted);
a=0;//     const/4 v8, 0x2
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-le v1, v8, :cond_3
a=0;// 
a=0;//     .line 87
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     int-to-float v8, v8
a=0;// 
a=0;//     #v8=(Float);
a=0;//     const v9, 0x3ecccccd
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     mul-float/2addr v8, v9
a=0;// 
a=0;//     float-to-int v8, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iput v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I
a=0;// 
a=0;//     .line 91
a=0;//     :goto_1
a=0;//     #v9=(Conflicted);
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I
a=0;// 
a=0;//     iget v9, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mStackedTabMaxWidth:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     iput v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I
a=0;// 
a=0;//     .line 96
a=0;//     :goto_2
a=0;//     #v9=(Conflicted);
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mContentHeight:I
a=0;// 
a=0;//     invoke-static {v8, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result p2
a=0;// 
a=0;//     .line 98
a=0;//     if-nez v2, :cond_5
a=0;// 
a=0;//     iget-boolean v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_5
a=0;// 
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 100
a=0;//     .local v0, "canCollapse":Z
a=0;//     :goto_3
a=0;//     #v0=(Boolean);v8=(Integer);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v6, v7, p2}, Landroid/widget/LinearLayout;->measure(II)V
a=0;// 
a=0;//     .line 103
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/widget/LinearLayout;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-le v6, v7, :cond_6
a=0;// 
a=0;//     .line 104
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->performCollapse()V
a=0;// 
a=0;//     .line 112
a=0;//     :goto_4
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 113
a=0;//     .local v4, "oldWidth":I
a=0;//     #v4=(Integer);
a=0;//     invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->onMeasure(II)V
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 116
a=0;//     .local v3, "newWidth":I
a=0;//     #v3=(Integer);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     if-eq v4, v3, :cond_1
a=0;// 
a=0;//     .line 118
a=0;//     iget v6, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mSelectedTabIndex:I
a=0;// 
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V
a=0;// 
a=0;//     .line 120
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "canCollapse":Z
a=0;//     .end local v1    # "childCount":I
a=0;//     .end local v2    # "lockedExpanded":Z
a=0;//     .end local v3    # "newWidth":I
a=0;//     .end local v4    # "oldWidth":I
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(One);v7=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     move v2, v7
a=0;// 
a=0;//     .line 80
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 89
a=0;//     .restart local v1    # "childCount":I
a=0;//     .restart local v2    # "lockedExpanded":Z
a=0;//     :cond_3
a=0;//     #v1=(Integer);v2=(Boolean);v8=(PosByte);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     div-int/lit8 v8, v8, 0x2
a=0;// 
a=0;//     iput v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 93
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);
a=0;//     const/4 v8, -0x1
a=0;// 
a=0;//     #v8=(Byte);
a=0;//     iput v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_5
a=0;//     #v8=(Integer);v9=(Conflicted);
a=0;//     move v0, v7
a=0;// 
a=0;//     .line 98
a=0;//     #v0=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 106
a=0;//     .restart local v0    # "canCollapse":Z
a=0;//     :cond_6
a=0;//     #v0=(Boolean);v6=(Integer);v7=(Integer);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->performExpand()Z
a=0;// 
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 109
a=0;//     :cond_7
a=0;//     #v6=(One);v7=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->performExpand()Z
a=0;// 
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method public removeAllTabs()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 309
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 311
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 313
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 314
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 316
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeTabAt(I)V
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->removeViewAt(I)V
a=0;// 
a=0;//     .line 300
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 303
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 304
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 306
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAllowCollapse(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "allowCollapse"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     .line 133
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentHeight(I)V
a=0;//     .locals 0
a=0;//     .param p1, "contentHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mContentHeight:I
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 187
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTabSelected(I)V
a=0;//     .locals 5
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mSelectedTabIndex:I
a=0;// 
a=0;//     .line 170
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v4}, Landroid/widget/LinearLayout;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 171
a=0;//     .local v3, "tabCount":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     if-ge v1, v3, :cond_2
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 173
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-ne v1, p1, :cond_1
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 174
a=0;//     .local v2, "isSelected":Z
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V
a=0;// 
a=0;//     .line 175
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 176
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->animateToTab(I)V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 173
a=0;//     .end local v2    # "isSelected":Z
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 179
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     if-ltz p1, :cond_3
a=0;// 
a=0;//     .line 180
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V
a=0;// 
a=0;//     .line 182
a=0;//     :cond_3
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public updateTab(I)V
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 289
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->update()V
a=0;// 
a=0;//     .line 290
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 293
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 294
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V
a=0;// 
a=0;//     .line 296
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
}}
