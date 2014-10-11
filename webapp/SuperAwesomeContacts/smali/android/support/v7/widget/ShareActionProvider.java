package android.support.v7.widget; class ShareActionProvider { void a() { int a;
a=0;// .class public Landroid/support/v7/widget/ShareActionProvider;
a=0;// .super Landroid/support/v4/view/ActionProvider;
a=0;// .source "ShareActionProvider.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/widget/ShareActionProvider$1;,
a=0;//         Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;,
a=0;//         Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;,
a=0;//         Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DEFAULT_INITIAL_ACTIVITY_COUNT:I = 0x4
a=0;// 
a=0;// .field public static final DEFAULT_SHARE_HISTORY_FILE_NAME:Ljava/lang/String; = "share_history.xml"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mMaxShownActivityCount:I
a=0;// 
a=0;// .field private mOnChooseActivityListener:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;// .field private final mOnMenuItemClickListener:Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;// .field private mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;// .field private mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/ActionProvider;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 122
a=0;//     #p0=(Reference,Landroid/support/v7/widget/ShareActionProvider;);
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mMaxShownActivityCount:I
a=0;// 
a=0;//     .line 127
a=0;//     new-instance v0, Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;-><init>(Landroid/support/v7/widget/ShareActionProvider;Landroid/support/v7/widget/ShareActionProvider$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;);
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnMenuItemClickListener:Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;//     .line 143
a=0;//     const-string v0, "share_history.xml"
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     .line 156
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 157
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v7/widget/ShareActionProvider;)Landroid/content/Context;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v7/widget/ShareActionProvider;)Ljava/lang/String;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$400(Landroid/support/v7/widget/ShareActionProvider;)Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/widget/ShareActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private setActivityChooserPolicyIfNeeded()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 328
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 336
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 331
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnChooseActivityListener:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 332
a=0;//     new-instance v1, Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-direct {v1, p0, v2}, Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;-><init>(Landroid/support/v7/widget/ShareActionProvider;Landroid/support/v7/widget/ShareActionProvider$1;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/widget/ShareActionProvider$ShareActivityChooserModelPolicy;);
a=0;//     iput-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnChooseActivityListener:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     .line 334
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 335
a=0;//     .local v0, "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnChooseActivityListener:Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->setOnChooseActivityListener(Landroid/support/v7/internal/widget/ActivityChooserModel$OnChooseActivityListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public hasSubMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onCreateActionView()Landroid/view/View;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     iget-object v5, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5}, Landroid/support/v7/internal/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 181
a=0;//     .local v1, "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 182
a=0;//     .local v0, "activityChooserView":Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->setActivityChooserModel(Landroid/support/v7/internal/widget/ActivityChooserModel;)V
a=0;// 
a=0;//     .line 185
a=0;//     new-instance v3, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 186
a=0;//     .local v3, "outTypedValue":Landroid/util/TypedValue;
a=0;//     #v3=(Reference,Landroid/util/TypedValue;);
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     sget v5, Landroid/support/v7/appcompat/R$attr;->actionModeShareDrawable:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v4, v5, v3, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     iget v5, v3, Landroid/util/TypedValue;->resourceId:I
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 188
a=0;//     .local v2, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v0, v2}, Landroid/support/v7/internal/widget/ActivityChooserView;->setExpandActivityOverflowButtonDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/ActivityChooserView;->setProvider(Landroid/support/v4/view/ActionProvider;)V
a=0;// 
a=0;//     .line 192
a=0;//     sget v4, Landroid/support/v7/appcompat/R$string;->abc_shareactionprovider_share_with_application:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->setDefaultActionButtonContentDescription(I)V
a=0;// 
a=0;//     .line 194
a=0;//     sget v4, Landroid/support/v7/appcompat/R$string;->abc_shareactionprovider_share_with:I
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->setExpandActivityOverflowButtonContentDescription(I)V
a=0;// 
a=0;//     .line 197
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onPrepareSubMenu(Landroid/view/SubMenu;)V
a=0;//     .locals 10
a=0;//     .param p1, "subMenu"    # Landroid/view/SubMenu;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     .line 214
a=0;//     #v9=(Null);
a=0;//     invoke-interface {p1}, Landroid/view/SubMenu;->clear()V
a=0;// 
a=0;//     .line 216
a=0;//     iget-object v7, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     iget-object v8, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8}, Landroid/support/v7/internal/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 217
a=0;//     .local v2, "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     iget-object v7, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 219
a=0;//     .local v6, "packageManager":Landroid/content/pm/PackageManager;
a=0;//     #v6=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivityCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 220
a=0;//     .local v3, "expandedActivityCount":I
a=0;//     #v3=(Integer);
a=0;//     iget v7, p0, Landroid/support/v7/widget/ShareActionProvider;->mMaxShownActivityCount:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v3, v7}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 223
a=0;//     .local v1, "collapsedActivityCount":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .local v5, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v5=(Integer);v7=(Conflicted);
a=0;//     if-ge v5, v1, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     invoke-virtual {v2, v5}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivity(I)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 225
a=0;//     .local v0, "activity":Landroid/content/pm/ResolveInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-interface {p1, v9, v5, v5, v7}, Landroid/view/SubMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-interface {v7, v8}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnMenuItemClickListener:Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;//     invoke-interface {v7, v8}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 223
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 230
a=0;//     .end local v0    # "activity":Landroid/content/pm/ResolveInfo;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v1, v3, :cond_1
a=0;// 
a=0;//     .line 232
a=0;//     iget-object v7, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     sget v8, Landroid/support/v7/appcompat/R$string;->abc_activity_chooser_view_see_all:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-interface {p1, v9, v1, v1, v7}, Landroid/view/SubMenu;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 235
a=0;//     .local v4, "expandedSubMenu":Landroid/view/SubMenu;
a=0;//     #v4=(Reference,Landroid/view/SubMenu;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v8=(Conflicted);
a=0;//     if-ge v5, v3, :cond_1
a=0;// 
a=0;//     .line 236
a=0;//     invoke-virtual {v2, v5}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivity(I)Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 237
a=0;//     .restart local v0    # "activity":Landroid/content/pm/ResolveInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-interface {v4, v9, v5, v5, v7}, Landroid/view/SubMenu;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-interface {v7, v8}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnMenuItemClickListener:Landroid/support/v7/widget/ShareActionProvider$ShareMenuItemOnMenuItemClickListener;
a=0;// 
a=0;//     invoke-interface {v7, v8}, Landroid/view/MenuItem;->setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 235
a=0;//     add-int/lit8 v5, v5, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 242
a=0;//     .end local v0    # "activity":Landroid/content/pm/ResolveInfo;
a=0;//     .end local v4    # "expandedSubMenu":Landroid/view/SubMenu;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnShareTargetSelectedListener(Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 170
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider;->mOnShareTargetSelectedListener:Landroid/support/v7/widget/ShareActionProvider$OnShareTargetSelectedListener;
a=0;// 
a=0;//     .line 171
a=0;//     invoke-direct {p0}, Landroid/support/v7/widget/ShareActionProvider;->setActivityChooserPolicyIfNeeded()V
a=0;// 
a=0;//     .line 172
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShareHistoryFileName(Ljava/lang/String;)V
a=0;//     .locals 0
a=0;//     .param p1, "shareHistoryFile"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     .line 277
a=0;//     invoke-direct {p0}, Landroid/support/v7/widget/ShareActionProvider;->setActivityChooserPolicyIfNeeded()V
a=0;// 
a=0;//     .line 278
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShareIntent(Landroid/content/Intent;)V
a=0;//     .locals 3
a=0;//     .param p1, "shareIntent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 300
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/ShareActionProvider;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     iget-object v2, p0, Landroid/support/v7/widget/ShareActionProvider;->mShareHistoryFileName:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->get(Landroid/content/Context;Ljava/lang/String;)Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 302
a=0;//     .local v0, "dataModel":Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserModel;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->setIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 303
a=0;//     return-void
a=0;// .end method
}}
