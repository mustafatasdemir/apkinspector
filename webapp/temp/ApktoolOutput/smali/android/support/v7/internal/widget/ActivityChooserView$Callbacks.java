package android.support.v7.internal.widget; class ActivityChooserView$Callbacks {/*

.class Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;
.super Ljava/lang/Object;
.source "ActivityChooserView.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/view/View$OnClickListener;
.implements Landroid/view/View$OnLongClickListener;
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActivityChooserView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "Callbacks"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ActivityChooserView;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V
    .locals 0
    .parameter

    .prologue
    .line 531
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserView;Landroid/support/v7/internal/widget/ActivityChooserView$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 531
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V

    #p0=(Reference);
    return-void
.end method

.method private notifyOnDismissListener()V
    .locals 1

    .prologue
    .line 607
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$1000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 608
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$1000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/PopupWindow$OnDismissListener;

    move-result-object v0

    invoke-interface {v0}, Landroid/widget/PopupWindow$OnDismissListener;->onDismiss()V

    .line 610
    :cond_0
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .parameter "view"

    .prologue
    .line 567
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$700(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;

    move-result-object v3

    if-ne p1, v3, :cond_1

    .line 568
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z

    .line 569
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDefaultActivity()Landroid/content/pm/ResolveInfo;

    move-result-object v0

    .line 570
    .local v0, defaultActivity:Landroid/content/pm/ResolveInfo;
    #v0=(Reference);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v3

    invoke-virtual {v3, v0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivityIndex(Landroid/content/pm/ResolveInfo;)I

    move-result v1

    .line 571
    .local v1, index:I
    #v1=(Integer);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->chooseActivity(I)Landroid/content/Intent;

    move-result-object v2

    .line 572
    .local v2, launchIntent:Landroid/content/Intent;
    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 573
    const/high16 v3, 0x8

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 574
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 582
    .end local v0           #defaultActivity:Landroid/content/pm/ResolveInfo;
    .end local v1           #index:I
    .end local v2           #launchIntent:Landroid/content/Intent;
    :cond_0
    :goto_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);
    return-void

    .line 576
    :cond_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$800(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;

    move-result-object v3

    if-ne p1, v3, :cond_2

    .line 577
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    const/4 v4, 0x0

    #v4=(Null);
    invoke-static {v3, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$602(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z

    .line 578
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    iget-object v4, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$900(Landroid/support/v7/internal/widget/ActivityChooserView;)I

    move-result v4

    #v4=(Integer);
    invoke-static {v3, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$500(Landroid/support/v7/internal/widget/ActivityChooserView;I)V

    goto :goto_0

    .line 580
    :cond_2
    #v4=(Uninit);
    new-instance v3, Ljava/lang/IllegalArgumentException;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V

    #v3=(Reference);
    throw v3
.end method

.method public onDismiss()V
    .locals 2

    .prologue
    .line 600
    invoke-direct {p0}, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->notifyOnDismissListener()V

    .line 601
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v0=(Reference);
    iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;

    if-eqz v0, :cond_0

    .line 602
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    iget-object v0, v0, Landroid/support/v7/internal/widget/ActivityChooserView;->mProvider:Landroid/support/v4/view/ActionProvider;

    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {v0, v1}, Landroid/support/v4/view/ActionProvider;->subUiVisibilityChanged(Z)V

    .line 604
    :cond_0
    #v1=(Conflicted);
    return-void
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 5
    .parameter
    .parameter "view"
    .parameter "position"
    .parameter "id"
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;",
            "Landroid/view/View;",
            "IJ)V"
        }
    .end annotation

    .prologue
    .line 536
    .local p1, parent:Landroid/widget/AdapterView;,"Landroid/widget/AdapterView<*>;"
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    .line 537
    .local v0, adapter:Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
    invoke-virtual {v0, p3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getItemViewType(I)I

    move-result v1

    .line 538
    .local v1, itemViewType:I
    #v1=(Integer);
    packed-switch v1, :pswitch_data_0

    .line 561
    new-instance v3, Ljava/lang/IllegalArgumentException;

    #v3=(UninitRef);
    invoke-direct {v3}, Ljava/lang/IllegalArgumentException;-><init>()V

    #v3=(Reference);
    throw v3

    .line 540
    :pswitch_0
    #v3=(Uninit);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v3=(Reference);
    const v4, 0x7fffffff

    #v4=(Integer);
    invoke-static {v3, v4}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$500(Landroid/support/v7/internal/widget/ActivityChooserView;I)V

    .line 563
    :cond_0
    :goto_0
    #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
    return-void

    .line 543
    :pswitch_1
    #v2=(Uninit);v3=(Uninit);v4=(Uninit);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->dismissPopup()Z

    .line 544
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$600(Landroid/support/v7/internal/widget/ActivityChooserView;)Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_1

    .line 546
    if-lez p3, :cond_0

    .line 547
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v3

    invoke-virtual {v3, p3}, Landroid/support/v7/internal/widget/ActivityChooserModel;->setDefaultActivity(I)V

    goto :goto_0

    .line 552
    :cond_1
    #v3=(Boolean);
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getShowDefaultActivity()Z

    move-result v3

    #v3=(Boolean);
    if-eqz v3, :cond_2

    .line 553
    :goto_1
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v3

    invoke-virtual {v3, p3}, Landroid/support/v7/internal/widget/ActivityChooserModel;->chooseActivity(I)Landroid/content/Intent;

    move-result-object v2

    .line 554
    .local v2, launchIntent:Landroid/content/Intent;
    #v2=(Reference);
    if-eqz v2, :cond_0

    .line 555
    const/high16 v3, 0x8

    #v3=(Integer);
    invoke-virtual {v2, v3}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 556
    iget-object v3, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v3=(Reference);
    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    goto :goto_0

    .line 552
    .end local v2           #launchIntent:Landroid/content/Intent;
    :cond_2
    #v2=(Uninit);v3=(Boolean);
    add-int/lit8 p3, p3, 0x1

    goto :goto_1

    .line 538
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);p4=(Unknown);p5=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onLongClick(Landroid/view/View;)Z
    .locals 3
    .parameter "view"

    .prologue
    const/4 v2, 0x1

    .line 587
    #v2=(One);
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$700(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/widget/FrameLayout;

    move-result-object v0

    if-ne p1, v0, :cond_1

    .line 588
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-static {v0}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getCount()I

    move-result v0

    #v0=(Integer);
    if-lez v0, :cond_0

    .line 589
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v0=(Reference);
    invoke-static {v0, v2}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$602(Landroid/support/v7/internal/widget/ActivityChooserView;Z)Z

    .line 590
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$Callbacks;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$900(Landroid/support/v7/internal/widget/ActivityChooserView;)I

    move-result v1

    #v1=(Integer);
    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$500(Landroid/support/v7/internal/widget/ActivityChooserView;I)V

    .line 595
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return v2

    .line 593
    :cond_1
    #v0=(Reference);v1=(Uninit);
    new-instance v0, Ljava/lang/IllegalArgumentException;

    #v0=(UninitRef);
    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    #v0=(Reference);
    throw v0
.end method

*/}
