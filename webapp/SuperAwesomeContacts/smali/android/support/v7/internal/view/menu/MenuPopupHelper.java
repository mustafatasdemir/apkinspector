package android.support.v7.internal.view.menu; class MenuPopupHelper { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuPopupHelper.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// .implements Landroid/view/View$OnKeyListener;
a=0;// .implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// .implements Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final ITEM_LAYOUT:I
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "MenuPopupHelper"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;// .field private mAnchorView:Landroid/view/View;
a=0;// 
a=0;// .field private mContext:Landroid/content/Context;
a=0;// 
a=0;// .field mForceShowIcon:Z
a=0;// 
a=0;// .field private mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;// .field private mMeasureParent:Landroid/view/ViewGroup;
a=0;// 
a=0;// .field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mOverflowOnly:Z
a=0;// 
a=0;// .field private mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;// .field private mPopupMaxWidth:I
a=0;// 
a=0;// .field private mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;// .field private mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 50
a=0;//     sget v0, Landroid/support/v7/appcompat/R$layout;->abc_popup_menu_item_layout:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     sput v0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->ITEM_LAYOUT:I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 70
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1, p2, v0, v1}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 71
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p3, "anchorView"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 74
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p3, "anchorView"    # Landroid/view/View;
a=0;//     .param p4, "overflowOnly"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 79
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 80
a=0;//     invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     .line 81
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 82
a=0;//     iput-boolean p4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mOverflowOnly:Z
a=0;// 
a=0;//     .line 84
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 85
a=0;//     .local v0, "res":Landroid/content/res/Resources;
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     div-int/lit8 v1, v1, 0x2
a=0;// 
a=0;//     sget v2, Landroid/support/v7/appcompat/R$dimen;->abc_config_prefDialogWidth:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopupMaxWidth:I
a=0;// 
a=0;//     .line 88
a=0;//     iput-object p3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 90
a=0;//     invoke-virtual {p2, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 91
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Z
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mOverflowOnly:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Landroid/view/LayoutInflater;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/LayoutInflater;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$300(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 44
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private measureContentWidth(Landroid/widget/ListAdapter;)I
a=0;//     .locals 10
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 173
a=0;//     #v8=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 174
a=0;//     .local v6, "width":I
a=0;//     #v6=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 175
a=0;//     .local v4, "itemView":Landroid/view/View;
a=0;//     #v4=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 176
a=0;//     .local v3, "itemType":I
a=0;//     #v3=(Null);
a=0;//     invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 178
a=0;//     .local v7, "widthMeasureSpec":I
a=0;//     #v7=(Integer);
a=0;//     invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 180
a=0;//     .local v1, "heightMeasureSpec":I
a=0;//     #v1=(Integer);
a=0;//     invoke-interface {p1}, Landroid/widget/ListAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 181
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Integer);v4=(Reference,Landroid/view/View;);v5=(Conflicted);v6=(Integer);v8=(Integer);v9=(Conflicted);
a=0;//     if-ge v2, v0, :cond_2
a=0;// 
a=0;//     .line 182
a=0;//     invoke-interface {p1, v2}, Landroid/widget/ListAdapter;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 183
a=0;//     .local v5, "positionType":I
a=0;//     #v5=(Integer);
a=0;//     if-eq v5, v3, :cond_0
a=0;// 
a=0;//     .line 184
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 185
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 187
a=0;//     :cond_0
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMeasureParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/ViewGroup;);
a=0;//     if-nez v8, :cond_1
a=0;// 
a=0;//     .line 188
a=0;//     new-instance v8, Landroid/widget/FrameLayout;
a=0;// 
a=0;//     #v8=(UninitRef,Landroid/widget/FrameLayout;);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v9=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v8, v9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v8=(Reference,Landroid/widget/FrameLayout;);
a=0;//     iput-object v8, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMeasureParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 190
a=0;//     :cond_1
a=0;//     #v9=(Conflicted);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMeasureParent:Landroid/view/ViewGroup;
a=0;// 
a=0;//     invoke-interface {p1, v2, v4, v8}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 191
a=0;//     invoke-virtual {v4, v7, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 192
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 181
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 194
a=0;//     .end local v5    # "positionType":I
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);
a=0;//     return v6
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "item"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 282
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public dismiss()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 136
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 137
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->dismiss()V
a=0;// 
a=0;//     .line 139
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public expandItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "item"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public flagActionItems()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getId()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;//     .locals 2
a=0;//     .param p1, "root"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 217
a=0;//     new-instance v0, Ljava/lang/UnsupportedOperationException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/UnsupportedOperationException;);
a=0;//     const-string v1, "MenuPopupHelpers manage their own views"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/UnsupportedOperationException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 213
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public isShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
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
a=0;// .method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 262
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     if-eq p1, v0, :cond_1
a=0;// 
a=0;//     .line 270
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 266
a=0;//     :cond_1
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->dismiss()V
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 268
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;->onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onDismiss()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 142
a=0;//     #v1=(Null);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     .line 143
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close()V
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 145
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 146
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     .line 148
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewTreeObserver;);
a=0;//     invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 149
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     .line 151
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onGlobalLayout()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 199
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 200
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 201
a=0;//     .local v0, "anchor":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->isShown()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     .line 202
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->dismiss()V
a=0;// 
a=0;//     .line 208
a=0;//     .end local v0    # "anchor":Landroid/view/View;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 203
a=0;//     .restart local v0    # "anchor":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Boolean);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 205
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 4
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     .line 160
a=0;//     .local v0, "adapter":Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->access$000(Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v0, p3}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z
a=0;// 
a=0;//     .line 161
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;//     .param p2, "keyCode"    # I
a=0;//     .param p3, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 164
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ne v1, v0, :cond_0
a=0;// 
a=0;//     const/16 v1, 0x52
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     if-ne p2, v1, :cond_0
a=0;// 
a=0;//     .line 165
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->dismiss()V
a=0;// 
a=0;//     .line 168
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Integer);
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
a=0;// .method public onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;//     .locals 0
a=0;//     .param p1, "state"    # Landroid/os/Parcelable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 297
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onSaveInstanceState()Landroid/os/Parcelable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 292
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z
a=0;//     .locals 8
a=0;//     .param p1, "subMenu"    # Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 234
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->hasVisibleItems()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 235
a=0;//     new-instance v4, Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v6=(Reference,Landroid/content/Context;);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     #v7=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {v4, v6, p1, v7, v5}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
a=0;// 
a=0;//     .line 236
a=0;//     .local v4, "subPopup":Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     invoke-virtual {v4, v6}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;// 
a=0;//     .line 238
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 239
a=0;//     .local v3, "preserveIconSpacing":Z
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 240
a=0;//     .local v1, "count":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Integer);v6=(Conflicted);
a=0;//     if-ge v2, v1, :cond_0
a=0;// 
a=0;//     .line 241
a=0;//     invoke-virtual {p1, v2}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 242
a=0;//     .local v0, "childItem":Landroid/view/MenuItem;
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     .line 243
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 247
a=0;//     .end local v0    # "childItem":Landroid/view/MenuItem;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v3=(Boolean);v6=(Conflicted);
a=0;//     invoke-virtual {v4, v3}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->setForceShowIcon(Z)V
a=0;// 
a=0;//     .line 249
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->tryShow()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 251
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     invoke-interface {v5, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;->onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z
a=0;// 
a=0;//     .line 253
a=0;//     :cond_1
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 256
a=0;//     .end local v1    # "count":I
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "preserveIconSpacing":Z
a=0;//     .end local v4    # "subPopup":Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v7=(Conflicted);
a=0;//     return v5
a=0;// 
a=0;//     .line 240
a=0;//     .restart local v0    # "childItem":Landroid/view/MenuItem;
a=0;//     .restart local v1    # "count":I
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v3    # "preserveIconSpacing":Z
a=0;//     .restart local v4    # "subPopup":Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);v1=(Integer);v2=(Integer);v3=(Null);v4=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);v5=(Null);v6=(Conflicted);v7=(Reference,Landroid/view/View;);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setAnchorView(Landroid/view/View;)V
a=0;//     .locals 0
a=0;//     .param p1, "anchor"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 94
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 95
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
a=0;//     .locals 0
a=0;//     .param p1, "cb"    # Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 229
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;
a=0;// 
a=0;//     .line 230
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setForceShowIcon(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "forceShow"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 98
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mForceShowIcon:Z
a=0;// 
a=0;//     .line 99
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 102
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->tryShow()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 103
a=0;//     new-instance v0, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v1, "MenuPopupHelper cannot be used without an anchor"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 105
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Uninit);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public tryShow()Z
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 108
a=0;//     #v2=(One);
a=0;//     new-instance v3, Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v4=(Reference,Landroid/content/Context;);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     sget v6, Landroid/support/v7/appcompat/R$attr;->popupMenuStyle:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     invoke-direct {v3, v4, v5, v6}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     .line 109
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V
a=0;// 
a=0;//     .line 110
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 112
a=0;//     new-instance v3, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-direct {v3, p0, v4}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;-><init>(Landroid/support/v7/internal/view/menu/MenuPopupHelper;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     .line 113
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 114
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/support/v7/internal/widget/ListPopupWindow;->setModal(Z)V
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;
a=0;// 
a=0;//     .line 117
a=0;//     .local v1, "anchor":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     move v0, v2
a=0;// 
a=0;//     .line 119
a=0;//     .local v0, "addGlobalListener":Z
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     .line 120
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 121
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V
a=0;// 
a=0;//     .line 123
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     invoke-direct {p0, v4}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->measureContentWidth(Landroid/widget/ListAdapter;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopupMaxWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->setContentWidth(I)V
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V
a=0;// 
a=0;//     .line 131
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ListPopupWindow;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V
a=0;// 
a=0;//     .line 132
a=0;//     .end local v0    # "addGlobalListener":Z
a=0;//     :goto_0
a=0;//     #v2=(Boolean);v4=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     :cond_2
a=0;//     #v0=(Null);v2=(One);v4=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;);v5=(Null);
a=0;//     move v2, v0
a=0;// 
a=0;//     .line 125
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public updateMenuView(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "cleared"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 222
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 225
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
