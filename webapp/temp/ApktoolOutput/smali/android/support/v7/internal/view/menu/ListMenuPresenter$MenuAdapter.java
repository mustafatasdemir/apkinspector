package android.support.v7.internal.view.menu; class ListMenuPresenter$MenuAdapter {/*

.class Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;
.super Landroid/widget/BaseAdapter;
.source "ListMenuPresenter.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/view/menu/ListMenuPresenter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "MenuAdapter"
.end annotation


# instance fields
.field private mExpandedIndex:I

.field final synthetic this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/view/menu/ListMenuPresenter;)V
    .locals 1
    .parameter

    .prologue
    .line 234
    iput-object p1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 232
    #p0=(Reference);
    const/4 v0, -0x1

    #v0=(Byte);
    iput v0, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I

    .line 235
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->findExpandedIndex()V

    .line 236
    return-void
.end method


# virtual methods
.method findExpandedIndex()V
    .locals 6

    .prologue
    .line 273
    iget-object v5, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    #v5=(Reference);
    iget-object v5, v5, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getExpandedItem()Landroid/support/v7/internal/view/menu/MenuItemImpl;

    move-result-object v1

    .line 274
    .local v1, expandedItem:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 275
    iget-object v5, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    iget-object v5, v5, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v4

    .line 276
    .local v4, items:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    #v4=(Reference);
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 277
    .local v0, count:I
    #v0=(Integer);
    const/4 v2, 0x0

    .local v2, i:I
    :goto_0
    #v2=(Integer);v3=(Conflicted);
    if-ge v2, v0, :cond_1

    .line 278
    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    .line 279
    .local v3, item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    if-ne v3, v1, :cond_0

    .line 280
    iput v2, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I

    .line 286
    .end local v0           #count:I
    .end local v2           #i:I
    .end local v3           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .end local v4           #items:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    :goto_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
    return-void

    .line 277
    .restart local v0       #count:I
    .restart local v2       #i:I
    .restart local v3       #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .restart local v4       #items:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    :cond_0
    #v0=(Integer);v2=(Integer);v3=(Reference);v4=(Reference);v5=(Reference);
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 285
    .end local v0           #count:I
    .end local v2           #i:I
    .end local v3           #item:Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .end local v4           #items:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    :cond_1
    #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    const/4 v5, -0x1

    #v5=(Byte);
    iput v5, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I

    goto :goto_1
.end method

.method public getCount()I
    .locals 4

    .prologue
    .line 239
    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    #v2=(Reference);
    iget-object v2, v2, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v1

    .line 240
    .local v1, items:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    #v1=(Reference);
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    #v2=(Integer);
    iget-object v3, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->access$000(Landroid/support/v7/internal/view/menu/ListMenuPresenter;)I

    move-result v3

    #v3=(Integer);
    sub-int v0, v2, v3

    .line 241
    .local v0, count:I
    #v0=(Integer);
    iget v2, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I

    if-gez v2, :cond_0

    .line 244
    .end local v0           #count:I
    :goto_0
    return v0

    .restart local v0       #count:I
    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;
    .locals 2
    .parameter "position"

    .prologue
    .line 248
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    #v1=(Reference);
    iget-object v1, v1, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;

    invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;

    move-result-object v0

    .line 249
    .local v0, items:Ljava/util/ArrayList;,"Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    invoke-static {v1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->access$000(Landroid/support/v7/internal/view/menu/ListMenuPresenter;)I

    move-result v1

    #v1=(Integer);
    add-int/2addr p1, v1

    .line 250
    iget v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I

    if-ltz v1, :cond_0

    iget v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I

    if-lt p1, v1, :cond_0

    .line 251
    add-int/lit8 p1, p1, 0x1

    .line 253
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;

    return-object v1
.end method

.method public bridge synthetic getItem(I)Ljava/lang/Object;
    .locals 1
    .parameter "x0"

    .prologue
    .line 231
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;

    move-result-object v0

    #v0=(Reference);
    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .parameter "position"

    .prologue
    .line 259
    int-to-long v0, p1

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 4
    .parameter "position"
    .parameter "convertView"
    .parameter "parent"

    .prologue
    const/4 v3, 0x0

    .line 263
    #v3=(Null);
    if-nez p2, :cond_0

    .line 264
    iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    #v1=(Reference);
    iget-object v1, v1, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mInflater:Landroid/view/LayoutInflater;

    iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;

    #v2=(Reference);
    iget v2, v2, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mItemLayoutRes:I

    #v2=(Integer);
    invoke-virtual {v1, v2, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    :cond_0
    #v1=(Conflicted);v2=(Conflicted);
    move-object v0, p2

    .line 267
    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/view/menu/MenuView$ItemView;

    .line 268
    .local v0, itemView:Landroid/support/v7/internal/view/menu/MenuView$ItemView;
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;

    move-result-object v1

    #v1=(Reference);
    invoke-interface {v0, v1, v3}, Landroid/support/v7/internal/view/menu/MenuView$ItemView;->initialize(Landroid/support/v7/internal/view/menu/MenuItemImpl;I)V

    .line 269
    return-object p2
.end method

.method public notifyDataSetChanged()V
    .locals 0

    .prologue
    .line 290
    invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->findExpandedIndex()V

    .line 291
    invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 292
    return-void
.end method

*/}
