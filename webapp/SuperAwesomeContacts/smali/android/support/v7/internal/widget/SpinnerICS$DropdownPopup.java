package android.support.v7.internal.widget; class SpinnerICS$DropdownPopup { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;
a=0;// .super Landroid/support/v7/internal/widget/ListPopupWindow;
a=0;// .source "SpinnerICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x2
a=0;//     name = "DropdownPopup"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;// .field private mHintText:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field final synthetic this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/support/v7/internal/widget/SpinnerICS;Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 2
a=0;//     .param p2, "context"    # Landroid/content/Context;
a=0;//     .param p3, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p4, "defStyleRes"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 698
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     .line 699
a=0;//     invoke-direct {p0, p2, p3, p4}, Landroid/support/v7/internal/widget/ListPopupWindow;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 701
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;);
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setAnchorView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 702
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setModal(Z)V
a=0;// 
a=0;//     .line 703
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setPromptPosition(I)V
a=0;// 
a=0;//     .line 705
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;);
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;);
a=0;//     invoke-direct {v1, p0, p1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;-><init>(Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;Landroid/support/v7/internal/widget/SpinnerICS;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup$1;);
a=0;//     invoke-direct {v0, p1, v1}, Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;-><init>(Landroid/support/v7/internal/widget/AdapterViewICS;Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
a=0;// 
a=0;//     .line 716
a=0;//     .local v0, "listener":Landroid/widget/AdapterView$OnItemClickListener;
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListenerWrapper;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V
a=0;// 
a=0;//     .line 717
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$100(Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;)Landroid/widget/ListAdapter;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;
a=0;// 
a=0;//     .prologue
a=0;//     .line 693
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/widget/ListAdapter;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getHintText()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 726
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mHintText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/ListAdapter;)V
a=0;//     .locals 0
a=0;//     .param p1, "adapter"    # Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 721
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 722
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     .line 723
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPromptText(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "hintText"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 731
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mHintText:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 732
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public show()V
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 736
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 737
a=0;//     .local v2, "spinnerPaddingLeft":I
a=0;//     #v2=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     iget v5, v5, Landroid/support/v7/internal/widget/SpinnerICS;->mDropDownWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x2
a=0;// 
a=0;//     #v6=(Byte);
a=0;//     if-ne v5, v6, :cond_1
a=0;// 
a=0;//     .line 738
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 739
a=0;//     .local v4, "spinnerWidth":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 740
a=0;//     .local v3, "spinnerPaddingRight":I
a=0;//     #v3=(Integer);
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v6=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->mAdapter:Landroid/widget/ListAdapter;
a=0;// 
a=0;//     check-cast v5, Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v6, v5, v7}, Landroid/support/v7/internal/widget/SpinnerICS;->measureContentWidth(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int v6, v4, v2
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v6, v3
a=0;// 
a=0;//     invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setContentWidth(I)V
a=0;// 
a=0;//     .line 750
a=0;//     .end local v3    # "spinnerPaddingRight":I
a=0;//     .end local v4    # "spinnerWidth":I
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 751
a=0;//     .local v0, "background":Landroid/graphics/drawable/Drawable;
a=0;//     #v0=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 752
a=0;//     .local v1, "bgOffset":I
a=0;//     #v1=(Null);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 753
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     invoke-static {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->access$200(Landroid/support/v7/internal/widget/SpinnerICS;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v0, v5}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 754
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-static {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->access$200(Landroid/support/v7/internal/widget/SpinnerICS;)Landroid/graphics/Rect;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     neg-int v1, v5
a=0;// 
a=0;//     .line 756
a=0;//     :cond_0
a=0;//     #v1=(Integer);
a=0;//     add-int v5, v1, v2
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setHorizontalOffset(I)V
a=0;// 
a=0;//     .line 757
a=0;//     const/4 v5, 0x2
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setInputMethodMode(I)V
a=0;// 
a=0;//     .line 758
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/ListPopupWindow;->show()V
a=0;// 
a=0;//     .line 759
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->getListView()Landroid/widget/ListView;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/widget/ListView;);
a=0;//     const/4 v6, 0x1
a=0;// 
a=0;//     #v6=(One);
a=0;//     invoke-virtual {v5, v6}, Landroid/widget/ListView;->setChoiceMode(I)V
a=0;// 
a=0;//     .line 760
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setSelection(I)V
a=0;// 
a=0;//     .line 761
a=0;//     return-void
a=0;// 
a=0;//     .line 743
a=0;//     .end local v0    # "background":Landroid/graphics/drawable/Drawable;
a=0;//     .end local v1    # "bgOffset":I
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Byte);v7=(Uninit);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     iget v5, v5, Landroid/support/v7/internal/widget/SpinnerICS;->mDropDownWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     if-ne v5, v6, :cond_2
a=0;// 
a=0;//     .line 744
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 745
a=0;//     .restart local v4    # "spinnerWidth":I
a=0;//     #v4=(Integer);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/widget/SpinnerICS;->getPaddingRight()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 746
a=0;//     .restart local v3    # "spinnerPaddingRight":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v5, v4, v2
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v5, v3
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setContentWidth(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 748
a=0;//     .end local v3    # "spinnerPaddingRight":I
a=0;//     .end local v4    # "spinnerWidth":I
a=0;//     :cond_2
a=0;//     #v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->this$0:Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     iget v5, v5, Landroid/support/v7/internal/widget/SpinnerICS;->mDropDownWidth:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setContentWidth(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
