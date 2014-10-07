package android.support.v7.internal.view.menu; class ListMenuItemView {/*

.class public Landroid/support/v7/internal/view/menu/ListMenuItemView;
.super Landroid/widget/LinearLayout;
.source "ListMenuItemView.java"

# interfaces
.implements Landroid/support/v7/internal/view/menu/MenuView$ItemView;


# static fields
.field private static final TAG:Ljava/lang/String; = "ListMenuItemView"


# instance fields
.field private mBackground:Landroid/graphics/drawable/Drawable;

.field private mCheckBox:Landroid/widget/CheckBox;

.field private mContext:Landroid/content/Context;

.field private mForceShowIcon:Z

.field private mIconView:Landroid/widget/ImageView;

.field private mInflater:Landroid/view/LayoutInflater;

.field private mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;

.field private mMenuType:I

.field private mPreserveIconSpacing:Z

.field private mRadioButton:Landroid/widget/RadioButton;

.field private mShortcutView:Landroid/widget/TextView;

.field private mTextAppearance:I

.field private mTextAppearanceContext:Landroid/content/Context;

.field private mTitleView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 81
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 82
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    const/4 v3, 0x0

    .line 63
    #v3=(Null);
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 64
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mContext:Landroid/content/Context;

    .line 66
    sget-object v1, Landroid/support/v7/appcompat/R$styleable;->MenuView:[I

    #v1=(Reference);
    invoke-virtual {p1, p2, v1, p3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 70
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    const/4 v1, 0x5

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mBackground:Landroid/graphics/drawable/Drawable;

    .line 71
    const/4 v1, 0x1

    #v1=(One);
    const/4 v2, -0x1

    #v2=(Byte);
    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v1

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTextAppearance:I

    .line 73
    const/4 v1, 0x7

    #v1=(PosByte);
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v1

    #v1=(Boolean);
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z

    .line 75
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTextAppearanceContext:Landroid/content/Context;

    .line 77
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 78
    return-void
.end method

.method private getInflater()Landroid/view/LayoutInflater;
    .locals 1

    .prologue
    .line 281
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mInflater:Landroid/view/LayoutInflater;

    #v0=(Reference);
    if-nez v0, :cond_0

    .line 282
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mInflater:Landroid/view/LayoutInflater;

    .line 284
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mInflater:Landroid/view/LayoutInflater;

    return-object v0
.end method

.method private insertCheckBox()V
    .locals 3

    .prologue
    .line 265
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 266
    .local v0, inflater:Landroid/view/LayoutInflater;
    #v0=(Reference);
    sget v1, Landroid/support/v7/appcompat/R$layout;->abc_list_menu_item_checkbox:I

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/widget/CheckBox;

    iput-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    .line 269
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;)V

    .line 270
    return-void
.end method

.method private insertIconView()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 250
    #v2=(Null);
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 251
    .local v0, inflater:Landroid/view/LayoutInflater;
    #v0=(Reference);
    sget v1, Landroid/support/v7/appcompat/R$layout;->abc_list_menu_item_icon:I

    #v1=(Integer);
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/widget/ImageView;

    iput-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    .line 253
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {p0, v1, v2}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;I)V

    .line 254
    return-void
.end method

.method private insertRadioButton()V
    .locals 3

    .prologue
    .line 257
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->getInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 258
    .local v0, inflater:Landroid/view/LayoutInflater;
    #v0=(Reference);
    sget v1, Landroid/support/v7/appcompat/R$layout;->abc_list_menu_item_radio:I

    #v1=(Integer);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-virtual {v0, v1, p0, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/widget/RadioButton;

    iput-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    .line 261
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->addView(Landroid/view/View;)V

    .line 262
    return-void
.end method


# virtual methods
.method public getItemData()Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .locals 1

    .prologue
    .line 131
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v0=(Reference);
    return-object v0
.end method

.method public initialize(Landroid/support/v7/internal/view/menu/MenuItemImpl;I)V
    .locals 2
    .parameter "itemData"
    .parameter "menuType"

    .prologue
    .line 100
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 101
    iput p2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mMenuType:I

    .line 103
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isVisible()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(PosByte);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setVisibility(I)V

    .line 105
    invoke-virtual {p1, p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getTitleForItemView(Landroid/support/v7/internal/view/menu/MenuView$ItemView;)Ljava/lang/CharSequence;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setTitle(Ljava/lang/CharSequence;)V

    .line 106
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isCheckable()Z

    move-result v0

    #v0=(Boolean);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setCheckable(Z)V

    .line 107
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->shouldShowShortcut()Z

    move-result v0

    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getShortcut()C

    move-result v1

    #v1=(Char);
    invoke-virtual {p0, v0, v1}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setShortcut(ZC)V

    .line 108
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V

    .line 109
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isEnabled()Z

    move-result v0

    #v0=(Boolean);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setEnabled(Z)V

    .line 110
    return-void

    .line 103
    :cond_0
    #v1=(Uninit);
    const/16 v0, 0x8

    #v0=(PosByte);
    goto :goto_0
.end method

.method protected onFinishInflate()V
    .locals 3

    .prologue
    .line 86
    invoke-super {p0}, Landroid/widget/LinearLayout;->onFinishInflate()V

    .line 88
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mBackground:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 90
    sget v0, Landroid/support/v7/appcompat/R$id;->title:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;

    .line 91
    iget v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTextAppearance:I

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-eq v0, v1, :cond_0

    .line 92
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTextAppearanceContext:Landroid/content/Context;

    #v1=(Reference);
    iget v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTextAppearance:I

    #v2=(Integer);
    invoke-virtual {v0, v1, v2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 96
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    sget v0, Landroid/support/v7/appcompat/R$id;->shortcut:I

    #v0=(Integer);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mShortcutView:Landroid/widget/TextView;

    .line 97
    return-void
.end method

.method protected onMeasure(II)V
    .locals 3
    .parameter "widthMeasureSpec"
    .parameter "heightMeasureSpec"

    .prologue
    .line 238
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    #v2=(Reference);
    if-eqz v2, :cond_0

    iget-boolean v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z

    #v2=(Boolean);
    if-eqz v2, :cond_0

    .line 240
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 241
    .local v1, lp:Landroid/view/ViewGroup$LayoutParams;
    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 242
    .local v0, iconLp:Landroid/widget/LinearLayout$LayoutParams;
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    #v2=(Integer);
    if-lez v2, :cond_0

    iget v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    if-gtz v2, :cond_0

    .line 243
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    iput v2, v0, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 246
    .end local v0           #iconLp:Landroid/widget/LinearLayout$LayoutParams;
    .end local v1           #lp:Landroid/view/ViewGroup$LayoutParams;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    invoke-super {p0, p1, p2}, Landroid/widget/LinearLayout;->onMeasure(II)V

    .line 247
    return-void
.end method

.method public prefersCondensedTitle()Z
    .locals 1

    .prologue
    .line 273
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public setCheckable(Z)V
    .locals 5
    .parameter "checkable"

    .prologue
    const/16 v3, 0x8

    .line 135
    #v3=(PosByte);
    if-nez p1, :cond_1

    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    #v4=(Reference);
    if-nez v4, :cond_1

    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    if-nez v4, :cond_1

    .line 178
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    return-void

    .line 144
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isExclusiveCheckable()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_4

    .line 145
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    #v4=(Reference);
    if-nez v4, :cond_2

    .line 146
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->insertRadioButton()V

    .line 148
    :cond_2
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    .line 149
    .local v0, compoundButton:Landroid/widget/CompoundButton;
    #v0=(Reference);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    .line 158
    .local v2, otherCompoundButton:Landroid/widget/CompoundButton;
    :goto_1
    #v2=(Reference);
    if-eqz p1, :cond_7

    .line 159
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isChecked()Z

    move-result v4

    #v4=(Boolean);
    invoke-virtual {v0, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 161
    if-eqz p1, :cond_6

    const/4 v1, 0x0

    .line 162
    .local v1, newVisibility:I
    :goto_2
    #v1=(PosByte);
    invoke-virtual {v0}, Landroid/widget/CompoundButton;->getVisibility()I

    move-result v4

    #v4=(Integer);
    if-eq v4, v1, :cond_3

    .line 163
    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setVisibility(I)V

    .line 167
    :cond_3
    if-eqz v2, :cond_0

    invoke-virtual {v2}, Landroid/widget/CompoundButton;->getVisibility()I

    move-result v4

    if-eq v4, v3, :cond_0

    .line 168
    invoke-virtual {v2, v3}, Landroid/widget/CompoundButton;->setVisibility(I)V

    goto :goto_0

    .line 151
    .end local v0           #compoundButton:Landroid/widget/CompoundButton;
    .end local v1           #newVisibility:I
    .end local v2           #otherCompoundButton:Landroid/widget/CompoundButton;
    :cond_4
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Boolean);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    #v4=(Reference);
    if-nez v4, :cond_5

    .line 152
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->insertCheckBox()V

    .line 154
    :cond_5
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    .line 155
    .restart local v0       #compoundButton:Landroid/widget/CompoundButton;
    #v0=(Reference);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    .restart local v2       #otherCompoundButton:Landroid/widget/CompoundButton;
    #v2=(Reference);
    goto :goto_1

    :cond_6
    #v4=(Boolean);
    move v1, v3

    .line 161
    #v1=(PosByte);
    goto :goto_2

    .line 171
    :cond_7
    #v1=(Uninit);v4=(Reference);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    if-eqz v4, :cond_8

    .line 172
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    invoke-virtual {v4, v3}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 174
    :cond_8
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    if-eqz v4, :cond_0

    .line 175
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    invoke-virtual {v4, v3}, Landroid/widget/RadioButton;->setVisibility(I)V

    goto :goto_0
.end method

.method public setChecked(Z)V
    .locals 2
    .parameter "checked"

    .prologue
    .line 183
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isExclusiveCheckable()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 184
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    #v1=(Reference);
    if-nez v1, :cond_0

    .line 185
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->insertRadioButton()V

    .line 187
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mRadioButton:Landroid/widget/RadioButton;

    .line 195
    .local v0, compoundButton:Landroid/widget/CompoundButton;
    :goto_0
    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/CompoundButton;->setChecked(Z)V

    .line 196
    return-void

    .line 189
    .end local v0           #compoundButton:Landroid/widget/CompoundButton;
    :cond_1
    #v0=(Uninit);v1=(Boolean);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    #v1=(Reference);
    if-nez v1, :cond_2

    .line 190
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->insertCheckBox()V

    .line 192
    :cond_2
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mCheckBox:Landroid/widget/CheckBox;

    .restart local v0       #compoundButton:Landroid/widget/CompoundButton;
    #v0=(Reference);
    goto :goto_0
.end method

.method public setForceShowIcon(Z)V
    .locals 0
    .parameter "forceShow"

    .prologue
    .line 113
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mForceShowIcon:Z

    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z

    .line 114
    return-void
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .parameter "icon"

    .prologue
    const/4 v1, 0x0

    .line 212
    #v1=(Null);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->shouldShowIcon()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    iget-boolean v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mForceShowIcon:Z

    if-eqz v2, :cond_2

    :cond_0
    const/4 v0, 0x1

    .line 213
    .local v0, showIcon:Z
    :goto_0
    #v0=(Boolean);
    if-nez v0, :cond_3

    iget-boolean v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z

    if-nez v2, :cond_3

    .line 234
    .end local p1
    :cond_1
    :goto_1
    #v1=(Reference);v2=(Conflicted);
    return-void

    .end local v0           #showIcon:Z
    .restart local p1
    :cond_2
    #v0=(Uninit);v1=(Null);v2=(Boolean);
    move v0, v1

    .line 212
    #v0=(Null);
    goto :goto_0

    .line 217
    .restart local v0       #showIcon:Z
    :cond_3
    #v0=(Boolean);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    #v2=(Reference);
    if-nez v2, :cond_4

    if-nez p1, :cond_4

    iget-boolean v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 221
    :cond_4
    #v2=(Conflicted);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    #v2=(Reference);
    if-nez v2, :cond_5

    .line 222
    invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->insertIconView()V

    .line 225
    :cond_5
    if-nez p1, :cond_6

    iget-boolean v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mPreserveIconSpacing:Z

    #v2=(Boolean);
    if-eqz v2, :cond_8

    .line 226
    :cond_6
    #v2=(Conflicted);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    #v2=(Reference);
    if-eqz v0, :cond_7

    .end local p1
    :goto_2
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 228
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getVisibility()I

    move-result v2

    #v2=(Integer);
    if-eqz v2, :cond_1

    .line 229
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    #v2=(Reference);
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1

    .line 226
    .restart local p1
    :cond_7
    const/4 p1, 0x0

    #p1=(Null);
    goto :goto_2

    .line 232
    :cond_8
    #v2=(Boolean);p1=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mIconView:Landroid/widget/ImageView;

    #v1=(Reference);
    const/16 v2, 0x8

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_1
.end method

.method public setShortcut(ZC)V
    .locals 3
    .parameter "showShortcut"
    .parameter "shortcutKey"

    .prologue
    .line 199
    if-eqz p1, :cond_2

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->shouldShowShortcut()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_2

    const/4 v0, 0x0

    .line 202
    .local v0, newVisibility:I
    :goto_0
    #v0=(PosByte);v1=(Conflicted);
    if-nez v0, :cond_0

    .line 203
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mShortcutView:Landroid/widget/TextView;

    #v1=(Reference);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getShortcutLabel()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 206
    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mShortcutView:Landroid/widget/TextView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/widget/TextView;->getVisibility()I

    move-result v1

    #v1=(Integer);
    if-eq v1, v0, :cond_1

    .line 207
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mShortcutView:Landroid/widget/TextView;

    #v1=(Reference);
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    .line 209
    :cond_1
    #v1=(Conflicted);
    return-void

    .line 199
    .end local v0           #newVisibility:I
    :cond_2
    #v0=(Uninit);v2=(Uninit);
    const/16 v0, 0x8

    #v0=(PosByte);
    goto :goto_0
.end method

.method public setTitle(Ljava/lang/CharSequence;)V
    .locals 2
    .parameter "title"

    .prologue
    const/16 v1, 0x8

    .line 117
    #v1=(PosByte);
    if-eqz p1, :cond_1

    .line 118
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 120
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    #v0=(Integer);
    if-eqz v0, :cond_0

    .line 121
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 128
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(PosByte);
    return-void

    .line 124
    :cond_1
    #v0=(Uninit);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/widget/TextView;->getVisibility()I

    move-result v0

    #v0=(Integer);
    if-eq v0, v1, :cond_0

    .line 125
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mTitleView:Landroid/widget/TextView;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method public showsIcon()Z
    .locals 1

    .prologue
    .line 277
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ListMenuItemView;->mForceShowIcon:Z

    #v0=(Boolean);
    return v0
.end method

*/}
