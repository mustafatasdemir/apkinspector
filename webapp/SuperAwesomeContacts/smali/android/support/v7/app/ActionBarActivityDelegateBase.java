package android.support.v7.app; class ActionBarActivityDelegateBase { void a() { int a;
a=0;// .class Landroid/support/v7/app/ActionBarActivityDelegateBase;
a=0;// .super Landroid/support/v7/app/ActionBarActivityDelegate;
a=0;// .source "ActionBarActivityDelegateBase.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ACTION_BAR_DRAWABLE_TOGGLE_ATTRS:[I
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "ActionBarActivityDelegateBase"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;// .field private mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;// .field private mClosingActionMenu:Z
a=0;// 
a=0;// .field private mFeatureIndeterminateProgress:Z
a=0;// 
a=0;// .field private mFeatureProgress:Z
a=0;// 
a=0;// .field private mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;// .field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mPanelFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;// .field private mPanelIsPrepared:Z
a=0;// 
a=0;// .field private mPanelRefreshContent:Z
a=0;// 
a=0;// .field private mSubDecorInstalled:Z
a=0;// 
a=0;// .field private mTitleToSet:Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     sget v2, Landroid/support/v7/appcompat/R$attr;->homeAsUpIndicator:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ACTION_BAR_DRAWABLE_TOGGLE_ATTRS:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;//     .locals 0
a=0;//     .param p1, "activity"    # Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegate;-><init>(Landroid/support/v7/app/ActionBarActivity;)V
a=0;// 
a=0;//     .line 78
a=0;//     #p0=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateBase;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$002(Landroid/support/v7/app/ActionBarActivityDelegateBase;Landroid/support/v7/view/ActionMode;)Landroid/support/v7/view/ActionMode;
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v7/app/ActionBarActivityDelegateBase;
a=0;//     .param p1, "x1"    # Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     return-object p1
a=0;// .end method
a=0;// 
a=0;// .method private applyFixedSizeWindow()V
a=0;//     .locals 13
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     iget-object v11, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     sget-object v12, Landroid/support/v7/appcompat/R$styleable;->ActionBarWindow:[I
a=0;// 
a=0;//     #v12=(Reference,[I);
a=0;//     invoke-virtual {v11, v12}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 239
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 240
a=0;//     .local v5, "mFixedWidthMajor":Landroid/util/TypedValue;
a=0;//     #v5=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 241
a=0;//     .local v6, "mFixedWidthMinor":Landroid/util/TypedValue;
a=0;//     #v6=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 242
a=0;//     .local v3, "mFixedHeightMajor":Landroid/util/TypedValue;
a=0;//     #v3=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 244
a=0;//     .local v4, "mFixedHeightMinor":Landroid/util/TypedValue;
a=0;//     #v4=(Null);
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_1
a=0;// 
a=0;//     .line 245
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     new-instance v5, Landroid/util/TypedValue;
a=0;// 
a=0;//     .end local v5    # "mFixedWidthMajor":Landroid/util/TypedValue;
a=0;//     #v5=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v5}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 246
a=0;//     .restart local v5    # "mFixedWidthMajor":Landroid/util/TypedValue;
a=0;//     :cond_0
a=0;//     #v5=(Reference,Landroid/util/TypedValue;);
a=0;//     const/4 v11, 0x3
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v0, v11, v5}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 248
a=0;//     :cond_1
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_3
a=0;// 
a=0;//     .line 249
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     new-instance v6, Landroid/util/TypedValue;
a=0;// 
a=0;//     .end local v6    # "mFixedWidthMinor":Landroid/util/TypedValue;
a=0;//     #v6=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 250
a=0;//     .restart local v6    # "mFixedWidthMinor":Landroid/util/TypedValue;
a=0;//     :cond_2
a=0;//     #v6=(Reference,Landroid/util/TypedValue;);
a=0;//     const/4 v11, 0x5
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v0, v11, v6}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 252
a=0;//     :cond_3
a=0;//     const/4 v11, 0x6
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_5
a=0;// 
a=0;//     .line 253
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     new-instance v3, Landroid/util/TypedValue;
a=0;// 
a=0;//     .end local v3    # "mFixedHeightMajor":Landroid/util/TypedValue;
a=0;//     #v3=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v3}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 254
a=0;//     .restart local v3    # "mFixedHeightMajor":Landroid/util/TypedValue;
a=0;//     :cond_4
a=0;//     #v3=(Reference,Landroid/util/TypedValue;);
a=0;//     const/4 v11, 0x6
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v0, v11, v3}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 256
a=0;//     :cond_5
a=0;//     const/4 v11, 0x4
a=0;// 
a=0;//     invoke-virtual {v0, v11}, Landroid/content/res/TypedArray;->hasValue(I)Z
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Boolean);
a=0;//     if-eqz v11, :cond_7
a=0;// 
a=0;//     .line 257
a=0;//     if-nez v4, :cond_6
a=0;// 
a=0;//     new-instance v4, Landroid/util/TypedValue;
a=0;// 
a=0;//     .end local v4    # "mFixedHeightMinor":Landroid/util/TypedValue;
a=0;//     #v4=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v4}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 258
a=0;//     .restart local v4    # "mFixedHeightMinor":Landroid/util/TypedValue;
a=0;//     :cond_6
a=0;//     #v4=(Reference,Landroid/util/TypedValue;);
a=0;//     const/4 v11, 0x4
a=0;// 
a=0;//     #v11=(PosByte);
a=0;//     invoke-virtual {v0, v11, v4}, Landroid/content/res/TypedArray;->getValue(ILandroid/util/TypedValue;)Z
a=0;// 
a=0;//     .line 261
a=0;//     :cond_7
a=0;//     iget-object v11, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v11}, Landroid/support/v7/app/ActionBarActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 262
a=0;//     .local v7, "metrics":Landroid/util/DisplayMetrics;
a=0;//     #v7=(Reference,Landroid/util/DisplayMetrics;);
a=0;//     iget v11, v7, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     iget v12, v7, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     if-ge v11, v12, :cond_c
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 263
a=0;//     .local v2, "isPortrait":Z
a=0;//     :goto_0
a=0;//     #v2=(Boolean);
a=0;//     const/4 v10, -0x1
a=0;// 
a=0;//     .line 264
a=0;//     .local v10, "w":I
a=0;//     #v10=(Byte);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     .line 266
a=0;//     .local v1, "h":I
a=0;//     #v1=(Byte);
a=0;//     if-eqz v2, :cond_d
a=0;// 
a=0;//     move-object v9, v6
a=0;// 
a=0;//     .line 267
a=0;//     .local v9, "tvw":Landroid/util/TypedValue;
a=0;//     :goto_1
a=0;//     #v9=(Reference,Landroid/util/TypedValue;);
a=0;//     if-eqz v9, :cond_8
a=0;// 
a=0;//     iget v11, v9, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     if-eqz v11, :cond_8
a=0;// 
a=0;//     .line 268
a=0;//     iget v11, v9, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     if-ne v11, v12, :cond_e
a=0;// 
a=0;//     .line 269
a=0;//     invoke-virtual {v9, v7}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     float-to-int v10, v11
a=0;// 
a=0;//     .line 275
a=0;//     :cond_8
a=0;//     :goto_2
a=0;//     #v10=(Integer);v11=(Integer);v12=(Integer);
a=0;//     if-eqz v2, :cond_f
a=0;// 
a=0;//     move-object v8, v3
a=0;// 
a=0;//     .line 276
a=0;//     .local v8, "tvh":Landroid/util/TypedValue;
a=0;//     :goto_3
a=0;//     #v8=(Reference,Landroid/util/TypedValue;);
a=0;//     if-eqz v8, :cond_9
a=0;// 
a=0;//     iget v11, v8, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     if-eqz v11, :cond_9
a=0;// 
a=0;//     .line 277
a=0;//     iget v11, v8, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     const/4 v12, 0x5
a=0;// 
a=0;//     #v12=(PosByte);
a=0;//     if-ne v11, v12, :cond_10
a=0;// 
a=0;//     .line 278
a=0;//     invoke-virtual {v8, v7}, Landroid/util/TypedValue;->getDimension(Landroid/util/DisplayMetrics;)F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     float-to-int v1, v11
a=0;// 
a=0;//     .line 284
a=0;//     :cond_9
a=0;//     :goto_4
a=0;//     #v1=(Integer);v11=(Integer);v12=(Integer);
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     if-ne v10, v11, :cond_a
a=0;// 
a=0;//     const/4 v11, -0x1
a=0;// 
a=0;//     if-eq v1, v11, :cond_b
a=0;// 
a=0;//     .line 285
a=0;//     :cond_a
a=0;//     iget-object v11, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v11=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v11}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-virtual {v11, v10, v1}, Landroid/view/Window;->setLayout(II)V
a=0;// 
a=0;//     .line 288
a=0;//     :cond_b
a=0;//     #v11=(Conflicted);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 289
a=0;//     return-void
a=0;// 
a=0;//     .line 262
a=0;//     .end local v1    # "h":I
a=0;//     .end local v2    # "isPortrait":Z
a=0;//     .end local v8    # "tvh":Landroid/util/TypedValue;
a=0;//     .end local v9    # "tvw":Landroid/util/TypedValue;
a=0;//     .end local v10    # "w":I
a=0;//     :cond_c
a=0;//     #v1=(Uninit);v2=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "h":I
a=0;//     .restart local v2    # "isPortrait":Z
a=0;//     .restart local v10    # "w":I
a=0;//     :cond_d
a=0;//     #v1=(Byte);v2=(Boolean);v10=(Byte);
a=0;//     move-object v9, v5
a=0;// 
a=0;//     .line 266
a=0;//     #v9=(Reference,Landroid/util/TypedValue;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 270
a=0;//     .restart local v9    # "tvw":Landroid/util/TypedValue;
a=0;//     :cond_e
a=0;//     #v12=(PosByte);
a=0;//     iget v11, v9, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     const/4 v12, 0x6
a=0;// 
a=0;//     if-ne v11, v12, :cond_8
a=0;// 
a=0;//     .line 271
a=0;//     iget v11, v7, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     int-to-float v11, v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     iget v12, v7, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     int-to-float v12, v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     invoke-virtual {v9, v11, v12}, Landroid/util/TypedValue;->getFraction(FF)F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     float-to-int v10, v11
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_f
a=0;//     #v11=(Integer);v12=(Integer);
a=0;//     move-object v8, v4
a=0;// 
a=0;//     .line 275
a=0;//     #v8=(Reference,Landroid/util/TypedValue;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 279
a=0;//     .restart local v8    # "tvh":Landroid/util/TypedValue;
a=0;//     :cond_10
a=0;//     #v12=(PosByte);
a=0;//     iget v11, v8, Landroid/util/TypedValue;->type:I
a=0;// 
a=0;//     const/4 v12, 0x6
a=0;// 
a=0;//     if-ne v11, v12, :cond_9
a=0;// 
a=0;//     .line 280
a=0;//     iget v11, v7, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     int-to-float v11, v11
a=0;// 
a=0;//     #v11=(Float);
a=0;//     iget v12, v7, Landroid/util/DisplayMetrics;->heightPixels:I
a=0;// 
a=0;//     #v12=(Integer);
a=0;//     int-to-float v12, v12
a=0;// 
a=0;//     #v12=(Float);
a=0;//     invoke-virtual {v8, v11, v12}, Landroid/util/TypedValue;->getFraction(FF)F
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     float-to-int v1, v11
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_4
a=0;// .end method
a=0;// 
a=0;// .method private getCircularProgressBar()Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 573
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     sget v2, Landroid/support/v7/appcompat/R$id;->progress_circular:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     .line 574
a=0;//     .local v0, "pb":Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 575
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 577
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getHorizontalProgressBar()Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 581
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     sget v2, Landroid/support/v7/appcompat/R$id;->progress_horizontal:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/widget/ActionBarView;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     .line 582
a=0;//     .local v0, "pb":Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 583
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 585
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private getListMenuView(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "cb"    # Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 441
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 442
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 461
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 445
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 446
a=0;//     sget-object v2, Landroid/support/v7/appcompat/R$styleable;->Theme:[I
a=0;// 
a=0;//     invoke-virtual {p1, v2}, Landroid/content/Context;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 447
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v2, 0x4
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$style;->Theme_AppCompat_CompactMenu:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v0, v2, v3}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 450
a=0;//     .local v1, "listPresenterTheme":I
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 452
a=0;//     new-instance v2, Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$layout;->abc_list_menu_item_layout:I
a=0;// 
a=0;//     invoke-direct {v2, v3, v1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;-><init>(II)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     iput-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     .line 454
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 455
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 461
a=0;//     .end local v0    # "a":Landroid/content/res/TypedArray;
a=0;//     .end local v1    # "listPresenterTheme":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     new-instance v3, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     invoke-direct {v3, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/FrameLayout;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 458
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mListMenuPresenter:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->updateMenuView(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private hideProgressBars(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS;)V
a=0;//     .locals 2
a=0;//     .param p1, "horizontalProgressBar"    # Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     .param p2, "spinnyProgressBar"    # Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     .line 564
a=0;//     #v1=(PosByte);
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 565
a=0;//     invoke-virtual {p2, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 567
a=0;//     :cond_0
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 568
a=0;//     invoke-virtual {p1, v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 570
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initializePanelMenu()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 589
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getActionBarThemedContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 590
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setCallback(Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;)V
a=0;// 
a=0;//     .line 591
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method private preparePanel()Z
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 596
a=0;//     #v1=(Null);
a=0;//     iget-boolean v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelIsPrepared:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 659
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 601
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Null);v2=(Boolean);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-boolean v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelRefreshContent:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 602
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 603
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->initializePanelMenu()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 604
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 608
a=0;//     :cond_3
a=0;//     #v0=(One);v2=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     .line 609
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v2, v3, p0}, Landroid/support/v7/internal/widget/ActionBarView;->setMenu(Landroid/support/v4/internal/view/SupportMenu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 614
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 617
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v2, v1, v3}, Landroid/support/v7/app/ActionBarActivity;->superOnCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_6
a=0;// 
a=0;//     .line 619
a=0;//     iput-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 621
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     .line 623
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0, v4, p0}, Landroid/support/v7/internal/widget/ActionBarView;->setMenu(Landroid/support/v4/internal/view/SupportMenu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     :cond_5
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 626
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 629
a=0;//     :cond_6
a=0;//     #v0=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelRefreshContent:Z
a=0;// 
a=0;//     .line 634
a=0;//     :cond_7
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 638
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     if-eqz v2, :cond_8
a=0;// 
a=0;//     .line 639
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     #v3=(Reference,Landroid/os/Bundle;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->restoreActionViewStates(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 640
a=0;//     iput-object v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 644
a=0;//     :cond_8
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v2, v1, v4, v3}, Landroid/support/v7/app/ActionBarActivity;->superOnPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_a
a=0;// 
a=0;//     .line 645
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     if-eqz v0, :cond_9
a=0;// 
a=0;//     .line 648
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0, v4, p0}, Landroid/support/v7/internal/widget/ActionBarView;->setMenu(Landroid/support/v4/internal/view/SupportMenu;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 650
a=0;//     :cond_9
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 651
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 654
a=0;//     :cond_a
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 657
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelIsPrepared:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private reopenMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "toggleMenuMode"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 426
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->isOverflowReserved()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 427
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     if-nez p2, :cond_2
a=0;// 
a=0;//     .line 428
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 429
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->showOverflowMenu()Z
a=0;// 
a=0;//     .line 438
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 432
a=0;//     :cond_2
a=0;//     #v0=(Boolean);
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->hideOverflowMenu()Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 437
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private showProgressBars(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS;)V
a=0;//     .locals 3
a=0;//     .param p1, "horizontalProgressBar"    # Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     .param p2, "spinnyProgressBar"    # Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 553
a=0;//     #v2=(Null);
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p2}, Landroid/support/v7/internal/widget/ProgressBarICS;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     .line 554
a=0;//     invoke-virtual {p2, v2}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 557
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/widget/ProgressBarICS;->getProgress()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0x2710
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     if-ge v0, v1, :cond_1
a=0;// 
a=0;//     .line 558
a=0;//     invoke-virtual {p1, v2}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 560
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateProgressBars(I)V
a=0;//     .locals 8
a=0;//     .param p1, "value"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x8
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/16 v6, 0x2710
a=0;// 
a=0;//     #v6=(PosShort);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 513
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getCircularProgressBar()Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 514
a=0;//     .local v0, "circularProgressBar":Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getHorizontalProgressBar()Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 516
a=0;//     .local v1, "horizontalProgressBar":Landroid/support/v7/internal/widget/ProgressBarICS;
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ProgressBarICS;);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-ne p1, v5, :cond_4
a=0;// 
a=0;//     .line 517
a=0;//     iget-boolean v5, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 518
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->getProgress()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 519
a=0;//     .local v2, "level":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ProgressBarICS;->isIndeterminate()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     if-ge v2, v6, :cond_3
a=0;// 
a=0;//     :cond_0
a=0;//     move v3, v4
a=0;// 
a=0;//     .line 521
a=0;//     .local v3, "visibility":I
a=0;//     :goto_0
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v1, v3}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 523
a=0;//     .end local v2    # "level":I
a=0;//     .end local v3    # "visibility":I
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     iget-boolean v5, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z
a=0;// 
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 524
a=0;//     invoke-virtual {v0, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 549
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v4=(Integer);v5=(Byte);
a=0;//     return-void
a=0;// 
a=0;//     .line 519
a=0;//     .restart local v2    # "level":I
a=0;//     :cond_3
a=0;//     #v2=(Integer);v3=(Uninit);v4=(Null);v5=(Boolean);
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 526
a=0;//     .end local v2    # "level":I
a=0;//     :cond_4
a=0;//     #v2=(Uninit);v3=(Uninit);v5=(Byte);
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     if-ne p1, v5, :cond_6
a=0;// 
a=0;//     .line 527
a=0;//     iget-boolean v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 528
a=0;//     invoke-virtual {v1, v7}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     .line 530
a=0;//     :cond_5
a=0;//     iget-boolean v4, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z
a=0;// 
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 531
a=0;//     invoke-virtual {v0, v7}, Landroid/support/v7/internal/widget/ProgressBarICS;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 533
a=0;//     :cond_6
a=0;//     #v4=(Null);
a=0;//     const/4 v5, -0x3
a=0;// 
a=0;//     if-ne p1, v5, :cond_7
a=0;// 
a=0;//     .line 534
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setIndeterminate(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 535
a=0;//     :cond_7
a=0;//     #v4=(Null);
a=0;//     const/4 v5, -0x4
a=0;// 
a=0;//     if-ne p1, v5, :cond_8
a=0;// 
a=0;//     .line 536
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setIndeterminate(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 537
a=0;//     :cond_8
a=0;//     if-ltz p1, :cond_2
a=0;// 
a=0;//     if-gt p1, v6, :cond_2
a=0;// 
a=0;//     .line 541
a=0;//     add-int/lit8 v4, p1, 0x0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v7/internal/widget/ProgressBarICS;->setProgress(I)V
a=0;// 
a=0;//     .line 543
a=0;//     if-ge p1, v6, :cond_9
a=0;// 
a=0;//     .line 544
a=0;//     invoke-direct {p0, v1, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->showProgressBars(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 546
a=0;//     :cond_9
a=0;//     invoke-direct {p0, v1, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->hideProgressBars(Landroid/support/v7/internal/widget/ProgressBarICS;Landroid/support/v7/internal/widget/ProgressBarICS;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public addContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "lp"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     const v2, 0x1020002
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 145
a=0;//     .local v0, "contentParent":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V
a=0;// 
a=0;//     .line 147
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public createSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 82
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V
a=0;// 
a=0;//     .line 83
a=0;//     new-instance v0, Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/support/v7/app/ActionBarImplBase;-><init>(Landroid/support/v7/app/ActionBarActivity;Landroid/support/v7/app/ActionBar$Callback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarImplBase;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method final ensureSubDecor()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     const v9, 0x1020002
a=0;// 
a=0;//     .line 155
a=0;//     #v9=(Integer);
a=0;//     iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mSubDecorInstalled:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_4
a=0;// 
a=0;//     .line 156
a=0;//     iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mHasActionBar:Z
a=0;// 
a=0;//     if-eqz v7, :cond_7
a=0;// 
a=0;//     .line 157
a=0;//     iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mOverlayActionBar:Z
a=0;// 
a=0;//     if-eqz v7, :cond_5
a=0;// 
a=0;//     .line 158
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     sget v8, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_decor_overlay:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(I)V
a=0;// 
a=0;//     .line 162
a=0;//     :goto_0
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     sget v8, Landroid/support/v7/appcompat/R$id;->action_bar:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     check-cast v7, Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iput-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/internal/widget/ActionBarView;->setWindowCallback(Landroid/view/Window$Callback;)V
a=0;// 
a=0;//     .line 168
a=0;//     iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v7}, Landroid/support/v7/internal/widget/ActionBarView;->initProgress()V
a=0;// 
a=0;//     .line 171
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     iget-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_1
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v7}, Landroid/support/v7/internal/widget/ActionBarView;->initIndeterminateProgress()V
a=0;// 
a=0;//     .line 178
a=0;//     :cond_1
a=0;//     #v7=(Conflicted);
a=0;//     const-string v7, "splitActionBarWhenNarrow"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getUiOptionsFromMetadata()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 182
a=0;//     .local v6, "splitWhenNarrow":Z
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_6
a=0;// 
a=0;//     .line 183
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/support/v7/app/ActionBarActivity;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     sget v8, Landroid/support/v7/appcompat/R$bool;->abc_split_action_bar_is_narrow:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getBoolean(I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 192
a=0;//     .local v4, "splitActionBar":Z
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Boolean);v7=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     sget v8, Landroid/support/v7/appcompat/R$id;->split_action_bar:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     check-cast v5, Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .line 194
a=0;//     .local v5, "splitView":Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;//     if-eqz v5, :cond_2
a=0;// 
a=0;//     .line 195
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v7, v5}, Landroid/support/v7/internal/widget/ActionBarView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
a=0;// 
a=0;//     .line 196
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v7, v4}, Landroid/support/v7/internal/widget/ActionBarView;->setSplitActionBar(Z)V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v7, v6}, Landroid/support/v7/internal/widget/ActionBarView;->setSplitWhenNarrow(Z)V
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     sget v8, Landroid/support/v7/appcompat/R$id;->action_context_bar:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     check-cast v2, Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// 
a=0;//     .line 201
a=0;//     .local v2, "cab":Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;//     invoke-virtual {v2, v5}, Landroid/support/v7/internal/widget/ActionBarContextView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
a=0;// 
a=0;//     .line 202
a=0;//     invoke-virtual {v2, v4}, Landroid/support/v7/internal/widget/ActionBarContextView;->setSplitActionBar(Z)V
a=0;// 
a=0;//     .line 203
a=0;//     invoke-virtual {v2, v6}, Landroid/support/v7/internal/widget/ActionBarContextView;->setSplitWhenNarrow(Z)V
a=0;// 
a=0;//     .line 211
a=0;//     .end local v2    # "cab":Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;//     .end local v4    # "splitActionBar":Z
a=0;//     .end local v5    # "splitView":Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;//     .end local v6    # "splitWhenNarrow":Z
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v7, v9}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 212
a=0;//     .local v3, "content":Landroid/view/View;
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     invoke-virtual {v3, v7}, Landroid/view/View;->setId(I)V
a=0;// 
a=0;//     .line 213
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     sget v8, Landroid/support/v7/appcompat/R$id;->action_bar_activity_content:I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 214
a=0;//     .local v1, "abcContent":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v1, v9}, Landroid/view/View;->setId(I)V
a=0;// 
a=0;//     .line 217
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mTitleToSet:Ljava/lang/CharSequence;
a=0;// 
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     .line 218
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     iget-object v8, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mTitleToSet:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/internal/widget/ActionBarView;->setWindowTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 219
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     iput-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mTitleToSet:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 222
a=0;//     :cond_3
a=0;//     #v7=(Reference,Ljava/lang/CharSequence;);v8=(Conflicted);
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->applyFixedSizeWindow()V
a=0;// 
a=0;//     .line 224
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     iput-boolean v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mSubDecorInstalled:Z
a=0;// 
a=0;//     .line 227
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v7}, Landroid/support/v7/app/ActionBarActivity;->getWindow()Landroid/view/Window;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/view/Window;->getDecorView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     new-instance v8, Landroid/support/v7/app/ActionBarActivityDelegateBase$1;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegateBase$1;);
a=0;//     invoke-direct {v8, p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase$1;-><init>(Landroid/support/v7/app/ActionBarActivityDelegateBase;)V
a=0;// 
a=0;//     #v8=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateBase$1;);
a=0;//     invoke-virtual {v7, v8}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 234
a=0;//     .end local v1    # "abcContent":Landroid/view/View;
a=0;//     .end local v3    # "content":Landroid/view/View;
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 160
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Uninit);
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     sget v8, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_decor:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(I)V
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 186
a=0;//     .restart local v6    # "splitWhenNarrow":Z
a=0;//     :cond_6
a=0;//     #v6=(Boolean);v8=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     sget-object v8, Landroid/support/v7/appcompat/R$styleable;->ActionBarWindow:[I
a=0;// 
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 187
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {v0, v7, v8}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 189
a=0;//     .restart local v4    # "splitActionBar":Z
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 206
a=0;//     .end local v0    # "a":Landroid/content/res/TypedArray;
a=0;//     .end local v4    # "splitActionBar":Z
a=0;//     .end local v6    # "splitWhenNarrow":Z
a=0;//     :cond_7
a=0;//     #v0=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Boolean);v8=(Uninit);
a=0;//     iget-object v7, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     sget v8, Landroid/support/v7/appcompat/R$layout;->abc_simple_decor:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v7/app/ActionBarActivity;->superSetContentView(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method getHomeAsUpIndicatorAttrId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 506
a=0;//     sget v0, Landroid/support/v7/appcompat/R$attr;->homeAsUpIndicator:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onBackPressed()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 467
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/view/ActionMode;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 468
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/view/ActionMode;->finish()V
a=0;// 
a=0;//     .line 478
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 473
a=0;//     :cond_0
a=0;//     #v0=(One);v1=(Reference,Landroid/support/v7/view/ActionMode;);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->hasExpandedActionView()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 474
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActionBarView;->collapseActionView()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 478
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     iget-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mClosingActionMenu:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 374
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 370
a=0;//     :cond_0
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mClosingActionMenu:Z
a=0;// 
a=0;//     .line 371
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/app/ActionBarActivity;->closeOptionsMenu()V
a=0;// 
a=0;//     .line 372
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActionBarView;->dismissPopupMenus()V
a=0;// 
a=0;//     .line 373
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mClosingActionMenu:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 2
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     .line 90
a=0;//     iget-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mHasActionBar:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mSubDecorInstalled:Z
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     check-cast v0, Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .line 94
a=0;//     .local v0, "actionBar":Landroid/support/v7/app/ActionBarImplBase;
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarImplBase;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 96
a=0;//     .end local v0    # "actionBar":Landroid/support/v7/app/ActionBarImplBase;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onContentChanged()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 333
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 334
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnCreatePanelMenu(ILandroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 336
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onCreatePanelView(I)Landroid/view/View;
a=0;//     .locals 2
a=0;//     .param p1, "featureId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 324
a=0;//     .local v0, "createdPanelView":Landroid/view/View;
a=0;//     #v0=(Null);
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->preparePanel()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 325
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-direct {p0, v1, p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getListMenuView(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .end local v0    # "createdPanelView":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuView;);
a=0;//     check-cast v0, Landroid/view/View;
a=0;// 
a=0;//     .line 328
a=0;//     .restart local v0    # "createdPanelView":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 349
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 350
a=0;//     invoke-static {p2}, Landroid/support/v7/internal/view/menu/MenuWrapperFactory;->createMenuItemWrapper(Landroid/view/MenuItem;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     .line 352
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v7/app/ActionBarActivity;->superOnMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
a=0;//     .locals 2
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 357
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/support/v7/app/ActionBarActivity;->onMenuItemSelected(ILandroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onMenuModeChange(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 362
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->reopenMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;// 
a=0;//     .line 363
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
a=0;//     .locals 1
a=0;//     .param p1, "subMenu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 378
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onPostResume()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     check-cast v0, Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .line 109
a=0;//     .local v0, "ab":Landroid/support/v7/app/ActionBarImplBase;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 110
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setShowHideAnimationEnabled(Z)V
a=0;// 
a=0;//     .line 112
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "menu"    # Landroid/view/Menu;
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 342
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1, p2, p3}, Landroid/support/v7/app/ActionBarActivity;->superOnPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 344
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onStop()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     check-cast v0, Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .line 101
a=0;//     .local v0, "ab":Landroid/support/v7/app/ActionBarImplBase;
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 102
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->setShowHideAnimationEnabled(Z)V
a=0;// 
a=0;//     .line 104
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onTitleChanged(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 313
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/widget/ActionBarView;->setWindowTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 318
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 316
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mTitleToSet:Ljava/lang/CharSequence;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(I)V
a=0;//     .locals 3
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V
a=0;// 
a=0;//     .line 126
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     const v2, 0x1020002
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 127
a=0;//     .local v0, "contentParent":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->getLayoutInflater()Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1, p1, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V
a=0;// 
a=0;//     .line 130
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     const v2, 0x1020002
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 118
a=0;//     .local v0, "contentParent":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
a=0;// 
a=0;//     .line 119
a=0;//     invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V
a=0;// 
a=0;//     .line 121
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 3
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "lp"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->ensureSubDecor()V
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     const v2, 0x1020002
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/app/ActionBarActivity;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 136
a=0;//     .local v0, "contentParent":Landroid/view/ViewGroup;
a=0;//     invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V
a=0;// 
a=0;//     .line 137
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/app/ActionBarActivity;->onSupportContentChanged()V
a=0;// 
a=0;//     .line 139
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setSupportProgress(I)V
a=0;//     .locals 1
a=0;//     .param p1, "progress"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     add-int/lit8 v0, p1, 0x0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->updateProgressBars(I)V
a=0;// 
a=0;//     .line 502
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method setSupportProgressBarIndeterminate(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "indeterminate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 495
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->updateProgressBars(I)V
a=0;// 
a=0;//     .line 497
a=0;//     return-void
a=0;// 
a=0;//     .line 495
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, -0x4
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setSupportProgressBarIndeterminateVisibility(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 489
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->updateProgressBars(I)V
a=0;// 
a=0;//     .line 491
a=0;//     return-void
a=0;// 
a=0;//     .line 489
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setSupportProgressBarVisibility(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 483
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->updateProgressBars(I)V
a=0;// 
a=0;//     .line 485
a=0;//     return-void
a=0;// 
a=0;//     .line 483
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     const/4 v0, -0x2
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public startSupportActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
a=0;//     .locals 4
a=0;//     .param p1, "callback"    # Landroid/support/v7/view/ActionMode$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 383
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 384
a=0;//     new-instance v2, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v3, "ActionMode callback can not be null."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v2
a=0;// 
a=0;//     .line 387
a=0;//     :cond_0
a=0;//     #v2=(Uninit);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/view/ActionMode;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 388
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v7/view/ActionMode;->finish()V
a=0;// 
a=0;//     .line 391
a=0;//     :cond_1
a=0;//     new-instance v1, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;);
a=0;//     invoke-direct {v1, p0, p1}, Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;-><init>(Landroid/support/v7/app/ActionBarActivityDelegateBase;Landroid/support/v7/view/ActionMode$Callback;)V
a=0;// 
a=0;//     .line 393
a=0;//     .local v1, "wrappedCallback":Landroid/support/v7/view/ActionMode$Callback;
a=0;//     #v1=(Reference,Landroid/support/v7/app/ActionBarActivityDelegateBase$ActionModeCallbackWrapper;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->getSupportActionBar()Landroid/support/v7/app/ActionBar;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBar;);
a=0;//     check-cast v0, Landroid/support/v7/app/ActionBarImplBase;
a=0;// 
a=0;//     .line 394
a=0;//     .local v0, "ab":Landroid/support/v7/app/ActionBarImplBase;
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 395
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/app/ActionBarImplBase;->startActionMode(Landroid/support/v7/view/ActionMode$Callback;)Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     .line 398
a=0;//     :cond_2
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 399
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/view/ActionMode;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/app/ActionBarActivity;->onSupportActionModeStarted(Landroid/support/v7/view/ActionMode;)V
a=0;// 
a=0;//     .line 401
a=0;//     :cond_3
a=0;//     #v3=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionMode:Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     return-object v2
a=0;// .end method
a=0;// 
a=0;// .method public supportInvalidateOptionsMenu()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 406
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 407
a=0;//     new-instance v0, Landroid/os/Bundle;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Bundle;);
a=0;//     invoke-direct {v0}, Landroid/os/Bundle;-><init>()V
a=0;// 
a=0;//     .line 408
a=0;//     .local v0, "savedActionViewStates":Landroid/os/Bundle;
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->saveActionViewStates(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 409
a=0;//     invoke-virtual {v0}, Landroid/os/Bundle;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_0
a=0;// 
a=0;//     .line 410
a=0;//     iput-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelFrozenActionViewState:Landroid/os/Bundle;
a=0;// 
a=0;//     .line 413
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 414
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->clear()V
a=0;// 
a=0;//     .line 416
a=0;//     .end local v0    # "savedActionViewStates":Landroid/os/Bundle;
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelRefreshContent:Z
a=0;// 
a=0;//     .line 419
a=0;//     iget-object v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActionBarView:Landroid/support/v7/internal/widget/ActionBarView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 420
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mPanelIsPrepared:Z
a=0;// 
a=0;//     .line 421
a=0;//     invoke-direct {p0}, Landroid/support/v7/app/ActionBarActivityDelegateBase;->preparePanel()Z
a=0;// 
a=0;//     .line 423
a=0;//     :cond_2
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public supportRequestWindowFeature(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "featureId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 293
a=0;//     #v0=(One);
a=0;//     packed-switch p1, :pswitch_data_0
a=0;// 
a=0;//     .line 307
a=0;//     :pswitch_0
a=0;//     iget-object v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mActivity:Landroid/support/v7/app/ActionBarActivity;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/app/ActionBarActivity;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/app/ActionBarActivity;->requestWindowFeature(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     .line 295
a=0;//     :pswitch_1
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mHasActionBar:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 298
a=0;//     :pswitch_2
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mOverlayActionBar:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 301
a=0;//     :pswitch_3
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureProgress:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 304
a=0;//     :pswitch_4
a=0;//     iput-boolean v0, p0, Landroid/support/v7/app/ActionBarActivityDelegateBase;->mFeatureIndeterminateProgress:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 293
a=0;//     #v0=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x2
a=0;//         :pswitch_3
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_4
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
}}
