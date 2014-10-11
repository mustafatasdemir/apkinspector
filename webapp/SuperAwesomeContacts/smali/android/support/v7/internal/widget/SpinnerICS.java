package android.support.v7.internal.widget; class SpinnerICS { void a() { int a;
a=0;// .class Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// .super Landroid/support/v7/internal/widget/AbsSpinnerICS;
a=0;// .source "SpinnerICS.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Landroid/content/DialogInterface$OnClickListener;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/MemberClasses;
a=0;//     value = {
a=0;//         Landroid/support/v7/internal/widget/SpinnerICS$1;,
a=0;//         Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;,
a=0;//         Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;,
a=0;//         Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;,
a=0;//         Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
a=0;//     }
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final MAX_ITEMS_MEASURED:I = 0xf
a=0;// 
a=0;// .field static final MODE_DIALOG:I = 0x0
a=0;// 
a=0;// .field static final MODE_DROPDOWN:I = 0x1
a=0;// 
a=0;// .field private static final MODE_THEME:I = -0x1
a=0;// 
a=0;// .field private static final TAG:Ljava/lang/String; = "Spinner"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field mDropDownWidth:I
a=0;// 
a=0;// .field private mGravity:I
a=0;// 
a=0;// .field private mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;// .field private mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
a=0;// 
a=0;// .field private mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 85
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;I)V
a=0;//     .locals 2
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 100
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     sget v1, Landroid/support/v7/appcompat/R$attr;->spinnerStyle:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-direct {p0, p1, v0, v1, p2}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;// 
a=0;//     .line 101
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 111
a=0;//     sget v0, Landroid/support/v7/appcompat/R$attr;->spinnerStyle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 112
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 127
a=0;//     const/4 v0, -0x1
a=0;// 
a=0;//     #v0=(Byte);
a=0;//     invoke-direct {p0, p1, p2, p3, v0}, Landroid/support/v7/internal/widget/SpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;// 
a=0;//     .line 128
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V
a=0;//     .locals 8
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;//     .param p4, "mode"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     #v7=(Null);
a=0;//     const/4 v6, 0x0
a=0;// 
a=0;//     .line 148
a=0;//     #v6=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/internal/widget/AbsSpinnerICS;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 75
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS;);
a=0;//     new-instance v4, Landroid/graphics/Rect;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/graphics/Rect;);
a=0;//     invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/Rect;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     .line 150
a=0;//     sget-object v4, Landroid/support/v7/appcompat/R$styleable;->Spinner:[I
a=0;// 
a=0;//     invoke-virtual {p1, p2, v4, p3, v6}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 153
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v4, -0x1
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     if-ne p4, v4, :cond_0
a=0;// 
a=0;//     .line 154
a=0;//     const/4 v4, 0x7
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result p4
a=0;// 
a=0;//     .line 157
a=0;//     :cond_0
a=0;//     #v4=(Byte);
a=0;//     packed-switch p4, :pswitch_data_0
a=0;// 
a=0;//     .line 189
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     const/16 v4, 0x11
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v6, v4}, Landroid/content/res/TypedArray;->getInt(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mGravity:I
a=0;// 
a=0;//     .line 191
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;);
a=0;//     const/4 v5, 0x6
a=0;// 
a=0;//     #v5=(PosByte);
a=0;//     invoke-virtual {v0, v5}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v4, v5}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->setPromptText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 193
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 198
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
a=0;// 
a=0;//     invoke-interface {v4, v5}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 199
a=0;//     iput-object v7, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
a=0;// 
a=0;//     .line 201
a=0;//     :cond_1
a=0;//     return-void
a=0;// 
a=0;//     .line 159
a=0;//     :pswitch_0
a=0;//     #v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Byte);v5=(Uninit);
a=0;//     new-instance v4, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;);
a=0;//     invoke-direct {v4, p0, v7}, Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;-><init>(Landroid/support/v7/internal/widget/SpinnerICS;Landroid/support/v7/internal/widget/SpinnerICS$1;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$DialogPopup;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 164
a=0;//     :pswitch_1
a=0;//     #v4=(Byte);
a=0;//     new-instance v2, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;);
a=0;//     invoke-direct {v2, p0, p1, p2, p3}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;-><init>(Landroid/support/v7/internal/widget/SpinnerICS;Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 166
a=0;//     .local v2, "popup":Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;);
a=0;//     const/4 v4, 0x3
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     const/4 v5, -0x2
a=0;// 
a=0;//     #v5=(Byte);
a=0;//     invoke-virtual {v0, v4, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mDropDownWidth:I
a=0;// 
a=0;//     .line 169
a=0;//     const/4 v4, 0x2
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2, v4}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 172
a=0;//     const/4 v4, 0x5
a=0;// 
a=0;//     #v4=(PosByte);
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 174
a=0;//     .local v3, "verticalOffset":I
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_2
a=0;// 
a=0;//     .line 175
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setVerticalOffset(I)V
a=0;// 
a=0;//     .line 178
a=0;//     :cond_2
a=0;//     const/4 v4, 0x4
a=0;// 
a=0;//     invoke-virtual {v0, v4, v6}, Landroid/content/res/TypedArray;->getDimensionPixelOffset(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 180
a=0;//     .local v1, "horizontalOffset":I
a=0;//     #v1=(Integer);
a=0;//     if-eqz v1, :cond_3
a=0;// 
a=0;//     .line 181
a=0;//     invoke-virtual {v2, v1}, Landroid/support/v7/internal/widget/SpinnerICS$DropdownPopup;->setHorizontalOffset(I)V
a=0;// 
a=0;//     .line 184
a=0;//     :cond_3
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 157
a=0;//     :pswitch_data_0
a=0;//     .packed-switch 0x0
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method static synthetic access$200(Landroid/support/v7/internal/widget/SpinnerICS;)Landroid/graphics/Rect;
a=0;//     .locals 1
a=0;//     .param p0, "x0"    # Landroid/support/v7/internal/widget/SpinnerICS;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v0=(Reference,Landroid/graphics/Rect;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method private makeAndAddView(I)Landroid/view/View;
a=0;//     .locals 4
a=0;//     .param p1, "position"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 372
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mDataChanged:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 373
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;);
a=0;//     invoke-virtual {v2, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->get(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 374
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 376
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/SpinnerICS;->setUpChild(Landroid/view/View;)V
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 388
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .local v1, "child":Landroid/view/View;
a=0;//     :goto_0
a=0;//     #v1=(Reference,Landroid/view/View;);v3=(Conflicted);
a=0;//     return-object v1
a=0;// 
a=0;//     .line 383
a=0;//     .end local v1    # "child":Landroid/view/View;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Uninit);v2=(Conflicted);v3=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-interface {v2, p1, v3, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 386
a=0;//     .restart local v0    # "child":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     invoke-direct {p0, v0}, Landroid/support/v7/internal/widget/SpinnerICS;->setUpChild(Landroid/view/View;)V
a=0;// 
a=0;//     move-object v1, v0
a=0;// 
a=0;//     .line 388
a=0;//     .end local v0    # "child":Landroid/view/View;
a=0;//     .restart local v1    # "child":Landroid/view/View;
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private setUpChild(Landroid/view/View;)V
a=0;//     .locals 11
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 401
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 402
a=0;//     .local v6, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v6=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-nez v6, :cond_0
a=0;// 
a=0;//     .line 403
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 406
a=0;//     :cond_0
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     #v8=(Null);
a=0;//     invoke-virtual {p0, p1, v8, v6}, Landroid/support/v7/internal/widget/SpinnerICS;->addViewInLayout(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)Z
a=0;// 
a=0;//     .line 408
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->hasFocus()Z
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     #v8=(Boolean);
a=0;//     invoke-virtual {p1, v8}, Landroid/view/View;->setSelected(Z)V
a=0;// 
a=0;//     .line 411
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mHeightMeasureSpec:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v9, v9, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v10, v10, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     iget v10, v6, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     invoke-static {v8, v9, v10}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 413
a=0;//     .local v1, "childHeightSpec":I
a=0;//     #v1=(Integer);
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mWidthMeasureSpec:I
a=0;// 
a=0;//     iget-object v9, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v9=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v9, v9, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v10, v10, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/2addr v9, v10
a=0;// 
a=0;//     iget v10, v6, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     invoke-static {v8, v9, v10}, Landroid/view/ViewGroup;->getChildMeasureSpec(III)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 417
a=0;//     .local v5, "childWidthSpec":I
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p1, v5, v1}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 423
a=0;//     iget-object v8, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v8=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v8, v8, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v10, v10, Landroid/graphics/Rect;->bottom:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-int/2addr v9, v10
a=0;// 
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v10, v10, Landroid/graphics/Rect;->top:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     sub-int/2addr v9, v10
a=0;// 
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     sub-int/2addr v9, v10
a=0;// 
a=0;//     div-int/lit8 v9, v9, 0x2
a=0;// 
a=0;//     add-int v4, v8, v9
a=0;// 
a=0;//     .line 426
a=0;//     .local v4, "childTop":I
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     add-int v0, v4, v8
a=0;// 
a=0;//     .line 428
a=0;//     .local v0, "childBottom":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 429
a=0;//     .local v7, "width":I
a=0;//     #v7=(Integer);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 430
a=0;//     .local v2, "childLeft":I
a=0;//     #v2=(Null);
a=0;//     add-int v3, v2, v7
a=0;// 
a=0;//     .line 432
a=0;//     .local v3, "childRight":I
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {p1, v2, v4, v3, v0}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 433
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getBaseline()I
a=0;//     .locals 5
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, -0x1
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 234
a=0;//     #v4=(Null);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 236
a=0;//     .local v0, "child":Landroid/view/View;
a=0;//     #v0=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_2
a=0;// 
a=0;//     .line 237
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/SpinnerICS;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 244
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Reference,Landroid/view/View;);v3=(Conflicted);
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 245
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getBaseline()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 246
a=0;//     .local v1, "childBaseline":I
a=0;//     #v1=(Integer);
a=0;//     if-ltz v1, :cond_1
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/view/View;->getTop()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     add-int/2addr v2, v1
a=0;// 
a=0;//     .line 248
a=0;//     .end local v1    # "childBaseline":I
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return v2
a=0;// 
a=0;//     .line 238
a=0;//     :cond_2
a=0;//     #v0=(Null);v1=(Uninit);v2=(Byte);v3=(Integer);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mAdapter:Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     invoke-interface {v3}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-lez v3, :cond_0
a=0;// 
a=0;//     .line 239
a=0;//     invoke-direct {p0, v4}, Landroid/support/v7/internal/widget/SpinnerICS;->makeAndAddView(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 240
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;
a=0;// 
a=0;//     #v3=(Reference,Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;);
a=0;//     invoke-virtual {v3, v4, v0}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->put(ILandroid/view/View;)V
a=0;// 
a=0;//     .line 241
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->removeAllViewsInLayout()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getPrompt()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 475
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;);
a=0;//     invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->getHintText()Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method layout(IZ)V
a=0;//     .locals 8
a=0;//     .param p1, "delta"    # I
a=0;//     .param p2, "animate"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 310
a=0;//     #v7=(Null);
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v0, v5, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     .line 311
a=0;//     .local v0, "childrenLeft":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getLeft()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v6, v6, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int/2addr v5, v6
a=0;// 
a=0;//     iget-object v6, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSpinnerPadding:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v6=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v6, v6, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v6=(Integer);
a=0;//     sub-int v1, v5, v6
a=0;// 
a=0;//     .line 313
a=0;//     .local v1, "childrenWidth":I
a=0;//     #v1=(Integer);
a=0;//     iget-boolean v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mDataChanged:Z
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     .line 314
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->handleDataChanged()V
a=0;// 
a=0;//     .line 318
a=0;//     :cond_0
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mItemCount:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_1
a=0;// 
a=0;//     .line 319
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->resetList()V
a=0;// 
a=0;//     .line 357
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 323
a=0;//     :cond_1
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     if-ltz v5, :cond_2
a=0;// 
a=0;//     .line 324
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mNextSelectedPosition:I
a=0;// 
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelectedPositionInt(I)V
a=0;// 
a=0;//     .line 327
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->recycleAllViews()V
a=0;// 
a=0;//     .line 330
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->removeAllViewsInLayout()V
a=0;// 
a=0;//     .line 333
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSelectedPosition:I
a=0;// 
a=0;//     iput v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mFirstPosition:I
a=0;// 
a=0;//     .line 334
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSelectedPosition:I
a=0;// 
a=0;//     invoke-direct {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS;->makeAndAddView(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 335
a=0;//     .local v2, "sel":Landroid/view/View;
a=0;//     #v2=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 336
a=0;//     .local v4, "width":I
a=0;//     #v4=(Integer);
a=0;//     move v3, v0
a=0;// 
a=0;//     .line 337
a=0;//     .local v3, "selectedOffset":I
a=0;//     #v3=(Integer);
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mGravity:I
a=0;// 
a=0;//     and-int/lit8 v5, v5, 0x7
a=0;// 
a=0;//     sparse-switch v5, :sswitch_data_0
a=0;// 
a=0;//     .line 345
a=0;//     :goto_1
a=0;//     invoke-virtual {v2, v3}, Landroid/view/View;->offsetLeftAndRight(I)V
a=0;// 
a=0;//     .line 348
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mRecycler:Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;
a=0;// 
a=0;//     #v5=(Reference,Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;);
a=0;//     invoke-virtual {v5}, Landroid/support/v7/internal/widget/AbsSpinnerICS$RecycleBin;->clear()V
a=0;// 
a=0;//     .line 350
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->invalidate()V
a=0;// 
a=0;//     .line 352
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->checkSelectionChanged()V
a=0;// 
a=0;//     .line 354
a=0;//     iput-boolean v7, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mDataChanged:Z
a=0;// 
a=0;//     .line 355
a=0;//     iput-boolean v7, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mNeedSync:Z
a=0;// 
a=0;//     .line 356
a=0;//     iget v5, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mSelectedPosition:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {p0, v5}, Landroid/support/v7/internal/widget/SpinnerICS;->setNextSelectedPositionInt(I)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 339
a=0;//     :sswitch_0
a=0;//     div-int/lit8 v5, v1, 0x2
a=0;// 
a=0;//     add-int/2addr v5, v0
a=0;// 
a=0;//     div-int/lit8 v6, v4, 0x2
a=0;// 
a=0;//     sub-int v3, v5, v6
a=0;// 
a=0;//     .line 340
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 342
a=0;//     :sswitch_1
a=0;//     add-int v5, v0, v1
a=0;// 
a=0;//     sub-int v3, v5, v4
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 337
a=0;//     :sswitch_data_0
a=0;//     .sparse-switch
a=0;//         0x1 -> :sswitch_0
a=0;//         0x5 -> :sswitch_1
a=0;//     .end sparse-switch
a=0;// .end method
a=0;// 
a=0;// .method measureContentWidth(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
a=0;//     .locals 13
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;//     .param p2, "background"    # Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .prologue
a=0;//     .line 479
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     .line 480
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 519
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Integer);v9=(Conflicted);v10=(Conflicted);v11=(Conflicted);v12=(Conflicted);
a=0;//     return v8
a=0;// 
a=0;//     .line 483
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v12=(Uninit);
a=0;//     const/4 v8, 0x0
a=0;// 
a=0;//     .line 484
a=0;//     .local v8, "width":I
a=0;//     #v8=(Null);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 485
a=0;//     .local v5, "itemView":Landroid/view/View;
a=0;//     #v5=(Null);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 486
a=0;//     .local v4, "itemType":I
a=0;//     #v4=(Null);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     #v11=(Null);
a=0;//     invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 488
a=0;//     .local v9, "widthMeasureSpec":I
a=0;//     #v9=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     const/4 v11, 0x0
a=0;// 
a=0;//     invoke-static {v10, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 493
a=0;//     .local v2, "heightMeasureSpec":I
a=0;//     #v2=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getSelectedItemPosition()I
a=0;// 
a=0;//     move-result v11
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 494
a=0;//     .local v7, "start":I
a=0;//     #v7=(Integer);
a=0;//     invoke-interface {p1}, Landroid/widget/SpinnerAdapter;->getCount()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     add-int/lit8 v11, v7, 0xf
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     .line 495
a=0;//     .local v1, "end":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v0, v1, v7
a=0;// 
a=0;//     .line 496
a=0;//     .local v0, "count":I
a=0;//     #v0=(Integer);
a=0;//     const/4 v10, 0x0
a=0;// 
a=0;//     #v10=(Null);
a=0;//     rsub-int/lit8 v11, v0, 0xf
a=0;// 
a=0;//     sub-int v11, v7, v11
a=0;// 
a=0;//     invoke-static {v10, v11}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 497
a=0;//     move v3, v7
a=0;// 
a=0;//     .local v3, "i":I
a=0;//     :goto_1
a=0;//     #v3=(Integer);v4=(Integer);v5=(Reference,Landroid/view/View;);v6=(Conflicted);v8=(Integer);v10=(Integer);v12=(Conflicted);
a=0;//     if-ge v3, v1, :cond_4
a=0;// 
a=0;//     .line 498
a=0;//     invoke-interface {p1, v3}, Landroid/widget/SpinnerAdapter;->getItemViewType(I)I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 499
a=0;//     .local v6, "positionType":I
a=0;//     #v6=(Integer);
a=0;//     if-eq v6, v4, :cond_2
a=0;// 
a=0;//     .line 500
a=0;//     move v4, v6
a=0;// 
a=0;//     .line 501
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 503
a=0;//     :cond_2
a=0;//     invoke-interface {p1, v3, v5, p0}, Landroid/widget/SpinnerAdapter;->getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 504
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v10
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-nez v10, :cond_3
a=0;// 
a=0;//     .line 505
a=0;//     new-instance v10, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v10=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v11, -0x2
a=0;// 
a=0;//     #v11=(Byte);
a=0;//     const/4 v12, -0x2
a=0;// 
a=0;//     #v12=(Byte);
a=0;//     invoke-direct {v10, v11, v12}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v10=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     invoke-virtual {v5, v10}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 509
a=0;//     :cond_3
a=0;//     #v11=(Integer);v12=(Conflicted);
a=0;//     invoke-virtual {v5, v9, v2}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 510
a=0;//     invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v10
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     invoke-static {v8, v10}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v8
a=0;// 
a=0;//     .line 497
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 514
a=0;//     .end local v6    # "positionType":I
a=0;//     :cond_4
a=0;//     #v6=(Conflicted);
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     .line 515
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v10=(Reference,Landroid/graphics/Rect;);
a=0;//     invoke-virtual {p2, v10}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z
a=0;// 
a=0;//     .line 516
a=0;//     iget-object v10, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     iget v10, v10, Landroid/graphics/Rect;->left:I
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     iget-object v11, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempRect:Landroid/graphics/Rect;
a=0;// 
a=0;//     #v11=(Reference,Landroid/graphics/Rect;);
a=0;//     iget v11, v11, Landroid/graphics/Rect;->right:I
a=0;// 
a=0;//     #v11=(Integer);
a=0;//     add-int/2addr v10, v11
a=0;// 
a=0;//     add-int/2addr v8, v10
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onClick(Landroid/content/DialogInterface;I)V
a=0;//     .locals 0
a=0;//     .param p1, "dialog"    # Landroid/content/DialogInterface;
a=0;//     .param p2, "which"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 451
a=0;//     invoke-virtual {p0, p2}, Landroid/support/v7/internal/widget/SpinnerICS;->setSelection(I)V
a=0;// 
a=0;//     .line 452
a=0;//     invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V
a=0;// 
a=0;//     .line 453
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 254
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 256
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->isShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 257
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;);
a=0;//     invoke-interface {v0}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->dismiss()V
a=0;// 
a=0;//     .line 259
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 2
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 296
a=0;//     #v1=(Null);
a=0;//     invoke-super/range {p0 .. p5}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->onLayout(ZIIII)V
a=0;// 
a=0;//     .line 297
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     iput-boolean v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mInLayout:Z
a=0;// 
a=0;//     .line 298
a=0;//     invoke-virtual {p0, v1, v1}, Landroid/support/v7/internal/widget/SpinnerICS;->layout(IZ)V
a=0;// 
a=0;//     .line 299
a=0;//     iput-boolean v1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mInLayout:Z
a=0;// 
a=0;//     .line 300
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 3
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 278
a=0;//     invoke-super {p0, p1, p2}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->onMeasure(II)V
a=0;// 
a=0;//     .line 279
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/high16 v2, -0x80000000
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ne v1, v2, :cond_0
a=0;// 
a=0;//     .line 280
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 281
a=0;//     .local v0, "measuredWidth":I
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getAdapter()Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/SpinnerAdapter;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getBackground()Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0, v1, v2}, Landroid/support/v7/internal/widget/SpinnerICS;->measureContentWidth(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     invoke-virtual {p0, v1, v2}, Landroid/support/v7/internal/widget/SpinnerICS;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 286
a=0;//     .end local v0    # "measuredWidth":I
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public performClick()Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 437
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->performClick()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 439
a=0;//     .local v0, "handled":Z
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 440
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 442
a=0;//     #v0=(One);
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;);
a=0;//     invoke-interface {v1}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->isShowing()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 443
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;);
a=0;//     invoke-interface {v1}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->show()V
a=0;// 
a=0;//     .line 447
a=0;//     :cond_0
a=0;//     #v0=(Boolean);v1=(Conflicted);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setAdapter(Landroid/widget/Adapter;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/widget/Adapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     check-cast p1, Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .end local p1    # "x0":Landroid/widget/Adapter;
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/SpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;//     .locals 2
a=0;//     .param p1, "adapter"    # Landroid/widget/SpinnerAdapter;
a=0;// 
a=0;//     .prologue
a=0;//     .line 223
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setAdapter(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     .line 225
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 226
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     new-instance v1, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
a=0;// 
a=0;//     #v1=(UninitRef,Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;);
a=0;//     invoke-direct {v1, p1}, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;-><init>(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;);
a=0;//     invoke-interface {v0, v1}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->setAdapter(Landroid/widget/ListAdapter;)V
a=0;// 
a=0;//     .line 230
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 228
a=0;//     :cond_0
a=0;//     #v1=(Uninit);
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;);
a=0;//     invoke-direct {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;-><init>(Landroid/widget/SpinnerAdapter;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mTempAdapter:Landroid/support/v7/internal/widget/SpinnerICS$DropDownAdapter;
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public setGravity(I)V
a=0;//     .locals 1
a=0;//     .param p1, "gravity"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 212
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mGravity:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq v0, p1, :cond_1
a=0;// 
a=0;//     .line 213
a=0;//     and-int/lit8 v0, p1, 0x7
a=0;// 
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 214
a=0;//     or-int/lit8 p1, p1, 0x3
a=0;// 
a=0;//     .line 216
a=0;//     :cond_0
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mGravity:I
a=0;// 
a=0;//     .line 217
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->requestLayout()V
a=0;// 
a=0;//     .line 219
a=0;//     :cond_1
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setOnItemClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
a=0;//     .locals 2
a=0;//     .param p1, "l"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 269
a=0;//     new-instance v0, Ljava/lang/RuntimeException;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/RuntimeException;);
a=0;//     const-string v1, "setOnItemClickListener cannot be used with a spinner."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/RuntimeException;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method setOnItemClickListenerInt(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
a=0;//     .locals 0
a=0;//     .param p1, "l"    # Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;
a=0;// 
a=0;//     .prologue
a=0;//     .line 273
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsSpinnerICS;->setOnItemClickListener(Landroid/support/v7/internal/widget/AdapterViewICS$OnItemClickListener;)V
a=0;// 
a=0;//     .line 274
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPrompt(Ljava/lang/CharSequence;)V
a=0;//     .locals 1
a=0;//     .param p1, "prompt"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 460
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/SpinnerICS;->mPopup:Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;);
a=0;//     invoke-interface {v0, p1}, Landroid/support/v7/internal/widget/SpinnerICS$SpinnerPopup;->setPromptText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 461
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setPromptId(I)V
a=0;//     .locals 1
a=0;//     .param p1, "promptId"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 468
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/SpinnerICS;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v0, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/SpinnerICS;->setPrompt(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 469
a=0;//     return-void
a=0;// .end method
}}
