package android.support.v7.internal.widget; class AbsActionBarView { void a() { int a;
a=0;// .class abstract Landroid/support/v7/internal/widget/AbsActionBarView;
a=0;// .super Landroid/view/ViewGroup;
a=0;// .source "AbsActionBarView.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final FADE_DURATION:I = 0xc8
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;// .field protected mContentHeight:I
a=0;// 
a=0;// .field protected mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;// .field protected mSplitActionBar:Z
a=0;// 
a=0;// .field protected mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;// .field protected mSplitWhenNarrow:Z
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     .line 48
a=0;//     invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     .line 49
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AbsActionBarView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;// 
a=0;//     .prologue
a=0;//     .line 52
a=0;//     invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
a=0;// 
a=0;//     .line 53
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AbsActionBarView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;//     .locals 0
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "attrs"    # Landroid/util/AttributeSet;
a=0;//     .param p3, "defStyle"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
a=0;// 
a=0;//     .line 57
a=0;//     #p0=(Reference,Landroid/support/v7/internal/widget/AbsActionBarView;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public animateToVisibility(I)V
a=0;//     .locals 3
a=0;//     .param p1, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 119
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->clearAnimation()V
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getVisibility()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-eq p1, v1, :cond_0
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Landroid/content/Context;);
a=0;//     if-nez p1, :cond_1
a=0;// 
a=0;//     sget v1, Landroid/support/v7/appcompat/R$anim;->abc_fade_in:I
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-static {v2, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 125
a=0;//     .local v0, "anim":Landroid/view/animation/Animation;
a=0;//     #v0=(Reference,Landroid/view/animation/Animation;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AbsActionBarView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 126
a=0;//     invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setVisibility(I)V
a=0;// 
a=0;//     .line 128
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/widget/ActionBarContainer;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 129
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->startAnimation(Landroid/view/animation/Animation;)V
a=0;// 
a=0;//     .line 130
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setVisibility(I)V
a=0;// 
a=0;//     .line 133
a=0;//     .end local v0    # "anim":Landroid/view/animation/Animation;
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 122
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Integer);v2=(Reference,Landroid/content/Context;);
a=0;//     sget v1, Landroid/support/v7/appcompat/R$anim;->abc_fade_out:I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public dismissPopupMenus()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 176
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 177
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z
a=0;// 
a=0;//     .line 179
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public getAnimatedVisibility()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 115
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public getContentHeight()I
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 104
a=0;//     iget v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mContentHeight:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method public hideOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 158
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 159
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 161
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
a=0;// .method public isOverflowMenuShowing()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 165
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 166
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 168
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
a=0;// .method public isOverflowReserved()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 172
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowReserved()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     :goto_0
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected measureChildView(Landroid/view/View;III)I
a=0;//     .locals 1
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "availableWidth"    # I
a=0;//     .param p3, "childSpecHeight"    # I
a=0;//     .param p4, "spacing"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 183
a=0;//     const/high16 v0, -0x80000000
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     invoke-virtual {p1, v0, p3}, Landroid/view/View;->measure(II)V
a=0;// 
a=0;//     .line 186
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     sub-int/2addr p2, v0
a=0;// 
a=0;//     .line 187
a=0;//     sub-int/2addr p2, p4
a=0;// 
a=0;//     .line 189
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     return v0
a=0;// .end method
a=0;// 
a=0;// .method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;//     .locals 6
a=0;//     .param p1, "newConfig"    # Landroid/content/res/Configuration;
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 61
a=0;//     #v5=(Null);
a=0;//     sget v1, Landroid/os/Build$VERSION;->SDK_INT:I
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v2, 0x8
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     if-lt v1, v2, :cond_0
a=0;// 
a=0;//     .line 62
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 67
a=0;//     :cond_0
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     sget-object v3, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I
a=0;// 
a=0;//     #v3=(Reference,[I);
a=0;//     sget v4, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 69
a=0;//     .local v0, "a":Landroid/content/res/TypedArray;
a=0;//     #v0=(Reference,Landroid/content/res/TypedArray;);
a=0;//     invoke-virtual {v0, v5, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setContentHeight(I)V
a=0;// 
a=0;//     .line 70
a=0;//     invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V
a=0;// 
a=0;//     .line 71
a=0;//     iget-boolean v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitWhenNarrow:Z
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     .line 72
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContext()Landroid/content/Context;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Landroid/content/Context;);
a=0;//     invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sget v2, Landroid/support/v7/appcompat/R$bool;->abc_split_action_bar_is_narrow:I
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitActionBar(Z)V
a=0;// 
a=0;//     .line 75
a=0;//     :cond_1
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v1=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 76
a=0;//     iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->onConfigurationChanged(Landroid/content/res/Configuration;)V
a=0;// 
a=0;//     .line 78
a=0;//     :cond_2
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected positionChild(Landroid/view/View;III)I
a=0;//     .locals 5
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "x"    # I
a=0;//     .param p3, "y"    # I
a=0;//     .param p4, "contentHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 193
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 194
a=0;//     .local v2, "childWidth":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 195
a=0;//     .local v0, "childHeight":I
a=0;//     #v0=(Integer);
a=0;//     sub-int v3, p4, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     add-int v1, p3, v3
a=0;// 
a=0;//     .line 197
a=0;//     .local v1, "childTop":I
a=0;//     #v1=(Integer);
a=0;//     add-int v3, p2, v2
a=0;// 
a=0;//     add-int v4, v1, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, p2, v1, v3, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 199
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method protected positionChildInverse(Landroid/view/View;III)I
a=0;//     .locals 5
a=0;//     .param p1, "child"    # Landroid/view/View;
a=0;//     .param p2, "x"    # I
a=0;//     .param p3, "y"    # I
a=0;//     .param p4, "contentHeight"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 204
a=0;//     .local v2, "childWidth":I
a=0;//     #v2=(Integer);
a=0;//     invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 205
a=0;//     .local v0, "childHeight":I
a=0;//     #v0=(Integer);
a=0;//     sub-int v3, p4, v0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     div-int/lit8 v3, v3, 0x2
a=0;// 
a=0;//     add-int v1, p3, v3
a=0;// 
a=0;//     .line 207
a=0;//     .local v1, "childTop":I
a=0;//     #v1=(Integer);
a=0;//     sub-int v3, p2, v2
a=0;// 
a=0;//     add-int v4, v1, v0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     invoke-virtual {p1, v3, v1, p2, v4}, Landroid/view/View;->layout(IIII)V
a=0;// 
a=0;//     .line 209
a=0;//     return v2
a=0;// .end method
a=0;// 
a=0;// .method public postShowOverflowMenu()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 150
a=0;//     new-instance v0, Landroid/support/v7/internal/widget/AbsActionBarView$1;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/support/v7/internal/widget/AbsActionBarView$1;);
a=0;//     invoke-direct {v0, p0}, Landroid/support/v7/internal/widget/AbsActionBarView$1;-><init>(Landroid/support/v7/internal/widget/AbsActionBarView;)V
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/widget/AbsActionBarView$1;);
a=0;//     invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AbsActionBarView;->post(Ljava/lang/Runnable;)Z
a=0;// 
a=0;//     .line 155
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setContentHeight(I)V
a=0;//     .locals 0
a=0;//     .param p1, "height"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 99
a=0;//     iput p1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mContentHeight:I
a=0;// 
a=0;//     .line 100
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->requestLayout()V
a=0;// 
a=0;//     .line 101
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitActionBar(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "split"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 86
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitActionBar:Z
a=0;// 
a=0;//     .line 87
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
a=0;//     .locals 0
a=0;//     .param p1, "splitView"    # Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .prologue
a=0;//     .line 108
a=0;//     iput-object p1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;
a=0;// 
a=0;//     .line 109
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setSplitWhenNarrow(Z)V
a=0;//     .locals 0
a=0;//     .param p1, "splitWhenNarrow"    # Z
a=0;// 
a=0;//     .prologue
a=0;//     .line 95
a=0;//     iput-boolean p1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitWhenNarrow:Z
a=0;// 
a=0;//     .line 96
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public setVisibility(I)V
a=0;//     .locals 1
a=0;//     .param p1, "visibility"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 137
a=0;//     invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getVisibility()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eq p1, v0, :cond_0
a=0;// 
a=0;//     .line 138
a=0;//     invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V
a=0;// 
a=0;//     .line 140
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public showOverflowMenu()Z
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 143
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     #v0=(Reference,Landroid/support/v7/internal/view/menu/ActionMenuPresenter;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 144
a=0;//     iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;
a=0;// 
a=0;//     invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     .line 146
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
