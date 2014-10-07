package android.support.v7.internal.widget; class SpinnerICS$DropdownPopup {/*

.class Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;
.super Landroid/support/v7/internal/widget/ListPopupWindow;
.source "SpinnerICS.java"

# interfaces
.implements Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroid/support/v7/internal/widget/SpinnerICS;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "DropdownPopup"
.end annotation


# instance fields
.field private mAdapter:Landroid/widget/ListAdapter;

.field private mHintText:Ljava/lang/CharSequence;

.field final synthetic this$0:Landroid/support/v7/internal/widget/SpinnerICS;


# direct methods
.method public constructor <init>(Landroid/support/v7/internal/widget/SpinnerICS;Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2
    .parameter
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyleRes"

    .prologue
    .line 698
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    .line 699
    invoke-direct {p0, p2, p3, p4}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 701
    #p0=(Reference);
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setAnchorView(Landroid/view/View;)V

    .line 702
    const/4 v1, 0x1

    #v1=(One);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setModal(Z)V

    .line 703
    const/4 v1, 0x0

    #v1=(Null);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setPromptPosition(I)V

    .line 705
    new-instance v0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;

    #v0=(UninitRef);
    new-instance v1, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;

    #v1=(UninitRef);
    invoke-direct {v1, p0, p1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;-><init>(Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;Landroid/support/v7/internal/widget/SpinnerICS;)V

    #v1=(Reference);
    invoke-direct {v0, p1, v1}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;-><init>(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V

    .line 716
    .local v0, listener:Landroid/widget/AdapterView$OnItemClickListener;
    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 717
    return-void
.end method

.method static synthetic access$100(Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;)Landroid/widget/ListAdapter;
    .locals 1
    .parameter "x0"

    .prologue
    .line 693
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mAdapter:Landroid/widget/ListAdapter;

    #v0=(Reference);
    return-object v0
.end method


# virtual methods
.method public getHintText()Ljava/lang/CharSequence;
    .locals 1

    .prologue
    .line 726
    iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mHintText:Ljava/lang/CharSequence;

    #v0=(Reference);
    return-object v0
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 0
    .parameter "adapter"

    .prologue
    .line 721
    invoke-super {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 722
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mAdapter:Landroid/widget/ListAdapter;

    .line 723
    return-void
.end method

.method public setPromptText(Ljava/lang/CharSequence;)V
    .locals 0
    .parameter "hintText"

    .prologue
    .line 731
    iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mHintText:Ljava/lang/CharSequence;

    .line 732
    return-void
.end method

.method public show()V
    .locals 8

    .prologue
    .line 736
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getPaddingLeft()I

    move-result v2

    .line 737
    .local v2, spinnerPaddingLeft:I
    #v2=(Integer);
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    iget v5, v5, Landroid/support/v7/internal/widget/SpinnerICS;->mDropDownWidth:I

    #v5=(Integer);
    const/4 v6, -0x2

    #v6=(Byte);
    if-ne v5, v6, :cond_1

    .line 738
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getWidth()I

    move-result v4

    .line 739
    .local v4, spinnerWidth:I
    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getPaddingRight()I

    move-result v3

    .line 740
    .local v3, spinnerPaddingRight:I
    #v3=(Integer);
    iget-object v6, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    #v6=(Reference);
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mAdapter:Landroid/widget/ListAdapter;

    check-cast v5, Landroid/widget/SpinnerAdapter;

    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v7

    #v7=(Reference);
    invoke-virtual {v6, v5, v7}, Landroid/support/v7/internal/widget/SpinnerICS;->measureContentWidth(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    move-result v5

    #v5=(Integer);
    sub-int v6, v4, v2

    #v6=(Integer);
    sub-int/2addr v6, v3

    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    move-result v5

    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setContentWidth(I)V

    .line 750
    .end local v3           #spinnerPaddingRight:I
    .end local v4           #spinnerWidth:I
    :goto_0
    #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 751
    .local v0, background:Landroid/graphics/drawable/Drawable;
    #v0=(Reference);
    const/4 v1, 0x0

    .line 752
    .local v1, bgOffset:I
    #v1=(Null);
    if-eqz v0, :cond_0

    .line 753
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    #v5=(Reference);
    invoke-static {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->access$200(Landroid/support/v7/internal/widget/SpinnerICS;)Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 754
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-static {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->access$200(Landroid/support/v7/internal/widget/SpinnerICS;)Landroid/graphics/Rect;

    move-result-object v5

    iget v5, v5, Landroid/graphics/Rect;->left:I

    #v5=(Integer);
    neg-int v1, v5

    .line 756
    :cond_0
    #v1=(Integer);
    add-int v5, v1, v2

    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setHorizontalOffset(I)V

    .line 757
    const/4 v5, 0x2

    #v5=(PosByte);
    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setInputMethodMode(I)V

    .line 758
    invoke-super {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V

    .line 759
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->getListView()Landroid/widget/ListView;

    move-result-object v5

    #v5=(Reference);
    const/4 v6, 0x1

    #v6=(One);
    invoke-virtual {v5, v6}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 760
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I

    move-result v5

    #v5=(Integer);
    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setSelection(I)V

    .line 761
    return-void

    .line 743
    .end local v0           #background:Landroid/graphics/drawable/Drawable;
    .end local v1           #bgOffset:I
    :cond_1
    #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Byte);v7=(Uninit);
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    #v5=(Reference);
    iget v5, v5, Landroid/support/v7/internal/widget/SpinnerICS;->mDropDownWidth:I

    #v5=(Integer);
    const/4 v6, -0x1

    if-ne v5, v6, :cond_2

    .line 744
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    #v5=(Reference);
    invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getWidth()I

    move-result v4

    .line 745
    .restart local v4       #spinnerWidth:I
    #v4=(Integer);
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getPaddingRight()I

    move-result v3

    .line 746
    .restart local v3       #spinnerPaddingRight:I
    #v3=(Integer);
    sub-int v5, v4, v2

    #v5=(Integer);
    sub-int/2addr v5, v3

    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setContentWidth(I)V

    goto :goto_0

    .line 748
    .end local v3           #spinnerPaddingRight:I
    .end local v4           #spinnerWidth:I
    :cond_2
    #v3=(Uninit);v4=(Uninit);
    iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;

    #v5=(Reference);
    iget v5, v5, Landroid/support/v7/internal/widget/SpinnerICS;->mDropDownWidth:I

    #v5=(Integer);
    invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setContentWidth(I)V

    goto :goto_0
.end method

*/}
