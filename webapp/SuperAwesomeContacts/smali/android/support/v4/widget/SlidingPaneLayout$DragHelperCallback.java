package android.support.v4.widget; class SlidingPaneLayout$DragHelperCallback { void a() { int a;
a=0;// .class Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;
a=0;// .super Landroid/support/v4/widget/ViewDragHelper$Callback;
a=0;// .source "SlidingPaneLayout.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "DragHelperCallback"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1296
a=0;//     iput-object p1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/support/v4/widget/ViewDragHelper$Callback;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v4/widget/SlidingPaneLayout;Landroid/support/v4/widget/SlidingPaneLayout$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v4/widget/SlidingPaneLayout;
a=0;//     .param p2, "x1"    # Landroid/support/v4/widget/SlidingPaneLayout$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1296
a=0;//     invoke-direct {p0, p1}, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;-><init>(Landroid/support/v4/widget/SlidingPaneLayout;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public clampViewPositionHorizontal(Landroid/view/View;II)I
a=0;//     .locals 7
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "dx"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1362
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1365
a=0;//     .local v1, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     .line 1366
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v5}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     iget v6, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v6}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v6}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     add-int/2addr v5, v6
a=0;// 
a=0;//     sub-int v3, v4, v5
a=0;// 
a=0;//     .line 1368
a=0;//     .local v3, "startBound":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int v0, v3, v4
a=0;// 
a=0;//     .line 1369
a=0;//     .local v0, "endBound":I
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 1375
a=0;//     .local v2, "newLeft":I
a=0;//     :goto_0
a=0;//     #v2=(Integer);v6=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 1371
a=0;//     .end local v0    # "endBound":I
a=0;//     .end local v2    # "newLeft":I
a=0;//     .end local v3    # "startBound":I
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);v6=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v1, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int v3, v4, v5
a=0;// 
a=0;//     .line 1372
a=0;//     .restart local v3    # "startBound":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int v0, v3, v4
a=0;// 
a=0;//     .line 1373
a=0;//     .restart local v0    # "endBound":I
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v3}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .restart local v2    # "newLeft":I
a=0;//     #v2=(Integer);
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
a=0;//     .line 1382
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
a=0;//     .line 1357
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public onEdgeDragStarted(II)V
a=0;//     .locals 2
a=0;//     .param p1, "edgeFlags"    # I
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1387
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1, p2}, Landroid/support/v4/widget/ViewDragHelper;->captureChildView(Landroid/view/View;I)V
a=0;// 
a=0;//     .line 1388
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewCaptured(Landroid/view/View;I)V
a=0;//     .locals 1
a=0;//     .param p1, "capturedChild"    # Landroid/view/View;
a=0;//     .param p2, "activePointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1324
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->setAllChildrenVisible()V
a=0;// 
a=0;//     .line 1325
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onViewDragStateChanged(I)V
a=0;//     .locals 2
a=0;//     .param p1, "state"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1309
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/ViewDragHelper;->getViewDragState()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 1310
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Float);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     cmpl-float v0, v0, v1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 1311
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->updateObscuredViewsVisibility(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1312
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelClosed(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1313
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
a=0;// 
a=0;//     .line 1319
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 1315
a=0;//     :cond_1
a=0;//     #v0=(Byte);v1=(Null);
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     iget-object v1, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->dispatchOnPanelOpened(Landroid/view/View;)V
a=0;// 
a=0;//     .line 1316
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-static {v0, v1}, Landroid/support/v4/widget/SlidingPaneLayout;->access$502(Landroid/support/v4/widget/SlidingPaneLayout;Z)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onViewPositionChanged(Landroid/view/View;IIII)V
a=0;//     .locals 1
a=0;//     .param p1, "changedView"    # Landroid/view/View;
a=0;//     .param p2, "left"    # I
a=0;//     .param p3, "top"    # I
a=0;//     .param p4, "dx"    # I
a=0;//     .param p5, "dy"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1329
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0, p2}, Landroid/support/v4/widget/SlidingPaneLayout;->access$600(Landroid/support/v4/widget/SlidingPaneLayout;I)V
a=0;// 
a=0;//     .line 1330
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V
a=0;// 
a=0;//     .line 1331
a=0;//     return-void
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
a=0;//     .line 1335
a=0;//     #v6=(Null);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     .line 1338
a=0;//     .local v2, "lp":Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$700(Landroid/support/v4/widget/SlidingPaneLayout;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 1339
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingRight()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->rightMargin:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int v3, v4, v5
a=0;// 
a=0;//     .line 1340
a=0;//     .local v3, "startToRight":I
a=0;//     #v3=(Integer);
a=0;//     cmpg-float v4, p2, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ltz v4, :cond_0
a=0;// 
a=0;//     cmpl-float v4, p2, v6
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpl-float v4, v4, v7
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_1
a=0;// 
a=0;//     .line 1341
a=0;//     :cond_0
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v3, v4
a=0;// 
a=0;//     .line 1343
a=0;//     :cond_1
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$400(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 1344
a=0;//     .local v0, "childWidth":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v4, v3
a=0;// 
a=0;//     sub-int v1, v4, v0
a=0;// 
a=0;//     .line 1351
a=0;//     .end local v0    # "childWidth":I
a=0;//     .end local v3    # "startToRight":I
a=0;//     .local v1, "left":I
a=0;//     :cond_2
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Integer);v3=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$200(Landroid/support/v4/widget/SlidingPaneLayout;)Landroid/support/v4/widget/ViewDragHelper;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {v4, v1, v5}, Landroid/support/v4/widget/ViewDragHelper;->settleCapturedViewAt(II)Z
a=0;// 
a=0;//     .line 1352
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->invalidate()V
a=0;// 
a=0;//     .line 1353
a=0;//     return-void
a=0;// 
a=0;//     .line 1346
a=0;//     .end local v1    # "left":I
a=0;//     :cond_3
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Boolean);v5=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-virtual {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iget v5, v2, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     add-int v1, v4, v5
a=0;// 
a=0;//     .line 1347
a=0;//     .restart local v1    # "left":I
a=0;//     #v1=(Integer);
a=0;//     cmpl-float v4, p2, v6
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-gtz v4, :cond_4
a=0;// 
a=0;//     cmpl-float v4, p2, v6
a=0;// 
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$300(Landroid/support/v4/widget/SlidingPaneLayout;)F
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Float);
a=0;//     cmpl-float v4, v4, v7
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-lez v4, :cond_2
a=0;// 
a=0;//     .line 1348
a=0;//     :cond_4
a=0;//     iget-object v4, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v4}, Landroid/support/v4/widget/SlidingPaneLayout;->access$800(Landroid/support/v4/widget/SlidingPaneLayout;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v1, v4
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public tryCaptureView(Landroid/view/View;I)Z
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "pointerId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1300
a=0;//     iget-object v0, p0, Landroid/support/v4/widget/SlidingPaneLayout$DragHelperCallback;->this$0:Landroid/support/v4/widget/SlidingPaneLayout;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v4/widget/SlidingPaneLayout;);
a=0;//     invoke-static {v0}, Landroid/support/v4/widget/SlidingPaneLayout;->access$100(Landroid/support/v4/widget/SlidingPaneLayout;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1301
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 1304
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v4/widget/SlidingPaneLayout$LayoutParams;->slideable:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     goto :goto_0
a=0;// .end method
}}
