package android.support.v4.view; class PagerTitleStrip$PageListener { void a() { int a;
a=0;// .class Landroid/support/v4/view/PagerTitleStrip$PageListener;
a=0;// .super Landroid/database/DataSetObserver;
a=0;// .source "PagerTitleStrip.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v4/view/ViewPager$OnAdapterChangeListener;
a=0;// .implements Landroid/support/v4/view/ViewPager$OnPageChangeListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/view/PagerTitleStrip;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "PageListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mScrollState:I
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v4/view/PagerTitleStrip;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     iput-object p1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v4/view/PagerTitleStrip;Landroid/support/v4/view/PagerTitleStrip$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v4/view/PagerTitleStrip;
a=0;//     .param p2, "x1"    # Landroid/support/v4/view/PagerTitleStrip$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 470
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/view/PagerTitleStrip$PageListener;-><init>(Landroid/support/v4/view/PagerTitleStrip;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/view/PagerTitleStrip$PageListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onAdapterChanged(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;//     .locals 1
a=0;//     .param p1, "oldAdapter"    # Landroid/support/v4/view/PagerAdapter;
a=0;//     .param p2, "newAdapter"    # Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 501
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     invoke-virtual {v0, p1, p2}, Landroid/support/v4/view/PagerTitleStrip;->updateAdapter(Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 502
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onChanged()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 506
a=0;//     #v0=(Null);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v2, v2, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v3, v3, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 508
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/view/PagerTitleStrip;->access$100(Landroid/support/v4/view/PagerTitleStrip;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     cmpl-float v1, v1, v0
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     invoke-static {v1}, Landroid/support/v4/view/PagerTitleStrip;->access$100(Landroid/support/v4/view/PagerTitleStrip;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 509
a=0;//     .local v0, "offset":F
a=0;//     :cond_0
a=0;//     #v0=(Float);v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v2, v2, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v0, v3}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
a=0;// 
a=0;//     .line 510
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageScrollStateChanged(I)V
a=0;//     .locals 0
a=0;//     .param p1, "state"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 496
a=0;//     iput p1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->mScrollState:I
a=0;// 
a=0;//     .line 497
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageScrolled(IFI)V
a=0;//     .locals 2
a=0;//     .param p1, "position"    # I
a=0;//     .param p2, "positionOffset"    # F
a=0;//     .param p3, "positionOffsetPixels"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 476
a=0;//     const/high16 v0, 0x3f000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     cmpl-float v0, p2, v0
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 478
a=0;//     add-int/lit8 p1, p1, 0x1
a=0;// 
a=0;//     .line 480
a=0;//     :cond_0
a=0;//     iget-object v0, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, p1, p2, v1}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
a=0;// 
a=0;//     .line 481
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onPageSelected(I)V
a=0;//     .locals 4
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 485
a=0;//     #v0=(Null);
a=0;//     iget v1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->mScrollState:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_1
a=0;// 
a=0;//     .line 487
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v2, v2, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v3, v3, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v4/view/ViewPager;->getAdapter()Landroid/support/v4/view/PagerAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v2, v3}, Landroid/support/v4/view/PagerTitleStrip;->updateText(ILandroid/support/v4/view/PagerAdapter;)V
a=0;// 
a=0;//     .line 489
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/view/PagerTitleStrip;->access$100(Landroid/support/v4/view/PagerTitleStrip;)F
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Float);
a=0;//     cmpl-float v1, v1, v0
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-ltz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     invoke-static {v1}, Landroid/support/v4/view/PagerTitleStrip;->access$100(Landroid/support/v4/view/PagerTitleStrip;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 490
a=0;//     .local v0, "offset":F
a=0;//     :cond_0
a=0;//     #v0=(Float);v1=(Conflicted);
a=0;//     iget-object v1, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v2, p0, Landroid/support/v4/view/PagerTitleStrip$PageListener;->this$0:Landroid/support/v4/view/PagerTitleStrip;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/view/PagerTitleStrip;);
a=0;//     iget-object v2, v2, Landroid/support/v4/view/PagerTitleStrip;->mPager:Landroid/support/v4/view/ViewPager;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     invoke-virtual {v1, v2, v0, v3}, Landroid/support/v4/view/PagerTitleStrip;->updateTextPositions(IFZ)V
a=0;// 
a=0;//     .line 492
a=0;//     .end local v0    # "offset":F
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
