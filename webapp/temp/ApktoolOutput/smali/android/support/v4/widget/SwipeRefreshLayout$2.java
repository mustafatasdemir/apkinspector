package android.support.v4.widget; class SwipeRefreshLayout$2 {/*

.class Landroid/support/v4/widget/SwipeRefreshLayout$2;
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
    .line 115
    iput-object p1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$2;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    invoke-direct {p0}, Landroid/view/animation/Animation;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public applyTransformation(FLandroid/view/animation/Transformation;)V
    .locals 4
    .parameter "interpolatedTime"
    .parameter "t"

    .prologue
    .line 118
    iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$2;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$400(Landroid/support/v4/widget/SwipeRefreshLayout;)F

    move-result v1

    #v1=(Float);
    const/4 v2, 0x0

    #v2=(Null);
    iget-object v3, p0, Landroid/support/v4/widget/SwipeRefreshLayout$2;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v3=(Reference);
    invoke-static {v3}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$400(Landroid/support/v4/widget/SwipeRefreshLayout;)F

    move-result v3

    #v3=(Float);
    sub-float/2addr v2, v3

    #v2=(Float);
    mul-float/2addr v2, p1

    add-float v0, v1, v2

    .line 119
    .local v0, percent:F
    #v0=(Float);
    iget-object v1, p0, Landroid/support/v4/widget/SwipeRefreshLayout$2;->this$0:Landroid/support/v4/widget/SwipeRefreshLayout;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v4/widget/SwipeRefreshLayout;->access$500(Landroid/support/v4/widget/SwipeRefreshLayout;)Landroid/support/v4/widget/SwipeProgressBar;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/widget/SwipeProgressBar;->setTriggerPercentage(F)V

    .line 120
    return-void
.end method

*/}
