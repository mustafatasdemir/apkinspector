package android.support.v7.internal.widget; class ListPopupWindow$PopupScrollListener {/*

.class Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;
.super Ljava/lang/Object;
.source "ListPopupWindow.java"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PopupScrollListener"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ListPopupWindow;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
    .locals 0
    .parameter

    .prologue
    .line 1407
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 1407
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onScroll(Landroid/widget/AbsListView;III)V
    .locals 0
    .parameter "view"
    .parameter "firstVisibleItem"
    .parameter "visibleItemCount"
    .parameter "totalItemCount"

    .prologue
    .line 1412
    return-void
.end method

.method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 2
    .parameter "view"
    .parameter "scrollState"

    .prologue
    .line 1415
    const/4 v0, 0x1

    #v0=(One);
    if-ne p2, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isInputMethodNotNeeded()Z

    move-result v0

    #v0=(Boolean);
    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$800(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/widget/PopupWindow;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 1417
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$1000(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$900(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1418
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$900(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->run()V

    .line 1420
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

*/}
