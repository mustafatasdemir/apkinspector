package android.support.v7.internal.widget; class ActionBarView {/*

.class public Landroid/support/v7/internal/widget/ActionBarView;
.super Landroid/support/v7/internal/widget/AbsActionBarView;
.source "ActionBarView.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;,
        Landroid/support/v7/internal/widget/ActionBarView$HomeView;,
        Landroid/support/v7/internal/widget/ActionBarView$SavedState;
    }
.end annotation


# static fields
.field private static final DEFAULT_CUSTOM_GRAVITY:I = 0x13

.field public static final DISPLAY_DEFAULT:I = 0x0

.field private static final DISPLAY_RELAYOUT_MASK:I = 0x1f

.field private static final TAG:Ljava/lang/String; = "ActionBarView"


# instance fields
.field private mCallback:Landroid/support/v7/app/ActionBar$OnNavigationListener;

.field private mContext:Landroid/content/Context;

.field private mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

.field private mCustomNavView:Landroid/view/View;

.field private mDisplayOptions:I

.field mExpandedActionView:Landroid/view/View;

.field private final mExpandedActionViewUpListener:Landroid/view/View$OnClickListener;

.field private mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

.field private mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

.field private mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

.field private mIcon:Landroid/graphics/drawable/Drawable;

.field private mIncludeTabs:Z

.field private mIndeterminateProgressStyle:I

.field private mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

.field private mIsCollapsable:Z

.field private mIsCollapsed:Z

.field private mItemPadding:I

.field private mListNavLayout:Landroid/widget/LinearLayout;

.field private mLogo:Landroid/graphics/drawable/Drawable;

.field private mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

.field private final mNavItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

.field private mNavigationMode:I

.field private mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private mProgressBarPadding:I

.field private mProgressStyle:I

.field private mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

.field private mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

.field private mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

.field private mSubtitle:Ljava/lang/CharSequence;

.field private mSubtitleStyleRes:I

.field private mSubtitleView:Landroid/widget/TextView;

.field private mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

.field private mTabSelector:Ljava/lang/Runnable;

.field private mTitle:Ljava/lang/CharSequence;

.field private mTitleLayout:Landroid/widget/LinearLayout;

.field private mTitleStyleRes:I

.field private mTitleUpView:Landroid/view/View;

.field private mTitleView:Landroid/widget/TextView;

.field private final mUpClickListener:Landroid/view/View$OnClickListener;

.field private mUserTitle:Z

.field mWindowCallback:Landroid/view/Window$Callback;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 16
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 166
    invoke-direct/range {p0 .. p2}, Landroid/support/v7/internal/widget/AbsActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 85
    #p0=(Reference);
    const/4 v2, -0x1

    #v2=(Byte);
    move-object/from16 v0, p0

    #v0=(Reference);
    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    .line 135
    new-instance v2, Landroid/support/v7/internal/widget/ActionBarView$1;

    #v2=(UninitRef);
    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/support/v7/internal/widget/ActionBarView$1;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V

    #v2=(Reference);
    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    .line 149
    new-instance v2, Landroid/support/v7/internal/widget/ActionBarView$2;

    #v2=(UninitRef);
    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/support/v7/internal/widget/ActionBarView$2;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V

    #v2=(Reference);
    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionViewUpListener:Landroid/view/View$OnClickListener;

    .line 159
    new-instance v2, Landroid/support/v7/internal/widget/ActionBarView$3;

    #v2=(UninitRef);
    move-object/from16 v0, p0

    invoke-direct {v2, v0}, Landroid/support/v7/internal/widget/ActionBarView$3;-><init>(Landroid/support/v7/internal/widget/ActionBarView;)V

    #v2=(Reference);
    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mUpClickListener:Landroid/view/View$OnClickListener;

    .line 167
    move-object/from16 v0, p1

    move-object/from16 v1, p0

    #v1=(Reference);
    iput-object v0, v1, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    .line 170
    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setBackgroundResource(I)V

    .line 172
    sget-object v2, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I

    #v2=(Reference);
    sget v3, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I

    #v3=(Integer);
    const/4 v4, 0x0

    #v4=(Null);
    move-object/from16 v0, p1

    move-object/from16 v1, p2

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v9

    .line 175
    .local v9, a:Landroid/content/res/TypedArray;
    #v9=(Reference);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v10

    .line 176
    .local v10, appInfo:Landroid/content/pm/ApplicationInfo;
    #v10=(Reference);
    invoke-virtual/range {p1 .. p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v15

    .line 177
    .local v15, pm:Landroid/content/pm/PackageManager;
    #v15=(Reference);
    const/4 v2, 0x2

    #v2=(PosByte);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    .line 179
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    #v2=(Reference);
    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    .line 180
    const/4 v2, 0x4

    #v2=(PosByte);
    invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    #v2=(Reference);
    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    .line 181
    const/16 v2, 0x8

    #v2=(PosByte);
    invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    #v2=(Reference);
    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    .line 182
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_1

    .line 183
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    #v2=(Integer);
    const/16 v3, 0x9

    #v3=(PosByte);
    if-lt v2, v3, :cond_1

    .line 184
    move-object/from16 v0, p1

    instance-of v2, v0, Landroid/app/Activity;

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 186
    :try_start_0
    move-object/from16 v0, p1

    check-cast v0, Landroid/app/Activity;

    move-object v2, v0

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v15, v2}, Landroid/content/pm/PackageManager;->getActivityLogo(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 191
    :cond_0
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v12=(Conflicted);
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-nez v2, :cond_1

    .line 192
    invoke-virtual {v10, v15}, Landroid/content/pm/ApplicationInfo;->loadLogo(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    .line 198
    :cond_1
    #v2=(Conflicted);
    const/4 v2, 0x7

    #v2=(PosByte);
    invoke-virtual {v9, v2}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    #v2=(Reference);
    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    .line 199
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    if-nez v2, :cond_3

    .line 200
    move-object/from16 v0, p1

    instance-of v2, v0, Landroid/app/Activity;

    #v2=(Boolean);
    if-eqz v2, :cond_2

    .line 202
    :try_start_1
    move-object/from16 v0, p1

    check-cast v0, Landroid/app/Activity;

    move-object v2, v0

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/app/Activity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v2

    invoke-virtual {v15, v2}, Landroid/content/pm/PackageManager;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 207
    :cond_2
    :goto_1
    #v2=(Conflicted);
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    #v2=(Reference);
    if-nez v2, :cond_3

    .line 208
    invoke-virtual {v10, v15}, Landroid/content/pm/ApplicationInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    .line 212
    :cond_3
    invoke-static/range {p1 .. p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v14

    .line 214
    .local v14, inflater:Landroid/view/LayoutInflater;
    #v14=(Reference);
    const/16 v2, 0xe

    #v2=(PosByte);
    sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_home:I

    #v3=(Integer);
    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v13

    .line 218
    .local v13, homeResId:I
    #v13=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p0

    invoke-virtual {v14, v13, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    .line 220
    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p0

    invoke-virtual {v14, v13, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    .line 221
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUp(Z)V

    .line 222
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionViewUpListener:Landroid/view/View$OnClickListener;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 223
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Landroid/support/v7/appcompat/R$string;->abc_action_bar_up_description:I

    #v4=(Integer);
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 226
    const/4 v2, 0x5

    #v2=(PosByte);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleStyleRes:I

    .line 227
    const/4 v2, 0x6

    #v2=(PosByte);
    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleStyleRes:I

    .line 228
    const/16 v2, 0xf

    #v2=(PosByte);
    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressStyle:I

    .line 229
    const/16 v2, 0x10

    #v2=(PosByte);
    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressStyle:I

    .line 232
    const/16 v2, 0x11

    #v2=(PosByte);
    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I

    .line 234
    const/16 v2, 0x12

    #v2=(PosByte);
    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    .line 236
    const/4 v2, 0x3

    #v2=(PosByte);
    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V

    .line 238
    const/16 v2, 0xd

    #v2=(PosByte);
    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v11

    .line 239
    .local v11, customNavId:I
    #v11=(Integer);
    if-eqz v11, :cond_4

    .line 240
    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p0

    invoke-virtual {v14, v11, v0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    #v2=(Reference);
    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    .line 241
    const/4 v2, 0x0

    #v2=(Null);
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    .line 242
    move-object/from16 v0, p0

    iget v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v2=(Integer);
    or-int/lit8 v2, v2, 0x10

    move-object/from16 v0, p0

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setDisplayOptions(I)V

    .line 245
    :cond_4
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    invoke-virtual {v9, v2, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v2

    #v2=(Integer);
    move-object/from16 v0, p0

    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    .line 246
    invoke-virtual {v9}, Landroid/content/res/TypedArray;->recycle()V

    .line 247
    new-instance v2, Landroid/support/v7/internal/view/menu/ActionMenuItem;

    #v2=(UninitRef);
    const/4 v4, 0x0

    #v4=(Null);
    const v5, 0x102002c

    #v5=(Integer);
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v7, 0x0

    #v7=(Null);
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    #v8=(Reference);
    move-object/from16 v3, p1

    #v3=(Reference);
    invoke-direct/range {v2 .. v8}, Landroid/support/v7/internal/view/menu/ActionMenuItem;-><init>(Landroid/content/Context;IIIILjava/lang/CharSequence;)V

    #v2=(Reference);
    move-object/from16 v0, p0

    iput-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

    .line 248
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v0, p0

    iget-object v3, v0, Landroid/support/v7/internal/widget/ActionBarView;->mUpClickListener:Landroid/view/View$OnClickListener;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 249
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setClickable(Z)V

    .line 250
    move-object/from16 v0, p0

    iget-object v2, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setFocusable(Z)V

    .line 252
    return-void

    .line 187
    .end local v11           #customNavId:I
    .end local v13           #homeResId:I
    .end local v14           #inflater:Landroid/view/LayoutInflater;
    :catch_0
    #v2=(Conflicted);v3=(PosByte);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);
    move-exception v12

    .line 188
    .local v12, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v12=(Reference);
    const-string v2, "ActionBarView"

    #v2=(Reference);
    const-string v3, "Activity component name not found!"

    #v3=(Reference);
    invoke-static {v2, v3, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_0

    .line 203
    .end local v12           #e:Landroid/content/pm/PackageManager$NameNotFoundException;
    :catch_1
    #v2=(Conflicted);v3=(Conflicted);v12=(Conflicted);
    move-exception v12

    .line 204
    .restart local v12       #e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v12=(Reference);
    const-string v2, "ActionBarView"

    #v2=(Reference);
    const-string v3, "Activity component name not found!"

    #v3=(Reference);
    invoke-static {v2, v3, v12}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto/16 :goto_1
.end method

.method static synthetic access$000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/app/ActionBar$OnNavigationListener;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCallback:Landroid/support/v7/app/ActionBar$OnNavigationListener;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1000(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/SpinnerICS;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1100(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/view/View;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$1200(Landroid/support/v7/internal/widget/ActionBarView;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$1300(Landroid/support/v7/internal/widget/ActionBarView;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 63
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initTitle()V

    return-void
.end method

.method static synthetic access$1400(Landroid/support/v7/internal/widget/ActionBarView;)I
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    #v0=(Integer);
    return v0
.end method

.method static synthetic access$200(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/view/menu/ActionMenuItem;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$500(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$600(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$700(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$800(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/widget/LinearLayout;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$900(Landroid/support/v7/internal/widget/ActionBarView;)Landroid/support/v7/internal/widget/ScrollingTabContainerView;
    .locals 1
    .parameter "x0"

    .prologue
    .line 63
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v0=(Reference);
    return-object v0
.end method

.method private configPresenters(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 4
    .parameter "builder"

    .prologue
    const/4 v3, 0x0

    #v3=(Null);
    const/4 v2, 0x1

    .line 462
    #v2=(One);
    if-eqz p1, :cond_0

    .line 463
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 464
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 471
    :goto_0
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->updateMenuView(Z)V

    .line 472
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->updateMenuView(Z)V

    .line 473
    return-void

    .line 466
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v0, v1, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 467
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-virtual {v0, v1, v3}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    goto :goto_0
.end method

.method private initTitle()V
    .locals 9

    .prologue
    const/16 v6, 0x8

    #v6=(PosByte);
    const/4 v4, 0x1

    #v4=(One);
    const/4 v5, 0x0

    .line 765
    #v5=(Null);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v3=(Reference);
    if-nez v3, :cond_4

    .line 766
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 767
    .local v1, inflater:Landroid/view/LayoutInflater;
    #v1=(Reference);
    sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_title_item:I

    #v3=(Integer);
    invoke-virtual {v1, v3, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/widget/LinearLayout;

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    .line 769
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_title:I

    #v7=(Integer);
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    .line 770
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_subtitle:I

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    .line 771
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    sget v7, Landroid/support/v7/appcompat/R$id;->up:I

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;

    .line 773
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mUpClickListener:Landroid/view/View$OnClickListener;

    #v7=(Reference);
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 775
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleStyleRes:I

    #v3=(Integer);
    if-eqz v3, :cond_0

    .line 776
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    #v3=(Reference);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    iget v8, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleStyleRes:I

    #v8=(Integer);
    invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 778
    :cond_0
    #v3=(Conflicted);v8=(Conflicted);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    #v3=(Reference);
    if-eqz v3, :cond_1

    .line 779
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 782
    :cond_1
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleStyleRes:I

    #v3=(Integer);
    if-eqz v3, :cond_2

    .line 783
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    #v3=(Reference);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    iget v8, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleStyleRes:I

    #v8=(Integer);
    invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 785
    :cond_2
    #v3=(Conflicted);v8=(Conflicted);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    #v3=(Reference);
    if-eqz v3, :cond_3

    .line 786
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 787
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setVisibility(I)V

    .line 790
    :cond_3
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v3=(Integer);
    and-int/lit8 v3, v3, 0x4

    if-eqz v3, :cond_7

    move v0, v4

    .line 791
    .local v0, homeAsUp:Z
    :goto_0
    #v0=(Boolean);
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v3, v3, 0x2

    if-eqz v3, :cond_8

    move v2, v4

    .line 792
    .local v2, showHome:Z
    :goto_1
    #v2=(Boolean);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;

    if-nez v2, :cond_a

    if-eqz v0, :cond_9

    move v3, v5

    :goto_2
    #v3=(PosByte);
    invoke-virtual {v7, v3}, Landroid/view/View;->setVisibility(I)V

    .line 793
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v3=(Reference);
    if-eqz v0, :cond_b

    if-nez v2, :cond_b

    :goto_3
    #v4=(Boolean);
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 796
    .end local v0           #homeAsUp:Z
    .end local v1           #inflater:Landroid/view/LayoutInflater;
    .end local v2           #showHome:Z
    :cond_4
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v7=(Conflicted);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 797
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    if-nez v3, :cond_5

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_6

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    #v3=(Reference);
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_6

    .line 800
    :cond_5
    #v3=(Conflicted);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v3=(Reference);
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 802
    :cond_6
    #v3=(Conflicted);
    return-void

    .restart local v1       #inflater:Landroid/view/LayoutInflater;
    :cond_7
    #v0=(Uninit);v1=(Reference);v2=(Uninit);v3=(Integer);v4=(One);v7=(Reference);
    move v0, v5

    .line 790
    #v0=(Null);
    goto :goto_0

    .restart local v0       #homeAsUp:Z
    :cond_8
    #v0=(Boolean);
    move v2, v5

    .line 791
    #v2=(Null);
    goto :goto_1

    .line 792
    .restart local v2       #showHome:Z
    :cond_9
    #v2=(Boolean);
    const/4 v3, 0x4

    #v3=(PosByte);
    goto :goto_2

    :cond_a
    #v3=(Integer);
    move v3, v6

    #v3=(PosByte);
    goto :goto_2

    :cond_b
    #v3=(Reference);
    move v4, v5

    .line 793
    #v4=(Null);
    goto :goto_3
.end method

.method private setTitleImpl(Ljava/lang/CharSequence;)V
    .locals 3
    .parameter "title"

    .prologue
    const/4 v1, 0x0

    .line 527
    #v1=(Null);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    .line 528
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    #v2=(Reference);
    if-eqz v2, :cond_1

    .line 529
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 530
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    if-nez v2, :cond_3

    iget v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v2=(Integer);
    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_3

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    #v2=(Reference);
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    #v2=(Reference);
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_3

    :cond_0
    const/4 v0, 0x1

    .line 533
    .local v0, visible:Z
    :goto_0
    #v0=(Boolean);v2=(Conflicted);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v2=(Reference);
    if-eqz v0, :cond_4

    :goto_1
    #v1=(PosByte);
    invoke-virtual {v2, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 535
    .end local v0           #visible:Z
    :cond_1
    #v0=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

    #v1=(Reference);
    if-eqz v1, :cond_2

    .line 536
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogoNavItem:Landroid/support/v7/internal/view/menu/ActionMenuItem;

    invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    .line 538
    :cond_2
    return-void

    :cond_3
    #v0=(Uninit);v1=(Null);v2=(Conflicted);
    move v0, v1

    .line 530
    #v0=(Null);
    goto :goto_0

    .line 533
    .restart local v0       #visible:Z
    :cond_4
    #v0=(Boolean);v2=(Reference);
    const/16 v1, 0x8

    #v1=(PosByte);
    goto :goto_1
.end method


# virtual methods
.method public bridge synthetic animateToVisibility(I)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->animateToVisibility(I)V

    return-void
.end method

.method public collapseActionView()V
    .locals 2

    .prologue
    .line 481
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    #v1=(Reference);
    if-nez v1, :cond_1

    const/4 v0, 0x0

    .line 483
    .local v0, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :goto_0
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 484
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->collapseActionView()Z

    .line 486
    :cond_0
    return-void

    .line 481
    .end local v0           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_1
    #v0=(Uninit);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v0, v1, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v0=(Reference);
    goto :goto_0
.end method

.method public bridge synthetic dismissPopupMenus()V
    .locals 0

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->dismissPopupMenus()V

    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .prologue
    .line 744
    new-instance v0, Landroid/support/v7/app/ActionBar$LayoutParams;

    #v0=(UninitRef);
    const/16 v1, 0x13

    #v1=(PosByte);
    invoke-direct {v0, v1}, Landroid/support/v7/app/ActionBar$LayoutParams;-><init>(I)V

    #v0=(Reference);
    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2
    .parameter "attrs"

    .prologue
    .line 1159
    new-instance v0, Landroid/support/v7/app/ActionBar$LayoutParams;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1, p1}, Landroid/support/v7/app/ActionBar$LayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    #v0=(Reference);
    return-object v0
.end method

.method public generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 0
    .parameter "lp"

    .prologue
    .line 1164
    if-nez p1, :cond_0

    .line 1165
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    .line 1167
    :cond_0
    return-object p1
.end method

.method public bridge synthetic getAnimatedVisibility()I
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getAnimatedVisibility()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public bridge synthetic getContentHeight()I
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContentHeight()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getCustomNavigationView()Landroid/view/View;
    .locals 1

    .prologue
    .line 729
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method public getDisplayOptions()I
    .locals 1

    .prologue
    .line 737
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v0=(Integer);
    return v0
.end method

.method public getDropdownAdapter()Landroid/widget/SpinnerAdapter;
    .locals 1

    .prologue
    .line 717
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

    #v0=(Reference);
    return-object v0
.end method

.method public getDropdownSelectedPosition()I
    .locals 1

    .prologue
    .line 725
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getNavigationMode()I
    .locals 1

    .prologue
    .line 733
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    #v0=(Integer);
    return v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 541
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 500
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public hasEmbeddedTabs()Z
    .locals 1

    .prologue
    .line 373
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    #v0=(Boolean);
    return v0
.end method

.method public hasExpandedActionView()Z
    .locals 1

    .prologue
    .line 476
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    if-eqz v0, :cond_0

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

.method public bridge synthetic hideOverflowMenu()Z
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->hideOverflowMenu()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public initIndeterminateProgress()V
    .locals 5

    .prologue
    .line 320
    new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    iget v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressStyle:I

    #v4=(Integer);
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    .line 322
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    sget v1, Landroid/support/v7/appcompat/R$id;->progress_circular:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setId(I)V

    .line 323
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    const/16 v1, 0x8

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 324
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 325
    return-void
.end method

.method public initProgress()V
    .locals 5

    .prologue
    .line 312
    new-instance v0, Landroid/support/v7/internal/widget/ProgressBarICS;

    #v0=(UninitRef);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    iget v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressStyle:I

    #v4=(Integer);
    invoke-direct {v0, v1, v2, v3, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    .line 313
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    sget v1, Landroid/support/v7/appcompat/R$id;->progress_horizontal:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setId(I)V

    .line 314
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    const/16 v1, 0x2710

    #v1=(PosShort);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setMax(I)V

    .line 315
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    const/16 v1, 0x8

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V

    .line 316
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 317
    return-void
.end method

.method public isCollapsed()Z
    .locals 1

    .prologue
    .line 813
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsed:Z

    #v0=(Boolean);
    return v0
.end method

.method public bridge synthetic isOverflowMenuShowing()Z
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->isOverflowMenuShowing()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public bridge synthetic isOverflowReserved()Z
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->isOverflowReserved()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isSplitActionBar()Z
    .locals 1

    .prologue
    .line 369
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitActionBar:Z

    #v0=(Boolean);
    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 3
    .parameter "newConfig"

    .prologue
    const/4 v2, 0x0

    .line 256
    #v2=(Null);
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 258
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleView:Landroid/widget/TextView;

    .line 259
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    .line 260
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;

    .line 261
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-ne v1, p0, :cond_0

    .line 262
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 264
    :cond_0
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    .line 265
    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_1

    .line 266
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initTitle()V

    .line 269
    :cond_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v1=(Reference);
    if-eqz v1, :cond_3

    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    #v1=(Boolean);
    if-eqz v1, :cond_3

    .line 270
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 271
    .local v0, lp:Landroid/view/ViewGroup$LayoutParams;
    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 272
    const/4 v1, -0x2

    #v1=(Byte);
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 273
    const/4 v1, -0x1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 275
    :cond_2
    #v1=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v1=(Reference);
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V

    .line 278
    .end local v0           #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v2=(Boolean);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    #v1=(Reference);
    if-eqz v1, :cond_4

    .line 279
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 280
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initProgress()V

    .line 282
    :cond_4
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    if-eqz v1, :cond_5

    .line 283
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 284
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initIndeterminateProgress()V

    .line 286
    :cond_5
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 299
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onDetachedFromWindow()V

    .line 300
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabSelector:Ljava/lang/Runnable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 301
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z

    .line 303
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideSubMenus()Z

    .line 305
    :cond_0
    return-void
.end method

.method protected onFinishInflate()V
    .locals 2

    .prologue
    .line 749
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onFinishInflate()V

    .line 751
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v1=(Reference);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 753
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    if-eqz v1, :cond_1

    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_1

    .line 754
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 755
    .local v0, parent:Landroid/view/ViewParent;
    #v0=(Reference);
    if-eq v0, p0, :cond_1

    .line 756
    instance-of v1, v0, Landroid/view/ViewGroup;

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 757
    check-cast v0, Landroid/view/ViewGroup;

    .end local v0           #parent:Landroid/view/ViewParent;
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 759
    :cond_0
    #v1=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v1=(Reference);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 762
    :cond_1
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 32
    .parameter "changed"
    .parameter "l"
    .parameter "t"
    .parameter "r"
    .parameter "b"

    .prologue
    .line 1015
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingLeft()I

    move-result v23

    .line 1016
    .local v23, x:I
    #v23=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v25

    .line 1017
    .local v25, y:I
    #v25=(Integer);
    sub-int v27, p5, p3

    #v27=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v28

    #v28=(Integer);
    sub-int v27, v27, v28

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I

    move-result v28

    sub-int v7, v27, v28

    .line 1019
    .local v7, contentHeight:I
    #v7=(Integer);
    if-gtz v7, :cond_1

    .line 1155
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v24=(Conflicted);v26=(Conflicted);v27=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);
    return-void

    .line 1024
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Uninit);v26=(Uninit);v27=(Integer);v29=(Uninit);v30=(Uninit);v31=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v27, v0

    #v27=(Reference);
    if-eqz v27, :cond_c

    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    .line 1025
    .local v13, homeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    :goto_1
    #v13=(Reference);
    invoke-virtual {v13}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getVisibility()I

    move-result v27

    #v27=(Integer);
    const/16 v28, 0x8

    #v28=(PosByte);
    move/from16 v0, v27

    #v0=(Integer);
    move/from16 v1, v28

    #v1=(PosByte);
    if-eq v0, v1, :cond_2

    .line 1026
    invoke-virtual {v13}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getLeftOffset()I

    move-result v14

    .line 1027
    .local v14, leftOffset:I
    #v14=(Integer);
    add-int v27, v23, v14

    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v27

    #v1=(Integer);
    move/from16 v2, v25

    #v2=(Integer);
    invoke-virtual {v0, v13, v1, v2, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I

    move-result v27

    add-int v27, v27, v14

    add-int v23, v23, v27

    .line 1030
    .end local v14           #leftOffset:I
    :cond_2
    #v0=(Conflicted);v2=(Conflicted);v14=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v27, v0

    #v27=(Reference);
    if-nez v27, :cond_4

    .line 1031
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    if-eqz v27, :cond_d

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v27

    #v27=(Integer);
    const/16 v28, 0x8

    move/from16 v0, v27

    #v0=(Integer);
    move/from16 v1, v28

    #v1=(PosByte);
    if-eq v0, v1, :cond_d

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v0=(Integer);
    move/from16 v27, v0

    and-int/lit8 v27, v27, 0x8

    if-eqz v27, :cond_d

    const/16 v20, 0x1

    .line 1034
    .local v20, showTitle:Z
    :goto_2
    #v0=(Conflicted);v1=(Integer);v20=(Boolean);v27=(Conflicted);
    if-eqz v20, :cond_3

    .line 1035
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    #v27=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    #v1=(Reference);
    move/from16 v2, v23

    #v2=(Integer);
    move/from16 v3, v25

    #v3=(Integer);
    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I

    move-result v27

    #v27=(Integer);
    add-int v23, v23, v27

    .line 1038
    :cond_3
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v27=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    #v0=(Integer);
    move/from16 v27, v0

    #v27=(Integer);
    packed-switch v27, :pswitch_data_0

    .line 1060
    .end local v20           #showTitle:Z
    :cond_4
    :goto_3
    :pswitch_0
    #v0=(Conflicted);v20=(Conflicted);v27=(Conflicted);v28=(Integer);
    sub-int v27, p4, p2

    #v27=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingRight()I

    move-result v28

    sub-int v16, v27, v28

    .line 1061
    .local v16, menuLeft:I
    #v16=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v27, v0

    #v27=(Reference);
    if-eqz v27, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v27

    move-object/from16 v0, v27

    move-object/from16 v1, p0

    #v1=(Reference);
    if-ne v0, v1, :cond_5

    .line 1062
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v27, v0

    move-object/from16 v0, p0

    move-object/from16 v1, v27

    move/from16 v2, v16

    #v2=(Integer);
    move/from16 v3, v25

    #v3=(Integer);
    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChildInverse(Landroid/view/View;III)I

    .line 1063
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getMeasuredWidth()I

    move-result v27

    #v27=(Integer);
    sub-int v16, v16, v27

    .line 1066
    :cond_5
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v27=(Conflicted);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    #v27=(Reference);
    if-eqz v27, :cond_6

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v27

    #v27=(Integer);
    const/16 v28, 0x8

    #v28=(PosByte);
    move/from16 v0, v27

    #v0=(Integer);
    move/from16 v1, v28

    #v1=(PosByte);
    if-eq v0, v1, :cond_6

    .line 1068
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    #v27=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    #v1=(Reference);
    move/from16 v2, v16

    #v2=(Integer);
    move/from16 v3, v25

    #v3=(Integer);
    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChildInverse(Landroid/view/View;III)I

    .line 1069
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredWidth()I

    move-result v27

    #v27=(Integer);
    sub-int v16, v16, v27

    .line 1072
    :cond_6
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v27=(Conflicted);v28=(Integer);
    const/4 v8, 0x0

    .line 1073
    .local v8, customView:Landroid/view/View;
    #v8=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v27, v0

    #v27=(Reference);
    if-eqz v27, :cond_10

    .line 1074
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    .line 1079
    :cond_7
    :goto_4
    #v0=(Conflicted);v8=(Reference);v27=(Conflicted);
    if-eqz v8, :cond_b

    .line 1080
    invoke-virtual {v8}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v15

    .line 1081
    .local v15, lp:Landroid/view/ViewGroup$LayoutParams;
    #v15=(Reference);
    instance-of v0, v15, Landroid/support/v7/app/ActionBar$LayoutParams;

    #v0=(Boolean);
    move/from16 v27, v0

    #v27=(Boolean);
    if-eqz v27, :cond_11

    check-cast v15, Landroid/support/v7/app/ActionBar$LayoutParams;

    .end local v15           #lp:Landroid/view/ViewGroup$LayoutParams;
    move-object v4, v15

    .line 1084
    .local v4, ablp:Landroid/support/v7/app/ActionBar$LayoutParams;
    :goto_5
    #v4=(Reference);
    if-eqz v4, :cond_12

    iget v10, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    .line 1085
    .local v10, gravity:I
    :goto_6
    #v10=(Integer);
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v17

    .line 1087
    .local v17, navWidth:I
    #v17=(Integer);
    const/16 v21, 0x0

    .line 1088
    .local v21, topMargin:I
    #v21=(Null);
    const/4 v5, 0x0

    .line 1089
    .local v5, bottomMargin:I
    #v5=(Null);
    if-eqz v4, :cond_8

    .line 1090
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->leftMargin:I

    #v0=(Integer);
    move/from16 v27, v0

    #v27=(Integer);
    add-int v23, v23, v27

    .line 1091
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->rightMargin:I

    move/from16 v27, v0

    sub-int v16, v16, v27

    .line 1092
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->topMargin:I

    move/from16 v21, v0

    .line 1093
    #v21=(Integer);
    iget v5, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->bottomMargin:I

    .line 1096
    :cond_8
    #v5=(Integer);
    and-int/lit8 v12, v10, 0x7

    .line 1098
    .local v12, hgravity:I
    #v12=(Integer);
    const/16 v27, 0x1

    #v27=(One);
    move/from16 v0, v27

    #v0=(One);
    if-ne v12, v0, :cond_14

    .line 1099
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getWidth()I

    move-result v27

    #v27=(Integer);
    sub-int v27, v27, v17

    div-int/lit8 v6, v27, 0x2

    .line 1100
    .local v6, centeredLeft:I
    #v6=(Integer);
    move/from16 v0, v23

    #v0=(Integer);
    if-ge v6, v0, :cond_13

    .line 1101
    const/4 v12, 0x3

    .line 1109
    .end local v6           #centeredLeft:I
    :cond_9
    :goto_7
    #v6=(Conflicted);
    const/16 v24, 0x0

    .line 1110
    .local v24, xpos:I
    #v24=(Null);
    packed-switch v12, :pswitch_data_1

    .line 1122
    :goto_8
    :pswitch_1
    #v24=(Integer);
    and-int/lit8 v22, v10, 0x70

    .line 1124
    .local v22, vgravity:I
    #v22=(Integer);
    const/16 v27, -0x1

    #v27=(Byte);
    move/from16 v0, v27

    #v0=(Byte);
    if-ne v10, v0, :cond_a

    .line 1125
    const/16 v22, 0x10

    .line 1128
    :cond_a
    const/16 v26, 0x0

    .line 1129
    .local v26, ypos:I
    #v26=(Null);
    sparse-switch v22, :sswitch_data_0

    .line 1143
    :goto_9
    #v18=(Conflicted);v19=(Conflicted);v26=(Integer);v27=(Integer);
    invoke-virtual {v8}, Landroid/view/View;->getMeasuredWidth()I

    move-result v9

    .line 1144
    .local v9, customWidth:I
    #v9=(Integer);
    add-int v27, v24, v9

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v28

    add-int v28, v28, v26

    move/from16 v0, v24

    #v0=(Integer);
    move/from16 v1, v26

    #v1=(Integer);
    move/from16 v2, v27

    #v2=(Integer);
    move/from16 v3, v28

    #v3=(Integer);
    invoke-virtual {v8, v0, v1, v2, v3}, Landroid/view/View;->layout(IIII)V

    .line 1146
    add-int v23, v23, v9

    .line 1149
    .end local v4           #ablp:Landroid/support/v7/app/ActionBar$LayoutParams;
    .end local v5           #bottomMargin:I
    .end local v9           #customWidth:I
    .end local v10           #gravity:I
    .end local v12           #hgravity:I
    .end local v17           #navWidth:I
    .end local v21           #topMargin:I
    .end local v22           #vgravity:I
    .end local v24           #xpos:I
    .end local v26           #ypos:I
    :cond_b
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v9=(Conflicted);v10=(Conflicted);v12=(Conflicted);v15=(Conflicted);v17=(Conflicted);v21=(Conflicted);v22=(Conflicted);v24=(Conflicted);v26=(Conflicted);v27=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    #v27=(Reference);
    if-eqz v27, :cond_0

    .line 1150
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->bringToFront()V

    .line 1151
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    invoke-virtual/range {v27 .. v27}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredHeight()I

    move-result v27

    #v27=(Integer);
    div-int/lit8 v11, v27, 0x2

    .line 1152
    .local v11, halfProgressHeight:I
    #v11=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v27, v0

    #v27=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I

    #v0=(Integer);
    move/from16 v28, v0

    neg-int v0, v11

    move/from16 v29, v0

    #v29=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I

    #v0=(Integer);
    move/from16 v30, v0

    #v30=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v31, v0

    #v31=(Reference);
    invoke-virtual/range {v31 .. v31}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredWidth()I

    move-result v31

    #v31=(Integer);
    add-int v30, v30, v31

    move-object/from16 v0, v27

    move/from16 v1, v28

    #v1=(Integer);
    move/from16 v2, v29

    #v2=(Integer);
    move/from16 v3, v30

    #v3=(Integer);
    invoke-virtual {v0, v1, v2, v3, v11}, Landroid/support/v7/internal/widget/ProgressBarICS;->layout(IIII)V

    goto/16 :goto_0

    .line 1024
    .end local v8           #customView:Landroid/view/View;
    .end local v11           #halfProgressHeight:I
    .end local v13           #homeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .end local v16           #menuLeft:I
    :cond_c
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v24=(Uninit);v26=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);
    move-object/from16 v0, p0

    iget-object v13, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v13=(Reference);
    goto/16 :goto_1

    .line 1031
    .restart local v13       #homeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    :cond_d
    #v0=(Conflicted);v1=(Integer);v2=(Conflicted);v14=(Conflicted);v27=(Conflicted);v28=(PosByte);
    const/16 v20, 0x0

    #v20=(Null);
    goto/16 :goto_2

    .line 1042
    .restart local v20       #showTitle:Z
    :pswitch_2
    #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v20=(Boolean);v27=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    #v27=(Reference);
    if-eqz v27, :cond_4

    .line 1043
    if-eqz v20, :cond_e

    .line 1044
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    #v0=(Integer);
    move/from16 v27, v0

    #v27=(Integer);
    add-int v23, v23, v27

    .line 1046
    :cond_e
    #v0=(Conflicted);v27=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v27, v0

    #v27=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    #v1=(Reference);
    move/from16 v2, v23

    #v2=(Integer);
    move/from16 v3, v25

    #v3=(Integer);
    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I

    move-result v27

    #v27=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    #v0=(Integer);
    move/from16 v28, v0

    #v28=(Integer);
    add-int v27, v27, v28

    add-int v23, v23, v27

    goto/16 :goto_3

    .line 1050
    :pswitch_3
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v28=(PosByte);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v27, v0

    #v27=(Reference);
    if-eqz v27, :cond_4

    .line 1051
    if-eqz v20, :cond_f

    .line 1052
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    #v0=(Integer);
    move/from16 v27, v0

    #v27=(Integer);
    add-int v23, v23, v27

    .line 1054
    :cond_f
    #v0=(Conflicted);v27=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v27, v0

    #v27=(Reference);
    move-object/from16 v0, p0

    move-object/from16 v1, v27

    #v1=(Reference);
    move/from16 v2, v23

    #v2=(Integer);
    move/from16 v3, v25

    #v3=(Integer);
    invoke-virtual {v0, v1, v2, v3, v7}, Landroid/support/v7/internal/widget/ActionBarView;->positionChild(Landroid/view/View;III)I

    move-result v27

    #v27=(Integer);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    #v0=(Integer);
    move/from16 v28, v0

    #v28=(Integer);
    add-int v27, v27, v28

    add-int v23, v23, v27

    goto/16 :goto_3

    .line 1075
    .end local v20           #showTitle:Z
    .restart local v8       #customView:Landroid/view/View;
    .restart local v16       #menuLeft:I
    :cond_10
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v8=(Null);v16=(Integer);v20=(Conflicted);v27=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v0=(Integer);
    move/from16 v27, v0

    #v27=(Integer);
    and-int/lit8 v27, v27, 0x10

    if-eqz v27, :cond_7

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    move-object/from16 v27, v0

    #v27=(Reference);
    if-eqz v27, :cond_7

    .line 1077
    move-object/from16 v0, p0

    iget-object v8, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v8=(Reference);
    goto/16 :goto_4

    .line 1081
    .restart local v15       #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_11
    #v0=(Boolean);v15=(Reference);v27=(Boolean);
    const/4 v4, 0x0

    #v4=(Null);
    goto/16 :goto_5

    .line 1084
    .end local v15           #lp:Landroid/view/ViewGroup$LayoutParams;
    .restart local v4       #ablp:Landroid/support/v7/app/ActionBar$LayoutParams;
    :cond_12
    #v4=(Reference);
    const/16 v10, 0x13

    #v10=(PosByte);
    goto/16 :goto_6

    .line 1102
    .restart local v5       #bottomMargin:I
    .restart local v6       #centeredLeft:I
    .restart local v10       #gravity:I
    .restart local v12       #hgravity:I
    .restart local v17       #navWidth:I
    .restart local v21       #topMargin:I
    :cond_13
    #v0=(Integer);v5=(Integer);v6=(Integer);v10=(Integer);v12=(Integer);v17=(Integer);v21=(Integer);v27=(Integer);
    add-int v27, v6, v17

    move/from16 v0, v27

    move/from16 v1, v16

    #v1=(Integer);
    if-le v0, v1, :cond_9

    .line 1103
    const/4 v12, 0x5

    #v12=(PosByte);
    goto/16 :goto_7

    .line 1105
    .end local v6           #centeredLeft:I
    :cond_14
    #v0=(One);v1=(Conflicted);v6=(Uninit);v12=(Integer);v27=(One);
    const/16 v27, -0x1

    #v27=(Byte);
    move/from16 v0, v27

    #v0=(Byte);
    if-ne v10, v0, :cond_9

    .line 1106
    const/4 v12, 0x3

    #v12=(PosByte);
    goto/16 :goto_7

    .line 1112
    .restart local v24       #xpos:I
    :pswitch_4
    #v0=(Integer);v6=(Conflicted);v12=(Integer);v24=(Null);v27=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getWidth()I

    move-result v27

    sub-int v27, v27, v17

    div-int/lit8 v24, v27, 0x2

    .line 1113
    #v24=(Integer);
    goto/16 :goto_8

    .line 1115
    :pswitch_5
    #v24=(Null);
    move/from16 v24, v23

    .line 1116
    #v24=(Integer);
    goto/16 :goto_8

    .line 1118
    :pswitch_6
    #v24=(Null);
    sub-int v24, v16, v17

    #v24=(Integer);
    goto/16 :goto_8

    .line 1131
    .restart local v22       #vgravity:I
    .restart local v26       #ypos:I
    :sswitch_0
    #v0=(Byte);v22=(Integer);v26=(Null);v27=(Byte);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v19

    .line 1132
    .local v19, paddedTop:I
    #v19=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getHeight()I

    move-result v27

    #v27=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I

    move-result v28

    sub-int v18, v27, v28

    .line 1133
    .local v18, paddedBottom:I
    #v18=(Integer);
    sub-int v27, v18, v19

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v28

    sub-int v27, v27, v28

    div-int/lit8 v26, v27, 0x2

    .line 1134
    #v26=(Integer);
    goto/16 :goto_9

    .line 1136
    .end local v18           #paddedBottom:I
    .end local v19           #paddedTop:I
    :sswitch_1
    #v18=(Uninit);v19=(Uninit);v26=(Null);v27=(Byte);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v27

    #v27=(Integer);
    add-int v26, v27, v21

    .line 1137
    #v26=(Integer);
    goto/16 :goto_9

    .line 1139
    :sswitch_2
    #v26=(Null);v27=(Byte);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getHeight()I

    move-result v27

    #v27=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I

    move-result v28

    sub-int v27, v27, v28

    invoke-virtual {v8}, Landroid/view/View;->getMeasuredHeight()I

    move-result v28

    sub-int v27, v27, v28

    sub-int v26, v27, v5

    #v26=(Integer);
    goto/16 :goto_9

    .line 1038
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);v27=(Unknown);v28=(Unknown);v29=(Unknown);v30=(Unknown);v31=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch

    .line 1110
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_4
        :pswitch_1
        :pswitch_5
        :pswitch_1
        :pswitch_6
    .end packed-switch

    .line 1129
    :sswitch_data_0
    .sparse-switch
        0x10 -> :sswitch_0
        0x30 -> :sswitch_1
        0x50 -> :sswitch_2
    .end sparse-switch
.end method

.method protected onMeasure(II)V
    .locals 44
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 818
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getChildCount()I

    move-result v7

    .line 819
    .local v7, childCount:I
    #v7=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsable:Z

    #v0=(Boolean);
    move/from16 v40, v0

    #v40=(Boolean);
    if-eqz v40, :cond_4

    .line 820
    const/16 v38, 0x0

    .line 821
    .local v38, visibleChildren:I
    #v38=(Null);
    const/16 v22, 0x0

    .local v22, i:I
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v6=(Conflicted);v22=(Integer);v38=(Integer);v40=(Conflicted);v41=(Conflicted);
    move/from16 v0, v22

    #v0=(Integer);
    if-ge v0, v7, :cond_2

    .line 822
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v22

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->getChildAt(I)Landroid/view/View;

    move-result-object v6

    .line 823
    .local v6, child:Landroid/view/View;
    #v6=(Reference);
    invoke-virtual {v6}, Landroid/view/View;->getVisibility()I

    move-result v40

    #v40=(Integer);
    const/16 v41, 0x8

    #v41=(PosByte);
    move/from16 v0, v40

    #v0=(Integer);
    move/from16 v1, v41

    #v1=(PosByte);
    if-eq v0, v1, :cond_1

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    #v40=(Reference);
    move-object/from16 v0, v40

    if-ne v6, v0, :cond_0

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getChildCount()I

    move-result v40

    #v40=(Integer);
    if-eqz v40, :cond_1

    .line 825
    :cond_0
    #v40=(Conflicted);
    add-int/lit8 v38, v38, 0x1

    .line 821
    :cond_1
    #v0=(Conflicted);
    add-int/lit8 v22, v22, 0x1

    goto :goto_0

    .line 829
    .end local v6           #child:Landroid/view/View;
    :cond_2
    #v0=(Integer);v1=(Conflicted);v6=(Conflicted);v41=(Conflicted);
    if-nez v38, :cond_4

    .line 831
    const/16 v40, 0x0

    #v40=(Null);
    const/16 v41, 0x0

    #v41=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v40

    #v1=(Null);
    move/from16 v2, v41

    #v2=(Null);
    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->setMeasuredDimension(II)V

    .line 832
    const/16 v40, 0x1

    #v40=(One);
    move/from16 v0, v40

    #v0=(One);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsed:Z

    .line 1011
    .end local v22           #i:I
    .end local v38           #visibleChildren:I
    :cond_3
    :goto_1
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v14=(Conflicted);v15=(Conflicted);v16=(Conflicted);v17=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v21=(Conflicted);v22=(Conflicted);v23=(Conflicted);v24=(Conflicted);v25=(Conflicted);v26=(Conflicted);v27=(Conflicted);v28=(Conflicted);v29=(Conflicted);v30=(Conflicted);v31=(Conflicted);v32=(Conflicted);v33=(Conflicted);v34=(Conflicted);v35=(Conflicted);v36=(Conflicted);v37=(Conflicted);v38=(Conflicted);v39=(Conflicted);v40=(Conflicted);v41=(Integer);v42=(Conflicted);v43=(Conflicted);
    return-void

    .line 836
    :cond_4
    #v0=(Integer);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Uninit);v39=(Uninit);v41=(Conflicted);v42=(Uninit);v43=(Uninit);
    const/16 v40, 0x0

    #v40=(Null);
    move/from16 v0, v40

    #v0=(Null);
    move-object/from16 v1, p0

    #v1=(Reference);
    iput-boolean v0, v1, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsed:Z

    .line 838
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v39

    .line 839
    .local v39, widthMode:I
    #v39=(Integer);
    const/high16 v40, 0x4000

    #v40=(Integer);
    move/from16 v0, v39

    #v0=(Integer);
    move/from16 v1, v40

    #v1=(Integer);
    if-eq v0, v1, :cond_5

    .line 840
    new-instance v40, Ljava/lang/IllegalStateException;

    #v40=(UninitRef);
    new-instance v41, Ljava/lang/StringBuilder;

    #v41=(UninitRef);
    invoke-direct/range {v41 .. v41}, Ljava/lang/StringBuilder;-><init>()V

    #v41=(Reference);
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v42

    #v42=(Reference);
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v42

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    const-string v42, " can only be used "

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    const-string v42, "with android:layout_width=\"MATCH_PARENT\" (or fill_parent)"

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    invoke-virtual/range {v41 .. v41}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v41

    invoke-direct/range {v40 .. v41}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v40=(Reference);
    throw v40

    .line 844
    :cond_5
    #v40=(Integer);v41=(Conflicted);v42=(Uninit);
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v16

    .line 845
    .local v16, heightMode:I
    #v16=(Integer);
    const/high16 v40, -0x8000

    move/from16 v0, v16

    move/from16 v1, v40

    if-eq v0, v1, :cond_6

    .line 846
    new-instance v40, Ljava/lang/IllegalStateException;

    #v40=(UninitRef);
    new-instance v41, Ljava/lang/StringBuilder;

    #v41=(UninitRef);
    invoke-direct/range {v41 .. v41}, Ljava/lang/StringBuilder;-><init>()V

    #v41=(Reference);
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v42

    #v42=(Reference);
    invoke-virtual/range {v42 .. v42}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v42

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    const-string v42, " can only be used "

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    const-string v42, "with android:layout_height=\"wrap_content\""

    invoke-virtual/range {v41 .. v42}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v41

    invoke-virtual/range {v41 .. v41}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v41

    invoke-direct/range {v40 .. v41}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v40=(Reference);
    throw v40

    .line 850
    :cond_6
    #v40=(Integer);v41=(Conflicted);v42=(Uninit);
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v9

    .line 852
    .local v9, contentWidth:I
    #v9=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    #v0=(Integer);
    move/from16 v40, v0

    if-lez v40, :cond_12

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    #v0=(Integer);
    move/from16 v27, v0

    .line 855
    .local v27, maxHeight:I
    :goto_2
    #v27=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingTop()I

    move-result v40

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingBottom()I

    move-result v41

    #v41=(Integer);
    add-int v37, v40, v41

    .line 856
    .local v37, verticalPadding:I
    #v37=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingLeft()I

    move-result v30

    .line 857
    .local v30, paddingLeft:I
    #v30=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getPaddingRight()I

    move-result v31

    .line 858
    .local v31, paddingRight:I
    #v31=(Integer);
    sub-int v15, v27, v37

    .line 859
    .local v15, height:I
    #v15=(Integer);
    const/high16 v40, -0x8000

    move/from16 v0, v40

    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v8

    .line 861
    .local v8, childSpecHeight:I
    #v8=(Integer);
    sub-int v40, v9, v30

    sub-int v5, v40, v31

    .line 862
    .local v5, availableWidth:I
    #v5=(Integer);
    div-int/lit8 v24, v5, 0x2

    .line 863
    .local v24, leftOfCenter:I
    #v24=(Integer);
    move/from16 v32, v24

    .line 865
    .local v32, rightOfCenter:I
    #v32=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-eqz v40, :cond_13

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v18, v0

    .line 867
    .local v18, homeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    :goto_3
    #v18=(Reference);
    invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getVisibility()I

    move-result v40

    #v40=(Integer);
    const/16 v41, 0x8

    #v41=(PosByte);
    move/from16 v0, v40

    #v0=(Integer);
    move/from16 v1, v41

    #v1=(PosByte);
    if-eq v0, v1, :cond_7

    .line 868
    invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v26

    .line 870
    .local v26, lp:Landroid/view/ViewGroup$LayoutParams;
    #v26=(Reference);
    move-object/from16 v0, v26

    #v0=(Reference);
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v40, v0

    if-gez v40, :cond_14

    .line 871
    const/high16 v40, -0x8000

    move/from16 v0, v40

    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .line 875
    .local v20, homeWidthSpec:I
    :goto_4
    #v20=(Integer);v41=(Integer);
    const/high16 v40, 0x4000

    move/from16 v0, v40

    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v40

    move-object/from16 v0, v18

    #v0=(Reference);
    move/from16 v1, v20

    #v1=(Integer);
    move/from16 v2, v40

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->measure(II)V

    .line 877
    invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getMeasuredWidth()I

    move-result v40

    invoke-virtual/range {v18 .. v18}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->getLeftOffset()I

    move-result v41

    add-int v19, v40, v41

    .line 878
    .local v19, homeWidth:I
    #v19=(Integer);
    const/16 v40, 0x0

    #v40=(Null);
    sub-int v41, v5, v19

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 879
    const/16 v40, 0x0

    sub-int v41, v5, v19

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 882
    .end local v19           #homeWidth:I
    .end local v20           #homeWidthSpec:I
    .end local v26           #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_7
    #v0=(Conflicted);v2=(Conflicted);v19=(Conflicted);v20=(Conflicted);v26=(Conflicted);v40=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-eqz v40, :cond_8

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v40

    move-object/from16 v0, v40

    move-object/from16 v1, p0

    #v1=(Reference);
    if-ne v0, v1, :cond_8

    .line 883
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v40, v0

    const/16 v41, 0x0

    #v41=(Null);
    move-object/from16 v0, p0

    move-object/from16 v1, v40

    move/from16 v2, v41

    #v2=(Null);
    invoke-virtual {v0, v1, v5, v8, v2}, Landroid/support/v7/internal/widget/ActionBarView;->measureChildView(Landroid/view/View;III)I

    move-result v5

    .line 885
    const/16 v40, 0x0

    #v40=(Null);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v41, v0

    #v41=(Reference);
    invoke-virtual/range {v41 .. v41}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getMeasuredWidth()I

    move-result v41

    #v41=(Integer);
    sub-int v41, v32, v41

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v32

    .line 888
    :cond_8
    #v1=(Conflicted);v2=(Conflicted);v40=(Reference);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    if-eqz v40, :cond_9

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v40

    #v40=(Integer);
    const/16 v41, 0x8

    #v41=(PosByte);
    move/from16 v0, v40

    #v0=(Integer);
    move/from16 v1, v41

    #v1=(PosByte);
    if-eq v0, v1, :cond_9

    .line 890
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    #v40=(Reference);
    const/16 v41, 0x0

    #v41=(Null);
    move-object/from16 v0, p0

    move-object/from16 v1, v40

    #v1=(Reference);
    move/from16 v2, v41

    #v2=(Null);
    invoke-virtual {v0, v1, v5, v8, v2}, Landroid/support/v7/internal/widget/ActionBarView;->measureChildView(Landroid/view/View;III)I

    move-result v5

    .line 892
    const/16 v40, 0x0

    #v40=(Null);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mIndeterminateProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v41, v0

    #v41=(Reference);
    invoke-virtual/range {v41 .. v41}, Landroid/support/v7/internal/widget/ProgressBarICS;->getMeasuredWidth()I

    move-result v41

    #v41=(Integer);
    sub-int v41, v32, v41

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v32

    .line 896
    :cond_9
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v40=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-eqz v40, :cond_15

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v40

    #v40=(Integer);
    const/16 v41, 0x8

    #v41=(PosByte);
    move/from16 v0, v40

    #v0=(Integer);
    move/from16 v1, v41

    #v1=(PosByte);
    if-eq v0, v1, :cond_15

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v0=(Integer);
    move/from16 v40, v0

    and-int/lit8 v40, v40, 0x8

    if-eqz v40, :cond_15

    const/16 v33, 0x1

    .line 899
    .local v33, showTitle:Z
    :goto_5
    #v0=(Conflicted);v1=(Conflicted);v33=(Boolean);v40=(Conflicted);v41=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-nez v40, :cond_a

    .line 900
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    packed-switch v40, :pswitch_data_0

    .line 930
    :cond_a
    :goto_6
    #v0=(Conflicted);v23=(Conflicted);v25=(Conflicted);v34=(Conflicted);v40=(Conflicted);v42=(Conflicted);
    const/4 v14, 0x0

    .line 931
    .local v14, customView:Landroid/view/View;
    #v14=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-eqz v40, :cond_18

    .line 932
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    .line 938
    :cond_b
    :goto_7
    #v0=(Conflicted);v14=(Reference);v40=(Conflicted);
    if-eqz v14, :cond_f

    .line 939
    invoke-virtual {v14}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v40

    #v40=(Reference);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v40

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    move-result-object v26

    .line 940
    .restart local v26       #lp:Landroid/view/ViewGroup$LayoutParams;
    #v26=(Reference);
    move-object/from16 v0, v26

    instance-of v0, v0, Landroid/support/v7/app/ActionBar$LayoutParams;

    #v0=(Boolean);
    move/from16 v40, v0

    #v40=(Boolean);
    if-eqz v40, :cond_19

    move-object/from16 v40, v26

    #v40=(Reference);
    check-cast v40, Landroid/support/v7/app/ActionBar$LayoutParams;

    move-object/from16 v4, v40

    .line 943
    .local v4, ablp:Landroid/support/v7/app/ActionBar$LayoutParams;
    :goto_8
    #v4=(Reference);v40=(Conflicted);
    const/16 v21, 0x0

    .line 944
    .local v21, horizontalMargin:I
    #v21=(Null);
    const/16 v36, 0x0

    .line 945
    .local v36, verticalMargin:I
    #v36=(Null);
    if-eqz v4, :cond_c

    .line 946
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->leftMargin:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->rightMargin:I

    move/from16 v41, v0

    add-int v21, v40, v41

    .line 947
    #v21=(Integer);
    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->topMargin:I

    move/from16 v40, v0

    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->bottomMargin:I

    move/from16 v41, v0

    add-int v36, v40, v41

    .line 953
    :cond_c
    #v36=(Integer);v40=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    if-gtz v40, :cond_1a

    .line 954
    const/high16 v11, -0x8000

    .line 959
    .local v11, customNavHeightMode:I
    :goto_9
    #v1=(Conflicted);v11=(Integer);
    const/16 v40, 0x0

    #v40=(Null);
    move-object/from16 v0, v26

    #v0=(Reference);
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v41, v0

    if-ltz v41, :cond_d

    move-object/from16 v0, v26

    #v0=(Reference);
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v41, v0

    move/from16 v0, v41

    invoke-static {v0, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    .end local v15           #height:I
    :cond_d
    sub-int v41, v15, v36

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v10

    .line 962
    .local v10, customNavHeight:I
    #v10=(Integer);
    move-object/from16 v0, v26

    #v0=(Reference);
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    const/16 v41, -0x2

    #v41=(Byte);
    move/from16 v0, v40

    move/from16 v1, v41

    #v1=(Byte);
    if-eq v0, v1, :cond_1c

    const/high16 v13, 0x4000

    .line 964
    .local v13, customNavWidthMode:I
    :goto_a
    #v13=(Integer);
    const/16 v41, 0x0

    #v41=(Null);
    move-object/from16 v0, v26

    #v0=(Reference);
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v40, v0

    if-ltz v40, :cond_1d

    move-object/from16 v0, v26

    #v0=(Reference);
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v40, v0

    move/from16 v0, v40

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v40

    :goto_b
    sub-int v40, v40, v21

    move/from16 v0, v41

    #v0=(Null);
    move/from16 v1, v40

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v12

    .line 967
    .local v12, customNavWidth:I
    #v12=(Integer);
    if-eqz v4, :cond_1e

    iget v0, v4, Landroid/support/v7/app/ActionBar$LayoutParams;->gravity:I

    #v0=(Integer);
    move/from16 v40, v0

    :goto_c
    and-int/lit8 v17, v40, 0x7

    .line 972
    .local v17, hgrav:I
    #v17=(Integer);
    const/16 v40, 0x1

    #v40=(One);
    move/from16 v0, v17

    move/from16 v1, v40

    #v1=(One);
    if-ne v0, v1, :cond_e

    move-object/from16 v0, v26

    #v0=(Reference);
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    const/16 v41, -0x1

    #v41=(Byte);
    move/from16 v0, v40

    move/from16 v1, v41

    #v1=(Byte);
    if-ne v0, v1, :cond_e

    .line 973
    move/from16 v0, v24

    move/from16 v1, v32

    #v1=(Integer);
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v40

    mul-int/lit8 v12, v40, 0x2

    .line 976
    :cond_e
    invoke-static {v12, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v40

    invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    #v41=(Integer);
    move/from16 v0, v40

    move/from16 v1, v41

    invoke-virtual {v14, v0, v1}, Landroid/view/View;->measure(II)V

    .line 979
    invoke-virtual {v14}, Landroid/view/View;->getMeasuredWidth()I

    move-result v40

    add-int v40, v40, v21

    sub-int v5, v5, v40

    .line 982
    .end local v4           #ablp:Landroid/support/v7/app/ActionBar$LayoutParams;
    .end local v10           #customNavHeight:I
    .end local v11           #customNavHeightMode:I
    .end local v12           #customNavWidth:I
    .end local v13           #customNavWidthMode:I
    .end local v17           #hgrav:I
    .end local v21           #horizontalMargin:I
    .end local v26           #lp:Landroid/view/ViewGroup$LayoutParams;
    .end local v36           #verticalMargin:I
    :cond_f
    #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v17=(Conflicted);v21=(Conflicted);v26=(Conflicted);v36=(Conflicted);v40=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-nez v40, :cond_10

    if-eqz v33, :cond_10

    .line 983
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    #v0=(Integer);
    move/from16 v41, v0

    const/high16 v42, 0x4000

    #v42=(Integer);
    invoke-static/range {v41 .. v42}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    const/16 v42, 0x0

    #v42=(Null);
    move-object/from16 v0, p0

    #v0=(Reference);
    move-object/from16 v1, v40

    #v1=(Reference);
    move/from16 v2, v41

    #v2=(Integer);
    move/from16 v3, v42

    #v3=(Null);
    invoke-virtual {v0, v1, v5, v2, v3}, Landroid/support/v7/internal/widget/ActionBarView;->measureChildView(Landroid/view/View;III)I

    move-result v5

    .line 985
    const/16 v40, 0x0

    #v40=(Null);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v41, v0

    #v41=(Reference);
    invoke-virtual/range {v41 .. v41}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v41

    #v41=(Integer);
    sub-int v41, v24, v41

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 988
    :cond_10
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v40=(Reference);v42=(Conflicted);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContentHeight:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    if-gtz v40, :cond_21

    .line 989
    const/16 v28, 0x0

    .line 990
    .local v28, measuredHeight:I
    #v28=(Null);
    const/16 v22, 0x0

    .restart local v22       #i:I
    :goto_d
    #v22=(Integer);v28=(Integer);v29=(Conflicted);v35=(Conflicted);
    move/from16 v0, v22

    if-ge v0, v7, :cond_1f

    .line 991
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v22

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->getChildAt(I)Landroid/view/View;

    move-result-object v35

    .line 992
    .local v35, v:Landroid/view/View;
    #v35=(Reference);
    invoke-virtual/range {v35 .. v35}, Landroid/view/View;->getMeasuredHeight()I

    move-result v40

    add-int v29, v40, v37

    .line 993
    .local v29, paddedViewHeight:I
    #v29=(Integer);
    move/from16 v0, v29

    #v0=(Integer);
    move/from16 v1, v28

    if-le v0, v1, :cond_11

    .line 994
    move/from16 v28, v29

    .line 990
    :cond_11
    add-int/lit8 v22, v22, 0x1

    goto :goto_d

    .line 852
    .end local v5           #availableWidth:I
    .end local v8           #childSpecHeight:I
    .end local v14           #customView:Landroid/view/View;
    .end local v18           #homeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .end local v22           #i:I
    .end local v24           #leftOfCenter:I
    .end local v27           #maxHeight:I
    .end local v28           #measuredHeight:I
    .end local v29           #paddedViewHeight:I
    .end local v30           #paddingLeft:I
    .end local v31           #paddingRight:I
    .end local v32           #rightOfCenter:I
    .end local v33           #showTitle:Z
    .end local v35           #v:Landroid/view/View;
    .end local v37           #verticalPadding:I
    :cond_12
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Conflicted);v23=(Uninit);v24=(Uninit);v25=(Uninit);v26=(Uninit);v27=(Uninit);v28=(Uninit);v29=(Uninit);v30=(Uninit);v31=(Uninit);v32=(Uninit);v33=(Uninit);v34=(Uninit);v35=(Uninit);v36=(Uninit);v37=(Uninit);v41=(Conflicted);v42=(Uninit);
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v27

    #v27=(Integer);
    goto/16 :goto_2

    .line 865
    .restart local v5       #availableWidth:I
    .restart local v8       #childSpecHeight:I
    .restart local v15       #height:I
    .restart local v24       #leftOfCenter:I
    .restart local v27       #maxHeight:I
    .restart local v30       #paddingLeft:I
    .restart local v31       #paddingRight:I
    .restart local v32       #rightOfCenter:I
    .restart local v37       #verticalPadding:I
    :cond_13
    #v0=(Reference);v5=(Integer);v8=(Integer);v15=(Integer);v24=(Integer);v30=(Integer);v31=(Integer);v32=(Integer);v37=(Integer);v40=(Reference);v41=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    move-object/from16 v18, v0

    #v18=(Reference);
    goto/16 :goto_3

    .line 873
    .restart local v18       #homeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;
    .restart local v26       #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_14
    #v0=(Integer);v1=(PosByte);v26=(Reference);v40=(Integer);v41=(PosByte);
    move-object/from16 v0, v26

    #v0=(Reference);
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v40, v0

    const/high16 v41, 0x4000

    #v41=(Integer);
    invoke-static/range {v40 .. v41}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .restart local v20       #homeWidthSpec:I
    #v20=(Integer);
    goto/16 :goto_4

    .line 896
    .end local v20           #homeWidthSpec:I
    .end local v26           #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_15
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v19=(Conflicted);v20=(Conflicted);v26=(Conflicted);v40=(Conflicted);
    const/16 v33, 0x0

    #v33=(Null);
    goto/16 :goto_5

    .line 902
    .restart local v33       #showTitle:Z
    :pswitch_0
    #v0=(Integer);v33=(Boolean);v40=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-eqz v40, :cond_a

    .line 903
    if-eqz v33, :cond_16

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    mul-int/lit8 v23, v40, 0x2

    .line 904
    .local v23, itemPaddingSize:I
    :goto_e
    #v23=(Integer);v40=(Conflicted);
    const/16 v40, 0x0

    #v40=(Null);
    sub-int v41, v5, v23

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 905
    const/16 v40, 0x0

    sub-int v41, v24, v23

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 906
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    #v40=(Reference);
    const/high16 v41, -0x8000

    move/from16 v0, v41

    #v0=(Integer);
    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    const/high16 v42, 0x4000

    #v42=(Integer);
    move/from16 v0, v42

    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v42

    invoke-virtual/range {v40 .. v42}, Landroid/widget/LinearLayout;->measure(II)V

    .line 909
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v25

    .line 910
    .local v25, listNavWidth:I
    #v25=(Integer);
    const/16 v40, 0x0

    #v40=(Null);
    sub-int v41, v5, v25

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 911
    const/16 v40, 0x0

    sub-int v41, v24, v25

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 912
    goto/16 :goto_6

    .line 903
    .end local v23           #itemPaddingSize:I
    .end local v25           #listNavWidth:I
    :cond_16
    #v23=(Uninit);v25=(Uninit);v40=(Reference);v42=(Uninit);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    goto :goto_e

    .line 915
    :pswitch_1
    #v23=(Uninit);v40=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-eqz v40, :cond_a

    .line 916
    if-eqz v33, :cond_17

    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    mul-int/lit8 v23, v40, 0x2

    .line 917
    .restart local v23       #itemPaddingSize:I
    :goto_f
    #v23=(Integer);v40=(Conflicted);
    const/16 v40, 0x0

    #v40=(Null);
    sub-int v41, v5, v23

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 918
    const/16 v40, 0x0

    sub-int v41, v24, v23

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    .line 919
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v40, v0

    #v40=(Reference);
    const/high16 v41, -0x8000

    move/from16 v0, v41

    #v0=(Integer);
    invoke-static {v5, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    const/high16 v42, 0x4000

    #v42=(Integer);
    move/from16 v0, v42

    invoke-static {v15, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v42

    invoke-virtual/range {v40 .. v42}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->measure(II)V

    .line 922
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getMeasuredWidth()I

    move-result v34

    .line 923
    .local v34, tabWidth:I
    #v34=(Integer);
    const/16 v40, 0x0

    #v40=(Null);
    sub-int v41, v5, v34

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v5

    .line 924
    const/16 v40, 0x0

    sub-int v41, v24, v34

    invoke-static/range {v40 .. v41}, Ljava/lang/Math;->max(II)I

    move-result v24

    goto/16 :goto_6

    .line 916
    .end local v23           #itemPaddingSize:I
    .end local v34           #tabWidth:I
    :cond_17
    #v23=(Uninit);v34=(Uninit);v40=(Reference);v42=(Uninit);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mItemPadding:I

    #v0=(Integer);
    move/from16 v23, v0

    #v23=(Integer);
    goto :goto_f

    .line 933
    .restart local v14       #customView:Landroid/view/View;
    :cond_18
    #v0=(Reference);v14=(Null);v23=(Conflicted);v25=(Conflicted);v34=(Conflicted);v42=(Conflicted);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v0=(Integer);
    move/from16 v40, v0

    #v40=(Integer);
    and-int/lit8 v40, v40, 0x10

    if-eqz v40, :cond_b

    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-eqz v40, :cond_b

    .line 935
    move-object/from16 v0, p0

    iget-object v14, v0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v14=(Reference);
    goto/16 :goto_7

    .line 940
    .restart local v26       #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_19
    #v0=(Boolean);v1=(Reference);v26=(Reference);v40=(Boolean);
    const/4 v4, 0x0

    #v4=(Null);
    goto/16 :goto_8

    .line 956
    .restart local v4       #ablp:Landroid/support/v7/app/ActionBar$LayoutParams;
    .restart local v21       #horizontalMargin:I
    .restart local v36       #verticalMargin:I
    :cond_1a
    #v0=(Integer);v4=(Reference);v21=(Integer);v36=(Integer);v40=(Integer);
    move-object/from16 v0, v26

    #v0=(Reference);
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    #v0=(Integer);
    move/from16 v40, v0

    const/16 v41, -0x2

    #v41=(Byte);
    move/from16 v0, v40

    move/from16 v1, v41

    #v1=(Byte);
    if-eq v0, v1, :cond_1b

    const/high16 v11, 0x4000

    .restart local v11       #customNavHeightMode:I
    :goto_10
    #v11=(Integer);
    goto/16 :goto_9

    .end local v11           #customNavHeightMode:I
    :cond_1b
    #v11=(Uninit);
    const/high16 v11, -0x8000

    #v11=(Integer);
    goto :goto_10

    .line 962
    .end local v15           #height:I
    .restart local v10       #customNavHeight:I
    .restart local v11       #customNavHeightMode:I
    :cond_1c
    #v10=(Integer);
    const/high16 v13, -0x8000

    #v13=(Integer);
    goto/16 :goto_a

    .restart local v13       #customNavWidthMode:I
    :cond_1d
    #v41=(Null);
    move/from16 v40, v5

    .line 964
    goto/16 :goto_b

    .line 967
    .restart local v12       #customNavWidth:I
    :cond_1e
    #v0=(Null);v1=(Integer);v12=(Integer);
    const/16 v40, 0x13

    #v40=(PosByte);
    goto/16 :goto_c

    .line 997
    .end local v4           #ablp:Landroid/support/v7/app/ActionBar$LayoutParams;
    .end local v10           #customNavHeight:I
    .end local v11           #customNavHeightMode:I
    .end local v12           #customNavWidth:I
    .end local v13           #customNavWidthMode:I
    .end local v21           #horizontalMargin:I
    .end local v26           #lp:Landroid/view/ViewGroup$LayoutParams;
    .end local v36           #verticalMargin:I
    .restart local v22       #i:I
    .restart local v28       #measuredHeight:I
    :cond_1f
    #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);v13=(Conflicted);v17=(Conflicted);v21=(Conflicted);v22=(Integer);v26=(Conflicted);v28=(Integer);v29=(Conflicted);v35=(Conflicted);v36=(Conflicted);v40=(Integer);v41=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v28

    #v1=(Integer);
    invoke-virtual {v0, v9, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setMeasuredDimension(II)V

    .line 1002
    .end local v22           #i:I
    .end local v28           #measuredHeight:I
    :goto_11
    #v22=(Conflicted);v28=(Conflicted);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    move-object/from16 v40, v0

    #v40=(Reference);
    if-eqz v40, :cond_20

    .line 1003
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    move-object/from16 v40, v0

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getMeasuredHeight()I

    move-result v41

    invoke-virtual/range {v40 .. v41}, Landroid/support/v7/internal/widget/ActionBarContextView;->setContentHeight(I)V

    .line 1006
    :cond_20
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    if-eqz v40, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    invoke-virtual/range {v40 .. v40}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I

    move-result v40

    #v40=(Integer);
    const/16 v41, 0x8

    #v41=(PosByte);
    move/from16 v0, v40

    #v0=(Integer);
    move/from16 v1, v41

    #v1=(PosByte);
    if-eq v0, v1, :cond_3

    .line 1007
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressView:Landroid/support/v7/internal/widget/ProgressBarICS;

    move-object/from16 v40, v0

    #v40=(Reference);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarView;->mProgressBarPadding:I

    #v0=(Integer);
    move/from16 v41, v0

    #v41=(Integer);
    mul-int/lit8 v41, v41, 0x2

    sub-int v41, v9, v41

    const/high16 v42, 0x4000

    #v42=(Integer);
    invoke-static/range {v41 .. v42}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v41

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarView;->getMeasuredHeight()I

    move-result v42

    const/high16 v43, -0x8000

    #v43=(Integer);
    invoke-static/range {v42 .. v43}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v42

    invoke-virtual/range {v40 .. v42}, Landroid/support/v7/internal/widget/ProgressBarICS;->measure(II)V

    goto/16 :goto_1

    .line 999
    :cond_21
    #v1=(Conflicted);v28=(Uninit);v29=(Uninit);v35=(Uninit);v40=(Integer);v42=(Conflicted);v43=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v27

    #v1=(Integer);
    invoke-virtual {v0, v9, v1}, Landroid/support/v7/internal/widget/ActionBarView;->setMeasuredDimension(II)V

    goto :goto_11

    .line 900
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);v10=(Unknown);v11=(Unknown);v12=(Unknown);v13=(Unknown);v14=(Unknown);v15=(Unknown);v16=(Unknown);v17=(Unknown);v18=(Unknown);v19=(Unknown);v20=(Unknown);v21=(Unknown);v22=(Unknown);v23=(Unknown);v24=(Unknown);v25=(Unknown);v26=(Unknown);v27=(Unknown);v28=(Unknown);v29=(Unknown);v30=(Unknown);v31=(Unknown);v32=(Unknown);v33=(Unknown);v34=(Unknown);v35=(Unknown);v36=(Unknown);v37=(Unknown);v38=(Unknown);v39=(Unknown);v40=(Unknown);v41=(Unknown);v42=(Unknown);v43=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 4
    .parameter "p"

    .prologue
    .line 1186
    move-object v1, p1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;

    .line 1188
    .local v1, state:Landroid/support/v7/internal/widget/ActionBarView$SavedState;
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->getSuperState()Landroid/os/Parcelable;

    move-result-object v2

    #v2=(Reference);
    invoke-super {p0, v2}, Landroid/support/v7/internal/widget/AbsActionBarView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 1190
    iget v2, v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I

    #v2=(Integer);
    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v2, :cond_0

    .line 1192
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget v3, v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/internal/view/SupportMenuItem;

    .line 1194
    .local v0, item:Landroid/support/v4/internal/view/SupportMenuItem;
    if-eqz v0, :cond_0

    .line 1195
    invoke-interface {v0}, Landroid/support/v4/internal/view/SupportMenuItem;->expandActionView()Z

    .line 1199
    .end local v0           #item:Landroid/support/v4/internal/view/SupportMenuItem;
    :cond_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    iget-boolean v2, v1, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 1200
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->postShowOverflowMenu()V

    .line 1202
    :cond_1
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 3

    .prologue
    .line 1172
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v1

    .line 1173
    .local v1, superState:Landroid/os/Parcelable;
    #v1=(Reference);
    new-instance v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;

    #v0=(UninitRef);
    invoke-direct {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$SavedState;-><init>(Landroid/os/Parcelable;)V

    .line 1175
    .local v0, state:Landroid/support/v7/internal/widget/ActionBarView$SavedState;
    #v0=(Reference);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v2, v2, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    if-eqz v2, :cond_0

    .line 1176
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    iget-object v2, v2, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;->mCurrentExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getItemId()I

    move-result v2

    #v2=(Integer);
    iput v2, v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->expandedMenuItemId:I

    .line 1179
    :cond_0
    #v2=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->isOverflowMenuShowing()Z

    move-result v2

    #v2=(Boolean);
    iput-boolean v2, v0, Landroid/support/v7/internal/widget/ActionBarView$SavedState;->isOverflowOpen:Z

    .line 1181
    return-object v0
.end method

.method public bridge synthetic postShowOverflowMenu()V
    .locals 0

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->postShowOverflowMenu()V

    return-void
.end method

.method public setCallback(Landroid/support/v7/app/ActionBar$OnNavigationListener;)V
    .locals 0
    .parameter "callback"

    .prologue
    .line 392
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCallback:Landroid/support/v7/app/ActionBar$OnNavigationListener;

    .line 393
    return-void
.end method

.method public setCollapsable(Z)V
    .locals 0
    .parameter "collapsable"

    .prologue
    .line 809
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIsCollapsable:Z

    .line 810
    return-void
.end method

.method public bridge synthetic setContentHeight(I)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setContentHeight(I)V

    return-void
.end method

.method public setContextView(Landroid/support/v7/internal/widget/ActionBarContextView;)V
    .locals 0
    .parameter "view"

    .prologue
    .line 805
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContextView:Landroid/support/v7/internal/widget/ActionBarContextView;

    .line 806
    return-void
.end method

.method public setCustomNavigationView(Landroid/view/View;)V
    .locals 2
    .parameter "view"

    .prologue
    .line 489
    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x10

    if-eqz v1, :cond_2

    const/4 v0, 0x1

    .line 490
    .local v0, showCustom:Z
    :goto_0
    #v0=(Boolean);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v1=(Reference);
    if-eqz v1, :cond_0

    if-eqz v0, :cond_0

    .line 491
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 493
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    .line 494
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    if-eqz v1, :cond_1

    if-eqz v0, :cond_1

    .line 495
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 497
    :cond_1
    return-void

    .line 489
    .end local v0           #showCustom:Z
    :cond_2
    #v0=(Uninit);v1=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setDisplayOptions(I)V
    .locals 11
    .parameter "options"

    .prologue
    const/16 v7, 0x8

    #v7=(PosByte);
    const/4 v0, -0x1

    #v0=(Byte);
    const/4 v8, 0x1

    #v8=(One);
    const/4 v6, 0x0

    .line 572
    #v6=(Null);
    iget v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v9=(Integer);
    if-ne v9, v0, :cond_6

    .line 573
    .local v0, flagsChanged:I
    :goto_0
    #v0=(Integer);
    iput p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    .line 575
    and-int/lit8 v9, v0, 0x1f

    if-eqz v9, :cond_11

    .line 576
    and-int/lit8 v9, p1, 0x2

    if-eqz v9, :cond_7

    move v4, v8

    .line 577
    .local v4, showHome:Z
    :goto_1
    #v4=(Boolean);
    if-eqz v4, :cond_8

    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    #v9=(Reference);
    if-nez v9, :cond_8

    move v5, v6

    .line 578
    .local v5, vis:I
    :goto_2
    #v5=(PosByte);v9=(Conflicted);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v9=(Reference);
    invoke-virtual {v9, v5}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setVisibility(I)V

    .line 580
    and-int/lit8 v9, v0, 0x4

    #v9=(Integer);
    if-eqz v9, :cond_0

    .line 581
    and-int/lit8 v9, p1, 0x4

    if-eqz v9, :cond_9

    move v3, v8

    .line 582
    .local v3, setUp:Z
    :goto_3
    #v3=(Boolean);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v9=(Reference);
    invoke-virtual {v9, v3}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUp(Z)V

    .line 588
    if-eqz v3, :cond_0

    .line 589
    invoke-virtual {p0, v8}, Landroid/support/v7/internal/widget/ActionBarView;->setHomeButtonEnabled(Z)V

    .line 593
    .end local v3           #setUp:Z
    :cond_0
    #v3=(Conflicted);v9=(Conflicted);
    and-int/lit8 v9, v0, 0x1

    #v9=(Integer);
    if-eqz v9, :cond_1

    .line 594
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    #v9=(Reference);
    if-eqz v9, :cond_a

    and-int/lit8 v9, p1, 0x1

    #v9=(Integer);
    if-eqz v9, :cond_a

    move v2, v8

    .line 596
    .local v2, logoVis:Z
    :goto_4
    #v2=(Boolean);v9=(Conflicted);
    iget-object v10, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v10=(Reference);
    if-eqz v2, :cond_b

    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    :goto_5
    #v9=(Reference);
    invoke-virtual {v10, v9}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 599
    .end local v2           #logoVis:Z
    :cond_1
    #v2=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    and-int/lit8 v9, v0, 0x8

    #v9=(Integer);
    if-eqz v9, :cond_2

    .line 600
    and-int/lit8 v9, p1, 0x8

    if-eqz v9, :cond_c

    .line 601
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarView;->initTitle()V

    .line 607
    :cond_2
    :goto_6
    #v9=(Conflicted);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v9=(Reference);
    if-eqz v9, :cond_4

    and-int/lit8 v9, v0, 0x6

    #v9=(Integer);
    if-eqz v9, :cond_4

    .line 609
    iget v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    and-int/lit8 v9, v9, 0x4

    if-eqz v9, :cond_d

    move v1, v8

    .line 610
    .local v1, homeAsUp:Z
    :goto_7
    #v1=(Boolean);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleUpView:Landroid/view/View;

    #v9=(Reference);
    if-nez v4, :cond_3

    if-eqz v1, :cond_e

    move v7, v6

    :cond_3
    :goto_8
    invoke-virtual {v9, v7}, Landroid/view/View;->setVisibility(I)V

    .line 611
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v7=(Reference);
    if-nez v4, :cond_f

    if-eqz v1, :cond_f

    :goto_9
    #v8=(Boolean);
    invoke-virtual {v7, v8}, Landroid/widget/LinearLayout;->setEnabled(Z)V

    .line 614
    .end local v1           #homeAsUp:Z
    :cond_4
    #v1=(Conflicted);v7=(Conflicted);v9=(Conflicted);
    and-int/lit8 v6, v0, 0x10

    #v6=(Integer);
    if-eqz v6, :cond_5

    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v6=(Reference);
    if-eqz v6, :cond_5

    .line 615
    and-int/lit8 v6, p1, 0x10

    #v6=(Integer);
    if-eqz v6, :cond_10

    .line 616
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v6=(Reference);
    invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 622
    :cond_5
    :goto_a
    #v6=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->requestLayout()V

    .line 628
    .end local v4           #showHome:Z
    .end local v5           #vis:I
    :goto_b
    #v4=(Conflicted);v5=(Conflicted);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->isEnabled()Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_12

    .line 629
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v6=(Reference);
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {v6, v7}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 637
    :goto_c
    #v7=(Reference);v8=(Integer);
    return-void

    .line 572
    .end local v0           #flagsChanged:I
    :cond_6
    #v0=(Byte);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(PosByte);v8=(One);v9=(Integer);v10=(Uninit);
    iget v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    xor-int v0, p1, v9

    #v0=(Integer);
    goto/16 :goto_0

    .restart local v0       #flagsChanged:I
    :cond_7
    move v4, v6

    .line 576
    #v4=(Null);
    goto/16 :goto_1

    .restart local v4       #showHome:Z
    :cond_8
    #v4=(Boolean);v9=(Conflicted);
    move v5, v7

    .line 577
    #v5=(PosByte);
    goto/16 :goto_2

    .restart local v5       #vis:I
    :cond_9
    #v9=(Integer);
    move v3, v6

    .line 581
    #v3=(Null);
    goto :goto_3

    :cond_a
    #v3=(Conflicted);v9=(Conflicted);
    move v2, v6

    .line 594
    #v2=(Null);
    goto :goto_4

    .line 596
    .restart local v2       #logoVis:Z
    :cond_b
    #v2=(Boolean);v10=(Reference);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    #v9=(Reference);
    goto :goto_5

    .line 603
    .end local v2           #logoVis:Z
    :cond_c
    #v2=(Conflicted);v9=(Integer);v10=(Conflicted);
    iget-object v9, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v9=(Reference);
    invoke-virtual {p0, v9}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    goto :goto_6

    :cond_d
    #v9=(Integer);
    move v1, v6

    .line 609
    #v1=(Null);
    goto :goto_7

    .line 610
    .restart local v1       #homeAsUp:Z
    :cond_e
    #v1=(Boolean);v9=(Reference);
    const/4 v7, 0x4

    goto :goto_8

    :cond_f
    #v7=(Reference);
    move v8, v6

    .line 611
    #v8=(Null);
    goto :goto_9

    .line 618
    .end local v1           #homeAsUp:Z
    :cond_10
    #v1=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Boolean);v9=(Conflicted);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mCustomNavView:Landroid/view/View;

    #v6=(Reference);
    invoke-virtual {p0, v6}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    goto :goto_a

    .line 624
    .end local v4           #showHome:Z
    .end local v5           #vis:I
    :cond_11
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Null);v7=(PosByte);v8=(One);v9=(Integer);v10=(Uninit);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->invalidate()V

    goto :goto_b

    .line 630
    :cond_12
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Boolean);v7=(Conflicted);v8=(Boolean);v9=(Conflicted);v10=(Conflicted);
    and-int/lit8 v6, p1, 0x4

    #v6=(Integer);
    if-eqz v6, :cond_13

    .line 631
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v6=(Reference);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Landroid/support/v7/appcompat/R$string;->abc_action_bar_up_description:I

    #v8=(Integer);
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_c

    .line 634
    :cond_13
    #v6=(Integer);v7=(Conflicted);v8=(Boolean);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v6=(Reference);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, Landroid/support/v7/appcompat/R$string;->abc_action_bar_home_description:I

    #v8=(Integer);
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_c
.end method

.method public setDropdownAdapter(Landroid/widget/SpinnerAdapter;)V
    .locals 1
    .parameter "adapter"

    .prologue
    .line 710
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

    .line 711
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 712
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 714
    :cond_0
    return-void
.end method

.method public setDropdownSelectedPosition(I)V
    .locals 1
    .parameter "position"

    .prologue
    .line 721
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V

    .line 722
    return-void
.end method

.method public setEmbeddedTabView(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
    .locals 4
    .parameter "tabs"

    .prologue
    const/4 v2, 0x1

    .line 377
    #v2=(One);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 378
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    .line 380
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    .line 381
    if-eqz p1, :cond_2

    move v1, v2

    :goto_0
    #v1=(Boolean);
    iput-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    .line 382
    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    if-eqz v1, :cond_1

    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    #v1=(Integer);
    const/4 v3, 0x2

    #v3=(PosByte);
    if-ne v1, v3, :cond_1

    .line 383
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v1=(Reference);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 384
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    .line 385
    .local v0, lp:Landroid/view/ViewGroup$LayoutParams;
    #v0=(Reference);
    const/4 v1, -0x2

    #v1=(Byte);
    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 386
    const/4 v1, -0x1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 387
    invoke-virtual {p1, v2}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->setAllowCollapse(Z)V

    .line 389
    .end local v0           #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_1
    #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
    return-void

    .line 381
    :cond_2
    #v0=(Uninit);v1=(Reference);v3=(Uninit);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public setHomeAsUpIndicator(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 1209
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUpIndicator(I)V

    .line 1210
    return-void
.end method

.method public setHomeAsUpIndicator(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "indicator"

    .prologue
    .line 1205
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setUpIndicator(Landroid/graphics/drawable/Drawable;)V

    .line 1206
    return-void
.end method

.method public setHomeButtonEnabled(Z)V
    .locals 3
    .parameter "enable"

    .prologue
    .line 557
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setEnabled(Z)V

    .line 558
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setFocusable(Z)V

    .line 560
    if-nez p1, :cond_0

    .line 561
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 569
    :goto_0
    #v1=(Reference);v2=(Conflicted);
    return-void

    .line 562
    :cond_0
    #v1=(Uninit);v2=(Uninit);
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_1

    .line 563
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Landroid/support/v7/appcompat/R$string;->abc_action_bar_up_description:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 566
    :cond_1
    #v0=(Integer);v1=(Uninit);v2=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Landroid/support/v7/appcompat/R$string;->abc_action_bar_home_description:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setContentDescription(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public setIcon(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 651
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 652
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .parameter "icon"

    .prologue
    .line 640
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    .line 641
    if-eqz p1, :cond_1

    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    if-nez v0, :cond_1

    .line 643
    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 645
    :cond_1
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    #v0=(Reference);
    if-eqz v0, :cond_2

    .line 646
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIcon:Landroid/graphics/drawable/Drawable;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 648
    :cond_2
    #v1=(Conflicted);v2=(Conflicted);
    return-void
.end method

.method public setLogo(I)V
    .locals 1
    .parameter "resId"

    .prologue
    .line 662
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->setLogo(Landroid/graphics/drawable/Drawable;)V

    .line 663
    return-void
.end method

.method public setLogo(Landroid/graphics/drawable/Drawable;)V
    .locals 1
    .parameter "logo"

    .prologue
    .line 655
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mLogo:Landroid/graphics/drawable/Drawable;

    .line 656
    if-eqz p1, :cond_0

    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    .line 657
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mHomeLayout:Landroid/support/v7/internal/widget/ActionBarView$HomeView;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView$HomeView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 659
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public setMenu(Landroid/support/v4/internal/view/SupportMenu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
    .locals 8
    .parameter "menu"
    .parameter "cb"

    .prologue
    const/4 v7, -0x1

    .line 396
    #v7=(Byte);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v4=(Reference);
    if-ne p1, v4, :cond_0

    .line 459
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    .line 400
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Uninit);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    if-eqz v4, :cond_1

    .line 401
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 402
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    :cond_1
    #v5=(Conflicted);
    move-object v0, p1

    .line 405
    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 406
    .local v0, builder:Landroid/support/v7/internal/view/menu/MenuBuilder;
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mOptionsMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 407
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    if-eqz v4, :cond_2

    .line 408
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/view/ViewGroup;

    .line 409
    .local v3, oldParent:Landroid/view/ViewGroup;
    if-eqz v3, :cond_2

    .line 410
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 413
    .end local v3           #oldParent:Landroid/view/ViewGroup;
    :cond_2
    #v3=(Conflicted);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    if-nez v4, :cond_3

    .line 414
    new-instance v4, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v4=(UninitRef);
    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v5=(Reference);
    invoke-direct {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;-><init>(Landroid/content/Context;)V

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    .line 415
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, p2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 416
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    sget v5, Landroid/support/v7/appcompat/R$id;->action_menu_presenter:I

    #v5=(Integer);
    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setId(I)V

    .line 417
    new-instance v4, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    #v4=(UninitRef);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-direct {v4, p0, v5}, Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;-><init>(Landroid/support/v7/internal/widget/ActionBarView;Landroid/support/v7/internal/widget/ActionBarView$1;)V

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedMenuPresenter:Landroid/support/v7/internal/widget/ActionBarView$ExpandedActionViewMenuPresenter;

    .line 421
    :cond_3
    #v5=(Conflicted);
    new-instance v1, Landroid/view/ViewGroup$LayoutParams;

    #v1=(UninitRef);
    const/4 v4, -0x2

    #v4=(Byte);
    invoke-direct {v1, v4, v7}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 423
    .local v1, layoutParams:Landroid/view/ViewGroup$LayoutParams;
    #v1=(Reference);
    iget-boolean v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitActionBar:Z

    #v4=(Boolean);
    if-nez v4, :cond_5

    .line 424
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v4=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    #v5=(Reference);
    sget v6, Landroid/support/v7/appcompat/R$bool;->abc_action_bar_expanded_action_views_exclusive:I

    #v6=(Integer);
    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v5

    #v5=(Boolean);
    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V

    .line 427
    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->configPresenters(Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 428
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 429
    .local v2, menuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
    invoke-virtual {v2, v0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->initialize(Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 430
    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/view/ViewGroup;

    .line 431
    .restart local v3       #oldParent:Landroid/view/ViewGroup;
    if-eqz v3, :cond_4

    if-eq v3, p0, :cond_4

    .line 432
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 434
    :cond_4
    invoke-virtual {p0, v2, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 458
    .end local v3           #oldParent:Landroid/view/ViewGroup;
    :goto_1
    #v3=(Conflicted);v5=(Integer);
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    goto/16 :goto_0

    .line 436
    .end local v2           #menuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
    :cond_5
    #v2=(Uninit);v4=(Boolean);v5=(Conflicted);v6=(Uninit);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V

    .line 438
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;

    move-result-object v5

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    #v5=(Integer);
    const/4 v6, 0x1

    #v6=(One);
    invoke-virtual {v4, v5, v6}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V

    .line 441
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const v5, 0x7fffffff

    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V

    .line 443
    iput v7, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 444
    invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/ActionBarView;->configPresenters(Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 445
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 446
    .restart local v2       #menuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v4, :cond_7

    .line 447
    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/view/ViewGroup;

    .line 448
    .restart local v3       #oldParent:Landroid/view/ViewGroup;
    if-eqz v3, :cond_6

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eq v3, v4, :cond_6

    .line 449
    invoke-virtual {v3, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 451
    :cond_6
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getAnimatedVisibility()I

    move-result v4

    #v4=(Integer);
    invoke-virtual {v2, v4}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setVisibility(I)V

    .line 452
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    #v4=(Reference);
    invoke-virtual {v4, v2, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1

    .line 455
    .end local v3           #oldParent:Landroid/view/ViewGroup;
    :cond_7
    #v3=(Conflicted);
    invoke-virtual {v2, v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1
.end method

.method public setNavigationMode(I)V
    .locals 6
    .parameter "mode"

    .prologue
    const/4 v5, 0x0

    .line 666
    #v5=(Null);
    iget v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    .line 667
    .local v0, oldMode:I
    #v0=(Integer);
    if-eq p1, v0, :cond_2

    .line 668
    packed-switch v0, :pswitch_data_0

    .line 680
    :cond_0
    :goto_0
    #v2=(Conflicted);
    packed-switch p1, :pswitch_data_1

    .line 704
    :cond_1
    :goto_1
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iput p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavigationMode:I

    .line 705
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->requestLayout()V

    .line 707
    :cond_2
    return-void

    .line 670
    :pswitch_0
    #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 671
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    goto :goto_0

    .line 675
    :pswitch_1
    #v2=(Uninit);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 676
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v2=(Reference);
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->removeView(Landroid/view/View;)V

    goto :goto_0

    .line 682
    :pswitch_2
    #v2=(Conflicted);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    #v2=(Reference);
    if-nez v2, :cond_3

    .line 683
    new-instance v2, Landroid/support/v7/internal/widget/SpinnerICS;

    #v2=(UninitRef);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    #v3=(Reference);
    sget v4, Landroid/support/v7/appcompat/R$attr;->actionDropDownStyle:I

    #v4=(Integer);
    invoke-direct {v2, v3, v5, v4}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    #v2=(Reference);
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    .line 685
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mContext:Landroid/content/Context;

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_view_list_nav_layout:I

    #v3=(Integer);
    invoke-virtual {v2, v3, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/LinearLayout;

    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    .line 687
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    #v1=(UninitRef);
    const/4 v2, -0x2

    #v2=(Byte);
    const/4 v3, -0x1

    #v3=(Byte);
    invoke-direct {v1, v2, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 689
    .local v1, params:Landroid/widget/LinearLayout$LayoutParams;
    #v1=(Reference);
    const/16 v2, 0x11

    #v2=(PosByte);
    iput v2, v1, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 690
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    #v3=(Reference);
    invoke-virtual {v2, v3, v1}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 692
    .end local v1           #params:Landroid/widget/LinearLayout$LayoutParams;
    :cond_3
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v2}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;

    move-result-object v2

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

    #v3=(Reference);
    if-eq v2, v3, :cond_4

    .line 693
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinnerAdapter:Landroid/widget/SpinnerAdapter;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 695
    :cond_4
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSpinner:Landroid/support/v7/internal/widget/SpinnerICS;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mNavItemSelectedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS;->setOnItemSelectedListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemSelectedListener;)V

    .line 696
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mListNavLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 699
    :pswitch_3
    #v1=(Uninit);v2=(Conflicted);v3=(Uninit);v4=(Uninit);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v2=(Reference);
    if-eqz v2, :cond_1

    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mIncludeTabs:Z

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 700
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTabScrollView:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v2=(Reference);
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 668
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 680
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public setSplitActionBar(Z)V
    .locals 4
    .parameter "splitActionBar"

    .prologue
    const/4 v2, 0x0

    .line 329
    #v2=(Null);
    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitActionBar:Z

    #v1=(Boolean);
    if-eq v1, p1, :cond_5

    .line 330
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    #v1=(Reference);
    if-eqz v1, :cond_2

    .line 331
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/view/ViewGroup;

    .line 332
    .local v0, oldParent:Landroid/view/ViewGroup;
    if-eqz v0, :cond_0

    .line 333
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 335
    :cond_0
    if-eqz p1, :cond_6

    .line 336
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v1, :cond_1

    .line 337
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    #v3=(Reference);
    invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;)V

    .line 339
    :cond_1
    #v3=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const/4 v3, -0x1

    #v3=(Byte);
    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 344
    :goto_0
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->requestLayout()V

    .line 346
    .end local v0           #oldParent:Landroid/view/ViewGroup;
    :cond_2
    #v0=(Conflicted);v3=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    if-eqz v1, :cond_3

    .line 347
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    #v3=(Reference);
    if-eqz p1, :cond_7

    move v1, v2

    :goto_1
    #v1=(PosByte);
    invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->setVisibility(I)V

    .line 350
    :cond_3
    #v1=(Conflicted);v3=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v1=(Reference);
    if-eqz v1, :cond_4

    .line 351
    if-nez p1, :cond_8

    .line 352
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    #v2=(Reference);
    sget v3, Landroid/support/v7/appcompat/R$bool;->abc_action_bar_expanded_action_views_exclusive:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v2

    #v2=(Boolean);
    invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V

    .line 364
    :cond_4
    :goto_2
    #v2=(Integer);v3=(Conflicted);
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitActionBar(Z)V

    .line 366
    :cond_5
    #v1=(Conflicted);
    return-void

    .line 341
    .restart local v0       #oldParent:Landroid/view/ViewGroup;
    :cond_6
    #v0=(Reference);v1=(Reference);v2=(Null);v3=(Uninit);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarView;->addView(Landroid/view/View;)V

    .line 342
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    const/4 v3, -0x2

    #v3=(Byte);
    iput v3, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    goto :goto_0

    .line 347
    .end local v0           #oldParent:Landroid/view/ViewGroup;
    :cond_7
    #v0=(Conflicted);v3=(Reference);
    const/16 v1, 0x8

    #v1=(PosByte);
    goto :goto_1

    .line 356
    :cond_8
    #v1=(Reference);v3=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setExpandedActionViewsExclusive(Z)V

    .line 358
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarView;->getContext()Landroid/content/Context;

    move-result-object v2

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v2

    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    #v2=(Integer);
    const/4 v3, 0x1

    #v3=(One);
    invoke-virtual {v1, v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V

    .line 361
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const v2, 0x7fffffff

    invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V

    goto :goto_2
.end method

.method public bridge synthetic setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V

    return-void
.end method

.method public bridge synthetic setSplitWhenNarrow(Z)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitWhenNarrow(Z)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 5
    .parameter "subtitle"

    .prologue
    const/16 v3, 0x8

    #v3=(PosByte);
    const/4 v2, 0x0

    .line 545
    #v2=(Null);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    .line 546
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 547
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 548
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitleView:Landroid/widget/TextView;

    #v4=(Reference);
    if-eqz p1, :cond_2

    move v1, v2

    :goto_0
    #v1=(PosByte);
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 549
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mExpandedActionView:Landroid/view/View;

    #v1=(Reference);
    if-nez v1, :cond_3

    iget v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mDisplayOptions:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitle:Ljava/lang/CharSequence;

    #v1=(Reference);
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mSubtitle:Ljava/lang/CharSequence;

    #v1=(Reference);
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_3

    :cond_0
    const/4 v0, 0x1

    .line 552
    .local v0, visible:Z
    :goto_1
    #v0=(Boolean);v1=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v1=(Reference);
    if-eqz v0, :cond_4

    :goto_2
    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 554
    .end local v0           #visible:Z
    :cond_1
    #v0=(Conflicted);v4=(Conflicted);
    return-void

    :cond_2
    #v0=(Uninit);v2=(Null);v4=(Reference);
    move v1, v3

    .line 548
    #v1=(PosByte);
    goto :goto_0

    :cond_3
    #v1=(Conflicted);
    move v0, v2

    .line 549
    #v0=(Null);
    goto :goto_1

    .restart local v0       #visible:Z
    :cond_4
    #v0=(Boolean);v1=(Reference);
    move v2, v3

    .line 552
    #v2=(PosByte);
    goto :goto_2
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 1
    .parameter "title"

    .prologue
    .line 510
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mUserTitle:Z

    .line 511
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setTitleImpl(Ljava/lang/CharSequence;)V

    .line 512
    return-void
.end method

.method public bridge synthetic setVisibility(I)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 63
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setVisibility(I)V

    return-void
.end method

.method public setWindowCallback(Landroid/view/Window$Callback;)V
    .locals 0
    .parameter "cb"

    .prologue
    .line 294
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarView;->mWindowCallback:Landroid/view/Window$Callback;

    .line 295
    return-void
.end method

.method public setWindowTitle(Ljava/lang/CharSequence;)V
    .locals 1
    .parameter "title"

    .prologue
    .line 521
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarView;->mUserTitle:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 522
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setTitleImpl(Ljava/lang/CharSequence;)V

    .line 524
    :cond_0
    return-void
.end method

.method public shouldDelayChildPressedState()Z
    .locals 1

    .prologue
    .line 308
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public bridge synthetic showOverflowMenu()Z
    .locals 1

    .prologue
    .line 63
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->showOverflowMenu()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

*/}
