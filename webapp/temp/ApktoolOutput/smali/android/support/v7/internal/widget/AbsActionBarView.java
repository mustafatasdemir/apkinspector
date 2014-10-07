package android.support.v7.internal.widget; class AbsActionBarView {/*

.class abstract Landroid/support/v7/internal/widget/AbsActionBarView;
.super Landroid/view/ViewGroup;
.source "AbsActionBarView.java"


# static fields
.field private static final FADE_DURATION:I = 0xc8


# instance fields
.field protected mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

.field protected mContentHeight:I

.field protected mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

.field protected mSplitActionBar:Z

.field protected mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

.field protected mSplitWhenNarrow:Z


# direct methods
.method constructor <init>(Landroid/content/Context;)V
    .locals 0
    .parameter "context"

    .prologue
    .line 48
    invoke-direct {p0, p1}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;)V

    .line 49
    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .parameter "context"
    .parameter "attrs"

    .prologue
    .line 52
    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    #p0=(Reference);
    return-void
.end method

.method constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .parameter "context"
    .parameter "attrs"
    .parameter "defStyle"

    .prologue
    .line 56
    invoke-direct {p0, p1, p2, p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 57
    #p0=(Reference);
    return-void
.end method


# virtual methods
.method public animateToVisibility(I)V
    .locals 3
    .parameter "visibility"

    .prologue
    .line 119
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->clearAnimation()V

    .line 121
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getVisibility()I

    move-result v1

    #v1=(Integer);
    if-eq p1, v1, :cond_0

    .line 122
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContext()Landroid/content/Context;

    move-result-object v2

    #v2=(Reference);
    if-nez p1, :cond_1

    sget v1, Landroid/support/v7/appcompat/R$anim;->abc_fade_in:I

    :goto_0
    invoke-static {v2, v1}, Landroid/view/animation/AnimationUtils;->loadAnimation(Landroid/content/Context;I)Landroid/view/animation/Animation;

    move-result-object v0

    .line 125
    .local v0, anim:Landroid/view/animation/Animation;
    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AbsActionBarView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 126
    invoke-virtual {p0, p1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setVisibility(I)V

    .line 128
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    #v1=(Reference);
    if-eqz v1, :cond_0

    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    if-eqz v1, :cond_0

    .line 129
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1, v0}, Landroid/support/v7/internal/view/menu/ActionMenuView;->startAnimation(Landroid/view/animation/Animation;)V

    .line 130
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mMenuView:Landroid/support/v7/internal/view/menu/ActionMenuView;

    invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuView;->setVisibility(I)V

    .line 133
    .end local v0           #anim:Landroid/view/animation/Animation;
    :cond_0
    #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);
    return-void

    .line 122
    :cond_1
    #v0=(Uninit);v1=(Integer);v2=(Reference);
    sget v1, Landroid/support/v7/appcompat/R$anim;->abc_fade_out:I

    goto :goto_0
.end method

.method public dismissPopupMenus()V
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 177
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->dismissPopupMenus()Z

    .line 179
    :cond_0
    return-void
.end method

.method public getAnimatedVisibility()I
    .locals 1

    .prologue
    .line 115
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getVisibility()I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method public getContentHeight()I
    .locals 1

    .prologue
    .line 104
    iget v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mContentHeight:I

    #v0=(Integer);
    return v0
.end method

.method public hideOverflowMenu()Z
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 159
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->hideOverflowMenu()Z

    move-result v0

    .line 161
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isOverflowMenuShowing()Z
    .locals 1

    .prologue
    .line 165
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 166
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowMenuShowing()Z

    move-result v0

    .line 168
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method public isOverflowReserved()Z
    .locals 1

    .prologue
    .line 172
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->isOverflowReserved()Z

    move-result v0

    #v0=(Boolean);
    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    #v0=(Conflicted);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

.method protected measureChildView(Landroid/view/View;III)I
    .locals 1
    .parameter "child"
    .parameter "availableWidth"
    .parameter "childSpecHeight"
    .parameter "spacing"

    .prologue
    .line 183
    const/high16 v0, -0x8000

    #v0=(Integer);
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-virtual {p1, v0, p3}, Landroid/view/View;->measure(II)V

    .line 186
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v0

    sub-int/2addr p2, v0

    .line 187
    sub-int/2addr p2, p4

    .line 189
    const/4 v0, 0x0

    #v0=(Null);
    invoke-static {v0, p2}, Ljava/lang/Math;->max(II)I

    move-result v0

    #v0=(Integer);
    return v0
.end method

.method protected onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 6
    .parameter "newConfig"

    .prologue
    const/4 v5, 0x0

    .line 61
    #v5=(Null);
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    #v1=(Integer);
    const/16 v2, 0x8

    #v2=(PosByte);
    if-lt v1, v2, :cond_0

    .line 62
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 67
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    const/4 v2, 0x0

    #v2=(Null);
    sget-object v3, Landroid/support/v7/appcompat/R$styleable;->ActionBar:[I

    #v3=(Reference);
    sget v4, Landroid/support/v7/appcompat/R$attr;->actionBarStyle:I

    #v4=(Integer);
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 69
    .local v0, a:Landroid/content/res/TypedArray;
    #v0=(Reference);
    invoke-virtual {v0, v5, v5}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    move-result v1

    #v1=(Integer);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setContentHeight(I)V

    .line 70
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 71
    iget-boolean v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitWhenNarrow:Z

    #v1=(Boolean);
    if-eqz v1, :cond_1

    .line 72
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getContext()Landroid/content/Context;

    move-result-object v1

    #v1=(Reference);
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Landroid/support/v7/appcompat/R$bool;->abc_split_action_bar_is_narrow:I

    #v2=(Integer);
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getBoolean(I)Z

    move-result v1

    #v1=(Boolean);
    invoke-virtual {p0, v1}, Landroid/support/v7/internal/widget/AbsActionBarView;->setSplitActionBar(Z)V

    .line 75
    :cond_1
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v1=(Reference);
    if-eqz v1, :cond_2

    .line 76
    iget-object v1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v1, p1}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 78
    :cond_2
    return-void
.end method

.method protected positionChild(Landroid/view/View;III)I
    .locals 5
    .parameter "child"
    .parameter "x"
    .parameter "y"
    .parameter "contentHeight"

    .prologue
    .line 193
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 194
    .local v2, childWidth:I
    #v2=(Integer);
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 195
    .local v0, childHeight:I
    #v0=(Integer);
    sub-int v3, p4, v0

    #v3=(Integer);
    div-int/lit8 v3, v3, 0x2

    add-int v1, p3, v3

    .line 197
    .local v1, childTop:I
    #v1=(Integer);
    add-int v3, p2, v2

    add-int v4, v1, v0

    #v4=(Integer);
    invoke-virtual {p1, p2, v1, v3, v4}, Landroid/view/View;->layout(IIII)V

    .line 199
    return v2
.end method

.method protected positionChildInverse(Landroid/view/View;III)I
    .locals 5
    .parameter "child"
    .parameter "x"
    .parameter "y"
    .parameter "contentHeight"

    .prologue
    .line 203
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    move-result v2

    .line 204
    .local v2, childWidth:I
    #v2=(Integer);
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    .line 205
    .local v0, childHeight:I
    #v0=(Integer);
    sub-int v3, p4, v0

    #v3=(Integer);
    div-int/lit8 v3, v3, 0x2

    add-int v1, p3, v3

    .line 207
    .local v1, childTop:I
    #v1=(Integer);
    sub-int v3, p2, v2

    add-int v4, v1, v0

    #v4=(Integer);
    invoke-virtual {p1, v3, v1, p2, v4}, Landroid/view/View;->layout(IIII)V

    .line 209
    return v2
.end method

.method public postShowOverflowMenu()V
    .locals 1

    .prologue
    .line 150
    new-instance v0, Landroid/support/v7/internal/widget/AbsActionBarView$1;

    #v0=(UninitRef);
    invoke-direct {v0, p0}, Landroid/support/v7/internal/widget/AbsActionBarView$1;-><init>(Landroid/support/v7/internal/widget/AbsActionBarView;)V

    #v0=(Reference);
    invoke-virtual {p0, v0}, Landroid/support/v7/internal/widget/AbsActionBarView;->post(Ljava/lang/Runnable;)Z

    .line 155
    return-void
.end method

.method public setContentHeight(I)V
    .locals 0
    .parameter "height"

    .prologue
    .line 99
    iput p1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mContentHeight:I

    .line 100
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->requestLayout()V

    .line 101
    return-void
.end method

.method public setSplitActionBar(Z)V
    .locals 0
    .parameter "split"

    .prologue
    .line 86
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitActionBar:Z

    .line 87
    return-void
.end method

.method public setSplitView(Landroid/support/v7/internal/widget/ActionBarContainer;)V
    .locals 0
    .parameter "splitView"

    .prologue
    .line 108
    iput-object p1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitView:Landroid/support/v7/internal/widget/ActionBarContainer;

    .line 109
    return-void
.end method

.method public setSplitWhenNarrow(Z)V
    .locals 0
    .parameter "splitWhenNarrow"

    .prologue
    .line 95
    iput-boolean p1, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mSplitWhenNarrow:Z

    .line 96
    return-void
.end method

.method public setVisibility(I)V
    .locals 1
    .parameter "visibility"

    .prologue
    .line 137
    invoke-virtual {p0}, Landroid/support/v7/internal/widget/AbsActionBarView;->getVisibility()I

    move-result v0

    #v0=(Integer);
    if-eq p1, v0, :cond_0

    .line 138
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 140
    :cond_0
    return-void
.end method

.method public showOverflowMenu()Z
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    #v0=(Reference);
    if-eqz v0, :cond_0

    .line 144
    iget-object v0, p0, Landroid/support/v7/internal/widget/AbsActionBarView;->mActionMenuPresenter:Landroid/support/v7/internal/view/menu/ActionMenuPresenter;

    invoke-virtual {v0}, Landroid/support/v7/internal/view/menu/ActionMenuPresenter;->showOverflowMenu()Z

    move-result v0

    .line 146
    :goto_0
    #v0=(Boolean);
    return v0

    :cond_0
    #v0=(Reference);
    const/4 v0, 0x0

    #v0=(Null);
    goto :goto_0
.end method

*/}
