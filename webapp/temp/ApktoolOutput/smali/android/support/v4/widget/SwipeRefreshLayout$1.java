package android.support.v4.widget; class SwipeRefreshLayout$1 {/*

.class Landroid/support/v4/widget/SwipeRefreshLayout$1;
.super Landroid/view/animation/Animation;
.source "SwipeRefreshLayout.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/SwipeRefreshLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/widget/SwipeRefreshLayout;


# direct methods
.method constructor <init>(Landroid/support/v4/widget/SwipeRefreshLayout;)V
    .locals 0
    .parameter

    .prologue
    .line 99
    iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 6
    .parameter "interpolatedTime"
    .parameter "t"

    .prologue
    .line 102
    const/4 v2, 0x0

    .line 103
    .local v2, targetTop:I
    #v2=(Null);
    iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$000(Landroid/support/v4/widget/SwipeRefreshLayout;)I

    move-result v3

    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$100(Landroid/support/v4/widget/SwipeRefreshLayout;)I

    move-result v4

    #v4=(Integer);
    if-eq v3, v4, :cond_0

    .line 104
    iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$000(Landroid/support/v4/widget/SwipeRefreshLayout;)I

    move-result v3

    #v3=(Integer);
    iget-object v4, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v4=(Reference);
    invoke-static {v4}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$100(Landroid/support/v4/widget/SwipeRefreshLayout;)I

    move-result v4

    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v5=(Reference);
    invoke-static {v5}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$000(Landroid/support/v4/widget/SwipeRefreshLayout;)I

    move-result v5

    #v5=(Integer);
    sub-int/2addr v4, v5

    int-to-float v4, v4

    #v4=(Float);
    mul-float/2addr v4, p1

    float-to-int v4, v4

    #v4=(Integer);
    add-int v2, v3, v4

    .line 106
    :cond_0
    #v2=(Integer);v5=(Conflicted);
    iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$200(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v3

    #v3=(Integer);
    sub-int v1, v2, v3

    .line 107
    .local v1, offset:I
    #v1=(Integer);
    iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$200(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/view/View;

    move-result-object v3

    invoke-virtual {v3}, Landroid/view/View;->getTop()I

    move-result v0

    .line 108
    .local v0, currentTop:I
    #v0=(Integer);
    add-int v3, v1, v0

    #v3=(Integer);
    if-gez v3, :cond_1

    .line 109
    rsub-int/lit8 v1, v0, 0x0

    .line 111
    :cond_1
    iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$1;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v3=(Reference);
    invoke-static {v3, v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$300(Landroid/support/v4/widget/SwipeRefreshLayout;I)V

    .line 112
    return-void
.end method

*/}
