package android.support.v4.widget; class ContentLoadingProgressBar$1 {/*

.class Landroid/support/v4/widget/ContentLoadingProgressBar$1;
.super Ljava/lang/Object;
.source "ContentLoadingProgressBar.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v4/widget/ContentLoadingProgressBar;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v4/widget/ContentLoadingProgressBar;


# direct methods
.method constructor <init>(Landroid/support/v4/widget/ContentLoadingProgressBar;)V
    .locals 0
    .parameter

    .prologue
    .line 42
    iput-object p1, p0, Landroid/support/v4/widget/ContentLoadingProgressBar$1;->this$0:Landroid/support/v4/widget/ContentLoadingProgressBar;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 46
    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar$1;->this$0:Landroid/support/v4/widget/ContentLoadingProgressBar;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/support/v4/widget/ContentLoadingProgressBar;->access$002(Landroid/support/v4/widget/ContentLoadingProgressBar;Z)Z

    .line 47
    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar$1;->this$0:Landroid/support/v4/widget/ContentLoadingProgressBar;

    const-wide/16 v1, -0x1

    #v1=(LongLo);v2=(LongHi);
    invoke-static {v0, v1, v2}, Landroid/support/v4/widget/ContentLoadingProgressBar;->access$102(Landroid/support/v4/widget/ContentLoadingProgressBar;J)J

    .line 48
    iget-object v0, p0, Landroid/support/v4/widget/ContentLoadingProgressBar$1;->this$0:Landroid/support/v4/widget/ContentLoadingProgressBar;

    const/16 v1, 0x8

    #v1=(PosByte);
    invoke-virtual {v0, v1}, Landroid/support/v4/widget/ContentLoadingProgressBar;->setVisibility(I)V

    .line 49
    return-void
.end method

*/}
