package android.support.v7.internal.widget; class ListPopupWindow$PopupScrollListener { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ListPopupWindow.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/widget/AbsListView$OnScrollListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "PopupScrollListener"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1407
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/widget/ListPopupWindow$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1407
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onScroll(Landroid/widget/AbsListView;III)V
a=0;//     .locals 0
a=0;//     .param p1, "view"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "firstVisibleItem"    # I
a=0;//     .param p3, "visibleItemCount"    # I
a=0;//     .param p4, "totalItemCount"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1412
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onScrollStateChanged(Landroid/widget/AbsListView;I)V
a=0;//     .locals 2
a=0;//     .param p1, "view"    # Landroid/widget/AbsListView;
a=0;//     .param p2, "scrollState"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 1415
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     if-ne p2, v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isInputMethodNotNeeded()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$800(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 1417
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$1000(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/os/Handler;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$900(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
a=0;// 
a=0;//     .line 1418
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupScrollListener;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$900(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->run()V
a=0;// 
a=0;//     .line 1420
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
