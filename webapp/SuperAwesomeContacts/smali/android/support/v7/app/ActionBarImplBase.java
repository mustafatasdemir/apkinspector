package android.support.v7.app; class ActionBarImplBase { void a() { int a;
a=0;// .class Landroid/support/v7/app/ActionBarImplBase;
a=0;// .super Landroid/support/v7/app/ActionBar;
a=0;// .source "ActionBarImplBase.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;,
a=0;//         Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CONTEXT_DISPLAY_NORMAL:I = 0x0
a=0;// 
a=0;// .field private static final CONTEXT_DISPLAY_SPLIT:I = 0x1
a=0;// 
a=0;// .field private static final INVALID_POSITION:I = -0x1
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mActionMode:Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
a=0;// 
a=0;// .field private mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;// .field private mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;// .field private mCallback:Landroid/support/v7/app/ActionBar$Callback;
a=0;// 
a=0;// .field private mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;// .field private mContentView:Landroid/view/View;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mContextDisplayMode:I
a=0;// 
a=0;// .field private mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;// .field private mCurWindowVisibility:I
a=0;// 
a=0;// .field mDeferredDestroyActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;// .field mDeferredModeDestroyCallback:Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;// .field private mDialog:Landroid/app/Dialog;
a=0;// 
a=0;// .field private mDisplayHomeAsUpSet:Z
a=0;// 
a=0;// .field final mHandler:Landroid/os/Handler;
a=0;// 
a=0;// .field private mHasEmbeddedTabs:Z
a=0;// 
a=0;// .field private mHiddenByApp:Z
a=0;// 
a=0;// .field private mHiddenBySystem:Z
a=0;// 
a=0;// .field private mLastMenuVisibility:Z
a=0;// 
a=0;// .field private mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mNowShowing:Z
a=0;// 
a=0;// .field private mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
a=0;// 
a=0;// .field private mSavedTabPosition:I
a=0;// 
a=0;// .field private mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;// .field private mShowHideAnimationEnabled:Z
a=0;// 
a=0;// .field private mShowingForMode:Z
a=0;// 
a=0;// .field private mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;// .field private mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;// .field mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mTabs:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/app/ActionBarImplBase$TabImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mThemedContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$Callback;)V
a=0;//     .locals 1
a=0;//     .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;
a=0;//     .param p2, "callback"    # Landroid/support/v7/app/ActionBar$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 106
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBar;-><init>()V
a=0;// 
a=0;//     .line 69
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 72
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I
a=0;// 
a=0;//     .line 81
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 92
a=0;//     new-instance v0, Landroid/os/Handler;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Handler;);
a=0;//     invoke-direct {v0}, Landroid/os/Handler;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Handler;);
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHandler:Landroid/os/Handler;
a=0;// 
a=0;//     .line 95
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mCurWindowVisibility:I
a=0;// 
a=0;//     .line 101
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z
a=0;// 
a=0;//     .line 107
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .line 108
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 109
a=0;//     iput-object p2, p0, Landroid/support/v7/app/ActionBarImplBase;->mCallback:Landroid/support/v7/app/ActionBar$Callback;
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->init(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v7/app/ActionBarImplBase;)Landroid/content/Context;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v7/app/ActionBarImplBase;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v7/app/ActionBarImplBase;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenBySystem:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(ZZZ)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Z
a=0;//     .param p1, "x1"    # Z
a=0;//     .param p2, "x2"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     invoke-static {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplBase;->checkShowingFlags(ZZZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Landroid/support/v7/app/ActionBarImplBase;)Landroid/support/v7/internal/widget/ActionBarView;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private static checkShowingFlags(ZZZ)Z
a=0;//     .locals 1
a=0;//     .param p0, "hiddenByApp"    # Z
a=0;//     .param p1, "hiddenBySystem"    # Z
a=0;//     .param p2, "showingForMode"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 969
a=0;//     #v0=(One);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 974
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 971
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     if-nez p0, :cond_2
a=0;// 
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 972
a=0;//     :cond_2
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private cleanupTabs()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 957
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 958
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 960
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 961
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 962
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeAllTabs()V
a=0;// 
a=0;//     .line 964
a=0;//     :cond_1
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I
a=0;// 
a=0;//     .line 965
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private configureTab(Landroid/support/v7/app/ActionBar$Tab;I)V
a=0;//     .locals 6
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .param p2, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 940
a=0;//     move-object v3, p1
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/app/ActionBar$Tab;);
a=0;//     check-cast v3, Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     .line 941
a=0;//     .local v3, "tabi":Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;//     invoke-virtual {v3}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getCallback()Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 943
a=0;//     .local v0, "callback":Landroid/support/v7/app/ActionBar$TabListener;
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar$TabListener;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 944
a=0;//     new-instance v4, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v5, "Action Bar Tab must have a Callback"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 947
a=0;//     :cond_0
a=0;//     #v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {v3, p2}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setPosition(I)V
a=0;// 
a=0;//     .line 948
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, p2, v3}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 950
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 951
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v2, p2, 0x1
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     if-ge v2, v1, :cond_1
a=0;// 
a=0;//     .line 952
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v4, v2}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setPosition(I)V
a=0;// 
a=0;//     .line 951
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 954
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private ensureTabsExist()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 919
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 937
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 923
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 925
a=0;//     .local v0, "tabScroller":Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     iget-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 926
a=0;//     invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 927
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     .line 936
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 929
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getNavigationMode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-ne v1, v2, :cond_2
a=0;// 
a=0;//     .line 930
a=0;//     invoke-virtual {v0, v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 934
a=0;//     :goto_2
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 932
a=0;//     :cond_2
a=0;//     #v1=(Integer);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private init(Landroid/support/v7/app/ActionBarActivity;)V
a=0;//     .locals 7
a=0;//     .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     .line 114
a=0;//     #v4=(One);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$id;->action_bar_overlay_layout:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mOverlayLayout:Landroid/support/v7/internal/widget/ActionBarOverlayLayout;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/support/v7/internal/widget/ActionBarOverlayLayout;->setActionBar(Landroid/support/v7/app/ActionBar;)V
a=0;// 
a=0;//     .line 119
a=0;//     :cond_0
a=0;//     sget v3, Landroid/support/v7/appcompat/R$id;->action_bar:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .line 120
a=0;//     sget v3, Landroid/support/v7/appcompat/R$id;->action_context_bar:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     .line 121
a=0;//     sget v3, Landroid/support/v7/appcompat/R$id;->action_bar_container:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .line 122
a=0;//     sget v3, Landroid/support/v7/appcompat/R$id;->top_action_bar:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 123
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 124
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 126
a=0;//     :cond_1
a=0;//     sget v3, Landroid/support/v7/appcompat/R$id;->split_action_bar:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v3}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 129
a=0;//     :cond_2
a=0;//     new-instance v3, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual {v5}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, " can only be used "
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const-string v5, "with a compatible window decor layout"
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 133
a=0;//     :cond_3
a=0;//     #v4=(One);v5=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v3, v6}, Landroid/support/v7/internal/widget/ActionBarView;->setContextView(Landroid/support/v7/internal/widget/ActionBarContextView;)V
a=0;// 
a=0;//     .line 134
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActionBarView;->isSplitActionBar()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     move v3, v4
a=0;// 
a=0;//     :goto_0
a=0;//     iput v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextDisplayMode:I
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 139
a=0;//     .local v1, "current":I
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v3, v1, 0x4
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 140
a=0;//     .local v2, "homeAsUp":Z
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 141
a=0;//     iput-boolean v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mDisplayHomeAsUpSet:Z
a=0;// 
a=0;//     .line 144
a=0;//     :cond_4
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "abp":Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionBarPolicy;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->enableHomeButtonByDefault()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     if-eqz v2, :cond_6
a=0;// 
a=0;//     :cond_5
a=0;//     move v5, v4
a=0;// 
a=0;//     :cond_6
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/app/ActionBarImplBase;->setHomeButtonEnabled(Z)V
a=0;// 
a=0;//     .line 146
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->hasEmbeddedTabs()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-direct {p0, v3}, Landroid/support/v7/app/ActionBarImplBase;->setHasEmbeddedTabs(Z)V
a=0;// 
a=0;//     .line 147
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/app/ActionBarActivity;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/app/ActionBarImplBase;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 148
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "abp":Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;//     .end local v1    # "current":I
a=0;//     .end local v2    # "homeAsUp":Z
a=0;//     :cond_7
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);v5=(Null);
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 134
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "current":I
a=0;//     :cond_8
a=0;//     #v1=(Integer);v3=(Integer);
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 139
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private setHasEmbeddedTabs(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "hasEmbeddedTabs"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 155
a=0;//     #v2=(Null);
a=0;//     iput-boolean p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     .line 157
a=0;//     iget-boolean v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ActionBarView;->setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     .line 164
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getNavigationMode()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     if-ne v3, v4, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 165
a=0;//     .local v0, "isInTabMode":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 167
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 172
a=0;//     :cond_0
a=0;//     :goto_2
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-boolean v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :goto_3
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setCollapsable(Z)V
a=0;// 
a=0;//     .line 173
a=0;//     return-void
a=0;// 
a=0;//     .line 161
a=0;//     .end local v0    # "isInTabMode":Z
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v3=(Boolean);v4=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ActionBarContainer;->setTabContainer(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ActionBarView;->setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Integer);v4=(PosByte);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 164
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 169
a=0;//     .restart local v0    # "isInTabMode":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v3=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v4=(Boolean);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 172
a=0;//     #v1=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private updateVisibility(Z)V
a=0;//     .locals 4
a=0;//     .param p1, "fromSystem"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 980
a=0;//     iget-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     iget-boolean v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenBySystem:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iget-boolean v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     invoke-static {v1, v2, v3}, Landroid/support/v7/app/ActionBarImplBase;->checkShowingFlags(ZZZ)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 982
a=0;//     .local v0, "shown":Z
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 983
a=0;//     iget-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z
a=0;// 
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 984
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z
a=0;// 
a=0;//     .line 985
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBarImplBase;->doShow(Z)V
a=0;// 
a=0;//     .line 993
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return-void
a=0;// 
a=0;//     .line 988
a=0;//     :cond_1
a=0;//     iget-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 989
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z
a=0;// 
a=0;//     .line 990
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBarImplBase;->doHide(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 579
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 580
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v7/app/ActionBarImplBase;->addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V
a=0;// 
a=0;//     .line 402
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Landroid/support/v7/app/ActionBar$Tab;I)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .param p2, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 416
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, p1, p2, v0}, Landroid/support/v7/app/ActionBarImplBase;->addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V
a=0;// 
a=0;//     .line 417
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .param p2, "position"    # I
a=0;//     .param p3, "setSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 421
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarImplBase;->ensureTabsExist()V
a=0;// 
a=0;//     .line 422
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addTab(Landroid/support/v7/app/ActionBar$Tab;IZ)V
a=0;// 
a=0;//     .line 423
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v7/app/ActionBarImplBase;->configureTab(Landroid/support/v7/app/ActionBar$Tab;I)V
a=0;// 
a=0;//     .line 424
a=0;//     if-eqz p3, :cond_0
a=0;// 
a=0;//     .line 425
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 427
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .param p2, "setSelected"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 406
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarImplBase;->ensureTabsExist()V
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->addTab(Landroid/support/v7/app/ActionBar$Tab;Z)V
a=0;// 
a=0;//     .line 408
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/app/ActionBarImplBase;->configureTab(Landroid/support/v7/app/ActionBar$Tab;I)V
a=0;// 
a=0;//     .line 409
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 410
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 412
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method animateToMode(Z)V
a=0;//     .locals 4
a=0;//     .param p1, "toActionMode"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 611
a=0;//     #v1=(Null);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     .line 612
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->showForActionMode()V
a=0;// 
a=0;//     .line 617
a=0;//     :goto_0
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {v3, v0}, Landroid/support/v7/internal/widget/ActionBarView;->animateToVisibility(I)V
a=0;// 
a=0;//     .line 618
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     if-eqz p1, :cond_3
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->animateToVisibility(I)V
a=0;// 
a=0;//     .line 619
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->hasEmbeddedTabs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->isCollapsed()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 620
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz p1, :cond_4
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 622
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 614
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->hideForActionMode()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_2
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 617
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(PosByte);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 618
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_4
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     move v2, v1
a=0;// 
a=0;//     .line 620
a=0;//     #v2=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public doHide(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "fromSystem"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v4, 0x8
a=0;// 
a=0;//     .line 1029
a=0;//     #v4=(PosByte);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v2}, Landroid/view/ViewGroup;->clearAnimation()V
a=0;// 
a=0;//     .line 1030
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/view/ViewGroup;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v4, :cond_1
a=0;// 
a=0;//     .line 1050
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1034
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Integer);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->isShowHideAnimationEnabled()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1036
a=0;//     .local v1, "animate":Z
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1037
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$anim;->abc_slide_out_top:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1038
a=0;//     .local v0, "anim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 1040
a=0;//     .end local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v2, v4}, Landroid/view/ViewGroup;->setVisibility(I)V
a=0;// 
a=0;//     .line 1042
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, v4, :cond_0
a=0;// 
a=0;//     .line 1043
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1044
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$anim;->abc_slide_out_bottom:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-static {v2, v3}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1046
a=0;//     .restart local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 1048
a=0;//     .end local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v2, v4}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1034
a=0;//     .end local v1    # "animate":Z
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Boolean);v3=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public doShow(Z)V
a=0;//     .locals 5
a=0;//     .param p1, "fromSystem"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1006
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v3}, Landroid/view/ViewGroup;->clearAnimation()V
a=0;// 
a=0;//     .line 1007
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/view/ViewGroup;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 1026
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1011
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Integer);v4=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->isShowHideAnimationEnabled()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 1013
a=0;//     .local v1, "animate":Z
a=0;//     :goto_1
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 1014
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     sget v4, Landroid/support/v7/appcompat/R$anim;->abc_slide_in_top:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1015
a=0;//     .local v0, "anim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 1017
a=0;//     .end local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->setVisibility(I)V
a=0;// 
a=0;//     .line 1019
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 1020
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 1021
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     sget v4, Landroid/support/v7/appcompat/R$anim;->abc_slide_in_bottom:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1022
a=0;//     .restart local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 1024
a=0;//     .end local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v3, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v1    # "animate":Z
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Boolean);v4=(Uninit);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 1011
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getCustomView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 347
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getCustomNavigationView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDisplayOptions()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 391
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getHeight()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 539
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->getHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getNavigationItemCount()I
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 252
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     packed-switch v2, :pswitch_data_0
a=0;// 
a=0;//     .line 259
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 254
a=0;//     :pswitch_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 256
a=0;//     :pswitch_1
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarView;->getDropdownAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 257
a=0;//     .local v0, "adapter":Landroid/widget/SpinnerAdapter;
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 252
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getNavigationMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedNavigationIndex()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 240
a=0;//     #v0=(Byte);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 246
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 242
a=0;//     :pswitch_0
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 244
a=0;//     :pswitch_1
a=0;//     #v0=(Byte);v1=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getDropdownSelectedPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 240
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public getSelectedTab()Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubtitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getSubtitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTabAt(I)Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 502
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTabCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 507
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getThemedContext()Landroid/content/Context;
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 512
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mThemedContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 513
a=0;//     new-instance v1, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v1}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 514
a=0;//     .local v1, "outValue":Landroid/util/TypedValue;
a=0;//     #v1=(Reference,Landroid/util/TypedValue;);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 515
a=0;//     .local v0, "currentTheme":Landroid/content/res/Resources$Theme;
a=0;//     #v0=(Reference,Landroid/content/res/Resources$Theme;);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$attr;->actionBarWidgetTheme:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v0, v3, v1, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
a=0;// 
a=0;//     .line 516
a=0;//     iget v2, v1, Landroid/util/TypedValue;->resourceId:I
a=0;// 
a=0;//     .line 518
a=0;//     .local v2, "targetThemeRes":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 519
a=0;//     new-instance v3, Landroid/view/ContextThemeWrapper;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/view/ContextThemeWrapper;);
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v3, v4, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ContextThemeWrapper;);
a=0;//     iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mThemedContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 524
a=0;//     .end local v0    # "currentTheme":Landroid/content/res/Resources$Theme;
a=0;//     .end local v1    # "outValue":Landroid/util/TypedValue;
a=0;//     .end local v2    # "targetThemeRes":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mThemedContext:Landroid/content/Context;
a=0;// 
a=0;//     return-object v3
a=0;// 
a=0;//     .line 521
a=0;//     .restart local v0    # "currentTheme":Landroid/content/res/Resources$Theme;
a=0;//     .restart local v1    # "outValue":Landroid/util/TypedValue;
a=0;//     .restart local v2    # "targetThemeRes":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/res/Resources$Theme;);v1=(Reference,Landroid/util/TypedValue;);v2=(Integer);v3=(Integer);v4=(One);
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     iput-object v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mThemedContext:Landroid/content/Context;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 352
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasNonEmbeddedTabs()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getNavigationMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hide()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 560
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z
a=0;// 
a=0;//     .line 561
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->updateVisibility(Z)V
a=0;// 
a=0;//     .line 563
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method hideForActionMode()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 566
a=0;//     #v1=(Null);
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 567
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z
a=0;// 
a=0;//     .line 568
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/app/ActionBarImplBase;->updateVisibility(Z)V
a=0;// 
a=0;//     .line 570
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method isShowHideAnimationEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1053
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowHideAnimationEnabled:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 574
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mNowShowing:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public newTab()Landroid/support/v7/app/ActionBar$Tab;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 396
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;-><init>(Landroid/support/v7/app/ActionBarImplBase;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 1
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 151
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/ActionBarPolicy;->hasEmbeddedTabs()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->setHasEmbeddedTabs(Z)V
a=0;// 
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeAllTabs()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 461
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarImplBase;->cleanupTabs()V
a=0;// 
a=0;//     .line 462
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeOnMenuVisibilityListener(Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/support/v7/app/ActionBar$OnMenuVisibilityListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 584
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mMenuVisibilityListeners:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 585
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;//     .locals 1
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     .prologue
a=0;//     .line 431
a=0;//     invoke-virtual {p1}, Landroid/support/v7/app/ActionBar$Tab;->getPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->removeTabAt(I)V
a=0;// 
a=0;//     .line 432
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeTabAt(I)V
a=0;//     .locals 7
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 436
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 457
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 441
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getPosition()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 443
a=0;//     .local v3, "selectedTabPosition":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->removeTabAt(I)V
a=0;// 
a=0;//     .line 444
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     .line 445
a=0;//     .local v2, "removedTab":Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 446
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-virtual {v2, v4}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setPosition(I)V
a=0;// 
a=0;//     .line 449
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 450
a=0;//     .local v1, "newTabCount":I
a=0;//     #v1=(Integer);
a=0;//     move v0, p1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_2
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v1, :cond_4
a=0;// 
a=0;//     .line 451
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->setPosition(I)V
a=0;// 
a=0;//     .line 450
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 441
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "newTabCount":I
a=0;//     .end local v2    # "removedTab":Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;//     .end local v3    # "selectedTabPosition":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     iget v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 454
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "newTabCount":I
a=0;//     .restart local v2    # "removedTab":Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;//     .restart local v3    # "selectedTabPosition":I
a=0;//     :cond_4
a=0;//     #v0=(Integer);v1=(Integer);v2=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     if-ne v3, p1, :cond_0
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_5
a=0;//     #v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     add-int/lit8 v6, p1, -0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method public selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;//     .locals 4
a=0;//     .param p1, "tab"    # Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 466
a=0;//     #v1=(Byte);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getNavigationMode()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-eq v2, v3, :cond_2
a=0;// 
a=0;//     .line 467
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v7/app/ActionBar$Tab;->getPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I
a=0;// 
a=0;//     .line 493
a=0;//     .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 471
a=0;//     .restart local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Byte);v2=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/app/ActionBarActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/app/FragmentTransaction;->disallowAddToBackStack()Landroid/support/v4/app/FragmentTransaction;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 474
a=0;//     .local v0, "trans":Landroid/support/v4/app/FragmentTransaction;
a=0;//     #v0=(Reference,Landroid/support/v4/app/FragmentTransaction;);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     if-ne v2, p1, :cond_4
a=0;// 
a=0;//     .line 475
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 476
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getCallback()Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     invoke-interface {v1, v2, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabReselected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
a=0;// 
a=0;//     .line 477
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v7/app/ActionBar$Tab;->getPosition()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->animateToTab(I)V
a=0;// 
a=0;//     .line 490
a=0;//     .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 491
a=0;//     invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 480
a=0;//     .restart local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
a=0;//     :cond_4
a=0;//     #v1=(Byte);v2=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     if-eqz p1, :cond_5
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v7/app/ActionBar$Tab;->getPosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     :cond_5
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setTabSelected(I)V
a=0;// 
a=0;//     .line 481
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarImplBase$TabImpl;);
a=0;//     if-eqz v1, :cond_6
a=0;// 
a=0;//     .line 482
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getCallback()Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     invoke-interface {v1, v2, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabUnselected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
a=0;// 
a=0;//     .line 484
a=0;//     :cond_6
a=0;//     check-cast p1, Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     .end local p1    # "tab":Landroid/support/v7/app/ActionBar$Tab;
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     .line 485
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 486
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarImplBase$TabImpl;->getCallback()Landroid/support/v7/app/ActionBar$TabListener;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSelectedTab:Landroid/support/v7/app/ActionBarImplBase$TabImpl;
a=0;// 
a=0;//     invoke-interface {v1, v2, v0}, Landroid/support/v7/app/ActionBar$TabListener;->onTabSelected(Landroid/support/v7/app/ActionBar$Tab;Landroid/support/v4/app/FragmentTransaction;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setPrimaryBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 333
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(I)V
a=0;//     .locals 3
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, p1, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->setCustomView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 195
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 181
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;Landroid/support/v7/app/ActionBar$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "layoutParams"    # Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 186
a=0;//     invoke-virtual {p1, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setCustomNavigationView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 189
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayHomeAsUpEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "showHomeAsUp"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     .line 312
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 313
a=0;//     return-void
a=0;// 
a=0;//     .line 312
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayOptions(I)V
a=0;//     .locals 1
a=0;//     .param p1, "options"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 285
a=0;//     and-int/lit8 v0, p1, 0x4
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 286
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mDisplayHomeAsUpSet:Z
a=0;// 
a=0;//     .line 288
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V
a=0;// 
a=0;//     .line 289
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayOptions(II)V
a=0;//     .locals 4
a=0;//     .param p1, "options"    # I
a=0;//     .param p2, "mask"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->getDisplayOptions()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 294
a=0;//     .local v0, "current":I
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, p2, 0x4
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 295
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mDisplayHomeAsUpSet:Z
a=0;// 
a=0;//     .line 297
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     and-int v2, p1, p2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     xor-int/lit8 v3, p2, -0x1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/2addr v3, v0
a=0;// 
a=0;//     or-int/2addr v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V
a=0;// 
a=0;//     .line 298
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayShowCustomEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "showCustom"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     .line 322
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 323
a=0;//     return-void
a=0;// 
a=0;//     .line 322
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayShowHomeEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "showHome"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     .line 307
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 308
a=0;//     return-void
a=0;// 
a=0;//     .line 307
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayShowTitleEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "showTitle"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     .line 317
a=0;//     #v1=(PosByte);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 318
a=0;//     return-void
a=0;// 
a=0;//     .line 317
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayUseLogoEnabled(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "useLogo"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 302
a=0;//     #v1=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setDisplayOptions(II)V
a=0;// 
a=0;//     .line 303
a=0;//     return-void
a=0;// 
a=0;//     .line 302
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setHomeAsUpIndicator(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 534
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeAsUpIndicator(I)V
a=0;// 
a=0;//     .line 535
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "indicator"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 529
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 530
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHomeButtonEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 327
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeButtonEnabled(Z)V
a=0;// 
a=0;//     .line 328
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setIcon(I)V
a=0;// 
a=0;//     .line 200
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 204
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 205
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setListNavigationCallbacks(Landroid/widget/SpinnerAdapter;Landroid/support/v7/app/ActionBar$OnNavigationListener;)V
a=0;//     .locals 1
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;//     .param p2, "callback"    # Landroid/support/v7/app/ActionBar$OnNavigationListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 219
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setDropdownAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0, p2}, Landroid/support/v7/internal/widget/ActionBarView;->setCallback(Landroid/support/v7/app/ActionBar$OnNavigationListener;)V
a=0;// 
a=0;//     .line 221
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLogo(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setLogo(I)V
a=0;// 
a=0;//     .line 210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLogo(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "logo"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setLogo(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 215
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setNavigationMode(I)V
a=0;//     .locals 5
a=0;//     .param p1, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     .line 367
a=0;//     #v4=(Byte);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 368
a=0;//     .local v0, "oldMode":I
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 375
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setNavigationMode(I)V
a=0;// 
a=0;//     .line 376
a=0;//     packed-switch p1, :pswitch_data_1
a=0;// 
a=0;//     .line 386
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne p1, v3, :cond_1
a=0;// 
a=0;//     iget-boolean v3, p0, Landroid/support/v7/app/ActionBarImplBase;->mHasEmbeddedTabs:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Boolean);v3=(PosByte);
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setCollapsable(Z)V
a=0;// 
a=0;//     .line 387
a=0;//     return-void
a=0;// 
a=0;//     .line 370
a=0;//     :pswitch_0
a=0;//     #v1=(Null);v3=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarImplBase;->getSelectedNavigationIndex()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I
a=0;// 
a=0;//     .line 371
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 372
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 378
a=0;//     :pswitch_1
a=0;//     #v3=(Conflicted);
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarImplBase;->ensureTabsExist()V
a=0;// 
a=0;//     .line 379
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setVisibility(I)V
a=0;// 
a=0;//     .line 380
a=0;//     iget v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eq v2, v4, :cond_0
a=0;// 
a=0;//     .line 381
a=0;//     iget v2, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/app/ActionBarImplBase;->setSelectedNavigationItem(I)V
a=0;// 
a=0;//     .line 382
a=0;//     iput v4, p0, Landroid/support/v7/app/ActionBarImplBase;->mSavedTabPosition:I
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 368
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 376
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setSelectedNavigationItem(I)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 225
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getNavigationMode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 233
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "setSelectedNavigationIndex not valid for current navigation mode"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 227
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTabs:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/support/v7/app/ActionBar$Tab;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->selectTab(Landroid/support/v7/app/ActionBar$Tab;)V
a=0;// 
a=0;//     .line 236
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 230
a=0;//     :pswitch_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setDropdownSelectedPosition(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 225
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setShowHideAnimationEnabled(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 996
a=0;//     iput-boolean p1, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowHideAnimationEnabled:Z
a=0;// 
a=0;//     .line 997
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 998
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mTopVisibilityView:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->clearAnimation()V
a=0;// 
a=0;//     .line 999
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1000
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->clearAnimation()V
a=0;// 
a=0;//     .line 1003
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 342
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setSplitBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 343
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setStackedBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "d"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 337
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContainerView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setStackedBackground(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 338
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 280
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->setSubtitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 281
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "subtitle"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 275
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setSubtitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 276
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 270
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 271
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 265
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 266
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 544
a=0;//     #v1=(Null);
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 545
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mHiddenByApp:Z
a=0;// 
a=0;//     .line 546
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/app/ActionBarImplBase;->updateVisibility(Z)V
a=0;// 
a=0;//     .line 548
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method showForActionMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 551
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 552
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mShowingForMode:Z
a=0;// 
a=0;//     .line 553
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarImplBase;->updateVisibility(Z)V
a=0;// 
a=0;//     .line 555
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public startActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
a=0;//     .locals 3
a=0;//     .param p1, "callback"    # Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 588
a=0;//     #v2=(One);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionMode:Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionMode:Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;->finish()V
a=0;// 
a=0;//     .line 592
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->killMode()V
a=0;// 
a=0;//     .line 593
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;);
a=0;//     invoke-direct {v0, p0, p1}, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;-><init>(Landroid/support/v7/app/ActionBarImplBase;Landroid/support/v7/view/ActionMode$Callback;)V
a=0;// 
a=0;//     .line 594
a=0;//     .local v0, "mode":Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;->dispatchOnCreate()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 595
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;->invalidate()V
a=0;// 
a=0;//     .line 596
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->initForMode(Landroid/support/v7/view/ActionMode;)V
a=0;// 
a=0;//     .line 597
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/app/ActionBarImplBase;->animateToMode(Z)V
a=0;// 
a=0;//     .line 598
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextDisplayMode:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 599
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 600
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V
a=0;// 
a=0;//     .line 603
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarImplBase;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     const/16 v2, 0x20
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->sendAccessibilityEvent(I)V
a=0;// 
a=0;//     .line 604
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarImplBase;->mActionMode:Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
a=0;// 
a=0;//     .line 607
a=0;//     .end local v0    # "mode":Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local v0    # "mode":Landroid/support/v7/app/ActionBarImplBase$ActionModeImpl;
a=0;//     :cond_2
a=0;//     #v1=(Boolean);v2=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
