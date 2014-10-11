package android.support.v7.internal.view.menu; class ActionMenuItem { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/view/menu/ActionMenuItem;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActionMenuItem.java"
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
a=0;// .field private static final NO_ICON:I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mCategoryOrder:I
a=0;// 
a=0;// .field private mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
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
a=0;// .field private final mOrdering:I
a=0;// 
a=0;// .field private mShortcutAlphabeticChar:C
a=0;// 
a=0;// .field private mShortcutNumericChar:C
a=0;// 
a=0;// .field private mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;IIIILjava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "group"    # I
a=0;//     .param p3, "id"    # I
a=0;//     .param p4, "categoryOrder"    # I
a=0;//     .param p5, "ordering"    # I
a=0;//     .param p6, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 47
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItem;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconResId:I
a=0;// 
a=0;//     .line 55
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 64
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 65
a=0;//     iput p3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mId:I
a=0;// 
a=0;//     .line 66
a=0;//     iput p2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mGroup:I
a=0;// 
a=0;//     .line 67
a=0;//     iput p4, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mCategoryOrder:I
a=0;// 
a=0;//     .line 68
a=0;//     iput p5, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mOrdering:I
a=0;// 
a=0;//     .line 69
a=0;//     iput-object p6, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 70
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public collapseActionView()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 277
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public expandActionView()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 272
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionProvider()Landroid/view/ActionProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 246
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public getActionView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 236
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getAlphabeticShortcut()C
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     iget-char v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getGroupId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 77
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mGroup:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 81
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getIntent()Landroid/content/Intent;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 85
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Intent;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mId:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuInfo()Landroid/view/ContextMenu$ContextMenuInfo;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getNumericShortcut()C
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 97
a=0;//     iget-char v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutNumericChar:C
a=0;// 
a=0;//     #v0=(Char);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getOrder()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mOrdering:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubMenu()Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getSupportActionProvider()Landroid/support/v4/view/ActionProvider;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 256
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 109
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitleCondensed()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 113
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasSubMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 117
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public invoke()Z
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 215
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem$OnMenuItemClickListener;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     invoke-interface {v1, p0}, Landroid/view/MenuItem$OnMenuItemClickListener;->onMenuItemClick(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 224
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 219
a=0;//     :cond_0
a=0;//     #v0=(One);v2=(Uninit);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 224
a=0;//     :cond_1
a=0;//     #v2=(Uninit);
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
a=0;//     .line 282
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isCheckable()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x1
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
a=0;// .method public isChecked()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 125
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x2
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
a=0;// .method public isEnabled()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 129
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
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
a=0;// .method public isVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 133
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v0, v0, 0x8
a=0;// 
a=0;//     if-nez v0, :cond_0
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
a=0;//     .locals 1
a=0;//     .param p1, "actionProvider"    # Landroid/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setActionView(I)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "resId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 251
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "actionView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setActionView(I)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setActionView(I)Landroid/support/v4/internal/view/SupportMenuItem;
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
a=0;//     .line 33
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setActionView(Landroid/view/View;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/internal/view/SupportMenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setAlphabeticShortcut(C)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "alphaChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     iput-char p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     .line 138
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setCheckable(Z)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "checkable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 142
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, -0x2
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 143
a=0;//     return-object p0
a=0;// 
a=0;//     .line 142
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setChecked(Z)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "checked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 152
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, -0x3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 153
a=0;//     return-object p0
a=0;// 
a=0;//     .line 152
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setEnabled(Z)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 157
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, -0x11
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/16 v0, 0x10
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 158
a=0;//     return-object p0
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setExclusiveCheckable(Z)Landroid/support/v7/internal/view/menu/ActionMenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "exclusive"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 147
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
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
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 148
a=0;//     return-object p0
a=0;// 
a=0;//     .line 147
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(I)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "iconRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 168
a=0;//     iput p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconResId:I
a=0;// 
a=0;//     .line 169
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 170
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 162
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconDrawable:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 163
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIconResId:I
a=0;// 
a=0;//     .line 164
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "intent"    # Landroid/content/Intent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 174
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mIntent:Landroid/content/Intent;
a=0;// 
a=0;//     .line 175
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setNumericShortcut(C)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "numericChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 179
a=0;//     iput-char p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutNumericChar:C
a=0;// 
a=0;//     .line 180
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setOnActionExpandListener(Landroid/view/MenuItem$OnActionExpandListener;)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "listener"    # Landroid/view/MenuItem$OnActionExpandListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setOnMenuItemClickListener(Landroid/view/MenuItem$OnMenuItemClickListener;)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "menuItemClickListener"    # Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 184
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mClickListener:Landroid/view/MenuItem$OnMenuItemClickListener;
a=0;// 
a=0;//     .line 185
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setShortcut(CC)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "numericChar"    # C
a=0;//     .param p2, "alphaChar"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 189
a=0;//     iput-char p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutNumericChar:C
a=0;// 
a=0;//     .line 190
a=0;//     iput-char p2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mShortcutAlphabeticChar:C
a=0;// 
a=0;//     .line 191
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setShowAsAction(I)V
a=0;//     .locals 0
a=0;//     .param p1, "show"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShowAsActionFlags(I)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "actionEnum"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setShowAsAction(I)V
a=0;// 
a=0;//     .line 267
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setShowAsActionFlags(I)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 33
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ActionMenuItem;->setShowAsActionFlags(I)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/internal/view/SupportMenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setSupportActionProvider(Landroid/support/v4/view/ActionProvider;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "actionProvider"    # Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     .prologue
a=0;//     .line 261
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public setSupportOnActionExpandListener(Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;)Landroid/support/v4/internal/view/SupportMenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "listener"    # Landroid/support/v4/view/MenuItemCompat$OnActionExpandListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 293
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(I)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 200
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 201
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 195
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 196
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setTitleCondensed(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 205
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mTitleCondensed:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 206
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method public setVisible(Z)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 210
a=0;//     iget v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     and-int/lit8 v1, v0, 0x8
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     or-int/2addr v0, v1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItem;->mFlags:I
a=0;// 
a=0;//     .line 211
a=0;//     return-object p0
a=0;// 
a=0;//     .line 210
a=0;//     :cond_0
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
}}
