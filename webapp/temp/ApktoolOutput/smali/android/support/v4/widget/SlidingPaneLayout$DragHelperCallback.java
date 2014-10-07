package android.support.v4.widget; class SlidingPaneLayout$DragHelperCallback {/*

.class Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;
.super Landroid/support/v4/widget/ViewDragHelper$Callback;
.source "SlidingPaneLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/SlidingPaneLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DragHelperCallback"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/widget/SlidingPaneLayout;


# direct methods
.method private constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
    .locals 0
    .parameter

    .prologue
    .line 1296
    iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/support/v4/widget/SlidingPaneLayout$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 1296
    invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public clampViewPositionHorizontal(Landroid/view/View;II)I
    .locals 7
    .parameter "child"
    .parameter "left"
    .parameter "dx"

    .prologue
    .line 1362
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    #v1=(Reference);
    check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 1365
    .local v1, lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_0

    .line 1366
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I

    move-result v4

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I

    move-result v5

    #v5=(Integer);
    iget v6, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I

    #v6=(Integer);
    add-int/2addr v5, v6

    iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v6=(Reference);
    invoke-static {v6}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;

    move-result-object v6

    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    move-result v6

    #v6=(Integer);
    add-int/2addr v5, v6

    sub-int v3, v4, v5

    .line 1368
    .local v3, startBound:I
    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I

    move-result v4

    #v4=(Integer);
    sub-int v0, v3, v4

    .line 1369
    .local v0, endBound:I
    #v0=(Integer);
    invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I

    move-result v4

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v2

    .line 1375
    .local v2, newLeft:I
    :goto_0
    #v2=(Integer);v6=(Conflicted);
    return v2

    .line 1371
    .end local v0           #endBound:I
    .end local v2           #newLeft:I
    .end local v3           #startBound:I
    :cond_0
    #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I

    move-result v4

    #v4=(Integer);
    iget v5, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I

    #v5=(Integer);
    add-int v3, v4, v5

    .line 1372
    .restart local v3       #startBound:I
    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I

    move-result v4

    #v4=(Integer);
    add-int v0, v3, v4

    .line 1373
    .restart local v0       #endBound:I
    #v0=(Integer);
    invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I

    move-result v4

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v2

    .restart local v2       #newLeft:I
    #v2=(Integer);
    goto :goto_0
.end method

.method public clampViewPositionVertical(Landroid/view/View;II)I
    .locals 1
    .parameter "child"
    .parameter "top"
    .parameter "dy"

    .prologue
    .line 1382
    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getViewHorizontalDragRange(Landroid/view/View;)I
    .locals 1
    .parameter "child"

    .prologue
    .line 1357
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public onEdgeDragStarted(II)V
    .locals 2
    .parameter "edgeFlags"
    .parameter "pointerId"

    .prologue
    .line 1387
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V

    .line 1388
    return-void
.end method

.method public onViewCaptured(Landroid/view/View;I)V
    .locals 1
    .parameter "capturedChild"
    .parameter "activePointerId"

    .prologue
    .line 1324
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setAllChildrenVisible()V

    .line 1325
    return-void
.end method

.method public onViewDragStateChanged(I)V
    .locals 2
    .parameter "state"

    .prologue
    .line 1309
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I

    move-result v0

    #v0=(Integer);
    if-nez v0, :cond_0

    .line 1310
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F

    move-result v0

    #v0=(Float);
    const/4 v1, 0x0

    #v1=(Null);
    cmpl-float v0, v0, v1

    #v0=(Byte);
    if-nez v0, :cond_1

    .line 1311
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->updateObscuredViewsVisibility(Landroid/view/View;)V

    .line 1312
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelClosed(Landroid/view/View;)V

    .line 1313
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z

    .line 1319
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void

    .line 1315
    :cond_1
    #v0=(Byte);v1=(Null);
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelOpened(Landroid/view/View;)V

    .line 1316
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    const/4 v1, 0x1

    #v1=(One);
    invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z

    goto :goto_0
.end method

.method public onViewPositionChanged(Landroid/view/View;IIII)V
    .locals 1
    .parameter "changedView"
    .parameter "left"
    .parameter "top"
    .parameter "dx"
    .parameter "dy"

    .prologue
    .line 1329
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v0=(Reference);
    invoke-static {v0, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->access$600(Landroid/support/v4/widget/SlidingPaneLayout;I)V

    .line 1330
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V

    .line 1331
    return-void
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

    .line 1335
    #v6=(Null);
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    .line 1338
    .local v2, lp:Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)Z

    move-result v4

    #v4=(Boolean);
    if-eqz v4, :cond_3

    .line 1339
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I

    move-result v4

    #v4=(Integer);
    iget v5, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I

    #v5=(Integer);
    add-int v3, v4, v5

    .line 1340
    .local v3, startToRight:I
    #v3=(Integer);
    cmpg-float v4, p2, v6

    #v4=(Byte);
    if-ltz v4, :cond_0

    cmpl-float v4, p2, v6

    if-nez v4, :cond_1

    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F

    move-result v4

    #v4=(Float);
    cmpl-float v4, v4, v7

    #v4=(Byte);
    if-lez v4, :cond_1

    .line 1341
    :cond_0
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I

    move-result v4

    #v4=(Integer);
    add-int/2addr v3, v4

    .line 1343
    :cond_1
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;

    move-result-object v4

    invoke-virtual {v4}, Landroid/view/View;->getWidth()I

    move-result v0

    .line 1344
    .local v0, childWidth:I
    #v0=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I

    move-result v4

    #v4=(Integer);
    sub-int/2addr v4, v3

    sub-int v1, v4, v0

    .line 1351
    .end local v0           #childWidth:I
    .end local v3           #startToRight:I
    .local v1, left:I
    :cond_2
    :goto_0
    #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;

    move-result-object v4

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result v5

    invoke-virtual {v4, v1, v5}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z

    .line 1352
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V

    .line 1353
    return-void

    .line 1346
    .end local v1           #left:I
    :cond_3
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I

    move-result v4

    #v4=(Integer);
    iget v5, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I

    #v5=(Integer);
    add-int v1, v4, v5

    .line 1347
    .restart local v1       #left:I
    #v1=(Integer);
    cmpl-float v4, p2, v6

    #v4=(Byte);
    if-gtz v4, :cond_4

    cmpl-float v4, p2, v6

    if-nez v4, :cond_2

    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F

    move-result v4

    #v4=(Float);
    cmpl-float v4, v4, v7

    #v4=(Byte);
    if-lez v4, :cond_2

    .line 1348
    :cond_4
    iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I

    move-result v4

    #v4=(Integer);
    add-int/2addr v1, v4

    goto :goto_0
.end method

.method public tryCaptureView(Landroid/view/View;I)Z
    .locals 1
    .parameter "child"
    .parameter "pointerId"

    .prologue
    .line 1300
    iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$100(Landroid/support/v4/widget/SlidingPaneLayout;)Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1301
    const/4 v0, 0x0

    .line 1304
    :goto_0
    return v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;

    iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z

    #v0=(Boolean);
    goto :goto_0
.end method

*/}
