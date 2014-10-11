package android.support.v4.view; class ViewPager$1 { void a() { int a;
a=0;// .class final Landroid/support/v4/view/ViewPager$1;
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
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/Signature;
a=0;//     value = {
a=0;//         "Ljava/lang/Object;",
a=0;//         "Ljava/util/Comparator",
a=0;//         "<",
a=0;//         "Landroid/support/v4/view/ViewPager$ItemInfo;",
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
a=0;//     .line 121
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/ViewPager$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public compare(Landroid/support/v4/view/ViewPager$ItemInfo;Landroid/support/v4/view/ViewPager$ItemInfo;)I
a=0;//     .locals 2
a=0;//     .param p1, "lhs"    # Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;//     .param p2, "rhs"    # Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .prologue
a=0;//     .line 124
a=0;//     iget v0, p1, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget v1, p2, Landroid/support/v4/view/ViewPager$ItemInfo;->position:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int/2addr v0, v1
a=0;// 
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
a=0;//     .locals 1
a=0;//     .param p1, "x0"    # Ljava/lang/Object;
a=0;//     .param p2, "x1"    # Ljava/lang/Object;
a=0;// 
a=0;//     .prologue
a=0;//     .line 121
a=0;//     check-cast p1, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .end local p1    # "x0":Ljava/lang/Object;
a=0;//     check-cast p2, Landroid/support/v4/view/ViewPager$ItemInfo;
a=0;// 
a=0;//     .end local p2    # "x1":Ljava/lang/Object;
a=0;//     invoke-virtual {p0, p1, p2}, Landroid/support/v4/view/ViewPager$1;->compare(Landroid/support/v4/view/ViewPager$ItemInfo;Landroid/support/v4/view/ViewPager$ItemInfo;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
}}
