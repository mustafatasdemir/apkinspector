package android.support.v7.internal.widget; class AdapterViewICS$OnItemClickListenerWrapper {/*

.class Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;
.super Ljava/lang/Object;
.source "AdapterViewICS.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/AdapterViewICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "OnItemClickListenerWrapper"
.end annotation


# instance fields
.field private final mWrappedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

.field final synthetic this$0:Landroid/support/v7/internal/widget/AdapterViewICS;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
    .locals 0
    .parameter
    .parameter "listener"

    .prologue
    .line 265
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.OnItemClickListenerWrapper;"
    iput-object p1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 266
    #p0=(Reference);
    iput-object p2, p0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;->mWrappedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    .line 267
    return-void
.end method


# virtual methods
.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 6
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
    .line 271
    .local p0, this:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;,"Landroid/support/v7/internal/widget/AdapterViewICS<TT;>.OnItemClickListenerWrapper;"
    .local p1, parent:Landroid/widget/AdapterView;,"Landroid/widget/AdapterView<*>;"
    iget-object v0, p0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;->mWrappedListener:Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;

    #v0=(Reference);
    iget-object v1, p0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;->this$0:Landroid/support/v7/internal/widget/AdapterViewICS;

    #v1=(Reference);
    move-object v2, p2

    #v2=(Reference);
    move v3, p3

    #v3=(Integer);
    move-wide v4, p4

    #v4=(LongLo);v5=(LongHi);
    invoke-interface/range {v0 .. v5}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;->onItemClick(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/view/View;IJ)V

    .line 272
    return-void
.end method

*/}
