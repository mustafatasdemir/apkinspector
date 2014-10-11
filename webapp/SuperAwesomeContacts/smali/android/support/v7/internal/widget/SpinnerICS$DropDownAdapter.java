package android.support.v7.internal.widget; class SpinnerICS$DropDownAdapter { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
a=0;// .super Ljava/lang/Object;
a=0;// .source "SpinnerICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/ListAdapter;
a=0;// .implements Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "DropDownAdapter"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;// .field private mListAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/widget/SpinnerAdapter;)V
a=0;//     .locals 1
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 535
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 536
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;);
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .line 537
a=0;//     instance-of v0, p1, Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 538
a=0;//     check-cast p1, Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .end local p1    # "adapter":Landroid/widget/SpinnerAdapter;
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mListAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 540
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public areAllItemsEnabled()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 584
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mListAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 585
a=0;//     .local v0, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 586
a=0;//     invoke-interface {v0}, Landroid/widget/ListAdapter;->areAllItemsEnabled()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 588
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 543
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 559
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1, p2, p3}, Landroid/widget/SpinnerAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItem(I)Ljava/lang/Object;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 547
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->getItem(I)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItemId(I)J
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 551
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const-wide/16 v0, -0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     return-wide v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);v1=(Uninit);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->getItemId(I)J
a=0;// 
a=0;//     move-result-wide v0
a=0;// 
a=0;//     #v0=(LongLo);v1=(LongHi);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getItemViewType(I)I
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 606
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;//     .locals 1
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "convertView"    # Landroid/view/View;
a=0;//     .param p3, "parent"    # Landroid/view/ViewGroup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 555
a=0;//     invoke-virtual {p0, p1, p2, p3}, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->getDropDownView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getViewTypeCount()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 610
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public hasStableIds()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 564
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/SpinnerAdapter;->hasStableIds()Z
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
a=0;// .method public isEmpty()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 614
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
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
a=0;// .method public isEnabled(I)Z
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 597
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mListAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 598
a=0;//     .local v0, "adapter":Landroid/widget/ListAdapter;
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 599
a=0;//     invoke-interface {v0, p1}, Landroid/widget/ListAdapter;->isEnabled(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 601
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     return v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;//     .locals 1
a=0;//     .param p1, "observer"    # Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .prologue
a=0;//     .line 568
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 569
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->registerDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 571
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;//     .locals 1
a=0;//     .param p1, "observer"    # Landroid/database/DataSetObserver;
a=0;// 
a=0;//     .prologue
a=0;//     .line 574
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 575
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v0, p1}, Landroid/widget/SpinnerAdapter;->unregisterDataSetObserver(Landroid/database/DataSetObserver;)V
a=0;// 
a=0;//     .line 577
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
