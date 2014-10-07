package android.support.v7.internal.view.menu; class ActionMenuItem {/*

.class public Landroid/support/v7/internal/view/menu/ActionMenuItem;
.super Ljava/lang/Object;
.source "ActionMenuItem.java"

# interfaces
.implements Landroid/support/v4/internal/view/SupportMenuItem;


# static fields
.field private static final CHECKABLE:I = 0x1

.field private static final CHECKED:I = 0x2

.field private static final ENABLED:I = 0x10

.field private static final EXCLUSIVE:I = 0x4

.field private static final HIDDEN:I = 0x8

.field private static final NO_ICON:I


# instance fields
.field private final mCategoryOrder:I

.field private mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;

.field private mContext:Landroid/content/Context;

.field private mFlags:I

.field private final mGroup:I

.field private mIconDrawable:Landroid/graphics/drawable/Drawable;

.field private mIconResId:I

.field private final mId:I

.field private mIntent:Landroid/content/Intent;

.field private final mOrdering:I

.field private mShortcutAlphabeticChar:C

.field private mShortcutNumericChar:C

.field private mTitle:Ljava/lang/CharSequence;

.field private mTitleCondensed:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Landroid/content/Context;IIIILjava/lang/CharSequence;)V
    .locals 1
    .parameter "context"
    .parameter "group"
    .parameter "id"
    .parameter "categoryOrder"
    .parameter "ordering"
    .parameter "title"

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    #p0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconResId:I

    .line 55
    const/16 v0, 0x10

    #v0=(PosByte);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    .line 64
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;

    .line 65
    iput p3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mId:I

    .line 66
    iput p2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mGroup:I

    .line 67
    iput p4, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mCategoryOrder:I

    .line 68
    iput p5, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mOrdering:I

    .line 69
    iput-object p6, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;

    .line 70
    return-void
.end method


# virtual methods
.method public collapseActionView()Z
    .locals 1

    .prologue
    .line 277
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public expandActionView()Z
    .locals 1

    .prologue
    .line 272
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getActionProvider()Landroid/view/ActionProvider;
    .locals 1

    .prologue
    .line 246
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    #v0=(Reference);
    throw v0
.end method

.method public getActionView()Landroid/view/View;
    .locals 1

    .prologue
    .line 236
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getAlphabeticShortcut()C
    .locals 1

    .prologue
    .line 73
    iget-char v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutAlphabeticChar:C

    #v0=(Char);
    return v0
.end method

.method public getGroupId()I
    .locals 1

    .prologue
    .line 77
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mGroup:I

    #v0=(Integer);
    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 81
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconDrawable:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    return-object v0
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 85
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    return-object v0
.end method

.method public getItemId()I
    .locals 1

    .prologue
    .line 89
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mId:I

    #v0=(Integer);
    return v0
.end method

.method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    .prologue
    .line 93
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getNumericShortcut()C
    .locals 1

    .prologue
    .line 97
    iget-char v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutNumericChar:C

    #v0=(Char);
    return v0
.end method

.method public getOrder()I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mOrdering:I

    #v0=(Integer);
    return v0
.end method

.method public getSubMenu()Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 105
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getSupportActionProvider()Landroid/support/v4/view/ActionProvider;
    .locals 1

    .prologue
    .line 256
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 109
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitleCondensed:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public hasSubMenu()Z
    .locals 1

    .prologue
    .line 117
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public invoke()Z
    .locals 3

    .prologue
    const/4 v0, 0x1

    .line 215
    #v0=(One);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;

    invoke-interface {v1, p0}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 224
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    return v0

    .line 219
    :cond_0
    #v0=(One);v2=(Uninit);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;

    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 220
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;

    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;

    #v2=(Reference);
    invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 224
    :cond_1
    #v2=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isActionViewExpanded()Z
    .locals 1

    .prologue
    .line 282
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public isCheckable()Z
    .locals 1

    .prologue
    .line 121
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

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

.method public isChecked()Z
    .locals 1

    .prologue
    .line 125
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

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

.method public isEnabled()Z
    .locals 1

    .prologue
    .line 129
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

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

.method public isVisible()Z
    .locals 1

    .prologue
    .line 133
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x8

    if-nez v0, :cond_0

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

.method public setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
    .locals 1
    .parameter "actionProvider"

    .prologue
    .line 241
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    #v0=(Reference);
    throw v0
.end method

.method public setActionView(I)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 1
    .parameter "resId"

    .prologue
    .line 251
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    #v0=(Reference);
    throw v0
.end method

.method public setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 1
    .parameter "actionView"

    .prologue
    .line 232
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    #v0=(Reference);
    throw v0
.end method

.method public bridge synthetic setActionView(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "x0"

    .prologue
    .line 33
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setActionView(I)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 1
    .parameter "x0"

    .prologue
    .line 33
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 0
    .parameter "alphaChar"

    .prologue
    .line 137
    iput-char p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutAlphabeticChar:C

    .line 138
    return-object p0
.end method

.method public setCheckable(Z)Landroid/view/MenuItem;
    .locals 2
    .parameter "checkable"

    .prologue
    .line 142
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v1, v0, -0x2

    #v1=(Integer);
    if-eqz p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    or-int/2addr v0, v1

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    .line 143
    return-object p0

    .line 142
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setChecked(Z)Landroid/view/MenuItem;
    .locals 2
    .parameter "checked"

    .prologue
    .line 152
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v1, v0, -0x3

    #v1=(Integer);
    if-eqz p1, :cond_0

    const/4 v0, 0x2

    :goto_0
    #v0=(PosByte);
    or-int/2addr v0, v1

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    .line 153
    return-object p0

    .line 152
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setEnabled(Z)Landroid/view/MenuItem;
    .locals 2
    .parameter "enabled"

    .prologue
    .line 157
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v1, v0, -0x11

    #v1=(Integer);
    if-eqz p1, :cond_0

    const/16 v0, 0x10

    :goto_0
    #v0=(PosByte);
    or-int/2addr v0, v1

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    .line 158
    return-object p0

    .line 157
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setExclusiveCheckable(Z)Landroid/support/v7/internal/view/menu/ActionMenuItem;
    .locals 2
    .parameter "exclusive"

    .prologue
    .line 147
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v1, v0, -0x5

    #v1=(Integer);
    if-eqz p1, :cond_0

    const/4 v0, 0x4

    :goto_0
    #v0=(PosByte);
    or-int/2addr v0, v1

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    .line 148
    return-object p0

    .line 147
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setIcon(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "iconRes"

    .prologue
    .line 168
    iput p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconResId:I

    .line 169
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconDrawable:Landroid/graphics/drawable/Drawable;

    .line 170
    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 1
    .parameter "icon"

    .prologue
    .line 162
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconDrawable:Landroid/graphics/drawable/Drawable;

    .line 163
    const/4 v0, 0x0

    #v0=(Null);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconResId:I

    .line 164
    return-object p0
.end method

.method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 0
    .parameter "intent"

    .prologue
    .line 174
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;

    .line 175
    return-object p0
.end method

.method public setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 0
    .parameter "numericChar"

    .prologue
    .line 179
    iput-char p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutNumericChar:C

    .line 180
    return-object p0
.end method

.method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 1
    .parameter "listener"

    .prologue
    .line 287
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    #v0=(Reference);
    throw v0
.end method

.method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 0
    .parameter "menuItemClickListener"

    .prologue
    .line 184
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;

    .line 185
    return-object p0
.end method

.method public setShortcut(CC)Landroid/view/MenuItem;
    .locals 0
    .parameter "numericChar"
    .parameter "alphaChar"

    .prologue
    .line 189
    iput-char p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutNumericChar:C

    .line 190
    iput-char p2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutAlphabeticChar:C

    .line 191
    return-object p0
.end method

.method public setShowAsAction(I)V
    .locals 0
    .parameter "show"

    .prologue
    .line 229
    return-void
.end method

.method public setShowAsActionFlags(I)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 0
    .parameter "actionEnum"

    .prologue
    .line 266
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setShowAsAction(I)V

    .line 267
    return-object p0
.end method

.method public bridge synthetic setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "x0"

    .prologue
    .line 33
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setShowAsActionFlags(I)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public setSupportActionProvider(Landroid/support/v4/view/ActionProvider;)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 1
    .parameter "actionProvider"

    .prologue
    .line 261
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    #v0=(Reference);
    throw v0
.end method

.method public setSupportOnActionExpandListener(Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 0
    .parameter "listener"

    .prologue
    .line 293
    return-object p0
.end method

.method public setTitle(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "title"

    .prologue
    .line 200
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;

    .line 201
    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0
    .parameter "title"

    .prologue
    .line 195
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;

    .line 196
    return-object p0
.end method

.method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 0
    .parameter "title"

    .prologue
    .line 205
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitleCondensed:Ljava/lang/CharSequence;

    .line 206
    return-object p0
.end method

.method public setVisible(Z)Landroid/view/MenuItem;
    .locals 2
    .parameter "visible"

    .prologue
    .line 210
    iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v1, v0, 0x8

    #v1=(Integer);
    if-eqz p1, :cond_0

    const/4 v0, 0x0

    :goto_0
    #v0=(PosByte);
    or-int/2addr v0, v1

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I

    .line 211
    return-object p0

    .line 210
    :cond_0
    const/16 v0, 0x8

    #v0=(PosByte);
    goto :goto_0
.end method

*/}
