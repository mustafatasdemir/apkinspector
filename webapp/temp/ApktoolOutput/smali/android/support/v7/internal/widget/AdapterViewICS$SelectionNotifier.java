package android.support.v7.internal.widget; class AdapterViewICS$SelectionNotifier {/*

.class Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;
.super Ljava/lang/Object;
.source "AdapterViewICS.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/AdapterViewICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "SelectionNotifier"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/AdapterViewICS;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/AdapterViewICS;)V
    .locals 0
    .parameter

    .prologue
    .line 853
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.SelectionNotifier;"
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/support/v7/internal/widget/AdapterViewICS$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 853
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.SelectionNotifier;"
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;-><init>(Landroid/support/v7/internal/widget/AdapterViewICS;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 855
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.SelectionNotifier;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    #v0=(Reference);
    iget-boolean v0, v0, Landroid/support/v7/internal/widget/AdapterViewICS;->mDataChanged:Z

    #v0=(Boolean);
    if-eqz v0, :cond_1

    .line 859
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->getAdapter()Landroid/widget/Adapter;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 860
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-virtual {v0, p0}, Landroid/support/v7/internal/widget/AdapterViewICS;->post(Ljava/lang/Runnable;)Z

    .line 865
    :cond_0
    :goto_0
    return-void

    .line 863
    :cond_1
    #v0=(Boolean);
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$SelectionNotifier;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    #v0=(Reference);
    invoke-static {v0}, Landroid/support/v7/internal/widget/AdapterViewICS;->access$200(Landroid/support/v7/internal/widget/AdapterViewICS;)V

    goto :goto_0
.end method

*/}
