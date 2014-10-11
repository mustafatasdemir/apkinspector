package android.support.v4.view; class ViewPager$ViewPositionComparator { void a() { int a;
a=0;// .class Landroid/support/v4/view/ViewPager$ViewPositionComparator;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ViewPager.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/util/Comparator;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/ViewPager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x8
a=0;//     name = "ViewPositionComparator"
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Comparator",
a=0;//         "<",
a=0;//         "Landroid/view/View;",
a=0;//         ">;"
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 2884
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager$ViewPositionComparator;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public compare(Landroid/view/View;Landroid/view/View;)I
a=0;//     .locals 4
a=0;//     .param p1, "lhs"    # Landroid/view/View;
a=0;//     .param p2, "rhs"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2887
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 2888
a=0;//     .local v0, "llp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;// 
a=0;//     .line 2889
a=0;//     .local v1, "rlp":Landroid/support/v4/view/ViewPager$LayoutParams;
a=0;//     iget-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     iget-boolean v3, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eq v2, v3, :cond_1
a=0;// 
a=0;//     .line 2890
a=0;//     iget-boolean v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->isDecor:Z
a=0;// 
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 2892
a=0;//     :goto_0
a=0;//     #v2=(Integer);v3=(Integer);
a=0;//     return v2
a=0;// 
a=0;//     .line 2890
a=0;//     :cond_0
a=0;//     #v2=(Boolean);v3=(Boolean);
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 2892
a=0;//     :cond_1
a=0;//     #v2=(Boolean);
a=0;//     iget v2, v0, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget v3, v1, Landroid/support/v4/view/ViewPager$LayoutParams;->position:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     sub-int/2addr v2, v3
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Ljava/lang/Object;
a=0;//     .param p2, "x1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 2884
a=0;//     check-cast p1, Landroid/view/View;
a=0;// 
a=0;//     .end local p1    # "x0":Ljava/lang/Object;
a=0;//     check-cast p2, Landroid/view/View;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/view/ViewPager$ViewPositionComparator;->compare(Landroid/view/View;Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
