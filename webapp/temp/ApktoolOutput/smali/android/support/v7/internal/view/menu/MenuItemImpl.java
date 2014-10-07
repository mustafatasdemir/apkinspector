package android.support.v7.internal.view.menu; class MenuItemImpl {/*

.class public final Landroid/support/v7/internal/view/menu/MenuItemImpl;
.super Ljava/lang/Object;
.source "MenuItemImpl.java"

# interfaces
.implements Landroid/support/v4/internal/view/SupportMenuItem;


# static fields
.field private static final CHECKABLE:I = 0x1

.field private static final CHECKED:I = 0x2

.field private static final ENABLED:I = 0x10

.field private static final EXCLUSIVE:I = 0x4

.field private static final HIDDEN:I = 0x8

.field private static final IS_ACTION:I = 0x20

.field static final NO_ICON:I = 0x0

.field private static final SHOW_AS_ACTION_MASK:I = 0x3

.field private static final TAG:Ljava/lang/String; = "MenuItemImpl"

.field private static sDeleteShortcutLabel:Ljava/lang/String;

.field private static sEnterShortcutLabel:Ljava/lang/String;

.field private static sPrependShortcutLabel:Ljava/lang/String;

.field private static sSpaceShortcutLabel:Ljava/lang/String;


# instance fields
.field private mActionProvider:Landroid/support/v4/view/ActionProvider;

.field private mActionView:Landroid/view/View;

.field private final mCategoryOrder:I

.field private mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;

.field private mFlags:I

.field private final mGroup:I

.field private mIconDrawable:Landroid/graphics/drawable/Drawable;

.field private mIconResId:I

.field private final mId:I

.field private mIntent:Landroid/content/Intent;

.field private mIsActionViewExpanded:Z

.field private mItemCallback:Ljava/lang/Runnable;

.field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private mMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

.field private mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;

.field private final mOrdering:I

.field private mShortcutAlphabeticChar:C

.field private mShortcutNumericChar:C

.field private mShowAsAction:I

.field private mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;

.field private mTitle:Ljava/lang/CharSequence;

.field private mTitleCondensed:Ljava/lang/CharSequence;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/view/menu/MenuBuilder;IIIILjava/lang/CharSequence;I)V
    .locals 2
    .parameter "menu"
    .parameter "group"
    .parameter "id"
    .parameter "categoryOrder"
    .parameter "ordering"
    .parameter "title"
    .parameter "showAsAction"

    .prologue
    const/4 v1, 0x0

    .line 124
    #v1=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 65
    #p0=(Reference);
    iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I

    .line 80
    const/16 v0, 0x10

    #v0=(PosByte);
    iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 88
    iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I

    .line 93
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIsActionViewExpanded:Z

    .line 138
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 139
    iput p3, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mId:I

    .line 140
    iput p2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mGroup:I

    .line 141
    iput p4, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mCategoryOrder:I

    .line 142
    iput p5, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOrdering:I

    .line 143
    iput-object p6, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;

    .line 144
    iput p7, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I

    .line 145
    return-void
.end method

.method static synthetic access$000(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Landroid/support/v7/internal/view/menu/MenuBuilder;
    .locals 1
    .parameter "x0"

    .prologue
    .line 38
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public actionFormatChanged()V
    .locals 1

    .prologue
    .line 549
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemActionRequestChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V

    .line 550
    return-void
.end method

.method public collapseActionView()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 694
    #v0=(Null);
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x8

    if-nez v1, :cond_1

    .line 707
    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    .line 697
    :cond_1
    #v0=(Null);v1=(Integer);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;

    #v1=(Reference);
    if-nez v1, :cond_2

    .line 699
    const/4 v0, 0x1

    #v0=(One);
    goto :goto_0

    .line 702
    :cond_2
    #v0=(Null);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;

    if-eqz v1, :cond_3

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;

    invoke-interface {v1, p0}, Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 704
    :cond_3
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public expandActionView()Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 680
    #v0=(Null);
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x8

    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;

    #v1=(Reference);
    if-nez v1, :cond_1

    .line 689
    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    .line 684
    :cond_1
    #v0=(Null);v1=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;

    if-eqz v1, :cond_2

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;

    invoke-interface {v1, p0}, Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 686
    :cond_2
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->expandItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z

    move-result v0

    #v0=(Boolean);
    goto :goto_0
.end method

.method public getActionProvider()Landroid/view/ActionProvider;
    .locals 2

    .prologue
    .line 640
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "Implementation should use getSupportActionProvider!"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public getActionView()Landroid/view/View;
    .locals 1

    .prologue
    .line 622
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 623
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;

    .line 628
    :goto_0
    return-object v0

    .line 624
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    if-eqz v0, :cond_1

    .line 625
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v0, p0}, Landroid/support/v4/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;

    .line 626
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;

    goto :goto_0

    .line 628
    :cond_1
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getAlphabeticShortcut()C
    .locals 1

    .prologue
    .line 243
    iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C

    #v0=(Char);
    return v0
.end method

.method getCallback()Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mItemCallback:Ljava/lang/Runnable;

    #v0=(Reference);
    return-object v0
.end method

.method public getGroupId()I
    .locals 1

    .prologue
    .line 203
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mGroup:I

    #v0=(Integer);
    return v0
.end method

.method public getIcon()Landroid/graphics/drawable/Drawable;
    .locals 3

    .prologue
    .line 412
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;

    #v1=(Reference);
    if-eqz v1, :cond_0

    .line 413
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;

    .line 423
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);
    return-object v0

    .line 416
    :cond_0
    #v0=(Uninit);v1=(Reference);v2=(Uninit);
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I

    #v1=(Integer);
    if-eqz v1, :cond_1

    .line 417
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    iget v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 418
    .local v0, icon:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I

    .line 419
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;

    goto :goto_0

    .line 423
    .end local v0           #icon:Landroid/graphics/drawable/Drawable;
    :cond_1
    #v0=(Uninit);v1=(Integer);v2=(Uninit);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getIntent()Landroid/content/Intent;
    .locals 1

    .prologue
    .line 223
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIntent:Landroid/content/Intent;

    #v0=(Reference);
    return-object v0
.end method

.method public getItemId()I
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 209
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mId:I

    #v0=(Integer);
    return v0
.end method

.method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
    .locals 1

    .prologue
    .line 545
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

    #v0=(Reference);
    return-object v0
.end method

.method public getNumericShortcut()C
    .locals 1

    .prologue
    .line 261
    iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutNumericChar:C

    #v0=(Char);
    return v0
.end method

.method public getOrder()I
    .locals 1

    .prologue
    .line 214
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mCategoryOrder:I

    #v0=(Integer);
    return v0
.end method

.method public getOrdering()I
    .locals 1

    .prologue
    .line 218
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOrdering:I

    #v0=(Integer);
    return v0
.end method

.method getShortcut()C
    .locals 1

    .prologue
    .line 292
    iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C

    #v0=(Char);
    return v0
.end method

.method getShortcutLabel()Ljava/lang/String;
    .locals 3

    .prologue
    .line 302
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getShortcut()C

    move-result v1

    .line 303
    .local v1, shortcut:C
    #v1=(Char);
    if-nez v1, :cond_0

    .line 304
    const-string v2, ""

    .line 327
    :goto_0
    #v0=(Conflicted);v2=(Reference);
    return-object v2

    .line 307
    :cond_0
    #v0=(Uninit);v2=(Uninit);
    new-instance v0, Ljava/lang/StringBuilder;

    #v0=(UninitRef);
    sget-object v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;->sPrependShortcutLabel:Ljava/lang/String;

    #v2=(Reference);
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 308
    .local v0, sb:Ljava/lang/StringBuilder;
    #v0=(Reference);
    sparse-switch v1, :sswitch_data_0

    .line 323
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 327
    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    .line 311
    :sswitch_0
    sget-object v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;->sEnterShortcutLabel:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 315
    :sswitch_1
    sget-object v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;->sDeleteShortcutLabel:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 319
    :sswitch_2
    sget-object v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;->sSpaceShortcutLabel:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 308
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
    nop

    :sswitch_data_0
    .sparse-switch
        0x8 -> :sswitch_1
        0xa -> :sswitch_0
        0x20 -> :sswitch_2
    .end sparse-switch
.end method

.method public getSubMenu()Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 341
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    #v0=(Reference);
    return-object v0
.end method

.method public getSupportActionProvider()Landroid/support/v4/view/ActionProvider;
    .locals 1

    .prologue
    .line 646
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    #v0=(Reference);
    return-object v0
.end method

.method public getTitle()Ljava/lang/CharSequence;
    .locals 1
    .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
    .end annotation

    .prologue
    .line 358
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public getTitleCondensed()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 393
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitleCondensed:Ljava/lang/CharSequence;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitleCondensed:Ljava/lang/CharSequence;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;

    goto :goto_0
.end method

.method getTitleForItemView(Landroid/support/v7/internal/view/menu/MenuView$ItemView;)Ljava/lang/CharSequence;
    .locals 1
    .parameter "itemView"

    .prologue
    .line 368
    if-eqz p1, :cond_0

    invoke-interface {p1}, Landroid/support/v7/internal/view/menu/MenuView$ItemView;->prefersCondensedTitle()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getTitleCondensed()Ljava/lang/CharSequence;

    move-result-object v0

    :goto_0
    #v0=(Reference);
    return-object v0

    :cond_0
    #v0=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    #v0=(Reference);
    goto :goto_0
.end method

.method public hasCollapsibleActionView()Z
    .locals 1

    .prologue
    .line 718
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;

    #v0=(Reference);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public hasSubMenu()Z
    .locals 1

    .prologue
    .line 346
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    #v0=(Reference);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public invoke()Z
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 153
    #v1=(One);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;

    #v2=(Reference);
    if-eqz v2, :cond_1

    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;

    invoke-interface {v2, p0}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 180
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
    return v1

    .line 158
    :cond_1
    #v0=(Uninit);v1=(One);v3=(Uninit);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v2=(Reference);
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getRootMenu()Landroid/support/v7/internal/view/menu/MenuBuilder;

    move-result-object v3

    invoke-virtual {v2, v3, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    .line 162
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mItemCallback:Ljava/lang/Runnable;

    #v2=(Reference);
    if-eqz v2, :cond_2

    .line 163
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mItemCallback:Ljava/lang/Runnable;

    invoke-interface {v2}, Ljava/lang/Runnable;->run()V

    goto :goto_0

    .line 167
    :cond_2
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIntent:Landroid/content/Intent;

    if-eqz v2, :cond_3

    .line 169
    :try_start_0
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIntent:Landroid/content/Intent;

    invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 171
    :catch_0
    move-exception v0

    .line 172
    .local v0, e:Landroid/content/ActivityNotFoundException;
    #v0=(Reference);
    const-string v2, "MenuItemImpl"

    const-string v3, "Can\'t find activity to handle intent; ignoring"

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 176
    .end local v0           #e:Landroid/content/ActivityNotFoundException;
    :cond_3
    #v0=(Conflicted);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    if-eqz v2, :cond_4

    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v2}, Landroid/support/v4/view/ActionProvider;->onPerformDefaultAction()Z

    move-result v2

    #v2=(Boolean);
    if-nez v2, :cond_0

    .line 180
    :cond_4
    #v2=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_0
.end method

.method public isActionButton()Z
    .locals 2

    .prologue
    .line 560
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x20

    const/16 v1, 0x20

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

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

.method public isActionViewExpanded()Z
    .locals 1

    .prologue
    .line 728
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIsActionViewExpanded:Z

    #v0=(Boolean);
    return v0
.end method

.method public isCheckable()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 448
    #v0=(One);
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isChecked()Z
    .locals 2

    .prologue
    .line 472
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

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
    .line 185
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

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

.method public isExclusiveCheckable()Z
    .locals 1

    .prologue
    .line 467
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x4

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
    .locals 3

    .prologue
    const/4 v0, 0x1

    #v0=(One);
    const/4 v1, 0x0

    .line 498
    #v1=(Null);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    #v2=(Reference);
    if-eqz v2, :cond_2

    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v2}, Landroid/support/v4/view/ActionProvider;->overridesItemVisibility()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_2

    .line 499
    iget v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v2=(Integer);
    and-int/lit8 v2, v2, 0x8

    if-nez v2, :cond_1

    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v4/view/ActionProvider;->isVisible()Z

    move-result v2

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 501
    :cond_0
    :goto_0
    #v0=(Boolean);v2=(Integer);
    return v0

    :cond_1
    #v0=(One);
    move v0, v1

    .line 499
    #v0=(Null);
    goto :goto_0

    .line 501
    :cond_2
    #v0=(One);v2=(Conflicted);
    iget v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v2=(Integer);
    and-int/lit8 v2, v2, 0x8

    if-eqz v2, :cond_0

    move v0, v1

    #v0=(Null);
    goto :goto_0
.end method

.method public requestsActionButton()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 564
    #v0=(One);
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I

    #v1=(Integer);
    and-int/lit8 v1, v1, 0x1

    if-ne v1, v0, :cond_0

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public requiresActionButton()Z
    .locals 2

    .prologue
    .line 568
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x2

    const/4 v1, 0x2

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

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
    .locals 2
    .parameter "actionProvider"

    .prologue
    .line 634
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "Implementation should use setSupportActionProvider!"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public setActionView(I)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 4
    .parameter "resId"

    .prologue
    .line 614
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 615
    .local v0, context:Landroid/content/Context;
    #v0=(Reference);
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    .line 616
    .local v1, inflater:Landroid/view/LayoutInflater;
    #v1=(Reference);
    new-instance v2, Landroid/widget/LinearLayout;

    #v2=(UninitRef);
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v1, p1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v2

    invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;

    .line 617
    return-object p0
.end method

.method public setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 2
    .parameter "view"

    .prologue
    .line 603
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;

    .line 604
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    .line 605
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    #v0=(Integer);
    const/4 v1, -0x1

    #v1=(Byte);
    if-ne v0, v1, :cond_0

    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mId:I

    if-lez v0, :cond_0

    .line 606
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mId:I

    invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V

    .line 608
    :cond_0
    #v1=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemActionRequestChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V

    .line 609
    return-object p0
.end method

.method public bridge synthetic setActionView(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "x0"

    .prologue
    .line 38
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setActionView(I)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public bridge synthetic setActionView(Landroid/view/View;)Landroid/view/MenuItem;
    .locals 1
    .parameter "x0"

    .prologue
    .line 38
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public setActionViewExpanded(Z)V
    .locals 2
    .parameter "isExpanded"

    .prologue
    .line 722
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIsActionViewExpanded:Z

    .line 723
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 724
    return-void
.end method

.method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
    .locals 2
    .parameter "alphaChar"

    .prologue
    .line 248
    iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C

    #v0=(Char);
    if-ne v0, p1, :cond_0

    .line 256
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-object p0

    .line 252
    :cond_0
    #v0=(Char);v1=(Uninit);
    invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v0

    iput-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C

    .line 254
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    goto :goto_0
.end method

.method public setCallback(Ljava/lang/Runnable;)Landroid/view/MenuItem;
    .locals 0
    .parameter "callback"

    .prologue
    .line 237
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mItemCallback:Ljava/lang/Runnable;

    .line 238
    return-object p0
.end method

.method public setCheckable(Z)Landroid/view/MenuItem;
    .locals 4
    .parameter "checkable"

    .prologue
    const/4 v2, 0x0

    .line 453
    #v2=(Null);
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 454
    .local v0, oldFlags:I
    #v0=(Integer);
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v1=(Integer);
    and-int/lit8 v3, v1, -0x2

    #v3=(Integer);
    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :goto_0
    #v1=(Boolean);
    or-int/2addr v1, v3

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 455
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    if-eq v0, v1, :cond_0

    .line 456
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v1=(Reference);
    invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 459
    :cond_0
    #v1=(Conflicted);
    return-object p0

    :cond_1
    #v1=(Integer);
    move v1, v2

    .line 454
    #v1=(Null);
    goto :goto_0
.end method

.method public setChecked(Z)Landroid/view/MenuItem;
    .locals 1
    .parameter "checked"

    .prologue
    .line 477
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    .line 480
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setExclusiveItemChecked(Landroid/view/MenuItem;)V

    .line 485
    :goto_0
    #v0=(Conflicted);
    return-object p0

    .line 482
    :cond_0
    #v0=(Integer);
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setCheckedInt(Z)V

    goto :goto_0
.end method

.method setCheckedInt(Z)V
    .locals 4
    .parameter "checked"

    .prologue
    const/4 v2, 0x0

    .line 489
    #v2=(Null);
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 490
    .local v0, oldFlags:I
    #v0=(Integer);
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v1=(Integer);
    and-int/lit8 v3, v1, -0x3

    #v3=(Integer);
    if-eqz p1, :cond_1

    const/4 v1, 0x2

    :goto_0
    #v1=(PosByte);
    or-int/2addr v1, v3

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 491
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    if-eq v0, v1, :cond_0

    .line 492
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v1=(Reference);
    invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 494
    :cond_0
    #v1=(Conflicted);
    return-void

    :cond_1
    #v1=(Integer);
    move v1, v2

    .line 490
    #v1=(Null);
    goto :goto_0
.end method

.method public setEnabled(Z)Landroid/view/MenuItem;
    .locals 2
    .parameter "enabled"

    .prologue
    .line 190
    if-eqz p1, :cond_0

    .line 191
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v0=(Integer);
    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 196
    :goto_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 198
    return-object p0

    .line 193
    :cond_0
    #v0=(Uninit);v1=(Uninit);
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    goto :goto_0
.end method

.method public setExclusiveCheckable(Z)V
    .locals 2
    .parameter "exclusive"

    .prologue
    .line 463
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v1, v0, -0x5

    #v1=(Integer);
    if-eqz p1, :cond_0

    const/4 v0, 0x4

    :goto_0
    #v0=(PosByte);
    or-int/2addr v0, v1

    #v0=(Integer);
    iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 464
    return-void

    .line 463
    :cond_0
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public setIcon(I)Landroid/view/MenuItem;
    .locals 2
    .parameter "iconResId"

    .prologue
    .line 437
    const/4 v0, 0x0

    #v0=(Null);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;

    .line 438
    iput p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I

    .line 441
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 443
    return-object p0
.end method

.method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
    .locals 2
    .parameter "icon"

    .prologue
    const/4 v1, 0x0

    .line 428
    #v1=(Null);
    iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I

    .line 429
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;

    .line 430
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 432
    return-object p0
.end method

.method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
    .locals 0
    .parameter "intent"

    .prologue
    .line 228
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIntent:Landroid/content/Intent;

    .line 229
    return-object p0
.end method

.method public setIsActionButton(Z)V
    .locals 1
    .parameter "isActionButton"

    .prologue
    .line 572
    if-eqz p1, :cond_0

    .line 573
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v0=(Integer);
    or-int/lit8 v0, v0, 0x20

    iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 577
    :goto_0
    return-void

    .line 575
    :cond_0
    #v0=(Uninit);
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v0=(Integer);
    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    goto :goto_0
.end method

.method setMenuInfo(Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0
    .parameter "menuInfo"

    .prologue
    .line 540
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

    .line 541
    return-void
.end method

.method public setNumericShortcut(C)Landroid/view/MenuItem;
    .locals 2
    .parameter "numericChar"

    .prologue
    .line 266
    iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutNumericChar:C

    #v0=(Char);
    if-ne v0, p1, :cond_0

    .line 274
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-object p0

    .line 270
    :cond_0
    #v0=(Char);v1=(Uninit);
    iput-char p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutNumericChar:C

    .line 272
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    goto :goto_0
.end method

.method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
    .locals 2
    .parameter "listener"

    .prologue
    .line 733
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "Implementation should use setSupportOnActionExpandListener!"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
    .locals 0
    .parameter "clickListener"

    .prologue
    .line 530
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;

    .line 531
    return-object p0
.end method

.method public setShortcut(CC)Landroid/view/MenuItem;
    .locals 2
    .parameter "numericChar"
    .parameter "alphaChar"

    .prologue
    .line 279
    iput-char p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutNumericChar:C

    .line 280
    invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C

    move-result v0

    #v0=(Char);
    iput-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C

    .line 282
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 284
    return-object p0
.end method

.method public setShowAsAction(I)V
    .locals 2
    .parameter "actionEnum"

    .prologue
    .line 585
    and-int/lit8 v0, p1, 0x3

    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    .line 594
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    const-string v1, "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 597
    :pswitch_0
    #v0=(Integer);v1=(Uninit);
    iput p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I

    .line 598
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemActionRequestChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V

    .line 599
    return-void

    .line 585
    #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public setShowAsActionFlags(I)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 0
    .parameter "actionEnum"

    .prologue
    .line 674
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setShowAsAction(I)V

    .line 675
    return-object p0
.end method

.method public bridge synthetic setShowAsActionFlags(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "x0"

    .prologue
    .line 38
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setShowAsActionFlags(I)Landroid/support/v4/internal/view/SupportMenuItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method setSubMenu(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V
    .locals 1
    .parameter "subMenu"

    .prologue
    .line 350
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    .line 352
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getTitle()Ljava/lang/CharSequence;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 353
    return-void
.end method

.method public setSupportActionProvider(Landroid/support/v4/view/ActionProvider;)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 2
    .parameter "actionProvider"

    .prologue
    const/4 v1, 0x0

    .line 651
    #v1=(Null);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    #v0=(Reference);
    if-ne v0, p1, :cond_1

    .line 669
    :cond_0
    :goto_0
    #v1=(Boolean);
    return-object p0

    .line 655
    :cond_1
    #v1=(Null);
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;

    .line 656
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    if-eqz v0, :cond_2

    .line 657
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ActionProvider;->setVisibilityListener(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V

    .line 659
    :cond_2
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;

    .line 660
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 661
    if-eqz p1, :cond_0

    .line 662
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemImpl$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl$1;-><init>(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V

    #v0=(Reference);
    invoke-virtual {p1, v0}, Landroid/support/v4/view/ActionProvider;->setVisibilityListener(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V

    goto :goto_0
.end method

.method public setSupportOnActionExpandListener(Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/support/v4/internal/view/SupportMenuItem;
    .locals 0
    .parameter "listener"

    .prologue
    .line 713
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;

    .line 714
    return-object p0
.end method

.method public setTitle(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "title"

    .prologue
    .line 388
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 2
    .parameter "title"

    .prologue
    .line 375
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;

    .line 377
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 379
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    if-eqz v0, :cond_0

    .line 380
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    invoke-virtual {v0, p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;

    .line 383
    :cond_0
    return-object p0
.end method

.method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 2
    .parameter "title"

    .prologue
    .line 398
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitleCondensed:Ljava/lang/CharSequence;

    .line 401
    if-nez p1, :cond_0

    .line 402
    iget-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;

    .line 405
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 407
    return-object p0
.end method

.method public setVisible(Z)Landroid/view/MenuItem;
    .locals 1
    .parameter "shown"

    .prologue
    .line 523
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setVisibleInt(Z)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemVisibleChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V

    .line 525
    :cond_0
    #v0=(Conflicted);
    return-object p0
.end method

.method setVisibleInt(Z)Z
    .locals 4
    .parameter "shown"

    .prologue
    const/4 v2, 0x0

    .line 513
    #v2=(Null);
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 514
    .local v0, oldFlags:I
    #v0=(Integer);
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    #v1=(Integer);
    and-int/lit8 v3, v1, -0x9

    #v3=(Integer);
    if-eqz p1, :cond_1

    move v1, v2

    :goto_0
    #v1=(PosByte);
    or-int/2addr v1, v3

    #v1=(Integer);
    iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    .line 515
    iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I

    if-eq v0, v1, :cond_0

    const/4 v2, 0x1

    :cond_0
    #v2=(Boolean);
    return v2

    .line 514
    :cond_1
    #v2=(Null);
    const/16 v1, 0x8

    #v1=(PosByte);
    goto :goto_0
.end method

.method public shouldShowIcon()Z
    .locals 1

    .prologue
    .line 556
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getOptionalIconsVisible()Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method shouldShowShortcut()Z
    .locals 1

    .prologue
    .line 336
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->isShortcutsVisible()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getShortcut()C

    move-result v0

    #v0=(Char);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Char);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public showsTextAsAction()Z
    .locals 2

    .prologue
    .line 580
    iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I

    #v0=(Integer);
    and-int/lit8 v0, v0, 0x4

    const/4 v1, 0x4

    #v1=(PosByte);
    if-ne v0, v1, :cond_0

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

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 536
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

*/}
