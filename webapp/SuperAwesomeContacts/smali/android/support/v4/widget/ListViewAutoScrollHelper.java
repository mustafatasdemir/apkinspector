package android.support.v4.widget; class ListViewAutoScrollHelper { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/ListViewAutoScrollHelper;
a=0;// .super Landroid/support/v4/widget/AutoScrollHelper;
a=0;// .source "ListViewAutoScrollHelper.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mTarget:Landroid/widget/ListView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/widget/ListView;)V
a=0;//     .locals 0
a=0;//     .param p1, "target"    # Landroid/widget/ListView;
a=0;// 
a=0;//     .prologue
a=0;//     .line 30
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/AutoScrollHelper;-><init>(Landroid/view/View;)V
a=0;// 
a=0;//     .line 32
a=0;//     #p0=(Reference,Landroid/support/v4/widget/ListViewAutoScrollHelper;);
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/ListViewAutoScrollHelper;->mTarget:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 33
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public canTargetScrollHorizontally(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "direction"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public canTargetScrollVertically(I)Z
a=0;//     .locals 10
a=0;//     .param p1, "direction"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 60
a=0;//     #v7=(Null);
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/ListViewAutoScrollHelper;->mTarget:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 61
a=0;//     .local v6, "target":Landroid/widget/ListView;
a=0;//     #v6=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {v6}, Landroid/widget/ListView;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 62
a=0;//     .local v3, "itemCount":I
a=0;//     #v3=(Integer);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 92
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Boolean);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v7
a=0;// 
a=0;//     .line 66
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     invoke-virtual {v6}, Landroid/widget/ListView;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 67
a=0;//     .local v0, "childCount":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {v6}, Landroid/widget/ListView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 68
a=0;//     .local v1, "firstPosition":I
a=0;//     #v1=(Integer);
a=0;//     add-int v4, v1, v0
a=0;// 
a=0;//     .line 70
a=0;//     .local v4, "lastPosition":I
a=0;//     #v4=(Integer);
a=0;//     if-lez p1, :cond_3
a=0;// 
a=0;//     .line 72
a=0;//     if-lt v4, v3, :cond_2
a=0;// 
a=0;//     .line 73
a=0;//     add-int/lit8 v8, v0, -0x1
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v6, v8}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 74
a=0;//     .local v5, "lastView":Landroid/view/View;
a=0;//     #v5=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getBottom()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/widget/ListView;->getHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     if-le v8, v9, :cond_0
a=0;// 
a=0;//     .line 92
a=0;//     .end local v5    # "lastView":Landroid/view/View;
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 78
a=0;//     :cond_3
a=0;//     #v2=(Uninit);v5=(Uninit);v7=(Null);v8=(Uninit);v9=(Uninit);
a=0;//     if-gez p1, :cond_0
a=0;// 
a=0;//     .line 80
a=0;//     if-gtz v1, :cond_2
a=0;// 
a=0;//     .line 81
a=0;//     invoke-virtual {v6, v7}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 82
a=0;//     .local v2, "firstView":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     if-ltz v8, :cond_2
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public scrollTargetBy(II)V
a=0;//     .locals 5
a=0;//     .param p1, "deltaX"    # I
a=0;//     .param p2, "deltaY"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/ListViewAutoScrollHelper;->mTarget:Landroid/widget/ListView;
a=0;// 
a=0;//     .line 38
a=0;//     .local v3, "target":Landroid/widget/ListView;
a=0;//     #v3=(Reference,Landroid/widget/ListView;);
a=0;//     invoke-virtual {v3}, Landroid/widget/ListView;->getFirstVisiblePosition()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 39
a=0;//     .local v0, "firstPosition":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne v0, v4, :cond_1
a=0;// 
a=0;//     .line 50
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v4=(Integer);
a=0;//     return-void
a=0;// 
a=0;//     .line 43
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v3, v4}, Landroid/widget/ListView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 44
a=0;//     .local v1, "firstView":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 48
a=0;//     invoke-virtual {v1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v2, v4, p2
a=0;// 
a=0;//     .line 49
a=0;//     .local v2, "newTop":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v3, v0, v2}, Landroid/widget/ListView;->setSelectionFromTop(II)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
