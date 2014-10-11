package android.support.v7.internal.view.menu; class ListMenuPresenter$MenuAdapter { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "ListMenuPresenter.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "MenuAdapter"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mExpandedIndex:I
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/view/menu/ListMenuPresenter;)V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 234
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 232
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     .line 235
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->findExpandedIndex()V
a=0;// 
a=0;//     .line 236
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method findExpandedIndex()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     iget-object v5, v5, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getExpandedItem()Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 274
a=0;//     .local v1, "expandedItem":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     iget-object v5, v5, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 276
a=0;//     .local v4, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 277
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     .line 278
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 279
a=0;//     .local v3, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     if-ne v3, v1, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     iput v2, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     .line 286
a=0;//     .end local v0    # "count":I
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .end local v4    # "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 277
a=0;//     .restart local v0    # "count":I
a=0;//     .restart local v2    # "i":I
a=0;//     .restart local v3    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .restart local v4    # "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :cond_0
a=0;//     #v0=(Integer);v2=(Integer);v3=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);v4=(Reference,Ljava/util/ArrayList;);v5=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     add-int/lit8 v2, v2, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 285
a=0;//     .end local v0    # "count":I
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .end local v4    # "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     iput v5, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 239
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     iget-object v2, v2, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 240
a=0;//     .local v1, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->access$000(Landroid/support/v7/internal/view/menu/ListMenuPresenter;)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int v0, v2, v3
a=0;// 
a=0;//     .line 241
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     iget v2, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     if-gez v2, :cond_0
a=0;// 
a=0;//     .line 244
a=0;//     .end local v0    # "count":I
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     .restart local v0    # "count":I
a=0;//     :cond_0
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 248
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     iget-object v1, v1, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 249
a=0;//     .local v0, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->access$000(Landroid/support/v7/internal/view/menu/ListMenuPresenter;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/2addr p1, v1
a=0;// 
a=0;//     .line 250
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     if-lt p1, v1, :cond_0
a=0;// 
a=0;//     .line 251
a=0;//     add-int/lit8 p1, p1, 0x1
a=0;// 
a=0;//     .line 253
a=0;//     :cond_0
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     return-object v1
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 231
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 259
a=0;//     int-to-long v0, p1
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 263
a=0;//     #v3=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 264
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     iget-object v1, v1, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mInflater:Landroid/view/LayoutInflater;
a=0;// 
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/ListMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ListMenuPresenter;);
a=0;//     iget v2, v2, Landroid/support/v7/internal/view/menu/ListMenuPresenter;->mItemLayoutRes:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2, p3, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object p2
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     move-object v0, p2
a=0;// 
a=0;//     .line 267
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/view/menu/MenuView$ItemView;
a=0;// 
a=0;//     .line 268
a=0;//     .local v0, "itemView":Landroid/support/v7/internal/view/menu/MenuView$ItemView;
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-interface {v0, v1, v3}, Landroid/support/v7/internal/view/menu/MenuView$ItemView;->initialize(Landroid/support/v7/internal/view/menu/MenuItemImpl;I)V
a=0;// 
a=0;//     .line 269
a=0;//     return-object p2
a=0;// .end method
a=0;// 
a=0;// .method public notifyDataSetChanged()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/ListMenuPresenter$MenuAdapter;->findExpandedIndex()V
a=0;// 
a=0;//     .line 291
a=0;//     invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 292
a=0;//     return-void
a=0;// .end method
}}
