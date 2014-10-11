package android.support.v7.app; class ActionBarActivityDelegate { void a() { int a;
a=0;// .class abstract Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarActivityDelegate.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/app/ActionBarActivityDelegate$1;,
a=0;//         Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final METADATA_UI_OPTIONS:Ljava/lang/String; = "android.support.UI_OPTIONS"
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ActionBarActivityDelegate"
a=0;// 
a=0;// .field static final UIOPTION_SPLIT_ACTION_BAR_WHEN_NARROW:Ljava/lang/String; = "splitActionBarWhenNarrow"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;// .field final mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;// .field private mEnableDefaultActionBarUp:Z
a=0;// 
a=0;// .field mHasActionBar:Z
a=0;// 
a=0;// .field private mMenuInflater:Landroid/view/MenuInflater;
a=0;// 
a=0;// .field mOverlayActionBar:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegate;);
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .line 76
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static createDelegate(Landroid/support/v7/app/ActionBarActivity;)Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;//     .locals 2
a=0;//     .param p0, "activity"    # Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x14
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateApi20;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegateApi20;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateApi20;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     .line 58
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 49
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x12
a=0;// 
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateJBMR2;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 51
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     if-lt v0, v1, :cond_2
a=0;// 
a=0;//     .line 52
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateJB;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegateJB;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateJB;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateJB;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 53
a=0;//     :cond_2
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     if-lt v0, v1, :cond_3
a=0;// 
a=0;//     .line 54
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateICS;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegateICS;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateICS;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateICS;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 55
a=0;//     :cond_3
a=0;//     #v0=(Integer);
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     if-lt v0, v1, :cond_4
a=0;// 
a=0;//     .line 56
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateHC;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegateHC;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateHC;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateHC;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 58
a=0;//     :cond_4
a=0;//     #v0=(Integer);
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegateBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegateBase;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateBase;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method abstract addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// .end method
a=0;// 
a=0;// .method abstract createSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;// .end method
a=0;// 
a=0;// .method protected final getActionBarThemedContext()Landroid/content/Context;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .line 208
a=0;//     .local v1, "context":Landroid/content/Context;
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegate;->getSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 209
a=0;//     .local v0, "ab":Landroid/support/v7/app/ActionBar;
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 210
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBar;->getThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 212
a=0;//     :cond_0
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method final getDrawerToggleDelegate()Landroid/support/v4/app/ActionBarDrawerToggle$Delegate;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {v0, p0, v1}, Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;-><init>(Landroid/support/v7/app/ActionBarActivityDelegate;Landroid/support/v7/app/ActionBarActivityDelegate$1;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegate$ActionBarDrawableToggleImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method abstract getHomeAsUpIndicatorAttrId()I
a=0;// .end method
a=0;// 
a=0;// .method getMenuInflater()Landroid/view/MenuInflater;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mMenuInflater:Landroid/view/MenuInflater;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuInflater;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 100
a=0;//     new-instance v0, Landroid/support/v7/internal/view/SupportMenuInflater;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegate;->getActionBarThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v7/internal/view/SupportMenuInflater;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/SupportMenuInflater;);
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mMenuInflater:Landroid/view/MenuInflater;
a=0;// 
a=0;//     .line 102
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mMenuInflater:Landroid/view/MenuInflater;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method final getSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mHasActionBar:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mOverlayActionBar:Z
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 84
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 85
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegate;->createSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     .line 87
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mEnableDefaultActionBarUp:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 88
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V
a=0;// 
a=0;//     .line 95
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 93
a=0;//     :cond_2
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected final getUiOptionsFromMetadata()Ljava/lang/String;
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 188
a=0;//     :try_start_0
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v4}, Landroid/support/v7/app/ActionBarActivity;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 189
a=0;//     .local v2, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     iget-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v7/app/ActionBarActivity;->getComponentName()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     const/16 v5, 0x80
a=0;// 
a=0;//     #v5=(PosShort);
a=0;//     invoke-virtual {v2, v4, v5}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 192
a=0;//     .local v1, "info":Landroid/content/pm/ActivityInfo;
a=0;//     #v1=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 193
a=0;//     .local v3, "uiOptions":Ljava/lang/String;
a=0;//     #v3=(Null);
a=0;//     iget-object v4, v1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 194
a=0;//     iget-object v4, v1, Landroid/content/pm/ActivityInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v5, "android.support.UI_OPTIONS"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 200
a=0;//     .end local v1    # "info":Landroid/content/pm/ActivityInfo;
a=0;//     .end local v2    # "pm":Landroid/content/pm/PackageManager;
a=0;//     .end local v3    # "uiOptions":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 197
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 198
a=0;//     .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v4, "ActionBarActivityDelegate"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v5, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v6, "getUiOptionsFromMetadata: Activity \'"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     const-string v6, "\' not in manifest"
a=0;// 
a=0;//     invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-static {v4, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 200
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method abstract onBackPressed()Z
a=0;// .end method
a=0;// 
a=0;// .method abstract onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// .end method
a=0;// 
a=0;// .method abstract onContentChanged()V
a=0;// .end method
a=0;// 
a=0;// .method onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 5
a=0;//     .param p1, "savedInstanceState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 106
a=0;//     #v3=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     sget-object v2, Landroid/support/v7/appcompat/R$styleable;->ActionBarWindow:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 108
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 109
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 110
a=0;//     new-instance v1, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v2, "You need to use a Theme.AppCompat theme (or descendant) with this activity."
a=0;// 
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 114
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mHasActionBar:Z
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v0, v4, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mOverlayActionBar:Z
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-static {v1}, Landroid/support/v4/app/NavUtils;->getParentActivityName(Landroid/app/Activity;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 119
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 120
a=0;//     iput-boolean v4, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mEnableDefaultActionBarUp:Z
a=0;// 
a=0;//     .line 125
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 122
a=0;//     :cond_2
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActionBar:Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v7/app/ActionBar;->setDisplayHomeAsUpEnabled(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method abstract onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// .end method
a=0;// 
a=0;// .method abstract onCreatePanelView(I)Landroid/view/View;
a=0;// .end method
a=0;// 
a=0;// .method abstract onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;// .end method
a=0;// 
a=0;// .method abstract onPostResume()V
a=0;// .end method
a=0;// 
a=0;// .method onPrepareOptionsPanel(Landroid/view/View;Landroid/view/Menu;)Z
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 153
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x10
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     .line 157
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p2}, Landroid/support/v7/app/ActionBarActivity;->onPrepareOptionsMenu(Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 159
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegate;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnPrepareOptionsPanel(Landroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method abstract onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;// .end method
a=0;// 
a=0;// .method abstract onStop()V
a=0;// .end method
a=0;// 
a=0;// .method abstract onTitleChanged(Ljava/lang/CharSequence;)V
a=0;// .end method
a=0;// 
a=0;// .method abstract setContentView(I)V
a=0;// .end method
a=0;// 
a=0;// .method abstract setContentView(Landroid/view/View;)V
a=0;// .end method
a=0;// 
a=0;// .method abstract setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// .end method
a=0;// 
a=0;// .method abstract setSupportProgress(I)V
a=0;// .end method
a=0;// 
a=0;// .method abstract setSupportProgressBarIndeterminate(Z)V
a=0;// .end method
a=0;// 
a=0;// .method abstract setSupportProgressBarIndeterminateVisibility(Z)V
a=0;// .end method
a=0;// 
a=0;// .method abstract setSupportProgressBarVisibility(Z)V
a=0;// .end method
a=0;// 
a=0;// .method abstract startSupportActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
a=0;// .end method
a=0;// 
a=0;// .method abstract supportInvalidateOptionsMenu()V
a=0;// .end method
a=0;// 
a=0;// .method abstract supportRequestWindowFeature(I)Z
a=0;// .end method
}}
