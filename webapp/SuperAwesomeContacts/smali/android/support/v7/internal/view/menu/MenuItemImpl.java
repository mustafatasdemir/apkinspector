package android.support.v7.internal.view.menu; class MenuItemImpl { void a() { int a;
a=0;// .class public final Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuItemImpl.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final CHECKABLE:I = 0x1
a=0;// 
a=0;// .field private static final CHECKED:I = 0x2
a=0;// 
a=0;// .field private static final ENABLED:I = 0x10
a=0;// 
a=0;// .field private static final EXCLUSIVE:I = 0x4
a=0;// 
a=0;// .field private static final HIDDEN:I = 0x8
a=0;// 
a=0;// .field private static final IS_ACTION:I = 0x20
a=0;// 
a=0;// .field static final NO_ICON:I = 0x0
a=0;// 
a=0;// .field private static final SHOW_AS_ACTION_MASK:I = 0x3
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "MenuItemImpl"
a=0;// 
a=0;// .field private static sDeleteShortcutLabel:Ljava/lang/String;
a=0;// 
a=0;// .field private static sEnterShortcutLabel:Ljava/lang/String;
a=0;// 
a=0;// .field private static sPrependShortcutLabel:Ljava/lang/String;
a=0;// 
a=0;// .field private static sSpaceShortcutLabel:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;// .field private mActionView:Landroid/view/View;
a=0;// 
a=0;// .field private final mCategoryOrder:I
a=0;// 
a=0;// .field private mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;// .field private mFlags:I
a=0;// 
a=0;// .field private final mGroup:I
a=0;// 
a=0;// .field private mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mIconResId:I
a=0;// 
a=0;// .field private final mId:I
a=0;// 
a=0;// .field private mIntent:Landroid/content/Intent;
a=0;// 
a=0;// .field private mIsActionViewExpanded:Z
a=0;// 
a=0;// .field private mItemCallback:Ljava/lang/Runnable;
a=0;// 
a=0;// .field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;// .field private mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;// .field private final mOrdering:I
a=0;// 
a=0;// .field private mShortcutAlphabeticChar:C
a=0;// 
a=0;// .field private mShortcutNumericChar:C
a=0;// 
a=0;// .field private mShowAsAction:I
a=0;// 
a=0;// .field private mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;// .field private mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v7/internal/view/menu/MenuBuilder;IIIILjava/lang/CharSequence;I)V
a=0;//     .locals 2
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "group"    # I
a=0;//     .param p3, "id"    # I
a=0;//     .param p4, "categoryOrder"    # I
a=0;//     .param p5, "ordering"    # I
a=0;//     .param p6, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p7, "showAsAction"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 124
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I
a=0;// 
a=0;//     .line 80
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 88
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I
a=0;// 
a=0;//     .line 93
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIsActionViewExpanded:Z
a=0;// 
a=0;//     .line 138
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 139
a=0;//     iput p3, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mId:I
a=0;// 
a=0;//     .line 140
a=0;//     iput p2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mGroup:I
a=0;// 
a=0;//     .line 141
a=0;//     iput p4, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mCategoryOrder:I
a=0;// 
a=0;//     .line 142
a=0;//     iput p5, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOrdering:I
a=0;// 
a=0;//     .line 143
a=0;//     iput-object p6, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 144
a=0;//     iput p7, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I
a=0;// 
a=0;//     .line 145
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public actionFormatChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 549
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemActionRequestChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
a=0;// 
a=0;//     .line 550
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public collapseActionView()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 694
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 707
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 697
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 699
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 702
a=0;//     :cond_2
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;->onMenuItemActionCollapse(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 704
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public expandActionView()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 680
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x8
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 689
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 684
a=0;//     :cond_1
a=0;//     #v0=(Null);v1=(Reference,Landroid/view/View;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;->onMenuItemActionExpand(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 686
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->expandItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getActionProvider()Landroid/view/ActionProvider;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 640
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Implementation should use getSupportActionProvider!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 622
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 623
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;
a=0;// 
a=0;//     .line 628
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     .line 624
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 625
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v4/view/ActionProvider;->onCreateActionView(Landroid/view/MenuItem;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;
a=0;// 
a=0;//     .line 626
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 628
a=0;//     :cond_1
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAlphabeticShortcut()C
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 243
a=0;//     iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getCallback()Ljava/lang/Runnable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 233
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mItemCallback:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Runnable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getGroupId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mGroup:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 412
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 413
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 423
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 416
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,Landroid/graphics/drawable/Drawable;);v2=(Uninit);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 417
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 418
a=0;//     .local v0, "icon":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I
a=0;// 
a=0;//     .line 419
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 423
a=0;//     .end local v0    # "icon":Landroid/graphics/drawable/Drawable;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getIntent()Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId()I
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 545
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ContextMenu$ContextMenuInfo;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getNumericShortcut()C
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutNumericChar:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOrder()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 214
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mCategoryOrder:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOrdering()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 218
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOrdering:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getShortcut()C
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getShortcutLabel()Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 302
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getShortcut()C
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 303
a=0;//     .local v1, "shortcut":C
a=0;//     #v1=(Char);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 304
a=0;//     const-string v2, ""
a=0;// 
a=0;//     .line 327
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/lang/String;);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 307
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     sget-object v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;->sPrependShortcutLabel:Ljava/lang/String;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 308
a=0;//     .local v0, "sb":Ljava/lang/StringBuilder;
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     sparse-switch v1, :sswitch_data_0
a=0;// 
a=0;//     .line 323
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 327
a=0;//     :goto_1
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 311
a=0;//     :sswitch_0
a=0;//     sget-object v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;->sEnterShortcutLabel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 315
a=0;//     :sswitch_1
a=0;//     sget-object v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;->sDeleteShortcutLabel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 319
a=0;//     :sswitch_2
a=0;//     sget-object v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;->sSpaceShortcutLabel:Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 308
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);p0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x8 -> :sswitch_1
a=0;//         0xa -> :sswitch_0
a=0;//         0x20 -> :sswitch_2
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method public getSubMenu()Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 341
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/SubMenuBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSupportActionProvider()Landroid/support/v4/view/ActionProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 646
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;//     .annotation runtime Landroid/view/ViewDebug$CapturedViewProperty;
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 358
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitleCondensed()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 393
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getTitleForItemView(Landroid/support/v7/internal/view/menu/MenuView$ItemView;)Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;//     .param p1, "itemView"    # Landroid/support/v7/internal/view/menu/MenuView$ItemView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 368
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-interface {p1}, Landroid/support/v7/internal/view/menu/MenuView$ItemView;->prefersCondensedTitle()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getTitleCondensed()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hasCollapsibleActionView()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 718
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hasSubMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 346
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/SubMenuBuilder;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/SubMenuBuilder;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public invoke()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 153
a=0;//     #v1=(One);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/MenuItem$OnMenuItemClickListener;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     invoke-interface {v2, p0}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 180
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Boolean);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 158
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(One);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getRootMenu()Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v2, v3, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 162
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mItemCallback:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Runnable;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 163
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mItemCallback:Ljava/lang/Runnable;
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/lang/Runnable;->run()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 167
a=0;//     :cond_2
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     .line 169
a=0;//     :try_start_0
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;//     :try_end_0
a=0;//     .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 171
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 172
a=0;//     .local v0, "e":Landroid/content/ActivityNotFoundException;
a=0;//     #v0=(Reference,Landroid/content/ActivityNotFoundException;);
a=0;//     const-string v2, "MenuItemImpl"
a=0;// 
a=0;//     const-string v3, "Can\'t find activity to handle intent; ignoring"
a=0;// 
a=0;//     invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
a=0;// 
a=0;//     .line 176
a=0;//     .end local v0    # "e":Landroid/content/ActivityNotFoundException;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     if-eqz v2, :cond_4
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/ActionProvider;->onPerformDefaultAction()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 180
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isActionButton()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 560
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x20
a=0;// 
a=0;//     const/16 v1, 0x20
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
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
a=0;// .method public isActionViewExpanded()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 728
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIsActionViewExpanded:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCheckable()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 448
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isChecked()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 472
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
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
a=0;// .method public isEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 185
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x10
a=0;// 
a=0;//     if-eqz v0, :cond_0
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
a=0;// .method public isExclusiveCheckable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 467
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     if-eqz v0, :cond_0
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
a=0;// .method public isVisible()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 498
a=0;//     #v1=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/ActionProvider;->overridesItemVisibility()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 499
a=0;//     iget v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/ActionProvider;->isVisible()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 501
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(One);
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 499
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 501
a=0;//     :cond_2
a=0;//     #v0=(One);v2=(Conflicted);
a=0;//     iget v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     and-int/lit8 v2, v2, 0x8
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public requestsActionButton()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 564
a=0;//     #v0=(One);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public requiresActionButton()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 568
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x2
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
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
a=0;// .method public setActionProvider(Landroid/view/ActionProvider;)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "actionProvider"    # Landroid/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 634
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Implementation should use setSupportActionProvider!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setActionView(I)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 4
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 614
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 615
a=0;//     .local v0, "context":Landroid/content/Context;
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 616
a=0;//     .local v1, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     new-instance v2, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/widget/LinearLayout;);
a=0;//     invoke-direct {v2, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, p1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     .line 617
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 603
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;
a=0;// 
a=0;//     .line 604
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .line 605
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ne v0, v1, :cond_0
a=0;// 
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mId:I
a=0;// 
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 606
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mId:I
a=0;// 
a=0;//     invoke-virtual {p1, v0}, Landroid/view/View;->setId(I)V
a=0;// 
a=0;//     .line 608
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemActionRequestChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
a=0;// 
a=0;//     .line 609
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setActionView(I)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setActionView(I)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/internal/view/SupportMenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setActionView(Landroid/view/View;)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/internal/view/SupportMenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setActionViewExpanded(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "isExpanded"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 722
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIsActionViewExpanded:Z
a=0;// 
a=0;//     .line 723
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 724
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "alphaChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 256
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 252
a=0;//     :cond_0
a=0;//     #v0=(Char);v1=(Uninit);
a=0;//     invoke-static {p1}, Ljava/lang/Character;->toLowerCase(C)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     iput-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     .line 254
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setCallback(Ljava/lang/Runnable;)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "callback"    # Ljava/lang/Runnable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 237
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mItemCallback:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 238
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCheckable(Z)Landroid/view/MenuItem;
a=0;//     .locals 4
a=0;//     .param p1, "checkable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 453
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 454
a=0;//     .local v0, "oldFlags":I
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v3, v1, -0x2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     or-int/2addr v1, v3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 455
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 456
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 459
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 454
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setChecked(Z)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "checked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 477
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 480
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setExclusiveItemChecked(Landroid/view/MenuItem;)V
a=0;// 
a=0;//     .line 485
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 482
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setCheckedInt(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setCheckedInt(Z)V
a=0;//     .locals 4
a=0;//     .param p1, "checked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 489
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 490
a=0;//     .local v0, "oldFlags":I
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v3, v1, -0x3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     or-int/2addr v1, v3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 491
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 492
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 494
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 490
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setEnabled(Z)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 190
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 191
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     or-int/lit8 v0, v0, 0x10
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 196
a=0;//     :goto_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 198
a=0;//     return-object p0
a=0;// 
a=0;//     .line 193
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, -0x11
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setExclusiveCheckable(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "exclusive"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 463
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, -0x5
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x4
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 464
a=0;//     return-void
a=0;// 
a=0;//     .line 463
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "iconResId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 438
a=0;//     iput p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I
a=0;// 
a=0;//     .line 441
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 443
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 428
a=0;//     #v1=(Null);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconResId:I
a=0;// 
a=0;//     .line 429
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 430
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 432
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 228
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 229
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIsActionButton(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "isActionButton"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 572
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 573
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     or-int/lit8 v0, v0, 0x20
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 577
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 575
a=0;//     :cond_0
a=0;//     #v0=(Uninit);
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, -0x21
a=0;// 
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method setMenuInfo(Landroid/view/ContextMenu$ContextMenuInfo;)V
a=0;//     .locals 0
a=0;//     .param p1, "menuInfo"    # Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 540
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;//     .line 541
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setNumericShortcut(C)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "numericChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     iget-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutNumericChar:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 274
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     #v0=(Char);v1=(Uninit);
a=0;//     iput-char p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutNumericChar:C
a=0;// 
a=0;//     .line 272
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "listener"    # Landroid/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 733
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "Implementation should use setSupportOnActionExpandListener!"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "clickListener"    # Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 530
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .line 531
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setShortcut(CC)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "numericChar"    # C
a=0;//     .param p2, "alphaChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 279
a=0;//     iput-char p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutNumericChar:C
a=0;// 
a=0;//     .line 280
a=0;//     invoke-static {p2}, Ljava/lang/Character;->toLowerCase(C)C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     iput-char v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     .line 282
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 284
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setShowAsAction(I)V
a=0;//     .locals 2
a=0;//     .param p1, "actionEnum"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 585
a=0;//     and-int/lit8 v0, p1, 0x3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     packed-switch v0, :pswitch_data_0
a=0;// 
a=0;//     .line 594
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v1, "SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 597
a=0;//     :pswitch_0
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     iput p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I
a=0;// 
a=0;//     .line 598
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemActionRequestChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
a=0;// 
a=0;//     .line 599
a=0;//     return-void
a=0;// 
a=0;//     .line 585
a=0;//     #v0=(Unknown);v1=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public setShowAsActionFlags(I)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "actionEnum"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 674
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setShowAsAction(I)V
a=0;// 
a=0;//     .line 675
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setShowAsActionFlags(I)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 38
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setShowAsActionFlags(I)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/internal/view/SupportMenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method setSubMenu(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V
a=0;//     .locals 1
a=0;//     .param p1, "subMenu"    # Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 350
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .line 352
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 353
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSupportActionProvider(Landroid/support/v4/view/ActionProvider;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "actionProvider"    # Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 651
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     if-ne v0, p1, :cond_1
a=0;// 
a=0;//     .line 669
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return-object p0
a=0;// 
a=0;//     .line 655
a=0;//     :cond_1
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionView:Landroid/view/View;
a=0;// 
a=0;//     .line 656
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 657
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ActionProvider;->setVisibilityListener(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V
a=0;// 
a=0;//     .line 659
a=0;//     :cond_2
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mActionProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .line 660
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 661
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 662
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemImpl$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuItemImpl$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl$1;-><init>(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl$1;);
a=0;//     invoke-virtual {p1, v0}, Landroid/support/v4/view/ActionProvider;->setVisibilityListener(Landroid/support/v4/view/ActionProvider$VisibilityListener;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setSupportOnActionExpandListener(Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 713
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mOnActionExpandListener:Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     .line 714
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(I)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 388
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 375
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 377
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 379
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 380
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mSubMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     .line 383
a=0;//     :cond_0
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 398
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 401
a=0;//     if-nez p1, :cond_0
a=0;// 
a=0;//     .line 402
a=0;//     iget-object p1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 405
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 407
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setVisible(Z)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "shown"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 523
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setVisibleInt(Z)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemVisibleChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
a=0;// 
a=0;//     .line 525
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method setVisibleInt(Z)Z
a=0;//     .locals 4
a=0;//     .param p1, "shown"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 513
a=0;//     #v2=(Null);
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 514
a=0;//     .local v0, "oldFlags":I
a=0;//     #v0=(Integer);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/lit8 v3, v1, -0x9
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz p1, :cond_1
a=0;// 
a=0;//     move v1, v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(PosByte);
a=0;//     or-int/2addr v1, v3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     .line 515
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mFlags:I
a=0;// 
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Boolean);
a=0;//     return v2
a=0;// 
a=0;//     .line 514
a=0;//     :cond_1
a=0;//     #v2=(Null);
a=0;//     const/16 v1, 0x8
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public shouldShowIcon()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getOptionalIconsVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method shouldShowShortcut()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 336
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->isShortcutsVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getShortcut()C
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Char);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Char);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public showsTextAsAction()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 580
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mShowAsAction:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x4
a=0;// 
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne v0, v1, :cond_0
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
a=0;// .method public toString()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuItemImpl;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
