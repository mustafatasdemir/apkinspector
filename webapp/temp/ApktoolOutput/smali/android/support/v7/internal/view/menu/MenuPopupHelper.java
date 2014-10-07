package android.support.v7.internal.view.menu; class MenuPopupHelper {/*

.class public Landroid/support/v7/internal/view/menu/MenuPopupHelper;
.super Ljava/lang/Object;
.source "MenuPopupHelper.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/view/View$OnKeyListener;
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;
.implements Landroid/support/v7/internal/view/menu/MenuPresenter;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
    }
.end annotation


# static fields
#the value of this static final field might be set in the static constructor
.field static final ITEM_LAYOUT:I = 0x0

.field private static final TAG:Ljava/lang/String; = "MenuPopupHelper"


# instance fields
.field private mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;

.field private mAnchorView:Landroid/view/View;

.field private mContext:Landroid/content/Context;

.field mForceShowIcon:Z

.field private mInflater:Landroid/view/LayoutInflater;

.field private mMeasureParent:Landroid/view/ViewGroup;

.field private mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

.field private mOverflowOnly:Z

.field private mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

.field private mPopupMaxWidth:I

.field private mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

.field private mTreeObserver:Landroid/view/ViewTreeObserver;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 50
    sget v0, Landroid/support/v7/appcompat/R$layout;->abc_popup_menu_item_layout:I

    #v0=(Integer);
    sput v0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->ITEM_LAYOUT:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 2
    .parameter "context"
    .parameter "menu"

    .prologue
    .line 70
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-direct {p0, p1, p2, v0, v1}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V

    .line 71
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;)V
    .locals 1
    .parameter "context"
    .parameter "menu"
    .parameter "anchorView"

    .prologue
    .line 74
    const/4 v0, 0x0

    #v0=(Null);
    invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V

    .line 75
    #p0=(Reference);
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V
    .locals 3
    .parameter "context"
    .parameter "menu"
    .parameter "anchorView"
    .parameter "overflowOnly"

    .prologue
    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    #p0=(Reference);
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;

    .line 80
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mInflater:Landroid/view/LayoutInflater;

    .line 81
    iput-object p2, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    .line 82
    iput-boolean p4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mOverflowOnly:Z

    .line 84
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 85
    .local v0, res:Landroid/content/res/Resources;
    #v0=(Reference);
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->widthPixels:I

    #v1=(Integer);
    div-int/lit8 v1, v1, 0x2

    sget v2, Landroid/support/v7/appcompat/R$dimen;->abc_config_prefDialogWidth:I

    #v2=(Integer);
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iput v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopupMaxWidth:I

    .line 88
    iput-object p3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;

    .line 90
    invoke-virtual {p2, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V

    .line 91
    return-void
.end method

.method static synthetic access$100(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Z
    .locals 1
    .parameter "x0"

    .prologue
    .line 44
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mOverflowOnly:Z

    #v0=(Boolean);
    return v0
.end method

.method static synthetic access$200(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Landroid/view/LayoutInflater;
    .locals 1
    .parameter "x0"

    .prologue
    .line 44
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mInflater:Landroid/view/LayoutInflater;

    #v0=(Reference);
    return-object v0
.end method

.method static synthetic access$300(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Landroid/support/v7/internal/view/menu/MenuBuilder;
    .locals 1
    .parameter "x0"

    .prologue
    .line 44
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    return-object v0
.end method

.method private measureContentWidth(Landroid/widget/ListAdapter;)I
    .locals 10
    .parameter "adapter"

    .prologue
    const/4 v8, 0x0

    .line 173
    #v8=(Null);
    const/4 v6, 0x0

    .line 174
    .local v6, width:I
    #v6=(Null);
    const/4 v4, 0x0

    .line 175
    .local v4, itemView:Landroid/view/View;
    #v4=(Null);
    const/4 v3, 0x0

    .line 176
    .local v3, itemType:I
    #v3=(Null);
    invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v7

    .line 178
    .local v7, widthMeasureSpec:I
    #v7=(Integer);
    invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 180
    .local v1, heightMeasureSpec:I
    #v1=(Integer);
    invoke-interface {p1}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    .line 181
    .local v0, count:I
    #v0=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v2=(Integer);v3=(Integer);v4=(Reference);v5=(Conflicted);v6=(Integer);v8=(Integer);v9=(Conflicted);
    if-ge v2, v0, :cond_2

    .line 182
    invoke-interface {p1, v2}, Landroid/widget/ListAdapter;->getItemViewType(I)I

    move-result v5

    .line 183
    .local v5, positionType:I
    #v5=(Integer);
    if-eq v5, v3, :cond_0

    .line 184
    move v3, v5

    .line 185
    const/4 v4, 0x0

    .line 187
    :cond_0
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMeasureParent:Landroid/view/ViewGroup;

    #v8=(Reference);
    if-nez v8, :cond_1

    .line 188
    new-instance v8, Landroid/widget/FrameLayout;

    #v8=(UninitRef);
    iget-object v9, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;

    #v9=(Reference);
    invoke-direct {v8, v9}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    #v8=(Reference);
    iput-object v8, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMeasureParent:Landroid/view/ViewGroup;

    .line 190
    :cond_1
    #v9=(Conflicted);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMeasureParent:Landroid/view/ViewGroup;

    invoke-interface {p1, v2, v4, v8}, Landroid/widget/ListAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 191
    invoke-virtual {v4, v7, v1}, Landroid/view/View;->measure(II)V

    .line 192
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v8

    #v8=(Integer);
    invoke-static {v6, v8}, Ljava/lang/Math;->max(II)I

    move-result v6

    .line 181
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 194
    .end local v5           #positionType:I
    :cond_2
    #v5=(Conflicted);
    return v6
.end method


# virtual methods
.method public collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 1
    .parameter "menu"
    .parameter "item"

    .prologue
    .line 282
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public dismiss()V
    .locals 1

    .prologue
    .line 136
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->dismiss()V

    .line 139
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public expandItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 1
    .parameter "menu"
    .parameter "item"

    .prologue
    .line 278
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public flagActionItems()Z
    .locals 1

    .prologue
    .line 274
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getId()I
    .locals 1

    .prologue
    .line 287
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
    .locals 2
    .parameter "root"

    .prologue
    .line 217
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    #v0=(UninitRef);
    const-string v1, "MenuPopupHelpers manage their own views"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0
.end method

.method public initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
    .locals 0
    .parameter "context"
    .parameter "menu"

    .prologue
    .line 213
    return-void
.end method

.method public isShowing()Z
    .locals 1

    .prologue
    .line 154
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
    .locals 1
    .parameter "menu"
    .parameter "allMenusAreClosing"

    .prologue
    .line 262
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    if-eq p1, v0, :cond_1

    .line 270
    :cond_0
    :goto_0
    return-void

    .line 266
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->dismiss()V

    .line 267
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    if-eqz v0, :cond_0

    .line 268
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;->onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V

    goto :goto_0
.end method

.method public onDismiss()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 142
    #v1=(Null);
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    .line 143
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close()V

    .line 144
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;

    if-eqz v0, :cond_1

    .line 145
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;

    invoke-virtual {v0}, Landroid/view/ViewTreeObserver;->isAlive()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 146
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;

    .line 148
    :cond_0
    #v0=(Conflicted);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;

    #v0=(Reference);
    invoke-virtual {v0, p0}, Landroid/view/ViewTreeObserver;->removeGlobalOnLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 149
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;

    .line 151
    :cond_1
    return-void
.end method

.method public onGlobalLayout()V
    .locals 2

    .prologue
    .line 199
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->isShowing()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 200
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;

    .line 201
    .local v0, anchor:Landroid/view/View;
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->isShown()Z

    move-result v1

    if-nez v1, :cond_2

    .line 202
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->dismiss()V

    .line 208
    .end local v0           #anchor:Landroid/view/View;
    :cond_1
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 203
    .restart local v0       #anchor:Landroid/view/View;
    :cond_2
    #v0=(Reference);v1=(Boolean);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 205
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    goto :goto_0
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 4
    .parameter
    .parameter "view"
    .parameter "position"
    .parameter "id"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 159
    .local p1, parent:Landroid/widget/AdapterView;,"Landroid/widget/AdapterView<*>;"
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;

    .line 160
    .local v0, adapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->access$000(Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;)Landroid/support/v7/internal/view/menu/MenuBuilder;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v0, p3}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;

    move-result-object v2

    #v2=(Reference);
    const/4 v3, 0x0

    #v3=(Null);
    invoke-virtual {v1, v2, v3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z

    .line 161
    return-void
.end method

.method public onKey(Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 2
    .parameter "v"
    .parameter "keyCode"
    .parameter "event"

    .prologue
    const/4 v0, 0x1

    .line 164
    #v0=(One);
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v1

    #v1=(Integer);
    if-ne v1, v0, :cond_0

    const/16 v1, 0x52

    #v1=(PosByte);
    if-ne p2, v1, :cond_0

    .line 165
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->dismiss()V

    .line 168
    :goto_0
    #v0=(Boolean);v1=(Integer);
    return v0

    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 0
    .parameter "state"

    .prologue
    .line 297
    return-void
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 292
    const/4 v0, 0x0

    #v0=(Null);
    return-object v0
.end method

.method public onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z
    .locals 8
    .parameter "subMenu"

    .prologue
    const/4 v5, 0x0

    .line 234
    #v5=(Null);
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->hasVisibleItems()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    .line 235
    new-instance v4, Landroid/support/v7/internal/view/menu/MenuPopupHelper;

    #v4=(UninitRef);
    iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;

    #v6=(Reference);
    iget-object v7, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;

    #v7=(Reference);
    invoke-direct {v4, v6, p1, v7, v5}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/View;Z)V

    .line 236
    .local v4, subPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
    #v4=(Reference);
    iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    invoke-virtual {v4, v6}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V

    .line 238
    const/4 v3, 0x0

    .line 239
    .local v3, preserveIconSpacing:Z
    #v3=(Null);
    invoke-virtual {p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->size()I

    move-result v1

    .line 240
    .local v1, count:I
    #v1=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v0=(Conflicted);v2=(Integer);v6=(Conflicted);
    if-ge v2, v1, :cond_0

    .line 241
    invoke-virtual {p1, v2}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->getItem(I)Landroid/view/MenuItem;

    move-result-object v0

    .line 242
    .local v0, childItem:Landroid/view/MenuItem;
    #v0=(Reference);
    invoke-interface {v0}, Landroid/view/MenuItem;->isVisible()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_3

    invoke-interface {v0}, Landroid/view/MenuItem;->getIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    #v6=(Reference);
    if-eqz v6, :cond_3

    .line 243
    const/4 v3, 0x1

    .line 247
    .end local v0           #childItem:Landroid/view/MenuItem;
    :cond_0
    #v0=(Conflicted);v3=(Boolean);v6=(Conflicted);
    invoke-virtual {v4, v3}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->setForceShowIcon(Z)V

    .line 249
    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->tryShow()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    .line 250
    iget-object v5, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    #v5=(Reference);
    if-eqz v5, :cond_1

    .line 251
    iget-object v5, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    invoke-interface {v5, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;->onOpenSubMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;)Z

    .line 253
    :cond_1
    const/4 v5, 0x1

    .line 256
    .end local v1           #count:I
    .end local v2           #i:I
    .end local v3           #preserveIconSpacing:Z
    .end local v4           #subPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
    :cond_2
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Boolean);v7=(Conflicted);
    return v5

    .line 240
    .restart local v0       #childItem:Landroid/view/MenuItem;
    .restart local v1       #count:I
    .restart local v2       #i:I
    .restart local v3       #preserveIconSpacing:Z
    .restart local v4       #subPopup:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
    :cond_3
    #v0=(Reference);v1=(Integer);v2=(Integer);v3=(Null);v4=(Reference);v5=(Null);v6=(Conflicted);v7=(Reference);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0
.end method

.method public setAnchorView(Landroid/view/View;)V
    .locals 0
    .parameter "anchor"

    .prologue
    .line 94
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;

    .line 95
    return-void
.end method

.method public setCallback(Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;)V
    .locals 0
    .parameter "cb"

    .prologue
    .line 229
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPresenterCallback:Landroid/support/v7/internal/view/menu/MenuPresenter$Callback;

    .line 230
    return-void
.end method

.method public setForceShowIcon(Z)V
    .locals 0
    .parameter "forceShow"

    .prologue
    .line 98
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mForceShowIcon:Z

    .line 99
    return-void
.end method

.method public show()V
    .locals 2

    .prologue
    .line 102
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->tryShow()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 103
    new-instance v0, Ljava/lang/IllegalStateException;

    #v0=(UninitRef);
    const-string v1, "MenuPopupHelper cannot be used without an anchor"

    #v1=(Reference);
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    #v0=(Reference);
    throw v0

    .line 105
    :cond_0
    #v0=(Boolean);v1=(Uninit);
    return-void
.end method

.method public tryShow()Z
    .locals 7

    .prologue
    const/4 v0, 0x0

    #v0=(Null);
    const/4 v2, 0x1

    .line 108
    #v2=(One);
    new-instance v3, Landroid/support/v7/internal/widget/ListPopupWindow;

    #v3=(UninitRef);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mContext:Landroid/content/Context;

    #v4=(Reference);
    const/4 v5, 0x0

    #v5=(Null);
    sget v6, Landroid/support/v7/appcompat/R$attr;->popupMenuStyle:I

    #v6=(Integer);
    invoke-direct {v3, v4, v5, v6}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    .line 109
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v3, p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 110
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v3, p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 112
    new-instance v3, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;

    #v3=(UninitRef);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-direct {v3, p0, v4}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;-><init>(Landroid/support/v7/internal/view/menu/MenuPopupHelper;Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    #v3=(Reference);
    iput-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;

    .line 113
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 114
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v3, v2}, Landroid/support/v7/internal/widget/ListPopupWindow;->setModal(Z)V

    .line 116
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAnchorView:Landroid/view/View;

    .line 117
    .local v1, anchor:Landroid/view/View;
    #v1=(Reference);
    if-eqz v1, :cond_2

    .line 118
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;

    if-nez v3, :cond_0

    move v0, v2

    .line 119
    .local v0, addGlobalListener:Z
    :cond_0
    #v0=(Boolean);
    invoke-virtual {v1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v3

    iput-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;

    .line 120
    if-eqz v0, :cond_1

    .line 121
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mTreeObserver:Landroid/view/ViewTreeObserver;

    invoke-virtual {v3, p0}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 123
    :cond_1
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V

    .line 128
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;

    invoke-direct {p0, v4}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->measureContentWidth(Landroid/widget/ListAdapter;)I

    move-result v4

    #v4=(Integer);
    iget v5, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopupMaxWidth:I

    #v5=(Integer);
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->setContentWidth(I)V

    .line 129
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    const/4 v4, 0x2

    #v4=(PosByte);
    invoke-virtual {v3, v4}, Landroid/support/v7/internal/widget/ListPopupWindow;->setInputMethodMode(I)V

    .line 130
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 131
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mPopup:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ListPopupWindow;->getListView()Landroid/widget/ListView;

    move-result-object v3

    invoke-virtual {v3, p0}, Landroid/widget/ListView;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 132
    .end local v0           #addGlobalListener:Z
    :goto_0
    #v2=(Boolean);v4=(Conflicted);
    return v2

    :cond_2
    #v0=(Null);v2=(One);v4=(Reference);v5=(Null);
    move v2, v0

    .line 125
    #v2=(Null);
    goto :goto_0
.end method

.method public updateMenuView(Z)V
    .locals 1
    .parameter "cleared"

    .prologue
    .line 222
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 223
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mAdapter:Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->notifyDataSetChanged()V

    .line 225
    :cond_0
    return-void
.end method

*/}
