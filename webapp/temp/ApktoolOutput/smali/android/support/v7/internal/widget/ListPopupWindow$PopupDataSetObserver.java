package android.support.v7.internal.widget; class ListPopupWindow$PopupDataSetObserver {/*

.class Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;
.super Landroid/database/DataSetObserver;
.source "ListPopupWindow.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/ListPopupWindow;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "PopupDataSetObserver"
.end annotation


# instance fields
.field final synthetic this$0:Landroid/support/v7/internal/widget/ListPopupWindow;


# direct methods
.method private constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V
    .locals 0
    .parameter

    .prologue
    .line 1355
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-direct {p0}, Landroid/database/DataSetObserver;-><init>()V

    #p0=(Reference);
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/internal/widget/ListPopupWindow;Landroid/support/v7/internal/widget/ListPopupWindow$1;)V
    .locals 0
    .parameter "x0"
    .parameter "x1"

    .prologue
    .line 1355
    invoke-direct {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;-><init>(Landroid/support/v7/internal/widget/ListPopupWindow;)V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onChanged()V
    .locals 1

    .prologue
    .line 1359
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    .line 1361
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 1363
    :cond_0
    #v0=(Conflicted);
    return-void
.end method

.method public onInvalidated()V
    .locals 1

    .prologue
    .line 1367
    iget-object v0, p0, Landroid/support/v7/internal/widget/ListPopupWindow$PopupDataSetObserver;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v0=(Reference);
    invoke-virtual {v0}, Landroid/support/v7/internal/widget/ListPopupWindow;->dismiss()V

    .line 1368
    return-void
.end method

*/}
