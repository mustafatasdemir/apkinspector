package android.support.v7.internal.widget; class ScrollingTabContainerView$TabClickListener {/*

.class Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;
.super Ljava/lang/Object;
.source "ScrollingTabContainerView.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ScrollingTabContainerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "TabClickListener"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V
    .locals 0
    .parameter

    .prologue
    .line 471
    iput-object p1, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;Landroid/support/v7/internal/widget/ScrollingTabContainerView$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 471
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;-><init>(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 5
    .parameter "view"

    .prologue
    .line 474
    move-object v3, p1

    #v3=(Reference);
    check-cast v3, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;

    .line 475
    .local v3, tabView:Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;
    invoke-virtual {v3}, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabView;->getTab()Landroid/support/v7/app/ActionBar$Tab;

    move-result-object v4

    #v4=(Reference);
    invoke-virtual {v4}, Landroid/support/v7/app/ActionBar$Tab;->select()V

    .line 476
    iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    invoke-static {v4}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->access$200(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/LinearLayout;->getChildCount()I

    move-result v2

    .line 477
    .local v2, tabCount:I
    #v2=(Integer);
    const/4 v1, 0x0

    .local v1, i:I
    :goto_0
    #v0=(Conflicted);v1=(Integer);v4=(Conflicted);
    if-ge v1, v2, :cond_1

    .line 478
    iget-object v4, p0, Landroid/support/v7/internal/widget/ScrollingTabContainerView$TabClickListener;->this$0:Landroid/support/v7/internal/widget/ScrollingTabContainerView;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v7/internal/widget/ScrollingTabContainerView;->access$200(Landroid/support/v7/internal/widget/ScrollingTabContainerView;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    .line 479
    .local v0, child:Landroid/view/View;
    #v0=(Reference);
    if-ne v0, p1, :cond_0

    const/4 v4, 0x1

    :goto_1
    #v4=(Boolean);
    invoke-virtual {v0, v4}, Landroid/view/View;->setSelected(Z)V

    .line 477
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 479
    :cond_0
    #v4=(Reference);
    const/4 v4, 0x0

    #v4=(Null);
    goto :goto_1

    .line 481
    .end local v0           #child:Landroid/view/View;
    :cond_1
    #v0=(Conflicted);v4=(Conflicted);
    return-void
.end method

*/}
