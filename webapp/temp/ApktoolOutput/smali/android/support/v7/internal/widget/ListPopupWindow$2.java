package android.support.v7.internal.widget; class ListPopupWindow$2 {/*

.class Landroid/support/v7/internal/widget/ListPopupWindow$2;
.super Ljava/lang/Object;
.source "ListPopupWindow.java"

# interfaces
.implements Landroid/widget/AdapterView$OnItemSelectedListener;


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
    .line 940
    iput-object p1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$2;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public onItemSelected(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2
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
    .line 944
    .local p1, parent:Landroid/widget/AdapterView;,"Landroid/widget/AdapterView<*>;"
    const/4 v1, -0x1

    #v1=(Byte);
    if-eq p3, v1, :cond_0

    .line 945
    iget-object v1, p0, Landroid/support/v7/internal/widget/ListPopupWindow$2;->this$0:Landroid/support/v7/internal/widget/ListPopupWindow;

    #v1=(Reference);
    invoke-static {v1}, Landroid/support/v7/internal/widget/ListPopupWindow;->access$700(Landroid/support/v7/internal/widget/ListPopupWindow;)Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;

    move-result-object v0

    .line 947
    .local v0, dropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 948
    const/4 v1, 0x0

    #v1=(Null);
    invoke-static {v0, v1}, Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;->access$502(Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;Z)Z

    .line 951
    .end local v0           #dropDownList:Landroid/support/v7/internal/widget/ListPopupWindow$DropDownListView;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);
    return-void
.end method

.method public onNothingSelected(Landroid/widget/AdapterView;)V
    .locals 0
    .parameter
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/widget/AdapterView",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 954
    .local p1, parent:Landroid/widget/AdapterView;,"Landroid/widget/AdapterView<*>;"
    return-void
.end method

*/}
