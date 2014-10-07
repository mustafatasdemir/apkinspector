package android.support.v7.widget; class SuggestionsAdapter {/*

.class Landroid/support/v7/widget/SuggestionsAdapter;
.super Landroid/support/v4/widget/ResourceCursorAdapter;
.source "SuggestionsAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
    }
.end annotation


# static fields
.field private static final DBG:Z = false

.field static final INVALID_INDEX:I = -0x1

.field private static final LOG_TAG:Ljava/lang/String; = "SuggestionsAdapter"

.field private static final QUERY_LIMIT:I = 0x32

.field static final REFINE_ALL:I = 0x2

.field static final REFINE_BY_ENTRY:I = 0x1

.field static final REFINE_NONE:I


# instance fields
.field private mClosed:Z

.field private mFlagsCol:I

.field private mIconName1Col:I

.field private mIconName2Col:I

.field private mOutsideDrawablesCache:Ljava/util/WeakHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/WeakHashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;"
        }
    .end annotation
.end field

.field private mProviderContext:Landroid/content/Context;

.field private mQueryRefinement:I

.field private mSearchManager:Landroid/app/SearchManager;

.field private mSearchView:Landroid/support/v7/widget/SearchView;

.field private mSearchable:Landroid/app/SearchableInfo;

.field private mText1Col:I

.field private mText2Col:I

.field private mText2UrlCol:I

.field private mUrlColor:Landroid/content/res/ColorStateList;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/widget/SearchView;Landroid/app/SearchableInfo;Ljava/util/WeakHashMap;)V
    .locals 4
    .parameter "context"
    .parameter "searchView"
    .parameter "searchable"
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/support/v7/widget/SearchView;",
            "Landroid/app/SearchableInfo;",
            "Ljava/util/WeakHashMap",
            "<",
            "Ljava/lang/String;",
            "Landroid/graphics/drawable/Drawable$ConstantState;",
            ">;)V"
        }
    .end annotation

    .prologue
    .local p4, outsideDrawablesCache:Ljava/util/WeakHashMap;,"Ljava/util/WeakHashMap<Ljava/lang/String;Landroid/graphics/drawable/Drawable$ConstantState;>;"
    const/4 v3, 0x1

    #v3=(One);
    const/4 v2, -0x1

    .line 94
    #v2=(Byte);
    sget v0, Landroid/support/v7/appcompat/R$layout;->abc_search_dropdown_item_icons_2line:I

    #v0=(Integer);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, p1, v0, v1, v3}, Landroid/support/v4/widget/ResourceCursorAdapter;-><init>(Landroid/content/Context;ILandroid/database/Cursor;Z)V

    .line 72
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mClosed:Z

    .line 73
    iput v3, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I

    .line 81
    iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText1Col:I

    .line 82
    iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2Col:I

    .line 83
    iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2UrlCol:I

    .line 84
    iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName1Col:I

    .line 85
    iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName2Col:I

    .line 86
    iput v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mFlagsCol:I

    .line 97
    iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;

    #v0=(Reference);
    const-string v1, "search"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/SearchManager;

    iput-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchManager:Landroid/app/SearchManager;

    .line 98
    iput-object p2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchView:Landroid/support/v7/widget/SearchView;

    .line 99
    iput-object p3, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;

    .line 101
    iput-object p1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;

    .line 103
    iput-object p4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;

    .line 104
    return-void
.end method

.method private checkIconCache(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 2
    .parameter "resourceUri"

    .prologue
    .line 553
    iget-object v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 554
    .local v0, cached:Landroid/graphics/drawable/Drawable$ConstantState;
    if-nez v0, :cond_0

    .line 555
    const/4 v1, 0x0

    .line 558
    :goto_0
    return-object v1

    :cond_0
    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    goto :goto_0
.end method

.method private formatUrl(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;
    .locals 8
    .parameter "url"

    .prologue
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v2, 0x0

    .line 329
    #v2=(Null);
    iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mUrlColor:Landroid/content/res/ColorStateList;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 331
    new-instance v6, Landroid/util/TypedValue;

    #v6=(UninitRef);
    invoke-direct {v6}, Landroid/util/TypedValue;-><init>()V

    .line 332
    .local v6, colorValue:Landroid/util/TypedValue;
    #v6=(Reference);
    iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    sget v3, Landroid/support/v7/appcompat/R$attr;->textColorSearchUrl:I

    #v3=(Integer);
    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {v0, v3, v6, v4}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 333
    iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iget v3, v6, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getColorStateList(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mUrlColor:Landroid/content/res/ColorStateList;

    .line 336
    .end local v6           #colorValue:Landroid/util/TypedValue;
    :cond_0
    #v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);
    new-instance v7, Landroid/text/SpannableString;

    #v7=(UninitRef);
    invoke-direct {v7, p1}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 337
    .local v7, text:Landroid/text/SpannableString;
    #v7=(Reference);
    new-instance v0, Landroid/text/style/TextAppearanceSpan;

    #v0=(UninitRef);
    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mUrlColor:Landroid/content/res/ColorStateList;

    #v4=(Reference);
    move v3, v2

    #v3=(Null);
    move-object v5, v1

    #v5=(Null);
    invoke-direct/range {v0 .. v5}, Landroid/text/style/TextAppearanceSpan;-><init>(Ljava/lang/String;IILandroid/content/res/ColorStateList;Landroid/content/res/ColorStateList;)V

    #v0=(Reference);
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    #v1=(Integer);
    const/16 v3, 0x21

    #v3=(PosByte);
    invoke-virtual {v7, v0, v2, v1, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 340
    return-object v7
.end method

.method private getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
    .locals 10
    .parameter "component"

    .prologue
    const/4 v6, 0x0

    .line 617
    #v6=(Null);
    iget-object v7, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    .line 620
    .local v5, pm:Landroid/content/pm/PackageManager;
    #v5=(Reference);
    const/16 v7, 0x80

    :try_start_0
    #v7=(PosShort);
    invoke-virtual {v5, p1, v7}, Landroid/content/pm/PackageManager;->getActivityInfo(Landroid/content/ComponentName;I)Landroid/content/pm/ActivityInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 625
    .local v0, activityInfo:Landroid/content/pm/ActivityInfo;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/pm/ActivityInfo;->getIconResource()I

    move-result v3

    .line 626
    .local v3, iconId:I
    #v3=(Integer);
    if-nez v3, :cond_1

    move-object v1, v6

    .line 634
    .end local v0           #activityInfo:Landroid/content/pm/ActivityInfo;
    .end local v3           #iconId:I
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-object v1

    .line 621
    :catch_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v7=(PosShort);v8=(Uninit);v9=(Uninit);
    move-exception v2

    .line 622
    .local v2, ex:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v2=(Reference);
    const-string v7, "SuggestionsAdapter"

    #v7=(Reference);
    invoke-virtual {v2}, Landroid/content/pm/PackageManager$NameNotFoundException;->toString()Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, v6

    .line 623
    #v1=(Null);
    goto :goto_0

    .line 627
    .end local v2           #ex:Landroid/content/pm/PackageManager$NameNotFoundException;
    .restart local v0       #activityInfo:Landroid/content/pm/ActivityInfo;
    .restart local v3       #iconId:I
    :cond_1
    #v0=(Reference);v1=(Uninit);v2=(Uninit);v3=(Integer);v7=(PosShort);v8=(Uninit);
    invoke-virtual {p1}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v4

    .line 628
    .local v4, pkg:Ljava/lang/String;
    #v4=(Reference);
    iget-object v7, v0, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    #v7=(Reference);
    invoke-virtual {v5, v4, v3, v7}, Landroid/content/pm/PackageManager;->getDrawable(Ljava/lang/String;ILandroid/content/pm/ApplicationInfo;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 629
    .local v1, drawable:Landroid/graphics/drawable/Drawable;
    #v1=(Reference);
    if-nez v1, :cond_0

    .line 630
    const-string v7, "SuggestionsAdapter"

    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "Invalid icon resource "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, " for "

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v1, v6

    .line 632
    #v1=(Null);
    goto :goto_0
.end method

.method private getActivityIconWithCache(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;
    .locals 6
    .parameter "component"

    .prologue
    const/4 v4, 0x0

    .line 595
    #v4=(Null);
    invoke-virtual {p1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v1

    .line 597
    .local v1, componentIconKey:Ljava/lang/String;
    #v1=(Reference);
    iget-object v5, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;

    #v5=(Reference);
    invoke-virtual {v5, v1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    #v5=(Boolean);
    if-eqz v5, :cond_1

    .line 598
    iget-object v5, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;

    #v5=(Reference);
    invoke-virtual {v5, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/graphics/drawable/Drawable$ConstantState;

    .line 599
    .local v0, cached:Landroid/graphics/drawable/Drawable$ConstantState;
    if-nez v0, :cond_0

    .line 606
    .end local v0           #cached:Landroid/graphics/drawable/Drawable$ConstantState;
    :goto_0
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference);v5=(Conflicted);
    return-object v4

    .line 599
    .restart local v0       #cached:Landroid/graphics/drawable/Drawable$ConstantState;
    :cond_0
    #v0=(Reference);v2=(Uninit);v3=(Uninit);v4=(Null);v5=(Reference);
    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v0, v4}, Landroid/graphics/drawable/Drawable$ConstantState;->newDrawable(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;

    move-result-object v4

    goto :goto_0

    .line 602
    .end local v0           #cached:Landroid/graphics/drawable/Drawable$ConstantState;
    :cond_1
    #v0=(Uninit);v4=(Null);v5=(Boolean);
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SuggestionsAdapter;->getActivityIcon(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 604
    .local v2, drawable:Landroid/graphics/drawable/Drawable;
    #v2=(Reference);
    if-nez v2, :cond_2

    move-object v3, v4

    .line 605
    .local v3, toCache:Landroid/graphics/drawable/Drawable$ConstantState;
    :goto_1
    #v3=(Reference);
    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;

    #v4=(Reference);
    invoke-virtual {v4, v1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object v4, v2

    .line 606
    goto :goto_0

    .line 604
    .end local v3           #toCache:Landroid/graphics/drawable/Drawable$ConstantState;
    :cond_2
    #v3=(Uninit);v4=(Null);
    invoke-virtual {v2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v3

    #v3=(Reference);
    goto :goto_1
.end method

.method public static getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;
    .locals 2
    .parameter "cursor"
    .parameter "columnName"

    .prologue
    .line 646
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v0

    .line 647
    .local v0, col:I
    #v0=(Integer);
    invoke-static {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v1

    #v1=(Reference);
    return-object v1
.end method

.method private getDefaultIcon1(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
    .locals 2
    .parameter "cursor"

    .prologue
    .line 576
    iget-object v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v1

    invoke-direct {p0, v1}, Landroid/support/v7/widget/SuggestionsAdapter;->getActivityIconWithCache(Landroid/content/ComponentName;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 577
    .local v0, drawable:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 582
    .end local v0           #drawable:Landroid/graphics/drawable/Drawable;
    :goto_0
    return-object v0

    .restart local v0       #drawable:Landroid/graphics/drawable/Drawable;
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/pm/PackageManager;->getDefaultActivityIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0
.end method

.method private getDrawable(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    .locals 9
    .parameter "uri"

    .prologue
    const/4 v5, 0x0

    .line 520
    :try_start_0
    #v5=(Null);
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    .line 521
    .local v2, scheme:Ljava/lang/String;
    #v2=(Reference);
    const-string v4, "android.resource"

    #v4=(Reference);
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 524
    :try_start_1
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/SuggestionsAdapter;->getDrawableFromResourceUri(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v4

    .line 546
    .end local v2           #scheme:Ljava/lang/String;
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Reference);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-object v4

    .line 525
    .restart local v2       #scheme:Ljava/lang/String;
    :catch_0
    #v0=(Uninit);v1=(Uninit);v2=(Reference);v3=(Uninit);v4=(Boolean);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    move-exception v0

    .line 526
    .local v0, ex:Landroid/content/res/Resources$NotFoundException;
    :try_start_2
    #v0=(Reference);
    new-instance v4, Ljava/io/FileNotFoundException;

    #v4=(UninitRef);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "Resource does not exist: "

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    .line 544
    .end local v0           #ex:Landroid/content/res/Resources$NotFoundException;
    .end local v2           #scheme:Ljava/lang/String;
    :catch_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    move-exception v1

    .line 545
    .local v1, fnfe:Ljava/io/FileNotFoundException;
    #v1=(Reference);
    const-string v4, "SuggestionsAdapter"

    #v4=(Reference);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "Icon not found: "

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, ", "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v1}, Ljava/io/FileNotFoundException;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v4, v5

    .line 546
    #v4=(Null);
    goto :goto_0

    .line 530
    .end local v1           #fnfe:Ljava/io/FileNotFoundException;
    .restart local v2       #scheme:Ljava/lang/String;
    :cond_0
    :try_start_3
    #v0=(Uninit);v1=(Uninit);v2=(Reference);v3=(Uninit);v4=(Boolean);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v4

    invoke-virtual {v4, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v3

    .line 531
    .local v3, stream:Ljava/io/InputStream;
    #v3=(Reference);
    if-nez v3, :cond_1

    .line 532
    new-instance v4, Ljava/io/FileNotFoundException;

    #v4=(UninitRef);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "Failed to open "

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-direct {v4, v6}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    #v4=(Reference);
    throw v4
    :try_end_3
    .catch Ljava/io/FileNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    .line 535
    :cond_1
    #v6=(Uninit);v7=(Uninit);
    const/4 v4, 0x0

    :try_start_4
    #v4=(Null);
    invoke-static {v3, v4}, Landroid/graphics/drawable/Drawable;->createFromStream(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-result-object v4

    .line 538
    :try_start_5
    #v4=(Reference);
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Ljava/io/FileNotFoundException; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_0

    .line 539
    :catch_2
    move-exception v0

    .line 540
    .local v0, ex:Ljava/io/IOException;
    :try_start_6
    #v0=(Reference);
    const-string v6, "SuggestionsAdapter"

    #v6=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "Error closing icon stream for "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_1

    goto/16 :goto_0

    .line 537
    .end local v0           #ex:Ljava/io/IOException;
    :catchall_0
    #v0=(Uninit);v4=(Null);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    move-exception v4

    .line 538
    :try_start_7
    #v4=(Reference);
    invoke-virtual {v3}, Ljava/io/InputStream;->close()V
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_3
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_1

    .line 541
    :goto_1
    :try_start_8
    #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    throw v4

    .line 539
    :catch_3
    #v0=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    move-exception v0

    .line 540
    .restart local v0       #ex:Ljava/io/IOException;
    #v0=(Reference);
    const-string v6, "SuggestionsAdapter"

    #v6=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "Error closing icon stream for "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_1

    goto :goto_1
.end method

.method private getDrawableFromResourceValue(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 9
    .parameter "drawableId"

    .prologue
    const/4 v5, 0x0

    .line 477
    #v5=(Null);
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v6

    #v6=(Integer);
    if-eqz v6, :cond_0

    const-string v6, "0"

    #v6=(Reference);
    invoke-virtual {v6, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    :cond_0
    #v6=(Conflicted);
    move-object v0, v5

    .line 509
    :cond_1
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-object v0

    .line 482
    :cond_2
    :try_start_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Boolean);v7=(Uninit);v8=(Uninit);
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    .line 484
    .local v3, resourceId:I
    #v3=(Integer);
    new-instance v6, Ljava/lang/StringBuilder;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    #v6=(Reference);
    const-string v7, "android.resource://"

    #v7=(Reference);
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget-object v7, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "/"

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 487
    .local v1, drawableUri:Ljava/lang/String;
    #v1=(Reference);
    invoke-direct {p0, v1}, Landroid/support/v7/widget/SuggestionsAdapter;->checkIconCache(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 488
    .local v0, drawable:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-nez v0, :cond_1

    .line 492
    iget-object v6, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mProviderContext:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 494
    invoke-direct {p0, v1, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->storeInIconCache(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 496
    .end local v0           #drawable:Landroid/graphics/drawable/Drawable;
    .end local v1           #drawableUri:Ljava/lang/String;
    .end local v3           #resourceId:I
    :catch_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-exception v2

    .line 498
    .local v2, nfe:Ljava/lang/NumberFormatException;
    #v2=(Reference);
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SuggestionsAdapter;->checkIconCache(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 499
    .restart local v0       #drawable:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-nez v0, :cond_1

    .line 502
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    .line 503
    .local v4, uri:Landroid/net/Uri;
    #v4=(Reference);
    invoke-direct {p0, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getDrawable(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 504
    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->storeInIconCache(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V

    goto :goto_0

    .line 506
    .end local v0           #drawable:Landroid/graphics/drawable/Drawable;
    .end local v2           #nfe:Ljava/lang/NumberFormatException;
    .end local v4           #uri:Landroid/net/Uri;
    :catch_1
    #v0=(Conflicted);v2=(Uninit);v4=(Uninit);
    move-exception v2

    .line 508
    .local v2, nfe:Landroid/content/res/Resources$NotFoundException;
    #v2=(Reference);
    const-string v6, "SuggestionsAdapter"

    #v6=(Reference);
    new-instance v7, Ljava/lang/StringBuilder;

    #v7=(UninitRef);
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    #v7=(Reference);
    const-string v8, "Icon resource not found: "

    #v8=(Reference);
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    move-object v0, v5

    .line 509
    #v0=(Null);
    goto :goto_0
.end method

.method private getIcon1(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
    .locals 4
    .parameter "cursor"

    .prologue
    .line 355
    iget v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName1Col:I

    #v2=(Integer);
    const/4 v3, -0x1

    #v3=(Byte);
    if-ne v2, v3, :cond_1

    .line 356
    const/4 v0, 0x0

    .line 363
    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);
    return-object v0

    .line 358
    :cond_1
    #v0=(Uninit);v1=(Uninit);
    iget v2, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName1Col:I

    invoke-interface {p1, v2}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 359
    .local v1, value:Ljava/lang/String;
    #v1=(Reference);
    invoke-direct {p0, v1}, Landroid/support/v7/widget/SuggestionsAdapter;->getDrawableFromResourceValue(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 360
    .local v0, drawable:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    if-nez v0, :cond_0

    .line 363
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SuggestionsAdapter;->getDefaultIcon1(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    goto :goto_0
.end method

.method private getIcon2(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;
    .locals 3
    .parameter "cursor"

    .prologue
    .line 367
    iget v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName2Col:I

    #v1=(Integer);
    const/4 v2, -0x1

    #v2=(Byte);
    if-ne v1, v2, :cond_0

    .line 368
    const/4 v1, 0x0

    .line 371
    :goto_0
    #v0=(Conflicted);v1=(Reference);
    return-object v1

    .line 370
    :cond_0
    #v0=(Uninit);v1=(Integer);
    iget v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName2Col:I

    invoke-interface {p1, v1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 371
    .local v0, value:Ljava/lang/String;
    #v0=(Reference);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->getDrawableFromResourceValue(Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    #v1=(Reference);
    goto :goto_0
.end method

.method private static getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;
    .locals 4
    .parameter "cursor"
    .parameter "col"

    .prologue
    const/4 v1, 0x0

    .line 651
    #v1=(Null);
    const/4 v2, -0x1

    #v2=(Byte);
    if-ne p1, v2, :cond_0

    .line 660
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v3=(Conflicted);
    return-object v1

    .line 655
    :cond_0
    :try_start_0
    #v0=(Uninit);v1=(Null);v2=(Byte);v3=(Uninit);
    invoke-interface {p0, p1}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    #v1=(Reference);
    goto :goto_0

    .line 656
    :catch_0
    #v1=(Null);
    move-exception v0

    .line 657
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    const-string v2, "SuggestionsAdapter"

    #v2=(Reference);
    const-string v3, "unexpected error retrieving valid column from cursor, did the remote process die?"

    #v3=(Reference);
    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private setViewDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V
    .locals 2
    .parameter "v"
    .parameter "drawable"
    .parameter "nullVisibility"

    .prologue
    const/4 v1, 0x0

    .line 381
    #v1=(Null);
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 383
    if-nez p2, :cond_0

    .line 384
    invoke-virtual {p1, p3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 396
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 386
    :cond_0
    #v0=(Uninit);
    invoke-virtual {p1, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 393
    invoke-virtual {p2, v1, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    .line 394
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p2, v0, v1}, Landroid/graphics/drawable/Drawable;->setVisible(ZZ)Z

    goto :goto_0
.end method

.method private setViewText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V
    .locals 1
    .parameter "v"
    .parameter "text"

    .prologue
    .line 345
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 347
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 348
    const/16 v0, 0x8

    #v0=(PosByte);
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 352
    :goto_0
    return-void

    .line 350
    :cond_0
    #v0=(Boolean);
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method private storeInIconCache(Ljava/lang/String;Landroid/graphics/drawable/Drawable;)V
    .locals 2
    .parameter "resourceUri"
    .parameter "drawable"

    .prologue
    .line 562
    if-eqz p2, :cond_0

    .line 563
    iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mOutsideDrawablesCache:Ljava/util/WeakHashMap;

    #v0=(Reference);
    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->getConstantState()Landroid/graphics/drawable/Drawable$ConstantState;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method private updateSpinnerState(Landroid/database/Cursor;)V
    .locals 2
    .parameter "cursor"

    .prologue
    .line 193
    if-eqz p1, :cond_1

    invoke-interface {p1}, Landroid/database/Cursor;->getExtras()Landroid/os/Bundle;

    move-result-object v0

    .line 201
    .local v0, extras:Landroid/os/Bundle;
    :goto_0
    #v0=(Reference);
    if-eqz v0, :cond_0

    const-string v1, "in_progress"

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 206
    :cond_0
    #v1=(Conflicted);
    return-void

    .line 193
    .end local v0           #extras:Landroid/os/Bundle;
    :cond_1
    #v0=(Uninit);v1=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method


# virtual methods
.method public bindView(Landroid/view/View;Landroid/content/Context;Landroid/database/Cursor;)V
    .locals 11
    .parameter "view"
    .parameter "context"
    .parameter "cursor"

    .prologue
    const/16 v10, 0x8

    #v10=(PosByte);
    const/4 v9, 0x2

    #v9=(PosByte);
    const/4 v8, 0x0

    #v8=(Null);
    const/4 v7, 0x1

    .line 269
    #v7=(One);
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;

    .line 271
    .local v3, views:Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
    const/4 v0, 0x0

    .line 272
    .local v0, flags:I
    #v0=(Null);
    iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mFlagsCol:I

    #v4=(Integer);
    const/4 v5, -0x1

    #v5=(Byte);
    if-eq v4, v5, :cond_0

    .line 273
    iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mFlagsCol:I

    invoke-interface {p3, v4}, Landroid/database/Cursor;->getInt(I)I

    move-result v0

    .line 275
    :cond_0
    #v0=(Integer);
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    #v4=(Reference);
    if-eqz v4, :cond_1

    .line 276
    iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText1Col:I

    #v4=(Integer);
    invoke-static {p3, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v1

    .line 277
    .local v1, text1:Ljava/lang/String;
    #v1=(Reference);
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    #v4=(Reference);
    invoke-direct {p0, v4, v1}, Landroid/support/v7/widget/SuggestionsAdapter;->setViewText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 279
    .end local v1           #text1:Ljava/lang/String;
    :cond_1
    #v1=(Conflicted);
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText2:Landroid/widget/TextView;

    if-eqz v4, :cond_3

    .line 281
    iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2UrlCol:I

    #v4=(Integer);
    invoke-static {p3, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v2

    .line 282
    .local v2, text2:Ljava/lang/CharSequence;
    #v2=(Reference);
    if-eqz v2, :cond_7

    .line 283
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SuggestionsAdapter;->formatUrl(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v2

    .line 290
    :goto_0
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_8

    .line 291
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    #v4=(Reference);
    if-eqz v4, :cond_2

    .line 292
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    invoke-virtual {v4, v8}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 293
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 301
    :cond_2
    :goto_1
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText2:Landroid/widget/TextView;

    invoke-direct {p0, v4, v2}, Landroid/support/v7/widget/SuggestionsAdapter;->setViewText(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 304
    .end local v2           #text2:Ljava/lang/CharSequence;
    :cond_3
    #v2=(Conflicted);
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon1:Landroid/widget/ImageView;

    if-eqz v4, :cond_4

    .line 305
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon1:Landroid/widget/ImageView;

    invoke-direct {p0, p3}, Landroid/support/v7/widget/SuggestionsAdapter;->getIcon1(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    #v5=(Reference);
    const/4 v6, 0x4

    #v6=(PosByte);
    invoke-direct {p0, v4, v5, v6}, Landroid/support/v7/widget/SuggestionsAdapter;->setViewDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V

    .line 307
    :cond_4
    #v5=(Conflicted);v6=(Conflicted);
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon2:Landroid/widget/ImageView;

    if-eqz v4, :cond_5

    .line 308
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIcon2:Landroid/widget/ImageView;

    invoke-direct {p0, p3}, Landroid/support/v7/widget/SuggestionsAdapter;->getIcon2(Landroid/database/Cursor;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    #v5=(Reference);
    invoke-direct {p0, v4, v5, v10}, Landroid/support/v7/widget/SuggestionsAdapter;->setViewDrawable(Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;I)V

    .line 310
    :cond_5
    #v5=(Conflicted);
    iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I

    #v4=(Integer);
    if-eq v4, v9, :cond_6

    iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I

    if-ne v4, v7, :cond_9

    and-int/lit8 v4, v0, 0x1

    if-eqz v4, :cond_9

    .line 313
    :cond_6
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIconRefine:Landroid/widget/ImageView;

    #v4=(Reference);
    invoke-virtual {v4, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 314
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIconRefine:Landroid/widget/ImageView;

    iget-object v5, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setTag(Ljava/lang/Object;)V

    .line 315
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIconRefine:Landroid/widget/ImageView;

    invoke-virtual {v4, p0}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 319
    :goto_2
    #v5=(Conflicted);
    return-void

    .line 285
    .restart local v2       #text2:Ljava/lang/CharSequence;
    :cond_7
    #v2=(Reference);v4=(Integer);v5=(Byte);v6=(Uninit);
    iget v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2Col:I

    invoke-static {p3, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getStringOrNull(Landroid/database/Cursor;I)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 296
    :cond_8
    #v4=(Boolean);
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    #v4=(Reference);
    if-eqz v4, :cond_2

    .line 297
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 298
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    invoke-virtual {v4, v7}, Landroid/widget/TextView;->setMaxLines(I)V

    goto :goto_1

    .line 317
    .end local v2           #text2:Ljava/lang/CharSequence;
    :cond_9
    #v2=(Conflicted);v4=(Integer);v5=(Conflicted);v6=(Conflicted);
    iget-object v4, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mIconRefine:Landroid/widget/ImageView;

    #v4=(Reference);
    invoke-virtual {v4, v10}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2
.end method

.method public changeCursor(Landroid/database/Cursor;)V
    .locals 3
    .parameter "c"

    .prologue
    .line 215
    iget-boolean v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mClosed:Z

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 216
    const-string v1, "SuggestionsAdapter"

    #v1=(Reference);
    const-string v2, "Tried to change cursor after adapter was closed."

    #v2=(Reference);
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 217
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/database/Cursor;->close()V

    .line 235
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 222
    :cond_1
    :try_start_0
    #v0=(Uninit);v1=(Boolean);v2=(Uninit);
    invoke-super {p0, p1}, Landroid/support/v4/widget/ResourceCursorAdapter;->changeCursor(Landroid/database/Cursor;)V

    .line 224
    if-eqz p1, :cond_0

    .line 225
    const-string v1, "suggest_text_1"

    #v1=(Reference);
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText1Col:I

    .line 226
    const-string v1, "suggest_text_2"

    #v1=(Reference);
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2Col:I

    .line 227
    const-string v1, "suggest_text_2_url"

    #v1=(Reference);
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mText2UrlCol:I

    .line 228
    const-string v1, "suggest_icon_1"

    #v1=(Reference);
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName1Col:I

    .line 229
    const-string v1, "suggest_icon_2"

    #v1=(Reference);
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mIconName2Col:I

    .line 230
    const-string v1, "suggest_flags"

    #v1=(Reference);
    invoke-interface {p1, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mFlagsCol:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 232
    :catch_0
    #v1=(Conflicted);
    move-exception v0

    .line 233
    .local v0, e:Ljava/lang/Exception;
    #v0=(Reference);
    const-string v1, "SuggestionsAdapter"

    #v1=(Reference);
    const-string v2, "error changing cursor and caching columns"

    #v2=(Reference);
    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public close()V
    .locals 1

    .prologue
    .line 172
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->changeCursor(Landroid/database/Cursor;)V

    .line 173
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mClosed:Z

    .line 174
    return-void
.end method

.method public convertToString(Landroid/database/Cursor;)Ljava/lang/CharSequence;
    .locals 5
    .parameter "cursor"

    .prologue
    const/4 v3, 0x0

    .line 408
    #v3=(Null);
    if-nez p1, :cond_1

    move-object v1, v3

    .line 431
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v4=(Conflicted);
    return-object v1

    .line 412
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
    const-string v4, "suggest_intent_query"

    #v4=(Reference);
    invoke-static {p1, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 413
    .local v1, query:Ljava/lang/String;
    #v1=(Reference);
    if-nez v1, :cond_0

    .line 417
    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;

    invoke-virtual {v4}, Landroid/app/SearchableInfo;->shouldRewriteQueryFromData()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_2

    .line 418
    const-string v4, "suggest_intent_data"

    #v4=(Reference);
    invoke-static {p1, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 419
    .local v0, data:Ljava/lang/String;
    #v0=(Reference);
    if-eqz v0, :cond_2

    move-object v1, v0

    .line 420
    goto :goto_0

    .line 424
    .end local v0           #data:Ljava/lang/String;
    :cond_2
    #v0=(Conflicted);v4=(Conflicted);
    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/app/SearchableInfo;->shouldRewriteQueryFromText()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_3

    .line 425
    const-string v4, "suggest_text_1"

    #v4=(Reference);
    invoke-static {p1, v4}, Landroid/support/v7/widget/SuggestionsAdapter;->getColumnString(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 426
    .local v2, text1:Ljava/lang/String;
    #v2=(Reference);
    if-eqz v2, :cond_3

    move-object v1, v2

    .line 427
    goto :goto_0

    .end local v2           #text1:Ljava/lang/String;
    :cond_3
    #v2=(Conflicted);v4=(Conflicted);
    move-object v1, v3

    .line 431
    #v1=(Null);
    goto :goto_0
.end method

.method getDrawableFromResourceUri(Landroid/net/Uri;)Landroid/graphics/drawable/Drawable;
    .locals 10
    .parameter "uri"
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/FileNotFoundException;
        }
    .end annotation

    .prologue
    const/4 v9, 0x1

    #v9=(One);
    const/4 v8, 0x0

    .line 669
    #v8=(Null);
    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v0

    .line 671
    .local v0, authority:Ljava/lang/String;
    #v0=(Reference);
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v7

    #v7=(Boolean);
    if-eqz v7, :cond_0

    .line 672
    new-instance v7, Ljava/io/FileNotFoundException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "No authority: "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 675
    :cond_0
    :try_start_0
    #v7=(Boolean);v8=(Null);v9=(One);
    iget-object v7, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    invoke-virtual {v7, v0}, Landroid/content/pm/PackageManager;->getResourcesForApplication(Ljava/lang/String;)Landroid/content/res/Resources;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v6

    .line 680
    .local v6, r:Landroid/content/res/Resources;
    #v6=(Reference);
    invoke-virtual {p1}, Landroid/net/Uri;->getPathSegments()Ljava/util/List;

    move-result-object v5

    .line 681
    .local v5, path:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    #v5=(Reference);
    if-nez v5, :cond_1

    .line 682
    new-instance v7, Ljava/io/FileNotFoundException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "No path: "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 676
    .end local v5           #path:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    .end local v6           #r:Landroid/content/res/Resources;
    :catch_0
    #v5=(Uninit);v6=(Uninit);v7=(Conflicted);v8=(Null);v9=(One);
    move-exception v2

    .line 677
    .local v2, ex:Landroid/content/pm/PackageManager$NameNotFoundException;
    #v2=(Reference);
    new-instance v7, Ljava/io/FileNotFoundException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "No package found for authority: "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 684
    .end local v2           #ex:Landroid/content/pm/PackageManager$NameNotFoundException;
    .restart local v5       #path:Ljava/util/List;,"Ljava/util/List<Ljava/lang/String;>;"
    .restart local v6       #r:Landroid/content/res/Resources;
    :cond_1
    #v2=(Uninit);v5=(Reference);v6=(Reference);v8=(Null);v9=(One);
    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v4

    .line 686
    .local v4, len:I
    #v4=(Integer);
    if-ne v4, v9, :cond_2

    .line 688
    const/4 v7, 0x0

    :try_start_1
    #v7=(Null);
    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v3

    .line 697
    .local v3, id:I
    :goto_0
    #v3=(Integer);v8=(Reference);
    if-nez v3, :cond_4

    .line 698
    new-instance v7, Ljava/io/FileNotFoundException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "No resource found for: "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 689
    .end local v3           #id:I
    :catch_1
    #v3=(Uninit);v8=(Null);v9=(One);
    move-exception v1

    .line 690
    .local v1, e:Ljava/lang/NumberFormatException;
    #v1=(Reference);
    new-instance v7, Ljava/io/FileNotFoundException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "Single path segment is not a resource ID: "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 692
    .end local v1           #e:Ljava/lang/NumberFormatException;
    :cond_2
    #v1=(Uninit);v8=(Null);v9=(One);
    const/4 v7, 0x2

    #v7=(PosByte);
    if-ne v4, v7, :cond_3

    .line 693
    invoke-interface {v5, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    #v7=(Reference);
    check-cast v7, Ljava/lang/String;

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Ljava/lang/String;

    invoke-virtual {v6, v7, v8, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v3

    .restart local v3       #id:I
    #v3=(Integer);
    goto :goto_0

    .line 695
    .end local v3           #id:I
    :cond_3
    #v3=(Uninit);v7=(PosByte);v8=(Null);
    new-instance v7, Ljava/io/FileNotFoundException;

    #v7=(UninitRef);
    new-instance v8, Ljava/lang/StringBuilder;

    #v8=(UninitRef);
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    #v8=(Reference);
    const-string v9, "More than two path segments: "

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8}, Ljava/io/FileNotFoundException;-><init>(Ljava/lang/String;)V

    #v7=(Reference);
    throw v7

    .line 700
    .restart local v3       #id:I
    :cond_4
    #v3=(Integer);v9=(One);
    invoke-virtual {v6, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    return-object v7
.end method

.method public getQueryRefinement()I
    .locals 1

    .prologue
    .line 124
    iget v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I

    #v0=(Integer);
    return v0
.end method

.method getSearchManagerSuggestions(Landroid/app/SearchableInfo;Ljava/lang/String;I)Landroid/database/Cursor;
    .locals 9
    .parameter "searchable"
    .parameter "query"
    .parameter "limit"

    .prologue
    const/4 v2, 0x0

    .line 707
    #v2=(Null);
    if-nez p1, :cond_1

    .line 748
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    return-object v2

    .line 711
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Null);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestAuthority()Ljava/lang/String;

    move-result-object v6

    .line 712
    .local v6, authority:Ljava/lang/String;
    #v6=(Reference);
    if-eqz v6, :cond_0

    .line 716
    new-instance v0, Landroid/net/Uri$Builder;

    #v0=(UninitRef);
    invoke-direct {v0}, Landroid/net/Uri$Builder;-><init>()V

    #v0=(Reference);
    const-string v5, "content"

    #v5=(Reference);
    invoke-virtual {v0, v5}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    invoke-virtual {v0, v6}, Landroid/net/Uri$Builder;->authority(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v5, ""

    invoke-virtual {v0, v5}, Landroid/net/Uri$Builder;->query(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v0

    const-string v5, ""

    invoke-virtual {v0, v5}, Landroid/net/Uri$Builder;->fragment(Ljava/lang/String;)Landroid/net/Uri$Builder;

    move-result-object v8

    .line 723
    .local v8, uriBuilder:Landroid/net/Uri$Builder;
    #v8=(Reference);
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestPath()Ljava/lang/String;

    move-result-object v7

    .line 724
    .local v7, contentPath:Ljava/lang/String;
    #v7=(Reference);
    if-eqz v7, :cond_2

    .line 725
    invoke-virtual {v8, v7}, Landroid/net/Uri$Builder;->appendEncodedPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 729
    :cond_2
    const-string v0, "search_suggest_query"

    invoke-virtual {v8, v0}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 732
    invoke-virtual {p1}, Landroid/app/SearchableInfo;->getSuggestSelection()Ljava/lang/String;

    move-result-object v3

    .line 734
    .local v3, selection:Ljava/lang/String;
    #v3=(Reference);
    const/4 v4, 0x0

    .line 735
    .local v4, selArgs:[Ljava/lang/String;
    #v4=(Null);
    if-eqz v3, :cond_4

    .line 736
    const/4 v0, 0x1

    #v0=(One);
    new-array v4, v0, [Ljava/lang/String;

    .end local v4           #selArgs:[Ljava/lang/String;
    #v4=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    aput-object p2, v4, v0

    .line 741
    .restart local v4       #selArgs:[Ljava/lang/String;
    :goto_1
    #v0=(Reference);
    if-lez p3, :cond_3

    .line 742
    const-string v0, "limit"

    invoke-static {p3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v0, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 745
    :cond_3
    invoke-virtual {v8}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 748
    .local v1, uri:Landroid/net/Uri;
    #v1=(Reference);
    iget-object v0, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    move-object v5, v2

    #v5=(Null);
    invoke-virtual/range {v0 .. v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2

    #v2=(Reference);
    goto :goto_0

    .line 738
    .end local v1           #uri:Landroid/net/Uri;
    :cond_4
    #v1=(Uninit);v2=(Null);v4=(Null);v5=(Reference);
    invoke-virtual {v8, p2}, Landroid/net/Uri$Builder;->appendPath(Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_1
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 6
    .parameter "position"
    .parameter "convertView"
    .parameter "parent"

    .prologue
    .line 443
    :try_start_0
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/widget/ResourceCursorAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    .line 453
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Reference);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-object v2

    .line 444
    :catch_0
    move-exception v0

    .line 445
    .local v0, e:Ljava/lang/RuntimeException;
    #v0=(Reference);
    const-string v4, "SuggestionsAdapter"

    #v4=(Reference);
    const-string v5, "Search suggestions cursor threw exception."

    #v5=(Reference);
    invoke-static {v4, v5, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 447
    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mContext:Landroid/content/Context;

    iget-object v5, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mCursor:Landroid/database/Cursor;

    invoke-virtual {p0, v4, v5, p3}, Landroid/support/v7/widget/SuggestionsAdapter;->newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 448
    .local v2, v:Landroid/view/View;
    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 449
    invoke-virtual {v2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;

    .line 450
    .local v3, views:Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;
    iget-object v1, v3, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;->mText1:Landroid/widget/TextView;

    .line 451
    .local v1, tv:Landroid/widget/TextView;
    #v1=(Reference);
    invoke-virtual {v0}, Ljava/lang/RuntimeException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public hasStableIds()Z
    .locals 1

    .prologue
    .line 133
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 2
    .parameter "context"
    .parameter "cursor"
    .parameter "parent"

    .prologue
    .line 242
    invoke-super {p0, p1, p2, p3}, Landroid/support/v4/widget/ResourceCursorAdapter;->newView(Landroid/content/Context;Landroid/database/Cursor;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 243
    .local v0, v:Landroid/view/View;
    #v0=(Reference);
    new-instance v1, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;

    #v1=(UninitRef);
    invoke-direct {v1, v0}, Landroid/support/v7/widget/SuggestionsAdapter$ChildViewCache;-><init>(Landroid/view/View;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 244
    return-object v0
.end method

.method public notifyDataSetChanged()V
    .locals 1

    .prologue
    .line 179
    invoke-super {p0}, Landroid/support/v4/widget/ResourceCursorAdapter;->notifyDataSetChanged()V

    .line 181
    invoke-virtual {p0}, Landroid/support/v7/widget/SuggestionsAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    #v0=(Reference);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->updateSpinnerState(Landroid/database/Cursor;)V

    .line 182
    return-void
.end method

.method public notifyDataSetInvalidated()V
    .locals 1

    .prologue
    .line 187
    invoke-super {p0}, Landroid/support/v4/widget/ResourceCursorAdapter;->notifyDataSetInvalidated()V

    .line 189
    invoke-virtual {p0}, Landroid/support/v7/widget/SuggestionsAdapter;->getCursor()Landroid/database/Cursor;

    move-result-object v0

    #v0=(Reference);
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SuggestionsAdapter;->updateSpinnerState(Landroid/database/Cursor;)V

    .line 190
    return-void
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2
    .parameter "v"

    .prologue
    .line 322
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 323
    .local v0, tag:Ljava/lang/Object;
    #v0=(Reference);
    instance-of v1, v0, Ljava/lang/CharSequence;

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 324
    iget-object v1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchView:Landroid/support/v7/widget/SearchView;

    #v1=(Reference);
    check-cast v0, Ljava/lang/CharSequence;

    .end local v0           #tag:Ljava/lang/Object;
    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView;->onQueryRefine(Ljava/lang/CharSequence;)V

    .line 326
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public runQueryOnBackgroundThread(Ljava/lang/CharSequence;)Landroid/database/Cursor;
    .locals 6
    .parameter "constraint"

    .prologue
    const/4 v3, 0x0

    .line 144
    #v3=(Null);
    if-nez p1, :cond_1

    const-string v2, ""

    .line 149
    .local v2, query:Ljava/lang/String;
    :goto_0
    #v2=(Reference);
    const/4 v0, 0x0

    .line 150
    .local v0, cursor:Landroid/database/Cursor;
    #v0=(Null);
    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchView:Landroid/support/v7/widget/SearchView;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/widget/SearchView;->getVisibility()I

    move-result v4

    #v4=(Integer);
    if-nez v4, :cond_0

    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchView:Landroid/support/v7/widget/SearchView;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/widget/SearchView;->getWindowVisibility()I

    move-result v4

    #v4=(Integer);
    if-eqz v4, :cond_2

    .line 167
    :cond_0
    :goto_1
    #v0=(Reference);v1=(Conflicted);v3=(Reference);v4=(Conflicted);v5=(Conflicted);
    return-object v3

    .line 144
    .end local v0           #cursor:Landroid/database/Cursor;
    .end local v2           #query:Ljava/lang/String;
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Uninit);
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    #v2=(Reference);
    goto :goto_0

    .line 155
    .restart local v0       #cursor:Landroid/database/Cursor;
    .restart local v2       #query:Ljava/lang/String;
    :cond_2
    :try_start_0
    #v0=(Null);v4=(Integer);
    iget-object v4, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mSearchable:Landroid/app/SearchableInfo;

    #v4=(Reference);
    const/16 v5, 0x32

    #v5=(PosByte);
    invoke-virtual {p0, v4, v2, v5}, Landroid/support/v7/widget/SuggestionsAdapter;->getSearchManagerSuggestions(Landroid/app/SearchableInfo;Ljava/lang/String;I)Landroid/database/Cursor;

    move-result-object v0

    .line 158
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 159
    invoke-interface {v0}, Landroid/database/Cursor;->getCount()I
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v0

    .line 160
    #v3=(Reference);
    goto :goto_1

    .line 162
    :catch_0
    #v3=(Null);v4=(Conflicted);v5=(Conflicted);
    move-exception v1

    .line 163
    .local v1, e:Ljava/lang/RuntimeException;
    #v1=(Reference);
    const-string v4, "SuggestionsAdapter"

    #v4=(Reference);
    const-string v5, "Search suggestions query threw an exception."

    #v5=(Reference);
    invoke-static {v4, v5, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1
.end method

.method public setQueryRefinement(I)V
    .locals 0
    .parameter "refineWhat"

    .prologue
    .line 116
    iput p1, p0, Landroid/support/v7/widget/SuggestionsAdapter;->mQueryRefinement:I

    .line 117
    return-void
.end method

*/}
