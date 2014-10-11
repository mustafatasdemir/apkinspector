package android.support.v7.widget; class SuggestionsAdapter { void a() { int a;
a=0;// .class Landroid/support/v7/widget/SuggestionsAdapter;
a=0;// .super Landroid/support/v4/widget/ResourceCursorAdapter;
a=0;// .source "SuggestionsAdapter.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final DBG:Z = false
a=0;// 
a=0;// .field static final INVALID_INDEX:I = -0x1
a=0;// 
a=0;// .field private static final LOG_TAG:Ljava/lang/String; = "SuggestionsAdapter"
a=0;// 
a=0;// .field private static final QUERY_LIMIT:I = 0x32
a=0;// 
a=0;// .field static final REFINE_ALL:I = 0x2
a=0;// 
a=0;// .field static final REFINE_BY_ENTRY:I = 0x1
a=0;// 
a=0;// .field static final REFINE_NONE:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mClosed:Z
a=0;// 
a=0;// .field private mFlagsCol:I
a=0;// 
a=0;// .field private mIconName1Col:I
a=0;// 
a=0;// .field private mIconName2Col:I
a=0;// 
a=0;// .field private mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/WeakHashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/drawable/Drawable$ConstantState;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mProviderContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mQueryRefinement:I
a=0;// 
a=0;// .field private mSearchManager:Landroid/app/SearchManager;
a=0;// 
a=0;// .field private mSearchView:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;// .field private mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;// .field private mText1Col:I
a=0;// 
a=0;// .field private mText2Col:I
a=0;// 
a=0;// .field private mText2UrlCol:I
a=0;// 
a=0;// .field private mUrlColor:Landroid/content/res/ColorStateList;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/support/v7/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "searchView"    # Landroid/support/v7/widget/SearchView;
a=0;//     .param p3, "searchable"    # Landroid/app/SearchableInfo;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             "Landroid/support/v7/widget/SearchView;",
a=0;//             "Landroid/app/SearchableInfo;",
a=0;//             "Ljava/util/WeakHashMap",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Landroid/graphics/drawable/Drawable$ConstantState;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p4, "outsideDrawablesCache":Ljava/util/WeakHashMap;, "Ljava/util/WeakHashMap<Ljava/lang/String;Landroid/graphics/drawable/Drawable$ConstantState;>;"
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     .line 94
a=0;//     #v2=(Byte);
a=0;//     sget v0, Landroid/support/v7/appcompat/R$layout;->abc_search_dropdown_item_icons_2line:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, v0, v1, v3}, Landroid/support/v4/widget/ResourceCursorAdapter;-><init>(Landroid/content/Context;ILandroid/database/Cursor;Z)V
a=0;// 
a=0;//     .line 72
a=0;//     #p0=(Reference,Landroid/support/v7/widget/SuggestionsAdapter;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mClosed:Z
a=0;// 
a=0;//     .line 73
a=0;//     iput v3, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I
a=0;// 
a=0;//     .line 81
a=0;//     iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText1Col:I
a=0;// 
a=0;//     .line 82
a=0;//     iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2Col:I
a=0;// 
a=0;//     .line 83
a=0;//     iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2UrlCol:I
a=0;// 
a=0;//     .line 84
a=0;//     iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName1Col:I
a=0;// 
a=0;//     .line 85
a=0;//     iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName2Col:I
a=0;// 
a=0;//     .line 86
a=0;//     iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mFlagsCol:I
a=0;// 
a=0;//     .line 97
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     const-string v1, "search"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/app/SearchManager;
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchManager:Landroid/app/SearchManager;
a=0;// 
a=0;//     .line 98
a=0;//     iput-object p2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchView:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     .line 99
a=0;//     iput-object p3, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     .line 101
a=0;//     iput-object p1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 103
a=0;//     iput-object p4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     .line 104
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private checkIconCache(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 2
a=0;//     .param p1, "resourceUri"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 553
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/graphics/drawable/Drawable$ConstantState;
a=0;// 
a=0;//     .line 554
a=0;//     .local v0, "cached":Landroid/graphics/drawable/Drawable$ConstantState;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 555
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 558
a=0;//     :goto_0
a=0;//     return-object v1
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private formatUrl(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
a=0;//     .locals 8
a=0;//     .param p1, "url"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 329
a=0;//     #v2=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mUrlColor:Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/ColorStateList;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 331
a=0;//     new-instance v6, Landroid/util/TypedValue;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/util/TypedValue;);
a=0;//     invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V
a=0;// 
a=0;//     .line 332
a=0;//     .local v6, "colorValue":Landroid/util/TypedValue;
a=0;//     #v6=(Reference,Landroid/util/TypedValue;);
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v3, Landroid/support/v7/appcompat/R$attr;->textColorSearchUrl:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v0, v3, v6, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z
a=0;// 
a=0;//     .line 333
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v3, v6, Landroid/util/TypedValue;->resourceId:I
a=0;// 
a=0;//     invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mUrlColor:Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     .line 336
a=0;//     .end local v6    # "colorValue":Landroid/util/TypedValue;
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     new-instance v7, Landroid/text/SpannableString;
a=0;// 
a=0;//     #v7=(UninitRef,Landroid/text/SpannableString;);
a=0;//     invoke-direct {v7, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 337
a=0;//     .local v7, "text":Landroid/text/SpannableString;
a=0;//     #v7=(Reference,Landroid/text/SpannableString;);
a=0;//     new-instance v0, Landroid/text/style/TextAppearanceSpan;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/text/style/TextAppearanceSpan;);
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mUrlColor:Landroid/content/res/ColorStateList;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/res/ColorStateList;);
a=0;//     move v3, v2
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/text/style/TextAppearanceSpan;-><init>(Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/text/style/TextAppearanceSpan;);
a=0;//     invoke-interface {p1}, Ljava/lang/CharSequence;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v3, 0x21
a=0;// 
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v7, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V
a=0;// 
a=0;//     .line 340
a=0;//     return-object v7
a=0;// .end method
a=0;// 
a=0;// .method private getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 10
a=0;//     .param p1, "component"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 617
a=0;//     #v6=(Null);
a=0;//     iget-object v7, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 620
a=0;//     .local v5, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v5=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/16 v7, 0x80
a=0;// 
a=0;//     :try_start_0
a=0;//     #v7=(PosShort);
a=0;//     invoke-virtual {v5, p1, v7}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 625
a=0;//     .local v0, "activityInfo":Landroid/content/pm/ActivityInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     invoke-virtual {v0}, Landroid/content/pm/ActivityInfo;->getIconResource()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 626
a=0;//     .local v3, "iconId":I
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .line 634
a=0;//     .end local v0    # "activityInfo":Landroid/content/pm/ActivityInfo;
a=0;//     .end local v3    # "iconId":I
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/graphics/drawable/Drawable;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 621
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(PosShort);v8=(Uninit);v9=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 622
a=0;//     .local v2, "ex":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     const-string v7, "SuggestionsAdapter"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2}, Landroid/content/pm/PackageManager$NameNotFoundException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .line 623
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 627
a=0;//     .end local v2    # "ex":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     .restart local v0    # "activityInfo":Landroid/content/pm/ActivityInfo;
a=0;//     .restart local v3    # "iconId":I
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/content/pm/ActivityInfo;);v1=(Uninit);v2=(Uninit);v3=(Integer);v7=(PosShort);v8=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 628
a=0;//     .local v4, "pkg":Ljava/lang/String;
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     iget-object v7, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/pm/ApplicationInfo;);
a=0;//     invoke-virtual {v5, v4, v3, v7}, Landroid/content/pm/PackageManager;->getDrawable(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 629
a=0;//     .local v1, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 630
a=0;//     const-string v7, "SuggestionsAdapter"
a=0;// 
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Invalid icon resource "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     const-string v9, " for "
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v1, v6
a=0;// 
a=0;//     .line 632
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getActivityIconWithCache(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 6
a=0;//     .param p1, "component"    # Landroid/content/ComponentName;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 595
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 597
a=0;//     .local v1, "componentIconKey":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v5, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v5, v1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 598
a=0;//     iget-object v5, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v5=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v5, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/graphics/drawable/Drawable$ConstantState;
a=0;// 
a=0;//     .line 599
a=0;//     .local v0, "cached":Landroid/graphics/drawable/Drawable$ConstantState;
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 606
a=0;//     .end local v0    # "cached":Landroid/graphics/drawable/Drawable$ConstantState;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Landroid/graphics/drawable/Drawable;);v5=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 599
a=0;//     .restart local v0    # "cached":Landroid/graphics/drawable/Drawable$ConstantState;
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable$ConstantState;);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Reference,Ljava/util/WeakHashMap;);
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 602
a=0;//     .end local v0    # "cached":Landroid/graphics/drawable/Drawable$ConstantState;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v4=(Null);v5=(Boolean);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/widget/SuggestionsAdapter;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 604
a=0;//     .local v2, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     move-object v3, v4
a=0;// 
a=0;//     .line 605
a=0;//     .local v3, "toCache":Landroid/graphics/drawable/Drawable$ConstantState;
a=0;//     :goto_1
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable$ConstantState;);
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {v4, v1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-object v4, v2
a=0;// 
a=0;//     .line 606
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 604
a=0;//     .end local v3    # "toCache":Landroid/graphics/drawable/Drawable$ConstantState;
a=0;//     :cond_2
a=0;//     #v3=(Uninit);v4=(Null);
a=0;//     invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable$ConstantState;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 2
a=0;//     .param p0, "cursor"    # Landroid/database/Cursor;
a=0;//     .param p1, "columnName"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 646
a=0;//     invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 647
a=0;//     .local v0, "col":I
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method private getDefaultIcon1(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 2
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 576
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v1=(Reference,Landroid/app/SearchableInfo;);
a=0;//     invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/widget/SuggestionsAdapter;->getActivityIconWithCache(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 577
a=0;//     .local v0, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 582
a=0;//     .end local v0    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .restart local v0    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getDrawable(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 9
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 520
a=0;//     :try_start_0
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 521
a=0;//     .local v2, "scheme":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "android.resource"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 524
a=0;//     :try_start_1
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/widget/SuggestionsAdapter;->getDrawableFromResourceUri(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_1
a=0;//     .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 546
a=0;//     .end local v2    # "scheme":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference,Landroid/graphics/drawable/Drawable;);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v4
a=0;// 
a=0;//     .line 525
a=0;//     .restart local v2    # "scheme":Ljava/lang/String;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Boolean);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 526
a=0;//     .local v0, "ex":Landroid/content/res/Resources$NotFoundException;
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Landroid/content/res/Resources$NotFoundException;);
a=0;//     new-instance v4, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Resource does not exist: "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v4, v6}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v4
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
a=0;// 
a=0;//     .line 544
a=0;//     .end local v0    # "ex":Landroid/content/res/Resources$NotFoundException;
a=0;//     .end local v2    # "scheme":Ljava/lang/String;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 545
a=0;//     .local v1, "fnfe":Ljava/io/FileNotFoundException;
a=0;//     #v1=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     const-string v4, "SuggestionsAdapter"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Icon not found: "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, ", "
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-static {v4, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v4, v5
a=0;// 
a=0;//     .line 546
a=0;//     #v4=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 530
a=0;//     .end local v1    # "fnfe":Ljava/io/FileNotFoundException;
a=0;//     .restart local v2    # "scheme":Ljava/lang/String;
a=0;//     :cond_0
a=0;//     :try_start_3
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Reference,Ljava/lang/String;);v3=(Uninit);v4=(Boolean);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 531
a=0;//     .local v3, "stream":Ljava/io/InputStream;
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 532
a=0;//     new-instance v4, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "Failed to open "
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-direct {v4, v6}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v4
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     .line 535
a=0;//     :cond_1
a=0;//     #v6=(Uninit);v7=(Uninit);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     :try_start_4
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     :try_end_4
a=0;//     .catchall {:try_start_4 .. :try_end_4} :catchall_0
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 538
a=0;//     :try_start_5
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_5
a=0;//     .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 539
a=0;//     :catch_2
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 540
a=0;//     .local v0, "ex":Ljava/io/IOException;
a=0;//     :try_start_6
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v6, "SuggestionsAdapter"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Error closing icon stream for "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_6
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_1
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 537
a=0;//     .end local v0    # "ex":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v0=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v4
a=0;// 
a=0;//     .line 538
a=0;//     :try_start_7
a=0;//     #v4=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v3}, Ljava/io/InputStream;->close()V
a=0;//     :try_end_7
a=0;//     .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_1
a=0;// 
a=0;//     .line 541
a=0;//     :goto_1
a=0;//     :try_start_8
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     throw v4
a=0;// 
a=0;//     .line 539
a=0;//     :catch_3
a=0;//     #v0=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 540
a=0;//     .restart local v0    # "ex":Ljava/io/IOException;
a=0;//     #v0=(Reference,Ljava/io/IOException;);
a=0;//     const-string v6, "SuggestionsAdapter"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Error closing icon stream for "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;//     :try_end_8
a=0;//     .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private getDrawableFromResourceValue(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 9
a=0;//     .param p1, "drawableId"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 477
a=0;//     #v5=(Null);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->length()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     const-string v6, "0"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v6=(Conflicted);
a=0;//     move-object v0, v5
a=0;// 
a=0;//     .line 509
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 482
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Boolean);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 484
a=0;//     .local v3, "resourceId":I
a=0;//     #v3=(Integer);
a=0;//     new-instance v6, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v7, "android.resource://"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     const-string v7, "/"
a=0;// 
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 487
a=0;//     .local v1, "drawableUri":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/widget/SuggestionsAdapter;->checkIconCache(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 488
a=0;//     .local v0, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 492
a=0;//     iget-object v6, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 494
a=0;//     invoke-direct {p0, v1, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->storeInIconCache(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 496
a=0;//     .end local v0    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v1    # "drawableUri":Ljava/lang/String;
a=0;//     .end local v3    # "resourceId":I
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 498
a=0;//     .local v2, "nfe":Ljava/lang/NumberFormatException;
a=0;//     #v2=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/widget/SuggestionsAdapter;->checkIconCache(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 499
a=0;//     .restart local v0    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 502
a=0;//     invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 503
a=0;//     .local v4, "uri":Landroid/net/Uri;
a=0;//     #v4=(Reference,Landroid/net/Uri;);
a=0;//     invoke-direct {p0, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getDrawable(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 504
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->storeInIconCache(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 506
a=0;//     .end local v0    # "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v2    # "nfe":Ljava/lang/NumberFormatException;
a=0;//     .end local v4    # "uri":Landroid/net/Uri;
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v2=(Uninit);v4=(Uninit);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 508
a=0;//     .local v2, "nfe":Landroid/content/res/Resources$NotFoundException;
a=0;//     #v2=(Reference,Landroid/content/res/Resources$NotFoundException;);
a=0;//     const-string v6, "SuggestionsAdapter"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     new-instance v7, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v8, "Icon resource not found: "
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-object v0, v5
a=0;// 
a=0;//     .line 509
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getIcon1(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 4
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 355
a=0;//     iget v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName1Col:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, -0x1
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-ne v2, v3, :cond_1
a=0;// 
a=0;//     .line 356
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 363
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 358
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName1Col:I
a=0;// 
a=0;//     invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 359
a=0;//     .local v1, "value":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/widget/SuggestionsAdapter;->getDrawableFromResourceValue(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 360
a=0;//     .local v0, "drawable":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 363
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/widget/SuggestionsAdapter;->getDefaultIcon1(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private getIcon2(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 367
a=0;//     iget v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName2Col:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 368
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 371
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 370
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Integer);
a=0;//     iget v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName2Col:I
a=0;// 
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 371
a=0;//     .local v0, "value":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->getDrawableFromResourceValue(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;
a=0;//     .locals 4
a=0;//     .param p0, "cursor"    # Landroid/database/Cursor;
a=0;//     .param p1, "col"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 651
a=0;//     #v1=(Null);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     if-ne p1, v2, :cond_0
a=0;// 
a=0;//     .line 660
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 655
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Null);v2=(Byte);v3=(Uninit);
a=0;//     invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 656
a=0;//     :catch_0
a=0;//     #v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 657
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v2, "SuggestionsAdapter"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "unexpected error retrieving valid column from cursor, did the remote process die?"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setViewDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/widget/ImageView;
a=0;//     .param p2, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p3, "nullVisibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 381
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 383
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 384
a=0;//     invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 396
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 386
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 393
a=0;//     invoke-virtual {p2, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
a=0;// 
a=0;//     .line 394
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setViewText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "v"    # Landroid/widget/TextView;
a=0;//     .param p2, "text"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 345
a=0;//     invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 347
a=0;//     invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 348
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 352
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 350
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private storeInIconCache(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 2
a=0;//     .param p1, "resourceUri"    # Ljava/lang/String;
a=0;//     .param p2, "drawable"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 562
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 563
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/WeakHashMap;);
a=0;//     invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable$ConstantState;);
a=0;//     invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 565
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateSpinnerState(Landroid/database/Cursor;)V
a=0;//     .locals 2
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->getExtras()Landroid/os/Bundle;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 201
a=0;//     .local v0, "extras":Landroid/os/Bundle;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/os/Bundle;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "in_progress"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 206
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 193
a=0;//     .end local v0    # "extras":Landroid/os/Bundle;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
a=0;//     .locals 11
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v10, 0x8
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     .line 269
a=0;//     #v7=(One);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
a=0;// 
a=0;//     .line 271
a=0;//     .local v3, "views":Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 272
a=0;//     .local v0, "flags":I
a=0;//     #v0=(Null);
a=0;//     iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mFlagsCol:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     if-eq v4, v5, :cond_0
a=0;// 
a=0;//     .line 273
a=0;//     iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mFlagsCol:I
a=0;// 
a=0;//     invoke-interface {p3, v4}, Landroid/database/Cursor;->getInt(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 275
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 276
a=0;//     iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText1Col:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p3, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 277
a=0;//     .local v1, "text1":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-direct {p0, v4, v1}, Landroid/support/v7/widget/SuggestionsAdapter;->setViewText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 279
a=0;//     .end local v1    # "text1":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText2:Landroid/widget/TextView;
a=0;// 
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 281
a=0;//     iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2UrlCol:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {p3, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 282
a=0;//     .local v2, "text2":Ljava/lang/CharSequence;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_7
a=0;// 
a=0;//     .line 283
a=0;//     invoke-direct {p0, v2}, Landroid/support/v7/widget/SuggestionsAdapter;->formatUrl(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 290
a=0;//     :goto_0
a=0;//     invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_8
a=0;// 
a=0;//     .line 291
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 292
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v4, v8}, Landroid/widget/TextView;->setSingleLine(Z)V
a=0;// 
a=0;//     .line 293
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v4, v9}, Landroid/widget/TextView;->setMaxLines(I)V
a=0;// 
a=0;//     .line 301
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText2:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-direct {p0, v4, v2}, Landroid/support/v7/widget/SuggestionsAdapter;->setViewText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 304
a=0;//     .end local v2    # "text2":Ljava/lang/CharSequence;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon1:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     .line 305
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon1:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-direct {p0, p3}, Landroid/support/v7/widget/SuggestionsAdapter;->getIcon1(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v6, 0x4
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     invoke-direct {p0, v4, v5, v6}, Landroid/support/v7/widget/SuggestionsAdapter;->setViewDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 307
a=0;//     :cond_4
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon2:Landroid/widget/ImageView;
a=0;// 
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     .line 308
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon2:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-direct {p0, p3}, Landroid/support/v7/widget/SuggestionsAdapter;->getIcon2(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-direct {p0, v4, v5, v10}, Landroid/support/v7/widget/SuggestionsAdapter;->setViewDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
a=0;// 
a=0;//     .line 310
a=0;//     :cond_5
a=0;//     #v5=(Conflicted);
a=0;//     iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, v9, :cond_6
a=0;// 
a=0;//     iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I
a=0;// 
a=0;//     if-ne v4, v7, :cond_9
a=0;// 
a=0;//     and-int/lit8 v4, v0, 0x1
a=0;// 
a=0;//     if-eqz v4, :cond_9
a=0;// 
a=0;//     .line 313
a=0;//     :cond_6
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIconRefine:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     .line 314
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIconRefine:Landroid/widget/ImageView;
a=0;// 
a=0;//     iget-object v5, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 315
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIconRefine:Landroid/widget/ImageView;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 319
a=0;//     :goto_2
a=0;//     #v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 285
a=0;//     .restart local v2    # "text2":Ljava/lang/CharSequence;
a=0;//     :cond_7
a=0;//     #v2=(Reference,Ljava/lang/String;);v4=(Integer);v5=(Byte);v6=(Uninit);
a=0;//     iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2Col:I
a=0;// 
a=0;//     invoke-static {p3, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 296
a=0;//     :cond_8
a=0;//     #v4=(Boolean);
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 297
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/TextView;->setSingleLine(Z)V
a=0;// 
a=0;//     .line 298
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Landroid/widget/TextView;->setMaxLines(I)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 317
a=0;//     .end local v2    # "text2":Ljava/lang/CharSequence;
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIconRefine:Landroid/widget/ImageView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/ImageView;);
a=0;//     invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setVisibility(I)V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method public changeCursor(Landroid/database/Cursor;)V
a=0;//     .locals 3
a=0;//     .param p1, "c"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     .line 215
a=0;//     iget-boolean v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mClosed:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 216
a=0;//     const-string v1, "SuggestionsAdapter"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Tried to change cursor after adapter was closed."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     .line 217
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/database/Cursor;->close()V
a=0;// 
a=0;//     .line 235
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 222
a=0;//     :cond_1
a=0;//     :try_start_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(Uninit);
a=0;//     invoke-super {p0, p1}, Landroid/support/v4/widget/ResourceCursorAdapter;->changeCursor(Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 224
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 225
a=0;//     const-string v1, "suggest_text_1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText1Col:I
a=0;// 
a=0;//     .line 226
a=0;//     const-string v1, "suggest_text_2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2Col:I
a=0;// 
a=0;//     .line 227
a=0;//     const-string v1, "suggest_text_2_url"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2UrlCol:I
a=0;// 
a=0;//     .line 228
a=0;//     const-string v1, "suggest_icon_1"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName1Col:I
a=0;// 
a=0;//     .line 229
a=0;//     const-string v1, "suggest_icon_2"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName2Col:I
a=0;// 
a=0;//     .line 230
a=0;//     const-string v1, "suggest_flags"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mFlagsCol:I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 232
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 233
a=0;//     .local v0, "e":Ljava/lang/Exception;
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "SuggestionsAdapter"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "error changing cursor and caching columns"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->changeCursor(Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mClosed:Z
a=0;// 
a=0;//     .line 174
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
a=0;//     .locals 5
a=0;//     .param p1, "cursor"    # Landroid/database/Cursor;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 408
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 431
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Reference,Ljava/lang/String;);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 412
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     const-string v4, "suggest_intent_query"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 413
a=0;//     .local v1, "query":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 417
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/app/SearchableInfo;->shouldRewriteQueryFromData()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 418
a=0;//     const-string v4, "suggest_intent_data"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 419
a=0;//     .local v0, "data":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 420
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 424
a=0;//     .end local v0    # "data":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/SearchableInfo;);
a=0;//     invoke-virtual {v4}, Landroid/app/SearchableInfo;->shouldRewriteQueryFromText()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 425
a=0;//     const-string v4, "suggest_text_1"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p1, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 426
a=0;//     .local v2, "text1":Ljava/lang/String;
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 427
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v2    # "text1":Ljava/lang/String;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     move-object v1, v3
a=0;// 
a=0;//     .line 431
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getDrawableFromResourceUri(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
a=0;//     .locals 10
a=0;//     .param p1, "uri"    # Landroid/net/Uri;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/FileNotFoundException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 669
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 671
a=0;//     .local v0, "authority":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-eqz v7, :cond_0
a=0;// 
a=0;//     .line 672
a=0;//     new-instance v7, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "No authority: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 675
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v7=(Boolean);v8=(Null);v9=(One);
a=0;//     iget-object v7, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     invoke-virtual {v7, v0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 680
a=0;//     .local v6, "r":Landroid/content/res/Resources;
a=0;//     #v6=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 681
a=0;//     .local v5, "path":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     #v5=(Reference,Ljava/util/List;);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 682
a=0;//     new-instance v7, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "No path: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 676
a=0;//     .end local v5    # "path":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .end local v6    # "r":Landroid/content/res/Resources;
a=0;//     :catch_0
a=0;//     #v5=(Uninit);v6=(Uninit);v7=(Conflicted);v8=(Null);v9=(One);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 677
a=0;//     .local v2, "ex":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     #v2=(Reference,Landroid/content/pm/PackageManager$NameNotFoundException;);
a=0;//     new-instance v7, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "No package found for authority: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 684
a=0;//     .end local v2    # "ex":Landroid/content/pm/PackageManager$NameNotFoundException;
a=0;//     .restart local v5    # "path":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;"
a=0;//     .restart local v6    # "r":Landroid/content/res/Resources;
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v5=(Reference,Ljava/util/List;);v6=(Reference,Landroid/content/res/Resources;);v8=(Null);v9=(One);
a=0;//     invoke-interface {v5}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 686
a=0;//     .local v4, "len":I
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v9, :cond_2
a=0;// 
a=0;//     .line 688
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v7=(Null);
a=0;//     invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Ljava/lang/String;
a=0;// 
a=0;//     invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 697
a=0;//     .local v3, "id":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);v8=(Reference,Ljava/lang/String;);
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 698
a=0;//     new-instance v7, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "No resource found for: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 689
a=0;//     .end local v3    # "id":I
a=0;//     :catch_1
a=0;//     #v3=(Uninit);v8=(Null);v9=(One);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 690
a=0;//     .local v1, "e":Ljava/lang/NumberFormatException;
a=0;//     #v1=(Reference,Ljava/lang/NumberFormatException;);
a=0;//     new-instance v7, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "Single path segment is not a resource ID: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 692
a=0;//     .end local v1    # "e":Ljava/lang/NumberFormatException;
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v8=(Null);v9=(One);
a=0;//     const/4 v7, 0x2
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     if-ne v4, v7, :cond_3
a=0;// 
a=0;//     .line 693
a=0;//     invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v7, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v6, v7, v8, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .restart local v3    # "id":I
a=0;//     #v3=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 695
a=0;//     .end local v3    # "id":I
a=0;//     :cond_3
a=0;//     #v3=(Uninit);v7=(PosByte);v8=(Null);
a=0;//     new-instance v7, Ljava/io/FileNotFoundException;
a=0;// 
a=0;//     #v7=(UninitRef,Ljava/io/FileNotFoundException;);
a=0;//     new-instance v8, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v9, "More than two path segments: "
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v7=(Reference,Ljava/io/FileNotFoundException;);
a=0;//     throw v7
a=0;// 
a=0;//     .line 700
a=0;//     .restart local v3    # "id":I
a=0;//     :cond_4
a=0;//     #v3=(Integer);v9=(One);
a=0;//     invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     return-object v7
a=0;// .end method
a=0;// 
a=0;// .method public getQueryRefinement()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getSearchManagerSuggestions(Landroid/app/SearchableInfo;Ljava/lang/String;I)Landroid/database/Cursor;
a=0;//     .locals 9
a=0;//     .param p1, "searchable"    # Landroid/app/SearchableInfo;
a=0;//     .param p2, "query"    # Ljava/lang/String;
a=0;//     .param p3, "limit"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 707
a=0;//     #v2=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 748
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/database/Cursor;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 711
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
a=0;//     invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 712
a=0;//     .local v6, "authority":Ljava/lang/String;
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 716
a=0;//     new-instance v0, Landroid/net/Uri$Builder;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/net/Uri$Builder;);
a=0;//     invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/net/Uri$Builder;);
a=0;//     const-string v5, "content"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v5}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, v6}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v5, ""
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     .line 723
a=0;//     .local v8, "uriBuilder":Landroid/net/Uri$Builder;
a=0;//     #v8=(Reference,Landroid/net/Uri$Builder;);
a=0;//     invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestPath()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 724
a=0;//     .local v7, "contentPath":Ljava/lang/String;
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 725
a=0;//     invoke-virtual {v8, v7}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     .line 729
a=0;//     :cond_2
a=0;//     const-string v0, "search_suggest_query"
a=0;// 
a=0;//     invoke-virtual {v8, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     .line 732
a=0;//     invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestSelection()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 734
a=0;//     .local v3, "selection":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 735
a=0;//     .local v4, "selArgs":[Ljava/lang/String;
a=0;//     #v4=(Null);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 736
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v4, v0, [Ljava/lang/String;
a=0;// 
a=0;//     .end local v4    # "selArgs":[Ljava/lang/String;
a=0;//     #v4=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     aput-object p2, v4, v0
a=0;// 
a=0;//     .line 741
a=0;//     .restart local v4    # "selArgs":[Ljava/lang/String;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     if-lez p3, :cond_3
a=0;// 
a=0;//     .line 742
a=0;//     const-string v0, "limit"
a=0;// 
a=0;//     invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v8, v0, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     .line 745
a=0;//     :cond_3
a=0;//     invoke-virtual {v8}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 748
a=0;//     .local v1, "uri":Landroid/net/Uri;
a=0;//     #v1=(Reference,Landroid/net/Uri;);
a=0;//     iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     move-object v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/database/Cursor;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 738
a=0;//     .end local v1    # "uri":Landroid/net/Uri;
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v2=(Null);v4=(Null);v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v8, p2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 6
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 443
a=0;//     :try_start_0
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/support/v4/widget/ResourceCursorAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 453
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Landroid/view/View;);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 444
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 445
a=0;//     .local v0, "e":Ljava/lang/RuntimeException;
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     const-string v4, "SuggestionsAdapter"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "Search suggestions cursor threw exception."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 447
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mCursor:Landroid/database/Cursor;
a=0;// 
a=0;//     invoke-virtual {p0, v4, v5, p3}, Landroid/support/v7/widget/SuggestionsAdapter;->newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 448
a=0;//     .local v2, "v":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 449
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
a=0;// 
a=0;//     .line 450
a=0;//     .local v3, "views":Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
a=0;//     iget-object v1, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 451
a=0;//     .local v1, "tv":Landroid/widget/TextView;
a=0;//     #v1=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {v0}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hasStableIds()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "cursor"    # Landroid/database/Cursor;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 242
a=0;//     invoke-super {p0, p1, p2, p3}, Landroid/support/v4/widget/ResourceCursorAdapter;->newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 243
a=0;//     .local v0, "v":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     new-instance v1, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;);
a=0;//     invoke-direct {v1, v0}, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;);
a=0;//     invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V
a=0;// 
a=0;//     .line 244
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public notifyDataSetChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     invoke-super {p0}, Landroid/support/v4/widget/ResourceCursorAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 181
a=0;//     invoke-virtual {p0}, Landroid/support/v7/widget/SuggestionsAdapter;->getCursor()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->updateSpinnerState(Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 182
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public notifyDataSetInvalidated()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 187
a=0;//     invoke-super {p0}, Landroid/support/v4/widget/ResourceCursorAdapter;->notifyDataSetInvalidated()V
a=0;// 
a=0;//     .line 189
a=0;//     invoke-virtual {p0}, Landroid/support/v7/widget/SuggestionsAdapter;->getCursor()Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->updateSpinnerState(Landroid/database/Cursor;)V
a=0;// 
a=0;//     .line 190
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 322
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 323
a=0;//     .local v0, "tag":Ljava/lang/Object;
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     instance-of v1, v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 324
a=0;//     iget-object v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchView:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/widget/SearchView;);
a=0;//     check-cast v0, Ljava/lang/CharSequence;
a=0;// 
a=0;//     .end local v0    # "tag":Ljava/lang/Object;
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView;->onQueryRefine(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 326
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public runQueryOnBackgroundThread(Ljava/lang/CharSequence;)Landroid/database/Cursor;
a=0;//     .locals 6
a=0;//     .param p1, "constraint"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 144
a=0;//     #v3=(Null);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     const-string v2, ""
a=0;// 
a=0;//     .line 149
a=0;//     .local v2, "query":Ljava/lang/String;
a=0;//     :goto_0
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 150
a=0;//     .local v0, "cursor":Landroid/database/Cursor;
a=0;//     #v0=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchView:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/widget/SearchView;);
a=0;//     invoke-virtual {v4}, Landroid/support/v7/widget/SearchView;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchView:Landroid/support/v7/widget/SearchView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/widget/SearchView;);
a=0;//     invoke-virtual {v4}, Landroid/support/v7/widget/SearchView;->getWindowVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 167
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v0=(Reference,Landroid/database/Cursor;);v1=(Conflicted);v3=(Reference,Landroid/database/Cursor;);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 144
a=0;//     .end local v0    # "cursor":Landroid/database/Cursor;
a=0;//     .end local v2    # "query":Ljava/lang/String;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);
a=0;//     invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 155
a=0;//     .restart local v0    # "cursor":Landroid/database/Cursor;
a=0;//     .restart local v2    # "query":Ljava/lang/String;
a=0;//     :cond_2
a=0;//     :try_start_0
a=0;//     #v0=(Null);v4=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;
a=0;// 
a=0;//     #v4=(Reference,Landroid/app/SearchableInfo;);
a=0;//     const/16 v5, 0x32
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p0, v4, v2, v5}, Landroid/support/v7/widget/SuggestionsAdapter;->getSearchManagerSuggestions(Landroid/app/SearchableInfo;Ljava/lang/String;I)Landroid/database/Cursor;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 158
a=0;//     #v0=(Reference,Landroid/database/Cursor;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 160
a=0;//     #v3=(Reference,Landroid/database/Cursor;);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 162
a=0;//     :catch_0
a=0;//     #v3=(Null);v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     .line 163
a=0;//     .local v1, "e":Ljava/lang/RuntimeException;
a=0;//     #v1=(Reference,Ljava/lang/RuntimeException;);
a=0;//     const-string v4, "SuggestionsAdapter"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     const-string v5, "Search suggestions query threw an exception."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v4, v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public setQueryRefinement(I)V
a=0;//     .locals 0
a=0;//     .param p1, "refineWhat"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 116
a=0;//     iput p1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I
a=0;// 
a=0;//     .line 117
a=0;//     return-void
a=0;// .end method
}}
