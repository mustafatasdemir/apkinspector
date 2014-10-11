package android.support.v4.view; class PagerTabStrip$1 { void a() { int a;
a=0;// .class Landroid/support/v4/view/PagerTabStrip$1;
a=0;// .super Ljava/lang/Object;
a=0;// .source "PagerTabStrip.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Landroid/support/v4/view/PagerTabStrip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/view/PagerTabStrip;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/support/v4/view/PagerTabStrip;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iput-object p1, p0, Landroid/support/v4/view/PagerTabStrip$1;->this$0:Landroid/support/v4/view/PagerTabStrip;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTabStrip$1;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 2
a=0;//     .param p1, "v"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTabStrip$1;->this$0:Landroid/support/v4/view/PagerTabStrip;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTabStrip;);
a=0;//     iget-object v0, v0, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTabStrip$1;->this$0:Landroid/support/v4/view/PagerTabStrip;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTabStrip;);
a=0;//     iget-object v1, v1, Landroid/support/v4/view/PagerTabStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     add-int/lit8 v1, v1, -0x1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
}}
