package android.support.v7.app; class ActionBarActivityDelegate {/*

.class abstract Landroid/support/v7/app/ActionBarActivityDelegate;
.super Ljava/lang/Object;
.source "ActionBarActivityDelegate.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/app/ActionBarActivityDelegate$1;,
        Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;
    }
.end annotation


# static fields
.field static final METADATA_UI_OPTIONS:Ljava/lang/String; = "android.support.UI_OPTIONS"

.field private static final TAG:Ljava/lang/String; = "ActionBarActivityDelegate"

.field static final UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW:Ljava/lang/String; = "splitActionBarWhenNarrow"


# instance fields
.field private mActionBar:Landroid/support/v7/app/ActionBar;

.field final mActivity:Landroid/support/v7/app/ActionBarActivity;

.field private mEnableDefaultActionBarUp:Z

.field mHasActionBar:Z

.field private mMenuInflater:Landroid/view/MenuInflater;

.field mOverlayActionBar:Z


# direct methods
.method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
    .locals 0
    .parameter "activity"

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    .line 76
    return-void
.end method

.method static createDelegate(Landroid/support/v7/app/ActionBarActivity;)Landroid/support/v7/app/ActionBarActivityDelegate;
    .locals 2
    .parameter "activity"

    .prologue
    .line 47
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x14

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    .line 48
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateApi20;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateApi20;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    .line 58
    :goto_0
    #v0=(Reference);
    return-object v0

    .line 49
    :cond_0
    #v0=(Integer);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x12

    if-lt v0, v1, :cond_1

    .line 50
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    #v0=(Reference);
    goto :goto_0

    .line 51
    :cond_1
    #v0=(Integer);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_2

    .line 52
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateJB;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateJB;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    #v0=(Reference);
    goto :goto_0

    .line 53
    :cond_2
    #v0=(Integer);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xe

    if-lt v0, v1, :cond_3

    .line 54
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateICS;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    #v0=(Reference);
    goto :goto_0

    .line 55
    :cond_3
    #v0=(Integer);
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_4

    .line 56
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateHC;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateHC;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    #v0=(Reference);
    goto :goto_0

    .line 58
    :cond_4
    #v0=(Integer);
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateBase;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;-><init>(Landroid/support/v7/app/ActionBarActivity;)V

    #v0=(Reference);
    goto :goto_0
.end method


# virtual methods
.method abstract addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method abstract createSupportActionBar()Landroid/support/v7/app/ActionBar;
.end method

.method protected final getActionBarThemedContext()Landroid/content/Context;
    .locals 2

    .prologue
    .line 205
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    .line 208
    .local v1, context:Landroid/content/Context;
    #v1=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegate;->getSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    .line 209
    .local v0, ab:Landroid/support/v7/app/ActionBar;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 210
    invoke-virtual {v0}, Landroid/support/v7/app/ActionBar;->getThemedContext()Landroid/content/Context;

    move-result-object v1

    .line 212
    :cond_0
    return-object v1
.end method

.method final getDrawerToggleDelegate()Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
    .locals 2

    .prologue
    .line 179
    new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;

    #v0=(UninitRef);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {v0, p0, v1}, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;-><init>(Landroid/support/v7/app/ActionBarActivityDelegate;Landroid/support/v7/app/ActionBarActivityDelegate$1;)V

    #v0=(Reference);
    return-object v0
.end method

.method abstract getHomeAsUpIndicatorAttrId()I
.end method

.method getMenuInflater()Landroid/view/MenuInflater;
    .locals 2

    .prologue
    .line 99
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mMenuInflater:Landroid/view/MenuInflater;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 100
    new-instance v0, Landroid/support/v7/internal/view/SupportMenuInflater;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegate;->getActionBarThemedContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1}, Landroid/support/v7/internal/view/SupportMenuInflater;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mMenuInflater:Landroid/view/MenuInflater;

    .line 102
    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mMenuInflater:Landroid/view/MenuInflater;

    return-object v0
.end method

.method final getSupportActionBar()Landroid/support/v7/app/ActionBar;
    .locals 2

    .prologue
    .line 83
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mHasActionBar:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mOverlayActionBar:Z

    if-eqz v0, :cond_2

    .line 84
    :cond_0
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;

    #v0=(Reference);
    if-nez v0, :cond_1

    .line 85
    invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegate;->createSupportActionBar()Landroid/support/v7/app/ActionBar;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;

    .line 87
    iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mEnableDefaultActionBarUp:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 88
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;

    #v0=(Reference);
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    .line 95
    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;

    #v0=(Reference);
    return-object v0

    .line 93
    :cond_2
    #v0=(Boolean);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;

    goto :goto_0
.end method

.method protected final getUiOptionsFromMetadata()Ljava/lang/String;
    .locals 7

    .prologue
    .line 188
    :try_start_0
    iget-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/app/ActionBarActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    .line 189
    .local v2, pm:Landroid/content/pm/PackageManager;
    #v2=(Reference);
    iget-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v4}, Landroid/support/v7/app/ActionBarActivity;->getComponentName()Landroid/content/ComponentName;

    move-result-object v4

    const/16 v5, 0x80

    #v5=(PosShort);
    invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;

    move-result-object v1

    .line 192
    .local v1, info:Landroid/content/pm/ActivityInfo;
    #v1=(Reference);
    const/4 v3, 0x0

    .line 193
    .local v3, uiOptions:Ljava/lang/String;
    #v3=(Null);
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    if-eqz v4, :cond_0

    .line 194
    iget-object v4, v1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;

    const-string v5, "android.support.UI_OPTIONS"

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v3

    .line 200
    .end local v1           #info:Landroid/content/pm/ActivityInfo;
    .end local v2           #pm:Landroid/content/pm/PackageManager;
    .end local v3           #uiOptions:Ljava/lang/String;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference);v5=(Conflicted);v6=(Conflicted);
    return-object v3

    .line 197
    :catch_0
    move-exception v0

    .line 198
    .local v0, e:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v0=(Reference);
    const-string v4, "ActionBarActivityDelegate"

    #v4=(Reference);
    new-instance v5, Ljava/lang/StringBuilder;

    #v5=(UninitRef);
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    #v5=(Reference);
    const-string v6, "getUiOptionsFromMetadata: Activity \'"

    #v6=(Reference);
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v6, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v6, "\' not in manifest"

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_0
.end method

.method abstract onBackPressed()Z
.end method

.method abstract onConfigurationChanged(Landroid/content/res/Configuration;)V
.end method

.method abstract onContentChanged()V
.end method

.method onCreate(Landroid/os/Bundle;)V
    .locals 5
    .parameter "savedInstanceState"

    .prologue
    const/4 v4, 0x1

    #v4=(One);
    const/4 v3, 0x0

    .line 106
    #v3=(Null);
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    #v1=(Reference);
    sget-object v2, Landroid/support/v7/appcompat/R$styleable;->ActionBarWindow:[I

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 108
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z

    move-result v1

    #v1=(Boolean);
    if-nez v1, :cond_0

    .line 109
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 110
    new-instance v1, Ljava/lang/IllegalStateException;

    #v1=(UninitRef);
    const-string v2, "You need to use a Theme.AppCompat theme (or descendant) with this activity."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 114
    :cond_0
    #v1=(Boolean);
    invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mHasActionBar:Z

    .line 115
    invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mOverlayActionBar:Z

    .line 116
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 118
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/app/Activity;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    .line 119
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;

    if-nez v1, :cond_2

    .line 120
    iput-boolean v4, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mEnableDefaultActionBarUp:Z

    .line 125
    :cond_1
    :goto_0
    return-void

    .line 122
    :cond_2
    iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;

    invoke-virtual {v1, v4}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V

    goto :goto_0
.end method

.method abstract onCreatePanelMenu(ILandroid/view/Menu;)Z
.end method

.method abstract onCreatePanelView(I)Landroid/view/View;
.end method

.method abstract onMenuItemSelected(ILandroid/view/MenuItem;)Z
.end method

.method abstract onPostResume()V
.end method

.method onPrepareOptionsPanel(Landroid/view/View;Landroid/view/Menu;)Z
    .locals 2
    .parameter "view"
    .parameter "menu"

    .prologue
    .line 153
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0x10

    #v1=(PosByte);
    if-ge v0, v1, :cond_0

    .line 157
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    #v0=(Reference);
    invoke-virtual {v0, p2}, Landroid/support/v7/app/ActionBarActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z

    move-result v0

    .line 159
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;

    #v0=(Reference);
    invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnPrepareOptionsPanel(Landroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method abstract onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
.end method

.method abstract onStop()V
.end method

.method abstract onTitleChanged(Ljava/lang/CharSequence;)V
.end method

.method abstract setContentView(I)V
.end method

.method abstract setContentView(Landroid/view/View;)V
.end method

.method abstract setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
.end method

.method abstract setSupportProgress(I)V
.end method

.method abstract setSupportProgressBarIndeterminate(Z)V
.end method

.method abstract setSupportProgressBarIndeterminateVisibility(Z)V
.end method

.method abstract setSupportProgressBarVisibility(Z)V
.end method

.method abstract startSupportActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
.end method

.method abstract supportInvalidateOptionsMenu()V
.end method

.method abstract supportRequestWindowFeature(I)Z
.end method

*/}
