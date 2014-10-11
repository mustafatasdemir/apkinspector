package android.support.v7.internal.view; class ActionBarPolicy { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionBarPolicy.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 39
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/ActionBarPolicy;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 41
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static get(Landroid/content/Context;)Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;//     .locals 1
a=0;//     .param p0, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 36
a=0;//     new-instance v0, Landroid/support/v7/internal/view/ActionBarPolicy;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/ActionBarPolicy;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/view/ActionBarPolicy;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/ActionBarPolicy;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public enableHomeButtonByDefault()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 79
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xe
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ge v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getEmbeddedMenuWidthLimit()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 53
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     div-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMaxActionButtons()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Landroid/support/v7/appcompat/R$integer;->abc_max_action_buttons:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getInteger(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getStackedTabMaxWidth()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 83
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Landroid/support/v7/appcompat/R$dimen;->abc_action_bar_stacked_tab_max_width:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getTabContainerHeight()I
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 63
a=0;//     #v7=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     sget-object v5, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I
a=0;// 
a=0;//     #v5=(Reference,[I);
a=0;//     sget v6, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {v3, v4, v5, v6, v7}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v7, v7}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 66
a=0;//     .local v1, "height":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 67
a=0;//     .local v2, "r":Landroid/content/res/Resources;
a=0;//     #v2=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/ActionBarPolicy;->hasEmbeddedTabs()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 69
a=0;//     sget v3, Landroid/support/v7/appcompat/R$dimen;->abc_action_bar_stacked_max_height:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 72
a=0;//     :cond_0
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 73
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method public hasEmbeddedTabs()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/ActionBarPolicy;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     sget v1, Landroid/support/v7/appcompat/R$bool;->abc_action_bar_embed_tabs_pre_jb:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getBoolean(I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public showsOverflowMenuButton()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 49
a=0;//     sget v0, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v1, 0xb
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-lt v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
