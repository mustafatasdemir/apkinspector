package android.support.v7.internal.widget; class ListPopupWindow$1 {/*

.class Landroid/support/v7/internal/widget/ListPopupWindow$1;
.super Ljava/lang/Object;
.source "ListPopupWindow.java"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroid/support/v7/internal/widget/ListPopupWindow;->buildDropDown()I
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ListPopupWindow;


# direct methods
.method constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
    .locals 0
    .parameter

    .prologue
    .line 922
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$1;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 925
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$1;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->getAnchorView()Landroid/view/View;

    move-result-object v0

    .line 926
    .local v0, view:Landroid/view/View;
    #v0=(Reference);
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 927
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$1;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-virtual {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 929
    :cond_0
    return-void
.end method

*/}
