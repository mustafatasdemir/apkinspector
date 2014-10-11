package android.support.v4.widget; class DrawerLayout$LayoutParams { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// .super Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// .source "DrawerLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/DrawerLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "LayoutParams"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field public gravity:I
a=0;// 
a=0;// .field isPeeking:Z
a=0;// 
a=0;// .field knownOpen:Z
a=0;// 
a=0;// .field onScreen:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(II)V
a=0;//     .locals 1
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1645
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 1631
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1646
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(III)V
a=0;//     .locals 0
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;//     .param p3, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1649
a=0;//     invoke-direct {p0, p1, p2}, Landroid/support/v4/widget/DrawerLayout$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 1650
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     iput p3, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1651
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 3
a=0;//     .param p1, "c"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1637
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 1631
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     iput v2, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1639
a=0;//     invoke-static {}, Landroid/support/v4/widget/DrawerLayout;->access$100()[I
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1640
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1641
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 1642
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/widget/DrawerLayout$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1654
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     .line 1631
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1655
a=0;//     iget v0, p1, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1656
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1659
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 1631
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1660
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1663
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     .line 1631
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->gravity:I
a=0;// 
a=0;//     .line 1664
a=0;//     return-void
a=0;// .end method
}}
