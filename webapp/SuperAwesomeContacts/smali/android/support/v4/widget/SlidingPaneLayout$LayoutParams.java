package android.support.v4.widget; class SlidingPaneLayout$LayoutParams { void a() { int a;
a=0;// .class public Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// .super Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// .source "SlidingPaneLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "LayoutParams"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final ATTRS:[I
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field dimPaint:Landroid/graphics/Paint;
a=0;// 
a=0;// .field dimWhenOffset:Z
a=0;// 
a=0;// .field slideable:Z
a=0;// 
a=0;// .field public weight:F
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 1392
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     new-array v0, v0, [I
a=0;// 
a=0;//     #v0=(Reference,[I);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     const v2, 0x1010181
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     aput v2, v0, v1
a=0;// 
a=0;//     sput-object v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->ATTRS:[I
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     .line 1416
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, v0, v0}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 1400
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 1417
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(II)V
a=0;//     .locals 1
a=0;//     .param p1, "width"    # I
a=0;//     .param p2, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1420
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 1400
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 1421
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
a=0;//     .line 1437
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 1400
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     iput v2, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 1439
a=0;//     sget-object v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->ATTRS:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1440
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getFloat(IF)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     iput v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 1441
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 1442
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1432
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     .line 1400
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 1433
a=0;//     iget v0, p1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 1434
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1424
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 1400
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 1425
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;//     .locals 1
a=0;//     .param p1, "source"    # Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1428
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V
a=0;// 
a=0;//     .line 1400
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->weight:F
a=0;// 
a=0;//     .line 1429
a=0;//     return-void
a=0;// .end method
}}
