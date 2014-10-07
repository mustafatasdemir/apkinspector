package android.support.v7.internal.widget; class ActionBarContextView {/*

.class public Landroid/support/v7/internal/widget/ActionBarContextView;
.super Landroid/support/v7/internal/widget/AbsActionBarView;
.source "ActionBarContextView.java"


# static fields
.field private static final TAG:Ljava/lang/String; = "ActionBarContextView"


# instance fields
.field private mClose:Landroid/view/View;

.field private mCustomView:Landroid/view/View;

.field private mSplitBackground:Landroid/graphics/drawable/Drawable;

.field private mSubtitle:Ljava/lang/CharSequence;

.field private mSubtitleStyleRes:I

.field private mSubtitleView:Landroid/widget/TextView;

.field private mTitle:Ljava/lang/CharSequence;

.field private mTitleLayout:Landroid/widget/LinearLayout;

.field private mTitleOptional:Z

.field private mTitleStyleRes:I

.field private mTitleView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1
    .parameter "context"

    .prologue
    .line 55
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 56
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 59
    sget v0, Landroid/support/v7/appcompat/R$attr;->actionModeStyle:I

    #v0=(Integer);
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    const/4 v2, 0x0

    .line 63
    #v2=(Null);
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/internal/widget/AbsActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 65
    #p0=(Reference);
    sget-object v1, Landroid/support/v7/appcompat/R$styleable;->ActionMode:[I

    #v1=(Reference);
    invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 66
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    const/4 v1, 0x3

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleStyleRes:I

    .line 70
    const/4 v1, 0x2

    #v1=(PosByte);
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleStyleRes:I

    .line 73
    invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v1

    iput v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I

    .line 76
    const/4 v1, 0x4

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    .line 79
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 80
    return-void
.end method

.method private initTitle()V
    .locals 9

    .prologue
    const/16 v6, 0x8

    #v6=(PosByte);
    const/4 v4, 0x1

    #v4=(One);
    const/4 v5, 0x0

    .line 167
    #v5=(Null);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v3=(Reference);
    if-nez v3, :cond_1

    .line 168
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 169
    .local v2, inflater:Landroid/view/LayoutInflater;
    #v2=(Reference);
    sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_title_item:I

    #v3=(Integer);
    invoke-virtual {v2, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 170
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getChildCount()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ActionBarContextView;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/widget/LinearLayout;

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    .line 171
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_title:I

    #v7=(Integer);
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleView:Landroid/widget/TextView;

    .line 172
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_subtitle:I

    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;

    .line 173
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleStyleRes:I

    #v3=(Integer);
    if-eqz v3, :cond_0

    .line 174
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleView:Landroid/widget/TextView;

    #v3=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v7

    #v7=(Reference);
    iget v8, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleStyleRes:I

    #v8=(Integer);
    invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 176
    :cond_0
    #v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleStyleRes:I

    #v3=(Integer);
    if-eqz v3, :cond_1

    .line 177
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;

    #v3=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v7

    #v7=(Reference);
    iget v8, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleStyleRes:I

    #v8=(Integer);
    invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 181
    .end local v2           #inflater:Landroid/view/LayoutInflater;
    :cond_1
    #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleView:Landroid/widget/TextView;

    #v3=(Reference);
    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;

    #v7=(Reference);
    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 182
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;

    iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;

    invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 184
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_5

    move v1, v4

    .line 185
    .local v1, hasTitle:Z
    :goto_0
    #v1=(Boolean);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;

    #v3=(Reference);
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    #v3=(Boolean);
    if-nez v3, :cond_6

    move v0, v4

    .line 186
    .local v0, hasSubtitle:Z
    :goto_1
    #v0=(Boolean);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;

    #v4=(Reference);
    if-eqz v0, :cond_7

    move v3, v5

    :goto_2
    #v3=(PosByte);
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 187
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v3=(Reference);
    if-nez v1, :cond_2

    if-eqz v0, :cond_3

    :cond_2
    move v6, v5

    :cond_3
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 188
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    if-nez v3, :cond_4

    .line 189
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V

    .line 191
    :cond_4
    return-void

    .end local v0           #hasSubtitle:Z
    .end local v1           #hasTitle:Z
    :cond_5
    #v0=(Uninit);v1=(Uninit);v3=(Boolean);v4=(One);
    move v1, v5

    .line 184
    #v1=(Null);
    goto :goto_0

    .restart local v1       #hasTitle:Z
    :cond_6
    #v1=(Boolean);
    move v0, v5

    .line 185
    #v0=(Null);
    goto :goto_1

    .restart local v0       #hasSubtitle:Z
    :cond_7
    #v0=(Boolean);v4=(Reference);
    move v3, v6

    .line 186
    #v3=(PosByte);
    goto :goto_2
.end method


# virtual methods
.method public bridge synthetic animateToVisibility(I)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 37
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->animateToVisibility(I)V

    return-void
.end method

.method public closeMode()V
    .locals 1

    .prologue
    .line 241
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 242
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->killMode()V

    .line 245
    :cond_0
    return-void
.end method

.method public bridge synthetic dismissPopupMenus()V
    .locals 0

    .prologue
    .line 37
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->dismissPopupMenus()V

    return-void
.end method

.method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .prologue
    .line 284
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    #v0=(UninitRef);
    const/4 v1, -0x1

    #v1=(Byte);
    const/4 v2, -0x2

    #v2=(Byte);
    invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    #v0=(Reference);
    return-object v0
.end method

.method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2
    .parameter "attrs"

    .prologue
    .line 290
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    #v0=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic getAnimatedVisibility()I
    .locals 1

    .prologue
    .line 37
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getAnimatedVisibility()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public bridge synthetic getContentHeight()I
    .locals 1

    .prologue
    .line 37
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContentHeight()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getSubtitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 163
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 159
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public hideOverflowMenu()Z
    .locals 1

    .prologue
    .line 266
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 267
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z

    move-result v0

    .line 269
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public initForMode(Landroid/support/v7/view/ActionMode;)V
    .locals 8
    .parameter "mode"

    .prologue
    const/4 v7, 0x1

    #v7=(One);
    const/4 v6, -0x1

    .line 194
    #v6=(Byte);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    #v4=(Reference);
    if-nez v4, :cond_2

    .line 195
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 196
    .local v1, inflater:Landroid/view/LayoutInflater;
    #v1=(Reference);
    sget v4, Landroid/support/v7/appcompat/R$layout;->abc_action_mode_close_item:I

    #v4=(Integer);
    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v1, v4, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v4

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    .line 197
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V

    .line 202
    .end local v1           #inflater:Landroid/view/LayoutInflater;
    :cond_0
    :goto_0
    #v1=(Conflicted);v5=(Conflicted);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    sget v5, Landroid/support/v7/appcompat/R$id;->action_mode_close_button:I

    #v5=(Integer);
    invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 203
    .local v0, closeButton:Landroid/view/View;
    #v0=(Reference);
    new-instance v4, Landroid/support/v7/internal/widget/ActionBarContextView$1;

    #v4=(UninitRef);
    invoke-direct {v4, p0, p1}, Landroid/support/v7/internal/widget/ActionBarContextView$1;-><init>(Landroid/support/v7/internal/widget/ActionBarContextView;Landroid/support/v7/view/ActionMode;)V

    #v4=(Reference);
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    invoke-virtual {p1}, Landroid/support/v7/view/ActionMode;->getMenu()Landroid/view/Menu;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 210
    .local v3, menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    if-eqz v4, :cond_1

    .line 211
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z

    .line 213
    :cond_1
    new-instance v4, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v4=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v5

    #v5=(Reference);
    invoke-direct {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;-><init>(Landroid/content/Context;)V

    #v4=(Reference);
    iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    .line 214
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, v7}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setReserveOverflow(Z)V

    .line 216
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    #v2=(UninitRef);
    const/4 v4, -0x2

    #v4=(Byte);
    invoke-direct {v2, v4, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 219
    .local v2, layoutParams:Landroid/view/ViewGroup$LayoutParams;
    #v2=(Reference);
    iget-boolean v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitActionBar:Z

    #v4=(Boolean);
    if-nez v4, :cond_3

    .line 220
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 221
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v4

    check-cast v4, Landroid/support/v7/internal/view/menu/ActionMenuView;

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 222
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    const/4 v5, 0x0

    #v5=(Null);
    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 223
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {p0, v4, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 238
    :goto_1
    #v5=(Reference);
    return-void

    .line 198
    .end local v0           #closeButton:Landroid/view/View;
    .end local v2           #layoutParams:Landroid/view/ViewGroup$LayoutParams;
    .end local v3           #menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v4

    if-nez v4, :cond_0

    .line 199
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 226
    .restart local v0       #closeButton:Landroid/view/View;
    .restart local v2       #layoutParams:Landroid/view/ViewGroup$LayoutParams;
    .restart local v3       #menu:Landroid/support/v7/internal/view/menu/MenuBuilder;
    :cond_3
    #v0=(Reference);v1=(Conflicted);v2=(Reference);v3=(Reference);v4=(Boolean);v5=(Reference);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v4=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I

    #v5=(Integer);
    invoke-virtual {v4, v5, v7}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V

    .line 229
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const v5, 0x7fffffff

    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V

    .line 231
    iput v6, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 232
    iget v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I

    #v4=(Integer);
    iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 233
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v4=(Reference);
    invoke-virtual {v3, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 234
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v4

    check-cast v4, Landroid/support/v7/internal/view/menu/ActionMenuView;

    iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 235
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 236
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v4, v5, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_1
.end method

.method public isOverflowMenuShowing()Z
    .locals 1

    .prologue
    .line 274
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 275
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z

    move-result v0

    .line 277
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public bridge synthetic isOverflowReserved()Z
    .locals 1

    .prologue
    .line 37
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->isOverflowReserved()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public isTitleOptional()Z
    .locals 1

    .prologue
    .line 414
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleOptional:Z

    #v0=(Boolean);
    return v0
.end method

.method public killMode()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 248
    #v2=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->removeAllViews()V

    .line 249
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 250
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->removeView(Landroid/view/View;)V

    .line 252
    :cond_0
    #v1=(Conflicted);
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    .line 253
    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 254
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 84
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onDetachedFromWindow()V

    .line 85
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 86
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z

    .line 87
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideSubMenus()Z

    .line 89
    :cond_0
    return-void
.end method

.method protected onLayout(ZIIII)V
    .locals 7
    .parameter "changed"
    .parameter "l"
    .parameter "t"
    .parameter "r"
    .parameter "b"

    .prologue
    const/16 v6, 0x8

    .line 378
    #v6=(PosByte);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingLeft()I

    move-result v2

    .line 379
    .local v2, x:I
    #v2=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingTop()I

    move-result v3

    .line 380
    .local v3, y:I
    #v3=(Integer);
    sub-int v4, p5, p3

    #v4=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingTop()I

    move-result v5

    #v5=(Integer);
    sub-int/2addr v4, v5

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingBottom()I

    move-result v5

    sub-int v0, v4, v5

    .line 382
    .local v0, contentHeight:I
    #v0=(Integer);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    #v4=(Reference);
    if-eqz v4, :cond_0

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    invoke-virtual {v4}, Landroid/view/View;->getVisibility()I

    move-result v4

    #v4=(Integer);
    if-eq v4, v6, :cond_0

    .line 383
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 385
    .local v1, lp:Landroid/view/ViewGroup$MarginLayoutParams;
    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    #v4=(Integer);
    add-int/2addr v2, v4

    .line 386
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    #v4=(Reference);
    invoke-virtual {p0, v4, v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->positionChild(Landroid/view/View;III)I

    move-result v4

    #v4=(Integer);
    add-int/2addr v2, v4

    .line 387
    iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v2, v4

    .line 391
    .end local v1           #lp:Landroid/view/ViewGroup$MarginLayoutParams;
    :cond_0
    #v1=(Conflicted);v4=(Conflicted);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v4=(Reference);
    if-eqz v4, :cond_1

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    if-nez v4, :cond_1

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getVisibility()I

    move-result v4

    #v4=(Integer);
    if-eq v4, v6, :cond_1

    .line 392
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    #v4=(Reference);
    invoke-virtual {p0, v4, v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->positionChild(Landroid/view/View;III)I

    move-result v4

    #v4=(Integer);
    add-int/2addr v2, v4

    .line 395
    :cond_1
    #v4=(Conflicted);
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    #v4=(Reference);
    if-eqz v4, :cond_2

    .line 396
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    invoke-virtual {p0, v4, v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->positionChild(Landroid/view/View;III)I

    move-result v4

    #v4=(Integer);
    add-int/2addr v2, v4

    .line 399
    :cond_2
    #v4=(Conflicted);
    sub-int v4, p4, p2

    #v4=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingRight()I

    move-result v5

    sub-int v2, v4, v5

    .line 401
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    #v4=(Reference);
    if-eqz v4, :cond_3

    .line 402
    iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {p0, v4, v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->positionChildInverse(Landroid/view/View;III)I

    move-result v4

    #v4=(Integer);
    sub-int/2addr v2, v4

    .line 404
    :cond_3
    #v4=(Conflicted);
    return-void
.end method

.method protected onMeasure(II)V
    .locals 27
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 295
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v23

    .line 296
    .local v23, widthMode:I
    #v23=(Integer);
    const/high16 v24, 0x4000

    #v24=(Integer);
    move/from16 v0, v23

    #v0=(Integer);
    move/from16 v1, v24

    #v1=(Integer);
    if-eq v0, v1, :cond_0

    .line 297
    new-instance v24, Ljava/lang/IllegalStateException;

    #v24=(UninitRef);
    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v26

    #v26=(Reference);
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, " can only be used "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, "with android:layout_width=\"FILL_PARENT\" (or fill_parent)"

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-direct/range {v24 .. v25}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v24=(Reference);
    throw v24

    .line 301
    :cond_0
    #v24=(Integer);v25=(Uninit);v26=(Uninit);
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v12

    .line 302
    .local v12, heightMode:I
    #v12=(Integer);
    if-nez v12, :cond_1

    .line 303
    new-instance v24, Ljava/lang/IllegalStateException;

    #v24=(UninitRef);
    new-instance v25, Ljava/lang/StringBuilder;

    #v25=(UninitRef);
    invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V

    #v25=(Reference);
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v26

    #v26=(Reference);
    invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v26

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, " can only be used "

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    const-string v26, "with android:layout_height=\"wrap_content\""

    invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v25

    invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v25

    invoke-direct/range {v24 .. v25}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v24=(Reference);
    throw v24

    .line 307
    :cond_1
    #v24=(Integer);v25=(Uninit);v26=(Uninit);
    invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v5

    .line 309
    .local v5, contentWidth:I
    #v5=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I

    #v0=(Integer);
    move/from16 v24, v0

    if-lez v24, :cond_8

    move-object/from16 v0, p0

    #v0=(Reference);
    iget v15, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I

    .line 312
    .local v15, maxHeight:I
    :goto_0
    #v0=(Conflicted);v15=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingTop()I

    move-result v24

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingBottom()I

    move-result v25

    #v25=(Integer);
    add-int v22, v24, v25

    .line 313
    .local v22, verticalPadding:I
    #v22=(Integer);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingLeft()I

    move-result v24

    sub-int v24, v5, v24

    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingRight()I

    move-result v25

    sub-int v3, v24, v25

    .line 314
    .local v3, availableWidth:I
    #v3=(Integer);
    sub-int v11, v15, v22

    .line 315
    .local v11, height:I
    #v11=(Integer);
    const/high16 v24, -0x8000

    move/from16 v0, v24

    #v0=(Integer);
    invoke-static {v11, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v4

    .line 318
    .local v4, childSpecHeight:I
    #v4=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    move-object/from16 v24, v0

    #v24=(Reference);
    if-eqz v24, :cond_2

    .line 319
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    #v25=(Null);
    move-object/from16 v0, p0

    move-object/from16 v1, v24

    #v1=(Reference);
    move/from16 v2, v25

    #v2=(Null);
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->measureChildView(Landroid/view/View;III)I

    move-result v3

    .line 320
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    #v14=(Reference);
    check-cast v14, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 322
    .local v14, lp:Landroid/view/ViewGroup$MarginLayoutParams;
    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    move/from16 v25, v0

    #v25=(Integer);
    add-int v24, v24, v25

    sub-int v3, v3, v24

    .line 325
    .end local v14           #lp:Landroid/view/ViewGroup$MarginLayoutParams;
    :cond_2
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v14=(Conflicted);v24=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v24, v0

    #v24=(Reference);
    if-eqz v24, :cond_3

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v24

    move-object/from16 v0, v24

    move-object/from16 v1, p0

    #v1=(Reference);
    if-ne v0, v1, :cond_3

    .line 326
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    move-object/from16 v24, v0

    const/16 v25, 0x0

    #v25=(Null);
    move-object/from16 v0, p0

    move-object/from16 v1, v24

    move/from16 v2, v25

    #v2=(Null);
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->measureChildView(Landroid/view/View;III)I

    move-result v3

    .line 330
    :cond_3
    #v1=(Conflicted);v2=(Conflicted);v25=(Integer);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v24, v0

    if-eqz v24, :cond_5

    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    move-object/from16 v24, v0

    if-nez v24, :cond_5

    .line 331
    move-object/from16 v0, p0

    iget-boolean v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleOptional:Z

    #v0=(Boolean);
    move/from16 v24, v0

    #v24=(Boolean);
    if-eqz v24, :cond_b

    .line 332
    const/16 v24, 0x0

    #v24=(Null);
    const/16 v25, 0x0

    #v25=(Null);
    invoke-static/range {v24 .. v25}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v20

    .line 334
    .local v20, titleWidthSpec:I
    #v20=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v24, v0

    #v24=(Reference);
    move-object/from16 v0, v24

    move/from16 v1, v20

    #v1=(Integer);
    invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->measure(II)V

    .line 335
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/widget/LinearLayout;->getMeasuredWidth()I

    move-result v19

    .line 336
    .local v19, titleWidth:I
    #v19=(Integer);
    move/from16 v0, v19

    #v0=(Integer);
    if-gt v0, v3, :cond_9

    const/16 v18, 0x1

    .line 337
    .local v18, titleFits:Z
    :goto_1
    #v18=(Boolean);
    if-eqz v18, :cond_4

    .line 338
    sub-int v3, v3, v19

    .line 340
    :cond_4
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v25, v0

    #v25=(Reference);
    if-eqz v18, :cond_a

    const/16 v24, 0x0

    :goto_2
    #v24=(PosByte);
    move-object/from16 v0, v25

    move/from16 v1, v24

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 346
    .end local v18           #titleFits:Z
    .end local v19           #titleWidth:I
    .end local v20           #titleWidthSpec:I
    :cond_5
    :goto_3
    #v1=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v24=(Conflicted);v25=(Conflicted);
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    move-object/from16 v24, v0

    #v24=(Reference);
    if-eqz v24, :cond_6

    .line 347
    move-object/from16 v0, p0

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    move-object/from16 v24, v0

    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v14

    .line 348
    .local v14, lp:Landroid/view/ViewGroup$LayoutParams;
    #v14=(Reference);
    iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->width:I

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    const/16 v25, -0x2

    #v25=(Byte);
    move/from16 v0, v24

    move/from16 v1, v25

    #v1=(Byte);
    if-eq v0, v1, :cond_c

    const/high16 v10, 0x4000

    .line 350
    .local v10, customWidthMode:I
    :goto_4
    #v10=(Integer);
    iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->width:I

    move/from16 v24, v0

    if-ltz v24, :cond_d

    iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->width:I

    move/from16 v24, v0

    move/from16 v0, v24

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v9

    .line 352
    .local v9, customWidth:I
    :goto_5
    #v9=(Integer);
    iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v24, v0

    const/16 v25, -0x2

    move/from16 v0, v24

    move/from16 v1, v25

    if-eq v0, v1, :cond_e

    const/high16 v8, 0x4000

    .line 354
    .local v8, customHeightMode:I
    :goto_6
    #v8=(Integer);
    iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v24, v0

    if-ltz v24, :cond_f

    iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->height:I

    move/from16 v24, v0

    move/from16 v0, v24

    invoke-static {v0, v11}, Ljava/lang/Math;->min(II)I

    move-result v7

    .line 356
    .local v7, customHeight:I
    :goto_7
    #v7=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    move-object/from16 v24, v0

    #v24=(Reference);
    invoke-static {v9, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v25

    #v25=(Integer);
    invoke-static {v7, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v26

    #v26=(Integer);
    invoke-virtual/range {v24 .. v26}, Landroid/view/View;->measure(II)V

    .line 360
    .end local v7           #customHeight:I
    .end local v8           #customHeightMode:I
    .end local v9           #customWidth:I
    .end local v10           #customWidthMode:I
    .end local v14           #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_6
    #v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    move-object/from16 v0, p0

    iget v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I

    #v0=(Integer);
    move/from16 v24, v0

    #v24=(Integer);
    if-gtz v24, :cond_11

    .line 361
    const/16 v16, 0x0

    .line 362
    .local v16, measuredHeight:I
    #v16=(Null);
    invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getChildCount()I

    move-result v6

    .line 363
    .local v6, count:I
    #v6=(Integer);
    const/4 v13, 0x0

    .local v13, i:I
    :goto_8
    #v13=(Integer);v16=(Integer);v17=(Conflicted);v21=(Conflicted);
    if-ge v13, v6, :cond_10

    .line 364
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v13}, Landroid/support/v7/internal/widget/ActionBarContextView;->getChildAt(I)Landroid/view/View;

    move-result-object v21

    .line 365
    .local v21, v:Landroid/view/View;
    #v21=(Reference);
    invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getMeasuredHeight()I

    move-result v24

    add-int v17, v24, v22

    .line 366
    .local v17, paddedViewHeight:I
    #v17=(Integer);
    move/from16 v0, v17

    #v0=(Integer);
    move/from16 v1, v16

    #v1=(Integer);
    if-le v0, v1, :cond_7

    .line 367
    move/from16 v16, v17

    .line 363
    :cond_7
    add-int/lit8 v13, v13, 0x1

    goto :goto_8

    .line 309
    .end local v3           #availableWidth:I
    .end local v4           #childSpecHeight:I
    .end local v6           #count:I
    .end local v11           #height:I
    .end local v13           #i:I
    .end local v15           #maxHeight:I
    .end local v16           #measuredHeight:I
    .end local v17           #paddedViewHeight:I
    .end local v21           #v:Landroid/view/View;
    .end local v22           #verticalPadding:I
    :cond_8
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v25=(Uninit);v26=(Uninit);
    invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v15

    #v15=(Integer);
    goto/16 :goto_0

    .line 336
    .restart local v3       #availableWidth:I
    .restart local v4       #childSpecHeight:I
    .restart local v11       #height:I
    .restart local v15       #maxHeight:I
    .restart local v19       #titleWidth:I
    .restart local v20       #titleWidthSpec:I
    .restart local v22       #verticalPadding:I
    :cond_9
    #v2=(Conflicted);v3=(Integer);v4=(Integer);v11=(Integer);v14=(Conflicted);v19=(Integer);v20=(Integer);v22=(Integer);v24=(Reference);v25=(Null);
    const/16 v18, 0x0

    #v18=(Null);
    goto/16 :goto_1

    .line 340
    .restart local v18       #titleFits:Z
    :cond_a
    #v0=(Reference);v18=(Boolean);v25=(Reference);
    const/16 v24, 0x8

    #v24=(PosByte);
    goto/16 :goto_2

    .line 342
    .end local v18           #titleFits:Z
    .end local v19           #titleWidth:I
    .end local v20           #titleWidthSpec:I
    :cond_b
    #v0=(Boolean);v1=(Conflicted);v18=(Uninit);v19=(Uninit);v20=(Uninit);v24=(Boolean);v25=(Integer);
    move-object/from16 v0, p0

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    move-object/from16 v24, v0

    #v24=(Reference);
    const/16 v25, 0x0

    #v25=(Null);
    move-object/from16 v0, p0

    move-object/from16 v1, v24

    #v1=(Reference);
    move/from16 v2, v25

    #v2=(Null);
    invoke-virtual {v0, v1, v3, v4, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->measureChildView(Landroid/view/View;III)I

    move-result v3

    goto/16 :goto_3

    .line 348
    .restart local v14       #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_c
    #v0=(Integer);v1=(Byte);v2=(Conflicted);v14=(Reference);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v24=(Integer);v25=(Byte);
    const/high16 v10, -0x8000

    #v10=(Integer);
    goto/16 :goto_4

    .restart local v10       #customWidthMode:I
    :cond_d
    move v9, v3

    .line 350
    #v9=(Integer);
    goto :goto_5

    .line 352
    .restart local v9       #customWidth:I
    :cond_e
    const/high16 v8, -0x8000

    #v8=(Integer);
    goto :goto_6

    .restart local v8       #customHeightMode:I
    :cond_f
    move v7, v11

    .line 354
    #v7=(Integer);
    goto :goto_7

    .line 370
    .end local v8           #customHeightMode:I
    .end local v9           #customWidth:I
    .end local v10           #customWidthMode:I
    .end local v14           #lp:Landroid/view/ViewGroup$LayoutParams;
    .restart local v6       #count:I
    .restart local v13       #i:I
    .restart local v16       #measuredHeight:I
    :cond_10
    #v1=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Integer);v14=(Conflicted);v16=(Integer);v17=(Conflicted);v21=(Conflicted);v25=(Conflicted);v26=(Conflicted);
    move-object/from16 v0, p0

    #v0=(Reference);
    move/from16 v1, v16

    #v1=(Integer);
    invoke-virtual {v0, v5, v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->setMeasuredDimension(II)V

    .line 374
    .end local v6           #count:I
    .end local v13           #i:I
    .end local v16           #measuredHeight:I
    :goto_9
    #v1=(Conflicted);v6=(Conflicted);v13=(Conflicted);v16=(Conflicted);
    return-void

    .line 372
    :cond_11
    #v0=(Integer);v6=(Uninit);v13=(Uninit);v16=(Uninit);v17=(Uninit);v21=(Uninit);
    move-object/from16 v0, p0

    #v0=(Reference);
    invoke-virtual {v0, v5, v15}, Landroid/support/v7/internal/widget/ActionBarContextView;->setMeasuredDimension(II)V

    goto :goto_9
.end method

.method public bridge synthetic postShowOverflowMenu()V
    .locals 0

    .prologue
    .line 37
    invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->postShowOverflowMenu()V

    return-void
.end method

.method public setContentHeight(I)V
    .locals 0
    .parameter "height"

    .prologue
    .line 130
    iput p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I

    .line 131
    return-void
.end method

.method public setCustomView(Landroid/view/View;)V
    .locals 1
    .parameter "view"

    .prologue
    .line 134
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 135
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->removeView(Landroid/view/View;)V

    .line 137
    :cond_0
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;

    .line 138
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    if-eqz v0, :cond_1

    .line 139
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->removeView(Landroid/view/View;)V

    .line 140
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;

    .line 142
    :cond_1
    #v0=(Reference);
    if-eqz p1, :cond_2

    .line 143
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V

    .line 145
    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->requestLayout()V

    .line 146
    return-void
.end method

.method public setSplitActionBar(Z)V
    .locals 6
    .parameter "split"

    .prologue
    const/4 v5, -0x1

    .line 93
    #v5=(Byte);
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitActionBar:Z

    #v2=(Boolean);
    if-eq v2, p1, :cond_2

    .line 94
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v2=(Reference);
    if-eqz v2, :cond_1

    .line 96
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    #v0=(UninitRef);
    const/4 v2, -0x2

    #v2=(Byte);
    invoke-direct {v0, v2, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    .line 99
    .local v0, layoutParams:Landroid/view/ViewGroup$LayoutParams;
    #v0=(Reference);
    if-nez p1, :cond_3

    .line 100
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v2=(Reference);
    invoke-virtual {v2, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v2

    check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;

    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 101
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 102
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/view/ViewGroup;

    .line 103
    .local v1, oldParent:Landroid/view/ViewGroup;
    if-eqz v1, :cond_0

    .line 104
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 106
    :cond_0
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {p0, v2, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 125
    .end local v0           #layoutParams:Landroid/view/ViewGroup$LayoutParams;
    .end local v1           #oldParent:Landroid/view/ViewGroup;
    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitActionBar(Z)V

    .line 127
    :cond_2
    #v2=(Conflicted);
    return-void

    .line 109
    .restart local v0       #layoutParams:Landroid/view/ViewGroup$LayoutParams;
    :cond_3
    #v0=(Reference);v1=(Uninit);v2=(Byte);v3=(Uninit);v4=(Uninit);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v2=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;

    move-result-object v3

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v3

    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    #v3=(Integer);
    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {v2, v3, v4}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V

    .line 112
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    const v3, 0x7fffffff

    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V

    .line 114
    iput v5, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 115
    iget v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I

    #v2=(Integer);
    iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 116
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v2=(Reference);
    invoke-virtual {v2, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;

    move-result-object v2

    check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;

    iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    .line 117
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitBackground:Landroid/graphics/drawable/Drawable;

    #v3=(Reference);
    invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 118
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/view/ViewGroup;

    .line 119
    .restart local v1       #oldParent:Landroid/view/ViewGroup;
    if-eqz v1, :cond_4

    .line 120
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 122
    :cond_4
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_0
.end method

.method public bridge synthetic setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 37
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V

    return-void
.end method

.method public bridge synthetic setSplitWhenNarrow(Z)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 37
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitWhenNarrow(Z)V

    return-void
.end method

.method public setSubtitle(Ljava/lang/CharSequence;)V
    .locals 0
    .parameter "subtitle"

    .prologue
    .line 154
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;

    .line 155
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->initTitle()V

    .line 156
    return-void
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 0
    .parameter "title"

    .prologue
    .line 149
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;

    .line 150
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->initTitle()V

    .line 151
    return-void
.end method

.method public setTitleOptional(Z)V
    .locals 1
    .parameter "titleOptional"

    .prologue
    .line 407
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleOptional:Z

    #v0=(Boolean);
    if-eq p1, v0, :cond_0

    .line 408
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->requestLayout()V

    .line 410
    :cond_0
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleOptional:Z

    .line 411
    return-void
.end method

.method public bridge synthetic setVisibility(I)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 37
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setVisibility(I)V

    return-void
.end method

.method public showOverflowMenu()Z
    .locals 1

    .prologue
    .line 258
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 259
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z

    move-result v0

    .line 261
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
