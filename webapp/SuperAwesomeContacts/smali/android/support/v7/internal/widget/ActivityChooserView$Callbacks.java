package android.support.v7.internal.widget; class ActivityChooserView$Callbacks { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ActivityChooserView.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/view/View$OnClickListener;
a=0;// .implements Landroid/view/View$OnLongClickListener;
a=0;// .implements Landroid/widget/AdapterView$OnItemClickListener;
a=0;// .implements Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "Callbacks"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method synthetic constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserView;Landroid/support/v7/internal/widget/ActivityChooserView$1;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;//     .param p2, "x1"    # Landroid/support/v7/internal/widget/ActivityChooserView$1;
a=0;// 
a=0;//     .prologue
a=0;//     .line 531
a=0;//     invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V
a=0;// 
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private notifyOnDismissListener()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 607
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$1000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 608
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$1000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V
a=0;// 
a=0;//     .line 610
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public onClick(Landroid/view/View;)V
a=0;//     .locals 5
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 567
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$700(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-ne p1, v3, :cond_1
a=0;// 
a=0;//     .line 568
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z
a=0;// 
a=0;//     .line 569
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDefaultActivity()Landroid/content/pm/ResolveInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 570
a=0;//     .local v0, "defaultActivity":Landroid/content/pm/ResolveInfo;
a=0;//     #v0=(Reference,Landroid/content/pm/ResolveInfo;);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivityIndex(Landroid/content/pm/ResolveInfo;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 571
a=0;//     .local v1, "index":I
a=0;//     #v1=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->chooseActivity(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 572
a=0;//     .local v2, "launchIntent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 573
a=0;//     const/high16 v3, 0x80000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 574
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     .line 582
a=0;//     .end local v0    # "defaultActivity":Landroid/content/pm/ResolveInfo;
a=0;//     .end local v1    # "index":I
a=0;//     .end local v2    # "launchIntent":Landroid/content/Intent;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 576
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$800(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-ne p1, v3, :cond_2
a=0;// 
a=0;//     .line 577
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-static {v3, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$602(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z
a=0;// 
a=0;//     .line 578
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$900(Landroid/support/v7/internal/widget/ActivityChooserView;)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$500(Landroid/support/v7/internal/widget/ActivityChooserView;I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 580
a=0;//     :cond_2
a=0;//     #v4=(Uninit);
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;// .end method
a=0;// 
a=0;// .method public onDismiss()V
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 600
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->notifyOnDismissListener()V
a=0;// 
a=0;//     .line 601
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 602
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v4/view/ActionProvider;->subUiVisibilityChanged(Z)V
a=0;// 
a=0;//     .line 604
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
a=0;//     .locals 5
a=0;//     .param p2, "view"    # Landroid/view/View;
a=0;//     .param p3, "position"    # I
a=0;//     .param p4, "id"    # J
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/widget/AdapterView",
a=0;//             "<*>;",
a=0;//             "Landroid/view/View;",
a=0;//             "IJ)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 536
a=0;//     .local p1, "parent":Landroid/widget/AdapterView;, "Landroid/widget/AdapterView<*>;"
a=0;//     invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/Adapter;);
a=0;//     check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     .line 537
a=0;//     .local v0, "adapter":Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;//     invoke-virtual {v0, p3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 538
a=0;//     .local v1, "itemViewType":I
a=0;//     #v1=(Integer);
a=0;//     packed-switch v1, :pswitch_data_0
a=0;// 
a=0;//     .line 561
a=0;//     new-instance v3, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v3
a=0;// 
a=0;//     .line 540
a=0;//     :pswitch_0
a=0;//     #v3=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     const v4, 0x7fffffff
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-static {v3, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$500(Landroid/support/v7/internal/widget/ActivityChooserView;I)V
a=0;// 
a=0;//     .line 563
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 543
a=0;//     :pswitch_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z
a=0;// 
a=0;//     .line 544
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$600(Landroid/support/v7/internal/widget/ActivityChooserView;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 546
a=0;//     if-lez p3, :cond_0
a=0;// 
a=0;//     .line 547
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Landroid/support/v7/internal/widget/ActivityChooserModel;->setDefaultActivity(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 552
a=0;//     :cond_1
a=0;//     #v3=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getShowDefaultActivity()Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 553
a=0;//     :goto_1
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, p3}, Landroid/support/v7/internal/widget/ActivityChooserModel;->chooseActivity(I)Landroid/content/Intent;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 554
a=0;//     .local v2, "launchIntent":Landroid/content/Intent;
a=0;//     #v2=(Reference,Landroid/content/Intent;);
a=0;//     if-eqz v2, :cond_0
a=0;// 
a=0;//     .line 555
a=0;//     const/high16 v3, 0x80000
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
a=0;// 
a=0;//     .line 556
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 552
a=0;//     .end local v2    # "launchIntent":Landroid/content/Intent;
a=0;//     :cond_2
a=0;//     #v2=(Uninit);v3=(Boolean);
a=0;//     add-int/lit8 p3, p3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 538
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_1
a=0;//         :pswitch_0
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method public onLongClick(Landroid/view/View;)Z
a=0;//     .locals 3
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     .line 587
a=0;//     #v2=(One);
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$700(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     if-ne p1, v0, :cond_1
a=0;// 
a=0;//     .line 588
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getCount()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 589
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v0, v2}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$602(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z
a=0;// 
a=0;//     .line 590
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActivityChooserView;);
a=0;//     invoke-static {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$900(Landroid/support/v7/internal/widget/ActivityChooserView;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$500(Landroid/support/v7/internal/widget/ActivityChooserView;I)V
a=0;// 
a=0;//     .line 595
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 593
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/widget/FrameLayout;);v1=(Uninit);
a=0;//     new-instance v0, Ljava/lang/IllegalArgumentException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/IllegalArgumentException;);
a=0;//     invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/IllegalArgumentException;);
a=0;//     throw v0
a=0;// .end method
}}
