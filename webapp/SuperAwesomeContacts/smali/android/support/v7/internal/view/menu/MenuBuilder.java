package android.support.v7.internal.view.menu; class MenuBuilder { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// .super Ljava/lang/Object;
a=0;// .source "MenuBuilder.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/internal/view/SupportMenu;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/view/menu/MenuBuilder$ItemInvoker;,
a=0;//         Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ACTION_VIEW_STATES_KEY:Ljava/lang/String; = "android:menu:actionviewstates"
a=0;// 
a=0;// .field private static final EXPANDED_ACTION_VIEW_ID:Ljava/lang/String; = "android:menu:expandedactionview"
a=0;// 
a=0;// .field private static final PRESENTER_KEY:Ljava/lang/String; = "android:menu:presenters"
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "MenuBuilder"
a=0;// 
a=0;// .field private static final sCategoryToOrder:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mActionItems:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;// 
a=0;// .field private final mContext:Landroid/content/Context;
a=0;// 
a=0;// .field private mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;// .field private mDefaultShowAsAction:I
a=0;// 
a=0;// .field private mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;// .field mHeaderIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field mHeaderTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field mHeaderView:Landroid/view/View;
a=0;// 
a=0;// .field private mIsActionItemsStale:Z
a=0;// 
a=0;// .field private mIsClosing:Z
a=0;// 
a=0;// .field private mIsVisibleItemsStale:Z
a=0;// 
a=0;// .field private mItems:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mItemsChangedWhileDispatchPrevented:Z
a=0;// 
a=0;// .field private mNonActionItems:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mOptionalIconsVisible:Z
a=0;// 
a=0;// .field private mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/concurrent/CopyOnWriteArrayList",
a=0;//             "<",
a=0;//             "Ljava/lang/ref/WeakReference",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuPresenter;",
a=0;//             ">;>;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mPreventDispatchingItemsChanged:Z
a=0;// 
a=0;// .field private mQwertyMode:Z
a=0;// 
a=0;// .field private final mResources:Landroid/content/res/Resources;
a=0;// 
a=0;// .field private mShortcutsVisible:Z
a=0;// 
a=0;// .field private mTempShortcutItemList:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// .field private mVisibleItems:Ljava/util/ArrayList;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 47
a=0;//     const/4 v0, 0x6
a=0;// 
a=0;//     #v0=(PosByte);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     fill-array-data v0, :array_0
a=0;// 
a=0;//     sput-object v0, Landroid/support/v7/internal/view/menu/MenuBuilder;->sCategoryToOrder:[I
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     #v0=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :array_0
a=0;//     .array-data 4
a=0;//         0x1
a=0;//         0x4
a=0;//         0x5
a=0;//         0x3
a=0;//         0x2
a=0;//         0x0
a=0;//     .end array-data
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 192
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 114
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mDefaultShowAsAction:I
a=0;// 
a=0;//     .line 142
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z
a=0;// 
a=0;//     .line 144
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z
a=0;// 
a=0;//     .line 146
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mOptionalIconsVisible:Z
a=0;// 
a=0;//     .line 148
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsClosing:Z
a=0;// 
a=0;//     .line 150
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mTempShortcutItemList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 152
a=0;//     new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     .line 193
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;
a=0;// 
a=0;//     .line 196
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 198
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 199
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z
a=0;// 
a=0;//     .line 201
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 202
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 203
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z
a=0;// 
a=0;//     .line 205
a=0;//     invoke-direct {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setShortcutsVisibleInner(Z)V
a=0;// 
a=0;//     .line 206
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;//     .locals 8
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "categoryOrder"    # I
a=0;//     .param p4, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 400
a=0;//     invoke-static {p3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getOrdering(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 402
a=0;//     .local v5, "ordering":I
a=0;//     #v5=(Integer);
a=0;//     new-instance v0, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     iget v7, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mDefaultShowAsAction:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     move-object v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     move v2, p1
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     move v3, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move v4, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     move-object v6, p4
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-direct/range {v0 .. v7}, Landroid/support/v7/internal/view/menu/MenuItemImpl;-><init>(Landroid/support/v7/internal/view/menu/MenuBuilder;IIIILjava/lang/CharSequence;I)V
a=0;// 
a=0;//     .line 405
a=0;//     .local v0, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 407
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setMenuInfo(Landroid/view/ContextMenu$ContextMenuInfo;)V
a=0;// 
a=0;//     .line 410
a=0;//     :cond_0
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-static {v2, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findInsertIndex(Ljava/util/ArrayList;I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, v0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V
a=0;// 
a=0;//     .line 411
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 413
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private dispatchPresenterUpdate(Z)V
a=0;//     .locals 4
a=0;//     .param p1, "cleared"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 255
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 245
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 246
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 247
a=0;//     .local v2, "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .line 248
a=0;//     .local v1, "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 251
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-interface {v1, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->updateMenuView(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 254
a=0;//     .end local v1    # "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     .end local v2    # "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private dispatchRestoreInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 7
a=0;//     .param p1, "state"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 301
a=0;//     const-string v6, "android:menu:presenters"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v6}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 303
a=0;//     .local v4, "presenterStates":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     #v4=(Reference,Landroid/util/SparseArray;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 321
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 307
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);v6=(Boolean);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 308
a=0;//     .local v5, "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     invoke-virtual {v5}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .line 309
a=0;//     .local v3, "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     if-nez v3, :cond_3
a=0;// 
a=0;//     .line 310
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v6, v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 312
a=0;//     :cond_3
a=0;//     #v6=(Boolean);
a=0;//     invoke-interface {v3}, Landroid/support/v7/internal/view/menu/MenuPresenter;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 313
a=0;//     .local v1, "id":I
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_2
a=0;// 
a=0;//     .line 314
a=0;//     invoke-virtual {v4, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/os/Parcelable;
a=0;// 
a=0;//     .line 315
a=0;//     .local v2, "parcel":Landroid/os/Parcelable;
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     .line 316
a=0;//     invoke-interface {v3, v2}, Landroid/support/v7/internal/view/menu/MenuPresenter;->onRestoreInstanceState(Landroid/os/Parcelable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private dispatchSaveInstanceState(Landroid/os/Bundle;)V
a=0;//     .locals 7
a=0;//     .param p1, "outState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 276
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_0
a=0;// 
a=0;//     .line 298
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 280
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Boolean);
a=0;//     new-instance v3, Landroid/util/SparseArray;
a=0;// 
a=0;//     #v3=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v3}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     .line 282
a=0;//     .local v3, "presenterStates":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     #v3=(Reference,Landroid/util/SparseArray;);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_3
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v4, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 283
a=0;//     .local v4, "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     invoke-virtual {v4}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .line 284
a=0;//     .local v2, "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     if-nez v2, :cond_2
a=0;// 
a=0;//     .line 285
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v6=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v6, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 287
a=0;//     :cond_2
a=0;//     #v6=(Boolean);
a=0;//     invoke-interface {v2}, Landroid/support/v7/internal/view/menu/MenuPresenter;->getId()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 288
a=0;//     .local v1, "id":I
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 289
a=0;//     invoke-interface {v2}, Landroid/support/v7/internal/view/menu/MenuPresenter;->onSaveInstanceState()Landroid/os/Parcelable;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 290
a=0;//     .local v5, "state":Landroid/os/Parcelable;
a=0;//     #v5=(Reference,Landroid/os/Parcelable;);
a=0;//     if-eqz v5, :cond_1
a=0;// 
a=0;//     .line 291
a=0;//     invoke-virtual {v3, v1, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 297
a=0;//     .end local v1    # "id":I
a=0;//     .end local v2    # "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     .end local v4    # "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     .end local v5    # "state":Landroid/os/Parcelable;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const-string v6, "android:menu:presenters"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v6, v3}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private dispatchSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z
a=0;//     .locals 5
a=0;//     .param p1, "subMenu"    # Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 259
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 272
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);
a=0;//     return v3
a=0;// 
a=0;//     .line 262
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 264
a=0;//     .local v3, "result":Z
a=0;//     #v3=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);v3=(Boolean);v4=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 265
a=0;//     .local v2, "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .line 266
a=0;//     .local v1, "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v4, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 268
a=0;//     :cond_3
a=0;//     #v4=(Boolean);
a=0;//     if-nez v3, :cond_2
a=0;// 
a=0;//     .line 269
a=0;//     invoke-interface {v1, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->onSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static findInsertIndex(Ljava/util/ArrayList;I)I
a=0;//     .locals 3
a=0;//     .param p1, "ordering"    # I
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;I)I"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 790
a=0;//     .local p0, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     invoke-virtual {p0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/lit8 v0, v2, -0x1
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 791
a=0;//     invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 792
a=0;//     .local v1, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getOrdering()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     if-gt v2, p1, :cond_0
a=0;// 
a=0;//     .line 793
a=0;//     add-int/lit8 v2, v0, 0x1
a=0;// 
a=0;//     .line 797
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 790
a=0;//     .restart local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 797
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static getOrdering(I)I
a=0;//     .locals 3
a=0;//     .param p0, "categoryOrder"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 723
a=0;//     const/high16 v1, -0x10000
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     and-int/2addr v1, p0
a=0;// 
a=0;//     shr-int/lit8 v0, v1, 0x10
a=0;// 
a=0;//     .line 725
a=0;//     .local v0, "index":I
a=0;//     #v0=(Short);
a=0;//     if-ltz v0, :cond_0
a=0;// 
a=0;//     sget-object v1, Landroid/support/v7/internal/view/menu/MenuBuilder;->sCategoryToOrder:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     array-length v1, v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lt v0, v1, :cond_1
a=0;// 
a=0;//     .line 726
a=0;//     :cond_0
a=0;//     new-instance v1, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     const-string v2, "order does not contain a valid category."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 729
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Uninit);
a=0;//     sget-object v1, Landroid/support/v7/internal/view/menu/MenuBuilder;->sCategoryToOrder:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     aget v1, v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     shl-int/lit8 v1, v1, 0x10
a=0;// 
a=0;//     const v2, 0xffff
a=0;// 
a=0;//     #v2=(Char);
a=0;//     and-int/2addr v2, p0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     or-int/2addr v1, v2
a=0;// 
a=0;//     return v1
a=0;// .end method
a=0;// 
a=0;// .method private removeItemAtInt(IZ)V
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;//     .param p2, "updateChildrenOnMenuViews"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 521
a=0;//     if-ltz p1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lt p1, v0, :cond_1
a=0;// 
a=0;//     .line 530
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 525
a=0;//     :cond_1
a=0;//     #v0=(Integer);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
a=0;// 
a=0;//     .line 527
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 528
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
a=0;//     .locals 3
a=0;//     .param p1, "titleRes"    # I
a=0;//     .param p2, "title"    # Ljava/lang/CharSequence;
a=0;//     .param p3, "iconRes"    # I
a=0;//     .param p4, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;//     .param p5, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1154
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1156
a=0;//     .local v0, "r":Landroid/content/res/Resources;
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     if-eqz p5, :cond_0
a=0;// 
a=0;//     .line 1157
a=0;//     iput-object p5, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderView:Landroid/view/View;
a=0;// 
a=0;//     .line 1160
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 1161
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 1180
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 1181
a=0;//     return-void
a=0;// 
a=0;//     .line 1163
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     if-lez p1, :cond_3
a=0;// 
a=0;//     .line 1164
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/CharSequence;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 1169
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     if-lez p3, :cond_4
a=0;// 
a=0;//     .line 1170
a=0;//     invoke-virtual {v0, p3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 1176
a=0;//     :cond_2
a=0;//     :goto_2
a=0;//     #v1=(Conflicted);
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderView:Landroid/view/View;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1165
a=0;//     :cond_3
a=0;//     #v1=(Uninit);
a=0;//     if-eqz p2, :cond_1
a=0;// 
a=0;//     .line 1166
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1171
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz p4, :cond_2
a=0;// 
a=0;//     .line 1172
a=0;//     iput-object p4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// .method private setShortcutsVisibleInner(Z)V
a=0;//     .locals 3
a=0;//     .param p1, "shortcutsVisible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 756
a=0;//     #v0=(One);
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iget v1, v1, Landroid/content/res/Configuration;->keyboard:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v1, v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/res/Resources;);
a=0;//     sget v2, Landroid/support/v7/appcompat/R$bool;->abc_config_showMenuShortcutsWhenKeyboardPresent:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mShortcutsVisible:Z
a=0;// 
a=0;//     .line 759
a=0;//     return-void
a=0;// 
a=0;//     .line 756
a=0;//     :cond_0
a=0;//     #v0=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public add(I)Landroid/view/MenuItem;
a=0;//     .locals 2
a=0;//     .param p1, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 423
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, v1, v1, v1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public add(IIII)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "categoryOrder"    # I
a=0;//     .param p4, "title"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 433
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "categoryOrder"    # I
a=0;//     .param p4, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 428
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public add(Ljava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 418
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, v0, v0, v0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addIntentOptions(IIILandroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I[Landroid/view/MenuItem;)I
a=0;//     .locals 13
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "categoryOrder"    # I
a=0;//     .param p4, "caller"    # Landroid/content/ComponentName;
a=0;//     .param p5, "specifics"    # [Landroid/content/Intent;
a=0;//     .param p6, "intent"    # Landroid/content/Intent;
a=0;//     .param p7, "flags"    # I
a=0;//     .param p8, "outSpecificItems"    # [Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 463
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v10=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v10}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 464
a=0;//     .local v7, "pm":Landroid/content/pm/PackageManager;
a=0;//     #v7=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     move-object/from16 v0, p4
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);
a=0;//     move-object/from16 v1, p5
a=0;// 
a=0;//     #v1=(Reference,[Landroid/content/Intent;);
a=0;//     move-object/from16 v2, p6
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     invoke-virtual {v7, v0, v1, v2, v10}, Landroid/content/pm/PackageManager;->queryIntentActivityOptions(Landroid/content/ComponentName;[Landroid/content/Intent;Landroid/content/Intent;I)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 466
a=0;//     .local v6, "lri":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/ResolveInfo;>;"
a=0;//     #v6=(Reference,Ljava/util/List;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-interface {v6}, Ljava/util/List;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 468
a=0;//     .local v3, "N":I
a=0;//     :goto_0
a=0;//     #v3=(Integer);
a=0;//     and-int/lit8 v10, p7, 0x1
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-nez v10, :cond_0
a=0;// 
a=0;//     .line 469
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeGroup(I)V
a=0;// 
a=0;//     .line 472
a=0;//     :cond_0
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .local v4, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v4=(Integer);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     if-ge v4, v3, :cond_4
a=0;// 
a=0;//     .line 473
a=0;//     invoke-interface {v6, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     .line 474
a=0;//     .local v8, "ri":Landroid/content/pm/ResolveInfo;
a=0;//     new-instance v9, Landroid/content/Intent;
a=0;// 
a=0;//     #v9=(UninitRef,Landroid/content/Intent;);
a=0;//     iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-gez v10, :cond_3
a=0;// 
a=0;//     move-object/from16 v10, p6
a=0;// 
a=0;//     :goto_2
a=0;//     #v10=(Reference,Landroid/content/Intent;);
a=0;//     invoke-direct {v9, v10}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 476
a=0;//     .local v9, "rintent":Landroid/content/Intent;
a=0;//     #v9=(Reference,Landroid/content/Intent;);
a=0;//     new-instance v10, Landroid/content/ComponentName;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/content/ComponentName;);
a=0;//     iget-object v11, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v11=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     iget-object v11, v11, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     iget-object v11, v11, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;
a=0;// 
a=0;//     iget-object v12, v8, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;
a=0;// 
a=0;//     #v12=(Reference,Landroid/content/pm/ActivityInfo;);
a=0;//     iget-object v12, v12, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v10, v11, v12}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/content/ComponentName;);
a=0;//     invoke-virtual {v9, v10}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
a=0;// 
a=0;//     .line 479
a=0;//     invoke-virtual {v8, v7}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     move/from16 v0, p3
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, p1, p2, v0, v10}, Landroid/support/v7/internal/view/menu/MenuBuilder;->add(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-virtual {v8, v7}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v11
a=0;// 
a=0;//     invoke-interface {v10, v11}, Landroid/view/MenuItem;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     invoke-interface {v10, v9}, Landroid/view/MenuItem;->setIntent(Landroid/content/Intent;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 482
a=0;//     .local v5, "item":Landroid/view/MenuItem;
a=0;//     #v5=(Reference,Landroid/view/MenuItem;);
a=0;//     if-eqz p8, :cond_1
a=0;// 
a=0;//     iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     if-ltz v10, :cond_1
a=0;// 
a=0;//     .line 483
a=0;//     iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I
a=0;// 
a=0;//     aput-object v5, p8, v10
a=0;// 
a=0;//     .line 472
a=0;//     :cond_1
a=0;//     #v10=(Conflicted);
a=0;//     add-int/lit8 v4, v4, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 466
a=0;//     .end local v3    # "N":I
a=0;//     .end local v4    # "i":I
a=0;//     .end local v5    # "item":Landroid/view/MenuItem;
a=0;//     .end local v8    # "ri":Landroid/content/pm/ResolveInfo;
a=0;//     .end local v9    # "rintent":Landroid/content/Intent;
a=0;//     :cond_2
a=0;//     #v0=(Reference,Landroid/content/ComponentName;);v3=(Uninit);v4=(Uninit);v5=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Null);v11=(Uninit);v12=(Uninit);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 474
a=0;//     .restart local v3    # "N":I
a=0;//     .restart local v4    # "i":I
a=0;//     .restart local v8    # "ri":Landroid/content/pm/ResolveInfo;
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);v3=(Integer);v4=(Integer);v5=(Conflicted);v8=(Reference,Landroid/content/pm/ResolveInfo;);v9=(UninitRef,Landroid/content/Intent;);v10=(Integer);v11=(Conflicted);v12=(Conflicted);
a=0;//     iget v10, v8, Landroid/content/pm/ResolveInfo;->specificIndex:I
a=0;// 
a=0;//     aget-object v10, p5, v10
a=0;// 
a=0;//     #v10=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 487
a=0;//     .end local v8    # "ri":Landroid/content/pm/ResolveInfo;
a=0;//     :cond_4
a=0;//     #v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);
a=0;//     return v3
a=0;// .end method
a=0;// 
a=0;// .method public addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;//     .locals 2
a=0;//     .param p1, "presenter"    # Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 220
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     new-instance v1, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/ref/WeakReference;);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     invoke-interface {p1, v0, p0}, Landroid/support/v7/internal/view/menu/MenuPresenter;->initForMenu(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     .line 222
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z
a=0;// 
a=0;//     .line 223
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(I)Landroid/view/SubMenu;
a=0;//     .locals 2
a=0;//     .param p1, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 443
a=0;//     #v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v1, v1, v1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(IIII)Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "categoryOrder"    # I
a=0;//     .param p4, "title"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 457
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     invoke-virtual {v0, p4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, p1, p2, p3, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;//     .locals 3
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "id"    # I
a=0;//     .param p3, "categoryOrder"    # I
a=0;//     .param p4, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 448
a=0;//     invoke-direct {p0, p1, p2, p3, p4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addInternal(IIILjava/lang/CharSequence;)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     check-cast v0, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 449
a=0;//     .local v0, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     new-instance v1, Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/view/menu/SubMenuBuilder;);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v1, v2, p0, v0}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
a=0;// 
a=0;//     .line 450
a=0;//     .local v1, "subMenu":Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/SubMenuBuilder;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setSubMenu(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V
a=0;// 
a=0;//     .line 452
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public addSubMenu(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;//     .locals 1
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 438
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0, v0, v0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addSubMenu(IIILjava/lang/CharSequence;)Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/SubMenu;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public changeMenuMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 784
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 785
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;// 
a=0;//     invoke-interface {v0, p0}, Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;->onMenuModeChange(Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;// 
a=0;//     .line 787
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clear()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 547
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 548
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;// 
a=0;//     .line 550
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 552
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 553
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clearAll()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 537
a=0;//     #v0=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z
a=0;// 
a=0;//     .line 538
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->clear()V
a=0;// 
a=0;//     .line 539
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->clearHeader()V
a=0;// 
a=0;//     .line 540
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z
a=0;// 
a=0;//     .line 541
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z
a=0;// 
a=0;//     .line 542
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 543
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public clearHeader()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1145
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 1146
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 1147
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderView:Landroid/view/View;
a=0;// 
a=0;//     .line 1149
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 1150
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public close()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 982
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V
a=0;// 
a=0;//     .line 983
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method final close(Z)V
a=0;//     .locals 4
a=0;//     .param p1, "allMenusAreClosing"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 964
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsClosing:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 978
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 968
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsClosing:Z
a=0;// 
a=0;//     .line 969
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 970
a=0;//     .local v2, "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .line 971
a=0;//     .local v1, "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 972
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 974
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-interface {v1, p0, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->onCloseMenu(Landroid/support/v7/internal/view/menu/MenuBuilder;Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 977
a=0;//     .end local v1    # "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     .end local v2    # "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsClosing:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 5
a=0;//     .param p1, "item"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1308
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     if-eq v4, p1, :cond_2
a=0;// 
a=0;//     .line 1309
a=0;//     :cond_0
a=0;//     #v4=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1328
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1312
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1314
a=0;//     .local v0, "collapsed":Z
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 1315
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :cond_3
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_5
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 1316
a=0;//     .local v3, "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .line 1317
a=0;//     .local v2, "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     if-nez v2, :cond_4
a=0;// 
a=0;//     .line 1318
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1319
a=0;//     :cond_4
a=0;//     #v4=(Boolean);
a=0;//     invoke-interface {v2, p0, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->collapseItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     .line 1323
a=0;//     .end local v2    # "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     .end local v3    # "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     :cond_5
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 1325
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 1326
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method dispatchMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
a=0;//     .locals 1
a=0;//     .param p1, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .param p2, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 777
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;->onMenuItemSelected(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/view/MenuItem;)Z
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
a=0;// .method public expandItemActionView(Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;//     .locals 5
a=0;//     .param p1, "item"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1284
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 1285
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1304
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 1288
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1290
a=0;//     .local v0, "expanded":Z
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->stopDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 1291
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .local v1, "i$":Ljava/util/Iterator;
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/util/Iterator;);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_4
a=0;// 
a=0;//     invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 1292
a=0;//     .local v3, "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     invoke-virtual {v3}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .line 1293
a=0;//     .local v2, "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     if-nez v2, :cond_3
a=0;// 
a=0;//     .line 1294
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1295
a=0;//     :cond_3
a=0;//     #v4=(Boolean);
a=0;//     invoke-interface {v2, p0, p1}, Landroid/support/v7/internal/view/menu/MenuPresenter;->expandItemActionView(Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 1299
a=0;//     .end local v2    # "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     .end local v3    # "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->startDispatchingItemsChanged()V
a=0;// 
a=0;//     .line 1301
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1302
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public findGroupIndex(I)I
a=0;//     .locals 1
a=0;//     .param p1, "group"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 669
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findGroupIndex(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public findGroupIndex(II)I
a=0;//     .locals 4
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "start"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 673
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 675
a=0;//     .local v2, "size":I
a=0;//     #v2=(Integer);
a=0;//     if-gez p2, :cond_0
a=0;// 
a=0;//     .line 676
a=0;//     const/4 p2, 0x0
a=0;// 
a=0;//     .line 679
a=0;//     :cond_0
a=0;//     move v0, p2
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 680
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 682
a=0;//     .local v1, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p1, :cond_1
a=0;// 
a=0;//     .line 687
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 679
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_1
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);v3=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 687
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public findItem(I)Landroid/view/MenuItem;
a=0;//     .locals 5
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 638
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 639
a=0;//     .local v3, "size":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v0, v3, :cond_2
a=0;// 
a=0;//     .line 640
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 641
a=0;//     .local v1, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getItemId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, p1, :cond_0
a=0;// 
a=0;//     .line 652
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :goto_1
a=0;//     #v4=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 643
a=0;//     .restart local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 644
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getSubMenu()Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/SubMenu;);
a=0;//     invoke-interface {v4, p1}, Landroid/view/SubMenu;->findItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 646
a=0;//     .local v2, "possibleItem":Landroid/view/MenuItem;
a=0;//     #v2=(Reference,Landroid/view/MenuItem;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     move-object v1, v2
a=0;// 
a=0;//     .line 647
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 639
a=0;//     .end local v2    # "possibleItem":Landroid/view/MenuItem;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v4=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 652
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public findItemIndex(I)I
a=0;//     .locals 4
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 656
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 658
a=0;//     .local v2, "size":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 659
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 660
a=0;//     .local v1, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getItemId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p1, :cond_0
a=0;// 
a=0;//     .line 665
a=0;//     .end local v0    # "i":I
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 658
a=0;//     .restart local v0    # "i":I
a=0;//     .restart local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);v3=(Integer);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 665
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method findItemWithShortcutForKey(ILandroid/view/KeyEvent;)Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .locals 12
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     .line 871
a=0;//     #v11=(Null);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mTempShortcutItemList:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 872
a=0;//     .local v2, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 873
a=0;//     invoke-virtual {p0, v2, p1, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemsWithShortcutForKey(Ljava/util/List;ILandroid/view/KeyEvent;)V
a=0;// 
a=0;//     .line 875
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Boolean);
a=0;//     if-eqz v9, :cond_1
a=0;// 
a=0;//     .line 906
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);v9=(Integer);v10=(Conflicted);
a=0;//     return-object v8
a=0;// 
a=0;//     .line 879
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Null);v9=(Boolean);v10=(Uninit);
a=0;//     invoke-virtual {p2}, Landroid/view/KeyEvent;->getMetaState()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 880
a=0;//     .local v3, "metaState":I
a=0;//     #v3=(Integer);
a=0;//     new-instance v4, Landroid/view/KeyCharacterMap$KeyData;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/view/KeyCharacterMap$KeyData;);
a=0;//     invoke-direct {v4}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V
a=0;// 
a=0;//     .line 882
a=0;//     .local v4, "possibleChars":Landroid/view/KeyCharacterMap$KeyData;
a=0;//     #v4=(Reference,Landroid/view/KeyCharacterMap$KeyData;);
a=0;//     invoke-virtual {p2, v4}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z
a=0;// 
a=0;//     .line 885
a=0;//     invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 886
a=0;//     .local v7, "size":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     if-ne v7, v9, :cond_2
a=0;// 
a=0;//     .line 887
a=0;//     invoke-virtual {v2, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v8, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 890
a=0;//     :cond_2
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->isQwertyMode()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 893
a=0;//     .local v5, "qwerty":Z
a=0;//     #v5=(Boolean);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v6=(Conflicted);v9=(Integer);v10=(Conflicted);
a=0;//     if-ge v0, v7, :cond_0
a=0;// 
a=0;//     .line 894
a=0;//     invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 895
a=0;//     .local v1, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     if-eqz v5, :cond_6
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getAlphabeticShortcut()C
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 897
a=0;//     .local v6, "shortcutChar":C
a=0;//     :goto_2
a=0;//     #v6=(Char);
a=0;//     iget-object v9, v4, Landroid/view/KeyCharacterMap$KeyData;->meta:[C
a=0;// 
a=0;//     #v9=(Reference,[C);
a=0;//     aget-char v9, v9, v11
a=0;// 
a=0;//     #v9=(Char);
a=0;//     if-ne v6, v9, :cond_3
a=0;// 
a=0;//     and-int/lit8 v9, v3, 0x2
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-eqz v9, :cond_5
a=0;// 
a=0;//     :cond_3
a=0;//     iget-object v9, v4, Landroid/view/KeyCharacterMap$KeyData;->meta:[C
a=0;// 
a=0;//     #v9=(Reference,[C);
a=0;//     const/4 v10, 0x2
a=0;// 
a=0;//     #v10=(PosByte);
a=0;//     aget-char v9, v9, v10
a=0;// 
a=0;//     #v9=(Char);
a=0;//     if-ne v6, v9, :cond_4
a=0;// 
a=0;//     and-int/lit8 v9, v3, 0x2
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-nez v9, :cond_5
a=0;// 
a=0;//     :cond_4
a=0;//     if-eqz v5, :cond_7
a=0;// 
a=0;//     const/16 v9, 0x8
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     if-ne v6, v9, :cond_7
a=0;// 
a=0;//     const/16 v9, 0x43
a=0;// 
a=0;//     if-ne p1, v9, :cond_7
a=0;// 
a=0;//     :cond_5
a=0;//     #v9=(Integer);v10=(Conflicted);
a=0;//     move-object v8, v1
a=0;// 
a=0;//     .line 903
a=0;//     #v8=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 895
a=0;//     .end local v6    # "shortcutChar":C
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);v8=(Null);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getNumericShortcut()C
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Char);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 893
a=0;//     .restart local v6    # "shortcutChar":C
a=0;//     :cond_7
a=0;//     #v10=(PosByte);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method findItemsWithShortcutForKey(Ljava/util/List;ILandroid/view/KeyEvent;)V
a=0;//     .locals 11
a=0;//     .param p2, "keyCode"    # I
a=0;//     .param p3, "event"    # Landroid/view/KeyEvent;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;I",
a=0;//             "Landroid/view/KeyEvent;",
a=0;//             ")V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .local p1, "items":Ljava/util/List;, "Ljava/util/List<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     const/16 v10, 0x43
a=0;// 
a=0;//     .line 825
a=0;//     #v10=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->isQwertyMode()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 826
a=0;//     .local v6, "qwerty":Z
a=0;//     #v6=(Boolean);
a=0;//     invoke-virtual {p3}, Landroid/view/KeyEvent;->getMetaState()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 827
a=0;//     .local v4, "metaState":I
a=0;//     #v4=(Integer);
a=0;//     new-instance v5, Landroid/view/KeyCharacterMap$KeyData;
a=0;// 
a=0;//     #v5=(UninitRef,Landroid/view/KeyCharacterMap$KeyData;);
a=0;//     invoke-direct {v5}, Landroid/view/KeyCharacterMap$KeyData;-><init>()V
a=0;// 
a=0;//     .line 829
a=0;//     .local v5, "possibleChars":Landroid/view/KeyCharacterMap$KeyData;
a=0;//     #v5=(Reference,Landroid/view/KeyCharacterMap$KeyData;);
a=0;//     invoke-virtual {p3, v5}, Landroid/view/KeyEvent;->getKeyData(Landroid/view/KeyCharacterMap$KeyData;)Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 831
a=0;//     .local v2, "isKeyCodeMapped":Z
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     if-eq p2, v10, :cond_1
a=0;// 
a=0;//     .line 855
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 836
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 837
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v1, v0, :cond_0
a=0;// 
a=0;//     .line 838
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 839
a=0;//     .local v3, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     .line 840
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getSubMenu()Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Landroid/view/SubMenu;);
a=0;//     check-cast v8, Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v8, p1, p2, p3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemsWithShortcutForKey(Ljava/util/List;ILandroid/view/KeyEvent;)V
a=0;// 
a=0;//     .line 843
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);
a=0;//     if-eqz v6, :cond_5
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getAlphabeticShortcut()C
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 845
a=0;//     .local v7, "shortcutChar":C
a=0;//     :goto_1
a=0;//     #v7=(Char);
a=0;//     and-int/lit8 v8, v4, 0x5
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-nez v8, :cond_4
a=0;// 
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     iget-object v8, v5, Landroid/view/KeyCharacterMap$KeyData;->meta:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     if-eq v7, v8, :cond_3
a=0;// 
a=0;//     iget-object v8, v5, Landroid/view/KeyCharacterMap$KeyData;->meta:[C
a=0;// 
a=0;//     #v8=(Reference,[C);
a=0;//     const/4 v9, 0x2
a=0;// 
a=0;//     #v9=(PosByte);
a=0;//     aget-char v8, v8, v9
a=0;// 
a=0;//     #v8=(Char);
a=0;//     if-eq v7, v8, :cond_3
a=0;// 
a=0;//     if-eqz v6, :cond_4
a=0;// 
a=0;//     const/16 v8, 0x8
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     if-ne v7, v8, :cond_4
a=0;// 
a=0;//     if-ne p2, v10, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     #v8=(Char);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isEnabled()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_4
a=0;// 
a=0;//     .line 852
a=0;//     invoke-interface {p1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 837
a=0;//     :cond_4
a=0;//     #v8=(Integer);v9=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 843
a=0;//     .end local v7    # "shortcutChar":C
a=0;//     :cond_5
a=0;//     #v7=(Conflicted);v8=(Conflicted);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getNumericShortcut()C
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Char);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public flagActionItems()V
a=0;//     .locals 10
a=0;// 
a=0;//     .prologue
a=0;//     .line 1096
a=0;//     iget-boolean v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-nez v8, :cond_0
a=0;// 
a=0;//     .line 1132
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1101
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v9=(Uninit);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1102
a=0;//     .local v0, "flagged":Z
a=0;//     #v0=(Null);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .local v2, "i$":Ljava/util/Iterator;
a=0;//     :goto_1
a=0;//     #v0=(Boolean);v2=(Reference,Ljava/util/Iterator;);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_2
a=0;// 
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v6, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 1103
a=0;//     .local v6, "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     invoke-virtual {v6}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v5, Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .line 1104
a=0;//     .local v5, "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 1105
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v8, v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1107
a=0;//     :cond_1
a=0;//     #v8=(Boolean);
a=0;//     invoke-interface {v5}, Landroid/support/v7/internal/view/menu/MenuPresenter;->flagActionItems()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     or-int/2addr v0, v8
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1111
a=0;//     .end local v5    # "presenter":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     .end local v6    # "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     :cond_2
a=0;//     #v5=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 1112
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1113
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1114
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getVisibleItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 1115
a=0;//     .local v7, "visibleItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     #v7=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v7}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 1116
a=0;//     .local v4, "itemsSize":I
a=0;//     #v4=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_2
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     if-ge v1, v4, :cond_5
a=0;// 
a=0;//     .line 1117
a=0;//     invoke-virtual {v7, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 1118
a=0;//     .local v3, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isActionButton()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 1119
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1116
a=0;//     :goto_3
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1121
a=0;//     :cond_3
a=0;//     #v8=(Boolean);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 1127
a=0;//     .end local v1    # "i":I
a=0;//     .end local v3    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .end local v4    # "itemsSize":I
a=0;//     .end local v7    # "visibleItems":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :cond_4
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Uninit);v7=(Uninit);v8=(Boolean);
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v8=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1128
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v8}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1129
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getVisibleItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     #v9=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v8, v9}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 1131
a=0;//     :cond_5
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     iput-boolean v8, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method getActionItems()Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1135
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->flagActionItems()V
a=0;// 
a=0;//     .line 1136
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method protected getActionViewStatesKey()Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 389
a=0;//     const-string v0, "android:menu:actionviewstates"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getContext()Landroid/content/Context;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 773
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getExpandedItem()Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1332
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mExpandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHeaderIcon()Landroid/graphics/drawable/Drawable;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1248
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderIcon:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHeaderTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1244
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getHeaderView()Landroid/view/View;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1252
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mHeaderView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Landroid/view/MenuItem;
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 697
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/view/MenuItem;
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getNonActionItems()Ljava/util/ArrayList;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1140
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->flagActionItems()V
a=0;// 
a=0;//     .line 1141
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mNonActionItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method getOptionalIconsVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1280
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mOptionalIconsVisible:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method getResources()Landroid/content/res/Resources;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 769
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mResources:Landroid/content/res/Resources;
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/res/Resources;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getRootMenu()Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1261
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method getVisibleItems()Ljava/util/ArrayList;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "()",
a=0;//             "Ljava/util/ArrayList",
a=0;//             "<",
a=0;//             "Landroid/support/v7/internal/view/menu/MenuItemImpl;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1049
a=0;//     iget-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_0
a=0;// 
a=0;//     .line 1050
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     .line 1068
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Reference,Ljava/util/ArrayList;);
a=0;//     return-object v3
a=0;// 
a=0;//     .line 1054
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->clear()V
a=0;// 
a=0;//     .line 1056
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1058
a=0;//     .local v2, "itemsSize":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_2
a=0;// 
a=0;//     .line 1059
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 1060
a=0;//     .local v1, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isVisible()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 1061
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 1058
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1065
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     iput-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z
a=0;// 
a=0;//     .line 1066
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     iput-boolean v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z
a=0;// 
a=0;//     .line 1068
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mVisibleItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public hasVisibleItems()Z
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 624
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 626
a=0;//     .local v2, "size":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v0, v2, :cond_1
a=0;// 
a=0;//     .line 627
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 628
a=0;//     .local v1, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isVisible()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 629
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     .line 633
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :goto_1
a=0;//     #v1=(Conflicted);
a=0;//     return v3
a=0;// 
a=0;//     .line 626
a=0;//     .restart local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_0
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 633
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method isQwertyMode()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 736
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mQwertyMode:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isShortcutKey(ILandroid/view/KeyEvent;)Z
a=0;//     .locals 1
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;// 
a=0;//     .prologue
a=0;//     .line 702
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemWithShortcutForKey(ILandroid/view/KeyEvent;)Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public isShortcutsVisible()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 765
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mShortcutsVisible:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method onItemActionRequestChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1044
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z
a=0;// 
a=0;//     .line 1045
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 1046
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method onItemVisibleChanged(Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
a=0;//     .locals 1
a=0;//     .param p1, "item"    # Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 1033
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z
a=0;// 
a=0;//     .line 1034
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 1035
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method onItemsChanged(Z)V
a=0;//     .locals 2
a=0;//     .param p1, "structureChanged"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 993
a=0;//     #v1=(One);
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 994
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 995
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsVisibleItemsStale:Z
a=0;// 
a=0;//     .line 996
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mIsActionItemsStale:Z
a=0;// 
a=0;//     .line 999
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchPresenterUpdate(Z)V
a=0;// 
a=0;//     .line 1003
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1001
a=0;//     :cond_1
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public performIdentifierAction(II)Z
a=0;//     .locals 1
a=0;//     .param p1, "id"    # I
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 912
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-virtual {p0, v0, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public performItemAction(Landroid/view/MenuItem;I)Z
a=0;//     .locals 8
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;//     .param p2, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     #v6=(Null);
a=0;//     const/4 v5, 0x1
a=0;// 
a=0;//     .line 916
a=0;//     #v5=(One);
a=0;//     move-object v1, p1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 918
a=0;//     .local v1, "itemImpl":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isEnabled()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Boolean);
a=0;//     if-nez v7, :cond_2
a=0;// 
a=0;//     :cond_0
a=0;//     #v7=(Conflicted);
a=0;//     move v0, v6
a=0;// 
a=0;//     .line 952
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v6=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     .line 922
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Null);v7=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->invoke()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 924
a=0;//     .local v0, "invoked":Z
a=0;//     #v0=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getSupportActionProvider()Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 925
a=0;//     .local v2, "provider":Landroid/support/v4/view/ActionProvider;
a=0;//     #v2=(Reference,Landroid/support/v4/view/ActionProvider;);
a=0;//     if-eqz v2, :cond_3
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/ActionProvider;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_3
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     .line 926
a=0;//     .local v3, "providerHasSubMenu":Z
a=0;//     :goto_1
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasCollapsibleActionView()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-eqz v7, :cond_4
a=0;// 
a=0;//     .line 927
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->expandActionView()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     or-int/2addr v0, v6
a=0;// 
a=0;//     .line 928
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 929
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v3    # "providerHasSubMenu":Z
a=0;//     :cond_3
a=0;//     #v3=(Uninit);v6=(Null);
a=0;//     move v3, v6
a=0;// 
a=0;//     .line 925
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 931
a=0;//     .restart local v3    # "providerHasSubMenu":Z
a=0;//     :cond_4
a=0;//     #v3=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     if-nez v7, :cond_5
a=0;// 
a=0;//     if-eqz v3, :cond_8
a=0;// 
a=0;//     .line 932
a=0;//     :cond_5
a=0;//     invoke-virtual {p0, v6}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V
a=0;// 
a=0;//     .line 934
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_6
a=0;// 
a=0;//     .line 935
a=0;//     new-instance v6, Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     #v6=(UninitRef,Landroid/support/v7/internal/view/menu/SubMenuBuilder;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v6, v7, p0, v1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;-><init>(Landroid/content/Context;Landroid/support/v7/internal/view/menu/MenuBuilder;Landroid/support/v7/internal/view/menu/MenuItemImpl;)V
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/view/menu/SubMenuBuilder;);
a=0;//     invoke-virtual {v1, v6}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setSubMenu(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)V
a=0;// 
a=0;//     .line 938
a=0;//     :cond_6
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getSubMenu()Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/SubMenu;);
a=0;//     check-cast v4, Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .line 939
a=0;//     .local v4, "subMenu":Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;//     if-eqz v3, :cond_7
a=0;// 
a=0;//     .line 940
a=0;//     invoke-virtual {v2, v4}, Landroid/support/v4/view/ActionProvider;->onPrepareSubMenu(Landroid/view/SubMenu;)V
a=0;// 
a=0;//     .line 942
a=0;//     :cond_7
a=0;//     invoke-direct {p0, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchSubMenuSelected(Landroid/support/v7/internal/view/menu/SubMenuBuilder;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     or-int/2addr v0, v6
a=0;// 
a=0;//     .line 943
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 944
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 947
a=0;//     .end local v4    # "subMenu":Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;//     :cond_8
a=0;//     #v4=(Uninit);v6=(Null);v7=(Boolean);
a=0;//     and-int/lit8 v6, p2, 0x1
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     if-nez v6, :cond_1
a=0;// 
a=0;//     .line 948
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public performShortcut(ILandroid/view/KeyEvent;I)Z
a=0;//     .locals 3
a=0;//     .param p1, "keyCode"    # I
a=0;//     .param p2, "event"    # Landroid/view/KeyEvent;
a=0;//     .param p3, "flags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 802
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemWithShortcutForKey(ILandroid/view/KeyEvent;)Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 804
a=0;//     .local v1, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 806
a=0;//     .local v0, "handled":Z
a=0;//     #v0=(Null);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 807
a=0;//     invoke-virtual {p0, v1, p3}, Landroid/support/v7/internal/view/menu/MenuBuilder;->performItemAction(Landroid/view/MenuItem;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 810
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     and-int/lit8 v2, p3, 0x2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 811
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {p0, v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->close(Z)V
a=0;// 
a=0;//     .line 814
a=0;//     :cond_1
a=0;//     #v2=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public removeGroup(I)V
a=0;//     .locals 5
a=0;//     .param p1, "group"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 497
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findGroupIndex(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 499
a=0;//     .local v0, "i":I
a=0;//     #v0=(Integer);
a=0;//     if-ltz v0, :cond_1
a=0;// 
a=0;//     .line 500
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v1, v4, v0
a=0;// 
a=0;//     .line 501
a=0;//     .local v1, "maxRemovable":I
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "numRemoved":I
a=0;//     #v2=(Null);
a=0;//     move v3, v2
a=0;// 
a=0;//     .line 502
a=0;//     .end local v2    # "numRemoved":I
a=0;//     .local v3, "numRemoved":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     add-int/lit8 v2, v3, 0x1
a=0;// 
a=0;//     .end local v3    # "numRemoved":I
a=0;//     .restart local v2    # "numRemoved":I
a=0;//     if-ge v3, v1, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, p1, :cond_0
a=0;// 
a=0;//     .line 504
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, v0, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeItemAtInt(IZ)V
a=0;// 
a=0;//     move v3, v2
a=0;// 
a=0;//     .end local v2    # "numRemoved":I
a=0;//     .restart local v3    # "numRemoved":I
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 508
a=0;//     .end local v3    # "numRemoved":I
a=0;//     .restart local v2    # "numRemoved":I
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 510
a=0;//     .end local v1    # "maxRemovable":I
a=0;//     .end local v2    # "numRemoved":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeItem(I)V
a=0;//     .locals 2
a=0;//     .param p1, "id"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 492
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItemIndex(I)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-direct {p0, v0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeItemAtInt(IZ)V
a=0;// 
a=0;//     .line 493
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeItemAt(I)V
a=0;//     .locals 1
a=0;//     .param p1, "index"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 533
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->removeItemAtInt(IZ)V
a=0;// 
a=0;//     .line 534
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public removeMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;//     .locals 4
a=0;//     .param p1, "presenter"    # Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 232
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .local v0, "i$":Ljava/util/Iterator;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/Iterator;);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/ref/WeakReference;
a=0;// 
a=0;//     .line 233
a=0;//     .local v2, "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     invoke-virtual {v2}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;// 
a=0;//     .line 234
a=0;//     .local v1, "item":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     if-ne v1, p1, :cond_0
a=0;// 
a=0;//     .line 235
a=0;//     :cond_1
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPresenters:Ljava/util/concurrent/CopyOnWriteArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/concurrent/CopyOnWriteArrayList;);
a=0;//     invoke-virtual {v3, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 238
a=0;//     .end local v1    # "item":Landroid/support/v7/internal/view/menu/MenuPresenter;
a=0;//     .end local v2    # "ref":Ljava/lang/ref/WeakReference;, "Ljava/lang/ref/WeakReference<Landroid/support/v7/internal/view/menu/MenuPresenter;>;"
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public restoreActionViewStates(Landroid/os/Bundle;)V
a=0;//     .locals 10
a=0;//     .param p1, "states"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 359
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 386
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 363
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getActionViewStatesKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v8
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v8}, Landroid/os/Bundle;->getSparseParcelableArray(Ljava/lang/String;)Landroid/util/SparseArray;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 366
a=0;//     .local v7, "viewStates":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     #v7=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 367
a=0;//     .local v3, "itemCount":I
a=0;//     #v3=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);v2=(Conflicted);v5=(Conflicted);v6=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     if-ge v1, v3, :cond_4
a=0;// 
a=0;//     .line 368
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 369
a=0;//     .local v2, "item":Landroid/view/MenuItem;
a=0;//     #v2=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-static {v2}, Landroid/support/v4/view/MenuItemCompat;->getActionView(Landroid/view/MenuItem;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 370
a=0;//     .local v6, "v":Landroid/view/View;
a=0;//     #v6=(Reference,Landroid/view/View;);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     const/4 v9, -0x1
a=0;// 
a=0;//     #v9=(Byte);
a=0;//     if-eq v8, v9, :cond_2
a=0;// 
a=0;//     .line 371
a=0;//     invoke-virtual {v6, v7}, Landroid/view/View;->restoreHierarchyState(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 373
a=0;//     :cond_2
a=0;//     #v8=(Conflicted);v9=(Conflicted);
a=0;//     invoke-interface {v2}, Landroid/view/MenuItem;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     if-eqz v8, :cond_3
a=0;// 
a=0;//     .line 374
a=0;//     invoke-interface {v2}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/SubMenu;);
a=0;//     check-cast v5, Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .line 375
a=0;//     .local v5, "subMenu":Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;//     invoke-virtual {v5, p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->restoreActionViewStates(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 367
a=0;//     .end local v5    # "subMenu":Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;//     :cond_3
a=0;//     #v5=(Conflicted);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 379
a=0;//     .end local v2    # "item":Landroid/view/MenuItem;
a=0;//     .end local v6    # "v":Landroid/view/View;
a=0;//     :cond_4
a=0;//     #v2=(Conflicted);v6=(Conflicted);v8=(Conflicted);
a=0;//     const-string v8, "android:menu:expandedactionview"
a=0;// 
a=0;//     #v8=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 380
a=0;//     .local v0, "expandedId":I
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 381
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->findItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 382
a=0;//     .local v4, "itemToExpand":Landroid/view/MenuItem;
a=0;//     #v4=(Reference,Landroid/view/MenuItem;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 383
a=0;//     invoke-static {v4}, Landroid/support/v4/view/MenuItemCompat;->expandActionView(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public restorePresenterStates(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "state"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 328
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchRestoreInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 329
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public saveActionViewStates(Landroid/os/Bundle;)V
a=0;//     .locals 8
a=0;//     .param p1, "outStates"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 332
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 334
a=0;//     .local v5, "viewStates":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 335
a=0;//     .local v2, "itemCount":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .local v0, "i":I
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Reference,Landroid/util/SparseArray;);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v0, v2, :cond_3
a=0;// 
a=0;//     .line 336
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getItem(I)Landroid/view/MenuItem;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 337
a=0;//     .local v1, "item":Landroid/view/MenuItem;
a=0;//     #v1=(Reference,Landroid/view/MenuItem;);
a=0;//     invoke-static {v1}, Landroid/support/v4/view/MenuItemCompat;->getActionView(Landroid/view/MenuItem;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 338
a=0;//     .local v4, "v":Landroid/view/View;
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getId()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     const/4 v7, -0x1
a=0;// 
a=0;//     #v7=(Byte);
a=0;//     if-eq v6, v7, :cond_1
a=0;// 
a=0;//     .line 339
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 340
a=0;//     new-instance v5, Landroid/util/SparseArray;
a=0;// 
a=0;//     .end local v5    # "viewStates":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     #v5=(UninitRef,Landroid/util/SparseArray;);
a=0;//     invoke-direct {v5}, Landroid/util/SparseArray;-><init>()V
a=0;// 
a=0;//     .line 342
a=0;//     .restart local v5    # "viewStates":Landroid/util/SparseArray;, "Landroid/util/SparseArray<Landroid/os/Parcelable;>;"
a=0;//     :cond_0
a=0;//     #v5=(Reference,Landroid/util/SparseArray;);
a=0;//     invoke-virtual {v4, v5}, Landroid/view/View;->saveHierarchyState(Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 343
a=0;//     invoke-static {v1}, Landroid/support/v4/view/MenuItemCompat;->isActionViewExpanded(Landroid/view/MenuItem;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_1
a=0;// 
a=0;//     .line 344
a=0;//     const-string v6, "android:menu:expandedactionview"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->getItemId()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {p1, v6, v7}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 347
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->hasSubMenu()Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 348
a=0;//     invoke-interface {v1}, Landroid/view/MenuItem;->getSubMenu()Landroid/view/SubMenu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/SubMenu;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;// 
a=0;//     .line 349
a=0;//     .local v3, "subMenu":Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;//     invoke-virtual {v3, p1}, Landroid/support/v7/internal/view/menu/SubMenuBuilder;->saveActionViewStates(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 335
a=0;//     .end local v3    # "subMenu":Landroid/support/v7/internal/view/menu/SubMenuBuilder;
a=0;//     :cond_2
a=0;//     #v3=(Conflicted);
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 353
a=0;//     .end local v1    # "item":Landroid/view/MenuItem;
a=0;//     .end local v4    # "v":Landroid/view/View;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);v6=(Conflicted);
a=0;//     if-eqz v5, :cond_4
a=0;// 
a=0;//     .line 354
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getActionViewStatesKey()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p1, v6, v5}, Landroid/os/Bundle;->putSparseParcelableArray(Ljava/lang/String;Landroid/util/SparseArray;)V
a=0;// 
a=0;//     .line 356
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public savePresenterStates(Landroid/os/Bundle;)V
a=0;//     .locals 0
a=0;//     .param p1, "outState"    # Landroid/os/Bundle;
a=0;// 
a=0;//     .prologue
a=0;//     .line 324
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->dispatchSaveInstanceState(Landroid/os/Bundle;)V
a=0;// 
a=0;//     .line 325
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCallback(Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;)V
a=0;//     .locals 0
a=0;//     .param p1, "cb"    # Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 393
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCallback:Landroid/support/v7/internal/view/menu/MenuBuilder$Callback;
a=0;// 
a=0;//     .line 394
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCurrentMenuInfo(Landroid/view/ContextMenu$ContextMenuInfo;)V
a=0;//     .locals 0
a=0;//     .param p1, "menuInfo"    # Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1272
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mCurrentMenuInfo:Landroid/view/ContextMenu$ContextMenuInfo;
a=0;// 
a=0;//     .line 1273
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDefaultShowAsAction(I)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 0
a=0;//     .param p1, "defaultShowAsAction"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 209
a=0;//     iput p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mDefaultShowAsAction:I
a=0;// 
a=0;//     .line 210
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method setExclusiveItemChecked(Landroid/view/MenuItem;)V
a=0;//     .locals 5
a=0;//     .param p1, "item"    # Landroid/view/MenuItem;
a=0;// 
a=0;//     .prologue
a=0;//     .line 556
a=0;//     invoke-interface {p1}, Landroid/view/MenuItem;->getGroupId()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 558
a=0;//     .local v2, "group":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 559
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);v4=(Conflicted);
a=0;//     if-ge v3, v0, :cond_3
a=0;// 
a=0;//     .line 560
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 561
a=0;//     .local v1, "curItem":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, v2, :cond_0
a=0;// 
a=0;//     .line 562
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isExclusiveCheckable()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     .line 559
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 565
a=0;//     :cond_1
a=0;//     #v4=(Boolean);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->isCheckable()Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 570
a=0;//     if-ne v1, p1, :cond_2
a=0;// 
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v1, v4}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setCheckedInt(Z)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :cond_2
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 573
a=0;//     .end local v1    # "curItem":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGroupCheckable(IZZ)V
a=0;//     .locals 4
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "checkable"    # Z
a=0;//     .param p3, "exclusive"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 577
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 579
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 580
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 581
a=0;//     .local v2, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p1, :cond_0
a=0;// 
a=0;//     .line 582
a=0;//     invoke-virtual {v2, p3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setExclusiveCheckable(Z)V
a=0;// 
a=0;//     .line 583
a=0;//     invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setCheckable(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 579
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 586
a=0;//     .end local v2    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGroupEnabled(IZ)V
a=0;//     .locals 4
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "enabled"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 612
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 614
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .local v1, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v2=(Conflicted);v3=(Conflicted);
a=0;//     if-ge v1, v0, :cond_1
a=0;// 
a=0;//     .line 615
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v3, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 616
a=0;//     .local v2, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-ne v3, p1, :cond_0
a=0;// 
a=0;//     .line 617
a=0;//     invoke-virtual {v2, p2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setEnabled(Z)Landroid/view/MenuItem;
a=0;// 
a=0;//     .line 614
a=0;//     :cond_0
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 620
a=0;//     .end local v2    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setGroupVisible(IZ)V
a=0;//     .locals 5
a=0;//     .param p1, "group"    # I
a=0;//     .param p2, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 590
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 595
a=0;//     .local v0, "N":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 596
a=0;//     .local v1, "changedAtLeastOneItem":Z
a=0;//     #v1=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v1=(Boolean);v2=(Integer);v3=(Conflicted);v4=(Conflicted);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     .line 597
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 598
a=0;//     .local v3, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->getGroupId()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-ne v4, p1, :cond_0
a=0;// 
a=0;//     .line 599
a=0;//     invoke-virtual {v3, p2}, Landroid/support/v7/internal/view/menu/MenuItemImpl;->setVisibleInt(Z)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 600
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     .line 596
a=0;//     :cond_0
a=0;//     #v4=(Integer);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 605
a=0;//     .end local v3    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     :cond_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 606
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 608
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected setHeaderIconInt(I)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 6
a=0;//     .param p1, "iconRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1227
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     move v3, p1
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1228
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected setHeaderIconInt(Landroid/graphics/drawable/Drawable;)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 6
a=0;//     .param p1, "icon"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1215
a=0;//     #v1=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, p1
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     move-object v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1216
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected setHeaderTitleInt(I)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 6
a=0;//     .param p1, "titleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1203
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     move v1, p1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, v2
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1204
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected setHeaderTitleInt(Ljava/lang/CharSequence;)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 6
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1191
a=0;//     #v1=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     move-object v2, p1
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/CharSequence;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v5, v4
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1192
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method protected setHeaderViewInt(Landroid/view/View;)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 6
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1239
a=0;//     #v1=(Null);
a=0;//     move-object v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     move v3, v1
a=0;// 
a=0;//     #v3=(Null);
a=0;//     move-object v4, v2
a=0;// 
a=0;//     #v4=(Null);
a=0;//     move-object v5, p1
a=0;// 
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-direct/range {v0 .. v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setHeaderInternal(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V
a=0;// 
a=0;//     .line 1240
a=0;//     return-object p0
a=0;// .end method
a=0;// 
a=0;// .method setOptionalIconsVisible(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "visible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 1276
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mOptionalIconsVisible:Z
a=0;// 
a=0;//     .line 1277
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setQwertyMode(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "isQwerty"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 707
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mQwertyMode:Z
a=0;// 
a=0;//     .line 709
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 710
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setShortcutsVisible(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "shortcutsVisible"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 747
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mShortcutsVisible:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-ne v0, p1, :cond_0
a=0;// 
a=0;//     .line 753
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 751
a=0;//     :cond_0
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->setShortcutsVisibleInner(Z)V
a=0;// 
a=0;//     .line 752
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public size()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 692
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItems:Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public startDispatchingItemsChanged()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1018
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z
a=0;// 
a=0;//     .line 1020
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1021
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z
a=0;// 
a=0;//     .line 1022
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/view/menu/MenuBuilder;->onItemsChanged(Z)V
a=0;// 
a=0;//     .line 1024
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public stopDispatchingItemsChanged()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1011
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1012
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mPreventDispatchingItemsChanged:Z
a=0;// 
a=0;//     .line 1013
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/view/menu/MenuBuilder;->mItemsChangedWhileDispatchPrevented:Z
a=0;// 
a=0;//     .line 1015
a=0;//     :cond_0
a=0;//     #v0=(Boolean);
a=0;//     return-void
a=0;// .end method
}}
