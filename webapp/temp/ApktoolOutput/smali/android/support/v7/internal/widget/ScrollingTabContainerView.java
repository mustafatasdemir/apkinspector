package android.support.v7.internal.widget; class ScrollingTabContainerView {/*

.class public Landroid/support/v7/internal/widget/ScrollingTabContainerView;
.super Landroid/widget/HorizontalScrollView;
.source "ScrollingTabContainerView.java"

# interfaces
.implements Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;,
        Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;,
        Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
    }
.end annotation


# static fields
.field private static final TAG:Ljava/lang/String; = "ScrollingTabContainerView"


# instance fields
.field private mAllowCollapse:Z

.field private mContentHeight:I

.field private final mInflater:Landroid/view/LayoutInflater;

.field mMaxTabWidth:I

.field private mSelectedTabIndex:I

.field mStackedTabMaxWidth:I

.field private mTabClickListener:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;

.field private mTabLayout:Landroid/widget/LinearLayout;

.field mTabSelector:Ljava/lang/Runnable;

.field private mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5
    .parameter "context"

    .prologue
    const/4 v3, 0x0

    .line 63
    #v3=(Null);
    invoke-direct {p0, p1}, Landroid/widget/HorizontalScrollView;-><init>(Landroid/content/Context;)V

    .line 64
    #p0=(Reference);
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mInflater:Landroid/view/LayoutInflater;

    .line 66
    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setHorizontalScrollBarEnabled(Z)V

    .line 68
    invoke-static {p1}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;

    move-result-object v0

    .line 69
    .local v0, abp:Landroid/support/v7/internal/view/ActionBarPolicy;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getTabContainerHeight()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setContentHeight(I)V

    .line 70
    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getStackedTabMaxWidth()I

    move-result v1

    iput v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mStackedTabMaxWidth:I

    .line 72
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mInflater:Landroid/view/LayoutInflater;

    #v1=(Reference);
    sget v2, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_tabbar:I

    #v2=(Integer);
    invoke-virtual {v1, v2, p0, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/LinearLayout;

    iput-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    .line 73
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    #v2=(UninitRef);
    const/4 v3, -0x2

    #v3=(Byte);
    const/4 v4, -0x1

    #v4=(Byte);
    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    #v2=(Reference);
    invoke-virtual {p0, v1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 75
    return-void
.end method

.method static synthetic access$200(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)Landroid/widget/LinearLayout;
    .locals 1
    .parameter "x0"

    .prologue
    .line 44
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
    .locals 1
    .parameter "x0"
    .parameter "x1"
    .parameter "x2"

    .prologue
    .line 44
    invoke-direct {p0, p1, p2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->createTabView(Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method private createSpinner()Landroid/support/v7/internal/widget/SpinnerICS;
    .locals 4

    .prologue
    .line 190
    new-instance v0, Landroid/support/v7/internal/widget/SpinnerICS;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    sget v3, Landroid/support/v7/appcompat/R$attr;->actionDropDownStyle:I

    #v3=(Integer);
    invoke-direct {v0, v1, v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 192
    .local v0, spinner:Landroid/support/v7/internal/widget/SpinnerICS;
    #v0=(Reference);
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    #v1=(UninitRef);
    const/4 v2, -0x2

    #v2=(Byte);
    const/4 v3, -0x1

    #v3=(Byte);
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/SpinnerICS;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 194
    invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/SpinnerICS;->setOnItemClickListenerInt(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V

    .line 195
    return-object v0
.end method

.method private createTabView(Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
    .locals 6
    .parameter "tab"
    .parameter "forAdapter"

    .prologue
    const/4 v5, 0x0

    .line 239
    #v5=(Null);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mInflater:Landroid/view/LayoutInflater;

    #v1=(Reference);
    sget v2, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_tab:I

    #v2=(Integer);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    invoke-virtual {v1, v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;

    .line 241
    .local v0, tabView:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
    invoke-virtual {v0, p0, p1, p2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->attach(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/app/ActionBar$Tab;Z)V

    .line 243
    if-eqz p2, :cond_0

    .line 244
    invoke-virtual {v0, v5}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 245
    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    #v1=(UninitRef);
    const/4 v2, -0x1

    #v2=(Byte);
    iget v3, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mContentHeight:I

    #v3=(Integer);
    invoke-direct {v1, v2, v3}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 255
    :goto_0
    #v2=(Integer);v3=(Conflicted);
    return-object v0

    .line 248
    :cond_0
    #v3=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setFocusable(Z)V

    .line 250
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabClickListener:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;

    #v1=(Reference);
    if-nez v1, :cond_1

    .line 251
    new-instance v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v5}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;-><init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabClickListener:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;

    .line 253
    :cond_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabClickListener:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method

.method private isCollapsed()Z
    .locals 1

    .prologue
    .line 128
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method private performCollapse()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 136
    #v4=(Null);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->isCollapsed()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 154
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return-void

    .line 140
    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    #v0=(Reference);
    if-nez v0, :cond_1

    .line 141
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->createSpinner()Landroid/support/v7/internal/widget/SpinnerICS;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    .line 143
    :cond_1
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeView(Landroid/view/View;)V

    .line 144
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    #v1=(UninitRef);
    const/4 v2, -0x2

    #v2=(Byte);
    const/4 v3, -0x1

    #v3=(Byte);
    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    #v1=(Reference);
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    if-nez v0, :cond_2

    .line 147
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    new-instance v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v4}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;-><init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 149
    :cond_2
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    if-eqz v0, :cond_3

    .line 150
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 151
    iput-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    .line 153
    :cond_3
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    iget v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mSelectedTabIndex:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V

    goto :goto_0
.end method

.method private performExpand()Z
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 157
    #v4=(Null);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->isCollapsed()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 165
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v4

    .line 161
    :cond_0
    #v0=(Boolean);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeView(Landroid/view/View;)V

    .line 162
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    #v1=(UninitRef);
    const/4 v2, -0x2

    #v2=(Byte);
    const/4 v3, -0x1

    #v3=(Byte);
    invoke-direct {v1, v2, v3}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    #v1=(Reference);
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 164
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I

    move-result v0

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V

    goto :goto_0
.end method


# virtual methods
.method public addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V
    .locals 6
    .parameter "tab"
    .parameter "position"
    .parameter "setSelected"

    .prologue
    const/4 v5, 0x0

    .line 274
    #v5=(Null);
    invoke-direct {p0, p1, v5}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->createTabView(Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;

    move-result-object v0

    .line 275
    .local v0, tabView:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v1=(Reference);
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    #v2=(UninitRef);
    const/4 v3, -0x1

    #v3=(Byte);
    const/high16 v4, 0x3f80

    #v4=(Integer);
    invoke-direct {v2, v5, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    #v2=(Reference);
    invoke-virtual {v1, v0, p2, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 277
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    if-eqz v1, :cond_0

    .line 278
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v1

    check-cast v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V

    .line 280
    :cond_0
    if-eqz p3, :cond_1

    .line 281
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setSelected(Z)V

    .line 283
    :cond_1
    #v1=(Conflicted);
    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z

    #v1=(Boolean);
    if-eqz v1, :cond_2

    .line 284
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V

    .line 286
    :cond_2
    return-void
.end method

.method public addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V
    .locals 6
    .parameter "tab"
    .parameter "setSelected"

    .prologue
    const/4 v5, 0x0

    .line 259
    #v5=(Null);
    invoke-direct {p0, p1, v5}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->createTabView(Landroid/support/v7/app/ActionBar$Tab;Z)Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;

    move-result-object v0

    .line 260
    .local v0, tabView:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v1=(Reference);
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    #v2=(UninitRef);
    const/4 v3, -0x1

    #v3=(Byte);
    const/high16 v4, 0x3f80

    #v4=(Integer);
    invoke-direct {v2, v5, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    #v2=(Reference);
    invoke-virtual {v1, v0, v2}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 262
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    if-eqz v1, :cond_0

    .line 263
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v1

    check-cast v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V

    .line 265
    :cond_0
    if-eqz p2, :cond_1

    .line 266
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->setSelected(Z)V

    .line 268
    :cond_1
    #v1=(Conflicted);
    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z

    #v1=(Boolean);
    if-eqz v1, :cond_2

    .line 269
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V

    .line 271
    :cond_2
    return-void
.end method

.method public animateToTab(I)V
    .locals 2
    .parameter "position"

    .prologue
    .line 207
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 208
    .local v0, tabView:Landroid/view/View;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    if-eqz v1, :cond_0

    .line 209
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 211
    :cond_0
    new-instance v1, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;-><init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/view/View;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    .line 218
    iget-object v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->post(Ljava/lang/Runnable;)Z

    .line 219
    return-void
.end method

.method public onAttachedToWindow()V
    .locals 1

    .prologue
    .line 223
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onAttachedToWindow()V

    .line 224
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 226
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->post(Ljava/lang/Runnable;)Z

    .line 228
    :cond_0
    return-void
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 2
    .parameter "newConfig"

    .prologue
    .line 199
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;

    move-result-object v0

    .line 202
    .local v0, abp:Landroid/support/v7/internal/view/ActionBarPolicy;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getTabContainerHeight()I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setContentHeight(I)V

    .line 203
    invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->getStackedTabMaxWidth()I

    move-result v1

    iput v1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mStackedTabMaxWidth:I

    .line 204
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 232
    invoke-super {p0}, Landroid/widget/HorizontalScrollView;->onDetachedFromWindow()V

    .line 233
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 234
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSelector:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 236
    :cond_0
    return-void
.end method

.method public onItemClick(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V
    .locals 2
    .parameter
    .parameter "view"
    .parameter "position"
    .parameter "id"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/support/v7/internal/widget/AdapterViewICS",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 320
    .local p1, parent:Landroid/support/v7/internal/widget/AdapterViewICS;,"Landroid/support/v7/internal/widget/AdapterViewICS<*>;"
    move-object v0, p2

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;

    .line 321
    .local v0, tabView:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->getTab()Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/app/ActionBar$Tab;->select()V

    .line 322
    return-void
.end method

.method public onMeasure(II)V
    .locals 11
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    const/high16 v10, 0x4000

    #v10=(Integer);
    const/4 v6, 0x1

    #v6=(One);
    const/4 v7, 0x0

    .line 79
    #v7=(Null);
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v5

    .line 80
    .local v5, widthMode:I
    #v5=(Integer);
    if-ne v5, v10, :cond_2

    move v2, v6

    .line 81
    .local v2, lockedExpanded:Z
    :goto_0
    #v2=(Boolean);
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setFillViewport(Z)V

    .line 83
    iget-object v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v8=(Reference);
    invoke-virtual {v8}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v1

    .line 84
    .local v1, childCount:I
    #v1=(Integer);
    if-le v1, v6, :cond_4

    if-eq v5, v10, :cond_0

    const/high16 v8, -0x8000

    #v8=(Integer);
    if-ne v5, v8, :cond_4

    .line 86
    :cond_0
    #v8=(Conflicted);
    const/4 v8, 0x2

    #v8=(PosByte);
    if-le v1, v8, :cond_3

    .line 87
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v8

    #v8=(Integer);
    int-to-float v8, v8

    #v8=(Float);
    const v9, 0x3ecccccd

    #v9=(Integer);
    mul-float/2addr v8, v9

    float-to-int v8, v8

    #v8=(Integer);
    iput v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I

    .line 91
    :goto_1
    #v9=(Conflicted);
    iget v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I

    iget v9, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mStackedTabMaxWidth:I

    #v9=(Integer);
    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v8

    iput v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I

    .line 96
    :goto_2
    #v9=(Conflicted);
    iget v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mContentHeight:I

    invoke-static {v8, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result p2

    .line 98
    if-nez v2, :cond_5

    iget-boolean v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z

    #v8=(Boolean);
    if-eqz v8, :cond_5

    move v0, v6

    .line 100
    .local v0, canCollapse:Z
    :goto_3
    #v0=(Boolean);v8=(Integer);
    if-eqz v0, :cond_7

    .line 102
    iget-object v6, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v6=(Reference);
    invoke-virtual {v6, v7, p2}, Landroid/widget/LinearLayout;->measure(II)V

    .line 103
    iget-object v6, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v6}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v6

    #v6=(Integer);
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v7

    #v7=(Integer);
    if-le v6, v7, :cond_6

    .line 104
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->performCollapse()V

    .line 112
    :goto_4
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getMeasuredWidth()I

    move-result v4

    .line 113
    .local v4, oldWidth:I
    #v4=(Integer);
    invoke-super {p0, p1, p2}, Landroid/widget/HorizontalScrollView;->onMeasure(II)V

    .line 114
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getMeasuredWidth()I

    move-result v3

    .line 116
    .local v3, newWidth:I
    #v3=(Integer);
    if-eqz v2, :cond_1

    if-eq v4, v3, :cond_1

    .line 118
    iget v6, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mSelectedTabIndex:I

    invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V

    .line 120
    :cond_1
    return-void

    .end local v0           #canCollapse:Z
    .end local v1           #childCount:I
    .end local v2           #lockedExpanded:Z
    .end local v3           #newWidth:I
    .end local v4           #oldWidth:I
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(One);v7=(Null);v8=(Uninit);v9=(Uninit);
    move v2, v7

    .line 80
    #v2=(Null);
    goto :goto_0

    .line 89
    .restart local v1       #childCount:I
    .restart local v2       #lockedExpanded:Z
    :cond_3
    #v1=(Integer);v2=(Boolean);v8=(PosByte);
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v8

    #v8=(Integer);
    div-int/lit8 v8, v8, 0x2

    iput v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I

    goto :goto_1

    .line 93
    :cond_4
    #v8=(Conflicted);
    const/4 v8, -0x1

    #v8=(Byte);
    iput v8, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mMaxTabWidth:I

    goto :goto_2

    :cond_5
    #v8=(Integer);v9=(Conflicted);
    move v0, v7

    .line 98
    #v0=(Null);
    goto :goto_3

    .line 106
    .restart local v0       #canCollapse:Z
    :cond_6
    #v0=(Boolean);v6=(Integer);v7=(Integer);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->performExpand()Z

    goto :goto_4

    .line 109
    :cond_7
    #v6=(One);v7=(Null);
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->performExpand()Z

    goto :goto_4
.end method

.method public removeAllTabs()V
    .locals 1

    .prologue
    .line 309
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 310
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    if-eqz v0, :cond_0

    .line 311
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V

    .line 313
    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 314
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V

    .line 316
    :cond_1
    return-void
.end method

.method public removeTabAt(I)V
    .locals 1
    .parameter "position"

    .prologue
    .line 299
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->removeViewAt(I)V

    .line 300
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    if-eqz v0, :cond_0

    .line 301
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V

    .line 303
    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 304
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V

    .line 306
    :cond_1
    return-void
.end method

.method public setAllowCollapse(Z)V
    .locals 0
    .parameter "allowCollapse"

    .prologue
    .line 132
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z

    .line 133
    return-void
.end method

.method public setContentHeight(I)V
    .locals 0
    .parameter "contentHeight"

    .prologue
    .line 185
    iput p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mContentHeight:I

    .line 186
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V

    .line 187
    return-void
.end method

.method public setTabSelected(I)V
    .locals 5
    .parameter "position"

    .prologue
    .line 169
    iput p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mSelectedTabIndex:I

    .line 170
    iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v3

    .line 171
    .local v3, tabCount:I
    #v3=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
    if-ge v1, v3, :cond_2

    .line 172
    iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 173
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    if-ne v1, p1, :cond_1

    const/4 v2, 0x1

    .line 174
    .local v2, isSelected:Z
    :goto_1
    #v2=(Boolean);
    invoke-virtual {v0, v2}, Landroid/view/View;->setSelected(Z)V

    .line 175
    if-eqz v2, :cond_0

    .line 176
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->animateToTab(I)V

    .line 171
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 173
    .end local v2           #isSelected:Z
    :cond_1
    #v2=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_1

    .line 179
    .end local v0           #child:Landroid/view/View;
    :cond_2
    #v0=(Conflicted);v2=(Conflicted);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    if-eqz v4, :cond_3

    if-ltz p1, :cond_3

    .line 180
    iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v4, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V

    .line 182
    :cond_3
    return-void
.end method

.method public updateTab(I)V
    .locals 1
    .parameter "position"

    .prologue
    .line 289
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabLayout:Landroid/widget/LinearLayout;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->update()V

    .line 290
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    if-eqz v0, :cond_0

    .line 291
    iget-object v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mTabSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v0

    check-cast v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabAdapter;->notifyDataSetChanged()V

    .line 293
    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->mAllowCollapse:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 294
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->requestLayout()V

    .line 296
    :cond_1
    return-void
.end method

*/}
