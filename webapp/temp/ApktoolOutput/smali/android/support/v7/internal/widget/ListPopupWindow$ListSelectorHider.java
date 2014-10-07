package android.support.v7.internal.widget; class ListPopupWindow$ListSelectorHider {/*

.class Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;
.super Ljava/lang/Object;
.source "ListPopupWindow.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "ListSelectorHider"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ListPopupWindow;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
    .locals 0
    .parameter

    .prologue
    .line 1371
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 1371
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 1374
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$ListSelectorHider;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->clearListSelection()V

    .line 1375
    return-void
.end method

*/}
