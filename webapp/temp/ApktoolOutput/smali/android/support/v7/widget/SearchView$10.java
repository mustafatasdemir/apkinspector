package android.support.v7.widget; class SearchView$10 {/*

.class Landroid/support/v7/widget/SearchView$10;
.super Ljava/lang/Object;
.source "SearchView.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/widget/SearchView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/widget/SearchView;


# direct methods
.method constructor <init>(Landroid/support/v7/widget/SearchView;)V
    .locals 0
    .parameter

    .prologue
    .line 1274
    iput-object p1, p0, Landroid/support/v7/widget/SearchView$10;->this$0:Landroid/support/v7/widget/SearchView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 3
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
    .line 1281
    .local p1, parent:Landroid/widget/AdapterView;,"Landroid/widget/AdapterView<*>;"
    iget-object v0, p0, Landroid/support/v7/widget/SearchView$10;->this$0:Landroid/support/v7/widget/SearchView;

    #v0=(Reference);
    const/4 v1, 0x0

    #v1=(Null);
    const/4 v2, 0x0

    #v2=(Null);
    invoke-static {v0, p3, v1, v2}, Landroid/support/v7/widget/SearchView;->access$1800(Landroid/support/v7/widget/SearchView;IILjava/lang/String;)Z

    .line 1282
    return-void
.end method

*/}
