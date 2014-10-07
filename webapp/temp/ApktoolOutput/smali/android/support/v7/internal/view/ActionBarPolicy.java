package android.support.v7.internal.view; class ActionBarPolicy {/*

.class public Landroid/support/v7/internal/view/ActionBarPolicy;
.super Ljava/lang/Object;
.source "ActionBarPolicy.java"


# instance fields
.field private mContext:Landroid/content/Context;


# direct methods
.method private constructor <init>(Landroid/content/Context;)V
    .locals 0
    .parameter "context"

    .prologue
    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;

    .line 41
    return-void
.end method

.method public static get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;
    .locals 1
    .parameter "context"

    .prologue
    .line 36
    new-instance v0, Landroid/support/v7/internal/view/ActionBarPolicy;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/ActionBarPolicy;-><init>(Landroid/content/Context;)V

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public enableHomeButtonByDefault()Z
    .locals 2

    .prologue
    .line 79
    iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    #v0=(Integer);
    const/16 v1, 0xe

    #v1=(PosByte);
    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getEmbeddedMenuWidthLimit()I
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    #v0=(Integer);
    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public getMaxActionButtons()I
    .locals 2

    .prologue
    .line 44
    iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/appcompat/R$integer;->abc_max_action_buttons:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getStackedTabMaxWidth()I
    .locals 2

    .prologue
    .line 83
    iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/appcompat/R$dimen;->abc_action_bar_stacked_tab_max_width:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getTabContainerHeight()I
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 63
    #v7=(Null);
    iget-object v3, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;

    #v3=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    sget-object v5, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I

    #v5=(Reference);
    sget v6, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I

    #v6=(Integer);
    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 65
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    invoke-virtual {v0, v7, v7}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v1

    .line 66
    .local v1, height:I
    #v1=(Integer);
    iget-object v3, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 67
    .local v2, r:Landroid/content/res/Resources;
    #v2=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/ActionBarPolicy;->hasEmbeddedTabs()Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 69
    sget v3, Landroid/support/v7/appcompat/R$dimen;->abc_action_bar_stacked_max_height:I

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 72
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 73
    return v1
.end method

.method public hasEmbeddedTabs()Z
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Landroid/support/v7/appcompat/R$bool;->abc_action_bar_embed_tabs_pre_jb:I

    #v1=(Integer);
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public showsOverflowMenuButton()Z
    .locals 2

    .prologue
    .line 49
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    #v0=(Integer);
    const/16 v1, 0xb

    #v1=(PosByte);
    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
