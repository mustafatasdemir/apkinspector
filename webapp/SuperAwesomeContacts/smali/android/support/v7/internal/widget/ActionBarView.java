package android.support.v7.internal.widget; class ActionBarView { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/ActionBarView;
a=0;// .super Landroid/support/v7/internal/widget/AbsActionBarView;
a=0;// .source "ActionBarView.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;,
a=0;//         Landroid/support/v7/internal/widget/ActionBarView$HomeView;,
a=0;//         Landroid/support/v7/internal/widget/ActionBarView$SavedState;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_CUSTOM_GRAVITY:I = 0x13
a=0;// 
a=0;// .field public static final DISPLAY_DEFAULT:I = 0x0
a=0;// 
a=0;// .field private static final DISPLAY_RELAYOUT_MASK:I = 0x1f
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ActionBarView"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mCallback:Landroid/support/v7/app/ActionBar$OnNavigationListener;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;// .field private mCustomNavView:Landroid/view/View;
a=0;// 
a=0;// .field private mDisplayOptions:I
a=0;// 
a=0;// .field mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;// .field private final mExpandedActionViewUpListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;// .field private mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;// .field private mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;// .field private mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mIncludeTabs:Z
a=0;// 
a=0;// .field private mIndeterminateProgressStyle:I
a=0;// 
a=0;// .field private mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;// .field private mIsCollapsable:Z
a=0;// 
a=0;// .field private mIsCollapsed:Z
a=0;// 
a=0;// .field private mItemPadding:I
a=0;// 
a=0;// .field private mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private mLogo:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;// .field private final mNavItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;// .field private mNavigationMode:I
a=0;// 
a=0;// .field private mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mProgressBarPadding:I
a=0;// 
a=0;// .field private mProgressStyle:I
a=0;// 
a=0;// .field private mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;// .field private mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;// .field private mSpinnerAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;// .field private mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mSubtitleStyleRes:I
a=0;// 
a=0;// .field private mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;// .field private mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private mTitleStyleRes:I
a=0;// 
a=0;// .field private mTitleUpView:Landroid/view/View;
a=0;// 
a=0;// .field private mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private final mUpClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;// .field private mUserTitle:Z
a=0;// 
a=0;// .field mWindowCallback:Landroid/view/Window$Callback;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 16
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 166
a=0;//     invoke-direct/range {p0 .. p2}, Landroid/support/v7/internal/widget/AbsActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 85
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     .line 135
a=0;//     new-instance v2, Landroid/support/v7/internal/widget/ActionBarView$1;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/widget/ActionBarView$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Landroid/support/v7/internal/widget/ActionBarView$1;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarView$1;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;//     .line 149
a=0;//     new-instance v2, Landroid/support/v7/internal/widget/ActionBarView$2;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/widget/ActionBarView$2;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Landroid/support/v7/internal/widget/ActionBarView$2;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarView$2;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionViewUpListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 159
a=0;//     new-instance v2, Landroid/support/v7/internal/widget/ActionBarView$3;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/widget/ActionBarView$3;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-direct {v2, v0}, Landroid/support/v7/internal/widget/ActionBarView$3;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarView$3;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mUpClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     .line 167
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iput-object v0, v1, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 170
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setBackgroundResource(I)V
a=0;// 
a=0;//     .line 172
a=0;//     sget-object v2, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     move-object/from16 v1, p2
a=0;// 
a=0;//     invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     .line 175
a=0;//     .local v9, "a":Landroid/content/res/TypedArray;
a=0;//     #v9=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     .line 176
a=0;//     .local v10, "appInfo":Landroid/content/pm/ApplicationInfo;
a=0;//     #v10=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 177
a=0;//     .local v15, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v15=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I
a=0;// 
a=0;//     .line 179
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 180
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 181
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 182
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 183
a=0;//     sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x9
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-lt v2, v3, :cond_1
a=0;// 
a=0;//     .line 184
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     instance-of v2, v0, Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 186
a=0;//     :try_start_0
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v2}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v15, v2}, Landroid/content/pm/PackageManager;->getActivityLogo(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 191
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v12=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v10, v15}, Landroid/content/pm/ApplicationInfo;->loadLogo(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 198
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v2, 0x7
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 199
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 200
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     instance-of v2, v0, Landroid/app/Activity;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 202
a=0;//     :try_start_1
a=0;//     move-object/from16 v0, p1
a=0;// 
a=0;//     check-cast v0, Landroid/app/Activity;
a=0;// 
a=0;//     move-object v2, v0
a=0;// 
a=0;//     #v2=(Reference,Landroid/app/Activity;);
a=0;//     invoke-virtual {v2}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v15, v2}, Landroid/content/pm/PackageManager;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_1
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     .line 207
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 208
a=0;//     invoke-virtual {v10, v15}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 212
a=0;//     :cond_3
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 214
a=0;//     .local v14, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v14=(Reference,Landroid/view/LayoutInflater;);
a=0;//     const/16 v2, 0xe
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_home:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v13
a=0;// 
a=0;//     .line 218
a=0;//     .local v13, "homeResId":I
a=0;//     #v13=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v14, v13, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     .line 220
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v14, v13, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     .line 221
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUp(Z)V
a=0;// 
a=0;//     .line 222
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionViewUpListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 223
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     sget v4, Landroid/support/v7/appcompat/R$string;->abc_action_bar_up_description:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 226
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleStyleRes:I
a=0;// 
a=0;//     .line 227
a=0;//     const/4 v2, 0x6
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleStyleRes:I
a=0;// 
a=0;//     .line 228
a=0;//     const/16 v2, 0xf
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressStyle:I
a=0;// 
a=0;//     .line 229
a=0;//     const/16 v2, 0x10
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressStyle:I
a=0;// 
a=0;//     .line 232
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I
a=0;// 
a=0;//     .line 234
a=0;//     const/16 v2, 0x12
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I
a=0;// 
a=0;//     .line 236
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V
a=0;// 
a=0;//     .line 238
a=0;//     const/16 v2, 0xd
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     .line 239
a=0;//     .local v11, "customNavId":I
a=0;//     #v11=(Integer);
a=0;//     if-eqz v11, :cond_4
a=0;// 
a=0;//     .line 240
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v14, v11, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     .line 241
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I
a=0;// 
a=0;//     .line 242
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/lit8 v2, v2, 0x10
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V
a=0;// 
a=0;//     .line 245
a=0;//     :cond_4
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I
a=0;// 
a=0;//     .line 246
a=0;//     invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 247
a=0;//     new-instance v2, Landroid/support/v7/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/view/menu/ActionMenuItem;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const v5, 0x102002c
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/CharSequence;);
a=0;//     move-object/from16 v3, p1
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct/range {v2 .. v8}, Landroid/support/v7/internal/view/menu/ActionMenuItem;-><init>(Landroid/content/Context;IIIILjava/lang/CharSequence;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItem;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     .line 248
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v3, v0, Landroid/support/v7/internal/widget/ActionBarView;->mUpClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 249
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setClickable(Z)V
a=0;// 
a=0;//     .line 250
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setFocusable(Z)V
a=0;// 
a=0;//     .line 252
a=0;//     return-void
a=0;// 
a=0;//     .line 187
a=0;//     .end local v11    # "customNavId":I
a=0;//     .end local v13    # "homeResId":I
a=0;//     .end local v14    # "inflater":Landroid/view/LayoutInflater;
a=0;//     :catch_0
a=0;//     #v2=(Conflicted);v3=(PosByte);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
a=0;//     move-exception v12
a=0;// 
a=0;//     .line 188
a=0;//     .local v12, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v12=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v2, "ActionBarView"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "Activity component name not found!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 203
a=0;//     .end local v12    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     :catch_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v12=(Conflicted);
a=0;//     move-exception v12
a=0;// 
a=0;//     .line 204
a=0;//     .restart local v12    # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v12=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v2, "ActionBarView"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "Activity component name not found!"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/app/ActionBar$OnNavigationListener;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCallback:Landroid/support/v7/app/ActionBar$OnNavigationListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar$OnNavigationListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/SpinnerICS;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1200(Landroid/support/v7/internal/widget/ActionBarView;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1300(Landroid/support/v7/internal/widget/ActionBarView;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initTitle()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$1400(Landroid/support/v7/internal/widget/ActionBarView;)I
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/view/menu/ActionMenuItem;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$500(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$600(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$700(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$800(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/widget/LinearLayout;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$900(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private configPresenters(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 4
a=0;//     .param p1, "builder"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 462
a=0;//     #v2=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 463
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 464
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 471
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->updateMenuView(Z)V
a=0;// 
a=0;//     .line 472
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->updateMenuView(Z)V
a=0;// 
a=0;//     .line 473
a=0;//     return-void
a=0;// 
a=0;//     .line 466
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     .line 467
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0, v1, v3}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private initTitle()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 765
a=0;//     #v5=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 766
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 767
a=0;//     .local v1, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_title_item:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v1, v3, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 769
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_title:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 770
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_subtitle:I
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 771
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v7, Landroid/support/v7/appcompat/R$id;->up:I
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;
a=0;// 
a=0;//     .line 773
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mUpClickListener:Landroid/view/View$OnClickListener;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View$OnClickListener;);
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 775
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleStyleRes:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 776
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleStyleRes:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 778
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 779
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 782
a=0;//     :cond_1
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleStyleRes:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 783
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleStyleRes:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 785
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v3, :cond_3
a=0;// 
a=0;//     .line 786
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 787
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v3, v5}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 790
a=0;//     :cond_3
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v3, v3, 0x4
a=0;// 
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 791
a=0;//     .local v0, "homeAsUp":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     and-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     move v2, v4
a=0;// 
a=0;//     .line 792
a=0;//     .local v2, "showHome":Z
a=0;//     :goto_1
a=0;//     #v2=(Boolean);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;
a=0;// 
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v7, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 793
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v0, :cond_b
a=0;// 
a=0;//     if-nez v2, :cond_b
a=0;// 
a=0;//     :goto_3
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setEnabled(Z)V
a=0;// 
a=0;//     .line 796
a=0;//     .end local v0    # "homeAsUp":Z
a=0;//     .end local v1    # "inflater":Landroid/view/LayoutInflater;
a=0;//     .end local v2    # "showHome":Z
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 797
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     .line 800
a=0;//     :cond_5
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 802
a=0;//     :cond_6
a=0;//     #v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .restart local v1    # "inflater":Landroid/view/LayoutInflater;
a=0;//     :cond_7
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/view/LayoutInflater;);v2=(Uninit);v3=(Integer);v4=(One);v7=(Reference,Ujava/lang/Object;);
a=0;//     move v0, v5
a=0;// 
a=0;//     .line 790
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v0    # "homeAsUp":Z
a=0;//     :cond_8
a=0;//     #v0=(Boolean);
a=0;//     move v2, v5
a=0;// 
a=0;//     .line 791
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 792
a=0;//     .restart local v2    # "showHome":Z
a=0;//     :cond_9
a=0;//     #v2=(Boolean);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_a
a=0;//     #v3=(Integer);
a=0;//     move v3, v6
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_b
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move v4, v5
a=0;// 
a=0;//     .line 793
a=0;//     #v4=(Null);
a=0;//     goto :goto_3
a=0;// .end method
a=0;// 
a=0;// .method private setTitleImpl(Ljava/lang/CharSequence;)V
a=0;//     .locals 3
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 527
a=0;//     #v1=(Null);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 528
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 529
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 530
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 533
a=0;//     .local v0, "visible":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 535
a=0;//     .end local v0    # "visible":Z
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItem;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 536
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 538
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Null);v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 530
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 533
a=0;//     .restart local v0    # "visible":Z
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic animateToVisibility(I)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->animateToVisibility(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public collapseActionView()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 481
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 483
a=0;//     .local v0, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 484
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->collapseActionView()Z
a=0;// 
a=0;//     .line 486
a=0;//     :cond_0
a=0;//     return-void
a=0;// 
a=0;//     .line 481
a=0;//     .end local v0    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic dismissPopupMenus()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->dismissPopupMenus()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 744
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     const/16 v1, 0x13
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v7/app/ActionBar$LayoutParams;-><init>(I)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1159
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/support/v7/app/ActionBar$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 0
a=0;//     .param p1, "lp"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1164
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 1165
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object p1
a=0;// 
a=0;//     .line 1167
a=0;//     :cond_0
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getAnimatedVisibility()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getAnimatedVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getContentHeight()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContentHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getCustomNavigationView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 729
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDisplayOptions()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 737
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getDropdownAdapter()Landroid/widget/SpinnerAdapter;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 717
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getDropdownSelectedPosition()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 725
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getNavigationMode()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 733
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubtitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 541
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 500
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasEmbeddedTabs()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 373
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public hasExpandedActionView()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 476
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     if-eqz v0, :cond_0
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
a=0;// .method public bridge synthetic hideOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->hideOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public initIndeterminateProgress()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 320
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressStyle:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     .line 322
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     sget v1, Landroid/support/v7/appcompat/R$id;->progress_circular:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setId(I)V
a=0;// 
a=0;//     .line 323
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 325
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public initProgress()V
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     .line 312
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iget v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressStyle:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     .line 313
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     sget v1, Landroid/support/v7/appcompat/R$id;->progress_horizontal:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setId(I)V
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     const/16 v1, 0x2710
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setMax(I)V
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 316
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 317
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isCollapsed()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 813
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsed:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic isOverflowMenuShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic isOverflowReserved()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->isOverflowReserved()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isSplitActionBar()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 369
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitActionBar:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 3
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 256
a=0;//     #v2=(Null);
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 258
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 259
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 260
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;
a=0;// 
a=0;//     .line 261
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-ne v1, p0, :cond_0
a=0;// 
a=0;//     .line 262
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 264
a=0;//     :cond_0
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 265
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 266
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initTitle()V
a=0;// 
a=0;//     .line 269
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 270
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 271
a=0;//     .local v0, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 272
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 273
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 275
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V
a=0;// 
a=0;//     .line 278
a=0;//     .end local v0    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 279
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initProgress()V
a=0;// 
a=0;//     .line 282
a=0;//     :cond_4
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 283
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 284
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initIndeterminateProgress()V
a=0;// 
a=0;//     .line 286
a=0;//     :cond_5
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 300
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabSelector:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 301
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 302
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     .line 303
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideSubMenus()Z
a=0;// 
a=0;//     .line 305
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onFinishInflate()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 749
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onFinishInflate()V
a=0;// 
a=0;//     .line 751
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 753
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 754
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 755
a=0;//     .local v0, "parent":Landroid/view/ViewParent;
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     if-eq v0, p0, :cond_1
a=0;// 
a=0;//     .line 756
a=0;//     instance-of v1, v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 757
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .end local v0    # "parent":Landroid/view/ViewParent;
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 759
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 762
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 32
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1015
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 1016
a=0;//     .local v23, "x":I
a=0;//     #v23=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     .line 1017
a=0;//     .local v25, "y":I
a=0;//     #v25=(Integer);
a=0;//     sub-int v27, p5, p3
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     sub-int v27, v27, v28
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     sub-int v7, v27, v28
a=0;// 
a=0;//     .line 1019
a=0;//     .local v7, "contentHeight":I
a=0;//     #v7=(Integer);
a=0;//     if-gtz v7, :cond_1
a=0;// 
a=0;//     .line 1155
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v24=(Conflicted);v26=(Conflicted);v27=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1024
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Uninit);v26=(Uninit);v27=(Integer);v29=(Uninit);v30=(Uninit);v31=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/view/View;);
a=0;//     if-eqz v27, :cond_c
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     .line 1025
a=0;//     .local v13, "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;//     :goto_1
a=0;//     #v13=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {v13}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getVisibility()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     const/16 v28, 0x8
a=0;// 
a=0;//     #v28=(PosByte);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_2
a=0;// 
a=0;//     .line 1026
a=0;//     invoke-virtual {v13}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getLeftOffset()I
a=0;// 
a=0;//     move-result v14
a=0;// 
a=0;//     .line 1027
a=0;//     .local v14, "leftOffset":I
a=0;//     #v14=(Integer);
a=0;//     add-int v27, v23, v14
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v25
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v13, v1, v2, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     add-int v27, v27, v14
a=0;// 
a=0;//     add-int v23, v23, v27
a=0;// 
a=0;//     .line 1030
a=0;//     .end local v14    # "leftOffset":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v2=(Conflicted);v14=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/view/View;);
a=0;//     if-nez v27, :cond_4
a=0;// 
a=0;//     .line 1031
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     if-eqz v27, :cond_d
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Landroid/widget/LinearLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     const/16 v28, 0x8
a=0;// 
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_d
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     and-int/lit8 v27, v27, 0x8
a=0;// 
a=0;//     if-eqz v27, :cond_d
a=0;// 
a=0;//     const/16 v20, 0x1
a=0;// 
a=0;//     .line 1034
a=0;//     .local v20, "showTitle":Z
a=0;//     :goto_2
a=0;//     #v0=(Conflicted);v1=(Integer);v20=(Boolean);v27=(Conflicted);
a=0;//     if-eqz v20, :cond_3
a=0;// 
a=0;//     .line 1035
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v27
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v25
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     add-int v23, v23, v27
a=0;// 
a=0;//     .line 1038
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v27=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     packed-switch v27, :pswitch_data_0
a=0;// 
a=0;//     .line 1060
a=0;//     .end local v20    # "showTitle":Z
a=0;//     :cond_4
a=0;//     :goto_3
a=0;//     :pswitch_0
a=0;//     #v0=(Conflicted);v20=(Conflicted);v27=(Conflicted);v28=(Integer);
a=0;//     sub-int v27, p4, p2
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     sub-int v16, v27, v28
a=0;// 
a=0;//     .line 1061
a=0;//     .local v16, "menuLeft":I
a=0;//     #v16=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     if-eqz v27, :cond_5
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v27
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     if-ne v0, v1, :cond_5
a=0;// 
a=0;//     .line 1062
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v27
a=0;// 
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v25
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChildInverse(Landroid/view/View;III)I
a=0;// 
a=0;//     .line 1063
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     sub-int v16, v16, v27
a=0;// 
a=0;//     .line 1066
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v27=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     if-eqz v27, :cond_6
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     const/16 v28, 0x8
a=0;// 
a=0;//     #v28=(PosByte);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_6
a=0;// 
a=0;//     .line 1068
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v27
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     move/from16 v2, v16
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v25
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChildInverse(Landroid/view/View;III)I
a=0;// 
a=0;//     .line 1069
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     sub-int v16, v16, v27
a=0;// 
a=0;//     .line 1072
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v27=(Conflicted);v28=(Integer);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 1073
a=0;//     .local v8, "customView":Landroid/view/View;
a=0;//     #v8=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/view/View;);
a=0;//     if-eqz v27, :cond_10
a=0;// 
a=0;//     .line 1074
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     .line 1079
a=0;//     :cond_7
a=0;//     :goto_4
a=0;//     #v0=(Conflicted);v8=(Reference,Landroid/view/View;);v27=(Conflicted);
a=0;//     if-eqz v8, :cond_b
a=0;// 
a=0;//     .line 1080
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v15
a=0;// 
a=0;//     .line 1081
a=0;//     .local v15, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v15=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     instance-of v0, v15, Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Boolean);
a=0;//     if-eqz v27, :cond_11
a=0;// 
a=0;//     check-cast v15, Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     .end local v15    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     move-object v4, v15
a=0;// 
a=0;//     .line 1084
a=0;//     .local v4, "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;//     :goto_5
a=0;//     #v4=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     if-eqz v4, :cond_12
a=0;// 
a=0;//     iget v10, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1085
a=0;//     .local v10, "gravity":I
a=0;//     :goto_6
a=0;//     #v10=(Integer);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v17
a=0;// 
a=0;//     .line 1087
a=0;//     .local v17, "navWidth":I
a=0;//     #v17=(Integer);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .line 1088
a=0;//     .local v21, "topMargin":I
a=0;//     #v21=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1089
a=0;//     .local v5, "bottomMargin":I
a=0;//     #v5=(Null);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     .line 1090
a=0;//     iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     add-int v23, v23, v27
a=0;// 
a=0;//     .line 1091
a=0;//     iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     sub-int v16, v16, v27
a=0;// 
a=0;//     .line 1092
a=0;//     iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->topMargin:I
a=0;// 
a=0;//     move/from16 v21, v0
a=0;// 
a=0;//     .line 1093
a=0;//     #v21=(Integer);
a=0;//     iget v5, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     .line 1096
a=0;//     :cond_8
a=0;//     #v5=(Integer);
a=0;//     and-int/lit8 v12, v10, 0x7
a=0;// 
a=0;//     .line 1098
a=0;//     .local v12, "hgravity":I
a=0;//     #v12=(Integer);
a=0;//     const/16 v27, 0x1
a=0;// 
a=0;//     #v27=(One);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne v12, v0, :cond_14
a=0;// 
a=0;//     .line 1099
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getWidth()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     sub-int v27, v27, v17
a=0;// 
a=0;//     div-int/lit8 v6, v27, 0x2
a=0;// 
a=0;//     .line 1100
a=0;//     .local v6, "centeredLeft":I
a=0;//     #v6=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v6, v0, :cond_13
a=0;// 
a=0;//     .line 1101
a=0;//     const/4 v12, 0x3
a=0;// 
a=0;//     .line 1109
a=0;//     .end local v6    # "centeredLeft":I
a=0;//     :cond_9
a=0;//     :goto_7
a=0;//     #v6=(Conflicted);
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     .line 1110
a=0;//     .local v24, "xpos":I
a=0;//     #v24=(Null);
a=0;//     packed-switch v12, :pswitch_data_1
a=0;// 
a=0;//     .line 1122
a=0;//     :goto_8
a=0;//     :pswitch_1
a=0;//     #v24=(Integer);
a=0;//     and-int/lit8 v22, v10, 0x70
a=0;// 
a=0;//     .line 1124
a=0;//     .local v22, "vgravity":I
a=0;//     #v22=(Integer);
a=0;//     const/16 v27, -0x1
a=0;// 
a=0;//     #v27=(Byte);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v10, v0, :cond_a
a=0;// 
a=0;//     .line 1125
a=0;//     const/16 v22, 0x10
a=0;// 
a=0;//     .line 1128
a=0;//     :cond_a
a=0;//     const/16 v26, 0x0
a=0;// 
a=0;//     .line 1129
a=0;//     .local v26, "ypos":I
a=0;//     #v26=(Null);
a=0;//     sparse-switch v22, :sswitch_data_0
a=0;// 
a=0;//     .line 1143
a=0;//     :goto_9
a=0;//     #v18=(Conflicted);v19=(Conflicted);v26=(Integer);v27=(Integer);
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 1144
a=0;//     .local v9, "customWidth":I
a=0;//     #v9=(Integer);
a=0;//     add-int v27, v24, v9
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     add-int v28, v28, v26
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v26
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v27
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v28
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v8, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 1146
a=0;//     add-int v23, v23, v9
a=0;// 
a=0;//     .line 1149
a=0;//     .end local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;//     .end local v5    # "bottomMargin":I
a=0;//     .end local v9    # "customWidth":I
a=0;//     .end local v10    # "gravity":I
a=0;//     .end local v12    # "hgravity":I
a=0;//     .end local v17    # "navWidth":I
a=0;//     .end local v21    # "topMargin":I
a=0;//     .end local v22    # "vgravity":I
a=0;//     .end local v24    # "xpos":I
a=0;//     .end local v26    # "ypos":I
a=0;//     :cond_b
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v15=(Conflicted);v17=(Conflicted);v21=(Conflicted);v22=(Conflicted);v24=(Conflicted);v26=(Conflicted);v27=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     if-eqz v27, :cond_0
a=0;// 
a=0;//     .line 1150
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->bringToFront()V
a=0;// 
a=0;//     .line 1151
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     div-int/lit8 v11, v27, 0x2
a=0;// 
a=0;//     .line 1152
a=0;//     .local v11, "halfProgressHeight":I
a=0;//     #v11=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     neg-int v0, v11
a=0;// 
a=0;//     move/from16 v29, v0
a=0;// 
a=0;//     #v29=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v30, v0
a=0;// 
a=0;//     #v30=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v31, v0
a=0;// 
a=0;//     #v31=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     invoke-virtual/range {v31 .. v31}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v31
a=0;// 
a=0;//     #v31=(Integer);
a=0;//     add-int v30, v30, v31
a=0;// 
a=0;//     move-object/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v29
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v30
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v11}, Landroid/support/v7/internal/widget/ProgressBarICS;->layout(IIII)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 1024
a=0;//     .end local v8    # "customView":Landroid/view/View;
a=0;//     .end local v11    # "halfProgressHeight":I
a=0;//     .end local v13    # "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;//     .end local v16    # "menuLeft":I
a=0;//     :cond_c
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Uninit);v26=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v13, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v13=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 1031
a=0;//     .restart local v13    # "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;//     :cond_d
a=0;//     #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v14=(Conflicted);v27=(Conflicted);v28=(PosByte);
a=0;//     const/16 v20, 0x0
a=0;// 
a=0;//     #v20=(Null);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 1042
a=0;//     .restart local v20    # "showTitle":Z
a=0;//     :pswitch_2
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v20=(Boolean);v27=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v27, :cond_4
a=0;// 
a=0;//     .line 1043
a=0;//     if-eqz v20, :cond_e
a=0;// 
a=0;//     .line 1044
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     add-int v23, v23, v27
a=0;// 
a=0;//     .line 1046
a=0;//     :cond_e
a=0;//     #v0=(Conflicted);v27=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v27
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v25
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     add-int v27, v27, v28
a=0;// 
a=0;//     add-int v23, v23, v27
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 1050
a=0;//     :pswitch_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v28=(PosByte);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v27, :cond_4
a=0;// 
a=0;//     .line 1051
a=0;//     if-eqz v20, :cond_f
a=0;// 
a=0;//     .line 1052
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     add-int v23, v23, v27
a=0;// 
a=0;//     .line 1054
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);v27=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v27
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     move/from16 v2, v23
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v25
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v28, v0
a=0;// 
a=0;//     #v28=(Integer);
a=0;//     add-int v27, v27, v28
a=0;// 
a=0;//     add-int v23, v23, v27
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 1075
a=0;//     .end local v20    # "showTitle":Z
a=0;//     .restart local v8    # "customView":Landroid/view/View;
a=0;//     .restart local v16    # "menuLeft":I
a=0;//     :cond_10
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v8=(Null);v16=(Integer);v20=(Conflicted);v27=(Reference,Landroid/view/View;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     and-int/lit8 v27, v27, 0x10
a=0;// 
a=0;//     if-eqz v27, :cond_7
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v27, v0
a=0;// 
a=0;//     #v27=(Reference,Landroid/view/View;);
a=0;//     if-eqz v27, :cond_7
a=0;// 
a=0;//     .line 1077
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v8, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/View;);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 1081
a=0;//     .restart local v15    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_11
a=0;//     #v0=(Boolean);v15=(Reference,Landroid/view/ViewGroup$LayoutParams;);v27=(Boolean);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 1084
a=0;//     .end local v15    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .restart local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;//     :cond_12
a=0;//     #v4=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);
a=0;//     const/16 v10, 0x13
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 1102
a=0;//     .restart local v5    # "bottomMargin":I
a=0;//     .restart local v6    # "centeredLeft":I
a=0;//     .restart local v10    # "gravity":I
a=0;//     .restart local v12    # "hgravity":I
a=0;//     .restart local v17    # "navWidth":I
a=0;//     .restart local v21    # "topMargin":I
a=0;//     :cond_13
a=0;//     #v0=(Integer);v5=(Integer);v6=(Integer);v10=(Integer);v12=(Integer);v17=(Integer);v21=(Integer);v27=(Integer);
a=0;//     add-int v27, v6, v17
a=0;// 
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_9
a=0;// 
a=0;//     .line 1103
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 1105
a=0;//     .end local v6    # "centeredLeft":I
a=0;//     :cond_14
a=0;//     #v0=(One);v1=(Conflicted);v6=(Uninit);v12=(Integer);v27=(One);
a=0;//     const/16 v27, -0x1
a=0;// 
a=0;//     #v27=(Byte);
a=0;//     move/from16 v0, v27
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-ne v10, v0, :cond_9
a=0;// 
a=0;//     .line 1106
a=0;//     const/4 v12, 0x3
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 1112
a=0;//     .restart local v24    # "xpos":I
a=0;//     :pswitch_4
a=0;//     #v0=(Integer);v6=(Conflicted);v12=(Integer);v24=(Null);v27=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getWidth()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     sub-int v27, v27, v17
a=0;// 
a=0;//     div-int/lit8 v24, v27, 0x2
a=0;// 
a=0;//     .line 1113
a=0;//     #v24=(Integer);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 1115
a=0;//     :pswitch_5
a=0;//     #v24=(Null);
a=0;//     move/from16 v24, v23
a=0;// 
a=0;//     .line 1116
a=0;//     #v24=(Integer);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 1118
a=0;//     :pswitch_6
a=0;//     #v24=(Null);
a=0;//     sub-int v24, v16, v17
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 1131
a=0;//     .restart local v22    # "vgravity":I
a=0;//     .restart local v26    # "ypos":I
a=0;//     :sswitch_0
a=0;//     #v0=(Byte);v22=(Integer);v26=(Null);v27=(Byte);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 1132
a=0;//     .local v19, "paddedTop":I
a=0;//     #v19=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getHeight()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     sub-int v18, v27, v28
a=0;// 
a=0;//     .line 1133
a=0;//     .local v18, "paddedBottom":I
a=0;//     #v18=(Integer);
a=0;//     sub-int v27, v18, v19
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     sub-int v27, v27, v28
a=0;// 
a=0;//     div-int/lit8 v26, v27, 0x2
a=0;// 
a=0;//     .line 1134
a=0;//     #v26=(Integer);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 1136
a=0;//     .end local v18    # "paddedBottom":I
a=0;//     .end local v19    # "paddedTop":I
a=0;//     :sswitch_1
a=0;//     #v18=(Uninit);v19=(Uninit);v26=(Null);v27=(Byte);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     add-int v26, v27, v21
a=0;// 
a=0;//     .line 1137
a=0;//     #v26=(Integer);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 1139
a=0;//     :sswitch_2
a=0;//     #v26=(Null);v27=(Byte);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getHeight()I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     sub-int v27, v27, v28
a=0;// 
a=0;//     invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v28
a=0;// 
a=0;//     sub-int v27, v27, v28
a=0;// 
a=0;//     sub-int v26, v27, v5
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .line 1038
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);v27=(Unknown);v28=(Unknown);v29=(Unknown);v30=(Unknown);v31=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 1110
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_4
a=0;//         :pswitch_1
a=0;//         :pswitch_5
a=0;//         :pswitch_1
a=0;//         :pswitch_6
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 1129
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x10 -> :sswitch_0
a=0;//         0x30 -> :sswitch_1
a=0;//         0x50 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 44
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 818
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getChildCount()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 819
a=0;//     .local v7, "childCount":I
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Boolean);
a=0;//     if-eqz v40, :cond_4
a=0;// 
a=0;//     .line 820
a=0;//     const/16 v38, 0x0
a=0;// 
a=0;//     .line 821
a=0;//     .local v38, "visibleChildren":I
a=0;//     #v38=(Null);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     .local v22, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);v22=(Integer);v38=(Integer);v40=(Conflicted);v41=(Conflicted);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-ge v0, v7, :cond_2
a=0;// 
a=0;//     .line 822
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 823
a=0;//     .local v6, "child":Landroid/view/View;
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, 0x8
a=0;// 
a=0;//     #v41=(PosByte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v41
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_1
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     move-object/from16 v0, v40
a=0;// 
a=0;//     if-ne v6, v0, :cond_0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     if-eqz v40, :cond_1
a=0;// 
a=0;//     .line 825
a=0;//     :cond_0
a=0;//     #v40=(Conflicted);
a=0;//     add-int/lit8 v38, v38, 0x1
a=0;// 
a=0;//     .line 821
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     add-int/lit8 v22, v22, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 829
a=0;//     .end local v6    # "child":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Conflicted);v6=(Conflicted);v41=(Conflicted);
a=0;//     if-nez v38, :cond_4
a=0;// 
a=0;//     .line 831
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     move/from16 v1, v40
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move/from16 v2, v41
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 832
a=0;//     const/16 v40, 0x1
a=0;// 
a=0;//     #v40=(One);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     #v0=(One);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iput-boolean v0, v1, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsed:Z
a=0;// 
a=0;//     .line 1011
a=0;//     .end local v22    # "i":I
a=0;//     .end local v38    # "visibleChildren":I
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Integer);v42=(Conflicted);v43=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 836
a=0;//     :cond_4
a=0;//     #v0=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Uninit);v39=(Uninit);v41=(Conflicted);v42=(Uninit);v43=(Uninit);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iput-boolean v0, v1, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsed:Z
a=0;// 
a=0;//     .line 838
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v39
a=0;// 
a=0;//     .line 839
a=0;//     .local v39, "widthMode":I
a=0;//     #v39=(Integer);
a=0;//     const/high16 v40, 0x40000000
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     move/from16 v0, v39
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v40
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_5
a=0;// 
a=0;//     .line 840
a=0;//     new-instance v40, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v40=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v41, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v41=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v41 .. v41}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v41=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v42
a=0;// 
a=0;//     #v42=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v42 .. v42}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v42
a=0;// 
a=0;//     invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v41
a=0;// 
a=0;//     const-string v42, " can only be used "
a=0;// 
a=0;//     invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v41
a=0;// 
a=0;//     const-string v42, "with android:layout_width=\"MATCH_PARENT\" (or fill_parent)"
a=0;// 
a=0;//     invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v41
a=0;// 
a=0;//     invoke-virtual/range {v41 .. v41}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v41
a=0;// 
a=0;//     invoke-direct/range {v40 .. v41}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v40=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v40
a=0;// 
a=0;//     .line 844
a=0;//     :cond_5
a=0;//     #v40=(Integer);v41=(Conflicted);v42=(Uninit);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v16
a=0;// 
a=0;//     .line 845
a=0;//     .local v16, "heightMode":I
a=0;//     #v16=(Integer);
a=0;//     const/high16 v40, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v16
a=0;// 
a=0;//     move/from16 v1, v40
a=0;// 
a=0;//     if-eq v0, v1, :cond_6
a=0;// 
a=0;//     .line 846
a=0;//     new-instance v40, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v40=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v41, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v41=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v41 .. v41}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v41=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v42
a=0;// 
a=0;//     #v42=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v42 .. v42}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v42
a=0;// 
a=0;//     invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v41
a=0;// 
a=0;//     const-string v42, " can only be used "
a=0;// 
a=0;//     invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v41
a=0;// 
a=0;//     const-string v42, "with android:layout_height=\"wrap_content\""
a=0;// 
a=0;//     invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v41
a=0;// 
a=0;//     invoke-virtual/range {v41 .. v41}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v41
a=0;// 
a=0;//     invoke-direct/range {v40 .. v41}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v40=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v40
a=0;// 
a=0;//     .line 850
a=0;//     :cond_6
a=0;//     #v40=(Integer);v41=(Conflicted);v42=(Uninit);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 852
a=0;//     .local v9, "contentWidth":I
a=0;//     #v9=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     if-lez v40, :cond_12
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v27, v0
a=0;// 
a=0;//     .line 855
a=0;//     .local v27, "maxHeight":I
a=0;//     :goto_2
a=0;//     #v27=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     #v41=(Integer);
a=0;//     add-int v37, v40, v41
a=0;// 
a=0;//     .line 856
a=0;//     .local v37, "verticalPadding":I
a=0;//     #v37=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v30
a=0;// 
a=0;//     .line 857
a=0;//     .local v30, "paddingLeft":I
a=0;//     #v30=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v31
a=0;// 
a=0;//     .line 858
a=0;//     .local v31, "paddingRight":I
a=0;//     #v31=(Integer);
a=0;//     sub-int v15, v27, v37
a=0;// 
a=0;//     .line 859
a=0;//     .local v15, "height":I
a=0;//     #v15=(Integer);
a=0;//     const/high16 v40, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 861
a=0;//     .local v8, "childSpecHeight":I
a=0;//     #v8=(Integer);
a=0;//     sub-int v40, v9, v30
a=0;// 
a=0;//     sub-int v5, v40, v31
a=0;// 
a=0;//     .line 862
a=0;//     .local v5, "availableWidth":I
a=0;//     #v5=(Integer);
a=0;//     div-int/lit8 v24, v5, 0x2
a=0;// 
a=0;//     .line 863
a=0;//     .local v24, "leftOfCenter":I
a=0;//     #v24=(Integer);
a=0;//     move/from16 v32, v24
a=0;// 
a=0;//     .line 865
a=0;//     .local v32, "rightOfCenter":I
a=0;//     #v32=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/view/View;);
a=0;//     if-eqz v40, :cond_13
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     .line 867
a=0;//     .local v18, "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;//     :goto_3
a=0;//     #v18=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getVisibility()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, 0x8
a=0;// 
a=0;//     #v41=(PosByte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v41
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_7
a=0;// 
a=0;//     .line 868
a=0;//     invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     .line 870
a=0;//     .local v26, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v26=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     if-gez v40, :cond_14
a=0;// 
a=0;//     .line 871
a=0;//     const/high16 v40, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 875
a=0;//     .local v20, "homeWidthSpec":I
a=0;//     :goto_4
a=0;//     #v20=(Integer);v41=(Integer);
a=0;//     const/high16 v40, 0x40000000
a=0;// 
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     move-object/from16 v0, v18
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move/from16 v2, v40
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->measure(II)V
a=0;// 
a=0;//     .line 877
a=0;//     invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getLeftOffset()I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     add-int v19, v40, v41
a=0;// 
a=0;//     .line 878
a=0;//     .local v19, "homeWidth":I
a=0;//     #v19=(Integer);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     sub-int v41, v5, v19
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 879
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     sub-int v41, v5, v19
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     .line 882
a=0;//     .end local v19    # "homeWidth":I
a=0;//     .end local v20    # "homeWidthSpec":I
a=0;//     .end local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v2=(Conflicted);v19=(Conflicted);v20=(Conflicted);v26=(Conflicted);v40=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     if-eqz v40, :cond_8
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v40
a=0;// 
a=0;//     move-object/from16 v0, v40
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     if-ne v0, v1, :cond_8
a=0;// 
a=0;//     .line 883
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v40
a=0;// 
a=0;//     move/from16 v2, v41
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v5, v8, v2}, Landroid/support/v7/internal/widget/ActionBarView;->measureChildView(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 885
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v41, v0
a=0;// 
a=0;//     #v41=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual/range {v41 .. v41}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     #v41=(Integer);
a=0;//     sub-int v41, v32, v41
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v32
a=0;// 
a=0;//     .line 888
a=0;//     :cond_8
a=0;//     #v1=(Conflicted);v2=(Conflicted);v40=(Reference,Ujava/lang/Object;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     if-eqz v40, :cond_9
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, 0x8
a=0;// 
a=0;//     #v41=(PosByte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v41
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_9
a=0;// 
a=0;//     .line 890
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v40
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     move/from16 v2, v41
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v5, v8, v2}, Landroid/support/v7/internal/widget/ActionBarView;->measureChildView(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 892
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v41, v0
a=0;// 
a=0;//     #v41=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     invoke-virtual/range {v41 .. v41}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     #v41=(Integer);
a=0;//     sub-int v41, v32, v41
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v32
a=0;// 
a=0;//     .line 896
a=0;//     :cond_9
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v40=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v40, :cond_15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v40}, Landroid/widget/LinearLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, 0x8
a=0;// 
a=0;//     #v41=(PosByte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v41
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_15
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     and-int/lit8 v40, v40, 0x8
a=0;// 
a=0;//     if-eqz v40, :cond_15
a=0;// 
a=0;//     const/16 v33, 0x1
a=0;// 
a=0;//     .line 899
a=0;//     .local v33, "showTitle":Z
a=0;//     :goto_5
a=0;//     #v0=(Conflicted);v1=(Conflicted);v33=(Boolean);v40=(Conflicted);v41=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/view/View;);
a=0;//     if-nez v40, :cond_a
a=0;// 
a=0;//     .line 900
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     packed-switch v40, :pswitch_data_0
a=0;// 
a=0;//     .line 930
a=0;//     :cond_a
a=0;//     :goto_6
a=0;//     #v0=(Conflicted);v23=(Conflicted);v25=(Conflicted);v34=(Conflicted);v40=(Conflicted);v42=(Conflicted);
a=0;//     const/4 v14, 0x0
a=0;// 
a=0;//     .line 931
a=0;//     .local v14, "customView":Landroid/view/View;
a=0;//     #v14=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/view/View;);
a=0;//     if-eqz v40, :cond_18
a=0;// 
a=0;//     .line 932
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     .line 938
a=0;//     :cond_b
a=0;//     :goto_7
a=0;//     #v0=(Conflicted);v14=(Reference,Landroid/view/View;);v40=(Conflicted);
a=0;//     if-eqz v14, :cond_f
a=0;// 
a=0;//     .line 939
a=0;//     invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v40
a=0;// 
a=0;//     #v40=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     move-object/from16 v1, v40
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     .line 940
a=0;//     .restart local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v26=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     instance-of v0, v0, Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Boolean);
a=0;//     if-eqz v40, :cond_19
a=0;// 
a=0;//     move-object/from16 v40, v26
a=0;// 
a=0;//     #v40=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v40, Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;// 
a=0;//     move-object/from16 v4, v40
a=0;// 
a=0;//     .line 943
a=0;//     .local v4, "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;//     :goto_8
a=0;//     #v4=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);v40=(Conflicted);
a=0;//     const/16 v21, 0x0
a=0;// 
a=0;//     .line 944
a=0;//     .local v21, "horizontalMargin":I
a=0;//     #v21=(Null);
a=0;//     const/16 v36, 0x0
a=0;// 
a=0;//     .line 945
a=0;//     .local v36, "verticalMargin":I
a=0;//     #v36=(Null);
a=0;//     if-eqz v4, :cond_c
a=0;// 
a=0;//     .line 946
a=0;//     iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     move/from16 v41, v0
a=0;// 
a=0;//     add-int v21, v40, v41
a=0;// 
a=0;//     .line 947
a=0;//     #v21=(Integer);
a=0;//     iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->topMargin:I
a=0;// 
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->bottomMargin:I
a=0;// 
a=0;//     move/from16 v41, v0
a=0;// 
a=0;//     add-int v36, v40, v41
a=0;// 
a=0;//     .line 953
a=0;//     :cond_c
a=0;//     #v36=(Integer);v40=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     if-gtz v40, :cond_1a
a=0;// 
a=0;//     .line 954
a=0;//     const/high16 v11, -0x80000000
a=0;// 
a=0;//     .line 959
a=0;//     .local v11, "customNavHeightMode":I
a=0;//     :goto_9
a=0;//     #v1=(Conflicted);v11=(Integer);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v41, v0
a=0;// 
a=0;//     if-ltz v41, :cond_d
a=0;// 
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v41, v0
a=0;// 
a=0;//     move/from16 v0, v41
a=0;// 
a=0;//     invoke-static {v0, v15}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     .end local v15    # "height":I
a=0;//     :cond_d
a=0;//     sub-int v41, v15, v36
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     .line 962
a=0;//     .local v10, "customNavHeight":I
a=0;//     #v10=(Integer);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, -0x2
a=0;// 
a=0;//     #v41=(Byte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     move/from16 v1, v41
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_1c
a=0;// 
a=0;//     const/high16 v13, 0x40000000
a=0;// 
a=0;//     .line 964
a=0;//     .local v13, "customNavWidthMode":I
a=0;//     :goto_a
a=0;//     #v13=(Integer);
a=0;//     const/16 v41, 0x0
a=0;// 
a=0;//     #v41=(Null);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     if-ltz v40, :cond_1d
a=0;// 
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     :goto_b
a=0;//     sub-int v40, v40, v21
a=0;// 
a=0;//     move/from16 v0, v41
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move/from16 v1, v40
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 967
a=0;//     .local v12, "customNavWidth":I
a=0;//     #v12=(Integer);
a=0;//     if-eqz v4, :cond_1e
a=0;// 
a=0;//     iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     :goto_c
a=0;//     and-int/lit8 v17, v40, 0x7
a=0;// 
a=0;//     .line 972
a=0;//     .local v17, "hgrav":I
a=0;//     #v17=(Integer);
a=0;//     const/16 v40, 0x1
a=0;// 
a=0;//     #v40=(One);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     move/from16 v1, v40
a=0;// 
a=0;//     #v1=(One);
a=0;//     if-ne v0, v1, :cond_e
a=0;// 
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, -0x1
a=0;// 
a=0;//     #v41=(Byte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     move/from16 v1, v41
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_e
a=0;// 
a=0;//     .line 973
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     move/from16 v1, v32
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     mul-int/lit8 v12, v40, 0x2
a=0;// 
a=0;//     .line 976
a=0;//     :cond_e
a=0;//     invoke-static {v12, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     #v41=(Integer);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     move/from16 v1, v41
a=0;// 
a=0;//     invoke-virtual {v14, v0, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 979
a=0;//     invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     add-int v40, v40, v21
a=0;// 
a=0;//     sub-int v5, v5, v40
a=0;// 
a=0;//     .line 982
a=0;//     .end local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;//     .end local v10    # "customNavHeight":I
a=0;//     .end local v11    # "customNavHeightMode":I
a=0;//     .end local v12    # "customNavWidth":I
a=0;//     .end local v13    # "customNavWidthMode":I
a=0;//     .end local v17    # "hgrav":I
a=0;//     .end local v21    # "horizontalMargin":I
a=0;//     .end local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v36    # "verticalMargin":I
a=0;//     :cond_f
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v17=(Conflicted);v21=(Conflicted);v26=(Conflicted);v36=(Conflicted);v40=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/view/View;);
a=0;//     if-nez v40, :cond_10
a=0;// 
a=0;//     if-eqz v33, :cond_10
a=0;// 
a=0;//     .line 983
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v41, v0
a=0;// 
a=0;//     const/high16 v42, 0x40000000
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     invoke-static/range {v41 .. v42}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     const/16 v42, 0x0
a=0;// 
a=0;//     #v42=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     move-object/from16 v1, v40
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move/from16 v2, v41
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move/from16 v3, v42
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v0, v1, v5, v2, v3}, Landroid/support/v7/internal/widget/ActionBarView;->measureChildView(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 985
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v41, v0
a=0;// 
a=0;//     #v41=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual/range {v41 .. v41}, Landroid/widget/LinearLayout;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     #v41=(Integer);
a=0;//     sub-int v41, v24, v41
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     .line 988
a=0;//     :cond_10
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v40=(Reference,Landroid/view/View;);v42=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     if-gtz v40, :cond_21
a=0;// 
a=0;//     .line 989
a=0;//     const/16 v28, 0x0
a=0;// 
a=0;//     .line 990
a=0;//     .local v28, "measuredHeight":I
a=0;//     #v28=(Null);
a=0;//     const/16 v22, 0x0
a=0;// 
a=0;//     .restart local v22    # "i":I
a=0;//     :goto_d
a=0;//     #v22=(Integer);v28=(Integer);v29=(Conflicted);v35=(Conflicted);
a=0;//     move/from16 v0, v22
a=0;// 
a=0;//     if-ge v0, v7, :cond_1f
a=0;// 
a=0;//     .line 991
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     move/from16 v1, v22
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v35
a=0;// 
a=0;//     .line 992
a=0;//     .local v35, "v":Landroid/view/View;
a=0;//     #v35=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v35 .. v35}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     add-int v29, v40, v37
a=0;// 
a=0;//     .line 993
a=0;//     .local v29, "paddedViewHeight":I
a=0;//     #v29=(Integer);
a=0;//     move/from16 v0, v29
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     if-le v0, v1, :cond_11
a=0;// 
a=0;//     .line 994
a=0;//     move/from16 v28, v29
a=0;// 
a=0;//     .line 990
a=0;//     :cond_11
a=0;//     add-int/lit8 v22, v22, 0x1
a=0;// 
a=0;//     goto :goto_d
a=0;// 
a=0;//     .line 852
a=0;//     .end local v5    # "availableWidth":I
a=0;//     .end local v8    # "childSpecHeight":I
a=0;//     .end local v14    # "customView":Landroid/view/View;
a=0;//     .end local v18    # "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;//     .end local v22    # "i":I
a=0;//     .end local v24    # "leftOfCenter":I
a=0;//     .end local v27    # "maxHeight":I
a=0;//     .end local v28    # "measuredHeight":I
a=0;//     .end local v29    # "paddedViewHeight":I
a=0;//     .end local v30    # "paddingLeft":I
a=0;//     .end local v31    # "paddingRight":I
a=0;//     .end local v32    # "rightOfCenter":I
a=0;//     .end local v33    # "showTitle":Z
a=0;//     .end local v35    # "v":Landroid/view/View;
a=0;//     .end local v37    # "verticalPadding":I
a=0;//     :cond_12
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Conflicted);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Uninit);v41=(Conflicted);v42=(Uninit);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v27
a=0;// 
a=0;//     #v27=(Integer);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 865
a=0;//     .restart local v5    # "availableWidth":I
a=0;//     .restart local v8    # "childSpecHeight":I
a=0;//     .restart local v15    # "height":I
a=0;//     .restart local v24    # "leftOfCenter":I
a=0;//     .restart local v27    # "maxHeight":I
a=0;//     .restart local v30    # "paddingLeft":I
a=0;//     .restart local v31    # "paddingRight":I
a=0;//     .restart local v32    # "rightOfCenter":I
a=0;//     .restart local v37    # "verticalPadding":I
a=0;//     :cond_13
a=0;//     #v0=(Reference,Landroid/view/View;);v5=(Integer);v8=(Integer);v15=(Integer);v24=(Integer);v30=(Integer);v31=(Integer);v32=(Integer);v37=(Integer);v40=(Reference,Landroid/view/View;);v41=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     move-object/from16 v18, v0
a=0;// 
a=0;//     #v18=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 873
a=0;//     .restart local v18    # "homeLayout":Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;//     .restart local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_14
a=0;//     #v0=(Integer);v1=(PosByte);v26=(Reference,Landroid/view/ViewGroup$LayoutParams;);v40=(Integer);v41=(PosByte);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     const/high16 v41, 0x40000000
a=0;// 
a=0;//     #v41=(Integer);
a=0;//     invoke-static/range {v40 .. v41}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .restart local v20    # "homeWidthSpec":I
a=0;//     #v20=(Integer);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .line 896
a=0;//     .end local v20    # "homeWidthSpec":I
a=0;//     .end local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_15
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v19=(Conflicted);v20=(Conflicted);v26=(Conflicted);v40=(Conflicted);
a=0;//     const/16 v33, 0x0
a=0;// 
a=0;//     #v33=(Null);
a=0;//     goto/16 :goto_5
a=0;// 
a=0;//     .line 902
a=0;//     .restart local v33    # "showTitle":Z
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v33=(Boolean);v40=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v40, :cond_a
a=0;// 
a=0;//     .line 903
a=0;//     if-eqz v33, :cond_16
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     mul-int/lit8 v23, v40, 0x2
a=0;// 
a=0;//     .line 904
a=0;//     .local v23, "itemPaddingSize":I
a=0;//     :goto_e
a=0;//     #v23=(Integer);v40=(Conflicted);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     sub-int v41, v5, v23
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 905
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     sub-int v41, v24, v23
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     .line 906
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/high16 v41, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v41
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     const/high16 v42, 0x40000000
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     move/from16 v0, v42
a=0;// 
a=0;//     invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v42
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v42}, Landroid/widget/LinearLayout;->measure(II)V
a=0;// 
a=0;//     .line 909
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v40}, Landroid/widget/LinearLayout;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     .line 910
a=0;//     .local v25, "listNavWidth":I
a=0;//     #v25=(Integer);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     sub-int v41, v5, v25
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 911
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     sub-int v41, v24, v25
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     .line 912
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 903
a=0;//     .end local v23    # "itemPaddingSize":I
a=0;//     .end local v25    # "listNavWidth":I
a=0;//     :cond_16
a=0;//     #v23=(Uninit);v25=(Uninit);v40=(Reference,Landroid/widget/LinearLayout;);v42=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     goto :goto_e
a=0;// 
a=0;//     .line 915
a=0;//     :pswitch_1
a=0;//     #v23=(Uninit);v40=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v40, :cond_a
a=0;// 
a=0;//     .line 916
a=0;//     if-eqz v33, :cond_17
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     mul-int/lit8 v23, v40, 0x2
a=0;// 
a=0;//     .line 917
a=0;//     .restart local v23    # "itemPaddingSize":I
a=0;//     :goto_f
a=0;//     #v23=(Integer);v40=(Conflicted);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     sub-int v41, v5, v23
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 918
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     sub-int v41, v24, v23
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     .line 919
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     const/high16 v41, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v41
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     const/high16 v42, 0x40000000
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     move/from16 v0, v42
a=0;// 
a=0;//     invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v42
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v42}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->measure(II)V
a=0;// 
a=0;//     .line 922
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v34
a=0;// 
a=0;//     .line 923
a=0;//     .local v34, "tabWidth":I
a=0;//     #v34=(Integer);
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     #v40=(Null);
a=0;//     sub-int v41, v5, v34
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 924
a=0;//     const/16 v40, 0x0
a=0;// 
a=0;//     sub-int v41, v24, v34
a=0;// 
a=0;//     invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     goto/16 :goto_6
a=0;// 
a=0;//     .line 916
a=0;//     .end local v23    # "itemPaddingSize":I
a=0;//     .end local v34    # "tabWidth":I
a=0;//     :cond_17
a=0;//     #v23=(Uninit);v34=(Uninit);v40=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);v42=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v23, v0
a=0;// 
a=0;//     #v23=(Integer);
a=0;//     goto :goto_f
a=0;// 
a=0;//     .line 933
a=0;//     .restart local v14    # "customView":Landroid/view/View;
a=0;//     :cond_18
a=0;//     #v0=(Reference,Landroid/view/View;);v14=(Null);v23=(Conflicted);v25=(Conflicted);v34=(Conflicted);v42=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     and-int/lit8 v40, v40, 0x10
a=0;// 
a=0;//     if-eqz v40, :cond_b
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/view/View;);
a=0;//     if-eqz v40, :cond_b
a=0;// 
a=0;//     .line 935
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v14=(Reference,Landroid/view/View;);
a=0;//     goto/16 :goto_7
a=0;// 
a=0;//     .line 940
a=0;//     .restart local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_19
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);v26=(Reference,Landroid/view/ViewGroup$LayoutParams;);v40=(Boolean);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_8
a=0;// 
a=0;//     .line 956
a=0;//     .restart local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;//     .restart local v21    # "horizontalMargin":I
a=0;//     .restart local v36    # "verticalMargin":I
a=0;//     :cond_1a
a=0;//     #v0=(Integer);v4=(Reference,Landroid/support/v7/app/ActionBar$LayoutParams;);v21=(Integer);v36=(Integer);v40=(Integer);
a=0;//     move-object/from16 v0, v26
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v40, v0
a=0;// 
a=0;//     const/16 v41, -0x2
a=0;// 
a=0;//     #v41=(Byte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     move/from16 v1, v41
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_1b
a=0;// 
a=0;//     const/high16 v11, 0x40000000
a=0;// 
a=0;//     .restart local v11    # "customNavHeightMode":I
a=0;//     :goto_10
a=0;//     #v11=(Integer);
a=0;//     goto/16 :goto_9
a=0;// 
a=0;//     .end local v11    # "customNavHeightMode":I
a=0;//     :cond_1b
a=0;//     #v11=(Uninit);
a=0;//     const/high16 v11, -0x80000000
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     goto :goto_10
a=0;// 
a=0;//     .line 962
a=0;//     .end local v15    # "height":I
a=0;//     .restart local v10    # "customNavHeight":I
a=0;//     .restart local v11    # "customNavHeightMode":I
a=0;//     :cond_1c
a=0;//     #v10=(Integer);
a=0;//     const/high16 v13, -0x80000000
a=0;// 
a=0;//     #v13=(Integer);
a=0;//     goto/16 :goto_a
a=0;// 
a=0;//     .restart local v13    # "customNavWidthMode":I
a=0;//     :cond_1d
a=0;//     #v41=(Null);
a=0;//     move/from16 v40, v5
a=0;// 
a=0;//     .line 964
a=0;//     goto/16 :goto_b
a=0;// 
a=0;//     .line 967
a=0;//     .restart local v12    # "customNavWidth":I
a=0;//     :cond_1e
a=0;//     #v0=(Null);v1=(Integer);v12=(Integer);
a=0;//     const/16 v40, 0x13
a=0;// 
a=0;//     #v40=(PosByte);
a=0;//     goto/16 :goto_c
a=0;// 
a=0;//     .line 997
a=0;//     .end local v4    # "ablp":Landroid/support/v7/app/ActionBar$LayoutParams;
a=0;//     .end local v10    # "customNavHeight":I
a=0;//     .end local v11    # "customNavHeightMode":I
a=0;//     .end local v12    # "customNavWidth":I
a=0;//     .end local v13    # "customNavWidthMode":I
a=0;//     .end local v21    # "horizontalMargin":I
a=0;//     .end local v26    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v36    # "verticalMargin":I
a=0;//     .restart local v22    # "i":I
a=0;//     .restart local v28    # "measuredHeight":I
a=0;//     :cond_1f
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v17=(Conflicted);v21=(Conflicted);v22=(Integer);v26=(Conflicted);v28=(Integer);v29=(Conflicted);v35=(Conflicted);v36=(Conflicted);v40=(Integer);v41=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     move/from16 v1, v28
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v9, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 1002
a=0;//     .end local v22    # "i":I
a=0;//     .end local v28    # "measuredHeight":I
a=0;//     :goto_11
a=0;//     #v22=(Conflicted);v28=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     if-eqz v40, :cond_20
a=0;// 
a=0;//     .line 1003
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v41}, Landroid/support/v7/internal/widget/ActionBarContextView;->setContentHeight(I)V
a=0;// 
a=0;//     .line 1006
a=0;//     :cond_20
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     if-eqz v40, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I
a=0;// 
a=0;//     move-result v40
a=0;// 
a=0;//     #v40=(Integer);
a=0;//     const/16 v41, 0x8
a=0;// 
a=0;//     #v41=(PosByte);
a=0;//     move/from16 v0, v40
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v41
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-eq v0, v1, :cond_3
a=0;// 
a=0;//     .line 1007
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-object/from16 v40, v0
a=0;// 
a=0;//     #v40=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v41, v0
a=0;// 
a=0;//     #v41=(Integer);
a=0;//     mul-int/lit8 v41, v41, 0x2
a=0;// 
a=0;//     sub-int v41, v9, v41
a=0;// 
a=0;//     const/high16 v42, 0x40000000
a=0;// 
a=0;//     #v42=(Integer);
a=0;//     invoke-static/range {v41 .. v42}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v41
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v42
a=0;// 
a=0;//     const/high16 v43, -0x80000000
a=0;// 
a=0;//     #v43=(Integer);
a=0;//     invoke-static/range {v42 .. v43}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v42
a=0;// 
a=0;//     invoke-virtual/range {v40 .. v42}, Landroid/support/v7/internal/widget/ProgressBarICS;->measure(II)V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 999
a=0;//     :cond_21
a=0;//     #v1=(Conflicted);v28=(Uninit);v29=(Uninit);v35=(Uninit);v40=(Integer);v42=(Conflicted);v43=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     move/from16 v1, v27
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v9, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     goto :goto_11
a=0;// 
a=0;//     .line 900
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);v27=(Unknown);v28=(Unknown);v29=(Unknown);v30=(Unknown);v31=(Unknown);v32=(Unknown);v33=(Unknown);v34=(Unknown);v35=(Unknown);v36=(Unknown);v37=(Unknown);v38=(Unknown);v39=(Unknown);v40=(Unknown);v41=(Unknown);v42=(Unknown);v43=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 4
a=0;//     .param p1, "p"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1186
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     check-cast v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;
a=0;// 
a=0;//     .line 1188
a=0;//     .local v1, "state":Landroid/support/v7/internal/widget/ActionBarView$SavedState;
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->getSuperState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/os/Parcelable;);
a=0;//     invoke-super {p0, v2}, Landroid/support/v7/internal/widget/AbsActionBarView;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1190
a=0;//     iget v2, v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1192
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     iget v3, v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     check-cast v0, Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     .line 1194
a=0;//     .local v0, "item":Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1195
a=0;//     invoke-interface {v0}, Landroid/support/v4/internal/view/SupportMenuItem;->expandActionView()Z
a=0;// 
a=0;//     .line 1199
a=0;//     .end local v0    # "item":Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-boolean v2, v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1200
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->postShowOverflowMenu()V
a=0;// 
a=0;//     .line 1202
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1172
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1173
a=0;//     .local v1, "superState":Landroid/os/Parcelable;
a=0;//     #v1=(Reference,Landroid/os/Parcelable;);
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ActionBarView$SavedState;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$SavedState;-><init>(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     .line 1175
a=0;//     .local v0, "state":Landroid/support/v7/internal/widget/ActionBarView$SavedState;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$SavedState;);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 1176
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     iget-object v2, v2, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getItemId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I
a=0;// 
a=0;//     .line 1179
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z
a=0;// 
a=0;//     .line 1181
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic postShowOverflowMenu()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->postShowOverflowMenu()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCallback(Landroid/support/v7/app/ActionBar$OnNavigationListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "callback"    # Landroid/support/v7/app/ActionBar$OnNavigationListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 392
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCallback:Landroid/support/v7/app/ActionBar$OnNavigationListener;
a=0;// 
a=0;//     .line 393
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCollapsable(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "collapsable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 809
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsable:Z
a=0;// 
a=0;//     .line 810
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setContentHeight(I)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setContentHeight(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContextView(Landroid/support/v7/internal/widget/ActionBarContextView;)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 805
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     .line 806
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomNavigationView(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 490
a=0;//     .local v0, "showCustom":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 491
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 493
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     .line 494
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 495
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 497
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 489
a=0;//     .end local v0    # "showCustom":Z
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setDisplayOptions(I)V
a=0;//     .locals 11
a=0;//     .param p1, "options"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     const/4 v8, 0x1
a=0;// 
a=0;//     #v8=(One);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 572
a=0;//     #v6=(Null);
a=0;//     iget v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-ne v9, v0, :cond_6
a=0;// 
a=0;//     .line 573
a=0;//     .local v0, "flagsChanged":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     .line 575
a=0;//     and-int/lit8 v9, v0, 0x1f
a=0;// 
a=0;//     if-eqz v9, :cond_11
a=0;// 
a=0;//     .line 576
a=0;//     and-int/lit8 v9, p1, 0x2
a=0;// 
a=0;//     if-eqz v9, :cond_7
a=0;// 
a=0;//     move v4, v8
a=0;// 
a=0;//     .line 577
a=0;//     .local v4, "showHome":Z
a=0;//     :goto_1
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     if-nez v9, :cond_8
a=0;// 
a=0;//     move v5, v6
a=0;// 
a=0;//     .line 578
a=0;//     .local v5, "vis":I
a=0;//     :goto_2
a=0;//     #v5=(PosByte);v9=(Conflicted);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {v9, v5}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setVisibility(I)V
a=0;// 
a=0;//     .line 580
a=0;//     and-int/lit8 v9, v0, 0x4
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 581
a=0;//     and-int/lit8 v9, p1, 0x4
a=0;// 
a=0;//     if-eqz v9, :cond_9
a=0;// 
a=0;//     move v3, v8
a=0;// 
a=0;//     .line 582
a=0;//     .local v3, "setUp":Z
a=0;//     :goto_3
a=0;//     #v3=(Boolean);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v9=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {v9, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUp(Z)V
a=0;// 
a=0;//     .line 588
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 589
a=0;//     invoke-virtual {p0, v8}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeButtonEnabled(Z)V
a=0;// 
a=0;//     .line 593
a=0;//     .end local v3    # "setUp":Z
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v9=(Conflicted);
a=0;//     and-int/lit8 v9, v0, 0x1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 594
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v9, :cond_a
a=0;// 
a=0;//     and-int/lit8 v9, p1, 0x1
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_a
a=0;// 
a=0;//     move v2, v8
a=0;// 
a=0;//     .line 596
a=0;//     .local v2, "logoVis":Z
a=0;//     :goto_4
a=0;//     #v2=(Boolean);v9=(Conflicted);
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v10=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     if-eqz v2, :cond_b
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     :goto_5
a=0;//     #v9=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v10, v9}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 599
a=0;//     .end local v2    # "logoVis":Z
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     and-int/lit8 v9, v0, 0x8
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_2
a=0;// 
a=0;//     .line 600
a=0;//     and-int/lit8 v9, p1, 0x8
a=0;// 
a=0;//     if-eqz v9, :cond_c
a=0;// 
a=0;//     .line 601
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initTitle()V
a=0;// 
a=0;//     .line 607
a=0;//     :cond_2
a=0;//     :goto_6
a=0;//     #v9=(Conflicted);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v9=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v9, :cond_4
a=0;// 
a=0;//     and-int/lit8 v9, v0, 0x6
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_4
a=0;// 
a=0;//     .line 609
a=0;//     iget v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     and-int/lit8 v9, v9, 0x4
a=0;// 
a=0;//     if-eqz v9, :cond_d
a=0;// 
a=0;//     move v1, v8
a=0;// 
a=0;//     .line 610
a=0;//     .local v1, "homeAsUp":Z
a=0;//     :goto_7
a=0;//     #v1=(Boolean);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;
a=0;// 
a=0;//     #v9=(Reference,Landroid/view/View;);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     if-eqz v1, :cond_e
a=0;// 
a=0;//     move v7, v6
a=0;// 
a=0;//     :cond_3
a=0;//     :goto_8
a=0;//     invoke-virtual {v9, v7}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 611
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-nez v4, :cond_f
a=0;// 
a=0;//     if-eqz v1, :cond_f
a=0;// 
a=0;//     :goto_9
a=0;//     #v8=(Boolean);
a=0;//     invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setEnabled(Z)V
a=0;// 
a=0;//     .line 614
a=0;//     .end local v1    # "homeAsUp":Z
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     and-int/lit8 v6, v0, 0x10
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     .line 615
a=0;//     and-int/lit8 v6, p1, 0x10
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_10
a=0;// 
a=0;//     .line 616
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 622
a=0;//     :cond_5
a=0;//     :goto_a
a=0;//     #v6=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->requestLayout()V
a=0;// 
a=0;//     .line 628
a=0;//     .end local v4    # "showHome":Z
a=0;//     .end local v5    # "vis":I
a=0;//     :goto_b
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->isEnabled()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_12
a=0;// 
a=0;//     .line 629
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     invoke-virtual {v6, v7}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 637
a=0;//     :goto_c
a=0;//     #v7=(Reference,Ljava/lang/CharSequence;);v8=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 572
a=0;//     .end local v0    # "flagsChanged":I
a=0;//     :cond_6
a=0;//     #v0=(Byte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(PosByte);v8=(One);v9=(Integer);v10=(Uninit);
a=0;//     iget v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     xor-int v0, p1, v9
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .restart local v0    # "flagsChanged":I
a=0;//     :cond_7
a=0;//     move v4, v6
a=0;// 
a=0;//     .line 576
a=0;//     #v4=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .restart local v4    # "showHome":Z
a=0;//     :cond_8
a=0;//     #v4=(Boolean);v9=(Conflicted);
a=0;//     move v5, v7
a=0;// 
a=0;//     .line 577
a=0;//     #v5=(PosByte);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .restart local v5    # "vis":I
a=0;//     :cond_9
a=0;//     #v9=(Integer);
a=0;//     move v3, v6
a=0;// 
a=0;//     .line 581
a=0;//     #v3=(Null);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :cond_a
a=0;//     #v3=(Conflicted);v9=(Conflicted);
a=0;//     move v2, v6
a=0;// 
a=0;//     .line 594
a=0;//     #v2=(Null);
a=0;//     goto :goto_4
a=0;// 
a=0;//     .line 596
a=0;//     .restart local v2    # "logoVis":Z
a=0;//     :cond_b
a=0;//     #v2=(Boolean);v10=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 603
a=0;//     .end local v2    # "logoVis":Z
a=0;//     :cond_c
a=0;//     #v2=(Conflicted);v9=(Integer);v10=(Conflicted);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v9=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {p0, v9}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_6
a=0;// 
a=0;//     :cond_d
a=0;//     #v9=(Integer);
a=0;//     move v1, v6
a=0;// 
a=0;//     .line 609
a=0;//     #v1=(Null);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 610
a=0;//     .restart local v1    # "homeAsUp":Z
a=0;//     :cond_e
a=0;//     #v1=(Boolean);v9=(Reference,Landroid/view/View;);
a=0;//     const/4 v7, 0x4
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     :cond_f
a=0;//     #v7=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move v8, v6
a=0;// 
a=0;//     .line 611
a=0;//     #v8=(Null);
a=0;//     goto :goto_9
a=0;// 
a=0;//     .line 618
a=0;//     .end local v1    # "homeAsUp":Z
a=0;//     :cond_10
a=0;//     #v1=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Boolean);v9=(Conflicted);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;
a=0;// 
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_a
a=0;// 
a=0;//     .line 624
a=0;//     .end local v4    # "showHome":Z
a=0;//     .end local v5    # "vis":I
a=0;//     :cond_11
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(PosByte);v8=(One);v9=(Integer);v10=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->invalidate()V
a=0;// 
a=0;//     goto :goto_b
a=0;// 
a=0;//     .line 630
a=0;//     :cond_12
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Conflicted);v8=(Boolean);v9=(Conflicted);v10=(Conflicted);
a=0;//     and-int/lit8 v6, p1, 0x4
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_13
a=0;// 
a=0;//     .line 631
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Landroid/support/v7/appcompat/R$string;->abc_action_bar_up_description:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_c
a=0;// 
a=0;//     .line 634
a=0;//     :cond_13
a=0;//     #v6=(Integer);v7=(Conflicted);v8=(Boolean);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Landroid/support/v7/appcompat/R$string;->abc_action_bar_home_description:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_c
a=0;// .end method
a=0;// 
a=0;// .method public setDropdownAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;//     .locals 1
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 710
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .line 711
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 712
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     .line 714
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDropdownSelectedPosition(I)V
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 721
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V
a=0;// 
a=0;//     .line 722
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
a=0;//     .locals 4
a=0;//     .param p1, "tabs"    # Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 377
a=0;//     #v2=(One);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 378
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 380
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     .line 381
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z
a=0;// 
a=0;//     .line 382
a=0;//     iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v3, 0x2
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     if-ne v1, v3, :cond_1
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 384
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 385
a=0;//     .local v0, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v1, -0x2
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 386
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 387
a=0;//     invoke-virtual {p1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V
a=0;// 
a=0;//     .line 389
a=0;//     .end local v0    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 381
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);v3=(Uninit);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setHomeAsUpIndicator(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1209
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUpIndicator(I)V
a=0;// 
a=0;//     .line 1210
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "indicator"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1205
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUpIndicator(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 1206
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setHomeButtonEnabled(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "enable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 557
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setEnabled(Z)V
a=0;// 
a=0;//     .line 558
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setFocusable(Z)V
a=0;// 
a=0;//     .line 560
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 561
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 569
a=0;//     :goto_0
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 562
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 563
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Landroid/support/v7/appcompat/R$string;->abc_action_bar_up_description:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 566
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);v2=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Landroid/support/v7/appcompat/R$string;->abc_action_bar_home_description:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 651
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 652
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 3
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 640
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 641
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 643
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 645
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 646
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 648
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLogo(I)V
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 662
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setLogo(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 663
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setLogo(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "logo"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 655
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 656
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 657
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView$HomeView;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 659
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setMenu(Landroid/support/v4/internal/view/SupportMenu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;//     .locals 8
a=0;//     .param p1, "menu"    # Landroid/support/v4/internal/view/SupportMenu;
a=0;//     .param p2, "cb"    # Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     .line 396
a=0;//     #v7=(Byte);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     if-ne p1, v4, :cond_0
a=0;// 
a=0;//     .line 459
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 400
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 401
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     :cond_1
a=0;//     #v5=(Conflicted);
a=0;//     move-object v0, p1
a=0;// 
a=0;//     .line 405
a=0;//     #v0=(Reference,Landroid/support/v4/internal/view/SupportMenu;);
a=0;//     check-cast v0, Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 406
a=0;//     .local v0, "builder":Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 408
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 409
a=0;//     .local v3, "oldParent":Landroid/view/ViewGroup;
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 410
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 413
a=0;//     .end local v3    # "oldParent":Landroid/view/ViewGroup;
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 414
a=0;//     new-instance v4, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 415
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, p2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 416
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     sget v5, Landroid/support/v7/appcompat/R$id;->action_menu_presenter:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setId(I)V
a=0;// 
a=0;//     .line 417
a=0;//     new-instance v4, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct {v4, p0, v5}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;-><init>(Landroid/support/v7/internal/widget/ActionBarView;Landroid/support/v7/internal/widget/ActionBarView$1;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
a=0;// 
a=0;//     .line 421
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     new-instance v1, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v1, v4, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 423
a=0;//     .local v1, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget-boolean v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitActionBar:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_5
a=0;// 
a=0;//     .line 424
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v6, Landroid/support/v7/appcompat/R$bool;->abc_action_bar_expanded_action_views_exclusive:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getBoolean(I)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V
a=0;// 
a=0;//     .line 427
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->configPresenters(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     .line 428
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuView;);
a=0;//     check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 429
a=0;//     .local v2, "menuView":Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->initialize(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     .line 430
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 431
a=0;//     .restart local v3    # "oldParent":Landroid/view/ViewGroup;
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     if-eq v3, p0, :cond_4
a=0;// 
a=0;//     .line 432
a=0;//     invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 434
a=0;//     :cond_4
a=0;//     invoke-virtual {p0, v2, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 458
a=0;//     .end local v3    # "oldParent":Landroid/view/ViewGroup;
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v5=(Integer);
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 436
a=0;//     .end local v2    # "menuView":Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;//     :cond_5
a=0;//     #v2=(Uninit);v4=(Boolean);v5=(Conflicted);v6=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V
a=0;// 
a=0;//     .line 438
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v4, v5, v6}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V
a=0;// 
a=0;//     .line 441
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     const v5, 0x7fffffff
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V
a=0;// 
a=0;//     .line 443
a=0;//     iput v7, v1, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 444
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->configPresenters(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     .line 445
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuView;);
a=0;//     check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 446
a=0;//     .restart local v2    # "menuView":Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v4, :cond_7
a=0;// 
a=0;//     .line 447
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v3, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 448
a=0;//     .restart local v3    # "oldParent":Landroid/view/ViewGroup;
a=0;//     if-eqz v3, :cond_6
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eq v3, v4, :cond_6
a=0;// 
a=0;//     .line 449
a=0;//     invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 451
a=0;//     :cond_6
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getAnimatedVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v2, v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setVisibility(I)V
a=0;// 
a=0;//     .line 452
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     invoke-virtual {v4, v2, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 455
a=0;//     .end local v3    # "oldParent":Landroid/view/ViewGroup;
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setNavigationMode(I)V
a=0;//     .locals 6
a=0;//     .param p1, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 666
a=0;//     #v5=(Null);
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I
a=0;// 
a=0;//     .line 667
a=0;//     .local v0, "oldMode":I
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v0, :cond_2
a=0;// 
a=0;//     .line 668
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 680
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     packed-switch p1, :pswitch_data_1
a=0;// 
a=0;//     .line 704
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I
a=0;// 
a=0;//     .line 705
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->requestLayout()V
a=0;// 
a=0;//     .line 707
a=0;//     :cond_2
a=0;//     return-void
a=0;// 
a=0;//     .line 670
a=0;//     :pswitch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 671
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 675
a=0;//     :pswitch_1
a=0;//     #v2=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 676
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 682
a=0;//     :pswitch_2
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 683
a=0;//     new-instance v2, Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     sget v4, Landroid/support/v7/appcompat/R$attr;->actionDropDownStyle:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-direct {v2, v3, v5, v4}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     .line 685
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_view_list_nav_layout:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 687
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
a=0;//     .line 689
a=0;//     .local v1, "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout$LayoutParams;);
a=0;//     const/16 v2, 0x11
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 690
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     invoke-virtual {v2, v3, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 692
a=0;//     .end local v1    # "params":Landroid/widget/LinearLayout$LayoutParams;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eq v2, v3, :cond_4
a=0;// 
a=0;//     .line 693
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     .line 695
a=0;//     :cond_4
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS;->setOnItemSelectedListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;)V
a=0;// 
a=0;//     .line 696
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 699
a=0;//     :pswitch_3
a=0;//     #v1=(Uninit);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 700
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ScrollingTabContainerView;);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 668
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// 
a=0;//     .line 680
a=0;//     :pswitch_data_1
a=0;//     .packed-switch 0x1
a=0;//         :pswitch_2
a=0;//         :pswitch_3
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setSplitActionBar(Z)V
a=0;//     .locals 4
a=0;//     .param p1, "splitActionBar"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 329
a=0;//     #v2=(Null);
a=0;//     iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitActionBar:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eq v1, p1, :cond_5
a=0;// 
a=0;//     .line 330
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 331
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 332
a=0;//     .local v0, "oldParent":Landroid/view/ViewGroup;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 333
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 335
a=0;//     :cond_0
a=0;//     if-eqz p1, :cond_6
a=0;// 
a=0;//     .line 336
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 337
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 339
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 344
a=0;//     :goto_0
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->requestLayout()V
a=0;// 
a=0;//     .line 346
a=0;//     .end local v0    # "oldParent":Landroid/view/ViewGroup;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 347
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     if-eqz p1, :cond_7
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V
a=0;// 
a=0;//     .line 350
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 351
a=0;//     if-nez p1, :cond_8
a=0;// 
a=0;//     .line 352
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$bool;->abc_action_bar_expanded_action_views_exclusive:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V
a=0;// 
a=0;//     .line 364
a=0;//     :cond_4
a=0;//     :goto_2
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitActionBar(Z)V
a=0;// 
a=0;//     .line 366
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 341
a=0;//     .restart local v0    # "oldParent":Landroid/view/ViewGroup;
a=0;//     :cond_6
a=0;//     #v0=(Reference,Landroid/view/ViewGroup;);v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);v2=(Null);v3=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const/4 v3, -0x2
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 347
a=0;//     .end local v0    # "oldParent":Landroid/view/ViewGroup;
a=0;//     :cond_7
a=0;//     #v0=(Conflicted);v3=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 356
a=0;//     :cond_8
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);v3=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V
a=0;// 
a=0;//     .line 358
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V
a=0;// 
a=0;//     .line 361
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     const v2, 0x7fffffff
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setSplitWhenNarrow(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitWhenNarrow(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 5
a=0;//     .param p1, "subtitle"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v3, 0x8
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 545
a=0;//     #v2=(Null);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 546
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 547
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 548
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v4, v1}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 549
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 552
a=0;//     .local v0, "visible":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     :goto_2
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 554
a=0;//     .end local v0    # "visible":Z
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Null);v4=(Reference,Landroid/widget/TextView;);
a=0;//     move v1, v3
a=0;// 
a=0;//     .line 548
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 549
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v0    # "visible":Z
a=0;//     :cond_4
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move v2, v3
a=0;// 
a=0;//     .line 552
a=0;//     #v2=(PosByte);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 510
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mUserTitle:Z
a=0;// 
a=0;//     .line 511
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setTitleImpl(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 512
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setVisibility(I)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setVisibility(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setWindowCallback(Landroid/view/Window$Callback;)V
a=0;//     .locals 0
a=0;//     .param p1, "cb"    # Landroid/view/Window$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 294
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mWindowCallback:Landroid/view/Window$Callback;
a=0;// 
a=0;//     .line 295
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setWindowTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 521
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mUserTitle:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 522
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setTitleImpl(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 524
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public shouldDelayChildPressedState()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 308
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic showOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->showOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
}}
