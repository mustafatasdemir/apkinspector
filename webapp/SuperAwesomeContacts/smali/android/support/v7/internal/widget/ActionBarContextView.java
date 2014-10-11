package android.support.v7.internal.widget; class ActionBarContextView { void a() { int a;
a=0;// .class public Landroid/support/v7/internal/widget/ActionBarContextView;
a=0;// .super Landroid/support/v7/internal/widget/AbsActionBarView;
a=0;// .source "ActionBarContextView.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final TAG:Ljava/lang/String; = "ActionBarContextView"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private mClose:Landroid/view/View;
a=0;// 
a=0;// .field private mCustomView:Landroid/view/View;
a=0;// 
a=0;// .field private mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;// .field private mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mSubtitleStyleRes:I
a=0;// 
a=0;// .field private mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;// .field private mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;// .field private mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;// .field private mTitleOptional:Z
a=0;// 
a=0;// .field private mTitleStyleRes:I
a=0;// 
a=0;// .field private mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 55
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0, p1, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 56
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 59
a=0;//     sget v0, Landroid/support/v7/appcompat/R$attr;->actionModeStyle:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 60
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 3
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 63
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/internal/widget/AbsActionBarView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 65
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     sget-object v1, Landroid/support/v7/appcompat/R$styleable;->ActionMode:[I
a=0;// 
a=0;//     #v1=(Reference,[I);
a=0;//     invoke-virtual {p1, p2, v1, p3, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 66
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     const/4 v1, 0x3
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 68
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleStyleRes:I
a=0;// 
a=0;//     .line 70
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleStyleRes:I
a=0;// 
a=0;//     .line 73
a=0;//     invoke-virtual {v0, v2, v2}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     iput v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     .line 76
a=0;//     const/4 v1, 0x4
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     iput-object v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     .line 79
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 80
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private initTitle()V
a=0;//     .locals 9
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     #v6=(PosByte);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 167
a=0;//     #v5=(Null);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-nez v3, :cond_1
a=0;// 
a=0;//     .line 168
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v3}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 169
a=0;//     .local v2, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v2=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v3, Landroid/support/v7/appcompat/R$layout;->abc_action_bar_title_item:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     invoke-virtual {v2, v3, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getChildCount()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     add-int/lit8 v3, v3, -0x1
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ActionBarContextView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/View;);
a=0;//     check-cast v3, Landroid/widget/LinearLayout;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 171
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_title:I
a=0;// 
a=0;//     #v7=(Integer);
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 172
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     sget v7, Landroid/support/v7/appcompat/R$id;->action_bar_subtitle:I
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     check-cast v3, Landroid/widget/TextView;
a=0;// 
a=0;//     iput-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     .line 173
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleStyleRes:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 174
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleStyleRes:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 176
a=0;//     :cond_0
a=0;//     #v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleStyleRes:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     #v7=(Reference,Landroid/content/Context;);
a=0;//     iget v8, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleStyleRes:I
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     invoke-virtual {v3, v7, v8}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V
a=0;// 
a=0;//     .line 181
a=0;//     .end local v2    # "inflater":Landroid/view/LayoutInflater;
a=0;//     :cond_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);v7=(Conflicted);v8=(Conflicted);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/TextView;);
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 182
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     iget-object v7, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-virtual {v3, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
a=0;// 
a=0;//     .line 184
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_5
a=0;// 
a=0;//     move v1, v4
a=0;// 
a=0;//     .line 185
a=0;//     .local v1, "hasTitle":Z
a=0;//     :goto_0
a=0;//     #v1=(Boolean);
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/CharSequence;);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-nez v3, :cond_6
a=0;// 
a=0;//     move v0, v4
a=0;// 
a=0;//     .line 186
a=0;//     .local v0, "hasSubtitle":Z
a=0;//     :goto_1
a=0;//     #v0=(Boolean);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitleView:Landroid/widget/TextView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/TextView;);
a=0;//     if-eqz v0, :cond_7
a=0;// 
a=0;//     move v3, v5
a=0;// 
a=0;//     :goto_2
a=0;//     #v3=(PosByte);
a=0;//     invoke-virtual {v4, v3}, Landroid/widget/TextView;->setVisibility(I)V
a=0;// 
a=0;//     .line 187
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v3=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     :cond_2
a=0;//     move v6, v5
a=0;// 
a=0;//     :cond_3
a=0;//     invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 188
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/widget/LinearLayout;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     if-nez v3, :cond_4
a=0;// 
a=0;//     .line 189
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v3}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 191
a=0;//     :cond_4
a=0;//     return-void
a=0;// 
a=0;//     .end local v0    # "hasSubtitle":Z
a=0;//     .end local v1    # "hasTitle":Z
a=0;//     :cond_5
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Boolean);v4=(One);
a=0;//     move v1, v5
a=0;// 
a=0;//     .line 184
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .restart local v1    # "hasTitle":Z
a=0;//     :cond_6
a=0;//     #v1=(Boolean);
a=0;//     move v0, v5
a=0;// 
a=0;//     .line 185
a=0;//     #v0=(Null);
a=0;//     goto :goto_1
a=0;// 
a=0;//     .restart local v0    # "hasSubtitle":Z
a=0;//     :cond_7
a=0;//     #v0=(Boolean);v4=(Reference,Landroid/widget/TextView;);
a=0;//     move v3, v6
a=0;// 
a=0;//     .line 186
a=0;//     #v3=(PosByte);
a=0;//     goto :goto_2
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public bridge synthetic animateToVisibility(I)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->animateToVisibility(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public closeMode()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 241
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 242
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->killMode()V
a=0;// 
a=0;//     .line 245
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic dismissPopupMenus()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->dismissPopupMenus()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 284
a=0;//     new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$MarginLayoutParams;);
a=0;//     const/4 v1, -0x1
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v1, v2}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$MarginLayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
a=0;//     .locals 2
a=0;//     .param p1, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 290
a=0;//     new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$MarginLayoutParams;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v0, v1, p1}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$MarginLayoutParams;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getAnimatedVisibility()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getAnimatedVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic getContentHeight()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContentHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getSubtitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 163
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public getTitle()Ljava/lang/CharSequence;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 159
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/CharSequence;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public hideOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 266
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 267
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 269
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public initForMode(Landroid/support/v7/view/ActionMode;)V
a=0;//     .locals 8
a=0;//     .param p1, "mode"    # Landroid/support/v7/view/ActionMode;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v7, 0x1
a=0;// 
a=0;//     #v7=(One);
a=0;//     const/4 v6, -0x1
a=0;// 
a=0;//     .line 194
a=0;//     #v6=(Byte);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-nez v4, :cond_2
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-static {v4}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 196
a=0;//     .local v1, "inflater":Landroid/view/LayoutInflater;
a=0;//     #v1=(Reference,Landroid/view/LayoutInflater;);
a=0;//     sget v4, Landroid/support/v7/appcompat/R$layout;->abc_action_mode_close_item:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v1, v4, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     .line 197
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 202
a=0;//     .end local v1    # "inflater":Landroid/view/LayoutInflater;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     sget v5, Landroid/support/v7/appcompat/R$id;->action_mode_close_button:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5}, Landroid/view/View;->findViewById(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 203
a=0;//     .local v0, "closeButton":Landroid/view/View;
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     new-instance v4, Landroid/support/v7/internal/widget/ActionBarContextView$1;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/widget/ActionBarContextView$1;);
a=0;//     invoke-direct {v4, p0, p1}, Landroid/support/v7/internal/widget/ActionBarContextView$1;-><init>(Landroid/support/v7/internal/widget/ActionBarContextView;Landroid/support/v7/view/ActionMode;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView$1;);
a=0;//     invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V
a=0;// 
a=0;//     .line 209
a=0;//     invoke-virtual {p1}, Landroid/support/v7/view/ActionMode;->getMenu()Landroid/view/Menu;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/view/Menu;);
a=0;//     check-cast v3, Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;// 
a=0;//     .line 210
a=0;//     .local v3, "menu":Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     .line 211
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z
a=0;// 
a=0;//     .line 213
a=0;//     :cond_1
a=0;//     new-instance v4, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(UninitRef,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     invoke-direct {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     .line 214
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, v7}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setReserveOverflow(Z)V
a=0;// 
a=0;//     .line 216
a=0;//     new-instance v2, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v2=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v4, -0x2
a=0;// 
a=0;//     #v4=(Byte);
a=0;//     invoke-direct {v2, v4, v6}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 219
a=0;//     .local v2, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget-boolean v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitActionBar:Z
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_3
a=0;// 
a=0;//     .line 220
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 221
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 222
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 223
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 238
a=0;//     :goto_1
a=0;//     #v5=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     return-void
a=0;// 
a=0;//     .line 198
a=0;//     .end local v0    # "closeButton":Landroid/view/View;
a=0;//     .end local v2    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v3    # "menu":Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     :cond_2
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Uninit);v5=(Uninit);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     if-nez v4, :cond_0
a=0;// 
a=0;//     .line 199
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v4}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 226
a=0;//     .restart local v0    # "closeButton":Landroid/view/View;
a=0;//     .restart local v2    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .restart local v3    # "menu":Landroid/support/v7/internal/view/menu/MenuBuilder;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/view/View;);v1=(Conflicted);v2=(Reference,Landroid/view/ViewGroup$LayoutParams;);v3=(Reference,Landroid/support/v7/internal/view/menu/MenuBuilder;);v4=(Boolean);v5=(Reference,Landroid/content/Context;);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     iget v5, v5, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v4, v5, v7}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V
a=0;// 
a=0;//     .line 229
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     const v5, 0x7fffffff
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V
a=0;// 
a=0;//     .line 231
a=0;//     iput v6, v2, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 232
a=0;//     iget v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     iput v4, v2, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 233
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v3, v4}, Landroid/support/v7/internal/view/menu/MenuBuilder;->addMenuPresenter(Landroid/support/v7/internal/view/menu/MenuPresenter;)V
a=0;// 
a=0;//     .line 234
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v4, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     check-cast v4, Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iput-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 235
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v5=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v4, v5}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 236
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v5, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v4, v5, v2}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public isOverflowMenuShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 274
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 275
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 277
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic isOverflowReserved()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->isOverflowReserved()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public isTitleOptional()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 414
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleOptional:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public killMode()V
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 248
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->removeAllViews()V
a=0;// 
a=0;//     .line 249
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 250
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     invoke-virtual {v0, v1}, Landroid/support/v7/internal/widget/ActionBarContainer;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 252
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     .line 253
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 254
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public onDetachedFromWindow()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 84
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->onDetachedFromWindow()V
a=0;// 
a=0;//     .line 85
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 86
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     .line 87
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideSubMenus()Z
a=0;// 
a=0;//     .line 89
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onLayout(ZIIII)V
a=0;//     .locals 7
a=0;//     .param p1, "changed"    # Z
a=0;//     .param p2, "l"    # I
a=0;//     .param p3, "t"    # I
a=0;//     .param p4, "r"    # I
a=0;//     .param p5, "b"    # I
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v6, 0x8
a=0;// 
a=0;//     .line 378
a=0;//     #v6=(PosByte);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 379
a=0;//     .local v2, "x":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 380
a=0;//     .local v3, "y":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v4, p5, p3
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     sub-int/2addr v4, v5
a=0;// 
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     sub-int v0, v4, v5
a=0;// 
a=0;//     .line 382
a=0;//     .local v0, "contentHeight":I
a=0;//     #v0=(Integer);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz v4, :cond_0
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, v6, :cond_0
a=0;// 
a=0;//     .line 383
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .line 385
a=0;//     .local v1, "lp":Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 386
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual {p0, v4, v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 387
a=0;//     iget v4, v1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I
a=0;// 
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 391
a=0;//     .end local v1    # "lp":Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {v4}, Landroid/widget/LinearLayout;->getVisibility()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     if-eq v4, v6, :cond_1
a=0;// 
a=0;//     .line 392
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     #v4=(Reference,Landroid/widget/LinearLayout;);
a=0;//     invoke-virtual {p0, v4, v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 395
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     #v4=(Reference,Landroid/view/View;);
a=0;//     if-eqz v4, :cond_2
a=0;// 
a=0;//     .line 396
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->positionChild(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     add-int/2addr v2, v4
a=0;// 
a=0;//     .line 399
a=0;//     :cond_2
a=0;//     #v4=(Conflicted);
a=0;//     sub-int v4, p4, p2
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     sub-int v2, v4, v5
a=0;// 
a=0;//     .line 401
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     #v4=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     if-eqz v4, :cond_3
a=0;// 
a=0;//     .line 402
a=0;//     iget-object v4, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {p0, v4, v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->positionChildInverse(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     sub-int/2addr v2, v4
a=0;// 
a=0;//     .line 404
a=0;//     :cond_3
a=0;//     #v4=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onMeasure(II)V
a=0;//     .locals 27
a=0;//     .param p1, "widthMeasureSpec"    # I
a=0;//     .param p2, "heightMeasureSpec"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 295
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v23
a=0;// 
a=0;//     .line 296
a=0;//     .local v23, "widthMode":I
a=0;//     #v23=(Integer);
a=0;//     const/high16 v24, 0x40000000
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     move/from16 v0, v23
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq v0, v1, :cond_0
a=0;// 
a=0;//     .line 297
a=0;//     new-instance v24, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const-string v26, " can only be used "
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const-string v26, "with android:layout_width=\"FILL_PARENT\" (or fill_parent)"
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-direct/range {v24 .. v25}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v24
a=0;// 
a=0;//     .line 301
a=0;//     :cond_0
a=0;//     #v24=(Integer);v25=(Uninit);v26=(Uninit);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getMode(I)I
a=0;// 
a=0;//     move-result v12
a=0;// 
a=0;//     .line 302
a=0;//     .local v12, "heightMode":I
a=0;//     #v12=(Integer);
a=0;//     if-nez v12, :cond_1
a=0;// 
a=0;//     .line 303
a=0;//     new-instance v24, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v24=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     new-instance v25, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v25=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct/range {v25 .. v25}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v25=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual/range {p0 .. p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     #v26=(Reference,Ljava/lang/Class;);
a=0;//     invoke-virtual/range {v26 .. v26}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v26
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const-string v26, " can only be used "
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     const-string v26, "with android:layout_height=\"wrap_content\""
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-virtual/range {v25 .. v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v25
a=0;// 
a=0;//     invoke-direct/range {v24 .. v25}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v24=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v24
a=0;// 
a=0;//     .line 307
a=0;//     :cond_1
a=0;//     #v24=(Integer);v25=(Uninit);v26=(Uninit);
a=0;//     invoke-static/range {p1 .. p1}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     .line 309
a=0;//     .local v5, "contentWidth":I
a=0;//     #v5=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     if-lez v24, :cond_8
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     iget v15, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     .line 312
a=0;//     .local v15, "maxHeight":I
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v15=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingTop()I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingBottom()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     add-int v22, v24, v25
a=0;// 
a=0;//     .line 313
a=0;//     .local v22, "verticalPadding":I
a=0;//     #v22=(Integer);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingLeft()I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     sub-int v24, v5, v24
a=0;// 
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getPaddingRight()I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     sub-int v3, v24, v25
a=0;// 
a=0;//     .line 314
a=0;//     .local v3, "availableWidth":I
a=0;//     #v3=(Integer);
a=0;//     sub-int v11, v15, v22
a=0;// 
a=0;//     .line 315
a=0;//     .local v11, "height":I
a=0;//     #v11=(Integer);
a=0;//     const/high16 v24, -0x80000000
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v11, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     .line 318
a=0;//     .local v4, "childSpecHeight":I
a=0;//     #v4=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/view/View;);
a=0;//     if-eqz v24, :cond_2
a=0;// 
a=0;//     .line 319
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/View;);
a=0;//     move/from16 v2, v25
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v3, v4, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->measureChildView(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 320
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mClose:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     #v14=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     check-cast v14, Landroid/view/ViewGroup$MarginLayoutParams;
a=0;// 
a=0;//     .line 322
a=0;//     .local v14, "lp":Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I
a=0;// 
a=0;//     move/from16 v25, v0
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     add-int v24, v24, v25
a=0;// 
a=0;//     sub-int v3, v3, v24
a=0;// 
a=0;//     .line 325
a=0;//     .end local v14    # "lp":Landroid/view/ViewGroup$MarginLayoutParams;
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v14=(Conflicted);v24=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuView;);
a=0;//     if-eqz v24, :cond_3
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v24
a=0;// 
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move-object/from16 v1, p0
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     if-ne v0, v1, :cond_3
a=0;// 
a=0;//     .line 326
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     move/from16 v2, v25
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v3, v4, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->measureChildView(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     .line 330
a=0;//     :cond_3
a=0;//     #v1=(Conflicted);v2=(Conflicted);v25=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     if-eqz v24, :cond_5
a=0;// 
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     if-nez v24, :cond_5
a=0;// 
a=0;//     .line 331
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-boolean v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleOptional:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Boolean);
a=0;//     if-eqz v24, :cond_b
a=0;// 
a=0;//     .line 332
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     #v24=(Null);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     invoke-static/range {v24 .. v25}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v20
a=0;// 
a=0;//     .line 334
a=0;//     .local v20, "titleWidthSpec":I
a=0;//     #v20=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move-object/from16 v0, v24
a=0;// 
a=0;//     move/from16 v1, v20
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v1, v4}, Landroid/widget/LinearLayout;->measure(II)V
a=0;// 
a=0;//     .line 335
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/widget/LinearLayout;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v19
a=0;// 
a=0;//     .line 336
a=0;//     .local v19, "titleWidth":I
a=0;//     #v19=(Integer);
a=0;//     move/from16 v0, v19
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-gt v0, v3, :cond_9
a=0;// 
a=0;//     const/16 v18, 0x1
a=0;// 
a=0;//     .line 337
a=0;//     .local v18, "titleFits":Z
a=0;//     :goto_1
a=0;//     #v18=(Boolean);
a=0;//     if-eqz v18, :cond_4
a=0;// 
a=0;//     .line 338
a=0;//     sub-int v3, v3, v19
a=0;// 
a=0;//     .line 340
a=0;//     :cond_4
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v25, v0
a=0;// 
a=0;//     #v25=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz v18, :cond_a
a=0;// 
a=0;//     const/16 v24, 0x0
a=0;// 
a=0;//     :goto_2
a=0;//     #v24=(PosByte);
a=0;//     move-object/from16 v0, v25
a=0;// 
a=0;//     move/from16 v1, v24
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V
a=0;// 
a=0;//     .line 346
a=0;//     .end local v18    # "titleFits":Z
a=0;//     .end local v19    # "titleWidth":I
a=0;//     .end local v20    # "titleWidthSpec":I
a=0;//     :cond_5
a=0;//     :goto_3
a=0;//     #v1=(Conflicted);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v24=(Conflicted);v25=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/view/View;);
a=0;//     if-eqz v24, :cond_6
a=0;// 
a=0;//     .line 347
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     move-result-object v14
a=0;// 
a=0;//     .line 348
a=0;//     .local v14, "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v14=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     const/16 v25, -0x2
a=0;// 
a=0;//     #v25=(Byte);
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     move/from16 v1, v25
a=0;// 
a=0;//     #v1=(Byte);
a=0;//     if-eq v0, v1, :cond_c
a=0;// 
a=0;//     const/high16 v10, 0x40000000
a=0;// 
a=0;//     .line 350
a=0;//     .local v10, "customWidthMode":I
a=0;//     :goto_4
a=0;//     #v10=(Integer);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     if-ltz v24, :cond_d
a=0;// 
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v9
a=0;// 
a=0;//     .line 352
a=0;//     .local v9, "customWidth":I
a=0;//     :goto_5
a=0;//     #v9=(Integer);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     const/16 v25, -0x2
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     move/from16 v1, v25
a=0;// 
a=0;//     if-eq v0, v1, :cond_e
a=0;// 
a=0;//     const/high16 v8, 0x40000000
a=0;// 
a=0;//     .line 354
a=0;//     .local v8, "customHeightMode":I
a=0;//     :goto_6
a=0;//     #v8=(Integer);
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     if-ltz v24, :cond_f
a=0;// 
a=0;//     iget v0, v14, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     move/from16 v0, v24
a=0;// 
a=0;//     invoke-static {v0, v11}, Ljava/lang/Math;->min(II)I
a=0;// 
a=0;//     move-result v7
a=0;// 
a=0;//     .line 356
a=0;//     .local v7, "customHeight":I
a=0;//     :goto_7
a=0;//     #v7=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/view/View;);
a=0;//     invoke-static {v9, v10}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v25
a=0;// 
a=0;//     #v25=(Integer);
a=0;//     invoke-static {v7, v8}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v26
a=0;// 
a=0;//     #v26=(Integer);
a=0;//     invoke-virtual/range {v24 .. v26}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 360
a=0;//     .end local v7    # "customHeight":I
a=0;//     .end local v8    # "customHeightMode":I
a=0;//     .end local v9    # "customWidth":I
a=0;//     .end local v10    # "customWidthMode":I
a=0;//     .end local v14    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_6
a=0;//     #v1=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v14=(Conflicted);v25=(Conflicted);v26=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     iget v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v24, v0
a=0;// 
a=0;//     #v24=(Integer);
a=0;//     if-gtz v24, :cond_11
a=0;// 
a=0;//     .line 361
a=0;//     const/16 v16, 0x0
a=0;// 
a=0;//     .line 362
a=0;//     .local v16, "measuredHeight":I
a=0;//     #v16=(Null);
a=0;//     invoke-virtual/range {p0 .. p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getChildCount()I
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     .line 363
a=0;//     .local v6, "count":I
a=0;//     #v6=(Integer);
a=0;//     const/4 v13, 0x0
a=0;// 
a=0;//     .local v13, "i":I
a=0;//     :goto_8
a=0;//     #v13=(Integer);v16=(Integer);v17=(Conflicted);v21=(Conflicted);
a=0;//     if-ge v13, v6, :cond_10
a=0;// 
a=0;//     .line 364
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0, v13}, Landroid/support/v7/internal/widget/ActionBarContextView;->getChildAt(I)Landroid/view/View;
a=0;// 
a=0;//     move-result-object v21
a=0;// 
a=0;//     .line 365
a=0;//     .local v21, "v":Landroid/view/View;
a=0;//     #v21=(Reference,Landroid/view/View;);
a=0;//     invoke-virtual/range {v21 .. v21}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v24
a=0;// 
a=0;//     add-int v17, v24, v22
a=0;// 
a=0;//     .line 366
a=0;//     .local v17, "paddedViewHeight":I
a=0;//     #v17=(Integer);
a=0;//     move/from16 v0, v17
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-le v0, v1, :cond_7
a=0;// 
a=0;//     .line 367
a=0;//     move/from16 v16, v17
a=0;// 
a=0;//     .line 363
a=0;//     :cond_7
a=0;//     add-int/lit8 v13, v13, 0x1
a=0;// 
a=0;//     goto :goto_8
a=0;// 
a=0;//     .line 309
a=0;//     .end local v3    # "availableWidth":I
a=0;//     .end local v4    # "childSpecHeight":I
a=0;//     .end local v6    # "count":I
a=0;//     .end local v11    # "height":I
a=0;//     .end local v13    # "i":I
a=0;//     .end local v15    # "maxHeight":I
a=0;//     .end local v16    # "measuredHeight":I
a=0;//     .end local v17    # "paddedViewHeight":I
a=0;//     .end local v21    # "v":Landroid/view/View;
a=0;//     .end local v22    # "verticalPadding":I
a=0;//     :cond_8
a=0;//     #v2=(Uninit);v3=(Uninit);v4=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Uninit);v9=(Uninit);v10=(Uninit);v11=(Uninit);v13=(Uninit);v14=(Uninit);v15=(Uninit);v16=(Uninit);v17=(Uninit);v18=(Uninit);v19=(Uninit);v20=(Uninit);v21=(Uninit);v22=(Uninit);v25=(Uninit);v26=(Uninit);
a=0;//     invoke-static/range {p2 .. p2}, Landroid/view/View$MeasureSpec;->getSize(I)I
a=0;// 
a=0;//     move-result v15
a=0;// 
a=0;//     #v15=(Integer);
a=0;//     goto/16 :goto_0
a=0;// 
a=0;//     .line 336
a=0;//     .restart local v3    # "availableWidth":I
a=0;//     .restart local v4    # "childSpecHeight":I
a=0;//     .restart local v11    # "height":I
a=0;//     .restart local v15    # "maxHeight":I
a=0;//     .restart local v19    # "titleWidth":I
a=0;//     .restart local v20    # "titleWidthSpec":I
a=0;//     .restart local v22    # "verticalPadding":I
a=0;//     :cond_9
a=0;//     #v2=(Conflicted);v3=(Integer);v4=(Integer);v11=(Integer);v14=(Conflicted);v19=(Integer);v20=(Integer);v22=(Integer);v24=(Reference,Landroid/widget/LinearLayout;);v25=(Null);
a=0;//     const/16 v18, 0x0
a=0;// 
a=0;//     #v18=(Null);
a=0;//     goto/16 :goto_1
a=0;// 
a=0;//     .line 340
a=0;//     .restart local v18    # "titleFits":Z
a=0;//     :cond_a
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);v18=(Boolean);v25=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v24, 0x8
a=0;// 
a=0;//     #v24=(PosByte);
a=0;//     goto/16 :goto_2
a=0;// 
a=0;//     .line 342
a=0;//     .end local v18    # "titleFits":Z
a=0;//     .end local v19    # "titleWidth":I
a=0;//     .end local v20    # "titleWidthSpec":I
a=0;//     :cond_b
a=0;//     #v0=(Boolean);v1=(Conflicted);v18=(Uninit);v19=(Uninit);v20=(Uninit);v24=(Boolean);v25=(Integer);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     iget-object v0, v0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     move-object/from16 v24, v0
a=0;// 
a=0;//     #v24=(Reference,Landroid/widget/LinearLayout;);
a=0;//     const/16 v25, 0x0
a=0;// 
a=0;//     #v25=(Null);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     move-object/from16 v1, v24
a=0;// 
a=0;//     #v1=(Reference,Landroid/widget/LinearLayout;);
a=0;//     move/from16 v2, v25
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-virtual {v0, v1, v3, v4, v2}, Landroid/support/v7/internal/widget/ActionBarContextView;->measureChildView(Landroid/view/View;III)I
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     goto/16 :goto_3
a=0;// 
a=0;//     .line 348
a=0;//     .restart local v14    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_c
a=0;//     #v0=(Integer);v1=(Byte);v2=(Conflicted);v14=(Reference,Landroid/view/ViewGroup$LayoutParams;);v18=(Conflicted);v19=(Conflicted);v20=(Conflicted);v24=(Integer);v25=(Byte);
a=0;//     const/high16 v10, -0x80000000
a=0;// 
a=0;//     #v10=(Integer);
a=0;//     goto/16 :goto_4
a=0;// 
a=0;//     .restart local v10    # "customWidthMode":I
a=0;//     :cond_d
a=0;//     move v9, v3
a=0;// 
a=0;//     .line 350
a=0;//     #v9=(Integer);
a=0;//     goto :goto_5
a=0;// 
a=0;//     .line 352
a=0;//     .restart local v9    # "customWidth":I
a=0;//     :cond_e
a=0;//     const/high16 v8, -0x80000000
a=0;// 
a=0;//     #v8=(Integer);
a=0;//     goto :goto_6
a=0;// 
a=0;//     .restart local v8    # "customHeightMode":I
a=0;//     :cond_f
a=0;//     move v7, v11
a=0;// 
a=0;//     .line 354
a=0;//     #v7=(Integer);
a=0;//     goto :goto_7
a=0;// 
a=0;//     .line 370
a=0;//     .end local v8    # "customHeightMode":I
a=0;//     .end local v9    # "customWidth":I
a=0;//     .end local v10    # "customWidthMode":I
a=0;//     .end local v14    # "lp":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .restart local v6    # "count":I
a=0;//     .restart local v13    # "i":I
a=0;//     .restart local v16    # "measuredHeight":I
a=0;//     :cond_10
a=0;//     #v1=(Conflicted);v6=(Integer);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);v10=(Conflicted);v13=(Integer);v14=(Conflicted);v16=(Integer);v17=(Conflicted);v21=(Conflicted);v25=(Conflicted);v26=(Conflicted);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     move/from16 v1, v16
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {v0, v5, v1}, Landroid/support/v7/internal/widget/ActionBarContextView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     .line 374
a=0;//     .end local v6    # "count":I
a=0;//     .end local v13    # "i":I
a=0;//     .end local v16    # "measuredHeight":I
a=0;//     :goto_9
a=0;//     #v1=(Conflicted);v6=(Conflicted);v13=(Conflicted);v16=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 372
a=0;//     :cond_11
a=0;//     #v0=(Integer);v6=(Uninit);v13=(Uninit);v16=(Uninit);v17=(Uninit);v21=(Uninit);
a=0;//     move-object/from16 v0, p0
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/ActionBarContextView;);
a=0;//     invoke-virtual {v0, v5, v15}, Landroid/support/v7/internal/widget/ActionBarContextView;->setMeasuredDimension(II)V
a=0;// 
a=0;//     goto :goto_9
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic postShowOverflowMenu()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-super {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->postShowOverflowMenu()V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentHeight(I)V
a=0;//     .locals 0
a=0;//     .param p1, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 130
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     .line 131
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setCustomView(Landroid/view/View;)V
a=0;//     .locals 1
a=0;//     .param p1, "view"    # Landroid/view/View;
a=0;// 
a=0;//     .prologue
a=0;//     .line 134
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     #v0=(Reference,Landroid/view/View;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 135
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 137
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mCustomView:Landroid/view/View;
a=0;// 
a=0;//     .line 138
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 139
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 140
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleLayout:Landroid/widget/LinearLayout;
a=0;// 
a=0;//     .line 142
a=0;//     :cond_1
a=0;//     #v0=(Reference,Landroid/widget/LinearLayout;);
a=0;//     if-eqz p1, :cond_2
a=0;// 
a=0;//     .line 143
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 145
a=0;//     :cond_2
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->requestLayout()V
a=0;// 
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitActionBar(Z)V
a=0;//     .locals 6
a=0;//     .param p1, "split"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, -0x1
a=0;// 
a=0;//     .line 93
a=0;//     #v5=(Byte);
a=0;//     iget-boolean v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitActionBar:Z
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eq v2, p1, :cond_2
a=0;// 
a=0;//     .line 94
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 96
a=0;//     new-instance v0, Landroid/view/ViewGroup$LayoutParams;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     const/4 v2, -0x2
a=0;// 
a=0;//     #v2=(Byte);
a=0;//     invoke-direct {v0, v2, v5}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V
a=0;// 
a=0;//     .line 99
a=0;//     .local v0, "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);
a=0;//     if-nez p1, :cond_3
a=0;// 
a=0;//     .line 100
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v2, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 102
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 103
a=0;//     .local v1, "oldParent":Landroid/view/ViewGroup;
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 104
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 106
a=0;//     :cond_0
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {p0, v2, v0}, Landroid/support/v7/internal/widget/ActionBarContextView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     .line 125
a=0;//     .end local v0    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     .end local v1    # "oldParent":Landroid/view/ViewGroup;
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitActionBar(Z)V
a=0;// 
a=0;//     .line 127
a=0;//     :cond_2
a=0;//     #v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 109
a=0;//     .restart local v0    # "layoutParams":Landroid/view/ViewGroup$LayoutParams;
a=0;//     :cond_3
a=0;//     #v0=(Reference,Landroid/view/ViewGroup$LayoutParams;);v1=(Uninit);v2=(Byte);v3=(Uninit);v4=(Uninit);
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v4, 0x1
a=0;// 
a=0;//     #v4=(One);
a=0;//     invoke-virtual {v2, v3, v4}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setWidthLimit(IZ)V
a=0;// 
a=0;//     .line 112
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     const v3, 0x7fffffff
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->setItemLimit(I)V
a=0;// 
a=0;//     .line 114
a=0;//     iput v5, v0, Landroid/view/ViewGroup$LayoutParams;->width:I
a=0;// 
a=0;//     .line 115
a=0;//     iget v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mContentHeight:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     iput v2, v0, Landroid/view/ViewGroup$LayoutParams;->height:I
a=0;// 
a=0;//     .line 116
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v2=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     invoke-virtual {v2, p0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->getMenuView(Landroid/view/ViewGroup;)Landroid/support/v7/internal/view/menu/MenuView;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     check-cast v2, Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iput-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     .line 117
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitBackground:Landroid/graphics/drawable/Drawable;
a=0;// 
a=0;//     #v3=(Reference,Landroid/graphics/drawable/Drawable;);
a=0;//     invoke-virtual {v2, v3}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
a=0;// 
a=0;//     .line 118
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v2}, Landroid/support/v7/internal/view/menu/ActionMenuView;->getParent()Landroid/view/ViewParent;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/view/ViewParent;);
a=0;//     check-cast v1, Landroid/view/ViewGroup;
a=0;// 
a=0;//     .line 119
a=0;//     .restart local v1    # "oldParent":Landroid/view/ViewGroup;
a=0;//     if-eqz v1, :cond_4
a=0;// 
a=0;//     .line 120
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V
a=0;// 
a=0;//     .line 122
a=0;//     :cond_4
a=0;//     iget-object v2, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     iget-object v3, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Landroid/support/v7/internal/widget/ActionBarContainer;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setSplitWhenNarrow(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitWhenNarrow(Z)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSubtitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "subtitle"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 154
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mSubtitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 155
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->initTitle()V
a=0;// 
a=0;//     .line 156
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitle(Ljava/lang/CharSequence;)V
a=0;//     .locals 0
a=0;//     .param p1, "title"    # Ljava/lang/CharSequence;
a=0;// 
a=0;//     .prologue
a=0;//     .line 149
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitle:Ljava/lang/CharSequence;
a=0;// 
a=0;//     .line 150
a=0;//     invoke-direct {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->initTitle()V
a=0;// 
a=0;//     .line 151
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setTitleOptional(Z)V
a=0;//     .locals 1
a=0;//     .param p1, "titleOptional"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 407
a=0;//     iget-boolean v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleOptional:Z
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 408
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/ActionBarContextView;->requestLayout()V
a=0;// 
a=0;//     .line 410
a=0;//     :cond_0
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mTitleOptional:Z
a=0;// 
a=0;//     .line 411
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public bridge synthetic setVisibility(I)V
a=0;//     .locals 0
a=0;//     .param p1, "x0"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 37
a=0;//     invoke-super {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setVisibility(I)V
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 258
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 259
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/ActionBarContextView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 261
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
