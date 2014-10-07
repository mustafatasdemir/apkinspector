package android.support.v7.internal.view.menu; class MenuBuilder {/*

.class public Landroid/support/v7/internal/view/menu/MenuBuilder;
.super Ljava/lang/Object;
.source "MenuBuilder.java"

# interfaces
.implements Landroid/support/v4/internal/view/SupportMenu;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;,
        Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
    }
.end annotation


# static fields
.field private static final ACTION_VIEW_STATES_KEY:Ljava/lang/String; = "android:menu:actionviewstates"

.field private static final EXPANDED_ACTION_VIEW_ID:Ljava/lang/String; = "android:menu:expandedactionview"

.field private static final PRESENTER_KEY:Ljava/lang/String; = "android:menu:presenters"

.field private static final TAG:Ljava/lang/String; = "MenuBuilder"

.field private static final sCategoryToOrder:[I


# instance fields
.field private mActionItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;"
        }
    .end annotation
.end field

.field private mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;

.field private final mContext:Landroid/content/Context;

.field private mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

.field private mDefaultShowAsAction:I

.field private mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

.field mHeaderIcon:Landroid/graphics/drawable/Drawable;

.field mHeaderTitle:Ljava/lang/CharSequence;

.field mHeaderView:Landroid/view/View;

.field private mIsActionItemsStale:Z

.field private mIsClosing:Z

.field private mIsVisibleItemsStale:Z

.field private mItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;"
        }
    .end annotation
.end field

.field private mItemsChangedWhileDispatchPrevented:Z

.field private mNonActionItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;"
        }
    .end annotation
.end field

.field private mOptionalIconsVisible:Z

.field private mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList",
            "<",
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuPresenter;",
            ">;>;"
        }
    .end annotation
.end field

.field private mPreventDispatchingItemsChanged:Z

.field private mQwertyMode:Z

.field private final mResources:Landroid/content/res/Resources;

.field private mShortcutsVisible:Z

.field private mTempShortcutItemList:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;"
        }
    .end annotation
.end field

.field private mVisibleItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 47
    const/4 v0, 0x6

    #v0=(PosByte);
    new-array v0, v0, [I

    #v0=(Reference);
    fill-array-data v0, :array_0

    sput-object v0, Landroid/support/v7/internal/view/menu/MenuBuilder;->sCategoryToOrder:[I

    return-void

    #v0=(Unknown);
    nop

    :array_0
    .array-data 0x4
        0x1t 0x0t 0x0t 0x0t
        0x4t 0x0t 0x0t 0x0t
        0x5t 0x0t 0x0t 0x0t
        0x3t 0x0t 0x0t 0x0t
        0x2t 0x0t 0x0t 0x0t
        0x0t 0x0t 0x0t 0x0t
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .parameter "context"

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    .line 192
    #v0=(Null);
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 114
    #p0=(Reference);
    iput v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mDefaultShowAsAction:I

    .line 142
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z

    .line 144
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z

    .line 146
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mOptionalIconsVisible:Z

    .line 148
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsClosing:Z

    .line 150
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mTempShortcutItemList:Ljava/util/ArrayList;

    .line 152
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 193
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;

    .line 194
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;

    .line 196
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    .line 198
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;

    .line 199
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z

    .line 201
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;

    .line 202
    new-instance v0, Ljava/util/ArrayList;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;

    .line 203
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z

    .line 205
    invoke-direct {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setShortcutsVisibleInner(Z)V

    .line 206
    return-void
.end method

.method private addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 8
    .parameter "group"
    .parameter "id"
    .parameter "categoryOrder"
    .parameter "title"

    .prologue
    .line 400
    invoke-static {p3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getOrdering(I)I

    move-result v5

    .line 402
    .local v5, ordering:I
    #v5=(Integer);
    new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v0=(UninitRef);
    iget v7, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mDefaultShowAsAction:I

    #v7=(Integer);
    move-object v1, p0

    #v1=(Reference);
    move v2, p1

    #v2=(Integer);
    move v3, p2

    #v3=(Integer);
    move v4, p3

    #v4=(Integer);
    move-object v6, p4

    #v6=(Reference);
    invoke-direct/range {v0 .. v7}, Landroid/support/v7/internal/view/menu/MenuItemImpl;-><init>(Landroid/support/v7/internal/view/menu/MenuBuilder;IIIILjava/lang/CharSequence;I)V

    .line 405
    .local v0, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

    if-eqz v1, :cond_0

    .line 407
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setMenuInfo(Landroid/view/ContextMenu$ContextMenuInfo;)V

    .line 410
    :cond_0
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v2=(Reference);
    invoke-static {v2, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findInsertIndex(Ljava/util/ArrayList;I)I

    move-result v2

    #v2=(Integer);
    invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 411
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 413
    return-object v0
.end method

.method private dispatchPresenterUpdate(Z)V
    .locals 4
    .parameter "cleared"

    .prologue
    .line 241
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 255
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 245
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V

    .line 246
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, i$:Ljava/util/Iterator;
    :goto_1
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 247
    .local v2, ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuPresenter;

    .line 248
    .local v1, presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    if-nez v1, :cond_1

    .line 249
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 251
    :cond_1
    #v3=(Boolean);
    invoke-interface {v1, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->updateMenuView(Z)V

    goto :goto_1

    .line 254
    .end local v1           #presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    .end local v2           #ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    :cond_2
    #v1=(Conflicted);v2=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V

    goto :goto_0
.end method

.method private dispatchRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 7
    .parameter "state"

    .prologue
    .line 301
    const-string v6, "android:menu:presenters"

    #v6=(Reference);
    invoke-virtual {p1, v6}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v4

    .line 303
    .local v4, presenterStates:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    #v4=(Reference);
    if-eqz v4, :cond_0

    iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_1

    .line 321
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    .line 307
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Boolean);
    iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, i$:Ljava/util/Iterator;
    :cond_2
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    #v5=(Reference);
    check-cast v5, Ljava/lang/ref/WeakReference;

    .line 308
    .local v5, ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuPresenter;

    .line 309
    .local v3, presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    if-nez v3, :cond_3

    .line 310
    iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v6=(Reference);
    invoke-virtual {v6, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 312
    :cond_3
    #v6=(Boolean);
    invoke-interface {v3}, Landroid/support/v7/internal/view/menu/MenuPresenter;->getId()I

    move-result v1

    .line 313
    .local v1, id:I
    #v1=(Integer);
    if-lez v1, :cond_2

    .line 314
    invoke-virtual {v4, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/os/Parcelable;

    .line 315
    .local v2, parcel:Landroid/os/Parcelable;
    if-eqz v2, :cond_2

    .line 316
    invoke-interface {v3, v2}, Landroid/support/v7/internal/view/menu/MenuPresenter;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    goto :goto_0
.end method

.method private dispatchSaveInstanceState(Landroid/os/Bundle;)V
    .locals 7
    .parameter "outState"

    .prologue
    .line 276
    iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_0

    .line 298
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    return-void

    .line 280
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);
    new-instance v3, Landroid/util/SparseArray;

    #v3=(UninitRef);
    invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V

    .line 282
    .local v3, presenterStates:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    #v3=(Reference);
    iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v6=(Reference);
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, i$:Ljava/util/Iterator;
    :cond_1
    :goto_1
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 283
    .local v4, ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/view/menu/MenuPresenter;

    .line 284
    .local v2, presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    if-nez v2, :cond_2

    .line 285
    iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v6=(Reference);
    invoke-virtual {v6, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 287
    :cond_2
    #v6=(Boolean);
    invoke-interface {v2}, Landroid/support/v7/internal/view/menu/MenuPresenter;->getId()I

    move-result v1

    .line 288
    .local v1, id:I
    #v1=(Integer);
    if-lez v1, :cond_1

    .line 289
    invoke-interface {v2}, Landroid/support/v7/internal/view/menu/MenuPresenter;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v5

    .line 290
    .local v5, state:Landroid/os/Parcelable;
    #v5=(Reference);
    if-eqz v5, :cond_1

    .line 291
    invoke-virtual {v3, v1, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_1

    .line 297
    .end local v1           #id:I
    .end local v2           #presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    .end local v4           #ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    .end local v5           #state:Landroid/os/Parcelable;
    :cond_3
    #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    const-string v6, "android:menu:presenters"

    #v6=(Reference);
    invoke-virtual {p1, v6, v3}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    goto :goto_0
.end method

.method private dispatchSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z
    .locals 5
    .parameter "subMenu"

    .prologue
    .line 258
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 259
    const/4 v3, 0x0

    .line 272
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);
    return v3

    .line 262
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    const/4 v3, 0x0

    .line 264
    .local v3, result:Z
    #v3=(Null);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, i$:Ljava/util/Iterator;
    :cond_2
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 265
    .local v2, ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuPresenter;

    .line 266
    .local v1, presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    if-nez v1, :cond_3

    .line 267
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v4=(Reference);
    invoke-virtual {v4, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 268
    :cond_3
    #v4=(Boolean);
    if-nez v3, :cond_2

    .line 269
    invoke-interface {v1, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z

    move-result v3

    goto :goto_0
.end method

.method private static findInsertIndex(Ljava/util/ArrayList;I)I
    .locals 3
    .parameter
    .parameter "ordering"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;I)I"
        }
    .end annotation

    .prologue
    .line 790
    .local p0, items:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    add-int/lit8 v0, v2, -0x1

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);
    if-ltz v0, :cond_1

    .line 791
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 792
    .local v1, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getOrdering()I

    move-result v2

    if-gt v2, p1, :cond_0

    .line 793
    add-int/lit8 v2, v0, 0x1

    .line 797
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :goto_1
    #v1=(Conflicted);
    return v2

    .line 790
    .restart local v1       #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_0
    #v1=(Reference);
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 797
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_1
    #v1=(Conflicted);
    const/4 v2, 0x0

    #v2=(Null);
    goto :goto_1
.end method

.method private static getOrdering(I)I
    .locals 3
    .parameter "categoryOrder"

    .prologue
    .line 723
    const/high16 v1, -0x1

    #v1=(Integer);
    and-int/2addr v1, p0

    shr-int/lit8 v0, v1, 0x10

    .line 725
    .local v0, index:I
    #v0=(Short);
    if-ltz v0, :cond_0

    sget-object v1, Landroid/support/v7/internal/view/menu/MenuBuilder;->sCategoryToOrder:[I

    #v1=(Reference);
    array-length v1, v1

    #v1=(Integer);
    if-lt v0, v1, :cond_1

    .line 726
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    const-string v2, "order does not contain a valid category."

    #v2=(Reference);
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    #v1=(Reference);
    throw v1

    .line 729
    :cond_1
    #v1=(Integer);v2=(Uninit);
    sget-object v1, Landroid/support/v7/internal/view/menu/MenuBuilder;->sCategoryToOrder:[I

    #v1=(Reference);
    aget v1, v1, v0

    #v1=(Integer);
    shl-int/lit8 v1, v1, 0x10

    const v2, 0xffff

    #v2=(Char);
    and-int/2addr v2, p0

    #v2=(Integer);
    or-int/2addr v1, v2

    return v1
.end method

.method private removeItemAtInt(IZ)V
    .locals 1
    .parameter "index"
    .parameter "updateChildrenOnMenuViews"

    .prologue
    .line 521
    if-ltz p1, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    if-lt p1, v0, :cond_1

    .line 530
    :cond_0
    :goto_0
    #v0=(Conflicted);
    return-void

    .line 525
    :cond_1
    #v0=(Integer);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 527
    if-eqz p2, :cond_0

    .line 528
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    goto :goto_0
.end method

.method private setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
    .locals 3
    .parameter "titleRes"
    .parameter "title"
    .parameter "iconRes"
    .parameter "icon"
    .parameter "view"

    .prologue
    const/4 v2, 0x0

    .line 1154
    #v2=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 1156
    .local v0, r:Landroid/content/res/Resources;
    #v0=(Reference);
    if-eqz p5, :cond_0

    .line 1157
    iput-object p5, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderView:Landroid/view/View;

    .line 1160
    iput-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;

    .line 1161
    iput-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    .line 1180
    :goto_0
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 1181
    return-void

    .line 1163
    :cond_0
    #v1=(Uninit);
    if-lez p1, :cond_3

    .line 1164
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;

    .line 1169
    :cond_1
    :goto_1
    #v1=(Conflicted);
    if-lez p3, :cond_4

    .line 1170
    invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    #v1=(Reference);
    iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    .line 1176
    :cond_2
    :goto_2
    #v1=(Conflicted);
    iput-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderView:Landroid/view/View;

    goto :goto_0

    .line 1165
    :cond_3
    #v1=(Uninit);
    if-eqz p2, :cond_1

    .line 1166
    iput-object p2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;

    goto :goto_1

    .line 1171
    :cond_4
    #v1=(Conflicted);
    if-eqz p4, :cond_2

    .line 1172
    iput-object p4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    goto :goto_2
.end method

.method private setShortcutsVisibleInner(Z)V
    .locals 3
    .parameter "shortcutsVisible"

    .prologue
    const/4 v0, 0x1

    .line 756
    #v0=(One);
    if-eqz p1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v1

    iget v1, v1, Landroid/content/res/Configuration;->keyboard:I

    #v1=(Integer);
    if-eq v1, v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;

    #v1=(Reference);
    sget v2, Landroid/support/v7/appcompat/R$bool;->abc_config_showMenuShortcutsWhenKeyboardPresent:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mShortcutsVisible:Z

    .line 759
    return-void

    .line 756
    :cond_0
    #v0=(One);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method


# virtual methods
.method public add(I)Landroid/view/MenuItem;
    .locals 2
    .parameter "titleRes"

    .prologue
    const/4 v1, 0x0

    .line 423
    #v1=(Null);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v1, v1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIII)Landroid/view/MenuItem;
    .locals 1
    .parameter "group"
    .parameter "id"
    .parameter "categoryOrder"
    .parameter "title"

    .prologue
    .line 433
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;

    #v0=(Reference);
    invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    return-object v0
.end method

.method public add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1
    .parameter "group"
    .parameter "id"
    .parameter "categoryOrder"
    .parameter "title"

    .prologue
    .line 428
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
    .locals 1
    .parameter "title"

    .prologue
    const/4 v0, 0x0

    .line 418
    #v0=(Null);
    invoke-direct {p0, v0, v0, v0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
    .locals 13
    .parameter "group"
    .parameter "id"
    .parameter "categoryOrder"
    .parameter "caller"
    .parameter "specifics"
    .parameter "intent"
    .parameter "flags"
    .parameter "outSpecificItems"

    .prologue
    .line 463
    iget-object v10, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;

    #v10=(Reference);
    invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v7

    .line 464
    .local v7, pm:Landroid/content/pm/PackageManager;
    #v7=(Reference);
    const/4 v10, 0x0

    #v10=(Null);
    move-object/from16 v0, p4

    #v0=(Reference);
    move-object/from16 v1, p5

    #v1=(Reference);
    move-object/from16 v2, p6

    #v2=(Reference);
    invoke-virtual {v7, v0, v1, v2, v10}, Landroid/content/pm/PackageManager;->queryIntentActivityOptions(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v6

    .line 466
    .local v6, lri:Ljava/util/List;,"Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
    #v6=(Reference);
    if-eqz v6, :cond_2

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v3

    .line 468
    .local v3, N:I
    :goto_0
    #v3=(Integer);
    and-int/lit8 v10, p7, 0x1

    #v10=(Integer);
    if-nez v10, :cond_0

    .line 469
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeGroup(I)V

    .line 472
    :cond_0
    const/4 v4, 0x0

    .local v4, i:I
    :goto_1
    #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
    if-ge v4, v3, :cond_4

    .line 473
    invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Landroid/content/pm/ResolveInfo;

    .line 474
    .local v8, ri:Landroid/content/pm/ResolveInfo;
    new-instance v9, Landroid/content/Intent;

    #v9=(UninitRef);
    iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I

    #v10=(Integer);
    if-gez v10, :cond_3

    move-object/from16 v10, p6

    :goto_2
    #v10=(Reference);
    invoke-direct {v9, v10}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 476
    .local v9, rintent:Landroid/content/Intent;
    #v9=(Reference);
    new-instance v10, Landroid/content/ComponentName;

    #v10=(UninitRef);
    iget-object v11, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    #v11=(Reference);
    iget-object v11, v11, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v11, v11, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object v12, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    #v12=(Reference);
    iget-object v12, v12, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-direct {v10, v11, v12}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    #v10=(Reference);
    invoke-virtual {v9, v10}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 479
    invoke-virtual {v8, v7}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v10

    move/from16 v0, p3

    #v0=(Integer);
    invoke-virtual {p0, p1, p2, v0, v10}, Landroid/support/v7/internal/view/menu/MenuBuilder;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v10

    invoke-virtual {v8, v7}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v11

    invoke-interface {v10, v11}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    move-result-object v10

    invoke-interface {v10, v9}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;

    move-result-object v5

    .line 482
    .local v5, item:Landroid/view/MenuItem;
    #v5=(Reference);
    if-eqz p8, :cond_1

    iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I

    #v10=(Integer);
    if-ltz v10, :cond_1

    .line 483
    iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I

    aput-object v5, p8, v10

    .line 472
    :cond_1
    #v10=(Conflicted);
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    .line 466
    .end local v3           #N:I
    .end local v4           #i:I
    .end local v5           #item:Landroid/view/MenuItem;
    .end local v8           #ri:Landroid/content/pm/ResolveInfo;
    .end local v9           #rintent:Landroid/content/Intent;
    :cond_2
    #v0=(Reference);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Null);v11=(Uninit);v12=(Uninit);
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_0

    .line 474
    .restart local v3       #N:I
    .restart local v4       #i:I
    .restart local v8       #ri:Landroid/content/pm/ResolveInfo;
    :cond_3
    #v0=(Conflicted);v3=(Integer);v4=(Integer);v5=(Conflicted);v8=(Reference);v9=(UninitRef);v10=(Integer);v11=(Conflicted);v12=(Conflicted);
    iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I

    aget-object v10, p5, v10

    #v10=(Null);
    goto :goto_2

    .line 487
    .end local v8           #ri:Landroid/content/pm/ResolveInfo;
    :cond_4
    #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
    return v3
.end method

.method public addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
    .locals 2
    .parameter "presenter"

    .prologue
    .line 220
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v0=(Reference);
    new-instance v1, Ljava/lang/ref/WeakReference;

    #v1=(UninitRef);
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    #v1=(Reference);
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 221
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;

    invoke-interface {p1, v0, p0}, Landroid/support/v7/internal/view/menu/MenuPresenter;->initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 222
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z

    .line 223
    return-void
.end method

.method public addSubMenu(I)Landroid/view/SubMenu;
    .locals 2
    .parameter "titleRes"

    .prologue
    const/4 v1, 0x0

    .line 443
    #v1=(Null);
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v1, v1, v1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIII)Landroid/view/SubMenu;
    .locals 1
    .parameter "group"
    .parameter "id"
    .parameter "categoryOrder"
    .parameter "title"

    .prologue
    .line 457
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;

    #v0=(Reference);
    invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    return-object v0
.end method

.method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 3
    .parameter "group"
    .parameter "id"
    .parameter "categoryOrder"
    .parameter "title"

    .prologue
    .line 448
    invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 449
    .local v0, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    new-instance v1, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    #v1=(UninitRef);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;

    #v2=(Reference);
    invoke-direct {v1, v2, p0, v0}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)V

    .line 450
    .local v1, subMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setSubMenu(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V

    .line 452
    return-object v1
.end method

.method public addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 1
    .parameter "title"

    .prologue
    const/4 v0, 0x0

    .line 438
    #v0=(Null);
    invoke-virtual {p0, v0, v0, v0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public changeMenuMode()V
    .locals 1

    .prologue
    .line 784
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 785
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;

    invoke-interface {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;->onMenuModeChange(Landroid/support/v7/internal/view/menu/MenuBuilder;)V

    .line 787
    :cond_0
    return-void
.end method

.method public clear()V
    .locals 1

    .prologue
    .line 547
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 548
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z

    .line 550
    :cond_0
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 552
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 553
    return-void
.end method

.method public clearAll()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    #v1=(One);
    const/4 v0, 0x0

    .line 537
    #v0=(Null);
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z

    .line 538
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->clear()V

    .line 539
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->clearHeader()V

    .line 540
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z

    .line 541
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z

    .line 542
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 543
    return-void
.end method

.method public clearHeader()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 1145
    #v0=(Null);
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    .line 1146
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;

    .line 1147
    iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderView:Landroid/view/View;

    .line 1149
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 1150
    return-void
.end method

.method public close()V
    .locals 1

    .prologue
    .line 982
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V

    .line 983
    return-void
.end method

.method final close(Z)V
    .locals 4
    .parameter "allMenusAreClosing"

    .prologue
    .line 964
    iget-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsClosing:Z

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 978
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 968
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);
    const/4 v3, 0x1

    #v3=(One);
    iput-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsClosing:Z

    .line 969
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, i$:Ljava/util/Iterator;
    :goto_1
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 970
    .local v2, ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuPresenter;

    .line 971
    .local v1, presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    if-nez v1, :cond_1

    .line 972
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 974
    :cond_1
    #v3=(Boolean);
    invoke-interface {v1, p0, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V

    goto :goto_1

    .line 977
    .end local v1           #presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    .end local v2           #ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    :cond_2
    #v1=(Conflicted);v2=(Conflicted);
    const/4 v3, 0x0

    #v3=(Null);
    iput-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsClosing:Z

    goto :goto_0
.end method

.method public collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 5
    .parameter "item"

    .prologue
    .line 1308
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_0

    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v4=(Reference);
    if-eq v4, p1, :cond_2

    .line 1309
    :cond_0
    #v4=(Conflicted);
    const/4 v0, 0x0

    .line 1328
    :cond_1
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    .line 1312
    :cond_2
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference);
    const/4 v0, 0x0

    .line 1314
    .local v0, collapsed:Z
    #v0=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V

    .line 1315
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, i$:Ljava/util/Iterator;
    :cond_3
    :goto_1
    #v0=(Boolean);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 1316
    .local v3, ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/view/menu/MenuPresenter;

    .line 1317
    .local v2, presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    if-nez v2, :cond_4

    .line 1318
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v4=(Reference);
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1319
    :cond_4
    #v4=(Boolean);
    invoke-interface {v2, p0, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1323
    .end local v2           #presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    .end local v3           #ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    :cond_5
    #v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V

    .line 1325
    if-eqz v0, :cond_1

    .line 1326
    const/4 v4, 0x0

    #v4=(Null);
    iput-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    goto :goto_0
.end method

.method dispatchMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
    .locals 1
    .parameter "menu"
    .parameter "item"

    .prologue
    .line 777
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;

    invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;->onMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z

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

.method public expandItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
    .locals 5
    .parameter "item"

    .prologue
    .line 1284
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 1285
    const/4 v0, 0x0

    .line 1304
    :cond_0
    :goto_0
    #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    return v0

    .line 1288
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
    const/4 v0, 0x0

    .line 1290
    .local v0, expanded:Z
    #v0=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V

    .line 1291
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, i$:Ljava/util/Iterator;
    :cond_2
    :goto_1
    #v0=(Boolean);v1=(Reference);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Ljava/lang/ref/WeakReference;

    .line 1292
    .local v3, ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/view/menu/MenuPresenter;

    .line 1293
    .local v2, presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    if-nez v2, :cond_3

    .line 1294
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v4=(Reference);
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1295
    :cond_3
    #v4=(Boolean);
    invoke-interface {v2, p0, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->expandItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1299
    .end local v2           #presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    .end local v3           #ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    :cond_4
    #v2=(Conflicted);v3=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V

    .line 1301
    if-eqz v0, :cond_0

    .line 1302
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    goto :goto_0
.end method

.method public findGroupIndex(I)I
    .locals 1
    .parameter "group"

    .prologue
    .line 669
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findGroupIndex(II)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public findGroupIndex(II)I
    .locals 4
    .parameter "group"
    .parameter "start"

    .prologue
    .line 673
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I

    move-result v2

    .line 675
    .local v2, size:I
    #v2=(Integer);
    if-gez p2, :cond_0

    .line 676
    const/4 p2, 0x0

    .line 679
    :cond_0
    move v0, p2

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v3=(Conflicted);
    if-ge v0, v2, :cond_2

    .line 680
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 682
    .local v1, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I

    move-result v3

    #v3=(Integer);
    if-ne v3, p1, :cond_1

    .line 687
    .end local v0           #i:I
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :goto_1
    #v1=(Conflicted);v3=(Conflicted);
    return v0

    .line 679
    .restart local v0       #i:I
    .restart local v1       #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_1
    #v1=(Reference);v3=(Integer);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 687
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_2
    #v1=(Conflicted);v3=(Conflicted);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_1
.end method

.method public findItem(I)Landroid/view/MenuItem;
    .locals 5
    .parameter "id"

    .prologue
    .line 638
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I

    move-result v3

    .line 639
    .local v3, size:I
    #v3=(Integer);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    if-ge v0, v3, :cond_2

    .line 640
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 641
    .local v1, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getItemId()I

    move-result v4

    #v4=(Integer);
    if-ne v4, p1, :cond_0

    .line 652
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :goto_1
    #v4=(Conflicted);
    return-object v1

    .line 643
    .restart local v1       #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_0
    #v4=(Integer);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasSubMenu()Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_1

    .line 644
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v4

    #v4=(Reference);
    invoke-interface {v4, p1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 646
    .local v2, possibleItem:Landroid/view/MenuItem;
    #v2=(Reference);
    if-eqz v2, :cond_1

    move-object v1, v2

    .line 647
    goto :goto_1

    .line 639
    .end local v2           #possibleItem:Landroid/view/MenuItem;
    :cond_1
    #v2=(Conflicted);v4=(Conflicted);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 652
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_2
    #v1=(Conflicted);
    const/4 v1, 0x0

    #v1=(Null);
    goto :goto_1
.end method

.method public findItemIndex(I)I
    .locals 4
    .parameter "id"

    .prologue
    .line 656
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I

    move-result v2

    .line 658
    .local v2, size:I
    #v2=(Integer);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v3=(Conflicted);
    if-ge v0, v2, :cond_1

    .line 659
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 660
    .local v1, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getItemId()I

    move-result v3

    #v3=(Integer);
    if-ne v3, p1, :cond_0

    .line 665
    .end local v0           #i:I
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :goto_1
    #v1=(Conflicted);v3=(Conflicted);
    return v0

    .line 658
    .restart local v0       #i:I
    .restart local v1       #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_0
    #v1=(Reference);v3=(Integer);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 665
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_1
    #v1=(Conflicted);v3=(Conflicted);
    const/4 v0, -0x1

    #v0=(Byte);
    goto :goto_1
.end method

.method findItemWithShortcutForKey(ILandroid/view/KeyEvent;)Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .locals 12
    .parameter "keyCode"
    .parameter "event"

    .prologue
    const/4 v8, 0x0

    #v8=(Null);
    const/4 v11, 0x0

    .line 871
    #v11=(Null);
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mTempShortcutItemList:Ljava/util/ArrayList;

    .line 872
    .local v2, items:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    #v2=(Reference);
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 873
    invoke-virtual {p0, v2, p1, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemsWithShortcutForKey(Ljava/util/List;ILandroid/view/KeyEvent;)V

    .line 875
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    #v9=(Boolean);
    if-eqz v9, :cond_1

    .line 906
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference);v9=(Integer);v10=(Conflicted);
    return-object v8

    .line 879
    :cond_1
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v9=(Boolean);v10=(Uninit);
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v3

    .line 880
    .local v3, metaState:I
    #v3=(Integer);
    new-instance v4, Landroid/view/KeyCharacterMap$KeyData;

    #v4=(UninitRef);
    invoke-direct {v4}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V

    .line 882
    .local v4, possibleChars:Landroid/view/KeyCharacterMap$KeyData;
    #v4=(Reference);
    invoke-virtual {p2, v4}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z

    .line 885
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v7

    .line 886
    .local v7, size:I
    #v7=(Integer);
    const/4 v9, 0x1

    #v9=(One);
    if-ne v7, v9, :cond_2

    .line 887
    invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    goto :goto_0

    .line 890
    :cond_2
    #v8=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->isQwertyMode()Z

    move-result v5

    .line 893
    .local v5, qwerty:Z
    #v5=(Boolean);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_1
    #v0=(Integer);v1=(Conflicted);v6=(Conflicted);v9=(Integer);v10=(Conflicted);
    if-ge v0, v7, :cond_0

    .line 894
    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 895
    .local v1, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    if-eqz v5, :cond_6

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getAlphabeticShortcut()C

    move-result v6

    .line 897
    .local v6, shortcutChar:C
    :goto_2
    #v6=(Char);
    iget-object v9, v4, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    #v9=(Reference);
    aget-char v9, v9, v11

    #v9=(Char);
    if-ne v6, v9, :cond_3

    and-int/lit8 v9, v3, 0x2

    #v9=(Integer);
    if-eqz v9, :cond_5

    :cond_3
    iget-object v9, v4, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    #v9=(Reference);
    const/4 v10, 0x2

    #v10=(PosByte);
    aget-char v9, v9, v10

    #v9=(Char);
    if-ne v6, v9, :cond_4

    and-int/lit8 v9, v3, 0x2

    #v9=(Integer);
    if-nez v9, :cond_5

    :cond_4
    if-eqz v5, :cond_7

    const/16 v9, 0x8

    #v9=(PosByte);
    if-ne v6, v9, :cond_7

    const/16 v9, 0x43

    if-ne p1, v9, :cond_7

    :cond_5
    #v9=(Integer);v10=(Conflicted);
    move-object v8, v1

    .line 903
    #v8=(Reference);
    goto :goto_0

    .line 895
    .end local v6           #shortcutChar:C
    :cond_6
    #v6=(Conflicted);v8=(Null);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getNumericShortcut()C

    move-result v6

    #v6=(Char);
    goto :goto_2

    .line 893
    .restart local v6       #shortcutChar:C
    :cond_7
    #v10=(PosByte);
    add-int/lit8 v0, v0, 0x1

    goto :goto_1
.end method

.method findItemsWithShortcutForKey(Ljava/util/List;ILandroid/view/KeyEvent;)V
    .locals 11
    .parameter
    .parameter "keyCode"
    .parameter "event"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;I",
            "Landroid/view/KeyEvent;",
            ")V"
        }
    .end annotation

    .prologue
    .local p1, items:Ljava/util/List;,"Ljava/util/List<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    const/16 v10, 0x43

    .line 825
    #v10=(PosByte);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->isQwertyMode()Z

    move-result v6

    .line 826
    .local v6, qwerty:Z
    #v6=(Boolean);
    invoke-virtual {p3}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v4

    .line 827
    .local v4, metaState:I
    #v4=(Integer);
    new-instance v5, Landroid/view/KeyCharacterMap$KeyData;

    #v5=(UninitRef);
    invoke-direct {v5}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V

    .line 829
    .local v5, possibleChars:Landroid/view/KeyCharacterMap$KeyData;
    #v5=(Reference);
    invoke-virtual {p3, v5}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z

    move-result v2

    .line 831
    .local v2, isKeyCodeMapped:Z
    #v2=(Boolean);
    if-nez v2, :cond_1

    if-eq p2, v10, :cond_1

    .line 855
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-void

    .line 836
    :cond_1
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 837
    .local v0, N:I
    #v0=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-ge v1, v0, :cond_0

    .line 838
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 839
    .local v3, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasSubMenu()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_2

    .line 840
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v8

    #v8=(Reference);
    check-cast v8, Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v8, p1, p2, p3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemsWithShortcutForKey(Ljava/util/List;ILandroid/view/KeyEvent;)V

    .line 843
    :cond_2
    #v8=(Conflicted);
    if-eqz v6, :cond_5

    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getAlphabeticShortcut()C

    move-result v7

    .line 845
    .local v7, shortcutChar:C
    :goto_1
    #v7=(Char);
    and-int/lit8 v8, v4, 0x5

    #v8=(Integer);
    if-nez v8, :cond_4

    if-eqz v7, :cond_4

    iget-object v8, v5, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    #v8=(Reference);
    const/4 v9, 0x0

    #v9=(Null);
    aget-char v8, v8, v9

    #v8=(Char);
    if-eq v7, v8, :cond_3

    iget-object v8, v5, Landroid/view/KeyCharacterMap$KeyData;->meta:[C

    #v8=(Reference);
    const/4 v9, 0x2

    #v9=(PosByte);
    aget-char v8, v8, v9

    #v8=(Char);
    if-eq v7, v8, :cond_3

    if-eqz v6, :cond_4

    const/16 v8, 0x8

    #v8=(PosByte);
    if-ne v7, v8, :cond_4

    if-ne p2, v10, :cond_4

    :cond_3
    #v8=(Char);
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isEnabled()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_4

    .line 852
    invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 837
    :cond_4
    #v8=(Integer);v9=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 843
    .end local v7           #shortcutChar:C
    :cond_5
    #v7=(Conflicted);v8=(Conflicted);
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getNumericShortcut()C

    move-result v7

    #v7=(Char);
    goto :goto_1
.end method

.method public flagActionItems()V
    .locals 10

    .prologue
    .line 1096
    iget-boolean v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z

    #v8=(Boolean);
    if-nez v8, :cond_0

    .line 1132
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
    return-void

    .line 1101
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);
    const/4 v0, 0x0

    .line 1102
    .local v0, flagged:Z
    #v0=(Null);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, i$:Ljava/util/Iterator;
    :goto_1
    #v0=(Boolean);v2=(Reference);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    #v6=(Reference);
    check-cast v6, Ljava/lang/ref/WeakReference;

    .line 1103
    .local v6, ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v5

    #v5=(Reference);
    check-cast v5, Landroid/support/v7/internal/view/menu/MenuPresenter;

    .line 1104
    .local v5, presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    if-nez v5, :cond_1

    .line 1105
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v8=(Reference);
    invoke-virtual {v8, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 1107
    :cond_1
    #v8=(Boolean);
    invoke-interface {v5}, Landroid/support/v7/internal/view/menu/MenuPresenter;->flagActionItems()Z

    move-result v8

    or-int/2addr v0, v8

    goto :goto_1

    .line 1111
    .end local v5           #presenter:Landroid/support/v7/internal/view/menu/MenuPresenter;
    .end local v6           #ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    :cond_2
    #v5=(Conflicted);v6=(Conflicted);
    if-eqz v0, :cond_4

    .line 1112
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 1113
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 1114
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v7

    .line 1115
    .local v7, visibleItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    #v7=(Reference);
    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v4

    .line 1116
    .local v4, itemsSize:I
    #v4=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_2
    #v1=(Integer);v3=(Conflicted);
    if-ge v1, v4, :cond_5

    .line 1117
    invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 1118
    .local v3, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isActionButton()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_3

    .line 1119
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1116
    :goto_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    .line 1121
    :cond_3
    #v8=(Boolean);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 1127
    .end local v1           #i:I
    .end local v3           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .end local v4           #itemsSize:I
    .end local v7           #visibleItems:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    :cond_4
    #v1=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Uninit);v8=(Boolean);
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;

    #v8=(Reference);
    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 1128
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V

    .line 1129
    iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;

    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getVisibleItems()Ljava/util/ArrayList;

    move-result-object v9

    #v9=(Reference);
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1131
    :cond_5
    #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v9=(Conflicted);
    const/4 v8, 0x0

    #v8=(Null);
    iput-boolean v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z

    goto :goto_0
.end method

.method getActionItems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1135
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->flagActionItems()V

    .line 1136
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method protected getActionViewStatesKey()Ljava/lang/String;
    .locals 1

    .prologue
    .line 389
    const-string v0, "android:menu:actionviewstates"

    #v0=(Reference);
    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 1

    .prologue
    .line 773
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;

    #v0=(Reference);
    return-object v0
.end method

.method public getExpandedItem()Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .locals 1

    .prologue
    .line 1332
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;

    #v0=(Reference);
    return-object v0
.end method

.method public getHeaderIcon()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 1248
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;

    #v0=(Reference);
    return-object v0
.end method

.method public getHeaderTitle()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 1244
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public getHeaderView()Landroid/view/View;
    .locals 1

    .prologue
    .line 1252
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderView:Landroid/view/View;

    #v0=(Reference);
    return-object v0
.end method

.method public getItem(I)Landroid/view/MenuItem;
    .locals 1
    .parameter "index"

    .prologue
    .line 697
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/MenuItem;

    return-object v0
.end method

.method getNonActionItems()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1140
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->flagActionItems()V

    .line 1141
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;

    #v0=(Reference);
    return-object v0
.end method

.method getOptionalIconsVisible()Z
    .locals 1

    .prologue
    .line 1280
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mOptionalIconsVisible:Z

    #v0=(Boolean);
    return v0
.end method

.method getResources()Landroid/content/res/Resources;
    .locals 1

    .prologue
    .line 769
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;

    #v0=(Reference);
    return-object v0
.end method

.method public getRootMenu()Landroid/support/v7/internal/view/menu/MenuBuilder;
    .locals 0

    .prologue
    .line 1261
    return-object p0
.end method

.method getVisibleItems()Ljava/util/ArrayList;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList",
            "<",
            "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1049
    iget-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z

    #v3=(Boolean);
    if-nez v3, :cond_0

    .line 1050
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;

    .line 1068
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference);
    return-object v3

    .line 1054
    :cond_0
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V

    .line 1056
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 1058
    .local v2, itemsSize:I
    #v2=(Integer);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_1
    #v0=(Integer);v1=(Conflicted);v3=(Conflicted);
    if-ge v0, v2, :cond_2

    .line 1059
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 1060
    .local v1, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isVisible()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    .line 1061
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1058
    :cond_1
    #v3=(Conflicted);
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1065
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_2
    #v1=(Conflicted);
    const/4 v3, 0x0

    #v3=(Null);
    iput-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z

    .line 1066
    const/4 v3, 0x1

    #v3=(One);
    iput-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z

    .line 1068
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;

    #v3=(Reference);
    goto :goto_0
.end method

.method public hasVisibleItems()Z
    .locals 4

    .prologue
    .line 624
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I

    move-result v2

    .line 626
    .local v2, size:I
    #v2=(Integer);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v3=(Conflicted);
    if-ge v0, v2, :cond_1

    .line 627
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 628
    .local v1, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isVisible()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 629
    const/4 v3, 0x1

    .line 633
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :goto_1
    #v1=(Conflicted);
    return v3

    .line 626
    .restart local v1       #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_0
    #v1=(Reference);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 633
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_1
    #v1=(Conflicted);v3=(Conflicted);
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_1
.end method

.method isQwertyMode()Z
    .locals 1

    .prologue
    .line 736
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mQwertyMode:Z

    #v0=(Boolean);
    return v0
.end method

.method public isShortcutKey(ILandroid/view/KeyEvent;)Z
    .locals 1
    .parameter "keyCode"
    .parameter "event"

    .prologue
    .line 702
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemWithShortcutForKey(ILandroid/view/KeyEvent;)Landroid/support/v7/internal/view/menu/MenuItemImpl;

    move-result-object v0

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

.method public isShortcutsVisible()Z
    .locals 1

    .prologue
    .line 765
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mShortcutsVisible:Z

    #v0=(Boolean);
    return v0
.end method

.method onItemActionRequestChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
    .locals 1
    .parameter "item"

    .prologue
    const/4 v0, 0x1

    .line 1044
    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z

    .line 1045
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 1046
    return-void
.end method

.method onItemVisibleChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
    .locals 1
    .parameter "item"

    .prologue
    const/4 v0, 0x1

    .line 1033
    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z

    .line 1034
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 1035
    return-void
.end method

.method onItemsChanged(Z)V
    .locals 2
    .parameter "structureChanged"

    .prologue
    const/4 v1, 0x1

    .line 993
    #v1=(One);
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z

    #v0=(Boolean);
    if-nez v0, :cond_1

    .line 994
    if-eqz p1, :cond_0

    .line 995
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z

    .line 996
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z

    .line 999
    :cond_0
    invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchPresenterUpdate(Z)V

    .line 1003
    :goto_0
    return-void

    .line 1001
    :cond_1
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z

    goto :goto_0
.end method

.method public performIdentifierAction(II)Z
    .locals 1
    .parameter "id"
    .parameter "flags"

    .prologue
    .line 912
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItem(I)Landroid/view/MenuItem;

    move-result-object v0

    #v0=(Reference);
    invoke-virtual {p0, v0, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z

    move-result v0

    #v0=(Boolean);
    return v0
.end method

.method public performItemAction(Landroid/view/MenuItem;I)Z
    .locals 8
    .parameter "item"
    .parameter "flags"

    .prologue
    const/4 v6, 0x0

    #v6=(Null);
    const/4 v5, 0x1

    .line 916
    #v5=(One);
    move-object v1, p1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 918
    .local v1, itemImpl:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isEnabled()Z

    move-result v7

    #v7=(Boolean);
    if-nez v7, :cond_2

    :cond_0
    #v7=(Conflicted);
    move v0, v6

    .line 952
    :cond_1
    :goto_0
    #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Integer);
    return v0

    .line 922
    :cond_2
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Null);v7=(Boolean);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->invoke()Z

    move-result v0

    .line 924
    .local v0, invoked:Z
    #v0=(Boolean);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getSupportActionProvider()Landroid/support/v4/view/ActionProvider;

    move-result-object v2

    .line 925
    .local v2, provider:Landroid/support/v4/view/ActionProvider;
    #v2=(Reference);
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/support/v4/view/ActionProvider;->hasSubMenu()Z

    move-result v7

    if-eqz v7, :cond_3

    move v3, v5

    .line 926
    .local v3, providerHasSubMenu:Z
    :goto_1
    #v3=(Boolean);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasCollapsibleActionView()Z

    move-result v7

    if-eqz v7, :cond_4

    .line 927
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->expandActionView()Z

    move-result v6

    #v6=(Boolean);
    or-int/2addr v0, v6

    .line 928
    if-eqz v0, :cond_1

    .line 929
    invoke-virtual {p0, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V

    goto :goto_0

    .end local v3           #providerHasSubMenu:Z
    :cond_3
    #v3=(Uninit);v6=(Null);
    move v3, v6

    .line 925
    #v3=(Null);
    goto :goto_1

    .line 931
    .restart local v3       #providerHasSubMenu:Z
    :cond_4
    #v3=(Boolean);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasSubMenu()Z

    move-result v7

    if-nez v7, :cond_5

    if-eqz v3, :cond_8

    .line 932
    :cond_5
    invoke-virtual {p0, v6}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V

    .line 934
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasSubMenu()Z

    move-result v6

    #v6=(Boolean);
    if-nez v6, :cond_6

    .line 935
    new-instance v6, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    #v6=(UninitRef);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getContext()Landroid/content/Context;

    move-result-object v7

    #v7=(Reference);
    invoke-direct {v6, v7, p0, v1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)V

    #v6=(Reference);
    invoke-virtual {v1, v6}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setSubMenu(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V

    .line 938
    :cond_6
    #v6=(Conflicted);v7=(Conflicted);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v4

    #v4=(Reference);
    check-cast v4, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    .line 939
    .local v4, subMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    if-eqz v3, :cond_7

    .line 940
    invoke-virtual {v2, v4}, Landroid/support/v4/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V

    .line 942
    :cond_7
    invoke-direct {p0, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z

    move-result v6

    #v6=(Boolean);
    or-int/2addr v0, v6

    .line 943
    if-nez v0, :cond_1

    .line 944
    invoke-virtual {p0, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V

    goto :goto_0

    .line 947
    .end local v4           #subMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    :cond_8
    #v4=(Uninit);v6=(Null);v7=(Boolean);
    and-int/lit8 v6, p2, 0x1

    #v6=(Integer);
    if-nez v6, :cond_1

    .line 948
    invoke-virtual {p0, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V

    goto :goto_0
.end method

.method public performShortcut(ILandroid/view/KeyEvent;I)Z
    .locals 3
    .parameter "keyCode"
    .parameter "event"
    .parameter "flags"

    .prologue
    .line 802
    invoke-virtual {p0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemWithShortcutForKey(ILandroid/view/KeyEvent;)Landroid/support/v7/internal/view/menu/MenuItemImpl;

    move-result-object v1

    .line 804
    .local v1, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    #v1=(Reference);
    const/4 v0, 0x0

    .line 806
    .local v0, handled:Z
    #v0=(Null);
    if-eqz v1, :cond_0

    .line 807
    invoke-virtual {p0, v1, p3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z

    move-result v0

    .line 810
    :cond_0
    #v0=(Boolean);
    and-int/lit8 v2, p3, 0x2

    #v2=(Integer);
    if-eqz v2, :cond_1

    .line 811
    const/4 v2, 0x1

    #v2=(One);
    invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V

    .line 814
    :cond_1
    #v2=(Integer);
    return v0
.end method

.method public removeGroup(I)V
    .locals 5
    .parameter "group"

    .prologue
    .line 497
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findGroupIndex(I)I

    move-result v0

    .line 499
    .local v0, i:I
    #v0=(Integer);
    if-ltz v0, :cond_1

    .line 500
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v4

    #v4=(Integer);
    sub-int v1, v4, v0

    .line 501
    .local v1, maxRemovable:I
    #v1=(Integer);
    const/4 v2, 0x0

    .local v2, numRemoved:I
    #v2=(Null);
    move v3, v2

    .line 502
    .end local v2           #numRemoved:I
    .local v3, numRemoved:I
    :goto_0
    #v2=(Integer);v3=(Integer);
    add-int/lit8 v2, v3, 0x1

    .end local v3           #numRemoved:I
    .restart local v2       #numRemoved:I
    if-ge v3, v1, :cond_0

    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I

    move-result v4

    #v4=(Integer);
    if-ne v4, p1, :cond_0

    .line 504
    const/4 v4, 0x0

    #v4=(Null);
    invoke-direct {p0, v0, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeItemAtInt(IZ)V

    move v3, v2

    .end local v2           #numRemoved:I
    .restart local v3       #numRemoved:I
    goto :goto_0

    .line 508
    .end local v3           #numRemoved:I
    .restart local v2       #numRemoved:I
    :cond_0
    #v4=(Integer);
    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 510
    .end local v1           #maxRemovable:I
    .end local v2           #numRemoved:I
    :cond_1
    #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void
.end method

.method public removeItem(I)V
    .locals 2
    .parameter "id"

    .prologue
    .line 492
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemIndex(I)I

    move-result v0

    #v0=(Integer);
    const/4 v1, 0x1

    #v1=(One);
    invoke-direct {p0, v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeItemAtInt(IZ)V

    .line 493
    return-void
.end method

.method public removeItemAt(I)V
    .locals 1
    .parameter "index"

    .prologue
    .line 533
    const/4 v0, 0x1

    #v0=(One);
    invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeItemAtInt(IZ)V

    .line 534
    return-void
.end method

.method public removeMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
    .locals 4
    .parameter "presenter"

    .prologue
    .line 232
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    .local v0, i$:Ljava/util/Iterator;
    :cond_0
    :goto_0
    #v0=(Reference);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 233
    .local v2, ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuPresenter;

    .line 234
    .local v1, item:Landroid/support/v7/internal/view/menu/MenuPresenter;
    if-eqz v1, :cond_1

    if-ne v1, p1, :cond_0

    .line 235
    :cond_1
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    .line 238
    .end local v1           #item:Landroid/support/v7/internal/view/menu/MenuPresenter;
    .end local v2           #ref:Ljava/lang/ref/WeakReference;,"Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
    :cond_2
    #v1=(Conflicted);v2=(Conflicted);v3=(Boolean);
    return-void
.end method

.method public restoreActionViewStates(Landroid/os/Bundle;)V
    .locals 10
    .parameter "states"

    .prologue
    .line 359
    if-nez p1, :cond_1

    .line 386
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    return-void

    .line 363
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getActionViewStatesKey()Ljava/lang/String;

    move-result-object v8

    #v8=(Reference);
    invoke-virtual {p1, v8}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;

    move-result-object v7

    .line 366
    .local v7, viewStates:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    #v7=(Reference);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I

    move-result v3

    .line 367
    .local v3, itemCount:I
    #v3=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_1
    #v1=(Integer);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
    if-ge v1, v3, :cond_4

    .line 368
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getItem(I)Landroid/view/MenuItem;

    move-result-object v2

    .line 369
    .local v2, item:Landroid/view/MenuItem;
    #v2=(Reference);
    invoke-static {v2}, Landroid/support/v4/view/MenuItemCompat;->getActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v6

    .line 370
    .local v6, v:Landroid/view/View;
    #v6=(Reference);
    if-eqz v6, :cond_2

    invoke-virtual {v6}, Landroid/view/View;->getId()I

    move-result v8

    #v8=(Integer);
    const/4 v9, -0x1

    #v9=(Byte);
    if-eq v8, v9, :cond_2

    .line 371
    invoke-virtual {v6, v7}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V

    .line 373
    :cond_2
    #v8=(Conflicted);v9=(Conflicted);
    invoke-interface {v2}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v8

    #v8=(Boolean);
    if-eqz v8, :cond_3

    .line 374
    invoke-interface {v2}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v5

    #v5=(Reference);
    check-cast v5, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    .line 375
    .local v5, subMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    invoke-virtual {v5, p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->restoreActionViewStates(Landroid/os/Bundle;)V

    .line 367
    .end local v5           #subMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    :cond_3
    #v5=(Conflicted);
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 379
    .end local v2           #item:Landroid/view/MenuItem;
    .end local v6           #v:Landroid/view/View;
    :cond_4
    #v2=(Conflicted);v6=(Conflicted);v8=(Conflicted);
    const-string v8, "android:menu:expandedactionview"

    #v8=(Reference);
    invoke-virtual {p1, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    .line 380
    .local v0, expandedId:I
    #v0=(Integer);
    if-lez v0, :cond_0

    .line 381
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItem(I)Landroid/view/MenuItem;

    move-result-object v4

    .line 382
    .local v4, itemToExpand:Landroid/view/MenuItem;
    #v4=(Reference);
    if-eqz v4, :cond_0

    .line 383
    invoke-static {v4}, Landroid/support/v4/view/MenuItemCompat;->expandActionView(Landroid/view/MenuItem;)Z

    goto :goto_0
.end method

.method public restorePresenterStates(Landroid/os/Bundle;)V
    .locals 0
    .parameter "state"

    .prologue
    .line 328
    invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchRestoreInstanceState(Landroid/os/Bundle;)V

    .line 329
    return-void
.end method

.method public saveActionViewStates(Landroid/os/Bundle;)V
    .locals 8
    .parameter "outStates"

    .prologue
    .line 332
    const/4 v5, 0x0

    .line 334
    .local v5, viewStates:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    #v5=(Null);
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I

    move-result v2

    .line 335
    .local v2, itemCount:I
    #v2=(Integer);
    const/4 v0, 0x0

    .local v0, i:I
    :goto_0
    #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference);v6=(Conflicted);v7=(Conflicted);
    if-ge v0, v2, :cond_3

    .line 336
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getItem(I)Landroid/view/MenuItem;

    move-result-object v1

    .line 337
    .local v1, item:Landroid/view/MenuItem;
    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/view/MenuItemCompat;->getActionView(Landroid/view/MenuItem;)Landroid/view/View;

    move-result-object v4

    .line 338
    .local v4, v:Landroid/view/View;
    #v4=(Reference);
    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->getId()I

    move-result v6

    #v6=(Integer);
    const/4 v7, -0x1

    #v7=(Byte);
    if-eq v6, v7, :cond_1

    .line 339
    if-nez v5, :cond_0

    .line 340
    new-instance v5, Landroid/util/SparseArray;

    .end local v5           #viewStates:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    #v5=(UninitRef);
    invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V

    .line 342
    .restart local v5       #viewStates:Landroid/util/SparseArray;,"Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
    :cond_0
    #v5=(Reference);
    invoke-virtual {v4, v5}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V

    .line 343
    invoke-static {v1}, Landroid/support/v4/view/MenuItemCompat;->isActionViewExpanded(Landroid/view/MenuItem;)Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_1

    .line 344
    const-string v6, "android:menu:expandedactionview"

    #v6=(Reference);
    invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I

    move-result v7

    #v7=(Integer);
    invoke-virtual {p1, v6, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 347
    :cond_1
    #v6=(Conflicted);v7=(Conflicted);
    invoke-interface {v1}, Landroid/view/MenuItem;->hasSubMenu()Z

    move-result v6

    #v6=(Boolean);
    if-eqz v6, :cond_2

    .line 348
    invoke-interface {v1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/SubMenuBuilder;

    .line 349
    .local v3, subMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    invoke-virtual {v3, p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->saveActionViewStates(Landroid/os/Bundle;)V

    .line 335
    .end local v3           #subMenu:Landroid/support/v7/internal/view/menu/SubMenuBuilder;
    :cond_2
    #v3=(Conflicted);
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 353
    .end local v1           #item:Landroid/view/MenuItem;
    .end local v4           #v:Landroid/view/View;
    :cond_3
    #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);
    if-eqz v5, :cond_4

    .line 354
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getActionViewStatesKey()Ljava/lang/String;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {p1, v6, v5}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V

    .line 356
    :cond_4
    #v6=(Conflicted);
    return-void
.end method

.method public savePresenterStates(Landroid/os/Bundle;)V
    .locals 0
    .parameter "outState"

    .prologue
    .line 324
    invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchSaveInstanceState(Landroid/os/Bundle;)V

    .line 325
    return-void
.end method

.method public setCallback(Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;)V
    .locals 0
    .parameter "cb"

    .prologue
    .line 393
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;

    .line 394
    return-void
.end method

.method public setCurrentMenuInfo(Landroid/view/ContextMenu$ContextMenuInfo;)V
    .locals 0
    .parameter "menuInfo"

    .prologue
    .line 1272
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;

    .line 1273
    return-void
.end method

.method public setDefaultShowAsAction(I)Landroid/support/v7/internal/view/menu/MenuBuilder;
    .locals 0
    .parameter "defaultShowAsAction"

    .prologue
    .line 209
    iput p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mDefaultShowAsAction:I

    .line 210
    return-object p0
.end method

.method setExclusiveItemChecked(Landroid/view/MenuItem;)V
    .locals 5
    .parameter "item"

    .prologue
    .line 556
    invoke-interface {p1}, Landroid/view/MenuItem;->getGroupId()I

    move-result v2

    .line 558
    .local v2, group:I
    #v2=(Integer);
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 559
    .local v0, N:I
    #v0=(Integer);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v1=(Conflicted);v3=(Integer);v4=(Conflicted);
    if-ge v3, v0, :cond_3

    .line 560
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 561
    .local v1, curItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I

    move-result v4

    #v4=(Integer);
    if-ne v4, v2, :cond_0

    .line 562
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isExclusiveCheckable()Z

    move-result v4

    #v4=(Boolean);
    if-nez v4, :cond_1

    .line 559
    :cond_0
    :goto_1
    #v4=(Integer);
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 565
    :cond_1
    #v4=(Boolean);
    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isCheckable()Z

    move-result v4

    if-eqz v4, :cond_0

    .line 570
    if-ne v1, p1, :cond_2

    const/4 v4, 0x1

    :goto_2
    invoke-virtual {v1, v4}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setCheckedInt(Z)V

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_2

    .line 573
    .end local v1           #curItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_3
    #v1=(Conflicted);v4=(Conflicted);
    return-void
.end method

.method public setGroupCheckable(IZZ)V
    .locals 4
    .parameter "group"
    .parameter "checkable"
    .parameter "exclusive"

    .prologue
    .line 577
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 579
    .local v0, N:I
    #v0=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
    if-ge v1, v0, :cond_1

    .line 580
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 581
    .local v2, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I

    move-result v3

    #v3=(Integer);
    if-ne v3, p1, :cond_0

    .line 582
    invoke-virtual {v2, p3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setExclusiveCheckable(Z)V

    .line 583
    invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setCheckable(Z)Landroid/view/MenuItem;

    .line 579
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 586
    .end local v2           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_1
    #v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method public setGroupEnabled(IZ)V
    .locals 4
    .parameter "group"
    .parameter "enabled"

    .prologue
    .line 612
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 614
    .local v0, N:I
    #v0=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
    if-ge v1, v0, :cond_1

    .line 615
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v3=(Reference);
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 616
    .local v2, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I

    move-result v3

    #v3=(Integer);
    if-ne v3, p1, :cond_0

    .line 617
    invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setEnabled(Z)Landroid/view/MenuItem;

    .line 614
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 620
    .end local v2           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_1
    #v2=(Conflicted);v3=(Conflicted);
    return-void
.end method

.method public setGroupVisible(IZ)V
    .locals 5
    .parameter "group"
    .parameter "visible"

    .prologue
    .line 590
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 595
    .local v0, N:I
    #v0=(Integer);
    const/4 v1, 0x0

    .line 596
    .local v1, changedAtLeastOneItem:Z
    #v1=(Null);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v1=(Boolean);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
    if-ge v2, v0, :cond_1

    .line 597
    iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v4=(Reference);
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 598
    .local v3, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I

    move-result v4

    #v4=(Integer);
    if-ne v4, p1, :cond_0

    .line 599
    invoke-virtual {v3, p2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setVisibleInt(Z)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 600
    const/4 v1, 0x1

    .line 596
    :cond_0
    #v4=(Integer);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 605
    .end local v3           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    :cond_1
    #v3=(Conflicted);v4=(Conflicted);
    if-eqz v1, :cond_2

    .line 606
    const/4 v4, 0x1

    #v4=(One);
    invoke-virtual {p0, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 608
    :cond_2
    #v4=(Conflicted);
    return-void
.end method

.method protected setHeaderIconInt(I)Landroid/support/v7/internal/view/menu/MenuBuilder;
    .locals 6
    .parameter "iconRes"

    .prologue
    const/4 v2, 0x0

    .line 1227
    #v2=(Null);
    const/4 v1, 0x0

    #v1=(Null);
    move-object v0, p0

    #v0=(Reference);
    move v3, p1

    #v3=(Integer);
    move-object v4, v2

    #v4=(Null);
    move-object v5, v2

    #v5=(Null);
    invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 1228
    return-object p0
.end method

.method protected setHeaderIconInt(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/internal/view/menu/MenuBuilder;
    .locals 6
    .parameter "icon"

    .prologue
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    .line 1215
    #v1=(Null);
    move-object v0, p0

    #v0=(Reference);
    move v3, v1

    #v3=(Null);
    move-object v4, p1

    #v4=(Reference);
    move-object v5, v2

    #v5=(Null);
    invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 1216
    return-object p0
.end method

.method protected setHeaderTitleInt(I)Landroid/support/v7/internal/view/menu/MenuBuilder;
    .locals 6
    .parameter "titleRes"

    .prologue
    const/4 v2, 0x0

    .line 1203
    #v2=(Null);
    const/4 v3, 0x0

    #v3=(Null);
    move-object v0, p0

    #v0=(Reference);
    move v1, p1

    #v1=(Integer);
    move-object v4, v2

    #v4=(Null);
    move-object v5, v2

    #v5=(Null);
    invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 1204
    return-object p0
.end method

.method protected setHeaderTitleInt(Ljava/lang/CharSequence;)Landroid/support/v7/internal/view/menu/MenuBuilder;
    .locals 6
    .parameter "title"

    .prologue
    const/4 v4, 0x0

    #v4=(Null);
    const/4 v1, 0x0

    .line 1191
    #v1=(Null);
    move-object v0, p0

    #v0=(Reference);
    move-object v2, p1

    #v2=(Reference);
    move v3, v1

    #v3=(Null);
    move-object v5, v4

    #v5=(Null);
    invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 1192
    return-object p0
.end method

.method protected setHeaderViewInt(Landroid/view/View;)Landroid/support/v7/internal/view/menu/MenuBuilder;
    .locals 6
    .parameter "view"

    .prologue
    const/4 v2, 0x0

    #v2=(Null);
    const/4 v1, 0x0

    .line 1239
    #v1=(Null);
    move-object v0, p0

    #v0=(Reference);
    move v3, v1

    #v3=(Null);
    move-object v4, v2

    #v4=(Null);
    move-object v5, p1

    #v5=(Reference);
    invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 1240
    return-object p0
.end method

.method setOptionalIconsVisible(Z)V
    .locals 0
    .parameter "visible"

    .prologue
    .line 1276
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mOptionalIconsVisible:Z

    .line 1277
    return-void
.end method

.method public setQwertyMode(Z)V
    .locals 1
    .parameter "isQwerty"

    .prologue
    .line 707
    iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mQwertyMode:Z

    .line 709
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 710
    return-void
.end method

.method public setShortcutsVisible(Z)V
    .locals 1
    .parameter "shortcutsVisible"

    .prologue
    .line 747
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mShortcutsVisible:Z

    #v0=(Boolean);
    if-ne v0, p1, :cond_0

    .line 753
    :goto_0
    return-void

    .line 751
    :cond_0
    invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setShortcutsVisibleInner(Z)V

    .line 752
    const/4 v0, 0x0

    #v0=(Null);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    goto :goto_0
.end method

.method public size()I
    .locals 1

    .prologue
    .line 692
    iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;

    #v0=(Reference);
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public startDispatchingItemsChanged()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1018
    #v1=(Null);
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z

    .line 1020
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1021
    iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z

    .line 1022
    const/4 v0, 0x1

    #v0=(One);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V

    .line 1024
    :cond_0
    #v0=(Boolean);
    return-void
.end method

.method public stopDispatchingItemsChanged()V
    .locals 1

    .prologue
    .line 1011
    iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z

    #v0=(Boolean);
    if-nez v0, :cond_0

    .line 1012
    const/4 v0, 0x1

    #v0=(One);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z

    .line 1013
    const/4 v0, 0x0

    #v0=(Null);
    iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z

    .line 1015
    :cond_0
    #v0=(Boolean);
    return-void
.end method

*/}
