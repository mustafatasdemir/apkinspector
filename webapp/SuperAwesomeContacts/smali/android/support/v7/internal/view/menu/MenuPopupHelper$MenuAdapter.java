package android.support.v7.internal.view.menu; class MenuPopupHelper$MenuAdapter { void a() { int a;
a=0;// .class Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// .super Landroid/widget/BaseAdapter;
a=0;// .source "MenuPopupHelper.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "MenuAdapter"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAdapterMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;// .field private mExpandedIndex:I
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/view/menu/MenuPopupHelper;Landroid/support/v7/internal/view/menu/MenuBuilder;)V
a=0;//     .locals 1
a=0;//     .param p2, "menu"    # Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .prologue
a=0;//     .line 304
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V
a=0;// 
a=0;//     .line 302
a=0;//     #p0=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;);
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     iput v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     .line 305
a=0;//     iput-object p2, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mAdapterMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 306
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->findExpandedIndex()V
a=0;// 
a=0;//     .line 307
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mAdapterMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method findExpandedIndex()V
a=0;//     .locals 6
a=0;// 
a=0;//     .prologue
a=0;//     .line 347
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     invoke-static {v5}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->access$300(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getExpandedItem()Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 348
a=0;//     .local v1, "expandedItem":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 349
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     invoke-static {v5}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->access$300(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 350
a=0;//     .local v4, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     #v4=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-virtual {v4}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 351
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .local v2, "i":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Conflicted);
a=0;//     if-ge v2, v0, :cond_1
a=0;// 
a=0;//     .line 352
a=0;//     invoke-virtual {v4, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     .line 353
a=0;//     .local v3, "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     if-ne v3, v1, :cond_0
a=0;// 
a=0;//     .line 354
a=0;//     iput v2, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     .line 360
a=0;//     .end local v0    # "count":I
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .end local v4    # "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 351
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
a=0;//     .line 359
a=0;//     .end local v0    # "count":I
a=0;//     .end local v2    # "i":I
a=0;//     .end local v3    # "item":Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .end local v4    # "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     iput v5, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 310
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->access$100(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mAdapterMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 312
a=0;//     .local v0, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gez v1, :cond_1
a=0;// 
a=0;//     .line 313
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 315
a=0;//     :goto_1
a=0;//     return v1
a=0;// 
a=0;//     .line 310
a=0;//     .end local v0    # "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mAdapterMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getVisibleItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 315
a=0;//     .restart local v0    # "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :cond_1
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 319
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->access$100(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mAdapterMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getNonActionItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 321
a=0;//     .local v0, "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :goto_0
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mExpandedIndex:I
a=0;// 
a=0;//     if-lt p1, v1, :cond_0
a=0;// 
a=0;//     .line 322
a=0;//     add-int/lit8 p1, p1, 0x1
a=0;// 
a=0;//     .line 324
a=0;//     :cond_0
a=0;//     invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 319
a=0;//     .end local v0    # "items":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Landroid/support/v7/internal/view/menu/MenuItemImpl;>;"
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Boolean);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->mAdapterMenu:Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/view/menu/MenuBuilder;->getVisibleItems()Ljava/util/ArrayList;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 299
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;
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
a=0;//     .line 330
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
a=0;//     .line 334
a=0;//     #v3=(Null);
a=0;//     if-nez p2, :cond_0
a=0;// 
a=0;//     .line 335
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->access$200(Landroid/support/v7/internal/view/menu/MenuPopupHelper;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->ITEM_LAYOUT:I
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
a=0;//     .line 338
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     check-cast v0, Landroid/support/v7/internal/view/menu/MenuView$ItemView;
a=0;// 
a=0;//     .line 339
a=0;//     .local v0, "itemView":Landroid/support/v7/internal/view/menu/MenuView$ItemView;
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->this$0:Landroid/support/v7/internal/view/menu/MenuPopupHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuPopupHelper;);
a=0;//     iget-boolean v1, v1, Landroid/support/v7/internal/view/menu/MenuPopupHelper;->mForceShowIcon:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     move-object v1, p2
a=0;// 
a=0;//     .line 340
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     check-cast v1, Landroid/support/v7/internal/view/menu/ListMenuItemView;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v7/internal/view/menu/ListMenuItemView;->setForceShowIcon(Z)V
a=0;// 
a=0;//     .line 342
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->getItem(I)Landroid/support/v7/internal/view/menu/MenuItemImpl;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/MenuItemImpl;);
a=0;//     invoke-interface {v0, v1, v3}, Landroid/support/v7/internal/view/menu/MenuView$ItemView;->initialize(Landroid/support/v7/internal/view/menu/MenuItemImpl;I)V
a=0;// 
a=0;//     .line 343
a=0;//     return-object p2
a=0;// .end method
a=0;// 
a=0;// .method public notifyDataSetChanged()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 364
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/view/menu/MenuPopupHelper$MenuAdapter;->findExpandedIndex()V
a=0;// 
a=0;//     .line 365
a=0;//     invoke-super {p0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V
a=0;// 
a=0;//     .line 366
a=0;//     return-void
a=0;// .end method
}}
