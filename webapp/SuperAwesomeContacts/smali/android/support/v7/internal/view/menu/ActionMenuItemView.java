package android.support.v7.internal.view.menu; class ActionMenuItemView { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/view/menu/ActionMenuItemView;
a=0;// .super Landroid/support/v7/internal/widget/CompatTextView;
a=0;// .source "ActionMenuItemView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/view/menu/ActionMenuView$ActionMenuChildView;
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuView$ItemView;
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// .implements Landroid/view/View$OnLongClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/view/menu/ActionMenuItemView$AllCapsTransformationMethod;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "ActionMenuItemView"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAllowTextWithIcon:Z
a=0;// 
a=0;// .field private mExpandedFormat:Z
a=0;// 
a=0;// .field private mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;// .field private mItemInvoker:Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;// .field private mMinWidth:I
a=0;// 
a=0;// .field private mSavedPaddingLeft:I
a=0;// 
a=0;// .field private mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 57
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItemView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 60
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 61
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItemView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 4
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 64
a=0;//     #v3=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/internal/widget/CompatTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItemView;);
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 66
a=0;//     .local v1, "res":Landroid/content/res/Resources;
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Landroid/support/v7/appcompat/R$bool;->abc_config_allowActionMenuItemTextWithIcon:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iput-boolean v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mAllowTextWithIcon:Z
a=0;// 
a=0;//     .line 68
a=0;//     sget-object v2, Landroid/support/v7/appcompat/R$styleable;->ActionMenuItemView:[I
a=0;// 
a=0;//     #v2=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v2, v3, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 70
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v3, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mMinWidth:I
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 74
a=0;//     invoke-virtual {p0, p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {p0, p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V
a=0;// 
a=0;//     .line 77
a=0;//     new-instance v2, Landroid/support/v7/internal/view/menu/ActionMenuItemView$AllCapsTransformationMethod;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/view/menu/ActionMenuItemView$AllCapsTransformationMethod;);
a=0;//     invoke-direct {v2, p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView$AllCapsTransformationMethod;-><init>(Landroid/support/v7/internal/view/menu/ActionMenuItemView;)V
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuItemView$AllCapsTransformationMethod;);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V
a=0;// 
a=0;//     .line 79
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     iput v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mSavedPaddingLeft:I
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private updateTextButtonVisibility()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 135
a=0;//     #v2=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     move v0, v1
a=0;// 
a=0;//     .line 136
a=0;//     .local v0, "visible":Z
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->showsTextAsAction()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mAllowTextWithIcon:Z
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mExpandedFormat:Z
a=0;// 
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);
a=0;//     move v2, v1
a=0;// 
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     and-int/2addr v0, v2
a=0;// 
a=0;//     .line 139
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 140
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "visible":Z
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(One);v2=(Null);v3=(Boolean);
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 135
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 139
a=0;//     .restart local v0    # "visible":Z
a=0;//     :cond_3
a=0;//     #v0=(Boolean);v2=(Boolean);v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getItemData()Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 89
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hasText()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public initialize(Landroid/support/v7/internal/view/menu/MenuItemImpl;I)V
a=0;//     .locals 1
a=0;//     .param p1, "itemData"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .param p2, "menuType"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 96
a=0;//     invoke-virtual {p1, p0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getTitleForItemView(Landroid/support/v7/internal/view/menu/MenuView$ItemView;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setTitle(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 97
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getItemId()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setId(I)V
a=0;// 
a=0;//     .line 99
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isVisible()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(PosByte);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setVisibility(I)V
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isEnabled()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setEnabled(Z)V
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// 
a=0;//     .line 99
a=0;//     :cond_0
a=0;//     const/16 v0, 0x8
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public needsDividerAfter()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 173
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public needsDividerBefore()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 169
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
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
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemInvoker:Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 105
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemInvoker:Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;->invokeItem(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onLongClick(Landroid/view/View;)Z
a=0;//     .locals 12
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 178
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Boolean);
a=0;//     if-eqz v10, :cond_0
a=0;// 
a=0;//     .line 204
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Boolean);v10=(PosByte);v11=(Conflicted);
a=0;//     return v8
a=0;// 
a=0;//     .line 183
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v10=(Boolean);v11=(Uninit);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     new-array v5, v10, [I
a=0;// 
a=0;//     .line 184
a=0;//     .local v5, "screenPos":[I
a=0;//     #v5=(Reference,[I);
a=0;//     new-instance v2, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     .line 185
a=0;//     .local v2, "displayFrame":Landroid/graphics/Rect;
a=0;//     #v2=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getLocationOnScreen([I)V
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
a=0;// 
a=0;//     .line 188
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 189
a=0;//     .local v1, "context":Landroid/content/Context;
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 190
a=0;//     .local v7, "width":I
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getHeight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 191
a=0;//     .local v3, "height":I
a=0;//     #v3=(Integer);
a=0;//     aget v10, v5, v9
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     div-int/lit8 v11, v3, 0x2
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int v4, v10, v11
a=0;// 
a=0;//     .line 192
a=0;//     .local v4, "midy":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v10}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     iget v6, v10, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     .line 194
a=0;//     .local v6, "screenWidth":I
a=0;//     #v6=(Integer);
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v10}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getTitle()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-static {v1, v10, v8}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 195
a=0;//     .local v0, "cheatSheet":Landroid/widget/Toast;
a=0;//     #v0=(Reference,Landroid/widget/Toast;);
a=0;//     invoke-virtual {v2}, Landroid/graphics/Rect;->height()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-ge v4, v10, :cond_1
a=0;// 
a=0;//     .line 197
a=0;//     const/16 v10, 0x35
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aget v8, v5, v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     sub-int v8, v6, v8
a=0;// 
a=0;//     div-int/lit8 v11, v7, 0x2
a=0;// 
a=0;//     sub-int/2addr v8, v11
a=0;// 
a=0;//     invoke-virtual {v0, v10, v8, v3}, Landroid/widget/Toast;->setGravity(III)V
a=0;// 
a=0;//     .line 203
a=0;//     :goto_1
a=0;//     invoke-virtual {v0}, Landroid/widget/Toast;->show()V
a=0;// 
a=0;//     move v8, v9
a=0;// 
a=0;//     .line 204
a=0;//     #v8=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 201
a=0;//     :cond_1
a=0;//     #v8=(Null);v10=(Integer);
a=0;//     const/16 v10, 0x51
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {v0, v10, v8, v3}, Landroid/widget/Toast;->setGravity(III)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 12
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v11, 0x40000000
a=0;// 
a=0;//     .line 209
a=0;//     #v11=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->hasText()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 210
a=0;//     .local v3, "textVisible":Z
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mSavedPaddingLeft:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ltz v7, :cond_0
a=0;// 
a=0;//     .line 211
a=0;//     iget v7, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mSavedPaddingLeft:I
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-super {p0, v7, v8, v9, v10}, Landroid/support/v7/internal/widget/CompatTextView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 215
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v7/internal/widget/CompatTextView;->onMeasure(II)V
a=0;// 
a=0;//     .line 217
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 218
a=0;//     .local v5, "widthMode":I
a=0;//     #v5=(Integer);
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 219
a=0;//     .local v6, "widthSize":I
a=0;//     #v6=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 220
a=0;//     .local v1, "oldMeasuredWidth":I
a=0;//     #v1=(Integer);
a=0;//     const/high16 v7, -0x80000000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v5, v7, :cond_3
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mMinWidth:I
a=0;// 
a=0;//     invoke-static {v6, v7}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 223
a=0;//     .local v2, "targetWidth":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);
a=0;//     if-eq v5, v11, :cond_1
a=0;// 
a=0;//     iget v7, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mMinWidth:I
a=0;// 
a=0;//     if-lez v7, :cond_1
a=0;// 
a=0;//     if-ge v1, v2, :cond_1
a=0;// 
a=0;//     .line 225
a=0;//     invoke-static {v2, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     invoke-super {p0, v7, p2}, Landroid/support/v7/internal/widget/CompatTextView;->onMeasure(II)V
a=0;// 
a=0;//     .line 229
a=0;//     :cond_1
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v7, :cond_2
a=0;// 
a=0;//     .line 232
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 233
a=0;//     .local v4, "w":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     invoke-virtual {v7}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 234
a=0;//     .local v0, "dw":I
a=0;//     #v0=(Integer);
a=0;//     sub-int v7, v4, v0
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     div-int/lit8 v7, v7, 0x2
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-super {p0, v7, v8, v9, v10}, Landroid/support/v7/internal/widget/CompatTextView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 236
a=0;//     .end local v0    # "dw":I
a=0;//     .end local v4    # "w":I
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v4=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 220
a=0;//     .end local v2    # "targetWidth":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v2=(Uninit);v4=(Uninit);v7=(Integer);
a=0;//     iget v2, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mMinWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public prefersCondensedTitle()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 114
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public setCheckable(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "checkable"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setChecked(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "checked"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 123
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setExpandedFormat(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "expandedFormat"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 126
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mExpandedFormat:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq v0, p1, :cond_0
a=0;// 
a=0;//     .line 127
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mExpandedFormat:Z
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemData:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->actionFormatChanged()V
a=0;// 
a=0;//     .line 132
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setIcon(Landroid/graphics/drawable/Drawable;)V
a=0;//     .locals 1
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     #v0=(Null);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 144
a=0;//     invoke-virtual {p0, p1, v0, v0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setCompoundDrawablesWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 146
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->updateTextButtonVisibility()V
a=0;// 
a=0;//     .line 147
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setItemInvoker(Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;)V
a=0;//     .locals 0
a=0;//     .param p1, "invoker"    # Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;//     .prologue
a=0;//     .line 110
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mItemInvoker:Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;
a=0;// 
a=0;//     .line 111
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPadding(IIII)V
a=0;//     .locals 0
a=0;//     .param p1, "l"    # I
a=0;//     .param p2, "t"    # I
a=0;//     .param p3, "r"    # I
a=0;//     .param p4, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     iput p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mSavedPaddingLeft:I
a=0;// 
a=0;//     .line 85
a=0;//     invoke-super {p0, p1, p2, p3, p4}, Landroid/support/v7/internal/widget/CompatTextView;->setPadding(IIII)V
a=0;// 
a=0;//     .line 86
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShortcut(ZC)V
a=0;//     .locals 0
a=0;//     .param p1, "showShortcut"    # Z
a=0;//     .param p2, "shortcutKey"    # C
a=0;// 
a=0;//     .prologue
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 160
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->setContentDescription(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 161
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/view/menu/ActionMenuItemView;->updateTextButtonVisibility()V
a=0;// 
a=0;//     .line 162
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showsIcon()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
}}
