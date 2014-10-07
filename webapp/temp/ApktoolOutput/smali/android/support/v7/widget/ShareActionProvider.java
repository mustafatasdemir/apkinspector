package android.support.v7.widget; class ShareActionProvider {/*

.class public Landroid/support/v7/widget/ShareActionProvider;
.super Landroid/support/v4/view/ActionProvider;
.source "ShareActionProvider.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/ShareActionProvider$1;,
        Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;,
        Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;,
        Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
    }
.end annotation


# static fields
.field private static final DEFAULT_INITIAL_ACTIVITY_COUNT:I = 0x4

.field public static final DEFAULT_SHARE_HISTORY_FILE_NAME:Ljava/lang/String; = "share_history.xml"


# instance fields
.field private final mContext:Landroid/content/Context;

.field private mMaxShownActivityCount:I

.field private mOnChooseActivityListener:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;

.field private final mOnMenuItemClickListener:Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;

.field private mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;

.field private mShareHistoryFileName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    .line 155
    invoke-direct {p0, p1}, Landroid/support/v4/view/ActionProvider;-><init>(Landroid/content/Context;)V

    .line 122
    #p0=(Reference);
    const/4 v0, 0x4

    #v0=(PosByte);
    iput v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mMaxShownActivityCount:I

    .line 127
    new-instance v0, Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;-><init>(Landroid/support/v7/widget/ShareActionProvider;Landroid/support/v7/widget/ShareActionProvider$1;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnMenuItemClickListener:Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;

    .line 143
    const-string v0, "share_history.xml"

    iput-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;

    .line 156
    iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    .line 157
    return-void
.end method

.method static synthetic access$100(Landroid/support/v7/widget/ShareActionProvider;)Landroid/content/Context;
    .locals 1
    .parameter "x0"

    .prologue
    .line 85
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$200(Landroid/support/v7/widget/ShareActionProvider;)Ljava/lang/String;
    .locals 1
    .parameter "x0"

    .prologue
    .line 85
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$400(Landroid/support/v7/widget/ShareActionProvider;)Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
    .locals 1
    .parameter "x0"

    .prologue
    .line 85
    iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;

    #v0=(Reference);
    return-object v0
.end method

.method private setActivityChooserPolicyIfNeeded()V
    .locals 3

    .prologue
    .line 328
    iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;

    #v1=(Reference);
    if-nez v1, :cond_0

    .line 336
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);
    return-void

    .line 331
    :cond_0
    #v0=(Uninit);v2=(Uninit);
    iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnChooseActivityListener:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;

    if-nez v1, :cond_1

    .line 332
    new-instance v1, Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;

    #v1=(UninitRef);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-direct {v1, p0, v2}, Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;-><init>(Landroid/support/v7/widget/ShareActionProvider;Landroid/support/v7/widget/ShareActionProvider$1;)V

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnChooseActivityListener:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;

    .line 334
    :cond_1
    #v2=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    iget-object v2, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v0

    .line 335
    .local v0, dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnChooseActivityListener:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->setOnChooseActivityListener(Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;)V

    goto :goto_0
.end method


# virtual methods
.method public hasSubMenu()Z
    .locals 1

    .prologue
    .line 205
    const/4 v0, 0x1

    #v0=(One);
    return v0
.end method

.method public onCreateActionView()Landroid/view/View;
    .locals 7

    .prologue
    .line 180
    iget-object v4, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;

    #v5=(Reference);
    invoke-static {v4, v5}, Landroid/support/v7/internal/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v1

    .line 181
    .local v1, dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    #v1=(Reference);
    new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserView;

    #v0=(UninitRef);
    iget-object v4, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    invoke-direct {v0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;-><init>(Landroid/content/Context;)V

    .line 182
    .local v0, activityChooserView:Landroid/support/v7/internal/widget/ActivityChooserView;
    #v0=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->setActivityChooserModel(Landroid/support/v7/internal/widget/ActivityChooserModel;)V

    .line 185
    new-instance v3, Landroid/util/TypedValue;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V

    .line 186
    .local v3, outTypedValue:Landroid/util/TypedValue;
    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    sget v5, Landroid/support/v7/appcompat/R$attr;->actionModeShareDrawable:I

    #v5=(Integer);
    const/4 v6, 0x1

    #v6=(One);
    invoke-virtual {v4, v5, v3, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 187
    iget-object v4, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    iget v5, v3, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 188
    .local v2, drawable:Landroid/graphics/drawable/Drawable;
    #v2=(Reference);
    invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActivityChooserView;->setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 189
    invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->setProvider(Landroid/support/v4/view/ActionProvider;)V

    .line 192
    sget v4, Landroid/support/v7/appcompat/R$string;->abc_shareactionprovider_share_with_application:I

    #v4=(Integer);
    invoke-virtual {v0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->setDefaultActionButtonContentDescription(I)V

    .line 194
    sget v4, Landroid/support/v7/appcompat/R$string;->abc_shareactionprovider_share_with:I

    invoke-virtual {v0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->setExpandActivityOverflowButtonContentDescription(I)V

    .line 197
    return-object v0
.end method

.method public onPrepareSubMenu(Landroid/view/SubMenu;)V
    .locals 10
    .parameter "subMenu"

    .prologue
    const/4 v9, 0x0

    .line 214
    #v9=(Null);
    invoke-interface {p1}, Landroid/view/SubMenu;->clear()V

    .line 216
    iget-object v7, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    #v7=(Reference);
    iget-object v8, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;

    #v8=(Reference);
    invoke-static {v7, v8}, Landroid/support/v7/internal/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v2

    .line 217
    .local v2, dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    #v2=(Reference);
    iget-object v7, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    .line 219
    .local v6, packageManager:Landroid/content/pm/PackageManager;
    #v6=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivityCount()I

    move-result v3

    .line 220
    .local v3, expandedActivityCount:I
    #v3=(Integer);
    iget v7, p0, Landroid/support/v7/widget/ShareActionProvider;->mMaxShownActivityCount:I

    #v7=(Integer);
    invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 223
    .local v1, collapsedActivityCount:I
    #v1=(Integer);
    const/4 v5, 0x0

    .local v5, i:I
    :goto_0
    #v0=(Conflicted);v5=(Integer);v7=(Conflicted);
    if-ge v5, v1, :cond_0

    .line 224
    invoke-virtual {v2, v5}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivity(I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 225
    .local v0, activity:Landroid/content/pm/ResolveInfo;
    #v0=(Reference);
    invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v7

    #v7=(Reference);
    invoke-interface {p1, v9, v5, v5, v7}, Landroid/view/SubMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v7

    invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    invoke-interface {v7, v8}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v7

    iget-object v8, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnMenuItemClickListener:Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;

    invoke-interface {v7, v8}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 223
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 230
    .end local v0           #activity:Landroid/content/pm/ResolveInfo;
    :cond_0
    #v0=(Conflicted);v7=(Conflicted);
    if-ge v1, v3, :cond_1

    .line 232
    iget-object v7, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    #v7=(Reference);
    sget v8, Landroid/support/v7/appcompat/R$string;->abc_activity_chooser_view_see_all:I

    #v8=(Integer);
    invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    invoke-interface {p1, v9, v1, v1, v7}, Landroid/view/SubMenu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v4

    .line 235
    .local v4, expandedSubMenu:Landroid/view/SubMenu;
    #v4=(Reference);
    const/4 v5, 0x0

    :goto_1
    #v8=(Conflicted);
    if-ge v5, v3, :cond_1

    .line 236
    invoke-virtual {v2, v5}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivity(I)Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 237
    .restart local v0       #activity:Landroid/content/pm/ResolveInfo;
    #v0=(Reference);
    invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v7

    invoke-interface {v4, v9, v5, v5, v7}, Landroid/view/SubMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v7

    invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v8

    #v8=(Reference);
    invoke-interface {v7, v8}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v7

    iget-object v8, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnMenuItemClickListener:Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;

    invoke-interface {v7, v8}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;

    .line 235
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    .line 242
    .end local v0           #activity:Landroid/content/pm/ResolveInfo;
    .end local v4           #expandedSubMenu:Landroid/view/SubMenu;
    :cond_1
    #v0=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-void
.end method

.method public setOnShareTargetSelectedListener(Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;)V
    .locals 0
    .parameter "listener"

    .prologue
    .line 170
    iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;

    .line 171
    invoke-direct {p0}, Landroid/support/v7/widget/ShareActionProvider;->setActivityChooserPolicyIfNeeded()V

    .line 172
    return-void
.end method

.method public setShareHistoryFileName(Ljava/lang/String;)V
    .locals 0
    .parameter "shareHistoryFile"

    .prologue
    .line 276
    iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;

    .line 277
    invoke-direct {p0}, Landroid/support/v7/widget/ShareActionProvider;->setActivityChooserPolicyIfNeeded()V

    .line 278
    return-void
.end method

.method public setShareIntent(Landroid/content/Intent;)V
    .locals 3
    .parameter "shareIntent"

    .prologue
    .line 300
    iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v0

    .line 302
    .local v0, dataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->setIntent(Landroid/content/Intent;)V

    .line 303
    return-void
.end method

*/}
