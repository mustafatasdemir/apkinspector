package android.support.v7.internal.widget; class ActivityChooserView$ActivityChooserViewAdapter {/*

.class Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;
.super Landroid/widget/BaseAdapter;
.source "ActivityChooserView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ActivityChooserView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ActivityChooserViewAdapter"
.end annotation


# static fields
.field private static final ITEM_VIEW_TYPE_ACTIVITY:I = 0x0

.field private static final ITEM_VIEW_TYPE_COUNT:I = 0x3

.field private static final ITEM_VIEW_TYPE_FOOTER:I = 0x1

.field public static final MAX_ACTIVITY_COUNT_DEFAULT:I = 0x4

.field public static final MAX_ACTIVITY_COUNT_UNLIMITED:I = 0x7fffffff


# instance fields
.field private mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

.field private mHighlightDefaultActivity:Z

.field private mMaxActivityCount:I

.field private mShowDefaultActivity:Z

.field private mShowFooterView:Z

.field final synthetic this$0:Landroid/support/v7/internal/widget/ActivityChooserView;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V
    .locals 1
    .parameter

    .prologue
    .line 616
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 630
    #p0=(Reference);
    const/4 v0, 0x4

    #v0=(PosByte);
    iput v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I

    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ActivityChooserView;Landroid/support/v7/internal/widget/ActivityChooserView$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 616
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;-><init>(Landroid/support/v7/internal/widget/ActivityChooserView;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public getActivityCount()I
    .locals 1

    .prologue
    .line 777
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivityCount()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getCount()I
    .locals 3

    .prologue
    .line 665
    const/4 v1, 0x0

    .line 666
    .local v1, count:I
    #v1=(Null);
    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivityCount()I

    move-result v0

    .line 667
    .local v0, activityCount:I
    #v0=(Integer);
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z

    #v2=(Boolean);
    if-nez v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v2=(Reference);
    invoke-virtual {v2}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getDefaultActivity()Landroid/content/pm/ResolveInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 668
    add-int/lit8 v0, v0, -0x1

    .line 670
    :cond_0
    #v2=(Conflicted);
    iget v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I

    #v2=(Integer);
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 671
    #v1=(Integer);
    iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowFooterView:Z

    #v2=(Boolean);
    if-eqz v2, :cond_1

    .line 672
    add-int/lit8 v1, v1, 0x1

    .line 674
    :cond_1
    return v1
.end method

.method public getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;
    .locals 1

    .prologue
    .line 789
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v0=(Reference);
    return-object v0
.end method

.method public getDefaultActivity()Landroid/content/pm/ResolveInfo;
    .locals 1

    .prologue
    .line 766
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getDefaultActivity()Landroid/content/pm/ResolveInfo;

    move-result-object v0

    return-object v0
.end method

.method public getHistorySize()I
    .locals 1

    .prologue
    .line 781
    iget-object v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getHistorySize()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 2
    .parameter "position"

    .prologue
    .line 678
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getItemViewType(I)I

    move-result v0

    .line 679
    .local v0, itemViewType:I
    #v0=(Integer);
    packed-switch v0, :pswitch_data_0

    .line 688
    new-instance v1, Ljava/lang/IllegalArgumentException;

    #v1=(UninitRef);
    invoke-direct {v1}, Ljava/lang/IllegalArgumentException;-><init>()V

    #v1=(Reference);
    throw v1

    .line 681
    :pswitch_0
    #v1=(Uninit);
    const/4 v1, 0x0

    .line 686
    :goto_0
    #v1=(Reference);
    return-object v1

    .line 683
    :pswitch_1
    #v1=(Uninit);
    iget-boolean v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z

    #v1=(Boolean);
    if-nez v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getDefaultActivity()Landroid/content/pm/ResolveInfo;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 684
    add-int/lit8 p1, p1, 0x1

    .line 686
    :cond_0
    #v1=(Conflicted);
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

    #v1=(Reference);
    invoke-virtual {v1, p1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->getActivity(I)Landroid/content/pm/ResolveInfo;

    move-result-object v1

    goto :goto_0

    .line 679
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getItemId(I)J
    .locals 2
    .parameter "position"

    .prologue
    .line 693
    int-to-long v0, p1

    #v0=(LongLo);v1=(LongHi);
    return-wide v0
.end method

.method public getItemViewType(I)I
    .locals 1
    .parameter "position"

    .prologue
    .line 652
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowFooterView:Z

    #v0=(Boolean);
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getCount()I

    move-result v0

    #v0=(Integer);
    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 653
    const/4 v0, 0x1

    .line 655
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Integer);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public getMaxActivityCount()I
    .locals 1

    .prologue
    .line 785
    iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I

    #v0=(Integer);
    return v0
.end method

.method public getShowDefaultActivity()Z
    .locals 1

    .prologue
    .line 803
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z

    #v0=(Boolean);
    return v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10
    .parameter "position"
    .parameter "convertView"
    .parameter "parent"

    .prologue
    const/4 v9, 0x1

    #v9=(One);
    const/4 v8, 0x0

    .line 697
    #v8=(Null);
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getItemViewType(I)I

    move-result v3

    .line 698
    .local v3, itemViewType:I
    #v3=(Integer);
    packed-switch v3, :pswitch_data_0

    .line 730
    new-instance v6, Ljava/lang/IllegalArgumentException;

    #v6=(UninitRef);
    invoke-direct {v6}, Ljava/lang/IllegalArgumentException;-><init>()V

    #v6=(Reference);
    throw v6

    .line 700
    :pswitch_0
    #v6=(Uninit);
    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v6

    #v6=(Integer);
    if-eq v6, v9, :cond_1

    .line 701
    :cond_0
    #v6=(Conflicted);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    sget v7, Landroid/support/v7/appcompat/R$layout;->abc_activity_chooser_view_list_item:I

    #v7=(Integer);
    invoke-virtual {v6, v7, p3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 703
    invoke-virtual {p2, v9}, Landroid/view/View;->setId(I)V

    .line 704
    sget v6, Landroid/support/v7/appcompat/R$id;->title:I

    #v6=(Integer);
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    #v5=(Reference);
    check-cast v5, Landroid/widget/TextView;

    .line 705
    .local v5, titleView:Landroid/widget/TextView;
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v6

    sget v7, Landroid/support/v7/appcompat/R$string;->abc_activity_chooser_view_see_all:I

    invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .end local v5           #titleView:Landroid/widget/TextView;
    :cond_1
    #v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
    move-object v1, p2

    .line 728
    .end local p2
    .local v1, convertView:Landroid/view/View;
    :goto_0
    #v0=(Conflicted);v1=(Reference);v2=(Conflicted);v4=(Conflicted);
    return-object v1

    .line 710
    .end local v1           #convertView:Landroid/view/View;
    .restart local p2
    :pswitch_1
    #v0=(Uninit);v1=(Uninit);v2=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Landroid/view/View;->getId()I

    move-result v6

    #v6=(Integer);
    sget v7, Landroid/support/v7/appcompat/R$id;->list_item:I

    #v7=(Integer);
    if-eq v6, v7, :cond_3

    .line 711
    :cond_2
    #v6=(Conflicted);v7=(Conflicted);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v6

    sget v7, Landroid/support/v7/appcompat/R$layout;->abc_activity_chooser_view_list_item:I

    #v7=(Integer);
    invoke-virtual {v6, v7, p3, v8}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 714
    :cond_3
    #v6=(Conflicted);
    iget-object v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v6=(Reference);
    invoke-virtual {v6}, Landroid/support/v7/internal/widget/ActivityChooserView;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v4

    .line 716
    .local v4, packageManager:Landroid/content/pm/PackageManager;
    #v4=(Reference);
    sget v6, Landroid/support/v7/appcompat/R$id;->icon:I

    #v6=(Integer);
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    #v2=(Reference);
    check-cast v2, Landroid/widget/ImageView;

    .line 717
    .local v2, iconView:Landroid/widget/ImageView;
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getItem(I)Ljava/lang/Object;

    move-result-object v0

    #v0=(Reference);
    check-cast v0, Landroid/content/pm/ResolveInfo;

    .line 718
    .local v0, activity:Landroid/content/pm/ResolveInfo;
    invoke-virtual {v0, v4}, Landroid/content/pm/ResolveInfo;->loadIcon(Landroid/content/pm/PackageManager;)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 720
    sget v6, Landroid/support/v7/appcompat/R$id;->title:I

    #v6=(Integer);
    invoke-virtual {p2, v6}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v5

    #v5=(Reference);
    check-cast v5, Landroid/widget/TextView;

    .line 721
    .restart local v5       #titleView:Landroid/widget/TextView;
    invoke-virtual {v0, v4}, Landroid/content/pm/ResolveInfo;->loadLabel(Landroid/content/pm/PackageManager;)Ljava/lang/CharSequence;

    move-result-object v6

    #v6=(Reference);
    invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 723
    iget-boolean v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z

    #v6=(Boolean);
    if-eqz v6, :cond_4

    if-nez p1, :cond_4

    iget-boolean v6, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mHighlightDefaultActivity:Z

    if-eqz v6, :cond_4

    :cond_4
    move-object v1, p2

    .line 728
    .end local p2
    .restart local v1       #convertView:Landroid/view/View;
    #v1=(Reference);
    goto :goto_0

    .line 698
    #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);v6=(Unknown);v7=(Unknown);v8=(Unknown);v9=(Unknown);p0=(Unknown);p1=(Unknown);p2=(Unknown);p3=(Unknown);
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public getViewTypeCount()I
    .locals 1

    .prologue
    .line 661
    const/4 v0, 0x3

    #v0=(PosByte);
    return v0
.end method

.method public measureContentWidth()I
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 737
    #v8=(Null);
    iget v5, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I

    .line 738
    .local v5, oldMaxActivityCount:I
    #v5=(Integer);
    const v7, 0x7fffffff

    #v7=(Integer);
    iput v7, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I

    .line 740
    const/4 v0, 0x0

    .line 741
    .local v0, contentWidth:I
    #v0=(Null);
    const/4 v4, 0x0

    .line 743
    .local v4, itemView:Landroid/view/View;
    #v4=(Null);
    invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v6

    .line 744
    .local v6, widthMeasureSpec:I
    #v6=(Integer);
    invoke-static {v8, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 745
    .local v2, heightMeasureSpec:I
    #v2=(Integer);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getCount()I

    move-result v1

    .line 747
    .local v1, count:I
    #v1=(Integer);
    const/4 v3, 0x0

    .local v3, i:I
    :goto_0
    #v0=(Integer);v3=(Integer);v4=(Reference);
    if-ge v3, v1, :cond_0

    .line 748
    const/4 v7, 0x0

    #v7=(Null);
    invoke-virtual {p0, v3, v4, v7}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 749
    invoke-virtual {v4, v6, v2}, Landroid/view/View;->measure(II)V

    .line 750
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    move-result v7

    #v7=(Integer);
    invoke-static {v0, v7}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 747
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 753
    :cond_0
    iput v5, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I

    .line 755
    return v0
.end method

.method public setDataModel(Landroid/support/v7/internal/widget/ActivityChooserModel;)V
    .locals 2
    .parameter "dataModel"

    .prologue
    .line 639
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$000(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->getDataModel()Landroid/support/v7/internal/widget/ActivityChooserModel;

    move-result-object v0

    .line 640
    .local v0, oldDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;
    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShown()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_0

    .line 641
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$1100(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/database/DataSetObserver;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->unregisterObserver(Ljava/lang/Object;)V

    .line 643
    :cond_0
    #v1=(Conflicted);
    iput-object p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mDataModel:Landroid/support/v7/internal/widget/ActivityChooserModel;

    .line 644
    if-eqz p1, :cond_1

    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->isShown()Z

    move-result v1

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 645
    iget-object v1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->this$0:Landroid/support/v7/internal/widget/ActivityChooserView;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v7/internal/widget/ActivityChooserView;->access$1100(Landroid/support/v7/internal/widget/ActivityChooserView;)Landroid/database/DataSetObserver;

    move-result-object v1

    invoke-virtual {p1, v1}, Landroid/support/v7/internal/widget/ActivityChooserModel;->registerObserver(Ljava/lang/Object;)V

    .line 647
    :cond_1
    #v1=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->notifyDataSetChanged()V

    .line 648
    return-void
.end method

.method public setMaxActivityCount(I)V
    .locals 1
    .parameter "maxActivityCount"

    .prologue
    .line 759
    iget v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I

    #v0=(Integer);
    if-eq v0, p1, :cond_0

    .line 760
    iput p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mMaxActivityCount:I

    .line 761
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->notifyDataSetChanged()V

    .line 763
    :cond_0
    return-void
.end method

.method public setShowDefaultActivity(ZZ)V
    .locals 1
    .parameter "showDefaultActivity"
    .parameter "highlightDefaultActivity"

    .prologue
    .line 794
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z

    #v0=(Boolean);
    if-ne v0, p1, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mHighlightDefaultActivity:Z

    if-eq v0, p2, :cond_1

    .line 796
    :cond_0
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowDefaultActivity:Z

    .line 797
    iput-boolean p2, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mHighlightDefaultActivity:Z

    .line 798
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->notifyDataSetChanged()V

    .line 800
    :cond_1
    return-void
.end method

.method public setShowFooterView(Z)V
    .locals 1
    .parameter "showFooterView"

    .prologue
    .line 770
    iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowFooterView:Z

    #v0=(Boolean);
    if-eq v0, p1, :cond_0

    .line 771
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->mShowFooterView:Z

    .line 772
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActivityChooserView$ActivityChooserViewAdapter;->notifyDataSetChanged()V

    .line 774
    :cond_0
    return-void
.end method

*/}
