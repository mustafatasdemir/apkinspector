package android.support.v7.internal.widget; class ListPopupWindow$ResizePopupRunnable { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ListPopupWindow.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljava/lang/Runnable;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "ResizePopupRunnable"
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
a=0;//     .line 1378
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/widget/ListPopupWindow$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 1378
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 1381
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChildCount()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->getChildCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     iget v1, v1, Landroid/support/v7/internal/widget/ListPopupWindow;->mListItemExpandMaximum:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-gt v0, v1, :cond_0
a=0;// 
a=0;//     .line 1383
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ListPopupWindow;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$800(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/widget/PopupWindow;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 1384
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ResizePopupRunnable;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V
a=0;// 
a=0;//     .line 1386
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
