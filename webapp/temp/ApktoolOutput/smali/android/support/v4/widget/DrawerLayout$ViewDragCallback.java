package android.support.v4.widget; class DrawerLayout$ViewDragCallback {/*

.class Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;
.super Landroid/support/v4/widget/ViewDragHelper$Callback;
.source "DrawerLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ViewDragCallback"
.end annotation


# instance fields
.field private final mAbsGravity:I

.field private mDragger:Landroid/support/v4/widget/ViewDragHelper;

.field private final mPeekRunnable:Ljava/lang/Runnable;

.field final synthetic this$0:Landroid/support/v4/widget/DrawerLayout;


# direct methods
.method public constructor <init>(Landroid/support/v4/widget/DrawerLayout;I)V
    .locals 1
    .parameter
    .parameter "gravity"

    .prologue
    .line 1473
    iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V

    .line 1467
    #p0=(Reference);
    new-instance v0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback$1;-><init>(Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;)V

    #v0=(Reference);
    iput-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;

    .line 1474
    iput p2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I

    .line 1475
    return-void
.end method

.method static synthetic access$000(Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;)V
    .locals 0
    .parameter "x0"

    .prologue
    .line 1463
    invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->peekDrawer()V

    return-void
.end method

.method private closeOtherDrawer()V
    .locals 3

    .prologue
    const/4 v0, 0x3

    .line 1524
    #v0=(PosByte);
    iget v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I

    #v2=(Integer);
    if-ne v2, v0, :cond_0

    const/4 v0, 0x5

    .line 1525
    .local v0, otherGrav:I
    :cond_0
    iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v2=(Reference);
    invoke-virtual {v2, v0}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;

    move-result-object v1

    .line 1526
    .local v1, toClose:Landroid/view/View;
    #v1=(Reference);
    if-eqz v1, :cond_1

    .line 1527
    iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v2, v1}, Landroid/support/v4/widget/DrawerLayout;->closeDrawer(Landroid/view/View;)V

    .line 1529
    :cond_1
    return-void
.end method

.method private peekDrawer()V
    .locals 9

    .prologue
    const/4 v8, 0x3

    #v8=(PosByte);
    const/4 v6, 0x1

    #v6=(One);
    const/4 v5, 0x0

    .line 1558
    #v5=(Null);
    iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    #v7=(Reference);
    invoke-virtual {v7}, Landroid/support/v4/widget/ViewDragHelper;->getEdgeSize()I

    move-result v3

    .line 1559
    .local v3, peekDistance:I
    #v3=(Integer);
    iget v7, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I

    #v7=(Integer);
    if-ne v7, v8, :cond_4

    move v1, v6

    .line 1560
    .local v1, leftEdge:Z
    :goto_0
    #v1=(Boolean);
    if-eqz v1, :cond_5

    .line 1561
    iget-object v7, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v7=(Reference);
    invoke-virtual {v7, v8}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;

    move-result-object v4

    .line 1562
    .local v4, toCapture:Landroid/view/View;
    #v4=(Reference);
    if-eqz v4, :cond_0

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v5

    #v5=(Integer);
    neg-int v5, v5

    :cond_0
    add-int v0, v5, v3

    .line 1568
    .local v0, childLeft:I
    :goto_1
    #v0=(Integer);v7=(Conflicted);
    if-eqz v4, :cond_3

    if-eqz v1, :cond_1

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v5

    if-lt v5, v0, :cond_2

    :cond_1
    if-nez v1, :cond_3

    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    move-result v5

    if-le v5, v0, :cond_3

    :cond_2
    iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v5=(Reference);
    invoke-virtual {v5, v4}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I

    move-result v5

    #v5=(Integer);
    if-nez v5, :cond_3

    .line 1571
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;

    .line 1572
    .local v2, lp:Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    #v5=(Reference);
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    move-result v7

    #v7=(Integer);
    invoke-virtual {v5, v4, v0, v7}, Landroid/support/v4/widget/ViewDragHelper;->smoothSlideViewTo(Landroid/view/View;II)Z

    .line 1573
    iput-boolean v6, v2, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z

    .line 1574
    iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v5}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 1576
    invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->closeOtherDrawer()V

    .line 1578
    iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v5}, Landroid/support/v4/widget/DrawerLayout;->cancelChildViewTouch()V

    .line 1580
    .end local v2           #lp:Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    :cond_3
    #v2=(Conflicted);v5=(Conflicted);v7=(Conflicted);
    return-void

    .end local v0           #childLeft:I
    .end local v1           #leftEdge:Z
    .end local v4           #toCapture:Landroid/view/View;
    :cond_4
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Null);v7=(Integer);
    move v1, v5

    .line 1559
    #v1=(Null);
    goto :goto_0

    .line 1564
    .restart local v1       #leftEdge:Z
    :cond_5
    #v1=(Boolean);
    iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v5=(Reference);
    const/4 v7, 0x5

    #v7=(PosByte);
    invoke-virtual {v5, v7}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;

    move-result-object v4

    .line 1565
    .restart local v4       #toCapture:Landroid/view/View;
    #v4=(Reference);
    iget-object v5, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v5}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I

    move-result v5

    #v5=(Integer);
    sub-int v0, v5, v3

    .restart local v0       #childLeft:I
    #v0=(Integer);
    goto :goto_1
.end method


# virtual methods
.method public clampViewPositionHorizontal(Landroid/view/View;II)I
    .locals 3
    .parameter "child"
    .parameter "left"
    .parameter "dx"

    .prologue
    .line 1615
    iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v1=(Reference);
    const/4 v2, 0x3

    #v2=(PosByte);
    invoke-virtual {v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 1616
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    #v1=(Integer);
    neg-int v1, v1

    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {p2, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    #v2=(Integer);
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    .line 1619
    :goto_0
    #v0=(Conflicted);
    return v1

    .line 1618
    :cond_0
    #v0=(Uninit);v1=(Boolean);v2=(PosByte);
    iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I

    move-result v0

    .line 1619
    .local v0, width:I
    #v0=(Integer);
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v1

    #v1=(Integer);
    sub-int v1, v0, v1

    invoke-static {p2, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    #v2=(Integer);
    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    goto :goto_0
.end method

.method public clampViewPositionVertical(Landroid/view/View;II)I
    .locals 1
    .parameter "child"
    .parameter "top"
    .parameter "dy"

    .prologue
    .line 1625
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getViewHorizontalDragRange(Landroid/view/View;)I
    .locals 1
    .parameter "child"

    .prologue
    .line 1610
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public onEdgeDragStarted(II)V
    .locals 3
    .parameter "edgeFlags"
    .parameter "pointerId"

    .prologue
    .line 1597
    and-int/lit8 v1, p1, 0x1

    #v1=(Integer);
    const/4 v2, 0x1

    #v2=(One);
    if-ne v1, v2, :cond_1

    .line 1598
    iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v1=(Reference);
    const/4 v2, 0x3

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;

    move-result-object v0

    .line 1603
    .local v0, toCapture:Landroid/view/View;
    :goto_0
    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v1, v0}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I

    move-result v1

    #v1=(Integer);
    if-nez v1, :cond_0

    .line 1604
    iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    #v1=(Reference);
    invoke-virtual {v1, v0, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V

    .line 1606
    :cond_0
    #v1=(Conflicted);
    return-void

    .line 1600
    .end local v0           #toCapture:Landroid/view/View;
    :cond_1
    #v0=(Uninit);v1=(Integer);v2=(One);
    iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v1=(Reference);
    const/4 v2, 0x5

    #v2=(PosByte);
    invoke-virtual {v1, v2}, Landroid/support/v4/widget/DrawerLayout;->findDrawerWithGravity(I)Landroid/view/View;

    move-result-object v0

    .restart local v0       #toCapture:Landroid/view/View;
    #v0=(Reference);
    goto :goto_0
.end method

.method public onEdgeLock(I)Z
    .locals 1
    .parameter "edgeFlags"

    .prologue
    .line 1591
    const/4 v0, 0x0

    #v0=(Null);
    return v0
.end method

.method public onEdgeTouched(II)V
    .locals 4
    .parameter "edgeFlags"
    .parameter "pointerId"

    .prologue
    .line 1552
    iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;

    #v1=(Reference);
    const-wide/16 v2, 0xa0

    #v2=(LongLo);v3=(LongHi);
    invoke-virtual {v0, v1, v2, v3}, Landroid/support/v4/widget/DrawerLayout;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1553
    return-void
.end method

.method public onViewCaptured(Landroid/view/View;I)V
    .locals 2
    .parameter "capturedChild"
    .parameter "activePointerId"

    .prologue
    .line 1517
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;

    .line 1518
    .local v0, lp:Landroid/support/v4/widget/DrawerLayout$LayoutParams;
    const/4 v1, 0x0

    #v1=(Null);
    iput-boolean v1, v0, Landroid/support/v4/widget/DrawerLayout$LayoutParams;->isPeeking:Z

    .line 1520
    invoke-direct {p0}, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->closeOtherDrawer()V

    .line 1521
    return-void
.end method

.method public onViewDragStateChanged(I)V
    .locals 3
    .parameter "state"

    .prologue
    .line 1495
    iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I

    #v1=(Integer);
    iget-object v2, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v4/widget/ViewDragHelper;->getCapturedView()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v0, v1, p1, v2}, Landroid/support/v4/widget/DrawerLayout;->updateDrawerState(IILandroid/view/View;)V

    .line 1496
    return-void
.end method

.method public onViewPositionChanged(Landroid/view/View;IIII)V
    .locals 5
    .parameter "changedView"
    .parameter "left"
    .parameter "top"
    .parameter "dx"
    .parameter "dy"

    .prologue
    .line 1501
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1504
    .local v0, childWidth:I
    #v0=(Integer);
    iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v3=(Reference);
    const/4 v4, 0x3

    #v4=(PosByte);
    invoke-virtual {v3, p1, v4}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_0

    .line 1505
    add-int v3, v0, p2

    #v3=(Integer);
    int-to-float v3, v3

    #v3=(Float);
    int-to-float v4, v0

    #v4=(Float);
    div-float v1, v3, v4

    .line 1510
    .local v1, offset:F
    :goto_0
    #v1=(Float);v2=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v3=(Reference);
    invoke-virtual {v3, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->setDrawerViewOffset(Landroid/view/View;F)V

    .line 1511
    const/4 v3, 0x0

    #v3=(Null);
    cmpl-float v3, v1, v3

    #v3=(Byte);
    if-nez v3, :cond_1

    const/4 v3, 0x4

    :goto_1
    #v3=(PosByte);
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1512
    iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 1513
    return-void

    .line 1507
    .end local v1           #offset:F
    :cond_0
    #v1=(Uninit);v2=(Uninit);v3=(Boolean);v4=(PosByte);
    iget-object v3, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I

    move-result v2

    .line 1508
    .local v2, width:I
    #v2=(Integer);
    sub-int v3, v2, p2

    #v3=(Integer);
    int-to-float v3, v3

    #v3=(Float);
    int-to-float v4, v0

    #v4=(Float);
    div-float v1, v3, v4

    .restart local v1       #offset:F
    #v1=(Float);
    goto :goto_0

    .line 1511
    .end local v2           #width:I
    :cond_1
    #v2=(Conflicted);v3=(Byte);
    const/4 v3, 0x0

    #v3=(Null);
    goto :goto_1
.end method

.method public onViewReleased(Landroid/view/View;FF)V
    .locals 8
    .parameter "releasedChild"
    .parameter "xvel"
    .parameter "yvel"

    .prologue
    const/high16 v7, 0x3f00

    #v7=(Integer);
    const/4 v6, 0x0

    .line 1535
    #v6=(Null);
    iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v4=(Reference);
    invoke-virtual {v4, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerViewOffset(Landroid/view/View;)F

    move-result v2

    .line 1536
    .local v2, offset:F
    #v2=(Float);
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1539
    .local v0, childWidth:I
    #v0=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    const/4 v5, 0x3

    #v5=(PosByte);
    invoke-virtual {v4, p1, v5}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_2

    .line 1540
    cmpl-float v4, p2, v6

    #v4=(Byte);
    if-gtz v4, :cond_0

    cmpl-float v4, p2, v6

    if-nez v4, :cond_1

    cmpl-float v4, v2, v7

    if-lez v4, :cond_1

    :cond_0
    const/4 v1, 0x0

    .line 1546
    .local v1, left:I
    :goto_0
    #v1=(Integer);v3=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    #v4=(Reference);
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {v4, v1, v5}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    .line 1547
    iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->invalidate()V

    .line 1548
    return-void

    .line 1540
    .end local v1           #left:I
    :cond_1
    #v1=(Uninit);v3=(Uninit);v4=(Byte);v5=(PosByte);
    neg-int v1, v0

    #v1=(Integer);
    goto :goto_0

    .line 1542
    :cond_2
    #v1=(Uninit);v4=(Boolean);
    iget-object v4, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/widget/DrawerLayout;->getWidth()I

    move-result v3

    .line 1543
    .local v3, width:I
    #v3=(Integer);
    cmpg-float v4, p2, v6

    #v4=(Byte);
    if-ltz v4, :cond_3

    cmpl-float v4, p2, v6

    if-nez v4, :cond_4

    cmpl-float v4, v2, v7

    if-lez v4, :cond_4

    :cond_3
    sub-int v1, v3, v0

    .restart local v1       #left:I
    :goto_1
    #v1=(Integer);
    goto :goto_0

    .end local v1           #left:I
    :cond_4
    #v1=(Uninit);
    move v1, v3

    #v1=(Integer);
    goto :goto_1
.end method

.method public removeCallbacks()V
    .locals 2

    .prologue
    .line 1482
    iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mPeekRunnable:Ljava/lang/Runnable;

    #v1=(Reference);
    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 1483
    return-void
.end method

.method public setDragger(Landroid/support/v4/widget/ViewDragHelper;)V
    .locals 0
    .parameter "dragger"

    .prologue
    .line 1478
    iput-object p1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mDragger:Landroid/support/v4/widget/ViewDragHelper;

    .line 1479
    return-void
.end method

.method public tryCaptureView(Landroid/view/View;I)Z
    .locals 2
    .parameter "child"
    .parameter "pointerId"

    .prologue
    .line 1489
    iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->isDrawerView(Landroid/view/View;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    iget v1, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->mAbsGravity:I

    #v1=(Integer);
    invoke-virtual {v0, p1, v1}, Landroid/support/v4/widget/DrawerLayout;->checkDrawerViewAbsoluteGravity(Landroid/view/View;I)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v4/widget/DrawerLayout$ViewDragCallback;->this$0:Landroid/support/v4/widget/DrawerLayout;

    #v0=(Reference);
    invoke-virtual {v0, p1}, Landroid/support/v4/widget/DrawerLayout;->getDrawerLockMode(Landroid/view/View;)I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    #v0=(Boolean);v1=(Conflicted);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
