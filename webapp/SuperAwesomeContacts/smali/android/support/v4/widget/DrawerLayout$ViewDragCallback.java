package android.support.v4.widget; class DrawerLayout$ViewDragCallback { void a() { int a;
a=0;// .class Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// .super Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// .source "DrawerLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/DrawerLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ViewDragCallback"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private final mAbsGravity:I
a=0;// 
a=0;// .field private mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;// .field private final mPeekRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v4/widget/DrawerLayout;I)V
a=0;//     .locals 1
a=0;//     .param p2, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1473
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V
a=0;// 
a=0;//     .line 1467
a=0;//     #p0=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;);
a=0;//     new-instance v0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;-><init>(Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;);
a=0;//     iput-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     .line 1474
a=0;//     iput p2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I
a=0;// 
a=0;//     .line 1475
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$000(Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;)V
a=0;//     .locals 0
a=0;//     .param p0, "x0"    # Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1463
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->peekDrawer()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private closeOtherDrawer()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x3
a=0;// 
a=0;//     .line 1524
a=0;//     #v0=(PosByte);
a=0;//     iget v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v2, v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x5
a=0;// 
a=0;//     .line 1525
a=0;//     .local v0, "otherGrav":I
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v2, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1526
a=0;//     .local v1, "toClose":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 1527
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1529
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private peekDrawer()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v8, 0x3
a=0;// 
a=0;//     #v8=(PosByte);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 1558
a=0;//     #v5=(Null);
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v7}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1559
a=0;//     .local v3, "peekDistance":I
a=0;//     #v3=(Integer);
a=0;//     iget v7, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     if-ne v7, v8, :cond_4
a=0;// 
a=0;//     move v1, v6
a=0;// 
a=0;//     .line 1560
a=0;//     .local v1, "leftEdge":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_5
a=0;// 
a=0;//     .line 1561
a=0;//     iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v7=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v7, v8}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1562
a=0;//     .local v4, "toCapture":Landroid/view/View;
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     neg-int v5, v5
a=0;// 
a=0;//     :cond_0
a=0;//     add-int v0, v5, v3
a=0;// 
a=0;//     .line 1568
a=0;//     .local v0, "childLeft":I
a=0;//     :goto_1
a=0;//     #v0=(Integer);v7=(Conflicted);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-lt v5, v0, :cond_2
a=0;// 
a=0;//     :cond_1
a=0;//     if-nez v1, :cond_3
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLeft()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-le v5, v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v5, v4}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_3
a=0;// 
a=0;//     .line 1571
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1572
a=0;//     .local v2, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v5, v4, v0, v7}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z
a=0;// 
a=0;//     .line 1573
a=0;//     iput-boolean v6, v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     .line 1574
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1576
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->closeOtherDrawer()V
a=0;// 
a=0;//     .line 1578
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/DrawerLayout;->cancelChildViewTouch()V
a=0;// 
a=0;//     .line 1580
a=0;//     .end local v2    # "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     :cond_3
a=0;//     #v2=(Conflicted);v5=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "childLeft":I
a=0;//     .end local v1    # "leftEdge":Z
a=0;//     .end local v4    # "toCapture":Landroid/view/View;
a=0;//     :cond_4
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Null);v7=(Integer);
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 1559
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1564
a=0;//     .restart local v1    # "leftEdge":Z
a=0;//     :cond_5
a=0;//     #v1=(Boolean);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v7, 0x5
a=0;// 
a=0;//     #v7=(PosByte);
a=0;//     invoke-virtual {v5, v7}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 1565
a=0;//     .restart local v4    # "toCapture":Landroid/view/View;
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int v0, v5, v3
a=0;// 
a=0;//     .restart local v0    # "childLeft":I
a=0;//     #v0=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clampViewPositionHorizontal(Landroid/view/View;II)I
a=0;//     .locals 3
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "dx"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1615
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1616
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     neg-int v1, v1
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 1619
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     return v1
a=0;// 
a=0;//     .line 1618
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Boolean);v2=(PosByte);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v1}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1619
a=0;//     .local v0, "width":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     sub-int v1, v0, v1
a=0;// 
a=0;//     invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public clampViewPositionVertical(Landroid/view/View;II)I
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "top"    # I
a=0;//     .param p3, "dy"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1625
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getViewHorizontalDragRange(Landroid/view/View;)I
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1610
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onEdgeDragStarted(II)V
a=0;//     .locals 3
a=0;//     .param p1, "edgeFlags"    # I
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1597
a=0;//     and-int/lit8 v1, p1, 0x1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     if-ne v1, v2, :cond_1
a=0;// 
a=0;//     .line 1598
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v2, 0x3
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1603
a=0;//     .local v0, "toCapture":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 1604
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v1, v0, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 1606
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1600
a=0;//     .end local v0    # "toCapture":Landroid/view/View;
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(One);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v2, 0x5
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     invoke-virtual {v1, v2}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .restart local v0    # "toCapture":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onEdgeLock(I)Z
a=0;//     .locals 1
a=0;//     .param p1, "edgeFlags"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1591
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onEdgeTouched(II)V
a=0;//     .locals 4
a=0;//     .param p1, "edgeFlags"    # I
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1552
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     const-wide/16 v2, 0xa0
a=0;// 
a=0;//     #v2=(LongLo);v3=(LongHi);
a=0;//     invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->postDelayed(Ljava/lang/Runnable;J)Z
a=0;// 
a=0;//     .line 1553
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewCaptured(Landroid/view/View;I)V
a=0;//     .locals 2
a=0;//     .param p1, "capturedChild"    # Landroid/view/View;
a=0;//     .param p2, "activePointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1517
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;// 
a=0;//     .line 1518
a=0;//     .local v0, "lp":Landroid/support/v4/widget/DrawerLayout$LayoutParams;
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z
a=0;// 
a=0;//     .line 1520
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->closeOtherDrawer()V
a=0;// 
a=0;//     .line 1521
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewDragStateChanged(I)V
a=0;//     .locals 3
a=0;//     .param p1, "state"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1495
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getCapturedView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->updateDrawerState(IILandroid/view/View;)V
a=0;// 
a=0;//     .line 1496
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewPositionChanged(Landroid/view/View;IIII)V
a=0;//     .locals 5
a=0;//     .param p1, "changedView"    # Landroid/view/View;
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "dx"    # I
a=0;//     .param p5, "dy"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1501
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1504
a=0;//     .local v0, "childWidth":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v3, p1, v4}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 1505
a=0;//     add-int v3, v0, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float v1, v3, v4
a=0;// 
a=0;//     .line 1510
a=0;//     .local v1, "offset":F
a=0;//     :goto_0
a=0;//     #v1=(Float);v2=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v3, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V
a=0;// 
a=0;//     .line 1511
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     cmpl-float v3, v1, v3
a=0;// 
a=0;//     #v3=(Byte);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     const/4 v3, 0x4
a=0;// 
a=0;//     :goto_1
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V
a=0;// 
a=0;//     .line 1512
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1513
a=0;//     return-void
a=0;// 
a=0;//     .line 1507
a=0;//     .end local v1    # "offset":F
a=0;//     :cond_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(PosByte);
a=0;//     iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v3}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1508
a=0;//     .local v2, "width":I
a=0;//     #v2=(Integer);
a=0;//     sub-int v3, v2, p2
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     int-to-float v3, v3
a=0;// 
a=0;//     #v3=(Float);
a=0;//     int-to-float v4, v0
a=0;// 
a=0;//     #v4=(Float);
a=0;//     div-float v1, v3, v4
a=0;// 
a=0;//     .restart local v1    # "offset":F
a=0;//     #v1=(Float);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1511
a=0;//     .end local v2    # "width":I
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Byte);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public onViewReleased(Landroid/view/View;FF)V
a=0;//     .locals 8
a=0;//     .param p1, "releasedChild"    # Landroid/view/View;
a=0;//     .param p2, "xvel"    # F
a=0;//     .param p3, "yvel"    # F
a=0;// 
a=0;//     .prologue
a=0;//     const/high16 v7, 0x3f000000
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 1535
a=0;//     #v6=(Null);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v4, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewOffset(Landroid/view/View;)F
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1536
a=0;//     .local v2, "offset":F
a=0;//     #v2=(Float);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1539
a=0;//     .local v0, "childWidth":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     const/4 v5, 0x3
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v4, p1, v5}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 1540
a=0;//     cmpl-float v4, p2, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_0
a=0;// 
a=0;//     cmpl-float v4, p2, v6
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     cmpl-float v4, v2, v7
a=0;// 
a=0;//     if-lez v4, :cond_1
a=0;// 
a=0;//     :cond_0
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1546
a=0;//     .local v1, "left":I
a=0;//     :goto_0
a=0;//     #v1=(Integer);v3=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/ViewDragHelper;);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v1, v5}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z
a=0;// 
a=0;//     .line 1547
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V
a=0;// 
a=0;//     .line 1548
a=0;//     return-void
a=0;// 
a=0;//     .line 1540
a=0;//     .end local v1    # "left":I
a=0;//     :cond_1
a=0;//     #v1=(Uninit);v3=(Uninit);v4=(Byte);v5=(PosByte);
a=0;//     neg-int v1, v0
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1542
a=0;//     :cond_2
a=0;//     #v1=(Uninit);v4=(Boolean);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 1543
a=0;//     .local v3, "width":I
a=0;//     #v3=(Integer);
a=0;//     cmpg-float v4, p2, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ltz v4, :cond_3
a=0;// 
a=0;//     cmpl-float v4, p2, v6
a=0;// 
a=0;//     if-nez v4, :cond_4
a=0;// 
a=0;//     cmpl-float v4, v2, v7
a=0;// 
a=0;//     if-lez v4, :cond_4
a=0;// 
a=0;//     :cond_3
a=0;//     sub-int v1, v3, v0
a=0;// 
a=0;//     .restart local v1    # "left":I
a=0;//     :goto_1
a=0;//     #v1=(Integer);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .end local v1    # "left":I
a=0;//     :cond_4
a=0;//     #v1=(Uninit);
a=0;//     move v1, v3
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public removeCallbacks()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1482
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Runnable;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->removeCallbacks(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 1483
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setDragger(Landroid/support/v4/widget/ViewDragHelper;)V
a=0;//     .locals 0
a=0;//     .param p1, "dragger"    # Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1478
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     .line 1479
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public tryCaptureView(Landroid/view/View;I)Z
a=0;//     .locals 2
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1489
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/DrawerLayout;);
a=0;//     invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
